package com.robinhood.android.options.lib.simulatedreturn.chart;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.charts.ChartWithOverlays;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.charts.overlay.Overlays2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnBaseChart$lambda$46$$inlined$ConstraintLayout$1 */
/* loaded from: classes11.dex */
public final class C23273x5f2819b4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ OptionsSimulatedChartViewState $chart$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ Function1 $onScrubPointUpdated$inlined;
    final /* synthetic */ Function0 $onScrubStopped$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ boolean $usePreTradeStyle$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23273x5f2819b4(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, OptionsSimulatedChartViewState optionsSimulatedChartViewState, boolean z, Function1 function1, Function0 function0) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$chart$inlined = optionsSimulatedChartViewState;
        this.$usePreTradeStyle$inlined = z;
        this.$onScrubPointUpdated$inlined = function1;
        this.$onScrubStopped$inlined = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        boolean z;
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
        composer.startReplaceGroup(-714496529);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(0.0f);
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
            composer.updateRememberedValue(objRememberedValue2);
        }
        SnapshotFloatState2 snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue2;
        composer.endReplaceGroup();
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        float fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(constraintLayoutBaseScope4Component2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new C23284xd491f825(constraintLayoutBaseScope4Component2);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue3), fM21592getMediumD9Ej5fM, 0.0f, fM21592getMediumD9Ej5fM, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 2, null);
        composer.startReplaceGroup(5004770);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new C23286xd491fbe6(snapshotFloatState2);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        Overlays2.Overlays(OnRemeasuredModifier2.onSizeChanged(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue4), CollectionsKt.listOfNotNull(this.$chart$inlined.getDateLabel(snapshotFloatState22.getFloatValue(), snapshotFloatState2.getFloatValue(), composer, 0)), composer, Overlays.$stable << 3, 0);
        composer.startReplaceGroup(-1746271574);
        boolean zChanged2 = composer.changed(constraintLayoutBaseScope4Component1) | composer.changed(constraintLayoutBaseScope4Component3) | composer.changed(this.$usePreTradeStyle$inlined);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new C23287xd491ffa7(constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component3, this.$usePreTradeStyle$inlined);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue5);
        if (this.$usePreTradeStyle$inlined) {
            z = false;
            modifierConstrainAs = Alpha.alpha(modifierConstrainAs, 0.0f);
        } else {
            z = false;
        }
        OptionsSimulatedReturnChartKt.OptionsSimulatedReturnChartDivider(modifierConstrainAs, composer, 0, 0);
        composer.startReplaceGroup(-1746271574);
        boolean zChanged3 = composer.changed(constraintLayoutBaseScope4Component2) | composer.changed(constraintLayoutBaseScope4Component6) | composer.changed(constraintLayoutBaseScope4Component5);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new C23288xd4920729(constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component6, constraintLayoutBaseScope4Component5);
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue6), fM21592getMediumD9Ej5fM, 0.0f, 0.0f, 0.0f, 14, null);
        composer.startReplaceGroup(5004770);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new C23289xd4920aea(snapshotFloatState22);
            composer.updateRememberedValue(objRememberedValue7);
        }
        composer.endReplaceGroup();
        ChartWithOverlays.ChartWithOverlays(OnRemeasuredModifier2.onSizeChanged(modifierM5146paddingqDBjuR0$default2, (Function1) objRememberedValue7), this.$chart$inlined.getAnnotations(this.$usePreTradeStyle$inlined, composer, 0), this.$chart$inlined.getOverlays(composer, 0), 0L, this.$onScrubPointUpdated$inlined, this.$onScrubStopped$inlined, false, composer, 0, 72);
        composer.startReplaceGroup(-1746271574);
        boolean zChanged4 = composer.changed(constraintLayoutBaseScope4Component3) | composer.changed(constraintLayoutBaseScope4Component4) | composer.changed(this.$usePreTradeStyle$inlined);
        Object objRememberedValue8 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new C23290xd4920eab(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4, this.$usePreTradeStyle$inlined);
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs2 = constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue8);
        if (this.$usePreTradeStyle$inlined) {
            modifierConstrainAs2 = Alpha.alpha(modifierConstrainAs2, 0.0f);
        }
        OptionsSimulatedReturnChartKt.OptionsSimulatedReturnChartDivider(modifierConstrainAs2, composer, 0, 0);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged5 = composer.changed(constraintLayoutBaseScope4Component6) | composer.changed(constraintLayoutBaseScope4Component3);
        Object objRememberedValue9 = composer.rememberedValue();
        if (zChanged5 || objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new C23291xd492162d(constraintLayoutBaseScope4Component6, constraintLayoutBaseScope4Component3);
            composer.updateRememberedValue(objRememberedValue9);
        }
        composer.endReplaceGroup();
        float f = 12;
        OptionsSimulatedReturnChartAxis2.OptionsSimulatedReturnChartAxis(this.$chart$inlined.getXAxis(this.$usePreTradeStyle$inlined, composer, 0), this.$usePreTradeStyle$inlined, PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue9), fM21592getMediumD9Ej5fM, C2002Dp.m7995constructorimpl(f), 0.0f, C2002Dp.m7995constructorimpl(f), 4, null), composer, 0, 0);
        composer.startReplaceGroup(5004770);
        boolean zChanged6 = composer.changed(constraintLayoutBaseScope4Component3);
        Object objRememberedValue10 = composer.rememberedValue();
        if (zChanged6 || objRememberedValue10 == companion.getEmpty()) {
            objRememberedValue10 = new C23285xbdad3825(constraintLayoutBaseScope4Component3);
            composer.updateRememberedValue(objRememberedValue10);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs3 = constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue10);
        if (!this.$usePreTradeStyle$inlined) {
            modifierConstrainAs3 = Clip.clipToBounds(modifierConstrainAs3);
        }
        OptionsSimulatedReturnChartAxis2.OptionsSimulatedReturnChartAxis(this.$chart$inlined.getYAxis(this.$usePreTradeStyle$inlined, composer, 0), this.$usePreTradeStyle$inlined, PaddingKt.m5146paddingqDBjuR0$default(modifierConstrainAs3, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, C2002Dp.m7995constructorimpl(20), 0.0f, 10, null), composer, 0, 0);
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue11 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue11 == companion.getEmpty()) {
            objRememberedValue11 = new Function0<Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnBaseChart$lambda$46$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(objRememberedValue11);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue11, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
