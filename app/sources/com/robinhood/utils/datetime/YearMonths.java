package com.robinhood.utils.datetime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Month;
import p479j$.time.Year;
import p479j$.time.YearMonth;
import p479j$.time.temporal.TemporalAccessor;

/* compiled from: YearMonths.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\b\u0003\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"j$/time/YearMonth", "j$/time/temporal/TemporalAccessor", "withoutYearIfCurrentYear", "(Lj$/time/YearMonth;)Lj$/time/temporal/TemporalAccessor;", "j$/time/Year", "getTemporalYear", "(Lj$/time/YearMonth;)Lj$/time/Year;", "temporalYear", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.datetime.YearMonthsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class YearMonths {
    public static final Year getTemporalYear(YearMonth yearMonth) {
        Intrinsics.checkNotNullParameter(yearMonth, "<this>");
        Year yearFrom = Year.from(yearMonth);
        Intrinsics.checkNotNullExpressionValue(yearFrom, "from(...)");
        return yearFrom;
    }

    public static final TemporalAccessor withoutYearIfCurrentYear(YearMonth yearMonth) {
        Intrinsics.checkNotNullParameter(yearMonth, "<this>");
        if (!Intrinsics.areEqual(getTemporalYear(yearMonth), Year.now())) {
            return yearMonth;
        }
        Month month = yearMonth.getMonth();
        Intrinsics.checkNotNullExpressionValue(month, "getMonth(...)");
        return month;
    }
}
