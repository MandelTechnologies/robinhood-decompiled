package com.robinhood.shared.crypto.charts.p374ui;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.charts.model.LegendItem;
import com.robinhood.android.charts.span.SpanSelectorTrailingButton;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.Either;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.ButtonDto;

/* compiled from: HistoricalChartComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007\u0012\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0007\u0012\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0007¢\u0006\u0004\b)\u0010*J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0015\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007HÆ\u0003J\t\u0010Q\u001a\u00020\rHÆ\u0003J\t\u0010R\u001a\u00020\rHÆ\u0003J\t\u0010S\u001a\u00020\rHÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007HÆ\u0003J\u0015\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007HÆ\u0003J\t\u0010W\u001a\u00020\u0017HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\t\u0010Z\u001a\u00020\u001dHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\t\u0010\\\u001a\u00020!HÆ\u0003J\u000f\u0010]\u001a\b\u0012\u0004\u0012\u00020!0\u0007HÆ\u0003J\u0017\u0010^\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$HÆ\u0003J\u000f\u0010_\u001a\b\u0012\u0004\u0012\u00020(0\u0007HÂ\u0003J\u0093\u0002\u0010`\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0007HÆ\u0001J\u0013\u0010a\u001a\u00020\r2\b\u0010b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010c\u001a\u00020dHÖ\u0001J\t\u0010e\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u00102R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u00102R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u00100R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b7\u00100R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0007¢\u0006\b\n\u0000\u001a\u0004\bD\u00100R\u001f\u0010#\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010G\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bH\u0010?R\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u00078G¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/charts/ui/HistoricalChartState;", "", "chartMode", "Lcom/robinhood/shared/crypto/charts/ui/ChartMode;", "cursorData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "fills", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/ChartFill;", "header", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isAnimationEnabled", "", "isLoading", "showCandleScrubData", "legendPoints", "Lkotlinx/collections/immutable/ImmutableSet;", "", "lines", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "overlays", "pageDirection", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "priceString", "", "rewardButton", "Lrh_server_driven_ui/v1/ButtonDto;", "rewardButtonThemeDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "scrubPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "selectedSpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "spans", "trailingSpanIcon", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/compose/bento/component/BentoIcons;", "Lcom/robinhood/android/charts/span/SpanSelectorTrailingButton$DrawableIcon;", "_legendList", "Lcom/robinhood/models/serverdriven/experimental/api/ChartLegendItem;", "<init>", "(Lcom/robinhood/shared/crypto/charts/ui/ChartMode;Lcom/robinhood/models/serverdriven/experimental/api/CursorData;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ZZZLkotlinx/collections/immutable/ImmutableSet;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/serverdriven/experimental/api/Direction;Ljava/lang/String;Lrh_server_driven_ui/v1/ButtonDto;Lcom/robinhood/compose/bento/theme/Direction;Lcom/robinhood/models/serverdriven/experimental/api/Point;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/utils/Either;Lkotlinx/collections/immutable/ImmutableList;)V", "getChartMode", "()Lcom/robinhood/shared/crypto/charts/ui/ChartMode;", "getCursorData", "()Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "getFills", "()Lkotlinx/collections/immutable/ImmutableList;", "getHeader", "()Z", "getShowCandleScrubData", "getLegendPoints", "()Lkotlinx/collections/immutable/ImmutableSet;", "getLines", "getOverlays", "getPageDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getPriceString", "()Ljava/lang/String;", "getRewardButton", "()Lrh_server_driven_ui/v1/ButtonDto;", "getRewardButtonThemeDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "getScrubPoint", "()Lcom/robinhood/models/serverdriven/experimental/api/Point;", "getSelectedSpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getSpans", "getTrailingSpanIcon", "()Lcom/robinhood/utils/Either;", "themeDirection", "getThemeDirection", "legendList", "Lcom/robinhood/android/charts/model/LegendItem;", "getLegendList", "(Landroidx/compose/runtime/Composer;I)Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "other", "hashCode", "", "toString", "lib-charts-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class HistoricalChartState {
    public static final int $stable = 8;
    private final ImmutableList<ChartLegendItem> _legendList;
    private final HistoricalChartComposable chartMode;
    private final CursorData cursorData;
    private final ImmutableList<ChartFill> fills;
    private final ImmutableList<UIComponent<GenericAction>> header;
    private final boolean isAnimationEnabled;
    private final boolean isLoading;
    private final ImmutableSet<Float> legendPoints;
    private final ImmutableList<Line> lines;
    private final ImmutableList<UIComponent<GenericAction>> overlays;
    private final Direction pageDirection;
    private final String priceString;
    private final ButtonDto rewardButton;
    private final BentoTheme4 rewardButtonThemeDirection;
    private final Point scrubPoint;
    private final DisplaySpan selectedSpan;
    private final boolean showCandleScrubData;
    private final ImmutableList<DisplaySpan> spans;
    private final BentoTheme4 themeDirection;
    private final Either<BentoIcon4, SpanSelectorTrailingButton.DrawableIcon> trailingSpanIcon;

    private final ImmutableList<ChartLegendItem> component19() {
        return this._legendList;
    }

    public static /* synthetic */ HistoricalChartState copy$default(HistoricalChartState historicalChartState, HistoricalChartComposable historicalChartComposable, CursorData cursorData, ImmutableList immutableList, ImmutableList immutableList2, boolean z, boolean z2, boolean z3, ImmutableSet immutableSet, ImmutableList immutableList3, ImmutableList immutableList4, Direction direction, String str, ButtonDto buttonDto, BentoTheme4 bentoTheme4, Point point, DisplaySpan displaySpan, ImmutableList immutableList5, Either either, ImmutableList immutableList6, int i, Object obj) {
        ImmutableList immutableList7;
        Either either2;
        HistoricalChartComposable historicalChartComposable2 = (i & 1) != 0 ? historicalChartState.chartMode : historicalChartComposable;
        CursorData cursorData2 = (i & 2) != 0 ? historicalChartState.cursorData : cursorData;
        ImmutableList immutableList8 = (i & 4) != 0 ? historicalChartState.fills : immutableList;
        ImmutableList immutableList9 = (i & 8) != 0 ? historicalChartState.header : immutableList2;
        boolean z4 = (i & 16) != 0 ? historicalChartState.isAnimationEnabled : z;
        boolean z5 = (i & 32) != 0 ? historicalChartState.isLoading : z2;
        boolean z6 = (i & 64) != 0 ? historicalChartState.showCandleScrubData : z3;
        ImmutableSet immutableSet2 = (i & 128) != 0 ? historicalChartState.legendPoints : immutableSet;
        ImmutableList immutableList10 = (i & 256) != 0 ? historicalChartState.lines : immutableList3;
        ImmutableList immutableList11 = (i & 512) != 0 ? historicalChartState.overlays : immutableList4;
        Direction direction2 = (i & 1024) != 0 ? historicalChartState.pageDirection : direction;
        String str2 = (i & 2048) != 0 ? historicalChartState.priceString : str;
        ButtonDto buttonDto2 = (i & 4096) != 0 ? historicalChartState.rewardButton : buttonDto;
        BentoTheme4 bentoTheme42 = (i & 8192) != 0 ? historicalChartState.rewardButtonThemeDirection : bentoTheme4;
        HistoricalChartComposable historicalChartComposable3 = historicalChartComposable2;
        Point point2 = (i & 16384) != 0 ? historicalChartState.scrubPoint : point;
        DisplaySpan displaySpan2 = (i & 32768) != 0 ? historicalChartState.selectedSpan : displaySpan;
        ImmutableList immutableList12 = (i & 65536) != 0 ? historicalChartState.spans : immutableList5;
        Either either3 = (i & 131072) != 0 ? historicalChartState.trailingSpanIcon : either;
        if ((i & 262144) != 0) {
            either2 = either3;
            immutableList7 = historicalChartState._legendList;
        } else {
            immutableList7 = immutableList6;
            either2 = either3;
        }
        return historicalChartState.copy(historicalChartComposable3, cursorData2, immutableList8, immutableList9, z4, z5, z6, immutableSet2, immutableList10, immutableList11, direction2, str2, buttonDto2, bentoTheme42, point2, displaySpan2, immutableList12, either2, immutableList7);
    }

    /* renamed from: component1, reason: from getter */
    public final HistoricalChartComposable getChartMode() {
        return this.chartMode;
    }

    public final ImmutableList<UIComponent<GenericAction>> component10() {
        return this.overlays;
    }

    /* renamed from: component11, reason: from getter */
    public final Direction getPageDirection() {
        return this.pageDirection;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPriceString() {
        return this.priceString;
    }

    /* renamed from: component13, reason: from getter */
    public final ButtonDto getRewardButton() {
        return this.rewardButton;
    }

    /* renamed from: component14, reason: from getter */
    public final BentoTheme4 getRewardButtonThemeDirection() {
        return this.rewardButtonThemeDirection;
    }

    /* renamed from: component15, reason: from getter */
    public final Point getScrubPoint() {
        return this.scrubPoint;
    }

    /* renamed from: component16, reason: from getter */
    public final DisplaySpan getSelectedSpan() {
        return this.selectedSpan;
    }

    public final ImmutableList<DisplaySpan> component17() {
        return this.spans;
    }

    public final Either<BentoIcon4, SpanSelectorTrailingButton.DrawableIcon> component18() {
        return this.trailingSpanIcon;
    }

    /* renamed from: component2, reason: from getter */
    public final CursorData getCursorData() {
        return this.cursorData;
    }

    public final ImmutableList<ChartFill> component3() {
        return this.fills;
    }

    public final ImmutableList<UIComponent<GenericAction>> component4() {
        return this.header;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsAnimationEnabled() {
        return this.isAnimationEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowCandleScrubData() {
        return this.showCandleScrubData;
    }

    public final ImmutableSet<Float> component8() {
        return this.legendPoints;
    }

    public final ImmutableList<Line> component9() {
        return this.lines;
    }

    public final HistoricalChartState copy(HistoricalChartComposable chartMode, CursorData cursorData, ImmutableList<ChartFill> fills, ImmutableList<? extends UIComponent<? extends GenericAction>> header, boolean isAnimationEnabled, boolean isLoading, boolean showCandleScrubData, ImmutableSet<Float> legendPoints, ImmutableList<Line> lines, ImmutableList<? extends UIComponent<? extends GenericAction>> overlays, Direction pageDirection, String priceString, ButtonDto rewardButton, BentoTheme4 rewardButtonThemeDirection, Point scrubPoint, DisplaySpan selectedSpan, ImmutableList<? extends DisplaySpan> spans, Either<? extends BentoIcon4, SpanSelectorTrailingButton.DrawableIcon> trailingSpanIcon, ImmutableList<ChartLegendItem> _legendList) {
        Intrinsics.checkNotNullParameter(chartMode, "chartMode");
        Intrinsics.checkNotNullParameter(fills, "fills");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(legendPoints, "legendPoints");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(overlays, "overlays");
        Intrinsics.checkNotNullParameter(pageDirection, "pageDirection");
        Intrinsics.checkNotNullParameter(rewardButtonThemeDirection, "rewardButtonThemeDirection");
        Intrinsics.checkNotNullParameter(selectedSpan, "selectedSpan");
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(_legendList, "_legendList");
        return new HistoricalChartState(chartMode, cursorData, fills, header, isAnimationEnabled, isLoading, showCandleScrubData, legendPoints, lines, overlays, pageDirection, priceString, rewardButton, rewardButtonThemeDirection, scrubPoint, selectedSpan, spans, trailingSpanIcon, _legendList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoricalChartState)) {
            return false;
        }
        HistoricalChartState historicalChartState = (HistoricalChartState) other;
        return this.chartMode == historicalChartState.chartMode && Intrinsics.areEqual(this.cursorData, historicalChartState.cursorData) && Intrinsics.areEqual(this.fills, historicalChartState.fills) && Intrinsics.areEqual(this.header, historicalChartState.header) && this.isAnimationEnabled == historicalChartState.isAnimationEnabled && this.isLoading == historicalChartState.isLoading && this.showCandleScrubData == historicalChartState.showCandleScrubData && Intrinsics.areEqual(this.legendPoints, historicalChartState.legendPoints) && Intrinsics.areEqual(this.lines, historicalChartState.lines) && Intrinsics.areEqual(this.overlays, historicalChartState.overlays) && this.pageDirection == historicalChartState.pageDirection && Intrinsics.areEqual(this.priceString, historicalChartState.priceString) && Intrinsics.areEqual(this.rewardButton, historicalChartState.rewardButton) && this.rewardButtonThemeDirection == historicalChartState.rewardButtonThemeDirection && Intrinsics.areEqual(this.scrubPoint, historicalChartState.scrubPoint) && this.selectedSpan == historicalChartState.selectedSpan && Intrinsics.areEqual(this.spans, historicalChartState.spans) && Intrinsics.areEqual(this.trailingSpanIcon, historicalChartState.trailingSpanIcon) && Intrinsics.areEqual(this._legendList, historicalChartState._legendList);
    }

    public int hashCode() {
        int iHashCode = this.chartMode.hashCode() * 31;
        CursorData cursorData = this.cursorData;
        int iHashCode2 = (((((((((((((((((((iHashCode + (cursorData == null ? 0 : cursorData.hashCode())) * 31) + this.fills.hashCode()) * 31) + this.header.hashCode()) * 31) + Boolean.hashCode(this.isAnimationEnabled)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.showCandleScrubData)) * 31) + this.legendPoints.hashCode()) * 31) + this.lines.hashCode()) * 31) + this.overlays.hashCode()) * 31) + this.pageDirection.hashCode()) * 31;
        String str = this.priceString;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ButtonDto buttonDto = this.rewardButton;
        int iHashCode4 = (((iHashCode3 + (buttonDto == null ? 0 : buttonDto.hashCode())) * 31) + this.rewardButtonThemeDirection.hashCode()) * 31;
        Point point = this.scrubPoint;
        int iHashCode5 = (((((iHashCode4 + (point == null ? 0 : point.hashCode())) * 31) + this.selectedSpan.hashCode()) * 31) + this.spans.hashCode()) * 31;
        Either<BentoIcon4, SpanSelectorTrailingButton.DrawableIcon> either = this.trailingSpanIcon;
        return ((iHashCode5 + (either != null ? either.hashCode() : 0)) * 31) + this._legendList.hashCode();
    }

    public String toString() {
        return "HistoricalChartState(chartMode=" + this.chartMode + ", cursorData=" + this.cursorData + ", fills=" + this.fills + ", header=" + this.header + ", isAnimationEnabled=" + this.isAnimationEnabled + ", isLoading=" + this.isLoading + ", showCandleScrubData=" + this.showCandleScrubData + ", legendPoints=" + this.legendPoints + ", lines=" + this.lines + ", overlays=" + this.overlays + ", pageDirection=" + this.pageDirection + ", priceString=" + this.priceString + ", rewardButton=" + this.rewardButton + ", rewardButtonThemeDirection=" + this.rewardButtonThemeDirection + ", scrubPoint=" + this.scrubPoint + ", selectedSpan=" + this.selectedSpan + ", spans=" + this.spans + ", trailingSpanIcon=" + this.trailingSpanIcon + ", _legendList=" + this._legendList + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistoricalChartState(HistoricalChartComposable chartMode, CursorData cursorData, ImmutableList<ChartFill> fills, ImmutableList<? extends UIComponent<? extends GenericAction>> header, boolean z, boolean z2, boolean z3, ImmutableSet<Float> legendPoints, ImmutableList<Line> lines, ImmutableList<? extends UIComponent<? extends GenericAction>> overlays, Direction pageDirection, String str, ButtonDto buttonDto, BentoTheme4 rewardButtonThemeDirection, Point point, DisplaySpan selectedSpan, ImmutableList<? extends DisplaySpan> spans, Either<? extends BentoIcon4, SpanSelectorTrailingButton.DrawableIcon> either, ImmutableList<ChartLegendItem> _legendList) {
        Intrinsics.checkNotNullParameter(chartMode, "chartMode");
        Intrinsics.checkNotNullParameter(fills, "fills");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(legendPoints, "legendPoints");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(overlays, "overlays");
        Intrinsics.checkNotNullParameter(pageDirection, "pageDirection");
        Intrinsics.checkNotNullParameter(rewardButtonThemeDirection, "rewardButtonThemeDirection");
        Intrinsics.checkNotNullParameter(selectedSpan, "selectedSpan");
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(_legendList, "_legendList");
        this.chartMode = chartMode;
        this.cursorData = cursorData;
        this.fills = fills;
        this.header = header;
        this.isAnimationEnabled = z;
        this.isLoading = z2;
        this.showCandleScrubData = z3;
        this.legendPoints = legendPoints;
        this.lines = lines;
        this.overlays = overlays;
        this.pageDirection = pageDirection;
        this.priceString = str;
        this.rewardButton = buttonDto;
        this.rewardButtonThemeDirection = rewardButtonThemeDirection;
        this.scrubPoint = point;
        this.selectedSpan = selectedSpan;
        this.spans = spans;
        this.trailingSpanIcon = either;
        this._legendList = _legendList;
        this.themeDirection = pageDirection == Direction.f5855UP ? BentoTheme4.POSITIVE : BentoTheme4.NEGATIVE;
    }

    public final HistoricalChartComposable getChartMode() {
        return this.chartMode;
    }

    public final CursorData getCursorData() {
        return this.cursorData;
    }

    public final ImmutableList<ChartFill> getFills() {
        return this.fills;
    }

    public final ImmutableList<UIComponent<GenericAction>> getHeader() {
        return this.header;
    }

    public final boolean isAnimationEnabled() {
        return this.isAnimationEnabled;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getShowCandleScrubData() {
        return this.showCandleScrubData;
    }

    public final ImmutableSet<Float> getLegendPoints() {
        return this.legendPoints;
    }

    public final ImmutableList<Line> getLines() {
        return this.lines;
    }

    public final ImmutableList<UIComponent<GenericAction>> getOverlays() {
        return this.overlays;
    }

    public final Direction getPageDirection() {
        return this.pageDirection;
    }

    public final String getPriceString() {
        return this.priceString;
    }

    public final ButtonDto getRewardButton() {
        return this.rewardButton;
    }

    public final BentoTheme4 getRewardButtonThemeDirection() {
        return this.rewardButtonThemeDirection;
    }

    public final Point getScrubPoint() {
        return this.scrubPoint;
    }

    public final DisplaySpan getSelectedSpan() {
        return this.selectedSpan;
    }

    public final ImmutableList<DisplaySpan> getSpans() {
        return this.spans;
    }

    public final Either<BentoIcon4, SpanSelectorTrailingButton.DrawableIcon> getTrailingSpanIcon() {
        return this.trailingSpanIcon;
    }

    public final BentoTheme4 getThemeDirection() {
        return this.themeDirection;
    }

    @JvmName
    public final ImmutableList<LegendItem> getLegendList(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(240057777, i, -1, "com.robinhood.shared.crypto.charts.ui.HistoricalChartState.<get-legendList> (HistoricalChartComposable.kt:194)");
        }
        ImmutableList<ChartLegendItem> immutableList = this._legendList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
        for (ChartLegendItem chartLegendItem : immutableList) {
            ThemedColor color = chartLegendItem.getColor();
            Color composeColor = color == null ? null : SduiColors2.toComposeColor(color, composer, 0);
            String title = chartLegendItem.getTitle();
            Color composeColor2 = SduiColors2.toComposeColor(chartLegendItem.getValue_color(), composer, 0);
            if (composeColor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList.add(new LegendItem(chartLegendItem.getId(), composeColor, title, chartLegendItem.getValue(), composeColor2.getValue(), null, 32, null));
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return persistentList;
    }
}
