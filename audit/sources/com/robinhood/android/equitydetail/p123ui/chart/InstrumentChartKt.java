package com.robinhood.android.equitydetail.p123ui.chart;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier4;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.Placeholders2;
import com.robinhood.android.charts.candlestick.CandlestickLegendChart;
import com.robinhood.android.charts.candlestick.UtilKt;
import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.charts.model.LegendItem;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.compose.ModifiersKt;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.adt.AdtChip;
import com.robinhood.android.equitydetail.p123ui.chart.InstrumentChartKt;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.compose.LocalityStringResources2;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans;
import com.robinhood.models.p320db.bonfire.instrument.SduiInstrumentChart;
import com.robinhood.models.p320db.bonfire.instrument.SduiInstrumentChart2;
import com.robinhood.models.p320db.bonfire.instrument.SduiInstrumentChart3;
import com.robinhood.models.serverdriven.experimental.api.Chart;
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
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.LocalScarletManager;
import com.robinhood.scarlet.ScarletManager;
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
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InstrumentChart.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a/\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\t\u001a\u0015\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\u00ad\u0001\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u008e\u0002²\u0006\f\u0010&\u001a\u0004\u0018\u00010'X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002"}, m3636d2 = {"chartModifier", "Landroidx/compose/ui/Modifier;", "PriceBookButton", "", "onPriceBookClicked", "Lkotlin/Function0;", "modifier", "showGoldIconInDarkMode", "", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "headerPlaceholderText", "", "subheaderPlaceholderText", "cursorHeaderPlaceholderText", "ChartHeaderPlaceholder", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "ChartHeaderTestTag", "InstrumentChart", "sduiInstrumentChart", "Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;", "chartSpans", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;", "displaySpan", "showAdtChip", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onSpanChanged", "Lkotlin/Function1;", "onChartSettingsClicked", "onAdvancedButtonClicked", "isInBlackWidowAdvancedChartExperiment", "hasVisitedBwChart", "showDisplayCurrencyLabel", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;Ljava/lang/String;ZLcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZZZLandroidx/compose/runtime/Composer;III)V", "feature-equity-detail_externalDebug", "iconPositionInWindow", "Landroidx/compose/ui/geometry/Offset;", "selectedPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "graphHeaderHeight", "", "showingAdtChip", "rowModifiers", "Lcom/robinhood/android/charts/cursor/CursorRowModifiers$ChartEducationTour;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentChartKt {
    private static final String ChartHeaderTestTag = "stock_detail_chart_header";
    private static final Modifier chartModifier = ModifiersKt.educationTourId$default(PaddingKt.m5144paddingVpY3zN4$default(com.robinhood.android.charts.ModifiersKt.fullWidthChartSize(Modifier.INSTANCE), 0.0f, C2002Dp.m7995constructorimpl(8), 1, null), EducationTourElementIds.PRICE_CHART_GRAPH_ELEMENT_ID, null, null, false, false, 30, null);
    private static final String cursorHeaderPlaceholderText = "$0.75 (0.75%) Today";
    private static final String headerPlaceholderText = "Some Company";
    private static final String subheaderPlaceholderText = "$100.00";

    /* compiled from: InstrumentChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SduiInstrumentChart2.values().length];
            try {
                iArr[SduiInstrumentChart2.LINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SduiInstrumentChart2.EMPTY_WITH_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SduiInstrumentChart2.CANDLESTICK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SduiInstrumentChart2.EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Direction.values().length];
            try {
                iArr2[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartHeaderPlaceholder$lambda$13(Modifier modifier, int i, Composer composer, int i2) {
        ChartHeaderPlaceholder(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentChart$lambda$46(Modifier modifier, SduiInstrumentChart sduiInstrumentChart, InstrumentChartSpans instrumentChartSpans, String str, boolean z, SduiActionHandler sduiActionHandler, Function1 function1, Function0 function0, Function0 function02, Function0 function03, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2, int i3, Composer composer, int i4) {
        InstrumentChart(modifier, sduiInstrumentChart, instrumentChartSpans, str, z, sduiActionHandler, function1, function0, function02, function03, z2, z3, z4, z5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceBookButton$lambda$11(Function0 function0, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        PriceBookButton(function0, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point InstrumentChart$lambda$15(SnapshotState<Point> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean InstrumentChart$lambda$45$lambda$33$lambda$29(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CursorRowModifiers.ChartEducationTour InstrumentChart$lambda$45$lambda$33$lambda$31(SnapshotState<CursorRowModifiers.ChartEducationTour> snapshotState) {
        return snapshotState.getValue();
    }

    private static final long PriceBookButton$lambda$1(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PriceBookButton(final Function0<Unit> function0, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        boolean z3;
        Object objRememberedValue;
        Composer.Companion companion;
        ScarletManager scarletManager;
        final Modifier modifier3;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1342355922);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else if ((i & 6) == 0) {
            function02 = function0;
            i3 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z4 = z2;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    z3 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1342355922, i3, -1, "com.robinhood.android.equitydetail.ui.chart.PriceBookButton (InstrumentChart.kt:104)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(0.0f)))), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    final Brush brushM15094sparkleEPk0efs = GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, PriceBookButton$lambda$1(snapshotState), null, composerStartRestartGroup, 6, 2);
                    scarletManager = (ScarletManager) composerStartRestartGroup.consume(LocalScarletManager.getLocalScarletManager());
                    composerStartRestartGroup.startReplaceGroup(-1513823516);
                    Modifier modifier5 = modifier4;
                    Modifier modifierAutoLogEvents$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier5, false, null, null, function02, 7, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.STOCK_DETAIL_PAGE, null, null, null, 14, null), null, null, new Component(Component.ComponentType.BUTTON, "gold_l2_instrument_icon", null, 4, null), null, 45, null), false, false, false, true, false, null, 110, null);
                    if ((z3 || scarletManager == null || DayNightChanges.isDay(scarletManager)) ? false : true) {
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return InstrumentChartKt.PriceBookButton$lambda$10$lambda$4$lambda$3(snapshotState, (LayoutCoordinates) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierAutoLogEvents$default, (Function1) objRememberedValue2);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return InstrumentChartKt.PriceBookButton$lambda$10$lambda$6$lambda$5((GraphicsLayerScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierOnGloballyPositioned, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChanged = composerStartRestartGroup.changed(brushM15094sparkleEPk0efs);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return InstrumentChartKt.PriceBookButton$lambda$10$lambda$9$lambda$8(brushM15094sparkleEPk0efs, (CacheDrawScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifierAutoLogEvents$default = DrawModifierKt.drawWithCache(modifierGraphicsLayer, (Function1) objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.L2_HEADER_ARROW_24), StringResources_androidKt.stringResource(C15314R.string.level_2_button_content_description, composerStartRestartGroup, 0), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), modifierAutoLogEvents$default, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InstrumentChartKt.PriceBookButton$lambda$11(function0, modifier3, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z2 = z;
            if ((i3 & 147) == 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                final Brush brushM15094sparkleEPk0efs2 = GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, PriceBookButton$lambda$1(snapshotState2), null, composerStartRestartGroup, 6, 2);
                scarletManager = (ScarletManager) composerStartRestartGroup.consume(LocalScarletManager.getLocalScarletManager());
                composerStartRestartGroup.startReplaceGroup(-1513823516);
                Modifier modifier52 = modifier4;
                Modifier modifierAutoLogEvents$default2 = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier52, false, null, null, function02, 7, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.STOCK_DETAIL_PAGE, null, null, null, 14, null), null, null, new Component(Component.ComponentType.BUTTON, "gold_l2_instrument_icon", null, 4, null), null, 45, null), false, false, false, true, false, null, 110, null);
                if (z3) {
                    if ((z3 || scarletManager == null || DayNightChanges.isDay(scarletManager)) ? false : true) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.L2_HEADER_ARROW_24), StringResources_androidKt.stringResource(C15314R.string.level_2_button_content_description, composerStartRestartGroup, 0), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), modifierAutoLogEvents$default2, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                    z4 = z3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void PriceBookButton$lambda$2(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceBookButton$lambda$10$lambda$4$lambda$3(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
        Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
        PriceBookButton$lambda$2(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceBookButton$lambda$10$lambda$6$lambda$5(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.mo6762setCompositingStrategyaDBOjCE(GraphicsLayerModifier4.INSTANCE.m6750getOffscreenNrFUSI());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult PriceBookButton$lambda$10$lambda$9$lambda$8(final Brush brush, CacheDrawScope drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        return drawWithCache.onDrawWithContent(new Function1() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentChartKt.PriceBookButton$lambda$10$lambda$9$lambda$8$lambda$7(brush, (ContentDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceBookButton$lambda$10$lambda$9$lambda$8$lambda$7(Brush brush, ContentDrawScope onDrawWithContent) {
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        DrawScope.m6957drawRectAsUm42w$default(onDrawWithContent, brush, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m6667getSrcAtop0nO6VwU(), 62, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartHeaderPlaceholder(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1757301154);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1757301154, i2, -1, "com.robinhood.android.equitydetail.ui.chart.ChartHeaderPlaceholder (InstrumentChart.kt:144)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(headerPlaceholderText, com.robinhood.compose.bento.util.ModifiersKt.bentoPillPlaceholder(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21595getXsmallD9Ej5fM(), 7, null), true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleLarge(), composer2, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(subheaderPlaceholderText, com.robinhood.compose.bento.util.ModifiersKt.bentoPillPlaceholder(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i3).m21595getXsmallD9Ej5fM(), 7, null), true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getDisplayCapsuleLarge(), composer2, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(cursorHeaderPlaceholderText, com.robinhood.compose.bento.util.ModifiersKt.bentoPillPlaceholder(companion2, true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getTextM(), composer2, 6, 0, 8188);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstrumentChartKt.ChartHeaderPlaceholder$lambda$13(modifier, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstrumentChart(Modifier modifier, final SduiInstrumentChart sduiInstrumentChart, final InstrumentChartSpans instrumentChartSpans, final String str, final boolean z, final SduiActionHandler<? super GenericAction> actionHandler, final Function1<? super String, Unit> onSpanChanged, final Function0<Unit> onChartSettingsClicked, final Function0<Unit> onPriceBookClicked, final Function0<Unit> onAdvancedButtonClicked, final boolean z2, final boolean z3, boolean z4, boolean z5, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        InstrumentChartSpans instrumentChartSpans2;
        String str2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final Measurer2 measurer2;
        Object objRememberedValue4;
        Object objRememberedValue5;
        final SnapshotState snapshotState;
        Object objRememberedValue6;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue7;
        final SnapshotState snapshotState2;
        final int i10;
        boolean zChanged;
        Object objRememberedValue8;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        final SnapshotState snapshotState3;
        Object objRememberedValue9;
        boolean zChangedInstance;
        Object objRememberedValue10;
        final boolean z6;
        Composer composer2;
        final boolean z7;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onSpanChanged, "onSpanChanged");
        Intrinsics.checkNotNullParameter(onChartSettingsClicked, "onChartSettingsClicked");
        Intrinsics.checkNotNullParameter(onPriceBookClicked, "onPriceBookClicked");
        Intrinsics.checkNotNullParameter(onAdvancedButtonClicked, "onAdvancedButtonClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1882311353);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(sduiInstrumentChart) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                instrumentChartSpans2 = instrumentChartSpans;
                i4 |= composerStartRestartGroup.changedInstance(instrumentChartSpans2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    str2 = str;
                    i4 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i4 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
                    }
                    if ((i3 & 32) == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(actionHandler) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(onSpanChanged) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(onChartSettingsClicked) ? 8388608 : 4194304;
                    }
                    if ((i3 & 256) == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(onPriceBookClicked) ? 67108864 : 33554432;
                    }
                    if ((i3 & 512) != 0) {
                        i11 = (i & 805306368) == 0 ? composerStartRestartGroup.changedInstance(onAdvancedButtonClicked) ? 536870912 : 268435456 : 805306368;
                        if ((i3 & 1024) != 0) {
                            i5 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i5 = i2 | (composerStartRestartGroup.changed(z2) ? 4 : 2);
                        } else {
                            i5 = i2;
                        }
                        if ((i3 & 2048) != 0) {
                            i5 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i5 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
                        }
                        int i13 = i5;
                        i6 = i3 & 4096;
                        if (i6 != 0) {
                            i7 = i13 | 384;
                        } else {
                            int i14 = i13;
                            if ((i2 & 384) == 0) {
                                i14 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                            }
                            i7 = i14;
                        }
                        i8 = i3 & 8192;
                        if (i8 != 0) {
                            i9 = i7 | 3072;
                        } else {
                            int i15 = i7;
                            if ((i2 & 3072) == 0) {
                                i15 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                            }
                            i9 = i15;
                        }
                        if ((i4 & 306783379) == 306783378 && (i9 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            z6 = z5;
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier2;
                            z7 = z4;
                        } else {
                            Modifier modifier4 = i12 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z8 = i6 == 0 ? false : z4;
                            boolean z9 = i8 == 0 ? false : z5;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1882311353, i4, i9, "com.robinhood.android.equitydetail.ui.chart.InstrumentChart (InstrumentChart.kt:189)");
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
                            Chart<GenericAction> chart = sduiInstrumentChart == null ? sduiInstrumentChart.getChart() : null;
                            composerStartRestartGroup.startReplaceGroup(-1003410150);
                            composerStartRestartGroup.startReplaceGroup(212064437);
                            composerStartRestartGroup.endReplaceGroup();
                            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
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
                            i10 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                            zChanged = zChangedInstance2 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue8 == companion.getEmpty()) {
                                objRememberedValue8 = new MeasurePolicy() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$InstrumentChart$$inlined$ConstraintLayout$2
                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i16);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i16);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i16);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i16);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    /* renamed from: measure-3p2s80s */
                                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        snapshotState2.getValue();
                                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i10);
                                        snapshotState.getValue();
                                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                        final Measurer2 measurer22 = measurer2;
                                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$InstrumentChart$$inlined$ConstraintLayout$2.1
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
                                objRememberedValue9 = new Function0<Unit>() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$InstrumentChart$$inlined$ConstraintLayout$3
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
                                objRememberedValue10 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$InstrumentChart$$inlined$ConstraintLayout$4
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
                            Modifier modifier5 = modifier4;
                            final Chart<GenericAction> chart2 = chart;
                            final boolean z10 = z8;
                            final String str3 = str2;
                            z6 = z9;
                            final InstrumentChartSpans instrumentChartSpans3 = instrumentChartSpans2;
                            composer2 = composerStartRestartGroup;
                            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue10, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$InstrumentChart$$inlined$ConstraintLayout$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:160:0x0699  */
                                /* JADX WARN: Removed duplicated region for block: B:163:0x06af  */
                                /* JADX WARN: Removed duplicated region for block: B:166:0x06cb  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void invoke(Composer composer3, int i16) {
                                    SduiInstrumentChart2 sduiInstrumentChart2;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope44;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope45;
                                    ConstraintLayoutScope constraintLayoutScope2;
                                    Object obj;
                                    char c;
                                    CursorData defaultDisplay;
                                    Modifier.Companion companion2;
                                    BentoTheme bentoTheme;
                                    int i17;
                                    int i18;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope46;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope47;
                                    int i19;
                                    int i20;
                                    List<ChartLegendItem> legendList;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope48;
                                    int i21;
                                    Composer composer4;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope49;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope410;
                                    int i22;
                                    Map<String, List<ChartLegendItem>> legend_data;
                                    List<Line> listEmptyList;
                                    List<ChartFill> listEmptyList2;
                                    List<UIComponent<GenericAction>> listEmptyList3;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope411;
                                    ConstraintLayoutScope constraintLayoutScope3;
                                    int i23;
                                    Composer composer5;
                                    int i24;
                                    Direction pageDirection;
                                    BentoTheme4 bentoTheme4;
                                    Set setEmptySet;
                                    Object objRememberedValue11;
                                    Composer.Companion companion3;
                                    Object objRememberedValue12;
                                    Map<String, List<ChartLegendItem>> legend_data2;
                                    Set<String> setKeySet;
                                    Composer composer6 = composer3;
                                    if ((i16 & 3) == 2 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1200550679, i16, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                    }
                                    snapshotState2.setValue(Unit.INSTANCE);
                                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                    constraintLayoutScope.reset();
                                    ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope;
                                    composer6.startReplaceGroup(1710810859);
                                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope4.createRefs();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component9 = constrainedLayoutReferencesCreateRefs.component9();
                                    SduiInstrumentChart2 chartState = SduiInstrumentChart3.getChartState(sduiInstrumentChart);
                                    if (sduiInstrumentChart == null) {
                                        composer6.startReplaceGroup(1710789313);
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer6, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                        composer6.startReplaceGroup(1849434622);
                                        Object objRememberedValue13 = composer6.rememberedValue();
                                        if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue13 = InstrumentChartKt$InstrumentChart$1$1$1.INSTANCE;
                                            composer6.updateRememberedValue(objRememberedValue13);
                                        }
                                        composer6.endReplaceGroup();
                                        InstrumentChartKt.ChartHeaderPlaceholder(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(constraintLayoutScope4.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue13), 0.0f, 1, null), composer6, 0);
                                        composer6.endReplaceGroup();
                                        i17 = helpersHashCode;
                                        constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component9;
                                        constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component5;
                                        constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component6;
                                        sduiInstrumentChart2 = chartState;
                                        i20 = 1;
                                        constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component2;
                                        constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
                                        constraintLayoutScope2 = constraintLayoutScope4;
                                        constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component4;
                                        i18 = 3;
                                        i19 = 0;
                                        constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component1;
                                    } else if (chartState != SduiInstrumentChart2.CANDLESTICK || InstrumentChartKt.InstrumentChart$lambda$15(snapshotState4) == null) {
                                        sduiInstrumentChart2 = chartState;
                                        constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
                                        composer6.startReplaceGroup(1712711716);
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        composer6.startReplaceGroup(1849434622);
                                        Object objRememberedValue14 = composer6.rememberedValue();
                                        Composer.Companion companion5 = Composer.INSTANCE;
                                        if (objRememberedValue14 == companion5.getEmpty()) {
                                            objRememberedValue14 = InstrumentChartKt$InstrumentChart$1$3$1.INSTANCE;
                                            composer6.updateRememberedValue(objRememberedValue14);
                                        }
                                        composer6.endReplaceGroup();
                                        Modifier modifierConstrainAs = constraintLayoutScope4.constrainAs(companion4, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue14);
                                        composer6.startReplaceGroup(5004770);
                                        Object objRememberedValue15 = composer6.rememberedValue();
                                        if (objRememberedValue15 == companion5.getEmpty()) {
                                            objRememberedValue15 = new InstrumentChartKt$InstrumentChart$1$4$1(snapshotIntState2);
                                            composer6.updateRememberedValue(objRememberedValue15);
                                        }
                                        composer6.endReplaceGroup();
                                        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs, (Function1) objRememberedValue15);
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        Arrangement.Vertical top = arrangement.getTop();
                                        Alignment.Companion companion6 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion6.getStart(), composer6, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer6, modifierOnGloballyPositioned);
                                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion7.getConstructor();
                                        if (composer6.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor);
                                        } else {
                                            composer6.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer6);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion7.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion7.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion7.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion7.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        ImmutableList3 persistentList = extensions2.toPersistentList(sduiInstrumentChart.getHeader());
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i25 = BentoTheme.$stable;
                                        Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer6, i25).m21592getMediumD9Ej5fM(), 0.0f, 2, null), "stock_detail_chart_header");
                                        composer6.startReplaceGroup(1849434622);
                                        Object objRememberedValue16 = composer6.rememberedValue();
                                        if (objRememberedValue16 == companion5.getEmpty()) {
                                            objRememberedValue16 = InstrumentChartKt$InstrumentChart$1$5$1$1.INSTANCE;
                                            composer6.updateRememberedValue(objRememberedValue16);
                                        }
                                        composer6.endReplaceGroup();
                                        Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue16, 1, null);
                                        HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                        composer6.startReplaceGroup(-1772220517);
                                        constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component9;
                                        constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component4;
                                        constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component1;
                                        constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component6;
                                        composer6 = composer3;
                                        constraintLayoutScope2 = constraintLayoutScope4;
                                        SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierSemantics$default, null, actionHandler, horizontalPadding, arrangement.getTop(), companion6.getStart(), false, composer6, 100859904, 0);
                                        composer6.endReplaceGroup();
                                        Point pointInstrumentChart$lambda$15 = InstrumentChartKt.InstrumentChart$lambda$15(snapshotState4);
                                        composer6.startReplaceGroup(-1746271574);
                                        boolean zChanged2 = composer6.changed(pointInstrumentChart$lambda$15) | composer6.changed(z) | composer6.changed(str3);
                                        Object objRememberedValue17 = composer6.rememberedValue();
                                        if (zChanged2 || objRememberedValue17 == companion5.getEmpty()) {
                                            SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z && Intrinsics.areEqual(str3, DisplaySpan.DAY.getServerValue())), null, 2, null);
                                            composer6.updateRememberedValue(snapshotStateMutableStateOf$default);
                                            objRememberedValue17 = snapshotStateMutableStateOf$default;
                                        }
                                        SnapshotState snapshotState5 = (SnapshotState) objRememberedValue17;
                                        composer6.endReplaceGroup();
                                        composer6.startReplaceGroup(1849434622);
                                        Object objRememberedValue18 = composer6.rememberedValue();
                                        if (objRememberedValue18 == companion5.getEmpty()) {
                                            obj = null;
                                            c = 2;
                                            objRememberedValue18 = SnapshotState3.mutableStateOf$default(new CursorRowModifiers.ChartEducationTour(null, null, null, null, 15, null), null, 2, null);
                                            composer6.updateRememberedValue(objRememberedValue18);
                                        } else {
                                            obj = null;
                                            c = 2;
                                        }
                                        composer6.endReplaceGroup();
                                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, obj);
                                        CursorRowModifiers.ChartEducationTour chartEducationTourInstrumentChart$lambda$45$lambda$33$lambda$31 = InstrumentChartKt.InstrumentChart$lambda$45$lambda$33$lambda$31((SnapshotState) objRememberedValue18);
                                        Point pointInstrumentChart$lambda$152 = InstrumentChartKt.InstrumentChart$lambda$15(snapshotState4);
                                        if (pointInstrumentChart$lambda$152 == null || (defaultDisplay = pointInstrumentChart$lambda$152.getCursor_data()) == null) {
                                            defaultDisplay = sduiInstrumentChart.getDefaultDisplay();
                                        }
                                        SduiCursorData2.SduiCursorDataHeader(defaultDisplay, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, chartEducationTourInstrumentChart$lambda$45$lambda$33$lambda$31, ComposableLambda3.rememberComposableLambda(622026975, true, new InstrumentChartKt$InstrumentChart$1$5$2(sduiInstrumentChart, onPriceBookClicked, z10), composer6, 54), null, !InstrumentChartKt.InstrumentChart$lambda$45$lambda$33$lambda$29(snapshotState5), false, false, z6, composer6, (CursorRowModifiers.ChartEducationTour.$stable << 6) | 3072, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE);
                                        composer6.startReplaceGroup(-787799603);
                                        if (InstrumentChartKt.InstrumentChart$lambda$45$lambda$33$lambda$29(snapshotState5)) {
                                            bentoTheme = bentoTheme2;
                                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composer6, i25).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                                            companion2 = companion4;
                                            if (InstrumentChartKt.InstrumentChart$lambda$15(snapshotState4) != null) {
                                                modifierM5146paddingqDBjuR0$default2 = Alpha.alpha(modifierM5146paddingqDBjuR0$default2, 0.0f);
                                            }
                                            AdtChip.AdtChip(modifierM5146paddingqDBjuR0$default2, composer6, 0, 0);
                                        } else {
                                            companion2 = companion4;
                                            bentoTheme = bentoTheme2;
                                        }
                                        composer6.endReplaceGroup();
                                        composer6.endNode();
                                        if (z2) {
                                            i17 = helpersHashCode;
                                            i18 = 3;
                                            constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component5;
                                            constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component2;
                                            i19 = 0;
                                            i20 = 1;
                                        } else {
                                            composer6.startReplaceGroup(5004770);
                                            boolean zChanged3 = composer6.changed(constraintLayoutBaseScope4Component2);
                                            Object objRememberedValue19 = composer6.rememberedValue();
                                            if (zChanged3 || objRememberedValue19 == companion5.getEmpty()) {
                                                objRememberedValue19 = new InstrumentChartKt$InstrumentChart$1$6$1(constraintLayoutBaseScope4Component2);
                                                composer6.updateRememberedValue(objRememberedValue19);
                                            }
                                            composer6.endReplaceGroup();
                                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue19), 0.0f, composer6, 0, 1);
                                            constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component2;
                                            i17 = helpersHashCode;
                                            constraintLayoutScope2 = constraintLayoutScope2;
                                            i18 = 3;
                                            constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component5;
                                            i20 = 1;
                                            i19 = 0;
                                            BentoIconButton2.m20641BentoIconButtoncqYvz4g(onAdvancedButtonClicked, new BentoIconButton4.Icon.StandardSize16(ServerToBentoAssetMapper2.EXPAND_16), LocalityStringResources2.regionGateStringResource(EtfRegionGate.INSTANCE, C15314R.string.advanced_chart_tooltip_description, C15314R.string.advanced_chart_tooltip_description_without_etf, null, composer6, 0, 8), modifierM21623defaultHorizontalPaddingrAjV9yQ, BentoIconButton4.Type.Secondary, false, Color.m6701boximpl(bentoTheme.getColors(composer6, i25).m21425getFg0d7_KjU()), null, Color.m6701boximpl(bentoTheme.getColors(composer6, i25).m21427getFg30d7_KjU()), null, false, composer3, (BentoIconButton4.Icon.StandardSize16.$stable << 3) | 24576, 0, 1696);
                                            composer6 = composer3;
                                        }
                                        composer6.endReplaceGroup();
                                        Unit unit = Unit.INSTANCE;
                                    } else {
                                        composer6.startReplaceGroup(1711300410);
                                        Chart chart3 = chart2;
                                        if (chart3 == null || (legend_data = chart3.getLegend_data()) == null) {
                                            legendList = null;
                                        } else {
                                            Point pointInstrumentChart$lambda$153 = InstrumentChartKt.InstrumentChart$lambda$15(snapshotState4);
                                            Intrinsics.checkNotNull(pointInstrumentChart$lambda$153);
                                            legendList = UtilKt.getLegendList(legend_data, pointInstrumentChart$lambda$153);
                                        }
                                        if (legendList == null) {
                                            constraintLayoutBaseScope410 = constraintLayoutBaseScope4Component5;
                                            constraintLayoutBaseScope48 = constraintLayoutBaseScope4Component6;
                                            sduiInstrumentChart2 = chartState;
                                            composer4 = composer6;
                                            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
                                            i21 = 0;
                                            constraintLayoutBaseScope49 = constraintLayoutBaseScope4Component9;
                                            i22 = 1;
                                        } else {
                                            Modifier.Companion companion8 = Modifier.INSTANCE;
                                            composer6.startReplaceGroup(1849434622);
                                            Object objRememberedValue20 = composer6.rememberedValue();
                                            if (objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue20 = InstrumentChartKt$InstrumentChart$1$2$1$1.INSTANCE;
                                                composer6.updateRememberedValue(objRememberedValue20);
                                            }
                                            composer6.endReplaceGroup();
                                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(constraintLayoutScope4.constrainAs(companion8, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue20), 0.0f, ((Density) composer6.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(snapshotIntState2.getIntValue()), 1, null), 0.0f, 1, null);
                                            composer6.startReplaceGroup(1163604213);
                                            List<ChartLegendItem> list = legendList;
                                            constraintLayoutBaseScope48 = constraintLayoutBaseScope4Component6;
                                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                            for (ChartLegendItem chartLegendItem : list) {
                                                ThemedColor color = chartLegendItem.getColor();
                                                composer6.startReplaceGroup(1163607790);
                                                Color composeColor = color == null ? null : SduiColors2.toComposeColor(color, composer6, 0);
                                                composer6.endReplaceGroup();
                                                String title = chartLegendItem.getTitle();
                                                Color composeColor2 = SduiColors2.toComposeColor(chartLegendItem.getValue_color(), composer6, 0);
                                                Intrinsics.checkNotNull(composeColor2);
                                                arrayList.add(new LegendItem(chartLegendItem.getId(), composeColor, title, chartLegendItem.getValue(), composeColor2.getValue(), null, 32, null));
                                            }
                                            i21 = 0;
                                            composer6.endReplaceGroup();
                                            TextStyle textM = BentoTheme.INSTANCE.getTypography(composer6, BentoTheme.$stable).getTextM();
                                            sduiInstrumentChart2 = chartState;
                                            composer4 = composer6;
                                            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
                                            constraintLayoutBaseScope49 = constraintLayoutBaseScope4Component9;
                                            constraintLayoutBaseScope410 = constraintLayoutBaseScope4Component5;
                                            i22 = 1;
                                            CandlestickLegendChart.CandlestickLegendChart(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, textM, arrayList, 0, composer4, 0, 8);
                                            Unit unit2 = Unit.INSTANCE;
                                        }
                                        composer4.endReplaceGroup();
                                        i17 = helpersHashCode;
                                        constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component2;
                                        constraintLayoutBaseScope42 = constraintLayoutBaseScope49;
                                        constraintLayoutBaseScope45 = constraintLayoutBaseScope48;
                                        i19 = i21;
                                        constraintLayoutScope2 = constraintLayoutScope4;
                                        constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component4;
                                        i18 = 3;
                                        constraintLayoutBaseScope46 = constraintLayoutBaseScope410;
                                        composer6 = composer4;
                                        constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component1;
                                        i20 = i22;
                                    }
                                    ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr = new ConstraintLayoutBaseScope6[i18];
                                    constraintLayoutBaseScope6Arr[i19] = constraintLayoutBaseScope44;
                                    constraintLayoutBaseScope6Arr[i20] = constraintLayoutBaseScope47;
                                    constraintLayoutBaseScope6Arr[2] = constraintLayoutBaseScope4;
                                    ConstraintLayoutScope constraintLayoutScope5 = constraintLayoutScope2;
                                    ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope5, constraintLayoutBaseScope6Arr, 0.0f, 2, null);
                                    Modifier.Companion companion9 = Modifier.INSTANCE;
                                    composer6.startReplaceGroup(5004770);
                                    boolean zChanged4 = composer6.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                                    Object objRememberedValue21 = composer6.rememberedValue();
                                    if (zChanged4 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue21 = new InstrumentChartKt$InstrumentChart$1$7$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                                        composer6.updateRememberedValue(objRememberedValue21);
                                    }
                                    composer6.endReplaceGroup();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope412 = constraintLayoutBaseScope43;
                                    int i26 = i19;
                                    SduiCursorData2.SduiLabelTrack(constraintLayoutScope5.constrainAs(companion9, constraintLayoutBaseScope412, (Function1) objRememberedValue21), InstrumentChartKt.InstrumentChart$lambda$15(snapshotState4), composer6, i26, i26);
                                    Chart chart4 = chart2;
                                    if (chart4 == null || (listEmptyList = chart4.getLines()) == null) {
                                        listEmptyList = CollectionsKt.emptyList();
                                    }
                                    Chart chart5 = chart2;
                                    if (chart5 == null || (listEmptyList2 = chart5.getFills()) == null) {
                                        listEmptyList2 = CollectionsKt.emptyList();
                                    }
                                    SduiInstrumentChart sduiInstrumentChart3 = sduiInstrumentChart;
                                    if (sduiInstrumentChart3 == null || (listEmptyList3 = sduiInstrumentChart3.getOverlays()) == null) {
                                        listEmptyList3 = CollectionsKt.emptyList();
                                    }
                                    int i27 = InstrumentChartKt.WhenMappings.$EnumSwitchMapping$0[sduiInstrumentChart2.ordinal()];
                                    if (i27 == i20 || i27 == 2) {
                                        List<Line> list2 = listEmptyList;
                                        composer6.startReplaceGroup(1716946936);
                                        Modifier modifier6 = InstrumentChartKt.chartModifier;
                                        composer6.startReplaceGroup(5004770);
                                        boolean zChanged5 = composer6.changed(constraintLayoutBaseScope412);
                                        Object objRememberedValue22 = composer6.rememberedValue();
                                        if (zChanged5 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue22 = new InstrumentChartKt$InstrumentChart$1$8$1(constraintLayoutBaseScope412);
                                            composer6.updateRememberedValue(objRememberedValue22);
                                        }
                                        composer6.endReplaceGroup();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope413 = constraintLayoutBaseScope45;
                                        Modifier modifierConstrainAs2 = constraintLayoutScope5.constrainAs(modifier6, constraintLayoutBaseScope413, (Function1) objRememberedValue22);
                                        composer6.startReplaceGroup(5004770);
                                        Object objRememberedValue23 = composer6.rememberedValue();
                                        Composer.Companion companion10 = Composer.INSTANCE;
                                        if (objRememberedValue23 == companion10.getEmpty()) {
                                            objRememberedValue23 = new InstrumentChartKt$InstrumentChart$1$9$1(snapshotState4);
                                            composer6.updateRememberedValue(objRememberedValue23);
                                        }
                                        Function1 function1 = (Function1) objRememberedValue23;
                                        composer6.endReplaceGroup();
                                        composer6.startReplaceGroup(5004770);
                                        Object objRememberedValue24 = composer6.rememberedValue();
                                        if (objRememberedValue24 == companion10.getEmpty()) {
                                            objRememberedValue24 = new InstrumentChartKt$InstrumentChart$1$10$1(snapshotState4);
                                            composer6.updateRememberedValue(objRememberedValue24);
                                        }
                                        Function0 function02 = (Function0) objRememberedValue24;
                                        composer6.endReplaceGroup();
                                        boolean z11 = sduiInstrumentChart2 == SduiInstrumentChart2.EMPTY_WITH_OVERLAYS;
                                        composer6.startReplaceGroup(977840936);
                                        List listEmptyList4 = CollectionsKt.emptyList();
                                        composer6.startReplaceGroup(1849434622);
                                        Object objRememberedValue25 = composer6.rememberedValue();
                                        if (objRememberedValue25 == companion10.getEmpty()) {
                                            objRememberedValue25 = C15449x534b4b90.INSTANCE;
                                            composer6.updateRememberedValue(objRememberedValue25);
                                        }
                                        composer6.endReplaceGroup();
                                        constraintLayoutBaseScope411 = constraintLayoutBaseScope413;
                                        constraintLayoutScope3 = constraintLayoutScope5;
                                        i23 = 2;
                                        composer5 = composer3;
                                        SduiChartMappersKt.SduiSegmentedLineChart(modifierConstrainAs2, listEmptyList4, list2, listEmptyList3, actionHandler, (Function1) objRememberedValue25, function1, function02, z11, true, null, 0.0f, GenericAction.class, composer5, 14155776, 0, 0);
                                        composer5.endReplaceGroup();
                                        composer5.endReplaceGroup();
                                        i24 = 3;
                                    } else {
                                        if (i27 == i18) {
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope414 = constraintLayoutBaseScope42;
                                            composer6.startReplaceGroup(1717748906);
                                            Modifier modifier7 = InstrumentChartKt.chartModifier;
                                            composer6.startReplaceGroup(5004770);
                                            boolean zChanged6 = composer6.changed(constraintLayoutBaseScope412);
                                            Object objRememberedValue26 = composer6.rememberedValue();
                                            if (zChanged6 || objRememberedValue26 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue26 = new InstrumentChartKt$InstrumentChart$1$11$1(constraintLayoutBaseScope412);
                                                composer6.updateRememberedValue(objRememberedValue26);
                                            }
                                            composer6.endReplaceGroup();
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope415 = constraintLayoutBaseScope46;
                                            Modifier modifierConstrainAs3 = constraintLayoutScope5.constrainAs(modifier7, constraintLayoutBaseScope415, (Function1) objRememberedValue26);
                                            Chart chart6 = chart2;
                                            if (chart6 == null || (legend_data2 = chart6.getLegend_data()) == null || (setKeySet = legend_data2.keySet()) == null) {
                                                setEmptySet = SetsKt.emptySet();
                                                List<Line> list3 = listEmptyList;
                                                List<ChartFill> list4 = listEmptyList2;
                                                SduiActionHandler sduiActionHandler = actionHandler;
                                                composer6.startReplaceGroup(5004770);
                                                objRememberedValue11 = composer6.rememberedValue();
                                                companion3 = Composer.INSTANCE;
                                                if (objRememberedValue11 == companion3.getEmpty()) {
                                                    objRememberedValue11 = new InstrumentChartKt$InstrumentChart$1$13$1(snapshotState4);
                                                    composer6.updateRememberedValue(objRememberedValue11);
                                                }
                                                Function1 function12 = (Function1) objRememberedValue11;
                                                composer6.endReplaceGroup();
                                                composer6.startReplaceGroup(5004770);
                                                objRememberedValue12 = composer6.rememberedValue();
                                                if (objRememberedValue12 == companion3.getEmpty()) {
                                                    objRememberedValue12 = new InstrumentChartKt$InstrumentChart$1$14$1(snapshotState4);
                                                    composer6.updateRememberedValue(objRememberedValue12);
                                                }
                                                composer6.endReplaceGroup();
                                                constraintLayoutBaseScope42 = constraintLayoutBaseScope414;
                                                constraintLayoutBaseScope46 = constraintLayoutBaseScope415;
                                                SduiChartMappersKt.SduiCandlestickChart(modifierConstrainAs3, list4, list3, setEmptySet, sduiActionHandler, false, function12, (Function0) objRememberedValue12, false, composer6, 14155776, 288);
                                                composer6.endReplaceGroup();
                                                Unit unit3 = Unit.INSTANCE;
                                                constraintLayoutScope3 = constraintLayoutScope5;
                                                constraintLayoutBaseScope411 = constraintLayoutBaseScope45;
                                                i23 = 2;
                                                i24 = 3;
                                            } else {
                                                Set<String> set = setKeySet;
                                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                                                Iterator<T> it = set.iterator();
                                                while (it.hasNext()) {
                                                    arrayList2.add(Float.valueOf(Float.parseFloat((String) it.next())));
                                                }
                                                setEmptySet = CollectionsKt.toSet(arrayList2);
                                                if (setEmptySet == null) {
                                                }
                                                List<Line> list32 = listEmptyList;
                                                List<ChartFill> list42 = listEmptyList2;
                                                SduiActionHandler sduiActionHandler2 = actionHandler;
                                                composer6.startReplaceGroup(5004770);
                                                objRememberedValue11 = composer6.rememberedValue();
                                                companion3 = Composer.INSTANCE;
                                                if (objRememberedValue11 == companion3.getEmpty()) {
                                                }
                                                Function1 function122 = (Function1) objRememberedValue11;
                                                composer6.endReplaceGroup();
                                                composer6.startReplaceGroup(5004770);
                                                objRememberedValue12 = composer6.rememberedValue();
                                                if (objRememberedValue12 == companion3.getEmpty()) {
                                                }
                                                composer6.endReplaceGroup();
                                                constraintLayoutBaseScope42 = constraintLayoutBaseScope414;
                                                constraintLayoutBaseScope46 = constraintLayoutBaseScope415;
                                                SduiChartMappersKt.SduiCandlestickChart(modifierConstrainAs3, list42, list32, setEmptySet, sduiActionHandler2, false, function122, (Function0) objRememberedValue12, false, composer6, 14155776, 288);
                                                composer6.endReplaceGroup();
                                                Unit unit32 = Unit.INSTANCE;
                                                constraintLayoutScope3 = constraintLayoutScope5;
                                                constraintLayoutBaseScope411 = constraintLayoutBaseScope45;
                                                i23 = 2;
                                                i24 = 3;
                                            }
                                        } else {
                                            if (i27 != 4) {
                                                composer6.startReplaceGroup(1163763288);
                                                composer6.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer6.startReplaceGroup(1718523317);
                                            Modifier modifier8 = InstrumentChartKt.chartModifier;
                                            composer6.startReplaceGroup(5004770);
                                            boolean zChanged7 = composer6.changed(constraintLayoutBaseScope412);
                                            Object objRememberedValue27 = composer6.rememberedValue();
                                            if (zChanged7 || objRememberedValue27 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue27 = new InstrumentChartKt$InstrumentChart$1$15$1(constraintLayoutBaseScope412);
                                                composer6.updateRememberedValue(objRememberedValue27);
                                            }
                                            composer6.endReplaceGroup();
                                            Placeholders2.ChartPlaceholder(constraintLayoutScope5.constrainAs(modifier8, constraintLayoutBaseScope42, (Function1) objRememberedValue27), false, composer6, 0, 2);
                                            composer6.endReplaceGroup();
                                            i24 = i18;
                                            i23 = 2;
                                            constraintLayoutScope3 = constraintLayoutScope5;
                                            constraintLayoutBaseScope411 = constraintLayoutBaseScope45;
                                        }
                                        composer5 = composer6;
                                    }
                                    ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr2 = new ConstraintLayoutBaseScope6[i24];
                                    constraintLayoutBaseScope6Arr2[0] = constraintLayoutBaseScope411;
                                    constraintLayoutBaseScope6Arr2[1] = constraintLayoutBaseScope46;
                                    constraintLayoutBaseScope6Arr2[i23] = constraintLayoutBaseScope42;
                                    ConstraintLayoutScope constraintLayoutScope6 = constraintLayoutScope3;
                                    ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope6, constraintLayoutBaseScope6Arr2, 0.0f, i23, null);
                                    if (str3 == null || instrumentChartSpans3 == null) {
                                        composer5.startReplaceGroup(1718984535);
                                        Modifier.Companion companion11 = Modifier.INSTANCE;
                                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                        int i28 = BentoTheme.$stable;
                                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion11, 0.0f, bentoTheme3.getSpacing(composer5, i28).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme3.getSpacing(composer5, i28).m21593getSmallD9Ej5fM(), 5, null), 0.0f, 1, null);
                                        composer5.startReplaceGroup(5004770);
                                        boolean zChanged8 = composer5.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                                        Object objRememberedValue28 = composer5.rememberedValue();
                                        if (zChanged8 || objRememberedValue28 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue28 = new InstrumentChartKt$InstrumentChart$1$16$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                                            composer5.updateRememberedValue(objRememberedValue28);
                                        }
                                        composer5.endReplaceGroup();
                                        BoxKt.Box(com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope6.constrainAs(modifierFillMaxWidth$default2, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue28), 0.0f, composer5, 0, 1), bentoTheme3.getSpacing(composer5, i28).m21594getXlargeD9Ej5fM()), true, null, i23, null), composer5, 0);
                                        composer5.endReplaceGroup();
                                    } else {
                                        composer5.startReplaceGroup(1719687615);
                                        SduiInstrumentChart sduiInstrumentChart4 = sduiInstrumentChart;
                                        if (sduiInstrumentChart4 == null || (pageDirection = sduiInstrumentChart4.getPageDirection()) == null) {
                                            pageDirection = Direction.f5855UP;
                                        }
                                        int i29 = InstrumentChartKt.WhenMappings.$EnumSwitchMapping$1[pageDirection.ordinal()];
                                        if (i29 == 1) {
                                            bentoTheme4 = BentoTheme4.POSITIVE;
                                        } else {
                                            if (i29 != i23) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bentoTheme4 = BentoTheme4.NEGATIVE;
                                        }
                                        BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4, ComposableLambda3.rememberComposableLambda(-774781988, true, new InstrumentChartKt$InstrumentChart$1$17(constraintLayoutScope6, constraintLayoutBaseScope4Component7, horizontalAnchorM8136createBottomBarrier3ABfNKs$default2, z2, instrumentChartSpans3, str3, onSpanChanged, onChartSettingsClicked, z3, onAdvancedButtonClicked), composer5, 54), composer5, 48);
                                        composer5.endReplaceGroup();
                                    }
                                    composer5.endReplaceGroup();
                                    if (constraintLayoutScope.getHelpersHashCode() != i17) {
                                        EffectsKt.SideEffect(function0, composer5, 6);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), measurePolicy, composer2, 48, 0);
                            composer2.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z7 = z10;
                            modifier3 = modifier5;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return InstrumentChartKt.InstrumentChart$lambda$46(modifier3, sduiInstrumentChart, instrumentChartSpans, str, z, actionHandler, onSpanChanged, onChartSettingsClicked, onPriceBookClicked, onAdvancedButtonClicked, z2, z3, z7, z6, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= i11;
                    if ((i3 & 1024) != 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    int i132 = i5;
                    i6 = i3 & 4096;
                    if (i6 != 0) {
                    }
                    i8 = i3 & 8192;
                    if (i8 != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                        if (i12 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i8 == 0) {
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
                        if (sduiInstrumentChart == null) {
                        }
                        composerStartRestartGroup.startReplaceGroup(-1003410150);
                        composerStartRestartGroup.startReplaceGroup(212064437);
                        composerStartRestartGroup.endReplaceGroup();
                        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
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
                        i10 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                        zChanged = zChangedInstance22 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue8 = new MeasurePolicy() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$InstrumentChart$$inlined$ConstraintLayout$2
                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i16);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i16);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i16);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i16);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                                    final Map linkedHashMap = new LinkedHashMap();
                                    snapshotState2.getValue();
                                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i10);
                                    snapshotState.getValue();
                                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                    final Measurer2 measurer22 = measurer2;
                                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$InstrumentChart$$inlined$ConstraintLayout$2.1
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
                                objRememberedValue10 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$InstrumentChart$$inlined$ConstraintLayout$4
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
                                Modifier modifier52 = modifier4;
                                final Chart chart22 = chart;
                                final boolean z102 = z8;
                                final String str32 = str2;
                                z6 = z9;
                                final InstrumentChartSpans instrumentChartSpans32 = instrumentChartSpans2;
                                composer2 = composerStartRestartGroup;
                                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue10, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$InstrumentChart$$inlined$ConstraintLayout$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:160:0x0699  */
                                    /* JADX WARN: Removed duplicated region for block: B:163:0x06af  */
                                    /* JADX WARN: Removed duplicated region for block: B:166:0x06cb  */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke(Composer composer3, int i16) {
                                        SduiInstrumentChart2 sduiInstrumentChart2;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope44;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope45;
                                        ConstraintLayoutScope constraintLayoutScope22;
                                        Object obj;
                                        char c;
                                        CursorData defaultDisplay;
                                        Modifier.Companion companion2;
                                        BentoTheme bentoTheme;
                                        int i17;
                                        int i18;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope46;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope47;
                                        int i19;
                                        int i20;
                                        List<ChartLegendItem> legendList;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope48;
                                        int i21;
                                        Composer composer4;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope49;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope410;
                                        int i22;
                                        Map<String, List<ChartLegendItem>> legend_data;
                                        List<Line> listEmptyList;
                                        List<ChartFill> listEmptyList2;
                                        List<UIComponent<GenericAction>> listEmptyList3;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope411;
                                        ConstraintLayoutScope constraintLayoutScope3;
                                        int i23;
                                        Composer composer5;
                                        int i24;
                                        Direction pageDirection;
                                        BentoTheme4 bentoTheme4;
                                        Set setEmptySet;
                                        Object objRememberedValue11;
                                        Composer.Companion companion3;
                                        Object objRememberedValue12;
                                        Map<String, List<ChartLegendItem>> legend_data2;
                                        Set<String> setKeySet;
                                        Composer composer6 = composer3;
                                        if ((i16 & 3) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1200550679, i16, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                        }
                                        snapshotState2.setValue(Unit.INSTANCE);
                                        int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                        constraintLayoutScope2.reset();
                                        ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope2;
                                        composer6.startReplaceGroup(1710810859);
                                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope4.createRefs();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component9 = constrainedLayoutReferencesCreateRefs.component9();
                                        SduiInstrumentChart2 chartState = SduiInstrumentChart3.getChartState(sduiInstrumentChart);
                                        if (sduiInstrumentChart == null) {
                                            composer6.startReplaceGroup(1710789313);
                                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer6, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                            composer6.startReplaceGroup(1849434622);
                                            Object objRememberedValue13 = composer6.rememberedValue();
                                            if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue13 = InstrumentChartKt$InstrumentChart$1$1$1.INSTANCE;
                                                composer6.updateRememberedValue(objRememberedValue13);
                                            }
                                            composer6.endReplaceGroup();
                                            InstrumentChartKt.ChartHeaderPlaceholder(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(constraintLayoutScope4.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue13), 0.0f, 1, null), composer6, 0);
                                            composer6.endReplaceGroup();
                                            i17 = helpersHashCode;
                                            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component9;
                                            constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component5;
                                            constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component6;
                                            sduiInstrumentChart2 = chartState;
                                            i20 = 1;
                                            constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component2;
                                            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
                                            constraintLayoutScope22 = constraintLayoutScope4;
                                            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component4;
                                            i18 = 3;
                                            i19 = 0;
                                            constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component1;
                                        } else if (chartState != SduiInstrumentChart2.CANDLESTICK || InstrumentChartKt.InstrumentChart$lambda$15(snapshotState42) == null) {
                                            sduiInstrumentChart2 = chartState;
                                            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
                                            composer6.startReplaceGroup(1712711716);
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            composer6.startReplaceGroup(1849434622);
                                            Object objRememberedValue14 = composer6.rememberedValue();
                                            Composer.Companion companion5 = Composer.INSTANCE;
                                            if (objRememberedValue14 == companion5.getEmpty()) {
                                                objRememberedValue14 = InstrumentChartKt$InstrumentChart$1$3$1.INSTANCE;
                                                composer6.updateRememberedValue(objRememberedValue14);
                                            }
                                            composer6.endReplaceGroup();
                                            Modifier modifierConstrainAs = constraintLayoutScope4.constrainAs(companion4, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue14);
                                            composer6.startReplaceGroup(5004770);
                                            Object objRememberedValue15 = composer6.rememberedValue();
                                            if (objRememberedValue15 == companion5.getEmpty()) {
                                                objRememberedValue15 = new InstrumentChartKt$InstrumentChart$1$4$1(snapshotIntState22);
                                                composer6.updateRememberedValue(objRememberedValue15);
                                            }
                                            composer6.endReplaceGroup();
                                            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs, (Function1) objRememberedValue15);
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            Arrangement.Vertical top = arrangement.getTop();
                                            Alignment.Companion companion6 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion6.getStart(), composer6, 0);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer6, modifierOnGloballyPositioned);
                                            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion7.getConstructor();
                                            if (composer6.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor);
                                            } else {
                                                composer6.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer6);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion7.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion7.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion7.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion7.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            ImmutableList3 persistentList = extensions2.toPersistentList(sduiInstrumentChart.getHeader());
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                            int i25 = BentoTheme.$stable;
                                            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer6, i25).m21592getMediumD9Ej5fM(), 0.0f, 2, null), "stock_detail_chart_header");
                                            composer6.startReplaceGroup(1849434622);
                                            Object objRememberedValue16 = composer6.rememberedValue();
                                            if (objRememberedValue16 == companion5.getEmpty()) {
                                                objRememberedValue16 = InstrumentChartKt$InstrumentChart$1$5$1$1.INSTANCE;
                                                composer6.updateRememberedValue(objRememberedValue16);
                                            }
                                            composer6.endReplaceGroup();
                                            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue16, 1, null);
                                            HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                            composer6.startReplaceGroup(-1772220517);
                                            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component9;
                                            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component4;
                                            constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component1;
                                            constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component6;
                                            composer6 = composer3;
                                            constraintLayoutScope22 = constraintLayoutScope4;
                                            SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierSemantics$default, null, actionHandler, horizontalPadding, arrangement.getTop(), companion6.getStart(), false, composer6, 100859904, 0);
                                            composer6.endReplaceGroup();
                                            Point pointInstrumentChart$lambda$15 = InstrumentChartKt.InstrumentChart$lambda$15(snapshotState42);
                                            composer6.startReplaceGroup(-1746271574);
                                            boolean zChanged2 = composer6.changed(pointInstrumentChart$lambda$15) | composer6.changed(z) | composer6.changed(str32);
                                            Object objRememberedValue17 = composer6.rememberedValue();
                                            if (zChanged2 || objRememberedValue17 == companion5.getEmpty()) {
                                                SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z && Intrinsics.areEqual(str32, DisplaySpan.DAY.getServerValue())), null, 2, null);
                                                composer6.updateRememberedValue(snapshotStateMutableStateOf$default);
                                                objRememberedValue17 = snapshotStateMutableStateOf$default;
                                            }
                                            SnapshotState snapshotState5 = (SnapshotState) objRememberedValue17;
                                            composer6.endReplaceGroup();
                                            composer6.startReplaceGroup(1849434622);
                                            Object objRememberedValue18 = composer6.rememberedValue();
                                            if (objRememberedValue18 == companion5.getEmpty()) {
                                                obj = null;
                                                c = 2;
                                                objRememberedValue18 = SnapshotState3.mutableStateOf$default(new CursorRowModifiers.ChartEducationTour(null, null, null, null, 15, null), null, 2, null);
                                                composer6.updateRememberedValue(objRememberedValue18);
                                            } else {
                                                obj = null;
                                                c = 2;
                                            }
                                            composer6.endReplaceGroup();
                                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, obj);
                                            CursorRowModifiers.ChartEducationTour chartEducationTourInstrumentChart$lambda$45$lambda$33$lambda$31 = InstrumentChartKt.InstrumentChart$lambda$45$lambda$33$lambda$31((SnapshotState) objRememberedValue18);
                                            Point pointInstrumentChart$lambda$152 = InstrumentChartKt.InstrumentChart$lambda$15(snapshotState42);
                                            if (pointInstrumentChart$lambda$152 == null || (defaultDisplay = pointInstrumentChart$lambda$152.getCursor_data()) == null) {
                                                defaultDisplay = sduiInstrumentChart.getDefaultDisplay();
                                            }
                                            SduiCursorData2.SduiCursorDataHeader(defaultDisplay, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, chartEducationTourInstrumentChart$lambda$45$lambda$33$lambda$31, ComposableLambda3.rememberComposableLambda(622026975, true, new InstrumentChartKt$InstrumentChart$1$5$2(sduiInstrumentChart, onPriceBookClicked, z102), composer6, 54), null, !InstrumentChartKt.InstrumentChart$lambda$45$lambda$33$lambda$29(snapshotState5), false, false, z6, composer6, (CursorRowModifiers.ChartEducationTour.$stable << 6) | 3072, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE);
                                            composer6.startReplaceGroup(-787799603);
                                            if (InstrumentChartKt.InstrumentChart$lambda$45$lambda$33$lambda$29(snapshotState5)) {
                                                bentoTheme = bentoTheme2;
                                                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composer6, i25).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                                                companion2 = companion4;
                                                if (InstrumentChartKt.InstrumentChart$lambda$15(snapshotState42) != null) {
                                                    modifierM5146paddingqDBjuR0$default2 = Alpha.alpha(modifierM5146paddingqDBjuR0$default2, 0.0f);
                                                }
                                                AdtChip.AdtChip(modifierM5146paddingqDBjuR0$default2, composer6, 0, 0);
                                            } else {
                                                companion2 = companion4;
                                                bentoTheme = bentoTheme2;
                                            }
                                            composer6.endReplaceGroup();
                                            composer6.endNode();
                                            if (z2) {
                                                i17 = helpersHashCode;
                                                i18 = 3;
                                                constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component5;
                                                constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component2;
                                                i19 = 0;
                                                i20 = 1;
                                            } else {
                                                composer6.startReplaceGroup(5004770);
                                                boolean zChanged3 = composer6.changed(constraintLayoutBaseScope4Component2);
                                                Object objRememberedValue19 = composer6.rememberedValue();
                                                if (zChanged3 || objRememberedValue19 == companion5.getEmpty()) {
                                                    objRememberedValue19 = new InstrumentChartKt$InstrumentChart$1$6$1(constraintLayoutBaseScope4Component2);
                                                    composer6.updateRememberedValue(objRememberedValue19);
                                                }
                                                composer6.endReplaceGroup();
                                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue19), 0.0f, composer6, 0, 1);
                                                constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component2;
                                                i17 = helpersHashCode;
                                                constraintLayoutScope22 = constraintLayoutScope22;
                                                i18 = 3;
                                                constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component5;
                                                i20 = 1;
                                                i19 = 0;
                                                BentoIconButton2.m20641BentoIconButtoncqYvz4g(onAdvancedButtonClicked, new BentoIconButton4.Icon.StandardSize16(ServerToBentoAssetMapper2.EXPAND_16), LocalityStringResources2.regionGateStringResource(EtfRegionGate.INSTANCE, C15314R.string.advanced_chart_tooltip_description, C15314R.string.advanced_chart_tooltip_description_without_etf, null, composer6, 0, 8), modifierM21623defaultHorizontalPaddingrAjV9yQ, BentoIconButton4.Type.Secondary, false, Color.m6701boximpl(bentoTheme.getColors(composer6, i25).m21425getFg0d7_KjU()), null, Color.m6701boximpl(bentoTheme.getColors(composer6, i25).m21427getFg30d7_KjU()), null, false, composer3, (BentoIconButton4.Icon.StandardSize16.$stable << 3) | 24576, 0, 1696);
                                                composer6 = composer3;
                                            }
                                            composer6.endReplaceGroup();
                                            Unit unit = Unit.INSTANCE;
                                        } else {
                                            composer6.startReplaceGroup(1711300410);
                                            Chart chart3 = chart22;
                                            if (chart3 == null || (legend_data = chart3.getLegend_data()) == null) {
                                                legendList = null;
                                            } else {
                                                Point pointInstrumentChart$lambda$153 = InstrumentChartKt.InstrumentChart$lambda$15(snapshotState42);
                                                Intrinsics.checkNotNull(pointInstrumentChart$lambda$153);
                                                legendList = UtilKt.getLegendList(legend_data, pointInstrumentChart$lambda$153);
                                            }
                                            if (legendList == null) {
                                                constraintLayoutBaseScope410 = constraintLayoutBaseScope4Component5;
                                                constraintLayoutBaseScope48 = constraintLayoutBaseScope4Component6;
                                                sduiInstrumentChart2 = chartState;
                                                composer4 = composer6;
                                                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
                                                i21 = 0;
                                                constraintLayoutBaseScope49 = constraintLayoutBaseScope4Component9;
                                                i22 = 1;
                                            } else {
                                                Modifier.Companion companion8 = Modifier.INSTANCE;
                                                composer6.startReplaceGroup(1849434622);
                                                Object objRememberedValue20 = composer6.rememberedValue();
                                                if (objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue20 = InstrumentChartKt$InstrumentChart$1$2$1$1.INSTANCE;
                                                    composer6.updateRememberedValue(objRememberedValue20);
                                                }
                                                composer6.endReplaceGroup();
                                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(constraintLayoutScope4.constrainAs(companion8, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue20), 0.0f, ((Density) composer6.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(snapshotIntState22.getIntValue()), 1, null), 0.0f, 1, null);
                                                composer6.startReplaceGroup(1163604213);
                                                List<ChartLegendItem> list = legendList;
                                                constraintLayoutBaseScope48 = constraintLayoutBaseScope4Component6;
                                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                                for (ChartLegendItem chartLegendItem : list) {
                                                    ThemedColor color = chartLegendItem.getColor();
                                                    composer6.startReplaceGroup(1163607790);
                                                    Color composeColor = color == null ? null : SduiColors2.toComposeColor(color, composer6, 0);
                                                    composer6.endReplaceGroup();
                                                    String title = chartLegendItem.getTitle();
                                                    Color composeColor2 = SduiColors2.toComposeColor(chartLegendItem.getValue_color(), composer6, 0);
                                                    Intrinsics.checkNotNull(composeColor2);
                                                    arrayList.add(new LegendItem(chartLegendItem.getId(), composeColor, title, chartLegendItem.getValue(), composeColor2.getValue(), null, 32, null));
                                                }
                                                i21 = 0;
                                                composer6.endReplaceGroup();
                                                TextStyle textM = BentoTheme.INSTANCE.getTypography(composer6, BentoTheme.$stable).getTextM();
                                                sduiInstrumentChart2 = chartState;
                                                composer4 = composer6;
                                                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
                                                constraintLayoutBaseScope49 = constraintLayoutBaseScope4Component9;
                                                constraintLayoutBaseScope410 = constraintLayoutBaseScope4Component5;
                                                i22 = 1;
                                                CandlestickLegendChart.CandlestickLegendChart(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, textM, arrayList, 0, composer4, 0, 8);
                                                Unit unit2 = Unit.INSTANCE;
                                            }
                                            composer4.endReplaceGroup();
                                            i17 = helpersHashCode;
                                            constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component2;
                                            constraintLayoutBaseScope42 = constraintLayoutBaseScope49;
                                            constraintLayoutBaseScope45 = constraintLayoutBaseScope48;
                                            i19 = i21;
                                            constraintLayoutScope22 = constraintLayoutScope4;
                                            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component4;
                                            i18 = 3;
                                            constraintLayoutBaseScope46 = constraintLayoutBaseScope410;
                                            composer6 = composer4;
                                            constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component1;
                                            i20 = i22;
                                        }
                                        ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr = new ConstraintLayoutBaseScope6[i18];
                                        constraintLayoutBaseScope6Arr[i19] = constraintLayoutBaseScope44;
                                        constraintLayoutBaseScope6Arr[i20] = constraintLayoutBaseScope47;
                                        constraintLayoutBaseScope6Arr[2] = constraintLayoutBaseScope4;
                                        ConstraintLayoutScope constraintLayoutScope5 = constraintLayoutScope22;
                                        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope5, constraintLayoutBaseScope6Arr, 0.0f, 2, null);
                                        Modifier.Companion companion9 = Modifier.INSTANCE;
                                        composer6.startReplaceGroup(5004770);
                                        boolean zChanged4 = composer6.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                                        Object objRememberedValue21 = composer6.rememberedValue();
                                        if (zChanged4 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue21 = new InstrumentChartKt$InstrumentChart$1$7$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                                            composer6.updateRememberedValue(objRememberedValue21);
                                        }
                                        composer6.endReplaceGroup();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope412 = constraintLayoutBaseScope43;
                                        int i26 = i19;
                                        SduiCursorData2.SduiLabelTrack(constraintLayoutScope5.constrainAs(companion9, constraintLayoutBaseScope412, (Function1) objRememberedValue21), InstrumentChartKt.InstrumentChart$lambda$15(snapshotState42), composer6, i26, i26);
                                        Chart chart4 = chart22;
                                        if (chart4 == null || (listEmptyList = chart4.getLines()) == null) {
                                            listEmptyList = CollectionsKt.emptyList();
                                        }
                                        Chart chart5 = chart22;
                                        if (chart5 == null || (listEmptyList2 = chart5.getFills()) == null) {
                                            listEmptyList2 = CollectionsKt.emptyList();
                                        }
                                        SduiInstrumentChart sduiInstrumentChart3 = sduiInstrumentChart;
                                        if (sduiInstrumentChart3 == null || (listEmptyList3 = sduiInstrumentChart3.getOverlays()) == null) {
                                            listEmptyList3 = CollectionsKt.emptyList();
                                        }
                                        int i27 = InstrumentChartKt.WhenMappings.$EnumSwitchMapping$0[sduiInstrumentChart2.ordinal()];
                                        if (i27 == i20 || i27 == 2) {
                                            List<Line> list2 = listEmptyList;
                                            composer6.startReplaceGroup(1716946936);
                                            Modifier modifier6 = InstrumentChartKt.chartModifier;
                                            composer6.startReplaceGroup(5004770);
                                            boolean zChanged5 = composer6.changed(constraintLayoutBaseScope412);
                                            Object objRememberedValue22 = composer6.rememberedValue();
                                            if (zChanged5 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue22 = new InstrumentChartKt$InstrumentChart$1$8$1(constraintLayoutBaseScope412);
                                                composer6.updateRememberedValue(objRememberedValue22);
                                            }
                                            composer6.endReplaceGroup();
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope413 = constraintLayoutBaseScope45;
                                            Modifier modifierConstrainAs2 = constraintLayoutScope5.constrainAs(modifier6, constraintLayoutBaseScope413, (Function1) objRememberedValue22);
                                            composer6.startReplaceGroup(5004770);
                                            Object objRememberedValue23 = composer6.rememberedValue();
                                            Composer.Companion companion10 = Composer.INSTANCE;
                                            if (objRememberedValue23 == companion10.getEmpty()) {
                                                objRememberedValue23 = new InstrumentChartKt$InstrumentChart$1$9$1(snapshotState42);
                                                composer6.updateRememberedValue(objRememberedValue23);
                                            }
                                            Function1 function1 = (Function1) objRememberedValue23;
                                            composer6.endReplaceGroup();
                                            composer6.startReplaceGroup(5004770);
                                            Object objRememberedValue24 = composer6.rememberedValue();
                                            if (objRememberedValue24 == companion10.getEmpty()) {
                                                objRememberedValue24 = new InstrumentChartKt$InstrumentChart$1$10$1(snapshotState42);
                                                composer6.updateRememberedValue(objRememberedValue24);
                                            }
                                            Function0 function022 = (Function0) objRememberedValue24;
                                            composer6.endReplaceGroup();
                                            boolean z11 = sduiInstrumentChart2 == SduiInstrumentChart2.EMPTY_WITH_OVERLAYS;
                                            composer6.startReplaceGroup(977840936);
                                            List listEmptyList4 = CollectionsKt.emptyList();
                                            composer6.startReplaceGroup(1849434622);
                                            Object objRememberedValue25 = composer6.rememberedValue();
                                            if (objRememberedValue25 == companion10.getEmpty()) {
                                                objRememberedValue25 = C15449x534b4b90.INSTANCE;
                                                composer6.updateRememberedValue(objRememberedValue25);
                                            }
                                            composer6.endReplaceGroup();
                                            constraintLayoutBaseScope411 = constraintLayoutBaseScope413;
                                            constraintLayoutScope3 = constraintLayoutScope5;
                                            i23 = 2;
                                            composer5 = composer3;
                                            SduiChartMappersKt.SduiSegmentedLineChart(modifierConstrainAs2, listEmptyList4, list2, listEmptyList3, actionHandler, (Function1) objRememberedValue25, function1, function022, z11, true, null, 0.0f, GenericAction.class, composer5, 14155776, 0, 0);
                                            composer5.endReplaceGroup();
                                            composer5.endReplaceGroup();
                                            i24 = 3;
                                        } else {
                                            if (i27 == i18) {
                                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope414 = constraintLayoutBaseScope42;
                                                composer6.startReplaceGroup(1717748906);
                                                Modifier modifier7 = InstrumentChartKt.chartModifier;
                                                composer6.startReplaceGroup(5004770);
                                                boolean zChanged6 = composer6.changed(constraintLayoutBaseScope412);
                                                Object objRememberedValue26 = composer6.rememberedValue();
                                                if (zChanged6 || objRememberedValue26 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue26 = new InstrumentChartKt$InstrumentChart$1$11$1(constraintLayoutBaseScope412);
                                                    composer6.updateRememberedValue(objRememberedValue26);
                                                }
                                                composer6.endReplaceGroup();
                                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope415 = constraintLayoutBaseScope46;
                                                Modifier modifierConstrainAs3 = constraintLayoutScope5.constrainAs(modifier7, constraintLayoutBaseScope415, (Function1) objRememberedValue26);
                                                Chart chart6 = chart22;
                                                if (chart6 == null || (legend_data2 = chart6.getLegend_data()) == null || (setKeySet = legend_data2.keySet()) == null) {
                                                    setEmptySet = SetsKt.emptySet();
                                                    List<Line> list32 = listEmptyList;
                                                    List<ChartFill> list42 = listEmptyList2;
                                                    SduiActionHandler sduiActionHandler2 = actionHandler;
                                                    composer6.startReplaceGroup(5004770);
                                                    objRememberedValue11 = composer6.rememberedValue();
                                                    companion3 = Composer.INSTANCE;
                                                    if (objRememberedValue11 == companion3.getEmpty()) {
                                                        objRememberedValue11 = new InstrumentChartKt$InstrumentChart$1$13$1(snapshotState42);
                                                        composer6.updateRememberedValue(objRememberedValue11);
                                                    }
                                                    Function1 function122 = (Function1) objRememberedValue11;
                                                    composer6.endReplaceGroup();
                                                    composer6.startReplaceGroup(5004770);
                                                    objRememberedValue12 = composer6.rememberedValue();
                                                    if (objRememberedValue12 == companion3.getEmpty()) {
                                                        objRememberedValue12 = new InstrumentChartKt$InstrumentChart$1$14$1(snapshotState42);
                                                        composer6.updateRememberedValue(objRememberedValue12);
                                                    }
                                                    composer6.endReplaceGroup();
                                                    constraintLayoutBaseScope42 = constraintLayoutBaseScope414;
                                                    constraintLayoutBaseScope46 = constraintLayoutBaseScope415;
                                                    SduiChartMappersKt.SduiCandlestickChart(modifierConstrainAs3, list42, list32, setEmptySet, sduiActionHandler2, false, function122, (Function0) objRememberedValue12, false, composer6, 14155776, 288);
                                                    composer6.endReplaceGroup();
                                                    Unit unit32 = Unit.INSTANCE;
                                                    constraintLayoutScope3 = constraintLayoutScope5;
                                                    constraintLayoutBaseScope411 = constraintLayoutBaseScope45;
                                                    i23 = 2;
                                                    i24 = 3;
                                                } else {
                                                    Set<String> set = setKeySet;
                                                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                                                    Iterator<T> it = set.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList2.add(Float.valueOf(Float.parseFloat((String) it.next())));
                                                    }
                                                    setEmptySet = CollectionsKt.toSet(arrayList2);
                                                    if (setEmptySet == null) {
                                                    }
                                                    List<Line> list322 = listEmptyList;
                                                    List<ChartFill> list422 = listEmptyList2;
                                                    SduiActionHandler sduiActionHandler22 = actionHandler;
                                                    composer6.startReplaceGroup(5004770);
                                                    objRememberedValue11 = composer6.rememberedValue();
                                                    companion3 = Composer.INSTANCE;
                                                    if (objRememberedValue11 == companion3.getEmpty()) {
                                                    }
                                                    Function1 function1222 = (Function1) objRememberedValue11;
                                                    composer6.endReplaceGroup();
                                                    composer6.startReplaceGroup(5004770);
                                                    objRememberedValue12 = composer6.rememberedValue();
                                                    if (objRememberedValue12 == companion3.getEmpty()) {
                                                    }
                                                    composer6.endReplaceGroup();
                                                    constraintLayoutBaseScope42 = constraintLayoutBaseScope414;
                                                    constraintLayoutBaseScope46 = constraintLayoutBaseScope415;
                                                    SduiChartMappersKt.SduiCandlestickChart(modifierConstrainAs3, list422, list322, setEmptySet, sduiActionHandler22, false, function1222, (Function0) objRememberedValue12, false, composer6, 14155776, 288);
                                                    composer6.endReplaceGroup();
                                                    Unit unit322 = Unit.INSTANCE;
                                                    constraintLayoutScope3 = constraintLayoutScope5;
                                                    constraintLayoutBaseScope411 = constraintLayoutBaseScope45;
                                                    i23 = 2;
                                                    i24 = 3;
                                                }
                                            } else {
                                                if (i27 != 4) {
                                                    composer6.startReplaceGroup(1163763288);
                                                    composer6.endReplaceGroup();
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                composer6.startReplaceGroup(1718523317);
                                                Modifier modifier8 = InstrumentChartKt.chartModifier;
                                                composer6.startReplaceGroup(5004770);
                                                boolean zChanged7 = composer6.changed(constraintLayoutBaseScope412);
                                                Object objRememberedValue27 = composer6.rememberedValue();
                                                if (zChanged7 || objRememberedValue27 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue27 = new InstrumentChartKt$InstrumentChart$1$15$1(constraintLayoutBaseScope412);
                                                    composer6.updateRememberedValue(objRememberedValue27);
                                                }
                                                composer6.endReplaceGroup();
                                                Placeholders2.ChartPlaceholder(constraintLayoutScope5.constrainAs(modifier8, constraintLayoutBaseScope42, (Function1) objRememberedValue27), false, composer6, 0, 2);
                                                composer6.endReplaceGroup();
                                                i24 = i18;
                                                i23 = 2;
                                                constraintLayoutScope3 = constraintLayoutScope5;
                                                constraintLayoutBaseScope411 = constraintLayoutBaseScope45;
                                            }
                                            composer5 = composer6;
                                        }
                                        ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr2 = new ConstraintLayoutBaseScope6[i24];
                                        constraintLayoutBaseScope6Arr2[0] = constraintLayoutBaseScope411;
                                        constraintLayoutBaseScope6Arr2[1] = constraintLayoutBaseScope46;
                                        constraintLayoutBaseScope6Arr2[i23] = constraintLayoutBaseScope42;
                                        ConstraintLayoutScope constraintLayoutScope6 = constraintLayoutScope3;
                                        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope6, constraintLayoutBaseScope6Arr2, 0.0f, i23, null);
                                        if (str32 == null || instrumentChartSpans32 == null) {
                                            composer5.startReplaceGroup(1718984535);
                                            Modifier.Companion companion11 = Modifier.INSTANCE;
                                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                            int i28 = BentoTheme.$stable;
                                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion11, 0.0f, bentoTheme3.getSpacing(composer5, i28).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme3.getSpacing(composer5, i28).m21593getSmallD9Ej5fM(), 5, null), 0.0f, 1, null);
                                            composer5.startReplaceGroup(5004770);
                                            boolean zChanged8 = composer5.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                                            Object objRememberedValue28 = composer5.rememberedValue();
                                            if (zChanged8 || objRememberedValue28 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue28 = new InstrumentChartKt$InstrumentChart$1$16$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                                                composer5.updateRememberedValue(objRememberedValue28);
                                            }
                                            composer5.endReplaceGroup();
                                            BoxKt.Box(com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope6.constrainAs(modifierFillMaxWidth$default2, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue28), 0.0f, composer5, 0, 1), bentoTheme3.getSpacing(composer5, i28).m21594getXlargeD9Ej5fM()), true, null, i23, null), composer5, 0);
                                            composer5.endReplaceGroup();
                                        } else {
                                            composer5.startReplaceGroup(1719687615);
                                            SduiInstrumentChart sduiInstrumentChart4 = sduiInstrumentChart;
                                            if (sduiInstrumentChart4 == null || (pageDirection = sduiInstrumentChart4.getPageDirection()) == null) {
                                                pageDirection = Direction.f5855UP;
                                            }
                                            int i29 = InstrumentChartKt.WhenMappings.$EnumSwitchMapping$1[pageDirection.ordinal()];
                                            if (i29 == 1) {
                                                bentoTheme4 = BentoTheme4.POSITIVE;
                                            } else {
                                                if (i29 != i23) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                bentoTheme4 = BentoTheme4.NEGATIVE;
                                            }
                                            BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4, ComposableLambda3.rememberComposableLambda(-774781988, true, new InstrumentChartKt$InstrumentChart$1$17(constraintLayoutScope6, constraintLayoutBaseScope4Component7, horizontalAnchorM8136createBottomBarrier3ABfNKs$default2, z2, instrumentChartSpans32, str32, onSpanChanged, onChartSettingsClicked, z3, onAdvancedButtonClicked), composer5, 54), composer5, 48);
                                            composer5.endReplaceGroup();
                                        }
                                        composer5.endReplaceGroup();
                                        if (constraintLayoutScope2.getHelpersHashCode() != i17) {
                                            EffectsKt.SideEffect(function02, composer5, 6);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), measurePolicy2, composer2, 48, 0);
                                composer2.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z7 = z102;
                                modifier3 = modifier52;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 32) == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if ((i3 & 512) != 0) {
                }
                i4 |= i11;
                if ((i3 & 1024) != 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                int i1322 = i5;
                i6 = i3 & 4096;
                if (i6 != 0) {
                }
                i8 = i3 & 8192;
                if (i8 != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str2 = str;
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if ((i3 & 512) != 0) {
            }
            i4 |= i11;
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            int i13222 = i5;
            i6 = i3 & 4096;
            if (i6 != 0) {
            }
            i8 = i3 & 8192;
            if (i8 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        instrumentChartSpans2 = instrumentChartSpans;
        if ((i3 & 8) == 0) {
        }
        str2 = str;
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) != 0) {
        }
        i4 |= i11;
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        int i132222 = i5;
        i6 = i3 & 4096;
        if (i6 != 0) {
        }
        i8 = i3 & 8192;
        if (i8 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
