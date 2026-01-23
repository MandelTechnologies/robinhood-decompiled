package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetTaxLossHarvestStrategiesRequestDto;
import advisory.proto.p008v1.GetTaxLossHarvestStrategiesResponseDto;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategiesKt;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategiesResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TaxLossHarvestStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategiesResponse;", "accountNumbers", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.TaxLossHarvestStore$harvestStrategiesEndpoint$1", m3645f = "TaxLossHarvestStore.kt", m3646l = {88}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class TaxLossHarvestStore$harvestStrategiesEndpoint$1 extends ContinuationImpl7 implements Function2<List<? extends String>, Continuation<? super TaxLossHarvestStrategiesResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TaxLossHarvestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxLossHarvestStore$harvestStrategiesEndpoint$1(TaxLossHarvestStore taxLossHarvestStore, Continuation<? super TaxLossHarvestStore$harvestStrategiesEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = taxLossHarvestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TaxLossHarvestStore$harvestStrategiesEndpoint$1 taxLossHarvestStore$harvestStrategiesEndpoint$1 = new TaxLossHarvestStore$harvestStrategiesEndpoint$1(this.this$0, continuation);
        taxLossHarvestStore$harvestStrategiesEndpoint$1.L$0 = obj;
        return taxLossHarvestStore$harvestStrategiesEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends String> list, Continuation<? super TaxLossHarvestStrategiesResponse> continuation) {
        return invoke2((List<String>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<String> list, Continuation<? super TaxLossHarvestStrategiesResponse> continuation) {
        return ((TaxLossHarvestStore$harvestStrategiesEndpoint$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            AdvisoryService advisoryService = this.this$0.advisoryService;
            GetTaxLossHarvestStrategiesRequestDto getTaxLossHarvestStrategiesRequestDto = new GetTaxLossHarvestStrategiesRequestDto((List<String>) list);
            this.label = 1;
            obj = advisoryService.GetTaxLossHarvestStrategies(getTaxLossHarvestStrategiesRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return TaxLossHarvestStrategiesKt.toDbModel((GetTaxLossHarvestStrategiesResponseDto) obj);
    }
}
