package com.robinhood.android.futures.assethome.sections;

import android.os.Parcelable;
import com.robinhood.android.futures.assethome.C16973R;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.android.futures.charts.FuturesPerformanceChartResult;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAssetHomeChartDataState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010!\u001a\u00020\"*\u00020\u0003H\u0002J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J5\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\rR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartDataState;", "", "currentDisplaySpan", "", "chartResult", "Lcom/robinhood/android/futures/charts/FuturesPerformanceChartResult;", "scrubbedCursorData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "showNetReturnsBottomSheet", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/futures/charts/FuturesPerformanceChartResult;Lcom/robinhood/models/serverdriven/experimental/api/CursorData;Z)V", "getCurrentDisplaySpan", "()Ljava/lang/String;", "getChartResult", "()Lcom/robinhood/android/futures/charts/FuturesPerformanceChartResult;", "getScrubbedCursorData", "()Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "getShowNetReturnsBottomSheet", "()Z", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "defaultCursorData", "getDefaultCursorData", "spanGrossReturn", "getSpanGrossReturn", "netReturnBottomSheetViewState", "Lcom/robinhood/android/futures/assethome/sections/NetReturnsBottomSheetViewState;", "getNetReturnBottomSheetViewState", "()Lcom/robinhood/android/futures/assethome/sections/NetReturnsBottomSheetViewState;", "toNetReturnBottomSheetCurrentSpanPnlTitle", "Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesAssetHomeChartDataState {
    public static final int $stable = 8;
    private final Chart<Parcelable> chart;
    private final FuturesPerformanceChartResult chartResult;
    private final String currentDisplaySpan;
    private final CursorData defaultCursorData;
    private final NetReturnsBottomSheetViewState netReturnBottomSheetViewState;
    private final CursorData scrubbedCursorData;
    private final boolean showNetReturnsBottomSheet;
    private final String spanGrossReturn;

    public FuturesAssetHomeChartDataState() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ FuturesAssetHomeChartDataState copy$default(FuturesAssetHomeChartDataState futuresAssetHomeChartDataState, String str, FuturesPerformanceChartResult futuresPerformanceChartResult, CursorData cursorData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresAssetHomeChartDataState.currentDisplaySpan;
        }
        if ((i & 2) != 0) {
            futuresPerformanceChartResult = futuresAssetHomeChartDataState.chartResult;
        }
        if ((i & 4) != 0) {
            cursorData = futuresAssetHomeChartDataState.scrubbedCursorData;
        }
        if ((i & 8) != 0) {
            z = futuresAssetHomeChartDataState.showNetReturnsBottomSheet;
        }
        return futuresAssetHomeChartDataState.copy(str, futuresPerformanceChartResult, cursorData, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrentDisplaySpan() {
        return this.currentDisplaySpan;
    }

    /* renamed from: component2, reason: from getter */
    public final FuturesPerformanceChartResult getChartResult() {
        return this.chartResult;
    }

    /* renamed from: component3, reason: from getter */
    public final CursorData getScrubbedCursorData() {
        return this.scrubbedCursorData;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowNetReturnsBottomSheet() {
        return this.showNetReturnsBottomSheet;
    }

    public final FuturesAssetHomeChartDataState copy(String currentDisplaySpan, FuturesPerformanceChartResult chartResult, CursorData scrubbedCursorData, boolean showNetReturnsBottomSheet) {
        Intrinsics.checkNotNullParameter(currentDisplaySpan, "currentDisplaySpan");
        return new FuturesAssetHomeChartDataState(currentDisplaySpan, chartResult, scrubbedCursorData, showNetReturnsBottomSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesAssetHomeChartDataState)) {
            return false;
        }
        FuturesAssetHomeChartDataState futuresAssetHomeChartDataState = (FuturesAssetHomeChartDataState) other;
        return Intrinsics.areEqual(this.currentDisplaySpan, futuresAssetHomeChartDataState.currentDisplaySpan) && Intrinsics.areEqual(this.chartResult, futuresAssetHomeChartDataState.chartResult) && Intrinsics.areEqual(this.scrubbedCursorData, futuresAssetHomeChartDataState.scrubbedCursorData) && this.showNetReturnsBottomSheet == futuresAssetHomeChartDataState.showNetReturnsBottomSheet;
    }

    public int hashCode() {
        int iHashCode = this.currentDisplaySpan.hashCode() * 31;
        FuturesPerformanceChartResult futuresPerformanceChartResult = this.chartResult;
        int iHashCode2 = (iHashCode + (futuresPerformanceChartResult == null ? 0 : futuresPerformanceChartResult.hashCode())) * 31;
        CursorData cursorData = this.scrubbedCursorData;
        return ((iHashCode2 + (cursorData != null ? cursorData.hashCode() : 0)) * 31) + Boolean.hashCode(this.showNetReturnsBottomSheet);
    }

    public String toString() {
        return "FuturesAssetHomeChartDataState(currentDisplaySpan=" + this.currentDisplaySpan + ", chartResult=" + this.chartResult + ", scrubbedCursorData=" + this.scrubbedCursorData + ", showNetReturnsBottomSheet=" + this.showNetReturnsBottomSheet + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FuturesAssetHomeChartDataState(String currentDisplaySpan, FuturesPerformanceChartResult futuresPerformanceChartResult, CursorData cursorData, boolean z) {
        String str;
        Double exchangeFees;
        Double spanPnl;
        Double commission;
        Double netReturn;
        Double spanPnl2;
        Intrinsics.checkNotNullParameter(currentDisplaySpan, "currentDisplaySpan");
        this.currentDisplaySpan = currentDisplaySpan;
        this.chartResult = futuresPerformanceChartResult;
        this.scrubbedCursorData = cursorData;
        this.showNetReturnsBottomSheet = z;
        NetReturnsBottomSheetViewState netReturnsBottomSheetViewState = null;
        stringResourceInvoke = null;
        StringResource stringResourceInvoke = null;
        this.chart = futuresPerformanceChartResult != null ? futuresPerformanceChartResult.getChart() : null;
        this.defaultCursorData = futuresPerformanceChartResult != null ? futuresPerformanceChartResult.getDefaultDisplay() : null;
        if (futuresPerformanceChartResult != null && (spanPnl2 = futuresPerformanceChartResult.getSpanPnl()) != null) {
            str = Formats.getPriceDeltaWithHundredthDecimalFormat().format(Double.valueOf(spanPnl2.doubleValue()));
            if (str == null) {
            }
        } else {
            str = "-";
        }
        this.spanGrossReturn = str;
        if (z) {
            StringResource stringResourceInvoke2 = (futuresPerformanceChartResult == null || (netReturn = futuresPerformanceChartResult.getNetReturn()) == null) ? null : StringResource.INSTANCE.invoke(Formats.getPriceDeltaWithHundredthDecimalFormat().format(Double.valueOf(netReturn.doubleValue())));
            StringResource netReturnBottomSheetCurrentSpanPnlTitle = toNetReturnBottomSheetCurrentSpanPnlTitle(currentDisplaySpan);
            StringResource stringResourceInvoke3 = (futuresPerformanceChartResult == null || (commission = futuresPerformanceChartResult.getCommission()) == null) ? null : StringResource.INSTANCE.invoke(Formats.getPriceDeltaWithHundredthDecimalFormat().format(Double.valueOf(commission.doubleValue())));
            StringResource stringResourceInvoke4 = (futuresPerformanceChartResult == null || (spanPnl = futuresPerformanceChartResult.getSpanPnl()) == null) ? null : StringResource.INSTANCE.invoke(Formats.getPriceDeltaWithHundredthDecimalFormat().format(Double.valueOf(spanPnl.doubleValue())));
            if (futuresPerformanceChartResult != null && (exchangeFees = futuresPerformanceChartResult.getExchangeFees()) != null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(Formats.getPriceDeltaWithHundredthDecimalFormat().format(Double.valueOf(exchangeFees.doubleValue())));
            }
            netReturnsBottomSheetViewState = new NetReturnsBottomSheetViewState(stringResourceInvoke2, netReturnBottomSheetCurrentSpanPnlTitle, stringResourceInvoke4, stringResourceInvoke3, stringResourceInvoke);
        }
        this.netReturnBottomSheetViewState = netReturnsBottomSheetViewState;
    }

    public /* synthetic */ FuturesAssetHomeChartDataState(String str, FuturesPerformanceChartResult futuresPerformanceChartResult, CursorData cursorData, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DisplaySpans.WEEK : str, (i & 2) != 0 ? null : futuresPerformanceChartResult, (i & 4) != 0 ? null : cursorData, (i & 8) != 0 ? false : z);
    }

    public final String getCurrentDisplaySpan() {
        return this.currentDisplaySpan;
    }

    public final FuturesPerformanceChartResult getChartResult() {
        return this.chartResult;
    }

    public final CursorData getScrubbedCursorData() {
        return this.scrubbedCursorData;
    }

    public final boolean getShowNetReturnsBottomSheet() {
        return this.showNetReturnsBottomSheet;
    }

    public final Chart<Parcelable> getChart() {
        return this.chart;
    }

    public final CursorData getDefaultCursorData() {
        return this.defaultCursorData;
    }

    public final String getSpanGrossReturn() {
        return this.spanGrossReturn;
    }

    public final NetReturnsBottomSheetViewState getNetReturnBottomSheetViewState() {
        return this.netReturnBottomSheetViewState;
    }

    private final StringResource toNetReturnBottomSheetCurrentSpanPnlTitle(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 1596) {
            if (iHashCode != 1606) {
                if (iHashCode != 1608) {
                    if (iHashCode != 1658) {
                        if (iHashCode != 64897) {
                            if (iHashCode == 88201 && str.equals(DisplaySpans.YTD)) {
                                return StringResource.INSTANCE.invoke(C16973R.string.futures_asset_home_chart_bottom_sheet_year_to_date_pnl, new Object[0]);
                            }
                        } else if (str.equals(DisplaySpans.ALL)) {
                            return StringResource.INSTANCE.invoke(C16973R.string.futures_asset_home_chart_bottom_sheet_all_time_pnl, new Object[0]);
                        }
                    } else if (str.equals(DisplaySpans.THREE_MONTHS)) {
                        return StringResource.INSTANCE.invoke(C16973R.string.futures_asset_home_chart_bottom_sheet_past_three_months_pnl, new Object[0]);
                    }
                } else if (str.equals(DisplaySpans.YEAR)) {
                    return StringResource.INSTANCE.invoke(C16973R.string.futures_asset_home_chart_bottom_sheet_past_year_pnl, new Object[0]);
                }
            } else if (str.equals(DisplaySpans.WEEK)) {
                return StringResource.INSTANCE.invoke(C16973R.string.futures_asset_home_chart_bottom_sheet_past_week_pnl, new Object[0]);
            }
        } else if (str.equals(DisplaySpans.MONTH)) {
            return StringResource.INSTANCE.invoke(C16973R.string.futures_asset_home_chart_bottom_sheet_past_month_pnl, new Object[0]);
        }
        throw new IllegalStateException((str + " is not a supported span for Futures Performance Chart").toString());
    }
}
