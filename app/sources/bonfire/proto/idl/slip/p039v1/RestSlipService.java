package bonfire.proto.idl.slip.p039v1;

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

/* compiled from: RestSlipService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lbonfire/proto/idl/slip/v1/RestSlipService;", "Lbonfire/proto/idl/slip/v1/SlipService;", "retrofit", "Lbonfire/proto/idl/slip/v1/SlipServiceRetrofit;", "<init>", "(Lbonfire/proto/idl/slip/v1/SlipServiceRetrofit;)V", "GetSlipPayments", "Lbonfire/proto/idl/slip/v1/GetSlipPaymentsResponseDto;", "request", "Lbonfire/proto/idl/slip/v1/GetSlipPaymentsRequestDto;", "(Lbonfire/proto/idl/slip/v1/GetSlipPaymentsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.slip.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestSlipService implements SlipService {
    private final SlipServiceRetrofit retrofit;

    /* compiled from: RestSlipService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.slip.v1.RestSlipService", m3645f = "RestSlipService.kt", m3646l = {20}, m3647m = "GetSlipPayments")
    /* renamed from: bonfire.proto.idl.slip.v1.RestSlipService$GetSlipPayments$1 */
    static final class C44681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C44681(Continuation<? super C44681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestSlipService.this.GetSlipPayments((GetSlipPaymentsRequestDto) null, this);
        }
    }

    /* compiled from: RestSlipService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.slip.v1.RestSlipService", m3645f = "RestSlipService.kt", m3646l = {26}, m3647m = "GetSlipPayments")
    /* renamed from: bonfire.proto.idl.slip.v1.RestSlipService$GetSlipPayments$2 */
    static final class C44692 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C44692(Continuation<? super C44692> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestSlipService.this.GetSlipPayments((Request<GetSlipPaymentsRequestDto>) null, this);
        }
    }

    public RestSlipService(SlipServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.slip.p039v1.SlipService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSlipPayments(GetSlipPaymentsRequestDto getSlipPaymentsRequestDto, Continuation<? super GetSlipPaymentsResponseDto> continuation) {
        C44681 c44681;
        if (continuation instanceof C44681) {
            c44681 = (C44681) continuation;
            int i = c44681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c44681.label = i - Integer.MIN_VALUE;
            } else {
                c44681 = new C44681(continuation);
            }
        }
        Object objGetSlipPayments = c44681.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c44681.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSlipPayments);
            Request<GetSlipPaymentsRequestDto> request = new Request<>(getSlipPaymentsRequestDto, null, 2, null);
            c44681.label = 1;
            objGetSlipPayments = GetSlipPayments(request, c44681);
            if (objGetSlipPayments == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetSlipPayments);
        }
        return ((Response) objGetSlipPayments).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSlipPayments(Request<GetSlipPaymentsRequestDto> request, Continuation<? super Response<GetSlipPaymentsResponseDto>> continuation) {
        C44692 c44692;
        if (continuation instanceof C44692) {
            c44692 = (C44692) continuation;
            int i = c44692.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c44692.label = i - Integer.MIN_VALUE;
            } else {
                c44692 = new C44692(continuation);
            }
        }
        Object objGetSlipPayments = c44692.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c44692.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSlipPayments);
            SlipServiceRetrofit slipServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c44692.label = 1;
            objGetSlipPayments = slipServiceRetrofit.GetSlipPayments(metadata, c44692);
            if (objGetSlipPayments == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetSlipPayments);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetSlipPayments);
    }
}
