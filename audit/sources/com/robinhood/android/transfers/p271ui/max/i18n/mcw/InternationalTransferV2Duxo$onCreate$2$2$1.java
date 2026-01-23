package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryResponse;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: InternationalTransferV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onCreate$2$2$1", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {120, 120}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class InternationalTransferV2Duxo$onCreate$2$2$1 extends ContinuationImpl7 implements Function2<FlowCollector<? super List<? extends UIComponent<? extends GenericAction>>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiTransferSummaryRequest $it;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternationalTransferV2Duxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternationalTransferV2Duxo$onCreate$2$2$1(InternationalTransferV2Duxo internationalTransferV2Duxo, ApiTransferSummaryRequest apiTransferSummaryRequest, Continuation<? super InternationalTransferV2Duxo$onCreate$2$2$1> continuation) {
        super(2, continuation);
        this.this$0 = internationalTransferV2Duxo;
        this.$it = apiTransferSummaryRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternationalTransferV2Duxo$onCreate$2$2$1 internationalTransferV2Duxo$onCreate$2$2$1 = new InternationalTransferV2Duxo$onCreate$2$2$1(this.this$0, this.$it, continuation);
        internationalTransferV2Duxo$onCreate$2$2$1.L$0 = obj;
        return internationalTransferV2Duxo$onCreate$2$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super List<? extends UIComponent<? extends GenericAction>>> flowCollector, Continuation<? super Unit> continuation) {
        return ((InternationalTransferV2Duxo$onCreate$2$2$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
            ApiTransferSummaryRequest apiTransferSummaryRequest = this.$it;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = transfersBonfireApi.postTransferSummary(apiTransferSummaryRequest, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        List<UIComponent<GenericAction>> content = ((ApiTransferSummaryResponse) obj).getContent();
        this.L$0 = null;
        this.label = 2;
    }
}
