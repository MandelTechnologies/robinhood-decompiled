package bff_retirement.service.p020v1;

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

/* compiled from: RestBffRetirementService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lbff_retirement/service/v1/RestBffRetirementService;", "Lbff_retirement/service/v1/BffRetirementService;", "Lbff_retirement/service/v1/BffRetirementServiceRetrofit;", "retrofit", "<init>", "(Lbff_retirement/service/v1/BffRetirementServiceRetrofit;)V", "Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsRequestDto;", "request", "Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto;", "CapitalizeWebViewAllowedUrls", "(Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_retirement/service/v1/BffRetirementServiceRetrofit;", "bff_retirement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestBffRetirementService implements BffRetirementService {
    private final BffRetirementServiceRetrofit retrofit;

    /* compiled from: RestBffRetirementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_retirement.service.v1.RestBffRetirementService", m3645f = "RestBffRetirementService.kt", m3646l = {20}, m3647m = "CapitalizeWebViewAllowedUrls")
    /* renamed from: bff_retirement.service.v1.RestBffRetirementService$CapitalizeWebViewAllowedUrls$1 */
    static final class C35191 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C35191(Continuation<? super C35191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffRetirementService.this.CapitalizeWebViewAllowedUrls((CapitalizeWebViewAllowedUrlsRequestDto) null, this);
        }
    }

    /* compiled from: RestBffRetirementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_retirement.service.v1.RestBffRetirementService", m3645f = "RestBffRetirementService.kt", m3646l = {26}, m3647m = "CapitalizeWebViewAllowedUrls")
    /* renamed from: bff_retirement.service.v1.RestBffRetirementService$CapitalizeWebViewAllowedUrls$2 */
    static final class C35202 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C35202(Continuation<? super C35202> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffRetirementService.this.CapitalizeWebViewAllowedUrls((Request<CapitalizeWebViewAllowedUrlsRequestDto>) null, this);
        }
    }

    public RestBffRetirementService(BffRetirementServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_retirement.service.p020v1.BffRetirementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CapitalizeWebViewAllowedUrls(CapitalizeWebViewAllowedUrlsRequestDto capitalizeWebViewAllowedUrlsRequestDto, Continuation<? super CapitalizeWebViewAllowedUrlsResponseDto> continuation) {
        C35191 c35191;
        if (continuation instanceof C35191) {
            c35191 = (C35191) continuation;
            int i = c35191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c35191.label = i - Integer.MIN_VALUE;
            } else {
                c35191 = new C35191(continuation);
            }
        }
        Object objCapitalizeWebViewAllowedUrls = c35191.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c35191.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCapitalizeWebViewAllowedUrls);
            Request<CapitalizeWebViewAllowedUrlsRequestDto> request = new Request<>(capitalizeWebViewAllowedUrlsRequestDto, null, 2, null);
            c35191.label = 1;
            objCapitalizeWebViewAllowedUrls = CapitalizeWebViewAllowedUrls(request, c35191);
            if (objCapitalizeWebViewAllowedUrls == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCapitalizeWebViewAllowedUrls);
        }
        return ((Response) objCapitalizeWebViewAllowedUrls).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CapitalizeWebViewAllowedUrls(Request<CapitalizeWebViewAllowedUrlsRequestDto> request, Continuation<? super Response<CapitalizeWebViewAllowedUrlsResponseDto>> continuation) {
        C35202 c35202;
        if (continuation instanceof C35202) {
            c35202 = (C35202) continuation;
            int i = c35202.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c35202.label = i - Integer.MIN_VALUE;
            } else {
                c35202 = new C35202(continuation);
            }
        }
        Object objCapitalizeWebViewAllowedUrls = c35202.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c35202.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCapitalizeWebViewAllowedUrls);
            BffRetirementServiceRetrofit bffRetirementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c35202.label = 1;
            objCapitalizeWebViewAllowedUrls = bffRetirementServiceRetrofit.CapitalizeWebViewAllowedUrls(metadata, c35202);
            if (objCapitalizeWebViewAllowedUrls == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCapitalizeWebViewAllowedUrls);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCapitalizeWebViewAllowedUrls);
    }
}
