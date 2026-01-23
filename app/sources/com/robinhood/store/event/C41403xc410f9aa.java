package com.robinhood.store.event;

import com.robinhood.arsenal.proto.p281v1.idl.ListEventsRequestDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.EventContractDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetEventContractRequestDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetEventContractResponseDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetEventRequestDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import com.robinhood.utils.extensions.Uuids;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EventStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/MessageDto;", "Params", "", "params", "com/robinhood/store/event/EventStore$createExperimentBasedEndpoint$1"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$special$$inlined$createExperimentBasedEndpoint$default$7", m3645f = "EventStore.kt", m3646l = {570, 576, 583, 585, 579, 588}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.event.EventStore$special$$inlined$createExperimentBasedEndpoint$default$7 */
/* loaded from: classes12.dex */
public final class C41403xc410f9aa extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Response<? extends Dto3<?>>>, Object> {
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ EventStore this$0;
    final /* synthetic */ EventStore this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41403xc410f9aa(EventStore eventStore, Continuation continuation, EventStore eventStore2, EventStore eventStore3) {
        super(2, continuation);
        this.this$0$inline_fun = eventStore;
        this.this$0 = eventStore2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventStore eventStore = this.this$0$inline_fun;
        EventStore eventStore2 = this.this$0;
        C41403xc410f9aa c41403xc410f9aa = new C41403xc410f9aa(eventStore, continuation, eventStore2, eventStore2);
        c41403xc410f9aa.L$0 = obj;
        return c41403xc410f9aa;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super Response<? extends Dto3<?>>> continuation) {
        return ((C41403xc410f9aa) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fd, code lost:
    
        if (r14 != r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
    
        if (r14 == r0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        InstrumentService instrumentService;
        EventContractDto event_contract;
        String event_id;
        int i;
        String parent_event_id;
        GetEventRequestDto getEventRequestDto;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                obj2 = this.L$0;
                Flow flow = this.this$0$inline_fun.shouldUseBffEndpoints;
                this.L$0 = obj2;
                this.label = 1;
                obj = FlowKt.firstOrNull(flow, this);
                if (obj != coroutine_suspended) {
                    if (!Intrinsics.areEqual(obj, boxing.boxBoolean(true))) {
                        InstrumentService instrumentService2 = this.this$0.predictionMarketsInstrumentService;
                        GetEventContractRequestDto getEventContractRequestDto = new GetEventContractRequestDto(Uuids.safeToString((UUID) obj2));
                        this.L$0 = null;
                        this.label = 2;
                        obj = instrumentService2.GetEventContract(getEventContractRequestDto, this);
                        if (obj != coroutine_suspended) {
                            GetEventContractResponseDto getEventContractResponseDto = (GetEventContractResponseDto) obj;
                            instrumentService = this.this$0.predictionMarketsInstrumentService;
                            event_contract = getEventContractResponseDto.getEvent_contract();
                            if (event_contract != null || (parent_event_id = event_contract.getParent_event_id()) == null) {
                                EventContractDto event_contract2 = getEventContractResponseDto.getEvent_contract();
                                event_id = event_contract2 == null ? event_contract2.getEvent_id() : "";
                            } else {
                                event_id = parent_event_id;
                            }
                            EventStore eventStore = this.this$0;
                            this.L$0 = event_id;
                            this.L$1 = instrumentService;
                            this.I$0 = 0;
                            this.label = 3;
                            obj = eventStore.isInGdpExperimentEnabled(this);
                            if (obj != coroutine_suspended) {
                                i = 0;
                                GetEventRequestDto getEventRequestDto2 = new GetEventRequestDto(event_id, i == 0, ((Boolean) obj).booleanValue(), null, 10, null);
                                PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2 = this.this$0.requestHeaderPlugin;
                                this.L$0 = getEventRequestDto2;
                                this.L$1 = instrumentService;
                                this.label = 4;
                                obj = predictionMarketsRequestHeaderDelegate2.buildRequestHeader(this);
                                if (obj != coroutine_suspended) {
                                    getEventRequestDto = getEventRequestDto2;
                                    Request<GetEventRequestDto> request = new Request<>(getEventRequestDto, (Map) obj);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.label = 5;
                                    obj = instrumentService.GetEvent(request, this);
                                    break;
                                }
                            }
                        }
                    } else {
                        com.robinhood.arsenal.proto.p281v1.idl.InstrumentService instrumentService3 = this.this$0.instrumentService;
                        Request<ListEventsRequestDto> request2 = new Request<>(new ListEventsRequestDto(null, Uuids.safeToString((UUID) obj2), 1, null), null, 2, null);
                        this.L$0 = null;
                        this.label = 6;
                        obj = instrumentService3.ListEvents(request2, this);
                        break;
                    }
                }
                return coroutine_suspended;
            case 1:
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!Intrinsics.areEqual(obj, boxing.boxBoolean(true))) {
                }
                return coroutine_suspended;
            case 2:
                ResultKt.throwOnFailure(obj);
                GetEventContractResponseDto getEventContractResponseDto2 = (GetEventContractResponseDto) obj;
                instrumentService = this.this$0.predictionMarketsInstrumentService;
                event_contract = getEventContractResponseDto2.getEvent_contract();
                if (event_contract != null) {
                    break;
                }
                EventContractDto event_contract22 = getEventContractResponseDto2.getEvent_contract();
                event_id = event_contract22 == null ? event_contract22.getEvent_id() : "";
                EventStore eventStore2 = this.this$0;
                this.L$0 = event_id;
                this.L$1 = instrumentService;
                this.I$0 = 0;
                this.label = 3;
                obj = eventStore2.isInGdpExperimentEnabled(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                int i2 = this.I$0;
                InstrumentService instrumentService4 = (InstrumentService) this.L$1;
                event_id = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = i2;
                instrumentService = instrumentService4;
                GetEventRequestDto getEventRequestDto22 = new GetEventRequestDto(event_id, i == 0, ((Boolean) obj).booleanValue(), null, 10, null);
                PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate22 = this.this$0.requestHeaderPlugin;
                this.L$0 = getEventRequestDto22;
                this.L$1 = instrumentService;
                this.label = 4;
                obj = predictionMarketsRequestHeaderDelegate22.buildRequestHeader(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 4:
                instrumentService = (InstrumentService) this.L$1;
                getEventRequestDto = (GetEventRequestDto) this.L$0;
                ResultKt.throwOnFailure(obj);
                Request<GetEventRequestDto> request3 = new Request<>(getEventRequestDto, (Map) obj);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 5;
                obj = instrumentService.GetEvent(request3, this);
                break;
            case 5:
                ResultKt.throwOnFailure(obj);
                return (Response) obj;
            case 6:
                ResultKt.throwOnFailure(obj);
                return (Response) obj;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
