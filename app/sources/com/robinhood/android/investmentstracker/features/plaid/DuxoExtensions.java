package com.robinhood.android.investmentstracker.features.plaid;

import accio.service.p003v1.ProviderDto;
import accio.service.p003v1.PurposeDto;
import android.app.Activity;
import android.app.Application;
import androidx.view.result.ActivityResultLauncher;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.LinkAccountsForUpdateModeRequestDto;
import bff_money_movement.service.p019v1.LinkAccountsRequestDto;
import bff_money_movement.service.p019v1.PlaidLinkAccountsDetailsDto;
import bff_money_movement.service.p019v1.PlaidPrepareLinkDetailsDto;
import bff_money_movement.service.p019v1.PrepareLinkRequestDto;
import bff_money_movement.service.p019v1.PrepareLinkResponseDto;
import com.plaid.internal.EnumC7081g;
import com.plaid.link.Plaid;
import com.plaid.link.PlaidHandler;
import com.plaid.link.PlaidKotlinFunctionsKt;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkErrorType;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadataStatus;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.dagger.ApplicationPackageInfoModule2;
import com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions;
import com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDataState;
import com.robinhood.android.investmentstracker.linking.models.PlaidLinkResultData;
import com.robinhood.android.plaidconnect.api.PlaidConnectApi;
import com.robinhood.android.plaidconnect.models.PreparePaymentInstrumentRequest;
import com.robinhood.android.plaidconnect.models.PreparePaymentInstrumentRequest2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.api.bonfire.paymentinstruments.PreparePaymentInstrumentDetails;
import com.robinhood.models.api.cashier.ApiPlaidAccessToken;
import com.robinhood.models.api.cashier.ApiPlaidPublicToken;
import com.robinhood.models.api.cashier.RhAccountType;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import com.robinhood.store.achrelationship.IavStore;
import com.robinhood.utils.extensions.StringsKt;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* compiled from: DuxoExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J6\u0010\u001e\u001a\u00020\u001f2'\u0010 \u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\u0006\u0012\u0004\u0018\u00010\u00030!¢\u0006\u0002\b#H&¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001fH&J2\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0019H\u0016J\u001e\u0010/\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016J\u001e\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f04H\u0016J\u0011\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u000207H\u0082@J4\u00108\u001a\u00020\u001f2\u0006\u00106\u001a\u0002072\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:2\b\b\u0002\u0010<\u001a\u00020=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0019H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00198&X§\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/features/plaid/PlaidEnabledDuxo;", "DS", "Lcom/robinhood/android/investmentstracker/features/plaid/PlaidEnabledDataState;", "", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "getBffMoneyMovementService", "()Lbff_money_movement/service/v1/BffMoneyMovementService;", "lifecycleScope", "Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "getLifecycleScope", "()Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "plaidConnectApi", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "getPlaidConnectApi", "()Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "iavStore", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/IavStore;", "getIavStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/cashier/IavStore;", "achRelationshipStore", "Lcom/robinhood/store/achrelationship/IavStore;", "getAchRelationshipStore", "()Lcom/robinhood/store/achrelationship/IavStore;", "packageName", "", "getPackageName$annotations", "()V", "getPackageName", "()Ljava/lang/String;", "applyMutationOverride", "", "mutator", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)V", "plaidFinishedCallback", "startPlaid", "activity", "Landroid/app/Activity;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/plaid/link/PlaidHandler;", "purpose", "Laccio/service/v1/PurposeDto;", "updateModeInstitutionId", "startOldPlaid", "linkUsingOldPlaidFlow", "linkResultData", "Lcom/robinhood/android/investmentstracker/linking/models/PlaidLinkResultData;", "onFinishedLink", "Lkotlin/Function0;", "callBffLinkAccountForAnalyticOnly", "result", "Lcom/plaid/link/result/LinkResult;", "handlePlaidCallback", "activityErrorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "useUpdateMode", "", "optionalInstitutionId", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo, reason: use source file name */
/* loaded from: classes10.dex */
public interface DuxoExtensions<DS extends PlaidEnabledDataState> {
    void applyMutationOverride(Function2<? super DS, ? super Continuation<? super DS>, ? extends Object> mutator);

