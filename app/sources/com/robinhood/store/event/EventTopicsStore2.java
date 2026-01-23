package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.arsenal.EventTopic;
import com.robinhood.android.models.event.p186db.arsenal.EventTopic2;
import com.robinhood.arsenal.proto.p281v1.idl.EventTopicDto;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import com.robinhood.arsenal.proto.p281v1.idl.ListEventTopicsRequestDto;
import com.robinhood.arsenal.proto.p281v1.idl.ListEventTopicsResponseDto;
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

/* compiled from: EventTopicsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/models/event/db/arsenal/EventTopic;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventTopicsStore$getAllEventTopicsListEndPoint$1", m3645f = "EventTopicsStore.kt", m3646l = {55}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.event.EventTopicsStore$getAllEventTopicsListEndPoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class EventTopicsStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super List<? extends EventTopic>>, Object> {
    int label;
    final /* synthetic */ EventTopicsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventTopicsStore2(EventTopicsStore eventTopicsStore, Continuation<? super EventTopicsStore2> continuation) {
        super(2, continuation);
        this.this$0 = eventTopicsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EventTopicsStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super List<? extends EventTopic>> continuation) {
        return invoke2(unit, (Continuation<? super List<EventTopic>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Unit unit, Continuation<? super List<EventTopic>> continuation) {
        return ((EventTopicsStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InstrumentService instrumentService = this.this$0.instrumentService;
            ListEventTopicsRequestDto listEventTopicsRequestDto = new ListEventTopicsRequestDto(null, null, false, false, true, false, 47, null);
            this.label = 1;
            obj = instrumentService.ListEventTopics(listEventTopicsRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List<EventTopicDto> results = ((ListEventTopicsResponseDto) obj).getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(EventTopic2.toDbModel((EventTopicDto) it.next()));
        }
        return arrayList;
    }
}
