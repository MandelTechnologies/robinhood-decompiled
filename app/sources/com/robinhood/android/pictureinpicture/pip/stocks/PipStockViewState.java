package com.robinhood.android.pictureinpicture.pip.stocks;

import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PipStockViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockViewState;", "", "loading", "", "<init>", "(Z)V", "getLoading", "()Z", "StocksViewState", "Companion", "Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockViewState$StocksViewState;", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class PipStockViewState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final StocksViewState EmptyViewState = new StocksViewState(null, null, null, null, null, null, null, true, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    private final boolean loading;

    public /* synthetic */ PipStockViewState(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    private PipStockViewState(boolean z) {
        this.loading = z;
    }

    public boolean getLoading() {
        return this.loading;
    }

    /* compiled from: PipStockViewState.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\t\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\tHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tHÆ\u0003J\t\u0010*\u001a\u00020\u0013HÆ\u0003J}\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\t2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010,\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockViewState$StocksViewState;", "Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockViewState;", "tickerSymbol", "", "displayData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "colorDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "lines", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "fills", "Lcom/robinhood/models/serverdriven/experimental/api/ChartFill;", "overlays", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "legendList", "Lcom/robinhood/models/serverdriven/experimental/api/ChartLegendItem;", "loading", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/CursorData;Lcom/robinhood/compose/bento/theme/Direction;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Z)V", "getTickerSymbol", "()Ljava/lang/String;", "getDisplayData", "()Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "getColorDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "getLines", "()Lkotlinx/collections/immutable/ImmutableList;", "getFills", "getOverlays", "getLegendList", "getLoading", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StocksViewState extends PipStockViewState {
        public static final int $stable = 8;
        private final BentoTheme4 colorDirection;
        private final CursorData displayData;
        private final ImmutableList<ChartFill> fills;
        private final ImmutableList<ChartLegendItem> legendList;
        private final ImmutableList<Line> lines;
        private final boolean loading;
        private final ImmutableList<UIComponent<GenericAction>> overlays;
        private final String tickerSymbol;

        public StocksViewState() {
            this(null, null, null, null, null, null, null, false, 255, null);
        }

        public static /* synthetic */ StocksViewState copy$default(StocksViewState stocksViewState, String str, CursorData cursorData, BentoTheme4 bentoTheme4, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stocksViewState.tickerSymbol;
            }
            if ((i & 2) != 0) {
                cursorData = stocksViewState.displayData;
            }
            if ((i & 4) != 0) {
                bentoTheme4 = stocksViewState.colorDirection;
            }
            if ((i & 8) != 0) {
                immutableList = stocksViewState.lines;
            }
            if ((i & 16) != 0) {
                immutableList2 = stocksViewState.fills;
            }
            if ((i & 32) != 0) {
                immutableList3 = stocksViewState.overlays;
            }
            if ((i & 64) != 0) {
                immutableList4 = stocksViewState.legendList;
            }
            if ((i & 128) != 0) {
                z = stocksViewState.loading;
            }
            ImmutableList immutableList5 = immutableList4;
            boolean z2 = z;
            ImmutableList immutableList6 = immutableList2;
            ImmutableList immutableList7 = immutableList3;
            return stocksViewState.copy(str, cursorData, bentoTheme4, immutableList, immutableList6, immutableList7, immutableList5, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTickerSymbol() {
            return this.tickerSymbol;
        }

        /* renamed from: component2, reason: from getter */
        public final CursorData getDisplayData() {
            return this.displayData;
        }

        /* renamed from: component3, reason: from getter */
        public final BentoTheme4 getColorDirection() {
            return this.colorDirection;
        }

        public final ImmutableList<Line> component4() {
            return this.lines;
        }

        public final ImmutableList<ChartFill> component5() {
            return this.fills;
        }

        public final ImmutableList<UIComponent<GenericAction>> component6() {
            return this.overlays;
        }

        public final ImmutableList<ChartLegendItem> component7() {
            return this.legendList;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getLoading() {
            return this.loading;
        }

        public final StocksViewState copy(String tickerSymbol, CursorData displayData, BentoTheme4 colorDirection, ImmutableList<Line> lines, ImmutableList<ChartFill> fills, ImmutableList<? extends UIComponent<? extends GenericAction>> overlays, ImmutableList<ChartLegendItem> legendList, boolean loading) {
            Intrinsics.checkNotNullParameter(colorDirection, "colorDirection");
            Intrinsics.checkNotNullParameter(lines, "lines");
            Intrinsics.checkNotNullParameter(fills, "fills");
            Intrinsics.checkNotNullParameter(overlays, "overlays");
            return new StocksViewState(tickerSymbol, displayData, colorDirection, lines, fills, overlays, legendList, loading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StocksViewState)) {
                return false;
            }
            StocksViewState stocksViewState = (StocksViewState) other;
            return Intrinsics.areEqual(this.tickerSymbol, stocksViewState.tickerSymbol) && Intrinsics.areEqual(this.displayData, stocksViewState.displayData) && this.colorDirection == stocksViewState.colorDirection && Intrinsics.areEqual(this.lines, stocksViewState.lines) && Intrinsics.areEqual(this.fills, stocksViewState.fills) && Intrinsics.areEqual(this.overlays, stocksViewState.overlays) && Intrinsics.areEqual(this.legendList, stocksViewState.legendList) && this.loading == stocksViewState.loading;
        }

        public int hashCode() {
            String str = this.tickerSymbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            CursorData cursorData = this.displayData;
            int iHashCode2 = (((((((((iHashCode + (cursorData == null ? 0 : cursorData.hashCode())) * 31) + this.colorDirection.hashCode()) * 31) + this.lines.hashCode()) * 31) + this.fills.hashCode()) * 31) + this.overlays.hashCode()) * 31;
            ImmutableList<ChartLegendItem> immutableList = this.legendList;
            return ((iHashCode2 + (immutableList != null ? immutableList.hashCode() : 0)) * 31) + Boolean.hashCode(this.loading);
        }

        public String toString() {
            return "StocksViewState(tickerSymbol=" + this.tickerSymbol + ", displayData=" + this.displayData + ", colorDirection=" + this.colorDirection + ", lines=" + this.lines + ", fills=" + this.fills + ", overlays=" + this.overlays + ", legendList=" + this.legendList + ", loading=" + this.loading + ")";
        }

        public final String getTickerSymbol() {
            return this.tickerSymbol;
        }

        public final CursorData getDisplayData() {
            return this.displayData;
        }

        public /* synthetic */ StocksViewState(String str, CursorData cursorData, BentoTheme4 bentoTheme4, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : cursorData, (i & 4) != 0 ? BentoTheme4.POSITIVE : bentoTheme4, (i & 8) != 0 ? extensions2.toImmutableList(CollectionsKt.emptyList()) : immutableList, (i & 16) != 0 ? extensions2.toImmutableList(CollectionsKt.emptyList()) : immutableList2, (i & 32) != 0 ? extensions2.toImmutableList(CollectionsKt.emptyList()) : immutableList3, (i & 64) != 0 ? null : immutableList4, (i & 128) != 0 ? false : z);
        }

        public final BentoTheme4 getColorDirection() {
            return this.colorDirection;
        }

        public final ImmutableList<Line> getLines() {
            return this.lines;
        }

        public final ImmutableList<ChartFill> getFills() {
            return this.fills;
        }

        public final ImmutableList<UIComponent<GenericAction>> getOverlays() {
            return this.overlays;
        }

        public final ImmutableList<ChartLegendItem> getLegendList() {
            return this.legendList;
        }

        @Override // com.robinhood.android.pictureinpicture.pip.stocks.PipStockViewState
        public boolean getLoading() {
            return this.loading;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StocksViewState(String str, CursorData cursorData, BentoTheme4 colorDirection, ImmutableList<Line> lines, ImmutableList<ChartFill> fills, ImmutableList<? extends UIComponent<? extends GenericAction>> overlays, ImmutableList<ChartLegendItem> immutableList, boolean z) {
            super(z, null);
            Intrinsics.checkNotNullParameter(colorDirection, "colorDirection");
            Intrinsics.checkNotNullParameter(lines, "lines");
            Intrinsics.checkNotNullParameter(fills, "fills");
            Intrinsics.checkNotNullParameter(overlays, "overlays");
            this.tickerSymbol = str;
            this.displayData = cursorData;
            this.colorDirection = colorDirection;
            this.lines = lines;
            this.fills = fills;
            this.overlays = overlays;
            this.legendList = immutableList;
            this.loading = z;
        }
    }

    /* compiled from: PipStockViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockViewState$Companion;", "", "<init>", "()V", "EmptyViewState", "Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockViewState$StocksViewState;", "getEmptyViewState$feature_pip_externalDebug", "()Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockViewState$StocksViewState;", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StocksViewState getEmptyViewState$feature_pip_externalDebug() {
            return PipStockViewState.EmptyViewState;
        }
    }
}
