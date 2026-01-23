package md_server_proxy.service.p483v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestMdServerProxyService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lmd_server_proxy/service/v1/RestMdServerProxyService;", "Lmd_server_proxy/service/v1/MdServerProxyService;", "Lmd_server_proxy/service/v1/MdServerProxyServiceRetrofit;", "retrofit", "<init>", "(Lmd_server_proxy/service/v1/MdServerProxyServiceRetrofit;)V", "Lmd_server_proxy/service/v1/GetQuotesRequestDto;", "request", "Lmd_server_proxy/service/v1/GetQuotesResponseDto;", "GetQuotes", "(Lmd_server_proxy/service/v1/GetQuotesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmd_server_proxy/service/v1/GetFundamentalsRequestDto;", "Lmd_server_proxy/service/v1/GetFundamentalsResponseDto;", "GetFundamentals", "(Lmd_server_proxy/service/v1/GetFundamentalsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmd_server_proxy/service/v1/MdServerProxyServiceRetrofit;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class RestMdServerProxyService implements MdServerProxyService {
    private final MdServerProxyServiceRetrofit retrofit;

    /* compiled from: RestMdServerProxyService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "md_server_proxy.service.v1.RestMdServerProxyService", m3645f = "RestMdServerProxyService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "GetFundamentals")
    /* renamed from: md_server_proxy.service.v1.RestMdServerProxyService$GetFundamentals$1 */
    static final class C462201 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C462201(Continuation<? super C462201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMdServerProxyService.this.GetFundamentals((GetFundamentalsRequestDto) null, this);
        }
    }

    /* compiled from: RestMdServerProxyService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "md_server_proxy.service.v1.RestMdServerProxyService", m3645f = "RestMdServerProxyService.kt", m3646l = {75}, m3647m = "GetFundamentals")
    /* renamed from: md_server_proxy.service.v1.RestMdServerProxyService$GetFundamentals$2 */
    static final class C462212 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C462212(Continuation<? super C462212> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMdServerProxyService.this.GetFundamentals((Request<GetFundamentalsRequestDto>) null, this);
        }
    }

    /* compiled from: RestMdServerProxyService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "md_server_proxy.service.v1.RestMdServerProxyService", m3645f = "RestMdServerProxyService.kt", m3646l = {19}, m3647m = "GetQuotes")
    /* renamed from: md_server_proxy.service.v1.RestMdServerProxyService$GetQuotes$1 */
    static final class C462221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C462221(Continuation<? super C462221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMdServerProxyService.this.GetQuotes((GetQuotesRequestDto) null, this);
        }
    }

    /* compiled from: RestMdServerProxyService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "md_server_proxy.service.v1.RestMdServerProxyService", m3645f = "RestMdServerProxyService.kt", m3646l = {22}, m3647m = "GetQuotes")
    /* renamed from: md_server_proxy.service.v1.RestMdServerProxyService$GetQuotes$2 */
    static final class C462232 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C462232(Continuation<? super C462232> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMdServerProxyService.this.GetQuotes((Request<GetQuotesRequestDto>) null, this);
        }
    }

    public RestMdServerProxyService(MdServerProxyServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // md_server_proxy.service.p483v1.MdServerProxyService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetQuotes(GetQuotesRequestDto getQuotesRequestDto, Continuation<? super GetQuotesResponseDto> continuation) {
        C462221 c462221;
        if (continuation instanceof C462221) {
            c462221 = (C462221) continuation;
            int i = c462221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462221.label = i - Integer.MIN_VALUE;
            } else {
                c462221 = new C462221(continuation);
            }
        }
        Object objGetQuotes = c462221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetQuotes);
            Request<GetQuotesRequestDto> request = new Request<>(getQuotesRequestDto, null, 2, null);
            c462221.label = 1;
            objGetQuotes = GetQuotes(request, c462221);
            if (objGetQuotes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetQuotes);
        }
        return ((Response) objGetQuotes).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetQuotes(Request<GetQuotesRequestDto> request, Continuation<? super Response<GetQuotesResponseDto>> continuation) {
        C462232 c462232;
        if (continuation instanceof C462232) {
            c462232 = (C462232) continuation;
            int i = c462232.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462232.label = i - Integer.MIN_VALUE;
            } else {
                c462232 = new C462232(continuation);
            }
        }
        C462232 c4622322 = c462232;
        Object objGetQuotes = c4622322.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4622322.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetQuotes);
            MdServerProxyServiceRetrofit mdServerProxyServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            List<String> currency_pair_ids = request.getData().getCurrency_pair_ids();
            List<CurrencyCodeDto> display_currency_codes = request.getData().getDisplay_currency_codes();
            String routing_group = request.getData().getRouting_group();
            c4622322.label = 1;
            objGetQuotes = mdServerProxyServiceRetrofit.GetQuotes(metadata, currency_pair_ids, display_currency_codes, routing_group, c4622322);
            if (objGetQuotes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetQuotes);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetQuotes);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // md_server_proxy.service.p483v1.MdServerProxyService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFundamentals(GetFundamentalsRequestDto getFundamentalsRequestDto, Continuation<? super GetFundamentalsResponseDto> continuation) {
        C462201 c462201;
        if (continuation instanceof C462201) {
            c462201 = (C462201) continuation;
            int i = c462201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462201.label = i - Integer.MIN_VALUE;
            } else {
                c462201 = new C462201(continuation);
            }
        }
        Object objGetFundamentals = c462201.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462201.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFundamentals);
            Request<GetFundamentalsRequestDto> request = new Request<>(getFundamentalsRequestDto, null, 2, null);
            c462201.label = 1;
            objGetFundamentals = GetFundamentals(request, c462201);
            if (objGetFundamentals == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFundamentals);
        }
        return ((Response) objGetFundamentals).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFundamentals(Request<GetFundamentalsRequestDto> request, Continuation<? super Response<GetFundamentalsResponseDto>> continuation) {
        C462212 c462212;
        if (continuation instanceof C462212) {
            c462212 = (C462212) continuation;
            int i = c462212.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462212.label = i - Integer.MIN_VALUE;
            } else {
                c462212 = new C462212(continuation);
            }
        }
        Object objGetFundamentals = c462212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFundamentals);
            MdServerProxyServiceRetrofit mdServerProxyServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            List<String> currency_pair_ids = request.getData().getCurrency_pair_ids();
            c462212.label = 1;
            objGetFundamentals = mdServerProxyServiceRetrofit.GetFundamentals(metadata, currency_pair_ids, c462212);
            if (objGetFundamentals == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFundamentals);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetFundamentals);
    }
}