    IavStore getAchRelationshipStore();

    BffMoneyMovementService getBffMoneyMovementService();

    com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore getIavStore();

    LifecycleHostCoroutineScope getLifecycleScope();

    String getPackageName();

    PlaidConnectApi getPlaidConnectApi();

    void handlePlaidCallback(LinkResult result, ActivityErrorHandler activityErrorHandler, boolean useUpdateMode, String optionalInstitutionId);

    void linkUsingOldPlaidFlow(PlaidLinkResultData linkResultData, Function0<Unit> onFinishedLink);

    void plaidFinishedCallback();

    void startOldPlaid(Activity activity, ActivityResultLauncher<PlaidHandler> launcher);

    void startPlaid(Activity activity, ActivityResultLauncher<PlaidHandler> launcher, PurposeDto purpose, String updateModeInstitutionId);

    /* compiled from: DuxoExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$DefaultImpls */
    public static final class DefaultImpls {
        @ApplicationPackageInfoModule2
        public static /* synthetic */ void getPackageName$annotations() {
        }

        public static /* synthetic */ void startPlaid$default(DuxoExtensions duxoExtensions, Activity activity, ActivityResultLauncher activityResultLauncher, PurposeDto purposeDto, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPlaid");
            }
            if ((i & 8) != 0) {
                str = null;
            }
            duxoExtensions.startPlaid(activity, activityResultLauncher, purposeDto, str);
        }

