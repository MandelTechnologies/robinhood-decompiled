package hippo.service.p470v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import hippo.model.p469v1.UXFlagNameDto;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestUXFlagsService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lhippo/service/v1/RestUXFlagsService;", "Lhippo/service/v1/UXFlagsService;", "Lhippo/service/v1/UXFlagsServiceRetrofit;", "retrofit", "<init>", "(Lhippo/service/v1/UXFlagsServiceRetrofit;)V", "Lhippo/service/v1/GetUXFlagsRequestDto;", "request", "Lhippo/service/v1/GetUXFlagsResponseDto;", "GetUXFlags", "(Lhippo/service/v1/GetUXFlagsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhippo/service/v1/UXFlagsServiceRetrofit;", "hippo.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class RestUXFlagsService implements UXFlagsService {
    private final UXFlagsServiceRetrofit retrofit;

    /* compiled from: RestUXFlagsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "hippo.service.v1.RestUXFlagsService", m3645f = "RestUXFlagsService.kt", m3646l = {17}, m3647m = "GetUXFlags")
    /* renamed from: hippo.service.v1.RestUXFlagsService$GetUXFlags$1 */
    static final class C451731 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C451731(Continuation<? super C451731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestUXFlagsService.this.GetUXFlags((GetUXFlagsRequestDto) null, this);
        }
    }

    /* compiled from: RestUXFlagsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "hippo.service.v1.RestUXFlagsService", m3645f = "RestUXFlagsService.kt", m3646l = {20}, m3647m = "GetUXFlags")
    /* renamed from: hippo.service.v1.RestUXFlagsService$GetUXFlags$2 */
    static final class C451742 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C451742(Continuation<? super C451742> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestUXFlagsService.this.GetUXFlags((Request<GetUXFlagsRequestDto>) null, this);
        }
    }

    public RestUXFlagsService(UXFlagsServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // hippo.service.p470v1.UXFlagsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetUXFlags(GetUXFlagsRequestDto getUXFlagsRequestDto, Continuation<? super GetUXFlagsResponseDto> continuation) {
        C451731 c451731;
        if (continuation instanceof C451731) {
            c451731 = (C451731) continuation;
            int i = c451731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c451731.label = i - Integer.MIN_VALUE;
            } else {
                c451731 = new C451731(continuation);
            }
        }
        Object objGetUXFlags = c451731.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c451731.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetUXFlags);
            Request<GetUXFlagsRequestDto> request = new Request<>(getUXFlagsRequestDto, null, 2, null);
            c451731.label = 1;
            objGetUXFlags = GetUXFlags(request, c451731);
            if (objGetUXFlags == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetUXFlags);
        }
        return ((Response) objGetUXFlags).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetUXFlags(Request<GetUXFlagsRequestDto> request, Continuation<? super Response<GetUXFlagsResponseDto>> continuation) {
        C451742 c451742;
        if (continuation instanceof C451742) {
            c451742 = (C451742) continuation;
            int i = c451742.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c451742.label = i - Integer.MIN_VALUE;
            } else {
                c451742 = new C451742(continuation);
            }
        }
        Object objGetUXFlags = c451742.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c451742.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetUXFlags);
            UXFlagsServiceRetrofit uXFlagsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            List<UXFlagNameDto> flags = request.getData().getFlags();
            c451742.label = 1;
            objGetUXFlags = uXFlagsServiceRetrofit.GetUXFlags(metadata, flags, c451742);
            if (objGetUXFlags == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetUXFlags);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetUXFlags);
    }
}
