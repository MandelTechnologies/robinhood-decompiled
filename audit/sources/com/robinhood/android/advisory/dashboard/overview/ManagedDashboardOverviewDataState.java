package com.robinhood.android.advisory.dashboard.overview;

import com.robinhood.android.advisory.dashboard.C8626R;
import com.robinhood.android.advisory.dashboard.LoggingUtils2;
import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewViewState;
import com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartState;
import com.robinhood.android.advisory.dashboard.overview.portfolio.AssetSlice;
import com.robinhood.android.advisory.dashboard.overview.portfolio.CategorySlice;
import com.robinhood.android.advisory.dashboard.overview.portfolio.CategorySlice3;
import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.models.advisory.p304db.ManagedAccountState;
import com.robinhood.models.advisory.p304db.portfolio.AssetClass5;
import com.robinhood.models.advisory.p304db.portfolio.ClassificationDetails;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioAsset;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioRegion;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSubAssetClassCategory;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSummary;
import com.robinhood.models.advisory.p304db.returns.ReturnsBreakdown;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ManagedDashboardOverviewDataState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0001CB\u0099\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010;\u001a\u00020\u0016HÆ\u0003J\t\u0010<\u001a\u00020\u000fHÆ\u0003J\u009b\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000fHÆ\u0001J\u0013\u0010>\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0017\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState;", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "managedPortfolio", "Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;", "performanceChartModel", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "activePerformanceChartSpan", "", "activeReturnsChartSpan", "returnsBreakdownForPerformance", "Lcom/robinhood/models/advisory/db/returns/ReturnsBreakdown;", "returnsBreakdownForReturns", "hasPrivacy", "", "activeCursorData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "selectedReturnsBar", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$ReturnsBar;", "returnsChartCursorData", "returnsChartDirection", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "showReturnsChartUnreadIndicator", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;Lcom/robinhood/android/models/portfolio/PerformanceChartModel;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/advisory/db/returns/ReturnsBreakdown;Lcom/robinhood/models/advisory/db/returns/ReturnsBreakdown;ZLcom/robinhood/models/serverdriven/experimental/api/CursorData;Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$ReturnsBar;Lcom/robinhood/models/serverdriven/experimental/api/CursorData;Lcom/robinhood/models/serverdriven/experimental/api/Direction;Z)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getManagedPortfolio", "()Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;", "getPerformanceChartModel", "()Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "getActivePerformanceChartSpan", "()Ljava/lang/String;", "getActiveReturnsChartSpan", "getReturnsBreakdownForPerformance", "()Lcom/robinhood/models/advisory/db/returns/ReturnsBreakdown;", "getReturnsBreakdownForReturns", "getHasPrivacy", "()Z", "getActiveCursorData", "()Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "getSelectedReturnsBar", "()Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$ReturnsBar;", "getReturnsChartCursorData", "getReturnsChartDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getShowReturnsChartUnreadIndicator", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "Reducer", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ManagedDashboardOverviewDataState {
    public static final float ASSET_GROUP_UI_ALLOCATION = 0.07f;
    public static final int MAX_SEGMENTS = 20;
    private final CursorData activeCursorData;
    private final String activePerformanceChartSpan;
    private final String activeReturnsChartSpan;
    private final BrokerageAccountType brokerageAccountType;
    private final boolean hasPrivacy;
    private final ManagedPortfolioSummary managedPortfolio;
    private final PerformanceChartModel performanceChartModel;
    private final ReturnsBreakdown returnsBreakdownForPerformance;
    private final ReturnsBreakdown returnsBreakdownForReturns;
    private final CursorData returnsChartCursorData;
    private final Direction returnsChartDirection;
    private final ManagedReturnsChartState.ReturnsBar selectedReturnsBar;
    private final boolean showReturnsChartUnreadIndicator;

    /* renamed from: Reducer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final BigDecimal ONE_PERCENT = new BigDecimal("0.01");
    private static final ImmutableList<SpanOption> availableReturnsChartSpans = extensions2.persistentListOf(new SpanOption(DisplaySpans.MONTH, ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS, false), new SpanOption(DisplaySpans.THREE_MONTHS, "3month", false), new SpanOption(DisplaySpans.YTD, "ytd", false), new SpanOption(DisplaySpans.YEAR, "year", false), new SpanOption(DisplaySpans.ALL, ApiRenderablePlatforms.VERSIONS_ALL, false));

    public ManagedDashboardOverviewDataState() {
        this(null, null, null, null, null, null, null, false, null, null, null, null, false, 8191, null);
    }

    public static /* synthetic */ ManagedDashboardOverviewDataState copy$default(ManagedDashboardOverviewDataState managedDashboardOverviewDataState, BrokerageAccountType brokerageAccountType, ManagedPortfolioSummary managedPortfolioSummary, PerformanceChartModel performanceChartModel, String str, String str2, ReturnsBreakdown returnsBreakdown, ReturnsBreakdown returnsBreakdown2, boolean z, CursorData cursorData, ManagedReturnsChartState.ReturnsBar returnsBar, CursorData cursorData2, Direction direction, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = managedDashboardOverviewDataState.brokerageAccountType;
        }
        return managedDashboardOverviewDataState.copy(brokerageAccountType, (i & 2) != 0 ? managedDashboardOverviewDataState.managedPortfolio : managedPortfolioSummary, (i & 4) != 0 ? managedDashboardOverviewDataState.performanceChartModel : performanceChartModel, (i & 8) != 0 ? managedDashboardOverviewDataState.activePerformanceChartSpan : str, (i & 16) != 0 ? managedDashboardOverviewDataState.activeReturnsChartSpan : str2, (i & 32) != 0 ? managedDashboardOverviewDataState.returnsBreakdownForPerformance : returnsBreakdown, (i & 64) != 0 ? managedDashboardOverviewDataState.returnsBreakdownForReturns : returnsBreakdown2, (i & 128) != 0 ? managedDashboardOverviewDataState.hasPrivacy : z, (i & 256) != 0 ? managedDashboardOverviewDataState.activeCursorData : cursorData, (i & 512) != 0 ? managedDashboardOverviewDataState.selectedReturnsBar : returnsBar, (i & 1024) != 0 ? managedDashboardOverviewDataState.returnsChartCursorData : cursorData2, (i & 2048) != 0 ? managedDashboardOverviewDataState.returnsChartDirection : direction, (i & 4096) != 0 ? managedDashboardOverviewDataState.showReturnsChartUnreadIndicator : z2);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component10, reason: from getter */
    public final ManagedReturnsChartState.ReturnsBar getSelectedReturnsBar() {
        return this.selectedReturnsBar;
    }

    /* renamed from: component11, reason: from getter */
    public final CursorData getReturnsChartCursorData() {
        return this.returnsChartCursorData;
    }

    /* renamed from: component12, reason: from getter */
    public final Direction getReturnsChartDirection() {
        return this.returnsChartDirection;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowReturnsChartUnreadIndicator() {
        return this.showReturnsChartUnreadIndicator;
    }

    /* renamed from: component2, reason: from getter */
    public final ManagedPortfolioSummary getManagedPortfolio() {
        return this.managedPortfolio;
    }

    /* renamed from: component3, reason: from getter */
    public final PerformanceChartModel getPerformanceChartModel() {
        return this.performanceChartModel;
    }

    /* renamed from: component4, reason: from getter */
    public final String getActivePerformanceChartSpan() {
        return this.activePerformanceChartSpan;
    }

    /* renamed from: component5, reason: from getter */
    public final String getActiveReturnsChartSpan() {
        return this.activeReturnsChartSpan;
    }

    /* renamed from: component6, reason: from getter */
    public final ReturnsBreakdown getReturnsBreakdownForPerformance() {
        return this.returnsBreakdownForPerformance;
    }

    /* renamed from: component7, reason: from getter */
    public final ReturnsBreakdown getReturnsBreakdownForReturns() {
        return this.returnsBreakdownForReturns;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHasPrivacy() {
        return this.hasPrivacy;
    }

    /* renamed from: component9, reason: from getter */
    public final CursorData getActiveCursorData() {
        return this.activeCursorData;
    }

    public final ManagedDashboardOverviewDataState copy(BrokerageAccountType brokerageAccountType, ManagedPortfolioSummary managedPortfolio, PerformanceChartModel performanceChartModel, String activePerformanceChartSpan, String activeReturnsChartSpan, ReturnsBreakdown returnsBreakdownForPerformance, ReturnsBreakdown returnsBreakdownForReturns, boolean hasPrivacy, CursorData activeCursorData, ManagedReturnsChartState.ReturnsBar selectedReturnsBar, CursorData returnsChartCursorData, Direction returnsChartDirection, boolean showReturnsChartUnreadIndicator) {
        Intrinsics.checkNotNullParameter(activePerformanceChartSpan, "activePerformanceChartSpan");
        Intrinsics.checkNotNullParameter(activeReturnsChartSpan, "activeReturnsChartSpan");
        Intrinsics.checkNotNullParameter(returnsChartDirection, "returnsChartDirection");
        return new ManagedDashboardOverviewDataState(brokerageAccountType, managedPortfolio, performanceChartModel, activePerformanceChartSpan, activeReturnsChartSpan, returnsBreakdownForPerformance, returnsBreakdownForReturns, hasPrivacy, activeCursorData, selectedReturnsBar, returnsChartCursorData, returnsChartDirection, showReturnsChartUnreadIndicator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagedDashboardOverviewDataState)) {
            return false;
        }
        ManagedDashboardOverviewDataState managedDashboardOverviewDataState = (ManagedDashboardOverviewDataState) other;
        return this.brokerageAccountType == managedDashboardOverviewDataState.brokerageAccountType && Intrinsics.areEqual(this.managedPortfolio, managedDashboardOverviewDataState.managedPortfolio) && Intrinsics.areEqual(this.performanceChartModel, managedDashboardOverviewDataState.performanceChartModel) && Intrinsics.areEqual(this.activePerformanceChartSpan, managedDashboardOverviewDataState.activePerformanceChartSpan) && Intrinsics.areEqual(this.activeReturnsChartSpan, managedDashboardOverviewDataState.activeReturnsChartSpan) && Intrinsics.areEqual(this.returnsBreakdownForPerformance, managedDashboardOverviewDataState.returnsBreakdownForPerformance) && Intrinsics.areEqual(this.returnsBreakdownForReturns, managedDashboardOverviewDataState.returnsBreakdownForReturns) && this.hasPrivacy == managedDashboardOverviewDataState.hasPrivacy && Intrinsics.areEqual(this.activeCursorData, managedDashboardOverviewDataState.activeCursorData) && Intrinsics.areEqual(this.selectedReturnsBar, managedDashboardOverviewDataState.selectedReturnsBar) && Intrinsics.areEqual(this.returnsChartCursorData, managedDashboardOverviewDataState.returnsChartCursorData) && this.returnsChartDirection == managedDashboardOverviewDataState.returnsChartDirection && this.showReturnsChartUnreadIndicator == managedDashboardOverviewDataState.showReturnsChartUnreadIndicator;
    }

    public int hashCode() {
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        int iHashCode = (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode()) * 31;
        ManagedPortfolioSummary managedPortfolioSummary = this.managedPortfolio;
        int iHashCode2 = (iHashCode + (managedPortfolioSummary == null ? 0 : managedPortfolioSummary.hashCode())) * 31;
        PerformanceChartModel performanceChartModel = this.performanceChartModel;
        int iHashCode3 = (((((iHashCode2 + (performanceChartModel == null ? 0 : performanceChartModel.hashCode())) * 31) + this.activePerformanceChartSpan.hashCode()) * 31) + this.activeReturnsChartSpan.hashCode()) * 31;
        ReturnsBreakdown returnsBreakdown = this.returnsBreakdownForPerformance;
        int iHashCode4 = (iHashCode3 + (returnsBreakdown == null ? 0 : returnsBreakdown.hashCode())) * 31;
        ReturnsBreakdown returnsBreakdown2 = this.returnsBreakdownForReturns;
        int iHashCode5 = (((iHashCode4 + (returnsBreakdown2 == null ? 0 : returnsBreakdown2.hashCode())) * 31) + Boolean.hashCode(this.hasPrivacy)) * 31;
        CursorData cursorData = this.activeCursorData;
        int iHashCode6 = (iHashCode5 + (cursorData == null ? 0 : cursorData.hashCode())) * 31;
        ManagedReturnsChartState.ReturnsBar returnsBar = this.selectedReturnsBar;
        int iHashCode7 = (iHashCode6 + (returnsBar == null ? 0 : returnsBar.hashCode())) * 31;
        CursorData cursorData2 = this.returnsChartCursorData;
        return ((((iHashCode7 + (cursorData2 != null ? cursorData2.hashCode() : 0)) * 31) + this.returnsChartDirection.hashCode()) * 31) + Boolean.hashCode(this.showReturnsChartUnreadIndicator);
    }

    public String toString() {
        return "ManagedDashboardOverviewDataState(brokerageAccountType=" + this.brokerageAccountType + ", managedPortfolio=" + this.managedPortfolio + ", performanceChartModel=" + this.performanceChartModel + ", activePerformanceChartSpan=" + this.activePerformanceChartSpan + ", activeReturnsChartSpan=" + this.activeReturnsChartSpan + ", returnsBreakdownForPerformance=" + this.returnsBreakdownForPerformance + ", returnsBreakdownForReturns=" + this.returnsBreakdownForReturns + ", hasPrivacy=" + this.hasPrivacy + ", activeCursorData=" + this.activeCursorData + ", selectedReturnsBar=" + this.selectedReturnsBar + ", returnsChartCursorData=" + this.returnsChartCursorData + ", returnsChartDirection=" + this.returnsChartDirection + ", showReturnsChartUnreadIndicator=" + this.showReturnsChartUnreadIndicator + ")";
    }

    public ManagedDashboardOverviewDataState(BrokerageAccountType brokerageAccountType, ManagedPortfolioSummary managedPortfolioSummary, PerformanceChartModel performanceChartModel, String activePerformanceChartSpan, String activeReturnsChartSpan, ReturnsBreakdown returnsBreakdown, ReturnsBreakdown returnsBreakdown2, boolean z, CursorData cursorData, ManagedReturnsChartState.ReturnsBar returnsBar, CursorData cursorData2, Direction returnsChartDirection, boolean z2) {
        Intrinsics.checkNotNullParameter(activePerformanceChartSpan, "activePerformanceChartSpan");
        Intrinsics.checkNotNullParameter(activeReturnsChartSpan, "activeReturnsChartSpan");
        Intrinsics.checkNotNullParameter(returnsChartDirection, "returnsChartDirection");
        this.brokerageAccountType = brokerageAccountType;
        this.managedPortfolio = managedPortfolioSummary;
        this.performanceChartModel = performanceChartModel;
        this.activePerformanceChartSpan = activePerformanceChartSpan;
        this.activeReturnsChartSpan = activeReturnsChartSpan;
        this.returnsBreakdownForPerformance = returnsBreakdown;
        this.returnsBreakdownForReturns = returnsBreakdown2;
        this.hasPrivacy = z;
        this.activeCursorData = cursorData;
        this.selectedReturnsBar = returnsBar;
        this.returnsChartCursorData = cursorData2;
        this.returnsChartDirection = returnsChartDirection;
        this.showReturnsChartUnreadIndicator = z2;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final ManagedPortfolioSummary getManagedPortfolio() {
        return this.managedPortfolio;
    }

    public final PerformanceChartModel getPerformanceChartModel() {
        return this.performanceChartModel;
    }

    public /* synthetic */ ManagedDashboardOverviewDataState(BrokerageAccountType brokerageAccountType, ManagedPortfolioSummary managedPortfolioSummary, PerformanceChartModel performanceChartModel, String str, String str2, ReturnsBreakdown returnsBreakdown, ReturnsBreakdown returnsBreakdown2, boolean z, CursorData cursorData, ManagedReturnsChartState.ReturnsBar returnsBar, CursorData cursorData2, Direction direction, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : brokerageAccountType, (i & 2) != 0 ? null : managedPortfolioSummary, (i & 4) != 0 ? null : performanceChartModel, (i & 8) != 0 ? "day" : str, (i & 16) != 0 ? ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS : str2, (i & 32) != 0 ? null : returnsBreakdown, (i & 64) != 0 ? null : returnsBreakdown2, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : cursorData, (i & 512) != 0 ? null : returnsBar, (i & 1024) == 0 ? cursorData2 : null, (i & 2048) != 0 ? Direction.f5855UP : direction, (i & 4096) != 0 ? false : z2);
    }

    public final String getActivePerformanceChartSpan() {
        return this.activePerformanceChartSpan;
    }

    public final String getActiveReturnsChartSpan() {
        return this.activeReturnsChartSpan;
    }

    public final ReturnsBreakdown getReturnsBreakdownForPerformance() {
        return this.returnsBreakdownForPerformance;
    }

    public final ReturnsBreakdown getReturnsBreakdownForReturns() {
        return this.returnsBreakdownForReturns;
    }

    public final boolean getHasPrivacy() {
        return this.hasPrivacy;
    }

    public final CursorData getActiveCursorData() {
        return this.activeCursorData;
    }

    public final ManagedReturnsChartState.ReturnsBar getSelectedReturnsBar() {
        return this.selectedReturnsBar;
    }

    public final CursorData getReturnsChartCursorData() {
        return this.returnsChartCursorData;
    }

    public final Direction getReturnsChartDirection() {
        return this.returnsChartDirection;
    }

    public final boolean getShowReturnsChartUnreadIndicator() {
        return this.showReturnsChartUnreadIndicator;
    }

    /* compiled from: ManagedDashboardOverviewDataState.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000bH\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState$Reducer;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState;", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewViewState;", "<init>", "()V", "MAX_SEGMENTS", "", "ASSET_GROUP_UI_ALLOCATION", "", "ONE_PERCENT", "Ljava/math/BigDecimal;", "availableCharts", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/dashboard/overview/AdvisoryChart;", "Lcom/robinhood/models/advisory/db/ManagedAccountState;", "getAvailableCharts", "(Lcom/robinhood/models/advisory/db/ManagedAccountState;)Lkotlinx/collections/immutable/ImmutableList;", "availableReturnsChartSpans", "Lcom/robinhood/android/charts/models/db/SpanOption;", "toAssetSlice", "Lcom/robinhood/android/advisory/dashboard/overview/portfolio/AssetSlice;", "Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioAsset;", "categoryPercentage", "adjustment", "generateSlices", "", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSubAssetClassCategory;", "toPortfolioBreakdownState", "Lcom/robinhood/android/advisory/dashboard/overview/PortfolioBreakdownState;", "Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;", "portfolioBreakdownDescription", "", "reduce", "dataState", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDataState$Reducer, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<ManagedDashboardOverviewDataState, ManagedDashboardOverviewViewState> {

        /* compiled from: ManagedDashboardOverviewDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDataState$Reducer$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[ManagedAccountState.values().length];
                try {
                    iArr[ManagedAccountState.UNFUNDED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ManagedAccountState.UNFUNDED_PENDING_DEPOSIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ManagedAccountState.FUNDED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ManagedAccountState.FUNDED_PENDING_INVESTMENT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ManagedAccountState.UNSPECIFIED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ManagedAccountState.INVESTED_PENDING_RETURNS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ManagedAccountState.CLOSED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ManagedAccountState.INVESTED_RETURNS_AVAILABLE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[AdvisoryChartSwitcher.values().length];
                try {
                    iArr2[AdvisoryChartSwitcher.PORTFOLIO.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[AdvisoryChartSwitcher.PERFORMANCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[AdvisoryChartSwitcher.RETURNS.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final ImmutableList<AdvisoryChartSwitcher> getAvailableCharts(ManagedAccountState managedAccountState) {
            switch (WhenMappings.$EnumSwitchMapping$0[managedAccountState.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return extensions2.persistentListOf(AdvisoryChartSwitcher.PORTFOLIO);
                case 5:
                case 6:
                case 7:
                    return extensions2.persistentListOf(AdvisoryChartSwitcher.PERFORMANCE, AdvisoryChartSwitcher.PORTFOLIO);
                case 8:
                    return extensions2.persistentListOf(AdvisoryChartSwitcher.PERFORMANCE, AdvisoryChartSwitcher.PORTFOLIO, AdvisoryChartSwitcher.RETURNS);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        static /* synthetic */ AssetSlice toAssetSlice$default(Companion companion, ManagedPortfolioAsset managedPortfolioAsset, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
            if ((i & 2) != 0) {
                bigDecimal2 = BigDecimal.ZERO;
            }
            return companion.toAssetSlice(managedPortfolioAsset, bigDecimal, bigDecimal2);
        }

        private final AssetSlice toAssetSlice(ManagedPortfolioAsset managedPortfolioAsset, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            BigDecimal bigDecimalAdd = BigDecimals7.safeDivide(managedPortfolioAsset.getAllocationPercentage(), bigDecimal).add(bigDecimal2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            return new AssetSlice(CategorySlice3.toFloatForUi(bigDecimalAdd), Formats.getHundredthPercentFormat().format(managedPortfolioAsset.getAllocationPercentage()), managedPortfolioAsset.getSymbol(), managedPortfolioAsset.getId());
        }

        private final List<AssetSlice> generateSlices(ManagedPortfolioSubAssetClassCategory category) {
            if (category.getAssets().size() <= 20) {
                List<ManagedPortfolioAsset> assets = category.getAssets();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(assets, 10));
                Iterator<T> it = assets.iterator();
                while (it.hasNext()) {
                    arrayList.add(toAssetSlice$default(ManagedDashboardOverviewDataState.INSTANCE, (ManagedPortfolioAsset) it.next(), category.getAllocationPercentage(), null, 2, null));
                }
                return arrayList;
            }
            List<ManagedPortfolioAsset> listSubList = category.getAssets().subList(20, category.getAssets().size());
            List<ManagedPortfolioAsset> list = listSubList;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                bigDecimalValueOf = bigDecimalValueOf.add(((ManagedPortfolioAsset) it2.next()).getAllocationPercentage());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
            }
            BigDecimal bigDecimalSubtract = BigDecimals7.safeDivide(bigDecimalValueOf, category.getAllocationPercentage()).subtract(BigDecimals7.toBigDecimal(Float.valueOf(0.07f)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(BigDecimals7.toBigDecimal(20));
            List<ManagedPortfolioAsset> listSubList2 = category.getAssets().subList(0, 20);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList2, 10));
            for (ManagedPortfolioAsset managedPortfolioAsset : listSubList2) {
                Companion companion = ManagedDashboardOverviewDataState.INSTANCE;
                BigDecimal allocationPercentage = category.getAllocationPercentage();
                Intrinsics.checkNotNull(bigDecimalDivide);
                arrayList2.add(companion.toAssetSlice(managedPortfolioAsset, allocationPercentage, bigDecimalDivide));
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(arrayList2.toArray(new AssetSlice[0]));
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((ManagedPortfolioAsset) it3.next()).getSymbol());
            }
            String strSummarize$default = CategorySlice3.summarize$default(arrayList3, 0, 1, null);
            NumberFormatter hundredthPercentFormat = Formats.getHundredthPercentFormat();
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(0L);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                bigDecimalValueOf2 = bigDecimalValueOf2.add(((ManagedPortfolioAsset) it4.next()).getAllocationPercentage());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "add(...)");
            }
            spreadBuilder.add(new AssetSlice(0.07f, hundredthPercentFormat.format(bigDecimalValueOf2), strSummarize$default, ((ManagedPortfolioAsset) CollectionsKt.first((List) listSubList)).getId()));
            return CollectionsKt.listOf(spreadBuilder.toArray(new AssetSlice[spreadBuilder.size()]));
        }

        private final PortfolioBreakdownState toPortfolioBreakdownState(ManagedPortfolioSummary managedPortfolioSummary, String str) {
            List<ManagedPortfolioRegion> regions = managedPortfolioSummary.getRegions();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = regions.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((ManagedPortfolioRegion) it.next()).getSubAssetClassCategories());
            }
            List listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDataState$Reducer$toPortfolioBreakdownState$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((ManagedPortfolioSubAssetClassCategory) t2).getAllocationPercentage(), ((ManagedPortfolioSubAssetClassCategory) t).getAllocationPercentage());
                }
            });
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
            Iterator it2 = listSortedWith.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ManagedPortfolioSubAssetClassCategory managedPortfolioSubAssetClassCategory = (ManagedPortfolioSubAssetClassCategory) it2.next();
                AssetClass5 subAssetClassCategory = managedPortfolioSubAssetClassCategory.getSubAssetClassCategory();
                ClassificationDetails details = managedPortfolioSubAssetClassCategory.getDetails();
                float floatForUi = CategorySlice3.toFloatForUi(managedPortfolioSubAssetClassCategory.getAllocationPercentage());
                StringResource stringResourceInvoke = managedPortfolioSubAssetClassCategory.getAllocationPercentage().compareTo(ManagedDashboardOverviewDataState.ONE_PERCENT) < 0 ? StringResource.INSTANCE.invoke(C8626R.string.managed_portfolio_sub_one_percent, new Object[0]) : StringResource.INSTANCE.invoke(Formats.getWholeNumberPercentFormat().format(managedPortfolioSubAssetClassCategory.getAllocationPercentage()));
                List<AssetSlice> listGenerateSlices = ManagedDashboardOverviewDataState.INSTANCE.generateSlices(managedPortfolioSubAssetClassCategory);
                List<ManagedPortfolioAsset> assets = managedPortfolioSubAssetClassCategory.getAssets();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(assets, 10));
                Iterator<T> it3 = assets.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((ManagedPortfolioAsset) it3.next()).getId());
                }
                arrayList2.add(new CategorySlice(subAssetClassCategory, details, floatForUi, stringResourceInvoke, listGenerateSlices, arrayList3));
            }
            ImmutableList3 persistentList = extensions2.toPersistentList(arrayList2);
            return new PortfolioBreakdownState(managedPortfolioSummary.getAccountNumber(), persistentList, managedPortfolioSummary.getAccountState() != ManagedAccountState.UNFUNDED, CategorySlice3.defaultDescription(persistentList), str);
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
        @Override // com.robinhood.android.udf.StateProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ManagedDashboardOverviewViewState reduce(ManagedDashboardOverviewDataState dataState) {
            String value;
            CursorData defaultDisplay;
            DisplayText primary_value;
            ManagedDashboardOverviewChartState portfolioBreakdownState;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            ReturnsBreakdown returnsBreakdownForPerformance = dataState.getReturnsBreakdownForPerformance();
            if (returnsBreakdownForPerformance == null || !returnsBreakdownForPerformance.getShowBottomSheet()) {
                returnsBreakdownForPerformance = null;
            }
            if (dataState.getManagedPortfolio() != null && dataState.getBrokerageAccountType() != null) {
                if (dataState.getHasPrivacy()) {
                    value = "****";
                } else {
                    CursorData activeCursorData = dataState.getActiveCursorData();
                    if ((activeCursorData != null ? activeCursorData.getPrimary_value() : null) != null) {
                        DisplayText primary_value2 = dataState.getActiveCursorData().getPrimary_value();
                        if (primary_value2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        value = primary_value2.getValue();
                    } else {
                        PerformanceChartModel performanceChartModel = dataState.getPerformanceChartModel();
                        if (performanceChartModel == null || (defaultDisplay = performanceChartModel.getDefaultDisplay()) == null || (primary_value = defaultDisplay.getPrimary_value()) == null || (value = primary_value.getValue()) == null) {
                            value = Money.format$default(dataState.getManagedPortfolio().getTotalValue(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
                        }
                    }
                }
                String str = value;
                boolean hasPrivacy = dataState.getHasPrivacy();
                ImmutableList<AdvisoryChartSwitcher> availableCharts = ManagedDashboardOverviewDataState.INSTANCE.getAvailableCharts(dataState.getManagedPortfolio().getAccountState());
                ArrayList arrayList = new ArrayList();
                Iterator<AdvisoryChartSwitcher> it = availableCharts.iterator();
                while (true) {
                    boolean z = true;
                    if (it.hasNext()) {
                        int i = WhenMappings.$EnumSwitchMapping$1[it.next().ordinal()];
                        if (i == 1) {
                            portfolioBreakdownState = ManagedDashboardOverviewDataState.INSTANCE.toPortfolioBreakdownState(dataState.getManagedPortfolio(), dataState.getManagedPortfolio().getDescription());
                        } else if (i == 2) {
                            PerformanceChartModel performanceChartModel2 = dataState.getPerformanceChartModel();
                            if (performanceChartModel2 != null) {
                                portfolioBreakdownState = new ManagedPerformanceChartState(performanceChartModel2, returnsBreakdownForPerformance, dataState.getActivePerformanceChartSpan());
                            }
                        } else {
                            if (i != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ReturnsBreakdown returnsBreakdownForReturns = dataState.getReturnsBreakdownForReturns();
                            if (returnsBreakdownForReturns != null) {
                                String accountNumber = returnsBreakdownForReturns.getAccountNumber();
                                ImmutableList immutableList = extensions2.toImmutableList(CollectionsKt.listOf((Object[]) new ManagedReturnsChartState.ReturnsBar[]{new ManagedReturnsChartState.ReturnsBar(ManagedReturnsChartState.ReturnsType.APPRECIATION, returnsBreakdownForReturns.getAppreciation()), new ManagedReturnsChartState.ReturnsBar(ManagedReturnsChartState.ReturnsType.INCOME, returnsBreakdownForReturns.getIncome()), new ManagedReturnsChartState.ReturnsBar(ManagedReturnsChartState.ReturnsType.FEES, returnsBreakdownForReturns.getAdvisoryFee())}));
                                String activeReturnsChartSpan = dataState.getActiveReturnsChartSpan();
                                ImmutableList immutableList2 = ManagedDashboardOverviewDataState.availableReturnsChartSpans;
                                CursorData returnsChartCursorData = dataState.getReturnsChartCursorData();
                                ManagedReturnsChartState.ReturnsBar selectedReturnsBar = dataState.getSelectedReturnsBar();
                                portfolioBreakdownState = new ManagedReturnsChartState(accountNumber, immutableList, activeReturnsChartSpan, immutableList2, returnsChartCursorData, selectedReturnsBar != null ? ManagedDashboardOverviewDataState2.toSelectedBarInfo(selectedReturnsBar, dataState.getBrokerageAccountType()) : null, dataState.getReturnsChartDirection(), returnsBreakdownForReturns.getLearnMore(), dataState.getShowReturnsChartUnreadIndicator());
                            } else {
                                portfolioBreakdownState = null;
                            }
                        }
                        if (portfolioBreakdownState != null) {
                            arrayList.add(portfolioBreakdownState);
                        }
                    } else {
                        ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
                        Context contextBuildManagedAccountLoggingContext = LoggingUtils2.buildManagedAccountLoggingContext(dataState.getManagedPortfolio().getAccountState(), dataState.getBrokerageAccountType());
                        CursorData activeCursorData2 = dataState.getActiveCursorData();
                        if (dataState.getActiveCursorData() != null || returnsBreakdownForPerformance == null) {
                            z = false;
                            break;
                        }
                        ImmutableList<AdvisoryChartSwitcher> availableCharts2 = ManagedDashboardOverviewDataState.INSTANCE.getAvailableCharts(dataState.getManagedPortfolio().getAccountState());
                        if (availableCharts2 == null || !availableCharts2.isEmpty()) {
                            Iterator<AdvisoryChartSwitcher> it2 = availableCharts2.iterator();
                            while (it2.hasNext()) {
                                if (it2.next() == AdvisoryChartSwitcher.RETURNS) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        return new ManagedDashboardOverviewViewState.Loaded(str, persistentList, contextBuildManagedAccountLoggingContext, activeCursorData2, hasPrivacy, z);
                    }
                }
            } else {
                return ManagedDashboardOverviewViewState.Loading.INSTANCE;
            }
        }
    }
}
