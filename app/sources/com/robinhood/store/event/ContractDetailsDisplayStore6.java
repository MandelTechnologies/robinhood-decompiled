package com.robinhood.store.event;

import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails2;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContractDetailsDisplayStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.ContractDetailsDisplayStore$getMultipleContractDisplayDetailsEndpoint$1$1$1$1", m3645f = "ContractDetailsDisplayStore.kt", m3646l = {85, 79}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.ContractDetailsDisplayStore$getMultipleContractDisplayDetailsEndpoint$1$1$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ContractDetailsDisplayStore6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ContractDisplayDetails>, Object> {
    final /* synthetic */ ContractIdWithSide $params;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ContractDetailsDisplayStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContractDetailsDisplayStore6(ContractDetailsDisplayStore contractDetailsDisplayStore, ContractIdWithSide contractIdWithSide, Continuation<? super ContractDetailsDisplayStore6> continuation) {
        super(2, continuation);
        this.this$0 = contractDetailsDisplayStore;
        this.$params = contractIdWithSide;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContractDetailsDisplayStore6(this.this$0, this.$params, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ContractDisplayDetails> continuation) {
        return ((ContractDetailsDisplayStore6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (r8 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto;
        InstrumentService instrumentService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InstrumentService instrumentService2 = this.this$0.instrumentService;
            getContractDisplayDetailsRequestDto = new GetContractDisplayDetailsRequestDto(Uuids.safeToString(this.$params.getContractId()), ContractSideExtensions.toYesNoDto(this.$params.getSide()));
            PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2 = this.this$0.requestHeaderPlugin;
            this.L$0 = instrumentService2;
            this.L$1 = getContractDisplayDetailsRequestDto;
            this.label = 1;
            Object objBuildRequestHeader = predictionMarketsRequestHeaderDelegate2.buildRequestHeader(this);
            if (objBuildRequestHeader != coroutine_suspended) {
                instrumentService = instrumentService2;
                obj = objBuildRequestHeader;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ContractDisplayDetails2.toDbModel((GetContractDisplayDetailsResponseDto) ((Response) obj).getData());
        }
        getContractDisplayDetailsRequestDto = (GetContractDisplayDetailsRequestDto) this.L$1;
        instrumentService = (InstrumentService) this.L$0;
        ResultKt.throwOnFailure(obj);
        Request<GetContractDisplayDetailsRequestDto> request = new Request<>(getContractDisplayDetailsRequestDto, (Map) obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = instrumentService.GetContractDisplayDetails(request, this);
    }
}
