package com.robinhood.utils.datetime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: Holidays.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"j$/time/LocalDate", "", "isWinterMarketHoliday", "(Lj$/time/LocalDate;)Z", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.datetime.HolidaysKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Holidays2 {
    public static final boolean isWinterMarketHoliday(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return Holidays.INSTANCE.getWinterMarketHolidays().contains(LocalDates4.getMonthDay(localDate));
    }
}
