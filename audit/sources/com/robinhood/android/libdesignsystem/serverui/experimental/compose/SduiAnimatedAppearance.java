package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.Easing3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearance;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.AnimatedAppearanceDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: SduiAnimatedAppearance.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u001a=\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a$\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a$\u0010\u0013\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u000e\u0010\u0016\u001a\u00020\u0017*\u0004\u0018\u00010\u000eH\u0002\"\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u008e\u0002"}, m3636d2 = {"SduiAnimatedAppearance", "", "ActionT", "component", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lrh_server_driven_ui/v1/AnimatedAppearanceDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "enterTransition", "Landroidx/compose/animation/EnterTransition;", "animationData", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$AnimationDataDto;", "initialState", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto$InitialStateDto;", "density", "Landroidx/compose/ui/unit/Density;", "exitTransition", "Landroidx/compose/animation/ExitTransition;", "disappearedState", "toComposeCurve", "Landroidx/compose/animation/core/Easing;", "ExpandCurve", "Landroidx/compose/animation/core/CubicBezierEasing;", "lib-sdui_externalRelease", "showAnimatedVisibility", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiAnimatedAppearance {
    private static final CubicBezierEasing ExpandCurve = new CubicBezierEasing(0.33f, 0.0f, 0.0f, 1.0f);

    /* compiled from: SduiAnimatedAppearance.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimatedAppearanceDto.CurveDto.values().length];
            try {
                iArr[AnimatedAppearanceDto.CurveDto.CURVE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimatedAppearanceDto.CurveDto.CURVE_DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnimatedAppearanceDto.CurveDto.CURVE_DECELERATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnimatedAppearanceDto.CurveDto.CURVE_ACCELERATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnimatedAppearanceDto.CurveDto.CURVE_EXPANSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAnimatedAppearance$lambda$0(AnimatedAppearanceDto animatedAppearanceDto, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiAnimatedAppearance(animatedAppearanceDto, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAnimatedAppearance$lambda$5(AnimatedAppearanceDto animatedAppearanceDto, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiAnimatedAppearance(animatedAppearanceDto, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT> void SduiAnimatedAppearance(final AnimatedAppearanceDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1790209701);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            final Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1790209701, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearance (SduiAnimatedAppearance.kt:44)");
            }
            UIComponentDto content = component.getContent();
            if (content == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiAnimatedAppearance.SduiAnimatedAppearance$lambda$0(component, parseAction, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            String identifier = component.getIdentifier();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(identifier);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            String identifier2 = component.getIdentifier();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged2 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(component);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new SduiAnimatedAppearance2(component, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(identifier2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            composerStartRestartGroup.startMovableGroup(-1890308578, component.getIdentifier());
            AnimatedVisibilityKt.AnimatedVisibility(SduiAnimatedAppearance$lambda$2(snapshotState), modifier3, enterTransition(component.getAnimation_data(), component.getInitial_state(), density), exitTransition(component.getDisappearing_animation_data(), component.getDisappeared_state(), density), component.getIdentifier(), ComposableLambda3.rememberComposableLambda(-308388032, true, new C207182(content, parseAction, component), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 112) | 196608, 0);
            composerStartRestartGroup.endMovableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAnimatedAppearance.SduiAnimatedAppearance$lambda$5(component, parseAction, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SduiAnimatedAppearance$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SduiAnimatedAppearance$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: SduiAnimatedAppearance.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt$SduiAnimatedAppearance$2 */
    static final class C207182 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ AnimatedAppearanceDto $component;
        final /* synthetic */ UIComponentDto $content;
        final /* synthetic */ Function1<ActionDto, ActionT> $parseAction;

        /* JADX WARN: Multi-variable type inference failed */
        C207182(UIComponentDto uIComponentDto, Function1<? super ActionDto, ? extends ActionT> function1, AnimatedAppearanceDto animatedAppearanceDto) {
            this.$content = uIComponentDto;
            this.$parseAction = function1;
            this.$component = animatedAppearanceDto;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-308388032, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearance.<anonymous>.<anonymous> (SduiAnimatedAppearance.kt:92)");
            }
            UIComponentDto uIComponentDto = this.$content;
            Function1<ActionDto, ActionT> function1 = this.$parseAction;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$component);
            final AnimatedAppearanceDto animatedAppearanceDto = this.$component;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt$SduiAnimatedAppearance$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiAnimatedAppearance.C207182.invoke$lambda$1$lambda$0(animatedAppearanceDto, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SduiComponentIdl.SduiComponent(uIComponentDto, function1, GraphicsLayerModifier6.graphicsLayer(companion, (Function1) objRememberedValue), (HorizontalPadding) null, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(AnimatedAppearanceDto animatedAppearanceDto, GraphicsLayerScope graphicsLayer) {
            Double opacity;
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            AnimatedAppearanceDto.FinalStateDto final_state = animatedAppearanceDto.getFinal_state();
            graphicsLayer.setAlpha((final_state == null || (opacity = final_state.getOpacity()) == null) ? 1.0f : (float) opacity.doubleValue());
            return Unit.INSTANCE;
        }
    }

    private static final EnterTransition enterTransition(AnimatedAppearanceDto.AnimationDataDto animationDataDto, AnimatedAppearanceDto.InitialStateDto initialStateDto, final Density density) {
        EnterTransition enterTransitionSlideInHorizontally;
        Double duration;
        if (initialStateDto == null) {
            return EnterTransition.INSTANCE.getNone();
        }
        int iConvert = (animationDataDto == null || (duration = animationDataDto.getDuration()) == null) ? 300 : (int) Duration.INSTANCE.convert(duration.doubleValue(), DurationUnitJvm.SECONDS, DurationUnitJvm.MILLISECONDS);
        int iConvert2 = animationDataDto != null ? (int) Duration.INSTANCE.convert(animationDataDto.getDelay(), DurationUnitJvm.SECONDS, DurationUnitJvm.MILLISECONDS) : 0;
        Double scale = initialStateDto.getScale();
        EnterTransition enterTransitionSlideInVertically = null;
        EnterTransition enterTransitionM4780scaleInL8ZKhE$default = scale != null ? EnterExitTransitionKt.m4780scaleInL8ZKhE$default(AnimationSpecKt.tween(iConvert, iConvert2, toComposeCurve(animationDataDto)), (float) scale.doubleValue(), 0L, 4, null) : null;
        Double opacity = initialStateDto.getOpacity();
        EnterTransition enterTransitionFadeIn = opacity != null ? EnterExitTransitionKt.fadeIn(AnimationSpecKt.tween(iConvert, iConvert2, toComposeCurve(animationDataDto)), (float) opacity.doubleValue()) : null;
        AnimatedAppearanceDto.TranslationDto translation_x = initialStateDto.getTranslation_x();
        final AnimatedAppearanceDto.TranslationDto.ValueDto value = translation_x != null ? translation_x.getValue() : null;
        if (value instanceof AnimatedAppearanceDto.TranslationDto.ValueDto.Absolute) {
            enterTransitionSlideInHorizontally = EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween(iConvert, iConvert2, toComposeCurve(animationDataDto)), new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(SduiAnimatedAppearance.enterTransition$lambda$11(density, value, ((Integer) obj).intValue()));
                }
            });
        } else if (value instanceof AnimatedAppearanceDto.TranslationDto.ValueDto.Percentage) {
            enterTransitionSlideInHorizontally = EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween(iConvert, iConvert2, toComposeCurve(animationDataDto)), new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(SduiAnimatedAppearance.enterTransition$lambda$12(value, ((Integer) obj).intValue()));
                }
            });
        } else {
            if (value != null) {
                throw new NoWhenBranchMatchedException();
            }
            enterTransitionSlideInHorizontally = null;
        }
        AnimatedAppearanceDto.TranslationDto translation_y = initialStateDto.getTranslation_y();
        final AnimatedAppearanceDto.TranslationDto.ValueDto value2 = translation_y != null ? translation_y.getValue() : null;
        if (value2 instanceof AnimatedAppearanceDto.TranslationDto.ValueDto.Absolute) {
            enterTransitionSlideInVertically = EnterExitTransitionKt.slideInVertically(AnimationSpecKt.tween(iConvert, iConvert2, toComposeCurve(animationDataDto)), new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(SduiAnimatedAppearance.enterTransition$lambda$14(density, value2, ((Integer) obj).intValue()));
                }
            });
        } else if (value2 instanceof AnimatedAppearanceDto.TranslationDto.ValueDto.Percentage) {
            enterTransitionSlideInVertically = EnterExitTransitionKt.slideInVertically(AnimationSpecKt.tween(iConvert, iConvert2, toComposeCurve(animationDataDto)), new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(SduiAnimatedAppearance.enterTransition$lambda$15(value2, ((Integer) obj).intValue()));
                }
            });
        } else if (value2 != null) {
            throw new NoWhenBranchMatchedException();
        }
        EnterTransition none = EnterTransition.INSTANCE.getNone();
        if (enterTransitionM4780scaleInL8ZKhE$default != null) {
            none = none.plus(enterTransitionM4780scaleInL8ZKhE$default);
        }
        if (enterTransitionFadeIn != null) {
            none = none.plus(enterTransitionFadeIn);
        }
        if (enterTransitionSlideInHorizontally != null) {
            none = none.plus(enterTransitionSlideInHorizontally);
        }
        return enterTransitionSlideInVertically != null ? none.plus(enterTransitionSlideInVertically) : none;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int enterTransition$lambda$11(Density density, AnimatedAppearanceDto.TranslationDto.ValueDto valueDto, int i) {
        return (int) density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl((float) ((AnimatedAppearanceDto.TranslationDto.ValueDto.Absolute) valueDto).getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int enterTransition$lambda$12(AnimatedAppearanceDto.TranslationDto.ValueDto valueDto, int i) {
        return i * (-((int) ((AnimatedAppearanceDto.TranslationDto.ValueDto.Percentage) valueDto).getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int enterTransition$lambda$14(Density density, AnimatedAppearanceDto.TranslationDto.ValueDto valueDto, int i) {
        return (int) density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl((float) ((AnimatedAppearanceDto.TranslationDto.ValueDto.Absolute) valueDto).getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int enterTransition$lambda$15(AnimatedAppearanceDto.TranslationDto.ValueDto valueDto, int i) {
        return i * ((int) ((AnimatedAppearanceDto.TranslationDto.ValueDto.Percentage) valueDto).getValue());
    }

    private static final ExitTransition exitTransition(AnimatedAppearanceDto.AnimationDataDto animationDataDto, AnimatedAppearanceDto.InitialStateDto initialStateDto, final Density density) {
        ExitTransition exitTransitionSlideOutHorizontally;
        Double duration;
        if (initialStateDto == null) {
            return ExitTransition.INSTANCE.getNone();
        }
        int iConvert = (animationDataDto == null || (duration = animationDataDto.getDuration()) == null) ? 300 : (int) Duration.INSTANCE.convert(duration.doubleValue(), DurationUnitJvm.SECONDS, DurationUnitJvm.MILLISECONDS);
        Double scale = initialStateDto.getScale();
        ExitTransition exitTransitionSlideOutVertically = null;
        ExitTransition exitTransitionM4782scaleOutL8ZKhE$default = scale != null ? EnterExitTransitionKt.m4782scaleOutL8ZKhE$default(AnimationSpecKt.tween(iConvert, 0, toComposeCurve(animationDataDto)), (float) scale.doubleValue(), 0L, 4, null) : null;
        Double opacity = initialStateDto.getOpacity();
        ExitTransition exitTransitionFadeOut = opacity != null ? EnterExitTransitionKt.fadeOut(AnimationSpecKt.tween(iConvert, 0, toComposeCurve(animationDataDto)), (float) opacity.doubleValue()) : null;
        AnimatedAppearanceDto.TranslationDto translation_x = initialStateDto.getTranslation_x();
        final AnimatedAppearanceDto.TranslationDto.ValueDto value = translation_x != null ? translation_x.getValue() : null;
        if (value instanceof AnimatedAppearanceDto.TranslationDto.ValueDto.Absolute) {
            exitTransitionSlideOutHorizontally = EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween(iConvert, 0, toComposeCurve(animationDataDto)), new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(SduiAnimatedAppearance.exitTransition$lambda$20(density, value, ((Integer) obj).intValue()));
                }
            });
        } else if (value instanceof AnimatedAppearanceDto.TranslationDto.ValueDto.Percentage) {
            exitTransitionSlideOutHorizontally = EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween(iConvert, 0, toComposeCurve(animationDataDto)), new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(SduiAnimatedAppearance.exitTransition$lambda$21(value, ((Integer) obj).intValue()));
                }
            });
        } else {
            if (value != null) {
                throw new NoWhenBranchMatchedException();
            }
            exitTransitionSlideOutHorizontally = null;
        }
        AnimatedAppearanceDto.TranslationDto translation_y = initialStateDto.getTranslation_y();
        final AnimatedAppearanceDto.TranslationDto.ValueDto value2 = translation_y != null ? translation_y.getValue() : null;
        if (value2 instanceof AnimatedAppearanceDto.TranslationDto.ValueDto.Absolute) {
            exitTransitionSlideOutVertically = EnterExitTransitionKt.slideOutVertically(AnimationSpecKt.tween(iConvert, 0, toComposeCurve(animationDataDto)), new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(SduiAnimatedAppearance.exitTransition$lambda$23(density, value2, ((Integer) obj).intValue()));
                }
            });
        } else if (value2 instanceof AnimatedAppearanceDto.TranslationDto.ValueDto.Percentage) {
            exitTransitionSlideOutVertically = EnterExitTransitionKt.slideOutVertically(AnimationSpecKt.tween(iConvert, 0, toComposeCurve(animationDataDto)), new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(SduiAnimatedAppearance.exitTransition$lambda$24(value2, ((Integer) obj).intValue()));
                }
            });
        } else if (value2 != null) {
            throw new NoWhenBranchMatchedException();
        }
        ExitTransition none = ExitTransition.INSTANCE.getNone();
        if (exitTransitionM4782scaleOutL8ZKhE$default != null) {
            none = none.plus(exitTransitionM4782scaleOutL8ZKhE$default);
        }
        if (exitTransitionFadeOut != null) {
            none = none.plus(exitTransitionFadeOut);
        }
        if (exitTransitionSlideOutHorizontally != null) {
            none = none.plus(exitTransitionSlideOutHorizontally);
        }
        return exitTransitionSlideOutVertically != null ? none.plus(exitTransitionSlideOutVertically) : none;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int exitTransition$lambda$20(Density density, AnimatedAppearanceDto.TranslationDto.ValueDto valueDto, int i) {
        return (int) density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl((float) ((AnimatedAppearanceDto.TranslationDto.ValueDto.Absolute) valueDto).getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int exitTransition$lambda$21(AnimatedAppearanceDto.TranslationDto.ValueDto valueDto, int i) {
        return i * (-((int) ((AnimatedAppearanceDto.TranslationDto.ValueDto.Percentage) valueDto).getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int exitTransition$lambda$23(Density density, AnimatedAppearanceDto.TranslationDto.ValueDto valueDto, int i) {
        return (int) density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl((float) ((AnimatedAppearanceDto.TranslationDto.ValueDto.Absolute) valueDto).getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int exitTransition$lambda$24(AnimatedAppearanceDto.TranslationDto.ValueDto valueDto, int i) {
        return i * (-((int) ((AnimatedAppearanceDto.TranslationDto.ValueDto.Percentage) valueDto).getValue()));
    }

    private static final Easing toComposeCurve(AnimatedAppearanceDto.AnimationDataDto animationDataDto) {
        AnimatedAppearanceDto.CurveDto curve;
        Easing linearEasing;
        if (animationDataDto != null && (curve = animationDataDto.getCurve()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[curve.ordinal()];
            if (i == 1 || i == 2) {
                linearEasing = Easing3.getLinearEasing();
            } else if (i == 3) {
                linearEasing = Easing3.getLinearOutSlowInEasing();
            } else if (i == 4) {
                linearEasing = Easing3.getFastOutLinearInEasing();
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                linearEasing = ExpandCurve;
            }
            if (linearEasing != null) {
                return linearEasing;
            }
        }
        return Easing3.getLinearEasing();
    }
}
