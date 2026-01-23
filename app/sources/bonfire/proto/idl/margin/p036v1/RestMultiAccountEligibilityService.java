package bonfire.proto.idl.margin.p036v1;

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

/* compiled from: RestMultiAccountEligibilityService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/RestMultiAccountEligibilityService;", "Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityService;", "retrofit", "Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityServiceRetrofit;", "<init>", "(Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityServiceRetrofit;)V", "GetMultiAccountEligibility", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "request", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityRequestDto;", "(Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestMultiAccountEligibilityService implements MultiAccountEligibilityService {
    private final MultiAccountEligibilityServiceRetrofit retrofit;

    /* compiled from: RestMultiAccountEligibilityService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.margin.v1.RestMultiAccountEligibilityService", m3645f = "RestMultiAccountEligibilityService.kt", m3646l = {17}, m3647m = "GetMultiAccountEligibility")
    /* renamed from: bonfire.proto.idl.margin.v1.RestMultiAccountEligibilityService$GetMultiAccountEligibility$1 */
    static final class C44241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C44241(Continuation<? super C44241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMultiAccountEligibilityService.this.GetMultiAccountEligibility((GetMultiAccountEligibilityRequestDto) null, this);
        }
    }

    /* compiled from: RestMultiAccountEligibilityService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.margin.v1.RestMultiAccountEligibilityService", m3645f = "RestMultiAccountEligibilityService.kt", m3646l = {20}, m3647m = "GetMultiAccountEligibility")
    /* renamed from: bonfire.proto.idl.margin.v1.RestMultiAccountEligibilityService$GetMultiAccountEligibility$2 */
    static final class C44252 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C44252(Continuation<? super C44252> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMultiAccountEligibilityService.this.GetMultiAccountEligibility((Request<GetMultiAccountEligibilityRequestDto>) null, this);
        }
    }

    public RestMultiAccountEligibilityService(MultiAccountEligibilityServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.margin.p036v1.MultiAccountEligibilityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMultiAccountEligibility(GetMultiAccountEligibilityRequestDto getMultiAccountEligibilityRequestDto, Continuation<? super GetMultiAccountEligibilityResponseDto> continuation) {
        C44241 c44241;
        if (continuation instanceof C44241) {
            c44241 = (C44241) continuation;
            int i = c44241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c44241.label = i - Integer.MIN_VALUE;
            } else {
                c44241 = new C44241(continuation);
            }
        }
        Object objGetMultiAccountEligibility = c44241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c44241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMultiAccountEligibility);
            Request<GetMultiAccountEligibilityRequestDto> request = new Request<>(getMultiAccountEligibilityRequestDto, null, 2, null);
            c44241.label = 1;
            objGetMultiAccountEligibility = GetMultiAccountEligibility(request, c44241);
            if (objGetMultiAccountEligibility == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMultiAccountEligibility);
        }
        return ((Response) objGetMultiAccountEligibility).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMultiAccountEligibility(Request<GetMultiAccountEligibilityRequestDto> request, Continuation<? super Response<GetMultiAccountEligibilityResponseDto>> continuation) {
        C44252 c44252;
        if (continuation instanceof C44252) {
            c44252 = (C44252) continuation;
            int i = c44252.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c44252.label = i - Integer.MIN_VALUE;
            } else {
                c44252 = new C44252(continuation);
            }
        }
        Object objGetMultiAccountEligibility = c44252.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c44252.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMultiAccountEligibility);
            MultiAccountEligibilityServiceRetrofit multiAccountEligibilityServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = request.getData().getAccount_number();
            MultiAccountEligibilityContextDto context = request.getData().getContext();
            c44252.label = 1;
            objGetMultiAccountEligibility = multiAccountEligibilityServiceRetrofit.GetMultiAccountEligibility(metadata, account_number, context, c44252);
            if (objGetMultiAccountEligibility == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMultiAccountEligibility);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetMultiAccountEligibility);
    }
}
