package com.robinhood.store.advisory;

import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestFlowResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: TaxLossHarvestStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestFlowResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.TaxLossHarvestStore$flowEndpoint$2", m3645f = "TaxLossHarvestStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class TaxLossHarvestStore$flowEndpoint$2 extends ContinuationImpl7 implements Function2<TaxLossHarvestFlowResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TaxLossHarvestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxLossHarvestStore$flowEndpoint$2(TaxLossHarvestStore taxLossHarvestStore, Continuation<? super TaxLossHarvestStore$flowEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = taxLossHarvestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TaxLossHarvestStore$flowEndpoint$2 taxLossHarvestStore$flowEndpoint$2 = new TaxLossHarvestStore$flowEndpoint$2(this.this$0, continuation);
        taxLossHarvestStore$flowEndpoint$2.L$0 = obj;
        return taxLossHarvestStore$flowEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TaxLossHarvestFlowResponse taxLossHarvestFlowResponse, Continuation<? super Unit> continuation) {
        return ((TaxLossHarvestStore$flowEndpoint$2) create(taxLossHarvestFlowResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            TaxLossHarvestFlowResponse taxLossHarvestFlowResponse = (TaxLossHarvestFlowResponse) this.L$0;
            StateFlow2 stateFlow2 = this.this$0.flowResponseFlow;
            do {
                value = stateFlow2.getValue();
            } while (!stateFlow2.compareAndSet(value, taxLossHarvestFlowResponse));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
