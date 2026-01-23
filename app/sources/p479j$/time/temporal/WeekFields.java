package p479j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p479j$.time.DayOfWeek;

/* loaded from: classes29.dex */
public final class WeekFields implements Serializable {

    /* renamed from: g */
    public static final ConcurrentMap f6935g = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: h */
    public static final EnumC45803g f6936h;
    private static final long serialVersionUID = -1177360819670808121L;

    /* renamed from: a */
    public final DayOfWeek f6937a;

    /* renamed from: b */
    public final int f6938b;

    /* renamed from: c */
    public final transient C45807k f6939c;

    /* renamed from: d */
    public final transient C45807k f6940d;

    /* renamed from: e */
    public final transient C45807k f6941e;

    /* renamed from: f */
    public final transient C45807k f6942f;

    static {
        new WeekFields(DayOfWeek.MONDAY, 4);
        m3604a(DayOfWeek.SUNDAY, 1);
        f6936h = IsoFields.f6923c;
    }

    /* renamed from: of */
    public static WeekFields m3605of(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        return m3604a(DayOfWeek.f6663a[((((int) ((firstDayOfWeek - 1) % 7)) + 7) + DayOfWeek.SUNDAY.ordinal()) % 7], calendar.getMinimalDaysInFirstWeek());
    }

    /* renamed from: a */
    public static WeekFields m3604a(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentMap concurrentMap = f6935g;
        WeekFields weekFields = (WeekFields) concurrentMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentMap.putIfAbsent(str, new WeekFields(dayOfWeek, i));
        return (WeekFields) concurrentMap.get(str);
    }

    public WeekFields(DayOfWeek dayOfWeek, int i) {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.WEEKS;
        this.f6939c = new C45807k("DayOfWeek", this, chronoUnit, chronoUnit2, C45807k.f6958f);
        this.f6940d = new C45807k("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, C45807k.f6959g);
        EnumC45803g enumC45803g = IsoFields.f6923c;
        this.f6941e = new C45807k("WeekOfWeekBasedYear", this, chronoUnit2, enumC45803g, C45807k.f6961i);
        this.f6942f = new C45807k("WeekBasedYear", this, enumC45803g, ChronoUnit.FOREVER, ChronoField.YEAR.range());
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f6937a = dayOfWeek;
        this.f6938b = i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f6937a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.f6938b;
        if (i < 1 || i > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return m3604a(this.f6937a, this.f6938b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e.getMessage());
        }
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.f6937a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f6937a.ordinal() * 7) + this.f6938b;
    }

    public final String toString() {
        return "WeekFields[" + this.f6937a + "," + this.f6938b + "]";
    }
}
