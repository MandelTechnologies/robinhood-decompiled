package com.robinhood.baffi.proto.p282v1.publicservice;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BaffiPublicService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/BaffiPublicService;", "", "GenerateDeviceNonce", "Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceResponseDto;", "request", "Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceRequestDto;", "(Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DeviceAttestStatus", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusRequestDto;", "(Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AttestDevice", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceResponseDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto;", "(Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DeviceAttestationCheck", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckResponseDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckRequestDto;", "(Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface BaffiPublicService {

    /* compiled from: BaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.BaffiPublicService$DefaultImpls", m3645f = "BaffiPublicService.kt", m3646l = {39}, m3647m = "AttestDevice")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.BaffiPublicService$AttestDevice$1 */
    static final class C318481 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318481(Continuation<? super C318481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.AttestDevice(null, null, this);
        }
    }

    /* compiled from: BaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.BaffiPublicService$DefaultImpls", m3645f = "BaffiPublicService.kt", m3646l = {29}, m3647m = "DeviceAttestStatus")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.BaffiPublicService$DeviceAttestStatus$1 */
    static final class C318491 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318491(Continuation<? super C318491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.DeviceAttestStatus(null, null, this);
        }
    }

    /* compiled from: BaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.BaffiPublicService$DefaultImpls", m3645f = "BaffiPublicService.kt", m3646l = {49}, m3647m = "DeviceAttestationCheck")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.BaffiPublicService$DeviceAttestationCheck$1 */
    static final class C318501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318501(Continuation<? super C318501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.DeviceAttestationCheck(null, null, this);
        }
    }

    /* compiled from: BaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.BaffiPublicService$DefaultImpls", m3645f = "BaffiPublicService.kt", m3646l = {19}, m3647m = "GenerateDeviceNonce")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.BaffiPublicService$GenerateDeviceNonce$1 */
    static final class C318511 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318511(Continuation<? super C318511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GenerateDeviceNonce(null, null, this);
        }
    }

    Object AttestDevice(AttestDeviceRequestDto attestDeviceRequestDto, Continuation<? super AttestDeviceResponseDto> continuation);

    Object AttestDevice(Request<AttestDeviceRequestDto> request, Continuation<? super Response<AttestDeviceResponseDto>> continuation);

    Object DeviceAttestStatus(DeviceAttestStatusRequestDto deviceAttestStatusRequestDto, Continuation<? super DeviceAttestStatusResponseDto> continuation);

    Object DeviceAttestStatus(Request<DeviceAttestStatusRequestDto> request, Continuation<? super Response<DeviceAttestStatusResponseDto>> continuation);

    Object DeviceAttestationCheck(DeviceAttestationCheckRequestDto deviceAttestationCheckRequestDto, Continuation<? super DeviceAttestationCheckResponseDto> continuation);

    Object DeviceAttestationCheck(Request<DeviceAttestationCheckRequestDto> request, Continuation<? super Response<DeviceAttestationCheckResponseDto>> continuation);

    Object GenerateDeviceNonce(GenerateDeviceNonceRequestDto generateDeviceNonceRequestDto, Continuation<? super GenerateDeviceNonceResponseDto> continuation);

    Object GenerateDeviceNonce(Request<GenerateDeviceNonceRequestDto> request, Continuation<? super Response<GenerateDeviceNonceResponseDto>> continuation);

    /* compiled from: BaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GenerateDeviceNonce(BaffiPublicService baffiPublicService, Request<GenerateDeviceNonceRequestDto> request, Continuation<? super Response<GenerateDeviceNonceResponseDto>> continuation) {
            C318511 c318511;
            if (continuation instanceof C318511) {
                c318511 = (C318511) continuation;
                int i = c318511.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c318511.label = i - Integer.MIN_VALUE;
                } else {
                    c318511 = new C318511(continuation);
                }
            }
            Object objGenerateDeviceNonce = c318511.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c318511.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGenerateDeviceNonce);
                GenerateDeviceNonceRequestDto data = request.getData();
                c318511.label = 1;
                objGenerateDeviceNonce = baffiPublicService.GenerateDeviceNonce(data, c318511);
                if (objGenerateDeviceNonce == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGenerateDeviceNonce);
            }
            return new Response(objGenerateDeviceNonce, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object DeviceAttestStatus(BaffiPublicService baffiPublicService, Request<DeviceAttestStatusRequestDto> request, Continuation<? super Response<DeviceAttestStatusResponseDto>> continuation) {
            C318491 c318491;
            if (continuation instanceof C318491) {
                c318491 = (C318491) continuation;
                int i = c318491.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c318491.label = i - Integer.MIN_VALUE;
                } else {
                    c318491 = new C318491(continuation);
                }
            }
            Object objDeviceAttestStatus = c318491.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c318491.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objDeviceAttestStatus);
                DeviceAttestStatusRequestDto data = request.getData();
                c318491.label = 1;
                objDeviceAttestStatus = baffiPublicService.DeviceAttestStatus(data, c318491);
                if (objDeviceAttestStatus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objDeviceAttestStatus);
            }
            return new Response(objDeviceAttestStatus, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object AttestDevice(BaffiPublicService baffiPublicService, Request<AttestDeviceRequestDto> request, Continuation<? super Response<AttestDeviceResponseDto>> continuation) {
            C318481 c318481;
            if (continuation instanceof C318481) {
                c318481 = (C318481) continuation;
                int i = c318481.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c318481.label = i - Integer.MIN_VALUE;
                } else {
                    c318481 = new C318481(continuation);
                }
            }
            Object objAttestDevice = c318481.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c318481.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAttestDevice);
                AttestDeviceRequestDto data = request.getData();
                c318481.label = 1;
                objAttestDevice = baffiPublicService.AttestDevice(data, c318481);
                if (objAttestDevice == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAttestDevice);
            }
            return new Response(objAttestDevice, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object DeviceAttestationCheck(BaffiPublicService baffiPublicService, Request<DeviceAttestationCheckRequestDto> request, Continuation<? super Response<DeviceAttestationCheckResponseDto>> continuation) {
            C318501 c318501;
            if (continuation instanceof C318501) {
                c318501 = (C318501) continuation;
                int i = c318501.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c318501.label = i - Integer.MIN_VALUE;
                } else {
                    c318501 = new C318501(continuation);
                }
            }
            Object objDeviceAttestationCheck = c318501.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c318501.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objDeviceAttestationCheck);
                DeviceAttestationCheckRequestDto data = request.getData();
                c318501.label = 1;
                objDeviceAttestationCheck = baffiPublicService.DeviceAttestationCheck(data, c318501);
                if (objDeviceAttestationCheck == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objDeviceAttestationCheck);
            }
            return new Response(objDeviceAttestationCheck, null, 2, null);
        }
    }
}
