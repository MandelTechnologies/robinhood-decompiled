package com.robinhood.ceres.p284v1;

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
/* compiled from: EventType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/ceres/v1/EventType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_TYPE_UNSPECIFIED", "EVENT_TYPE_FUTURES_CASH_TRANSFER", "EVENT_TYPE_FUTURES_MANUAL_CASH_CORRECTION", "EVENT_TYPE_FUTURES_EXECUTION", "EVENT_TYPE_SWAPS_CASH_TRANSFER", "EVENT_TYPE_SWAPS_MANUAL_CASH_CORRECTION", "EVENT_TYPE_SWAPS_EXECUTION", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class EventType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<EventType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EventType EVENT_TYPE_FUTURES_CASH_TRANSFER;
    public static final EventType EVENT_TYPE_FUTURES_EXECUTION;
    public static final EventType EVENT_TYPE_FUTURES_MANUAL_CASH_CORRECTION;
    public static final EventType EVENT_TYPE_SWAPS_CASH_TRANSFER;
    public static final EventType EVENT_TYPE_SWAPS_EXECUTION;
    public static final EventType EVENT_TYPE_SWAPS_MANUAL_CASH_CORRECTION;
    public static final EventType EVENT_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ EventType[] $values() {
        return new EventType[]{EVENT_TYPE_UNSPECIFIED, EVENT_TYPE_FUTURES_CASH_TRANSFER, EVENT_TYPE_FUTURES_MANUAL_CASH_CORRECTION, EVENT_TYPE_FUTURES_EXECUTION, EVENT_TYPE_SWAPS_CASH_TRANSFER, EVENT_TYPE_SWAPS_MANUAL_CASH_CORRECTION, EVENT_TYPE_SWAPS_EXECUTION};
    }

    @JvmStatic
    public static final EventType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<EventType> getEntries() {
        return $ENTRIES;
    }

    private EventType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final EventType eventType = new EventType("EVENT_TYPE_UNSPECIFIED", 0, 0);
        EVENT_TYPE_UNSPECIFIED = eventType;
        EVENT_TYPE_FUTURES_CASH_TRANSFER = new EventType("EVENT_TYPE_FUTURES_CASH_TRANSFER", 1, 1);
        EVENT_TYPE_FUTURES_MANUAL_CASH_CORRECTION = new EventType("EVENT_TYPE_FUTURES_MANUAL_CASH_CORRECTION", 2, 2);
        EVENT_TYPE_FUTURES_EXECUTION = new EventType("EVENT_TYPE_FUTURES_EXECUTION", 3, 3);
        EVENT_TYPE_SWAPS_CASH_TRANSFER = new EventType("EVENT_TYPE_SWAPS_CASH_TRANSFER", 4, 4);
        EVENT_TYPE_SWAPS_MANUAL_CASH_CORRECTION = new EventType("EVENT_TYPE_SWAPS_MANUAL_CASH_CORRECTION", 5, 5);
        EVENT_TYPE_SWAPS_EXECUTION = new EventType("EVENT_TYPE_SWAPS_EXECUTION", 6, 6);
        EventType[] eventTypeArr$values = $values();
        $VALUES = eventTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(eventTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<EventType>(orCreateKotlinClass, syntax, eventType) { // from class: com.robinhood.ceres.v1.EventType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public EventType fromValue(int value) {
                return EventType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: EventType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/EventType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/EventType;", "fromValue", "value", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventType fromValue(int value) {
            switch (value) {
                case 0:
                    return EventType.EVENT_TYPE_UNSPECIFIED;
                case 1:
                    return EventType.EVENT_TYPE_FUTURES_CASH_TRANSFER;
                case 2:
                    return EventType.EVENT_TYPE_FUTURES_MANUAL_CASH_CORRECTION;
                case 3:
                    return EventType.EVENT_TYPE_FUTURES_EXECUTION;
                case 4:
                    return EventType.EVENT_TYPE_SWAPS_CASH_TRANSFER;
                case 5:
                    return EventType.EVENT_TYPE_SWAPS_MANUAL_CASH_CORRECTION;
                case 6:
                    return EventType.EVENT_TYPE_SWAPS_EXECUTION;
                default:
                    return null;
            }
        }
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) $VALUES.clone();
    }
}
