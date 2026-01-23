package com.robinhood.android.trade.options.profitloss;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.optionsplchart.C24771R;
import com.robinhood.android.trade.options.profitloss.ChartParams;
import com.robinhood.android.trade.options.profitloss.EdgeProfitLossLimit;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartData;
import com.robinhood.models.api.ApiOptionsProfitLossChart;
import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.models.util.Money;
import com.robinhood.udf.UiEvent;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsProfitLossChartViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0001\\B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u00108\u001a\u0004\u0018\u00010+2\u0006\u00109\u001a\u00020\u000bJ\u0010\u0010:\u001a\u0004\u0018\u00010+2\u0006\u00109\u001a\u00020\u000bJ \u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020#2\u0006\u0010@\u001a\u00020AH\u0002J6\u0010B\u001a\u0004\u0018\u00010C2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010D\u001a\u00020E2\b\b\u0001\u0010F\u001a\u00020E2\b\b\u0001\u0010G\u001a\u00020EJ8\u0010H\u001a\u0004\u0018\u00010I2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010D\u001a\u00020E2\b\b\u0001\u0010F\u001a\u00020E2\b\b\u0001\u0010G\u001a\u00020EH\u0002J\f\u0010J\u001a\u00020\u000b*\u00020+H\u0002J\u0012\u0010K\u001a\u0004\u0018\u00010+2\u0006\u0010\"\u001a\u00020LH\u0002J\"\u0010M\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020>2\u0006\u0010N\u001a\u00020#2\b\u0010@\u001a\u0004\u0018\u00010AJ\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0011\u0010T\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\t\u0010U\u001a\u00020\u0010HÆ\u0003Jf\u0010V\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010WJ\u0013\u0010X\u001a\u0002052\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020EHÖ\u0001J\t\u0010[\u001a\u00020<HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010*\u001a\u0004\u0018\u00010+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010.\u001a\u0004\u0018\u00010+¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0013\u00100\u001a\u0004\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u00104\u001a\u000205¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006]"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartViewState;", "", "chart", "Lcom/robinhood/models/api/ApiOptionsProfitLossChart;", "chartCanvasBounds", "Lcom/robinhood/android/trade/options/profitloss/ChartCanvasBounds;", "currentChartParams", "Lcom/robinhood/android/trade/options/profitloss/ChartParams$Loaded;", "lastLoadedChartParams", "Lcom/robinhood/android/trade/options/profitloss/ChartParams;", "scrubbedPosition", "", "strategyChangedEvent", "Lcom/robinhood/udf/UiEvent;", "", "pnlRequestThrottleTimeout", "", "<init>", "(Lcom/robinhood/models/api/ApiOptionsProfitLossChart;Lcom/robinhood/android/trade/options/profitloss/ChartCanvasBounds;Lcom/robinhood/android/trade/options/profitloss/ChartParams$Loaded;Lcom/robinhood/android/trade/options/profitloss/ChartParams;Ljava/lang/Float;Lcom/robinhood/udf/UiEvent;J)V", "getChart", "()Lcom/robinhood/models/api/ApiOptionsProfitLossChart;", "getChartCanvasBounds", "()Lcom/robinhood/android/trade/options/profitloss/ChartCanvasBounds;", "getCurrentChartParams", "()Lcom/robinhood/android/trade/options/profitloss/ChartParams$Loaded;", "getLastLoadedChartParams", "()Lcom/robinhood/android/trade/options/profitloss/ChartParams;", "getScrubbedPosition", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getStrategyChangedEvent", "()Lcom/robinhood/udf/UiEvent;", "getPnlRequestThrottleTimeout", "()J", "underlyingPrice", "Lcom/robinhood/models/util/Money;", "getUnderlyingPrice", "()Lcom/robinhood/models/util/Money;", "chartData", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData;", "getChartData", "()Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData;", "userScrubbedPoint", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$Point;", "getUserScrubbedPoint", "()Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$Point;", "underlyingPricePoint", "getUnderlyingPricePoint", "scrubbedEdgeProfitLossLimit", "Lcom/robinhood/android/trade/options/profitloss/EdgeProfitLossLimit;", "getScrubbedEdgeProfitLossLimit", "()Lcom/robinhood/android/trade/options/profitloss/EdgeProfitLossLimit;", "shouldDraw", "", "getShouldDraw", "()Z", "getClosestPointOrNull", "magnetismRadius", "getScrubBarPoint", "getScrubPriceText", "", "resources", "Landroid/content/res/Resources;", "scrubbedPrice", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "getProfitLossAdditionalInfo", "Lcom/robinhood/android/trade/options/profitloss/ProfitLossAdditionalInfo;", "positiveColor", "", "negativeColor", "neutralColor", "getCurrentProfitLoss", "Lcom/robinhood/android/trade/options/profitloss/CurrentProfitLoss;", "distanceFromScrubPoint", "getPoint", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$UnderlyingPrice;", "getScrubText", "priceX", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/robinhood/models/api/ApiOptionsProfitLossChart;Lcom/robinhood/android/trade/options/profitloss/ChartCanvasBounds;Lcom/robinhood/android/trade/options/profitloss/ChartParams$Loaded;Lcom/robinhood/android/trade/options/profitloss/ChartParams;Ljava/lang/Float;Lcom/robinhood/udf/UiEvent;J)Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartViewState;", "equals", "other", "hashCode", "toString", "Companion", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class OptionsProfitLossChartViewState {
    private final ApiOptionsProfitLossChart chart;
    private final ChartCanvasBounds chartCanvasBounds;
    private final OptionsProfitLossChartData chartData;
    private final ChartParams.Loaded currentChartParams;
    private final ChartParams lastLoadedChartParams;
    private final long pnlRequestThrottleTimeout;
    private final EdgeProfitLossLimit scrubbedEdgeProfitLossLimit;
    private final Float scrubbedPosition;
    private final boolean shouldDraw;
    private final UiEvent<Unit> strategyChangedEvent;
    private final Money underlyingPrice;
    private final OptionsProfitLossChartData.Point underlyingPricePoint;
    private final OptionsProfitLossChartData.Point userScrubbedPoint;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionsProfitLossChartViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfitLossDirection.values().length];
            try {
                iArr[ProfitLossDirection.PROFIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfitLossDirection.LOSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfitLossDirection.BREAKEVEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OptionsProfitLossChartViewState() {
        this(null, null, null, null, null, null, 0L, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ OptionsProfitLossChartViewState copy$default(OptionsProfitLossChartViewState optionsProfitLossChartViewState, ApiOptionsProfitLossChart apiOptionsProfitLossChart, ChartCanvasBounds chartCanvasBounds, ChartParams.Loaded loaded, ChartParams chartParams, Float f, UiEvent uiEvent, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            apiOptionsProfitLossChart = optionsProfitLossChartViewState.chart;
        }
        if ((i & 2) != 0) {
            chartCanvasBounds = optionsProfitLossChartViewState.chartCanvasBounds;
        }
        if ((i & 4) != 0) {
            loaded = optionsProfitLossChartViewState.currentChartParams;
        }
        if ((i & 8) != 0) {
            chartParams = optionsProfitLossChartViewState.lastLoadedChartParams;
        }
        if ((i & 16) != 0) {
            f = optionsProfitLossChartViewState.scrubbedPosition;
        }
        if ((i & 32) != 0) {
            uiEvent = optionsProfitLossChartViewState.strategyChangedEvent;
        }
        if ((i & 64) != 0) {
            j = optionsProfitLossChartViewState.pnlRequestThrottleTimeout;
        }
        long j2 = j;
        Float f2 = f;
        UiEvent uiEvent2 = uiEvent;
        return optionsProfitLossChartViewState.copy(apiOptionsProfitLossChart, chartCanvasBounds, loaded, chartParams, f2, uiEvent2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiOptionsProfitLossChart getChart() {
        return this.chart;
    }

    /* renamed from: component2, reason: from getter */
    public final ChartCanvasBounds getChartCanvasBounds() {
        return this.chartCanvasBounds;
    }

    /* renamed from: component3, reason: from getter */
    public final ChartParams.Loaded getCurrentChartParams() {
        return this.currentChartParams;
    }

    /* renamed from: component4, reason: from getter */
    public final ChartParams getLastLoadedChartParams() {
        return this.lastLoadedChartParams;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getScrubbedPosition() {
        return this.scrubbedPosition;
    }

    public final UiEvent<Unit> component6() {
        return this.strategyChangedEvent;
    }

    /* renamed from: component7, reason: from getter */
    public final long getPnlRequestThrottleTimeout() {
        return this.pnlRequestThrottleTimeout;
    }

    public final OptionsProfitLossChartViewState copy(ApiOptionsProfitLossChart chart, ChartCanvasBounds chartCanvasBounds, ChartParams.Loaded currentChartParams, ChartParams lastLoadedChartParams, Float scrubbedPosition, UiEvent<Unit> strategyChangedEvent, long pnlRequestThrottleTimeout) {
        return new OptionsProfitLossChartViewState(chart, chartCanvasBounds, currentChartParams, lastLoadedChartParams, scrubbedPosition, strategyChangedEvent, pnlRequestThrottleTimeout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsProfitLossChartViewState)) {
            return false;
        }
        OptionsProfitLossChartViewState optionsProfitLossChartViewState = (OptionsProfitLossChartViewState) other;
        return Intrinsics.areEqual(this.chart, optionsProfitLossChartViewState.chart) && Intrinsics.areEqual(this.chartCanvasBounds, optionsProfitLossChartViewState.chartCanvasBounds) && Intrinsics.areEqual(this.currentChartParams, optionsProfitLossChartViewState.currentChartParams) && Intrinsics.areEqual(this.lastLoadedChartParams, optionsProfitLossChartViewState.lastLoadedChartParams) && Intrinsics.areEqual((Object) this.scrubbedPosition, (Object) optionsProfitLossChartViewState.scrubbedPosition) && Intrinsics.areEqual(this.strategyChangedEvent, optionsProfitLossChartViewState.strategyChangedEvent) && this.pnlRequestThrottleTimeout == optionsProfitLossChartViewState.pnlRequestThrottleTimeout;
    }

    public int hashCode() {
        ApiOptionsProfitLossChart apiOptionsProfitLossChart = this.chart;
        int iHashCode = (apiOptionsProfitLossChart == null ? 0 : apiOptionsProfitLossChart.hashCode()) * 31;
        ChartCanvasBounds chartCanvasBounds = this.chartCanvasBounds;
        int iHashCode2 = (iHashCode + (chartCanvasBounds == null ? 0 : chartCanvasBounds.hashCode())) * 31;
        ChartParams.Loaded loaded = this.currentChartParams;
        int iHashCode3 = (iHashCode2 + (loaded == null ? 0 : loaded.hashCode())) * 31;
        ChartParams chartParams = this.lastLoadedChartParams;
        int iHashCode4 = (iHashCode3 + (chartParams == null ? 0 : chartParams.hashCode())) * 31;
        Float f = this.scrubbedPosition;
        int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        UiEvent<Unit> uiEvent = this.strategyChangedEvent;
        return ((iHashCode5 + (uiEvent != null ? uiEvent.hashCode() : 0)) * 31) + Long.hashCode(this.pnlRequestThrottleTimeout);
    }

    public String toString() {
        return "OptionsProfitLossChartViewState(chart=" + this.chart + ", chartCanvasBounds=" + this.chartCanvasBounds + ", currentChartParams=" + this.currentChartParams + ", lastLoadedChartParams=" + this.lastLoadedChartParams + ", scrubbedPosition=" + this.scrubbedPosition + ", strategyChangedEvent=" + this.strategyChangedEvent + ", pnlRequestThrottleTimeout=" + this.pnlRequestThrottleTimeout + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionsProfitLossChartViewState(ApiOptionsProfitLossChart apiOptionsProfitLossChart, ChartCanvasBounds chartCanvasBounds, ChartParams.Loaded loaded, ChartParams chartParams, Float f, UiEvent<Unit> uiEvent, long j) {
        EdgeProfitLossLimit rightLimit;
        boolean z;
        ApiOptionsProfitLossChartRequestParams params;
        ApiOptionsProfitLossChartRequestParams params2;
        UnderlyingQuote underlyingQuote;
        this.chart = apiOptionsProfitLossChart;
        this.chartCanvasBounds = chartCanvasBounds;
        this.currentChartParams = loaded;
        this.lastLoadedChartParams = chartParams;
        this.scrubbedPosition = f;
        this.strategyChangedEvent = uiEvent;
        this.pnlRequestThrottleTimeout = j;
        UnderlyingQuote underlyingQuote2 = null;
        Money currentValueInMoney = (loaded == null || (params2 = loaded.getParams()) == null || (underlyingQuote = params2.getUnderlyingQuote()) == null) ? null : underlyingQuote.getCurrentValueInMoney();
        this.underlyingPrice = currentValueInMoney;
        OptionsProfitLossChartData optionsProfitLossChartData = (apiOptionsProfitLossChart == null || chartCanvasBounds == null) ? null : new OptionsProfitLossChartData(apiOptionsProfitLossChart, chartCanvasBounds);
        this.chartData = optionsProfitLossChartData;
        OptionsProfitLossChartData.Point point = (optionsProfitLossChartData == null || f == null) ? null : getPoint(new OptionsProfitLossChartData.UnderlyingPrice(f.floatValue(), optionsProfitLossChartData.getChartBounds()));
        this.userScrubbedPoint = point;
        OptionsProfitLossChartData.Point point2 = (optionsProfitLossChartData == null || currentValueInMoney == null) ? null : getPoint(new OptionsProfitLossChartData.UnderlyingPrice(currentValueInMoney, optionsProfitLossChartData.getChartBounds()));
        this.underlyingPricePoint = point2;
        if (optionsProfitLossChartData == null || point == null) {
            rightLimit = null;
        } else {
            Money priceX = point.getPriceX();
            if (Intrinsics.areEqual(priceX, optionsProfitLossChartData.getLeftLimit().getVisibleScrubBarUnderlyingPrice().getPrice())) {
                rightLimit = optionsProfitLossChartData.getLeftLimit();
            } else if (Intrinsics.areEqual(priceX, optionsProfitLossChartData.getRightLimit().getVisibleScrubBarUnderlyingPrice().getPrice())) {
                rightLimit = optionsProfitLossChartData.getRightLimit();
            }
        }
        this.scrubbedEdgeProfitLossLimit = rightLimit;
        if (optionsProfitLossChartData == null || point2 == null) {
            z = false;
        } else {
            if (loaded != null && (params = loaded.getParams()) != null) {
                underlyingQuote2 = params.getUnderlyingQuote();
            }
            if (underlyingQuote2 != null) {
                z = true;
            }
        }
        this.shouldDraw = z;
    }

    public /* synthetic */ OptionsProfitLossChartViewState(ApiOptionsProfitLossChart apiOptionsProfitLossChart, ChartCanvasBounds chartCanvasBounds, ChartParams.Loaded loaded, ChartParams chartParams, Float f, UiEvent uiEvent, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiOptionsProfitLossChart, (i & 2) != 0 ? null : chartCanvasBounds, (i & 4) != 0 ? null : loaded, (i & 8) != 0 ? null : chartParams, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : uiEvent, (i & 64) != 0 ? 200L : j);
    }

    public final ApiOptionsProfitLossChart getChart() {
        return this.chart;
    }

    public final ChartCanvasBounds getChartCanvasBounds() {
        return this.chartCanvasBounds;
    }

    public final ChartParams.Loaded getCurrentChartParams() {
        return this.currentChartParams;
    }

    public final ChartParams getLastLoadedChartParams() {
        return this.lastLoadedChartParams;
    }

    public final Float getScrubbedPosition() {
        return this.scrubbedPosition;
    }

    public final UiEvent<Unit> getStrategyChangedEvent() {
        return this.strategyChangedEvent;
    }

    public final long getPnlRequestThrottleTimeout() {
        return this.pnlRequestThrottleTimeout;
    }

    public final Money getUnderlyingPrice() {
        return this.underlyingPrice;
    }

    public final OptionsProfitLossChartData getChartData() {
        return this.chartData;
    }

    public final OptionsProfitLossChartData.Point getUserScrubbedPoint() {
        return this.userScrubbedPoint;
    }

    public final OptionsProfitLossChartData.Point getUnderlyingPricePoint() {
        return this.underlyingPricePoint;
    }

    public final EdgeProfitLossLimit getScrubbedEdgeProfitLossLimit() {
        return this.scrubbedEdgeProfitLossLimit;
    }

    public final boolean getShouldDraw() {
        return this.shouldDraw;
    }

    public final OptionsProfitLossChartData.Point getClosestPointOrNull(float magnetismRadius) {
        OptionsProfitLossChartData optionsProfitLossChartData = this.chartData;
        OptionsProfitLossChartData.Point point = null;
        if (optionsProfitLossChartData == null || this.userScrubbedPoint == null) {
            return null;
        }
        float f = Float.MAX_VALUE;
        for (OptionsProfitLossChartData.Point point2 : optionsProfitLossChartData.getPricesOfInterest()) {
            float fDistanceFromScrubPoint = distanceFromScrubPoint(point2);
            if (fDistanceFromScrubPoint < magnetismRadius && fDistanceFromScrubPoint < f) {
                point = point2;
                f = fDistanceFromScrubPoint;
            }
        }
        for (OptionsProfitLossChartData.Point point3 : optionsProfitLossChartData.getBreakevenPoints()) {
            float fDistanceFromScrubPoint2 = distanceFromScrubPoint(point3);
            if (fDistanceFromScrubPoint2 < magnetismRadius && fDistanceFromScrubPoint2 < f) {
                point = point3;
                f = fDistanceFromScrubPoint2;
            }
        }
        OptionsProfitLossChartData.Point point4 = this.underlyingPricePoint;
        if (point4 != null) {
            float fDistanceFromScrubPoint3 = distanceFromScrubPoint(point4);
            if (fDistanceFromScrubPoint3 < magnetismRadius && fDistanceFromScrubPoint3 < f) {
                return this.underlyingPricePoint;
            }
        }
        return point;
    }

    public final OptionsProfitLossChartData.Point getScrubBarPoint(float magnetismRadius) {
        OptionsProfitLossChartData.Point closestPointOrNull = getClosestPointOrNull(magnetismRadius);
        if (closestPointOrNull != null) {
            return closestPointOrNull;
        }
        OptionsProfitLossChartData.Point point = this.userScrubbedPoint;
        return point == null ? this.underlyingPricePoint : point;
    }

    private final String getScrubPriceText(Resources resources, Money scrubbedPrice, UnderlyingQuote underlyingQuote) throws Resources.NotFoundException {
        boolean z = underlyingQuote instanceof UnderlyingQuote.EquityQuote;
        Money currentValueInMoney = underlyingQuote.getCurrentValueInMoney();
        EdgeProfitLossLimit edgeProfitLossLimit = this.scrubbedEdgeProfitLossLimit;
        if ((edgeProfitLossLimit != null ? edgeProfitLossLimit.getSide() : null) == EdgeProfitLossLimit.Side.RIGHT) {
            String string2 = resources.getString(C24771R.string.options_profit_loss_chart_unlimited);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        EdgeProfitLossLimit edgeProfitLossLimit2 = this.scrubbedEdgeProfitLossLimit;
        if ((edgeProfitLossLimit2 != null ? edgeProfitLossLimit2.getSide() : null) == EdgeProfitLossLimit.Side.LEFT) {
            Currency currency = this.scrubbedEdgeProfitLossLimit.getVisibleScrubBarUnderlyingPrice().getPrice().getCurrency();
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return Money.format$default(new Money(currency, ZERO), null, false, null, z, 0, null, false, null, false, false, 1015, null);
        }
        if (Intrinsics.areEqual(scrubbedPrice, currentValueInMoney) && this.scrubbedPosition == null) {
            return Money.format$default(scrubbedPrice, null, false, null, z, 0, null, false, null, false, false, 1015, null);
        }
        String str = Money.format$default(scrubbedPrice, null, false, null, z, 0, null, false, null, false, false, 1015, null);
        NumberFormatter percentDeltaFormat = Formats.getPercentDeltaFormat();
        percentDeltaFormat.setMinimumFractionDigits(2);
        String string3 = resources.getString(C24771R.string.options_profit_loss_chart_scrubbed_price_and_percentile, str, percentDeltaFormat.format(scrubbedPrice.minus(currentValueInMoney).div(currentValueInMoney)));
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    public final ProfitLossAdditionalInfo getProfitLossAdditionalInfo(float magnetismRadius, Resources resources, int positiveColor, int negativeColor, int neutralColor) throws Resources.NotFoundException {
        String string2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        ChartParams chartParams = this.lastLoadedChartParams;
        if (chartParams == null) {
            return null;
        }
        if (this.chart == null) {
            if (chartParams instanceof ChartParams.Loaded) {
                return null;
            }
            if (chartParams instanceof ChartParams.Failed) {
                return new ProfitLossAdditionalInfo(null, null, chartParams);
            }
            throw new NoWhenBranchMatchedException();
        }
        final boolean z = chartParams.getParams().getUnderlyingQuote() instanceof UnderlyingQuote.EquityQuote;
        if (!this.chart.getBreakeven_points().isEmpty()) {
            String string3 = resources.getString(C24771R.string.options_profit_loss_chart_breakeven_join);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            string2 = CollectionsKt.joinToString$default(this.chart.getBreakeven_points(), string3, null, null, 0, null, new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartViewState$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsProfitLossChartViewState.getProfitLossAdditionalInfo$lambda$7(z, (ApiOptionsProfitLossChart.ProfitLossPoint) obj);
                }
            }, 30, null);
        } else {
            string2 = resources.getString(C11048R.string.general_label_n_a_short);
            Intrinsics.checkNotNull(string2);
        }
        String str = string2;
        CurrentProfitLoss currentProfitLoss = getCurrentProfitLoss(magnetismRadius, resources, positiveColor, negativeColor, neutralColor);
        Companion companion = INSTANCE;
        return new ProfitLossAdditionalInfo(currentProfitLoss, new InfoBarValues(Companion.toProfitLossString$default(companion, this.chart.getMax_loss(), resources, false, 2, null), Companion.toProfitLossString$default(companion, this.chart.getMax_profit(), resources, false, 2, null), str), chartParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getProfitLossAdditionalInfo$lambda$7(boolean z, ApiOptionsProfitLossChart.ProfitLossPoint it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Money.format$default(it.getUnderlying_price(), null, false, null, z, 0, null, false, null, false, false, 1015, null);
    }

    private final CurrentProfitLoss getCurrentProfitLoss(float magnetismRadius, Resources resources, int positiveColor, int negativeColor, int neutralColor) {
        ApiOptionsProfitLossChart.ProfitLossLimit profitLossLimit;
        OptionsProfitLossChartData.Point scrubBarPoint = getScrubBarPoint(magnetismRadius);
        if (scrubBarPoint == null) {
            return null;
        }
        EdgeProfitLossLimit edgeProfitLossLimit = this.scrubbedEdgeProfitLossLimit;
        if (edgeProfitLossLimit == null || (profitLossLimit = edgeProfitLossLimit.getLimit()) == null) {
            profitLossLimit = scrubBarPoint.getProfitLossLimit();
        }
        boolean z = this.userScrubbedPoint != null;
        ProfitLossDirection profitLossDirection$feature_options_pl_chart_externalDebug = ProfitLossDirection.INSTANCE.getProfitLossDirection$feature_options_pl_chart_externalDebug(profitLossLimit);
        int i = WhenMappings.$EnumSwitchMapping$0[profitLossDirection$feature_options_pl_chart_externalDebug.ordinal()];
        if (i != 1) {
            if (i == 2) {
                positiveColor = negativeColor;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                positiveColor = neutralColor;
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(positiveColor);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) INSTANCE.toProfitLossString(profitLossLimit, resources, true));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return new CurrentProfitLoss(new SpannedString(spannableStringBuilder), z, profitLossDirection$feature_options_pl_chart_externalDebug);
    }

    private final float distanceFromScrubPoint(OptionsProfitLossChartData.Point point) {
        OptionsProfitLossChartData.Point point2 = this.userScrubbedPoint;
        if (point2 == null) {
            return Float.MAX_VALUE;
        }
        return Math.abs(point.getCanvasX() - point2.getCanvasX());
    }

    private final OptionsProfitLossChartData.Point getPoint(OptionsProfitLossChartData.UnderlyingPrice underlyingPrice) {
        OptionsProfitLossChartData optionsProfitLossChartData = this.chartData;
        if (optionsProfitLossChartData == null) {
            return null;
        }
        Iterator<T> it = optionsProfitLossChartData.getPositiveSparklines().iterator();
        while (it.hasNext()) {
            OptionsProfitLossChartData.Point point = ((OptionsProfitLossChartData.Segment) it.next()).getPoint(underlyingPrice);
            if (point != null) {
                return point;
            }
        }
        Iterator<T> it2 = this.chartData.getNegativeSparklines().iterator();
        while (it2.hasNext()) {
            OptionsProfitLossChartData.Point point2 = ((OptionsProfitLossChartData.Segment) it2.next()).getPoint(underlyingPrice);
            if (point2 != null) {
                return point2;
            }
        }
        return null;
    }

    public final String getScrubText(Resources resources, Money priceX, UnderlyingQuote underlyingQuote) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(priceX, "priceX");
        if (underlyingQuote == null) {
            return null;
        }
        return getScrubPriceText(resources, priceX, underlyingQuote);
    }

    /* compiled from: OptionsProfitLossChartViewState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartViewState$Companion;", "", "<init>", "()V", "toProfitLossString", "", "Lcom/robinhood/models/api/ApiOptionsProfitLossChart$ProfitLossLimit;", "resources", "Landroid/content/res/Resources;", "asAdjustment", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {

        /* compiled from: OptionsProfitLossChartViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiOptionsProfitLossChart.LimitType.values().length];
                try {
                    iArr[ApiOptionsProfitLossChart.LimitType.POSITIVE_INF.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiOptionsProfitLossChart.LimitType.NEGATIVE_INF.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiOptionsProfitLossChart.LimitType.FINITE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ApiOptionsProfitLossChart.LimitType.UNAVAILABLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        static /* synthetic */ String toProfitLossString$default(Companion companion, ApiOptionsProfitLossChart.ProfitLossLimit profitLossLimit, Resources resources, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.toProfitLossString(profitLossLimit, resources, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String toProfitLossString(ApiOptionsProfitLossChart.ProfitLossLimit profitLossLimit, Resources resources, boolean z) throws Resources.NotFoundException {
            String string2 = resources.getString(C24771R.string.options_profit_loss_chart_unlimited);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = resources.getString(C11048R.string.general_label_n_a_short);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            int i = WhenMappings.$EnumSwitchMapping$0[profitLossLimit.getType().ordinal()];
            if (i == 1 || i == 2) {
                return string2;
            }
            if (i != 3) {
                if (i == 4) {
                    return string3;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                Money profit_or_loss = profitLossLimit.getProfit_or_loss();
                Intrinsics.checkNotNull(profit_or_loss);
                return Money.Adjustment.format$default(profit_or_loss.toNormalizedAdjustment(), false, null, 3, null);
            }
            NumberFormatter strikePriceFormat = Formats.getStrikePriceFormat();
            Money profit_or_loss2 = profitLossLimit.getProfit_or_loss();
            Intrinsics.checkNotNull(profit_or_loss2);
            return strikePriceFormat.format(profit_or_loss2.getDecimalValue());
        }
    }
}
