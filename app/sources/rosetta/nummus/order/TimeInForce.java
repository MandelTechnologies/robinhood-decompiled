package rosetta.nummus.order;

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
/* compiled from: TimeInForce.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lrosetta/nummus/order/TimeInForce;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TIME_IN_FORCE__UNSPECIFIED", "TIME_IN_FORCE_GTC", "TIME_IN_FORCE_IOC", "TIME_IN_FORCE_GFD", "TIME_IN_FORCE_GFW", "TIME_IN_FORCE_GFM", "Companion", "rosetta.nummus.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class TimeInForce implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TimeInForce[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TimeInForce> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TimeInForce TIME_IN_FORCE_GFD;
    public static final TimeInForce TIME_IN_FORCE_GFM;
    public static final TimeInForce TIME_IN_FORCE_GFW;
    public static final TimeInForce TIME_IN_FORCE_GTC;
    public static final TimeInForce TIME_IN_FORCE_IOC;
    public static final TimeInForce TIME_IN_FORCE__UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ TimeInForce[] $values() {
        return new TimeInForce[]{TIME_IN_FORCE__UNSPECIFIED, TIME_IN_FORCE_GTC, TIME_IN_FORCE_IOC, TIME_IN_FORCE_GFD, TIME_IN_FORCE_GFW, TIME_IN_FORCE_GFM};
    }

    @JvmStatic
    public static final TimeInForce fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TimeInForce> getEntries() {
        return $ENTRIES;
    }

    private TimeInForce(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TimeInForce timeInForce = new TimeInForce("TIME_IN_FORCE__UNSPECIFIED", 0, 0);
        TIME_IN_FORCE__UNSPECIFIED = timeInForce;
        TIME_IN_FORCE_GTC = new TimeInForce("TIME_IN_FORCE_GTC", 1, 1);
        TIME_IN_FORCE_IOC = new TimeInForce("TIME_IN_FORCE_IOC", 2, 2);
        TIME_IN_FORCE_GFD = new TimeInForce("TIME_IN_FORCE_GFD", 3, 3);
        TIME_IN_FORCE_GFW = new TimeInForce("TIME_IN_FORCE_GFW", 4, 4);
        TIME_IN_FORCE_GFM = new TimeInForce("TIME_IN_FORCE_GFM", 5, 5);
        TimeInForce[] timeInForceArr$values = $values();
        $VALUES = timeInForceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(timeInForceArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TimeInForce.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TimeInForce>(orCreateKotlinClass, syntax, timeInForce) { // from class: rosetta.nummus.order.TimeInForce$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TimeInForce fromValue(int value) {
                return TimeInForce.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TimeInForce.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/nummus/order/TimeInForce$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/nummus/order/TimeInForce;", "fromValue", "value", "", "rosetta.nummus.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TimeInForce fromValue(int value) {
            if (value == 0) {
                return TimeInForce.TIME_IN_FORCE__UNSPECIFIED;
            }
            if (value == 1) {
                return TimeInForce.TIME_IN_FORCE_GTC;
            }
            if (value == 2) {
                return TimeInForce.TIME_IN_FORCE_IOC;
            }
            if (value == 3) {
                return TimeInForce.TIME_IN_FORCE_GFD;
            }
            if (value == 4) {
                return TimeInForce.TIME_IN_FORCE_GFW;
            }
            if (value != 5) {
                return null;
            }
            return TimeInForce.TIME_IN_FORCE_GFM;
        }
    }

    public static TimeInForce valueOf(String str) {
        return (TimeInForce) Enum.valueOf(TimeInForce.class, str);
    }

    public static TimeInForce[] values() {
        return (TimeInForce[]) $VALUES.clone();
    }
}
