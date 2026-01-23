package com.robinhood.android.helm;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.utils.android.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import microgram.contracts.helm.proto.p492v1.EndFlowRequestDto;
import microgram.contracts.helm.proto.p492v1.EndFlowResponseDto;
import microgram.contracts.helm.proto.p492v1.EndProcessingRequestDto;
import microgram.contracts.helm.proto.p492v1.EndProcessingResponseDto;
import microgram.contracts.helm.proto.p492v1.HelmClientService;
import microgram.contracts.helm.proto.p492v1.StartNativeSubflowRequestDto;
import microgram.contracts.helm.proto.p492v1.StartNativeSubflowResponseDto;
import timber.log.Timber;

/* compiled from: RealHelmClientService.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/helm/RealHelmClientService;", "Lmicrogram/contracts/helm/proto/v1/HelmClientService;", "<init>", "()V", "callback", "Lcom/robinhood/android/helm/HelmCallback;", "getCallback", "()Lcom/robinhood/android/helm/HelmCallback;", "setCallback", "(Lcom/robinhood/android/helm/HelmCallback;)V", "StartNativeSubflow", "Lmicrogram/contracts/helm/proto/v1/StartNativeSubflowResponseDto;", "request", "Lmicrogram/contracts/helm/proto/v1/StartNativeSubflowRequestDto;", "(Lmicrogram/contracts/helm/proto/v1/StartNativeSubflowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "EndProcessing", "Lmicrogram/contracts/helm/proto/v1/EndProcessingResponseDto;", "Lmicrogram/contracts/helm/proto/v1/EndProcessingRequestDto;", "(Lmicrogram/contracts/helm/proto/v1/EndProcessingRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "EndFlow", "Lmicrogram/contracts/helm/proto/v1/EndFlowResponseDto;", "Lmicrogram/contracts/helm/proto/v1/EndFlowRequestDto;", "(Lmicrogram/contracts/helm/proto/v1/EndFlowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-helm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class RealHelmClientService implements HelmClientService {
    public static final int $stable = 8;
    private HelmCallback callback;

    /* compiled from: RealHelmClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.helm.RealHelmClientService", m3645f = "RealHelmClientService.kt", m3646l = {52}, m3647m = "EndFlow")
    /* renamed from: com.robinhood.android.helm.RealHelmClientService$EndFlow$1 */
    static final class C183561 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C183561(Continuation<? super C183561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealHelmClientService.this.EndFlow((EndFlowRequestDto) null, this);
        }
    }

    /* compiled from: RealHelmClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.helm.RealHelmClientService", m3645f = "RealHelmClientService.kt", m3646l = {39}, m3647m = "EndProcessing")
    /* renamed from: com.robinhood.android.helm.RealHelmClientService$EndProcessing$1 */
    static final class C183571 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C183571(Continuation<? super C183571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealHelmClientService.this.EndProcessing((EndProcessingRequestDto) null, this);
        }
    }

    /* compiled from: RealHelmClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.helm.RealHelmClientService", m3645f = "RealHelmClientService.kt", m3646l = {26}, m3647m = "StartNativeSubflow")
    /* renamed from: com.robinhood.android.helm.RealHelmClientService$StartNativeSubflow$1 */
    static final class C183581 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C183581(Continuation<? super C183581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealHelmClientService.this.StartNativeSubflow((StartNativeSubflowRequestDto) null, this);
        }
    }

    public Object EndFlow(Request<EndFlowRequestDto> request, Continuation<? super Response<EndFlowResponseDto>> continuation) {
        return HelmClientService.DefaultImpls.EndFlow(this, request, continuation);
    }

    public Object EndProcessing(Request<EndProcessingRequestDto> request, Continuation<? super Response<EndProcessingResponseDto>> continuation) {
        return HelmClientService.DefaultImpls.EndProcessing(this, request, continuation);
    }

    public Object StartNativeSubflow(Request<StartNativeSubflowRequestDto> request, Continuation<? super Response<StartNativeSubflowResponseDto>> continuation) {
        return HelmClientService.DefaultImpls.StartNativeSubflow(this, request, continuation);
    }

    public final HelmCallback getCallback() {
        return this.callback;
    }

    public final void setCallback(HelmCallback helmCallback) {
        this.callback = helmCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.contracts.helm.proto.p492v1.HelmClientService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object StartNativeSubflow(StartNativeSubflowRequestDto startNativeSubflowRequestDto, Continuation<? super StartNativeSubflowResponseDto> continuation) {
        C183581 c183581;
        boolean zBooleanValue;
        if (continuation instanceof C183581) {
            c183581 = (C183581) continuation;
            int i = c183581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c183581.label = i - Integer.MIN_VALUE;
            } else {
                c183581 = new C183581(continuation);
            }
        }
        Object objStartNativeSubFlow = c183581.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c183581.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objStartNativeSubFlow);
            Timber.Companion companion = Timber.INSTANCE;
            zBooleanValue = false;
            companion.mo3350d("[Helm] StartNativeSubflow subflow:" + startNativeSubflowRequestDto.getSubflow_id() + " in flow:" + startNativeSubflowRequestDto.getFlow_id(), new Object[0]);
            if (this.callback == null) {
                if (BuildConfig.DEBUG) {
                    throw new IllegalStateException("HelmCallback not set");
                }
                companion.mo3353e("HelmCallback not set", new Object[0]);
            }
            HelmCallback helmCallback = this.callback;
            if (helmCallback != null) {
                String flow_id = startNativeSubflowRequestDto.getFlow_id();
                String subflow_id = startNativeSubflowRequestDto.getSubflow_id();
                c183581.label = 1;
                objStartNativeSubFlow = helmCallback.startNativeSubFlow(flow_id, subflow_id, c183581);
                if (objStartNativeSubFlow == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return new StartNativeSubflowResponseDto(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objStartNativeSubFlow);
        zBooleanValue = ((Boolean) objStartNativeSubFlow).booleanValue();
        return new StartNativeSubflowResponseDto(zBooleanValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.contracts.helm.proto.p492v1.HelmClientService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object EndProcessing(EndProcessingRequestDto endProcessingRequestDto, Continuation<? super EndProcessingResponseDto> continuation) {
        C183571 c183571;
        if (continuation instanceof C183571) {
            c183571 = (C183571) continuation;
            int i = c183571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c183571.label = i - Integer.MIN_VALUE;
            } else {
                c183571 = new C183571(continuation);
            }
        }
        Object obj = c183571.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c183571.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Timber.Companion companion = Timber.INSTANCE;
            companion.mo3350d("[Helm] EndProcessing subflow:" + endProcessingRequestDto.getSubflow_id(), new Object[0]);
            if (this.callback == null) {
                if (BuildConfig.DEBUG) {
                    throw new IllegalStateException("HelmCallback not set");
                }
                companion.mo3353e("HelmCallback not set", new Object[0]);
            }
            HelmCallback helmCallback = this.callback;
            if (helmCallback != null) {
                String subflow_id = endProcessingRequestDto.getSubflow_id();
                c183571.label = 1;
                if (helmCallback.stopLoadingSubFlow(subflow_id, c183571) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return new EndProcessingResponseDto();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.contracts.helm.proto.p492v1.HelmClientService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object EndFlow(EndFlowRequestDto endFlowRequestDto, Continuation<? super EndFlowResponseDto> continuation) {
        C183561 c183561;
        if (continuation instanceof C183561) {
            c183561 = (C183561) continuation;
            int i = c183561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c183561.label = i - Integer.MIN_VALUE;
            } else {
                c183561 = new C183561(continuation);
            }
        }
        Object obj = c183561.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c183561.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Timber.Companion companion = Timber.INSTANCE;
            companion.mo3350d("[Helm] EndFlow requested", new Object[0]);
            if (this.callback == null) {
                if (BuildConfig.DEBUG) {
                    throw new IllegalStateException("HelmCallback not set");
                }
                companion.mo3353e("HelmCallback not set", new Object[0]);
            }
            HelmCallback helmCallback = this.callback;
            if (helmCallback != null) {
                c183561.label = 1;
                if (helmCallback.endFlow(c183561) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return new EndFlowResponseDto();
    }
}
