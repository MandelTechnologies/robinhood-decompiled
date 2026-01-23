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
/* compiled from: TimelineEntryType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/TimelineEntryType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TIMELINE_ENTRY_TYPE_UNSPECIFIED", "TIMELINE_ENTRY_TYPE_OPEN", "TIMELINE_ENTRY_TYPE_PAYOUT", "TIMELINE_ENTRY_TYPE_ELECTION_DAY", "TIMELINE_ENTRY_TYPE_OTHER", "TIMELINE_ENTRY_TYPE_EVENT_DAY", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class TimelineEntryType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TimelineEntryType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TimelineEntryType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TimelineEntryType TIMELINE_ENTRY_TYPE_ELECTION_DAY;
    public static final TimelineEntryType TIMELINE_ENTRY_TYPE_EVENT_DAY;
    public static final TimelineEntryType TIMELINE_ENTRY_TYPE_OPEN;
    public static final TimelineEntryType TIMELINE_ENTRY_TYPE_OTHER;
    public static final TimelineEntryType TIMELINE_ENTRY_TYPE_PAYOUT;
    public static final TimelineEntryType TIMELINE_ENTRY_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ TimelineEntryType[] $values() {
        return new TimelineEntryType[]{TIMELINE_ENTRY_TYPE_UNSPECIFIED, TIMELINE_ENTRY_TYPE_OPEN, TIMELINE_ENTRY_TYPE_PAYOUT, TIMELINE_ENTRY_TYPE_ELECTION_DAY, TIMELINE_ENTRY_TYPE_OTHER, TIMELINE_ENTRY_TYPE_EVENT_DAY};
    }

    @JvmStatic
    public static final TimelineEntryType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TimelineEntryType> getEntries() {
        return $ENTRIES;
    }

    private TimelineEntryType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TimelineEntryType timelineEntryType = new TimelineEntryType("TIMELINE_ENTRY_TYPE_UNSPECIFIED", 0, 0);
        TIMELINE_ENTRY_TYPE_UNSPECIFIED = timelineEntryType;
        TIMELINE_ENTRY_TYPE_OPEN = new TimelineEntryType("TIMELINE_ENTRY_TYPE_OPEN", 1, 1);
        TIMELINE_ENTRY_TYPE_PAYOUT = new TimelineEntryType("TIMELINE_ENTRY_TYPE_PAYOUT", 2, 2);
        TIMELINE_ENTRY_TYPE_ELECTION_DAY = new TimelineEntryType("TIMELINE_ENTRY_TYPE_ELECTION_DAY", 3, 3);
        TIMELINE_ENTRY_TYPE_OTHER = new TimelineEntryType("TIMELINE_ENTRY_TYPE_OTHER", 4, 4);
        TIMELINE_ENTRY_TYPE_EVENT_DAY = new TimelineEntryType("TIMELINE_ENTRY_TYPE_EVENT_DAY", 5, 5);
        TimelineEntryType[] timelineEntryTypeArr$values = $values();
        $VALUES = timelineEntryTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(timelineEntryTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TimelineEntryType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TimelineEntryType>(orCreateKotlinClass, syntax, timelineEntryType) { // from class: com.robinhood.prediction_markets.proto.v1.idl.TimelineEntryType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TimelineEntryType fromValue(int value) {
                return TimelineEntryType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TimelineEntryType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/TimelineEntryType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/prediction_markets/proto/v1/idl/TimelineEntryType;", "fromValue", "value", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TimelineEntryType fromValue(int value) {
            if (value == 0) {
                return TimelineEntryType.TIMELINE_ENTRY_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return TimelineEntryType.TIMELINE_ENTRY_TYPE_OPEN;
            }
            if (value == 2) {
                return TimelineEntryType.TIMELINE_ENTRY_TYPE_PAYOUT;
            }
            if (value == 3) {
                return TimelineEntryType.TIMELINE_ENTRY_TYPE_ELECTION_DAY;
            }
            if (value == 4) {
                return TimelineEntryType.TIMELINE_ENTRY_TYPE_OTHER;
            }
            if (value != 5) {
                return null;
            }
            return TimelineEntryType.TIMELINE_ENTRY_TYPE_EVENT_DAY;
        }
    }

    public static TimelineEntryType valueOf(String str) {
        return (TimelineEntryType) Enum.valueOf(TimelineEntryType.class, str);
    }

    public static TimelineEntryType[] values() {
        return (TimelineEntryType[]) $VALUES.clone();
    }
}
