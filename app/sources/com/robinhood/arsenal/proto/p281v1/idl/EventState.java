package com.robinhood.arsenal.proto.p281v1.idl;

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
/* compiled from: EventState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_STATE_UNSPECIFIED", "EVENT_STATE_ACTIVE", "EVENT_STATE_INACTIVE", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class EventState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventState[] $VALUES;

    @JvmField
    public static final ProtoAdapter<EventState> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EventState EVENT_STATE_ACTIVE;
    public static final EventState EVENT_STATE_INACTIVE;
    public static final EventState EVENT_STATE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ EventState[] $values() {
        return new EventState[]{EVENT_STATE_UNSPECIFIED, EVENT_STATE_ACTIVE, EVENT_STATE_INACTIVE};
    }

    @JvmStatic
    public static final EventState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<EventState> getEntries() {
        return $ENTRIES;
    }

    private EventState(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final EventState eventState = new EventState("EVENT_STATE_UNSPECIFIED", 0, 0);
        EVENT_STATE_UNSPECIFIED = eventState;
        EVENT_STATE_ACTIVE = new EventState("EVENT_STATE_ACTIVE", 1, 1);
        EVENT_STATE_INACTIVE = new EventState("EVENT_STATE_INACTIVE", 2, 2);
        EventState[] eventStateArr$values = $values();
        $VALUES = eventStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(eventStateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<EventState>(orCreateKotlinClass, syntax, eventState) { // from class: com.robinhood.arsenal.proto.v1.idl.EventState$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public EventState fromValue(int value) {
                return EventState.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: EventState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/arsenal/proto/v1/idl/EventState;", "fromValue", "value", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventState fromValue(int value) {
            if (value == 0) {
                return EventState.EVENT_STATE_UNSPECIFIED;
            }
            if (value == 1) {
                return EventState.EVENT_STATE_ACTIVE;
            }
            if (value != 2) {
                return null;
            }
            return EventState.EVENT_STATE_INACTIVE;
        }
    }

    public static EventState valueOf(String str) {
        return (EventState) Enum.valueOf(EventState.class, str);
    }

    public static EventState[] values() {
        return (EventState[]) $VALUES.clone();
    }
}
