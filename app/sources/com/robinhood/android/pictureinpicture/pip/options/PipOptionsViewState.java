package com.robinhood.android.pictureinpicture.pip.options;

import android.os.Parcelable;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.serverdriven.experimental.api.Chart;
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

/* compiled from: PipOptionsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsViewState;", "", "loading", "", "<init>", "(Z)V", "getLoading", "()Z", "OptionsViewState", "Companion", "Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsViewState$OptionsViewState;", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class PipOptionsViewState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final OptionsViewState EmptyViewState = new OptionsViewState(null, null, null, null, null, null, null, null, true, 255, null);
    private final boolean loading;

    public /* synthetic */ PipOptionsViewState(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    private PipOptionsViewState(boolean z) {
        this.loading = z;
    }

    public boolean getLoading() {
        return this.loading;
    }

    /* compiled from: PipOptionsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\fHÆ\u0003J\u0015\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\fHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\fHÆ\u0003J\t\u00100\u001a\u00020\u0016HÆ\u0003J\u008f\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\u0013\u00102\u001a\u00020\u00162\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsViewState$OptionsViewState;", "Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsViewState;", "displayName", "", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "displayData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "colorDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "lines", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "fills", "Lcom/robinhood/models/serverdriven/experimental/api/ChartFill;", "overlays", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "legendList", "Lcom/robinhood/models/serverdriven/experimental/api/ChartLegendItem;", "loading", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/Chart;Lcom/robinhood/models/serverdriven/experimental/api/CursorData;Lcom/robinhood/compose/bento/theme/Direction;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Z)V", "getDisplayName", "()Ljava/lang/String;", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "getDisplayData", "()Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "getColorDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "getLines", "()Lkotlinx/collections/immutable/ImmutableList;", "getFills", "getOverlays", "getLegendList", "getLoading", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionsViewState extends PipOptionsViewState {
        public static final int $stable = 8;
        private final Chart<Parcelable> chart;
        private final BentoTheme4 colorDirection;
        private final CursorData displayData;
        private final String displayName;
        private final ImmutableList<ChartFill> fills;
        private final ImmutableList<ChartLegendItem> legendList;
        private final ImmutableList<Line> lines;
        private final boolean loading;
        private final ImmutableList<UIComponent<GenericAction>> overlays;

        public OptionsViewState() {
            this(null, null, null, null, null, null, null, null, false, 511, null);
        }

        public static /* synthetic */ OptionsViewState copy$default(OptionsViewState optionsViewState, String str, Chart chart, CursorData cursorData, BentoTheme4 bentoTheme4, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = optionsViewState.displayName;
            }
            if ((i & 2) != 0) {
                chart = optionsViewState.chart;
            }
            if ((i & 4) != 0) {
                cursorData = optionsViewState.displayData;
            }
            if ((i & 8) != 0) {
                bentoTheme4 = optionsViewState.colorDirection;
            }
            if ((i & 16) != 0) {
                immutableList = optionsViewState.lines;
            }
            if ((i & 32) != 0) {
                immutableList2 = optionsViewState.fills;
            }
            if ((i & 64) != 0) {
                immutableList3 = optionsViewState.overlays;
            }
            if ((i & 128) != 0) {
                immutableList4 = optionsViewState.legendList;
            }
            if ((i & 256) != 0) {
                z = optionsViewState.loading;
            }
            ImmutableList immutableList5 = immutableList4;
            boolean z2 = z;
            ImmutableList immutableList6 = immutableList2;
            ImmutableList immutableList7 = immutableList3;
            ImmutableList immutableList8 = immutableList;
            CursorData cursorData2 = cursorData;
            return optionsViewState.copy(str, chart, cursorData2, bentoTheme4, immutableList8, immutableList6, immutableList7, immutableList5, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        public final Chart<Parcelable> component2() {
            return this.chart;
        }

        /* renamed from: component3, reason: from getter */
        public final CursorData getDisplayData() {
            return this.displayData;
        }

        /* renamed from: component4, reason: from getter */
        public final BentoTheme4 getColorDirection() {
            return this.colorDirection;
        }

        public final ImmutableList<Line> component5() {
            return this.lines;
        }

        public final ImmutableList<ChartFill> component6() {
            return this.fills;
        }

        public final ImmutableList<UIComponent<GenericAction>> component7() {
            return this.overlays;
        }

        public final ImmutableList<ChartLegendItem> component8() {
            return this.legendList;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getLoading() {
            return this.loading;
        }

        public final OptionsViewState copy(String displayName, Chart<? extends Parcelable> chart, CursorData displayData, BentoTheme4 colorDirection, ImmutableList<Line> lines, ImmutableList<ChartFill> fills, ImmutableList<? extends UIComponent<? extends GenericAction>> overlays, ImmutableList<ChartLegendItem> legendList, boolean loading) {
            Intrinsics.checkNotNullParameter(colorDirection, "colorDirection");
            Intrinsics.checkNotNullParameter(lines, "lines");
            Intrinsics.checkNotNullParameter(fills, "fills");
            Intrinsics.checkNotNullParameter(overlays, "overlays");
            return new OptionsViewState(displayName, chart, displayData, colorDirection, lines, fills, overlays, legendList, loading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionsViewState)) {
                return false;
            }
            OptionsViewState optionsViewState = (OptionsViewState) other;
            return Intrinsics.areEqual(this.displayName, optionsViewState.displayName) && Intrinsics.areEqual(this.chart, optionsViewState.chart) && Intrinsics.areEqual(this.displayData, optionsViewState.displayData) && this.colorDirection == optionsViewState.colorDirection && Intrinsics.areEqual(this.lines, optionsViewState.lines) && Intrinsics.areEqual(this.fills, optionsViewState.fills) && Intrinsics.areEqual(this.overlays, optionsViewState.overlays) && Intrinsics.areEqual(this.legendList, optionsViewState.legendList) && this.loading == optionsViewState.loading;
        }

        public int hashCode() {
            String str = this.displayName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Chart<Parcelable> chart = this.chart;
            int iHashCode2 = (iHashCode + (chart == null ? 0 : chart.hashCode())) * 31;
            CursorData cursorData = this.displayData;
            int iHashCode3 = (((((((((iHashCode2 + (cursorData == null ? 0 : cursorData.hashCode())) * 31) + this.colorDirection.hashCode()) * 31) + this.lines.hashCode()) * 31) + this.fills.hashCode()) * 31) + this.overlays.hashCode()) * 31;
            ImmutableList<ChartLegendItem> immutableList = this.legendList;
            return ((iHashCode3 + (immutableList != null ? immutableList.hashCode() : 0)) * 31) + Boolean.hashCode(this.loading);
        }

        public String toString() {
            return "OptionsViewState(displayName=" + this.displayName + ", chart=" + this.chart + ", displayData=" + this.displayData + ", colorDirection=" + this.colorDirection + ", lines=" + this.lines + ", fills=" + this.fills + ", overlays=" + this.overlays + ", legendList=" + this.legendList + ", loading=" + this.loading + ")";
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final Chart<Parcelable> getChart() {
            return this.chart;
        }

        public final CursorData getDisplayData() {
            return this.displayData;
        }

        public /* synthetic */ OptionsViewState(String str, Chart chart, CursorData cursorData, BentoTheme4 bentoTheme4, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : chart, (i & 4) != 0 ? null : cursorData, (i & 8) != 0 ? BentoTheme4.POSITIVE : bentoTheme4, (i & 16) != 0 ? extensions2.toImmutableList(CollectionsKt.emptyList()) : immutableList, (i & 32) != 0 ? extensions2.toImmutableList(CollectionsKt.emptyList()) : immutableList2, (i & 64) != 0 ? extensions2.toImmutableList(CollectionsKt.emptyList()) : immutableList3, (i & 128) != 0 ? null : immutableList4, (i & 256) != 0 ? false : z);
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

        @Override // com.robinhood.android.pictureinpicture.pip.options.PipOptionsViewState
        public boolean getLoading() {
            return this.loading;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OptionsViewState(String str, Chart<? extends Parcelable> chart, CursorData cursorData, BentoTheme4 colorDirection, ImmutableList<Line> lines, ImmutableList<ChartFill> fills, ImmutableList<? extends UIComponent<? extends GenericAction>> overlays, ImmutableList<ChartLegendItem> immutableList, boolean z) {
            super(z, null);
            Intrinsics.checkNotNullParameter(colorDirection, "colorDirection");
            Intrinsics.checkNotNullParameter(lines, "lines");
            Intrinsics.checkNotNullParameter(fills, "fills");
            Intrinsics.checkNotNullParameter(overlays, "overlays");
            this.displayName = str;
            this.chart = chart;
            this.displayData = cursorData;
            this.colorDirection = colorDirection;
            this.lines = lines;
            this.fills = fills;
            this.overlays = overlays;
            this.legendList = immutableList;
            this.loading = z;
        }
    }

    /* compiled from: PipOptionsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsViewState$Companion;", "", "<init>", "()V", "EmptyViewState", "Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsViewState$OptionsViewState;", "getEmptyViewState$feature_pip_externalDebug", "()Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsViewState$OptionsViewState;", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionsViewState getEmptyViewState$feature_pip_externalDebug() {
            return PipOptionsViewState.EmptyViewState;
        }
    }
}
