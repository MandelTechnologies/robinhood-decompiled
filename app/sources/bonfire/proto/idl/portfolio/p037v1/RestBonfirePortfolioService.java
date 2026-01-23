package bonfire.proto.idl.portfolio.p037v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.rosetta.common.CurrencyDto;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestBonfirePortfolioService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/RestBonfirePortfolioService;", "Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioService;", "Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioServiceRetrofit;", "retrofit", "<init>", "(Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioServiceRetrofit;)V", "Lcom/robinhood/idl/Request;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto;", "request", "Lcom/robinhood/idl/Response;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto;", "GetAccountPositionDetails", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2RequestDto;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto;", "GetAccountPositionsV2", "(Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2RequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioServiceRetrofit;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestBonfirePortfolioService implements BonfirePortfolioService {
    private final BonfirePortfolioServiceRetrofit retrofit;

    /* compiled from: RestBonfirePortfolioService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.portfolio.v1.RestBonfirePortfolioService", m3645f = "RestBonfirePortfolioService.kt", m3646l = {26}, m3647m = "GetAccountPositionDetails")
    /* renamed from: bonfire.proto.idl.portfolio.v1.RestBonfirePortfolioService$GetAccountPositionDetails$2 */
    static final class C44522 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C44522(Continuation<? super C44522> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBonfirePortfolioService.this.GetAccountPositionDetails(null, this);
        }
    }

    /* compiled from: RestBonfirePortfolioService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.portfolio.v1.RestBonfirePortfolioService", m3645f = "RestBonfirePortfolioService.kt", m3646l = {42}, m3647m = "GetAccountPositionsV2")
    /* renamed from: bonfire.proto.idl.portfolio.v1.RestBonfirePortfolioService$GetAccountPositionsV2$1 */
    static final class C44531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C44531(Continuation<? super C44531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBonfirePortfolioService.this.GetAccountPositionsV2((GetAccountPositionsV2RequestDto) null, this);
        }
    }

    /* compiled from: RestBonfirePortfolioService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.portfolio.v1.RestBonfirePortfolioService", m3645f = "RestBonfirePortfolioService.kt", m3646l = {48}, m3647m = "GetAccountPositionsV2")
    /* renamed from: bonfire.proto.idl.portfolio.v1.RestBonfirePortfolioService$GetAccountPositionsV2$2 */
    static final class C44542 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C44542(Continuation<? super C44542> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBonfirePortfolioService.this.GetAccountPositionsV2((Request<GetAccountPositionsV2RequestDto>) null, this);
        }
    }

    public RestBonfirePortfolioService(BonfirePortfolioServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // bonfire.proto.idl.portfolio.p037v1.BonfirePortfolioService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccountPositionDetails(Request<GetAccountPositionDetailsRequestDto> request, Continuation<? super Response<GetAccountPositionDetailsResponseDto>> continuation) {
        C44522 c44522;
        if (continuation instanceof C44522) {
            c44522 = (C44522) continuation;
            int i = c44522.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c44522.label = i - Integer.MIN_VALUE;
            } else {
                c44522 = new C44522(continuation);
            }
        }
        C44522 c445222 = c44522;
        Object objGetAccountPositionDetails = c445222.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c445222.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccountPositionDetails);
            BonfirePortfolioServiceRetrofit bonfirePortfolioServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = request.getData().getAccount_number();
            String instrument_id = request.getData().getInstrument_id();
            String display_type = !Intrinsics.areEqual(request.getData().getDisplay_type(), "") ? request.getData().getDisplay_type() : null;
            String position_instrument_type = request.getData().getPosition_instrument_type();
            String instrument_type = request.getData().getInstrument_type();
            PositionDetailChartTypeDto chart_type = request.getData().getChart_type();
            CurrencyDto display_currency = request.getData().getDisplay_currency();
            c445222.label = 1;
            objGetAccountPositionDetails = bonfirePortfolioServiceRetrofit.GetAccountPositionDetails(metadata, account_number, instrument_id, display_type, position_instrument_type, instrument_type, chart_type, display_currency, c445222);
            if (objGetAccountPositionDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccountPositionDetails);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAccountPositionDetails);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.portfolio.p037v1.BonfirePortfolioService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccountPositionsV2(GetAccountPositionsV2RequestDto getAccountPositionsV2RequestDto, Continuation<? super GetAccountPositionsV2ResponseDto> continuation) {
        C44531 c44531;
        if (continuation instanceof C44531) {
            c44531 = (C44531) continuation;
            int i = c44531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c44531.label = i - Integer.MIN_VALUE;
            } else {
                c44531 = new C44531(continuation);
            }
        }
        Object objGetAccountPositionsV2 = c44531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c44531.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccountPositionsV2);
            Request<GetAccountPositionsV2RequestDto> request = new Request<>(getAccountPositionsV2RequestDto, null, 2, null);
            c44531.label = 1;
            objGetAccountPositionsV2 = GetAccountPositionsV2(request, c44531);
            if (objGetAccountPositionsV2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccountPositionsV2);
        }
        return ((Response) objGetAccountPositionsV2).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccountPositionsV2(Request<GetAccountPositionsV2RequestDto> request, Continuation<? super Response<GetAccountPositionsV2ResponseDto>> continuation) {
        C44542 c44542;
        if (continuation instanceof C44542) {
            c44542 = (C44542) continuation;
            int i = c44542.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c44542.label = i - Integer.MIN_VALUE;
            } else {
                c44542 = new C44542(continuation);
            }
        }
        C44542 c445422 = c44542;
        Object objGetAccountPositionsV2 = c445422.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c445422.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccountPositionsV2);
            BonfirePortfolioServiceRetrofit bonfirePortfolioServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = request.getData().getAccount_number();
            String instrument_type = request.getData().getInstrument_type();
            PositionsLocationDto positions_location = request.getData().getPositions_location();
            PositionsSortDirectionDto sort_direction = request.getData().getSort_direction();
            String sort_type = request.getData().getSort_type();
            c445422.label = 1;
            objGetAccountPositionsV2 = bonfirePortfolioServiceRetrofit.GetAccountPositionsV2(metadata, account_number, instrument_type, positions_location, sort_direction, sort_type, c445422);
            if (objGetAccountPositionsV2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccountPositionsV2);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAccountPositionsV2);
    }
}
