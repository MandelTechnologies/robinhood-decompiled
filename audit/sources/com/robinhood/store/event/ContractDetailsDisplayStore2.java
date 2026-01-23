package com.robinhood.store.event;

import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractSideExtensions;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetContractDisplayDetailsRequestDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetContractDisplayDetailsResponseDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import com.robinhood.utils.extensions.Uuids;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ContractDetailsDisplayStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto;", "params", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.ContractDetailsDisplayStore$getContractDisplayDetailsEndpoint$1", m3645f = "ContractDetailsDisplayStore.kt", m3646l = {57, 51}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.ContractDetailsDisplayStore$getContractDisplayDetailsEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ContractDetailsDisplayStore2 extends ContinuationImpl7 implements Function2<ContractIdWithSide, Continuation<? super Response<? extends GetContractDisplayDetailsResponseDto>>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ContractDetailsDisplayStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContractDetailsDisplayStore2(ContractDetailsDisplayStore contractDetailsDisplayStore, Continuation<? super ContractDetailsDisplayStore2> continuation) {
        super(2, continuation);
        this.this$0 = contractDetailsDisplayStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContractDetailsDisplayStore2 contractDetailsDisplayStore2 = new ContractDetailsDisplayStore2(this.this$0, continuation);
        contractDetailsDisplayStore2.L$0 = obj;
        return contractDetailsDisplayStore2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ContractIdWithSide contractIdWithSide, Continuation<? super Response<GetContractDisplayDetailsResponseDto>> continuation) {
        return ((ContractDetailsDisplayStore2) create(contractIdWithSide, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ContractIdWithSide contractIdWithSide, Continuation<? super Response<? extends GetContractDisplayDetailsResponseDto>> continuation) {
        return invoke2(contractIdWithSide, (Continuation<? super Response<GetContractDisplayDetailsResponseDto>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        InstrumentService instrumentService;
        GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ContractIdWithSide contractIdWithSide = (ContractIdWithSide) this.L$0;
            InstrumentService instrumentService2 = this.this$0.instrumentService;
            GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto2 = new GetContractDisplayDetailsRequestDto(Uuids.safeToString(contractIdWithSide.getContractId()), ContractSideExtensions.toYesNoDto(contractIdWithSide.getSide()));
            PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2 = this.this$0.requestHeaderPlugin;
            this.L$0 = instrumentService2;
            this.L$1 = getContractDisplayDetailsRequestDto2;
            this.label = 1;
            obj = predictionMarketsRequestHeaderDelegate2.buildRequestHeader(this);
            if (obj != coroutine_suspended) {
                instrumentService = instrumentService2;
                getContractDisplayDetailsRequestDto = getContractDisplayDetailsRequestDto2;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        getContractDisplayDetailsRequestDto = (GetContractDisplayDetailsRequestDto) this.L$1;
        instrumentService = (InstrumentService) this.L$0;
        ResultKt.throwOnFailure(obj);
        Request<GetContractDisplayDetailsRequestDto> request = new Request<>(getContractDisplayDetailsRequestDto, (Map) obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objGetContractDisplayDetails = instrumentService.GetContractDisplayDetails(request, this);
        return objGetContractDisplayDetails == coroutine_suspended ? coroutine_suspended : objGetContractDisplayDetails;
    }
}
