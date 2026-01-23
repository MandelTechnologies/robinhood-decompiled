package com.robinhood.android.iav.p154ui.update;

import accio.service.p003v1.ProviderDto;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.DepositScheduleStateDto;
import bff_money_movement.service.p019v1.PlaidPrepareLinkDetailsDto;
import bff_money_movement.service.p019v1.PrepareLinkRequestDto;
import bff_money_movement.service.p019v1.PrepareLinkResponseDto;
import bff_money_movement.service.p019v1.UpdateDepositScheduleRequestDto;
import com.plaid.internal.EnumC7081g;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.dagger.ApplicationPackageInfoModule2;
import com.robinhood.android.iav.p154ui.update.PlaidEvent;
import com.robinhood.android.transfers.contracts.PlaidSdk;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import com.robinhood.models.api.bonfire.PlaidLinkResult;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PlaidDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001!B;\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/iav/ui/update/PlaidDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/iav/ui/update/PlaidEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/transfers/contracts/PlaidSdk;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "packageName", "", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;Lbff_money_movement/service/v1/BffMoneyMovementService;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "value", "", "shouldQueryLinkToken", "getShouldQueryLinkToken", "()Z", "setShouldQueryLinkToken", "(Z)V", "onCreate", "onLinkResult", "linkResult", "Lcom/plaid/link/result/LinkResult;", "Companion", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PlaidDuxo extends BaseDuxo5<Unit, PlaidEvent> implements HasArgs<PlaidSdk> {
    public static final String ShouldQueryLinkToken = "ShouldQueryLinkToken";
    private final AutomaticDepositStore automaticDepositStore;
    private final BffMoneyMovementService bffMoneyMovementService;
    private final String packageName;
    private final SavedStateHandle savedStateHandle;
    private final TransfersBonfireApi transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public PlaidSdk getArgs(SavedStateHandle savedStateHandle) {
        return (PlaidSdk) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidDuxo(AutomaticDepositStore automaticDepositStore, BffMoneyMovementService bffMoneyMovementService, TransfersBonfireApi transfersBonfireApi, SavedStateHandle savedStateHandle, @ApplicationPackageInfoModule2 String packageName, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.automaticDepositStore = automaticDepositStore;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.transfersBonfireApi = transfersBonfireApi;
        this.savedStateHandle = savedStateHandle;
        this.packageName = packageName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldQueryLinkToken() {
        Boolean bool = (Boolean) getSavedStateHandle().get(ShouldQueryLinkToken);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShouldQueryLinkToken(boolean z) {
        getSavedStateHandle().set(ShouldQueryLinkToken, Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C185041(null));
    }

    /* compiled from: PlaidDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.iav.ui.update.PlaidDuxo$onCreate$1", m3645f = "PlaidDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.iav.ui.update.PlaidDuxo$onCreate$1 */
    static final class C185041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C185041(Continuation<? super C185041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PlaidDuxo.this.new C185041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C185041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            PlaidDuxo plaidDuxo;
            Object objPrepareLink;
            PlaidDuxo plaidDuxo2;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (PlaidDuxo.this.getShouldQueryLinkToken()) {
                    Parcelable args = PlaidDuxo.INSTANCE.getArgs((HasSavedState) PlaidDuxo.this);
                    plaidDuxo = PlaidDuxo.this;
                    PlaidSdk plaidSdk = (PlaidSdk) args;
                    try {
                        BffMoneyMovementService bffMoneyMovementService = plaidDuxo.bffMoneyMovementService;
                        PrepareLinkRequestDto prepareLinkRequestDto = new PrepareLinkRequestDto(ProviderDto.PLAID, null, null, false, null, new PrepareLinkRequestDto.DetailsDto.PlaidDetails(new PlaidPrepareLinkDetailsDto(plaidSdk.getBankAccountId(), null, null, plaidDuxo.packageName, null, null, null, 118, null)), 30, null);
                        this.L$0 = plaidDuxo;
                        this.label = 1;
                        objPrepareLink = bffMoneyMovementService.PrepareLink(prepareLinkRequestDto, this);
                        if (objPrepareLink == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        plaidDuxo2 = plaidDuxo;
                        plaidDuxo2.submit(new PlaidEvent.Error(th));
                        plaidDuxo2.setShouldQueryLinkToken(false);
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            plaidDuxo2 = (PlaidDuxo) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                plaidDuxo = plaidDuxo2;
                objPrepareLink = obj;
            } catch (Throwable th3) {
                th = th3;
                try {
                    plaidDuxo2.submit(new PlaidEvent.Error(th));
                    plaidDuxo2.setShouldQueryLinkToken(false);
                    return Unit.INSTANCE;
                } finally {
                    plaidDuxo2.setShouldQueryLinkToken(false);
                }
            }
            plaidDuxo2.submit(new PlaidEvent.LaunchSdk(((PrepareLinkResponseDto) objPrepareLink).getLink_token()));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PlaidDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.iav.ui.update.PlaidDuxo$onLinkResult$1", m3645f = "PlaidDuxo.kt", m3646l = {111, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.iav.ui.update.PlaidDuxo$onLinkResult$1 */
    static final class C185051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LinkResult $linkResult;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C185051(LinkResult linkResult, Continuation<? super C185051> continuation) {
            super(2, continuation);
            this.$linkResult = linkResult;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PlaidDuxo.this.new C185051(this.$linkResult, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C185051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:58)|(1:(1:(6:6|59|7|48|55|56)(2:11|12))(2:13|14))(7:18|(1:20)(2:22|(1:27)(1:26))|21|29|(2:31|(3:33|(1:35)|46)(2:36|37))|55|56)|57|42|(3:44|(4:47|48|55|56)|46)(2:52|53)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00d3, code lost:
        
            r14 = r0;
            r1 = r6;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PlaidLinkResult plaidLinkResult;
            PlaidDuxo plaidDuxo;
            PlaidSdk plaidSdk;
            PlaidDuxo plaidDuxo2;
            PlaidLinkResult plaidLinkResult2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                if (!Throwables.isNetworkRelated(th)) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                }
                plaidLinkResult = PlaidLinkResult.FAILED;
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Parcelable args = PlaidDuxo.INSTANCE.getArgs((HasSavedState) PlaidDuxo.this);
                LinkResult linkResult = this.$linkResult;
                plaidDuxo = PlaidDuxo.this;
                plaidSdk = (PlaidSdk) args;
                if (linkResult instanceof LinkSuccess) {
                    plaidLinkResult2 = PlaidLinkResult.SUCCESS;
                } else if ((linkResult instanceof LinkExit) && ((LinkExit) linkResult).getError() == null) {
                    plaidLinkResult2 = PlaidLinkResult.SKIPPED;
                } else {
                    plaidLinkResult2 = PlaidLinkResult.FAILED;
                }
                plaidLinkResult = plaidLinkResult2;
                if (plaidLinkResult == PlaidLinkResult.SUCCESS) {
                    BffMoneyMovementService bffMoneyMovementService = plaidDuxo.bffMoneyMovementService;
                    String transferId = plaidSdk.getTransferId();
                    if (transferId != null) {
                        UpdateDepositScheduleRequestDto updateDepositScheduleRequestDto = new UpdateDepositScheduleRequestDto(transferId, DepositScheduleStateDto.DEPOSIT_SCHEDULE_STATE_ACTIVE);
                        this.L$0 = plaidDuxo;
                        this.L$1 = plaidSdk;
                        this.L$2 = plaidLinkResult;
                        this.label = 1;
                        if (bffMoneyMovementService.UpdateDepositSchedule(updateDepositScheduleRequestDto, this) == coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                plaidDuxo2 = (PlaidDuxo) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    plaidDuxo2.submit(new PlaidEvent.PostTransfer((List) obj));
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    plaidDuxo2.submit(new PlaidEvent.Error(th3));
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            plaidLinkResult = (PlaidLinkResult) this.L$2;
            plaidSdk = (PlaidSdk) this.L$1;
            plaidDuxo = (PlaidDuxo) this.L$0;
            ResultKt.throwOnFailure(obj);
            plaidDuxo.automaticDepositStore.refresh(true);
            TransfersBonfireApi transfersBonfireApi = plaidDuxo.transfersBonfireApi;
            String transferId2 = plaidSdk.getTransferId();
            if (transferId2 != null) {
                this.L$0 = plaidDuxo;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                obj = transfersBonfireApi.getPostTransferPageByTransferId(transferId2, plaidLinkResult, this);
                if (obj != coroutine_suspended) {
                    plaidDuxo2 = plaidDuxo;
                    plaidDuxo2.submit(new PlaidEvent.PostTransfer((List) obj));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void onLinkResult(LinkResult linkResult) {
        Intrinsics.checkNotNullParameter(linkResult, "linkResult");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C185051(linkResult, null), 3, null);
    }

    /* compiled from: PlaidDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/update/PlaidDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/iav/ui/update/PlaidDuxo;", "Lcom/robinhood/android/transfers/contracts/PlaidSdk;", "<init>", "()V", PlaidDuxo.ShouldQueryLinkToken, "", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PlaidDuxo, PlaidSdk> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PlaidSdk getArgs(SavedStateHandle savedStateHandle) {
            return (PlaidSdk) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PlaidSdk getArgs(PlaidDuxo plaidDuxo) {
            return (PlaidSdk) DuxoCompanion.DefaultImpls.getArgs(this, plaidDuxo);
        }
    }
}
