package com.robinhood.shared.common.earnings;

import android.content.Context;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.common.earnings.EarningsCall;
import com.robinhood.shared.common.earnings.EarningsViewState;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Earning;
import com.robinhood.shared.equities.models.instrumentdetails.p381ui.UiEarnings;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.MonthDayFormatter;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.threeten.extra.AmPm;
import org.threeten.extra.YearQuarter;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneOffset;
import rh_server_driven_ui.p531v1.ChartGroupDto;

/* compiled from: EarningsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010$\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u001f\u0010)\u001a\u00020\f2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+¨\u0006,"}, m3636d2 = {"Lcom/robinhood/shared/common/earnings/EarningsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/common/earnings/EarningsDataState;", "Lcom/robinhood/shared/common/earnings/EarningsViewState;", "Landroid/content/Context;", "context", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Landroid/content/Context;Lj$/time/Clock;)V", "j$/time/LocalDate", "reportDate", "", "getActualEpsAvailability", "(Lj$/time/LocalDate;)Ljava/lang/String;", "Ljava/math/BigDecimal;", "value", "getEpsValue", "(Ljava/math/BigDecimal;)Ljava/lang/String;", "dataState", "reduce", "(Lcom/robinhood/shared/common/earnings/EarningsDataState;)Lcom/robinhood/shared/common/earnings/EarningsViewState;", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning;", "earning", "j$/time/Instant", "currentTime", "Lcom/robinhood/shared/common/earnings/EarningsCall;", "getEarningsCall$lib_earnings_externalDebug", "(Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning;Lj$/time/Instant;)Lcom/robinhood/shared/common/earnings/EarningsCall;", "getEarningsCall", "actualEpsAvailabilityDay", "", "actualEpsAvailabilityIsPreMarket", "actualEpsAvailabilityVerified", "getEpsAvailability$lib_earnings_externalDebug", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/String;", "getEpsAvailability", "Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;", "uiEarnings", "getHeader$lib_earnings_externalDebug", "(Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;Landroid/content/Context;)Ljava/lang/String;", "getHeader", "Landroid/content/Context;", "Lj$/time/Clock;", "lib-earnings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class EarningsStateProvider implements StateProvider<EarningsDataState, EarningsViewState> {
    public static final int $stable = 8;
    private final Clock clock;
    private final Context context;

    public EarningsStateProvider(Context context, Clock clock) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.context = context;
        this.clock = clock;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public EarningsViewState reduce(EarningsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getNoEarnings()) {
            return EarningsViewState.LoadedNoEarnings.INSTANCE;
        }
        if (dataState.getChartData() == null || dataState.getUiEarnings() == null) {
            return EarningsViewState.Loading.INSTANCE;
        }
        Earning mostRecentEarning = dataState.getUiEarnings().getMostRecentEarning();
        if (mostRecentEarning == null) {
            return EarningsViewState.LoadedNoEarnings.INSTANCE;
        }
        ChartGroupDto chartData = dataState.getChartData();
        Earning.Eps eps = mostRecentEarning.getEps();
        String epsValue = getEpsValue(eps != null ? eps.getEstimate() : null);
        Earning.Eps eps2 = mostRecentEarning.getEps();
        String epsValue2 = getEpsValue(eps2 != null ? eps2.getActual() : null);
        Context context = this.context;
        Earning.Report report = mostRecentEarning.getReport();
        String actualEpsAvailability = getActualEpsAvailability(report != null ? report.getDate() : null);
        Earning.Report report2 = mostRecentEarning.getReport();
        Boolean boolValueOf = Boolean.valueOf((report2 != null ? report2.getTiming() : null) == AmPm.AM);
        Earning.Report report3 = mostRecentEarning.getReport();
        String epsAvailability$lib_earnings_externalDebug = getEpsAvailability$lib_earnings_externalDebug(context, actualEpsAvailability, boolValueOf, report3 != null ? Boolean.valueOf(report3.getVerified()) : null);
        Instant instant = this.clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        EarningsCall earningsCall$lib_earnings_externalDebug = getEarningsCall$lib_earnings_externalDebug(mostRecentEarning, instant);
        String headerOverride = dataState.getHeaderOverride();
        if (headerOverride == null) {
            headerOverride = getHeader$lib_earnings_externalDebug(dataState.getUiEarnings(), this.context);
        }
        return new EarningsViewState.Loaded(headerOverride, epsValue, epsValue2, epsAvailability$lib_earnings_externalDebug, earningsCall$lib_earnings_externalDebug, chartData);
    }

    public final EarningsCall getEarningsCall$lib_earnings_externalDebug(Earning earning, Instant currentTime) {
        Earning.Call call;
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        if (earning != null && (call = earning.getCall()) != null) {
            String broadcastUrl = call.getBroadcastUrl();
            String replayUrl = call.getReplayUrl();
            boolean zShouldShowJoinBtn = earning.shouldShowJoinBtn(currentTime);
            boolean zShouldShowPreviewBtn = earning.shouldShowPreviewBtn(currentTime);
            boolean zShouldShowReplayBtn = earning.shouldShowReplayBtn(currentTime);
            if (zShouldShowJoinBtn) {
                if (broadcastUrl == null) {
                    return null;
                }
                return new EarningsCall(broadcastUrl, EarningsCall.Type.JOIN);
            }
            if (zShouldShowPreviewBtn) {
                if (broadcastUrl == null) {
                    return null;
                }
                return new EarningsCall(broadcastUrl, EarningsCall.Type.PREVIEW);
            }
            if (!zShouldShowReplayBtn || replayUrl == null) {
                return null;
            }
            return new EarningsCall(replayUrl, EarningsCall.Type.REPLAY);
        }
        return null;
    }

    public final String getEpsAvailability$lib_earnings_externalDebug(Context context, String actualEpsAvailabilityDay, Boolean actualEpsAvailabilityIsPreMarket, Boolean actualEpsAvailabilityVerified) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string2 = null;
        if (actualEpsAvailabilityDay == null) {
            return null;
        }
        if (actualEpsAvailabilityIsPreMarket != null) {
            if (Intrinsics.areEqual(actualEpsAvailabilityIsPreMarket, Boolean.TRUE)) {
                string2 = context.getString(C37450R.string.earnings_timing_am);
            } else {
                if (!Intrinsics.areEqual(actualEpsAvailabilityIsPreMarket, Boolean.FALSE)) {
                    throw new NoWhenBranchMatchedException();
                }
                string2 = context.getString(C37450R.string.earnings_timing_pm);
            }
        }
        if (string2 == null) {
            if (Intrinsics.areEqual(actualEpsAvailabilityVerified, Boolean.TRUE)) {
                return context.getString(C37450R.string.instrument_detail_earnings_eps_available_no_timing_format, actualEpsAvailabilityDay);
            }
            return context.getString(C37450R.string.f6200x84cdcb91, actualEpsAvailabilityDay);
        }
        if (Intrinsics.areEqual(actualEpsAvailabilityVerified, Boolean.TRUE)) {
            return context.getString(C37450R.string.instrument_detail_earnings_eps_available_format, actualEpsAvailabilityDay, string2);
        }
        return context.getString(C37450R.string.instrument_detail_earnings_eps_available_unverified_format, actualEpsAvailabilityDay, string2);
    }

    private final String getActualEpsAvailability(LocalDate reportDate) {
        if (reportDate == null) {
            return null;
        }
        LocalDate localDate = reportDate.atStartOfDay().atOffset(ZoneOffset.UTC).toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        return MonthDayFormatter.MEDIUM.format(LocalDates4.getMonthDay(localDate));
    }

    private final String getEpsValue(BigDecimal value) {
        Money money;
        if (value == null || (money = Money3.toMoney(value, Currencies.USD)) == null) {
            return null;
        }
        return Money.format$default(money, CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), false, null, false, 0, null, false, null, false, false, 1022, null);
    }

    public final String getHeader$lib_earnings_externalDebug(UiEarnings uiEarnings, Context context) {
        YearQuarter yearQuarter;
        Intrinsics.checkNotNullParameter(uiEarnings, "uiEarnings");
        Intrinsics.checkNotNullParameter(context, "context");
        Earning mostRecentEarning = uiEarnings.getMostRecentEarning();
        if (mostRecentEarning != null && (yearQuarter = mostRecentEarning.getYearQuarter()) != null) {
            String string2 = context.getString(C37450R.string.earnings_title, Integer.valueOf(yearQuarter.getQuarterValue()));
            if (string2 != null) {
                return string2;
            }
        }
        String string3 = context.getString(C37450R.string.earnings_title_default);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }
}
