package com.robinhood.utils.datetime.format;

import com.robinhood.utils.android.C41827R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDateTime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocalDateTimeFormatter.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0012\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/utils/datetime/format/LocalDateTimeFormatter;", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "j$/time/LocalDateTime", "", "delegate", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/datetime/format/TemporalFormatter;)V", "", "patternRes", "(Ljava/lang/String;II)V", "temporal", "", "format", "(Lj$/time/LocalDateTime;)Ljava/lang/String;", "DEFAULT", "MEDIUM", "WEEKDAY_ONLY", "WEEKDAY", "WEEKDAY_REVERSED", "DATE", "NATURAL", "NATURAL_NO_YEAR", "NATURAL_DOT", "NATURAL_DOT_NO_YEAR", "LONG", "LONG_NO_YEAR", "TIME", "TIME_SHORT", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class LocalDateTimeFormatter implements TemporalFormatter<LocalDateTime> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LocalDateTimeFormatter[] $VALUES;
    private final /* synthetic */ TemporalFormatter<LocalDateTime> $$delegate_0;
    public static final LocalDateTimeFormatter DEFAULT = new LocalDateTimeFormatter("DEFAULT", 0, C41827R.string.format_local_date_time_default);
    public static final LocalDateTimeFormatter MEDIUM = new LocalDateTimeFormatter("MEDIUM", 1, C41827R.string.format_local_date_time_medium);
    public static final LocalDateTimeFormatter WEEKDAY_ONLY = new LocalDateTimeFormatter("WEEKDAY_ONLY", 2, C41827R.string.format_local_date_time_weekday_only);
    public static final LocalDateTimeFormatter WEEKDAY = new LocalDateTimeFormatter("WEEKDAY", 3, C41827R.string.format_local_date_time_weekday);
    public static final LocalDateTimeFormatter WEEKDAY_REVERSED = new LocalDateTimeFormatter("WEEKDAY_REVERSED", 4, C41827R.string.format_local_date_time_weekday_reversed);
    public static final LocalDateTimeFormatter DATE = new LocalDateTimeFormatter("DATE", 5, C41827R.string.format_local_date_time_date);
    public static final LocalDateTimeFormatter NATURAL = new LocalDateTimeFormatter("NATURAL", 6, C41827R.string.format_local_date_time_natural);
    public static final LocalDateTimeFormatter NATURAL_NO_YEAR = new LocalDateTimeFormatter("NATURAL_NO_YEAR", 7, C41827R.string.format_local_date_time_natural_no_year);
    public static final LocalDateTimeFormatter NATURAL_DOT = new LocalDateTimeFormatter("NATURAL_DOT", 8, C41827R.string.format_local_date_time_natural_dot);
    public static final LocalDateTimeFormatter NATURAL_DOT_NO_YEAR = new LocalDateTimeFormatter("NATURAL_DOT_NO_YEAR", 9, C41827R.string.format_local_date_time_natural_dot_no_year);
    public static final LocalDateTimeFormatter LONG = new LocalDateTimeFormatter("LONG", 10, C41827R.string.format_local_date_time_long);
    public static final LocalDateTimeFormatter LONG_NO_YEAR = new LocalDateTimeFormatter("LONG_NO_YEAR", 11, C41827R.string.format_local_date_time_long_no_year);
    public static final LocalDateTimeFormatter TIME = new LocalDateTimeFormatter("TIME", 12, C41827R.string.format_local_date_time_time);
    public static final LocalDateTimeFormatter TIME_SHORT = new LocalDateTimeFormatter("TIME_SHORT", 13, C41827R.string.format_local_date_time_time_short);

    private static final /* synthetic */ LocalDateTimeFormatter[] $values() {
        return new LocalDateTimeFormatter[]{DEFAULT, MEDIUM, WEEKDAY_ONLY, WEEKDAY, WEEKDAY_REVERSED, DATE, NATURAL, NATURAL_NO_YEAR, NATURAL_DOT, NATURAL_DOT_NO_YEAR, LONG, LONG_NO_YEAR, TIME, TIME_SHORT};
    }

    public static EnumEntries<LocalDateTimeFormatter> getEntries() {
        return $ENTRIES;
    }

    @Override // com.robinhood.utils.datetime.format.TemporalFormatter
    public String format(LocalDateTime temporal) {
        Intrinsics.checkNotNullParameter(temporal, "temporal");
        return this.$$delegate_0.format(temporal);
    }

    private LocalDateTimeFormatter(String str, int i, TemporalFormatter temporalFormatter) {
        this.$$delegate_0 = temporalFormatter;
    }

    static {
        LocalDateTimeFormatter[] localDateTimeFormatterArr$values = $values();
        $VALUES = localDateTimeFormatterArr$values;
        $ENTRIES = EnumEntries2.enumEntries(localDateTimeFormatterArr$values);
    }

    private LocalDateTimeFormatter(String str, int i, int i2) {
        this(str, i, TemporalFormatter.INSTANCE.ofPatternResource(i2));
    }

    public static LocalDateTimeFormatter valueOf(String str) {
        return (LocalDateTimeFormatter) Enum.valueOf(LocalDateTimeFormatter.class, str);
    }

    public static LocalDateTimeFormatter[] values() {
        return (LocalDateTimeFormatter[]) $VALUES.clone();
    }
}
