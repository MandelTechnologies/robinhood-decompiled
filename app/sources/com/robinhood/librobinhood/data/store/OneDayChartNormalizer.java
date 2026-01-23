package com.robinhood.librobinhood.data.store;

import com.robinhood.android.charts.models.p080db.ChartLine;
import com.robinhood.android.charts.models.p080db.ChartPoint;
import com.robinhood.android.charts.models.p080db.LineType;
import com.robinhood.android.models.charts.normalizer.ChartNormalizer;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizationChartData;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizationData;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizationQuote;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizationQuote2;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizedChart;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.onedaycharts.api.InstrumentType;
import com.robinhood.models.onedaycharts.p336db.InstrumentOneDayChart;
import com.robinhood.models.onedaycharts.p336db.NonInteractiveChart;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.DottedLineType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.Segment;
import com.robinhood.models.serverdriven.experimental.api.SolidLineType;
import com.robinhood.models.serverdriven.experimental.api.Style;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md_server_proxy.service.p483v1.PerpetualQuoteDto;
import md_server_proxy.service.p483v1.TokenizedStockQuoteDto;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: OneDayChartNormalizer.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0015\u001a\u00020\u0001*\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0015\u001a\u00020\u0001*\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0018\u001a\u0019\u0010\u0015\u001a\u00020\u0001*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0015\u0010\u001c\u001a\u0019\u0010\u0015\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/models/onedaycharts/db/InstrumentOneDayChart;", "Lcom/robinhood/android/models/charts/normalizer/db/NormalizationQuote;", "quote", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "selectedDisplaySpan", "Lcom/robinhood/models/onedaycharts/api/InstrumentType;", "instrumentType", "", "inMiniChartSyncExperiment", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/OneDayChartData;", "renormalizeIfNecessary", "(Lcom/robinhood/models/onedaycharts/db/InstrumentOneDayChart;Lcom/robinhood/android/models/charts/normalizer/db/NormalizationQuote;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/models/onedaycharts/api/InstrumentType;ZLj$/time/Clock;)Lcom/robinhood/librobinhood/data/store/OneDayChartData;", "Lcom/robinhood/models/serverdriven/experimental/api/Style;", "isPrimaryLine", "isNonNegative", "Lcom/robinhood/android/charts/models/db/ChartLine$Segment$Style;", "toSegmentStyle", "(Lcom/robinhood/models/serverdriven/experimental/api/Style;ZLjava/lang/Boolean;Lcom/robinhood/models/onedaycharts/api/InstrumentType;Z)Lcom/robinhood/android/charts/models/db/ChartLine$Segment$Style;", "Lcom/robinhood/models/db/Quote;", "toNormalizationQuote", "(Lcom/robinhood/models/db/Quote;)Lcom/robinhood/android/models/charts/normalizer/db/NormalizationQuote;", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "(Lcom/robinhood/models/crypto/db/CryptoQuote;)Lcom/robinhood/android/models/charts/normalizer/db/NormalizationQuote;", "Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;", "j$/time/Instant", "timestamp", "(Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;Lj$/time/Instant;)Lcom/robinhood/android/models/charts/normalizer/db/NormalizationQuote;", "Lmd_server_proxy/service/v1/PerpetualQuoteDto;", "(Lmd_server_proxy/service/v1/PerpetualQuoteDto;Lj$/time/Instant;)Lcom/robinhood/android/models/charts/normalizer/db/NormalizationQuote;", "lib-store-one-day-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.OneDayChartNormalizerKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class OneDayChartNormalizer {

    /* compiled from: OneDayChartNormalizer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.OneDayChartNormalizerKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstrumentType.values().length];
            try {
                iArr[InstrumentType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstrumentType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InstrumentType.CRYPTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InstrumentType.CRYPTO_PERPETUALS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InstrumentType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InstrumentType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final OneDayChartData renormalizeIfNecessary(InstrumentOneDayChart instrumentOneDayChart, NormalizationQuote quote, DisplaySpan selectedDisplaySpan, InstrumentType instrumentType, boolean z, Clock clock) {
        Direction pageDirection;
        List<UIComponent<GenericAction>> listEmptyList;
        List<Line> listEmptyList2;
        NormalizationData normalizationData;
        BigDecimal priceBaseline;
        Intrinsics.checkNotNullParameter(instrumentOneDayChart, "<this>");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(selectedDisplaySpan, "selectedDisplaySpan");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(clock, "clock");
        NonInteractiveChart chartData = instrumentOneDayChart.getChartData();
        if (chartData == null || (pageDirection = chartData.getPageDirection()) == null) {
            pageDirection = Direction.f5855UP;
        }
        Direction direction = pageDirection;
        NonInteractiveChart chartData2 = instrumentOneDayChart.getChartData();
        if (chartData2 == null || (listEmptyList = chartData2.getOverlays()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<UIComponent<GenericAction>> list = listEmptyList;
        NonInteractiveChart chartData3 = instrumentOneDayChart.getChartData();
        if (chartData3 == null || (listEmptyList2 = chartData3.getLines()) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        NormalizedChart normalizedChart = new NormalizedChart(listEmptyList2, CollectionsKt.emptyList());
        NonInteractiveChart chartData4 = instrumentOneDayChart.getChartData();
        NormalizationChartData normalizationChartDataRenormalizedIfNecessary$default = ChartNormalizer.renormalizedIfNecessary$default(ChartNormalizer.INSTANCE, new NormalizationChartData(direction, null, list, normalizedChart, chartData4 != null ? chartData4.getNormalizationData() : null), quote, selectedDisplaySpan, null, null, clock, 12, null);
        NonInteractiveChart chartData5 = instrumentOneDayChart.getChartData();
        Boolean boolValueOf = (chartData5 == null || (normalizationData = chartData5.getNormalizationData()) == null || (priceBaseline = normalizationData.getPriceBaseline()) == null) ? null : Boolean.valueOf(quote.getLastTradePrice().compareTo(priceBaseline) >= 0);
        List<Line> lines = normalizationChartDataRenormalizedIfNecessary$default.getChart().getLines();
        int i = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lines, 10));
        for (Line line : lines) {
            List<Segment> segments = line.getSegments();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, i));
            for (Segment segment : segments) {
                List<Point> points = segment.getPoints();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, i));
                for (Point point : points) {
                    arrayList3.add(new ChartPoint(point.getX(), point.getY(), null));
                }
                ChartLine.Segment.Style segmentStyle = toSegmentStyle(segment.getStyles().getDefault(), line.is_primary(), boolValueOf, instrumentType, z);
                Style active = segment.getStyles().getActive();
                ChartLine.Segment.Style segmentStyle2 = active != null ? toSegmentStyle(active, line.is_primary(), boolValueOf, instrumentType, z) : null;
                Style inactive = segment.getStyles().getInactive();
                arrayList2.add(new ChartLine.Segment(arrayList3, new ChartLine.Segment.StyleSet(segmentStyle, segmentStyle2, inactive != null ? toSegmentStyle(inactive, line.is_primary(), boolValueOf, instrumentType, z) : null)));
                i = 10;
            }
            arrayList.add(new ChartLine(arrayList2));
            i = 10;
        }
        return new OneDayChartData(arrayList, normalizationChartDataRenormalizedIfNecessary$default.getOverlays(), quote.getReceivedAt());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final ChartLine.Segment.Style toSegmentStyle(Style style, boolean z, Boolean bool, InstrumentType instrumentType, boolean z2) {
        Color color;
        LineType solid;
        if (bool != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    if (bool.booleanValue()) {
                        color = Color.POSITIVE;
                        break;
                    } else {
                        color = Color.NEGATIVE;
                        break;
                    }
                case 6:
                    color = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        ThemedColor themedColor = color != null ? new ThemedColor(color, color) : null;
        if (!z || themedColor == null || !z2) {
            themedColor = style.getColor();
        }
        float opacity = style.getOpacity();
        com.robinhood.models.serverdriven.experimental.api.LineType line_type = style.getLine_type();
        if (line_type instanceof DottedLineType) {
            solid = new LineType.Dotted(((DottedLineType) line_type).getDash_gap());
        } else {
            if (!(line_type instanceof SolidLineType)) {
                throw new NoWhenBranchMatchedException();
            }
            solid = new LineType.Solid((int) ((SolidLineType) line_type).getStroke_width());
        }
        return new ChartLine.Segment.Style(themedColor, opacity, solid);
    }

    public static final NormalizationQuote toNormalizationQuote(Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "<this>");
        Money lastNonRegularHoursTradePrice = quote.getLastNonRegularHoursTradePrice();
        return new NormalizationQuote(lastNonRegularHoursTradePrice != null ? lastNonRegularHoursTradePrice.getDecimalValue() : null, quote.getLastRegularHoursTradePrice().getDecimalValue(), new NormalizationQuote2.Money(quote.getLastRegularHoursTradePrice().getCurrency()), quote.getTradingHalted(), quote.getReceivedAt());
    }

    public static final NormalizationQuote toNormalizationQuote(CryptoQuote cryptoQuote) {
        Intrinsics.checkNotNullParameter(cryptoQuote, "<this>");
        return new NormalizationQuote(cryptoQuote.getMarkPrice().getDecimalValue(), cryptoQuote.getMarkPrice().getDecimalValue(), new NormalizationQuote2.Money(cryptoQuote.getMarkPrice().getCurrency()), false, cryptoQuote.getReceivedAt());
    }

    public static final NormalizationQuote toNormalizationQuote(TokenizedStockQuoteDto tokenizedStockQuoteDto, Instant timestamp) {
        Intrinsics.checkNotNullParameter(tokenizedStockQuoteDto, "<this>");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        BigDecimal bigDecimalOrThrow = tokenizedStockQuoteDto.getMark_price().toBigDecimalOrThrow();
        BigDecimal bigDecimalOrThrow2 = tokenizedStockQuoteDto.getMark_price().toBigDecimalOrThrow();
        Currency currency = Currency.getInstance(tokenizedStockQuoteDto.getCurrency_code().getJson_value());
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
        return new NormalizationQuote(bigDecimalOrThrow, bigDecimalOrThrow2, new NormalizationQuote2.Money(currency), false, timestamp);
    }

    public static final NormalizationQuote toNormalizationQuote(PerpetualQuoteDto perpetualQuoteDto, Instant timestamp) {
        Intrinsics.checkNotNullParameter(perpetualQuoteDto, "<this>");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        BigDecimal bigDecimalOrThrow = perpetualQuoteDto.getMid_price().toBigDecimalOrThrow();
        BigDecimal bigDecimalOrThrow2 = perpetualQuoteDto.getMid_price().toBigDecimalOrThrow();
        Currency currency = Currency.getInstance(perpetualQuoteDto.getCurrency_code().getJson_value());
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
        return new NormalizationQuote(bigDecimalOrThrow, bigDecimalOrThrow2, new NormalizationQuote2.Money(currency), false, timestamp);
    }
}
