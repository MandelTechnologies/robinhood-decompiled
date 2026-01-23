package p479j$.time.temporal;

import p479j$.time.Duration;

/* renamed from: j$.time.temporal.g */
/* loaded from: classes29.dex */
public enum EnumC45803g implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));


    /* renamed from: a */
    public final String f6947a;

    /* renamed from: b */
    public final Duration f6948b;

    @Override // p479j$.time.temporal.TemporalUnit
    public final boolean isDateBased() {
        return true;
    }

    @Override // p479j$.time.temporal.TemporalUnit
    public final boolean isTimeBased() {
        return false;
    }

    EnumC45803g(String str, Duration duration) {
        this.f6947a = str;
        this.f6948b = duration;
    }

    @Override // p479j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.f6948b;
    }

    @Override // p479j$.time.temporal.TemporalUnit
    public final boolean isSupportedBy(Temporal temporal) {
        return temporal.isSupported(ChronoField.EPOCH_DAY) && IsoFields.m3596a(temporal);
    }

    @Override // p479j$.time.temporal.TemporalUnit
    public final Temporal addTo(Temporal temporal, long j) {
        int i = AbstractC45797a.f6943a[ordinal()];
        if (i == 1) {
            return temporal.with(IsoFields.f6922b, Math.addExact(temporal.get(r0), j));
        }
        if (i == 2) {
            return temporal.plus(j / 4, ChronoUnit.YEARS).plus((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // p479j$.time.temporal.TemporalUnit
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.until(temporal2, this);
        }
        int i = AbstractC45797a.f6943a[ordinal()];
        if (i == 1) {
            EnumC45802f enumC45802f = IsoFields.f6922b;
            return Math.subtractExact(temporal2.getLong(enumC45802f), temporal.getLong(enumC45802f));
        }
        if (i == 2) {
            return temporal.until(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6947a;
    }
}