        public static <DS extends PlaidEnabledDataState> void startPlaid(DuxoExtensions<DS> duxoExtensions, Activity activity, ActivityResultLauncher<PlaidHandler> launcher, PurposeDto purpose, String str) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            Intrinsics.checkNotNullParameter(purpose, "purpose");
            BuildersKt__Builders_commonKt.launch$default(duxoExtensions.getLifecycleScope(), null, null, new C195931(duxoExtensions, str, purpose, activity, launcher, null), 3, null);
        }

        public static <DS extends PlaidEnabledDataState> void startOldPlaid(DuxoExtensions<DS> duxoExtensions, Activity activity, ActivityResultLauncher<PlaidHandler> launcher) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            BuildersKt__Builders_commonKt.launch$default(duxoExtensions.getLifecycleScope(), null, null, new C195921(duxoExtensions, activity, launcher, null), 3, null);
        }

        public static <DS extends PlaidEnabledDataState> void linkUsingOldPlaidFlow(DuxoExtensions<DS> duxoExtensions, PlaidLinkResultData linkResultData, Function0<Unit> onFinishedLink) {
            Intrinsics.checkNotNullParameter(linkResultData, "linkResultData");
            Intrinsics.checkNotNullParameter(onFinishedLink, "onFinishedLink");
            BuildersKt__Builders_commonKt.launch$default(duxoExtensions.getLifecycleScope(), null, null, new C195911(linkResultData, duxoExtensions, onFinishedLink, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <DS extends PlaidEnabledDataState> Object callBffLinkAccountForAnalyticOnly(DuxoExtensions<DS> duxoExtensions, LinkResult linkResult, Continuation<? super Unit> continuation) {
            DuxoExtensions2 duxoExtensions2;
            String metadataJson;
            if (continuation instanceof DuxoExtensions2) {
                duxoExtensions2 = (DuxoExtensions2) continuation;
                int i = duxoExtensions2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    duxoExtensions2.label = i - Integer.MIN_VALUE;
                } else {
                    duxoExtensions2 = new DuxoExtensions2(continuation);
                }
            }
            Object objLinkAccounts = duxoExtensions2.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = duxoExtensions2.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objLinkAccounts);
                if (linkResult instanceof LinkAccountSubtype) {
                    metadataJson = ((LinkAccountSubtype) linkResult).getJson();
                } else if (linkResult instanceof LinkAccountVerificationStatus) {
                    metadataJson = ((LinkAccountVerificationStatus) linkResult).getJson();
                } else if (linkResult instanceof LinkErrorCode) {
                    metadataJson = ((LinkErrorCode) linkResult).getJson();
                } else if (linkResult instanceof LinkErrorType) {
                    metadataJson = ((LinkErrorType) linkResult).getJson();
                } else if (linkResult instanceof LinkExit) {
                    metadataJson = ((LinkExit) linkResult).getMetadata().getMetadataJson();
                } else if (linkResult instanceof LinkExitMetadataStatus) {
                    metadataJson = ((LinkExitMetadataStatus) linkResult).getJsonValue();
                } else {
                    metadataJson = linkResult instanceof LinkSuccess ? ((LinkSuccess) linkResult).getMetadata().getMetadataJson() : null;
                }
                if (metadataJson != null) {
                    BffMoneyMovementService bffMoneyMovementService = duxoExtensions.getBffMoneyMovementService();
                    LinkAccountsRequestDto linkAccountsRequestDto = new LinkAccountsRequestDto(ProviderDto.PLAID, CollectionsKt.listOf(PurposeDto.PURPOSE_INVESTMENT_TRACKING), new LinkAccountsRequestDto.DetailsDto.PlaidDetails(new PlaidLinkAccountsDetailsDto("analytics", (Map<String, String>) MapsKt.mapOf(Tuples4.m3642to("metadataJson", metadataJson)))));
                    duxoExtensions2.label = 1;
                    objLinkAccounts = bffMoneyMovementService.LinkAccounts(linkAccountsRequestDto, duxoExtensions2);
                    if (objLinkAccounts == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLinkAccounts);
            return Unit.INSTANCE;
        }

        public static /* synthetic */ void handlePlaidCallback$default(DuxoExtensions duxoExtensions, LinkResult linkResult, ActivityErrorHandler activityErrorHandler, boolean z, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handlePlaidCallback");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            duxoExtensions.handlePlaidCallback(linkResult, activityErrorHandler, z, str);
        }

        public static <DS extends PlaidEnabledDataState> void handlePlaidCallback(DuxoExtensions<DS> duxoExtensions, LinkResult result, ActivityErrorHandler activityErrorHandler, boolean z, String str) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(activityErrorHandler, "activityErrorHandler");
            BuildersKt__Builders_commonKt.launch$default(duxoExtensions.getLifecycleScope(), null, null, new C195901(result, z, str, duxoExtensions, activityErrorHandler, null), 3, null);
        }
    }

    /* compiled from: DuxoExtensions.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$startPlaid$1", m3645f = "DuxoExtensions.kt", m3646l = {69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$startPlaid$1 */
    static final class C195931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ ActivityResultLauncher<PlaidHandler> $launcher;
        final /* synthetic */ PurposeDto $purpose;
        final /* synthetic */ String $updateModeInstitutionId;
        int label;
        final /* synthetic */ DuxoExtensions<DS> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C195931(DuxoExtensions<DS> duxoExtensions, String str, PurposeDto purposeDto, Activity activity, ActivityResultLauncher<PlaidHandler> activityResultLauncher, Continuation<? super C195931> continuation) {
            super(2, continuation);
            this.this$0 = duxoExtensions;
            this.$updateModeInstitutionId = str;
            this.$purpose = purposeDto;
            this.$activity = activity;
            this.$launcher = activityResultLauncher;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C195931(this.this$0, this.$updateModeInstitutionId, this.$purpose, this.$activity, this.$launcher, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C195931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DuxoExtensions.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u0001H\n"}, m3636d2 = {"<anonymous>", "DS", "Lcom/robinhood/android/investmentstracker/features/plaid/PlaidEnabledDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$startPlaid$1$1", m3645f = "DuxoExtensions.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$startPlaid$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DS, Continuation<? super DS>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DS ds, Continuation<? super DS> continuation) {
                return ((AnonymousClass1) create(ds, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PlaidEnabledDataState plaidEnabledDataStateUpdateCallingPlaidPrepareEndpoint = ((PlaidEnabledDataState) this.L$0).updateCallingPlaidPrepareEndpoint(true);
                Intrinsics.checkNotNull(plaidEnabledDataStateUpdateCallingPlaidPrepareEndpoint, "null cannot be cast to non-null type DS of com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo");
                return plaidEnabledDataStateUpdateCallingPlaidPrepareEndpoint;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws InterruptedException, LinkException {
            Object objPrepareLink;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutationOverride(new AnonymousClass1(null));
                BffMoneyMovementService bffMoneyMovementService = this.this$0.getBffMoneyMovementService();
                String str = this.$updateModeInstitutionId;
                String str2 = str == null ? "" : str;
                boolean z = str != null;
                ProviderDto providerDto = ProviderDto.PLAID;
                List listListOf = CollectionsKt.listOf(this.$purpose);
                String packageName = this.this$0.getPackageName();
                String str3 = this.$updateModeInstitutionId;
                PrepareLinkRequestDto prepareLinkRequestDto = new PrepareLinkRequestDto(providerDto, listListOf, null, z, str2, new PrepareLinkRequestDto.DetailsDto.PlaidDetails(new PlaidPrepareLinkDetailsDto(null, null, null, packageName, str3 == null ? "" : str3, null, null, 103, null)), 4, null);
                this.label = 1;
                objPrepareLink = bffMoneyMovementService.PrepareLink(prepareLinkRequestDto, this);
                if (objPrepareLink == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objPrepareLink = obj;
            }
            final PrepareLinkResponseDto prepareLinkResponseDto = (PrepareLinkResponseDto) objPrepareLink;
            Application application = this.$activity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            PlaidHandler plaidHandlerCreate = Plaid.create(application, PlaidKotlinFunctionsKt.linkTokenConfiguration(new Function1() { // from class: com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$startPlaid$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DuxoExtensions.C195931.invokeSuspend$lambda$0(prepareLinkResponseDto, (LinkTokenConfiguration.Builder) obj2);
                }
            }));
            this.this$0.applyMutationOverride(new AnonymousClass2(prepareLinkResponseDto, null));
            this.$launcher.launch(plaidHandlerCreate);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(PrepareLinkResponseDto prepareLinkResponseDto, LinkTokenConfiguration.Builder builder) {
            builder.setToken(prepareLinkResponseDto.getLink_token());
            return Unit.INSTANCE;
        }

        /* compiled from: DuxoExtensions.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u0001H\n"}, m3636d2 = {"<anonymous>", "DS", "Lcom/robinhood/android/investmentstracker/features/plaid/PlaidEnabledDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$startPlaid$1$2", m3645f = "DuxoExtensions.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$startPlaid$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DS, Continuation<? super DS>, Object> {
            final /* synthetic */ PrepareLinkResponseDto $prepareResult;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PrepareLinkResponseDto prepareLinkResponseDto, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$prepareResult = prepareLinkResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$prepareResult, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DS ds, Continuation<? super DS> continuation) {
                return ((AnonymousClass2) create(ds, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PlaidEnabledDataState plaidEnabledDataStateUpdateAccountLinkIdForUpdateMode = ((PlaidEnabledDataState) this.L$0).updateAccountLinkIdForUpdateMode(this.$prepareResult.getUpdated_account_link_id());
                Intrinsics.checkNotNull(plaidEnabledDataStateUpdateAccountLinkIdForUpdateMode, "null cannot be cast to non-null type DS of com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo");
                return plaidEnabledDataStateUpdateAccountLinkIdForUpdateMode;
            }
        }
    }

    /* compiled from: DuxoExtensions.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$startOldPlaid$1", m3645f = "DuxoExtensions.kt", m3646l = {102}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$startOldPlaid$1 */
    static final class C195921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ ActivityResultLauncher<PlaidHandler> $launcher;
        int label;
        final /* synthetic */ DuxoExtensions<DS> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C195921(DuxoExtensions<DS> duxoExtensions, Activity activity, ActivityResultLauncher<PlaidHandler> activityResultLauncher, Continuation<? super C195921> continuation) {
            super(2, continuation);
            this.this$0 = duxoExtensions;
            this.$activity = activity;
            this.$launcher = activityResultLauncher;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C195921(this.this$0, this.$activity, this.$launcher, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C195921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            PreparePaymentInstrumentDetails.BankAccountPaymentInstrumentDetails payment_instrument_details;
            final String link_token;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PlaidConnectApi plaidConnectApi = this.this$0.getPlaidConnectApi();
                PreparePaymentInstrumentRequest preparePaymentInstrumentRequest = new PreparePaymentInstrumentRequest(new PreparePaymentInstrumentRequest2.PrepareBankAccountRequestDetails(null, this.this$0.getPackageName(), 1, null), PaymentInstrumentType.BANK_ACCOUNT.getServerValue());
                this.label = 1;
                obj = plaidConnectApi.prepare(preparePaymentInstrumentRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                Object objBody = response.body();
                PreparePaymentInstrumentDetails.BankAccount bankAccount = objBody instanceof PreparePaymentInstrumentDetails.BankAccount ? (PreparePaymentInstrumentDetails.BankAccount) objBody : null;
                if (bankAccount != null && (payment_instrument_details = bankAccount.getPayment_instrument_details()) != null && (link_token = payment_instrument_details.getLink_token()) != null) {
                    Activity activity = this.$activity;
                    ActivityResultLauncher<PlaidHandler> activityResultLauncher = this.$launcher;
                    Application application = activity.getApplication();
                    Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                    activityResultLauncher.launch(Plaid.create(application, PlaidKotlinFunctionsKt.linkTokenConfiguration(new Function1() { // from class: com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$startOldPlaid$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return DuxoExtensions.C195921.invokeSuspend$lambda$1$lambda$0(link_token, (LinkTokenConfiguration.Builder) obj2);
                        }
                    })));
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1$lambda$0(String str, LinkTokenConfiguration.Builder builder) {
            builder.setToken(str);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: DuxoExtensions.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$linkUsingOldPlaidFlow$1", m3645f = "DuxoExtensions.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$linkUsingOldPlaidFlow$1 */
    static final class C195911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PlaidLinkResultData $linkResultData;
        final /* synthetic */ Function0<Unit> $onFinishedLink;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ DuxoExtensions<DS> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C195911(PlaidLinkResultData plaidLinkResultData, DuxoExtensions<DS> duxoExtensions, Function0<Unit> function0, Continuation<? super C195911> continuation) {
            super(2, continuation);
            this.$linkResultData = plaidLinkResultData;
            this.this$0 = duxoExtensions;
            this.$onFinishedLink = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C195911(this.$linkResultData, this.this$0, this.$onFinishedLink, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C195911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            DuxoExtensions<DS> duxoExtensions;
            PlaidLinkResultData plaidLinkResultData;
            Function0<Unit> function0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String linkSessionId = this.$linkResultData.getPlaidIavMetadata().getLinkSessionId();
                if (linkSessionId != null) {
                    DuxoExtensions<DS> duxoExtensions2 = this.this$0;
                    PlaidLinkResultData plaidLinkResultData2 = this.$linkResultData;
                    Function0<Unit> function02 = this.$onFinishedLink;
                    com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore iavStore = duxoExtensions2.getIavStore();
                    String plaidAccessToken = plaidLinkResultData2.getPlaidAccessToken();
                    String institutionId = plaidLinkResultData2.getPlaidIavMetadata().getInstitutionId();
                    LinkAccount linkAccount = (LinkAccount) CollectionsKt.firstOrNull((List) plaidLinkResultData2.getPlaidLinkAccounts());
                    ApiPlaidPublicToken apiPlaidPublicToken = new ApiPlaidPublicToken(plaidAccessToken, institutionId, linkAccount != null ? linkAccount.getId() : null);
                    PlaidIavMetadata plaidIavMetadata = plaidLinkResultData2.getPlaidIavMetadata();
                    UUID uuid = StringsKt.toUuid(linkSessionId);
                    this.L$0 = duxoExtensions2;
                    this.L$1 = plaidLinkResultData2;
                    this.L$2 = function02;
                    this.label = 1;
                    obj = iavStore.exchangeToken(apiPlaidPublicToken, plaidIavMetadata, uuid, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    duxoExtensions = duxoExtensions2;
                    plaidLinkResultData = plaidLinkResultData2;
                    function0 = function02;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) this.L$2;
            plaidLinkResultData = (PlaidLinkResultData) this.L$1;
            duxoExtensions = (DuxoExtensions) this.L$0;
            ResultKt.throwOnFailure(obj);
            ApiPlaidAccessToken apiPlaidAccessToken = (ApiPlaidAccessToken) obj;
            duxoExtensions.getAchRelationshipStore().createAchRelationship(apiPlaidAccessToken.getAccess_token(), apiPlaidAccessToken.getBank_account().getIav_account_id(), null, RhAccountType.RHS_ACCOUNT, plaidLinkResultData.getPlaidIavMetadata(), new Function1() { // from class: com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$linkUsingOldPlaidFlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DuxoExtensions.C195911.invokeSuspend$lambda$2$lambda$0((Response) obj2);
                }
            }, new Function1() { // from class: com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$linkUsingOldPlaidFlow$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DuxoExtensions.C195911.invokeSuspend$lambda$2$lambda$1((Throwable) obj2);
                }
            }).blockingGet();
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UserInteractionEventData invokeSuspend$lambda$2$lambda$0(Response response) {
            return new UserInteractionEventData(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UserInteractionEventData invokeSuspend$lambda$2$lambda$1(Throwable th) {
            return new UserInteractionEventData(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }
    }

    /* compiled from: DuxoExtensions.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$handlePlaidCallback$1", m3645f = "DuxoExtensions.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 250, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$handlePlaidCallback$1 */
    static final class C195901 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivityErrorHandler $activityErrorHandler;
        final /* synthetic */ String $optionalInstitutionId;
        final /* synthetic */ LinkResult $result;
        final /* synthetic */ boolean $useUpdateMode;
        int label;
        final /* synthetic */ DuxoExtensions<DS> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C195901(LinkResult linkResult, boolean z, String str, DuxoExtensions<DS> duxoExtensions, ActivityErrorHandler activityErrorHandler, Continuation<? super C195901> continuation) {
            super(2, continuation);
            this.$result = linkResult;
            this.$useUpdateMode = z;
            this.$optionalInstitutionId = str;
            this.this$0 = duxoExtensions;
            this.$activityErrorHandler = activityErrorHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C195901(this.$result, this.$useUpdateMode, this.$optionalInstitutionId, this.this$0, this.$activityErrorHandler, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C195901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x010f, code lost:
        
            if (com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions.DefaultImpls.callBffLinkAccountForAnalyticOnly(r12, r1, r11) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x011a, code lost:
        
            if (com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions.DefaultImpls.callBffLinkAccountForAnalyticOnly(r1, r12, r11) == r0) goto L45;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            DuxoExtensions<DS> duxoExtensions;
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                } catch (Exception e) {
                    boxing.boxBoolean(AbsErrorHandler.handleError$default(this.$activityErrorHandler, e, false, 2, null));
                    duxoExtensions = this.this$0;
                    anonymousClass1 = new AnonymousClass1(null);
                }
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    LinkResult linkResult = this.$result;
                    if (linkResult instanceof LinkSuccess) {
                        if (this.$useUpdateMode && this.$optionalInstitutionId != null) {
                            BffMoneyMovementService bffMoneyMovementService = this.this$0.getBffMoneyMovementService();
                            ProviderDto providerDto = ProviderDto.PLAID;
                            LinkAccountsForUpdateModeRequestDto.DetailsDto.PlaidDetails plaidDetails = new LinkAccountsForUpdateModeRequestDto.DetailsDto.PlaidDetails(new PlaidLinkAccountsDetailsDto(((LinkSuccess) this.$result).getPublicToken(), (Map<String, String>) MapsKt.mapOf(Tuples4.m3642to("metadataJson", ((LinkSuccess) this.$result).getMetadata().getMetadataJson()))));
                            LinkAccountsForUpdateModeRequestDto linkAccountsForUpdateModeRequestDto = new LinkAccountsForUpdateModeRequestDto(this.$optionalInstitutionId, providerDto, CollectionsKt.listOf(PurposeDto.PURPOSE_INVESTMENT_TRACKING), plaidDetails);
                            this.label = 1;
                            if (bffMoneyMovementService.LinkAccountsForUpdateMode(linkAccountsForUpdateModeRequestDto, this) == coroutine_suspended) {
                            }
                            this.this$0.plaidFinishedCallback();
                            Unit unit = Unit.INSTANCE;
                            duxoExtensions = this.this$0;
                            anonymousClass1 = new AnonymousClass1(null);
                        } else {
                            BffMoneyMovementService bffMoneyMovementService2 = this.this$0.getBffMoneyMovementService();
                            LinkAccountsRequestDto linkAccountsRequestDto = new LinkAccountsRequestDto(ProviderDto.PLAID, CollectionsKt.listOf(PurposeDto.PURPOSE_INVESTMENT_TRACKING), new LinkAccountsRequestDto.DetailsDto.PlaidDetails(new PlaidLinkAccountsDetailsDto(((LinkSuccess) this.$result).getPublicToken(), (Map<String, String>) MapsKt.mapOf(Tuples4.m3642to("metadataJson", ((LinkSuccess) this.$result).getMetadata().getMetadataJson())))));
                            this.label = 2;
                            if (bffMoneyMovementService2.LinkAccounts(linkAccountsRequestDto, this) == coroutine_suspended) {
                            }
                            this.this$0.plaidFinishedCallback();
                            Unit unit2 = Unit.INSTANCE;
                            duxoExtensions = this.this$0;
                            anonymousClass1 = new AnonymousClass1(null);
                        }
                    } else if (linkResult instanceof LinkExit) {
                        this.this$0.applyMutationOverride(new AnonymousClass2(null));
                        DuxoExtensions<DS> duxoExtensions2 = this.this$0;
                        LinkResult linkResult2 = this.$result;
                        this.label = 3;
                    } else {
                        DuxoExtensions<DS> duxoExtensions3 = this.this$0;
                        this.label = 4;
                    }
                    return coroutine_suspended;
                }
                if (i != 1 && i != 2) {
                    if (i != 3 && i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.plaidFinishedCallback();
                Unit unit22 = Unit.INSTANCE;
                duxoExtensions = this.this$0;
                anonymousClass1 = new AnonymousClass1(null);
                duxoExtensions.applyMutationOverride(anonymousClass1);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.this$0.applyMutationOverride(new AnonymousClass1(null));
                throw th;
            }
        }

        /* compiled from: DuxoExtensions.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u0001H\n"}, m3636d2 = {"<anonymous>", "DS", "Lcom/robinhood/android/investmentstracker/features/plaid/PlaidEnabledDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$handlePlaidCallback$1$1", m3645f = "DuxoExtensions.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$handlePlaidCallback$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DS, Continuation<? super DS>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DS ds, Continuation<? super DS> continuation) {
                return ((AnonymousClass1) create(ds, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PlaidEnabledDataState plaidEnabledDataStateUpdateCallingPlaidPrepareEndpoint = ((PlaidEnabledDataState) this.L$0).updateCallingPlaidPrepareEndpoint(false);
                Intrinsics.checkNotNull(plaidEnabledDataStateUpdateCallingPlaidPrepareEndpoint, "null cannot be cast to non-null type DS of com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo");
                return plaidEnabledDataStateUpdateCallingPlaidPrepareEndpoint;
            }
        }

        /* compiled from: DuxoExtensions.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u0001H\n"}, m3636d2 = {"<anonymous>", "DS", "Lcom/robinhood/android/investmentstracker/features/plaid/PlaidEnabledDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$handlePlaidCallback$1$2", m3645f = "DuxoExtensions.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$handlePlaidCallback$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DS, Continuation<? super DS>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DS ds, Continuation<? super DS> continuation) {
                return ((AnonymousClass2) create(ds, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PlaidEnabledDataState plaidEnabledDataStateUpdateCallingPlaidPrepareEndpoint = ((PlaidEnabledDataState) this.L$0).updateCallingPlaidPrepareEndpoint(false);
                Intrinsics.checkNotNull(plaidEnabledDataStateUpdateCallingPlaidPrepareEndpoint, "null cannot be cast to non-null type DS of com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo");
                return plaidEnabledDataStateUpdateCallingPlaidPrepareEndpoint;
            }
        }
    }
}
