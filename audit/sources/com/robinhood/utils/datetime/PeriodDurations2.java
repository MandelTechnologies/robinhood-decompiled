package com.robinhood.utils.datetime;

import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.threeten.extra.PeriodDuration;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: PeriodDurations.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0005"}, m3636d2 = {"getWeeks", "", "Lorg/threeten/extra/PeriodDuration;", "getHours", "getMinutes", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.datetime.PeriodDurationsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class PeriodDurations2 {
    public static final long getWeeks(PeriodDuration periodDuration) {
        Intrinsics.checkNotNullParameter(periodDuration, "<this>");
        return periodDuration.get(ChronoUnit.DAYS) / 7;
    }

    public static final long getHours(PeriodDuration periodDuration) {
        Intrinsics.checkNotNullParameter(periodDuration, "<this>");
        return periodDuration.get(ChronoUnit.SECONDS) / OptionsSimulatedReturnTimeSliderDataState4.ONE_HOUR_IN_SEC;
    }

    public static final long getMinutes(PeriodDuration periodDuration) {
        Intrinsics.checkNotNullParameter(periodDuration, "<this>");
        return periodDuration.get(ChronoUnit.SECONDS) / 60;
    }
}
