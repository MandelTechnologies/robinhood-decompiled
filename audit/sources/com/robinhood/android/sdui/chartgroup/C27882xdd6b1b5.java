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
import com.robinhood.android.charts.model.Fill;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.model.ProtoAxis;
import com.robinhood.android.charts.segmented.SegmentedLine;
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
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import rh_server_driven_ui.p531v1.ChartDto;
import rh_server_driven_ui.p531v1.ChartGroupDto;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$lambda$184$$inlined$ConstraintLayout$1 */
/* loaded from: classes5.dex */
public final class C27882xdd6b1b5 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ int $chartGroupSize$inlined;
    final /* synthetic */ ProtoAxis $chartGroupXAxis$inlined;
    final /* synthetic */ SnapshotIntState2 $chartGroupXAxisHeight$delegate$inlined;
    final /* synthetic */ SnapshotStateMap $chartRects$inlined;
    final /* synthetic */ List $chartYAxesPrimary$inlined;
    final /* synthetic */ List $chartYAxesSecondary$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ SnapshotState4 $globalChartRect$delegate$inlined;
    final /* synthetic */ HapticFeedback $haptic$inlined;
    final /* synthetic */ ChartGroupDto $rawComponent$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState4 $scrubLineAnimationProgress$inlined;
    final /* synthetic */ SnapshotState4 $scrubState$delegate$inlined;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ ProtoAdvancedChartGroupState $state$inlined;
    final /* synthetic */ ChartGroupDto $transformedComponent$inlined;
    final /* synthetic */ SnapshotState4 $verticalScrubLineDistanceToRightOfChart$delegate$inlined;
    final /* synthetic */ SnapshotStateMap $yAxisRects$inlined;
    final /* synthetic */ SnapshotStateMap $yAxisSecondaryRects$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27882xdd6b1b5(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, int i, ChartGroupDto chartGroupDto, ProtoAdvancedChartGroupState protoAdvancedChartGroupState, ProtoAxis protoAxis, ChartGroupDto chartGroupDto2, SnapshotState4 snapshotState4, HapticFeedback hapticFeedback, SnapshotState4 snapshotState42, List list, SnapshotIntState2 snapshotIntState2, List list2, SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2, SnapshotStateMap snapshotStateMap3, SnapshotState4 snapshotState43, SnapshotState4 snapshotState44) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$chartGroupSize$inlined = i;
        this.$rawComponent$inlined = chartGroupDto;
        this.$state$inlined = protoAdvancedChartGroupState;
        this.$chartGroupXAxis$inlined = protoAxis;
        this.$transformedComponent$inlined = chartGroupDto2;
        this.$scrubState$delegate$inlined = snapshotState4;
        this.$haptic$inlined = hapticFeedback;
        this.$scrubLineAnimationProgress$inlined = snapshotState42;
        this.$chartYAxesSecondary$inlined = list;
        this.$chartGroupXAxisHeight$delegate$inlined = snapshotIntState2;
        this.$chartYAxesPrimary$inlined = list2;
        this.$yAxisRects$inlined = snapshotStateMap;
        this.$yAxisSecondaryRects$inlined = snapshotStateMap2;
        this.$chartRects$inlined = snapshotStateMap3;
        this.$globalChartRect$delegate$inlined = snapshotState43;
        this.$verticalScrubLineDistanceToRightOfChart$delegate$inlined = snapshotState44;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ArrayList arrayList;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor;
        int i2;
        ArrayList arrayList2;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
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
        composer.startReplaceGroup(-1940731392);
        ArrayList arrayList3 = new ArrayList(this.$chartGroupSize$inlined);
        for (int i3 = 0; i3 < this.$chartGroupSize$inlined; i3++) {
            arrayList3.add(constraintLayoutScope.createRef());
        }
        ArrayList arrayList4 = new ArrayList(this.$chartGroupSize$inlined);
        for (int i4 = 0; i4 < this.$chartGroupSize$inlined; i4++) {
            arrayList4.add(constraintLayoutScope.createRef());
        }
        ArrayList arrayList5 = new ArrayList(this.$chartGroupSize$inlined);
        for (int i5 = 0; i5 < this.$chartGroupSize$inlined; i5++) {
            arrayList5.add(constraintLayoutScope.createRef());
        }
        ArrayList arrayList6 = new ArrayList(this.$chartGroupSize$inlined);
        for (int i6 = 0; i6 < this.$chartGroupSize$inlined; i6++) {
            arrayList6.add(constraintLayoutScope.createRef());
        }
        ArrayList arrayList7 = new ArrayList(this.$chartGroupSize$inlined);
        for (int i7 = 0; i7 < this.$chartGroupSize$inlined; i7++) {
            arrayList7.add(constraintLayoutScope.createRef());
        }
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ArrayList arrayList8 = new ArrayList(this.$chartGroupSize$inlined);
        for (int i8 = 0; i8 < this.$chartGroupSize$inlined; i8++) {
            arrayList8.add(constraintLayoutScope.createRef());
        }
        ArrayList arrayList9 = new ArrayList(this.$chartGroupSize$inlined);
        for (int i9 = 0; i9 < this.$chartGroupSize$inlined; i9++) {
            arrayList9.add(constraintLayoutScope.createRef());
        }
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope.createRef();
        ArrayList arrayList10 = new ArrayList(this.$chartGroupSize$inlined);
        for (int i10 = 0; i10 < this.$chartGroupSize$inlined; i10++) {
            arrayList10.add(constraintLayoutScope.createRef());
        }
        ConstraintLayoutBaseScope4[] constraintLayoutBaseScope4Arr = (ConstraintLayoutBaseScope4[]) arrayList5.toArray(new ConstraintLayoutBaseScope4[0]);
        ConstraintLayoutBaseScope4[] constraintLayoutBaseScope4Arr2 = (ConstraintLayoutBaseScope4[]) arrayList6.toArray(new ConstraintLayoutBaseScope4[0]);
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList4;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr, constraintLayoutBaseScope4Arr.length), 0.0f, 2, null);
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr, constraintLayoutBaseScope4Arr.length), 0.0f, 2, null);
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr2, constraintLayoutBaseScope4Arr2.length), 0.0f, 2, null);
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr2, constraintLayoutBaseScope4Arr2.length), 0.0f, 2, null);
        float fMo5013toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(this.$state$inlined.getTopIndicatorPadding());
        List<ChartDto> charts = this.$rawComponent$inlined.getCharts();
        ArrayList arrayList13 = new ArrayList(CollectionsKt.collectionSizeOrDefault(charts, 10));
        Iterator<T> it = charts.iterator();
        while (it.hasNext()) {
            Float weight = ((ChartDto) it.next()).getWeight();
            arrayList13.add(Float.valueOf(weight != null ? weight.floatValue() : 0.0f));
        }
        List listM18594getHorizontalGuidelinesrAjV9yQ = SduiAdvancedChartKt.m18594getHorizontalGuidelinesrAjV9yQ(constraintLayoutScope, fMo5013toDpu2uoSUM, constraintLayoutBaseScope4Component1, arrayList13, this.$state$inlined.getUseWeightsAsHeight());
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(22);
        int i11 = this.$chartGroupSize$inlined;
        ProtoAxis protoAxis = this.$chartGroupXAxis$inlined;
        ProtoAxisConfig axisConfig = this.$state$inlined.getAxisConfig();
        if (this.$chartYAxesSecondary$inlined.isEmpty()) {
            arrayList = arrayList10;
            verticalAnchor = null;
        } else {
            arrayList = arrayList10;
            verticalAnchor = verticalAnchorM8138createStartBarrier3ABfNKs$default2;
        }
        composer.startReplaceGroup(5004770);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$2$1(this.$chartGroupXAxisHeight$delegate$inlined);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4 = verticalAnchorM8138createStartBarrier3ABfNKs$default;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor5 = verticalAnchorM8137createEndBarrier3ABfNKs$default;
        ArrayList arrayList14 = arrayList;
        SduiAdvancedChartKt.ProtoChartGroupXAxis(constraintLayoutScope, i11, protoAxis, constraintLayoutBaseScope4Component1, arrayList3, axisConfig, verticalAnchor4, verticalAnchor5, verticalAnchor, (Function1) objRememberedValue, composer, ConstraintLayoutScope.$stable | 805306368 | (ProtoAxis.$stable << 6));
        ArrayList arrayList15 = arrayList3;
        Composer composer2 = composer;
        composer2.startReplaceGroup(1600043778);
        int i12 = 0;
        for (Object obj : this.$transformedComponent$inlined.getCharts()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ChartDto chartDto = (ChartDto) obj;
            float fM7995constructorimpl2 = i12 == 0 ? C2002Dp.m7995constructorimpl(0) : fM7995constructorimpl;
            ProtoAxis protoAxis2 = (ProtoAxis) this.$chartYAxesPrimary$inlined.get(i12);
            YAxisLocation yAxisPrimaryLocation = this.$state$inlined.getAxisConfig().getYAxisPrimaryLocation();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged = composer2.changed(this.$yAxisRects$inlined) | composer2.changed(i12);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$3$1$1(this.$yAxisRects$inlined, i12);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion, (Function1) objRememberedValue2);
            float f = fM7995constructorimpl2;
            int i14 = ConstraintLayoutScope.$stable;
            int i15 = ProtoAxis.$stable;
            ArrayList arrayList16 = arrayList15;
            ArrayList arrayList17 = arrayList5;
            ArrayList arrayList18 = arrayList14;
            SduiAdvancedChartKt.ProtoChartYAxis(constraintLayoutScope, protoAxis2, arrayList17, arrayList16, i12, yAxisPrimaryLocation, verticalAnchor4, verticalAnchor5, modifierOnGloballyPositioned, composer2, i14 | (i15 << 3), 0);
            arrayList15 = arrayList16;
            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor6 = verticalAnchor4;
            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor7 = verticalAnchor5;
            composer2.startReplaceGroup(1600064039);
            if (this.$chartYAxesSecondary$inlined.isEmpty()) {
                arrayList2 = arrayList11;
                verticalAnchor2 = verticalAnchorM8138createStartBarrier3ABfNKs$default2;
                verticalAnchor3 = verticalAnchorM8137createEndBarrier3ABfNKs$default2;
            } else {
                ProtoAxis protoAxis3 = (ProtoAxis) this.$chartYAxesSecondary$inlined.get(i12);
                YAxisLocation yAxisSecondaryLocation = this.$state$inlined.getAxisConfig().getYAxisSecondaryLocation();
                if (yAxisSecondaryLocation == null) {
                    yAxisSecondaryLocation = this.$state$inlined.getAxisConfig().getYAxisPrimaryLocation();
                }
                YAxisLocation yAxisLocation = yAxisSecondaryLocation;
                composer2.startReplaceGroup(-1633490746);
                boolean zChanged2 = composer2.changed(this.$yAxisSecondaryRects$inlined) | composer2.changed(i12);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$3$2$1(this.$yAxisSecondaryRects$inlined, i12);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                ArrayList arrayList19 = arrayList11;
                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor8 = verticalAnchorM8138createStartBarrier3ABfNKs$default2;
                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor9 = verticalAnchorM8137createEndBarrier3ABfNKs$default2;
                SduiAdvancedChartKt.ProtoChartYAxis(constraintLayoutScope, protoAxis3, arrayList19, arrayList15, i12, yAxisLocation, verticalAnchor8, verticalAnchor9, OnGloballyPositionedModifier3.onGloballyPositioned(companion, (Function1) objRememberedValue3), composer2, i14 | (i15 << 3), 0);
                arrayList2 = arrayList19;
                arrayList15 = arrayList15;
                verticalAnchor2 = verticalAnchor8;
                verticalAnchor3 = verticalAnchor9;
            }
            composer2.endReplaceGroup();
            List<SegmentedLine> listMapSegmentedDtoLines = SduiChartMappersKt.mapSegmentedDtoLines(extensions2.toImmutableList(chartDto.getLines()), composer2, 0);
            ImmutableList<Fill> immutableListMapFillDto = SduiChartMappersKt.mapFillDto(extensions2.toImmutableList(chartDto.getFills()), composer2, 0);
            boolean useWeightsAsHeight = this.$state$inlined.getUseWeightsAsHeight();
            ScrubState scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$141 = SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(this.$scrubState$delegate$inlined);
            YAxisLocation yAxisPrimaryLocation2 = this.$state$inlined.getAxisConfig().getYAxisPrimaryLocation();
            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor10 = !this.$chartYAxesSecondary$inlined.isEmpty() ? verticalAnchor2 : null;
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged3 = composer2.changed(this.$chartRects$inlined) | composer2.changed(i12);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$3$4$1(this.$chartRects$inlined, i12);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceGroup();
            int i16 = i12;
            List list = listM18594getHorizontalGuidelinesrAjV9yQ;
            SduiAdvancedChartKt.m18579ProtoChartosRQHRo(constraintLayoutScope, chartDto, arrayList15, arrayList18, list, useWeightsAsHeight, f, i16, listMapSegmentedDtoLines, immutableListMapFillDto, scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$141, yAxisPrimaryLocation2, verticalAnchor6, verticalAnchor7, verticalAnchor10, (Function1) objRememberedValue4, this.$state$inlined.getLineRevealAnimationSpec(), composer2, i14, Point.$stable);
            verticalAnchor4 = verticalAnchor6;
            verticalAnchor5 = verticalAnchor7;
            arrayList14 = arrayList18;
            SduiAdvancedChartKt.ChartBottomDivider(constraintLayoutScope, arrayList14, arrayList15, i16, this.$state$inlined.getChartBottomDividerType(), this.$state$inlined.getAxisConfig().getYAxisPrimaryLocation(), verticalAnchor4, verticalAnchor5, composer, i14);
            composer2 = composer;
            listM18594getHorizontalGuidelinesrAjV9yQ = list;
            i12 = i13;
            verticalAnchorM8138createStartBarrier3ABfNKs$default2 = verticalAnchor2;
            arrayList5 = arrayList17;
            arrayList11 = arrayList2;
            verticalAnchorM8137createEndBarrier3ABfNKs$default2 = verticalAnchor3;
            arrayList12 = arrayList12;
        }
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor11 = verticalAnchor4;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor12 = verticalAnchor5;
        ArrayList arrayList20 = arrayList12;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor13 = verticalAnchorM8138createStartBarrier3ABfNKs$default2;
        List list2 = listM18594getHorizontalGuidelinesrAjV9yQ;
        composer.endReplaceGroup();
        boolean xAxisBottomDividers = this.$state$inlined.getAxisConfig().getXAxisBottomDividers();
        int i17 = ConstraintLayoutScope.$stable;
        SduiAdvancedChartKt.ChartGroupXAxisBottomDivider(constraintLayoutScope, constraintLayoutBaseScope4CreateRef, constraintLayoutBaseScope4Component1, xAxisBottomDividers, composer, i17);
        Composer composer3 = composer;
        ScrubState scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1412 = SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(this.$scrubState$delegate$inlined);
        Float snapX = scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1412 != null ? scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1412.getSnapX() : null;
        composer3.startReplaceGroup(-1746271574);
        boolean zChanged4 = composer3.changed(this.$scrubState$delegate$inlined) | composer3.changedInstance(this.$state$inlined) | composer3.changedInstance(this.$haptic$inlined);
        Object objRememberedValue5 = composer3.rememberedValue();
        if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$4$1(this.$state$inlined, this.$haptic$inlined, this.$scrubState$delegate$inlined, null);
            composer3.updateRememberedValue(objRememberedValue5);
        }
        composer3.endReplaceGroup();
        int i18 = 0;
        EffectsKt.LaunchedEffect(snapX, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer3, 0);
        ScrubState scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1413 = SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(this.$scrubState$delegate$inlined);
        composer3.startReplaceGroup(1600152781);
        if (scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1413 != null) {
            SduiAdvancedChartKt.m18576ChartGroupScrubLinesLiby8ZU(constraintLayoutScope, this.$state$inlined.getScrubConfig(), scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1413.m2457x73acf0ad(), SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$128(this.$globalChartRect$delegate$inlined), scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1413.getScrubLineX(), constraintLayoutBaseScope4Component4, ((Number) this.$scrubLineAnimationProgress$inlined.getValue()).floatValue(), composer3, i17);
            composer3 = composer3;
            Unit unit = Unit.INSTANCE;
        }
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(1600168912);
        int i19 = 0;
        for (Object obj2 : this.$transformedComponent$inlined.getCharts()) {
            int i20 = i19 + 1;
            if (i19 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ChartDto chartDto2 = (ChartDto) obj2;
            float fM7995constructorimpl3 = i19 == 0 ? C2002Dp.m7995constructorimpl(i18) : fM7995constructorimpl;
            ArrayList arrayList21 = arrayList20;
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = (ConstraintLayoutBaseScope4) arrayList21.get(i19);
            ScrubState scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1414 = SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(this.$scrubState$delegate$inlined);
            YAxisLocation yAxisPrimaryLocation3 = this.$state$inlined.getAxisConfig().getYAxisPrimaryLocation();
            int i21 = ConstraintLayoutScope.$stable;
            int i22 = Point.$stable;
            arrayList20 = arrayList21;
            int i23 = i19;
            float f2 = fM7995constructorimpl3;
            List list3 = list2;
            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor14 = verticalAnchor11;
            Composer composer4 = composer3;
            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor15 = verticalAnchor12;
            SduiAdvancedChartKt.m18581ProtoScrubDot_WMjBM(constraintLayoutScope, chartDto2, i23, f2, list3, constraintLayoutBaseScope4, scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1414, yAxisPrimaryLocation3, verticalAnchor14, verticalAnchor15, composer4, i21 | (i22 << 18));
            int i24 = i23;
            List list4 = list3;
            Composer composer5 = composer4;
            composer5.startReplaceGroup(1600190989);
            if (this.$state$inlined.getScrubConfig().getYLabelEnabled()) {
                i2 = i18;
                SduiAdvancedChartKt.m18580ProtoChartYAxisScrubLabelskrPljE(constraintLayoutScope, (ProtoAxis) this.$chartYAxesPrimary$inlined.get(i24), arrayList7, list4, f2, i24, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(this.$scrubState$delegate$inlined), SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$146(this.$verticalScrubLineDistanceToRightOfChart$delegate$inlined), this.$state$inlined.getAxisConfig().getYAxisPrimaryLocation(), verticalAnchor14, verticalAnchor15, composer5, i21 | (ProtoAxis.$stable << 3) | (i22 << 18), 0);
                list4 = list4;
                i24 = i24;
                verticalAnchor11 = verticalAnchor14;
                verticalAnchor12 = verticalAnchor15;
                composer5 = composer5;
            } else {
                verticalAnchor11 = verticalAnchor14;
                verticalAnchor12 = verticalAnchor15;
                i2 = i18;
            }
            composer5.endReplaceGroup();
            composer5.startReplaceGroup(1600216233);
            if (this.$state$inlined.getScrubConfig().getLegendsEnabled()) {
                SduiAdvancedChartKt.ProtoChartLegends(constraintLayoutScope, ChartLegend.toProtoLegendLists(chartDto2.getLegend_data()), list4, i24, arrayList8, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(this.$scrubState$delegate$inlined), composer5, i21 | (i22 << 15));
            }
            composer.endReplaceGroup();
            SduiAdvancedChartKt.ProtoChartTitle(constraintLayoutScope, arrayList9, list4, i24, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(this.$scrubState$delegate$inlined), chartDto2.getTitle(), composer, i21 | (i22 << 12));
            list2 = list4;
            composer3 = composer;
            i18 = i2;
            i19 = i20;
        }
        int i25 = i18;
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(1600237259);
        if (this.$state$inlined.getScrubConfig().getXLabelEnabled()) {
            SduiAdvancedChartKt.ProtoChartGroupXAxisScrubLabel(constraintLayoutScope, this.$chartGroupXAxis$inlined, constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(this.$scrubState$delegate$inlined), this.$state$inlined.getAxisConfig().getYAxisPrimaryLocation(), verticalAnchor11, verticalAnchor12, !this.$chartYAxesSecondary$inlined.isEmpty() ? verticalAnchor13 : null, composer3, ConstraintLayoutScope.$stable | (ProtoAxis.$stable << 3) | (Point.$stable << 12));
        }
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(1600257534);
        if (this.$state$inlined.getScrubConfig().getLegendsEnabled()) {
            SduiAdvancedChartKt.ProtoChartGroupLegends(constraintLayoutScope, ChartLegend.toProtoLegendLists(this.$transformedComponent$inlined.getLegend_data()), constraintLayoutBaseScope4Component3, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(this.$scrubState$delegate$inlined), ((Number) this.$scrubLineAnimationProgress$inlined.getValue()).floatValue(), composer3, ConstraintLayoutScope.$stable | (Point.$stable << 9));
        }
        composer3.endReplaceGroup();
        composer3.endReplaceGroup();
        boolean zChangedInstance = composer3.changedInstance(this.$scope) | composer3.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue6 = composer3.rememberedValue();
        if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue6 = new Function0<Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$lambda$184$$inlined$ConstraintLayout$1.1
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
            composer3.updateRememberedValue(objRememberedValue6);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue6, composer3, i25);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
