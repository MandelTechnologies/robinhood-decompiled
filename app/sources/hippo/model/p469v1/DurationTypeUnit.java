package hippo.model.p469v1;

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
/* compiled from: DurationTypeUnit.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, m3636d2 = {"Lhippo/model/v1/DurationTypeUnit;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DURATION_TYPE_UNIT_UNSPECIFIED", "DURATION_TYPE_UNIT_TICKS", "DURATION_TYPE_UNIT_SECONDS", "DURATION_TYPE_UNIT_MINUTES", "DURATION_TYPE_UNIT_HOURS", "DURATION_TYPE_UNIT_DAYS", "DURATION_TYPE_UNIT_WEEKS", "DURATION_TYPE_UNIT_MONTHS", "DURATION_TYPE_UNIT_YEARS", "DURATION_TYPE_UNIT_RANGES", "DURATION_TYPE_UNIT_VOLUME", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class DurationTypeUnit implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DurationTypeUnit[] $VALUES;

    @JvmField
    public static final ProtoAdapter<DurationTypeUnit> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final DurationTypeUnit DURATION_TYPE_UNIT_DAYS;
    public static final DurationTypeUnit DURATION_TYPE_UNIT_HOURS;
    public static final DurationTypeUnit DURATION_TYPE_UNIT_MINUTES;
    public static final DurationTypeUnit DURATION_TYPE_UNIT_MONTHS;
    public static final DurationTypeUnit DURATION_TYPE_UNIT_RANGES;
    public static final DurationTypeUnit DURATION_TYPE_UNIT_SECONDS;
    public static final DurationTypeUnit DURATION_TYPE_UNIT_TICKS;
    public static final DurationTypeUnit DURATION_TYPE_UNIT_UNSPECIFIED;
    public static final DurationTypeUnit DURATION_TYPE_UNIT_VOLUME;
    public static final DurationTypeUnit DURATION_TYPE_UNIT_WEEKS;
    public static final DurationTypeUnit DURATION_TYPE_UNIT_YEARS;
    private final int value;

    private static final /* synthetic */ DurationTypeUnit[] $values() {
        return new DurationTypeUnit[]{DURATION_TYPE_UNIT_UNSPECIFIED, DURATION_TYPE_UNIT_TICKS, DURATION_TYPE_UNIT_SECONDS, DURATION_TYPE_UNIT_MINUTES, DURATION_TYPE_UNIT_HOURS, DURATION_TYPE_UNIT_DAYS, DURATION_TYPE_UNIT_WEEKS, DURATION_TYPE_UNIT_MONTHS, DURATION_TYPE_UNIT_YEARS, DURATION_TYPE_UNIT_RANGES, DURATION_TYPE_UNIT_VOLUME};
    }

    @JvmStatic
    public static final DurationTypeUnit fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<DurationTypeUnit> getEntries() {
        return $ENTRIES;
    }

    private DurationTypeUnit(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final DurationTypeUnit durationTypeUnit = new DurationTypeUnit("DURATION_TYPE_UNIT_UNSPECIFIED", 0, 0);
        DURATION_TYPE_UNIT_UNSPECIFIED = durationTypeUnit;
        DURATION_TYPE_UNIT_TICKS = new DurationTypeUnit("DURATION_TYPE_UNIT_TICKS", 1, 1);
        DURATION_TYPE_UNIT_SECONDS = new DurationTypeUnit("DURATION_TYPE_UNIT_SECONDS", 2, 2);
        DURATION_TYPE_UNIT_MINUTES = new DurationTypeUnit("DURATION_TYPE_UNIT_MINUTES", 3, 3);
        DURATION_TYPE_UNIT_HOURS = new DurationTypeUnit("DURATION_TYPE_UNIT_HOURS", 4, 4);
        DURATION_TYPE_UNIT_DAYS = new DurationTypeUnit("DURATION_TYPE_UNIT_DAYS", 5, 5);
        DURATION_TYPE_UNIT_WEEKS = new DurationTypeUnit("DURATION_TYPE_UNIT_WEEKS", 6, 6);
        DURATION_TYPE_UNIT_MONTHS = new DurationTypeUnit("DURATION_TYPE_UNIT_MONTHS", 7, 7);
        DURATION_TYPE_UNIT_YEARS = new DurationTypeUnit("DURATION_TYPE_UNIT_YEARS", 8, 8);
        DURATION_TYPE_UNIT_RANGES = new DurationTypeUnit("DURATION_TYPE_UNIT_RANGES", 9, 9);
        DURATION_TYPE_UNIT_VOLUME = new DurationTypeUnit("DURATION_TYPE_UNIT_VOLUME", 10, 10);
        DurationTypeUnit[] durationTypeUnitArr$values = $values();
        $VALUES = durationTypeUnitArr$values;
        $ENTRIES = EnumEntries2.enumEntries(durationTypeUnitArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DurationTypeUnit.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<DurationTypeUnit>(orCreateKotlinClass, syntax, durationTypeUnit) { // from class: hippo.model.v1.DurationTypeUnit$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public DurationTypeUnit fromValue(int value) {
                return DurationTypeUnit.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: DurationTypeUnit.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lhippo/model/v1/DurationTypeUnit$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lhippo/model/v1/DurationTypeUnit;", "fromValue", "value", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DurationTypeUnit fromValue(int value) {
            switch (value) {
                case 0:
                    return DurationTypeUnit.DURATION_TYPE_UNIT_UNSPECIFIED;
                case 1:
                    return DurationTypeUnit.DURATION_TYPE_UNIT_TICKS;
                case 2:
                    return DurationTypeUnit.DURATION_TYPE_UNIT_SECONDS;
                case 3:
                    return DurationTypeUnit.DURATION_TYPE_UNIT_MINUTES;
                case 4:
                    return DurationTypeUnit.DURATION_TYPE_UNIT_HOURS;
                case 5:
                    return DurationTypeUnit.DURATION_TYPE_UNIT_DAYS;
                case 6:
                    return DurationTypeUnit.DURATION_TYPE_UNIT_WEEKS;
                case 7:
                    return DurationTypeUnit.DURATION_TYPE_UNIT_MONTHS;
                case 8:
                    return DurationTypeUnit.DURATION_TYPE_UNIT_YEARS;
                case 9:
                    return DurationTypeUnit.DURATION_TYPE_UNIT_RANGES;
                case 10:
                    return DurationTypeUnit.DURATION_TYPE_UNIT_VOLUME;
                default:
                    return null;
            }
        }
    }

    public static DurationTypeUnit valueOf(String str) {
        return (DurationTypeUnit) Enum.valueOf(DurationTypeUnit.class, str);
    }

    public static DurationTypeUnit[] values() {
        return (DurationTypeUnit[]) $VALUES.clone();
    }
}
