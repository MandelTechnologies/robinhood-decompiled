package futures_onboarding_value_props.proto.p463v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import microgram.annotation.ManagedServices;

/* compiled from: FuturesOnboardingValuePropsClientService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/FuturesOnboardingValuePropsClientService;", "", "Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateRequestDto;", "request", "Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto;", "GetMibFuturesState", "(Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "futures_onboarding_value_props.proto.v1.FuturesOnboardingValuePropsClientService")
/* loaded from: classes18.dex */
public interface FuturesOnboardingValuePropsClientService {

    /* compiled from: FuturesOnboardingValuePropsClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "futures_onboarding_value_props.proto.v1.FuturesOnboardingValuePropsClientService$DefaultImpls", m3645f = "FuturesOnboardingValuePropsClientService.kt", m3646l = {26}, m3647m = "GetMibFuturesState")
    /* renamed from: futures_onboarding_value_props.proto.v1.FuturesOnboardingValuePropsClientService$GetMibFuturesState$1 */
    static final class C448861 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C448861(Continuation<? super C448861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetMibFuturesState(null, null, this);
        }
    }

    Object GetMibFuturesState(GetMibFuturesStateRequestDto getMibFuturesStateRequestDto, Continuation<? super GetMibFuturesStateResponseDto> continuation);

    /* compiled from: FuturesOnboardingValuePropsClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetMibFuturesState(FuturesOnboardingValuePropsClientService futuresOnboardingValuePropsClientService, Request<GetMibFuturesStateRequestDto> request, Continuation<? super Response<GetMibFuturesStateResponseDto>> continuation) {
            C448861 c448861;
            if (continuation instanceof C448861) {
                c448861 = (C448861) continuation;
                int i = c448861.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c448861.label = i - Integer.MIN_VALUE;
                } else {
                    c448861 = new C448861(continuation);
                }
            }
            Object objGetMibFuturesState = c448861.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c448861.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetMibFuturesState);
                GetMibFuturesStateRequestDto data = request.getData();
                c448861.label = 1;
                objGetMibFuturesState = futuresOnboardingValuePropsClientService.GetMibFuturesState(data, c448861);
                if (objGetMibFuturesState == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetMibFuturesState);
            }
            return new Response(objGetMibFuturesState, null, 2, null);
        }
    }
}
