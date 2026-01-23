package rosetta.mainst;

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
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lrosetta/mainst/TimeInForce;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TIME_IN_FORCE_UNSPECIFIED", "GFD", "GTC", "FOK", "IOC", "OPG", "GTD", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TimeInForce implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TimeInForce[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TimeInForce> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TimeInForce FOK;
    public static final TimeInForce GFD;
    public static final TimeInForce GTC;
    public static final TimeInForce GTD;
    public static final TimeInForce IOC;
    public static final TimeInForce OPG;
    public static final TimeInForce TIME_IN_FORCE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ TimeInForce[] $values() {
        return new TimeInForce[]{TIME_IN_FORCE_UNSPECIFIED, GFD, GTC, FOK, IOC, OPG, GTD};
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
        final TimeInForce timeInForce = new TimeInForce("TIME_IN_FORCE_UNSPECIFIED", 0, 0);
        TIME_IN_FORCE_UNSPECIFIED = timeInForce;
        GFD = new TimeInForce("GFD", 1, 1);
        GTC = new TimeInForce("GTC", 2, 2);
        FOK = new TimeInForce("FOK", 3, 3);
        IOC = new TimeInForce("IOC", 4, 4);
        OPG = new TimeInForce("OPG", 5, 5);
        GTD = new TimeInForce("GTD", 6, 6);
        TimeInForce[] timeInForceArr$values = $values();
        $VALUES = timeInForceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(timeInForceArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TimeInForce.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TimeInForce>(orCreateKotlinClass, syntax, timeInForce) { // from class: rosetta.mainst.TimeInForce$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TimeInForce fromValue(int value) {
                return TimeInForce.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TimeInForce.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/mainst/TimeInForce$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/mainst/TimeInForce;", "fromValue", "value", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TimeInForce fromValue(int value) {
            switch (value) {
                case 0:
                    return TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                case 1:
                    return TimeInForce.GFD;
                case 2:
                    return TimeInForce.GTC;
                case 3:
                    return TimeInForce.FOK;
                case 4:
                    return TimeInForce.IOC;
                case 5:
                    return TimeInForce.OPG;
                case 6:
                    return TimeInForce.GTD;
                default:
                    return null;
            }
        }
    }

    public static TimeInForce valueOf(String str) {
        return (TimeInForce) Enum.valueOf(TimeInForce.class, str);
    }

    public static TimeInForce[] values() {
        return (TimeInForce[]) $VALUES.clone();
    }
}
