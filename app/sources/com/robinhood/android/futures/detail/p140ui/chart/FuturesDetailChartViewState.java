package com.robinhood.android.futures.detail.p140ui.chart;

import android.os.Parcelable;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.futures.charts.contracts.models.ScrubData;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.IconDisplayText;
import com.robinhood.models.serverdriven.experimental.api.SubDisplayText;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.store.futures.ChartType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FuturesDetailChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002BCB\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\t\u00108\u001a\u00020\u0013HÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\t\u0010:\u001a\u00020\nHÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J\u009b\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\nHÆ\u0001J\u0013\u0010=\u001a\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010 R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010 R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u0016\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState;", "", "contractId", "Ljava/util/UUID;", "contractStreamingSymbol", "", "productId", "chartData", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState$ChartData;", "isChartPositive", "", "scrubData", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/futures/charts/contracts/models/ScrubData;", "currentChartType", "Lcom/robinhood/store/futures/ChartType;", "showContinuousChartToggle", "isContinuousChart", "currentDisplaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "chartSettingsVisible", "showAdvancedChartButton", "hasVisitedMac", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState$ChartData;ZLkotlinx/collections/immutable/PersistentList;Lcom/robinhood/store/futures/ChartType;ZZLcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;ZZZ)V", "getContractId", "()Ljava/util/UUID;", "getContractStreamingSymbol", "()Ljava/lang/String;", "getProductId", "getChartData", "()Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState$ChartData;", "()Z", "getScrubData", "()Lkotlinx/collections/immutable/PersistentList;", "getCurrentChartType", "()Lcom/robinhood/store/futures/ChartType;", "getShowContinuousChartToggle", "getCurrentDisplaySpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getChartSettingsVisible", "getShowAdvancedChartButton", "getHasVisitedMac", "themeDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "getThemeDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "ChartData", "Companion", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesDetailChartViewState {
    private final ChartData chartData;
    private final boolean chartSettingsVisible;
    private final UUID contractId;
    private final String contractStreamingSymbol;
    private final ChartType currentChartType;
    private final DisplaySpan currentDisplaySpan;
    private final boolean hasVisitedMac;
    private final boolean isChartPositive;
    private final boolean isContinuousChart;
    private final UUID productId;
    private final ImmutableList3<ScrubData> scrubData;
    private final boolean showAdvancedChartButton;
    private final boolean showContinuousChartToggle;
    private final BentoTheme4 themeDirection;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final ImmutableList<DisplaySpan> futuresDisplaySpans = extensions2.persistentListOf(DisplaySpan.DAY, DisplaySpan.WEEK, DisplaySpan.MONTH, DisplaySpan.f93673MONTH, DisplaySpan.YTD, DisplaySpan.YEAR);

    public static /* synthetic */ FuturesDetailChartViewState copy$default(FuturesDetailChartViewState futuresDetailChartViewState, UUID uuid, String str, UUID uuid2, ChartData chartData, boolean z, ImmutableList3 immutableList3, ChartType chartType, boolean z2, boolean z3, DisplaySpan displaySpan, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = futuresDetailChartViewState.contractId;
        }
        return futuresDetailChartViewState.copy(uuid, (i & 2) != 0 ? futuresDetailChartViewState.contractStreamingSymbol : str, (i & 4) != 0 ? futuresDetailChartViewState.productId : uuid2, (i & 8) != 0 ? futuresDetailChartViewState.chartData : chartData, (i & 16) != 0 ? futuresDetailChartViewState.isChartPositive : z, (i & 32) != 0 ? futuresDetailChartViewState.scrubData : immutableList3, (i & 64) != 0 ? futuresDetailChartViewState.currentChartType : chartType, (i & 128) != 0 ? futuresDetailChartViewState.showContinuousChartToggle : z2, (i & 256) != 0 ? futuresDetailChartViewState.isContinuousChart : z3, (i & 512) != 0 ? futuresDetailChartViewState.currentDisplaySpan : displaySpan, (i & 1024) != 0 ? futuresDetailChartViewState.chartSettingsVisible : z4, (i & 2048) != 0 ? futuresDetailChartViewState.showAdvancedChartButton : z5, (i & 4096) != 0 ? futuresDetailChartViewState.hasVisitedMac : z6);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getContractId() {
        return this.contractId;
    }

    /* renamed from: component10, reason: from getter */
    public final DisplaySpan getCurrentDisplaySpan() {
        return this.currentDisplaySpan;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getChartSettingsVisible() {
        return this.chartSettingsVisible;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getShowAdvancedChartButton() {
        return this.showAdvancedChartButton;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getHasVisitedMac() {
        return this.hasVisitedMac;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContractStreamingSymbol() {
        return this.contractStreamingSymbol;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getProductId() {
        return this.productId;
    }

    /* renamed from: component4, reason: from getter */
    public final ChartData getChartData() {
        return this.chartData;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsChartPositive() {
        return this.isChartPositive;
    }

    public final ImmutableList3<ScrubData> component6() {
        return this.scrubData;
    }

    /* renamed from: component7, reason: from getter */
    public final ChartType getCurrentChartType() {
        return this.currentChartType;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowContinuousChartToggle() {
        return this.showContinuousChartToggle;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsContinuousChart() {
        return this.isContinuousChart;
    }

    public final FuturesDetailChartViewState copy(UUID contractId, String contractStreamingSymbol, UUID productId, ChartData chartData, boolean isChartPositive, ImmutableList3<ScrubData> scrubData, ChartType currentChartType, boolean showContinuousChartToggle, boolean isContinuousChart, DisplaySpan currentDisplaySpan, boolean chartSettingsVisible, boolean showAdvancedChartButton, boolean hasVisitedMac) {
        Intrinsics.checkNotNullParameter(currentChartType, "currentChartType");
        Intrinsics.checkNotNullParameter(currentDisplaySpan, "currentDisplaySpan");
        return new FuturesDetailChartViewState(contractId, contractStreamingSymbol, productId, chartData, isChartPositive, scrubData, currentChartType, showContinuousChartToggle, isContinuousChart, currentDisplaySpan, chartSettingsVisible, showAdvancedChartButton, hasVisitedMac);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesDetailChartViewState)) {
            return false;
        }
        FuturesDetailChartViewState futuresDetailChartViewState = (FuturesDetailChartViewState) other;
        return Intrinsics.areEqual(this.contractId, futuresDetailChartViewState.contractId) && Intrinsics.areEqual(this.contractStreamingSymbol, futuresDetailChartViewState.contractStreamingSymbol) && Intrinsics.areEqual(this.productId, futuresDetailChartViewState.productId) && Intrinsics.areEqual(this.chartData, futuresDetailChartViewState.chartData) && this.isChartPositive == futuresDetailChartViewState.isChartPositive && Intrinsics.areEqual(this.scrubData, futuresDetailChartViewState.scrubData) && this.currentChartType == futuresDetailChartViewState.currentChartType && this.showContinuousChartToggle == futuresDetailChartViewState.showContinuousChartToggle && this.isContinuousChart == futuresDetailChartViewState.isContinuousChart && this.currentDisplaySpan == futuresDetailChartViewState.currentDisplaySpan && this.chartSettingsVisible == futuresDetailChartViewState.chartSettingsVisible && this.showAdvancedChartButton == futuresDetailChartViewState.showAdvancedChartButton && this.hasVisitedMac == futuresDetailChartViewState.hasVisitedMac;
    }

    public int hashCode() {
        UUID uuid = this.contractId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        String str = this.contractStreamingSymbol;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UUID uuid2 = this.productId;
        int iHashCode3 = (iHashCode2 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        ChartData chartData = this.chartData;
        int iHashCode4 = (((iHashCode3 + (chartData == null ? 0 : chartData.hashCode())) * 31) + Boolean.hashCode(this.isChartPositive)) * 31;
        ImmutableList3<ScrubData> immutableList3 = this.scrubData;
        return ((((((((((((((iHashCode4 + (immutableList3 != null ? immutableList3.hashCode() : 0)) * 31) + this.currentChartType.hashCode()) * 31) + Boolean.hashCode(this.showContinuousChartToggle)) * 31) + Boolean.hashCode(this.isContinuousChart)) * 31) + this.currentDisplaySpan.hashCode()) * 31) + Boolean.hashCode(this.chartSettingsVisible)) * 31) + Boolean.hashCode(this.showAdvancedChartButton)) * 31) + Boolean.hashCode(this.hasVisitedMac);
    }

    public String toString() {
        return "FuturesDetailChartViewState(contractId=" + this.contractId + ", contractStreamingSymbol=" + this.contractStreamingSymbol + ", productId=" + this.productId + ", chartData=" + this.chartData + ", isChartPositive=" + this.isChartPositive + ", scrubData=" + this.scrubData + ", currentChartType=" + this.currentChartType + ", showContinuousChartToggle=" + this.showContinuousChartToggle + ", isContinuousChart=" + this.isContinuousChart + ", currentDisplaySpan=" + this.currentDisplaySpan + ", chartSettingsVisible=" + this.chartSettingsVisible + ", showAdvancedChartButton=" + this.showAdvancedChartButton + ", hasVisitedMac=" + this.hasVisitedMac + ")";
    }

    public FuturesDetailChartViewState(UUID uuid, String str, UUID uuid2, ChartData chartData, boolean z, ImmutableList3<ScrubData> immutableList3, ChartType currentChartType, boolean z2, boolean z3, DisplaySpan currentDisplaySpan, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(currentChartType, "currentChartType");
        Intrinsics.checkNotNullParameter(currentDisplaySpan, "currentDisplaySpan");
        this.contractId = uuid;
        this.contractStreamingSymbol = str;
        this.productId = uuid2;
        this.chartData = chartData;
        this.isChartPositive = z;
        this.scrubData = immutableList3;
        this.currentChartType = currentChartType;
        this.showContinuousChartToggle = z2;
        this.isContinuousChart = z3;
        this.currentDisplaySpan = currentDisplaySpan;
        this.chartSettingsVisible = z4;
        this.showAdvancedChartButton = z5;
        this.hasVisitedMac = z6;
        this.themeDirection = z ? BentoTheme4.POSITIVE : BentoTheme4.NEGATIVE;
    }

    public final UUID getContractId() {
        return this.contractId;
    }

    public final String getContractStreamingSymbol() {
        return this.contractStreamingSymbol;
    }

    public final UUID getProductId() {
        return this.productId;
    }

    public final ChartData getChartData() {
        return this.chartData;
    }

    public final boolean isChartPositive() {
        return this.isChartPositive;
    }

    public final ImmutableList3<ScrubData> getScrubData() {
        return this.scrubData;
    }

    public final ChartType getCurrentChartType() {
        return this.currentChartType;
    }

    public final boolean getShowContinuousChartToggle() {
        return this.showContinuousChartToggle;
    }

    public final boolean isContinuousChart() {
        return this.isContinuousChart;
    }

    public final DisplaySpan getCurrentDisplaySpan() {
        return this.currentDisplaySpan;
    }

    public final boolean getChartSettingsVisible() {
        return this.chartSettingsVisible;
    }

    public final boolean getShowAdvancedChartButton() {
        return this.showAdvancedChartButton;
    }

    public final boolean getHasVisitedMac() {
        return this.hasVisitedMac;
    }

    public final BentoTheme4 getThemeDirection() {
        return this.themeDirection;
    }

    /* compiled from: FuturesDetailChartDuxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState$ChartData;", "", "currentCursorData", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState$ChartData$CurrentCursorData;", "bid", "", "ask", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "<init>", "(Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState$ChartData$CurrentCursorData;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/Chart;)V", "getCurrentCursorData", "()Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState$ChartData$CurrentCursorData;", "getBid", "()Ljava/lang/String;", "getAsk", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "CurrentCursorData", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChartData {
        public static final int $stable = 8;
        private final String ask;
        private final String bid;
        private final Chart<Parcelable> chart;
        private final CurrentCursorData currentCursorData;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChartData copy$default(ChartData chartData, CurrentCursorData currentCursorData, String str, String str2, Chart chart, int i, Object obj) {
            if ((i & 1) != 0) {
                currentCursorData = chartData.currentCursorData;
            }
            if ((i & 2) != 0) {
                str = chartData.bid;
            }
            if ((i & 4) != 0) {
                str2 = chartData.ask;
            }
            if ((i & 8) != 0) {
                chart = chartData.chart;
            }
            return chartData.copy(currentCursorData, str, str2, chart);
        }

        /* renamed from: component1, reason: from getter */
        public final CurrentCursorData getCurrentCursorData() {
            return this.currentCursorData;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBid() {
            return this.bid;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAsk() {
            return this.ask;
        }

        public final Chart<Parcelable> component4() {
            return this.chart;
        }

        public final ChartData copy(CurrentCursorData currentCursorData, String bid, String ask, Chart<? extends Parcelable> chart) {
            return new ChartData(currentCursorData, bid, ask, chart);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChartData)) {
                return false;
            }
            ChartData chartData = (ChartData) other;
            return Intrinsics.areEqual(this.currentCursorData, chartData.currentCursorData) && Intrinsics.areEqual(this.bid, chartData.bid) && Intrinsics.areEqual(this.ask, chartData.ask) && Intrinsics.areEqual(this.chart, chartData.chart);
        }

        public int hashCode() {
            CurrentCursorData currentCursorData = this.currentCursorData;
            int iHashCode = (currentCursorData == null ? 0 : currentCursorData.hashCode()) * 31;
            String str = this.bid;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.ask;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Chart<Parcelable> chart = this.chart;
            return iHashCode3 + (chart != null ? chart.hashCode() : 0);
        }

        public String toString() {
            return "ChartData(currentCursorData=" + this.currentCursorData + ", bid=" + this.bid + ", ask=" + this.ask + ", chart=" + this.chart + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ChartData(CurrentCursorData currentCursorData, String str, String str2, Chart<? extends Parcelable> chart) {
            this.currentCursorData = currentCursorData;
            this.bid = str;
            this.ask = str2;
            this.chart = chart;
        }

        public final CurrentCursorData getCurrentCursorData() {
            return this.currentCursorData;
        }

        public final String getBid() {
            return this.bid;
        }

        public final String getAsk() {
            return this.ask;
        }

        public final Chart<Parcelable> getChart() {
            return this.chart;
        }

        /* compiled from: FuturesDetailChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState$ChartData$CurrentCursorData;", "", "primaryText", "", "deltaText", "isUp", "", "deltaSubtext", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "getPrimaryText", "()Ljava/lang/String;", "getDeltaText", "()Z", "getDeltaSubtext", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CurrentCursorData {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final CursorData emptyCursorData;
            private static final SubDisplayText emptySecondaryValue;
            private static final ThemedColor fgThemeColor;
            private static final ThemedColor negativeThemeColor;
            private static final ThemedColor positiveThemeColor;
            private final int deltaSubtext;
            private final String deltaText;
            private final boolean isUp;
            private final String primaryText;

            public static /* synthetic */ CurrentCursorData copy$default(CurrentCursorData currentCursorData, String str, String str2, boolean z, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = currentCursorData.primaryText;
                }
                if ((i2 & 2) != 0) {
                    str2 = currentCursorData.deltaText;
                }
                if ((i2 & 4) != 0) {
                    z = currentCursorData.isUp;
                }
                if ((i2 & 8) != 0) {
                    i = currentCursorData.deltaSubtext;
                }
                return currentCursorData.copy(str, str2, z, i);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPrimaryText() {
                return this.primaryText;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDeltaText() {
                return this.deltaText;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsUp() {
                return this.isUp;
            }

            /* renamed from: component4, reason: from getter */
            public final int getDeltaSubtext() {
                return this.deltaSubtext;
            }

            public final CurrentCursorData copy(String primaryText, String deltaText, boolean isUp, int deltaSubtext) {
                Intrinsics.checkNotNullParameter(primaryText, "primaryText");
                return new CurrentCursorData(primaryText, deltaText, isUp, deltaSubtext);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CurrentCursorData)) {
                    return false;
                }
                CurrentCursorData currentCursorData = (CurrentCursorData) other;
                return Intrinsics.areEqual(this.primaryText, currentCursorData.primaryText) && Intrinsics.areEqual(this.deltaText, currentCursorData.deltaText) && this.isUp == currentCursorData.isUp && this.deltaSubtext == currentCursorData.deltaSubtext;
            }

            public int hashCode() {
                int iHashCode = this.primaryText.hashCode() * 31;
                String str = this.deltaText;
                return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isUp)) * 31) + Integer.hashCode(this.deltaSubtext);
            }

            public String toString() {
                return "CurrentCursorData(primaryText=" + this.primaryText + ", deltaText=" + this.deltaText + ", isUp=" + this.isUp + ", deltaSubtext=" + this.deltaSubtext + ")";
            }

            public CurrentCursorData(String primaryText, String str, boolean z, int i) {
                Intrinsics.checkNotNullParameter(primaryText, "primaryText");
                this.primaryText = primaryText;
                this.deltaText = str;
                this.isUp = z;
                this.deltaSubtext = i;
            }

            public final String getPrimaryText() {
                return this.primaryText;
            }

            public final String getDeltaText() {
                return this.deltaText;
            }

            public final boolean isUp() {
                return this.isUp;
            }

            public final int getDeltaSubtext() {
                return this.deltaSubtext;
            }

            /* compiled from: FuturesDetailChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState$ChartData$CurrentCursorData$Companion;", "", "<init>", "()V", "toCursorData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState$ChartData$CurrentCursorData;", "(Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState$ChartData$CurrentCursorData;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "fgThemeColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "positiveThemeColor", "negativeThemeColor", "emptySecondaryValue", "Lcom/robinhood/models/serverdriven/experimental/api/SubDisplayText;", "emptyCursorData", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final CursorData toCursorData(CurrentCursorData currentCursorData, Composer composer, int i) {
                    SubDisplayText subDisplayText;
                    composer.startReplaceGroup(1498629254);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1498629254, i, -1, "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartViewState.ChartData.CurrentCursorData.Companion.toCursorData (FuturesDetailChartDuxo.kt:342)");
                    }
                    if (currentCursorData == null) {
                        CursorData cursorData = CurrentCursorData.emptyCursorData;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        return cursorData;
                    }
                    DisplayText displayText = new DisplayText(currentCursorData.getPrimaryText(), CurrentCursorData.fgThemeColor, null, 4, null);
                    if (currentCursorData.getDeltaText() == null) {
                        subDisplayText = null;
                    } else {
                        subDisplayText = new SubDisplayText(new IconDisplayText(currentCursorData.getDeltaText(), currentCursorData.isUp() ? CurrentCursorData.positiveThemeColor : CurrentCursorData.negativeThemeColor, currentCursorData.isUp() ? Icon.STOCK_UP_16 : Icon.STOCK_DOWN_16, null, 8, null), null, new DisplayText(StringResources_androidKt.stringResource(currentCursorData.getDeltaSubtext(), composer, 0), CurrentCursorData.fgThemeColor, TextStyle.TEXT_MEDIUM), null, 10, null);
                    }
                    if (subDisplayText == null) {
                        subDisplayText = CurrentCursorData.emptySecondaryValue;
                    }
                    CursorData cursorData2 = new CursorData(null, null, null, null, displayText, subDisplayText, null, null, null, null, 975, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return cursorData2;
                }
            }

            static {
                Color color = Color.f5853FG;
                ThemedColor themedColor = new ThemedColor(color, color);
                fgThemeColor = themedColor;
                Color color2 = Color.POSITIVE;
                positiveThemeColor = new ThemedColor(color2, color2);
                Color color3 = Color.NEGATIVE;
                negativeThemeColor = new ThemedColor(color3, color3);
                SubDisplayText subDisplayText = new SubDisplayText(new IconDisplayText("", themedColor, null, null, 12, null), null, null, null, 14, null);
                emptySecondaryValue = subDisplayText;
                emptyCursorData = new CursorData(null, null, null, null, new DisplayText("", themedColor, null, 4, null), subDisplayText, null, null, null, null, 975, null);
            }
        }
    }

    /* compiled from: FuturesDetailChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState$Companion;", "", "<init>", "()V", "futuresDisplaySpans", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getFuturesDisplaySpans", "()Lkotlinx/collections/immutable/ImmutableList;", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ImmutableList<DisplaySpan> getFuturesDisplaySpans() {
            return FuturesDetailChartViewState.futuresDisplaySpans;
        }
    }
}
