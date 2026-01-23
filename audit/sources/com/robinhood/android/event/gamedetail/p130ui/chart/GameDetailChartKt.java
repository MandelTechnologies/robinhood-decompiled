package com.robinhood.android.event.gamedetail.p130ui.chart;

import android.os.Parcelable;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
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
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.ModifiersKt;
import com.robinhood.android.charts.span.ChartDisplaySpanExtensions;
import com.robinhood.android.charts.span.UnifiedSpan;
import com.robinhood.android.charts.span.UnifiedSpanSelectorKt;
import com.robinhood.android.charts.span.UnifiedSpanSelectorState;
import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.event.gamedetail.GameDetailDataState;
import com.robinhood.android.event.gamedetail.GameDetailViewState;
import com.robinhood.android.event.gamedetail.callbacks.ChartCallbacks;
import com.robinhood.android.event.gamedetail.p130ui.chart.ChartState;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.eventcontracts.sharedeventui.animation.Delta;
import com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimation2;
import com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimation8;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartColorOverlay;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GameDetailChart.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a+\u0010\u000b\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u000f\u001a!\u0010\u0010\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002"}, m3636d2 = {"GameDetailChart", "", "state", "Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState;", "volumeState", "Lcom/robinhood/android/event/gamedetail/GameDetailViewState$VolumeState;", "chartCallbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/ChartCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState;Lcom/robinhood/android/event/gamedetail/GameDetailViewState$VolumeState;Lcom/robinhood/android/event/gamedetail/callbacks/ChartCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DeltaAnimations", "left", "Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState$DeltaAnimationData;", "right", "(Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState$DeltaAnimationData;Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState$DeltaAnimationData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OpenInterestOrVolumeDisplay", "(Lcom/robinhood/android/event/gamedetail/GameDetailViewState$VolumeState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-game-detail_externalDebug", "labelTrackHeight", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class GameDetailChartKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeltaAnimations$lambda$15(ChartState.DeltaAnimationData deltaAnimationData, ChartState.DeltaAnimationData deltaAnimationData2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DeltaAnimations(deltaAnimationData, deltaAnimationData2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeltaAnimations$lambda$17(ChartState.DeltaAnimationData deltaAnimationData, ChartState.DeltaAnimationData deltaAnimationData2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DeltaAnimations(deltaAnimationData, deltaAnimationData2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailChart$lambda$14(ChartState chartState, GameDetailViewState.VolumeState volumeState, ChartCallbacks chartCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GameDetailChart(chartState, volumeState, chartCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OpenInterestOrVolumeDisplay$lambda$22(GameDetailViewState.VolumeState volumeState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OpenInterestOrVolumeDisplay(volumeState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GameDetailChart(final ChartState state, final GameDetailViewState.VolumeState volumeState, final ChartCallbacks chartCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final GameDetailViewState.VolumeState volumeState2;
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final Measurer2 measurer2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnapshotState snapshotState;
        Object objRememberedValue4;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue5;
        SnapshotState snapshotState2;
        final int i5;
        boolean zChanged;
        Object objRememberedValue6;
        final SnapshotState snapshotState3;
        Object obj;
        Object objRememberedValue7;
        boolean zChangedInstance;
        Object objRememberedValue8;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-405304670);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                volumeState2 = volumeState;
                i3 |= composerStartRestartGroup.changed(volumeState2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(chartCallbacks) : composerStartRestartGroup.changedInstance(chartCallbacks) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-405304670, i3, -1, "com.robinhood.android.event.gamedetail.ui.chart.GameDetailChart (GameDetailChart.kt:78)");
                    }
                    composerStartRestartGroup.startReplaceGroup(-1003410150);
                    composerStartRestartGroup.startReplaceGroup(212064437);
                    composerStartRestartGroup.endReplaceGroup();
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Measurer2(density);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    measurer2 = (Measurer2) objRememberedValue;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ConstraintLayoutScope();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    snapshotState = (SnapshotState) objRememberedValue3;
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue5;
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                    i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                    zChanged = zChangedInstance2 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue6 == companion.getEmpty()) {
                        snapshotState3 = snapshotState2;
                        obj = null;
                        objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartKt$GameDetailChart$$inlined$ConstraintLayout$2
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
                                snapshotState3.getValue();
                                long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i5);
                                snapshotState.getValue();
                                int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                final Measurer2 measurer22 = measurer2;
                                return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartKt$GameDetailChart$$inlined$ConstraintLayout$2.1
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
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        snapshotState3 = snapshotState2;
                        obj = null;
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartKt$GameDetailChart$$inlined$ConstraintLayout$3
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
                                snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                constraintSetForInlineDsl.setKnownDirty(true);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    final Function0 function0 = (Function0) objRememberedValue7;
                    zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartKt$GameDetailChart$$inlined$ConstraintLayout$4
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
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier2, false, (Function1) objRememberedValue8, 1, obj);
                    final SnapshotState snapshotState4 = snapshotState3;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartKt$GameDetailChart$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            snapshotState4.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                            constraintLayoutScope.reset();
                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                            composer3.startReplaceGroup(940184599);
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue9 = composer3.rememberedValue();
                            Composer.Companion companion2 = Composer.INSTANCE;
                            if (objRememberedValue9 == companion2.getEmpty()) {
                                objRememberedValue9 = SnapshotIntState3.mutableIntStateOf(0);
                                composer3.updateRememberedValue(objRememberedValue9);
                            }
                            SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue9;
                            composer3.endReplaceGroup();
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            composer3.startReplaceGroup(5004770);
                            boolean zChanged2 = composer3.changed(constraintLayoutBaseScope4Component2);
                            Object objRememberedValue10 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue10 == companion2.getEmpty()) {
                                objRememberedValue10 = new GameDetailChartKt$GameDetailChart$1$1$1(constraintLayoutBaseScope4Component2);
                                composer3.updateRememberedValue(objRememberedValue10);
                            }
                            composer3.endReplaceGroup();
                            Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierConstrainAs);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Point scrubbedPoint = state.getScrubbedPoint();
                            composer3.startReplaceGroup(5004770);
                            Object objRememberedValue11 = composer3.rememberedValue();
                            if (objRememberedValue11 == companion2.getEmpty()) {
                                objRememberedValue11 = new GameDetailChartKt$GameDetailChart$1$2$1$1(snapshotIntState2);
                                composer3.updateRememberedValue(objRememberedValue11);
                            }
                            composer3.endReplaceGroup();
                            EventLabelTrack.EventLabelTrack(scrubbedPoint, OnGloballyPositionedModifier3.onGloballyPositioned(companion3, (Function1) objRememberedValue11), composer3, 48, 0);
                            Chart<Parcelable> chart = state.getChart();
                            EventChartColorOverlay colors = state.getColors();
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer3.changedInstance(chartCallbacks);
                            Object objRememberedValue12 = composer3.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue12 == companion2.getEmpty()) {
                                objRememberedValue12 = new GameDetailChartKt$GameDetailChart$1$2$2$1(chartCallbacks);
                                composer3.updateRememberedValue(objRememberedValue12);
                            }
                            composer3.endReplaceGroup();
                            EventChart.EventChart(chart, colors, (Function1) ((KFunction) objRememberedValue12), ModifiersKt.fullWidthChartSize(companion3), composer3, 0, 0);
                            composer3.endNode();
                            ChartSideLegendState chartSideLegendState = state.getChartSideLegendState();
                            int intValue = snapshotIntState2.getIntValue();
                            composer3.startReplaceGroup(5004770);
                            boolean zChanged3 = composer3.changed(constraintLayoutBaseScope4Component1);
                            Object objRememberedValue13 = composer3.rememberedValue();
                            if (zChanged3 || objRememberedValue13 == companion2.getEmpty()) {
                                objRememberedValue13 = new GameDetailChartKt$GameDetailChart$1$3$1(constraintLayoutBaseScope4Component1);
                                composer3.updateRememberedValue(objRememberedValue13);
                            }
                            composer3.endReplaceGroup();
                            GameDetailChartSideLegend2.GameDetailChartSideLegend(chartSideLegendState, intValue, constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue13), composer3, 0, 0);
                            ChartState.DeltaAnimationData leftDeltaAnimationData = state.getLeftDeltaAnimationData();
                            ChartState.DeltaAnimationData rightDeltaAnimationData = state.getRightDeltaAnimationData();
                            composer3.startReplaceGroup(5004770);
                            boolean zChanged4 = composer3.changed(constraintLayoutBaseScope4Component5);
                            Object objRememberedValue14 = composer3.rememberedValue();
                            if (zChanged4 || objRememberedValue14 == companion2.getEmpty()) {
                                objRememberedValue14 = new GameDetailChartKt$GameDetailChart$1$4$1(constraintLayoutBaseScope4Component5);
                                composer3.updateRememberedValue(objRememberedValue14);
                            }
                            composer3.endReplaceGroup();
                            GameDetailChartKt.DeltaAnimations(leftDeltaAnimationData, rightDeltaAnimationData, PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue14), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null), composer3, 0, 0);
                            GameDetailViewState.VolumeState volumeState3 = volumeState2;
                            composer3.startReplaceGroup(5004770);
                            boolean zChanged5 = composer3.changed(constraintLayoutBaseScope4Component3);
                            Object objRememberedValue15 = composer3.rememberedValue();
                            if (zChanged5 || objRememberedValue15 == companion2.getEmpty()) {
                                objRememberedValue15 = new GameDetailChartKt$GameDetailChart$1$5$1(constraintLayoutBaseScope4Component3);
                                composer3.updateRememberedValue(objRememberedValue15);
                            }
                            composer3.endReplaceGroup();
                            GameDetailChartKt.OpenInterestOrVolumeDisplay(volumeState3, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue15), 0.0f, composer3, 0, 1), composer3, 0, 0);
                            composer3.startReplaceGroup(723133616);
                            ImmutableList3<DisplaySpan> defaultSpans = GameDetailDataState.Companion.getDefaultSpans();
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(defaultSpans, 10));
                            Iterator<DisplaySpan> it = defaultSpans.iterator();
                            while (it.hasNext()) {
                                DisplaySpan next = it.next();
                                arrayList.add(new UnifiedSpan(next, StringResources_androidKt.stringResource(ChartDisplaySpanExtensions.getStringRes(next), composer3, 0), next == DisplaySpan.HOUR, false, ChartDisplaySpanExtensions.getEducationTourId(next), null, 40, null));
                            }
                            composer3.endReplaceGroup();
                            ImmutableList immutableList = extensions2.toImmutableList(arrayList);
                            DisplaySpan activeSpan = state.getActiveSpan();
                            if (activeSpan == null) {
                                activeSpan = (DisplaySpan) CollectionsKt.first((List) GameDetailDataState.Companion.getDefaultSpans());
                            }
                            DisplaySpan displaySpan = activeSpan;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance4 = composer3.changedInstance(chartCallbacks);
                            Object objRememberedValue16 = composer3.rememberedValue();
                            if (zChangedInstance4 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue16 = new GameDetailChartKt$GameDetailChart$1$7$1(chartCallbacks);
                                composer3.updateRememberedValue(objRememberedValue16);
                            }
                            composer3.endReplaceGroup();
                            UnifiedSpanSelectorState unifiedSpanSelectorState = new UnifiedSpanSelectorState(immutableList, displaySpan, (Function1) ((KFunction) objRememberedValue16), false, null, false, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 56, null);
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            composer3.startReplaceGroup(5004770);
                            boolean zChanged6 = composer3.changed(constraintLayoutBaseScope4Component1);
                            Object objRememberedValue17 = composer3.rememberedValue();
                            if (zChanged6 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue17 = new GameDetailChartKt$GameDetailChart$1$8$1(constraintLayoutBaseScope4Component1);
                                composer3.updateRememberedValue(objRememberedValue17);
                            }
                            composer3.endReplaceGroup();
                            UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(unifiedSpanSelectorState, SizeKt.m5174width3ABfNKs(constraintLayoutScope2.constrainAs(companion5, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue17), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE)), null, null, null, null, null, composer3, UnifiedSpanSelectorState.$stable, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                            composer3.endReplaceGroup();
                            if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                EffectsKt.SideEffect(function0, composer3, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    composer2 = composerStartRestartGroup;
                    LayoutKt.MultiMeasureLayout(modifierSemantics$default, composableLambdaRememberComposableLambda, measurePolicy, composer2, 48, 0);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return GameDetailChartKt.GameDetailChart$lambda$14(state, volumeState, chartCallbacks, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-1003410150);
                composerStartRestartGroup.startReplaceGroup(212064437);
                composerStartRestartGroup.endReplaceGroup();
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                measurer2 = (Measurer2) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue2;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue5;
                boolean zChangedInstance22 = composerStartRestartGroup.changedInstance(measurer2);
                i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                zChanged = zChangedInstance22 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    snapshotState3 = snapshotState2;
                    obj = null;
                    objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartKt$GameDetailChart$$inlined$ConstraintLayout$2
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
                            snapshotState3.getValue();
                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i5);
                            snapshotState.getValue();
                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartKt$GameDetailChart$$inlined$ConstraintLayout$2.1
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
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                    }
                    final Function0 function02 = (Function0) objRememberedValue7;
                    zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartKt$GameDetailChart$$inlined$ConstraintLayout$4
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
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifier2, false, (Function1) objRememberedValue8, 1, obj);
                        final SnapshotState snapshotState42 = snapshotState3;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartKt$GameDetailChart$$inlined$ConstraintLayout$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                snapshotState42.setValue(Unit.INSTANCE);
                                int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                constraintLayoutScope2.reset();
                                ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                                composer3.startReplaceGroup(940184599);
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                                composer3.startReplaceGroup(1849434622);
                                Object objRememberedValue9 = composer3.rememberedValue();
                                Composer.Companion companion2 = Composer.INSTANCE;
                                if (objRememberedValue9 == companion2.getEmpty()) {
                                    objRememberedValue9 = SnapshotIntState3.mutableIntStateOf(0);
                                    composer3.updateRememberedValue(objRememberedValue9);
                                }
                                SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue9;
                                composer3.endReplaceGroup();
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                composer3.startReplaceGroup(5004770);
                                boolean zChanged2 = composer3.changed(constraintLayoutBaseScope4Component2);
                                Object objRememberedValue10 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue10 == companion2.getEmpty()) {
                                    objRememberedValue10 = new GameDetailChartKt$GameDetailChart$1$1$1(constraintLayoutBaseScope4Component2);
                                    composer3.updateRememberedValue(objRememberedValue10);
                                }
                                composer3.endReplaceGroup();
                                Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(companion3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierConstrainAs);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Point scrubbedPoint = state.getScrubbedPoint();
                                composer3.startReplaceGroup(5004770);
                                Object objRememberedValue11 = composer3.rememberedValue();
                                if (objRememberedValue11 == companion2.getEmpty()) {
                                    objRememberedValue11 = new GameDetailChartKt$GameDetailChart$1$2$1$1(snapshotIntState2);
                                    composer3.updateRememberedValue(objRememberedValue11);
                                }
                                composer3.endReplaceGroup();
                                EventLabelTrack.EventLabelTrack(scrubbedPoint, OnGloballyPositionedModifier3.onGloballyPositioned(companion3, (Function1) objRememberedValue11), composer3, 48, 0);
                                Chart<Parcelable> chart = state.getChart();
                                EventChartColorOverlay colors = state.getColors();
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance3 = composer3.changedInstance(chartCallbacks);
                                Object objRememberedValue12 = composer3.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue12 == companion2.getEmpty()) {
                                    objRememberedValue12 = new GameDetailChartKt$GameDetailChart$1$2$2$1(chartCallbacks);
                                    composer3.updateRememberedValue(objRememberedValue12);
                                }
                                composer3.endReplaceGroup();
                                EventChart.EventChart(chart, colors, (Function1) ((KFunction) objRememberedValue12), ModifiersKt.fullWidthChartSize(companion3), composer3, 0, 0);
                                composer3.endNode();
                                ChartSideLegendState chartSideLegendState = state.getChartSideLegendState();
                                int intValue = snapshotIntState2.getIntValue();
                                composer3.startReplaceGroup(5004770);
                                boolean zChanged3 = composer3.changed(constraintLayoutBaseScope4Component1);
                                Object objRememberedValue13 = composer3.rememberedValue();
                                if (zChanged3 || objRememberedValue13 == companion2.getEmpty()) {
                                    objRememberedValue13 = new GameDetailChartKt$GameDetailChart$1$3$1(constraintLayoutBaseScope4Component1);
                                    composer3.updateRememberedValue(objRememberedValue13);
                                }
                                composer3.endReplaceGroup();
                                GameDetailChartSideLegend2.GameDetailChartSideLegend(chartSideLegendState, intValue, constraintLayoutScope22.constrainAs(companion3, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue13), composer3, 0, 0);
                                ChartState.DeltaAnimationData leftDeltaAnimationData = state.getLeftDeltaAnimationData();
                                ChartState.DeltaAnimationData rightDeltaAnimationData = state.getRightDeltaAnimationData();
                                composer3.startReplaceGroup(5004770);
                                boolean zChanged4 = composer3.changed(constraintLayoutBaseScope4Component5);
                                Object objRememberedValue14 = composer3.rememberedValue();
                                if (zChanged4 || objRememberedValue14 == companion2.getEmpty()) {
                                    objRememberedValue14 = new GameDetailChartKt$GameDetailChart$1$4$1(constraintLayoutBaseScope4Component5);
                                    composer3.updateRememberedValue(objRememberedValue14);
                                }
                                composer3.endReplaceGroup();
                                GameDetailChartKt.DeltaAnimations(leftDeltaAnimationData, rightDeltaAnimationData, PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope22.constrainAs(companion3, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue14), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null), composer3, 0, 0);
                                GameDetailViewState.VolumeState volumeState3 = volumeState2;
                                composer3.startReplaceGroup(5004770);
                                boolean zChanged5 = composer3.changed(constraintLayoutBaseScope4Component3);
                                Object objRememberedValue15 = composer3.rememberedValue();
                                if (zChanged5 || objRememberedValue15 == companion2.getEmpty()) {
                                    objRememberedValue15 = new GameDetailChartKt$GameDetailChart$1$5$1(constraintLayoutBaseScope4Component3);
                                    composer3.updateRememberedValue(objRememberedValue15);
                                }
                                composer3.endReplaceGroup();
                                GameDetailChartKt.OpenInterestOrVolumeDisplay(volumeState3, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope22.constrainAs(companion3, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue15), 0.0f, composer3, 0, 1), composer3, 0, 0);
                                composer3.startReplaceGroup(723133616);
                                ImmutableList3<DisplaySpan> defaultSpans = GameDetailDataState.Companion.getDefaultSpans();
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(defaultSpans, 10));
                                Iterator<DisplaySpan> it = defaultSpans.iterator();
                                while (it.hasNext()) {
                                    DisplaySpan next = it.next();
                                    arrayList.add(new UnifiedSpan(next, StringResources_androidKt.stringResource(ChartDisplaySpanExtensions.getStringRes(next), composer3, 0), next == DisplaySpan.HOUR, false, ChartDisplaySpanExtensions.getEducationTourId(next), null, 40, null));
                                }
                                composer3.endReplaceGroup();
                                ImmutableList immutableList = extensions2.toImmutableList(arrayList);
                                DisplaySpan activeSpan = state.getActiveSpan();
                                if (activeSpan == null) {
                                    activeSpan = (DisplaySpan) CollectionsKt.first((List) GameDetailDataState.Companion.getDefaultSpans());
                                }
                                DisplaySpan displaySpan = activeSpan;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance4 = composer3.changedInstance(chartCallbacks);
                                Object objRememberedValue16 = composer3.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue16 = new GameDetailChartKt$GameDetailChart$1$7$1(chartCallbacks);
                                    composer3.updateRememberedValue(objRememberedValue16);
                                }
                                composer3.endReplaceGroup();
                                UnifiedSpanSelectorState unifiedSpanSelectorState = new UnifiedSpanSelectorState(immutableList, displaySpan, (Function1) ((KFunction) objRememberedValue16), false, null, false, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 56, null);
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                composer3.startReplaceGroup(5004770);
                                boolean zChanged6 = composer3.changed(constraintLayoutBaseScope4Component1);
                                Object objRememberedValue17 = composer3.rememberedValue();
                                if (zChanged6 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue17 = new GameDetailChartKt$GameDetailChart$1$8$1(constraintLayoutBaseScope4Component1);
                                    composer3.updateRememberedValue(objRememberedValue17);
                                }
                                composer3.endReplaceGroup();
                                UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(unifiedSpanSelectorState, SizeKt.m5174width3ABfNKs(constraintLayoutScope22.constrainAs(companion5, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue17), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE)), null, null, null, null, null, composer3, UnifiedSpanSelectorState.$stable, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                                composer3.endReplaceGroup();
                                if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                    EffectsKt.SideEffect(function02, composer3, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        composer2 = composerStartRestartGroup;
                        LayoutKt.MultiMeasureLayout(modifierSemantics$default2, composableLambdaRememberComposableLambda2, measurePolicy2, composer2, 48, 0);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        volumeState2 = volumeState;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DeltaAnimations(final ChartState.DeltaAnimationData deltaAnimationData, final ChartState.DeltaAnimationData deltaAnimationData2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1095490116);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(deltaAnimationData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(deltaAnimationData2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1095490116, i3, -1, "com.robinhood.android.event.gamedetail.ui.chart.DeltaAnimations (GameDetailChart.kt:170)");
                }
                if (deltaAnimationData != null || deltaAnimationData2 == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier5 = modifier4;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return GameDetailChartKt.DeltaAnimations$lambda$15(deltaAnimationData, deltaAnimationData2, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(modifier4, C2002Dp.m7995constructorimpl(150), C2002Dp.m7995constructorimpl(70));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5171sizeVpY3zN4);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ImmutableList<Delta> deltas = deltaAnimationData.getDeltas();
                long color = deltaAnimationData.getContractColor().getColor(composerStartRestartGroup, 0);
                MovingDeltasAnimation8 movingDeltasAnimation8 = MovingDeltasAnimation8.LEFT;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                float f = 100;
                MovingDeltasAnimation2.m14389MovingDeltasAnimationsW7UJKQ(deltas, color, movingDeltasAnimation8, SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), composerStartRestartGroup, 3456, 0);
                MovingDeltasAnimation2.m14389MovingDeltasAnimationsW7UJKQ(deltaAnimationData2.getDeltas(), deltaAnimationData2.getContractColor().getColor(composerStartRestartGroup, 0), MovingDeltasAnimation8.RIGHT, OffsetKt.m5125offsetVpY3zN4$default(SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(50), 0.0f, 2, null), composerStartRestartGroup, 3456, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailChartKt.DeltaAnimations$lambda$17(deltaAnimationData, deltaAnimationData2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (deltaAnimationData != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OpenInterestOrVolumeDisplay(final GameDetailViewState.VolumeState volumeState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        String totalVolume;
        AnnotatedString annotatedString;
        Composer composer2;
        final Modifier modifier3;
        String totalOpenInterest;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(405869681);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(volumeState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(405869681, i3, -1, "com.robinhood.android.event.gamedetail.ui.chart.OpenInterestOrVolumeDisplay (GameDetailChart.kt:197)");
                }
                totalVolume = volumeState == null ? volumeState.getTotalVolume() : null;
                composerStartRestartGroup.startReplaceGroup(-801253850);
                if (totalVolume != null) {
                    annotatedString = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-801253112);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                    try {
                        builder.append(totalVolume);
                        builder.append(PlaceholderUtils.XXShortPlaceholderText);
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        composerStartRestartGroup.startReplaceGroup(-801243822);
                        iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                        try {
                            builder.append(StringResources_androidKt.stringResource(C16283R.string.volume_label, composerStartRestartGroup, 0));
                            builder.pop(iPushStyle);
                            composerStartRestartGroup.endReplaceGroup();
                            annotatedString = builder.toAnnotatedString();
                            composerStartRestartGroup.endReplaceGroup();
                        } finally {
                        }
                    } finally {
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                if (annotatedString != null) {
                    composerStartRestartGroup.startReplaceGroup(931427080);
                    if (volumeState == null || (totalOpenInterest = volumeState.getTotalOpenInterest()) == null) {
                        totalOpenInterest = "     ";
                    }
                    WrappedTickerKt.m19244TickerTextFNF3uiM(com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(modifier4, (volumeState != null ? volumeState.getTotalOpenInterest() : null) == null, null, 2, null), totalOpenInterest, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), TickerTextState.Style.REGULAR_MEDIUM, composerStartRestartGroup, 3072);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.startReplaceGroup(931760330);
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                    BentoText2.m20748BentoTextQnj7Zds(annotatedString, PaddingKt.m5143paddingVpY3zN4(BorderKt.m4878borderziNgDLE(modifier4, C2002Dp.m7995constructorimpl(1), new SolidColor(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU(), null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8))), C2002Dp.m7995constructorimpl(12), C2002Dp.m7995constructorimpl(3)), null, null, null, null, null, 0, false, 0, 0, null, null, null, composer2, 0, 0, 16380);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailChartKt.OpenInterestOrVolumeDisplay$lambda$22(volumeState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (volumeState == null) {
            }
            composerStartRestartGroup.startReplaceGroup(-801253850);
            if (totalVolume != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (annotatedString != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
