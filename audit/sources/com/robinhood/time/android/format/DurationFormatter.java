package com.robinhood.time.android.format;

import android.content.res.Resources;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import com.robinhood.time.android.C41649R;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;

/* compiled from: DurationFormatter.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\t\u0010\u0015J1\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u000b\u0010\u0016J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\f\u0010\u0017J'\u0010\f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0018R\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/time/android/format/DurationFormatter;", "", "<init>", "()V", "", "duration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "", "formatNarrow", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/String;", "formatShort", "formatWide", "millis", "computeMostSpecificTimeUnit", "(J)Ljava/util/concurrent/TimeUnit;", "Landroid/content/res/Resources;", "resources", "j$/time/Duration", "", "includeAgo", "(Landroid/content/res/Resources;Lj$/time/Duration;Z)Ljava/lang/String;", "(Landroid/content/res/Resources;Lj$/time/Duration;Ljava/util/concurrent/TimeUnit;Z)Ljava/lang/String;", "(Lj$/time/Duration;)Ljava/lang/String;", "(Landroid/content/res/Resources;Lj$/time/Duration;Ljava/util/concurrent/TimeUnit;)Ljava/lang/String;", "Landroid/icu/util/MeasureUnit;", "getMeasureUnit", "(Ljava/util/concurrent/TimeUnit;)Landroid/icu/util/MeasureUnit;", "measureUnit", "lib-time-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DurationFormatter {
    public static final DurationFormatter INSTANCE = new DurationFormatter();

    /* compiled from: DurationFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DurationFormatter() {
    }

    private final MeasureUnit getMeasureUnit(TimeUnit timeUnit) {
        switch (WhenMappings.$EnumSwitchMapping$0[timeUnit.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                android.icu.util.TimeUnit SECOND = MeasureUnit.SECOND;
                Intrinsics.checkNotNullExpressionValue(SECOND, "SECOND");
                return SECOND;
            case 5:
                android.icu.util.TimeUnit MINUTE = MeasureUnit.MINUTE;
                Intrinsics.checkNotNullExpressionValue(MINUTE, "MINUTE");
                return MINUTE;
            case 6:
                android.icu.util.TimeUnit HOUR = MeasureUnit.HOUR;
                Intrinsics.checkNotNullExpressionValue(HOUR, "HOUR");
                return HOUR;
            case 7:
                android.icu.util.TimeUnit DAY = MeasureUnit.DAY;
                Intrinsics.checkNotNullExpressionValue(DAY, "DAY");
                return DAY;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String formatNarrow(long duration, TimeUnit timeUnit) {
        return DurationFormatter2.formatMeasure(new Measure(Long.valueOf(duration), getMeasureUnit(timeUnit)), MeasureFormat.FormatWidth.NARROW);
    }

    private final String formatShort(long duration, TimeUnit timeUnit) {
        return DurationFormatter2.formatMeasure(new Measure(Long.valueOf(duration), getMeasureUnit(timeUnit)), MeasureFormat.FormatWidth.SHORT);
    }

    private final String formatWide(long duration, TimeUnit timeUnit) {
        return DurationFormatter2.formatMeasure(new Measure(Long.valueOf(duration), getMeasureUnit(timeUnit)), MeasureFormat.FormatWidth.WIDE);
    }

    private final TimeUnit computeMostSpecificTimeUnit(long millis) {
        if (millis < 1000) {
            return null;
        }
        if (millis < 60000) {
            return TimeUnit.SECONDS;
        }
        if (millis < 3600000) {
            return TimeUnit.MINUTES;
        }
        if (millis < 86400000) {
            return TimeUnit.HOURS;
        }
        return TimeUnit.DAYS;
    }

    public static /* synthetic */ String formatNarrow$default(Resources resources, Duration duration, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return formatNarrow(resources, duration, z);
    }

    @JvmStatic
    public static final String formatNarrow(Resources resources, Duration duration, boolean includeAgo) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(duration, "duration");
        long millis = duration.toMillis();
        DurationFormatter durationFormatter = INSTANCE;
        TimeUnit timeUnitComputeMostSpecificTimeUnit = durationFormatter.computeMostSpecificTimeUnit(millis);
        if (timeUnitComputeMostSpecificTimeUnit == null) {
            String string2 = resources.getString(C41649R.string.time_now_label);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String narrow = durationFormatter.formatNarrow(timeUnitComputeMostSpecificTimeUnit.convert(millis, TimeUnit.MILLISECONDS), timeUnitComputeMostSpecificTimeUnit);
        if (!includeAgo) {
            return narrow;
        }
        String string3 = resources.getString(C41649R.string.general_time_duration_ago, narrow);
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    public static /* synthetic */ String formatShort$default(Resources resources, Duration duration, TimeUnit timeUnit, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return formatShort(resources, duration, timeUnit, z);
    }

    @JvmStatic
    public static final String formatShort(Resources resources, Duration duration, TimeUnit timeUnit, boolean includeAgo) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        String str = INSTANCE.formatShort(timeUnit.convert(duration.toMillis(), TimeUnit.MILLISECONDS), timeUnit);
        if (!includeAgo) {
            return str;
        }
        String string2 = resources.getString(C41649R.string.general_time_duration_ago, str);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    @JvmStatic
    public static final String formatWide(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        long millis = duration.toMillis();
        DurationFormatter durationFormatter = INSTANCE;
        TimeUnit timeUnitComputeMostSpecificTimeUnit = durationFormatter.computeMostSpecificTimeUnit(millis);
        if (timeUnitComputeMostSpecificTimeUnit == null) {
            return durationFormatter.formatWide(1L, TimeUnit.SECONDS);
        }
        return durationFormatter.formatWide(timeUnitComputeMostSpecificTimeUnit.convert(millis, TimeUnit.MILLISECONDS), timeUnitComputeMostSpecificTimeUnit);
    }

    @JvmStatic
    public static final String formatWide(Resources resources, Duration duration, TimeUnit timeUnit) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        String string2 = resources.getString(C41649R.string.general_time_duration_ago, INSTANCE.formatWide(timeUnit.convert(duration.toMillis(), TimeUnit.MILLISECONDS), timeUnit));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
