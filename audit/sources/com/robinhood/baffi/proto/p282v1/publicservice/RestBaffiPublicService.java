package com.robinhood.baffi.proto.p282v1.publicservice;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: RestBaffiPublicService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/RestBaffiPublicService;", "Lcom/robinhood/baffi/proto/v1/publicservice/BaffiPublicService;", "retrofit", "Lcom/robinhood/baffi/proto/v1/publicservice/BaffiPublicServiceRetrofit;", "<init>", "(Lcom/robinhood/baffi/proto/v1/publicservice/BaffiPublicServiceRetrofit;)V", "GenerateDeviceNonce", "Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceResponseDto;", "request", "Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceRequestDto;", "(Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DeviceAttestStatus", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusRequestDto;", "(Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AttestDevice", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceResponseDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto;", "(Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DeviceAttestationCheck", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckResponseDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckRequestDto;", "(Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class RestBaffiPublicService implements BaffiPublicService {
    private final BaffiPublicServiceRetrofit retrofit;

    /* compiled from: RestBaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService", m3645f = "RestBaffiPublicService.kt", m3646l = {52}, m3647m = "AttestDevice")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService$AttestDevice$1 */
    static final class C318701 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318701(Continuation<? super C318701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBaffiPublicService.this.AttestDevice((AttestDeviceRequestDto) null, this);
        }
    }

    /* compiled from: RestBaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService", m3645f = "RestBaffiPublicService.kt", m3646l = {58}, m3647m = "AttestDevice")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService$AttestDevice$2 */
    static final class C318712 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318712(Continuation<? super C318712> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBaffiPublicService.this.AttestDevice((Request<AttestDeviceRequestDto>) null, this);
        }
    }

    /* compiled from: RestBaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService", m3645f = "RestBaffiPublicService.kt", m3646l = {36}, m3647m = "DeviceAttestStatus")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService$DeviceAttestStatus$1 */
    static final class C318721 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318721(Continuation<? super C318721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBaffiPublicService.this.DeviceAttestStatus((DeviceAttestStatusRequestDto) null, this);
        }
    }

    /* compiled from: RestBaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService", m3645f = "RestBaffiPublicService.kt", m3646l = {42}, m3647m = "DeviceAttestStatus")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService$DeviceAttestStatus$2 */
    static final class C318732 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318732(Continuation<? super C318732> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBaffiPublicService.this.DeviceAttestStatus((Request<DeviceAttestStatusRequestDto>) null, this);
        }
    }

    /* compiled from: RestBaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService", m3645f = "RestBaffiPublicService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "DeviceAttestationCheck")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService$DeviceAttestationCheck$1 */
    static final class C318741 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318741(Continuation<? super C318741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBaffiPublicService.this.DeviceAttestationCheck((DeviceAttestationCheckRequestDto) null, this);
        }
    }

    /* compiled from: RestBaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService", m3645f = "RestBaffiPublicService.kt", m3646l = {74}, m3647m = "DeviceAttestationCheck")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService$DeviceAttestationCheck$2 */
    static final class C318752 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318752(Continuation<? super C318752> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBaffiPublicService.this.DeviceAttestationCheck((Request<DeviceAttestationCheckRequestDto>) null, this);
        }
    }

    /* compiled from: RestBaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService", m3645f = "RestBaffiPublicService.kt", m3646l = {20}, m3647m = "GenerateDeviceNonce")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService$GenerateDeviceNonce$1 */
    static final class C318761 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318761(Continuation<? super C318761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBaffiPublicService.this.GenerateDeviceNonce((GenerateDeviceNonceRequestDto) null, this);
        }
    }

    /* compiled from: RestBaffiPublicService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService", m3645f = "RestBaffiPublicService.kt", m3646l = {26}, m3647m = "GenerateDeviceNonce")
    /* renamed from: com.robinhood.baffi.proto.v1.publicservice.RestBaffiPublicService$GenerateDeviceNonce$2 */
    static final class C318772 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318772(Continuation<? super C318772> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBaffiPublicService.this.GenerateDeviceNonce((Request<GenerateDeviceNonceRequestDto>) null, this);
        }
    }

    public RestBaffiPublicService(BaffiPublicServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GenerateDeviceNonce(GenerateDeviceNonceRequestDto generateDeviceNonceRequestDto, Continuation<? super GenerateDeviceNonceResponseDto> continuation) {
        C318761 c318761;
        if (continuation instanceof C318761) {
            c318761 = (C318761) continuation;
            int i = c318761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318761.label = i - Integer.MIN_VALUE;
            } else {
                c318761 = new C318761(continuation);
            }
        }
        Object objGenerateDeviceNonce = c318761.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318761.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGenerateDeviceNonce);
            Request<GenerateDeviceNonceRequestDto> request = new Request<>(generateDeviceNonceRequestDto, null, 2, null);
            c318761.label = 1;
            objGenerateDeviceNonce = GenerateDeviceNonce(request, c318761);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GenerateDeviceNonce(Request<GenerateDeviceNonceRequestDto> request, Continuation<? super Response<GenerateDeviceNonceResponseDto>> continuation) {
        C318772 c318772;
        if (continuation instanceof C318772) {
            c318772 = (C318772) continuation;
            int i = c318772.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318772.label = i - Integer.MIN_VALUE;
            } else {
                c318772 = new C318772(continuation);
            }
        }
        Object objGenerateDeviceNonce = c318772.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318772.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGenerateDeviceNonce);
            BaffiPublicServiceRetrofit baffiPublicServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            GenerateDeviceNonceRequestDto data = request.getData();
            c318772.label = 1;
            objGenerateDeviceNonce = baffiPublicServiceRetrofit.GenerateDeviceNonce(metadata, data, c318772);
            if (objGenerateDeviceNonce == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGenerateDeviceNonce);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGenerateDeviceNonce);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object DeviceAttestStatus(DeviceAttestStatusRequestDto deviceAttestStatusRequestDto, Continuation<? super DeviceAttestStatusResponseDto> continuation) {
        C318721 c318721;
        if (continuation instanceof C318721) {
            c318721 = (C318721) continuation;
            int i = c318721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318721.label = i - Integer.MIN_VALUE;
            } else {
                c318721 = new C318721(continuation);
            }
        }
        Object objDeviceAttestStatus = c318721.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318721.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeviceAttestStatus);
            Request<DeviceAttestStatusRequestDto> request = new Request<>(deviceAttestStatusRequestDto, null, 2, null);
            c318721.label = 1;
            objDeviceAttestStatus = DeviceAttestStatus(request, c318721);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object DeviceAttestStatus(Request<DeviceAttestStatusRequestDto> request, Continuation<? super Response<DeviceAttestStatusResponseDto>> continuation) {
        C318732 c318732;
        if (continuation instanceof C318732) {
            c318732 = (C318732) continuation;
            int i = c318732.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318732.label = i - Integer.MIN_VALUE;
            } else {
                c318732 = new C318732(continuation);
            }
        }
        Object objDeviceAttestStatus = c318732.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318732.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeviceAttestStatus);
            BaffiPublicServiceRetrofit baffiPublicServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            DeviceAttestStatusRequestDto data = request.getData();
            c318732.label = 1;
            objDeviceAttestStatus = baffiPublicServiceRetrofit.DeviceAttestStatus(metadata, data, c318732);
            if (objDeviceAttestStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDeviceAttestStatus);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objDeviceAttestStatus);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AttestDevice(AttestDeviceRequestDto attestDeviceRequestDto, Continuation<? super AttestDeviceResponseDto> continuation) {
        C318701 c318701;
        if (continuation instanceof C318701) {
            c318701 = (C318701) continuation;
            int i = c318701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318701.label = i - Integer.MIN_VALUE;
            } else {
                c318701 = new C318701(continuation);
            }
        }
        Object objAttestDevice = c318701.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318701.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAttestDevice);
            Request<AttestDeviceRequestDto> request = new Request<>(attestDeviceRequestDto, null, 2, null);
            c318701.label = 1;
            objAttestDevice = AttestDevice(request, c318701);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AttestDevice(Request<AttestDeviceRequestDto> request, Continuation<? super Response<AttestDeviceResponseDto>> continuation) {
        C318712 c318712;
        if (continuation instanceof C318712) {
            c318712 = (C318712) continuation;
            int i = c318712.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318712.label = i - Integer.MIN_VALUE;
            } else {
                c318712 = new C318712(continuation);
            }
        }
        Object objAttestDevice = c318712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318712.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAttestDevice);
            BaffiPublicServiceRetrofit baffiPublicServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            AttestDeviceRequestDto data = request.getData();
            c318712.label = 1;
            objAttestDevice = baffiPublicServiceRetrofit.AttestDevice(metadata, data, c318712);
            if (objAttestDevice == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAttestDevice);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objAttestDevice);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object DeviceAttestationCheck(DeviceAttestationCheckRequestDto deviceAttestationCheckRequestDto, Continuation<? super DeviceAttestationCheckResponseDto> continuation) {
        C318741 c318741;
        if (continuation instanceof C318741) {
            c318741 = (C318741) continuation;
            int i = c318741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318741.label = i - Integer.MIN_VALUE;
            } else {
                c318741 = new C318741(continuation);
            }
        }
        Object objDeviceAttestationCheck = c318741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318741.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeviceAttestationCheck);
            Request<DeviceAttestationCheckRequestDto> request = new Request<>(deviceAttestationCheckRequestDto, null, 2, null);
            c318741.label = 1;
            objDeviceAttestationCheck = DeviceAttestationCheck(request, c318741);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object DeviceAttestationCheck(Request<DeviceAttestationCheckRequestDto> request, Continuation<? super Response<DeviceAttestationCheckResponseDto>> continuation) {
        C318752 c318752;
        if (continuation instanceof C318752) {
            c318752 = (C318752) continuation;
            int i = c318752.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318752.label = i - Integer.MIN_VALUE;
            } else {
                c318752 = new C318752(continuation);
            }
        }
        Object objDeviceAttestationCheck = c318752.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318752.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeviceAttestationCheck);
            BaffiPublicServiceRetrofit baffiPublicServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            DeviceAttestationCheckRequestDto data = request.getData();
            c318752.label = 1;
            objDeviceAttestationCheck = baffiPublicServiceRetrofit.DeviceAttestationCheck(metadata, data, c318752);
            if (objDeviceAttestationCheck == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDeviceAttestationCheck);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objDeviceAttestationCheck);
    }
}
