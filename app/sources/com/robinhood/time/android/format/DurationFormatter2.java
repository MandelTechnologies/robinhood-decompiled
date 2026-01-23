package com.robinhood.time.android.format;

import android.content.res.Resources;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: DurationFormatter.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001b\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"j$/time/Instant", "Landroid/content/res/Resources;", "resources", "", "formatRecentDuration", "(Lj$/time/Instant;Landroid/content/res/Resources;)Ljava/lang/String;", "formatWeekDuration", "j$/time/Duration", "", "formatDaysHoursDuration", "(Lj$/time/Duration;Landroid/content/res/Resources;)Ljava/lang/CharSequence;", "Landroid/icu/util/Measure;", "measure", "Landroid/icu/text/MeasureFormat$FormatWidth;", "width", "formatMeasure", "(Landroid/icu/util/Measure;Landroid/icu/text/MeasureFormat$FormatWidth;)Ljava/lang/String;", "lib-time-android_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.time.android.format.DurationFormatterKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class DurationFormatter2 {
    public static final String formatRecentDuration(Instant instant, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        LocalDate localDateMo3459a = instant.atZone(ZoneId.systemDefault()).mo3459a();
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNull(localDateMo3459a);
        Intrinsics.checkNotNull(localDateNow);
        long jUntil = localDateMo3459a.until(localDateNow, ChronoUnit.DAYS);
        if (jUntil == 0) {
            return DurationFormatter.formatNarrow(resources, Durations.since(instant), true);
        }
        if (jUntil != 1) {
            return (2 > jUntil || jUntil >= 7) ? LocalDateFormatter.LONG_WITH_OPTIONAL_YEAR.format((LocalDateFormatter) localDateMo3459a) : InstantFormatter.WEEKDAY_DATETIME_IN_SYSTEM_ZONE.format((InstantFormatter) instant);
        }
        String string2 = resources.getString(C41827R.string.recent_timestamp_yesterday, InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) instant));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String formatWeekDuration(Instant instant, Resources resources) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        long hours = Durations.since(instant).toHours();
        if (0 <= hours && hours < 1) {
            return DurationFormatter.formatShort$default(resources, Durations.since(instant), TimeUnit.MINUTES, false, 8, null);
        }
        if (1 <= hours && hours < 24) {
            return DurationFormatter.formatWide(resources, Durations.since(instant), TimeUnit.HOURS);
        }
        if (24 <= hours && hours < 168) {
            return DurationFormatter.formatWide(resources, Durations.since(instant), TimeUnit.DAYS);
        }
        return LocalDateFormatter.LONG.format((LocalDateFormatter) instant.atZone(ZoneId.systemDefault()).mo3459a());
    }

    public static final CharSequence formatDaysHoursDuration(Duration duration, Resources resources) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String narrow$default = DurationFormatter.formatNarrow$default(resources, duration, false, 4, null);
        Duration durationMinusDays = duration.minusDays(duration.toDays());
        Intrinsics.checkNotNullExpressionValue(durationMinusDays, "minusDays(...)");
        String strReplace$default = StringsKt.replace$default(DurationFormatter.formatShort(resources, durationMinusDays, TimeUnit.HOURS, false), PlaceholderUtils.XXShortPlaceholderText, "", false, 4, (Object) null);
        if (duration.toDays() < 1) {
            if (duration.toHours() >= 1) {
                return strReplace$default;
            }
            return null;
        }
        return narrow$default + PlaceholderUtils.XXShortPlaceholderText + strReplace$default;
    }

    public static final String formatMeasure(Measure measure, MeasureFormat.FormatWidth width) {
        Intrinsics.checkNotNullParameter(measure, "measure");
        Intrinsics.checkNotNullParameter(width, "width");
        String str = MeasureFormat.getInstance(Locale.getDefault(Locale.Category.FORMAT), width).format(measure);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
