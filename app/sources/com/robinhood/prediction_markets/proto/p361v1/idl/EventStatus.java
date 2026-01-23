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
/* compiled from: EventStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_STATUS_UNSPECIFIED", "EVENT_STATUS_UPCOMING", "EVENT_STATUS_IN_PROGRESS", "EVENT_STATUS_FINAL", "EVENT_STATUS_PAUSED", "EVENT_STATUS_CANCELED", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class EventStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventStatus[] $VALUES;

    @JvmField
    public static final ProtoAdapter<EventStatus> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EventStatus EVENT_STATUS_CANCELED;
    public static final EventStatus EVENT_STATUS_FINAL;
    public static final EventStatus EVENT_STATUS_IN_PROGRESS;
    public static final EventStatus EVENT_STATUS_PAUSED;
    public static final EventStatus EVENT_STATUS_UNSPECIFIED;
    public static final EventStatus EVENT_STATUS_UPCOMING;
    private final int value;

    private static final /* synthetic */ EventStatus[] $values() {
        return new EventStatus[]{EVENT_STATUS_UNSPECIFIED, EVENT_STATUS_UPCOMING, EVENT_STATUS_IN_PROGRESS, EVENT_STATUS_FINAL, EVENT_STATUS_PAUSED, EVENT_STATUS_CANCELED};
    }

    @JvmStatic
    public static final EventStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<EventStatus> getEntries() {
        return $ENTRIES;
    }

    private EventStatus(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final EventStatus eventStatus = new EventStatus("EVENT_STATUS_UNSPECIFIED", 0, 0);
        EVENT_STATUS_UNSPECIFIED = eventStatus;
        EVENT_STATUS_UPCOMING = new EventStatus("EVENT_STATUS_UPCOMING", 1, 1);
        EVENT_STATUS_IN_PROGRESS = new EventStatus("EVENT_STATUS_IN_PROGRESS", 2, 2);
        EVENT_STATUS_FINAL = new EventStatus("EVENT_STATUS_FINAL", 3, 3);
        EVENT_STATUS_PAUSED = new EventStatus("EVENT_STATUS_PAUSED", 4, 4);
        EVENT_STATUS_CANCELED = new EventStatus("EVENT_STATUS_CANCELED", 5, 5);
        EventStatus[] eventStatusArr$values = $values();
        $VALUES = eventStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(eventStatusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<EventStatus>(orCreateKotlinClass, syntax, eventStatus) { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventStatus$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public EventStatus fromValue(int value) {
                return EventStatus.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: EventStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventStatus;", "fromValue", "value", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventStatus fromValue(int value) {
            if (value == 0) {
                return EventStatus.EVENT_STATUS_UNSPECIFIED;
            }
            if (value == 1) {
                return EventStatus.EVENT_STATUS_UPCOMING;
            }
            if (value == 2) {
                return EventStatus.EVENT_STATUS_IN_PROGRESS;
            }
            if (value == 3) {
                return EventStatus.EVENT_STATUS_FINAL;
            }
            if (value == 4) {
                return EventStatus.EVENT_STATUS_PAUSED;
            }
            if (value != 5) {
                return null;
            }
            return EventStatus.EVENT_STATUS_CANCELED;
        }
    }

    public static EventStatus valueOf(String str) {
        return (EventStatus) Enum.valueOf(EventStatus.class, str);
    }

    public static EventStatus[] values() {
        return (EventStatus[]) $VALUES.clone();
    }
}
