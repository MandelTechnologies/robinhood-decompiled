package bff_vitals.service.p021v1;

import bff_vitals.service.p021v1.FetchVitalsRequestDto;
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

/* compiled from: RestBffVitalsService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lbff_vitals/service/v1/RestBffVitalsService;", "Lbff_vitals/service/v1/BffVitalsService;", "retrofit", "Lbff_vitals/service/v1/BffVitalsServiceRetrofit;", "<init>", "(Lbff_vitals/service/v1/BffVitalsServiceRetrofit;)V", "FetchVitals", "Lbff_vitals/service/v1/FetchVitalsResponseDto;", "request", "Lbff_vitals/service/v1/FetchVitalsRequestDto;", "(Lbff_vitals/service/v1/FetchVitalsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class RestBffVitalsService implements BffVitalsService {
    private final BffVitalsServiceRetrofit retrofit;

    /* compiled from: RestBffVitalsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_vitals.service.v1.RestBffVitalsService", m3645f = "RestBffVitalsService.kt", m3646l = {17}, m3647m = "FetchVitals")
    /* renamed from: bff_vitals.service.v1.RestBffVitalsService$FetchVitals$1 */
    static final class C35541 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C35541(Continuation<? super C35541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffVitalsService.this.FetchVitals((FetchVitalsRequestDto) null, this);
        }
    }

    /* compiled from: RestBffVitalsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_vitals.service.v1.RestBffVitalsService", m3645f = "RestBffVitalsService.kt", m3646l = {20}, m3647m = "FetchVitals")
    /* renamed from: bff_vitals.service.v1.RestBffVitalsService$FetchVitals$2 */
    static final class C35552 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C35552(Continuation<? super C35552> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffVitalsService.this.FetchVitals((Request<FetchVitalsRequestDto>) null, this);
        }
    }

    public RestBffVitalsService(BffVitalsServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_vitals.service.p021v1.BffVitalsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FetchVitals(FetchVitalsRequestDto fetchVitalsRequestDto, Continuation<? super FetchVitalsResponseDto> continuation) {
        C35541 c35541;
        if (continuation instanceof C35541) {
            c35541 = (C35541) continuation;
            int i = c35541.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c35541.label = i - Integer.MIN_VALUE;
            } else {
                c35541 = new C35541(continuation);
            }
        }
        Object objFetchVitals = c35541.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c35541.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchVitals);
            Request<FetchVitalsRequestDto> request = new Request<>(fetchVitalsRequestDto, null, 2, null);
            c35541.label = 1;
            objFetchVitals = FetchVitals(request, c35541);
            if (objFetchVitals == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetchVitals);
        }
        return ((Response) objFetchVitals).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FetchVitals(Request<FetchVitalsRequestDto> request, Continuation<? super Response<FetchVitalsResponseDto>> continuation) {
        C35552 c35552;
        if (continuation instanceof C35552) {
            c35552 = (C35552) continuation;
            int i = c35552.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c35552.label = i - Integer.MIN_VALUE;
            } else {
                c35552 = new C35552(continuation);
            }
        }
        C35552 c355522 = c35552;
        Object objFetchVitals = c355522.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c355522.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchVitals);
            BffVitalsServiceRetrofit bffVitalsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            FetchVitalsRequestDto.PlatformDto platform = request.getData().getPlatform() != FetchVitalsRequestDto.PlatformDto.INSTANCE.getZeroValue() ? request.getData().getPlatform() : null;
            FetchVitalsRequestDto.AppDto app = request.getData().getApp() != FetchVitalsRequestDto.AppDto.INSTANCE.getZeroValue() ? request.getData().getApp() : null;
            String os_version = !Intrinsics.areEqual(request.getData().getOs_version(), "") ? request.getData().getOs_version() : null;
            String app_version = Intrinsics.areEqual(request.getData().getApp_version(), "") ? null : request.getData().getApp_version();
            c355522.label = 1;
            objFetchVitals = bffVitalsServiceRetrofit.FetchVitals(metadata, platform, app, os_version, app_version, c355522);
            if (objFetchVitals == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetchVitals);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objFetchVitals);
    }
}
