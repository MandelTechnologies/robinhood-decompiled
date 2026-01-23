package rosetta.portfolio.p541v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.rosetta.common.CurrencyDto;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestPortfolio.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lrosetta/portfolio/v1/RestPortfolio;", "Lrosetta/portfolio/v1/Portfolio;", "Lrosetta/portfolio/v1/PortfolioRetrofit;", "retrofit", "<init>", "(Lrosetta/portfolio/v1/PortfolioRetrofit;)V", "Lrosetta/portfolio/v1/GetAccountValueRequestDto;", "request", "Lrosetta/portfolio/v1/GetAccountValueResponseDto;", "GetAccountValue", "(Lrosetta/portfolio/v1/GetAccountValueRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto;", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryResponseDto;", "GetRealizedPerformanceSummary", "(Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrosetta/portfolio/v1/PortfolioRetrofit;", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class RestPortfolio implements Portfolio {
    private final PortfolioRetrofit retrofit;

    /* compiled from: RestPortfolio.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "rosetta.portfolio.v1.RestPortfolio", m3645f = "RestPortfolio.kt", m3646l = {48}, m3647m = "GetAccountValue")
    /* renamed from: rosetta.portfolio.v1.RestPortfolio$GetAccountValue$1 */
    static final class C488811 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C488811(Continuation<? super C488811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPortfolio.this.GetAccountValue((GetAccountValueRequestDto) null, this);
        }
    }

    /* compiled from: RestPortfolio.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "rosetta.portfolio.v1.RestPortfolio", m3645f = "RestPortfolio.kt", m3646l = {58}, m3647m = "GetAccountValue")
    /* renamed from: rosetta.portfolio.v1.RestPortfolio$GetAccountValue$2 */
    static final class C488822 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C488822(Continuation<? super C488822> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPortfolio.this.GetAccountValue((Request<GetAccountValueRequestDto>) null, this);
        }
    }

    /* compiled from: RestPortfolio.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "rosetta.portfolio.v1.RestPortfolio", m3645f = "RestPortfolio.kt", m3646l = {95}, m3647m = "GetRealizedPerformanceSummary")
    /* renamed from: rosetta.portfolio.v1.RestPortfolio$GetRealizedPerformanceSummary$1 */
    static final class C488831 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C488831(Continuation<? super C488831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPortfolio.this.GetRealizedPerformanceSummary((GetRealizedPerformanceSummaryRequestDto) null, this);
        }
    }

    /* compiled from: RestPortfolio.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "rosetta.portfolio.v1.RestPortfolio", m3645f = "RestPortfolio.kt", m3646l = {104}, m3647m = "GetRealizedPerformanceSummary")
    /* renamed from: rosetta.portfolio.v1.RestPortfolio$GetRealizedPerformanceSummary$2 */
    static final class C488842 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C488842(Continuation<? super C488842> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPortfolio.this.GetRealizedPerformanceSummary((Request<GetRealizedPerformanceSummaryRequestDto>) null, this);
        }
    }

    public RestPortfolio(PortfolioRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // rosetta.portfolio.p541v1.Portfolio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccountValue(GetAccountValueRequestDto getAccountValueRequestDto, Continuation<? super GetAccountValueResponseDto> continuation) {
        C488811 c488811;
        if (continuation instanceof C488811) {
            c488811 = (C488811) continuation;
            int i = c488811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c488811.label = i - Integer.MIN_VALUE;
            } else {
                c488811 = new C488811(continuation);
            }
        }
        Object objGetAccountValue = c488811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c488811.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccountValue);
            Request<GetAccountValueRequestDto> request = new Request<>(getAccountValueRequestDto, null, 2, null);
            c488811.label = 1;
            objGetAccountValue = GetAccountValue(request, c488811);
            if (objGetAccountValue == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccountValue);
        }
        return ((Response) objGetAccountValue).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccountValue(Request<GetAccountValueRequestDto> request, Continuation<? super Response<GetAccountValueResponseDto>> continuation) {
        C488822 c488822;
        if (continuation instanceof C488822) {
            c488822 = (C488822) continuation;
            int i = c488822.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c488822.label = i - Integer.MIN_VALUE;
            } else {
                c488822 = new C488822(continuation);
            }
        }
        C488822 c4888222 = c488822;
        Object objGetAccountValue = c4888222.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4888222.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccountValue);
            PortfolioRetrofit portfolioRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account = request.getData().getAccount();
            String bounds = request.getData().getBounds();
            CurrencyDto display_currency = request.getData().getDisplay_currency() != CurrencyDto.INSTANCE.getZeroValue() ? request.getData().getDisplay_currency() : null;
            c4888222.label = 1;
            objGetAccountValue = portfolioRetrofit.GetAccountValue(metadata, account, bounds, display_currency, c4888222);
            if (objGetAccountValue == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccountValue);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAccountValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // rosetta.portfolio.p541v1.Portfolio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetRealizedPerformanceSummary(GetRealizedPerformanceSummaryRequestDto getRealizedPerformanceSummaryRequestDto, Continuation<? super GetRealizedPerformanceSummaryResponseDto> continuation) {
        C488831 c488831;
        if (continuation instanceof C488831) {
            c488831 = (C488831) continuation;
            int i = c488831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c488831.label = i - Integer.MIN_VALUE;
            } else {
                c488831 = new C488831(continuation);
            }
        }
        Object objGetRealizedPerformanceSummary = c488831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c488831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetRealizedPerformanceSummary);
            Request<GetRealizedPerformanceSummaryRequestDto> request = new Request<>(getRealizedPerformanceSummaryRequestDto, null, 2, null);
            c488831.label = 1;
            objGetRealizedPerformanceSummary = GetRealizedPerformanceSummary(request, c488831);
            if (objGetRealizedPerformanceSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetRealizedPerformanceSummary);
        }
        return ((Response) objGetRealizedPerformanceSummary).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetRealizedPerformanceSummary(Request<GetRealizedPerformanceSummaryRequestDto> request, Continuation<? super Response<GetRealizedPerformanceSummaryResponseDto>> continuation) {
        C488842 c488842;
        if (continuation instanceof C488842) {
            c488842 = (C488842) continuation;
            int i = c488842.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c488842.label = i - Integer.MIN_VALUE;
            } else {
                c488842 = new C488842(continuation);
            }
        }
        C488842 c4888422 = c488842;
        Object objGetRealizedPerformanceSummary = c4888422.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4888422.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetRealizedPerformanceSummary);
            PortfolioRetrofit portfolioRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String rhs_account_number = !Intrinsics.areEqual(request.getData().getRhs_account_number(), "") ? request.getData().getRhs_account_number() : null;
            List<SpanDto> spans = request.getData().getSpans();
            List<AssetClassDto> asset_classes = request.getData().getAsset_classes();
            CurrencyDto display_currency = request.getData().getDisplay_currency() != CurrencyDto.INSTANCE.getZeroValue() ? request.getData().getDisplay_currency() : null;
            c4888422.label = 1;
            objGetRealizedPerformanceSummary = portfolioRetrofit.GetRealizedPerformanceSummary(metadata, rhs_account_number, spans, asset_classes, display_currency, c4888422);
            if (objGetRealizedPerformanceSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetRealizedPerformanceSummary);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetRealizedPerformanceSummary);
    }
}
