package com.robinhood.baffi.proto.p282v1.publicservice;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcBaffiPublicService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/GrpcBaffiPublicService;", "Lcom/robinhood/baffi/proto/v1/publicservice/BaffiPublicService;", "grpcClient", "Lcom/robinhood/baffi/proto/v1/publicservice/BaffiPublicServiceClient;", "<init>", "(Lcom/robinhood/baffi/proto/v1/publicservice/BaffiPublicServiceClient;)V", "GenerateDeviceNonce", "Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceResponseDto;", "request", "Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceRequestDto;", "(Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DeviceAttestStatus", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusRequestDto;", "(Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AttestDevice", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceResponseDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto;", "(Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DeviceAttestationCheck", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckResponseDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckRequestDto;", "(Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class GrpcBaffiPublicService implements BaffiPublicService {
    private final BaffiPublicServiceClient grpcClient;

    /* compiled from: GrpcBaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.GrpcBaffiPublicService", m3645f = "GrpcBaffiPublicService.kt", m3646l = {40}, m3647m = "AttestDevice")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.GrpcBaffiPublicService$AttestDevice$1 */
    static final class C318661 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318661(Continuation<? super C318661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcBaffiPublicService.this.AttestDevice((AttestDeviceRequestDto) null, this);
        }
    }

    /* compiled from: GrpcBaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.GrpcBaffiPublicService", m3645f = "GrpcBaffiPublicService.kt", m3646l = {30}, m3647m = "DeviceAttestStatus")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.GrpcBaffiPublicService$DeviceAttestStatus$1 */
    static final class C318671 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318671(Continuation<? super C318671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcBaffiPublicService.this.DeviceAttestStatus((DeviceAttestStatusRequestDto) null, this);
        }
    }

    /* compiled from: GrpcBaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.GrpcBaffiPublicService", m3645f = "GrpcBaffiPublicService.kt", m3646l = {50}, m3647m = "DeviceAttestationCheck")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.GrpcBaffiPublicService$DeviceAttestationCheck$1 */
    static final class C318681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318681(Continuation<? super C318681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcBaffiPublicService.this.DeviceAttestationCheck((DeviceAttestationCheckRequestDto) null, this);
        }
    }

    /* compiled from: GrpcBaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.GrpcBaffiPublicService", m3645f = "GrpcBaffiPublicService.kt", m3646l = {20}, m3647m = "GenerateDeviceNonce")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.GrpcBaffiPublicService$GenerateDeviceNonce$1 */
    static final class C318691 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318691(Continuation<? super C318691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcBaffiPublicService.this.GenerateDeviceNonce((GenerateDeviceNonceRequestDto) null, this);
        }
    }

    public GrpcBaffiPublicService(BaffiPublicServiceClient grpcClient) {
        Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
        this.grpcClient = grpcClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GenerateDeviceNonce(GenerateDeviceNonceRequestDto generateDeviceNonceRequestDto, Continuation<? super GenerateDeviceNonceResponseDto> continuation) {
        C318691 c318691;
        if (continuation instanceof C318691) {
            c318691 = (C318691) continuation;
            int i = c318691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318691.label = i - Integer.MIN_VALUE;
            } else {
                c318691 = new C318691(continuation);
            }
        }
        Object objGenerateDeviceNonce = c318691.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318691.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGenerateDeviceNonce);
            Request<GenerateDeviceNonceRequestDto> request = new Request<>(generateDeviceNonceRequestDto, null, 2, null);
            c318691.label = 1;
            objGenerateDeviceNonce = GenerateDeviceNonce(request, c318691);
            if (objGenerateDeviceNonce == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGenerateDeviceNonce);
        }
        return ((Response) objGenerateDeviceNonce).getData();
    }

    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    public Object GenerateDeviceNonce(Request<GenerateDeviceNonceRequestDto> request, Continuation<? super Response<GenerateDeviceNonceResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GenerateDeviceNonceResponseDto.INSTANCE, this.grpcClient.GenerateDeviceNonce(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object DeviceAttestStatus(DeviceAttestStatusRequestDto deviceAttestStatusRequestDto, Continuation<? super DeviceAttestStatusResponseDto> continuation) {
        C318671 c318671;
        if (continuation instanceof C318671) {
            c318671 = (C318671) continuation;
            int i = c318671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318671.label = i - Integer.MIN_VALUE;
            } else {
                c318671 = new C318671(continuation);
            }
        }
        Object objDeviceAttestStatus = c318671.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318671.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeviceAttestStatus);
            Request<DeviceAttestStatusRequestDto> request = new Request<>(deviceAttestStatusRequestDto, null, 2, null);
            c318671.label = 1;
            objDeviceAttestStatus = DeviceAttestStatus(request, c318671);
            if (objDeviceAttestStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDeviceAttestStatus);
        }
        return ((Response) objDeviceAttestStatus).getData();
    }

    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    public Object DeviceAttestStatus(Request<DeviceAttestStatusRequestDto> request, Continuation<? super Response<DeviceAttestStatusResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, DeviceAttestStatusResponseDto.INSTANCE, this.grpcClient.DeviceAttestStatus(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AttestDevice(AttestDeviceRequestDto attestDeviceRequestDto, Continuation<? super AttestDeviceResponseDto> continuation) {
        C318661 c318661;
        if (continuation instanceof C318661) {
            c318661 = (C318661) continuation;
            int i = c318661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318661.label = i - Integer.MIN_VALUE;
            } else {
                c318661 = new C318661(continuation);
            }
        }
        Object objAttestDevice = c318661.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318661.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAttestDevice);
            Request<AttestDeviceRequestDto> request = new Request<>(attestDeviceRequestDto, null, 2, null);
            c318661.label = 1;
            objAttestDevice = AttestDevice(request, c318661);
            if (objAttestDevice == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAttestDevice);
        }
        return ((Response) objAttestDevice).getData();
    }

    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    public Object AttestDevice(Request<AttestDeviceRequestDto> request, Continuation<? super Response<AttestDeviceResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, AttestDeviceResponseDto.INSTANCE, this.grpcClient.AttestDevice(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object DeviceAttestationCheck(DeviceAttestationCheckRequestDto deviceAttestationCheckRequestDto, Continuation<? super DeviceAttestationCheckResponseDto> continuation) {
        C318681 c318681;
        if (continuation instanceof C318681) {
            c318681 = (C318681) continuation;
            int i = c318681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318681.label = i - Integer.MIN_VALUE;
            } else {
                c318681 = new C318681(continuation);
            }
        }
        Object objDeviceAttestationCheck = c318681.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318681.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeviceAttestationCheck);
            Request<DeviceAttestationCheckRequestDto> request = new Request<>(deviceAttestationCheckRequestDto, null, 2, null);
            c318681.label = 1;
            objDeviceAttestationCheck = DeviceAttestationCheck(request, c318681);
            if (objDeviceAttestationCheck == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDeviceAttestationCheck);
        }
        return ((Response) objDeviceAttestationCheck).getData();
    }

    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    public Object DeviceAttestationCheck(Request<DeviceAttestationCheckRequestDto> request, Continuation<? super Response<DeviceAttestationCheckResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, DeviceAttestationCheckResponseDto.INSTANCE, this.grpcClient.DeviceAttestationCheck(), continuation);
    }
}
