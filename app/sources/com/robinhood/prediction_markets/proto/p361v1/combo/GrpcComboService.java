package com.robinhood.prediction_markets.proto.p361v1.combo;

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

/* compiled from: GrpcComboService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/GrpcComboService;", "Lcom/robinhood/prediction_markets/proto/v1/combo/ComboService;", "grpcClient", "Lcom/robinhood/prediction_markets/proto/v1/combo/ComboServiceClient;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/combo/ComboServiceClient;)V", "CreateComboRFQ", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQResponseDto;", "request", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetComboProposals", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GrpcComboService implements ComboService {
    private final ComboServiceClient grpcClient;

    /* compiled from: GrpcComboService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.combo.GrpcComboService", m3645f = "GrpcComboService.kt", m3646l = {20}, m3647m = "CreateComboRFQ")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.combo.GrpcComboService$CreateComboRFQ$1 */
    static final class C359711 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359711(Continuation<? super C359711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcComboService.this.CreateComboRFQ((CreateComboRFQRequestDto) null, this);
        }
    }

    /* compiled from: GrpcComboService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.combo.GrpcComboService", m3645f = "GrpcComboService.kt", m3646l = {31}, m3647m = "GetComboProposals")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.combo.GrpcComboService$GetComboProposals$1 */
    static final class C359721 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359721(Continuation<? super C359721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcComboService.this.GetComboProposals((GetComboProposalsRequestDto) null, this);
        }
    }

    public GrpcComboService(ComboServiceClient grpcClient) {
        Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
        this.grpcClient = grpcClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.combo.ComboService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateComboRFQ(CreateComboRFQRequestDto createComboRFQRequestDto, Continuation<? super CreateComboRFQResponseDto> continuation) {
        C359711 c359711;
        if (continuation instanceof C359711) {
            c359711 = (C359711) continuation;
            int i = c359711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c359711.label = i - Integer.MIN_VALUE;
            } else {
                c359711 = new C359711(continuation);
            }
        }
        Object objCreateComboRFQ = c359711.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c359711.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateComboRFQ);
            Request<CreateComboRFQRequestDto> request = new Request<>(createComboRFQRequestDto, null, 2, null);
            c359711.label = 1;
            objCreateComboRFQ = CreateComboRFQ(request, c359711);
            if (objCreateComboRFQ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateComboRFQ);
        }
        return ((Response) objCreateComboRFQ).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.combo.ComboService
    public Object CreateComboRFQ(Request<CreateComboRFQRequestDto> request, Continuation<? super Response<CreateComboRFQResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, CreateComboRFQResponseDto.INSTANCE, this.grpcClient.CreateComboRFQ(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.combo.ComboService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetComboProposals(GetComboProposalsRequestDto getComboProposalsRequestDto, Continuation<? super GetComboProposalsResponseDto> continuation) {
        C359721 c359721;
        if (continuation instanceof C359721) {
            c359721 = (C359721) continuation;
            int i = c359721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c359721.label = i - Integer.MIN_VALUE;
            } else {
                c359721 = new C359721(continuation);
            }
        }
        Object objGetComboProposals = c359721.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c359721.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetComboProposals);
            Request<GetComboProposalsRequestDto> request = new Request<>(getComboProposalsRequestDto, null, 2, null);
            c359721.label = 1;
            objGetComboProposals = GetComboProposals(request, c359721);
            if (objGetComboProposals == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetComboProposals);
        }
        return ((Response) objGetComboProposals).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.combo.ComboService
    public Object GetComboProposals(Request<GetComboProposalsRequestDto> request, Continuation<? super Response<GetComboProposalsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetComboProposalsResponseDto.INSTANCE, this.grpcClient.GetComboProposals(), continuation);
    }
}
