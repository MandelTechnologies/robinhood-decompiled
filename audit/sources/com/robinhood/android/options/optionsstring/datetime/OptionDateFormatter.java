package com.robinhood.android.options.optionsstring.datetime;

import com.robinhood.g11n.Locales;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.TemporalTransformer;
import com.robinhood.utils.datetime.format.TemporalFormatter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;
import p479j$.time.temporal.TemporalAccessor;

/* compiled from: OptionDateFormatter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "j$/time/LocalDate", "OPTION_EXPIRY_DATE_FORMATTER", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "getOPTION_EXPIRY_DATE_FORMATTER", "()Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "j$/time/Instant", "OPTION_OPEN_CLOSE_DATE_TIME_FORMATTER", "getOPTION_OPEN_CLOSE_DATE_TIME_FORMATTER", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.optionsstring.datetime.OptionDateFormatterKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionDateFormatter {
    private static final TemporalFormatter<LocalDate> OPTION_EXPIRY_DATE_FORMATTER;
    private static final TemporalFormatter<Instant> OPTION_OPEN_CLOSE_DATE_TIME_FORMATTER;

    static {
        TemporalFormatter.Companion companion = TemporalFormatter.INSTANCE;
        Locales locales = Locales.INSTANCE;
        Tuples2 tuples2M3642to = Tuples4.m3642to(locales.getEN_SG(), Integer.valueOf(C41827R.string.format_local_date_medium_optional_year));
        Locale locale = Locale.UK;
        Tuples2 tuples2M3642to2 = Tuples4.m3642to(locale, Integer.valueOf(C41827R.string.format_local_date_medium_optional_year));
        Locale locale2 = Locale.US;
        TemporalFormatter temporalFormatterOfLocalizedPatternResource = companion.ofLocalizedPatternResource(MapsKt.mapOf(tuples2M3642to, tuples2M3642to2, Tuples4.m3642to(locale2, Integer.valueOf(C41827R.string.format_local_date_short_with_optional_year))), C41827R.string.format_local_date_short_with_optional_year);
        TemporalTransformer.Companion companion2 = TemporalTransformer.INSTANCE;
        OPTION_EXPIRY_DATE_FORMATTER = companion.transforming(temporalFormatterOfLocalizedPatternResource, new TemporalTransformer<LocalDate, TemporalAccessor>() { // from class: com.robinhood.android.options.optionsstring.datetime.OptionDateFormatterKt$special$$inlined$invoke$1
            @Override // com.robinhood.utils.datetime.TemporalTransformer
            public TemporalAccessor transform(LocalDate source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return LocalDates4.withoutYearIfCurrentYear(source);
            }
        });
        OPTION_OPEN_CLOSE_DATE_TIME_FORMATTER = companion.transforming(companion.ofLocalizedPatternResource(MapsKt.mapOf(Tuples4.m3642to(locales.getEN_SG(), Integer.valueOf(C41827R.string.format_local_date_medium_optional_year)), Tuples4.m3642to(locale, Integer.valueOf(C41827R.string.format_local_date_medium_optional_year)), Tuples4.m3642to(locale2, Integer.valueOf(C41827R.string.format_local_date_short_with_optional_year))), C41827R.string.format_local_date_short_with_optional_year), new TemporalTransformer<Instant, TemporalAccessor>() { // from class: com.robinhood.android.options.optionsstring.datetime.OptionDateFormatterKt$special$$inlined$invoke$2
            @Override // com.robinhood.utils.datetime.TemporalTransformer
            public TemporalAccessor transform(Instant source) {
                Intrinsics.checkNotNullParameter(source, "source");
                LocalDate localDateMo3459a = source.atZone(ZoneId.systemDefault()).mo3459a();
                Intrinsics.checkNotNullExpressionValue(localDateMo3459a, "toLocalDate(...)");
                return LocalDates4.withoutYearIfCurrentYear(localDateMo3459a);
            }
        });
    }

    public static final TemporalFormatter<LocalDate> getOPTION_EXPIRY_DATE_FORMATTER() {
        return OPTION_EXPIRY_DATE_FORMATTER;
    }

    public static final TemporalFormatter<Instant> getOPTION_OPEN_CLOSE_DATE_TIME_FORMATTER() {
        return OPTION_OPEN_CLOSE_DATE_TIME_FORMATTER;
    }
}
