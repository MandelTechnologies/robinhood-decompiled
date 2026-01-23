package bonfire.proto.idl.retirement.p038v1;

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

/* compiled from: RestRetirementRolloverService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lbonfire/proto/idl/retirement/v1/RestRetirementRolloverService;", "Lbonfire/proto/idl/retirement/v1/RetirementRolloverService;", "retrofit", "Lbonfire/proto/idl/retirement/v1/RetirementRolloverServiceRetrofit;", "<init>", "(Lbonfire/proto/idl/retirement/v1/RetirementRolloverServiceRetrofit;)V", "GetAccountDetails", "Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto;", "request", "Lbonfire/proto/idl/retirement/v1/GetAccountDetailsRequestDto;", "(Lbonfire/proto/idl/retirement/v1/GetAccountDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.proto.idl.retirement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestRetirementRolloverService implements RetirementRolloverService {
    private final RetirementRolloverServiceRetrofit retrofit;

    /* compiled from: RestRetirementRolloverService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.retirement.v1.RestRetirementRolloverService", m3645f = "RestRetirementRolloverService.kt", m3646l = {20}, m3647m = "GetAccountDetails")
    /* renamed from: bonfire.proto.idl.retirement.v1.RestRetirementRolloverService$GetAccountDetails$1 */
    static final class C44611 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C44611(Continuation<? super C44611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestRetirementRolloverService.this.GetAccountDetails((GetAccountDetailsRequestDto) null, this);
        }
    }

    /* compiled from: RestRetirementRolloverService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.retirement.v1.RestRetirementRolloverService", m3645f = "RestRetirementRolloverService.kt", m3646l = {26}, m3647m = "GetAccountDetails")
    /* renamed from: bonfire.proto.idl.retirement.v1.RestRetirementRolloverService$GetAccountDetails$2 */
    static final class C44622 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C44622(Continuation<? super C44622> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestRetirementRolloverService.this.GetAccountDetails((Request<GetAccountDetailsRequestDto>) null, this);
        }
    }

    public RestRetirementRolloverService(RetirementRolloverServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.retirement.p038v1.RetirementRolloverService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccountDetails(GetAccountDetailsRequestDto getAccountDetailsRequestDto, Continuation<? super GetAccountDetailsResponseDto> continuation) {
        C44611 c44611;
        if (continuation instanceof C44611) {
            c44611 = (C44611) continuation;
            int i = c44611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c44611.label = i - Integer.MIN_VALUE;
            } else {
                c44611 = new C44611(continuation);
            }
        }
        Object objGetAccountDetails = c44611.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c44611.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccountDetails);
            Request<GetAccountDetailsRequestDto> request = new Request<>(getAccountDetailsRequestDto, null, 2, null);
            c44611.label = 1;
            objGetAccountDetails = GetAccountDetails(request, c44611);
            if (objGetAccountDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccountDetails);
        }
        return ((Response) objGetAccountDetails).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccountDetails(Request<GetAccountDetailsRequestDto> request, Continuation<? super Response<GetAccountDetailsResponseDto>> continuation) {
        C44622 c44622;
        if (continuation instanceof C44622) {
            c44622 = (C44622) continuation;
            int i = c44622.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c44622.label = i - Integer.MIN_VALUE;
            } else {
                c44622 = new C44622(continuation);
            }
        }
        C44622 c446222 = c44622;
        Object objGetAccountDetails = c446222.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c446222.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccountDetails);
            RetirementRolloverServiceRetrofit retirementRolloverServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String access_token_id = !Intrinsics.areEqual(request.getData().getAccess_token_id(), "") ? request.getData().getAccess_token_id() : null;
            String broker_name = request.getData().getBroker_name();
            String account_number = Intrinsics.areEqual(request.getData().getAccount_number(), "") ? null : request.getData().getAccount_number();
            c446222.label = 1;
            objGetAccountDetails = retirementRolloverServiceRetrofit.GetAccountDetails(metadata, access_token_id, broker_name, account_number, c446222);
            if (objGetAccountDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccountDetails);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAccountDetails);
    }
}
