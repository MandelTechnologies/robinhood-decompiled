package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import bonfire.proto.idl.portfolio.p037v1.BonfirePortfolioService;
import bonfire.proto.idl.portfolio.p037v1.GetAccountPositionDetailsRequestDto;
import bonfire.proto.idl.portfolio.p037v1.GetAccountPositionDetailsResponseDto;
import bonfire.proto.idl.portfolio.p037v1.PositionDetailChartTypeDto;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore;
import com.robinhood.rosetta.common.CurrencyDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionDetailsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto;", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore$DetailsRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$positionDetailsEndpoint$1", m3645f = "PositionDetailsStore.kt", m3646l = {80}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$positionDetailsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class PositionDetailsStore4 extends ContinuationImpl7 implements Function2<PositionDetailsStore.DetailsRequest, Continuation<? super Response<? extends GetAccountPositionDetailsResponseDto>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PositionDetailsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionDetailsStore4(PositionDetailsStore positionDetailsStore, Continuation<? super PositionDetailsStore4> continuation) {
        super(2, continuation);
        this.this$0 = positionDetailsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionDetailsStore4 positionDetailsStore4 = new PositionDetailsStore4(this.this$0, continuation);
        positionDetailsStore4.L$0 = obj;
        return positionDetailsStore4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PositionDetailsStore.DetailsRequest detailsRequest, Continuation<? super Response<GetAccountPositionDetailsResponseDto>> continuation) {
        return ((PositionDetailsStore4) create(detailsRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PositionDetailsStore.DetailsRequest detailsRequest, Continuation<? super Response<? extends GetAccountPositionDetailsResponseDto>> continuation) {
        return invoke2(detailsRequest, (Continuation<? super Response<GetAccountPositionDetailsResponseDto>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        PositionDetailsStore.DetailsRequest detailsRequest = (PositionDetailsStore.DetailsRequest) this.L$0;
        BonfirePortfolioService bonfirePortfolioService = this.this$0.bonfirePortfolioService;
        String accountNumber = detailsRequest.getAccountNumber();
        String string2 = detailsRequest.getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Request<GetAccountPositionDetailsRequestDto> request = new Request<>(new GetAccountPositionDetailsRequestDto(accountNumber, string2, detailsRequest.getDisplayType(), null, detailsRequest.getInstrumentType().getServerValue(), PositionDetailChartTypeDto.none, CurrencyDto.valueOf(detailsRequest.getDisplayCurrency().getServerValue()), 8, null), null, 2, null);
        this.label = 1;
        Object objGetAccountPositionDetails = bonfirePortfolioService.GetAccountPositionDetails(request, this);
        return objGetAccountPositionDetails == coroutine_suspended ? coroutine_suspended : objGetAccountPositionDetails;
    }
}
