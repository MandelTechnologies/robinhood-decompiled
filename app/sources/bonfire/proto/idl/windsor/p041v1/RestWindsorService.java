package bonfire.proto.idl.windsor.p041v1;

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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import rosetta.account.BrokerageAccountTypeDto;
import windsor.transactions.p552v1.TransactionTypeDto;

/* compiled from: RestWindsorService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\rJ\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0096@¢\u0006\u0004\b\u0018\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/RestWindsorService;", "Lbonfire/proto/idl/windsor/v1/WindsorService;", "Lbonfire/proto/idl/windsor/v1/WindsorServiceRetrofit;", "retrofit", "<init>", "(Lbonfire/proto/idl/windsor/v1/WindsorServiceRetrofit;)V", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto;", "request", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2ResponseDto;", "GetContributionAllowanceV2", "(Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/windsor/v1/GetTransfersRequestDto;", "Lbonfire/proto/idl/windsor/v1/GetTransfersResponseDto;", "GetTransfers", "(Lbonfire/proto/idl/windsor/v1/GetTransfersRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/windsor/v1/GetTransferDetailRequestDto;", "Lbonfire/proto/idl/windsor/v1/GetTransferDetailResponseDto;", "GetTransferDetail", "(Lbonfire/proto/idl/windsor/v1/GetTransferDetailRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/windsor/v1/CancelTransferRequestDto;", "", "CancelTransfer", "(Lbonfire/proto/idl/windsor/v1/CancelTransferRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/windsor/v1/WindsorServiceRetrofit;", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestWindsorService implements WindsorService {
    private final WindsorServiceRetrofit retrofit;

    /* compiled from: RestWindsorService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.windsor.v1.RestWindsorService", m3645f = "RestWindsorService.kt", m3646l = {106}, m3647m = "CancelTransfer")
    /* renamed from: bonfire.proto.idl.windsor.v1.RestWindsorService$CancelTransfer$1 */
    static final class C45021 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C45021(Continuation<? super C45021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestWindsorService.this.CancelTransfer((CancelTransferRequestDto) null, this);
        }
    }

    /* compiled from: RestWindsorService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.windsor.v1.RestWindsorService", m3645f = "RestWindsorService.kt", m3646l = {112}, m3647m = "CancelTransfer")
    /* renamed from: bonfire.proto.idl.windsor.v1.RestWindsorService$CancelTransfer$2 */
    static final class C45032 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C45032(Continuation<? super C45032> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestWindsorService.this.CancelTransfer((Request<CancelTransferRequestDto>) null, this);
        }
    }

    /* compiled from: RestWindsorService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.windsor.v1.RestWindsorService", m3645f = "RestWindsorService.kt", m3646l = {38}, m3647m = "GetContributionAllowanceV2")
    /* renamed from: bonfire.proto.idl.windsor.v1.RestWindsorService$GetContributionAllowanceV2$1 */
    static final class C45041 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C45041(Continuation<? super C45041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestWindsorService.this.GetContributionAllowanceV2((GetContributionAllowanceV2RequestDto) null, this);
        }
    }

    /* compiled from: RestWindsorService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.windsor.v1.RestWindsorService", m3645f = "RestWindsorService.kt", m3646l = {44}, m3647m = "GetContributionAllowanceV2")
    /* renamed from: bonfire.proto.idl.windsor.v1.RestWindsorService$GetContributionAllowanceV2$2 */
    static final class C45052 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C45052(Continuation<? super C45052> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestWindsorService.this.GetContributionAllowanceV2((Request<GetContributionAllowanceV2RequestDto>) null, this);
        }
    }

    /* compiled from: RestWindsorService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.windsor.v1.RestWindsorService", m3645f = "RestWindsorService.kt", m3646l = {90}, m3647m = "GetTransferDetail")
    /* renamed from: bonfire.proto.idl.windsor.v1.RestWindsorService$GetTransferDetail$1 */
    static final class C45061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C45061(Continuation<? super C45061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestWindsorService.this.GetTransferDetail((GetTransferDetailRequestDto) null, this);
        }
    }

    /* compiled from: RestWindsorService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.windsor.v1.RestWindsorService", m3645f = "RestWindsorService.kt", m3646l = {96}, m3647m = "GetTransferDetail")
    /* renamed from: bonfire.proto.idl.windsor.v1.RestWindsorService$GetTransferDetail$2 */
    static final class C45072 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C45072(Continuation<? super C45072> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestWindsorService.this.GetTransferDetail((Request<GetTransferDetailRequestDto>) null, this);
        }
    }

    /* compiled from: RestWindsorService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.windsor.v1.RestWindsorService", m3645f = "RestWindsorService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "GetTransfers")
    /* renamed from: bonfire.proto.idl.windsor.v1.RestWindsorService$GetTransfers$1 */
    static final class C45081 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C45081(Continuation<? super C45081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestWindsorService.this.GetTransfers((GetTransfersRequestDto) null, this);
        }
    }

    /* compiled from: RestWindsorService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.windsor.v1.RestWindsorService", m3645f = "RestWindsorService.kt", m3646l = {78}, m3647m = "GetTransfers")
    /* renamed from: bonfire.proto.idl.windsor.v1.RestWindsorService$GetTransfers$2 */
    static final class C45092 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C45092(Continuation<? super C45092> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestWindsorService.this.GetTransfers((Request<GetTransfersRequestDto>) null, this);
        }
    }

    public RestWindsorService(WindsorServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.windsor.p041v1.WindsorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetContributionAllowanceV2(GetContributionAllowanceV2RequestDto getContributionAllowanceV2RequestDto, Continuation<? super GetContributionAllowanceV2ResponseDto> continuation) {
        C45041 c45041;
        if (continuation instanceof C45041) {
            c45041 = (C45041) continuation;
            int i = c45041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c45041.label = i - Integer.MIN_VALUE;
            } else {
                c45041 = new C45041(continuation);
            }
        }
        Object objGetContributionAllowanceV2 = c45041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c45041.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetContributionAllowanceV2);
            Request<GetContributionAllowanceV2RequestDto> request = new Request<>(getContributionAllowanceV2RequestDto, null, 2, null);
            c45041.label = 1;
            objGetContributionAllowanceV2 = GetContributionAllowanceV2(request, c45041);
            if (objGetContributionAllowanceV2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetContributionAllowanceV2);
        }
        return ((Response) objGetContributionAllowanceV2).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetContributionAllowanceV2(Request<GetContributionAllowanceV2RequestDto> request, Continuation<? super Response<GetContributionAllowanceV2ResponseDto>> continuation) {
        C45052 c45052;
        if (continuation instanceof C45052) {
            c45052 = (C45052) continuation;
            int i = c45052.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c45052.label = i - Integer.MIN_VALUE;
            } else {
                c45052 = new C45052(continuation);
            }
        }
        C45052 c450522 = c45052;
        Object objGetContributionAllowanceV2 = c450522.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c450522.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetContributionAllowanceV2);
            WindsorServiceRetrofit windsorServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            BrokerageAccountTypeDto account_type = request.getData().getAccount_type() != BrokerageAccountTypeDto.INSTANCE.getZeroValue() ? request.getData().getAccount_type() : null;
            TransactionTypeDto transaction_type = request.getData().getTransaction_type() != TransactionTypeDto.INSTANCE.getZeroValue() ? request.getData().getTransaction_type() : null;
            c450522.label = 1;
            objGetContributionAllowanceV2 = windsorServiceRetrofit.GetContributionAllowanceV2(metadata, account_number, account_type, transaction_type, c450522);
            if (objGetContributionAllowanceV2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetContributionAllowanceV2);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetContributionAllowanceV2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.windsor.p041v1.WindsorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTransfers(GetTransfersRequestDto getTransfersRequestDto, Continuation<? super GetTransfersResponseDto> continuation) {
        C45081 c45081;
        if (continuation instanceof C45081) {
            c45081 = (C45081) continuation;
            int i = c45081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c45081.label = i - Integer.MIN_VALUE;
            } else {
                c45081 = new C45081(continuation);
            }
        }
        Object objGetTransfers = c45081.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c45081.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTransfers);
            Request<GetTransfersRequestDto> request = new Request<>(getTransfersRequestDto, null, 2, null);
            c45081.label = 1;
            objGetTransfers = GetTransfers(request, c45081);
            if (objGetTransfers == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTransfers);
        }
        return ((Response) objGetTransfers).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTransfers(Request<GetTransfersRequestDto> request, Continuation<? super Response<GetTransfersResponseDto>> continuation) {
        C45092 c45092;
        if (continuation instanceof C45092) {
            c45092 = (C45092) continuation;
            int i = c45092.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c45092.label = i - Integer.MIN_VALUE;
            } else {
                c45092 = new C45092(continuation);
            }
        }
        C45092 c450922 = c45092;
        Object objGetTransfers = c450922.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c450922.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTransfers);
            WindsorServiceRetrofit windsorServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            Integer numBoxInt = request.getData().getLimit() != 0 ? boxing.boxInt(request.getData().getLimit()) : null;
            String cursor = Intrinsics.areEqual(request.getData().getCursor(), "") ? null : request.getData().getCursor();
            c450922.label = 1;
            objGetTransfers = windsorServiceRetrofit.GetTransfers(metadata, account_number, numBoxInt, cursor, c450922);
            if (objGetTransfers == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTransfers);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetTransfers);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.windsor.p041v1.WindsorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTransferDetail(GetTransferDetailRequestDto getTransferDetailRequestDto, Continuation<? super GetTransferDetailResponseDto> continuation) {
        C45061 c45061;
        if (continuation instanceof C45061) {
            c45061 = (C45061) continuation;
            int i = c45061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c45061.label = i - Integer.MIN_VALUE;
            } else {
                c45061 = new C45061(continuation);
            }
        }
        Object objGetTransferDetail = c45061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c45061.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTransferDetail);
            Request<GetTransferDetailRequestDto> request = new Request<>(getTransferDetailRequestDto, null, 2, null);
            c45061.label = 1;
            objGetTransferDetail = GetTransferDetail(request, c45061);
            if (objGetTransferDetail == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTransferDetail);
        }
        return ((Response) objGetTransferDetail).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTransferDetail(Request<GetTransferDetailRequestDto> request, Continuation<? super Response<GetTransferDetailResponseDto>> continuation) {
        C45072 c45072;
        if (continuation instanceof C45072) {
            c45072 = (C45072) continuation;
            int i = c45072.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c45072.label = i - Integer.MIN_VALUE;
            } else {
                c45072 = new C45072(continuation);
            }
        }
        Object objGetTransferDetail = c45072.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c45072.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTransferDetail);
            WindsorServiceRetrofit windsorServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String transfer_id = !Intrinsics.areEqual(request.getData().getTransfer_id(), "") ? request.getData().getTransfer_id() : null;
            c45072.label = 1;
            objGetTransferDetail = windsorServiceRetrofit.GetTransferDetail(metadata, transfer_id, c45072);
            if (objGetTransferDetail == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTransferDetail);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetTransferDetail);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.windsor.p041v1.WindsorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CancelTransfer(CancelTransferRequestDto cancelTransferRequestDto, Continuation<Object> continuation) {
        C45021 c45021;
        if (continuation instanceof C45021) {
            c45021 = (C45021) continuation;
            int i = c45021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c45021.label = i - Integer.MIN_VALUE;
            } else {
                c45021 = new C45021(continuation);
            }
        }
        Object objCancelTransfer = c45021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c45021.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCancelTransfer);
            Request<CancelTransferRequestDto> request = new Request<>(cancelTransferRequestDto, null, 2, null);
            c45021.label = 1;
            objCancelTransfer = CancelTransfer(request, c45021);
            if (objCancelTransfer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCancelTransfer);
        }
        return ((Response) objCancelTransfer).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CancelTransfer(Request<CancelTransferRequestDto> request, Continuation<? super Response<Object>> continuation) {
        C45032 c45032;
        if (continuation instanceof C45032) {
            c45032 = (C45032) continuation;
            int i = c45032.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c45032.label = i - Integer.MIN_VALUE;
            } else {
                c45032 = new C45032(continuation);
            }
        }
        Object objCancelTransfer = c45032.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c45032.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCancelTransfer);
            WindsorServiceRetrofit windsorServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CancelTransferRequestDto data = request.getData();
            c45032.label = 1;
            objCancelTransfer = windsorServiceRetrofit.CancelTransfer(metadata, data, c45032);
            if (objCancelTransfer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCancelTransfer);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCancelTransfer);
    }
}
