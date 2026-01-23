package com.robinhood.utils.datetime;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Month;
import p479j$.time.MonthDay;

/* compiled from: Holidays.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/utils/datetime/Holidays;", "", "<init>", "()V", "j$/time/MonthDay", "CHRISTMAS_DAY", "Lj$/time/MonthDay;", "getCHRISTMAS_DAY", "()Lj$/time/MonthDay;", "NEW_YEARS_DAY", "getNEW_YEARS_DAY", "", "winterMarketHolidays", "Ljava/util/Set;", "getWinterMarketHolidays", "()Ljava/util/Set;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Holidays {
    private static final MonthDay CHRISTMAS_DAY;
    public static final Holidays INSTANCE = new Holidays();
    private static final MonthDay NEW_YEARS_DAY;
    private static final Set<MonthDay> winterMarketHolidays;

    private Holidays() {
    }

    static {
        MonthDay monthDayM3423of = MonthDay.m3423of(Month.DECEMBER, 25);
        Intrinsics.checkNotNullExpressionValue(monthDayM3423of, "of(...)");
        CHRISTMAS_DAY = monthDayM3423of;
        MonthDay monthDayM3423of2 = MonthDay.m3423of(Month.JANUARY, 1);
        Intrinsics.checkNotNullExpressionValue(monthDayM3423of2, "of(...)");
        NEW_YEARS_DAY = monthDayM3423of2;
        winterMarketHolidays = SetsKt.setOf((Object[]) new MonthDay[]{monthDayM3423of, monthDayM3423of2});
    }

    public final MonthDay getCHRISTMAS_DAY() {
        return CHRISTMAS_DAY;
    }

    public final MonthDay getNEW_YEARS_DAY() {
        return NEW_YEARS_DAY;
    }

    public final Set<MonthDay> getWinterMarketHolidays() {
        return winterMarketHolidays;
    }
}
