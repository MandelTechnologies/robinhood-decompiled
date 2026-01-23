package com.robinhood.android.eventcontracts.hub;

import com.robinhood.android.models.event.p186db.arsenal.EventTopic;
import com.robinhood.android.models.event.p186db.arsenal.EventTopic4;
import com.robinhood.utils.extensions.Uuids;
import event_contract_hub.proto.p461v1.EventTopicDto;
import event_contract_hub.proto.p461v1.EventTopicTypeDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventTopicDtoMapper.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002¨\u0006\b"}, m3636d2 = {"toIdlEventTopic", "Levent_contract_hub/proto/v1/EventTopicDto;", "Lcom/robinhood/android/models/event/db/arsenal/EventTopic;", "rank", "", "toIdlEventTopicType", "Levent_contract_hub/proto/v1/EventTopicTypeDto;", "Lcom/robinhood/android/models/event/db/arsenal/EventTopicType;", "lib-event-contract-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.EventTopicDtoMapperKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventTopicDtoMapper {

    /* compiled from: EventTopicDtoMapper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.hub.EventTopicDtoMapperKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventTopic4.values().length];
            try {
                iArr[EventTopic4.EVENT_TOPIC_TYPE_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventTopic4.EVENT_TOPIC_TYPE_BRACKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventTopic4.EVENT_TOPIC_TYPE_HUB_NODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EventTopic4.EVENT_TOPIC_TYPE_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final EventTopicDto toIdlEventTopic(EventTopic eventTopic, int i) {
        Intrinsics.checkNotNullParameter(eventTopic, "<this>");
        return new EventTopicDto(Uuids.safeToString(eventTopic.getId()), eventTopic.getName(), eventTopic.getCategory(), toIdlEventTopicType(eventTopic.getType()), Uuids.safeToString(eventTopic.getTypeId()), eventTopic.getImageUrl(), eventTopic.getDarkImageUrl(), i);
    }

    private static final EventTopicTypeDto toIdlEventTopicType(EventTopic4 eventTopic4) {
        int i = WhenMappings.$EnumSwitchMapping$0[eventTopic4.ordinal()];
        if (i == 1) {
            return EventTopicTypeDto.EVENT_TOPIC_TYPE_EVENT;
        }
        if (i == 2) {
            return EventTopicTypeDto.EVENT_TOPIC_TYPE_BRACKET;
        }
        if (i == 3) {
            return EventTopicTypeDto.EVENT_TOPIC_TYPE_UNSPECIFIED;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return EventTopicTypeDto.EVENT_TOPIC_TYPE_UNSPECIFIED;
    }
}
