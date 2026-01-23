package com.robinhood.android.pictureinpicture.pip.futures;

import android.os.Parcelable;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.Segment;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PipFuturesViewState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J;\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001e0\u00168F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/futures/PipFuturesViewState;", "", "contractSymbol", "", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "direction", "Lcom/robinhood/compose/bento/theme/Direction;", "loading", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/Chart;Lcom/robinhood/compose/bento/theme/Direction;Z)V", "getContractSymbol", "()Ljava/lang/String;", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "getDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "getLoading", "()Z", "lines", "", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "getLines", "()Ljava/util/List;", "fills", "Lcom/robinhood/models/serverdriven/experimental/api/ChartFill;", "getFills", "overlays", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "getOverlays", "displayData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "getDisplayData", "()Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PipFuturesViewState {
    private final Chart<Parcelable> chart;
    private final String contractSymbol;
    private final BentoTheme4 direction;
    private final boolean loading;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final PipFuturesViewState EmptyViewState = new PipFuturesViewState(null, null, null, true, 7, null);

    public PipFuturesViewState() {
        this(null, null, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PipFuturesViewState copy$default(PipFuturesViewState pipFuturesViewState, String str, Chart chart, BentoTheme4 bentoTheme4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pipFuturesViewState.contractSymbol;
        }
        if ((i & 2) != 0) {
            chart = pipFuturesViewState.chart;
        }
        if ((i & 4) != 0) {
            bentoTheme4 = pipFuturesViewState.direction;
        }
        if ((i & 8) != 0) {
            z = pipFuturesViewState.loading;
        }
        return pipFuturesViewState.copy(str, chart, bentoTheme4, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContractSymbol() {
        return this.contractSymbol;
    }

    public final Chart<Parcelable> component2() {
        return this.chart;
    }

    /* renamed from: component3, reason: from getter */
    public final BentoTheme4 getDirection() {
        return this.direction;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final PipFuturesViewState copy(String contractSymbol, Chart<? extends Parcelable> chart, BentoTheme4 direction, boolean loading) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new PipFuturesViewState(contractSymbol, chart, direction, loading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PipFuturesViewState)) {
            return false;
        }
        PipFuturesViewState pipFuturesViewState = (PipFuturesViewState) other;
        return Intrinsics.areEqual(this.contractSymbol, pipFuturesViewState.contractSymbol) && Intrinsics.areEqual(this.chart, pipFuturesViewState.chart) && this.direction == pipFuturesViewState.direction && this.loading == pipFuturesViewState.loading;
    }

    public int hashCode() {
        String str = this.contractSymbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Chart<Parcelable> chart = this.chart;
        return ((((iHashCode + (chart != null ? chart.hashCode() : 0)) * 31) + this.direction.hashCode()) * 31) + Boolean.hashCode(this.loading);
    }

    public String toString() {
        return "PipFuturesViewState(contractSymbol=" + this.contractSymbol + ", chart=" + this.chart + ", direction=" + this.direction + ", loading=" + this.loading + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PipFuturesViewState(String str, Chart<? extends Parcelable> chart, BentoTheme4 direction, boolean z) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.contractSymbol = str;
        this.chart = chart;
        this.direction = direction;
        this.loading = z;
    }

    public final String getContractSymbol() {
        return this.contractSymbol;
    }

    public final Chart<Parcelable> getChart() {
        return this.chart;
    }

    public /* synthetic */ PipFuturesViewState(String str, Chart chart, BentoTheme4 bentoTheme4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : chart, (i & 4) != 0 ? BentoTheme4.POSITIVE : bentoTheme4, (i & 8) != 0 ? false : z);
    }

    public final BentoTheme4 getDirection() {
        return this.direction;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final List<Line> getLines() {
        List<Line> lines;
        Chart<Parcelable> chart = this.chart;
        return (chart == null || (lines = chart.getLines()) == null) ? CollectionsKt.emptyList() : lines;
    }

    public final List<ChartFill> getFills() {
        List<ChartFill> fills;
        Chart<Parcelable> chart = this.chart;
        return (chart == null || (fills = chart.getFills()) == null) ? CollectionsKt.emptyList() : fills;
    }

    public final List<UIComponent<Parcelable>> getOverlays() {
        List<UIComponent<ActionT>> overlays;
        Chart<Parcelable> chart = this.chart;
        return (chart == null || (overlays = chart.getOverlays()) == 0) ? CollectionsKt.emptyList() : overlays;
    }

    public final CursorData getDisplayData() {
        List<Line> lines;
        Line line;
        List<Segment> segments;
        Segment segment;
        List<Point> points;
        Point point;
        Chart<Parcelable> chart = this.chart;
        if (chart == null || (lines = chart.getLines()) == null || (line = (Line) CollectionsKt.lastOrNull((List) lines)) == null || (segments = line.getSegments()) == null || (segment = (Segment) CollectionsKt.lastOrNull((List) segments)) == null || (points = segment.getPoints()) == null || (point = (Point) CollectionsKt.lastOrNull((List) points)) == null) {
            return null;
        }
        return point.getCursor_data();
    }

    /* compiled from: PipFuturesViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/futures/PipFuturesViewState$Companion;", "", "<init>", "()V", "EmptyViewState", "Lcom/robinhood/android/pictureinpicture/pip/futures/PipFuturesViewState;", "getEmptyViewState$feature_pip_externalDebug", "()Lcom/robinhood/android/pictureinpicture/pip/futures/PipFuturesViewState;", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PipFuturesViewState getEmptyViewState$feature_pip_externalDebug() {
            return PipFuturesViewState.EmptyViewState;
        }
    }
}
