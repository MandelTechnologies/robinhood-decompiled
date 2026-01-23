package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import bonfire.proto.idl.portfolio.p037v1.GetAccountPositionDetailsResponseDto;
import bonfire.proto.idl.portfolio.p037v1.PositionChartDto;
import com.robinhood.android.models.portfolio.InstrumentDetails2;
import com.robinhood.android.models.portfolio.PositionDetails2;
import com.robinhood.android.models.portfolio.PositionDetailsDao;
import com.robinhood.idl.Response;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PositionDetailsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/idl/Response;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$positionDetailsEndpoint$2", m3645f = "PositionDetailsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$positionDetailsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class PositionDetailsStore5 extends ContinuationImpl7 implements Function2<Response<? extends GetAccountPositionDetailsResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PositionDetailsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionDetailsStore5(PositionDetailsStore positionDetailsStore, Continuation<? super PositionDetailsStore5> continuation) {
        super(2, continuation);
        this.this$0 = positionDetailsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionDetailsStore5 positionDetailsStore5 = new PositionDetailsStore5(this.this$0, continuation);
        positionDetailsStore5.L$0 = obj;
        return positionDetailsStore5;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Response<GetAccountPositionDetailsResponseDto> response, Continuation<? super Unit> continuation) {
        return ((PositionDetailsStore5) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Response<? extends GetAccountPositionDetailsResponseDto> response, Continuation<? super Unit> continuation) {
        return invoke2((Response<GetAccountPositionDetailsResponseDto>) response, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Response response = (Response) this.L$0;
        PositionChartDto chart = ((GetAccountPositionDetailsResponseDto) response.getData()).getChart();
        if (chart != null) {
            PositionDetailsStore positionDetailsStore = this.this$0;
            positionDetailsStore.chartCache.put(((GetAccountPositionDetailsResponseDto) response.getData()).getInstrument_id(), InstrumentDetails2.toDbModel(chart, positionDetailsStore.moshi.get()));
        }
        this.this$0.detailsDao.insert((PositionDetailsDao) PositionDetails2.toDbModel((GetAccountPositionDetailsResponseDto) response.getData(), this.this$0.moshi.get(), this.this$0.clock));
        return Unit.INSTANCE;
    }
}
