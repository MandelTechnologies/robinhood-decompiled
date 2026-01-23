package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InstrumentService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0018H¦@¢\u0006\u0002\u0010\u0019J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00180\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u001cH¦@¢\u0006\u0002\u0010\u001dJ\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001c0\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentService;", "", "GetEventContract", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventContractResponseDto;", "request", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventContractRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEventContracts", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventContractsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventContractsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventContractsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEvent", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEvents", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetContractDisplayDetails", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetOrderFormDisplayDetails", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface InstrumentService {

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {33}, m3647m = "GetContractDisplayDetails")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.InstrumentService$GetContractDisplayDetails$1 */
    static final class C360401 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360401(Continuation<? super C360401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetContractDisplayDetails(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {25}, m3647m = "GetEvent")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.InstrumentService$GetEvent$1 */
    static final class C360411 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360411(Continuation<? super C360411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetEvent(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {17}, m3647m = "GetEventContract")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.InstrumentService$GetEventContract$1 */
    static final class C360421 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360421(Continuation<? super C360421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetEventContract(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {37}, m3647m = "GetOrderFormDisplayDetails")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.InstrumentService$GetOrderFormDisplayDetails$1 */
    static final class C360431 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360431(Continuation<? super C360431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetOrderFormDisplayDetails(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {21}, m3647m = "ListEventContracts")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.InstrumentService$ListEventContracts$1 */
    static final class C360441 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360441(Continuation<? super C360441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ListEventContracts(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {29}, m3647m = "ListEvents")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.InstrumentService$ListEvents$1 */
    static final class C360451 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360451(Continuation<? super C360451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ListEvents(null, null, this);
        }
    }

    Object GetContractDisplayDetails(Request<GetContractDisplayDetailsRequestDto> request, Continuation<? super Response<GetContractDisplayDetailsResponseDto>> continuation);

    Object GetContractDisplayDetails(GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto, Continuation<? super GetContractDisplayDetailsResponseDto> continuation);

    Object GetEvent(Request<GetEventRequestDto> request, Continuation<? super Response<GetEventResponseDto>> continuation);

    Object GetEvent(GetEventRequestDto getEventRequestDto, Continuation<? super GetEventResponseDto> continuation);

    Object GetEventContract(Request<GetEventContractRequestDto> request, Continuation<? super Response<GetEventContractResponseDto>> continuation);

    Object GetEventContract(GetEventContractRequestDto getEventContractRequestDto, Continuation<? super GetEventContractResponseDto> continuation);

    Object GetOrderFormDisplayDetails(Request<GetOrderFormDisplayDetailsRequestDto> request, Continuation<? super Response<GetOrderFormDisplayDetailsResponseDto>> continuation);

    Object GetOrderFormDisplayDetails(GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto, Continuation<? super GetOrderFormDisplayDetailsResponseDto> continuation);

    Object ListEventContracts(Request<ListEventContractsRequestDto> request, Continuation<? super Response<ListEventContractsResponseDto>> continuation);

    Object ListEventContracts(ListEventContractsRequestDto listEventContractsRequestDto, Continuation<? super ListEventContractsResponseDto> continuation);

    Object ListEvents(Request<ListEventsRequestDto> request, Continuation<? super Response<ListEventsResponseDto>> continuation);

    Object ListEvents(ListEventsRequestDto listEventsRequestDto, Continuation<? super ListEventsResponseDto> continuation);

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetEventContract(InstrumentService instrumentService, Request<GetEventContractRequestDto> request, Continuation<? super Response<GetEventContractResponseDto>> continuation) {
            C360421 c360421;
            if (continuation instanceof C360421) {
                c360421 = (C360421) continuation;
                int i = c360421.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c360421.label = i - Integer.MIN_VALUE;
                } else {
                    c360421 = new C360421(continuation);
                }
            }
            Object objGetEventContract = c360421.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c360421.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetEventContract);
                GetEventContractRequestDto data = request.getData();
                c360421.label = 1;
                objGetEventContract = instrumentService.GetEventContract(data, c360421);
                if (objGetEventContract == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetEventContract);
            }
            return new Response(objGetEventContract, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ListEventContracts(InstrumentService instrumentService, Request<ListEventContractsRequestDto> request, Continuation<? super Response<ListEventContractsResponseDto>> continuation) {
            C360441 c360441;
            if (continuation instanceof C360441) {
                c360441 = (C360441) continuation;
                int i = c360441.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c360441.label = i - Integer.MIN_VALUE;
                } else {
                    c360441 = new C360441(continuation);
                }
            }
            Object objListEventContracts = c360441.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c360441.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListEventContracts);
                ListEventContractsRequestDto data = request.getData();
                c360441.label = 1;
                objListEventContracts = instrumentService.ListEventContracts(data, c360441);
                if (objListEventContracts == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListEventContracts);
            }
            return new Response(objListEventContracts, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetEvent(InstrumentService instrumentService, Request<GetEventRequestDto> request, Continuation<? super Response<GetEventResponseDto>> continuation) {
            C360411 c360411;
            if (continuation instanceof C360411) {
                c360411 = (C360411) continuation;
                int i = c360411.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c360411.label = i - Integer.MIN_VALUE;
                } else {
                    c360411 = new C360411(continuation);
                }
            }
            Object objGetEvent = c360411.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c360411.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetEvent);
                GetEventRequestDto data = request.getData();
                c360411.label = 1;
                objGetEvent = instrumentService.GetEvent(data, c360411);
                if (objGetEvent == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetEvent);
            }
            return new Response(objGetEvent, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ListEvents(InstrumentService instrumentService, Request<ListEventsRequestDto> request, Continuation<? super Response<ListEventsResponseDto>> continuation) {
            C360451 c360451;
            if (continuation instanceof C360451) {
                c360451 = (C360451) continuation;
                int i = c360451.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c360451.label = i - Integer.MIN_VALUE;
                } else {
                    c360451 = new C360451(continuation);
                }
            }
            Object objListEvents = c360451.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c360451.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListEvents);
                ListEventsRequestDto data = request.getData();
                c360451.label = 1;
                objListEvents = instrumentService.ListEvents(data, c360451);
                if (objListEvents == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListEvents);
            }
            return new Response(objListEvents, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetContractDisplayDetails(InstrumentService instrumentService, Request<GetContractDisplayDetailsRequestDto> request, Continuation<? super Response<GetContractDisplayDetailsResponseDto>> continuation) {
            C360401 c360401;
            if (continuation instanceof C360401) {
                c360401 = (C360401) continuation;
                int i = c360401.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c360401.label = i - Integer.MIN_VALUE;
                } else {
                    c360401 = new C360401(continuation);
                }
            }
            Object objGetContractDisplayDetails = c360401.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c360401.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetContractDisplayDetails);
                GetContractDisplayDetailsRequestDto data = request.getData();
                c360401.label = 1;
                objGetContractDisplayDetails = instrumentService.GetContractDisplayDetails(data, c360401);
                if (objGetContractDisplayDetails == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetContractDisplayDetails);
            }
            return new Response(objGetContractDisplayDetails, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetOrderFormDisplayDetails(InstrumentService instrumentService, Request<GetOrderFormDisplayDetailsRequestDto> request, Continuation<? super Response<GetOrderFormDisplayDetailsResponseDto>> continuation) {
            C360431 c360431;
            if (continuation instanceof C360431) {
                c360431 = (C360431) continuation;
                int i = c360431.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c360431.label = i - Integer.MIN_VALUE;
                } else {
                    c360431 = new C360431(continuation);
                }
            }
            Object objGetOrderFormDisplayDetails = c360431.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c360431.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetOrderFormDisplayDetails);
                GetOrderFormDisplayDetailsRequestDto data = request.getData();
                c360431.label = 1;
                objGetOrderFormDisplayDetails = instrumentService.GetOrderFormDisplayDetails(data, c360431);
                if (objGetOrderFormDisplayDetails == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetOrderFormDisplayDetails);
            }
            return new Response(objGetOrderFormDisplayDetails, null, 2, null);
        }
    }
}
