package bonfire.proto.idl.acats.p027v1;

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

/* compiled from: RestAcatsService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\rJ\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0096@¢\u0006\u0004\b\u0017\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/RestAcatsService;", "Lbonfire/proto/idl/acats/v1/AcatsService;", "Lbonfire/proto/idl/acats/v1/AcatsServiceRetrofit;", "retrofit", "<init>", "(Lbonfire/proto/idl/acats/v1/AcatsServiceRetrofit;)V", "Lbonfire/proto/idl/acats/v1/GetAcatsClawbackDetailsRequestDto;", "request", "Lbonfire/proto/idl/acats/v1/GetAcatsClawbackDetailsResponseDto;", "GetAcatsClawbackDetails", "(Lbonfire/proto/idl/acats/v1/GetAcatsClawbackDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetRequestDto;", "Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto;", "GetAcatsTransferHubBottomSheet", "(Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/acats/v1/ConfirmPendingJointAccountACATSRequestDto;", "", "ConfirmPendingJointAccountACATS", "(Lbonfire/proto/idl/acats/v1/ConfirmPendingJointAccountACATSRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/acats/v1/CancelPendingJointAccountACATSRequestDto;", "CancelPendingJointAccountACATS", "(Lbonfire/proto/idl/acats/v1/CancelPendingJointAccountACATSRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/acats/v1/AcatsServiceRetrofit;", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestAcatsService implements AcatsService {
    private final AcatsServiceRetrofit retrofit;

    /* compiled from: RestAcatsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.acats.v1.RestAcatsService", m3645f = "RestAcatsService.kt", m3646l = {88}, m3647m = "CancelPendingJointAccountACATS")
    /* renamed from: bonfire.proto.idl.acats.v1.RestAcatsService$CancelPendingJointAccountACATS$1 */
    static final class C37491 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C37491(Continuation<? super C37491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAcatsService.this.CancelPendingJointAccountACATS((CancelPendingJointAccountACATSRequestDto) null, this);
        }
    }

    /* compiled from: RestAcatsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.acats.v1.RestAcatsService", m3645f = "RestAcatsService.kt", m3646l = {94}, m3647m = "CancelPendingJointAccountACATS")
    /* renamed from: bonfire.proto.idl.acats.v1.RestAcatsService$CancelPendingJointAccountACATS$2 */
    static final class C37502 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C37502(Continuation<? super C37502> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAcatsService.this.CancelPendingJointAccountACATS((Request<CancelPendingJointAccountACATSRequestDto>) null, this);
        }
    }

    /* compiled from: RestAcatsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.acats.v1.RestAcatsService", m3645f = "RestAcatsService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "ConfirmPendingJointAccountACATS")
    /* renamed from: bonfire.proto.idl.acats.v1.RestAcatsService$ConfirmPendingJointAccountACATS$1 */
    static final class C37511 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C37511(Continuation<? super C37511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAcatsService.this.ConfirmPendingJointAccountACATS((ConfirmPendingJointAccountACATSRequestDto) null, this);
        }
    }

    /* compiled from: RestAcatsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.acats.v1.RestAcatsService", m3645f = "RestAcatsService.kt", m3646l = {78}, m3647m = "ConfirmPendingJointAccountACATS")
    /* renamed from: bonfire.proto.idl.acats.v1.RestAcatsService$ConfirmPendingJointAccountACATS$2 */
    static final class C37522 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C37522(Continuation<? super C37522> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAcatsService.this.ConfirmPendingJointAccountACATS((Request<ConfirmPendingJointAccountACATSRequestDto>) null, this);
        }
    }

    /* compiled from: RestAcatsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.acats.v1.RestAcatsService", m3645f = "RestAcatsService.kt", m3646l = {21}, m3647m = "GetAcatsClawbackDetails")
    /* renamed from: bonfire.proto.idl.acats.v1.RestAcatsService$GetAcatsClawbackDetails$1 */
    static final class C37531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C37531(Continuation<? super C37531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAcatsService.this.GetAcatsClawbackDetails((GetAcatsClawbackDetailsRequestDto) null, this);
        }
    }

    /* compiled from: RestAcatsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.acats.v1.RestAcatsService", m3645f = "RestAcatsService.kt", m3646l = {27}, m3647m = "GetAcatsClawbackDetails")
    /* renamed from: bonfire.proto.idl.acats.v1.RestAcatsService$GetAcatsClawbackDetails$2 */
    static final class C37542 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C37542(Continuation<? super C37542> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAcatsService.this.GetAcatsClawbackDetails((Request<GetAcatsClawbackDetailsRequestDto>) null, this);
        }
    }

    /* compiled from: RestAcatsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.acats.v1.RestAcatsService", m3645f = "RestAcatsService.kt", m3646l = {57}, m3647m = "GetAcatsTransferHubBottomSheet")
    /* renamed from: bonfire.proto.idl.acats.v1.RestAcatsService$GetAcatsTransferHubBottomSheet$1 */
    static final class C37551 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C37551(Continuation<? super C37551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAcatsService.this.GetAcatsTransferHubBottomSheet((GetAcatsTransferHubBottomSheetRequestDto) null, this);
        }
    }

    /* compiled from: RestAcatsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.acats.v1.RestAcatsService", m3645f = "RestAcatsService.kt", m3646l = {63}, m3647m = "GetAcatsTransferHubBottomSheet")
    /* renamed from: bonfire.proto.idl.acats.v1.RestAcatsService$GetAcatsTransferHubBottomSheet$2 */
    static final class C37562 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C37562(Continuation<? super C37562> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAcatsService.this.GetAcatsTransferHubBottomSheet((Request<GetAcatsTransferHubBottomSheetRequestDto>) null, this);
        }
    }

    public RestAcatsService(AcatsServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.acats.p027v1.AcatsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAcatsClawbackDetails(GetAcatsClawbackDetailsRequestDto getAcatsClawbackDetailsRequestDto, Continuation<? super GetAcatsClawbackDetailsResponseDto> continuation) {
        C37531 c37531;
        if (continuation instanceof C37531) {
            c37531 = (C37531) continuation;
            int i = c37531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c37531.label = i - Integer.MIN_VALUE;
            } else {
                c37531 = new C37531(continuation);
            }
        }
        Object objGetAcatsClawbackDetails = c37531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c37531.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAcatsClawbackDetails);
            Request<GetAcatsClawbackDetailsRequestDto> request = new Request<>(getAcatsClawbackDetailsRequestDto, null, 2, null);
            c37531.label = 1;
            objGetAcatsClawbackDetails = GetAcatsClawbackDetails(request, c37531);
            if (objGetAcatsClawbackDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAcatsClawbackDetails);
        }
        return ((Response) objGetAcatsClawbackDetails).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAcatsClawbackDetails(Request<GetAcatsClawbackDetailsRequestDto> request, Continuation<? super Response<GetAcatsClawbackDetailsResponseDto>> continuation) {
        C37542 c37542;
        if (continuation instanceof C37542) {
            c37542 = (C37542) continuation;
            int i = c37542.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c37542.label = i - Integer.MIN_VALUE;
            } else {
                c37542 = new C37542(continuation);
            }
        }
        C37542 c375422 = c37542;
        Object objGetAcatsClawbackDetails = c375422.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c375422.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAcatsClawbackDetails);
            AcatsServiceRetrofit acatsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String clawback_id = request.getData().getClawback_id();
            String account_number = request.getData().getAccount_number();
            Double transfer_amount = request.getData().getTransfer_amount();
            c375422.label = 1;
            objGetAcatsClawbackDetails = acatsServiceRetrofit.GetAcatsClawbackDetails(metadata, clawback_id, account_number, transfer_amount, c375422);
            if (objGetAcatsClawbackDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAcatsClawbackDetails);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAcatsClawbackDetails);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.acats.p027v1.AcatsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAcatsTransferHubBottomSheet(GetAcatsTransferHubBottomSheetRequestDto getAcatsTransferHubBottomSheetRequestDto, Continuation<? super GetAcatsTransferHubBottomSheetResponseDto> continuation) {
        C37551 c37551;
        if (continuation instanceof C37551) {
            c37551 = (C37551) continuation;
            int i = c37551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c37551.label = i - Integer.MIN_VALUE;
            } else {
                c37551 = new C37551(continuation);
            }
        }
        Object objGetAcatsTransferHubBottomSheet = c37551.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c37551.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAcatsTransferHubBottomSheet);
            Request<GetAcatsTransferHubBottomSheetRequestDto> request = new Request<>(getAcatsTransferHubBottomSheetRequestDto, null, 2, null);
            c37551.label = 1;
            objGetAcatsTransferHubBottomSheet = GetAcatsTransferHubBottomSheet(request, c37551);
            if (objGetAcatsTransferHubBottomSheet == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAcatsTransferHubBottomSheet);
        }
        return ((Response) objGetAcatsTransferHubBottomSheet).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAcatsTransferHubBottomSheet(Request<GetAcatsTransferHubBottomSheetRequestDto> request, Continuation<? super Response<GetAcatsTransferHubBottomSheetResponseDto>> continuation) {
        C37562 c37562;
        if (continuation instanceof C37562) {
            c37562 = (C37562) continuation;
            int i = c37562.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c37562.label = i - Integer.MIN_VALUE;
            } else {
                c37562 = new C37562(continuation);
            }
        }
        Object objGetAcatsTransferHubBottomSheet = c37562.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c37562.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAcatsTransferHubBottomSheet);
            AcatsServiceRetrofit acatsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c37562.label = 1;
            objGetAcatsTransferHubBottomSheet = acatsServiceRetrofit.GetAcatsTransferHubBottomSheet(metadata, c37562);
            if (objGetAcatsTransferHubBottomSheet == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAcatsTransferHubBottomSheet);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAcatsTransferHubBottomSheet);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.acats.p027v1.AcatsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ConfirmPendingJointAccountACATS(ConfirmPendingJointAccountACATSRequestDto confirmPendingJointAccountACATSRequestDto, Continuation<Object> continuation) {
        C37511 c37511;
        if (continuation instanceof C37511) {
            c37511 = (C37511) continuation;
            int i = c37511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c37511.label = i - Integer.MIN_VALUE;
            } else {
                c37511 = new C37511(continuation);
            }
        }
        Object objConfirmPendingJointAccountACATS = c37511.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c37511.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objConfirmPendingJointAccountACATS);
            Request<ConfirmPendingJointAccountACATSRequestDto> request = new Request<>(confirmPendingJointAccountACATSRequestDto, null, 2, null);
            c37511.label = 1;
            objConfirmPendingJointAccountACATS = ConfirmPendingJointAccountACATS(request, c37511);
            if (objConfirmPendingJointAccountACATS == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objConfirmPendingJointAccountACATS);
        }
        return ((Response) objConfirmPendingJointAccountACATS).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ConfirmPendingJointAccountACATS(Request<ConfirmPendingJointAccountACATSRequestDto> request, Continuation<? super Response<Object>> continuation) {
        C37522 c37522;
        if (continuation instanceof C37522) {
            c37522 = (C37522) continuation;
            int i = c37522.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c37522.label = i - Integer.MIN_VALUE;
            } else {
                c37522 = new C37522(continuation);
            }
        }
        Object objConfirmPendingJointAccountACATS = c37522.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c37522.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objConfirmPendingJointAccountACATS);
            AcatsServiceRetrofit acatsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            ConfirmPendingJointAccountACATSRequestDto data = request.getData();
            c37522.label = 1;
            objConfirmPendingJointAccountACATS = acatsServiceRetrofit.ConfirmPendingJointAccountACATS(metadata, data, c37522);
            if (objConfirmPendingJointAccountACATS == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objConfirmPendingJointAccountACATS);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objConfirmPendingJointAccountACATS);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.acats.p027v1.AcatsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CancelPendingJointAccountACATS(CancelPendingJointAccountACATSRequestDto cancelPendingJointAccountACATSRequestDto, Continuation<Object> continuation) {
        C37491 c37491;
        if (continuation instanceof C37491) {
            c37491 = (C37491) continuation;
            int i = c37491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c37491.label = i - Integer.MIN_VALUE;
            } else {
                c37491 = new C37491(continuation);
            }
        }
        Object objCancelPendingJointAccountACATS = c37491.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c37491.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCancelPendingJointAccountACATS);
            Request<CancelPendingJointAccountACATSRequestDto> request = new Request<>(cancelPendingJointAccountACATSRequestDto, null, 2, null);
            c37491.label = 1;
            objCancelPendingJointAccountACATS = CancelPendingJointAccountACATS(request, c37491);
            if (objCancelPendingJointAccountACATS == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCancelPendingJointAccountACATS);
        }
        return ((Response) objCancelPendingJointAccountACATS).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CancelPendingJointAccountACATS(Request<CancelPendingJointAccountACATSRequestDto> request, Continuation<? super Response<Object>> continuation) {
        C37502 c37502;
        if (continuation instanceof C37502) {
            c37502 = (C37502) continuation;
            int i = c37502.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c37502.label = i - Integer.MIN_VALUE;
            } else {
                c37502 = new C37502(continuation);
            }
        }
        Object objCancelPendingJointAccountACATS = c37502.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c37502.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCancelPendingJointAccountACATS);
            AcatsServiceRetrofit acatsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CancelPendingJointAccountACATSRequestDto data = request.getData();
            c37502.label = 1;
            objCancelPendingJointAccountACATS = acatsServiceRetrofit.CancelPendingJointAccountACATS(metadata, data, c37502);
            if (objCancelPendingJointAccountACATS == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCancelPendingJointAccountACATS);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCancelPendingJointAccountACATS);
    }
}
