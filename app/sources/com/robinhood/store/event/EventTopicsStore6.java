package com.robinhood.store.event;

import com.robinhood.arsenal.proto.p281v1.idl.EventTopicDto;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import com.robinhood.arsenal.proto.p281v1.idl.ListRelevantEventTopicsRequestDto;
import com.robinhood.arsenal.proto.p281v1.idl.ListRelevantEventTopicsResponseDto;
import com.robinhood.utils.extensions.Uuids;
import java.util.List;
import java.util.UUID;
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
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Ljava/util/UUID;", "", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto;", "topicId"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventTopicsStore$getRelevantTopicsListEndpoint$1", m3645f = "EventTopicsStore.kt", m3646l = {96}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.EventTopicsStore$getRelevantTopicsListEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class EventTopicsStore6 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Tuples2<? extends UUID, ? extends List<? extends EventTopicDto>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventTopicsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventTopicsStore6(EventTopicsStore eventTopicsStore, Continuation<? super EventTopicsStore6> continuation) {
        super(2, continuation);
        this.this$0 = eventTopicsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventTopicsStore6 eventTopicsStore6 = new EventTopicsStore6(this.this$0, continuation);
        eventTopicsStore6.L$0 = obj;
        return eventTopicsStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(UUID uuid, Continuation<? super Tuples2<? extends UUID, ? extends List<? extends EventTopicDto>>> continuation) {
        return invoke2(uuid, (Continuation<? super Tuples2<UUID, ? extends List<EventTopicDto>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(UUID uuid, Continuation<? super Tuples2<UUID, ? extends List<EventTopicDto>>> continuation) {
        return ((EventTopicsStore6) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        UUID uuid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid2 = (UUID) this.L$0;
            InstrumentService instrumentService = this.this$0.instrumentService;
            ListRelevantEventTopicsRequestDto listRelevantEventTopicsRequestDto = new ListRelevantEventTopicsRequestDto(Uuids.safeToString(uuid2), false, 2, null);
            this.L$0 = uuid2;
            this.label = 1;
            Object objListRelevantEventTopics = instrumentService.ListRelevantEventTopics(listRelevantEventTopicsRequestDto, this);
            if (objListRelevantEventTopics == coroutine_suspended) {
                return coroutine_suspended;
            }
            uuid = uuid2;
            obj = objListRelevantEventTopics;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uuid = (UUID) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Tuples4.m3642to(uuid, ((ListRelevantEventTopicsResponseDto) obj).getResults());
    }
}
