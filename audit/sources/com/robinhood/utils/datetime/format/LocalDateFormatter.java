package com.robinhood.utils.datetime.format;

import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.TemporalTransformer;
import com.robinhood.utils.datetime.format.TemporalFormatter;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;
import p479j$.time.Year;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.format.FormatStyle;
import p479j$.time.temporal.TemporalAccessor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocalDateFormatter.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0013\b\u0012\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, m3636d2 = {"Lcom/robinhood/utils/datetime/format/LocalDateFormatter;", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "j$/time/LocalDate", "", "delegate", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/datetime/format/TemporalFormatter;)V", "j$/time/format/DateTimeFormatter", "formatter", "(Ljava/lang/String;ILj$/time/format/DateTimeFormatter;)V", "", "patternRes", "(Ljava/lang/String;II)V", "temporal", "", "format", "(Lj$/time/LocalDate;)Ljava/lang/String;", "SHORT", "SHORT_WITH_FULL_YEAR", "SHORT_WITH_OPTIONAL_YEAR", "MEDIUM", "MEDIUM_NO_YEAR", "MEDIUM_WITHOUT_PADDING_NO_YEAR", "MEDIUM_WITHOUT_PADDING_OPTIONAL_YEAR", "MEDIUM_WITH_OPTIONAL_YEAR", "LONG", "LONG_WITH_OPTIONAL_YEAR", "LONG_WITHOUT_DAY", "SHORT_WEEKDAY_WITHOUT_YEAR", "SHORT_WEEKDAY_WITH_YEAR", "SHORT_WEEKDAY_WITH_OPTIONAL_YEAR", "WEEKDAY_ONLY", "SHORT_WEEKDAY", "SHORT_MONTH_DAY", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class LocalDateFormatter implements TemporalFormatter<LocalDate> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LocalDateFormatter[] $VALUES;
    public static final LocalDateFormatter LONG;
    public static final LocalDateFormatter LONG_WITHOUT_DAY;
    public static final LocalDateFormatter LONG_WITH_OPTIONAL_YEAR;
    public static final LocalDateFormatter MEDIUM;
    public static final LocalDateFormatter MEDIUM_NO_YEAR;
    public static final LocalDateFormatter MEDIUM_WITHOUT_PADDING_NO_YEAR;
    public static final LocalDateFormatter MEDIUM_WITHOUT_PADDING_OPTIONAL_YEAR;
    public static final LocalDateFormatter MEDIUM_WITH_OPTIONAL_YEAR;
    public static final LocalDateFormatter SHORT_MONTH_DAY;
    public static final LocalDateFormatter SHORT_WEEKDAY;
    public static final LocalDateFormatter SHORT_WEEKDAY_WITHOUT_YEAR;
    public static final LocalDateFormatter SHORT_WEEKDAY_WITH_OPTIONAL_YEAR;
    public static final LocalDateFormatter SHORT_WEEKDAY_WITH_YEAR;
    public static final LocalDateFormatter SHORT_WITH_OPTIONAL_YEAR;
    public static final LocalDateFormatter WEEKDAY_ONLY;
    private final /* synthetic */ TemporalFormatter<LocalDate> $$delegate_0;
    public static final LocalDateFormatter SHORT = new LocalDateFormatter("SHORT", 0, C41827R.string.format_local_date_short);
    public static final LocalDateFormatter SHORT_WITH_FULL_YEAR = new LocalDateFormatter("SHORT_WITH_FULL_YEAR", 1, C41827R.string.format_local_date_short_with_full_year);

    private static final /* synthetic */ LocalDateFormatter[] $values() {
        return new LocalDateFormatter[]{SHORT, SHORT_WITH_FULL_YEAR, SHORT_WITH_OPTIONAL_YEAR, MEDIUM, MEDIUM_NO_YEAR, MEDIUM_WITHOUT_PADDING_NO_YEAR, MEDIUM_WITHOUT_PADDING_OPTIONAL_YEAR, MEDIUM_WITH_OPTIONAL_YEAR, LONG, LONG_WITH_OPTIONAL_YEAR, LONG_WITHOUT_DAY, SHORT_WEEKDAY_WITHOUT_YEAR, SHORT_WEEKDAY_WITH_YEAR, SHORT_WEEKDAY_WITH_OPTIONAL_YEAR, WEEKDAY_ONLY, SHORT_WEEKDAY, SHORT_MONTH_DAY};
    }

    public static EnumEntries<LocalDateFormatter> getEntries() {
        return $ENTRIES;
    }

    @Override // com.robinhood.utils.datetime.format.TemporalFormatter
    public String format(LocalDate temporal) {
        Intrinsics.checkNotNullParameter(temporal, "temporal");
        return this.$$delegate_0.format(temporal);
    }

    private LocalDateFormatter(String str, int i, TemporalFormatter temporalFormatter) {
        this.$$delegate_0 = temporalFormatter;
    }

    static {
        TemporalFormatter.Companion companion = TemporalFormatter.INSTANCE;
        final TemporalFormatter temporalFormatterOfPatternResource = companion.ofPatternResource(C41827R.string.format_local_date_short_with_optional_year);
        SHORT_WITH_OPTIONAL_YEAR = new LocalDateFormatter("SHORT_WITH_OPTIONAL_YEAR", 2, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super LocalDate>>() { // from class: com.robinhood.utils.datetime.format.LocalDateFormatter$special$$inlined$transforming$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super LocalDate> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<LocalDate> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = temporalFormatterOfPatternResource;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.LocalDateFormatter$special$$inlined$transforming$1.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return LocalDates4.withoutYearIfCurrentYear((LocalDate) source);
                    }
                });
            }
        }));
        DateTimeFormatter dateTimeFormatterOfLocalizedDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        Intrinsics.checkNotNullExpressionValue(dateTimeFormatterOfLocalizedDate, "ofLocalizedDate(...)");
        MEDIUM = new LocalDateFormatter("MEDIUM", 3, dateTimeFormatterOfLocalizedDate);
        MEDIUM_NO_YEAR = new LocalDateFormatter("MEDIUM_NO_YEAR", 4, C41827R.string.format_local_date_medium_no_year);
        MEDIUM_WITHOUT_PADDING_NO_YEAR = new LocalDateFormatter("MEDIUM_WITHOUT_PADDING_NO_YEAR", 5, C41827R.string.format_local_date_medium_without_padding_no_year);
        final TemporalFormatter temporalFormatterOfPatternResource2 = companion.ofPatternResource(C41827R.string.format_local_date_medium_without_padding_optional_year);
        MEDIUM_WITHOUT_PADDING_OPTIONAL_YEAR = new LocalDateFormatter("MEDIUM_WITHOUT_PADDING_OPTIONAL_YEAR", 6, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super LocalDate>>() { // from class: com.robinhood.utils.datetime.format.LocalDateFormatter$special$$inlined$transforming$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super LocalDate> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<LocalDate> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = temporalFormatterOfPatternResource2;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.LocalDateFormatter$special$$inlined$transforming$2.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return LocalDates4.withoutYearIfCurrentYear((LocalDate) source);
                    }
                });
            }
        }));
        final TemporalFormatter temporalFormatterOfPatternResource3 = companion.ofPatternResource(C41827R.string.format_local_date_medium_optional_year);
        MEDIUM_WITH_OPTIONAL_YEAR = new LocalDateFormatter("MEDIUM_WITH_OPTIONAL_YEAR", 7, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super LocalDate>>() { // from class: com.robinhood.utils.datetime.format.LocalDateFormatter$special$$inlined$transforming$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super LocalDate> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<LocalDate> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = temporalFormatterOfPatternResource3;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.LocalDateFormatter$special$$inlined$transforming$3.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return LocalDates4.withoutYearIfCurrentYear((LocalDate) source);
                    }
                });
            }
        }));
        LONG = new LocalDateFormatter("LONG", 8, C41827R.string.format_local_date_long);
        final TemporalFormatter temporalFormatterOfPatternResource4 = companion.ofPatternResource(C41827R.string.format_local_date_long_optional_year);
        LONG_WITH_OPTIONAL_YEAR = new LocalDateFormatter("LONG_WITH_OPTIONAL_YEAR", 9, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super LocalDate>>() { // from class: com.robinhood.utils.datetime.format.LocalDateFormatter$special$$inlined$transforming$4
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super LocalDate> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<LocalDate> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = temporalFormatterOfPatternResource4;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.LocalDateFormatter$special$$inlined$transforming$4.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return LocalDates4.withoutYearIfCurrentYear((LocalDate) source);
                    }
                });
            }
        }));
        LONG_WITHOUT_DAY = new LocalDateFormatter("LONG_WITHOUT_DAY", 10, C41827R.string.format_local_date_long_without_day);
        SHORT_WEEKDAY_WITHOUT_YEAR = new LocalDateFormatter("SHORT_WEEKDAY_WITHOUT_YEAR", 11, C41827R.string.format_local_date_short_weekday_without_year);
        SHORT_WEEKDAY_WITH_YEAR = new LocalDateFormatter("SHORT_WEEKDAY_WITH_YEAR", 12, C41827R.string.format_local_date_short_weekday_with_year);
        SHORT_WEEKDAY_WITH_OPTIONAL_YEAR = new LocalDateFormatter("SHORT_WEEKDAY_WITH_OPTIONAL_YEAR", 13, new TemporalFormatter<LocalDate>() { // from class: com.robinhood.utils.datetime.format.LocalDateFormatter$special$$inlined$of$1
            @Override // com.robinhood.utils.datetime.format.TemporalFormatter
            public String format(LocalDate temporal) {
                Intrinsics.checkNotNullParameter(temporal, "temporal");
                LocalDate localDate = temporal;
                return localDate.getYear() == Year.now().getValue() ? LocalDateFormatter.SHORT_WEEKDAY_WITHOUT_YEAR.format((LocalDateFormatter) localDate) : LocalDateFormatter.SHORT_WEEKDAY_WITH_YEAR.format((LocalDateFormatter) localDate);
            }
        });
        WEEKDAY_ONLY = new LocalDateFormatter("WEEKDAY_ONLY", 14, C41827R.string.format_local_date_weekday_only);
        SHORT_WEEKDAY = new LocalDateFormatter("SHORT_WEEKDAY", 15, C41827R.string.format_local_date_short_weekday_only);
        SHORT_MONTH_DAY = new LocalDateFormatter("SHORT_MONTH_DAY", 16, C41827R.string.format_local_date_short_month_day);
        LocalDateFormatter[] localDateFormatterArr$values = $values();
        $VALUES = localDateFormatterArr$values;
        $ENTRIES = EnumEntries2.enumEntries(localDateFormatterArr$values);
    }

    private LocalDateFormatter(String str, int i, DateTimeFormatter dateTimeFormatter) {
        this(str, i, TemporalFormatter.INSTANCE.wrapping(dateTimeFormatter));
    }

    private LocalDateFormatter(String str, int i, int i2) {
        this(str, i, TemporalFormatter.INSTANCE.ofPatternResource(i2));
    }

    public static LocalDateFormatter valueOf(String str) {
        return (LocalDateFormatter) Enum.valueOf(LocalDateFormatter.class, str);
    }

    public static LocalDateFormatter[] values() {
        return (LocalDateFormatter[]) $VALUES.clone();
    }
}
