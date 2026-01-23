package com.robinhood.prediction_markets.proto.p361v1.idl;

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
import rosetta.mainst.PositionEffectDto;

/* compiled from: RestInstrumentService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001c0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020 H\u0096@¢\u0006\u0002\u0010!J\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020 0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/RestInstrumentService;", "Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentService;", "retrofit", "Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentServiceRetrofit;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentServiceRetrofit;)V", "GetEventContract", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventContractResponseDto;", "request", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventContractRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEventContracts", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventContractsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventContractsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventContractsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEvent", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEvents", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetContractDisplayDetails", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetOrderFormDisplayDetails", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RestInstrumentService implements InstrumentService {
    private final InstrumentServiceRetrofit retrofit;

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {64}, m3647m = "GetContractDisplayDetails")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService$GetContractDisplayDetails$1 */
    static final class C360811 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360811(Continuation<? super C360811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetContractDisplayDetails((GetContractDisplayDetailsRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {67}, m3647m = "GetContractDisplayDetails")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService$GetContractDisplayDetails$2 */
    static final class C360822 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360822(Continuation<? super C360822> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetContractDisplayDetails((Request<GetContractDisplayDetailsRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {38}, m3647m = "GetEvent")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService$GetEvent$1 */
    static final class C360831 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360831(Continuation<? super C360831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetEvent((GetEventRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {41}, m3647m = "GetEvent")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService$GetEvent$2 */
    static final class C360842 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360842(Continuation<? super C360842> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetEvent((Request<GetEventRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {18}, m3647m = "GetEventContract")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService$GetEventContract$1 */
    static final class C360851 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360851(Continuation<? super C360851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetEventContract((GetEventContractRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {21}, m3647m = "GetEventContract")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService$GetEventContract$2 */
    static final class C360862 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360862(Continuation<? super C360862> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetEventContract((Request<GetEventContractRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {75}, m3647m = "GetOrderFormDisplayDetails")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService$GetOrderFormDisplayDetails$1 */
    static final class C360871 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360871(Continuation<? super C360871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetOrderFormDisplayDetails((GetOrderFormDisplayDetailsRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {78}, m3647m = "GetOrderFormDisplayDetails")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService$GetOrderFormDisplayDetails$2 */
    static final class C360882 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360882(Continuation<? super C360882> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetOrderFormDisplayDetails((Request<GetOrderFormDisplayDetailsRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {28}, m3647m = "ListEventContracts")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService$ListEventContracts$1 */
    static final class C360891 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360891(Continuation<? super C360891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListEventContracts((ListEventContractsRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {31}, m3647m = "ListEventContracts")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService$ListEventContracts$2 */
    static final class C360902 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360902(Continuation<? super C360902> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListEventContracts((Request<ListEventContractsRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {51}, m3647m = "ListEvents")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService$ListEvents$1 */
    static final class C360911 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360911(Continuation<? super C360911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListEvents((ListEventsRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {54}, m3647m = "ListEvents")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestInstrumentService$ListEvents$2 */
    static final class C360922 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360922(Continuation<? super C360922> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListEvents((Request<ListEventsRequestDto>) null, this);
        }
    }

    public RestInstrumentService(InstrumentServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventContract(GetEventContractRequestDto getEventContractRequestDto, Continuation<? super GetEventContractResponseDto> continuation) {
        C360851 c360851;
        if (continuation instanceof C360851) {
            c360851 = (C360851) continuation;
            int i = c360851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360851.label = i - Integer.MIN_VALUE;
            } else {
                c360851 = new C360851(continuation);
            }
        }
        Object objGetEventContract = c360851.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360851.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventContract);
            Request<GetEventContractRequestDto> request = new Request<>(getEventContractRequestDto, null, 2, null);
            c360851.label = 1;
            objGetEventContract = GetEventContract(request, c360851);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventContract(Request<GetEventContractRequestDto> request, Continuation<? super Response<GetEventContractResponseDto>> continuation) {
        C360862 c360862;
        if (continuation instanceof C360862) {
            c360862 = (C360862) continuation;
            int i = c360862.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360862.label = i - Integer.MIN_VALUE;
            } else {
                c360862 = new C360862(continuation);
            }
        }
        Object objGetEventContract = c360862.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360862.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventContract);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String id = request.getData().getId();
            c360862.label = 1;
            objGetEventContract = instrumentServiceRetrofit.GetEventContract(metadata, id, c360862);
            if (objGetEventContract == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEventContract);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetEventContract);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEventContracts(ListEventContractsRequestDto listEventContractsRequestDto, Continuation<? super ListEventContractsResponseDto> continuation) {
        C360891 c360891;
        if (continuation instanceof C360891) {
            c360891 = (C360891) continuation;
            int i = c360891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360891.label = i - Integer.MIN_VALUE;
            } else {
                c360891 = new C360891(continuation);
            }
        }
        Object objListEventContracts = c360891.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360891.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEventContracts);
            Request<ListEventContractsRequestDto> request = new Request<>(listEventContractsRequestDto, null, 2, null);
            c360891.label = 1;
            objListEventContracts = ListEventContracts(request, c360891);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEventContracts(Request<ListEventContractsRequestDto> request, Continuation<? super Response<ListEventContractsResponseDto>> continuation) {
        C360902 c360902;
        if (continuation instanceof C360902) {
            c360902 = (C360902) continuation;
            int i = c360902.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360902.label = i - Integer.MIN_VALUE;
            } else {
                c360902 = new C360902(continuation);
            }
        }
        Object objListEventContracts = c360902.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360902.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEventContracts);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String ids = !Intrinsics.areEqual(request.getData().getIds(), "") ? request.getData().getIds() : null;
            c360902.label = 1;
            objListEventContracts = instrumentServiceRetrofit.ListEventContracts(metadata, ids, c360902);
            if (objListEventContracts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListEventContracts);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListEventContracts);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEvent(GetEventRequestDto getEventRequestDto, Continuation<? super GetEventResponseDto> continuation) {
        C360831 c360831;
        if (continuation instanceof C360831) {
            c360831 = (C360831) continuation;
            int i = c360831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360831.label = i - Integer.MIN_VALUE;
            } else {
                c360831 = new C360831(continuation);
            }
        }
        Object objGetEvent = c360831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEvent);
            Request<GetEventRequestDto> request = new Request<>(getEventRequestDto, null, 2, null);
            c360831.label = 1;
            objGetEvent = GetEvent(request, c360831);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEvent(Request<GetEventRequestDto> request, Continuation<? super Response<GetEventResponseDto>> continuation) {
        C360842 c360842;
        if (continuation instanceof C360842) {
            c360842 = (C360842) continuation;
            int i = c360842.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360842.label = i - Integer.MIN_VALUE;
            } else {
                c360842 = new C360842(continuation);
            }
        }
        C360842 c3608422 = c360842;
        Object objGetEvent = c3608422.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3608422.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEvent);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String id = request.getData().getId();
            Boolean boolBoxBoolean = request.getData().getInclude_nondiscoverable_contracts() ? boxing.boxBoolean(request.getData().getInclude_nondiscoverable_contracts()) : null;
            Boolean boolBoxBoolean2 = request.getData().getHydrate_contract_groups() ? boxing.boxBoolean(request.getData().getHydrate_contract_groups()) : null;
            String url_slug = Intrinsics.areEqual(request.getData().getUrl_slug(), "") ? null : request.getData().getUrl_slug();
            c3608422.label = 1;
            objGetEvent = instrumentServiceRetrofit.GetEvent(metadata, id, boolBoxBoolean, boolBoxBoolean2, url_slug, c3608422);
            if (objGetEvent == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEvent);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEvents(ListEventsRequestDto listEventsRequestDto, Continuation<? super ListEventsResponseDto> continuation) {
        C360911 c360911;
        if (continuation instanceof C360911) {
            c360911 = (C360911) continuation;
            int i = c360911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360911.label = i - Integer.MIN_VALUE;
            } else {
                c360911 = new C360911(continuation);
            }
        }
        Object objListEvents = c360911.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360911.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEvents);
            Request<ListEventsRequestDto> request = new Request<>(listEventsRequestDto, null, 2, null);
            c360911.label = 1;
            objListEvents = ListEvents(request, c360911);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEvents(Request<ListEventsRequestDto> request, Continuation<? super Response<ListEventsResponseDto>> continuation) {
        C360922 c360922;
        if (continuation instanceof C360922) {
            c360922 = (C360922) continuation;
            int i = c360922.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360922.label = i - Integer.MIN_VALUE;
            } else {
                c360922 = new C360922(continuation);
            }
        }
        C360922 c3609222 = c360922;
        Object objListEvents = c3609222.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3609222.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEvents);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String ids = !Intrinsics.areEqual(request.getData().getIds(), "") ? request.getData().getIds() : null;
            Boolean boolBoxBoolean = request.getData().getInclude_nondiscoverable_contracts() ? boxing.boxBoolean(request.getData().getInclude_nondiscoverable_contracts()) : null;
            String categories = !Intrinsics.areEqual(request.getData().getCategories(), "") ? request.getData().getCategories() : null;
            Boolean boolBoxBoolean2 = request.getData().getHydrate_contract_groups() ? boxing.boxBoolean(request.getData().getHydrate_contract_groups()) : null;
            c3609222.label = 1;
            objListEvents = instrumentServiceRetrofit.ListEvents(metadata, ids, boolBoxBoolean, categories, boolBoxBoolean2, c3609222);
            if (objListEvents == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListEvents);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListEvents);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetContractDisplayDetails(GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto, Continuation<? super GetContractDisplayDetailsResponseDto> continuation) {
        C360811 c360811;
        if (continuation instanceof C360811) {
            c360811 = (C360811) continuation;
            int i = c360811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360811.label = i - Integer.MIN_VALUE;
            } else {
                c360811 = new C360811(continuation);
            }
        }
        Object objGetContractDisplayDetails = c360811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360811.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetContractDisplayDetails);
            Request<GetContractDisplayDetailsRequestDto> request = new Request<>(getContractDisplayDetailsRequestDto, null, 2, null);
            c360811.label = 1;
            objGetContractDisplayDetails = GetContractDisplayDetails(request, c360811);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetContractDisplayDetails(Request<GetContractDisplayDetailsRequestDto> request, Continuation<? super Response<GetContractDisplayDetailsResponseDto>> continuation) {
        C360822 c360822;
        if (continuation instanceof C360822) {
            c360822 = (C360822) continuation;
            int i = c360822.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360822.label = i - Integer.MIN_VALUE;
            } else {
                c360822 = new C360822(continuation);
            }
        }
        Object objGetContractDisplayDetails = c360822.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360822.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetContractDisplayDetails);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String contract_id = !Intrinsics.areEqual(request.getData().getContract_id(), "") ? request.getData().getContract_id() : null;
            YesNoDto yes_no = request.getData().getYes_no() != YesNoDto.INSTANCE.getZeroValue() ? request.getData().getYes_no() : null;
            c360822.label = 1;
            objGetContractDisplayDetails = instrumentServiceRetrofit.GetContractDisplayDetails(metadata, contract_id, yes_no, c360822);
            if (objGetContractDisplayDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetContractDisplayDetails);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetContractDisplayDetails);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrderFormDisplayDetails(GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto, Continuation<? super GetOrderFormDisplayDetailsResponseDto> continuation) {
        C360871 c360871;
        if (continuation instanceof C360871) {
            c360871 = (C360871) continuation;
            int i = c360871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360871.label = i - Integer.MIN_VALUE;
            } else {
                c360871 = new C360871(continuation);
            }
        }
        Object objGetOrderFormDisplayDetails = c360871.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360871.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOrderFormDisplayDetails);
            Request<GetOrderFormDisplayDetailsRequestDto> request = new Request<>(getOrderFormDisplayDetailsRequestDto, null, 2, null);
            c360871.label = 1;
            objGetOrderFormDisplayDetails = GetOrderFormDisplayDetails(request, c360871);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrderFormDisplayDetails(Request<GetOrderFormDisplayDetailsRequestDto> request, Continuation<? super Response<GetOrderFormDisplayDetailsResponseDto>> continuation) {
        C360882 c360882;
        if (continuation instanceof C360882) {
            c360882 = (C360882) continuation;
            int i = c360882.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360882.label = i - Integer.MIN_VALUE;
            } else {
                c360882 = new C360882(continuation);
            }
        }
        C360882 c3608822 = c360882;
        Object objGetOrderFormDisplayDetails = c3608822.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3608822.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOrderFormDisplayDetails);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String contract_id = !Intrinsics.areEqual(request.getData().getContract_id(), "") ? request.getData().getContract_id() : null;
            YesNoDto yes_no_from_contract_element = request.getData().getYes_no_from_contract_element() != YesNoDto.INSTANCE.getZeroValue() ? request.getData().getYes_no_from_contract_element() : null;
            PositionEffectDto position_effect = request.getData().getPosition_effect() != PositionEffectDto.INSTANCE.getZeroValue() ? request.getData().getPosition_effect() : null;
            OrderFormTypeDto order_form_type = request.getData().getOrder_form_type() != OrderFormTypeDto.INSTANCE.getZeroValue() ? request.getData().getOrder_form_type() : null;
            c3608822.label = 1;
            objGetOrderFormDisplayDetails = instrumentServiceRetrofit.GetOrderFormDisplayDetails(metadata, contract_id, yes_no_from_contract_element, position_effect, order_form_type, c3608822);
            if (objGetOrderFormDisplayDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetOrderFormDisplayDetails);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetOrderFormDisplayDetails);
    }
}
