package com.robinhood.android.indexes.detail;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartEventData;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.options.contracts.OptionChainIntentKey;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.GraphContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageLoggings.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t\u001a&\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012\u001a\"\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\u0016\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u0012\u0010\u0019\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u0012\u0010\u001a\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018¨\u0006\u001b"}, m3636d2 = {"getIndexDetailPageEventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "indexId", "Ljava/util/UUID;", "getIndexDetailPageAssetEventContext", "Lcom/robinhood/rosetta/eventlogging/Asset;", "getIndexDetailPageEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "entryPointIdentifier", "", "getIndexHistoricalChartEventContext", "displaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "showCandlesticks", "", "getIndexDetailPageTradeBarEventAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "logIndexDetailPageTradeBarTap", "", "Lcom/robinhood/analytics/EventLogger;", "logIndexHistoricalChartSpanSelected", "eventData", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartEventData;", "logIndexHistoricalChartCandlestickScrub", "logIndexCurbTooltipAppear", "feature-index-detail-page_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageLoggingsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IndexDetailPageLoggings {

    /* compiled from: IndexDetailPageLoggings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageLoggingsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplaySpan.values().length];
            try {
                iArr[DisplaySpan.HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySpan.DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySpan.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisplaySpan.MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisplaySpan.f93673MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DisplaySpan.YTD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DisplaySpan.YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DisplaySpan.f93695YEAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DisplaySpan.ALL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DisplaySpan.f93684HOUR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DisplaySpan.CORTEX_INSIGHTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DisplaySpan.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Screen getIndexDetailPageEventScreen(UUID indexId) {
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Screen.Name name = Screen.Name.INDEX_DETAIL;
        String string2 = indexId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    public static final Asset getIndexDetailPageAssetEventContext(UUID indexId) {
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        String string2 = indexId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Asset(string2, Asset.AssetType.INDEXES, null, null, 12, null);
    }

    public static final Context getIndexDetailPageEventContext(UUID indexId, String entryPointIdentifier) {
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, entryPointIdentifier, null, null, null, getIndexDetailPageAssetEventContext(indexId), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -17409, -1, -1, -1, -1, -1, 16383, null);
    }

    public static final Context getIndexHistoricalChartEventContext(UUID indexId, String entryPointIdentifier, DisplaySpan displaySpan, boolean z) {
        GraphContext.GraphType graphType;
        GraphContext.Interval interval;
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        Asset indexDetailPageAssetEventContext = getIndexDetailPageAssetEventContext(indexId);
        if (z) {
            graphType = GraphContext.GraphType.CANDLESTICK;
        } else {
            graphType = GraphContext.GraphType.LINE;
        }
        GraphContext.GraphType graphType2 = graphType;
        switch (WhenMappings.$EnumSwitchMapping$0[displaySpan.ordinal()]) {
            case 1:
                interval = GraphContext.Interval.HOUR;
                break;
            case 2:
                interval = GraphContext.Interval.DAY;
                break;
            case 3:
                interval = GraphContext.Interval.WEEK;
                break;
            case 4:
                interval = GraphContext.Interval.MONTH;
                break;
            case 5:
                interval = GraphContext.Interval.THREE_MONTHS;
                break;
            case 6:
                interval = GraphContext.Interval.YEAR_TO_DATE;
                break;
            case 7:
                interval = GraphContext.Interval.YEAR;
                break;
            case 8:
                interval = GraphContext.Interval.FIVE_YEARS;
                break;
            case 9:
                interval = GraphContext.Interval.ALL;
                break;
            case 10:
                interval = GraphContext.Interval.HOUR;
                break;
            case 11:
                interval = GraphContext.Interval.HOUR;
                break;
            case 12:
                interval = GraphContext.Interval.HOUR;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, entryPointIdentifier, null, null, null, indexDetailPageAssetEventContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new GraphContext(graphType2, interval, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -17409, -67108865, -1, -1, -1, -1, 16383, null);
    }

    public static final UserInteractionEventData.Action getIndexDetailPageTradeBarEventAction(IntentKey intentKey) {
        Intrinsics.checkNotNullParameter(intentKey, "intentKey");
        return intentKey instanceof OptionChainIntentKey ? UserInteractionEventData.Action.VIEW_OPTION_CHAIN : intentKey instanceof OptionOnboarding ? UserInteractionEventData.Action.VIEW_OPTION_UPGRADE_FLOW : UserInteractionEventData.Action.ACTION_UNSPECIFIED;
    }

    public static final void logIndexDetailPageTradeBarTap(EventLogger eventLogger, IntentKey intentKey, UUID indexId, String entryPointIdentifier) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(intentKey, "intentKey");
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        EventLogger.DefaultImpls.logTap$default(eventLogger, getIndexDetailPageTradeBarEventAction(intentKey), getIndexDetailPageEventScreen(indexId), new Component(Component.ComponentType.BUTTON, "index_trade_options", null, 4, null), null, getIndexDetailPageEventContext(indexId, entryPointIdentifier), false, 40, null);
    }

    public static final void logIndexHistoricalChartSpanSelected(EventLogger eventLogger, IndexHistoricalChartEventData eventData) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CHANGE_GRAPH_INTERVAL, getIndexDetailPageEventScreen(eventData.getIndexId()), new Component(Component.ComponentType.GRAPH_SECTION, null, null, 6, null), null, getIndexHistoricalChartEventContext(eventData.getIndexId(), eventData.getEntryPointIdentifier(), eventData.getDisplaySpan(), eventData.getShowCandlesticks()), false, 40, null);
    }

    public static final void logIndexHistoricalChartCandlestickScrub(EventLogger eventLogger, IndexHistoricalChartEventData eventData) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        EventLogger.DefaultImpls.logDrag$default(eventLogger, UserInteractionEventData.Action.SCRUB_CANDLESTICK_CHART, getIndexDetailPageEventScreen(eventData.getIndexId()), new Component(Component.ComponentType.PRICE_CHART, null, null, 6, null), null, getIndexHistoricalChartEventContext(eventData.getIndexId(), eventData.getEntryPointIdentifier(), eventData.getDisplaySpan(), eventData.getShowCandlesticks()), false, 40, null);
    }

    public static final void logIndexCurbTooltipAppear(EventLogger eventLogger, IndexHistoricalChartEventData eventData) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, getIndexDetailPageEventScreen(eventData.getIndexId()), new Component(Component.ComponentType.TOOLTIP, "index_curb_tooltip", null, 4, null), null, getIndexHistoricalChartEventContext(eventData.getIndexId(), eventData.getEntryPointIdentifier(), eventData.getDisplaySpan(), eventData.getShowCandlesticks()), 9, null);
    }
}
