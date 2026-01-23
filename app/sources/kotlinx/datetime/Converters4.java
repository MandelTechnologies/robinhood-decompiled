package kotlinx.datetime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.ZoneId;

/* compiled from: Converters.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lkotlinx/datetime/Instant;", "j$/time/Instant", "toJavaInstant", "(Lkotlinx/datetime/Instant;)Lj$/time/Instant;", "toKotlinInstant", "(Lj$/time/Instant;)Lkotlinx/datetime/Instant;", "Lkotlinx/datetime/TimeZone;", "j$/time/ZoneId", "toJavaZoneId", "(Lkotlinx/datetime/TimeZone;)Lj$/time/ZoneId;", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.ConvertersKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Converters4 {
    public static final p479j$.time.Instant toJavaInstant(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        return instant.getValue();
    }

    public static final Instant toKotlinInstant(p479j$.time.Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        return new Instant(instant);
    }

    public static final ZoneId toJavaZoneId(TimeZoneJvm2 timeZoneJvm2) {
        Intrinsics.checkNotNullParameter(timeZoneJvm2, "<this>");
        return timeZoneJvm2.getZoneId();
    }
}
