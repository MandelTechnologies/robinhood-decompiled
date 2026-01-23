package com.robinhood.tooltips.popup;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PopupTooltip.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class PopupTooltipKt$PopupTooltip$6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ float $arrowHeight;
    final /* synthetic */ SnapshotFloatState2 $arrowPositionX$delegate;
    final /* synthetic */ float $arrowWidth;
    final /* synthetic */ float $backgroundCornerSize;
    final /* synthetic */ float $backgroundMinHeight;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ Function0<Unit> $onAppear;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ TooltipPopupPosition $position;
    final /* synthetic */ boolean $showArrow;
    final /* synthetic */ float $verticalOffset;
    final /* synthetic */ Transition<Boolean> $visibilityTransition;

    /* JADX WARN: Multi-variable type inference failed */
    PopupTooltipKt$PopupTooltip$6(Transition<Boolean> transition, EnterTransition enterTransition, ExitTransition exitTransition, Function0<Unit> function0, float f, TooltipPopupPosition tooltipPopupPosition, Function0<Unit> function02, float f2, float f3, float f4, boolean z, float f5, float f6, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function2, SnapshotFloatState2 snapshotFloatState2) {
        this.$visibilityTransition = transition;
        this.$enter = enterTransition;
        this.$exit = exitTransition;
        this.$onAppear = function0;
        this.$horizontalPadding = f;
        this.$position = tooltipPopupPosition;
        this.$onClick = function02;
        this.$backgroundMinHeight = f2;
        this.$backgroundCornerSize = f3;
        this.$verticalOffset = f4;
        this.$showArrow = z;
        this.$arrowWidth = f5;
        this.$arrowHeight = f6;
        this.$contentPadding = paddingValues;
        this.$content = function2;
        this.$arrowPositionX$delegate = snapshotFloatState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$1$lambda$0(boolean z) {
        return z;
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
            ComposerKt.traceEventStart(-1876225905, i, -1, "com.robinhood.tooltips.popup.PopupTooltip.<anonymous> (PopupTooltip.kt:264)");
        }
        Transition<Boolean> transition = this.$visibilityTransition;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$PopupTooltip$6$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(PopupTooltipKt$PopupTooltip$6.invoke$lambda$1$lambda$0(((Boolean) obj).booleanValue()));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EnterTransition enterTransition = this.$enter;
        ExitTransition exitTransition = this.$exit;
        final Function0<Unit> function0 = this.$onAppear;
        final float f = this.$horizontalPadding;
        final TooltipPopupPosition tooltipPopupPosition = this.$position;
        final Function0<Unit> function02 = this.$onClick;
        final float f2 = this.$backgroundMinHeight;
        final float f3 = this.$backgroundCornerSize;
        final float f4 = this.$verticalOffset;
        final boolean z = this.$showArrow;
        final float f5 = this.$arrowWidth;
        final float f6 = this.$arrowHeight;
        final PaddingValues paddingValues = this.$contentPadding;
        final Function2<Composer, Integer, Unit> function2 = this.$content;
        final SnapshotFloatState2 snapshotFloatState2 = this.$arrowPositionX$delegate;
        AnimatedVisibilityKt.AnimatedVisibility(transition, (Function1) objRememberedValue, (Modifier) null, enterTransition, exitTransition, ComposableLambda3.rememberComposableLambda(-204282728, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$PopupTooltip$6.2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-204282728, i2, -1, "com.robinhood.tooltips.popup.PopupTooltip.<anonymous>.<anonymous> (PopupTooltip.kt:269)");
                }
                Unit unit = Unit.INSTANCE;
                composer2.startReplaceGroup(5004770);
                boolean zChanged = composer2.changed(function0);
                Function0<Unit> function03 = function0;
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new PopupTooltipKt$PopupTooltip$6$2$1$1(function03, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 6);
                PopupTooltipKt.m26518TooltipBubbleWOs8eLw(tooltipPopupPosition.getAlignment(), snapshotFloatState2.getFloatValue(), PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, f, 0.0f, 2, null), function02, 0L, f2, f3, f4, z, f5, f6, paddingValues, function2, composer2, 0, 0, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 196656, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
