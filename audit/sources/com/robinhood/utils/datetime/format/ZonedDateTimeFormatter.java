package com.robinhood.utils.datetime.format;

import com.robinhood.utils.android.C41827R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.ZonedDateTime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ZonedDateTimeFormatter.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0012\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/utils/datetime/format/ZonedDateTimeFormatter;", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "j$/time/ZonedDateTime", "", "formatter", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/datetime/format/TemporalFormatter;)V", "", "patternRes", "(Ljava/lang/String;II)V", "temporal", "", "format", "(Lj$/time/ZonedDateTime;)Ljava/lang/String;", "LONG_DATE_TIME_WITH_ZONE", "TIME_WITH_ZONE_NO_LEADING_ZERO", "WEEKDAY_DATE_TIME_AM_PM", "WEEKDAY_DATE_TIME_AM_PM_WITH_ZONE", "TIME_WITH_ZONE", "TIME_WITH_ZONE_NO_AM_PM", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ZonedDateTimeFormatter implements TemporalFormatter<ZonedDateTime> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ZonedDateTimeFormatter[] $VALUES;
    private final /* synthetic */ TemporalFormatter<ZonedDateTime> $$delegate_0;
    public static final ZonedDateTimeFormatter LONG_DATE_TIME_WITH_ZONE = new ZonedDateTimeFormatter("LONG_DATE_TIME_WITH_ZONE", 0, C41827R.string.format_zoned_date_time_long);
    public static final ZonedDateTimeFormatter TIME_WITH_ZONE_NO_LEADING_ZERO = new ZonedDateTimeFormatter("TIME_WITH_ZONE_NO_LEADING_ZERO", 1, C41827R.string.format_zoned_date_time_no_leading_zero);
    public static final ZonedDateTimeFormatter WEEKDAY_DATE_TIME_AM_PM = new ZonedDateTimeFormatter("WEEKDAY_DATE_TIME_AM_PM", 2, C41827R.string.format_zoned_day_of_week_date_time_am_pm);
    public static final ZonedDateTimeFormatter WEEKDAY_DATE_TIME_AM_PM_WITH_ZONE = new ZonedDateTimeFormatter("WEEKDAY_DATE_TIME_AM_PM_WITH_ZONE", 3, C41827R.string.format_zoned_day_of_week_date_time_am_pm_with_zone);
    public static final ZonedDateTimeFormatter TIME_WITH_ZONE = new ZonedDateTimeFormatter("TIME_WITH_ZONE", 4, C41827R.string.format_zoned_date_time_time_with_zone);
    public static final ZonedDateTimeFormatter TIME_WITH_ZONE_NO_AM_PM = new ZonedDateTimeFormatter("TIME_WITH_ZONE_NO_AM_PM", 5, C41827R.string.format_zoned_date_time_no_am_pm);

    private static final /* synthetic */ ZonedDateTimeFormatter[] $values() {
        return new ZonedDateTimeFormatter[]{LONG_DATE_TIME_WITH_ZONE, TIME_WITH_ZONE_NO_LEADING_ZERO, WEEKDAY_DATE_TIME_AM_PM, WEEKDAY_DATE_TIME_AM_PM_WITH_ZONE, TIME_WITH_ZONE, TIME_WITH_ZONE_NO_AM_PM};
    }

    public static EnumEntries<ZonedDateTimeFormatter> getEntries() {
        return $ENTRIES;
    }

    @Override // com.robinhood.utils.datetime.format.TemporalFormatter
    public String format(ZonedDateTime temporal) {
        Intrinsics.checkNotNullParameter(temporal, "temporal");
        return this.$$delegate_0.format(temporal);
    }

    private ZonedDateTimeFormatter(String str, int i, TemporalFormatter temporalFormatter) {
        this.$$delegate_0 = temporalFormatter;
    }

    static {
        ZonedDateTimeFormatter[] zonedDateTimeFormatterArr$values = $values();
        $VALUES = zonedDateTimeFormatterArr$values;
        $ENTRIES = EnumEntries2.enumEntries(zonedDateTimeFormatterArr$values);
    }

    private ZonedDateTimeFormatter(String str, int i, int i2) {
        this(str, i, TemporalFormatter.INSTANCE.ofPatternResource(i2));
    }

    public static ZonedDateTimeFormatter valueOf(String str) {
        return (ZonedDateTimeFormatter) Enum.valueOf(ZonedDateTimeFormatter.class, str);
    }

    public static ZonedDateTimeFormatter[] values() {
        return (ZonedDateTimeFormatter[]) $VALUES.clone();
    }
}
