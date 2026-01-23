package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.arsenal.EventTopic2;
import com.robinhood.android.models.event.p186db.arsenal.EventTopic3;
import com.robinhood.arsenal.proto.p281v1.idl.EventTopicDto;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import com.robinhood.arsenal.proto.p281v1.idl.ListEventTopicsRequestDto;
import com.robinhood.arsenal.proto.p281v1.idl.ListEventTopicsResponseDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EventTopicsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto;", "Lcom/robinhood/android/models/event/db/arsenal/EventTopicLocation;", "location"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventTopicsStore$getEventTopicsListByLocationEndpoint$1", m3645f = "EventTopicsStore.kt", m3646l = {37}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.EventTopicsStore$getEventTopicsListByLocationEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class EventTopicsStore4 extends ContinuationImpl7 implements Function2<EventTopic3, Continuation<? super Tuples2<? extends List<? extends EventTopicDto>, ? extends EventTopic3>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventTopicsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventTopicsStore4(EventTopicsStore eventTopicsStore, Continuation<? super EventTopicsStore4> continuation) {
        super(2, continuation);
        this.this$0 = eventTopicsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventTopicsStore4 eventTopicsStore4 = new EventTopicsStore4(this.this$0, continuation);
        eventTopicsStore4.L$0 = obj;
        return eventTopicsStore4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(EventTopic3 eventTopic3, Continuation<? super Tuples2<? extends List<EventTopicDto>, ? extends EventTopic3>> continuation) {
        return ((EventTopicsStore4) create(eventTopic3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(EventTopic3 eventTopic3, Continuation<? super Tuples2<? extends List<? extends EventTopicDto>, ? extends EventTopic3>> continuation) {
        return invoke2(eventTopic3, (Continuation<? super Tuples2<? extends List<EventTopicDto>, ? extends EventTopic3>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        EventTopic3 eventTopic3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EventTopic3 eventTopic32 = (EventTopic3) this.L$0;
            InstrumentService instrumentService = this.this$0.instrumentService;
            ListEventTopicsRequestDto listEventTopicsRequestDto = new ListEventTopicsRequestDto(null, EventTopic2.toApiModel(eventTopic32), false, false, true, false, 45, null);
            this.L$0 = eventTopic32;
            this.label = 1;
            Object objListEventTopics = instrumentService.ListEventTopics(listEventTopicsRequestDto, this);
            if (objListEventTopics == coroutine_suspended) {
                return coroutine_suspended;
            }
            eventTopic3 = eventTopic32;
            obj = objListEventTopics;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eventTopic3 = (EventTopic3) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Tuples4.m3642to(((ListEventTopicsResponseDto) obj).getResults(), eventTopic3);
    }
}
