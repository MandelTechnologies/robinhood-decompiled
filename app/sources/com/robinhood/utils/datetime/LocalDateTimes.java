package com.robinhood.utils.datetime;

import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.threeten.extra.AmPm;
import p479j$.time.Duration;
import p479j$.time.LocalDateTime;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: LocalDateTimes.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"j$/time/LocalDateTime", "endDateTime", "j$/time/Duration", "until", "(Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;)Lj$/time/Duration;", "Lorg/threeten/extra/AmPm;", "getAmPm", "(Lj$/time/LocalDateTime;)Lorg/threeten/extra/AmPm;", "amPm", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.datetime.LocalDateTimesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LocalDateTimes {
    @SuppressLint({"UnsafeTemporalApi"})
    public static final AmPm getAmPm(LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        AmPm amPmFrom = AmPm.from(localDateTime);
        Intrinsics.checkNotNullExpressionValue(amPmFrom, "from(...)");
        return amPmFrom;
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final Duration until(LocalDateTime localDateTime, LocalDateTime endDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        Intrinsics.checkNotNullParameter(endDateTime, "endDateTime");
        Duration durationOfNanos = Duration.ofNanos(localDateTime.until(endDateTime, ChronoUnit.NANOS));
        Intrinsics.checkNotNullExpressionValue(durationOfNanos, "ofNanos(...)");
        return durationOfNanos;
    }
}
