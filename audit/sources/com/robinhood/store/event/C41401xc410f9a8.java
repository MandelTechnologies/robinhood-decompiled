package com.robinhood.store.event;

import com.robinhood.idl.Dto3;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService;
import com.robinhood.prediction_markets.proto.p361v1.idl.ListEventsRequestDto;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import com.robinhood.utils.extensions.Uuids;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EventStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/MessageDto;", "Params", "", "params", "com/robinhood/store/event/EventStore$createExperimentBasedEndpoint$1"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$special$$inlined$createExperimentBasedEndpoint$default$5", m3645f = "EventStore.kt", m3646l = {570, 581, 576, 584}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.event.EventStore$special$$inlined$createExperimentBasedEndpoint$default$5 */
/* loaded from: classes12.dex */
public final class C41401xc410f9a8 extends ContinuationImpl7 implements Function2<List<? extends UUID>, Continuation<? super Response<? extends Dto3<?>>>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ EventStore this$0;
    final /* synthetic */ EventStore this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41401xc410f9a8(EventStore eventStore, Continuation continuation, EventStore eventStore2, EventStore eventStore3) {
        super(2, continuation);
        this.this$0$inline_fun = eventStore;
        this.this$0 = eventStore2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventStore eventStore = this.this$0$inline_fun;
        EventStore eventStore2 = this.this$0;
        C41401xc410f9a8 c41401xc410f9a8 = new C41401xc410f9a8(eventStore, continuation, eventStore2, eventStore2);
        c41401xc410f9a8.L$0 = obj;
        return c41401xc410f9a8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends UUID> list, Continuation<? super Response<? extends Dto3<?>>> continuation) {
        return ((C41401xc410f9a8) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
    
        if (r2 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e1, code lost:
    
        if (r2 == r1) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objFirstOrNull;
        Object objListEvents;
        InstrumentService instrumentService;
        ListEventsRequestDto listEventsRequestDto;
        Object objBuildRequestHeader;
        Object objListEvents2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            obj2 = this.L$0;
            Flow flow = this.this$0$inline_fun.shouldUseBffEndpoints;
            this.L$0 = obj2;
            this.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flow, this);
            if (objFirstOrNull != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            obj2 = this.L$0;
            ResultKt.throwOnFailure(obj);
            objFirstOrNull = obj;
        } else {
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    objListEvents2 = obj;
                    return (Response) objListEvents2;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objListEvents = obj;
                return (Response) objListEvents;
            }
            InstrumentService instrumentService2 = (InstrumentService) this.L$1;
            ListEventsRequestDto listEventsRequestDto2 = (ListEventsRequestDto) this.L$0;
            ResultKt.throwOnFailure(obj);
            listEventsRequestDto = listEventsRequestDto2;
            instrumentService = instrumentService2;
            objBuildRequestHeader = obj;
            Request<ListEventsRequestDto> request = new Request<>(listEventsRequestDto, (Map) objBuildRequestHeader);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            objListEvents2 = instrumentService.ListEvents(request, this);
        }
        if (Intrinsics.areEqual(objFirstOrNull, boxing.boxBoolean(true))) {
            instrumentService = this.this$0.predictionMarketsInstrumentService;
            listEventsRequestDto = new ListEventsRequestDto(CollectionsKt.joinToString$default((List) obj2, ",", null, null, 0, null, new Function1<UUID, CharSequence>() { // from class: com.robinhood.store.event.EventStore$getEventList$2$1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(UUID it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Uuids.safeToString(it);
                }
            }, 30, null), false, null, false, 14, null);
            PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2 = this.this$0.requestHeaderPlugin;
            this.L$0 = listEventsRequestDto;
            this.L$1 = instrumentService;
            this.label = 2;
            objBuildRequestHeader = predictionMarketsRequestHeaderDelegate2.buildRequestHeader(this);
            if (objBuildRequestHeader != coroutine_suspended) {
                Request<ListEventsRequestDto> request2 = new Request<>(listEventsRequestDto, (Map) objBuildRequestHeader);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                objListEvents2 = instrumentService.ListEvents(request2, this);
            }
        } else {
            com.robinhood.arsenal.proto.p281v1.idl.InstrumentService instrumentService3 = this.this$0.instrumentService;
            Request<com.robinhood.arsenal.proto.p281v1.idl.ListEventsRequestDto> request3 = new Request<>(new com.robinhood.arsenal.proto.p281v1.idl.ListEventsRequestDto(CollectionsKt.joinToString$default((List) obj2, ",", null, null, 0, null, new Function1<UUID, CharSequence>() { // from class: com.robinhood.store.event.EventStore$getEventList$1$1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(UUID it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Uuids.safeToString(it);
                }
            }, 30, null), null, 2, null), null, 2, null);
            this.L$0 = null;
            this.label = 4;
            objListEvents = instrumentService3.ListEvents(request3, this);
        }
        return coroutine_suspended;
    }
}
