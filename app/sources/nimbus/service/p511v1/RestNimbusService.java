package nimbus.service.p511v1;

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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestNimbusService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001c0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lnimbus/service/v1/RestNimbusService;", "Lnimbus/service/v1/NimbusService;", "retrofit", "Lnimbus/service/v1/NimbusServiceRetrofit;", "<init>", "(Lnimbus/service/v1/NimbusServiceRetrofit;)V", "GetAssetTransferDetails", "Lnimbus/service/v1/GetAssetTransferDetailsResponseDto;", "request", "Lnimbus/service/v1/GetAssetTransferDetailsRequestDto;", "(Lnimbus/service/v1/GetAssetTransferDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetAssetTransferList", "Lnimbus/service/v1/GetAssetTransferListResponseDto;", "Lnimbus/service/v1/GetAssetTransferListRequestDto;", "(Lnimbus/service/v1/GetAssetTransferListRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreateAssetTransfer", "Lnimbus/service/v1/CreateAssetTransferResponseDto;", "Lnimbus/service/v1/CreateAssetTransferRequestDto;", "(Lnimbus/service/v1/CreateAssetTransferRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PreSubmissionChecks", "Lnimbus/service/v1/PreSubmissionChecksResponseDto;", "Lnimbus/service/v1/PreSubmissionChecksRequestDto;", "(Lnimbus/service/v1/PreSubmissionChecksRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CancelAssetTransfer", "Lnimbus/service/v1/CancelAssetTransferResponseDto;", "Lnimbus/service/v1/CancelAssetTransferRequestDto;", "(Lnimbus/service/v1/CancelAssetTransferRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class RestNimbusService implements NimbusService {
    private final NimbusServiceRetrofit retrofit;

    /* compiled from: RestNimbusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nimbus.service.v1.RestNimbusService", m3645f = "RestNimbusService.kt", m3646l = {85}, m3647m = "CancelAssetTransfer")
    /* renamed from: nimbus.service.v1.RestNimbusService$CancelAssetTransfer$1 */
    static final class C470991 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C470991(Continuation<? super C470991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNimbusService.this.CancelAssetTransfer((CancelAssetTransferRequestDto) null, this);
        }
    }

    /* compiled from: RestNimbusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nimbus.service.v1.RestNimbusService", m3645f = "RestNimbusService.kt", m3646l = {91}, m3647m = "CancelAssetTransfer")
    /* renamed from: nimbus.service.v1.RestNimbusService$CancelAssetTransfer$2 */
    static final class C471002 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C471002(Continuation<? super C471002> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNimbusService.this.CancelAssetTransfer((Request<CancelAssetTransferRequestDto>) null, this);
        }
    }

    /* compiled from: RestNimbusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nimbus.service.v1.RestNimbusService", m3645f = "RestNimbusService.kt", m3646l = {53}, m3647m = "CreateAssetTransfer")
    /* renamed from: nimbus.service.v1.RestNimbusService$CreateAssetTransfer$1 */
    static final class C471011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C471011(Continuation<? super C471011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNimbusService.this.CreateAssetTransfer((CreateAssetTransferRequestDto) null, this);
        }
    }

    /* compiled from: RestNimbusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nimbus.service.v1.RestNimbusService", m3645f = "RestNimbusService.kt", m3646l = {59}, m3647m = "CreateAssetTransfer")
    /* renamed from: nimbus.service.v1.RestNimbusService$CreateAssetTransfer$2 */
    static final class C471022 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C471022(Continuation<? super C471022> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNimbusService.this.CreateAssetTransfer((Request<CreateAssetTransferRequestDto>) null, this);
        }
    }

    /* compiled from: RestNimbusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nimbus.service.v1.RestNimbusService", m3645f = "RestNimbusService.kt", m3646l = {20}, m3647m = "GetAssetTransferDetails")
    /* renamed from: nimbus.service.v1.RestNimbusService$GetAssetTransferDetails$1 */
    static final class C471031 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C471031(Continuation<? super C471031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNimbusService.this.GetAssetTransferDetails((GetAssetTransferDetailsRequestDto) null, this);
        }
    }

    /* compiled from: RestNimbusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nimbus.service.v1.RestNimbusService", m3645f = "RestNimbusService.kt", m3646l = {26}, m3647m = "GetAssetTransferDetails")
    /* renamed from: nimbus.service.v1.RestNimbusService$GetAssetTransferDetails$2 */
    static final class C471042 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C471042(Continuation<? super C471042> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNimbusService.this.GetAssetTransferDetails((Request<GetAssetTransferDetailsRequestDto>) null, this);
        }
    }

    /* compiled from: RestNimbusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nimbus.service.v1.RestNimbusService", m3645f = "RestNimbusService.kt", m3646l = {36}, m3647m = "GetAssetTransferList")
    /* renamed from: nimbus.service.v1.RestNimbusService$GetAssetTransferList$1 */
    static final class C471051 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C471051(Continuation<? super C471051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNimbusService.this.GetAssetTransferList((GetAssetTransferListRequestDto) null, this);
        }
    }

    /* compiled from: RestNimbusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nimbus.service.v1.RestNimbusService", m3645f = "RestNimbusService.kt", m3646l = {42}, m3647m = "GetAssetTransferList")
    /* renamed from: nimbus.service.v1.RestNimbusService$GetAssetTransferList$2 */
    static final class C471062 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C471062(Continuation<? super C471062> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNimbusService.this.GetAssetTransferList((Request<GetAssetTransferListRequestDto>) null, this);
        }
    }

    /* compiled from: RestNimbusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nimbus.service.v1.RestNimbusService", m3645f = "RestNimbusService.kt", m3646l = {69}, m3647m = "PreSubmissionChecks")
    /* renamed from: nimbus.service.v1.RestNimbusService$PreSubmissionChecks$1 */
    static final class C471071 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C471071(Continuation<? super C471071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNimbusService.this.PreSubmissionChecks((PreSubmissionChecksRequestDto) null, this);
        }
    }

    /* compiled from: RestNimbusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nimbus.service.v1.RestNimbusService", m3645f = "RestNimbusService.kt", m3646l = {75}, m3647m = "PreSubmissionChecks")
    /* renamed from: nimbus.service.v1.RestNimbusService$PreSubmissionChecks$2 */
    static final class C471082 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C471082(Continuation<? super C471082> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNimbusService.this.PreSubmissionChecks((Request<PreSubmissionChecksRequestDto>) null, this);
        }
    }

    public RestNimbusService(NimbusServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nimbus.service.p511v1.NimbusService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAssetTransferDetails(GetAssetTransferDetailsRequestDto getAssetTransferDetailsRequestDto, Continuation<? super GetAssetTransferDetailsResponseDto> continuation) {
        C471031 c471031;
        if (continuation instanceof C471031) {
            c471031 = (C471031) continuation;
            int i = c471031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c471031.label = i - Integer.MIN_VALUE;
            } else {
                c471031 = new C471031(continuation);
            }
        }
        Object objGetAssetTransferDetails = c471031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c471031.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAssetTransferDetails);
            Request<GetAssetTransferDetailsRequestDto> request = new Request<>(getAssetTransferDetailsRequestDto, null, 2, null);
            c471031.label = 1;
            objGetAssetTransferDetails = GetAssetTransferDetails(request, c471031);
            if (objGetAssetTransferDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAssetTransferDetails);
        }
        return ((Response) objGetAssetTransferDetails).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAssetTransferDetails(Request<GetAssetTransferDetailsRequestDto> request, Continuation<? super Response<GetAssetTransferDetailsResponseDto>> continuation) {
        C471042 c471042;
        if (continuation instanceof C471042) {
            c471042 = (C471042) continuation;
            int i = c471042.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c471042.label = i - Integer.MIN_VALUE;
            } else {
                c471042 = new C471042(continuation);
            }
        }
        Object objGetAssetTransferDetails = c471042.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c471042.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAssetTransferDetails);
            NimbusServiceRetrofit nimbusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String id = request.getData().getId();
            c471042.label = 1;
            objGetAssetTransferDetails = nimbusServiceRetrofit.GetAssetTransferDetails(metadata, id, c471042);
            if (objGetAssetTransferDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAssetTransferDetails);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAssetTransferDetails);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nimbus.service.p511v1.NimbusService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAssetTransferList(GetAssetTransferListRequestDto getAssetTransferListRequestDto, Continuation<? super GetAssetTransferListResponseDto> continuation) {
        C471051 c471051;
        if (continuation instanceof C471051) {
            c471051 = (C471051) continuation;
            int i = c471051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c471051.label = i - Integer.MIN_VALUE;
            } else {
                c471051 = new C471051(continuation);
            }
        }
        Object objGetAssetTransferList = c471051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c471051.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAssetTransferList);
            Request<GetAssetTransferListRequestDto> request = new Request<>(getAssetTransferListRequestDto, null, 2, null);
            c471051.label = 1;
            objGetAssetTransferList = GetAssetTransferList(request, c471051);
            if (objGetAssetTransferList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAssetTransferList);
        }
        return ((Response) objGetAssetTransferList).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAssetTransferList(Request<GetAssetTransferListRequestDto> request, Continuation<? super Response<GetAssetTransferListResponseDto>> continuation) {
        C471062 c471062;
        if (continuation instanceof C471062) {
            c471062 = (C471062) continuation;
            int i = c471062.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c471062.label = i - Integer.MIN_VALUE;
            } else {
                c471062 = new C471062(continuation);
            }
        }
        Object objGetAssetTransferList = c471062.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c471062.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAssetTransferList);
            NimbusServiceRetrofit nimbusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String cursor = !Intrinsics.areEqual(request.getData().getCursor(), "") ? request.getData().getCursor() : null;
            Integer numBoxInt = request.getData().getPage_size() != 0 ? boxing.boxInt(request.getData().getPage_size()) : null;
            c471062.label = 1;
            objGetAssetTransferList = nimbusServiceRetrofit.GetAssetTransferList(metadata, cursor, numBoxInt, c471062);
            if (objGetAssetTransferList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAssetTransferList);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAssetTransferList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nimbus.service.p511v1.NimbusService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateAssetTransfer(CreateAssetTransferRequestDto createAssetTransferRequestDto, Continuation<? super CreateAssetTransferResponseDto> continuation) {
        C471011 c471011;
        if (continuation instanceof C471011) {
            c471011 = (C471011) continuation;
            int i = c471011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c471011.label = i - Integer.MIN_VALUE;
            } else {
                c471011 = new C471011(continuation);
            }
        }
        Object objCreateAssetTransfer = c471011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c471011.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateAssetTransfer);
            Request<CreateAssetTransferRequestDto> request = new Request<>(createAssetTransferRequestDto, null, 2, null);
            c471011.label = 1;
            objCreateAssetTransfer = CreateAssetTransfer(request, c471011);
            if (objCreateAssetTransfer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateAssetTransfer);
        }
        return ((Response) objCreateAssetTransfer).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateAssetTransfer(Request<CreateAssetTransferRequestDto> request, Continuation<? super Response<CreateAssetTransferResponseDto>> continuation) {
        C471022 c471022;
        if (continuation instanceof C471022) {
            c471022 = (C471022) continuation;
            int i = c471022.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c471022.label = i - Integer.MIN_VALUE;
            } else {
                c471022 = new C471022(continuation);
            }
        }
        Object objCreateAssetTransfer = c471022.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c471022.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateAssetTransfer);
            NimbusServiceRetrofit nimbusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreateAssetTransferRequestDto data = request.getData();
            c471022.label = 1;
            objCreateAssetTransfer = nimbusServiceRetrofit.CreateAssetTransfer(metadata, data, c471022);
            if (objCreateAssetTransfer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateAssetTransfer);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCreateAssetTransfer);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nimbus.service.p511v1.NimbusService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PreSubmissionChecks(PreSubmissionChecksRequestDto preSubmissionChecksRequestDto, Continuation<? super PreSubmissionChecksResponseDto> continuation) {
        C471071 c471071;
        if (continuation instanceof C471071) {
            c471071 = (C471071) continuation;
            int i = c471071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c471071.label = i - Integer.MIN_VALUE;
            } else {
                c471071 = new C471071(continuation);
            }
        }
        Object objPreSubmissionChecks = c471071.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c471071.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPreSubmissionChecks);
            Request<PreSubmissionChecksRequestDto> request = new Request<>(preSubmissionChecksRequestDto, null, 2, null);
            c471071.label = 1;
            objPreSubmissionChecks = PreSubmissionChecks(request, c471071);
            if (objPreSubmissionChecks == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPreSubmissionChecks);
        }
        return ((Response) objPreSubmissionChecks).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PreSubmissionChecks(Request<PreSubmissionChecksRequestDto> request, Continuation<? super Response<PreSubmissionChecksResponseDto>> continuation) {
        C471082 c471082;
        if (continuation instanceof C471082) {
            c471082 = (C471082) continuation;
            int i = c471082.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c471082.label = i - Integer.MIN_VALUE;
            } else {
                c471082 = new C471082(continuation);
            }
        }
        Object objPreSubmissionChecks = c471082.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c471082.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPreSubmissionChecks);
            NimbusServiceRetrofit nimbusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            PreSubmissionChecksRequestDto data = request.getData();
            c471082.label = 1;
            objPreSubmissionChecks = nimbusServiceRetrofit.PreSubmissionChecks(metadata, data, c471082);
            if (objPreSubmissionChecks == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPreSubmissionChecks);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objPreSubmissionChecks);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nimbus.service.p511v1.NimbusService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CancelAssetTransfer(CancelAssetTransferRequestDto cancelAssetTransferRequestDto, Continuation<? super CancelAssetTransferResponseDto> continuation) {
        C470991 c470991;
        if (continuation instanceof C470991) {
            c470991 = (C470991) continuation;
            int i = c470991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c470991.label = i - Integer.MIN_VALUE;
            } else {
                c470991 = new C470991(continuation);
            }
        }
        Object objCancelAssetTransfer = c470991.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c470991.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCancelAssetTransfer);
            Request<CancelAssetTransferRequestDto> request = new Request<>(cancelAssetTransferRequestDto, null, 2, null);
            c470991.label = 1;
            objCancelAssetTransfer = CancelAssetTransfer(request, c470991);
            if (objCancelAssetTransfer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCancelAssetTransfer);
        }
        return ((Response) objCancelAssetTransfer).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CancelAssetTransfer(Request<CancelAssetTransferRequestDto> request, Continuation<? super Response<CancelAssetTransferResponseDto>> continuation) {
        C471002 c471002;
        if (continuation instanceof C471002) {
            c471002 = (C471002) continuation;
            int i = c471002.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c471002.label = i - Integer.MIN_VALUE;
            } else {
                c471002 = new C471002(continuation);
            }
        }
        Object objCancelAssetTransfer = c471002.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c471002.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCancelAssetTransfer);
            NimbusServiceRetrofit nimbusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String id = request.getData().getId();
            c471002.label = 1;
            objCancelAssetTransfer = nimbusServiceRetrofit.CancelAssetTransfer(metadata, id, c471002);
            if (objCancelAssetTransfer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCancelAssetTransfer);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCancelAssetTransfer);
    }
}
