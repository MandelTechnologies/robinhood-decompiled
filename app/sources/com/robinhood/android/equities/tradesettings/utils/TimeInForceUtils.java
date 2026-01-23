package com.robinhood.android.equities.tradesettings.utils;

import android.annotation.SuppressLint;
import com.robinhood.android.equities.tradesettings.C14990R;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.datetime.format.LocalDateTimeFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalDateTime;
import p479j$.time.ZoneId;
import p479j$.time.ZonedDateTime;
import p479j$.time.chrono.ChronoZonedDateTime;

/* compiled from: TimeInForceUtils.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0016\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010\u0019\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\nH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\"\u0010#J+\u0010(\u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b(\u0010)J7\u0010*\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/utils/TimeInForceUtils;", "", "<init>", "()V", "Lcom/robinhood/models/db/Order$Configuration;", "orderConfiguration", "Lcom/robinhood/models/db/OrderMarketHours;", "tradingSession", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "j$/time/Instant", "currentTime", "", "isEffectiveToday$lib_trade_settings_externalDebug", "(Lcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;Lj$/time/Instant;)Ljava/lang/Boolean;", "isEffectiveToday", "nextMarketHours", "orderMarketHours$lib_trade_settings_externalDebug", "(Lcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/MarketHours;Lj$/time/Instant;)Lcom/robinhood/models/db/MarketHours;", "orderMarketHours", "allowExtendedHours$lib_trade_settings_externalDebug", "(Lcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;Lj$/time/Instant;)Z", "allowExtendedHours", "expirationTime$lib_trade_settings_externalDebug", "(Lcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/MarketHours;Lj$/time/Instant;)Lj$/time/Instant;", "expirationTime", "now", "j$/time/LocalDateTime", "orderExpireDateFallback$lib_trade_settings_externalDebug", "(Lj$/time/Instant;)Lj$/time/LocalDateTime;", "orderExpireDateFallback", "Lcom/robinhood/utils/resource/StringResource;", "getGfdTitle", "(Lcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/MarketHours;Lj$/time/Instant;)Lcom/robinhood/utils/resource/StringResource;", "getGfdDetailText", "(Lcom/robinhood/models/db/OrderMarketHours;)Lcom/robinhood/utils/resource/StringResource;", "", "brokebackOrderExpireDateString", "j$/time/ZoneId", "zoneId", "getGtcTitle", "(Ljava/lang/String;Lj$/time/ZoneId;Lj$/time/Instant;)Lcom/robinhood/utils/resource/StringResource;", "timeInForceDetail", "(Lcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;Lj$/time/Instant;)Lcom/robinhood/utils/resource/StringResource;", "getGtcDetailText", "()Lcom/robinhood/utils/resource/StringResource;", "gtcDetailText", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"NowWithoutClock"})
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TimeInForceUtils {
    public static final int $stable = 0;
    public static final TimeInForceUtils INSTANCE = new TimeInForceUtils();

    /* compiled from: TimeInForceUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderMarketHours.values().length];
            try {
                iArr[OrderMarketHours.REGULAR_HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderMarketHours.EXTENDED_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderMarketHours.HYPER_EXTENDED_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderMarketHours.ALL_DAY_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TimeInForceUtils() {
    }

    public final Boolean isEffectiveToday$lib_trade_settings_externalDebug(Order.Configuration orderConfiguration, OrderMarketHours tradingSession, MarketHours marketHours, Instant currentTime) {
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        if (marketHours != null) {
            return Boolean.valueOf(marketHours.wouldOrderBeEffectiveToday(tradingSession == OrderMarketHours.ALL_DAY_HOURS, allowExtendedHours$lib_trade_settings_externalDebug(orderConfiguration, tradingSession, marketHours, currentTime), currentTime));
        }
        return null;
    }

    public final MarketHours orderMarketHours$lib_trade_settings_externalDebug(Order.Configuration orderConfiguration, OrderMarketHours tradingSession, MarketHours marketHours, MarketHours nextMarketHours, Instant currentTime) {
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        Boolean boolIsEffectiveToday$lib_trade_settings_externalDebug = isEffectiveToday$lib_trade_settings_externalDebug(orderConfiguration, tradingSession, marketHours, currentTime);
        if (boolIsEffectiveToday$lib_trade_settings_externalDebug != null) {
            return boolIsEffectiveToday$lib_trade_settings_externalDebug.booleanValue() ? marketHours : nextMarketHours;
        }
        return null;
    }

    public final boolean allowExtendedHours$lib_trade_settings_externalDebug(Order.Configuration orderConfiguration, OrderMarketHours tradingSession, MarketHours marketHours, Instant currentTime) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        if (marketHours == null) {
            return false;
        }
        if (tradingSession != null) {
            boolValueOf = Boolean.valueOf(tradingSession.getLegacy_extended_hours());
        } else {
            boolValueOf = orderConfiguration != null ? Boolean.valueOf(orderConfiguration.getAllowsForExtendedHoursGfd(marketHours, currentTime)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final Instant expirationTime$lib_trade_settings_externalDebug(Order.Configuration orderConfiguration, OrderMarketHours tradingSession, MarketHours marketHours, MarketHours nextMarketHours, Instant currentTime) {
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        int i = tradingSession == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tradingSession.ordinal()];
        if (i == 1) {
            MarketHours marketHoursOrderMarketHours$lib_trade_settings_externalDebug = orderMarketHours$lib_trade_settings_externalDebug(orderConfiguration, tradingSession, marketHours, nextMarketHours, currentTime);
            if (marketHoursOrderMarketHours$lib_trade_settings_externalDebug != null) {
                return marketHoursOrderMarketHours$lib_trade_settings_externalDebug.getRegularHoursClosesAt();
            }
            return null;
        }
        if (i == 2 || i == 3) {
            MarketHours marketHoursOrderMarketHours$lib_trade_settings_externalDebug2 = orderMarketHours$lib_trade_settings_externalDebug(orderConfiguration, tradingSession, marketHours, nextMarketHours, currentTime);
            if (marketHoursOrderMarketHours$lib_trade_settings_externalDebug2 != null) {
                return marketHoursOrderMarketHours$lib_trade_settings_externalDebug2.getExtendedHoursClosesAt();
            }
            return null;
        }
        if (i == 4) {
            MarketHours marketHoursOrderMarketHours$lib_trade_settings_externalDebug3 = orderMarketHours$lib_trade_settings_externalDebug(orderConfiguration, tradingSession, marketHours, nextMarketHours, currentTime);
            if (marketHoursOrderMarketHours$lib_trade_settings_externalDebug3 != null) {
                return marketHoursOrderMarketHours$lib_trade_settings_externalDebug3.getAllDayClosesAt();
            }
            return null;
        }
        if (allowExtendedHours$lib_trade_settings_externalDebug(orderConfiguration, tradingSession, marketHours, currentTime)) {
            MarketHours marketHoursOrderMarketHours$lib_trade_settings_externalDebug4 = orderMarketHours$lib_trade_settings_externalDebug(orderConfiguration, tradingSession, marketHours, nextMarketHours, currentTime);
            if (marketHoursOrderMarketHours$lib_trade_settings_externalDebug4 != null) {
                return marketHoursOrderMarketHours$lib_trade_settings_externalDebug4.getExtendedClosesAt();
            }
            return null;
        }
        MarketHours marketHoursOrderMarketHours$lib_trade_settings_externalDebug5 = orderMarketHours$lib_trade_settings_externalDebug(orderConfiguration, tradingSession, marketHours, nextMarketHours, currentTime);
        if (marketHoursOrderMarketHours$lib_trade_settings_externalDebug5 != null) {
            return marketHoursOrderMarketHours$lib_trade_settings_externalDebug5.getRegularHoursClosesAt();
        }
        return null;
    }

    public final LocalDateTime orderExpireDateFallback$lib_trade_settings_externalDebug(Instant now) {
        ZonedDateTime zonedDateTimePlusDays;
        Intrinsics.checkNotNullParameter(now, "now");
        ZoneIds zoneIds = ZoneIds.INSTANCE;
        ZonedDateTime zonedDateTimeAtZone = now.atZone(zoneIds.getNEW_YORK());
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeAtZone, "atZone(...)");
        ZonedDateTime zonedDateTimeWithHour = zonedDateTimeAtZone.withHour(20);
        ZonedDateTime zonedDateTimeAtZone2 = zonedDateTimeWithHour.toInstant().atZone(zoneIds.getUTC());
        if (zonedDateTimeAtZone.compareTo((ChronoZonedDateTime<?>) zonedDateTimeWithHour) < 0) {
            zonedDateTimePlusDays = zonedDateTimeAtZone2.plusDays(90L);
        } else {
            zonedDateTimePlusDays = zonedDateTimeAtZone2.plusDays(91L);
        }
        LocalDateTime localDateTime = zonedDateTimePlusDays.mo3461d();
        Intrinsics.checkNotNullExpressionValue(localDateTime, "toLocalDateTime(...)");
        return localDateTime;
    }

    public static /* synthetic */ StringResource getGfdTitle$default(TimeInForceUtils timeInForceUtils, Order.Configuration configuration, OrderMarketHours orderMarketHours, MarketHours marketHours, MarketHours marketHours2, Instant instant, int i, Object obj) {
        if ((i & 16) != 0) {
            instant = Instant.now();
        }
        return timeInForceUtils.getGfdTitle(configuration, orderMarketHours, marketHours, marketHours2, instant);
    }

    public final StringResource getGfdTitle(Order.Configuration orderConfiguration, OrderMarketHours tradingSession, MarketHours marketHours, MarketHours nextMarketHours, Instant currentTime) {
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        Instant instantExpirationTime$lib_trade_settings_externalDebug = expirationTime$lib_trade_settings_externalDebug(orderConfiguration, tradingSession, marketHours, nextMarketHours, currentTime);
        if (instantExpirationTime$lib_trade_settings_externalDebug == null) {
            return null;
        }
        LocalDate localDate$default = Instants.toLocalDate$default(instantExpirationTime$lib_trade_settings_externalDebug, null, 1, null);
        if (Intrinsics.areEqual(localDate$default, Instants.toLocalDate$default(currentTime, null, 1, null))) {
            return StringResource.INSTANCE.invoke(C14990R.string.order_create_time_in_force_gfd_summary_today, InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format((InstantFormatter) instantExpirationTime$lib_trade_settings_externalDebug));
        }
        if (Intrinsics.areEqual(localDate$default, Instants.toLocalDate$default(currentTime, null, 1, null).plusDays(1L))) {
            return StringResource.INSTANCE.invoke(C14990R.string.order_create_time_in_force_gfd_summary_tomorrow, InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format((InstantFormatter) instantExpirationTime$lib_trade_settings_externalDebug));
        }
        return StringResource.INSTANCE.invoke(InstantFormatter.WEEKDAY_DATETIME_IN_SYSTEM_ZONE_REVERSED.format((InstantFormatter) instantExpirationTime$lib_trade_settings_externalDebug));
    }

    public final StringResource getGfdDetailText(OrderMarketHours tradingSession) {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = tradingSession == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tradingSession.ordinal()];
        if (i2 == 2 || i2 == 3) {
            i = C14990R.string.order_create_time_in_force_gfd_extended;
        } else if (i2 == 4) {
            i = C14990R.string.order_create_time_in_force_gfd_adt;
        } else {
            i = C14990R.string.order_create_time_in_force_gfd_market;
        }
        return companion.invoke(i, new Object[0]);
    }

    public static /* synthetic */ StringResource getGtcTitle$default(TimeInForceUtils timeInForceUtils, String str, ZoneId zoneId, Instant instant, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        if ((i & 4) != 0) {
            instant = Instant.now();
        }
        return timeInForceUtils.getGtcTitle(str, zoneId, instant);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StringResource getGtcTitle(String brokebackOrderExpireDateString, ZoneId zoneId, Instant currentTime) {
        LocalDateTime localDateTimeOrderExpireDateFallback$lib_trade_settings_externalDebug;
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        StringResource.Companion companion = StringResource.INSTANCE;
        String strBlankToNull = StringsKt.blankToNull(brokebackOrderExpireDateString);
        if (strBlankToNull != null) {
            Instant instant = Instant.parse(strBlankToNull);
            Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
            localDateTimeOrderExpireDateFallback$lib_trade_settings_externalDebug = Instants.toLocalDateTime(instant, zoneId);
            if (localDateTimeOrderExpireDateFallback$lib_trade_settings_externalDebug == null) {
                localDateTimeOrderExpireDateFallback$lib_trade_settings_externalDebug = orderExpireDateFallback$lib_trade_settings_externalDebug(currentTime);
            }
        }
        return companion.invoke(LocalDateTimeFormatter.DATE.format((LocalDateTimeFormatter) localDateTimeOrderExpireDateFallback$lib_trade_settings_externalDebug));
    }

    public final StringResource getGtcDetailText() {
        return StringResource.INSTANCE.invoke(C14990R.string.order_create_time_in_force_gtc, new Object[0]);
    }

    public static /* synthetic */ StringResource timeInForceDetail$default(TimeInForceUtils timeInForceUtils, Order.Configuration configuration, OrderMarketHours orderMarketHours, MarketHours marketHours, Instant instant, int i, Object obj) {
        if ((i & 8) != 0) {
            instant = Instant.now();
        }
        return timeInForceUtils.timeInForceDetail(configuration, orderMarketHours, marketHours, instant);
    }

    public final StringResource timeInForceDetail(Order.Configuration orderConfiguration, OrderMarketHours tradingSession, MarketHours marketHours, Instant currentTime) {
        int i;
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        Boolean boolIsEffectiveToday$lib_trade_settings_externalDebug = isEffectiveToday$lib_trade_settings_externalDebug(orderConfiguration, tradingSession, marketHours, currentTime);
        if (boolIsEffectiveToday$lib_trade_settings_externalDebug == null) {
            return null;
        }
        boolean zBooleanValue = boolIsEffectiveToday$lib_trade_settings_externalDebug.booleanValue();
        StringResource.Companion companion = StringResource.INSTANCE;
        if (zBooleanValue) {
            i = C14990R.string.order_create_advanced_time_in_force_same_day_explanation;
        } else {
            i = C14990R.string.order_create_advanced_time_in_force_next_day_explanation;
        }
        return companion.invoke(i, new Object[0]);
    }
}
