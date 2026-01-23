package com.robinhood.android.common.options.chart;

import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.charts.util.GraphSelection2;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.NumberUtils;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexHistoricalDataPoint;
import com.robinhood.android.indexes.models.p159db.IndexHistoricals;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.models.p355ui.UiQuoteHistorical;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionHistoricalChartHelper.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a7\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000f\u001a-\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u0014\u001a$\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019\u001a$\u0010\u001a\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u001a5\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010 \u001a5\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\"¨\u0006#"}, m3636d2 = {"getDeltaColor", "Landroidx/compose/ui/graphics/Color;", "isUpOrFlat", "", "isStale", "(ZZLandroidx/compose/runtime/Composer;I)J", "getUnderlyingPriceChangeString", "Landroidx/compose/ui/text/AnnotatedString;", "equitySymbol", "", "equityQuote", "Lcom/robinhood/models/db/Quote;", "currentPrice", "Ljava/math/BigDecimal;", "deltaPercent", "(Ljava/lang/String;Lcom/robinhood/models/db/Quote;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "getUnderlyingValueChangeString", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "symbol", "(Ljava/math/BigDecimal;Lcom/robinhood/android/indexes/models/db/IndexValue;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "getEquityDeltaFromPrice", "equityHistorical", "Lcom/robinhood/models/ui/UiQuoteHistorical;", "displaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getIndexDeltaStart", "indexCloseValue", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "indexHistoricals", "Lcom/robinhood/android/indexes/models/db/IndexHistoricals;", "getUnderlyingPriceInfo", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/models/ui/UiQuoteHistorical;Lcom/robinhood/models/db/Quote;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "getUnderlyingValueInfo", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/android/indexes/models/db/IndexCloseValue;Lcom/robinhood/android/indexes/models/db/IndexHistoricals;Lcom/robinhood/android/indexes/models/db/IndexValue;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "feature-lib-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.options.chart.OptionHistoricalChartHelperKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class OptionHistoricalChartHelper {

    /* compiled from: OptionHistoricalChartHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.chart.OptionHistoricalChartHelperKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplaySpan.values().length];
            try {
                iArr[DisplaySpan.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySpan.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySpan.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisplaySpan.f93673MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisplaySpan.YEAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DisplaySpan.ALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long getDeltaColor(boolean z, boolean z2, Composer composer, int i) {
        long jM21452getNegative0d7_KjU;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-130768494, i, -1, "com.robinhood.android.common.options.chart.getDeltaColor (OptionHistoricalChartHelper.kt:36)");
        }
        if (z2) {
            composer.startReplaceGroup(-1114466347);
            jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
            composer.endReplaceGroup();
        } else if (z) {
            composer.startReplaceGroup(-1114465062);
            jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1114463814);
            jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM21452getNegative0d7_KjU;
    }

    public static final AnnotatedString getUnderlyingPriceChangeString(String str, Quote quote, BigDecimal bigDecimal, BigDecimal bigDecimal2, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(236571191, i, -1, "com.robinhood.android.common.options.chart.getUnderlyingPriceChangeString (OptionHistoricalChartHelper.kt:48)");
        }
        if (str == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return null;
        }
        if (quote == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return null;
        }
        if (bigDecimal == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return null;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(str);
        builder.append(' ');
        if (bigDecimal2 == null) {
            builder.append(Formats.getCurrencyFormat().format(bigDecimal));
        } else {
            int iPushStyle = builder.pushStyle(new SpanStyle(getDeltaColor(!BigDecimals7.isNegative(bigDecimal2), quote.isStaleForUi(), composer, 0), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(C11048R.string.general_number_and_percent_change_format, new Object[]{Formats.getCurrencyFormat().format(bigDecimal), Formats.getPercentDeltaFormat().format(bigDecimal2)}, composer, 0));
                Unit unit = Unit.INSTANCE;
            } finally {
                builder.pop(iPushStyle);
            }
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return annotatedString;
    }

    public static final AnnotatedString getUnderlyingValueChangeString(BigDecimal bigDecimal, IndexValue indexValue, String str, Composer composer, int i) {
        BigDecimal value;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1490718947, i, -1, "com.robinhood.android.common.options.chart.getUnderlyingValueChangeString (OptionHistoricalChartHelper.kt:79)");
        }
        if (str == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return null;
        }
        if (indexValue == null || (value = indexValue.getValue()) == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return null;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(str);
        builder.append(' ');
        String str2 = Formats.getNoCurrencyFormat().format(value);
        if (bigDecimal == null) {
            builder.append(str2);
        } else {
            int iPushStyle = builder.pushStyle(new SpanStyle(getDeltaColor(!BigDecimals7.isNegative(bigDecimal), indexValue.isStaleForUi(), composer, 0), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(C11048R.string.general_number_and_percent_change_format, new Object[]{str2, Formats.getPercentDeltaFormat().format(bigDecimal)}, composer, 0));
                Unit unit = Unit.INSTANCE;
            } finally {
                builder.pop(iPushStyle);
            }
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return annotatedString;
    }

    public static final BigDecimal getEquityDeltaFromPrice(Quote quote, UiQuoteHistorical uiQuoteHistorical, DisplaySpan displaySpan) {
        Money openPrice;
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        if (quote == null || uiQuoteHistorical == null) {
            return null;
        }
        List dataPointsForDisplay$default = Historical.DefaultImpls.getDataPointsForDisplay$default(uiQuoteHistorical, quote.getLastTradePrice(), quote.getReceivedAt(), GraphSelection2.getEquityGraphSelection(displaySpan), null, null, 24, null);
        if (WhenMappings.$EnumSwitchMapping$0[displaySpan.ordinal()] == 1) {
            Money previousClose = uiQuoteHistorical.getPreviousClose();
            if (previousClose != null) {
                return Money3.getBigDecimalCompat(previousClose);
            }
            return null;
        }
        DataPoint.Asset asset = (DataPoint.Asset) CollectionsKt.firstOrNull(dataPointsForDisplay$default);
        if (asset == null || (openPrice = asset.getOpenPrice()) == null) {
            return null;
        }
        return Money3.getBigDecimalCompat(openPrice);
    }

    public static final BigDecimal getIndexDeltaStart(DisplaySpan displaySpan, IndexCloseValue indexCloseValue, IndexHistoricals indexHistoricals) {
        List<IndexHistoricalDataPoint> dataPoints;
        IndexHistoricalDataPoint indexHistoricalDataPoint;
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        int i = WhenMappings.$EnumSwitchMapping$0[displaySpan.ordinal()];
        if (i == 1) {
            if (indexCloseValue != null) {
                return indexCloseValue.getCloseValue();
            }
            return null;
        }
        if ((i != 2 && i != 3 && i != 4 && i != 5) || indexHistoricals == null || (dataPoints = indexHistoricals.getDataPoints()) == null || (indexHistoricalDataPoint = (IndexHistoricalDataPoint) CollectionsKt.firstOrNull((List) dataPoints)) == null) {
            return null;
        }
        return indexHistoricalDataPoint.getOpenValue();
    }

    public static final AnnotatedString getUnderlyingPriceInfo(DisplaySpan displaySpan, UiQuoteHistorical uiQuoteHistorical, Quote quote, String str, Composer composer, int i) {
        Money lastTradePrice;
        BigDecimal decimalValue;
        BigDecimal bigDecimal;
        Money lastRegularHoursTradePrice;
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1162254646, i, -1, "com.robinhood.android.common.options.chart.getUnderlyingPriceInfo (OptionHistoricalChartHelper.kt:150)");
        }
        BigDecimal equityDeltaFromPrice = getEquityDeltaFromPrice(quote, uiQuoteHistorical, displaySpan);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        BigDecimal bigDecimalCalculateDeltaPercentFrom = null;
        if (iArr[displaySpan.ordinal()] == 1) {
            if (quote != null && (lastRegularHoursTradePrice = quote.getLastRegularHoursTradePrice()) != null) {
                decimalValue = Money3.getBigDecimalCompat(lastRegularHoursTradePrice);
                bigDecimal = decimalValue;
            }
            bigDecimal = null;
        } else {
            if (quote != null && (lastTradePrice = quote.getLastTradePrice()) != null) {
                decimalValue = lastTradePrice.getDecimalValue();
                bigDecimal = decimalValue;
            }
            bigDecimal = null;
        }
        if (iArr[displaySpan.ordinal()] != 6 && bigDecimal != null) {
            bigDecimalCalculateDeltaPercentFrom = NumberUtils.calculateDeltaPercentFrom(bigDecimal, equityDeltaFromPrice);
        }
        AnnotatedString underlyingPriceChangeString = getUnderlyingPriceChangeString(str, quote, bigDecimal, bigDecimalCalculateDeltaPercentFrom, composer, ((i >> 9) & 14) | ((i >> 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return underlyingPriceChangeString;
    }

    public static final AnnotatedString getUnderlyingValueInfo(DisplaySpan displaySpan, IndexCloseValue indexCloseValue, IndexHistoricals indexHistoricals, IndexValue indexValue, Composer composer, int i) {
        BigDecimal value;
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-627242538, i, -1, "com.robinhood.android.common.options.chart.getUnderlyingValueInfo (OptionHistoricalChartHelper.kt:179)");
        }
        AnnotatedString underlyingValueChangeString = getUnderlyingValueChangeString((WhenMappings.$EnumSwitchMapping$0[displaySpan.ordinal()] == 6 || indexValue == null || (value = indexValue.getValue()) == null) ? null : NumberUtils.calculateDeltaPercentFrom(value, getIndexDeltaStart(displaySpan, indexCloseValue, indexHistoricals)), indexValue, indexValue != null ? indexValue.getSymbol() : null, composer, (i >> 6) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return underlyingValueChangeString;
    }
}
