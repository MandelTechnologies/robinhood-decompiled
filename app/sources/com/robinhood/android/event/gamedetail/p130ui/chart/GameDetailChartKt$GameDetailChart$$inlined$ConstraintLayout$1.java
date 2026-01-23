package com.robinhood.android.event.gamedetail.p130ui.chart;

import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.ModifiersKt;
import com.robinhood.android.charts.span.ChartDisplaySpanExtensions;
import com.robinhood.android.charts.span.UnifiedSpan;
import com.robinhood.android.charts.span.UnifiedSpanSelectorKt;
import com.robinhood.android.charts.span.UnifiedSpanSelectorState;
import com.robinhood.android.event.gamedetail.GameDetailDataState;
import com.robinhood.android.event.gamedetail.GameDetailViewState;
import com.robinhood.android.event.gamedetail.callbacks.ChartCallbacks;
import com.robinhood.android.event.gamedetail.p130ui.chart.ChartState;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartColorOverlay;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class GameDetailChartKt$GameDetailChart$$inlined$ConstraintLayout$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ ChartCallbacks $chartCallbacks$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ ChartState $state$inlined;
    final /* synthetic */ GameDetailViewState.VolumeState $volumeState$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailChartKt$GameDetailChart$$inlined$ConstraintLayout$1(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, ChartState chartState, GameDetailViewState.VolumeState volumeState, ChartCallbacks chartCallbacks) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$state$inlined = chartState;
        this.$volumeState$inlined = volumeState;
        this.$chartCallbacks$inlined = chartCallbacks;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
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
        composer.startReplaceGroup(940184599);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
        composer.endReplaceGroup();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(constraintLayoutBaseScope4Component2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new GameDetailChartKt$GameDetailChart$1$1$1(constraintLayoutBaseScope4Component2);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue2);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierConstrainAs);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        Point scrubbedPoint = this.$state$inlined.getScrubbedPoint();
        composer.startReplaceGroup(5004770);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new GameDetailChartKt$GameDetailChart$1$2$1$1(snapshotIntState2);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        EventLabelTrack.EventLabelTrack(scrubbedPoint, OnGloballyPositionedModifier3.onGloballyPositioned(companion2, (Function1) objRememberedValue3), composer, 48, 0);
        Chart<Parcelable> chart = this.$state$inlined.getChart();
        EventChartColorOverlay colors = this.$state$inlined.getColors();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$chartCallbacks$inlined);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new GameDetailChartKt$GameDetailChart$1$2$2$1(this.$chartCallbacks$inlined);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        EventChart.EventChart(chart, colors, (Function1) ((KFunction) objRememberedValue4), ModifiersKt.fullWidthChartSize(companion2), composer, 0, 0);
        composer.endNode();
        ChartSideLegendState chartSideLegendState = this.$state$inlined.getChartSideLegendState();
        int intValue = snapshotIntState2.getIntValue();
        composer.startReplaceGroup(5004770);
        boolean zChanged2 = composer.changed(constraintLayoutBaseScope4Component1);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new GameDetailChartKt$GameDetailChart$1$3$1(constraintLayoutBaseScope4Component1);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        GameDetailChartSideLegend2.GameDetailChartSideLegend(chartSideLegendState, intValue, constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue5), composer, 0, 0);
        ChartState.DeltaAnimationData leftDeltaAnimationData = this.$state$inlined.getLeftDeltaAnimationData();
        ChartState.DeltaAnimationData rightDeltaAnimationData = this.$state$inlined.getRightDeltaAnimationData();
        composer.startReplaceGroup(5004770);
        boolean zChanged3 = composer.changed(constraintLayoutBaseScope4Component5);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new GameDetailChartKt$GameDetailChart$1$4$1(constraintLayoutBaseScope4Component5);
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        GameDetailChartKt.DeltaAnimations(leftDeltaAnimationData, rightDeltaAnimationData, PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue6), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null), composer, 0, 0);
        GameDetailViewState.VolumeState volumeState = this.$volumeState$inlined;
        composer.startReplaceGroup(5004770);
        boolean zChanged4 = composer.changed(constraintLayoutBaseScope4Component3);
        Object objRememberedValue7 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new GameDetailChartKt$GameDetailChart$1$5$1(constraintLayoutBaseScope4Component3);
            composer.updateRememberedValue(objRememberedValue7);
        }
        composer.endReplaceGroup();
        GameDetailChartKt.OpenInterestOrVolumeDisplay(volumeState, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue7), 0.0f, composer, 0, 1), composer, 0, 0);
        composer.startReplaceGroup(723133616);
        ImmutableList3<DisplaySpan> defaultSpans = GameDetailDataState.INSTANCE.getDefaultSpans();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(defaultSpans, 10));
        Iterator<DisplaySpan> it = defaultSpans.iterator();
        while (it.hasNext()) {
            DisplaySpan next = it.next();
            arrayList.add(new UnifiedSpan(next, StringResources_androidKt.stringResource(ChartDisplaySpanExtensions.getStringRes(next), composer, 0), next == DisplaySpan.HOUR, false, ChartDisplaySpanExtensions.getEducationTourId(next), null, 40, null));
        }
        composer.endReplaceGroup();
        ImmutableList immutableList = extensions2.toImmutableList(arrayList);
        DisplaySpan activeSpan = this.$state$inlined.getActiveSpan();
        if (activeSpan == null) {
            activeSpan = (DisplaySpan) CollectionsKt.first((List) GameDetailDataState.INSTANCE.getDefaultSpans());
        }
        DisplaySpan displaySpan = activeSpan;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(this.$chartCallbacks$inlined);
        Object objRememberedValue8 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue8 = new GameDetailChartKt$GameDetailChart$1$7$1(this.$chartCallbacks$inlined);
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        UnifiedSpanSelectorState unifiedSpanSelectorState = new UnifiedSpanSelectorState(immutableList, displaySpan, (Function1) ((KFunction) objRememberedValue8), false, null, false, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 56, null);
        Modifier.Companion companion4 = Modifier.INSTANCE;
        composer.startReplaceGroup(5004770);
        boolean zChanged5 = composer.changed(constraintLayoutBaseScope4Component1);
        Object objRememberedValue9 = composer.rememberedValue();
        if (zChanged5 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue9 = new GameDetailChartKt$GameDetailChart$1$8$1(constraintLayoutBaseScope4Component1);
            composer.updateRememberedValue(objRememberedValue9);
        }
        composer.endReplaceGroup();
        UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(unifiedSpanSelectorState, SizeKt.m5174width3ABfNKs(constraintLayoutScope.constrainAs(companion4, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue9), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE)), null, null, null, null, null, composer, UnifiedSpanSelectorState.$stable, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        composer.endReplaceGroup();
        boolean zChangedInstance3 = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue10 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue10 = new Function0<Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartKt$GameDetailChart$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(objRememberedValue10);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue10, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
