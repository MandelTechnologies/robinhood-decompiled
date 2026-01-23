package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState5;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.EventStateDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetEventStateResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: EventStateStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "eventStateResponseDto", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventStateStore$getEventStateEndpoint$2", m3645f = "EventStateStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.event.EventStateStore$getEventStateEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class EventStateStore3 extends ContinuationImpl7 implements Function2<Response<? extends GetEventStateResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventStateStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventStateStore3(EventStateStore eventStateStore, Continuation<? super EventStateStore3> continuation) {
        super(2, continuation);
        this.this$0 = eventStateStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventStateStore3 eventStateStore3 = new EventStateStore3(this.this$0, continuation);
        eventStateStore3.L$0 = obj;
        return eventStateStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Response<GetEventStateResponseDto> response, Continuation<? super Unit> continuation) {
        return ((EventStateStore3) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Response<? extends GetEventStateResponseDto> response, Continuation<? super Unit> continuation) {
        return invoke2((Response<GetEventStateResponseDto>) response, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<EventStateDto> event_states = ((GetEventStateResponseDto) ((Response) this.L$0).getData()).getEvent_states();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(event_states, 10));
        Iterator<T> it = event_states.iterator();
        while (it.hasNext()) {
            arrayList.add(PredictionMarketEventState5.toDbModel((EventStateDto) it.next()));
        }
        this.this$0.predictionMarketEventStateDao.insert(arrayList);
        return Unit.INSTANCE;
    }
}
