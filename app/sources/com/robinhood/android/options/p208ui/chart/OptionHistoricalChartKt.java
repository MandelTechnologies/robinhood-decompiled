package com.robinhood.android.options.p208ui.chart;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.ModifiersKt;
import com.robinhood.android.charts.Placeholders2;
import com.robinhood.android.charts.candlestick.CandlestickLegendChart;
import com.robinhood.android.charts.candlestick.UtilKt;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.charts.model.LegendItem;
import com.robinhood.android.charts.models.p080db.OptionHistoricalChartData;
import com.robinhood.android.charts.models.p080db.OptionHistoricalChartModel;
import com.robinhood.android.charts.span.DisplaySpanDynamicSelector;
import com.robinhood.android.charts.span.SpanSelectorTrailingButton;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.options.chart.OptionHistoricalChartHelper;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.p208ui.bottomsheet.LateCloseBottomSheetDialogFragment;
import com.robinhood.android.options.p208ui.chart.OptionHistoricalChartKt;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageBodyState2;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionHistoricalChart.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u009b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u000f2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00060\u000f2\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00060\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0011X\u008a\u008e\u0002"}, m3636d2 = {"chartModifier", "Landroidx/compose/ui/Modifier;", "optionsDefaultSpans", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "OptionHistoricalChart", "", "state", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Chart;", "displaySpans", "Lkotlinx/collections/immutable/ImmutableList;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onSpanChanged", "Lkotlin/Function1;", "onCandlestickSwitchClicked", "", "onUnderlyingInfoClicked", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "onLateCloseInfoClicked", "Lcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment$Args;", "onShowAllHoursToggled", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Chart;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-options-detail_externalDebug", "selectedPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "graphHeaderHeight", "", "showChartSettings"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionHistoricalChartKt {
    private static final Modifier chartModifier = PaddingKt.m5144paddingVpY3zN4$default(ModifiersKt.fullWidthChartSize(Modifier.INSTANCE), 0.0f, C2002Dp.m7995constructorimpl(8), 1, null);
    private static final ImmutableList3<DisplaySpan> optionsDefaultSpans = extensions2.persistentListOf(DisplaySpan.DAY, DisplaySpan.WEEK, DisplaySpan.MONTH, DisplaySpan.f93673MONTH, DisplaySpan.YEAR, DisplaySpan.ALL);

    /* compiled from: OptionHistoricalChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChartType.values().length];
            try {
                iArr[ChartType.LINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChartType.CANDLESTICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChartType.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionHistoricalChart$lambda$32(OptionsDetailPageBodyState2.Chart chart, ImmutableList immutableList, SduiActionHandler sduiActionHandler, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i, int i2, Composer composer, int i3) {
        OptionHistoricalChart(chart, immutableList, sduiActionHandler, function1, function12, function13, function14, function15, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionHistoricalChart(final OptionsDetailPageBodyState2.Chart state, ImmutableList<? extends DisplaySpan> immutableList, final SduiActionHandler<? super GenericAction> actionHandler, final Function1<? super DisplaySpan, Unit> onSpanChanged, final Function1<? super Boolean, Unit> onCandlestickSwitchClicked, final Function1<? super FragmentKey, Unit> onUnderlyingInfoClicked, final Function1<? super LateCloseBottomSheetDialogFragment.Args, Unit> onLateCloseInfoClicked, final Function1<? super Boolean, Unit> onShowAllHoursToggled, Composer composer, final int i, final int i2) {
        int i3;
        final ImmutableList<? extends DisplaySpan> immutableList2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        DisplaySpan activeDisplaySpan;
        Object objRememberedValue3;
        final Measurer2 measurer2;
        Object objRememberedValue4;
        Object objRememberedValue5;
        final SnapshotState snapshotState;
        Object objRememberedValue6;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue7;
        final SnapshotState snapshotState2;
        final int i4;
        boolean zChanged;
        Object objRememberedValue8;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        final SnapshotState snapshotState3;
        Object objRememberedValue9;
        boolean zChangedInstance;
        Object objRememberedValue10;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onSpanChanged, "onSpanChanged");
        Intrinsics.checkNotNullParameter(onCandlestickSwitchClicked, "onCandlestickSwitchClicked");
        Intrinsics.checkNotNullParameter(onUnderlyingInfoClicked, "onUnderlyingInfoClicked");
        Intrinsics.checkNotNullParameter(onLateCloseInfoClicked, "onLateCloseInfoClicked");
        Intrinsics.checkNotNullParameter(onShowAllHoursToggled, "onShowAllHoursToggled");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1850964599);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                immutableList2 = immutableList;
                i3 |= composerStartRestartGroup.changed(immutableList2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onSpanChanged) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onCandlestickSwitchClicked) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onUnderlyingInfoClicked) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onLateCloseInfoClicked) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onShowAllHoursToggled) ? 8388608 : 4194304;
            }
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    immutableList2 = optionsDefaultSpans;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1850964599, i3, -1, "com.robinhood.android.options.ui.chart.OptionHistoricalChart (OptionHistoricalChart.kt:80)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                OptionHistoricalChartModel historicalChart = state.getHistoricalChart();
                OptionHistoricalChartData chartData = historicalChart == null ? historicalChart.getChartData() : null;
                Chart<GenericAction> chart = chartData == null ? chartData.getChart() : null;
                activeDisplaySpan = state.getActiveDisplaySpan();
                if (activeDisplaySpan == null) {
                    activeDisplaySpan = DisplaySpan.DAY;
                }
                ChartType chartType = (chartData != null || state.getDisplayName() == null) ? ChartType.EMPTY : chartData.getShowCandlesticks() ? ChartType.CANDLESTICK : ChartType.LINE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1003410150);
                composerStartRestartGroup.startReplaceGroup(212064437);
                composerStartRestartGroup.endReplaceGroup();
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                final OptionHistoricalChartData optionHistoricalChartData = chartData;
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Measurer2(density);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                measurer2 = (Measurer2) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new ConstraintLayoutScope();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                snapshotState = (SnapshotState) objRememberedValue5;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                snapshotState2 = (SnapshotState) objRememberedValue7;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                i4 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                zChanged = zChangedInstance2 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new MeasurePolicy() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartKt$OptionHistoricalChart$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            snapshotState2.getValue();
                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i4);
                            snapshotState.getValue();
                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartKt$OptionHistoricalChart$$inlined$ConstraintLayout$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                    measurer22.performLayout(placementScope, list, linkedHashMap);
                                }
                            }, 4, null);
                        }
                    };
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState3 = snapshotState;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState3 = snapshotState;
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue8;
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function0<Unit>() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartKt$OptionHistoricalChart$$inlined$ConstraintLayout$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            snapshotState3.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            constraintSetForInlineDsl2.setKnownDirty(true);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                final Function0 function0 = (Function0) objRememberedValue9;
                zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartKt$OptionHistoricalChart$$inlined$ConstraintLayout$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                final DisplaySpan displaySpan = activeDisplaySpan;
                final Chart<GenericAction> chart2 = chart;
                final ChartType chartType2 = chartType;
                composer2 = composerStartRestartGroup;
                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(companion2, false, (Function1) objRememberedValue10, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartKt$OptionHistoricalChart$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:101:0x041b  */
                    /* JADX WARN: Removed duplicated region for block: B:107:0x042a  */
                    /* JADX WARN: Removed duplicated region for block: B:113:0x0439  */
                    /* JADX WARN: Removed duplicated region for block: B:116:0x044b  */
                    /* JADX WARN: Removed duplicated region for block: B:145:0x051e  */
                    /* JADX WARN: Removed duplicated region for block: B:148:0x0536  */
                    /* JADX WARN: Removed duplicated region for block: B:151:0x0555  */
                    /* JADX WARN: Removed duplicated region for block: B:154:0x0593  */
                    /* JADX WARN: Removed duplicated region for block: B:171:0x0688  */
                    /* JADX WARN: Removed duplicated region for block: B:174:0x06a5  */
                    /* JADX WARN: Removed duplicated region for block: B:178:0x06bb  */
                    /* JADX WARN: Removed duplicated region for block: B:182:0x06fc  */
                    /* JADX WARN: Removed duplicated region for block: B:186:0x073c  */
                    /* JADX WARN: Removed duplicated region for block: B:198:0x07b4  */
                    /* JADX WARN: Removed duplicated region for block: B:200:0x07ba  */
                    /* JADX WARN: Removed duplicated region for block: B:203:0x07ef  */
                    /* JADX WARN: Removed duplicated region for block: B:206:0x07fb  */
                    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:95:0x03f6  */
                    /* JADX WARN: Type inference failed for: r13v21, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r13v29 */
                    /* JADX WARN: Type inference failed for: r13v5 */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(Composer composer3, int i6) {
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
                        int i7;
                        CursorData cursorDataCopy$default;
                        int i8;
                        AnnotatedString underlyingValueInfo;
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope44;
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope45;
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope46;
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope47;
                        ?? r13;
                        List<ChartLegendItem> legendList;
                        boolean z;
                        int i9;
                        boolean z2;
                        Map<String, List<ChartLegendItem>> legend_data;
                        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default;
                        boolean zChanged2;
                        Object objRememberedValue11;
                        Chart chart3;
                        List<Line> listEmptyList;
                        Chart chart4;
                        List<ChartFill> listEmptyList2;
                        OptionHistoricalChartData optionHistoricalChartData2;
                        List<UIComponent<GenericAction>> listEmptyList3;
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        ConstraintLayoutScope constraintLayoutScope2;
                        int i14;
                        int i15;
                        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default2;
                        Object objRememberedValue12;
                        Composer.Companion companion3;
                        SnapshotState snapshotState5;
                        SpanSelectorTrailingButton spanSelectorTrailingButton;
                        boolean zChanged3;
                        Object objRememberedValue13;
                        Object objRememberedValue14;
                        Set setEmptySet;
                        Object objRememberedValue15;
                        Composer.Companion companion4;
                        Object objRememberedValue16;
                        Map<String, List<ChartLegendItem>> legend_data2;
                        Set<String> setKeySet;
                        Composer composer4 = composer3;
                        if ((i6 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        snapshotState2.setValue(Unit.INSTANCE);
                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                        constraintLayoutScope.reset();
                        ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
                        composer4.startReplaceGroup(40408563);
                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
                        ChartType chartType3 = chartType2;
                        if (chartType3 == ChartType.EMPTY) {
                            composer4.startReplaceGroup(-2076906157);
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            composer4.startReplaceGroup(1849434622);
                            Object objRememberedValue17 = composer4.rememberedValue();
                            if (objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue17 = OptionHistoricalChartKt$OptionHistoricalChart$1$1$1.INSTANCE;
                                composer4.updateRememberedValue(objRememberedValue17);
                            }
                            composer4.endReplaceGroup();
                            OptionHistoricalChartHeader.OptionHistoricalChartHeaderPlaceholder(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(constraintLayoutScope3.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue17), 0.0f, 1, null), composer4, 0);
                            composer4.endReplaceGroup();
                            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component8;
                            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component7;
                            i8 = 1;
                            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component1;
                            constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component3;
                            constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component5;
                            constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component6;
                            i7 = helpersHashCode;
                            z2 = false;
                        } else if (chartType3 != ChartType.CANDLESTICK || OptionHistoricalChartKt.OptionHistoricalChart$lambda$1(snapshotState4) == null) {
                            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component8;
                            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component7;
                            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component1;
                            i7 = helpersHashCode;
                            composer4.startReplaceGroup(42276870);
                            Point pointOptionHistoricalChart$lambda$1 = OptionHistoricalChartKt.OptionHistoricalChart$lambda$1(snapshotState4);
                            com.robinhood.models.serverdriven.experimental.api.CursorData cursor_data = pointOptionHistoricalChart$lambda$1 != null ? pointOptionHistoricalChart$lambda$1.getCursor_data() : null;
                            composer4.startReplaceGroup(-2076846541);
                            CursorData composableModel = cursor_data == null ? null : SduiCursorData2.toComposableModel(cursor_data, composer4, 0);
                            composer4.endReplaceGroup();
                            composer4.startReplaceGroup(-2076847329);
                            if (composableModel == null) {
                                OptionHistoricalChartData optionHistoricalChartData3 = optionHistoricalChartData;
                                com.robinhood.models.serverdriven.experimental.api.CursorData defaultDisplay = optionHistoricalChartData3 != null ? optionHistoricalChartData3.getDefaultDisplay() : null;
                                composableModel = defaultDisplay == null ? null : SduiCursorData2.toComposableModel(defaultDisplay, composer4, 0);
                            }
                            CursorData cursorData = composableModel;
                            composer4.endReplaceGroup();
                            composer4.startReplaceGroup(-2076839556);
                            if (cursorData == null) {
                                cursorDataCopy$default = null;
                            } else {
                                CursorData.DisplayText primaryValue = cursorData.getPrimaryValue();
                                cursorDataCopy$default = CursorData.copy$default(cursorData, null, primaryValue == null ? null : CursorData.DisplayText.m11995copybw27NRU$default(primaryValue, null, 0L, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getDisplayCapsuleMedium(), 3, null), null, null, null, null, 61, null);
                            }
                            composer4.endReplaceGroup();
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            composer4.startReplaceGroup(1849434622);
                            Object objRememberedValue18 = composer4.rememberedValue();
                            Composer.Companion companion6 = Composer.INSTANCE;
                            if (objRememberedValue18 == companion6.getEmpty()) {
                                objRememberedValue18 = OptionHistoricalChartKt$OptionHistoricalChart$1$3$1.INSTANCE;
                                composer4.updateRememberedValue(objRememberedValue18);
                            }
                            composer4.endReplaceGroup();
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(constraintLayoutScope3.constrainAs(companion5, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue18), 0.0f, 1, null);
                            composer4.startReplaceGroup(5004770);
                            Object objRememberedValue19 = composer4.rememberedValue();
                            if (objRememberedValue19 == companion6.getEmpty()) {
                                objRememberedValue19 = new OptionHistoricalChartKt$OptionHistoricalChart$1$4$1(snapshotIntState2);
                                composer4.updateRememberedValue(objRememberedValue19);
                            }
                            composer4.endReplaceGroup();
                            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, (Function1) objRememberedValue19);
                            if (state.getShowCurrencySymbol()) {
                                composer4.startReplaceGroup(43199957);
                                i8 = 1;
                                underlyingValueInfo = OptionHistoricalChartHelper.getUnderlyingPriceInfo(displaySpan, state.getUnderlyingHistorical(), state.getUnderlyingQuote(), state.getUnderlyingSymbol(), composer4, 0);
                                composer4.endReplaceGroup();
                            } else {
                                i8 = 1;
                                composer4.startReplaceGroup(43567741);
                                underlyingValueInfo = OptionHistoricalChartHelper.getUnderlyingValueInfo(displaySpan, state.getIndexCloseValue(), state.getIndexHistoricals(), state.getIndexValue(), composer4, 0);
                                composer4.endReplaceGroup();
                            }
                            AnnotatedString annotatedString = underlyingValueInfo;
                            composer4.startReplaceGroup(-1633490746);
                            boolean zChanged4 = composer4.changed(onUnderlyingInfoClicked) | composer4.changedInstance(state);
                            Object objRememberedValue20 = composer4.rememberedValue();
                            if (zChanged4 || objRememberedValue20 == companion6.getEmpty()) {
                                objRememberedValue20 = new OptionHistoricalChartKt$OptionHistoricalChart$1$5$1(onUnderlyingInfoClicked, state);
                                composer4.updateRememberedValue(objRememberedValue20);
                            }
                            Function0 function02 = (Function0) objRememberedValue20;
                            composer4.endReplaceGroup();
                            composer4.startReplaceGroup(-1633490746);
                            boolean zChanged5 = composer4.changed(onLateCloseInfoClicked) | composer4.changedInstance(state);
                            Object objRememberedValue21 = composer4.rememberedValue();
                            if (zChanged5 || objRememberedValue21 == companion6.getEmpty()) {
                                objRememberedValue21 = new OptionHistoricalChartKt$OptionHistoricalChart$1$6$1(onLateCloseInfoClicked, state);
                                composer4.updateRememberedValue(objRememberedValue21);
                            }
                            composer4.endReplaceGroup();
                            constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component5;
                            constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component6;
                            constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component3;
                            constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component4;
                            r13 = 0;
                            OptionHistoricalChartHeader.OptionHistoricalChartHeader(modifierOnGloballyPositioned, annotatedString, function02, (Function0) objRememberedValue21, state.getDisplayName(), state.isLateCloseOptionChain(), cursorDataCopy$default, state.getTertiaryValueTooltip(), state.getDisplayCurrencyCode(), state.getShowDisplayCurrencyLabel(), composer4, (CursorData.$stable << 18) | (CursorRowModifiers.TertiaryValueTooltip.$stable << 21));
                            composer4 = composer4;
                            composer4.endReplaceGroup();
                            int i16 = 3;
                            ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr = new ConstraintLayoutBaseScope6[3];
                            constraintLayoutBaseScope6Arr[r13] = constraintLayoutBaseScope43;
                            constraintLayoutBaseScope6Arr[i8] = constraintLayoutBaseScope4Component2;
                            constraintLayoutBaseScope6Arr[2] = constraintLayoutBaseScope46;
                            horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope3, constraintLayoutBaseScope6Arr, 0.0f, 2, null);
                            Modifier.Companion companion7 = Modifier.INSTANCE;
                            composer4.startReplaceGroup(5004770);
                            zChanged2 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                            objRememberedValue11 = composer4.rememberedValue();
                            if (!zChanged2 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue11 = new OptionHistoricalChartKt$OptionHistoricalChart$1$7$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                                composer4.updateRememberedValue(objRememberedValue11);
                            }
                            composer4.endReplaceGroup();
                            SduiCursorData2.SduiLabelTrack(constraintLayoutScope3.constrainAs(companion7, constraintLayoutBaseScope47, (Function1) objRememberedValue11), OptionHistoricalChartKt.OptionHistoricalChart$lambda$1(snapshotState4), composer4, r13, r13);
                            chart3 = chart2;
                            if (chart3 != null || (listEmptyList = chart3.getLines()) == null) {
                                listEmptyList = CollectionsKt.emptyList();
                            }
                            chart4 = chart2;
                            if (chart4 != null || (listEmptyList2 = chart4.getFills()) == null) {
                                listEmptyList2 = CollectionsKt.emptyList();
                            }
                            optionHistoricalChartData2 = optionHistoricalChartData;
                            if (optionHistoricalChartData2 != null || (listEmptyList3 = optionHistoricalChartData2.getOverlays()) == null) {
                                listEmptyList3 = CollectionsKt.emptyList();
                            }
                            i10 = OptionHistoricalChartKt.WhenMappings.$EnumSwitchMapping$0[chartType2.ordinal()];
                            i11 = i8;
                            if (i10 != i11) {
                                i12 = i11;
                                List<Line> list = listEmptyList;
                                composer4.startReplaceGroup(45087423);
                                Modifier modifier = OptionHistoricalChartKt.chartModifier;
                                composer4.startReplaceGroup(5004770);
                                boolean zChanged6 = composer4.changed(constraintLayoutBaseScope47);
                                Object objRememberedValue22 = composer4.rememberedValue();
                                if (zChanged6 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue22 = new OptionHistoricalChartKt$OptionHistoricalChart$1$8$1(constraintLayoutBaseScope47);
                                    composer4.updateRememberedValue(objRememberedValue22);
                                }
                                composer4.endReplaceGroup();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope48 = constraintLayoutBaseScope45;
                                Modifier modifierConstrainAs = constraintLayoutScope3.constrainAs(modifier, constraintLayoutBaseScope48, (Function1) objRememberedValue22);
                                composer4.startReplaceGroup(5004770);
                                Object objRememberedValue23 = composer4.rememberedValue();
                                Composer.Companion companion8 = Composer.INSTANCE;
                                if (objRememberedValue23 == companion8.getEmpty()) {
                                    objRememberedValue23 = new OptionHistoricalChartKt$OptionHistoricalChart$1$9$1(snapshotState4);
                                    composer4.updateRememberedValue(objRememberedValue23);
                                }
                                Function1 function1 = (Function1) objRememberedValue23;
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(5004770);
                                Object objRememberedValue24 = composer4.rememberedValue();
                                if (objRememberedValue24 == companion8.getEmpty()) {
                                    objRememberedValue24 = new OptionHistoricalChartKt$OptionHistoricalChart$1$10$1(snapshotState4);
                                    composer4.updateRememberedValue(objRememberedValue24);
                                }
                                Function0 function03 = (Function0) objRememberedValue24;
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(977840936);
                                constraintLayoutBaseScope45 = constraintLayoutBaseScope48;
                                List listEmptyList4 = CollectionsKt.emptyList();
                                composer4.startReplaceGroup(1849434622);
                                Object objRememberedValue25 = composer4.rememberedValue();
                                if (objRememberedValue25 == companion8.getEmpty()) {
                                    objRememberedValue25 = C23808xa3965ebd.INSTANCE;
                                    composer4.updateRememberedValue(objRememberedValue25);
                                }
                                composer4.endReplaceGroup();
                                i13 = r13;
                                constraintLayoutScope2 = constraintLayoutScope3;
                                i14 = i7;
                                i15 = 2;
                                SduiChartMappersKt.SduiSegmentedLineChart(modifierConstrainAs, listEmptyList4, list, listEmptyList3, actionHandler, (Function1) objRememberedValue25, function1, function03, false, true, null, 0.0f, GenericAction.class, composer3, 14155776, 0, 0);
                                composer4 = composer3;
                                composer4.endReplaceGroup();
                                composer4.endReplaceGroup();
                            } else {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        composer4.startReplaceGroup(-2076755917);
                                        composer4.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer4.startReplaceGroup(46607539);
                                    Modifier modifier2 = OptionHistoricalChartKt.chartModifier;
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChanged7 = composer4.changed(constraintLayoutBaseScope47);
                                    Object objRememberedValue26 = composer4.rememberedValue();
                                    if (zChanged7 || objRememberedValue26 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue26 = new OptionHistoricalChartKt$OptionHistoricalChart$1$15$1(constraintLayoutBaseScope47);
                                        composer4.updateRememberedValue(objRememberedValue26);
                                    }
                                    composer4.endReplaceGroup();
                                    Placeholders2.ChartPlaceholder(constraintLayoutScope3.constrainAs(modifier2, constraintLayoutBaseScope4, (Function1) objRememberedValue26), r13, composer4, r13, 2);
                                    composer4.endReplaceGroup();
                                    i14 = i7;
                                    i15 = 2;
                                    i12 = i11;
                                    i13 = r13;
                                    constraintLayoutScope2 = constraintLayoutScope3;
                                    ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr2 = new ConstraintLayoutBaseScope6[i16];
                                    constraintLayoutBaseScope6Arr2[i13] = constraintLayoutBaseScope45;
                                    constraintLayoutBaseScope6Arr2[i12] = constraintLayoutBaseScope44;
                                    constraintLayoutBaseScope6Arr2[i15] = constraintLayoutBaseScope4;
                                    ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope2;
                                    horizontalAnchorM8136createBottomBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope4, constraintLayoutBaseScope6Arr2, 0.0f, i15, null);
                                    composer4.startReplaceGroup(1849434622);
                                    objRememberedValue12 = composer4.rememberedValue();
                                    companion3 = Composer.INSTANCE;
                                    if (objRememberedValue12 == companion3.getEmpty()) {
                                        objRememberedValue12 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i15, null);
                                        composer4.updateRememberedValue(objRememberedValue12);
                                    }
                                    snapshotState5 = (SnapshotState) objRememberedValue12;
                                    composer4.endReplaceGroup();
                                    composer4.startReplaceGroup(-2076690612);
                                    if (OptionHistoricalChartKt.OptionHistoricalChart$lambda$31$lambda$25(snapshotState5) && chartType2 != ChartType.EMPTY) {
                                        composer4.startReplaceGroup(5004770);
                                        objRememberedValue14 = composer4.rememberedValue();
                                        if (objRememberedValue14 == companion3.getEmpty()) {
                                            objRememberedValue14 = new OptionHistoricalChartKt$OptionHistoricalChart$1$16$1(snapshotState5);
                                            composer4.updateRememberedValue(objRememberedValue14);
                                        }
                                        composer4.endReplaceGroup();
                                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue14, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1969465492, i12, new OptionHistoricalChartKt$OptionHistoricalChart$1$17(chartType2, state, onCandlestickSwitchClicked, onShowAllHoursToggled), composer4, 54), composer3, 1572870, 62);
                                        composer4 = composer3;
                                    }
                                    composer4.endReplaceGroup();
                                    if (state.isOptionsExtendedHoursEnabled()) {
                                        composer4.startReplaceGroup(48418745);
                                        Either.Left leftAsLeft = Either2.asLeft(chartType2 == ChartType.LINE ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.CHART_CANDLESTICKS_16) : new BentoIcon4.Size16(ServerToBentoAssetMapper2.CHART_LINE_16));
                                        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.chart_options_display_toggle, composer4, 0);
                                        composer4.startReplaceGroup(-1633490746);
                                        boolean zChanged8 = composer4.changed(onCandlestickSwitchClicked) | composer4.changedInstance(optionHistoricalChartData);
                                        Object objRememberedValue27 = composer4.rememberedValue();
                                        if (zChanged8 || objRememberedValue27 == companion3.getEmpty()) {
                                            objRememberedValue27 = new C23810x2c9af07d(onCandlestickSwitchClicked, optionHistoricalChartData);
                                            composer4.updateRememberedValue(objRememberedValue27);
                                        }
                                        composer4.endReplaceGroup();
                                        SpanSelectorTrailingButton spanSelectorTrailingButton2 = new SpanSelectorTrailingButton(leftAsLeft, strStringResource, (Function0) objRememberedValue27);
                                        composer4.endReplaceGroup();
                                        spanSelectorTrailingButton = spanSelectorTrailingButton2;
                                    } else {
                                        composer4.startReplaceGroup(48114077);
                                        Either.Left leftAsLeft2 = Either2.asLeft(new BentoIcon4.Size16(ServerToBentoAssetMapper2.SETTINGS_16));
                                        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.chart_options_display_toggle, composer4, i13);
                                        composer4.startReplaceGroup(5004770);
                                        Object objRememberedValue28 = composer4.rememberedValue();
                                        if (objRememberedValue28 == companion3.getEmpty()) {
                                            objRememberedValue28 = new C23809x2c9aecbc(snapshotState5);
                                            composer4.updateRememberedValue(objRememberedValue28);
                                        }
                                        composer4.endReplaceGroup();
                                        SpanSelectorTrailingButton spanSelectorTrailingButton3 = new SpanSelectorTrailingButton(leftAsLeft2, strStringResource2, (Function0) objRememberedValue28);
                                        composer4.endReplaceGroup();
                                        spanSelectorTrailingButton = spanSelectorTrailingButton3;
                                    }
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    composer4.startReplaceGroup(5004770);
                                    zChanged3 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                                    objRememberedValue13 = composer4.rememberedValue();
                                    if (!zChanged3 || objRememberedValue13 == companion3.getEmpty()) {
                                        objRememberedValue13 = new OptionHistoricalChartKt$OptionHistoricalChart$1$18$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                                        composer4.updateRememberedValue(objRememberedValue13);
                                    }
                                    composer4.endReplaceGroup();
                                    DisplaySpanDynamicSelector.DisplaySpanDynamicSelector(immutableList2, displaySpan, constraintLayoutScope4.constrainAs(modifierFillMaxWidth$default, constraintLayoutBaseScope42, (Function1) objRememberedValue13), null, onSpanChanged, spanSelectorTrailingButton, false, null, composer3, SpanSelectorTrailingButton.$stable << 15, 200);
                                    composer3.endReplaceGroup();
                                    if (constraintLayoutScope.getHelpersHashCode() != i14) {
                                        EffectsKt.SideEffect(function0, composer3, 6);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        return;
                                    }
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope49 = constraintLayoutBaseScope4;
                                composer4.startReplaceGroup(45829284);
                                Modifier modifier3 = OptionHistoricalChartKt.chartModifier;
                                composer4.startReplaceGroup(5004770);
                                boolean zChanged9 = composer4.changed(constraintLayoutBaseScope47);
                                Object objRememberedValue29 = composer4.rememberedValue();
                                if (zChanged9 || objRememberedValue29 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue29 = new OptionHistoricalChartKt$OptionHistoricalChart$1$11$1(constraintLayoutBaseScope47);
                                    composer4.updateRememberedValue(objRememberedValue29);
                                }
                                composer4.endReplaceGroup();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope410 = constraintLayoutBaseScope44;
                                Modifier modifierConstrainAs2 = constraintLayoutScope3.constrainAs(modifier3, constraintLayoutBaseScope410, (Function1) objRememberedValue29);
                                Chart chart5 = chart2;
                                if (chart5 == null || (legend_data2 = chart5.getLegend_data()) == null || (setKeySet = legend_data2.keySet()) == null) {
                                    setEmptySet = SetsKt.emptySet();
                                    SduiActionHandler sduiActionHandler = actionHandler;
                                    composer4.startReplaceGroup(5004770);
                                    objRememberedValue15 = composer4.rememberedValue();
                                    companion4 = Composer.INSTANCE;
                                    if (objRememberedValue15 == companion4.getEmpty()) {
                                        objRememberedValue15 = new OptionHistoricalChartKt$OptionHistoricalChart$1$13$1(snapshotState4);
                                        composer4.updateRememberedValue(objRememberedValue15);
                                    }
                                    Function1 function12 = (Function1) objRememberedValue15;
                                    composer4.endReplaceGroup();
                                    composer4.startReplaceGroup(5004770);
                                    objRememberedValue16 = composer4.rememberedValue();
                                    if (objRememberedValue16 == companion4.getEmpty()) {
                                        objRememberedValue16 = new OptionHistoricalChartKt$OptionHistoricalChart$1$14$1(snapshotState4);
                                        composer4.updateRememberedValue(objRememberedValue16);
                                    }
                                    composer4.endReplaceGroup();
                                    constraintLayoutBaseScope4 = constraintLayoutBaseScope49;
                                    i12 = i11;
                                    SduiChartMappersKt.SduiCandlestickChart(modifierConstrainAs2, listEmptyList2, listEmptyList, setEmptySet, sduiActionHandler, false, function12, (Function0) objRememberedValue16, false, composer3, 14155776, 288);
                                    composer4 = composer3;
                                    composer4.endReplaceGroup();
                                    Unit unit = Unit.INSTANCE;
                                    i14 = i7;
                                    i13 = r13;
                                    constraintLayoutBaseScope44 = constraintLayoutBaseScope410;
                                    constraintLayoutScope2 = constraintLayoutScope3;
                                    i15 = 2;
                                } else {
                                    Set<String> set = setKeySet;
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                                    Iterator<T> it = set.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(Float.valueOf(Float.parseFloat((String) it.next())));
                                    }
                                    setEmptySet = CollectionsKt.toSet(arrayList);
                                    if (setEmptySet == null) {
                                    }
                                    SduiActionHandler sduiActionHandler2 = actionHandler;
                                    composer4.startReplaceGroup(5004770);
                                    objRememberedValue15 = composer4.rememberedValue();
                                    companion4 = Composer.INSTANCE;
                                    if (objRememberedValue15 == companion4.getEmpty()) {
                                    }
                                    Function1 function122 = (Function1) objRememberedValue15;
                                    composer4.endReplaceGroup();
                                    composer4.startReplaceGroup(5004770);
                                    objRememberedValue16 = composer4.rememberedValue();
                                    if (objRememberedValue16 == companion4.getEmpty()) {
                                    }
                                    composer4.endReplaceGroup();
                                    constraintLayoutBaseScope4 = constraintLayoutBaseScope49;
                                    i12 = i11;
                                    SduiChartMappersKt.SduiCandlestickChart(modifierConstrainAs2, listEmptyList2, listEmptyList, setEmptySet, sduiActionHandler2, false, function122, (Function0) objRememberedValue16, false, composer3, 14155776, 288);
                                    composer4 = composer3;
                                    composer4.endReplaceGroup();
                                    Unit unit2 = Unit.INSTANCE;
                                    i14 = i7;
                                    i13 = r13;
                                    constraintLayoutBaseScope44 = constraintLayoutBaseScope410;
                                    constraintLayoutScope2 = constraintLayoutScope3;
                                    i15 = 2;
                                }
                                ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr22 = new ConstraintLayoutBaseScope6[i16];
                                constraintLayoutBaseScope6Arr22[i13] = constraintLayoutBaseScope45;
                                constraintLayoutBaseScope6Arr22[i12] = constraintLayoutBaseScope44;
                                constraintLayoutBaseScope6Arr22[i15] = constraintLayoutBaseScope4;
                                ConstraintLayoutScope constraintLayoutScope42 = constraintLayoutScope2;
                                horizontalAnchorM8136createBottomBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope42, constraintLayoutBaseScope6Arr22, 0.0f, i15, null);
                                composer4.startReplaceGroup(1849434622);
                                objRememberedValue12 = composer4.rememberedValue();
                                companion3 = Composer.INSTANCE;
                                if (objRememberedValue12 == companion3.getEmpty()) {
                                }
                                snapshotState5 = (SnapshotState) objRememberedValue12;
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(-2076690612);
                                if (OptionHistoricalChartKt.OptionHistoricalChart$lambda$31$lambda$25(snapshotState5)) {
                                    composer4.startReplaceGroup(5004770);
                                    objRememberedValue14 = composer4.rememberedValue();
                                    if (objRememberedValue14 == companion3.getEmpty()) {
                                    }
                                    composer4.endReplaceGroup();
                                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue14, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1969465492, i12, new OptionHistoricalChartKt$OptionHistoricalChart$1$17(chartType2, state, onCandlestickSwitchClicked, onShowAllHoursToggled), composer4, 54), composer3, 1572870, 62);
                                    composer4 = composer3;
                                }
                                composer4.endReplaceGroup();
                                if (state.isOptionsExtendedHoursEnabled()) {
                                }
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                composer4.startReplaceGroup(5004770);
                                zChanged3 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                                objRememberedValue13 = composer4.rememberedValue();
                                if (!zChanged3) {
                                    objRememberedValue13 = new OptionHistoricalChartKt$OptionHistoricalChart$1$18$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                                    composer4.updateRememberedValue(objRememberedValue13);
                                }
                                composer4.endReplaceGroup();
                                DisplaySpanDynamicSelector.DisplaySpanDynamicSelector(immutableList2, displaySpan, constraintLayoutScope42.constrainAs(modifierFillMaxWidth$default2, constraintLayoutBaseScope42, (Function1) objRememberedValue13), null, onSpanChanged, spanSelectorTrailingButton, false, null, composer3, SpanSelectorTrailingButton.$stable << 15, 200);
                                composer3.endReplaceGroup();
                                if (constraintLayoutScope.getHelpersHashCode() != i14) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                            i16 = 3;
                            ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr222 = new ConstraintLayoutBaseScope6[i16];
                            constraintLayoutBaseScope6Arr222[i13] = constraintLayoutBaseScope45;
                            constraintLayoutBaseScope6Arr222[i12] = constraintLayoutBaseScope44;
                            constraintLayoutBaseScope6Arr222[i15] = constraintLayoutBaseScope4;
                            ConstraintLayoutScope constraintLayoutScope422 = constraintLayoutScope2;
                            horizontalAnchorM8136createBottomBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope422, constraintLayoutBaseScope6Arr222, 0.0f, i15, null);
                            composer4.startReplaceGroup(1849434622);
                            objRememberedValue12 = composer4.rememberedValue();
                            companion3 = Composer.INSTANCE;
                            if (objRememberedValue12 == companion3.getEmpty()) {
                            }
                            snapshotState5 = (SnapshotState) objRememberedValue12;
                            composer4.endReplaceGroup();
                            composer4.startReplaceGroup(-2076690612);
                            if (OptionHistoricalChartKt.OptionHistoricalChart$lambda$31$lambda$25(snapshotState5)) {
                            }
                            composer4.endReplaceGroup();
                            if (state.isOptionsExtendedHoursEnabled()) {
                            }
                            Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            composer4.startReplaceGroup(5004770);
                            zChanged3 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                            objRememberedValue13 = composer4.rememberedValue();
                            if (!zChanged3) {
                            }
                            composer4.endReplaceGroup();
                            DisplaySpanDynamicSelector.DisplaySpanDynamicSelector(immutableList2, displaySpan, constraintLayoutScope422.constrainAs(modifierFillMaxWidth$default22, constraintLayoutBaseScope42, (Function1) objRememberedValue13), null, onSpanChanged, spanSelectorTrailingButton, false, null, composer3, SpanSelectorTrailingButton.$stable << 15, 200);
                            composer3.endReplaceGroup();
                            if (constraintLayoutScope.getHelpersHashCode() != i14) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        } else {
                            composer4.startReplaceGroup(40992044);
                            Chart chart6 = chart2;
                            if (chart6 == null || (legend_data = chart6.getLegend_data()) == null) {
                                legendList = null;
                            } else {
                                Point pointOptionHistoricalChart$lambda$12 = OptionHistoricalChartKt.OptionHistoricalChart$lambda$1(snapshotState4);
                                Intrinsics.checkNotNull(pointOptionHistoricalChart$lambda$12);
                                legendList = UtilKt.getLegendList(legend_data, pointOptionHistoricalChart$lambda$12);
                            }
                            if (legendList == null) {
                                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component8;
                                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component7;
                                constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component1;
                                i7 = helpersHashCode;
                                z = false;
                                i9 = 1;
                            } else {
                                Modifier.Companion companion9 = Modifier.INSTANCE;
                                composer4.startReplaceGroup(1849434622);
                                Object objRememberedValue30 = composer4.rememberedValue();
                                if (objRememberedValue30 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue30 = OptionHistoricalChartKt$OptionHistoricalChart$1$2$1$1.INSTANCE;
                                    composer4.updateRememberedValue(objRememberedValue30);
                                }
                                composer4.endReplaceGroup();
                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(constraintLayoutScope3.constrainAs(companion9, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue30), 0.0f, ((Density) composer4.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(snapshotIntState2.getIntValue()), 1, null), 0.0f, 1, null);
                                composer4.startReplaceGroup(-2076867497);
                                List<ChartLegendItem> list2 = legendList;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                                for (ChartLegendItem chartLegendItem : list2) {
                                    ThemedColor color = chartLegendItem.getColor();
                                    composer4.startReplaceGroup(-2076863920);
                                    Color composeColor = color == null ? null : SduiColors2.toComposeColor(color, composer4, 0);
                                    composer4.endReplaceGroup();
                                    String title = chartLegendItem.getTitle();
                                    Color composeColor2 = SduiColors2.toComposeColor(chartLegendItem.getValue_color(), composer4, 0);
                                    Intrinsics.checkNotNull(composeColor2);
                                    arrayList2.add(new LegendItem(chartLegendItem.getId(), composeColor, title, chartLegendItem.getValue(), composeColor2.getValue(), null, 32, null));
                                }
                                composer4.endReplaceGroup();
                                constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component1;
                                z = false;
                                i7 = helpersHashCode;
                                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component8;
                                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component7;
                                i9 = 1;
                                CandlestickLegendChart.CandlestickLegendChart(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextM(), arrayList2, 0, composer4, 0, 8);
                                Unit unit3 = Unit.INSTANCE;
                            }
                            composer4.endReplaceGroup();
                            z2 = z;
                            constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component3;
                            constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component5;
                            constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component6;
                            i8 = i9;
                        }
                        constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component4;
                        r13 = z2;
                        int i162 = 3;
                        ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr3 = new ConstraintLayoutBaseScope6[3];
                        constraintLayoutBaseScope6Arr3[r13] = constraintLayoutBaseScope43;
                        constraintLayoutBaseScope6Arr3[i8] = constraintLayoutBaseScope4Component2;
                        constraintLayoutBaseScope6Arr3[2] = constraintLayoutBaseScope46;
                        horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope3, constraintLayoutBaseScope6Arr3, 0.0f, 2, null);
                        Modifier.Companion companion72 = Modifier.INSTANCE;
                        composer4.startReplaceGroup(5004770);
                        zChanged2 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                        objRememberedValue11 = composer4.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue11 = new OptionHistoricalChartKt$OptionHistoricalChart$1$7$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                            composer4.updateRememberedValue(objRememberedValue11);
                        }
                        composer4.endReplaceGroup();
                        SduiCursorData2.SduiLabelTrack(constraintLayoutScope3.constrainAs(companion72, constraintLayoutBaseScope47, (Function1) objRememberedValue11), OptionHistoricalChartKt.OptionHistoricalChart$lambda$1(snapshotState4), composer4, r13, r13);
                        chart3 = chart2;
                        if (chart3 != null) {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        chart4 = chart2;
                        if (chart4 != null) {
                            listEmptyList2 = CollectionsKt.emptyList();
                        }
                        optionHistoricalChartData2 = optionHistoricalChartData;
                        if (optionHistoricalChartData2 != null) {
                            listEmptyList3 = CollectionsKt.emptyList();
                        }
                        i10 = OptionHistoricalChartKt.WhenMappings.$EnumSwitchMapping$0[chartType2.ordinal()];
                        i11 = i8;
                        if (i10 != i11) {
                        }
                        i162 = 3;
                        ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr2222 = new ConstraintLayoutBaseScope6[i162];
                        constraintLayoutBaseScope6Arr2222[i13] = constraintLayoutBaseScope45;
                        constraintLayoutBaseScope6Arr2222[i12] = constraintLayoutBaseScope44;
                        constraintLayoutBaseScope6Arr2222[i15] = constraintLayoutBaseScope4;
                        ConstraintLayoutScope constraintLayoutScope4222 = constraintLayoutScope2;
                        horizontalAnchorM8136createBottomBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope4222, constraintLayoutBaseScope6Arr2222, 0.0f, i15, null);
                        composer4.startReplaceGroup(1849434622);
                        objRememberedValue12 = composer4.rememberedValue();
                        companion3 = Composer.INSTANCE;
                        if (objRememberedValue12 == companion3.getEmpty()) {
                        }
                        snapshotState5 = (SnapshotState) objRememberedValue12;
                        composer4.endReplaceGroup();
                        composer4.startReplaceGroup(-2076690612);
                        if (OptionHistoricalChartKt.OptionHistoricalChart$lambda$31$lambda$25(snapshotState5)) {
                        }
                        composer4.endReplaceGroup();
                        if (state.isOptionsExtendedHoursEnabled()) {
                        }
                        Modifier modifierFillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        composer4.startReplaceGroup(5004770);
                        zChanged3 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                        objRememberedValue13 = composer4.rememberedValue();
                        if (!zChanged3) {
                        }
                        composer4.endReplaceGroup();
                        DisplaySpanDynamicSelector.DisplaySpanDynamicSelector(immutableList2, displaySpan, constraintLayoutScope4222.constrainAs(modifierFillMaxWidth$default222, constraintLayoutBaseScope42, (Function1) objRememberedValue13), null, onSpanChanged, spanSelectorTrailingButton, false, null, composer3, SpanSelectorTrailingButton.$stable << 15, 200);
                        composer3.endReplaceGroup();
                        if (constraintLayoutScope.getHelpersHashCode() != i14) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }, composer2, 54), measurePolicy, composer2, 48, 0);
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            final ImmutableList<? extends DisplaySpan> immutableList3 = immutableList2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionHistoricalChartKt.OptionHistoricalChart$lambda$32(state, immutableList3, actionHandler, onSpanChanged, onCandlestickSwitchClicked, onUnderlyingInfoClicked, onLateCloseInfoClicked, onShowAllHoursToggled, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        immutableList2 = immutableList;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((4793491 & i3) == 4793490) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState42 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            OptionHistoricalChartModel historicalChart2 = state.getHistoricalChart();
            if (historicalChart2 == null) {
            }
            if (chartData == null) {
            }
            activeDisplaySpan = state.getActiveDisplaySpan();
            if (activeDisplaySpan == null) {
            }
            if (chartData != null) {
                Modifier.Companion companion22 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1003410150);
                composerStartRestartGroup.startReplaceGroup(212064437);
                composerStartRestartGroup.endReplaceGroup();
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                final OptionHistoricalChartData optionHistoricalChartData2 = chartData;
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                measurer2 = (Measurer2) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue5;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                }
                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue7;
                boolean zChangedInstance22 = composerStartRestartGroup.changedInstance(measurer2);
                i4 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                zChanged = zChangedInstance22 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue8 = new MeasurePolicy() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartKt$OptionHistoricalChart$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                            final Map linkedHashMap = new LinkedHashMap();
                            snapshotState2.getValue();
                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i4);
                            snapshotState.getValue();
                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartKt$OptionHistoricalChart$$inlined$ConstraintLayout$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                    measurer22.performLayout(placementScope, list, linkedHashMap);
                                }
                            }, 4, null);
                        }
                    };
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState3 = snapshotState;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue8;
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == companion.getEmpty()) {
                    }
                    final Function0 function02 = (Function0) objRememberedValue9;
                    zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue10 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartKt$OptionHistoricalChart$$inlined$ConstraintLayout$4
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        final DisplaySpan displaySpan2 = activeDisplaySpan;
                        final Chart chart22 = chart;
                        final ChartType chartType22 = chartType;
                        composer2 = composerStartRestartGroup;
                        LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(companion22, false, (Function1) objRememberedValue10, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartKt$OptionHistoricalChart$$inlined$ConstraintLayout$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:101:0x041b  */
                            /* JADX WARN: Removed duplicated region for block: B:107:0x042a  */
                            /* JADX WARN: Removed duplicated region for block: B:113:0x0439  */
                            /* JADX WARN: Removed duplicated region for block: B:116:0x044b  */
                            /* JADX WARN: Removed duplicated region for block: B:145:0x051e  */
                            /* JADX WARN: Removed duplicated region for block: B:148:0x0536  */
                            /* JADX WARN: Removed duplicated region for block: B:151:0x0555  */
                            /* JADX WARN: Removed duplicated region for block: B:154:0x0593  */
                            /* JADX WARN: Removed duplicated region for block: B:171:0x0688  */
                            /* JADX WARN: Removed duplicated region for block: B:174:0x06a5  */
                            /* JADX WARN: Removed duplicated region for block: B:178:0x06bb  */
                            /* JADX WARN: Removed duplicated region for block: B:182:0x06fc  */
                            /* JADX WARN: Removed duplicated region for block: B:186:0x073c  */
                            /* JADX WARN: Removed duplicated region for block: B:198:0x07b4  */
                            /* JADX WARN: Removed duplicated region for block: B:200:0x07ba  */
                            /* JADX WARN: Removed duplicated region for block: B:203:0x07ef  */
                            /* JADX WARN: Removed duplicated region for block: B:206:0x07fb  */
                            /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:95:0x03f6  */
                            /* JADX WARN: Type inference failed for: r13v21, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r13v29 */
                            /* JADX WARN: Type inference failed for: r13v5 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke(Composer composer3, int i6) {
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
                                int i7;
                                CursorData cursorDataCopy$default;
                                int i8;
                                AnnotatedString underlyingValueInfo;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope44;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope45;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope46;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope47;
                                ?? r13;
                                List<ChartLegendItem> legendList;
                                boolean z;
                                int i9;
                                boolean z2;
                                Map<String, List<ChartLegendItem>> legend_data;
                                ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default;
                                boolean zChanged2;
                                Object objRememberedValue11;
                                Chart chart3;
                                List<Line> listEmptyList;
                                Chart chart4;
                                List<ChartFill> listEmptyList2;
                                OptionHistoricalChartData optionHistoricalChartData22;
                                List<UIComponent<GenericAction>> listEmptyList3;
                                int i10;
                                int i11;
                                int i12;
                                int i13;
                                ConstraintLayoutScope constraintLayoutScope22;
                                int i14;
                                int i15;
                                ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default2;
                                Object objRememberedValue12;
                                Composer.Companion companion3;
                                SnapshotState snapshotState5;
                                SpanSelectorTrailingButton spanSelectorTrailingButton;
                                boolean zChanged3;
                                Object objRememberedValue13;
                                Object objRememberedValue14;
                                Set setEmptySet;
                                Object objRememberedValue15;
                                Composer.Companion companion4;
                                Object objRememberedValue16;
                                Map<String, List<ChartLegendItem>> legend_data2;
                                Set<String> setKeySet;
                                Composer composer4 = composer3;
                                if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                snapshotState2.setValue(Unit.INSTANCE);
                                int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                constraintLayoutScope2.reset();
                                ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope2;
                                composer4.startReplaceGroup(40408563);
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
                                ChartType chartType3 = chartType22;
                                if (chartType3 == ChartType.EMPTY) {
                                    composer4.startReplaceGroup(-2076906157);
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                    composer4.startReplaceGroup(1849434622);
                                    Object objRememberedValue17 = composer4.rememberedValue();
                                    if (objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue17 = OptionHistoricalChartKt$OptionHistoricalChart$1$1$1.INSTANCE;
                                        composer4.updateRememberedValue(objRememberedValue17);
                                    }
                                    composer4.endReplaceGroup();
                                    OptionHistoricalChartHeader.OptionHistoricalChartHeaderPlaceholder(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(constraintLayoutScope3.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue17), 0.0f, 1, null), composer4, 0);
                                    composer4.endReplaceGroup();
                                    constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component8;
                                    constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component7;
                                    i8 = 1;
                                    constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component1;
                                    constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component3;
                                    constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component5;
                                    constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component6;
                                    i7 = helpersHashCode;
                                    z2 = false;
                                } else if (chartType3 != ChartType.CANDLESTICK || OptionHistoricalChartKt.OptionHistoricalChart$lambda$1(snapshotState42) == null) {
                                    constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component8;
                                    constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component7;
                                    constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component1;
                                    i7 = helpersHashCode;
                                    composer4.startReplaceGroup(42276870);
                                    Point pointOptionHistoricalChart$lambda$1 = OptionHistoricalChartKt.OptionHistoricalChart$lambda$1(snapshotState42);
                                    com.robinhood.models.serverdriven.experimental.api.CursorData cursor_data = pointOptionHistoricalChart$lambda$1 != null ? pointOptionHistoricalChart$lambda$1.getCursor_data() : null;
                                    composer4.startReplaceGroup(-2076846541);
                                    CursorData composableModel = cursor_data == null ? null : SduiCursorData2.toComposableModel(cursor_data, composer4, 0);
                                    composer4.endReplaceGroup();
                                    composer4.startReplaceGroup(-2076847329);
                                    if (composableModel == null) {
                                        OptionHistoricalChartData optionHistoricalChartData3 = optionHistoricalChartData2;
                                        com.robinhood.models.serverdriven.experimental.api.CursorData defaultDisplay = optionHistoricalChartData3 != null ? optionHistoricalChartData3.getDefaultDisplay() : null;
                                        composableModel = defaultDisplay == null ? null : SduiCursorData2.toComposableModel(defaultDisplay, composer4, 0);
                                    }
                                    CursorData cursorData = composableModel;
                                    composer4.endReplaceGroup();
                                    composer4.startReplaceGroup(-2076839556);
                                    if (cursorData == null) {
                                        cursorDataCopy$default = null;
                                    } else {
                                        CursorData.DisplayText primaryValue = cursorData.getPrimaryValue();
                                        cursorDataCopy$default = CursorData.copy$default(cursorData, null, primaryValue == null ? null : CursorData.DisplayText.m11995copybw27NRU$default(primaryValue, null, 0L, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getDisplayCapsuleMedium(), 3, null), null, null, null, null, 61, null);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    composer4.startReplaceGroup(1849434622);
                                    Object objRememberedValue18 = composer4.rememberedValue();
                                    Composer.Companion companion6 = Composer.INSTANCE;
                                    if (objRememberedValue18 == companion6.getEmpty()) {
                                        objRememberedValue18 = OptionHistoricalChartKt$OptionHistoricalChart$1$3$1.INSTANCE;
                                        composer4.updateRememberedValue(objRememberedValue18);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(constraintLayoutScope3.constrainAs(companion5, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue18), 0.0f, 1, null);
                                    composer4.startReplaceGroup(5004770);
                                    Object objRememberedValue19 = composer4.rememberedValue();
                                    if (objRememberedValue19 == companion6.getEmpty()) {
                                        objRememberedValue19 = new OptionHistoricalChartKt$OptionHistoricalChart$1$4$1(snapshotIntState22);
                                        composer4.updateRememberedValue(objRememberedValue19);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, (Function1) objRememberedValue19);
                                    if (state.getShowCurrencySymbol()) {
                                        composer4.startReplaceGroup(43199957);
                                        i8 = 1;
                                        underlyingValueInfo = OptionHistoricalChartHelper.getUnderlyingPriceInfo(displaySpan2, state.getUnderlyingHistorical(), state.getUnderlyingQuote(), state.getUnderlyingSymbol(), composer4, 0);
                                        composer4.endReplaceGroup();
                                    } else {
                                        i8 = 1;
                                        composer4.startReplaceGroup(43567741);
                                        underlyingValueInfo = OptionHistoricalChartHelper.getUnderlyingValueInfo(displaySpan2, state.getIndexCloseValue(), state.getIndexHistoricals(), state.getIndexValue(), composer4, 0);
                                        composer4.endReplaceGroup();
                                    }
                                    AnnotatedString annotatedString = underlyingValueInfo;
                                    composer4.startReplaceGroup(-1633490746);
                                    boolean zChanged4 = composer4.changed(onUnderlyingInfoClicked) | composer4.changedInstance(state);
                                    Object objRememberedValue20 = composer4.rememberedValue();
                                    if (zChanged4 || objRememberedValue20 == companion6.getEmpty()) {
                                        objRememberedValue20 = new OptionHistoricalChartKt$OptionHistoricalChart$1$5$1(onUnderlyingInfoClicked, state);
                                        composer4.updateRememberedValue(objRememberedValue20);
                                    }
                                    Function0 function022 = (Function0) objRememberedValue20;
                                    composer4.endReplaceGroup();
                                    composer4.startReplaceGroup(-1633490746);
                                    boolean zChanged5 = composer4.changed(onLateCloseInfoClicked) | composer4.changedInstance(state);
                                    Object objRememberedValue21 = composer4.rememberedValue();
                                    if (zChanged5 || objRememberedValue21 == companion6.getEmpty()) {
                                        objRememberedValue21 = new OptionHistoricalChartKt$OptionHistoricalChart$1$6$1(onLateCloseInfoClicked, state);
                                        composer4.updateRememberedValue(objRememberedValue21);
                                    }
                                    composer4.endReplaceGroup();
                                    constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component5;
                                    constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component6;
                                    constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component3;
                                    constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component4;
                                    r13 = 0;
                                    OptionHistoricalChartHeader.OptionHistoricalChartHeader(modifierOnGloballyPositioned, annotatedString, function022, (Function0) objRememberedValue21, state.getDisplayName(), state.isLateCloseOptionChain(), cursorDataCopy$default, state.getTertiaryValueTooltip(), state.getDisplayCurrencyCode(), state.getShowDisplayCurrencyLabel(), composer4, (CursorData.$stable << 18) | (CursorRowModifiers.TertiaryValueTooltip.$stable << 21));
                                    composer4 = composer4;
                                    composer4.endReplaceGroup();
                                    int i162 = 3;
                                    ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr3 = new ConstraintLayoutBaseScope6[3];
                                    constraintLayoutBaseScope6Arr3[r13] = constraintLayoutBaseScope43;
                                    constraintLayoutBaseScope6Arr3[i8] = constraintLayoutBaseScope4Component2;
                                    constraintLayoutBaseScope6Arr3[2] = constraintLayoutBaseScope46;
                                    horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope3, constraintLayoutBaseScope6Arr3, 0.0f, 2, null);
                                    Modifier.Companion companion72 = Modifier.INSTANCE;
                                    composer4.startReplaceGroup(5004770);
                                    zChanged2 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                                    objRememberedValue11 = composer4.rememberedValue();
                                    if (!zChanged2 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue11 = new OptionHistoricalChartKt$OptionHistoricalChart$1$7$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                                        composer4.updateRememberedValue(objRememberedValue11);
                                    }
                                    composer4.endReplaceGroup();
                                    SduiCursorData2.SduiLabelTrack(constraintLayoutScope3.constrainAs(companion72, constraintLayoutBaseScope47, (Function1) objRememberedValue11), OptionHistoricalChartKt.OptionHistoricalChart$lambda$1(snapshotState42), composer4, r13, r13);
                                    chart3 = chart22;
                                    if (chart3 != null || (listEmptyList = chart3.getLines()) == null) {
                                        listEmptyList = CollectionsKt.emptyList();
                                    }
                                    chart4 = chart22;
                                    if (chart4 != null || (listEmptyList2 = chart4.getFills()) == null) {
                                        listEmptyList2 = CollectionsKt.emptyList();
                                    }
                                    optionHistoricalChartData22 = optionHistoricalChartData2;
                                    if (optionHistoricalChartData22 != null || (listEmptyList3 = optionHistoricalChartData22.getOverlays()) == null) {
                                        listEmptyList3 = CollectionsKt.emptyList();
                                    }
                                    i10 = OptionHistoricalChartKt.WhenMappings.$EnumSwitchMapping$0[chartType22.ordinal()];
                                    i11 = i8;
                                    if (i10 != i11) {
                                        i12 = i11;
                                        List<Line> list = listEmptyList;
                                        composer4.startReplaceGroup(45087423);
                                        Modifier modifier = OptionHistoricalChartKt.chartModifier;
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChanged6 = composer4.changed(constraintLayoutBaseScope47);
                                        Object objRememberedValue22 = composer4.rememberedValue();
                                        if (zChanged6 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue22 = new OptionHistoricalChartKt$OptionHistoricalChart$1$8$1(constraintLayoutBaseScope47);
                                            composer4.updateRememberedValue(objRememberedValue22);
                                        }
                                        composer4.endReplaceGroup();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope48 = constraintLayoutBaseScope45;
                                        Modifier modifierConstrainAs = constraintLayoutScope3.constrainAs(modifier, constraintLayoutBaseScope48, (Function1) objRememberedValue22);
                                        composer4.startReplaceGroup(5004770);
                                        Object objRememberedValue23 = composer4.rememberedValue();
                                        Composer.Companion companion8 = Composer.INSTANCE;
                                        if (objRememberedValue23 == companion8.getEmpty()) {
                                            objRememberedValue23 = new OptionHistoricalChartKt$OptionHistoricalChart$1$9$1(snapshotState42);
                                            composer4.updateRememberedValue(objRememberedValue23);
                                        }
                                        Function1 function1 = (Function1) objRememberedValue23;
                                        composer4.endReplaceGroup();
                                        composer4.startReplaceGroup(5004770);
                                        Object objRememberedValue24 = composer4.rememberedValue();
                                        if (objRememberedValue24 == companion8.getEmpty()) {
                                            objRememberedValue24 = new OptionHistoricalChartKt$OptionHistoricalChart$1$10$1(snapshotState42);
                                            composer4.updateRememberedValue(objRememberedValue24);
                                        }
                                        Function0 function03 = (Function0) objRememberedValue24;
                                        composer4.endReplaceGroup();
                                        composer4.startReplaceGroup(977840936);
                                        constraintLayoutBaseScope45 = constraintLayoutBaseScope48;
                                        List listEmptyList4 = CollectionsKt.emptyList();
                                        composer4.startReplaceGroup(1849434622);
                                        Object objRememberedValue25 = composer4.rememberedValue();
                                        if (objRememberedValue25 == companion8.getEmpty()) {
                                            objRememberedValue25 = C23808xa3965ebd.INSTANCE;
                                            composer4.updateRememberedValue(objRememberedValue25);
                                        }
                                        composer4.endReplaceGroup();
                                        i13 = r13;
                                        constraintLayoutScope22 = constraintLayoutScope3;
                                        i14 = i7;
                                        i15 = 2;
                                        SduiChartMappersKt.SduiSegmentedLineChart(modifierConstrainAs, listEmptyList4, list, listEmptyList3, actionHandler, (Function1) objRememberedValue25, function1, function03, false, true, null, 0.0f, GenericAction.class, composer3, 14155776, 0, 0);
                                        composer4 = composer3;
                                        composer4.endReplaceGroup();
                                        composer4.endReplaceGroup();
                                    } else {
                                        if (i10 != 2) {
                                            if (i10 != 3) {
                                                composer4.startReplaceGroup(-2076755917);
                                                composer4.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer4.startReplaceGroup(46607539);
                                            Modifier modifier2 = OptionHistoricalChartKt.chartModifier;
                                            composer4.startReplaceGroup(5004770);
                                            boolean zChanged7 = composer4.changed(constraintLayoutBaseScope47);
                                            Object objRememberedValue26 = composer4.rememberedValue();
                                            if (zChanged7 || objRememberedValue26 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue26 = new OptionHistoricalChartKt$OptionHistoricalChart$1$15$1(constraintLayoutBaseScope47);
                                                composer4.updateRememberedValue(objRememberedValue26);
                                            }
                                            composer4.endReplaceGroup();
                                            Placeholders2.ChartPlaceholder(constraintLayoutScope3.constrainAs(modifier2, constraintLayoutBaseScope4, (Function1) objRememberedValue26), r13, composer4, r13, 2);
                                            composer4.endReplaceGroup();
                                            i14 = i7;
                                            i15 = 2;
                                            i12 = i11;
                                            i13 = r13;
                                            constraintLayoutScope22 = constraintLayoutScope3;
                                            ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr2222 = new ConstraintLayoutBaseScope6[i162];
                                            constraintLayoutBaseScope6Arr2222[i13] = constraintLayoutBaseScope45;
                                            constraintLayoutBaseScope6Arr2222[i12] = constraintLayoutBaseScope44;
                                            constraintLayoutBaseScope6Arr2222[i15] = constraintLayoutBaseScope4;
                                            ConstraintLayoutScope constraintLayoutScope4222 = constraintLayoutScope22;
                                            horizontalAnchorM8136createBottomBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope4222, constraintLayoutBaseScope6Arr2222, 0.0f, i15, null);
                                            composer4.startReplaceGroup(1849434622);
                                            objRememberedValue12 = composer4.rememberedValue();
                                            companion3 = Composer.INSTANCE;
                                            if (objRememberedValue12 == companion3.getEmpty()) {
                                                objRememberedValue12 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i15, null);
                                                composer4.updateRememberedValue(objRememberedValue12);
                                            }
                                            snapshotState5 = (SnapshotState) objRememberedValue12;
                                            composer4.endReplaceGroup();
                                            composer4.startReplaceGroup(-2076690612);
                                            if (OptionHistoricalChartKt.OptionHistoricalChart$lambda$31$lambda$25(snapshotState5) && chartType22 != ChartType.EMPTY) {
                                                composer4.startReplaceGroup(5004770);
                                                objRememberedValue14 = composer4.rememberedValue();
                                                if (objRememberedValue14 == companion3.getEmpty()) {
                                                    objRememberedValue14 = new OptionHistoricalChartKt$OptionHistoricalChart$1$16$1(snapshotState5);
                                                    composer4.updateRememberedValue(objRememberedValue14);
                                                }
                                                composer4.endReplaceGroup();
                                                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue14, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1969465492, i12, new OptionHistoricalChartKt$OptionHistoricalChart$1$17(chartType22, state, onCandlestickSwitchClicked, onShowAllHoursToggled), composer4, 54), composer3, 1572870, 62);
                                                composer4 = composer3;
                                            }
                                            composer4.endReplaceGroup();
                                            if (state.isOptionsExtendedHoursEnabled()) {
                                                composer4.startReplaceGroup(48418745);
                                                Either.Left leftAsLeft = Either2.asLeft(chartType22 == ChartType.LINE ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.CHART_CANDLESTICKS_16) : new BentoIcon4.Size16(ServerToBentoAssetMapper2.CHART_LINE_16));
                                                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.chart_options_display_toggle, composer4, 0);
                                                composer4.startReplaceGroup(-1633490746);
                                                boolean zChanged8 = composer4.changed(onCandlestickSwitchClicked) | composer4.changedInstance(optionHistoricalChartData2);
                                                Object objRememberedValue27 = composer4.rememberedValue();
                                                if (zChanged8 || objRememberedValue27 == companion3.getEmpty()) {
                                                    objRememberedValue27 = new C23810x2c9af07d(onCandlestickSwitchClicked, optionHistoricalChartData2);
                                                    composer4.updateRememberedValue(objRememberedValue27);
                                                }
                                                composer4.endReplaceGroup();
                                                SpanSelectorTrailingButton spanSelectorTrailingButton2 = new SpanSelectorTrailingButton(leftAsLeft, strStringResource, (Function0) objRememberedValue27);
                                                composer4.endReplaceGroup();
                                                spanSelectorTrailingButton = spanSelectorTrailingButton2;
                                            } else {
                                                composer4.startReplaceGroup(48114077);
                                                Either.Left leftAsLeft2 = Either2.asLeft(new BentoIcon4.Size16(ServerToBentoAssetMapper2.SETTINGS_16));
                                                String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.chart_options_display_toggle, composer4, i13);
                                                composer4.startReplaceGroup(5004770);
                                                Object objRememberedValue28 = composer4.rememberedValue();
                                                if (objRememberedValue28 == companion3.getEmpty()) {
                                                    objRememberedValue28 = new C23809x2c9aecbc(snapshotState5);
                                                    composer4.updateRememberedValue(objRememberedValue28);
                                                }
                                                composer4.endReplaceGroup();
                                                SpanSelectorTrailingButton spanSelectorTrailingButton3 = new SpanSelectorTrailingButton(leftAsLeft2, strStringResource2, (Function0) objRememberedValue28);
                                                composer4.endReplaceGroup();
                                                spanSelectorTrailingButton = spanSelectorTrailingButton3;
                                            }
                                            Modifier modifierFillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            composer4.startReplaceGroup(5004770);
                                            zChanged3 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                                            objRememberedValue13 = composer4.rememberedValue();
                                            if (!zChanged3 || objRememberedValue13 == companion3.getEmpty()) {
                                                objRememberedValue13 = new OptionHistoricalChartKt$OptionHistoricalChart$1$18$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                                                composer4.updateRememberedValue(objRememberedValue13);
                                            }
                                            composer4.endReplaceGroup();
                                            DisplaySpanDynamicSelector.DisplaySpanDynamicSelector(immutableList2, displaySpan2, constraintLayoutScope4222.constrainAs(modifierFillMaxWidth$default222, constraintLayoutBaseScope42, (Function1) objRememberedValue13), null, onSpanChanged, spanSelectorTrailingButton, false, null, composer3, SpanSelectorTrailingButton.$stable << 15, 200);
                                            composer3.endReplaceGroup();
                                            if (constraintLayoutScope2.getHelpersHashCode() != i14) {
                                                EffectsKt.SideEffect(function02, composer3, 6);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                return;
                                            }
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope49 = constraintLayoutBaseScope4;
                                        composer4.startReplaceGroup(45829284);
                                        Modifier modifier3 = OptionHistoricalChartKt.chartModifier;
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChanged9 = composer4.changed(constraintLayoutBaseScope47);
                                        Object objRememberedValue29 = composer4.rememberedValue();
                                        if (zChanged9 || objRememberedValue29 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue29 = new OptionHistoricalChartKt$OptionHistoricalChart$1$11$1(constraintLayoutBaseScope47);
                                            composer4.updateRememberedValue(objRememberedValue29);
                                        }
                                        composer4.endReplaceGroup();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope410 = constraintLayoutBaseScope44;
                                        Modifier modifierConstrainAs2 = constraintLayoutScope3.constrainAs(modifier3, constraintLayoutBaseScope410, (Function1) objRememberedValue29);
                                        Chart chart5 = chart22;
                                        if (chart5 == null || (legend_data2 = chart5.getLegend_data()) == null || (setKeySet = legend_data2.keySet()) == null) {
                                            setEmptySet = SetsKt.emptySet();
                                            SduiActionHandler sduiActionHandler2 = actionHandler;
                                            composer4.startReplaceGroup(5004770);
                                            objRememberedValue15 = composer4.rememberedValue();
                                            companion4 = Composer.INSTANCE;
                                            if (objRememberedValue15 == companion4.getEmpty()) {
                                                objRememberedValue15 = new OptionHistoricalChartKt$OptionHistoricalChart$1$13$1(snapshotState42);
                                                composer4.updateRememberedValue(objRememberedValue15);
                                            }
                                            Function1 function122 = (Function1) objRememberedValue15;
                                            composer4.endReplaceGroup();
                                            composer4.startReplaceGroup(5004770);
                                            objRememberedValue16 = composer4.rememberedValue();
                                            if (objRememberedValue16 == companion4.getEmpty()) {
                                                objRememberedValue16 = new OptionHistoricalChartKt$OptionHistoricalChart$1$14$1(snapshotState42);
                                                composer4.updateRememberedValue(objRememberedValue16);
                                            }
                                            composer4.endReplaceGroup();
                                            constraintLayoutBaseScope4 = constraintLayoutBaseScope49;
                                            i12 = i11;
                                            SduiChartMappersKt.SduiCandlestickChart(modifierConstrainAs2, listEmptyList2, listEmptyList, setEmptySet, sduiActionHandler2, false, function122, (Function0) objRememberedValue16, false, composer3, 14155776, 288);
                                            composer4 = composer3;
                                            composer4.endReplaceGroup();
                                            Unit unit2 = Unit.INSTANCE;
                                            i14 = i7;
                                            i13 = r13;
                                            constraintLayoutBaseScope44 = constraintLayoutBaseScope410;
                                            constraintLayoutScope22 = constraintLayoutScope3;
                                            i15 = 2;
                                        } else {
                                            Set<String> set = setKeySet;
                                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                                            Iterator<T> it = set.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(Float.valueOf(Float.parseFloat((String) it.next())));
                                            }
                                            setEmptySet = CollectionsKt.toSet(arrayList);
                                            if (setEmptySet == null) {
                                            }
                                            SduiActionHandler sduiActionHandler22 = actionHandler;
                                            composer4.startReplaceGroup(5004770);
                                            objRememberedValue15 = composer4.rememberedValue();
                                            companion4 = Composer.INSTANCE;
                                            if (objRememberedValue15 == companion4.getEmpty()) {
                                            }
                                            Function1 function1222 = (Function1) objRememberedValue15;
                                            composer4.endReplaceGroup();
                                            composer4.startReplaceGroup(5004770);
                                            objRememberedValue16 = composer4.rememberedValue();
                                            if (objRememberedValue16 == companion4.getEmpty()) {
                                            }
                                            composer4.endReplaceGroup();
                                            constraintLayoutBaseScope4 = constraintLayoutBaseScope49;
                                            i12 = i11;
                                            SduiChartMappersKt.SduiCandlestickChart(modifierConstrainAs2, listEmptyList2, listEmptyList, setEmptySet, sduiActionHandler22, false, function1222, (Function0) objRememberedValue16, false, composer3, 14155776, 288);
                                            composer4 = composer3;
                                            composer4.endReplaceGroup();
                                            Unit unit22 = Unit.INSTANCE;
                                            i14 = i7;
                                            i13 = r13;
                                            constraintLayoutBaseScope44 = constraintLayoutBaseScope410;
                                            constraintLayoutScope22 = constraintLayoutScope3;
                                            i15 = 2;
                                        }
                                        ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr22222 = new ConstraintLayoutBaseScope6[i162];
                                        constraintLayoutBaseScope6Arr22222[i13] = constraintLayoutBaseScope45;
                                        constraintLayoutBaseScope6Arr22222[i12] = constraintLayoutBaseScope44;
                                        constraintLayoutBaseScope6Arr22222[i15] = constraintLayoutBaseScope4;
                                        ConstraintLayoutScope constraintLayoutScope42222 = constraintLayoutScope22;
                                        horizontalAnchorM8136createBottomBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope42222, constraintLayoutBaseScope6Arr22222, 0.0f, i15, null);
                                        composer4.startReplaceGroup(1849434622);
                                        objRememberedValue12 = composer4.rememberedValue();
                                        companion3 = Composer.INSTANCE;
                                        if (objRememberedValue12 == companion3.getEmpty()) {
                                        }
                                        snapshotState5 = (SnapshotState) objRememberedValue12;
                                        composer4.endReplaceGroup();
                                        composer4.startReplaceGroup(-2076690612);
                                        if (OptionHistoricalChartKt.OptionHistoricalChart$lambda$31$lambda$25(snapshotState5)) {
                                            composer4.startReplaceGroup(5004770);
                                            objRememberedValue14 = composer4.rememberedValue();
                                            if (objRememberedValue14 == companion3.getEmpty()) {
                                            }
                                            composer4.endReplaceGroup();
                                            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue14, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1969465492, i12, new OptionHistoricalChartKt$OptionHistoricalChart$1$17(chartType22, state, onCandlestickSwitchClicked, onShowAllHoursToggled), composer4, 54), composer3, 1572870, 62);
                                            composer4 = composer3;
                                        }
                                        composer4.endReplaceGroup();
                                        if (state.isOptionsExtendedHoursEnabled()) {
                                        }
                                        Modifier modifierFillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        composer4.startReplaceGroup(5004770);
                                        zChanged3 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                                        objRememberedValue13 = composer4.rememberedValue();
                                        if (!zChanged3) {
                                            objRememberedValue13 = new OptionHistoricalChartKt$OptionHistoricalChart$1$18$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                                            composer4.updateRememberedValue(objRememberedValue13);
                                        }
                                        composer4.endReplaceGroup();
                                        DisplaySpanDynamicSelector.DisplaySpanDynamicSelector(immutableList2, displaySpan2, constraintLayoutScope42222.constrainAs(modifierFillMaxWidth$default2222, constraintLayoutBaseScope42, (Function1) objRememberedValue13), null, onSpanChanged, spanSelectorTrailingButton, false, null, composer3, SpanSelectorTrailingButton.$stable << 15, 200);
                                        composer3.endReplaceGroup();
                                        if (constraintLayoutScope2.getHelpersHashCode() != i14) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                    }
                                    i162 = 3;
                                    ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr222222 = new ConstraintLayoutBaseScope6[i162];
                                    constraintLayoutBaseScope6Arr222222[i13] = constraintLayoutBaseScope45;
                                    constraintLayoutBaseScope6Arr222222[i12] = constraintLayoutBaseScope44;
                                    constraintLayoutBaseScope6Arr222222[i15] = constraintLayoutBaseScope4;
                                    ConstraintLayoutScope constraintLayoutScope422222 = constraintLayoutScope22;
                                    horizontalAnchorM8136createBottomBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope422222, constraintLayoutBaseScope6Arr222222, 0.0f, i15, null);
                                    composer4.startReplaceGroup(1849434622);
                                    objRememberedValue12 = composer4.rememberedValue();
                                    companion3 = Composer.INSTANCE;
                                    if (objRememberedValue12 == companion3.getEmpty()) {
                                    }
                                    snapshotState5 = (SnapshotState) objRememberedValue12;
                                    composer4.endReplaceGroup();
                                    composer4.startReplaceGroup(-2076690612);
                                    if (OptionHistoricalChartKt.OptionHistoricalChart$lambda$31$lambda$25(snapshotState5)) {
                                    }
                                    composer4.endReplaceGroup();
                                    if (state.isOptionsExtendedHoursEnabled()) {
                                    }
                                    Modifier modifierFillMaxWidth$default22222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    composer4.startReplaceGroup(5004770);
                                    zChanged3 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                                    objRememberedValue13 = composer4.rememberedValue();
                                    if (!zChanged3) {
                                    }
                                    composer4.endReplaceGroup();
                                    DisplaySpanDynamicSelector.DisplaySpanDynamicSelector(immutableList2, displaySpan2, constraintLayoutScope422222.constrainAs(modifierFillMaxWidth$default22222, constraintLayoutBaseScope42, (Function1) objRememberedValue13), null, onSpanChanged, spanSelectorTrailingButton, false, null, composer3, SpanSelectorTrailingButton.$stable << 15, 200);
                                    composer3.endReplaceGroup();
                                    if (constraintLayoutScope2.getHelpersHashCode() != i14) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                } else {
                                    composer4.startReplaceGroup(40992044);
                                    Chart chart6 = chart22;
                                    if (chart6 == null || (legend_data = chart6.getLegend_data()) == null) {
                                        legendList = null;
                                    } else {
                                        Point pointOptionHistoricalChart$lambda$12 = OptionHistoricalChartKt.OptionHistoricalChart$lambda$1(snapshotState42);
                                        Intrinsics.checkNotNull(pointOptionHistoricalChart$lambda$12);
                                        legendList = UtilKt.getLegendList(legend_data, pointOptionHistoricalChart$lambda$12);
                                    }
                                    if (legendList == null) {
                                        constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component8;
                                        constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component7;
                                        constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component1;
                                        i7 = helpersHashCode;
                                        z = false;
                                        i9 = 1;
                                    } else {
                                        Modifier.Companion companion9 = Modifier.INSTANCE;
                                        composer4.startReplaceGroup(1849434622);
                                        Object objRememberedValue30 = composer4.rememberedValue();
                                        if (objRememberedValue30 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue30 = OptionHistoricalChartKt$OptionHistoricalChart$1$2$1$1.INSTANCE;
                                            composer4.updateRememberedValue(objRememberedValue30);
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(constraintLayoutScope3.constrainAs(companion9, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue30), 0.0f, ((Density) composer4.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(snapshotIntState22.getIntValue()), 1, null), 0.0f, 1, null);
                                        composer4.startReplaceGroup(-2076867497);
                                        List<ChartLegendItem> list2 = legendList;
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                                        for (ChartLegendItem chartLegendItem : list2) {
                                            ThemedColor color = chartLegendItem.getColor();
                                            composer4.startReplaceGroup(-2076863920);
                                            Color composeColor = color == null ? null : SduiColors2.toComposeColor(color, composer4, 0);
                                            composer4.endReplaceGroup();
                                            String title = chartLegendItem.getTitle();
                                            Color composeColor2 = SduiColors2.toComposeColor(chartLegendItem.getValue_color(), composer4, 0);
                                            Intrinsics.checkNotNull(composeColor2);
                                            arrayList2.add(new LegendItem(chartLegendItem.getId(), composeColor, title, chartLegendItem.getValue(), composeColor2.getValue(), null, 32, null));
                                        }
                                        composer4.endReplaceGroup();
                                        constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component1;
                                        z = false;
                                        i7 = helpersHashCode;
                                        constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component8;
                                        constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component7;
                                        i9 = 1;
                                        CandlestickLegendChart.CandlestickLegendChart(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextM(), arrayList2, 0, composer4, 0, 8);
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                    composer4.endReplaceGroup();
                                    z2 = z;
                                    constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component3;
                                    constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component5;
                                    constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component6;
                                    i8 = i9;
                                }
                                constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component4;
                                r13 = z2;
                                int i1622 = 3;
                                ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr32 = new ConstraintLayoutBaseScope6[3];
                                constraintLayoutBaseScope6Arr32[r13] = constraintLayoutBaseScope43;
                                constraintLayoutBaseScope6Arr32[i8] = constraintLayoutBaseScope4Component2;
                                constraintLayoutBaseScope6Arr32[2] = constraintLayoutBaseScope46;
                                horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope3, constraintLayoutBaseScope6Arr32, 0.0f, 2, null);
                                Modifier.Companion companion722 = Modifier.INSTANCE;
                                composer4.startReplaceGroup(5004770);
                                zChanged2 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                                objRememberedValue11 = composer4.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue11 = new OptionHistoricalChartKt$OptionHistoricalChart$1$7$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                                    composer4.updateRememberedValue(objRememberedValue11);
                                }
                                composer4.endReplaceGroup();
                                SduiCursorData2.SduiLabelTrack(constraintLayoutScope3.constrainAs(companion722, constraintLayoutBaseScope47, (Function1) objRememberedValue11), OptionHistoricalChartKt.OptionHistoricalChart$lambda$1(snapshotState42), composer4, r13, r13);
                                chart3 = chart22;
                                if (chart3 != null) {
                                    listEmptyList = CollectionsKt.emptyList();
                                }
                                chart4 = chart22;
                                if (chart4 != null) {
                                    listEmptyList2 = CollectionsKt.emptyList();
                                }
                                optionHistoricalChartData22 = optionHistoricalChartData2;
                                if (optionHistoricalChartData22 != null) {
                                    listEmptyList3 = CollectionsKt.emptyList();
                                }
                                i10 = OptionHistoricalChartKt.WhenMappings.$EnumSwitchMapping$0[chartType22.ordinal()];
                                i11 = i8;
                                if (i10 != i11) {
                                }
                                i1622 = 3;
                                ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr2222222 = new ConstraintLayoutBaseScope6[i1622];
                                constraintLayoutBaseScope6Arr2222222[i13] = constraintLayoutBaseScope45;
                                constraintLayoutBaseScope6Arr2222222[i12] = constraintLayoutBaseScope44;
                                constraintLayoutBaseScope6Arr2222222[i15] = constraintLayoutBaseScope4;
                                ConstraintLayoutScope constraintLayoutScope4222222 = constraintLayoutScope22;
                                horizontalAnchorM8136createBottomBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope4222222, constraintLayoutBaseScope6Arr2222222, 0.0f, i15, null);
                                composer4.startReplaceGroup(1849434622);
                                objRememberedValue12 = composer4.rememberedValue();
                                companion3 = Composer.INSTANCE;
                                if (objRememberedValue12 == companion3.getEmpty()) {
                                }
                                snapshotState5 = (SnapshotState) objRememberedValue12;
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(-2076690612);
                                if (OptionHistoricalChartKt.OptionHistoricalChart$lambda$31$lambda$25(snapshotState5)) {
                                }
                                composer4.endReplaceGroup();
                                if (state.isOptionsExtendedHoursEnabled()) {
                                }
                                Modifier modifierFillMaxWidth$default222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                composer4.startReplaceGroup(5004770);
                                zChanged3 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                                objRememberedValue13 = composer4.rememberedValue();
                                if (!zChanged3) {
                                }
                                composer4.endReplaceGroup();
                                DisplaySpanDynamicSelector.DisplaySpanDynamicSelector(immutableList2, displaySpan2, constraintLayoutScope4222222.constrainAs(modifierFillMaxWidth$default222222, constraintLayoutBaseScope42, (Function1) objRememberedValue13), null, onSpanChanged, spanSelectorTrailingButton, false, null, composer3, SpanSelectorTrailingButton.$stable << 15, 200);
                                composer3.endReplaceGroup();
                                if (constraintLayoutScope2.getHelpersHashCode() != i14) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }, composer2, 54), measurePolicy2, composer2, 48, 0);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
        }
        final ImmutableList immutableList32 = immutableList2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point OptionHistoricalChart$lambda$1(SnapshotState<Point> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OptionHistoricalChart$lambda$31$lambda$25(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionHistoricalChart$lambda$31$lambda$26(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }
}
