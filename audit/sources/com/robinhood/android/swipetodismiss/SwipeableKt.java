package com.robinhood.android.swipetodismiss;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Swipeable.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aZ\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062#\b\u0002\u0010\b\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\tH\u0007¢\u0006\u0002\u0010\u000e\u001aI\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0010\u001a\u0002H\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00120\t2\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0002\u0010\u0013\u001aË\u0001\u0010\u0014\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0002*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e28\b\u0002\u0010\u001f\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(!\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020#0 2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020(2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120*¢\u0006\u0004\b+\u0010,\u001a$\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070.2\u0006\u0010/\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000700H\u0002\u001aX\u00101\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u0007002\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070 2\u0006\u00103\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u0007H\u0002\u001a-\u00104\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00020\u00182\u0006\u0010\u0016\u001a\u0002H\u0002H\u0002¢\u0006\u0002\u00105\"$\u00106\u001a\u000207\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006:"}, m3636d2 = {"rememberSwipeableState", "Lcom/robinhood/android/swipetodismiss/SwipeableState;", "T", "", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/android/swipetodismiss/SwipeableState;", "rememberSwipeableStateFor", "value", "onValueChange", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/android/swipetodismiss/SwipeableState;", "swipeable", "Landroidx/compose/ui/Modifier;", "state", "anchors", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "reverseDirection", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "thresholds", "Lkotlin/Function2;", "from", "to", "Lcom/robinhood/android/swipetodismiss/ThresholdConfig;", "resistance", "Lcom/robinhood/android/swipetodismiss/ResistanceConfig;", "flingEnabled", "velocityThreshold", "Landroidx/compose/ui/unit/Dp;", "onDragStarted", "Lkotlin/Function0;", "swipeable-JwDH8BQ", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/swipetodismiss/SwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Lcom/robinhood/android/swipetodismiss/ResistanceConfig;ZFLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "findBounds", "", "offset", "", "computeTarget", "lastValue", "velocity", "getOffset", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;", "PreUpPostDownNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getPreUpPostDownNestedScrollConnection", "(Lcom/robinhood/android/swipetodismiss/SwipeableState;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "lib-swipe-to-dismiss_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SwipeableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberSwipeableState$lambda$1$lambda$0(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberSwipeableStateFor$lambda$5$lambda$4(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* renamed from: swipeable-JwDH8BQ, reason: not valid java name */
    public static final <T> Modifier m19209swipeableJwDH8BQ(Modifier swipeable, final SwipeableState<T> state, final Map<Float, ? extends T> anchors, final Orientation orientation, final boolean z, final boolean z2, final InteractionSource3 interactionSource3, final Function2<? super T, ? super T, ? extends ThresholdConfig> thresholds, final ResistanceConfig resistanceConfig, final boolean z3, final float f, final Function0<Unit> onDragStarted) {
        Intrinsics.checkNotNullParameter(swipeable, "$this$swipeable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        return ComposedModifier2.composed(swipeable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: com.robinhood.android.swipetodismiss.SwipeableKt$swipeable-JwDH8BQ$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("swipeable");
                inspectorInfo.getProperties().set("state", state);
                inspectorInfo.getProperties().set("anchors", anchors);
                inspectorInfo.getProperties().set("orientation", orientation);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", interactionSource3);
                inspectorInfo.getProperties().set("thresholds", thresholds);
                inspectorInfo.getProperties().set("resistance", resistanceConfig);
                inspectorInfo.getProperties().set("flingEnabled", Boolean.valueOf(z3));
                inspectorInfo.getProperties().set("velocityThreshold", C2002Dp.m7993boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.swipetodismiss.SwipeableKt$swipeable$4
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(-606846078);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-606846078, i, -1, "com.robinhood.android.swipetodismiss.swipeable.<anonymous> (Swipeable.kt:611)");
                }
                if (anchors.isEmpty()) {
                    throw new IllegalArgumentException("You must have at least one anchor.");
                }
                if (CollectionsKt.distinct(anchors.values()).size() != anchors.size()) {
                    throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                state.ensureInit$lib_swipe_to_dismiss_externalDebug(anchors);
                Object obj = anchors;
                Object obj2 = state;
                composer.startReplaceGroup(-1224400529);
                boolean zChanged = composer.changed(state) | composer.changedInstance(anchors) | composer.changed(resistanceConfig) | composer.changed(thresholds) | composer.changed(density) | composer.changed(z3) | composer.changed(f);
                SwipeableState<T> swipeableState = state;
                Map<Float, T> map = anchors;
                ResistanceConfig resistanceConfig2 = resistanceConfig;
                boolean z4 = z3;
                Function2<T, T, ThresholdConfig> function2 = thresholds;
                float f2 = f;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object swipeableKt$swipeable$4$3$1 = new SwipeableKt$swipeable$4$3$1(swipeableState, map, resistanceConfig2, z4, density, function2, f2, null);
                    composer.updateRememberedValue(swipeableKt$swipeable$4$3$1);
                    objRememberedValue = swipeableKt$swipeable$4$3$1;
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(obj, obj2, (Function2) objRememberedValue, composer, 0);
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zIsAnimationRunning = state.isAnimationRunning();
                DraggableState draggableState = state.getDraggableState();
                Orientation orientation2 = orientation;
                boolean z5 = z;
                InteractionSource3 interactionSource32 = interactionSource3;
                composer.startReplaceGroup(5004770);
                boolean zChanged2 = composer.changed(onDragStarted);
                Function0<Unit> function0 = onDragStarted;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new SwipeableKt$swipeable$4$4$1(function0, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function3 function3 = (Function3) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChanged3 = composer.changed(state);
                SwipeableState<T> swipeableState2 = state;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new SwipeableKt$swipeable$4$5$1(swipeableState2, null);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                Modifier modifierDraggable = DraggableKt.draggable(companion, draggableState, orientation2, z5, interactionSource32, zIsAnimationRunning, function3, (Function3) objRememberedValue3, z2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierDraggable;
            }
        });
    }

    public static final <T> SwipeableState<T> rememberSwipeableState(final T initialValue, final AnimationSpec<Float> animationSpec, final Function1<? super T, Boolean> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceGroup(-937922276);
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.swipetodismiss.SwipeableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(SwipeableKt.rememberSwipeableState$lambda$1$lambda$0(obj));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-937922276, i, -1, "com.robinhood.android.swipetodismiss.rememberSwipeableState (Swipeable.kt:495)");
        }
        Object[] objArr = new Object[0];
        Saver<SwipeableState<T>, T> Saver = SwipeableState.INSTANCE.Saver(animationSpec, function1);
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = ((((i & 14) ^ 6) > 4 && composer.changedInstance(initialValue)) || (i & 6) == 4) | composer.changedInstance(animationSpec) | ((((i & 896) ^ 384) > 256 && composer.changed(function1)) || (i & 384) == 256);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.swipetodismiss.SwipeableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SwipeableKt.rememberSwipeableState$lambda$3$lambda$2(initialValue, animationSpec, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        SwipeableState<T> swipeableState = (SwipeableState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue2, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return swipeableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwipeableState rememberSwipeableState$lambda$3$lambda$2(Object obj, AnimationSpec animationSpec, Function1 function1) {
        return new SwipeableState(obj, animationSpec, function1);
    }

    public static final <T> SwipeableState<T> rememberSwipeableStateFor(final T value, final Function1<? super T, Unit> onValueChange, AnimationSpec<Float> animationSpec, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        composer.startReplaceGroup(-1826149227);
        if ((i2 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1826149227, i, -1, "com.robinhood.android.swipetodismiss.rememberSwipeableStateFor (Swipeable.kt:523)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new SwipeableState(value, animationSpec, new Function1() { // from class: com.robinhood.android.swipetodismiss.SwipeableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(SwipeableKt.rememberSwipeableStateFor$lambda$5$lambda$4(obj));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        final SwipeableState<T> swipeableState = (SwipeableState) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
        composer.endReplaceGroup();
        Object value2 = snapshotState.getValue();
        composer.startReplaceGroup(-1633490746);
        int i3 = (i & 14) ^ 6;
        boolean z = (i3 > 4 && composer.changedInstance(value)) || (i & 6) == 4;
        Object objRememberedValue3 = composer.rememberedValue();
        if (z || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new SwipeableKt$rememberSwipeableStateFor$1$1(value, swipeableState, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        int i4 = i & 8;
        EffectsKt.LaunchedEffect(value, value2, (Function2) objRememberedValue3, composer, i & 14);
        T currentValue = swipeableState.getCurrentValue();
        composer.startReplaceGroup(-1224400529);
        boolean z2 = ((i3 > 4 && composer.changedInstance(value)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(onValueChange)) || (i & 48) == 32);
        Object objRememberedValue4 = composer.rememberedValue();
        if (z2 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.swipetodismiss.SwipeableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SwipeableKt.rememberSwipeableStateFor$lambda$10$lambda$9(value, swipeableState, onValueChange, snapshotState, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        EffectsKt.DisposableEffect(currentValue, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composer, i4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return swipeableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult rememberSwipeableStateFor$lambda$10$lambda$9(Object obj, SwipeableState swipeableState, Function1 function1, SnapshotState snapshotState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        if (!Intrinsics.areEqual(obj, swipeableState.getCurrentValue())) {
            function1.invoke(swipeableState.getCurrentValue());
            snapshotState.setValue(Boolean.valueOf(!((Boolean) snapshotState.getValue()).booleanValue()));
        }
        return new DisposableEffectResult() { // from class: com.robinhood.android.swipetodismiss.SwipeableKt$rememberSwipeableStateFor$lambda$10$lambda$9$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FixedThreshold swipeable_JwDH8BQ$lambda$11(Object obj, Object obj2) {
        return new FixedThreshold(C2002Dp.m7995constructorimpl(56), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Float> findBounds(float f, Set<Float> set) {
        Set<Float> set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (((Number) obj).floatValue() <= f + 0.001d) {
                arrayList.add(obj);
            }
        }
        Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() >= f - 0.001d) {
                arrayList2.add(obj2);
            }
        }
        Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) arrayList2);
        if (fMaxOrNull == null) {
            return CollectionsKt.listOfNotNull(fMinOrNull);
        }
        if (fMinOrNull == null) {
            return CollectionsKt.listOf(fMaxOrNull);
        }
        if (Intrinsics.areEqual(fMaxOrNull, fMinOrNull)) {
            return CollectionsKt.listOf(fMaxOrNull);
        }
        return CollectionsKt.listOf((Object[]) new Float[]{fMaxOrNull, fMinOrNull});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float computeTarget(float f, float f2, Set<Float> set, Function2<? super Float, ? super Float, Float> function2, float f3, boolean z, float f4) {
        List<Float> listFindBounds = findBounds(f, set);
        int size = listFindBounds.size();
        if (size == 0) {
            return f2;
        }
        if (size == 1) {
            return listFindBounds.get(0).floatValue();
        }
        float fFloatValue = listFindBounds.get(0).floatValue();
        float fFloatValue2 = listFindBounds.get(1).floatValue();
        return (f2 > f ? (!z || f3 > (-f4)) && f > function2.invoke(Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue)).floatValue() : (z && f3 >= f4) || f >= function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue()) ? fFloatValue2 : fFloatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float getOffset(Map<Float, ? extends T> map, T t) {
        T next;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Map.Entry) next).getValue(), t)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static final <T> NestedScrollModifier getPreUpPostDownNestedScrollConnection(SwipeableState<T> swipeableState) {
        Intrinsics.checkNotNullParameter(swipeableState, "<this>");
        return new SwipeableKt$PreUpPostDownNestedScrollConnection$1(swipeableState);
    }
}
