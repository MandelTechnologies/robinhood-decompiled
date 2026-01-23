package com.robinhood.utils.datetime.format;

import com.robinhood.utils.android.C41827R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Month;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MonthFormatter.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0012\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/utils/datetime/format/MonthFormatter;", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "j$/time/Month", "", "formatter", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/datetime/format/TemporalFormatter;)V", "", "patternRes", "(Ljava/lang/String;II)V", "temporal", "", "format", "(Lj$/time/Month;)Ljava/lang/String;", "LONG", "SHORT", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class MonthFormatter implements TemporalFormatter<Month> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MonthFormatter[] $VALUES;
    public static final MonthFormatter LONG = new MonthFormatter("LONG", 0, C41827R.string.format_month_long);
    public static final MonthFormatter SHORT = new MonthFormatter("SHORT", 1, C41827R.string.format_month_short);
    private final /* synthetic */ TemporalFormatter<Month> $$delegate_0;

    private static final /* synthetic */ MonthFormatter[] $values() {
        return new MonthFormatter[]{LONG, SHORT};
    }

    public static EnumEntries<MonthFormatter> getEntries() {
        return $ENTRIES;
    }

    @Override // com.robinhood.utils.datetime.format.TemporalFormatter
    public String format(Month temporal) {
        Intrinsics.checkNotNullParameter(temporal, "temporal");
        return this.$$delegate_0.format(temporal);
    }

    private MonthFormatter(String str, int i, TemporalFormatter temporalFormatter) {
        this.$$delegate_0 = temporalFormatter;
    }

    static {
        MonthFormatter[] monthFormatterArr$values = $values();
        $VALUES = monthFormatterArr$values;
        $ENTRIES = EnumEntries2.enumEntries(monthFormatterArr$values);
    }

    private MonthFormatter(String str, int i, int i2) {
        this(str, i, TemporalFormatter.INSTANCE.ofPatternResource(i2));
    }

    public static MonthFormatter valueOf(String str) {
        return (MonthFormatter) Enum.valueOf(MonthFormatter.class, str);
    }

    public static MonthFormatter[] values() {
        return (MonthFormatter[]) $VALUES.clone();
    }
}
