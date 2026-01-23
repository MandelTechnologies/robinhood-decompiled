package com.robinhood.prediction_markets.proto.p361v1.idl;

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

/* compiled from: GrpcInstrumentService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001c0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020 H\u0096@¢\u0006\u0002\u0010!J\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020 0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GrpcInstrumentService;", "Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentService;", "grpcClient", "Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentServiceClient;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentServiceClient;)V", "GetEventContract", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventContractResponseDto;", "request", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventContractRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEventContracts", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventContractsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventContractsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventContractsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEvent", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEvents", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetContractDisplayDetails", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetOrderFormDisplayDetails", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GrpcInstrumentService implements InstrumentService {
    private final InstrumentServiceClient grpcClient;

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {33}, m3647m = "GetContractDisplayDetails")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.GrpcInstrumentService$GetContractDisplayDetails$1 */
    static final class C360251 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360251(Continuation<? super C360251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetContractDisplayDetails((GetContractDisplayDetailsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {25}, m3647m = "GetEvent")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.GrpcInstrumentService$GetEvent$1 */
    static final class C360261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360261(Continuation<? super C360261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetEvent((GetEventRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {17}, m3647m = "GetEventContract")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.GrpcInstrumentService$GetEventContract$1 */
    static final class C360271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360271(Continuation<? super C360271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetEventContract((GetEventContractRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {37}, m3647m = "GetOrderFormDisplayDetails")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.GrpcInstrumentService$GetOrderFormDisplayDetails$1 */
    static final class C360281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360281(Continuation<? super C360281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetOrderFormDisplayDetails((GetOrderFormDisplayDetailsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {21}, m3647m = "ListEventContracts")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.GrpcInstrumentService$ListEventContracts$1 */
    static final class C360291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360291(Continuation<? super C360291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.ListEventContracts((ListEventContractsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {29}, m3647m = "ListEvents")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.GrpcInstrumentService$ListEvents$1 */
    static final class C360301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360301(Continuation<? super C360301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.ListEvents((ListEventsRequestDto) null, this);
        }
    }

    public GrpcInstrumentService(InstrumentServiceClient grpcClient) {
        Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
        this.grpcClient = grpcClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventContract(GetEventContractRequestDto getEventContractRequestDto, Continuation<? super GetEventContractResponseDto> continuation) {
        C360271 c360271;
        if (continuation instanceof C360271) {
            c360271 = (C360271) continuation;
            int i = c360271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360271.label = i - Integer.MIN_VALUE;
            } else {
                c360271 = new C360271(continuation);
            }
        }
        Object objGetEventContract = c360271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventContract);
            Request<GetEventContractRequestDto> request = new Request<>(getEventContractRequestDto, null, 2, null);
            c360271.label = 1;
            objGetEventContract = GetEventContract(request, c360271);
            if (objGetEventContract == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEventContract);
        }
        return ((Response) objGetEventContract).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    public Object GetEventContract(Request<GetEventContractRequestDto> request, Continuation<? super Response<GetEventContractResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetEventContractResponseDto.INSTANCE, this.grpcClient.GetEventContract(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEventContracts(ListEventContractsRequestDto listEventContractsRequestDto, Continuation<? super ListEventContractsResponseDto> continuation) {
        C360291 c360291;
        if (continuation instanceof C360291) {
            c360291 = (C360291) continuation;
            int i = c360291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360291.label = i - Integer.MIN_VALUE;
            } else {
                c360291 = new C360291(continuation);
            }
        }
        Object objListEventContracts = c360291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEventContracts);
            Request<ListEventContractsRequestDto> request = new Request<>(listEventContractsRequestDto, null, 2, null);
            c360291.label = 1;
            objListEventContracts = ListEventContracts(request, c360291);
            if (objListEventContracts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListEventContracts);
        }
        return ((Response) objListEventContracts).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    public Object ListEventContracts(Request<ListEventContractsRequestDto> request, Continuation<? super Response<ListEventContractsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, ListEventContractsResponseDto.INSTANCE, this.grpcClient.ListEventContracts(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEvent(GetEventRequestDto getEventRequestDto, Continuation<? super GetEventResponseDto> continuation) {
        C360261 c360261;
        if (continuation instanceof C360261) {
            c360261 = (C360261) continuation;
            int i = c360261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360261.label = i - Integer.MIN_VALUE;
            } else {
                c360261 = new C360261(continuation);
            }
        }
        Object objGetEvent = c360261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEvent);
            Request<GetEventRequestDto> request = new Request<>(getEventRequestDto, null, 2, null);
            c360261.label = 1;
            objGetEvent = GetEvent(request, c360261);
            if (objGetEvent == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEvent);
        }
        return ((Response) objGetEvent).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    public Object GetEvent(Request<GetEventRequestDto> request, Continuation<? super Response<GetEventResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetEventResponseDto.INSTANCE, this.grpcClient.GetEvent(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEvents(ListEventsRequestDto listEventsRequestDto, Continuation<? super ListEventsResponseDto> continuation) {
        C360301 c360301;
        if (continuation instanceof C360301) {
            c360301 = (C360301) continuation;
            int i = c360301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360301.label = i - Integer.MIN_VALUE;
            } else {
                c360301 = new C360301(continuation);
            }
        }
        Object objListEvents = c360301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360301.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEvents);
            Request<ListEventsRequestDto> request = new Request<>(listEventsRequestDto, null, 2, null);
            c360301.label = 1;
            objListEvents = ListEvents(request, c360301);
            if (objListEvents == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListEvents);
        }
        return ((Response) objListEvents).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    public Object ListEvents(Request<ListEventsRequestDto> request, Continuation<? super Response<ListEventsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, ListEventsResponseDto.INSTANCE, this.grpcClient.ListEvents(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetContractDisplayDetails(GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto, Continuation<? super GetContractDisplayDetailsResponseDto> continuation) {
        C360251 c360251;
        if (continuation instanceof C360251) {
            c360251 = (C360251) continuation;
            int i = c360251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360251.label = i - Integer.MIN_VALUE;
            } else {
                c360251 = new C360251(continuation);
            }
        }
        Object objGetContractDisplayDetails = c360251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360251.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetContractDisplayDetails);
            Request<GetContractDisplayDetailsRequestDto> request = new Request<>(getContractDisplayDetailsRequestDto, null, 2, null);
            c360251.label = 1;
            objGetContractDisplayDetails = GetContractDisplayDetails(request, c360251);
            if (objGetContractDisplayDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetContractDisplayDetails);
        }
        return ((Response) objGetContractDisplayDetails).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    public Object GetContractDisplayDetails(Request<GetContractDisplayDetailsRequestDto> request, Continuation<? super Response<GetContractDisplayDetailsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetContractDisplayDetailsResponseDto.INSTANCE, this.grpcClient.GetContractDisplayDetails(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrderFormDisplayDetails(GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto, Continuation<? super GetOrderFormDisplayDetailsResponseDto> continuation) {
        C360281 c360281;
        if (continuation instanceof C360281) {
            c360281 = (C360281) continuation;
            int i = c360281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360281.label = i - Integer.MIN_VALUE;
            } else {
                c360281 = new C360281(continuation);
            }
        }
        Object objGetOrderFormDisplayDetails = c360281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360281.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOrderFormDisplayDetails);
            Request<GetOrderFormDisplayDetailsRequestDto> request = new Request<>(getOrderFormDisplayDetailsRequestDto, null, 2, null);
            c360281.label = 1;
            objGetOrderFormDisplayDetails = GetOrderFormDisplayDetails(request, c360281);
            if (objGetOrderFormDisplayDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetOrderFormDisplayDetails);
        }
        return ((Response) objGetOrderFormDisplayDetails).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    public Object GetOrderFormDisplayDetails(Request<GetOrderFormDisplayDetailsRequestDto> request, Continuation<? super Response<GetOrderFormDisplayDetailsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetOrderFormDisplayDetailsResponseDto.INSTANCE, this.grpcClient.GetOrderFormDisplayDetails(), continuation);
    }
}
