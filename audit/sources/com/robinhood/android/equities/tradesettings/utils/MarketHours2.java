package com.robinhood.android.equities.tradesettings.utils;

import com.robinhood.android.equities.tradesettings.C14990R;
import com.robinhood.android.equities.tradesettings.experiments.TradingSessionSubtitleExperiment;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.DayOfWeek;
import p479j$.time.Instant;
import p479j$.time.ZoneId;
import p479j$.time.ZonedDateTime;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.temporal.TemporalAdjusters;

/* compiled from: MarketHours.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a%\u0010\t\u001a\u00020\u0001*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/models/db/MarketHours;", "Lcom/robinhood/utils/resource/StringResource;", "getRegularHoursDetailText", "(Lcom/robinhood/models/db/MarketHours;)Lcom/robinhood/utils/resource/StringResource;", "getExtendedHoursDetailText", "Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;", "variant", "j$/time/Clock", Card.Icon.CLOCK, "getAllDayHoursDetailText", "(Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;Lj$/time/Clock;)Lcom/robinhood/utils/resource/StringResource;", "lib-trade-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.tradesettings.utils.MarketHoursKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class MarketHours2 {

    /* compiled from: MarketHours.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.tradesettings.utils.MarketHoursKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TradingSessionSubtitleExperiment.Variant.values().length];
            try {
                iArr[TradingSessionSubtitleExperiment.Variant.CONTROL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradingSessionSubtitleExperiment.Variant.MEMBER1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradingSessionSubtitleExperiment.Variant.MEMBER2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getRegularHoursDetailText(MarketHours marketHours) {
        String str;
        Instant regularClosesAt;
        String str2;
        Instant regularOpensAt;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C14990R.string.order_create_secondary_detail_format;
        String str3 = "";
        if (marketHours == null || (regularOpensAt = marketHours.getRegularOpensAt()) == null || (str = InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) regularOpensAt)) == null) {
            str = "";
        }
        if (marketHours != null && (regularClosesAt = marketHours.getRegularClosesAt()) != null && (str2 = InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) regularClosesAt)) != null) {
            str3 = str2;
        }
        return companion.invoke(i, str, str3);
    }

    public static final StringResource getExtendedHoursDetailText(MarketHours marketHours) {
        String str;
        Instant extendedClosesAt;
        String str2;
        Instant extendedOpensAt;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C14990R.string.order_create_secondary_detail_format;
        String str3 = "";
        if (marketHours == null || (extendedOpensAt = marketHours.getExtendedOpensAt()) == null || (str = InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) extendedOpensAt)) == null) {
            str = "";
        }
        if (marketHours != null && (extendedClosesAt = marketHours.getExtendedClosesAt()) != null && (str2 = InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) extendedClosesAt)) != null) {
            str3 = str2;
        }
        return companion.invoke(i, str, str3);
    }

    public static /* synthetic */ StringResource getAllDayHoursDetailText$default(MarketHours marketHours, TradingSessionSubtitleExperiment.Variant variant, Clock clock, int i, Object obj) {
        if ((i & 1) != 0) {
            variant = TradingSessionSubtitleExperiment.Variant.CONTROL;
        }
        return getAllDayHoursDetailText(marketHours, variant, clock);
    }

    public static final StringResource getAllDayHoursDetailText(MarketHours marketHours, TradingSessionSubtitleExperiment.Variant variant, Clock clock) {
        String str;
        Instant allDayClosesAt;
        String str2;
        Instant allDayOpensAt;
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(clock, "clock");
        String str3 = "";
        if (marketHours == null || (allDayOpensAt = marketHours.getAllDayOpensAt()) == null || (str = InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) allDayOpensAt)) == null) {
            str = "";
        }
        if (marketHours != null && (allDayClosesAt = marketHours.getAllDayClosesAt()) != null && (str2 = InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) allDayClosesAt)) != null) {
            str3 = str2;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[variant.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C14990R.string.order_create_secondary_detail_format, str, str3);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C14990R.string.trading_session_24hr_member1, str);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ZoneId zoneIdM3448of = ZoneId.m3448of("America/New_York");
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(clock.withZone(zoneIdM3448of));
        ZonedDateTime zonedDateTimeWithNano = zonedDateTimeNow.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY)).withHour(20).withMinute(0).withSecond(0).withNano(0);
        ZonedDateTime zonedDateTimeWithNano2 = zonedDateTimeNow.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)).withHour(20).withMinute(0).withSecond(0).withNano(0);
        ZonedDateTime zonedDateTimeMo3460b = zonedDateTimeWithNano.mo3460b(zoneIdSystemDefault);
        ZonedDateTime zonedDateTimeMo3460b2 = zonedDateTimeWithNano2.mo3460b(zoneIdSystemDefault);
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("EEEE");
        return StringResource.INSTANCE.invoke(C14990R.string.trading_session_24hr_member2, zonedDateTimeMo3460b.format(dateTimeFormatterOfPattern), zonedDateTimeMo3460b2.format(dateTimeFormatterOfPattern), zonedDateTimeMo3460b2.format(DateTimeFormatter.ofPattern("h:mm a")));
    }
}
