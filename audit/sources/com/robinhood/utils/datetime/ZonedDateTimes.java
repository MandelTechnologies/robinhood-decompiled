package com.robinhood.utils.datetime;

import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.threeten.extra.Temporals;
import p479j$.time.ZonedDateTime;

/* compiled from: ZonedDateTimes.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0014\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"j$/time/ZonedDateTime", "onNextWorkingDay", "(Lj$/time/ZonedDateTime;)Lj$/time/ZonedDateTime;", "", "toEpochMillis", "(Lj$/time/ZonedDateTime;)J", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.datetime.ZonedDateTimesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ZonedDateTimes {
    @SuppressLint({"UnsafeTemporalApi"})
    public static final ZonedDateTime onNextWorkingDay(ZonedDateTime zonedDateTime) {
        Intrinsics.checkNotNullParameter(zonedDateTime, "<this>");
        ZonedDateTime zonedDateTimeWith = zonedDateTime.with(Temporals.nextWorkingDay());
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith, "with(...)");
        return zonedDateTimeWith;
    }

    public static final long toEpochMillis(ZonedDateTime zonedDateTime) {
        Intrinsics.checkNotNullParameter(zonedDateTime, "<this>");
        return zonedDateTime.toEpochSecond() * 1000;
    }
}
