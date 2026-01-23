package options_product.service;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestSimulatedReturns.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Loptions_product/service/RestSimulatedReturns;", "Loptions_product/service/SimulatedReturns;", "Loptions_product/service/SimulatedReturnsRetrofit;", "retrofit", "<init>", "(Loptions_product/service/SimulatedReturnsRetrofit;)V", "Loptions_product/service/GetSimulatedReturnsParamsV4RequestDto;", "request", "Loptions_product/service/SimulatedReturnsParamsResponseDto;", "GetSimulatedReturnsParamsV4", "(Loptions_product/service/GetSimulatedReturnsParamsV4RequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/SimulatedReturnsRetrofit;", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class RestSimulatedReturns implements SimulatedReturns {
    private final SimulatedReturnsRetrofit retrofit;

    /* compiled from: RestSimulatedReturns.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestSimulatedReturns", m3645f = "RestSimulatedReturns.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "GetSimulatedReturnsParamsV4")
    /* renamed from: options_product.service.RestSimulatedReturns$GetSimulatedReturnsParamsV4$1 */
    static final class C475941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475941(Continuation<? super C475941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestSimulatedReturns.this.GetSimulatedReturnsParamsV4((GetSimulatedReturnsParamsV4RequestDto) null, this);
        }
    }

    /* compiled from: RestSimulatedReturns.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestSimulatedReturns", m3645f = "RestSimulatedReturns.kt", m3646l = {74}, m3647m = "GetSimulatedReturnsParamsV4")
    /* renamed from: options_product.service.RestSimulatedReturns$GetSimulatedReturnsParamsV4$2 */
    static final class C475952 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475952(Continuation<? super C475952> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestSimulatedReturns.this.GetSimulatedReturnsParamsV4((Request<GetSimulatedReturnsParamsV4RequestDto>) null, this);
        }
    }

    public RestSimulatedReturns(SimulatedReturnsRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // options_product.service.SimulatedReturns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSimulatedReturnsParamsV4(GetSimulatedReturnsParamsV4RequestDto getSimulatedReturnsParamsV4RequestDto, Continuation<? super SimulatedReturnsParamsResponseDto> continuation) {
        C475941 c475941;
        if (continuation instanceof C475941) {
            c475941 = (C475941) continuation;
            int i = c475941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475941.label = i - Integer.MIN_VALUE;
            } else {
                c475941 = new C475941(continuation);
            }
        }
        Object objGetSimulatedReturnsParamsV4 = c475941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475941.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSimulatedReturnsParamsV4);
            Request<GetSimulatedReturnsParamsV4RequestDto> request = new Request<>(getSimulatedReturnsParamsV4RequestDto, null, 2, null);
            c475941.label = 1;
            objGetSimulatedReturnsParamsV4 = GetSimulatedReturnsParamsV4(request, c475941);
            if (objGetSimulatedReturnsParamsV4 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetSimulatedReturnsParamsV4);
        }
        return ((Response) objGetSimulatedReturnsParamsV4).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSimulatedReturnsParamsV4(Request<GetSimulatedReturnsParamsV4RequestDto> request, Continuation<? super Response<SimulatedReturnsParamsResponseDto>> continuation) {
        C475952 c475952;
        if (continuation instanceof C475952) {
            c475952 = (C475952) continuation;
            int i = c475952.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475952.label = i - Integer.MIN_VALUE;
            } else {
                c475952 = new C475952(continuation);
            }
        }
        Object objGetSimulatedReturnsParamsV4 = c475952.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475952.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSimulatedReturnsParamsV4);
            SimulatedReturnsRetrofit simulatedReturnsRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            GetSimulatedReturnsParamsV4RequestDto data = request.getData();
            c475952.label = 1;
            objGetSimulatedReturnsParamsV4 = simulatedReturnsRetrofit.GetSimulatedReturnsParamsV4(metadata, data, c475952);
            if (objGetSimulatedReturnsParamsV4 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetSimulatedReturnsParamsV4);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetSimulatedReturnsParamsV4);
    }
}
