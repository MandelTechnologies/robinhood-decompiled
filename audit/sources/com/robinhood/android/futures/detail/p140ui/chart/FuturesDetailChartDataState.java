package com.robinhood.android.futures.detail.p140ui.chart;

import android.os.Parcelable;
import com.robinhood.android.futures.charts.FuturesChartResult;
import com.robinhood.android.futures.detail.extensions.DisplaySpans3;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartViewState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.futures.charts.contracts.models.ScrubData;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.store.futures.ChartType;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesDetailChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010F\u001a\u00020\rHÆ\u0003J\t\u0010G\u001a\u00020\rHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010I\u001a\u00020\u0012HÆ\u0003J\t\u0010J\u001a\u00020\u0014HÆ\u0003J\t\u0010K\u001a\u00020\rHÂ\u0003J\t\u0010L\u001a\u00020\rHÆ\u0003J\u008d\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\rHÆ\u0001J\u0013\u0010N\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020QHÖ\u0001J\t\u0010R\u001a\u00020SHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010#R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010\u0015\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0019\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0012\u00101\u001a\u0004\u0018\u000102X\u0082\u0004¢\u0006\u0004\n\u0002\u00103R\u0011\u00104\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0019\u00105\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010:\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b;\u0010#R\u0011\u0010<\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b<\u0010#R\u0013\u0010=\u001a\u0004\u0018\u00010>8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDataState;", "", "contractId", "Ljava/util/UUID;", "viewMode", "Lcom/robinhood/android/futures/detail/ui/chart/ChartViewMode;", "contract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", SingularAttributionManager.PRODUCT_PARAM_KEY, "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "quote", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "isInFuturesAdvancedChartsExperiment", "", "hasVisitedMac", "chartResult", "Lcom/robinhood/android/futures/charts/FuturesChartResult;", "currentChartType", "Lcom/robinhood/store/futures/ChartType;", "currentDisplaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "_isContinuousChart", "chartSettingsVisible", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/futures/detail/ui/chart/ChartViewMode;Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;ZZLcom/robinhood/android/futures/charts/FuturesChartResult;Lcom/robinhood/store/futures/ChartType;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;ZZ)V", "getContractId", "()Ljava/util/UUID;", "getViewMode", "()Lcom/robinhood/android/futures/detail/ui/chart/ChartViewMode;", "getContract", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "getProduct", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "getQuote", "()Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "()Z", "getHasVisitedMac", "getChartResult", "()Lcom/robinhood/android/futures/charts/FuturesChartResult;", "getCurrentChartType", "()Lcom/robinhood/store/futures/ChartType;", "getCurrentDisplaySpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getChartSettingsVisible", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "comparisonPoint", "", "Ljava/lang/Double;", "isChartPositive", "scrubData", "", "Lcom/robinhood/futures/charts/contracts/models/ScrubData;", "getScrubData", "()Ljava/util/List;", "showContinuousChartToggle", "getShowContinuousChartToggle", "isContinuousChart", "currentCursorData", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState$ChartData$CurrentCursorData;", "getCurrentCursorData", "()Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState$ChartData$CurrentCursorData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesDetailChartDataState {
    public static final int $stable = 8;
    private final boolean _isContinuousChart;
    private final Chart<Parcelable> chart;
    private final FuturesChartResult chartResult;
    private final boolean chartSettingsVisible;
    private final Double comparisonPoint;
    private final FuturesContract contract;
    private final UUID contractId;
    private final ChartType currentChartType;
    private final DisplaySpan currentDisplaySpan;
    private final boolean hasVisitedMac;
    private final boolean isChartPositive;
    private final boolean isInFuturesAdvancedChartsExperiment;
    private final FuturesProduct product;
    private final FuturesQuote quote;
    private final List<ScrubData> scrubData;
    private final FuturesDetailChartDuxo4 viewMode;

    /* compiled from: FuturesDetailChartDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesDetailChartDuxo4.values().length];
            try {
                iArr[FuturesDetailChartDuxo4.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesDetailChartDuxo4.CONTRACT_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesDetailChartDuxo4.PRODUCT_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FuturesDetailChartDataState() {
        this(null, null, null, null, null, false, false, null, null, null, false, false, 4095, null);
    }

    /* renamed from: component11, reason: from getter */
    private final boolean get_isContinuousChart() {
        return this._isContinuousChart;
    }

    public static /* synthetic */ FuturesDetailChartDataState copy$default(FuturesDetailChartDataState futuresDetailChartDataState, UUID uuid, FuturesDetailChartDuxo4 futuresDetailChartDuxo4, FuturesContract futuresContract, FuturesProduct futuresProduct, FuturesQuote futuresQuote, boolean z, boolean z2, FuturesChartResult futuresChartResult, ChartType chartType, DisplaySpan displaySpan, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = futuresDetailChartDataState.contractId;
        }
        if ((i & 2) != 0) {
            futuresDetailChartDuxo4 = futuresDetailChartDataState.viewMode;
        }
        if ((i & 4) != 0) {
            futuresContract = futuresDetailChartDataState.contract;
        }
        if ((i & 8) != 0) {
            futuresProduct = futuresDetailChartDataState.product;
        }
        if ((i & 16) != 0) {
            futuresQuote = futuresDetailChartDataState.quote;
        }
        if ((i & 32) != 0) {
            z = futuresDetailChartDataState.isInFuturesAdvancedChartsExperiment;
        }
        if ((i & 64) != 0) {
            z2 = futuresDetailChartDataState.hasVisitedMac;
        }
        if ((i & 128) != 0) {
            futuresChartResult = futuresDetailChartDataState.chartResult;
        }
        if ((i & 256) != 0) {
            chartType = futuresDetailChartDataState.currentChartType;
        }
        if ((i & 512) != 0) {
            displaySpan = futuresDetailChartDataState.currentDisplaySpan;
        }
        if ((i & 1024) != 0) {
            z3 = futuresDetailChartDataState._isContinuousChart;
        }
        if ((i & 2048) != 0) {
            z4 = futuresDetailChartDataState.chartSettingsVisible;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        ChartType chartType2 = chartType;
        DisplaySpan displaySpan2 = displaySpan;
        boolean z7 = z2;
        FuturesChartResult futuresChartResult2 = futuresChartResult;
        FuturesQuote futuresQuote2 = futuresQuote;
        boolean z8 = z;
        return futuresDetailChartDataState.copy(uuid, futuresDetailChartDuxo4, futuresContract, futuresProduct, futuresQuote2, z8, z7, futuresChartResult2, chartType2, displaySpan2, z5, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getContractId() {
        return this.contractId;
    }

    /* renamed from: component10, reason: from getter */
    public final DisplaySpan getCurrentDisplaySpan() {
        return this.currentDisplaySpan;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getChartSettingsVisible() {
        return this.chartSettingsVisible;
    }

    /* renamed from: component2, reason: from getter */
    public final FuturesDetailChartDuxo4 getViewMode() {
        return this.viewMode;
    }

    /* renamed from: component3, reason: from getter */
    public final FuturesContract getContract() {
        return this.contract;
    }

    /* renamed from: component4, reason: from getter */
    public final FuturesProduct getProduct() {
        return this.product;
    }

    /* renamed from: component5, reason: from getter */
    public final FuturesQuote getQuote() {
        return this.quote;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsInFuturesAdvancedChartsExperiment() {
        return this.isInFuturesAdvancedChartsExperiment;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHasVisitedMac() {
        return this.hasVisitedMac;
    }

    /* renamed from: component8, reason: from getter */
    public final FuturesChartResult getChartResult() {
        return this.chartResult;
    }

    /* renamed from: component9, reason: from getter */
    public final ChartType getCurrentChartType() {
        return this.currentChartType;
    }

    public final FuturesDetailChartDataState copy(UUID contractId, FuturesDetailChartDuxo4 viewMode, FuturesContract contract, FuturesProduct product, FuturesQuote quote, boolean isInFuturesAdvancedChartsExperiment, boolean hasVisitedMac, FuturesChartResult chartResult, ChartType currentChartType, DisplaySpan currentDisplaySpan, boolean _isContinuousChart, boolean chartSettingsVisible) {
        Intrinsics.checkNotNullParameter(currentChartType, "currentChartType");
        Intrinsics.checkNotNullParameter(currentDisplaySpan, "currentDisplaySpan");
        return new FuturesDetailChartDataState(contractId, viewMode, contract, product, quote, isInFuturesAdvancedChartsExperiment, hasVisitedMac, chartResult, currentChartType, currentDisplaySpan, _isContinuousChart, chartSettingsVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesDetailChartDataState)) {
            return false;
        }
        FuturesDetailChartDataState futuresDetailChartDataState = (FuturesDetailChartDataState) other;
        return Intrinsics.areEqual(this.contractId, futuresDetailChartDataState.contractId) && this.viewMode == futuresDetailChartDataState.viewMode && Intrinsics.areEqual(this.contract, futuresDetailChartDataState.contract) && Intrinsics.areEqual(this.product, futuresDetailChartDataState.product) && Intrinsics.areEqual(this.quote, futuresDetailChartDataState.quote) && this.isInFuturesAdvancedChartsExperiment == futuresDetailChartDataState.isInFuturesAdvancedChartsExperiment && this.hasVisitedMac == futuresDetailChartDataState.hasVisitedMac && Intrinsics.areEqual(this.chartResult, futuresDetailChartDataState.chartResult) && this.currentChartType == futuresDetailChartDataState.currentChartType && this.currentDisplaySpan == futuresDetailChartDataState.currentDisplaySpan && this._isContinuousChart == futuresDetailChartDataState._isContinuousChart && this.chartSettingsVisible == futuresDetailChartDataState.chartSettingsVisible;
    }

    public int hashCode() {
        UUID uuid = this.contractId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        FuturesDetailChartDuxo4 futuresDetailChartDuxo4 = this.viewMode;
        int iHashCode2 = (iHashCode + (futuresDetailChartDuxo4 == null ? 0 : futuresDetailChartDuxo4.hashCode())) * 31;
        FuturesContract futuresContract = this.contract;
        int iHashCode3 = (iHashCode2 + (futuresContract == null ? 0 : futuresContract.hashCode())) * 31;
        FuturesProduct futuresProduct = this.product;
        int iHashCode4 = (iHashCode3 + (futuresProduct == null ? 0 : futuresProduct.hashCode())) * 31;
        FuturesQuote futuresQuote = this.quote;
        int iHashCode5 = (((((iHashCode4 + (futuresQuote == null ? 0 : futuresQuote.hashCode())) * 31) + Boolean.hashCode(this.isInFuturesAdvancedChartsExperiment)) * 31) + Boolean.hashCode(this.hasVisitedMac)) * 31;
        FuturesChartResult futuresChartResult = this.chartResult;
        return ((((((((iHashCode5 + (futuresChartResult != null ? futuresChartResult.hashCode() : 0)) * 31) + this.currentChartType.hashCode()) * 31) + this.currentDisplaySpan.hashCode()) * 31) + Boolean.hashCode(this._isContinuousChart)) * 31) + Boolean.hashCode(this.chartSettingsVisible);
    }

    public String toString() {
        return "FuturesDetailChartDataState(contractId=" + this.contractId + ", viewMode=" + this.viewMode + ", contract=" + this.contract + ", product=" + this.product + ", quote=" + this.quote + ", isInFuturesAdvancedChartsExperiment=" + this.isInFuturesAdvancedChartsExperiment + ", hasVisitedMac=" + this.hasVisitedMac + ", chartResult=" + this.chartResult + ", currentChartType=" + this.currentChartType + ", currentDisplaySpan=" + this.currentDisplaySpan + ", _isContinuousChart=" + this._isContinuousChart + ", chartSettingsVisible=" + this.chartSettingsVisible + ")";
    }

    public FuturesDetailChartDataState(UUID uuid, FuturesDetailChartDuxo4 futuresDetailChartDuxo4, FuturesContract futuresContract, FuturesProduct futuresProduct, FuturesQuote futuresQuote, boolean z, boolean z2, FuturesChartResult futuresChartResult, ChartType currentChartType, DisplaySpan currentDisplaySpan, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(currentChartType, "currentChartType");
        Intrinsics.checkNotNullParameter(currentDisplaySpan, "currentDisplaySpan");
        this.contractId = uuid;
        this.viewMode = futuresDetailChartDuxo4;
        this.contract = futuresContract;
        this.product = futuresProduct;
        this.quote = futuresQuote;
        this.isInFuturesAdvancedChartsExperiment = z;
        this.hasVisitedMac = z2;
        this.chartResult = futuresChartResult;
        this.currentChartType = currentChartType;
        this.currentDisplaySpan = currentDisplaySpan;
        this._isContinuousChart = z3;
        this.chartSettingsVisible = z4;
        this.chart = futuresChartResult != null ? futuresChartResult.getChart() : null;
        this.comparisonPoint = futuresChartResult != null ? futuresChartResult.getComparisonPoint() : null;
        boolean z5 = false;
        if (futuresChartResult != null && !futuresChartResult.isChartPositive()) {
            z5 = true;
        }
        this.isChartPositive = !z5;
        this.scrubData = futuresChartResult != null ? futuresChartResult.getScrubData() : null;
    }

    public final UUID getContractId() {
        return this.contractId;
    }

    public final FuturesDetailChartDuxo4 getViewMode() {
        return this.viewMode;
    }

    public final FuturesContract getContract() {
        return this.contract;
    }

    public final FuturesProduct getProduct() {
        return this.product;
    }

    public final FuturesQuote getQuote() {
        return this.quote;
    }

    public final boolean isInFuturesAdvancedChartsExperiment() {
        return this.isInFuturesAdvancedChartsExperiment;
    }

    public final boolean getHasVisitedMac() {
        return this.hasVisitedMac;
    }

    public final FuturesChartResult getChartResult() {
        return this.chartResult;
    }

    public /* synthetic */ FuturesDetailChartDataState(UUID uuid, FuturesDetailChartDuxo4 futuresDetailChartDuxo4, FuturesContract futuresContract, FuturesProduct futuresProduct, FuturesQuote futuresQuote, boolean z, boolean z2, FuturesChartResult futuresChartResult, ChartType chartType, DisplaySpan displaySpan, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : futuresDetailChartDuxo4, (i & 4) != 0 ? null : futuresContract, (i & 8) != 0 ? null : futuresProduct, (i & 16) != 0 ? null : futuresQuote, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) == 0 ? futuresChartResult : null, (i & 256) != 0 ? ChartType.LINE : chartType, (i & 512) != 0 ? DisplaySpan.DAY : displaySpan, (i & 1024) != 0 ? true : z3, (i & 2048) != 0 ? false : z4);
    }

    public final ChartType getCurrentChartType() {
        return this.currentChartType;
    }

    public final DisplaySpan getCurrentDisplaySpan() {
        return this.currentDisplaySpan;
    }

    public final boolean getChartSettingsVisible() {
        return this.chartSettingsVisible;
    }

    public final Chart<Parcelable> getChart() {
        return this.chart;
    }

    /* renamed from: isChartPositive, reason: from getter */
    public final boolean getIsChartPositive() {
        return this.isChartPositive;
    }

    public final List<ScrubData> getScrubData() {
        return this.scrubData;
    }

    public final boolean getShowContinuousChartToggle() {
        FuturesDetailChartDuxo4 futuresDetailChartDuxo4 = this.viewMode;
        int i = futuresDetailChartDuxo4 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[futuresDetailChartDuxo4.ordinal()];
        if (i == -1 || i == 1) {
            FuturesProduct futuresProduct = this.product;
            if (futuresProduct != null) {
                return Intrinsics.areEqual(futuresProduct.getActiveFuturesContractId(), this.contractId);
            }
            return true;
        }
        if (i == 2 || i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isContinuousChart() {
        FuturesDetailChartDuxo4 futuresDetailChartDuxo4 = this.viewMode;
        int i = futuresDetailChartDuxo4 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[futuresDetailChartDuxo4.ordinal()];
        if (i == -1 || i == 1) {
            FuturesProduct futuresProduct = this.product;
            if (futuresProduct != null) {
                return Intrinsics.areEqual(futuresProduct.getActiveFuturesContractId(), this.contractId) && this._isContinuousChart;
            }
            return this._isContinuousChart;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FuturesDetailChartViewState.ChartData.CurrentCursorData getCurrentCursorData() {
        BigDecimal lastTradePrice;
        Tuples2 tuples2M3642to;
        FuturesQuote futuresQuote = this.quote;
        if (futuresQuote == null || (lastTradePrice = futuresQuote.getLastTradePrice()) == null) {
            return null;
        }
        String str = FuturesProduct5.format$default(this.product, lastTradePrice, null, 2, null);
        if (this.comparisonPoint != null) {
            double dDoubleValue = lastTradePrice.doubleValue() - this.comparisonPoint.doubleValue();
            tuples2M3642to = Tuples4.m3642to(FuturesProduct5.formatDelta(this.product, dDoubleValue) + " (" + Formats.getPercentDeltaFormat().format(Double.valueOf(dDoubleValue / this.comparisonPoint.doubleValue())) + ")", Boolean.valueOf(dDoubleValue >= 0.0d));
            if (tuples2M3642to == null) {
                tuples2M3642to = Tuples4.m3642to(null, Boolean.TRUE);
            }
        }
        return new FuturesDetailChartViewState.ChartData.CurrentCursorData(str, (String) tuples2M3642to.component1(), ((Boolean) tuples2M3642to.component2()).booleanValue(), DisplaySpans3.toDescriptionStrId(this.currentDisplaySpan));
    }
}
