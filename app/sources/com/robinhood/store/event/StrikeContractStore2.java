package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.predictionmarkets.ContractSideExtensions;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService;
import com.robinhood.prediction_markets.proto.p361v1.idl.ListStrikesRequestDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ListStrikesResponseDto;
import com.robinhood.store.event.StrikeContractStore;
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

/* compiled from: StrikeContractStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesResponseDto;", "params", "Lcom/robinhood/store/event/StrikeContractStore$ListStrikesParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.StrikeContractStore$listStrikesEndpoint$1", m3645f = "StrikeContractStore.kt", m3646l = {52, 46}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.StrikeContractStore$listStrikesEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class StrikeContractStore2 extends ContinuationImpl7 implements Function2<StrikeContractStore.ListStrikesParams, Continuation<? super Response<? extends ListStrikesResponseDto>>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ StrikeContractStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StrikeContractStore2(StrikeContractStore strikeContractStore, Continuation<? super StrikeContractStore2> continuation) {
        super(2, continuation);
        this.this$0 = strikeContractStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StrikeContractStore2 strikeContractStore2 = new StrikeContractStore2(this.this$0, continuation);
        strikeContractStore2.L$0 = obj;
        return strikeContractStore2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(StrikeContractStore.ListStrikesParams listStrikesParams, Continuation<? super Response<ListStrikesResponseDto>> continuation) {
        return ((StrikeContractStore2) create(listStrikesParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(StrikeContractStore.ListStrikesParams listStrikesParams, Continuation<? super Response<? extends ListStrikesResponseDto>> continuation) {
        return invoke2(listStrikesParams, (Continuation<? super Response<ListStrikesResponseDto>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        LayoutService layoutService;
        ListStrikesRequestDto listStrikesRequestDto;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StrikeContractStore.ListStrikesParams listStrikesParams = (StrikeContractStore.ListStrikesParams) this.L$0;
            LayoutService layoutService2 = this.this$0.layoutService;
            ListStrikesRequestDto listStrikesRequestDto2 = new ListStrikesRequestDto(ContractSideExtensions.toYesNoDto(listStrikesParams.getContractSide()), Uuids.safeToString(listStrikesParams.getContractId()));
            PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2 = this.this$0.requestHeaderPlugin;
            this.L$0 = layoutService2;
            this.L$1 = listStrikesRequestDto2;
            this.label = 1;
            obj = predictionMarketsRequestHeaderDelegate2.buildRequestHeader(this);
            if (obj != coroutine_suspended) {
                layoutService = layoutService2;
                listStrikesRequestDto = listStrikesRequestDto2;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        listStrikesRequestDto = (ListStrikesRequestDto) this.L$1;
        layoutService = (LayoutService) this.L$0;
        ResultKt.throwOnFailure(obj);
        Request<ListStrikesRequestDto> request = new Request<>(listStrikesRequestDto, (Map) obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objListStrikes = layoutService.ListStrikes(request, this);
        return objListStrikes == coroutine_suspended ? coroutine_suspended : objListStrikes;
    }
}
