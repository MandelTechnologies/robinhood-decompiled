package kotlinx.datetime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.DateTimeException;
import p479j$.time.ZoneId;

/* compiled from: TimeZoneJvm.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\t\u001a\u00020\u0000*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\"\u0018\u0010\u000f\u001a\u00020\f*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lkotlinx/datetime/Instant;", "Lkotlinx/datetime/TimeZone;", "timeZone", "Lkotlinx/datetime/LocalDateTime;", "toLocalDateTime", "(Lkotlinx/datetime/Instant;Lkotlinx/datetime/TimeZone;)Lkotlinx/datetime/LocalDateTime;", "toInstant", "(Lkotlinx/datetime/LocalDateTime;Lkotlinx/datetime/TimeZone;)Lkotlinx/datetime/Instant;", "Lkotlinx/datetime/LocalDate;", "atStartOfDayIn", "(Lkotlinx/datetime/LocalDate;Lkotlinx/datetime/TimeZone;)Lkotlinx/datetime/Instant;", "j$/time/ZoneId", "", "isFixedOffset$TimeZoneKt__TimeZoneJvmKt", "(Lj$/time/ZoneId;)Z", "isFixedOffset", "kotlinx-datetime"}, m3637k = 5, m3638mv = {1, 9, 0}, m3640xi = 48, m3641xs = "kotlinx/datetime/TimeZoneKt")
@SourceDebugExtension
/* renamed from: kotlinx.datetime.TimeZoneKt__TimeZoneJvmKt, reason: use source file name */
/* loaded from: classes14.dex */
final /* synthetic */ class TimeZoneJvm3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isFixedOffset$TimeZoneKt__TimeZoneJvmKt(ZoneId zoneId) {
        try {
            return zoneId.getRules().isFixedOffset();
        } catch (ArrayIndexOutOfBoundsException unused) {
            return false;
        }
    }

    public static final LocalDateTime toLocalDateTime(Instant instant, TimeZoneJvm2 timeZone) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        try {
            return new LocalDateTime(p479j$.time.LocalDateTime.ofInstant(instant.getValue(), timeZone.getZoneId()));
        } catch (DateTimeException e) {
            throw new DateTimeArithmeticException(e);
        }
    }

    public static final Instant toInstant(LocalDateTime localDateTime, TimeZoneJvm2 timeZone) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        return new Instant(localDateTime.getValue().mo3396g(timeZone.getZoneId()).toInstant());
    }

    public static final Instant atStartOfDayIn(LocalDate localDate, TimeZoneJvm2 timeZone) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        return new Instant(localDate.getValue().atStartOfDay(timeZone.getZoneId()).toInstant());
    }
}
