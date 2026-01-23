package event_contract_hub.proto.p461v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EventTopicType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Levent_contract_hub/proto/v1/EventTopicType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_TOPIC_TYPE_UNSPECIFIED", "EVENT_TOPIC_TYPE_EVENT", "EVENT_TOPIC_TYPE_BRACKET", "EVENT_TOPIC_TYPE_HUB_NODE", "Companion", "microgram.contracts.event_contract_hub.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class EventTopicType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventTopicType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<EventTopicType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EventTopicType EVENT_TOPIC_TYPE_BRACKET;
    public static final EventTopicType EVENT_TOPIC_TYPE_EVENT;
    public static final EventTopicType EVENT_TOPIC_TYPE_HUB_NODE;
    public static final EventTopicType EVENT_TOPIC_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ EventTopicType[] $values() {
        return new EventTopicType[]{EVENT_TOPIC_TYPE_UNSPECIFIED, EVENT_TOPIC_TYPE_EVENT, EVENT_TOPIC_TYPE_BRACKET, EVENT_TOPIC_TYPE_HUB_NODE};
    }

    @JvmStatic
    public static final EventTopicType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<EventTopicType> getEntries() {
        return $ENTRIES;
    }

    private EventTopicType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final EventTopicType eventTopicType = new EventTopicType("EVENT_TOPIC_TYPE_UNSPECIFIED", 0, 0);
        EVENT_TOPIC_TYPE_UNSPECIFIED = eventTopicType;
        EVENT_TOPIC_TYPE_EVENT = new EventTopicType("EVENT_TOPIC_TYPE_EVENT", 1, 1);
        EVENT_TOPIC_TYPE_BRACKET = new EventTopicType("EVENT_TOPIC_TYPE_BRACKET", 2, 2);
        EVENT_TOPIC_TYPE_HUB_NODE = new EventTopicType("EVENT_TOPIC_TYPE_HUB_NODE", 3, 3);
        EventTopicType[] eventTopicTypeArr$values = $values();
        $VALUES = eventTopicTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(eventTopicTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventTopicType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<EventTopicType>(orCreateKotlinClass, syntax, eventTopicType) { // from class: event_contract_hub.proto.v1.EventTopicType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public EventTopicType fromValue(int value) {
                return EventTopicType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: EventTopicType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Levent_contract_hub/proto/v1/EventTopicType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Levent_contract_hub/proto/v1/EventTopicType;", "fromValue", "value", "", "microgram.contracts.event_contract_hub.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventTopicType fromValue(int value) {
            if (value == 0) {
                return EventTopicType.EVENT_TOPIC_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return EventTopicType.EVENT_TOPIC_TYPE_EVENT;
            }
            if (value == 2) {
                return EventTopicType.EVENT_TOPIC_TYPE_BRACKET;
            }
            if (value != 3) {
                return null;
            }
            return EventTopicType.EVENT_TOPIC_TYPE_HUB_NODE;
        }
    }

    public static EventTopicType valueOf(String str) {
        return (EventTopicType) Enum.valueOf(EventTopicType.class, str);
    }

    public static EventTopicType[] values() {
        return (EventTopicType[]) $VALUES.clone();
    }
}
