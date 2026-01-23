package kotlinx.datetime;

import kotlin.Metadata;

@Metadata(m3635d1 = {"kotlinx/datetime/TimeZoneKt__TimeZoneJvmKt"}, m3636d2 = {}, m3637k = 4, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class TimeZoneKt {
    public static final Instant atStartOfDayIn(LocalDate localDate, TimeZoneJvm2 timeZoneJvm2) {
        return TimeZoneJvm3.atStartOfDayIn(localDate, timeZoneJvm2);
    }

    public static final Instant toInstant(LocalDateTime localDateTime, TimeZoneJvm2 timeZoneJvm2) {
        return TimeZoneJvm3.toInstant(localDateTime, timeZoneJvm2);
    }

    public static final LocalDateTime toLocalDateTime(Instant instant, TimeZoneJvm2 timeZoneJvm2) {
        return TimeZoneJvm3.toLocalDateTime(instant, timeZoneJvm2);
    }
}
