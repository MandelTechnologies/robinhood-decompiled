package com.robinhood.prediction_markets.proto.p361v1.idl;

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
/* compiled from: EventViewMode.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventViewMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_VIEW_MODE_UNSPECIFIED", "EVENT_VIEW_MODE_PAIR", "EVENT_VIEW_MODE_MULTI", "EVENT_VIEW_MODE_SINGLE", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class EventViewMode implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventViewMode[] $VALUES;

    @JvmField
    public static final ProtoAdapter<EventViewMode> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EventViewMode EVENT_VIEW_MODE_MULTI;
    public static final EventViewMode EVENT_VIEW_MODE_PAIR;
    public static final EventViewMode EVENT_VIEW_MODE_SINGLE;
    public static final EventViewMode EVENT_VIEW_MODE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ EventViewMode[] $values() {
        return new EventViewMode[]{EVENT_VIEW_MODE_UNSPECIFIED, EVENT_VIEW_MODE_PAIR, EVENT_VIEW_MODE_MULTI, EVENT_VIEW_MODE_SINGLE};
    }

    @JvmStatic
    public static final EventViewMode fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<EventViewMode> getEntries() {
        return $ENTRIES;
    }

    private EventViewMode(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final EventViewMode eventViewMode = new EventViewMode("EVENT_VIEW_MODE_UNSPECIFIED", 0, 0);
        EVENT_VIEW_MODE_UNSPECIFIED = eventViewMode;
        EVENT_VIEW_MODE_PAIR = new EventViewMode("EVENT_VIEW_MODE_PAIR", 1, 1);
        EVENT_VIEW_MODE_MULTI = new EventViewMode("EVENT_VIEW_MODE_MULTI", 2, 2);
        EVENT_VIEW_MODE_SINGLE = new EventViewMode("EVENT_VIEW_MODE_SINGLE", 3, 3);
        EventViewMode[] eventViewModeArr$values = $values();
        $VALUES = eventViewModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(eventViewModeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventViewMode.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<EventViewMode>(orCreateKotlinClass, syntax, eventViewMode) { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventViewMode$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public EventViewMode fromValue(int value) {
                return EventViewMode.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: EventViewMode.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventViewMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventViewMode;", "fromValue", "value", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventViewMode fromValue(int value) {
            if (value == 0) {
                return EventViewMode.EVENT_VIEW_MODE_UNSPECIFIED;
            }
            if (value == 1) {
                return EventViewMode.EVENT_VIEW_MODE_PAIR;
            }
            if (value == 2) {
                return EventViewMode.EVENT_VIEW_MODE_MULTI;
            }
            if (value != 3) {
                return null;
            }
            return EventViewMode.EVENT_VIEW_MODE_SINGLE;
        }
    }

    public static EventViewMode valueOf(String str) {
        return (EventViewMode) Enum.valueOf(EventViewMode.class, str);
    }

    public static EventViewMode[] values() {
        return (EventViewMode[]) $VALUES.clone();
    }
}
