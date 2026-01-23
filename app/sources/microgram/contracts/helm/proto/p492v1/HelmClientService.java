package microgram.contracts.helm.proto.p492v1;

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

/* compiled from: HelmClientService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lmicrogram/contracts/helm/proto/v1/HelmClientService;", "", "Lmicrogram/contracts/helm/proto/v1/StartNativeSubflowRequestDto;", "request", "Lmicrogram/contracts/helm/proto/v1/StartNativeSubflowResponseDto;", "StartNativeSubflow", "(Lmicrogram/contracts/helm/proto/v1/StartNativeSubflowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/helm/proto/v1/EndProcessingRequestDto;", "Lmicrogram/contracts/helm/proto/v1/EndProcessingResponseDto;", "EndProcessing", "(Lmicrogram/contracts/helm/proto/v1/EndProcessingRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/helm/proto/v1/EndFlowRequestDto;", "Lmicrogram/contracts/helm/proto/v1/EndFlowResponseDto;", "EndFlow", "(Lmicrogram/contracts/helm/proto/v1/EndFlowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "helm.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "microgram.contracts.helm.proto.v1.HelmClientService")
/* loaded from: classes14.dex */
public interface HelmClientService {

    /* compiled from: HelmClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.contracts.helm.proto.v1.HelmClientService$DefaultImpls", m3645f = "HelmClientService.kt", m3646l = {44}, m3647m = "EndFlow")
    /* renamed from: microgram.contracts.helm.proto.v1.HelmClientService$EndFlow$1 */
    static final class C465951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C465951(Continuation<? super C465951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.EndFlow(null, null, this);
        }
    }

    /* compiled from: HelmClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.contracts.helm.proto.v1.HelmClientService$DefaultImpls", m3645f = "HelmClientService.kt", m3646l = {34}, m3647m = "EndProcessing")
    /* renamed from: microgram.contracts.helm.proto.v1.HelmClientService$EndProcessing$1 */
    static final class C465961 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C465961(Continuation<? super C465961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.EndProcessing(null, null, this);
        }
    }

    /* compiled from: HelmClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.contracts.helm.proto.v1.HelmClientService$DefaultImpls", m3645f = "HelmClientService.kt", m3646l = {24}, m3647m = "StartNativeSubflow")
    /* renamed from: microgram.contracts.helm.proto.v1.HelmClientService$StartNativeSubflow$1 */
    static final class C465971 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C465971(Continuation<? super C465971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.StartNativeSubflow(null, null, this);
        }
    }

    Object EndFlow(EndFlowRequestDto endFlowRequestDto, Continuation<? super EndFlowResponseDto> continuation);

    Object EndProcessing(EndProcessingRequestDto endProcessingRequestDto, Continuation<? super EndProcessingResponseDto> continuation);

    Object StartNativeSubflow(StartNativeSubflowRequestDto startNativeSubflowRequestDto, Continuation<? super StartNativeSubflowResponseDto> continuation);

    /* compiled from: HelmClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object StartNativeSubflow(HelmClientService helmClientService, Request<StartNativeSubflowRequestDto> request, Continuation<? super Response<StartNativeSubflowResponseDto>> continuation) {
            C465971 c465971;
            if (continuation instanceof C465971) {
                c465971 = (C465971) continuation;
                int i = c465971.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c465971.label = i - Integer.MIN_VALUE;
                } else {
                    c465971 = new C465971(continuation);
                }
            }
            Object objStartNativeSubflow = c465971.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c465971.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objStartNativeSubflow);
                StartNativeSubflowRequestDto data = request.getData();
                c465971.label = 1;
                objStartNativeSubflow = helmClientService.StartNativeSubflow(data, c465971);
                if (objStartNativeSubflow == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objStartNativeSubflow);
            }
            return new Response(objStartNativeSubflow, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object EndProcessing(HelmClientService helmClientService, Request<EndProcessingRequestDto> request, Continuation<? super Response<EndProcessingResponseDto>> continuation) {
            C465961 c465961;
            if (continuation instanceof C465961) {
                c465961 = (C465961) continuation;
                int i = c465961.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c465961.label = i - Integer.MIN_VALUE;
                } else {
                    c465961 = new C465961(continuation);
                }
            }
            Object objEndProcessing = c465961.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c465961.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objEndProcessing);
                EndProcessingRequestDto data = request.getData();
                c465961.label = 1;
                objEndProcessing = helmClientService.EndProcessing(data, c465961);
                if (objEndProcessing == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objEndProcessing);
            }
            return new Response(objEndProcessing, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object EndFlow(HelmClientService helmClientService, Request<EndFlowRequestDto> request, Continuation<? super Response<EndFlowResponseDto>> continuation) {
            C465951 c465951;
            if (continuation instanceof C465951) {
                c465951 = (C465951) continuation;
                int i = c465951.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c465951.label = i - Integer.MIN_VALUE;
                } else {
                    c465951 = new C465951(continuation);
                }
            }
            Object objEndFlow = c465951.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c465951.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objEndFlow);
                EndFlowRequestDto data = request.getData();
                c465951.label = 1;
                objEndFlow = helmClientService.EndFlow(data, c465951);
                if (objEndFlow == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objEndFlow);
            }
            return new Response(objEndFlow, null, 2, null);
        }
    }
}
