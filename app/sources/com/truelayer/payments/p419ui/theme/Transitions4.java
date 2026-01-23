package com.truelayer.payments.p419ui.theme;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.truelayer.payments.p419ui.providers.WindowState;
import com.truelayer.payments.p419ui.providers.WindowStateProvider2;
import com.truelayer.payments.p419ui.utils.Converters3;
import com.truelayer.payments.p419ui.utils.Navigation2;
import com.truelayer.payments.p419ui.utils.Navigation4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Transitions.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u001a:\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000\u001a8\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u001a9\u0010\f\u001a\u00020\u0001\"\b\b\u0000\u0010\r*\u00020\u0003*\u00020\u00012\u0006\u0010\u000e\u001a\u0002H\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\nX\u008a\u0084\u0002"}, m3636d2 = {"horizontalSlideNavigation", "Landroidx/compose/ui/Modifier;", "state", "Lcom/truelayer/payments/ui/utils/NavigationRoute;", NavTransition2.KEY_TRANSITION, "Landroidx/compose/animation/core/Transition;", "direction", "Lcom/truelayer/payments/ui/utils/Direction;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "stackNavigation", "themedNavigationTransition", "T", "next", "(Landroidx/compose/ui/Modifier;Lcom/truelayer/payments/ui/utils/NavigationRoute;Landroidx/compose/animation/core/Transition;Lcom/truelayer/payments/ui/utils/Direction;)Landroidx/compose/ui/Modifier;", "payments-ui_release", "translation", "visibility"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.theme.TransitionsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Transitions4 {
    public static final <T extends Navigation4> Modifier themedNavigationTransition(Modifier modifier, final T next, final Transition<Navigation4> transition, final Navigation2 direction) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.truelayer.payments.ui.theme.TransitionsKt.themedNavigationTransition.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TT;Landroidx/compose/animation/core/Transition<Lcom/truelayer/payments/ui/utils/NavigationRoute;>;Lcom/truelayer/payments/ui/utils/Direction;)V */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-1180481312);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1180481312, i, -1, "com.truelayer.payments.ui.theme.themedNavigationTransition.<anonymous> (Transitions.kt:23)");
                }
                Modifier modifierThen = composed.then(((WindowState) composer.consume(WindowStateProvider2.getLocalWindowState())).getTransition().invoke(composed, next, transition, direction));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        }, 1, null);
    }

    public static /* synthetic */ Modifier stackNavigation$default(Modifier modifier, Navigation4 navigation4, Transition transition, Navigation2 navigation2, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 8) != 0) {
            finiteAnimationSpec = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        }
        return stackNavigation(modifier, navigation4, transition, navigation2, finiteAnimationSpec);
    }

    public static final Modifier stackNavigation(Modifier modifier, Navigation4 state, Transition<Navigation4> transition, Navigation2 direction, FiniteAnimationSpec<Float> animationSpec) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return (!(Intrinsics.areEqual(state, transition.getTargetState()) && direction == Navigation2.Back) && (Intrinsics.areEqual(state, transition.getTargetState()) || direction != Navigation2.Forward)) ? modifier.then(horizontalSlideNavigation(modifier, state, transition, direction, animationSpec)) : modifier;
    }

    public static /* synthetic */ Modifier horizontalSlideNavigation$default(Modifier modifier, Navigation4 navigation4, Transition transition, Navigation2 navigation2, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 8) != 0) {
            finiteAnimationSpec = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        }
        return horizontalSlideNavigation(modifier, navigation4, transition, navigation2, finiteAnimationSpec);
    }

    public static final Modifier horizontalSlideNavigation(Modifier modifier, final Navigation4 state, final Transition<Navigation4> transition, final Navigation2 direction, final FiniteAnimationSpec<Float> animationSpec) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.truelayer.payments.ui.theme.TransitionsKt.horizontalSlideNavigation.1

            /* compiled from: Transitions.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            /* renamed from: com.truelayer.payments.ui.theme.TransitionsKt$horizontalSlideNavigation$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Navigation2.values().length];
                    try {
                        iArr[Navigation2.None.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Navigation2.Forward.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Navigation2.Back.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                final int i2;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-2055096200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2055096200, i, -1, "com.truelayer.payments.ui.theme.horizontalSlideNavigation.<anonymous> (Transitions.kt:75)");
                }
                WindowState windowState = (WindowState) composer.consume(WindowStateProvider2.getLocalWindowState());
                Transition<Navigation4> transition2 = transition;
                final FiniteAnimationSpec<Float> finiteAnimationSpec = animationSpec;
                Function3<Transition.Segment<Navigation4>, Composer, Integer, FiniteAnimationSpec<Float>> function3 = new Function3<Transition.Segment<Navigation4>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.truelayer.payments.ui.theme.TransitionsKt$horizontalSlideNavigation$1$translation$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Navigation4> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Navigation4> animateFloat, Composer composer2, int i3) {
                        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                        composer2.startReplaceableGroup(-112180838);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-112180838, i3, -1, "com.truelayer.payments.ui.theme.horizontalSlideNavigation.<anonymous>.<anonymous> (Transitions.kt:78)");
                        }
                        FiniteAnimationSpec<Float> finiteAnimationSpec2 = finiteAnimationSpec;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        return finiteAnimationSpec2;
                    }
                };
                Navigation4 navigation4 = state;
                composer.startReplaceableGroup(-1338768149);
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                TwoWayConverter<Float, AnimationVectors2> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composer.startReplaceableGroup(-142660079);
                Navigation4 currentState = transition2.getCurrentState();
                composer.startReplaceableGroup(-2108900792);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2108900792, 0, -1, "com.truelayer.payments.ui.theme.horizontalSlideNavigation.<anonymous>.<anonymous> (Transitions.kt:81)");
                }
                composer.startReplaceableGroup(291819301);
                float fM27183intoPx8Feqmps = Intrinsics.areEqual(currentState, navigation4) ? 0.0f : Converters3.m27183intoPx8Feqmps(windowState.m27081getWidthD9Ej5fM(), composer, 0);
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                Float fValueOf = Float.valueOf(fM27183intoPx8Feqmps);
                Navigation4 targetState = transition2.getTargetState();
                composer.startReplaceableGroup(-2108900792);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2108900792, 0, -1, "com.truelayer.payments.ui.theme.horizontalSlideNavigation.<anonymous>.<anonymous> (Transitions.kt:81)");
                }
                composer.startReplaceableGroup(291819301);
                float fM27183intoPx8Feqmps2 = Intrinsics.areEqual(targetState, navigation4) ? 0.0f : Converters3.m27183intoPx8Feqmps(windowState.m27081getWidthD9Ej5fM(), composer, 0);
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                final SnapshotState4 snapshotState4CreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition2, fValueOf, Float.valueOf(fM27183intoPx8Feqmps2), function3.invoke(transition2.getSegment(), composer, 0), vectorConverter, "translation_slider", composer, 196608);
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                Transition<Navigation4> transition3 = transition;
                final FiniteAnimationSpec<Float> finiteAnimationSpec2 = animationSpec;
                Function3<Transition.Segment<Navigation4>, Composer, Integer, FiniteAnimationSpec<Float>> function32 = new Function3<Transition.Segment<Navigation4>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.truelayer.payments.ui.theme.TransitionsKt$horizontalSlideNavigation$1$visibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Navigation4> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Navigation4> animateFloat, Composer composer2, int i3) {
                        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                        composer2.startReplaceableGroup(-614403577);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-614403577, i3, -1, "com.truelayer.payments.ui.theme.horizontalSlideNavigation.<anonymous>.<anonymous> (Transitions.kt:86)");
                        }
                        FiniteAnimationSpec<Float> finiteAnimationSpec3 = finiteAnimationSpec2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        return finiteAnimationSpec3;
                    }
                };
                Navigation4 navigation42 = state;
                composer.startReplaceableGroup(-1338768149);
                TwoWayConverter<Float, AnimationVectors2> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composer.startReplaceableGroup(-142660079);
                Navigation4 currentState2 = transition3.getCurrentState();
                composer.startReplaceableGroup(-1648645223);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1648645223, 0, -1, "com.truelayer.payments.ui.theme.horizontalSlideNavigation.<anonymous>.<anonymous> (Transitions.kt:89)");
                }
                float f = Intrinsics.areEqual(currentState2, navigation42) ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                Float fValueOf2 = Float.valueOf(f);
                Navigation4 targetState2 = transition3.getTargetState();
                composer.startReplaceableGroup(-1648645223);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1648645223, 0, -1, "com.truelayer.payments.ui.theme.horizontalSlideNavigation.<anonymous>.<anonymous> (Transitions.kt:89)");
                }
                float f2 = Intrinsics.areEqual(targetState2, navigation42) ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                final SnapshotState4 snapshotState4CreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transition3, fValueOf2, Float.valueOf(f2), function32.invoke(transition3.getSegment(), composer, 0), vectorConverter2, "translation_alpha", composer, 196608);
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                int i3 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
                if (i3 == 1) {
                    i2 = 0;
                } else if (i3 == 2) {
                    i2 = 1;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = -1;
                }
                final Transition<Navigation4> transition4 = transition;
                final Navigation4 navigation43 = state;
                final Navigation2 navigation2 = direction;
                Modifier modifierThen = composed.then(GraphicsLayerModifier6.graphicsLayer(composed, new Function1<GraphicsLayerScope, Unit>() { // from class: com.truelayer.payments.ui.theme.TransitionsKt.horizontalSlideNavigation.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(GraphicsLayerScope graphicsLayer) {
                        float f3;
                        float fInvoke$lambda$1;
                        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                        if (Intrinsics.areEqual(transition4.getTargetState(), navigation43)) {
                            f3 = i2;
                            fInvoke$lambda$1 = C433081.invoke$lambda$1(snapshotState4CreateTransitionAnimation);
                        } else {
                            f3 = i2;
                            fInvoke$lambda$1 = -C433081.invoke$lambda$1(snapshotState4CreateTransitionAnimation);
                        }
                        graphicsLayer.setTranslationX(f3 * fInvoke$lambda$1);
                        if (navigation2 == Navigation2.None) {
                            graphicsLayer.setAlpha(C433081.invoke$lambda$3(snapshotState4CreateTransitionAnimation2));
                        }
                    }
                }));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float invoke$lambda$1(SnapshotState4<Float> snapshotState4) {
                return snapshotState4.getValue().floatValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float invoke$lambda$3(SnapshotState4<Float> snapshotState4) {
                return snapshotState4.getValue().floatValue();
            }
        }, 1, null);
    }
}
