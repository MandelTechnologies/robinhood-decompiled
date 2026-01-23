package com.robinhood.utils.datetime.format;

import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.datetime.TemporalTransformer;
import com.robinhood.utils.datetime.YearMonths;
import com.robinhood.utils.datetime.format.TemporalFormatter;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.YearMonth;
import p479j$.time.temporal.TemporalAccessor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: YearMonthFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/utils/datetime/format/YearMonthFormatter;", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "j$/time/YearMonth", "", "formatter", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/datetime/format/TemporalFormatter;)V", "temporal", "", "format", "(Lj$/time/YearMonth;)Ljava/lang/String;", "LONG_WITH_OPTIONAL_YEAR", "MEDIUM_WITHOUT_DAY", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class YearMonthFormatter implements TemporalFormatter<YearMonth> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ YearMonthFormatter[] $VALUES;
    public static final YearMonthFormatter LONG_WITH_OPTIONAL_YEAR;
    public static final YearMonthFormatter MEDIUM_WITHOUT_DAY;
    private final /* synthetic */ TemporalFormatter<YearMonth> $$delegate_0;

    private static final /* synthetic */ YearMonthFormatter[] $values() {
        return new YearMonthFormatter[]{LONG_WITH_OPTIONAL_YEAR, MEDIUM_WITHOUT_DAY};
    }

    public static EnumEntries<YearMonthFormatter> getEntries() {
        return $ENTRIES;
    }

    @Override // com.robinhood.utils.datetime.format.TemporalFormatter
    public String format(YearMonth temporal) {
        Intrinsics.checkNotNullParameter(temporal, "temporal");
        return this.$$delegate_0.format(temporal);
    }

    private YearMonthFormatter(String str, int i, TemporalFormatter temporalFormatter) {
        this.$$delegate_0 = temporalFormatter;
    }

    static {
        TemporalFormatter.Companion companion = TemporalFormatter.INSTANCE;
        final TemporalFormatter temporalFormatterOfPatternResource = companion.ofPatternResource(C41827R.string.format_long_with_optional_year);
        LONG_WITH_OPTIONAL_YEAR = new YearMonthFormatter("LONG_WITH_OPTIONAL_YEAR", 0, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super YearMonth>>() { // from class: com.robinhood.utils.datetime.format.YearMonthFormatter$special$$inlined$transforming$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super YearMonth> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<YearMonth> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = temporalFormatterOfPatternResource;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.YearMonthFormatter$special$$inlined$transforming$1.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return YearMonths.withoutYearIfCurrentYear((YearMonth) source);
                    }
                });
            }
        }));
        MEDIUM_WITHOUT_DAY = new YearMonthFormatter("MEDIUM_WITHOUT_DAY", 1, companion.ofPatternResource(C41827R.string.format_year_month_medium_without_day));
        YearMonthFormatter[] yearMonthFormatterArr$values = $values();
        $VALUES = yearMonthFormatterArr$values;
        $ENTRIES = EnumEntries2.enumEntries(yearMonthFormatterArr$values);
    }

    public static YearMonthFormatter valueOf(String str) {
        return (YearMonthFormatter) Enum.valueOf(YearMonthFormatter.class, str);
    }

    public static YearMonthFormatter[] values() {
        return (YearMonthFormatter[]) $VALUES.clone();
    }
}
