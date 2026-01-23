package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.arsenal.EventTopic3;
import com.robinhood.android.models.event.p186db.dao.EventTopicDao;
import com.robinhood.arsenal.proto.p281v1.idl.EventTopicDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EventTopicsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto;", "Lcom/robinhood/android/models/event/db/arsenal/EventTopicLocation;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventTopicsStore$getEventTopicsListByLocationEndpoint$2", m3645f = "EventTopicsStore.kt", m3646l = {47}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.EventTopicsStore$getEventTopicsListByLocationEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class EventTopicsStore5 extends ContinuationImpl7 implements Function2<Tuples2<? extends List<? extends EventTopicDto>, ? extends EventTopic3>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventTopicsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventTopicsStore5(EventTopicsStore eventTopicsStore, Continuation<? super EventTopicsStore5> continuation) {
        super(2, continuation);
        this.this$0 = eventTopicsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventTopicsStore5 eventTopicsStore5 = new EventTopicsStore5(this.this$0, continuation);
        eventTopicsStore5.L$0 = obj;
        return eventTopicsStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends List<? extends EventTopicDto>, ? extends EventTopic3> tuples2, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<? extends List<EventTopicDto>, ? extends EventTopic3>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends List<EventTopicDto>, ? extends EventTopic3> tuples2, Continuation<? super Unit> continuation) {
        return ((EventTopicsStore5) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            List<EventTopicDto> list = (List) tuples2.component1();
            EventTopic3 eventTopic3 = (EventTopic3) tuples2.component2();
            EventTopicDao eventTopicDao = this.this$0.eventTopicDao;
            this.label = 1;
            if (eventTopicDao.replaceEventTopicsByLocation(list, eventTopic3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
