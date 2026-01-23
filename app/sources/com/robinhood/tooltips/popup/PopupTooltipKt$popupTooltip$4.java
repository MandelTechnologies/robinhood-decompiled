package com.robinhood.tooltips.popup;

import android.view.View;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.compose.bento.theme.Spacing2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;

/* compiled from: PopupTooltip.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class PopupTooltipKt$popupTooltip$4 implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ float $bottomPadding;
    final /* synthetic */ Duration $closeAfter;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ Boolean $displayPopup;
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;
    final /* synthetic */ C2002Dp $horizontalPadding;
    final /* synthetic */ Duration $initialDisplayDelay;
    final /* synthetic */ Function0<Unit> $onAppear;
    final /* synthetic */ Function0<Unit> $onAutoClose;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ PopupPositioning $popupPositioning;
    final /* synthetic */ boolean $showArrow;
    final /* synthetic */ float $topPadding;
    final /* synthetic */ float $verticalOffset;

    /* JADX WARN: Multi-variable type inference failed */
    PopupTooltipKt$popupTooltip$4(Boolean bool, Duration duration, C2002Dp c2002Dp, Function2<? super Composer, ? super Integer, Unit> function2, float f, boolean z, EnterTransition enterTransition, ExitTransition exitTransition, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Duration duration2, PopupPositioning popupPositioning, float f2, float f3) {
        this.$displayPopup = bool;
        this.$initialDisplayDelay = duration;
        this.$horizontalPadding = c2002Dp;
        this.$content = function2;
        this.$verticalOffset = f;
        this.$showArrow = z;
        this.$enter = enterTransition;
        this.$exit = exitTransition;
        this.$onClick = function0;
        this.$onAppear = function02;
        this.$onAutoClose = function03;
        this.$closeAfter = duration2;
        this.$popupPositioning = popupPositioning;
        this.$topPadding = f2;
        this.$bottomPadding = f3;
    }

    private static final float invoke$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float invoke$lambda$1(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final boolean invoke$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$13(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> invoke$lambda$17(SnapshotState4<? extends Function0<Unit>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final TooltipPopupPosition invoke$lambda$3(SnapshotState<TooltipPopupPosition> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean invoke$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(-2024099633);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2024099633, i, -1, "com.robinhood.tooltips.popup.popupTooltip.<anonymous> (PopupTooltip.kt:119)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        long jMo7449getContainerSizeYbymL2g = ((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g();
        final SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Float.valueOf((int) (4294967295L & jMo7449getContainerSizeYbymL2g)), composer, 0);
        final SnapshotState4 snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Float.valueOf((int) (jMo7449getContainerSizeYbymL2g >> 32)), composer, 0);
        final View rootView = ((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView())).getRootView();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(new TooltipPopupPosition(0L, null, 0.0f, 7, null), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        Object[] objArr = new Object[0];
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$popupTooltip$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PopupTooltipKt$popupTooltip$4.invoke$lambda$6$lambda$5();
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composer, 3072, 6);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$displayPopup) | composer.changed(this.$initialDisplayDelay);
        Boolean bool = this.$displayPopup;
        Duration duration = this.$initialDisplayDelay;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(Intrinsics.areEqual(bool, Boolean.TRUE) && duration == null), null, 2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue4);
        }
        final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue4;
        composer.endReplaceGroup();
        TooltipPopupPosition tooltipPopupPositionInvoke$lambda$3 = invoke$lambda$3(snapshotState);
        boolean z = invoke$lambda$10(snapshotState3) && invoke$lambda$13(snapshotState4);
        C2002Dp c2002Dp = this.$horizontalPadding;
        composer.startReplaceGroup(460476898);
        float value = c2002Dp == null ? ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue() : c2002Dp.getValue();
        composer.endReplaceGroup();
        float f = value;
        Function2<Composer, Integer, Unit> function2 = this.$content;
        float f2 = this.$verticalOffset;
        boolean z2 = this.$showArrow;
        EnterTransition enterTransition = this.$enter;
        ExitTransition exitTransition = this.$exit;
        Function0<Unit> function0 = this.$onClick;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$popupTooltip$4$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        PopupTooltipKt.m26517PopupTooltipsX5mSQc(tooltipPopupPositionInvoke$lambda$3, function2, z, 0.0f, 0.0f, f2, z2, 0.0f, 0.0f, f, null, enterTransition, exitTransition, function0, (Function0) objRememberedValue5, this.$onAppear, composer, 0, 24576, 1432);
        SnapshotState4 snapshotState4RememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(this.$onAutoClose, composer, 0);
        composer.startReplaceGroup(460481572);
        if (Intrinsics.areEqual(this.$displayPopup, Boolean.TRUE) && !invoke$lambda$7(snapshotState2) && invoke$lambda$13(snapshotState4)) {
            Boolean bool2 = this.$displayPopup;
            Duration duration2 = this.$initialDisplayDelay;
            composer.startReplaceGroup(-1224400529);
            boolean zChanged2 = composer.changed(this.$initialDisplayDelay) | composer.changed(snapshotState3) | composer.changed(this.$closeAfter) | composer.changed(snapshotState4RememberUpdatedState3) | composer.changed(snapshotState2);
            Duration duration3 = this.$initialDisplayDelay;
            Duration duration4 = this.$closeAfter;
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new PopupTooltipKt$popupTooltip$4$2$1(duration3, duration4, snapshotState3, snapshotState4RememberUpdatedState3, snapshotState2, null);
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(bool2, duration2, (Function2) objRememberedValue6, composer, 0);
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1224400529);
        boolean zChanged3 = composer.changed(density) | composer.changedInstance(rootView) | composer.changed(this.$popupPositioning.ordinal()) | composer.changed(this.$topPadding) | composer.changed(snapshotState4RememberUpdatedState2) | composer.changed(this.$bottomPadding) | composer.changed(snapshotState4RememberUpdatedState);
        final PopupPositioning popupPositioning = this.$popupPositioning;
        final float f3 = this.$topPadding;
        final float f4 = this.$bottomPadding;
        Object objRememberedValue7 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new Function1() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$popupTooltip$4$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PopupTooltipKt$popupTooltip$4.invoke$lambda$21$lambda$20(density, rootView, popupPositioning, f3, f4, snapshotState, snapshotState4RememberUpdatedState2, snapshotState4RememberUpdatedState, snapshotState4, (LayoutCoordinates) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue7);
        }
        composer.endReplaceGroup();
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(composed, (Function1) objRememberedValue7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierOnGloballyPositioned;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState invoke$lambda$6$lambda$5() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void invoke$lambda$14(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit invoke$lambda$21$lambda$20(Density density, View view, PopupPositioning popupPositioning, float f, float f2, SnapshotState snapshotState, SnapshotState4 snapshotState4, SnapshotState4 snapshotState42, SnapshotState snapshotState2, LayoutCoordinates layoutCoordinates) {
        boolean z;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        Intrinsics.checkNotNull(view);
        snapshotState.setValue(PopupTooltipKt.calculateTooltipPopupPosition(view, layoutCoordinates, popupPositioning));
        long jPositionInWindow = LayoutCoordinates2.positionInWindow(layoutCoordinates);
        int i = (int) (jPositionInWindow >> 32);
        if (Float.intBitsToFloat(i) >= 0.0f) {
            int i2 = (int) (jPositionInWindow & 4294967295L);
            z = Float.intBitsToFloat(i2) >= density.mo5016toPx0680j_4(f) && Float.intBitsToFloat(i) <= invoke$lambda$1(snapshotState4) && Float.intBitsToFloat(i2) + density.mo5016toPx0680j_4(f2) <= invoke$lambda$0(snapshotState42);
        }
        invoke$lambda$14(snapshotState2, z);
        return Unit.INSTANCE;
    }
}
