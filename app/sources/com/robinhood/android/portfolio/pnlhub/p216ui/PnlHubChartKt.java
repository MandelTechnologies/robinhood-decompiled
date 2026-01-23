package com.robinhood.android.portfolio.pnlhub.p216ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
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
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.ModifiersKt;
import com.robinhood.android.charts.candlestick.CandlestickLegendChart;
import com.robinhood.android.charts.candlestick.UtilKt;
import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.charts.model.LegendItem;
import com.robinhood.android.charts.model.LegendItemSuffix;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.models.p080db.PageWithChart;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossChart;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.serverdriven.experimental.api.IconDisplayText;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.Segment;
import com.robinhood.models.serverdriven.experimental.api.SubDisplayText;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PnlHubChart.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\u001a_\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0000¨\u0006\u0014²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002"}, m3636d2 = {"PnlHubChart", "", "chartData", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;", "showChartHeaderSecondaryTextTrailingIcon", "", "showDisplayCurrencyLabel", "onChartVisibilityChanged", "Lkotlin/Function1;", "onChartHeaderSecondaryTextTrailingIconClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "scrubbedPoint", "Lcom/robinhood/android/charts/model/Point;", "(Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/model/Point;Landroidx/compose/runtime/Composer;II)V", "getClosestHorizontalPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "targetPoint", "feature-profit-and-loss-hub_externalDebug", "selectedPoint", "graphHeaderHeight", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PnlHubChartKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubChart$lambda$30(ProfitAndLossChart profitAndLossChart, boolean z, boolean z2, Function1 function1, Function0 function0, Modifier modifier, Point point, int i, int i2, Composer composer, int i3) {
        PnlHubChart(profitAndLossChart, z, z2, function1, function0, modifier, point, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba A[PHI: r14
      0x00ba: PHI (r14v16 int) = (r14v0 int), (r14v6 int), (r14v7 int) binds: [B:66:0x00b8, B:76:0x00d2, B:75:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PnlHubChart(final ProfitAndLossChart profitAndLossChart, final boolean z, final boolean z2, final Function1<? super Boolean, Unit> onChartVisibilityChanged, final Function0<Unit> onChartHeaderSecondaryTextTrailingIconClick, Modifier modifier, Point point, Composer composer, final int i, final int i2) {
        int i3;
        final boolean z3;
        boolean z4;
        int i4;
        Modifier modifier2;
        int i5;
        PageWithChart chart;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        Line line;
        boolean zChanged;
        Object objRememberedValue3;
        boolean z5;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Composer.Companion companion2;
        final Measurer2 measurer2;
        Object objRememberedValue6;
        Object objRememberedValue7;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        final SnapshotState snapshotState2;
        Object objRememberedValue8;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue9;
        final SnapshotState snapshotState3;
        final int i6;
        boolean zChanged2;
        Object objRememberedValue10;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        final SnapshotState snapshotState4;
        Object objRememberedValue11;
        boolean zChangedInstance;
        Object objRememberedValue12;
        Composer composer2;
        final Modifier modifier3;
        final Point point2;
        List<Line> lines;
        Object next;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Point point3 = point;
        Intrinsics.checkNotNullParameter(onChartVisibilityChanged, "onChartVisibilityChanged");
        Intrinsics.checkNotNullParameter(onChartHeaderSecondaryTextTrailingIconClick, "onChartHeaderSecondaryTextTrailingIconClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1966164369);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(profitAndLossChart) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z4 = z2;
                i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onChartVisibilityChanged) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onChartHeaderSecondaryTextTrailingIconClick) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                int i7 = 1572864;
                if (i5 != 0) {
                    i3 |= i7;
                } else if ((1572864 & i) == 0) {
                    i7 = (2097152 & i) == 0 ? composerStartRestartGroup.changed(point3) : composerStartRestartGroup.changedInstance(point3) ? 1048576 : 524288;
                    i3 |= i7;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    point2 = point3;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i5 != 0) {
                        point3 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1966164369, i3, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubChart (PnlHubChart.kt:53)");
                    }
                    final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    boolean z6 = profitAndLossChart != null;
                    chart = profitAndLossChart == null ? profitAndLossChart.getChart() : null;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(point3, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    if (chart != null || (lines = chart.getLines()) == null) {
                        line = null;
                    } else {
                        Iterator<T> it = lines.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                if (((Line) next).is_primary()) {
                                    break;
                                }
                            }
                        }
                        line = (Line) next;
                    }
                    Point pointPnlHubChart$lambda$1 = PnlHubChart$lambda$1(snapshotState);
                    Point point4 = point3;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(line) | composerStartRestartGroup.changed(pointPnlHubChart$lambda$1);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        com.robinhood.models.serverdriven.experimental.api.Point closestHorizontalPoint = line == null ? getClosestHorizontalPoint(line, PnlHubChart$lambda$1(snapshotState)) : null;
                        composerStartRestartGroup.updateRememberedValue(closestHorizontalPoint);
                        objRememberedValue3 = closestHorizontalPoint;
                    }
                    final com.robinhood.models.serverdriven.experimental.api.Point point5 = (com.robinhood.models.serverdriven.experimental.api.Point) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z5 = (i3 & 7168) != 2048;
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!z5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubChartKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PnlHubChartKt.PnlHubChart$lambda$10$lambda$9(onChartVisibilityChanged, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceGroup(-1003410150);
                    composerStartRestartGroup.startReplaceGroup(212064437);
                    composerStartRestartGroup.endReplaceGroup();
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    companion2 = Composer.INSTANCE;
                    if (objRememberedValue5 == companion2.getEmpty()) {
                        objRememberedValue5 = new Measurer2(density);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    measurer2 = (Measurer2) objRememberedValue5;
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion2.getEmpty()) {
                        objRememberedValue6 = new ConstraintLayoutScope();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue6;
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 != companion2.getEmpty()) {
                        userInteractionEventDescriptor = userInteractionEventDescriptor2;
                        objRememberedValue7 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    } else {
                        userInteractionEventDescriptor = userInteractionEventDescriptor2;
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue7;
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion2.getEmpty()) {
                        objRememberedValue8 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue8;
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == companion2.getEmpty()) {
                        objRememberedValue9 = SnapshotStateKt.mutableStateOf(unit, SnapshotStateKt.neverEqualPolicy());
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    snapshotState3 = (SnapshotState) objRememberedValue9;
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                    i6 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                    zChanged2 = zChangedInstance2 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue10 == companion2.getEmpty()) {
                        objRememberedValue10 = new MeasurePolicy() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubChartKt$PnlHubChart$$inlined$ConstraintLayout$2
                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i8);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i8);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                return super.minIntrinsicHeight(intrinsicMeasureScope, list, i8);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                return super.minIntrinsicWidth(intrinsicMeasureScope, list, i8);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                snapshotState3.getValue();
                                long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i6);
                                snapshotState2.getValue();
                                int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                final Measurer2 measurer22 = measurer2;
                                return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubChartKt$PnlHubChart$$inlined$ConstraintLayout$2.1
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
                        snapshotState4 = snapshotState2;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                        snapshotState4 = snapshotState2;
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue10;
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue11 == companion2.getEmpty()) {
                        objRememberedValue11 = new Function0<Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubChartKt$PnlHubChart$$inlined$ConstraintLayout$3
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
                                snapshotState4.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                constraintSetForInlineDsl2.setKnownDirty(true);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    final Function0 function0 = (Function0) objRememberedValue11;
                    zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue12 == companion2.getEmpty()) {
                        objRememberedValue12 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubChartKt$PnlHubChart$$inlined$ConstraintLayout$4
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
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue12, 1, null);
                    Modifier modifier5 = modifier4;
                    final PageWithChart pageWithChart = chart;
                    final boolean z7 = z6;
                    final boolean z8 = z4;
                    final UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor;
                    composer2 = composerStartRestartGroup;
                    LayoutKt.MultiMeasureLayout(modifierSemantics$default, ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubChartKt$PnlHubChart$$inlined$ConstraintLayout$5
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
                        /* JADX WARN: Removed duplicated region for block: B:87:0x0302  */
                        /* JADX WARN: Type inference failed for: r1v44 */
                        /* JADX WARN: Type inference failed for: r1v45, types: [com.robinhood.models.serverdriven.experimental.api.CursorData] */
                        /* JADX WARN: Type inference failed for: r1v47 */
                        /* JADX WARN: Type inference failed for: r22v0 */
                        /* JADX WARN: Type inference failed for: r22v1, types: [androidx.compose.ui.graphics.Color] */
                        /* JADX WARN: Type inference failed for: r22v2 */
                        /* JADX WARN: Type inference failed for: r27v0 */
                        /* JADX WARN: Type inference failed for: r27v1, types: [com.robinhood.android.charts.model.LegendItemSuffix] */
                        /* JADX WARN: Type inference failed for: r27v2 */
                        /* JADX WARN: Type inference failed for: r35v0 */
                        /* JADX WARN: Type inference failed for: r35v1, types: [com.robinhood.models.serverdriven.experimental.api.DisplayText] */
                        /* JADX WARN: Type inference failed for: r35v2 */
                        /* JADX WARN: Type inference failed for: r36v0 */
                        /* JADX WARN: Type inference failed for: r36v1, types: [com.robinhood.models.serverdriven.experimental.api.SubDisplayText] */
                        /* JADX WARN: Type inference failed for: r36v3 */
                        /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.functions.Function3] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void invoke(Composer composer3, int i8) {
                            int i9;
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                            Object obj;
                            int i10;
                            int i11;
                            int i12;
                            ?? composeColor;
                            Iterator it2;
                            Object obj2;
                            ?? legendItemSuffix;
                            Map<String, List<ChartLegendItem>> legendData;
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
                            int i13;
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope44;
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope45;
                            int i14;
                            float f;
                            char c;
                            ImmutableList3 immutableList3PersistentListOf;
                            ImmutableList3 immutableList3PersistentListOf2;
                            List<Line> lines2;
                            List<ChartFill> fills;
                            ?? r1;
                            char c2;
                            Object objRememberComposableLambda;
                            Object defaultDisplay;
                            SubDisplayText secondary_value;
                            DisplayText primary_value;
                            Composer composer4 = composer3;
                            int i15 = 2;
                            if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1200550679, i8, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            snapshotState3.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                            constraintLayoutScope.reset();
                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                            composer4.startReplaceGroup(604384773);
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                            composer4.startReplaceGroup(-950333765);
                            com.robinhood.models.serverdriven.experimental.api.Point point6 = point5;
                            Object obj3 = null;
                            if (point6 == null) {
                                i11 = 1849434622;
                                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
                                i9 = 2;
                                i10 = 0;
                                obj = null;
                            } else {
                                PageWithChart pageWithChart2 = pageWithChart;
                                List<ChartLegendItem> legendList = (pageWithChart2 == null || (legendData = pageWithChart2.getLegendData()) == null) ? null : UtilKt.getLegendList(legendData, point6);
                                composer4.startReplaceGroup(-950331667);
                                if (legendList == null) {
                                    i11 = 1849434622;
                                    constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
                                    i9 = 2;
                                    i10 = 0;
                                    obj = null;
                                } else {
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    composer4.startReplaceGroup(1849434622);
                                    Object objRememberedValue13 = composer4.rememberedValue();
                                    if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue13 = PnlHubChartKt$PnlHubChart$2$1$1$1$1.INSTANCE;
                                        composer4.updateRememberedValue(objRememberedValue13);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue13), 0.0f, ((Density) composer4.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(snapshotIntState2.getIntValue()), 1, null), BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                                    composer4.startReplaceGroup(1705440348);
                                    List<ChartLegendItem> list = legendList;
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                    Iterator it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        ChartLegendItem chartLegendItem = (ChartLegendItem) it3.next();
                                        ThemedColor color = chartLegendItem.getColor();
                                        int i16 = i15;
                                        composer4.startReplaceGroup(1705443308);
                                        if (color == null) {
                                            composeColor = obj3;
                                            i12 = 0;
                                        } else {
                                            i12 = 0;
                                            composeColor = SduiColors2.toComposeColor(color, composer4, 0);
                                        }
                                        composer4.endReplaceGroup();
                                        String title = chartLegendItem.getTitle();
                                        Color composeColor2 = SduiColors2.toComposeColor(chartLegendItem.getValue_color(), composer4, i12);
                                        Intrinsics.checkNotNull(composeColor2);
                                        long value = composeColor2.getValue();
                                        String value2 = chartLegendItem.getValue();
                                        DisplayText value_suffix = chartLegendItem.getValue_suffix();
                                        composer4.startReplaceGroup(1705452833);
                                        if (value_suffix == null) {
                                            it2 = it3;
                                            obj2 = obj3;
                                            legendItemSuffix = obj2;
                                        } else {
                                            String value3 = value_suffix.getValue();
                                            it2 = it3;
                                            Color composeColor3 = SduiColors2.toComposeColor(value_suffix.getColor(), composer4, 0);
                                            TextStyle text_style = value_suffix.getText_style();
                                            composer4.startReplaceGroup(593172105);
                                            androidx.compose.p011ui.text.TextStyle composeTextStyle = text_style == null ? null : com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getComposeTextStyle(text_style, composer4, 0);
                                            composer4.endReplaceGroup();
                                            obj2 = null;
                                            legendItemSuffix = new LegendItemSuffix(value3, composeColor3, composeTextStyle, null);
                                        }
                                        composer4.endReplaceGroup();
                                        arrayList.add(new LegendItem(chartLegendItem.getId(), composeColor, title, value2, value, legendItemSuffix, null));
                                        obj3 = obj2;
                                        i15 = i16;
                                        it3 = it2;
                                    }
                                    i9 = i15;
                                    composer4.endReplaceGroup();
                                    constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
                                    obj = obj3;
                                    i10 = 0;
                                    i11 = 1849434622;
                                    CandlestickLegendChart.CandlestickLegendChart(modifierM5144paddingVpY3zN4$default, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextM(), arrayList, 1, composer4, 3072, 0);
                                    obj3 = Unit.INSTANCE;
                                }
                                composer4.endReplaceGroup();
                            }
                            composer4.endReplaceGroup();
                            composer4.startReplaceGroup(-950331690);
                            if (obj3 == null) {
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                composer4.startReplaceGroup(i11);
                                Object objRememberedValue14 = composer4.rememberedValue();
                                Composer.Companion companion5 = Composer.INSTANCE;
                                if (objRememberedValue14 == companion5.getEmpty()) {
                                    objRememberedValue14 = PnlHubChartKt$PnlHubChart$2$2$1$1.INSTANCE;
                                    composer4.updateRememberedValue(objRememberedValue14);
                                }
                                composer4.endReplaceGroup();
                                Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion4, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue14);
                                composer4.startReplaceGroup(5004770);
                                Object objRememberedValue15 = composer4.rememberedValue();
                                if (objRememberedValue15 == companion5.getEmpty()) {
                                    objRememberedValue15 = new PnlHubChartKt$PnlHubChart$2$2$2$1(snapshotIntState2);
                                    composer4.updateRememberedValue(objRememberedValue15);
                                }
                                composer4.endReplaceGroup();
                                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs, (Function1) objRememberedValue15);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, i10);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, i10);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierOnGloballyPositioned);
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion6.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, obj);
                                PageWithChart pageWithChart3 = pageWithChart;
                                if (pageWithChart3 != null) {
                                    RichText title2 = pageWithChart3.getTitle();
                                    if (title2 == null) {
                                        defaultDisplay = pageWithChart3.getDefaultDisplay();
                                        r1 = defaultDisplay;
                                    } else {
                                        CursorData defaultDisplay2 = pageWithChart3.getDefaultDisplay();
                                        if (defaultDisplay2 != null) {
                                            CursorData defaultDisplay3 = pageWithChart3.getDefaultDisplay();
                                            ?? Copy$default = (defaultDisplay3 == null || (primary_value = defaultDisplay3.getPrimary_value()) == null) ? obj : DisplayText.copy$default(primary_value, title2.getText(), null, null, 6, null);
                                            CursorData defaultDisplay4 = pageWithChart3.getDefaultDisplay();
                                            defaultDisplay = CursorData.copy$default(defaultDisplay2, null, null, null, null, Copy$default, (defaultDisplay4 == null || (secondary_value = defaultDisplay4.getSecondary_value()) == null) ? obj : SubDisplayText.copy$default(secondary_value, IconDisplayText.copy$default(secondary_value.getMain(), "", null, null, null, 10, null), null, null, null, 14, null), null, null, null, null, 975, null);
                                        } else {
                                            defaultDisplay = obj;
                                        }
                                        if (defaultDisplay == null) {
                                        }
                                        r1 = defaultDisplay;
                                    }
                                } else {
                                    r1 = obj;
                                }
                                composer4.startReplaceGroup(-58991283);
                                if (z3) {
                                    c2 = 1;
                                    objRememberComposableLambda = ComposableLambda3.rememberComposableLambda(822159271, true, new PnlHubChartKt$PnlHubChart$2$2$3$2(onChartHeaderSecondaryTextTrailingIconClick), composer4, 54);
                                } else {
                                    c2 = 1;
                                    objRememberComposableLambda = obj;
                                }
                                composer4.endReplaceGroup();
                                c = c2;
                                constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component4;
                                constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component5;
                                constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component2;
                                i13 = 0;
                                constraintLayoutBaseScope42 = constraintLayoutBaseScope4;
                                i14 = helpersHashCode;
                                f = 0.0f;
                                SduiCursorData2.SduiCursorDataHeader(r1, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, CursorRowModifiers.Default.INSTANCE, null, objRememberComposableLambda, false, z7, false, z8, composer3, CursorRowModifiers.Default.$stable << 6, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                                composer4 = composer3;
                                composer4.endNode();
                            } else {
                                constraintLayoutBaseScope42 = constraintLayoutBaseScope4;
                                i13 = i10;
                                constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component2;
                                constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component4;
                                constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component5;
                                i14 = helpersHashCode;
                                f = 0.0f;
                                c = 1;
                            }
                            composer4.endReplaceGroup();
                            ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr = new ConstraintLayoutBaseScope6[3];
                            constraintLayoutBaseScope6Arr[i13] = constraintLayoutBaseScope42;
                            constraintLayoutBaseScope6Arr[c] = constraintLayoutBaseScope43;
                            constraintLayoutBaseScope6Arr[i9] = constraintLayoutBaseScope4Component3;
                            ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope2, constraintLayoutBaseScope6Arr, f, i9, null);
                            Modifier.Companion companion7 = Modifier.INSTANCE;
                            composer4.startReplaceGroup(5004770);
                            boolean zChanged3 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                            Object objRememberedValue16 = composer4.rememberedValue();
                            if (zChanged3 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue16 = new PnlHubChartKt$PnlHubChart$2$3$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                                composer4.updateRememberedValue(objRememberedValue16);
                            }
                            composer4.endReplaceGroup();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope46 = constraintLayoutBaseScope44;
                            SduiCursorData2.SduiLabelTrack(constraintLayoutScope2.constrainAs(companion7, constraintLayoutBaseScope46, (Function1) objRememberedValue16), point5, composer4, i13, i13);
                            Modifier modifierFullWidthChartSize = ModifiersKt.fullWidthChartSize(companion7);
                            composer4.startReplaceGroup(5004770);
                            boolean zChanged4 = composer4.changed(constraintLayoutBaseScope46);
                            Object objRememberedValue17 = composer4.rememberedValue();
                            if (zChanged4 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue17 = new PnlHubChartKt$PnlHubChart$2$4$1(constraintLayoutBaseScope46);
                                composer4.updateRememberedValue(objRememberedValue17);
                            }
                            composer4.endReplaceGroup();
                            Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(modifierFullWidthChartSize, constraintLayoutBaseScope45, (Function1) objRememberedValue17);
                            composer4.startReplaceGroup(1849434622);
                            Object objRememberedValue18 = composer4.rememberedValue();
                            Composer.Companion companion8 = Composer.INSTANCE;
                            if (objRememberedValue18 == companion8.getEmpty()) {
                                objRememberedValue18 = PnlHubChartKt$PnlHubChart$2$5$1.INSTANCE;
                                composer4.updateRememberedValue(objRememberedValue18);
                            }
                            SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue18;
                            composer4.endReplaceGroup();
                            PageWithChart pageWithChart4 = pageWithChart;
                            if (pageWithChart4 == null || (fills = pageWithChart4.getFills()) == null || (immutableList3PersistentListOf = extensions2.toPersistentList(fills)) == null) {
                                immutableList3PersistentListOf = extensions2.persistentListOf();
                            }
                            PageWithChart pageWithChart5 = pageWithChart;
                            if (pageWithChart5 == null || (lines2 = pageWithChart5.getLines()) == null || (immutableList3PersistentListOf2 = extensions2.toPersistentList(lines2)) == null) {
                                immutableList3PersistentListOf2 = extensions2.persistentListOf();
                            }
                            composer4.startReplaceGroup(-1746271574);
                            boolean zChangedInstance3 = composer4.changedInstance(userInteractionEventDescriptor3) | composer4.changedInstance(current);
                            Object objRememberedValue19 = composer4.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue19 == companion8.getEmpty()) {
                                objRememberedValue19 = new PnlHubChartKt$PnlHubChart$2$6$1(userInteractionEventDescriptor3, current, snapshotState);
                                composer4.updateRememberedValue(objRememberedValue19);
                            }
                            Function1 function1 = (Function1) objRememberedValue19;
                            composer4.endReplaceGroup();
                            composer4.startReplaceGroup(5004770);
                            Object objRememberedValue20 = composer4.rememberedValue();
                            if (objRememberedValue20 == companion8.getEmpty()) {
                                objRememberedValue20 = new PnlHubChartKt$PnlHubChart$2$7$1(snapshotState);
                                composer4.updateRememberedValue(objRememberedValue20);
                            }
                            composer4.endReplaceGroup();
                            PnlHubSegmentedLineChart.PnlHubSegmentedLineChart(immutableList3PersistentListOf, immutableList3PersistentListOf2, sduiActionHandler, function1, (Function0) objRememberedValue20, z7, modifierConstrainAs2, composer3, 24576, 0);
                            composer3.endReplaceGroup();
                            if (constraintLayoutScope.getHelpersHashCode() != i14) {
                                EffectsKt.SideEffect(function0, composer3, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), measurePolicy, composer2, 48, 0);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    point2 = point4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubChartKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PnlHubChartKt.PnlHubChart$lambda$30(profitAndLossChart, z, z2, onChartVisibilityChanged, onChartHeaderSecondaryTextTrailingIconClick, modifier3, point2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            modifier2 = modifier;
            i5 = i2 & 64;
            int i72 = 1572864;
            if (i5 != 0) {
            }
            if ((599187 & i3) == 599186) {
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                if (profitAndLossChart != null) {
                }
                if (profitAndLossChart == null) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                if (chart != null) {
                    line = null;
                    Point pointPnlHubChart$lambda$12 = PnlHubChart$lambda$1(snapshotState);
                    Point point42 = point3;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(line) | composerStartRestartGroup.changed(pointPnlHubChart$lambda$12);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        if (line == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(closestHorizontalPoint);
                        objRememberedValue3 = closestHorizontalPoint;
                        final com.robinhood.models.serverdriven.experimental.api.Point point52 = (com.robinhood.models.serverdriven.experimental.api.Point) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((i3 & 7168) != 2048) {
                        }
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!z5) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubChartKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return PnlHubChartKt.PnlHubChart$lambda$10$lambda$9(onChartVisibilityChanged, (DisposableEffectScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceGroup(-1003410150);
                            composerStartRestartGroup.startReplaceGroup(212064437);
                            composerStartRestartGroup.endReplaceGroup();
                            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            companion2 = Composer.INSTANCE;
                            if (objRememberedValue5 == companion2.getEmpty()) {
                            }
                            measurer2 = (Measurer2) objRememberedValue5;
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == companion2.getEmpty()) {
                            }
                            final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue6;
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 != companion2.getEmpty()) {
                            }
                            snapshotState2 = (SnapshotState) objRememberedValue7;
                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue8 == companion2.getEmpty()) {
                            }
                            constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue8;
                            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue9 == companion2.getEmpty()) {
                            }
                            snapshotState3 = (SnapshotState) objRememberedValue9;
                            boolean zChangedInstance22 = composerStartRestartGroup.changedInstance(measurer2);
                            i6 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                            zChanged2 = zChangedInstance22 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue10 = new MeasurePolicy() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubChartKt$PnlHubChart$$inlined$ConstraintLayout$2
                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    /* renamed from: measure-3p2s80s */
                                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                                        final Map linkedHashMap = new LinkedHashMap();
                                        snapshotState3.getValue();
                                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i6);
                                        snapshotState2.getValue();
                                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                        final Measurer2 measurer22 = measurer2;
                                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubChartKt$PnlHubChart$$inlined$ConstraintLayout$2.1
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
                                snapshotState4 = snapshotState2;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue10;
                                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue11 == companion2.getEmpty()) {
                                }
                                final Function0 function02 = (Function0) objRememberedValue11;
                                zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance) {
                                    objRememberedValue12 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubChartKt$PnlHubChart$$inlined$ConstraintLayout$4
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
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                                    Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue12, 1, null);
                                    Modifier modifier52 = modifier4;
                                    final PageWithChart pageWithChart2 = chart;
                                    final boolean z72 = z6;
                                    final boolean z82 = z4;
                                    final UserInteractionEventDescriptor userInteractionEventDescriptor32 = userInteractionEventDescriptor;
                                    composer2 = composerStartRestartGroup;
                                    LayoutKt.MultiMeasureLayout(modifierSemantics$default2, ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubChartKt$PnlHubChart$$inlined$ConstraintLayout$5
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
                                        /* JADX WARN: Removed duplicated region for block: B:87:0x0302  */
                                        /* JADX WARN: Type inference failed for: r1v44 */
                                        /* JADX WARN: Type inference failed for: r1v45, types: [com.robinhood.models.serverdriven.experimental.api.CursorData] */
                                        /* JADX WARN: Type inference failed for: r1v47 */
                                        /* JADX WARN: Type inference failed for: r22v0 */
                                        /* JADX WARN: Type inference failed for: r22v1, types: [androidx.compose.ui.graphics.Color] */
                                        /* JADX WARN: Type inference failed for: r22v2 */
                                        /* JADX WARN: Type inference failed for: r27v0 */
                                        /* JADX WARN: Type inference failed for: r27v1, types: [com.robinhood.android.charts.model.LegendItemSuffix] */
                                        /* JADX WARN: Type inference failed for: r27v2 */
                                        /* JADX WARN: Type inference failed for: r35v0 */
                                        /* JADX WARN: Type inference failed for: r35v1, types: [com.robinhood.models.serverdriven.experimental.api.DisplayText] */
                                        /* JADX WARN: Type inference failed for: r35v2 */
                                        /* JADX WARN: Type inference failed for: r36v0 */
                                        /* JADX WARN: Type inference failed for: r36v1, types: [com.robinhood.models.serverdriven.experimental.api.SubDisplayText] */
                                        /* JADX WARN: Type inference failed for: r36v3 */
                                        /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.functions.Function3] */
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final void invoke(Composer composer3, int i8) {
                                            int i9;
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                                            Object obj;
                                            int i10;
                                            int i11;
                                            int i12;
                                            ?? composeColor;
                                            Iterator it2;
                                            Object obj2;
                                            ?? legendItemSuffix;
                                            Map<String, List<ChartLegendItem>> legendData;
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
                                            int i13;
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope44;
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope45;
                                            int i14;
                                            float f;
                                            char c;
                                            ImmutableList3 immutableList3PersistentListOf;
                                            ImmutableList3 immutableList3PersistentListOf2;
                                            List<Line> lines2;
                                            List<ChartFill> fills;
                                            ?? r1;
                                            char c2;
                                            Object objRememberComposableLambda;
                                            Object defaultDisplay;
                                            SubDisplayText secondary_value;
                                            DisplayText primary_value;
                                            Composer composer4 = composer3;
                                            int i15 = 2;
                                            if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1200550679, i8, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                            }
                                            snapshotState3.setValue(Unit.INSTANCE);
                                            int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                            constraintLayoutScope2.reset();
                                            ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                                            composer4.startReplaceGroup(604384773);
                                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                                            composer4.startReplaceGroup(-950333765);
                                            com.robinhood.models.serverdriven.experimental.api.Point point6 = point52;
                                            Object obj3 = null;
                                            if (point6 == null) {
                                                i11 = 1849434622;
                                                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
                                                i9 = 2;
                                                i10 = 0;
                                                obj = null;
                                            } else {
                                                PageWithChart pageWithChart22 = pageWithChart2;
                                                List<ChartLegendItem> legendList = (pageWithChart22 == null || (legendData = pageWithChart22.getLegendData()) == null) ? null : UtilKt.getLegendList(legendData, point6);
                                                composer4.startReplaceGroup(-950331667);
                                                if (legendList == null) {
                                                    i11 = 1849434622;
                                                    constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
                                                    i9 = 2;
                                                    i10 = 0;
                                                    obj = null;
                                                } else {
                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                    composer4.startReplaceGroup(1849434622);
                                                    Object objRememberedValue13 = composer4.rememberedValue();
                                                    if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue13 = PnlHubChartKt$PnlHubChart$2$1$1$1$1.INSTANCE;
                                                        composer4.updateRememberedValue(objRememberedValue13);
                                                    }
                                                    composer4.endReplaceGroup();
                                                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(constraintLayoutScope22.constrainAs(companion3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue13), 0.0f, ((Density) composer4.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(snapshotIntState22.getIntValue()), 1, null), BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                                                    composer4.startReplaceGroup(1705440348);
                                                    List<ChartLegendItem> list = legendList;
                                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                                    Iterator it3 = list.iterator();
                                                    while (it3.hasNext()) {
                                                        ChartLegendItem chartLegendItem = (ChartLegendItem) it3.next();
                                                        ThemedColor color = chartLegendItem.getColor();
                                                        int i16 = i15;
                                                        composer4.startReplaceGroup(1705443308);
                                                        if (color == null) {
                                                            composeColor = obj3;
                                                            i12 = 0;
                                                        } else {
                                                            i12 = 0;
                                                            composeColor = SduiColors2.toComposeColor(color, composer4, 0);
                                                        }
                                                        composer4.endReplaceGroup();
                                                        String title = chartLegendItem.getTitle();
                                                        Color composeColor2 = SduiColors2.toComposeColor(chartLegendItem.getValue_color(), composer4, i12);
                                                        Intrinsics.checkNotNull(composeColor2);
                                                        long value = composeColor2.getValue();
                                                        String value2 = chartLegendItem.getValue();
                                                        DisplayText value_suffix = chartLegendItem.getValue_suffix();
                                                        composer4.startReplaceGroup(1705452833);
                                                        if (value_suffix == null) {
                                                            it2 = it3;
                                                            obj2 = obj3;
                                                            legendItemSuffix = obj2;
                                                        } else {
                                                            String value3 = value_suffix.getValue();
                                                            it2 = it3;
                                                            Color composeColor3 = SduiColors2.toComposeColor(value_suffix.getColor(), composer4, 0);
                                                            TextStyle text_style = value_suffix.getText_style();
                                                            composer4.startReplaceGroup(593172105);
                                                            androidx.compose.p011ui.text.TextStyle composeTextStyle = text_style == null ? null : com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getComposeTextStyle(text_style, composer4, 0);
                                                            composer4.endReplaceGroup();
                                                            obj2 = null;
                                                            legendItemSuffix = new LegendItemSuffix(value3, composeColor3, composeTextStyle, null);
                                                        }
                                                        composer4.endReplaceGroup();
                                                        arrayList.add(new LegendItem(chartLegendItem.getId(), composeColor, title, value2, value, legendItemSuffix, null));
                                                        obj3 = obj2;
                                                        i15 = i16;
                                                        it3 = it2;
                                                    }
                                                    i9 = i15;
                                                    composer4.endReplaceGroup();
                                                    constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
                                                    obj = obj3;
                                                    i10 = 0;
                                                    i11 = 1849434622;
                                                    CandlestickLegendChart.CandlestickLegendChart(modifierM5144paddingVpY3zN4$default, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextM(), arrayList, 1, composer4, 3072, 0);
                                                    obj3 = Unit.INSTANCE;
                                                }
                                                composer4.endReplaceGroup();
                                            }
                                            composer4.endReplaceGroup();
                                            composer4.startReplaceGroup(-950331690);
                                            if (obj3 == null) {
                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                composer4.startReplaceGroup(i11);
                                                Object objRememberedValue14 = composer4.rememberedValue();
                                                Composer.Companion companion5 = Composer.INSTANCE;
                                                if (objRememberedValue14 == companion5.getEmpty()) {
                                                    objRememberedValue14 = PnlHubChartKt$PnlHubChart$2$2$1$1.INSTANCE;
                                                    composer4.updateRememberedValue(objRememberedValue14);
                                                }
                                                composer4.endReplaceGroup();
                                                Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(companion4, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue14);
                                                composer4.startReplaceGroup(5004770);
                                                Object objRememberedValue15 = composer4.rememberedValue();
                                                if (objRememberedValue15 == companion5.getEmpty()) {
                                                    objRememberedValue15 = new PnlHubChartKt$PnlHubChart$2$2$2$1(snapshotIntState22);
                                                    composer4.updateRememberedValue(objRememberedValue15);
                                                }
                                                composer4.endReplaceGroup();
                                                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs, (Function1) objRememberedValue15);
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, i10);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, i10);
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierOnGloballyPositioned);
                                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion6.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                                                Column6 column6 = Column6.INSTANCE;
                                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, obj);
                                                PageWithChart pageWithChart3 = pageWithChart2;
                                                if (pageWithChart3 != null) {
                                                    RichText title2 = pageWithChart3.getTitle();
                                                    if (title2 == null) {
                                                        defaultDisplay = pageWithChart3.getDefaultDisplay();
                                                        r1 = defaultDisplay;
                                                    } else {
                                                        CursorData defaultDisplay2 = pageWithChart3.getDefaultDisplay();
                                                        if (defaultDisplay2 != null) {
                                                            CursorData defaultDisplay3 = pageWithChart3.getDefaultDisplay();
                                                            ?? Copy$default = (defaultDisplay3 == null || (primary_value = defaultDisplay3.getPrimary_value()) == null) ? obj : DisplayText.copy$default(primary_value, title2.getText(), null, null, 6, null);
                                                            CursorData defaultDisplay4 = pageWithChart3.getDefaultDisplay();
                                                            defaultDisplay = CursorData.copy$default(defaultDisplay2, null, null, null, null, Copy$default, (defaultDisplay4 == null || (secondary_value = defaultDisplay4.getSecondary_value()) == null) ? obj : SubDisplayText.copy$default(secondary_value, IconDisplayText.copy$default(secondary_value.getMain(), "", null, null, null, 10, null), null, null, null, 14, null), null, null, null, null, 975, null);
                                                        } else {
                                                            defaultDisplay = obj;
                                                        }
                                                        if (defaultDisplay == null) {
                                                        }
                                                        r1 = defaultDisplay;
                                                    }
                                                } else {
                                                    r1 = obj;
                                                }
                                                composer4.startReplaceGroup(-58991283);
                                                if (z3) {
                                                    c2 = 1;
                                                    objRememberComposableLambda = ComposableLambda3.rememberComposableLambda(822159271, true, new PnlHubChartKt$PnlHubChart$2$2$3$2(onChartHeaderSecondaryTextTrailingIconClick), composer4, 54);
                                                } else {
                                                    c2 = 1;
                                                    objRememberComposableLambda = obj;
                                                }
                                                composer4.endReplaceGroup();
                                                c = c2;
                                                constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component4;
                                                constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component5;
                                                constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component2;
                                                i13 = 0;
                                                constraintLayoutBaseScope42 = constraintLayoutBaseScope4;
                                                i14 = helpersHashCode;
                                                f = 0.0f;
                                                SduiCursorData2.SduiCursorDataHeader(r1, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, CursorRowModifiers.Default.INSTANCE, null, objRememberComposableLambda, false, z72, false, z82, composer3, CursorRowModifiers.Default.$stable << 6, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                                                composer4 = composer3;
                                                composer4.endNode();
                                            } else {
                                                constraintLayoutBaseScope42 = constraintLayoutBaseScope4;
                                                i13 = i10;
                                                constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component2;
                                                constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component4;
                                                constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component5;
                                                i14 = helpersHashCode;
                                                f = 0.0f;
                                                c = 1;
                                            }
                                            composer4.endReplaceGroup();
                                            ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr = new ConstraintLayoutBaseScope6[3];
                                            constraintLayoutBaseScope6Arr[i13] = constraintLayoutBaseScope42;
                                            constraintLayoutBaseScope6Arr[c] = constraintLayoutBaseScope43;
                                            constraintLayoutBaseScope6Arr[i9] = constraintLayoutBaseScope4Component3;
                                            ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope22, constraintLayoutBaseScope6Arr, f, i9, null);
                                            Modifier.Companion companion7 = Modifier.INSTANCE;
                                            composer4.startReplaceGroup(5004770);
                                            boolean zChanged3 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                                            Object objRememberedValue16 = composer4.rememberedValue();
                                            if (zChanged3 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue16 = new PnlHubChartKt$PnlHubChart$2$3$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                                                composer4.updateRememberedValue(objRememberedValue16);
                                            }
                                            composer4.endReplaceGroup();
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope46 = constraintLayoutBaseScope44;
                                            SduiCursorData2.SduiLabelTrack(constraintLayoutScope22.constrainAs(companion7, constraintLayoutBaseScope46, (Function1) objRememberedValue16), point52, composer4, i13, i13);
                                            Modifier modifierFullWidthChartSize = ModifiersKt.fullWidthChartSize(companion7);
                                            composer4.startReplaceGroup(5004770);
                                            boolean zChanged4 = composer4.changed(constraintLayoutBaseScope46);
                                            Object objRememberedValue17 = composer4.rememberedValue();
                                            if (zChanged4 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue17 = new PnlHubChartKt$PnlHubChart$2$4$1(constraintLayoutBaseScope46);
                                                composer4.updateRememberedValue(objRememberedValue17);
                                            }
                                            composer4.endReplaceGroup();
                                            Modifier modifierConstrainAs2 = constraintLayoutScope22.constrainAs(modifierFullWidthChartSize, constraintLayoutBaseScope45, (Function1) objRememberedValue17);
                                            composer4.startReplaceGroup(1849434622);
                                            Object objRememberedValue18 = composer4.rememberedValue();
                                            Composer.Companion companion8 = Composer.INSTANCE;
                                            if (objRememberedValue18 == companion8.getEmpty()) {
                                                objRememberedValue18 = PnlHubChartKt$PnlHubChart$2$5$1.INSTANCE;
                                                composer4.updateRememberedValue(objRememberedValue18);
                                            }
                                            SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue18;
                                            composer4.endReplaceGroup();
                                            PageWithChart pageWithChart4 = pageWithChart2;
                                            if (pageWithChart4 == null || (fills = pageWithChart4.getFills()) == null || (immutableList3PersistentListOf = extensions2.toPersistentList(fills)) == null) {
                                                immutableList3PersistentListOf = extensions2.persistentListOf();
                                            }
                                            PageWithChart pageWithChart5 = pageWithChart2;
                                            if (pageWithChart5 == null || (lines2 = pageWithChart5.getLines()) == null || (immutableList3PersistentListOf2 = extensions2.toPersistentList(lines2)) == null) {
                                                immutableList3PersistentListOf2 = extensions2.persistentListOf();
                                            }
                                            composer4.startReplaceGroup(-1746271574);
                                            boolean zChangedInstance3 = composer4.changedInstance(userInteractionEventDescriptor32) | composer4.changedInstance(current2);
                                            Object objRememberedValue19 = composer4.rememberedValue();
                                            if (zChangedInstance3 || objRememberedValue19 == companion8.getEmpty()) {
                                                objRememberedValue19 = new PnlHubChartKt$PnlHubChart$2$6$1(userInteractionEventDescriptor32, current2, snapshotState);
                                                composer4.updateRememberedValue(objRememberedValue19);
                                            }
                                            Function1 function1 = (Function1) objRememberedValue19;
                                            composer4.endReplaceGroup();
                                            composer4.startReplaceGroup(5004770);
                                            Object objRememberedValue20 = composer4.rememberedValue();
                                            if (objRememberedValue20 == companion8.getEmpty()) {
                                                objRememberedValue20 = new PnlHubChartKt$PnlHubChart$2$7$1(snapshotState);
                                                composer4.updateRememberedValue(objRememberedValue20);
                                            }
                                            composer4.endReplaceGroup();
                                            PnlHubSegmentedLineChart.PnlHubSegmentedLineChart(immutableList3PersistentListOf, immutableList3PersistentListOf2, sduiActionHandler, function1, (Function0) objRememberedValue20, z72, modifierConstrainAs2, composer3, 24576, 0);
                                            composer3.endReplaceGroup();
                                            if (constraintLayoutScope2.getHelpersHashCode() != i14) {
                                                EffectsKt.SideEffect(function02, composer3, 6);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), measurePolicy2, composer2, 48, 0);
                                    composer2.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                    point2 = point42;
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z2;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 64;
        int i722 = 1572864;
        if (i5 != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult PnlHubChart$lambda$10$lambda$9(final Function1 function1, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        function1.invoke(Boolean.TRUE);
        return new DisposableEffectResult() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubChartKt$PnlHubChart$lambda$10$lambda$9$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                function1.invoke(Boolean.FALSE);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point PnlHubChart$lambda$1(SnapshotState<Point> snapshotState) {
        return snapshotState.getValue();
    }

    public static final com.robinhood.models.serverdriven.experimental.api.Point getClosestHorizontalPoint(Line line, Point point) {
        Intrinsics.checkNotNullParameter(line, "<this>");
        if (point == null) {
            return null;
        }
        List<Segment> segments = line.getSegments();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = segments.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((Segment) it.next()).getPoints());
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it2.next();
        if (it2.hasNext()) {
            float fAbs = Math.abs(((com.robinhood.models.serverdriven.experimental.api.Point) next).getX() - point.getX());
            do {
                Object next2 = it2.next();
                float fAbs2 = Math.abs(((com.robinhood.models.serverdriven.experimental.api.Point) next2).getX() - point.getX());
                if (Float.compare(fAbs, fAbs2) > 0) {
                    next = next2;
                    fAbs = fAbs2;
                }
            } while (it2.hasNext());
        }
        return (com.robinhood.models.serverdriven.experimental.api.Point) next;
    }
}
