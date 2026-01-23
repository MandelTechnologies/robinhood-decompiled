package com.robinhood.utils.datetime.format;

import com.robinhood.utils.android.C41827R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalTime;
import p479j$.time.format.FormatStyle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocalTimeFormatter.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0012\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/utils/datetime/format/LocalTimeFormatter;", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "j$/time/LocalTime", "", "delegate", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/datetime/format/TemporalFormatter;)V", "", "patternRes", "(Ljava/lang/String;II)V", "temporal", "", "format", "(Lj$/time/LocalTime;)Ljava/lang/String;", "SHORT", "SHORT_LOCALIZED", "SHORT_NO_MINUTE", "SHORT_OPTIONAL_MINUTE", "SHORT_NO_AM_PM", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class LocalTimeFormatter implements TemporalFormatter<LocalTime> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LocalTimeFormatter[] $VALUES;
    private final /* synthetic */ TemporalFormatter<LocalTime> $$delegate_0;
    public static final LocalTimeFormatter SHORT = new LocalTimeFormatter("SHORT", 0, C41827R.string.format_local_time_short);
    public static final LocalTimeFormatter SHORT_LOCALIZED = new LocalTimeFormatter("SHORT_LOCALIZED", 1, TemporalFormatter.INSTANCE.ofLocalizedTime(FormatStyle.SHORT));
    public static final LocalTimeFormatter SHORT_NO_MINUTE = new LocalTimeFormatter("SHORT_NO_MINUTE", 2, C41827R.string.format_local_time_short_no_minute);
    public static final LocalTimeFormatter SHORT_OPTIONAL_MINUTE = new LocalTimeFormatter("SHORT_OPTIONAL_MINUTE", 3, new TemporalFormatter<LocalTime>() { // from class: com.robinhood.utils.datetime.format.LocalTimeFormatter$special$$inlined$of$1
        @Override // com.robinhood.utils.datetime.format.TemporalFormatter
        public String format(LocalTime temporal) {
            Intrinsics.checkNotNullParameter(temporal, "temporal");
            LocalTime localTime = temporal;
            if (localTime.getMinute() == 0) {
                return LocalTimeFormatter.SHORT_NO_MINUTE.format(localTime);
            }
            return LocalTimeFormatter.SHORT.format(localTime);
        }
    });
    public static final LocalTimeFormatter SHORT_NO_AM_PM = new LocalTimeFormatter("SHORT_NO_AM_PM", 4, C41827R.string.format_local_time_no_am_pm);

    private static final /* synthetic */ LocalTimeFormatter[] $values() {
        return new LocalTimeFormatter[]{SHORT, SHORT_LOCALIZED, SHORT_NO_MINUTE, SHORT_OPTIONAL_MINUTE, SHORT_NO_AM_PM};
    }

    public static EnumEntries<LocalTimeFormatter> getEntries() {
        return $ENTRIES;
    }

    @Override // com.robinhood.utils.datetime.format.TemporalFormatter
    public String format(LocalTime temporal) {
        Intrinsics.checkNotNullParameter(temporal, "temporal");
        return this.$$delegate_0.format(temporal);
    }

    private LocalTimeFormatter(String str, int i, TemporalFormatter temporalFormatter) {
        this.$$delegate_0 = temporalFormatter;
    }

    static {
        LocalTimeFormatter[] localTimeFormatterArr$values = $values();
        $VALUES = localTimeFormatterArr$values;
        $ENTRIES = EnumEntries2.enumEntries(localTimeFormatterArr$values);
    }

    private LocalTimeFormatter(String str, int i, int i2) {
        this(str, i, TemporalFormatter.INSTANCE.ofPatternResource(i2));
    }

    public static LocalTimeFormatter valueOf(String str) {
        return (LocalTimeFormatter) Enum.valueOf(LocalTimeFormatter.class, str);
    }

    public static LocalTimeFormatter[] values() {
        return (LocalTimeFormatter[]) $VALUES.clone();
    }
}
