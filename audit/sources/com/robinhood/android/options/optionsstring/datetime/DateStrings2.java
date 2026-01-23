package com.robinhood.android.options.optionsstring.datetime;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.datetime.format.LocalTimeFormatter;
import com.robinhood.utils.datetime.format.MonthDayFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;
import p479j$.time.LocalDateTime;
import p479j$.time.LocalTime;
import p479j$.time.chrono.ChronoLocalDate;

/* compiled from: DateStrings.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"j$/time/LocalDate", "expirationDate", "today", "", "getExpirationDateStr", "(Lj$/time/LocalDate;Lj$/time/LocalDate;)Ljava/lang/String;", "Landroid/content/res/Resources;", "resources", "", "settleOnOpen", "getExpirationStringMedium", "(Landroid/content/res/Resources;Lj$/time/LocalDate;Z)Ljava/lang/String;", "", "hour", "minute", "Lcom/robinhood/utils/datetime/format/LocalTimeFormatter;", "localTimeFormatter", "formatTo24HourTime", "(IILcom/robinhood/utils/datetime/format/LocalTimeFormatter;)Ljava/lang/String;", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.optionsstring.datetime.DateStringsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class DateStrings2 {
    public static final String getExpirationDateStr(LocalDate expirationDate, LocalDate today) {
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(today, "today");
        if (today.until((ChronoLocalDate) expirationDate).toTotalMonths() < 11) {
            return MonthDayFormatter.LONG.format((MonthDayFormatter) LocalDates4.getMonthDay(expirationDate));
        }
        return LocalDateFormatter.LONG.format((LocalDateFormatter) expirationDate);
    }

    public static final String getExpirationStringMedium(Resources resources, LocalDate expirationDate, boolean z) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        String recent = LocalDates4.formatRecent(expirationDate, resources, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 2) != 0 ? LocalDateFormatter.MEDIUM : LocalDateFormatter.MEDIUM_WITH_OPTIONAL_YEAR, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 4) != 0 ? null : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 8) != 0 ? true : true, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 16) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 32) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 64) == 0 ? false : true, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 128) != 0 ? false : false);
        if (!z) {
            return recent;
        }
        String string2 = resources.getString(C23386R.string.option_expiration_date_tab_title_settle_on_open, recent);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    public static /* synthetic */ String formatTo24HourTime$default(int i, int i2, LocalTimeFormatter localTimeFormatter, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            localTimeFormatter = LocalTimeFormatter.SHORT;
        }
        return formatTo24HourTime(i, i2, localTimeFormatter);
    }

    public static final String formatTo24HourTime(int i, int i2, LocalTimeFormatter localTimeFormatter) {
        Intrinsics.checkNotNullParameter(localTimeFormatter, "localTimeFormatter");
        LocalTime localTime = LocalDateTime.m3391of(2025, 1, 1, i, i2).mo3396g(ZoneIds.INSTANCE.getNEW_YORK()).toLocalTime();
        Intrinsics.checkNotNull(localTime);
        return localTimeFormatter.format(localTime);
    }
}
