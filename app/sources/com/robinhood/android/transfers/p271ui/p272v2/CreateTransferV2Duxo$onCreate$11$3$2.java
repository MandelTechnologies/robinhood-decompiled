package com.robinhood.android.transfers.p271ui.p272v2;

import android.os.Parcelable;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.transfers.p271ui.p272v2.TransferSummaryState;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryResponse;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CreateTransferV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;", "Lkotlin/internal/Exact;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$11$3$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {415, 420, 417}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes9.dex */
final class CreateTransferV2Duxo$onCreate$11$3$2 extends ContinuationImpl7 implements Function2<FlowCollector<? super TransferSummaryState>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiTransferSummaryRequest $request;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CreateTransferV2Duxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferV2Duxo$onCreate$11$3$2(ApiTransferSummaryRequest apiTransferSummaryRequest, CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super CreateTransferV2Duxo$onCreate$11$3$2> continuation) {
        super(2, continuation);
        this.$request = apiTransferSummaryRequest;
        this.this$0 = createTransferV2Duxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateTransferV2Duxo$onCreate$11$3$2 createTransferV2Duxo$onCreate$11$3$2 = new CreateTransferV2Duxo$onCreate$11$3$2(this.$request, this.this$0, continuation);
        createTransferV2Duxo$onCreate$11$3$2.L$0 = obj;
        return createTransferV2Duxo$onCreate$11$3$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super TransferSummaryState> flowCollector, Continuation<? super Unit> continuation) {
        return ((CreateTransferV2Duxo$onCreate$11$3$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r10.emit(r0, r9) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if (r0.emit(r4, r9) != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:11:0x0022, B:25:0x005d, B:27:0x0065, B:28:0x006b), top: B:38:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:11:0x0022, B:25:0x005d, B:27:0x0065, B:28:0x006b), top: B:38:0x0022 }] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Throwable th;
        FlowCollector flowCollector2;
        Parcelable success;
        List<UIComponent<GenericAction>> content;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            if (this.$request == null) {
                TransferSummaryState.None none = TransferSummaryState.None.INSTANCE;
                this.label = 1;
            } else {
                try {
                    TransfersBonfireApi transfersBonfireApi = this.this$0.getTransfersBonfireApi();
                    ApiTransferSummaryRequest apiTransferSummaryRequest = this.$request;
                    this.L$0 = flowCollector;
                    this.L$1 = flowCollector;
                    this.label = 2;
                    Object objPostTransferSummary = transfersBonfireApi.postTransferSummary(apiTransferSummaryRequest, this);
                    if (objPostTransferSummary != coroutine_suspended) {
                        obj = objPostTransferSummary;
                        flowCollector2 = flowCollector;
                        content = ((ApiTransferSummaryResponse) obj).getContent();
                        if (content == null) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                    success = TransferSummaryState.None.INSTANCE;
                    flowCollector2 = flowCollector;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                flowCollector2 = (FlowCollector) this.L$1;
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    content = ((ApiTransferSummaryResponse) obj).getContent();
                    if (content == null) {
                        success = new TransferSummaryState.Success(content);
                    } else {
                        success = TransferSummaryState.None.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    flowCollector = flowCollector3;
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                    success = TransferSummaryState.None.INSTANCE;
                    flowCollector2 = flowCollector;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                }
            } else if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
    }
}
