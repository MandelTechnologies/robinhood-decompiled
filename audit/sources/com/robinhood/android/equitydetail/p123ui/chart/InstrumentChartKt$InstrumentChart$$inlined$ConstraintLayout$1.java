package com.robinhood.android.equitydetail.p123ui.chart;

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
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.Placeholders2;
import com.robinhood.android.charts.candlestick.CandlestickLegendChart;
import com.robinhood.android.charts.candlestick.UtilKt;
import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.charts.model.LegendItem;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.adt.AdtChip;
import com.robinhood.android.equitydetail.p123ui.chart.InstrumentChartKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.compose.LocalityStringResources2;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.ModifiersKt;
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
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentChartKt$InstrumentChart$$inlined$ConstraintLayout$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SduiActionHandler $actionHandler$inlined;
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Chart $chart$inlined;
    final /* synthetic */ InstrumentChartSpans $chartSpans$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ String $displaySpan$inlined;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ SnapshotIntState2 $graphHeaderHeight$delegate$inlined;
    final /* synthetic */ boolean $hasVisitedBwChart$inlined;
    final /* synthetic */ boolean $isInBlackWidowAdvancedChartExperiment$inlined;
    final /* synthetic */ Function0 $onAdvancedButtonClicked$inlined;
    final /* synthetic */ Function0 $onChartSettingsClicked$inlined;
    final /* synthetic */ Function0 $onPriceBookClicked$inlined;
    final /* synthetic */ Function1 $onSpanChanged$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SduiInstrumentChart $sduiInstrumentChart$inlined;
    final /* synthetic */ SnapshotState $selectedPoint$delegate$inlined;
    final /* synthetic */ boolean $showAdtChip$inlined;
    final /* synthetic */ boolean $showDisplayCurrencyLabel$inlined;
    final /* synthetic */ boolean $showGoldIconInDarkMode$inlined;
    final /* synthetic */ SnapshotState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentChartKt$InstrumentChart$$inlined$ConstraintLayout$1(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, SduiInstrumentChart sduiInstrumentChart, Chart chart, boolean z, Function0 function0, SduiActionHandler sduiActionHandler, String str, InstrumentChartSpans instrumentChartSpans, SnapshotState snapshotState4, SnapshotIntState2 snapshotIntState2, boolean z2, boolean z3, Function0 function02, boolean z4, Function1 function1, Function0 function03, boolean z5) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$sduiInstrumentChart$inlined = sduiInstrumentChart;
        this.$chart$inlined = chart;
        this.$isInBlackWidowAdvancedChartExperiment$inlined = z;
        this.$onAdvancedButtonClicked$inlined = function0;
        this.$actionHandler$inlined = sduiActionHandler;
        this.$displaySpan$inlined = str;
        this.$chartSpans$inlined = instrumentChartSpans;
        this.$selectedPoint$delegate$inlined = snapshotState4;
        this.$graphHeaderHeight$delegate$inlined = snapshotIntState2;
        this.$showAdtChip$inlined = z2;
        this.$showDisplayCurrencyLabel$inlined = z3;
        this.$onPriceBookClicked$inlined = function02;
        this.$showGoldIconInDarkMode$inlined = z4;
        this.$onSpanChanged$inlined = function1;
        this.$onChartSettingsClicked$inlined = function03;
        this.$hasVisitedBwChart$inlined = z5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        SduiInstrumentChart2 sduiInstrumentChart2;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope44;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope45;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope46;
        ConstraintLayoutScope constraintLayoutScope;
        char c;
        CursorData defaultDisplay;
        Modifier.Companion companion;
        int i2;
        int i3;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope47;
        int i4;
        int i5;
        List<ChartLegendItem> legendList;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope48;
        int i6;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope49;
        Composer composer2;
        int i7;
        Map<String, List<ChartLegendItem>> legend_data;
        ConstraintLayoutScope constraintLayoutScope2;
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default;
        boolean zChanged;
        Object objRememberedValue;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope410;
        Chart chart;
        List<Line> listEmptyList;
        Chart chart2;
        List<ChartFill> listEmptyList2;
        SduiInstrumentChart sduiInstrumentChart;
        List<UIComponent<GenericAction>> listEmptyList3;
        int i8;
        boolean zChanged2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Composer.Companion companion2;
        Object objRememberedValue4;
        Object objRememberedValue5;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope411;
        ConstraintLayoutScope constraintLayoutScope3;
        int i9;
        Composer composer3;
        int i10;
        ConstraintLayoutScope constraintLayoutScope4;
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default2;
        boolean zChanged3;
        Object objRememberedValue6;
        boolean zChangedInstance;
        final ConstraintLayoutScope constraintLayoutScope5;
        final SnapshotState snapshotState;
        final SnapshotState snapshotState2;
        final Channel channel;
        Object objRememberedValue7;
        Direction pageDirection;
        BentoTheme4 bentoTheme4;
        Set setEmptySet;
        Object objRememberedValue8;
        Composer.Companion companion3;
        Object objRememberedValue9;
        Map<String, List<ChartLegendItem>> legend_data2;
        Set<String> setKeySet;
        Composer composer4 = composer;
        if ((i & 3) == 2 && composer4.getSkipping()) {
            composer4.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(Unit.INSTANCE);
        if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        this.$scope.reset();
        ConstraintLayoutScope constraintLayoutScope6 = this.$scope;
        composer4.startReplaceGroup(1710810859);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope6.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component9 = constrainedLayoutReferencesCreateRefs.component9();
        SduiInstrumentChart2 chartState = SduiInstrumentChart3.getChartState(this.$sduiInstrumentChart$inlined);
        if (this.$sduiInstrumentChart$inlined == null) {
            composer4.startReplaceGroup(1710789313);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composer4.startReplaceGroup(1849434622);
            Object objRememberedValue10 = composer4.rememberedValue();
            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = InstrumentChartKt$InstrumentChart$1$1$1.INSTANCE;
                composer4.updateRememberedValue(objRememberedValue10);
            }
            composer4.endReplaceGroup();
            InstrumentChartKt.ChartHeaderPlaceholder(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(constraintLayoutScope6.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue10), 0.0f, 1, null), composer4, 0);
            composer4.endReplaceGroup();
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component4;
            constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component9;
            constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component6;
            sduiInstrumentChart2 = chartState;
            i3 = 1;
            constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component2;
            constraintLayoutScope = constraintLayoutScope6;
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component5;
            i4 = 3;
            i5 = 0;
        } else {
            if (chartState != SduiInstrumentChart2.CANDLESTICK || InstrumentChartKt.InstrumentChart$lambda$15(this.$selectedPoint$delegate$inlined) == null) {
                sduiInstrumentChart2 = chartState;
                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
                composer4.startReplaceGroup(1712711716);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                composer4.startReplaceGroup(1849434622);
                Object objRememberedValue11 = composer4.rememberedValue();
                Composer.Companion companion5 = Composer.INSTANCE;
                if (objRememberedValue11 == companion5.getEmpty()) {
                    objRememberedValue11 = InstrumentChartKt$InstrumentChart$1$3$1.INSTANCE;
                    composer4.updateRememberedValue(objRememberedValue11);
                }
                composer4.endReplaceGroup();
                Modifier modifierConstrainAs = constraintLayoutScope6.constrainAs(companion4, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue11);
                composer4.startReplaceGroup(5004770);
                Object objRememberedValue12 = composer4.rememberedValue();
                if (objRememberedValue12 == companion5.getEmpty()) {
                    objRememberedValue12 = new InstrumentChartKt$InstrumentChart$1$4$1(this.$graphHeaderHeight$delegate$inlined);
                    composer4.updateRememberedValue(objRememberedValue12);
                }
                composer4.endReplaceGroup();
                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs, (Function1) objRememberedValue12);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion6 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion6.getStart(), composer4, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierOnGloballyPositioned);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion7.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion7.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion7.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion7.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion7.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                ImmutableList3 persistentList = extensions2.toPersistentList(this.$sduiInstrumentChart$inlined.getHeader());
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i11 = BentoTheme.$stable;
                Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer4, i11).m21592getMediumD9Ej5fM(), 0.0f, 2, null), "stock_detail_chart_header");
                composer4.startReplaceGroup(1849434622);
                Object objRememberedValue13 = composer4.rememberedValue();
                if (objRememberedValue13 == companion5.getEmpty()) {
                    objRememberedValue13 = InstrumentChartKt$InstrumentChart$1$5$1$1.INSTANCE;
                    composer4.updateRememberedValue(objRememberedValue13);
                }
                composer4.endReplaceGroup();
                Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue13, 1, null);
                HorizontalPadding horizontalPadding = HorizontalPadding.None;
                composer4.startReplaceGroup(-1772220517);
                Arrangement.Vertical top2 = arrangement.getTop();
                Alignment.Horizontal start = companion6.getStart();
                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component4;
                constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component5;
                constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component6;
                constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component9;
                constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component3;
                composer4 = composer;
                constraintLayoutScope = constraintLayoutScope6;
                SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierSemantics$default, null, this.$actionHandler$inlined, horizontalPadding, top2, start, false, composer4, 100859904, 0);
                composer4.endReplaceGroup();
                Point pointInstrumentChart$lambda$15 = InstrumentChartKt.InstrumentChart$lambda$15(this.$selectedPoint$delegate$inlined);
                composer4.startReplaceGroup(-1746271574);
                boolean zChanged4 = composer4.changed(pointInstrumentChart$lambda$15) | composer4.changed(this.$showAdtChip$inlined) | composer4.changed(this.$displaySpan$inlined);
                Object objRememberedValue14 = composer4.rememberedValue();
                if (zChanged4 || objRememberedValue14 == companion5.getEmpty()) {
                    SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.valueOf(this.$showAdtChip$inlined && Intrinsics.areEqual(this.$displaySpan$inlined, DisplaySpan.DAY.getServerValue())), null, 2, null);
                    composer4.updateRememberedValue(snapshotStateMutableStateOf$default);
                    objRememberedValue14 = snapshotStateMutableStateOf$default;
                }
                SnapshotState snapshotState3 = (SnapshotState) objRememberedValue14;
                composer4.endReplaceGroup();
                composer4.startReplaceGroup(1849434622);
                Object objRememberedValue15 = composer4.rememberedValue();
                if (objRememberedValue15 == companion5.getEmpty()) {
                    c = 2;
                    objRememberedValue15 = SnapshotState3.mutableStateOf$default(new CursorRowModifiers.ChartEducationTour(null, null, null, null, 15, null), null, 2, null);
                    composer4.updateRememberedValue(objRememberedValue15);
                } else {
                    c = 2;
                }
                SnapshotState snapshotState4 = (SnapshotState) objRememberedValue15;
                composer4.endReplaceGroup();
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, null);
                CursorRowModifiers.ChartEducationTour chartEducationTourInstrumentChart$lambda$45$lambda$33$lambda$31 = InstrumentChartKt.InstrumentChart$lambda$45$lambda$33$lambda$31(snapshotState4);
                Point pointInstrumentChart$lambda$152 = InstrumentChartKt.InstrumentChart$lambda$15(this.$selectedPoint$delegate$inlined);
                if (pointInstrumentChart$lambda$152 == null || (defaultDisplay = pointInstrumentChart$lambda$152.getCursor_data()) == null) {
                    defaultDisplay = this.$sduiInstrumentChart$inlined.getDefaultDisplay();
                }
                SduiCursorData2.SduiCursorDataHeader(defaultDisplay, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, chartEducationTourInstrumentChart$lambda$45$lambda$33$lambda$31, ComposableLambda3.rememberComposableLambda(622026975, true, new InstrumentChartKt$InstrumentChart$1$5$2(this.$sduiInstrumentChart$inlined, this.$onPriceBookClicked$inlined, this.$showGoldIconInDarkMode$inlined), composer4, 54), null, !InstrumentChartKt.InstrumentChart$lambda$45$lambda$33$lambda$29(snapshotState3), false, false, this.$showDisplayCurrencyLabel$inlined, composer4, (CursorRowModifiers.ChartEducationTour.$stable << 6) | 3072, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE);
                composer4.startReplaceGroup(-787799603);
                if (InstrumentChartKt.InstrumentChart$lambda$45$lambda$33$lambda$29(snapshotState3)) {
                    i2 = i11;
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composer4, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                    companion = companion4;
                    if (InstrumentChartKt.InstrumentChart$lambda$15(this.$selectedPoint$delegate$inlined) != null) {
                        modifierM5146paddingqDBjuR0$default2 = Alpha.alpha(modifierM5146paddingqDBjuR0$default2, 0.0f);
                    }
                    AdtChip.AdtChip(modifierM5146paddingqDBjuR0$default2, composer4, 0, 0);
                } else {
                    companion = companion4;
                    i2 = i11;
                }
                composer4.endReplaceGroup();
                composer4.endNode();
                if (this.$isInBlackWidowAdvancedChartExperiment$inlined) {
                    i3 = 1;
                    constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component2;
                    i4 = 3;
                    i5 = 0;
                } else {
                    composer4.startReplaceGroup(5004770);
                    boolean zChanged5 = composer4.changed(constraintLayoutBaseScope4Component2);
                    Object objRememberedValue16 = composer4.rememberedValue();
                    if (zChanged5 || objRememberedValue16 == companion5.getEmpty()) {
                        objRememberedValue16 = new InstrumentChartKt$InstrumentChart$1$6$1(constraintLayoutBaseScope4Component2);
                        composer4.updateRememberedValue(objRememberedValue16);
                    }
                    composer4.endReplaceGroup();
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue16), 0.0f, composer4, 0, 1);
                    i5 = 0;
                    constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component2;
                    constraintLayoutScope = constraintLayoutScope;
                    i3 = 1;
                    i4 = 3;
                    BentoIconButton2.m20641BentoIconButtoncqYvz4g(this.$onAdvancedButtonClicked$inlined, new BentoIconButton4.Icon.StandardSize16(ServerToBentoAssetMapper2.EXPAND_16), LocalityStringResources2.regionGateStringResource(EtfRegionGate.INSTANCE, C15314R.string.advanced_chart_tooltip_description, C15314R.string.advanced_chart_tooltip_description_without_etf, null, composer4, 0, 8), modifierM21623defaultHorizontalPaddingrAjV9yQ, BentoIconButton4.Type.Secondary, false, Color.m6701boximpl(bentoTheme.getColors(composer4, i2).m21425getFg0d7_KjU()), null, Color.m6701boximpl(bentoTheme.getColors(composer4, i2).m21427getFg30d7_KjU()), null, false, composer, (BentoIconButton4.Icon.StandardSize16.$stable << 3) | 24576, 0, 1696);
                    composer4 = composer;
                }
                composer4.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
                ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr = new ConstraintLayoutBaseScope6[i4];
                constraintLayoutBaseScope6Arr[i5] = constraintLayoutBaseScope4;
                constraintLayoutBaseScope6Arr[i3] = constraintLayoutBaseScope47;
                constraintLayoutBaseScope6Arr[2] = constraintLayoutBaseScope46;
                constraintLayoutScope2 = constraintLayoutScope;
                horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope2, constraintLayoutBaseScope6Arr, 0.0f, 2, null);
                Modifier.Companion companion8 = Modifier.INSTANCE;
                composer4.startReplaceGroup(5004770);
                zChanged = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                objRememberedValue = composer4.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InstrumentChartKt$InstrumentChart$1$7$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                    composer4.updateRememberedValue(objRememberedValue);
                }
                composer4.endReplaceGroup();
                constraintLayoutBaseScope410 = constraintLayoutBaseScope42;
                int i12 = i5;
                SduiCursorData2.SduiLabelTrack(constraintLayoutScope2.constrainAs(companion8, constraintLayoutBaseScope410, (Function1) objRememberedValue), InstrumentChartKt.InstrumentChart$lambda$15(this.$selectedPoint$delegate$inlined), composer4, i12, i12);
                chart = this.$chart$inlined;
                if (chart != null || (listEmptyList = chart.getLines()) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                chart2 = this.$chart$inlined;
                if (chart2 != null || (listEmptyList2 = chart2.getFills()) == null) {
                    listEmptyList2 = CollectionsKt.emptyList();
                }
                sduiInstrumentChart = this.$sduiInstrumentChart$inlined;
                if (sduiInstrumentChart != null || (listEmptyList3 = sduiInstrumentChart.getOverlays()) == null) {
                    listEmptyList3 = CollectionsKt.emptyList();
                }
                i8 = InstrumentChartKt.WhenMappings.$EnumSwitchMapping$0[sduiInstrumentChart2.ordinal()];
                if (i8 != i3 || i8 == 2) {
                    composer4.startReplaceGroup(1716946936);
                    Modifier modifier = InstrumentChartKt.chartModifier;
                    composer4.startReplaceGroup(5004770);
                    zChanged2 = composer4.changed(constraintLayoutBaseScope410);
                    objRememberedValue2 = composer4.rememberedValue();
                    if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new InstrumentChartKt$InstrumentChart$1$8$1(constraintLayoutBaseScope410);
                        composer4.updateRememberedValue(objRememberedValue2);
                    }
                    composer4.endReplaceGroup();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope412 = constraintLayoutBaseScope44;
                    Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(modifier, constraintLayoutBaseScope412, (Function1) objRememberedValue2);
                    composer4.startReplaceGroup(5004770);
                    objRememberedValue3 = composer4.rememberedValue();
                    companion2 = Composer.INSTANCE;
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = new InstrumentChartKt$InstrumentChart$1$9$1(this.$selectedPoint$delegate$inlined);
                        composer4.updateRememberedValue(objRememberedValue3);
                    }
                    Function1 function1 = (Function1) objRememberedValue3;
                    composer4.endReplaceGroup();
                    composer4.startReplaceGroup(5004770);
                    objRememberedValue4 = composer4.rememberedValue();
                    if (objRememberedValue4 == companion2.getEmpty()) {
                        objRememberedValue4 = new InstrumentChartKt$InstrumentChart$1$10$1(this.$selectedPoint$delegate$inlined);
                        composer4.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function0 = (Function0) objRememberedValue4;
                    composer4.endReplaceGroup();
                    boolean z = sduiInstrumentChart2 != SduiInstrumentChart2.EMPTY_WITH_OVERLAYS;
                    composer4.startReplaceGroup(977840936);
                    List listEmptyList4 = CollectionsKt.emptyList();
                    composer4.startReplaceGroup(1849434622);
                    objRememberedValue5 = composer4.rememberedValue();
                    if (objRememberedValue5 == companion2.getEmpty()) {
                        objRememberedValue5 = C15449x534b4b90.INSTANCE;
                        composer4.updateRememberedValue(objRememberedValue5);
                    }
                    composer4.endReplaceGroup();
                    constraintLayoutBaseScope411 = constraintLayoutBaseScope412;
                    constraintLayoutScope3 = constraintLayoutScope2;
                    i9 = 2;
                    composer3 = composer;
                    SduiChartMappersKt.SduiSegmentedLineChart(modifierConstrainAs2, listEmptyList4, listEmptyList, listEmptyList3, this.$actionHandler$inlined, (Function1) objRememberedValue5, function1, function0, z, true, null, 0.0f, GenericAction.class, composer3, 14155776, 0, 0);
                    composer3.endReplaceGroup();
                    composer3.endReplaceGroup();
                    i10 = 3;
                } else {
                    if (i8 == i4) {
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope413 = constraintLayoutBaseScope45;
                        composer4.startReplaceGroup(1717748906);
                        Modifier modifier2 = InstrumentChartKt.chartModifier;
                        composer4.startReplaceGroup(5004770);
                        boolean zChanged6 = composer4.changed(constraintLayoutBaseScope410);
                        Object objRememberedValue17 = composer4.rememberedValue();
                        if (zChanged6 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue17 = new InstrumentChartKt$InstrumentChart$1$11$1(constraintLayoutBaseScope410);
                            composer4.updateRememberedValue(objRememberedValue17);
                        }
                        composer4.endReplaceGroup();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope414 = constraintLayoutBaseScope43;
                        Modifier modifierConstrainAs3 = constraintLayoutScope2.constrainAs(modifier2, constraintLayoutBaseScope414, (Function1) objRememberedValue17);
                        Chart chart3 = this.$chart$inlined;
                        if (chart3 == null || (legend_data2 = chart3.getLegend_data()) == null || (setKeySet = legend_data2.keySet()) == null) {
                            setEmptySet = SetsKt.emptySet();
                            SduiActionHandler sduiActionHandler = this.$actionHandler$inlined;
                            composer4.startReplaceGroup(5004770);
                            objRememberedValue8 = composer4.rememberedValue();
                            companion3 = Composer.INSTANCE;
                            if (objRememberedValue8 == companion3.getEmpty()) {
                                objRememberedValue8 = new InstrumentChartKt$InstrumentChart$1$13$1(this.$selectedPoint$delegate$inlined);
                                composer4.updateRememberedValue(objRememberedValue8);
                            }
                            Function1 function12 = (Function1) objRememberedValue8;
                            composer4.endReplaceGroup();
                            composer4.startReplaceGroup(5004770);
                            objRememberedValue9 = composer4.rememberedValue();
                            if (objRememberedValue9 == companion3.getEmpty()) {
                                objRememberedValue9 = new InstrumentChartKt$InstrumentChart$1$14$1(this.$selectedPoint$delegate$inlined);
                                composer4.updateRememberedValue(objRememberedValue9);
                            }
                            composer4.endReplaceGroup();
                            constraintLayoutBaseScope45 = constraintLayoutBaseScope413;
                            constraintLayoutBaseScope43 = constraintLayoutBaseScope414;
                            SduiChartMappersKt.SduiCandlestickChart(modifierConstrainAs3, listEmptyList2, listEmptyList, setEmptySet, sduiActionHandler, false, function12, (Function0) objRememberedValue9, false, composer4, 14155776, 288);
                            composer4.endReplaceGroup();
                            Unit unit2 = Unit.INSTANCE;
                            i9 = 2;
                            constraintLayoutScope3 = constraintLayoutScope2;
                            constraintLayoutBaseScope411 = constraintLayoutBaseScope44;
                            i10 = 3;
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
                            SduiActionHandler sduiActionHandler2 = this.$actionHandler$inlined;
                            composer4.startReplaceGroup(5004770);
                            objRememberedValue8 = composer4.rememberedValue();
                            companion3 = Composer.INSTANCE;
                            if (objRememberedValue8 == companion3.getEmpty()) {
                            }
                            Function1 function122 = (Function1) objRememberedValue8;
                            composer4.endReplaceGroup();
                            composer4.startReplaceGroup(5004770);
                            objRememberedValue9 = composer4.rememberedValue();
                            if (objRememberedValue9 == companion3.getEmpty()) {
                            }
                            composer4.endReplaceGroup();
                            constraintLayoutBaseScope45 = constraintLayoutBaseScope413;
                            constraintLayoutBaseScope43 = constraintLayoutBaseScope414;
                            SduiChartMappersKt.SduiCandlestickChart(modifierConstrainAs3, listEmptyList2, listEmptyList, setEmptySet, sduiActionHandler2, false, function122, (Function0) objRememberedValue9, false, composer4, 14155776, 288);
                            composer4.endReplaceGroup();
                            Unit unit22 = Unit.INSTANCE;
                            i9 = 2;
                            constraintLayoutScope3 = constraintLayoutScope2;
                            constraintLayoutBaseScope411 = constraintLayoutBaseScope44;
                            i10 = 3;
                        }
                    } else {
                        if (i8 != 4) {
                            composer4.startReplaceGroup(1163763288);
                            composer4.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer4.startReplaceGroup(1718523317);
                        Modifier modifier3 = InstrumentChartKt.chartModifier;
                        composer4.startReplaceGroup(5004770);
                        boolean zChanged7 = composer4.changed(constraintLayoutBaseScope410);
                        Object objRememberedValue18 = composer4.rememberedValue();
                        if (zChanged7 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue18 = new InstrumentChartKt$InstrumentChart$1$15$1(constraintLayoutBaseScope410);
                            composer4.updateRememberedValue(objRememberedValue18);
                        }
                        composer4.endReplaceGroup();
                        Placeholders2.ChartPlaceholder(constraintLayoutScope2.constrainAs(modifier3, constraintLayoutBaseScope45, (Function1) objRememberedValue18), false, composer4, 0, 2);
                        composer4.endReplaceGroup();
                        i10 = i4;
                        i9 = 2;
                        constraintLayoutScope3 = constraintLayoutScope2;
                        constraintLayoutBaseScope411 = constraintLayoutBaseScope44;
                    }
                    composer3 = composer4;
                }
                ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr2 = new ConstraintLayoutBaseScope6[i10];
                constraintLayoutBaseScope6Arr2[0] = constraintLayoutBaseScope411;
                constraintLayoutBaseScope6Arr2[1] = constraintLayoutBaseScope43;
                constraintLayoutBaseScope6Arr2[i9] = constraintLayoutBaseScope45;
                constraintLayoutScope4 = constraintLayoutScope3;
                horizontalAnchorM8136createBottomBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope4, constraintLayoutBaseScope6Arr2, 0.0f, i9, null);
                if (this.$displaySpan$inlined != null || this.$chartSpans$inlined == null) {
                    composer3.startReplaceGroup(1718984535);
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i13 = BentoTheme.$stable;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion9, 0.0f, bentoTheme2.getSpacing(composer3, i13).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer3, i13).m21593getSmallD9Ej5fM(), 5, null), 0.0f, 1, null);
                    composer3.startReplaceGroup(5004770);
                    zChanged3 = composer3.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                    objRememberedValue6 = composer3.rememberedValue();
                    if (!zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new InstrumentChartKt$InstrumentChart$1$16$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                        composer3.updateRememberedValue(objRememberedValue6);
                    }
                    composer3.endReplaceGroup();
                    BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope4.constrainAs(modifierFillMaxWidth$default2, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue6), 0.0f, composer3, 0, 1), bentoTheme2.getSpacing(composer3, i13).m21594getXlargeD9Ej5fM()), true, null, i9, null), composer3, 0);
                    composer3.endReplaceGroup();
                } else {
                    composer3.startReplaceGroup(1719687615);
                    SduiInstrumentChart sduiInstrumentChart3 = this.$sduiInstrumentChart$inlined;
                    if (sduiInstrumentChart3 == null || (pageDirection = sduiInstrumentChart3.getPageDirection()) == null) {
                        pageDirection = Direction.f5855UP;
                    }
                    int i14 = InstrumentChartKt.WhenMappings.$EnumSwitchMapping$1[pageDirection.ordinal()];
                    if (i14 == 1) {
                        bentoTheme4 = BentoTheme4.POSITIVE;
                    } else {
                        if (i14 != i9) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bentoTheme4 = BentoTheme4.NEGATIVE;
                    }
                    BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4, ComposableLambda3.rememberComposableLambda(-774781988, true, new InstrumentChartKt$InstrumentChart$1$17(constraintLayoutScope4, constraintLayoutBaseScope4Component7, horizontalAnchorM8136createBottomBarrier3ABfNKs$default2, this.$isInBlackWidowAdvancedChartExperiment$inlined, this.$chartSpans$inlined, this.$displaySpan$inlined, this.$onSpanChanged$inlined, this.$onChartSettingsClicked$inlined, this.$hasVisitedBwChart$inlined, this.$onAdvancedButtonClicked$inlined), composer3, 54), composer3, 48);
                    composer3.endReplaceGroup();
                }
                composer3.endReplaceGroup();
                zChangedInstance = composer3.changedInstance(this.$scope) | composer3.changedInstance(this.$channel);
                constraintLayoutScope5 = this.$scope;
                snapshotState = this.$start;
                snapshotState2 = this.$end;
                channel = this.$channel;
                objRememberedValue7 = composer3.rememberedValue();
                if (!zChangedInstance || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$InstrumentChart$$inlined$ConstraintLayout$1.1
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
                            ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope5.getContainerObject().mo8187clone());
                            if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                                snapshotState.setValue(constraintSet3);
                                snapshotState2.setValue(snapshotState.getValue());
                            } else {
                                channel.mo8337trySendJP2dKIU(constraintSet3);
                            }
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue7);
                }
                EffectsKt.SideEffect((Function0) objRememberedValue7, composer3, 0);
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            }
            composer4.startReplaceGroup(1711300410);
            Chart chart4 = this.$chart$inlined;
            if (chart4 == null || (legend_data = chart4.getLegend_data()) == null) {
                legendList = null;
            } else {
                Point pointInstrumentChart$lambda$153 = InstrumentChartKt.InstrumentChart$lambda$15(this.$selectedPoint$delegate$inlined);
                Intrinsics.checkNotNull(pointInstrumentChart$lambda$153);
                legendList = UtilKt.getLegendList(legend_data, pointInstrumentChart$lambda$153);
            }
            if (legendList == null) {
                constraintLayoutBaseScope49 = constraintLayoutBaseScope4Component9;
                constraintLayoutBaseScope48 = constraintLayoutBaseScope4Component6;
                sduiInstrumentChart2 = chartState;
                composer2 = composer4;
                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
                i6 = 0;
                i7 = 1;
            } else {
                Modifier.Companion companion10 = Modifier.INSTANCE;
                composer4.startReplaceGroup(1849434622);
                Object objRememberedValue19 = composer4.rememberedValue();
                if (objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue19 = InstrumentChartKt$InstrumentChart$1$2$1$1.INSTANCE;
                    composer4.updateRememberedValue(objRememberedValue19);
                }
                composer4.endReplaceGroup();
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(constraintLayoutScope6.constrainAs(companion10, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue19), 0.0f, ((Density) composer4.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(this.$graphHeaderHeight$delegate$inlined.getIntValue()), 1, null), 0.0f, 1, null);
                composer4.startReplaceGroup(1163604213);
                List<ChartLegendItem> list = legendList;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (ChartLegendItem chartLegendItem : list) {
                    ThemedColor color = chartLegendItem.getColor();
                    composer4.startReplaceGroup(1163607790);
                    Color composeColor = color == null ? null : SduiColors2.toComposeColor(color, composer4, 0);
                    composer4.endReplaceGroup();
                    String title = chartLegendItem.getTitle();
                    Color composeColor2 = SduiColors2.toComposeColor(chartLegendItem.getValue_color(), composer4, 0);
                    Intrinsics.checkNotNull(composeColor2);
                    arrayList2.add(new LegendItem(chartLegendItem.getId(), composeColor, title, chartLegendItem.getValue(), composeColor2.getValue(), null, 32, null));
                }
                composer4.endReplaceGroup();
                TextStyle textM = BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextM();
                constraintLayoutBaseScope48 = constraintLayoutBaseScope4Component6;
                sduiInstrumentChart2 = chartState;
                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
                i6 = 0;
                constraintLayoutBaseScope49 = constraintLayoutBaseScope4Component9;
                composer2 = composer4;
                i7 = 1;
                CandlestickLegendChart.CandlestickLegendChart(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, textM, arrayList2, 0, composer2, 0, 8);
                Unit unit3 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component4;
            constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component2;
            i3 = i7;
            constraintLayoutBaseScope44 = constraintLayoutBaseScope48;
            constraintLayoutBaseScope45 = constraintLayoutBaseScope49;
            constraintLayoutScope = constraintLayoutScope6;
            i5 = i6;
            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component5;
            i4 = 3;
            composer4 = composer2;
        }
        constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component3;
        ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr3 = new ConstraintLayoutBaseScope6[i4];
        constraintLayoutBaseScope6Arr3[i5] = constraintLayoutBaseScope4;
        constraintLayoutBaseScope6Arr3[i3] = constraintLayoutBaseScope47;
        constraintLayoutBaseScope6Arr3[2] = constraintLayoutBaseScope46;
        constraintLayoutScope2 = constraintLayoutScope;
        horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope2, constraintLayoutBaseScope6Arr3, 0.0f, 2, null);
        Modifier.Companion companion82 = Modifier.INSTANCE;
        composer4.startReplaceGroup(5004770);
        zChanged = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
        objRememberedValue = composer4.rememberedValue();
        if (!zChanged) {
            objRememberedValue = new InstrumentChartKt$InstrumentChart$1$7$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
            composer4.updateRememberedValue(objRememberedValue);
        }
        composer4.endReplaceGroup();
        constraintLayoutBaseScope410 = constraintLayoutBaseScope42;
        int i122 = i5;
        SduiCursorData2.SduiLabelTrack(constraintLayoutScope2.constrainAs(companion82, constraintLayoutBaseScope410, (Function1) objRememberedValue), InstrumentChartKt.InstrumentChart$lambda$15(this.$selectedPoint$delegate$inlined), composer4, i122, i122);
        chart = this.$chart$inlined;
        if (chart != null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        chart2 = this.$chart$inlined;
        if (chart2 != null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        sduiInstrumentChart = this.$sduiInstrumentChart$inlined;
        if (sduiInstrumentChart != null) {
            listEmptyList3 = CollectionsKt.emptyList();
        }
        i8 = InstrumentChartKt.WhenMappings.$EnumSwitchMapping$0[sduiInstrumentChart2.ordinal()];
        if (i8 != i3) {
            composer4.startReplaceGroup(1716946936);
            Modifier modifier4 = InstrumentChartKt.chartModifier;
            composer4.startReplaceGroup(5004770);
            zChanged2 = composer4.changed(constraintLayoutBaseScope410);
            objRememberedValue2 = composer4.rememberedValue();
            if (!zChanged2) {
                objRememberedValue2 = new InstrumentChartKt$InstrumentChart$1$8$1(constraintLayoutBaseScope410);
                composer4.updateRememberedValue(objRememberedValue2);
                composer4.endReplaceGroup();
                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4122 = constraintLayoutBaseScope44;
                Modifier modifierConstrainAs22 = constraintLayoutScope2.constrainAs(modifier4, constraintLayoutBaseScope4122, (Function1) objRememberedValue2);
                composer4.startReplaceGroup(5004770);
                objRememberedValue3 = composer4.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue3 == companion2.getEmpty()) {
                }
                Function1 function13 = (Function1) objRememberedValue3;
                composer4.endReplaceGroup();
                composer4.startReplaceGroup(5004770);
                objRememberedValue4 = composer4.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                }
                Function0 function02 = (Function0) objRememberedValue4;
                composer4.endReplaceGroup();
                if (sduiInstrumentChart2 != SduiInstrumentChart2.EMPTY_WITH_OVERLAYS) {
                }
                composer4.startReplaceGroup(977840936);
                List listEmptyList42 = CollectionsKt.emptyList();
                composer4.startReplaceGroup(1849434622);
                objRememberedValue5 = composer4.rememberedValue();
                if (objRememberedValue5 == companion2.getEmpty()) {
                }
                composer4.endReplaceGroup();
                constraintLayoutBaseScope411 = constraintLayoutBaseScope4122;
                constraintLayoutScope3 = constraintLayoutScope2;
                i9 = 2;
                composer3 = composer;
                SduiChartMappersKt.SduiSegmentedLineChart(modifierConstrainAs22, listEmptyList42, listEmptyList, listEmptyList3, this.$actionHandler$inlined, (Function1) objRememberedValue5, function13, function02, z, true, null, 0.0f, GenericAction.class, composer3, 14155776, 0, 0);
                composer3.endReplaceGroup();
                composer3.endReplaceGroup();
                i10 = 3;
            }
        }
        ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr22 = new ConstraintLayoutBaseScope6[i10];
        constraintLayoutBaseScope6Arr22[0] = constraintLayoutBaseScope411;
        constraintLayoutBaseScope6Arr22[1] = constraintLayoutBaseScope43;
        constraintLayoutBaseScope6Arr22[i9] = constraintLayoutBaseScope45;
        constraintLayoutScope4 = constraintLayoutScope3;
        horizontalAnchorM8136createBottomBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope4, constraintLayoutBaseScope6Arr22, 0.0f, i9, null);
        if (this.$displaySpan$inlined != null) {
            composer3.startReplaceGroup(1718984535);
            Modifier.Companion companion92 = Modifier.INSTANCE;
            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
            int i132 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion92, 0.0f, bentoTheme22.getSpacing(composer3, i132).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme22.getSpacing(composer3, i132).m21593getSmallD9Ej5fM(), 5, null), 0.0f, 1, null);
            composer3.startReplaceGroup(5004770);
            zChanged3 = composer3.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
            objRememberedValue6 = composer3.rememberedValue();
            if (!zChanged3) {
                objRememberedValue6 = new InstrumentChartKt$InstrumentChart$1$16$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
                composer3.updateRememberedValue(objRememberedValue6);
                composer3.endReplaceGroup();
                BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope4.constrainAs(modifierFillMaxWidth$default22, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue6), 0.0f, composer3, 0, 1), bentoTheme22.getSpacing(composer3, i132).m21594getXlargeD9Ej5fM()), true, null, i9, null), composer3, 0);
                composer3.endReplaceGroup();
            }
        }
        composer3.endReplaceGroup();
        zChangedInstance = composer3.changedInstance(this.$scope) | composer3.changedInstance(this.$channel);
        constraintLayoutScope5 = this.$scope;
        snapshotState = this.$start;
        snapshotState2 = this.$end;
        channel = this.$channel;
        objRememberedValue7 = composer3.rememberedValue();
        if (!zChangedInstance) {
            objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$InstrumentChart$$inlined$ConstraintLayout$1.1
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
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope5.getContainerObject().mo8187clone());
                    if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                        snapshotState.setValue(constraintSet3);
                        snapshotState2.setValue(snapshotState.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer3.updateRememberedValue(objRememberedValue7);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue7, composer3, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
    }
}
