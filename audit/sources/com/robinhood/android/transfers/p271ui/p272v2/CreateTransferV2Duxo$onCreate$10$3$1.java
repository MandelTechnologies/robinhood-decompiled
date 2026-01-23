package com.robinhood.android.transfers.p271ui.p272v2;

import android.os.Parcelable;
import com.robinhood.android.api.retirement.transfers.RetirementTransfersApi;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.IraDistributionType;
import com.robinhood.utils.logging.CrashReporter;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CreateTransferV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$10$3$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {372, 374, 380, 375}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CreateTransferV2Duxo$onCreate$10$3$1 extends ContinuationImpl7 implements Function2<FlowCollector<? super CreateTransferDuxo.CalculatedTaxWithholdingResult>, Continuation<? super Unit>, Object> {
    final /* synthetic */ CreateTransferViewState.IraDistributionTaxWithholdingRequest $request;
    private /* synthetic */ Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ CreateTransferV2Duxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferV2Duxo$onCreate$10$3$1(CreateTransferViewState.IraDistributionTaxWithholdingRequest iraDistributionTaxWithholdingRequest, CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super CreateTransferV2Duxo$onCreate$10$3$1> continuation) {
        super(2, continuation);
        this.$request = iraDistributionTaxWithholdingRequest;
        this.this$0 = createTransferV2Duxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateTransferV2Duxo$onCreate$10$3$1 createTransferV2Duxo$onCreate$10$3$1 = new CreateTransferV2Duxo$onCreate$10$3$1(this.$request, this.this$0, continuation);
        createTransferV2Duxo$onCreate$10$3$1.L$0 = obj;
        return createTransferV2Duxo$onCreate$10$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super CreateTransferDuxo.CalculatedTaxWithholdingResult> flowCollector, Continuation<? super Unit> continuation) {
        return ((CreateTransferV2Duxo$onCreate$10$3$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r15.emit(r0, r14) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        if (r3.emit(r5, r14) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        CreateTransferV2Duxo$onCreate$10$3$1 createTransferV2Duxo$onCreate$10$3$1;
        Throwable th;
        boolean zIsManaged;
        Object iraDistributionTaxWithholding;
        FlowCollector flowCollector2;
        FlowCollector flowCollector3;
        Parcelable success;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            if (this.$request == null) {
                CreateTransferDuxo.CalculatedTaxWithholdingResult.None none = CreateTransferDuxo.CalculatedTaxWithholdingResult.None.INSTANCE;
                this.label = 1;
            } else {
                CreateTransferDuxo.CalculatedTaxWithholdingResult.Loading loading = CreateTransferDuxo.CalculatedTaxWithholdingResult.Loading.INSTANCE;
                this.L$0 = flowCollector;
                this.label = 2;
                if (flowCollector.emit(loading, this) != coroutine_suspended) {
                    zIsManaged = this.$request.getIraTransferAccount().isManaged();
                    RetirementTransfersApi retirementTransfersApi = this.this$0.retirementTransfersApi;
                    BigDecimal amount = this.$request.getAmount();
                    String accountNumber = this.$request.getIraTransferAccount().getAccountNumber();
                    ApiTransferAccount.TransferAccountType type2 = this.$request.getIraTransferAccount().getType();
                    IraDistributionType distributionType = this.$request.getDistributionType();
                    BigDecimal stateWithholdingPercent = this.$request.getStateWithholdingPercent();
                    BigDecimal federalWithholdingPercent = this.$request.getFederalWithholdingPercent();
                    this.L$0 = flowCollector;
                    this.L$1 = flowCollector;
                    this.Z$0 = zIsManaged;
                    this.label = 3;
                    createTransferV2Duxo$onCreate$10$3$1 = this;
                    iraDistributionTaxWithholding = retirementTransfersApi.getIraDistributionTaxWithholding(amount, accountNumber, type2, distributionType, stateWithholdingPercent, federalWithholdingPercent, createTransferV2Duxo$onCreate$10$3$1);
                    if (iraDistributionTaxWithholding != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector4;
                try {
                    zIsManaged = this.$request.getIraTransferAccount().isManaged();
                    RetirementTransfersApi retirementTransfersApi2 = this.this$0.retirementTransfersApi;
                    BigDecimal amount2 = this.$request.getAmount();
                    String accountNumber2 = this.$request.getIraTransferAccount().getAccountNumber();
                    ApiTransferAccount.TransferAccountType type22 = this.$request.getIraTransferAccount().getType();
                    IraDistributionType distributionType2 = this.$request.getDistributionType();
                    BigDecimal stateWithholdingPercent2 = this.$request.getStateWithholdingPercent();
                    BigDecimal federalWithholdingPercent2 = this.$request.getFederalWithholdingPercent();
                    this.L$0 = flowCollector;
                    this.L$1 = flowCollector;
                    this.Z$0 = zIsManaged;
                    this.label = 3;
                    createTransferV2Duxo$onCreate$10$3$1 = this;
                    try {
                        iraDistributionTaxWithholding = retirementTransfersApi2.getIraDistributionTaxWithholding(amount2, accountNumber2, type22, distributionType2, stateWithholdingPercent2, federalWithholdingPercent2, createTransferV2Duxo$onCreate$10$3$1);
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                        success = CreateTransferDuxo.CalculatedTaxWithholdingResult.None.INSTANCE;
                        flowCollector3 = flowCollector;
                        createTransferV2Duxo$onCreate$10$3$1.L$0 = null;
                        createTransferV2Duxo$onCreate$10$3$1.L$1 = null;
                        createTransferV2Duxo$onCreate$10$3$1.label = 4;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    createTransferV2Duxo$onCreate$10$3$1 = this;
                }
                if (iraDistributionTaxWithholding != coroutine_suspended) {
                    flowCollector2 = flowCollector;
                    obj = iraDistributionTaxWithholding;
                    flowCollector3 = flowCollector2;
                    success = new CreateTransferDuxo.CalculatedTaxWithholdingResult.Success((ApiIraDistributionTaxWithholding) obj, zIsManaged);
                    createTransferV2Duxo$onCreate$10$3$1.L$0 = null;
                    createTransferV2Duxo$onCreate$10$3$1.L$1 = null;
                    createTransferV2Duxo$onCreate$10$3$1.label = 4;
                }
                return coroutine_suspended;
            }
            if (i == 3) {
                zIsManaged = this.Z$0;
                flowCollector3 = (FlowCollector) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    createTransferV2Duxo$onCreate$10$3$1 = this;
                    try {
                        success = new CreateTransferDuxo.CalculatedTaxWithholdingResult.Success((ApiIraDistributionTaxWithholding) obj, zIsManaged);
                    } catch (Throwable th4) {
                        FlowCollector flowCollector5 = flowCollector2;
                        th = th4;
                        flowCollector = flowCollector5;
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                        success = CreateTransferDuxo.CalculatedTaxWithholdingResult.None.INSTANCE;
                        flowCollector3 = flowCollector;
                        createTransferV2Duxo$onCreate$10$3$1.L$0 = null;
                        createTransferV2Duxo$onCreate$10$3$1.L$1 = null;
                        createTransferV2Duxo$onCreate$10$3$1.label = 4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    flowCollector = flowCollector2;
                    createTransferV2Duxo$onCreate$10$3$1 = this;
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                    success = CreateTransferDuxo.CalculatedTaxWithholdingResult.None.INSTANCE;
                    flowCollector3 = flowCollector;
                    createTransferV2Duxo$onCreate$10$3$1.L$0 = null;
                    createTransferV2Duxo$onCreate$10$3$1.L$1 = null;
                    createTransferV2Duxo$onCreate$10$3$1.label = 4;
                }
                createTransferV2Duxo$onCreate$10$3$1.L$0 = null;
                createTransferV2Duxo$onCreate$10$3$1.L$1 = null;
                createTransferV2Duxo$onCreate$10$3$1.label = 4;
            } else if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
