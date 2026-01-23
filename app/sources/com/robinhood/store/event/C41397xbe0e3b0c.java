package com.robinhood.store.event;

import com.robinhood.arsenal.proto.p281v1.idl.EventDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetEventResponseDto;
import com.robinhood.store.event.EventStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\n¨\u0006\u0005"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/MessageDto;", "com/robinhood/store/event/EventStore$createExperimentBasedEndpoint$2"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$special$$inlined$createExperimentBasedEndpoint$default$10", m3645f = "EventStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.event.EventStore$special$$inlined$createExperimentBasedEndpoint$default$10 */
/* loaded from: classes12.dex */
public final class C41397xbe0e3b0c extends ContinuationImpl7 implements Function2<Response<? extends Dto3<?>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41397xbe0e3b0c(Continuation continuation, EventStore eventStore) {
        super(2, continuation);
        this.this$0 = eventStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C41397xbe0e3b0c c41397xbe0e3b0c = new C41397xbe0e3b0c(continuation, this.this$0);
        c41397xbe0e3b0c.L$0 = obj;
        return c41397xbe0e3b0c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<? extends Dto3<?>> response, Continuation<? super Unit> continuation) {
        return ((C41397xbe0e3b0c) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Dto3 dto3 = (Dto3) ((Response) this.L$0).getData();
        EventStore.FullEventInfoWrapper fullEventInfoWrapperFromArsenalEvent = null;
        if (!(dto3 instanceof GetEventResponseDto)) {
            if (dto3 instanceof EventDto) {
                fullEventInfoWrapperFromArsenalEvent = EventStore.FullEventInfoWrapper.INSTANCE.fromArsenalEvent(CollectionsKt.listOf((EventDto) dto3));
            }
        } else {
            com.robinhood.prediction_markets.proto.p361v1.idl.EventDto event = ((GetEventResponseDto) dto3).getEvent();
            if (event != null) {
                fullEventInfoWrapperFromArsenalEvent = EventStore.FullEventInfoWrapper.INSTANCE.fromBffEvent(CollectionsKt.listOf(event));
            }
        }
        if (fullEventInfoWrapperFromArsenalEvent != null) {
            this.this$0.insert(fullEventInfoWrapperFromArsenalEvent);
        }
        return Unit.INSTANCE;
    }
}
