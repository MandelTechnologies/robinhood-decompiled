package com.robinhood.librobinhood.p297ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.models.p080db.OptionHistoricalChartData;
import com.robinhood.android.charts.models.p080db.OptionHistoricalChartModel;
import com.robinhood.android.models.charts.normalizer.ChartNormalizer;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizationChartData;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizationQuote;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizationQuote2;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizedChart;
import com.robinhood.models.api.OptionQuoteSessionType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import com.robinhood.models.p320db.OptionSessionQuote;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.SubDisplayText;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: OptionChartNormalizer.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;", "Lcom/robinhood/models/db/AggregateOptionStrategyQuote;", "quote", "j$/time/Clock", Card.Icon.CLOCK, "normalize", "(Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;Lcom/robinhood/models/db/AggregateOptionStrategyQuote;Lj$/time/Clock;)Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;", "lib-store-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.ui.OptionChartNormalizerKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class OptionChartNormalizer {
    public static /* synthetic */ OptionHistoricalChartModel normalize$default(OptionHistoricalChartModel optionHistoricalChartModel, AggregateOptionStrategyQuote aggregateOptionStrategyQuote, Clock clock, int i, Object obj) {
        if ((i & 2) != 0) {
            clock = Clock.systemDefaultZone();
        }
        return normalize(optionHistoricalChartModel, aggregateOptionStrategyQuote, clock);
    }

    public static final OptionHistoricalChartModel normalize(OptionHistoricalChartModel optionHistoricalChartModel, AggregateOptionStrategyQuote quote, Clock clock) {
        BigDecimal unsignedValue;
        SubDisplayText tertiary_value;
        SubDisplayText tertiary_value2;
        BigDecimal adjustedMarkPrice;
        OptionSessionQuote nonRegSession;
        BigDecimal adjustedMarkPrice2;
        Intrinsics.checkNotNullParameter(optionHistoricalChartModel, "<this>");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(clock, "clock");
        OptionHistoricalChartData chartData = optionHistoricalChartModel.getChartData();
        if (chartData == null) {
            return optionHistoricalChartModel;
        }
        ChartNormalizer chartNormalizer = ChartNormalizer.INSTANCE;
        NormalizationChartData normalizationChartData = new NormalizationChartData(chartData.getPageDirection(), chartData.getDefaultDisplay(), CollectionsKt.emptyList(), new NormalizedChart(chartData.getChart().getLines(), chartData.getChart().getFills()), chartData.getNormalizationData());
        CursorData cursorDataCopy$default = null;
        BigDecimal bigDecimalAbs = (quote.getLatestQuoteSession() != OptionQuoteSessionType.NON_REGULAR || (nonRegSession = quote.getNonRegSession()) == null || (adjustedMarkPrice2 = nonRegSession.getAdjustedMarkPrice()) == null) ? null : adjustedMarkPrice2.abs();
        OptionSessionQuote regSession = quote.getRegSession();
        if (regSession == null || (adjustedMarkPrice = regSession.getAdjustedMarkPrice()) == null || (unsignedValue = adjustedMarkPrice.abs()) == null) {
            unsignedValue = quote.getAdjustedMarkPrice().getUnsignedValue();
        }
        NormalizationChartData normalizationChartDataRenormalizedIfNecessary$default = ChartNormalizer.renormalizedIfNecessary$default(chartNormalizer, normalizationChartData, new NormalizationQuote(bigDecimalAbs, unsignedValue, new NormalizationQuote2.Money(Currencies.USD), false, quote.getReceivedAt()), optionHistoricalChartModel.getDisplaySpan(), null, null, clock, 8, null);
        CursorData cursorData = normalizationChartDataRenormalizedIfNecessary$default.getCursorData();
        if (cursorData != null) {
            CursorData cursorData2 = normalizationChartDataRenormalizedIfNecessary$default.getCursorData();
            if (cursorData2 == null || (tertiary_value2 = cursorData2.getTertiary_value()) == null) {
                CursorData defaultDisplay = chartData.getDefaultDisplay();
                tertiary_value = defaultDisplay != null ? defaultDisplay.getTertiary_value() : null;
            } else {
                tertiary_value = tertiary_value2;
            }
            cursorDataCopy$default = CursorData.copy$default(cursorData, null, null, null, null, null, null, tertiary_value, null, null, null, 959, null);
        }
        return OptionHistoricalChartModel.copy$default(optionHistoricalChartModel, null, OptionHistoricalChartData.copy$default(chartData, null, null, cursorDataCopy$default, Chart.copy$default(chartData.getChart(), null, null, normalizationChartDataRenormalizedIfNecessary$default.getChart().getLines(), null, null, null, normalizationChartDataRenormalizedIfNecessary$default.getChart().getFills(), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, null), null, normalizationChartDataRenormalizedIfNecessary$default.getPageDirection(), false, normalizationChartDataRenormalizedIfNecessary$default.getOverlays(), null, 339, null), null, false, false, 29, null);
    }
}
