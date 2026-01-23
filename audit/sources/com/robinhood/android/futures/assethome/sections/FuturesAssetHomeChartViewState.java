package com.robinhood.android.futures.assethome.sections;

import android.os.Parcelable;
import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FuturesAssetHomeChartViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003JG\u0010!\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartViewState;", "", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "currentDisplaySpan", "", "cursorData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "netReturnsBottomSheetViewState", "Lcom/robinhood/android/futures/assethome/sections/NetReturnsBottomSheetViewState;", "spanGrossReturn", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Chart;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/CursorData;Lcom/robinhood/android/futures/assethome/sections/NetReturnsBottomSheetViewState;Ljava/lang/String;)V", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "getCurrentDisplaySpan", "()Ljava/lang/String;", "getCursorData", "()Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "getNetReturnsBottomSheetViewState", "()Lcom/robinhood/android/futures/assethome/sections/NetReturnsBottomSheetViewState;", "getSpanGrossReturn", "availableSpans", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/models/db/SpanOption;", "getAvailableSpans", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesAssetHomeChartViewState {
    public static final int $stable = 8;
    private final ImmutableList<SpanOption> availableSpans;
    private final Chart<Parcelable> chart;
    private final String currentDisplaySpan;
    private final CursorData cursorData;
    private final NetReturnsBottomSheetViewState netReturnsBottomSheetViewState;
    private final String spanGrossReturn;

    public static /* synthetic */ FuturesAssetHomeChartViewState copy$default(FuturesAssetHomeChartViewState futuresAssetHomeChartViewState, Chart chart, String str, CursorData cursorData, NetReturnsBottomSheetViewState netReturnsBottomSheetViewState, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            chart = futuresAssetHomeChartViewState.chart;
        }
        if ((i & 2) != 0) {
            str = futuresAssetHomeChartViewState.currentDisplaySpan;
        }
        if ((i & 4) != 0) {
            cursorData = futuresAssetHomeChartViewState.cursorData;
        }
        if ((i & 8) != 0) {
            netReturnsBottomSheetViewState = futuresAssetHomeChartViewState.netReturnsBottomSheetViewState;
        }
        if ((i & 16) != 0) {
            str2 = futuresAssetHomeChartViewState.spanGrossReturn;
        }
        String str3 = str2;
        CursorData cursorData2 = cursorData;
        return futuresAssetHomeChartViewState.copy(chart, str, cursorData2, netReturnsBottomSheetViewState, str3);
    }

    public final Chart<Parcelable> component1() {
        return this.chart;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrentDisplaySpan() {
        return this.currentDisplaySpan;
    }

    /* renamed from: component3, reason: from getter */
    public final CursorData getCursorData() {
        return this.cursorData;
    }

    /* renamed from: component4, reason: from getter */
    public final NetReturnsBottomSheetViewState getNetReturnsBottomSheetViewState() {
        return this.netReturnsBottomSheetViewState;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSpanGrossReturn() {
        return this.spanGrossReturn;
    }

    public final FuturesAssetHomeChartViewState copy(Chart<? extends Parcelable> chart, String currentDisplaySpan, CursorData cursorData, NetReturnsBottomSheetViewState netReturnsBottomSheetViewState, String spanGrossReturn) {
        Intrinsics.checkNotNullParameter(currentDisplaySpan, "currentDisplaySpan");
        Intrinsics.checkNotNullParameter(spanGrossReturn, "spanGrossReturn");
        return new FuturesAssetHomeChartViewState(chart, currentDisplaySpan, cursorData, netReturnsBottomSheetViewState, spanGrossReturn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesAssetHomeChartViewState)) {
            return false;
        }
        FuturesAssetHomeChartViewState futuresAssetHomeChartViewState = (FuturesAssetHomeChartViewState) other;
        return Intrinsics.areEqual(this.chart, futuresAssetHomeChartViewState.chart) && Intrinsics.areEqual(this.currentDisplaySpan, futuresAssetHomeChartViewState.currentDisplaySpan) && Intrinsics.areEqual(this.cursorData, futuresAssetHomeChartViewState.cursorData) && Intrinsics.areEqual(this.netReturnsBottomSheetViewState, futuresAssetHomeChartViewState.netReturnsBottomSheetViewState) && Intrinsics.areEqual(this.spanGrossReturn, futuresAssetHomeChartViewState.spanGrossReturn);
    }

    public int hashCode() {
        Chart<Parcelable> chart = this.chart;
        int iHashCode = (((chart == null ? 0 : chart.hashCode()) * 31) + this.currentDisplaySpan.hashCode()) * 31;
        CursorData cursorData = this.cursorData;
        int iHashCode2 = (iHashCode + (cursorData == null ? 0 : cursorData.hashCode())) * 31;
        NetReturnsBottomSheetViewState netReturnsBottomSheetViewState = this.netReturnsBottomSheetViewState;
        return ((iHashCode2 + (netReturnsBottomSheetViewState != null ? netReturnsBottomSheetViewState.hashCode() : 0)) * 31) + this.spanGrossReturn.hashCode();
    }

    public String toString() {
        return "FuturesAssetHomeChartViewState(chart=" + this.chart + ", currentDisplaySpan=" + this.currentDisplaySpan + ", cursorData=" + this.cursorData + ", netReturnsBottomSheetViewState=" + this.netReturnsBottomSheetViewState + ", spanGrossReturn=" + this.spanGrossReturn + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesAssetHomeChartViewState(Chart<? extends Parcelable> chart, String currentDisplaySpan, CursorData cursorData, NetReturnsBottomSheetViewState netReturnsBottomSheetViewState, String spanGrossReturn) {
        Intrinsics.checkNotNullParameter(currentDisplaySpan, "currentDisplaySpan");
        Intrinsics.checkNotNullParameter(spanGrossReturn, "spanGrossReturn");
        this.chart = chart;
        this.currentDisplaySpan = currentDisplaySpan;
        this.cursorData = cursorData;
        this.netReturnsBottomSheetViewState = netReturnsBottomSheetViewState;
        this.spanGrossReturn = spanGrossReturn;
        this.availableSpans = extensions2.persistentListOf(new SpanOption(DisplaySpans.WEEK, DisplaySpans.WEEK, false), new SpanOption(DisplaySpans.MONTH, DisplaySpans.MONTH, false), new SpanOption(DisplaySpans.THREE_MONTHS, DisplaySpans.THREE_MONTHS, false), new SpanOption(DisplaySpans.YTD, DisplaySpans.YTD, false), new SpanOption(DisplaySpans.YEAR, DisplaySpans.YEAR, false), new SpanOption(DisplaySpans.ALL, DisplaySpans.ALL, false));
    }

    public final Chart<Parcelable> getChart() {
        return this.chart;
    }

    public final String getCurrentDisplaySpan() {
        return this.currentDisplaySpan;
    }

    public final CursorData getCursorData() {
        return this.cursorData;
    }

    public final NetReturnsBottomSheetViewState getNetReturnsBottomSheetViewState() {
        return this.netReturnsBottomSheetViewState;
    }

    public final String getSpanGrossReturn() {
        return this.spanGrossReturn;
    }

    public final ImmutableList<SpanOption> getAvailableSpans() {
        return this.availableSpans;
    }
}
