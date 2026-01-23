package com.robinhood.store.advisory;

import advisory.proto.p008v1.GetTaxGainsAndLossesRequestDto;
import com.robinhood.models.advisory.p304db.tlh.TaxGainsAndLossesResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: TaxLossHarvestStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "request", "Ladvisory/proto/v1/GetTaxGainsAndLossesRequestDto;", "response", "Lcom/robinhood/models/advisory/db/tlh/TaxGainsAndLossesResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.TaxLossHarvestStore$gainsAndLossesEndpoint$2", m3645f = "TaxLossHarvestStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class TaxLossHarvestStore$gainsAndLossesEndpoint$2 extends ContinuationImpl7 implements Function3<GetTaxGainsAndLossesRequestDto, TaxGainsAndLossesResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ TaxLossHarvestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxLossHarvestStore$gainsAndLossesEndpoint$2(TaxLossHarvestStore taxLossHarvestStore, Continuation<? super TaxLossHarvestStore$gainsAndLossesEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = taxLossHarvestStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(GetTaxGainsAndLossesRequestDto getTaxGainsAndLossesRequestDto, TaxGainsAndLossesResponse taxGainsAndLossesResponse, Continuation<? super Unit> continuation) {
        TaxLossHarvestStore$gainsAndLossesEndpoint$2 taxLossHarvestStore$gainsAndLossesEndpoint$2 = new TaxLossHarvestStore$gainsAndLossesEndpoint$2(this.this$0, continuation);
        taxLossHarvestStore$gainsAndLossesEndpoint$2.L$0 = getTaxGainsAndLossesRequestDto;
        taxLossHarvestStore$gainsAndLossesEndpoint$2.L$1 = taxGainsAndLossesResponse;
        return taxLossHarvestStore$gainsAndLossesEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            GetTaxGainsAndLossesRequestDto getTaxGainsAndLossesRequestDto = (GetTaxGainsAndLossesRequestDto) this.L$0;
            TaxGainsAndLossesResponse taxGainsAndLossesResponse = (TaxGainsAndLossesResponse) this.L$1;
            StateFlow2 stateFlow2 = (StateFlow2) this.this$0.gainsAndLossesFlow.get(getTaxGainsAndLossesRequestDto.getYear());
            if (stateFlow2 != null) {
                do {
                    value = stateFlow2.getValue();
                } while (!stateFlow2.compareAndSet(value, taxGainsAndLossesResponse));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
