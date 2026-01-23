package com.robinhood.android.sdui.chartgroup;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.charts.model.Axis;
import com.robinhood.android.charts.model.Fill;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$$inlined$ConstraintLayout$1 */
/* loaded from: classes5.dex */
public final class C27887x57a95f19 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ int $chartGroupSize$inlined;
    final /* synthetic */ Axis $chartGroupXAxis$inlined;
    final /* synthetic */ SnapshotIntState2 $chartGroupXAxisHeight$delegate$inlined;
    final /* synthetic */ SnapshotStateMap $chartRects$inlined;
    final /* synthetic */ List $chartYAxes$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ SnapshotState4 $globalChartRect$delegate$inlined;
    final /* synthetic */ HapticFeedback $haptic$inlined;
    final /* synthetic */ ChartGroup $rawComponent$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState4 $scrubLineAnimationProgress$inlined;
    final /* synthetic */ SnapshotState4 $scrubState$delegate$inlined;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ AdvancedChartGroupState $state$inlined;
    final /* synthetic */ ChartGroup $transformedComponent$inlined;
    final /* synthetic */ SnapshotState4 $verticalScrubLineDistanceToRightOfChart$delegate$inlined;
    final /* synthetic */ SnapshotStateMap $yAxisRects$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27887x57a95f19(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, int i, ChartGroup chartGroup, AdvancedChartGroupState advancedChartGroupState, Axis axis, ChartGroup chartGroup2, SnapshotState4 snapshotState4, HapticFeedback hapticFeedback, SnapshotState4 snapshotState42, SnapshotIntState2 snapshotIntState2, List list, SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2, SnapshotState4 snapshotState43, SnapshotState4 snapshotState44) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$chartGroupSize$inlined = i;
        this.$rawComponent$inlined = chartGroup;
        this.$state$inlined = advancedChartGroupState;
        this.$chartGroupXAxis$inlined = axis;
        this.$transformedComponent$inlined = chartGroup2;
        this.$scrubState$delegate$inlined = snapshotState4;
        this.$haptic$inlined = hapticFeedback;
        this.$scrubLineAnimationProgress$inlined = snapshotState42;
        this.$chartGroupXAxisHeight$delegate$inlined = snapshotIntState2;
        this.$chartYAxes$inlined = list;
        this.$yAxisRects$inlined = snapshotStateMap;
        this.$chartRects$inlined = snapshotStateMap2;
        this.$globalChartRect$delegate$inlined = snapshotState43;
        this.$verticalScrubLineDistanceToRightOfChart$delegate$inlined = snapshotState44;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Iterator it;
        int i2;
        Composer composer2 = composer;
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
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
        ConstraintLayoutScope constraintLayoutScope = this.$scope;
        composer2.startReplaceGroup(-200601766);
        ArrayList arrayList = new ArrayList(this.$chartGroupSize$inlined);
        for (int i3 = 0; i3 < this.$chartGroupSize$inlined; i3++) {
            arrayList.add(constraintLayoutScope.createRef());
        }
        ArrayList arrayList2 = new ArrayList(this.$chartGroupSize$inlined);
        for (int i4 = 0; i4 < this.$chartGroupSize$inlined; i4++) {
            arrayList2.add(constraintLayoutScope.createRef());
        }
        ArrayList arrayList3 = new ArrayList(this.$chartGroupSize$inlined);
        for (int i5 = 0; i5 < this.$chartGroupSize$inlined; i5++) {
            arrayList3.add(constraintLayoutScope.createRef());
        }
        ArrayList arrayList4 = new ArrayList(this.$chartGroupSize$inlined);
        for (int i6 = 0; i6 < this.$chartGroupSize$inlined; i6++) {
            arrayList4.add(constraintLayoutScope.createRef());
        }
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ArrayList arrayList5 = new ArrayList(this.$chartGroupSize$inlined);
        for (int i7 = 0; i7 < this.$chartGroupSize$inlined; i7++) {
            arrayList5.add(constraintLayoutScope.createRef());
        }
        ArrayList arrayList6 = new ArrayList(this.$chartGroupSize$inlined);
        for (int i8 = 0; i8 < this.$chartGroupSize$inlined; i8++) {
            arrayList6.add(constraintLayoutScope.createRef());
        }
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope.createRef();
        ArrayList arrayList7 = new ArrayList(this.$chartGroupSize$inlined);
        for (int i9 = 0; i9 < this.$chartGroupSize$inlined; i9++) {
            arrayList7.add(constraintLayoutScope.createRef());
        }
        ConstraintLayoutBaseScope4[] constraintLayoutBaseScope4Arr = (ConstraintLayoutBaseScope4[]) arrayList3.toArray(new ConstraintLayoutBaseScope4[0]);
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr, constraintLayoutBaseScope4Arr.length), 0.0f, 2, null);
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr, constraintLayoutBaseScope4Arr.length), 0.0f, 2, null);
        float fMo5013toDpu2uoSUM = ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(this.$state$inlined.getTopIndicatorPadding());
        List charts = this.$rawComponent$inlined.getCharts();
        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(charts, 10));
        Iterator it2 = charts.iterator();
        while (it2.hasNext()) {
            Float weight = ((Chart) it2.next()).getWeight();
            arrayList8.add(Float.valueOf(weight != null ? weight.floatValue() : 0.0f));
        }
        List listM18594getHorizontalGuidelinesrAjV9yQ = SduiAdvancedChartKt.m18594getHorizontalGuidelinesrAjV9yQ(constraintLayoutScope, fMo5013toDpu2uoSUM, constraintLayoutBaseScope4Component1, arrayList8, this.$state$inlined.getUseWeightsAsHeight());
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(22);
        int i10 = this.$chartGroupSize$inlined;
        Axis axis = this.$chartGroupXAxis$inlined;
        AxisConfig axisConfig = this.$state$inlined.getAxisConfig();
        composer2.startReplaceGroup(5004770);
        Object objRememberedValue = composer2.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new SduiAdvancedChartKt$SduiAdvancedChartGroup$13$1$1(this.$chartGroupXAxisHeight$delegate$inlined);
            composer2.updateRememberedValue(objRememberedValue);
        }
        composer2.endReplaceGroup();
        ArrayList arrayList9 = arrayList7;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor = verticalAnchorM8138createStartBarrier3ABfNKs$default;
        SduiAdvancedChartKt.ChartGroupXAxis(constraintLayoutScope, i10, axis, constraintLayoutBaseScope4Component1, arrayList, axisConfig, verticalAnchor, verticalAnchorM8137createEndBarrier3ABfNKs$default, (Function1) objRememberedValue, composer2, ConstraintLayoutScope.$stable | 100663296 | (Axis.$stable << 6));
        ArrayList arrayList10 = arrayList;
        composer2.startReplaceGroup(1933257821);
        int i11 = 0;
        for (Object obj : this.$transformedComponent$inlined.getCharts()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Chart chart = (Chart) obj;
            float fM7995constructorimpl2 = i11 == 0 ? C2002Dp.m7995constructorimpl(0) : fM7995constructorimpl;
            Axis axis2 = (Axis) this.$chartYAxes$inlined.get(i11);
            YAxisLocation yAxisLocation = this.$state$inlined.getAxisConfig().getYAxisLocation();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged = composer2.changed(this.$yAxisRects$inlined) | composer2.changed(i11);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$13$2$1$1(this.$yAxisRects$inlined, i11);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion, (Function1) objRememberedValue2);
            int i13 = ConstraintLayoutScope.$stable;
            ArrayList arrayList11 = arrayList10;
            ArrayList arrayList12 = arrayList3;
            int i14 = i11;
            List list = listM18594getHorizontalGuidelinesrAjV9yQ;
            SduiAdvancedChartKt.ChartYAxis(constraintLayoutScope, axis2, arrayList12, arrayList11, i14, yAxisLocation, verticalAnchor, verticalAnchorM8137createEndBarrier3ABfNKs$default, modifierOnGloballyPositioned, composer2, i13 | (Axis.$stable << 3), 0);
            arrayList10 = arrayList11;
            List<SegmentedLine> listMapSduiSegmentedLines = SduiChartMappersKt.mapSduiSegmentedLines(chart.getLines(), composer2, 0);
            ImmutableList<Fill> immutableListMapSduiFills = SduiChartMappersKt.mapSduiFills(chart.getFills(), composer2, 0);
            boolean useWeightsAsHeight = this.$state$inlined.getUseWeightsAsHeight();
            ScrubState scrubStateSduiAdvancedChartGroup$lambda$49 = SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(this.$scrubState$delegate$inlined);
            YAxisLocation yAxisLocation2 = this.$state$inlined.getAxisConfig().getYAxisLocation();
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer2.changed(this.$chartRects$inlined) | composer2.changed(i14);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$13$2$2$1(this.$chartRects$inlined, i14);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceGroup();
            ArrayList arrayList13 = arrayList2;
            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2 = verticalAnchorM8137createEndBarrier3ABfNKs$default;
            ArrayList arrayList14 = arrayList9;
            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3 = verticalAnchor;
            SduiAdvancedChartKt.m18575ChartkiIZU34(constraintLayoutScope, chart, arrayList10, arrayList14, list, useWeightsAsHeight, fM7995constructorimpl2, i14, listMapSduiSegmentedLines, immutableListMapSduiFills, scrubStateSduiAdvancedChartGroup$lambda$49, yAxisLocation2, verticalAnchor3, verticalAnchor2, null, (Function1) objRememberedValue3, composer2, i13, Point.$stable | 24576);
            verticalAnchor = verticalAnchor3;
            verticalAnchorM8137createEndBarrier3ABfNKs$default = verticalAnchor2;
            SduiAdvancedChartKt.ChartBottomDivider(constraintLayoutScope, arrayList14, arrayList10, i14, this.$state$inlined.getChartBottomDividerType(), this.$state$inlined.getAxisConfig().getYAxisLocation(), verticalAnchor, verticalAnchorM8137createEndBarrier3ABfNKs$default, composer, i13);
            composer2 = composer;
            arrayList9 = arrayList14;
            i11 = i12;
            arrayList3 = arrayList12;
            listM18594getHorizontalGuidelinesrAjV9yQ = list;
            arrayList2 = arrayList13;
        }
        List list2 = listM18594getHorizontalGuidelinesrAjV9yQ;
        ArrayList arrayList15 = arrayList2;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4 = verticalAnchor;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor5 = verticalAnchorM8137createEndBarrier3ABfNKs$default;
        composer.endReplaceGroup();
        boolean xAxisBottomDividers = this.$state$inlined.getAxisConfig().getXAxisBottomDividers();
        int i15 = ConstraintLayoutScope.$stable;
        SduiAdvancedChartKt.ChartGroupXAxisBottomDivider(constraintLayoutScope, constraintLayoutBaseScope4CreateRef, constraintLayoutBaseScope4Component1, xAxisBottomDividers, composer, i15);
        Composer composer3 = composer;
        ScrubState scrubStateSduiAdvancedChartGroup$lambda$492 = SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(this.$scrubState$delegate$inlined);
        Float snapX = scrubStateSduiAdvancedChartGroup$lambda$492 != null ? scrubStateSduiAdvancedChartGroup$lambda$492.getSnapX() : null;
        composer3.startReplaceGroup(-1746271574);
        boolean zChanged3 = composer3.changed(this.$scrubState$delegate$inlined) | composer3.changedInstance(this.$state$inlined) | composer3.changedInstance(this.$haptic$inlined);
        Object objRememberedValue4 = composer3.rememberedValue();
        if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$13$3$1(this.$state$inlined, this.$haptic$inlined, this.$scrubState$delegate$inlined, null);
            composer3.updateRememberedValue(objRememberedValue4);
        }
        composer3.endReplaceGroup();
        int i16 = 0;
        EffectsKt.LaunchedEffect(snapX, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer3, 0);
        ScrubState scrubStateSduiAdvancedChartGroup$lambda$493 = SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(this.$scrubState$delegate$inlined);
        composer3.startReplaceGroup(1933337281);
        if (scrubStateSduiAdvancedChartGroup$lambda$493 != null) {
            SduiAdvancedChartKt.m18576ChartGroupScrubLinesLiby8ZU(constraintLayoutScope, this.$state$inlined.getScrubConfig(), scrubStateSduiAdvancedChartGroup$lambda$493.m2457x73acf0ad(), SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$36(this.$globalChartRect$delegate$inlined), scrubStateSduiAdvancedChartGroup$lambda$493.getScrubLineX(), constraintLayoutBaseScope4Component4, ((Number) this.$scrubLineAnimationProgress$inlined.getValue()).floatValue(), composer3, i15);
            composer3 = composer3;
            Unit unit = Unit.INSTANCE;
        }
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(1933353366);
        Iterator it3 = this.$transformedComponent$inlined.getCharts().iterator();
        int i17 = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Chart chart2 = (Chart) next;
            float fM7995constructorimpl3 = i17 == 0 ? C2002Dp.m7995constructorimpl(i16) : fM7995constructorimpl;
            ArrayList arrayList16 = arrayList15;
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = (ConstraintLayoutBaseScope4) arrayList16.get(i17);
            ScrubState scrubStateSduiAdvancedChartGroup$lambda$494 = SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(this.$scrubState$delegate$inlined);
            YAxisLocation yAxisLocation3 = this.$state$inlined.getAxisConfig().getYAxisLocation();
            int i19 = ConstraintLayoutScope.$stable;
            int i20 = Point.$stable;
            int i21 = i17;
            float f = fM7995constructorimpl3;
            int i22 = i16;
            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor6 = verticalAnchor4;
            Composer composer4 = composer3;
            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor7 = verticalAnchor5;
            SduiAdvancedChartKt.m18582ScrubDot_WMjBM(constraintLayoutScope, chart2, i21, f, list2, constraintLayoutBaseScope4, scrubStateSduiAdvancedChartGroup$lambda$494, yAxisLocation3, verticalAnchor6, verticalAnchor7, composer4, i19 | (i20 << 18));
            Composer composer5 = composer4;
            int i23 = i21;
            composer5.startReplaceGroup(1933375086);
            if (this.$state$inlined.getScrubConfig().getYLabelEnabled()) {
                it = it3;
                i2 = i22;
                SduiAdvancedChartKt.m18577ChartYAxisScrubLabelskrPljE(constraintLayoutScope, (Axis) this.$chartYAxes$inlined.get(i23), arrayList4, list2, f, i23, SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(this.$scrubState$delegate$inlined), SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$54(this.$verticalScrubLineDistanceToRightOfChart$delegate$inlined), this.$state$inlined.getAxisConfig().getYAxisLocation(), verticalAnchor6, verticalAnchor7, composer5, i19 | (Axis.$stable << 3) | (i20 << 18), 0);
                i23 = i23;
                verticalAnchor4 = verticalAnchor6;
                verticalAnchor5 = verticalAnchor7;
                composer5 = composer5;
            } else {
                verticalAnchor4 = verticalAnchor6;
                verticalAnchor5 = verticalAnchor7;
                it = it3;
                i2 = i22;
            }
            composer5.endReplaceGroup();
            composer5.startReplaceGroup(1933399731);
            if (this.$state$inlined.getScrubConfig().getLegendsEnabled()) {
                SduiAdvancedChartKt.ChartLegends(constraintLayoutScope, ChartLegend.toLegendLists(chart2.getLegend_data()), list2, i23, arrayList5, SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(this.$scrubState$delegate$inlined), composer5, i19 | (i20 << 15));
            }
            composer.endReplaceGroup();
            SduiAdvancedChartKt.ChartTitle(constraintLayoutScope, arrayList6, list2, i23, SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(this.$scrubState$delegate$inlined), chart2.getTitle(), composer, i19 | (i20 << 12));
            composer3 = composer;
            i16 = i2;
            i17 = i18;
            arrayList15 = arrayList16;
            it3 = it;
        }
        int i24 = i16;
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(1933420228);
        if (this.$state$inlined.getScrubConfig().getXLabelEnabled()) {
            SduiAdvancedChartKt.ChartGroupXAxisScrubLabel(constraintLayoutScope, this.$chartGroupXAxis$inlined, constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2, SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(this.$scrubState$delegate$inlined), this.$state$inlined.getAxisConfig().getYAxisLocation(), verticalAnchor4, verticalAnchor5, null, composer3, ConstraintLayoutScope.$stable | 100663296 | (Axis.$stable << 3) | (Point.$stable << 12));
        }
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(1933438664);
        if (this.$state$inlined.getScrubConfig().getLegendsEnabled()) {
            SduiAdvancedChartKt.ChartGroupLegends(constraintLayoutScope, ChartLegend.toLegendLists(this.$transformedComponent$inlined.getLegend_data()), constraintLayoutBaseScope4Component3, SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(this.$scrubState$delegate$inlined), ((Number) this.$scrubLineAnimationProgress$inlined.getValue()).floatValue(), composer3, ConstraintLayoutScope.$stable | (Point.$stable << 9));
        }
        composer3.endReplaceGroup();
        composer3.endReplaceGroup();
        boolean zChangedInstance = composer3.changedInstance(this.$scope) | composer3.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue5 = composer3.rememberedValue();
        if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$$inlined$ConstraintLayout$1.1
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
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope2.getContainerObject().mo8187clone());
                    if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                        snapshotState.setValue(constraintSet3);
                        snapshotState2.setValue(snapshotState.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer3.updateRememberedValue(objRememberedValue5);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue5, composer3, i24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
