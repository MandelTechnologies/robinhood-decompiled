package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetTaxGainsAndLossesRequestDto;
import advisory.proto.p008v1.GetTaxGainsAndLossesResponseDto;
import com.robinhood.models.advisory.p304db.tlh.TaxGainsAndLossesResponse;
import com.robinhood.models.advisory.p304db.tlh.TaxGainsAndLossesResponse2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TaxLossHarvestStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/advisory/db/tlh/TaxGainsAndLossesResponse;", "request", "Ladvisory/proto/v1/GetTaxGainsAndLossesRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.TaxLossHarvestStore$gainsAndLossesEndpoint$1", m3645f = "TaxLossHarvestStore.kt", m3646l = {75}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class TaxLossHarvestStore$gainsAndLossesEndpoint$1 extends ContinuationImpl7 implements Function2<GetTaxGainsAndLossesRequestDto, Continuation<? super TaxGainsAndLossesResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TaxLossHarvestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxLossHarvestStore$gainsAndLossesEndpoint$1(TaxLossHarvestStore taxLossHarvestStore, Continuation<? super TaxLossHarvestStore$gainsAndLossesEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = taxLossHarvestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TaxLossHarvestStore$gainsAndLossesEndpoint$1 taxLossHarvestStore$gainsAndLossesEndpoint$1 = new TaxLossHarvestStore$gainsAndLossesEndpoint$1(this.this$0, continuation);
        taxLossHarvestStore$gainsAndLossesEndpoint$1.L$0 = obj;
        return taxLossHarvestStore$gainsAndLossesEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetTaxGainsAndLossesRequestDto getTaxGainsAndLossesRequestDto, Continuation<? super TaxGainsAndLossesResponse> continuation) {
        return ((TaxLossHarvestStore$gainsAndLossesEndpoint$1) create(getTaxGainsAndLossesRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GetTaxGainsAndLossesRequestDto getTaxGainsAndLossesRequestDto = (GetTaxGainsAndLossesRequestDto) this.L$0;
            AdvisoryService advisoryService = this.this$0.advisoryService;
            this.label = 1;
            obj = advisoryService.GetTaxGainsAndLosses(getTaxGainsAndLossesRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return TaxGainsAndLossesResponse2.toDbModel((GetTaxGainsAndLossesResponseDto) obj);
    }
}
