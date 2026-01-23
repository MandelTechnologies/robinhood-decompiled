package com.robinhood.android.investmentstracker.linking;

import accio.service.p003v1.PurposeDto;
import android.app.Activity;
import androidx.view.result.ActivityResultLauncher;
import bff_money_movement.service.p019v1.AgreementStatusDto;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.GetAgreementRequestDto;
import bff_money_movement.service.p019v1.GetAgreementResponseDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerAccountContainerDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerAgreementTypeDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerDisconnectedDataDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerGetAccountsRequestDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerGetAccountsResponseDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerGetAgreementResponseDto;
import bff_money_movement.service.p019v1.SignAgreementRequestDto;
import com.plaid.internal.EnumC7081g;
import com.plaid.link.PlaidHandler;
import com.plaid.link.result.LinkResult;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.dagger.ApplicationPackageInfoModule2;
import com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions;
import com.robinhood.android.investmentstracker.linking.models.AccountListContainerViewModel;
import com.robinhood.android.investmentstracker.linking.models.AccountListDataState;
import com.robinhood.android.investmentstracker.linking.models.AccountListEvent;
import com.robinhood.android.investmentstracker.linking.models.AccountListViewState;
import com.robinhood.android.investmentstracker.linking.models.PlaidLinkResultData;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAgreementViewModel;
import com.robinhood.android.plaidconnect.api.PlaidConnectApi;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.store.achrelationship.IavStore;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountListDuxo.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B;\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#J\b\u0010%\u001a\u00020\u001fH\u0016J6\u0010&\u001a\u00020\u001f2'\u0010'\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020)\u0012\u0006\u0012\u0004\u0018\u00010*0(¢\u0006\u0002\b+H\u0016¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u001fH\u0016J\u000e\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u0007J\u0006\u00100\u001a\u00020\u001fJ\u0006\u00101\u001a\u00020\u001fJ\u000e\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u000204R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/linking/AccountListDuxo;", "Lcom/robinhood/android/investmentstracker/features/plaid/PlaidEnabledDuxo;", "Lcom/robinhood/android/investmentstracker/linking/models/AccountListDataState;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/investmentstracker/linking/models/AccountListViewState;", "Lcom/robinhood/android/investmentstracker/linking/models/AccountListEvent;", "packageName", "", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "plaidConnectApi", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "iavStore", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/IavStore;", "achRelationshipStore", "Lcom/robinhood/store/achrelationship/IavStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljava/lang/String;Lbff_money_movement/service/v1/BffMoneyMovementService;Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;Lcom/robinhood/librobinhood/data/store/bonfire/cashier/IavStore;Lcom/robinhood/store/achrelationship/IavStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "getPackageName", "()Ljava/lang/String;", "getBffMoneyMovementService", "()Lbff_money_movement/service/v1/BffMoneyMovementService;", "getPlaidConnectApi", "()Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "getIavStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/cashier/IavStore;", "getAchRelationshipStore", "()Lcom/robinhood/store/achrelationship/IavStore;", "onCreate", "", "drawScreen", "unlinkSelected", "account", "Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto;", "manageAccountSelected", "onResume", "applyMutationOverride", "mutator", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)V", "plaidFinishedCallback", "reconnectSelected", "institutionId", "startPlaidWithChecks", "closeAgreements", "agreetoAgreement", "response", "Lbff_money_movement/service/v1/InvestmentsTrackerGetAgreementResponseDto;", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class AccountListDuxo extends BaseDuxo3<AccountListDataState, AccountListViewState, AccountListEvent> implements DuxoExtensions<AccountListDataState> {
    public static final int $stable = 8;
    private final IavStore achRelationshipStore;
    private final BffMoneyMovementService bffMoneyMovementService;
    private final com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore iavStore;
    private final String packageName;
    private final PlaidConnectApi plaidConnectApi;

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public void handlePlaidCallback(LinkResult linkResult, ActivityErrorHandler activityErrorHandler, boolean z, String str) {
        DuxoExtensions.DefaultImpls.handlePlaidCallback(this, linkResult, activityErrorHandler, z, str);
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public void linkUsingOldPlaidFlow(PlaidLinkResultData plaidLinkResultData, Function0<Unit> function0) {
        DuxoExtensions.DefaultImpls.linkUsingOldPlaidFlow(this, plaidLinkResultData, function0);
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public void startOldPlaid(Activity activity, ActivityResultLauncher<PlaidHandler> activityResultLauncher) {
        DuxoExtensions.DefaultImpls.startOldPlaid(this, activity, activityResultLauncher);
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public void startPlaid(Activity activity, ActivityResultLauncher<PlaidHandler> activityResultLauncher, PurposeDto purposeDto, String str) {
        DuxoExtensions.DefaultImpls.startPlaid(this, activity, activityResultLauncher, purposeDto, str);
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public String getPackageName() {
        return this.packageName;
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public BffMoneyMovementService getBffMoneyMovementService() {
        return this.bffMoneyMovementService;
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public PlaidConnectApi getPlaidConnectApi() {
        return this.plaidConnectApi;
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore getIavStore() {
        return this.iavStore;
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public IavStore getAchRelationshipStore() {
        return this.achRelationshipStore;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountListDuxo(@ApplicationPackageInfoModule2 String packageName, BffMoneyMovementService bffMoneyMovementService, PlaidConnectApi plaidConnectApi, com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore iavStore, IavStore achRelationshipStore, DuxoBundle duxoBundle) {
        super(new AccountListDataState(extensions2.persistentListOf(), false, null, null, 12, null), new AccountListStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
        Intrinsics.checkNotNullParameter(iavStore, "iavStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.packageName = packageName;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.plaidConnectApi = plaidConnectApi;
        this.iavStore = iavStore;
        this.achRelationshipStore = achRelationshipStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        drawScreen();
    }

    /* compiled from: AccountListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.linking.AccountListDuxo$drawScreen$1", m3645f = "AccountListDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.linking.AccountListDuxo$drawScreen$1 */
    static final class C195981 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C195981(Continuation<? super C195981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountListDuxo.this.new C195981(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C195981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BffMoneyMovementService bffMoneyMovementService = AccountListDuxo.this.getBffMoneyMovementService();
                    InvestmentsTrackerGetAccountsRequestDto investmentsTrackerGetAccountsRequestDto = new InvestmentsTrackerGetAccountsRequestDto();
                    this.label = 1;
                    obj = bffMoneyMovementService.InvestmentsTrackerGetAccounts(investmentsTrackerGetAccountsRequestDto, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AccountListDuxo.this.applyMutation(new AnonymousClass1((InvestmentsTrackerGetAccountsResponseDto) obj, null));
            } catch (Exception e) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AccountListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/linking/models/AccountListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.linking.AccountListDuxo$drawScreen$1$1", m3645f = "AccountListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.investmentstracker.linking.AccountListDuxo$drawScreen$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountListDataState, Continuation<? super AccountListDataState>, Object> {
            final /* synthetic */ InvestmentsTrackerGetAccountsResponseDto $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InvestmentsTrackerGetAccountsResponseDto investmentsTrackerGetAccountsResponseDto, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = investmentsTrackerGetAccountsResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountListDataState accountListDataState, Continuation<? super AccountListDataState> continuation) {
                return ((AnonymousClass1) create(accountListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AccountListDataState accountListDataState = (AccountListDataState) this.L$0;
                List<InvestmentsTrackerAccountContainerDto> accounts2 = this.$response.getAccounts();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts2, 10));
                Iterator<T> it = accounts2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new AccountListContainerViewModel(false, true, (InvestmentsTrackerAccountContainerDto) it.next()));
                }
                return AccountListDataState.copy$default(accountListDataState, extensions2.toPersistentList(arrayList), false, null, null, 14, null);
            }
        }
    }

    public final void drawScreen() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C195981(null), 3, null);
    }

    public final void unlinkSelected(InvestmentsTrackerAccountContainerDto account) {
        Intrinsics.checkNotNullParameter(account, "account");
        submit(new AccountListEvent.ShowUnlinkDialog(account.getName(), account.getConnection_id()));
    }

    public final void manageAccountSelected(InvestmentsTrackerAccountContainerDto account) {
        Intrinsics.checkNotNullParameter(account, "account");
        submit(new AccountListEvent.ShowManageOptions(account));
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        drawScreen();
    }

    /* compiled from: AccountListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/linking/models/AccountListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.linking.AccountListDuxo$applyMutationOverride$1", m3645f = "AccountListDuxo.kt", m3646l = {97}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.linking.AccountListDuxo$applyMutationOverride$1 */
    static final class C195961 extends ContinuationImpl7 implements Function2<AccountListDataState, Continuation<? super AccountListDataState>, Object> {
        final /* synthetic */ Function2<AccountListDataState, Continuation<? super AccountListDataState>, Object> $mutator;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C195961(Function2<? super AccountListDataState, ? super Continuation<? super AccountListDataState>, ? extends Object> function2, Continuation<? super C195961> continuation) {
            super(2, continuation);
            this.$mutator = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C195961 c195961 = new C195961(this.$mutator, continuation);
            c195961.L$0 = obj;
            return c195961;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountListDataState accountListDataState, Continuation<? super AccountListDataState> continuation) {
            return ((C195961) create(accountListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            AccountListDataState accountListDataState = (AccountListDataState) this.L$0;
            Function2<AccountListDataState, Continuation<? super AccountListDataState>, Object> function2 = this.$mutator;
            this.label = 1;
            Object objInvoke = function2.invoke(accountListDataState, this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public void applyMutationOverride(Function2<? super AccountListDataState, ? super Continuation<? super AccountListDataState>, ? extends Object> mutator) {
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        applyMutation(new C195961(mutator, null));
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public void plaidFinishedCallback() {
        drawScreen();
    }

    /* compiled from: AccountListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/linking/models/AccountListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.linking.AccountListDuxo$reconnectSelected$1", m3645f = "AccountListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.linking.AccountListDuxo$reconnectSelected$1 */
    static final class C195991 extends ContinuationImpl7 implements Function2<AccountListDataState, Continuation<? super AccountListDataState>, Object> {
        final /* synthetic */ String $institutionId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C195991(String str, Continuation<? super C195991> continuation) {
            super(2, continuation);
            this.$institutionId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C195991 c195991 = new C195991(this.$institutionId, continuation);
            c195991.L$0 = obj;
            return c195991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountListDataState accountListDataState, Continuation<? super AccountListDataState> continuation) {
            return ((C195991) create(accountListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountListDataState accountListDataState = (AccountListDataState) this.L$0;
            ArrayList arrayList = new ArrayList();
            for (AccountListContainerViewModel accountListContainerViewModel : accountListDataState.getAccounts()) {
                InvestmentsTrackerDisconnectedDataDto disconnected_data = accountListContainerViewModel.getDetails().getDisconnected_data();
                if (Intrinsics.areEqual(disconnected_data != null ? disconnected_data.getInstitution_id() : null, this.$institutionId)) {
                    arrayList.add(AccountListContainerViewModel.copy$default(accountListContainerViewModel, true, false, null, 4, null));
                } else {
                    arrayList.add(AccountListContainerViewModel.copy$default(accountListContainerViewModel, false, false, null, 5, null));
                }
            }
            return AccountListDataState.copy$default(accountListDataState, extensions2.toPersistentList(arrayList), false, this.$institutionId, null, 10, null);
        }
    }

    public final void reconnectSelected(String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        applyMutation(new C195991(institutionId, null));
        submit(new AccountListEvent.StartUpdateMode(institutionId));
    }

    /* compiled from: AccountListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.linking.AccountListDuxo$startPlaidWithChecks$1", m3645f = "AccountListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.linking.AccountListDuxo$startPlaidWithChecks$1 */
    static final class C196001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C196001(Continuation<? super C196001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountListDuxo.this.new C196001(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C196001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BffMoneyMovementService bffMoneyMovementService = AccountListDuxo.this.getBffMoneyMovementService();
                GetAgreementRequestDto getAgreementRequestDto = new GetAgreementRequestDto(InvestmentsTrackerAgreementTypeDto.CONNECT_ACCOUNT);
                this.label = 1;
                obj = bffMoneyMovementService.GetAgreement(getAgreementRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            GetAgreementResponseDto getAgreementResponseDto = (GetAgreementResponseDto) obj;
            InvestmentsTrackerGetAgreementResponseDto agreement_response = getAgreementResponseDto.getAgreement_response();
            if (getAgreementResponseDto.getAgreement_status() == AgreementStatusDto.AGREEMENT_NOT_SIGNED && agreement_response != null) {
                AccountListDuxo.this.applyMutation(new AnonymousClass1(agreement_response, null));
            } else {
                AccountListDuxo.this.submit(AccountListEvent.PlaidStartWithBff.INSTANCE);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AccountListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/linking/models/AccountListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.linking.AccountListDuxo$startPlaidWithChecks$1$1", m3645f = "AccountListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.investmentstracker.linking.AccountListDuxo$startPlaidWithChecks$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountListDataState, Continuation<? super AccountListDataState>, Object> {
            final /* synthetic */ InvestmentsTrackerGetAgreementResponseDto $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InvestmentsTrackerGetAgreementResponseDto investmentsTrackerGetAgreementResponseDto, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = investmentsTrackerGetAgreementResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountListDataState accountListDataState, Continuation<? super AccountListDataState> continuation) {
                return ((AnonymousClass1) create(accountListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AccountListDataState.copy$default((AccountListDataState) this.L$0, null, false, null, new InvestmentsTrackerAgreementViewModel(this.$response, false), 7, null);
            }
        }
    }

    public final void startPlaidWithChecks() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C196001(null), 3, null);
    }

    /* compiled from: AccountListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/linking/models/AccountListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.linking.AccountListDuxo$closeAgreements$1", m3645f = "AccountListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.linking.AccountListDuxo$closeAgreements$1 */
    static final class C195971 extends ContinuationImpl7 implements Function2<AccountListDataState, Continuation<? super AccountListDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C195971(Continuation<? super C195971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C195971 c195971 = new C195971(continuation);
            c195971.L$0 = obj;
            return c195971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountListDataState accountListDataState, Continuation<? super AccountListDataState> continuation) {
            return ((C195971) create(accountListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountListDataState.copy$default((AccountListDataState) this.L$0, null, false, null, null, 7, null);
        }
    }

    public final void closeAgreements() {
        applyMutation(new C195971(null));
    }

    /* compiled from: AccountListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/linking/models/AccountListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.linking.AccountListDuxo$agreetoAgreement$1", m3645f = "AccountListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.linking.AccountListDuxo$agreetoAgreement$1 */
    static final class C195941 extends ContinuationImpl7 implements Function2<AccountListDataState, Continuation<? super AccountListDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C195941(Continuation<? super C195941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C195941 c195941 = new C195941(continuation);
            c195941.L$0 = obj;
            return c195941;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountListDataState accountListDataState, Continuation<? super AccountListDataState> continuation) {
            return ((C195941) create(accountListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountListDataState accountListDataState = (AccountListDataState) this.L$0;
            InvestmentsTrackerAgreementViewModel agreementResponse = accountListDataState.getAgreementResponse();
            return AccountListDataState.copy$default(accountListDataState, null, false, null, agreementResponse != null ? InvestmentsTrackerAgreementViewModel.copy$default(agreementResponse, null, true, 1, null) : null, 7, null);
        }
    }

    public final void agreetoAgreement(InvestmentsTrackerGetAgreementResponseDto response) {
        Intrinsics.checkNotNullParameter(response, "response");
        applyMutation(new C195941(null));
        applyMutation(new C195952(response, null));
    }

    /* compiled from: AccountListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/linking/models/AccountListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.linking.AccountListDuxo$agreetoAgreement$2", m3645f = "AccountListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.linking.AccountListDuxo$agreetoAgreement$2 */
    static final class C195952 extends ContinuationImpl7 implements Function2<AccountListDataState, Continuation<? super AccountListDataState>, Object> {
        final /* synthetic */ InvestmentsTrackerGetAgreementResponseDto $response;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C195952(InvestmentsTrackerGetAgreementResponseDto investmentsTrackerGetAgreementResponseDto, Continuation<? super C195952> continuation) {
            super(2, continuation);
            this.$response = investmentsTrackerGetAgreementResponseDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C195952 c195952 = AccountListDuxo.this.new C195952(this.$response, continuation);
            c195952.L$0 = obj;
            return c195952;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountListDataState accountListDataState, Continuation<? super AccountListDataState> continuation) {
            return ((C195952) create(accountListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            AccountListDataState accountListDataState;
            AccountListDataState accountListDataState2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountListDataState accountListDataState3 = (AccountListDataState) this.L$0;
                try {
                    BffMoneyMovementService bffMoneyMovementService = AccountListDuxo.this.getBffMoneyMovementService();
                    SignAgreementRequestDto signAgreementRequestDto = new SignAgreementRequestDto(this.$response.getAgreement_type());
                    this.L$0 = accountListDataState3;
                    this.label = 1;
                    if (bffMoneyMovementService.SignAgreement(signAgreementRequestDto, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    accountListDataState2 = accountListDataState3;
                    AccountListDuxo.this.startPlaidWithChecks();
                    return AccountListDataState.copy$default(accountListDataState2, null, false, null, null, 7, null);
                } catch (Exception unused) {
                    accountListDataState = accountListDataState3;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AccountListDataState accountListDataState4 = (AccountListDataState) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    accountListDataState2 = accountListDataState4;
                    try {
                        AccountListDuxo.this.startPlaidWithChecks();
                        return AccountListDataState.copy$default(accountListDataState2, null, false, null, null, 7, null);
                    } catch (Exception unused2) {
                        accountListDataState = accountListDataState2;
                    }
                } catch (Exception unused3) {
                    accountListDataState = accountListDataState4;
                }
            }
            InvestmentsTrackerAgreementViewModel agreementResponse = accountListDataState.getAgreementResponse();
            return AccountListDataState.copy$default(accountListDataState, null, false, null, agreementResponse != null ? InvestmentsTrackerAgreementViewModel.copy$default(agreementResponse, null, false, 1, null) : null, 7, null);
        }
    }
}
