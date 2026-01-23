package com.robinhood.utils.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Range2;
import p479j$.time.temporal.TemporalAccessor;

/* compiled from: TemporalFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u0005\u001a\u00020\u0004\"\u0012\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, m3636d2 = {"j$/time/temporal/TemporalAccessor", "T", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "formatter", "", "format", "(Lj$/time/temporal/TemporalAccessor;Lcom/robinhood/utils/datetime/format/TemporalFormatter;)Ljava/lang/String;", "", "Lkotlin/ranges/ClosedRange;", "(Lkotlin/ranges/ClosedRange;Lcom/robinhood/utils/datetime/format/TemporalFormatter;)Ljava/lang/String;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class TemporalFormatterKt {
    public static final <T extends TemporalAccessor> String format(T t, TemporalFormatter<? super T> formatter) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return formatter.format(t);
    }

    public static final <T extends TemporalAccessor & Comparable<? super T>> String format(Range2<T> range2, TemporalFormatter<? super T> formatter) {
        Intrinsics.checkNotNullParameter(range2, "<this>");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        String str = formatter.format((TemporalAccessor) range2.getStart());
        String str2 = formatter.format((TemporalAccessor) range2.getEndInclusive());
        if (Intrinsics.areEqual(str, str2)) {
            return str;
        }
        return str + " - " + str2;
    }
}
