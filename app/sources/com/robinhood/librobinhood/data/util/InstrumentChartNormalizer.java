package com.robinhood.librobinhood.data.util;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.charts.normalizer.ChartNormalizer;
import com.robinhood.android.models.charts.normalizer.CursorGradient;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizationChartData;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizationQuote;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizationQuote2;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizedChart;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.bonfire.instrument.SduiInstrumentChart;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.IconDisplayText;
import com.robinhood.models.serverdriven.experimental.api.LinearGradientColor;
import com.robinhood.models.serverdriven.experimental.api.SubDisplayText;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: InstrumentChartNormalizer.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\u001a-\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;", "Lcom/robinhood/models/db/Quote;", "quote", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "selectedDisplaySpan", "j$/time/Clock", Card.Icon.CLOCK, "renormalizeIfNecessary", "(Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lj$/time/Clock;)Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;", "lib-store-equity-shared_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.util.InstrumentChartNormalizerKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class InstrumentChartNormalizer {
    public static /* synthetic */ SduiInstrumentChart renormalizeIfNecessary$default(SduiInstrumentChart sduiInstrumentChart, Quote quote, DisplaySpan displaySpan, Clock clock, int i, Object obj) {
        if ((i & 4) != 0) {
            clock = Clock.systemDefaultZone();
        }
        return renormalizeIfNecessary(sduiInstrumentChart, quote, displaySpan, clock);
    }

    public static final SduiInstrumentChart renormalizeIfNecessary(SduiInstrumentChart sduiInstrumentChart, Quote quote, DisplaySpan selectedDisplaySpan, Clock clock) {
        NormalizationQuote normalizationQuote;
        SubDisplayText tertiary_value;
        IconDisplayText main;
        SubDisplayText secondary_value;
        IconDisplayText main2;
        Intrinsics.checkNotNullParameter(sduiInstrumentChart, "<this>");
        Intrinsics.checkNotNullParameter(selectedDisplaySpan, "selectedDisplaySpan");
        Intrinsics.checkNotNullParameter(clock, "clock");
        ChartNormalizer chartNormalizer = ChartNormalizer.INSTANCE;
        NormalizationChartData normalizationChartData = new NormalizationChartData(sduiInstrumentChart.getPageDirection(), sduiInstrumentChart.getDefaultDisplay(), sduiInstrumentChart.getOverlays(), new NormalizedChart(sduiInstrumentChart.getChart().getLines(), sduiInstrumentChart.getChart().getFills()), sduiInstrumentChart.getNormalizationData());
        if (quote != null) {
            Money lastNonRegularHoursTradePrice = quote.getLastNonRegularHoursTradePrice();
            normalizationQuote = new NormalizationQuote(lastNonRegularHoursTradePrice != null ? lastNonRegularHoursTradePrice.getDecimalValue() : null, quote.getLastRegularHoursTradePrice().getDecimalValue(), new NormalizationQuote2.Money(quote.getLastRegularHoursTradePrice().getCurrency()), quote.getTradingHalted(), quote.getReceivedAt());
        } else {
            normalizationQuote = null;
        }
        CursorData defaultDisplay = sduiInstrumentChart.getDefaultDisplay();
        LinearGradientColor gradient_color = (defaultDisplay == null || (secondary_value = defaultDisplay.getSecondary_value()) == null || (main2 = secondary_value.getMain()) == null) ? null : main2.getGradient_color();
        CursorData defaultDisplay2 = sduiInstrumentChart.getDefaultDisplay();
        CursorGradient cursorGradient = new CursorGradient(gradient_color, (defaultDisplay2 == null || (tertiary_value = defaultDisplay2.getTertiary_value()) == null || (main = tertiary_value.getMain()) == null) ? null : main.getGradient_color());
        CursorData defaultDisplay3 = sduiInstrumentChart.getDefaultDisplay();
        NormalizationChartData normalizationChartDataRenormalizedIfNecessary = chartNormalizer.renormalizedIfNecessary(normalizationChartData, normalizationQuote, selectedDisplaySpan, cursorGradient, defaultDisplay3 != null ? defaultDisplay3.getAction() : null, clock);
        return SduiInstrumentChart.copy$default(sduiInstrumentChart, null, null, normalizationChartDataRenormalizedIfNecessary.getCursorData(), null, false, null, normalizationChartDataRenormalizedIfNecessary.getOverlays(), normalizationChartDataRenormalizedIfNecessary.getPageDirection(), null, null, Chart.copy$default(sduiInstrumentChart.getChart(), null, null, normalizationChartDataRenormalizedIfNecessary.getChart().getLines(), null, null, null, normalizationChartDataRenormalizedIfNecessary.getChart().getFills(), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, null), null, normalizationChartDataRenormalizedIfNecessary.getNormalizationData(), 2875, null);
    }
}
