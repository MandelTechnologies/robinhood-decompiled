package p479j$.time;

import java.util.Objects;

/* loaded from: classes29.dex */
public abstract class Clock {
    public abstract ZoneId getZone();

    public abstract Instant instant();

    public abstract Clock withZone(ZoneId zoneId);

    public static Clock systemUTC() {
        return C45721a.f6709b;
    }

    public static Clock systemDefaultZone() {
        return new C45721a(ZoneId.systemDefault());
    }

    public static Clock system(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId == ZoneOffset.UTC) {
            return C45721a.f6709b;
        }
        return new C45721a(zoneId);
    }

    public long millis() {
        return instant().toEpochMilli();
    }

    public int hashCode() {
        return super.hashCode();
    }
}
