package p479j$.time.temporal;

import com.robinhood.android.remoteconfig.RealRemoteConfigHelper;
import p479j$.time.Duration;

/* loaded from: classes29.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", Duration.ofNanos(1)),
    MICROS("Micros", Duration.ofNanos(1000)),
    MILLIS("Millis", Duration.ofNanos(1000000)),
    SECONDS("Seconds", Duration.ofSeconds(1)),
    MINUTES("Minutes", Duration.ofSeconds(60)),
    HOURS("Hours", Duration.ofSeconds(3600)),
    HALF_DAYS("HalfDays", Duration.ofSeconds(RealRemoteConfigHelper.MIN_FETCH_INTERVAL_IN_SECONDS)),
    DAYS("Days", Duration.ofSeconds(86400)),
    WEEKS("Weeks", Duration.ofSeconds(604800)),
    MONTHS("Months", Duration.ofSeconds(2629746)),
    YEARS("Years", Duration.ofSeconds(31556952)),
    DECADES("Decades", Duration.ofSeconds(315569520)),
    CENTURIES("Centuries", Duration.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", Duration.ofSeconds(31556952000L)),
    ERAS("Eras", Duration.ofSeconds(31556952000000000L)),
    FOREVER("Forever", Duration.ofSeconds(Long.MAX_VALUE, 999999999));


    /* renamed from: a */
    public final String f6919a;

    /* renamed from: b */
    public final Duration f6920b;

    ChronoUnit(String str, Duration duration) {
        this.f6919a = str;
        this.f6920b = duration;
    }

    @Override // p479j$.time.temporal.TemporalUnit
    public Duration getDuration() {
        return this.f6920b;
    }

    @Override // p479j$.time.temporal.TemporalUnit
    public final boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // p479j$.time.temporal.TemporalUnit
    public final boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    @Override // p479j$.time.temporal.TemporalUnit
    public final boolean isSupportedBy(Temporal temporal) {
        return temporal.isSupported(this);
    }

    @Override // p479j$.time.temporal.TemporalUnit
    public final Temporal addTo(Temporal temporal, long j) {
        return temporal.plus(j, this);
    }

    @Override // p479j$.time.temporal.TemporalUnit
    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.until(temporal2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6919a;
    }
}
