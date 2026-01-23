package p479j$.time.temporal;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.util.Map;
import p479j$.time.DateTimeException;
import p479j$.time.chrono.Chronology;
import p479j$.time.format.C45757B;
import p479j$.time.format.ResolverStyle;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.time.temporal.h */
/* loaded from: classes29.dex */
public final class EnumC45804h implements TemporalField {
    public static final EnumC45804h JULIAN_DAY;
    public static final EnumC45804h MODIFIED_JULIAN_DAY;
    public static final EnumC45804h RATA_DIE;

    /* renamed from: f */
    public static final /* synthetic */ EnumC45804h[] f6949f;
    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a */
    public final transient String f6950a;

    /* renamed from: b */
    public final transient TemporalUnit f6951b;

    /* renamed from: c */
    public final transient TemporalUnit f6952c;

    /* renamed from: d */
    public final transient ValueRange f6953d;

    /* renamed from: e */
    public final transient long f6954e;

    @Override // p479j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public static EnumC45804h valueOf(String str) {
        return (EnumC45804h) Enum.valueOf(EnumC45804h.class, str);
    }

    public static EnumC45804h[] values() {
        return (EnumC45804h[]) f6949f.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        EnumC45804h enumC45804h = new EnumC45804h("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = enumC45804h;
        EnumC45804h enumC45804h2 = new EnumC45804h("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = enumC45804h2;
        EnumC45804h enumC45804h3 = new EnumC45804h("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = enumC45804h3;
        f6949f = new EnumC45804h[]{enumC45804h, enumC45804h2, enumC45804h3};
    }

    public EnumC45804h(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        this.f6950a = str2;
        this.f6951b = chronoUnit;
        this.f6952c = chronoUnit2;
        this.f6953d = ValueRange.m3598of((-365243219162L) + j, 365241780471L + j);
        this.f6954e = j;
    }

    @Override // p479j$.time.temporal.TemporalField
    public final Temporal adjustInto(Temporal temporal, long j) {
        if (!this.f6953d.m3603c(j)) {
            throw new DateTimeException("Invalid value: " + this.f6950a + PlaceholderUtils.XXShortPlaceholderText + j);
        }
        return temporal.with(ChronoField.EPOCH_DAY, Math.subtractExact(j, this.f6954e));
    }

    @Override // p479j$.time.temporal.TemporalField
    public final ValueRange range() {
        return this.f6953d;
    }

    @Override // p479j$.time.temporal.TemporalField
    public final boolean isSupportedBy(TemporalAccessor temporalAccessor) {
        return temporalAccessor.isSupported(ChronoField.EPOCH_DAY);
    }

    @Override // p479j$.time.temporal.TemporalField
    public final ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.isSupported(ChronoField.EPOCH_DAY)) {
            return this.f6953d;
        }
        throw new DateTimeException("Unsupported field: " + this);
    }

    @Override // p479j$.time.temporal.TemporalField
    public final long getFrom(TemporalAccessor temporalAccessor) {
        return temporalAccessor.getLong(ChronoField.EPOCH_DAY) + this.f6954e;
    }

    @Override // p479j$.time.temporal.TemporalField
    /* renamed from: c */
    public final TemporalAccessor mo3597c(Map map, C45757B c45757b, ResolverStyle resolverStyle) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        Chronology chronologyFrom = Chronology.from(c45757b);
        ResolverStyle resolverStyle2 = ResolverStyle.LENIENT;
        long j = this.f6954e;
        if (resolverStyle == resolverStyle2) {
            return chronologyFrom.dateEpochDay(Math.subtractExact(jLongValue, j));
        }
        this.f6953d.checkValidValue(jLongValue, this);
        return chronologyFrom.dateEpochDay(jLongValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6950a;
    }
}
