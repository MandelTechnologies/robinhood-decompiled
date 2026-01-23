package com.robinhood.android.event.detail.p129ui.dialog;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.TransformOrigin2;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventTradeOverlayDialog.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$EventTradeOverlayDialog$2$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EventTradeOverlayDialog7 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotIntState2 $dismissTopPx$delegate;
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function1<ContractSelectorButtonViewState.Metadata, Unit> $onTradeClicked;
    final /* synthetic */ EventTradeOverlayDialogData $state;
    final /* synthetic */ SnapshotIntState2 $topContentHeightPx$delegate;
    final /* synthetic */ float $yOffset;

    /* JADX WARN: Multi-variable type inference failed */
    EventTradeOverlayDialog7(float f, Function0<Unit> function0, UserInteractionEventDescriptor userInteractionEventDescriptor, EventTradeOverlayDialogData eventTradeOverlayDialogData, SnapshotIntState2 snapshotIntState2, Function1<? super ContractSelectorButtonViewState.Metadata, Unit> function1, Modifier modifier, SnapshotIntState2 snapshotIntState22) {
        this.$yOffset = f;
        this.$onDismiss = function0;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$state = eventTradeOverlayDialogData;
        this.$topContentHeightPx$delegate = snapshotIntState2;
        this.$onTradeClicked = function1;
        this.$modifier = modifier;
        this.$dismissTopPx$delegate = snapshotIntState22;
    }

    private static final float invoke$lambda$1(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-68322912, i, -1, "com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialog.<anonymous>.<anonymous>.<anonymous> (EventTradeOverlayDialog.kt:344)");
        }
        Transition<EnterExitState> transition = AnimatedVisibility.getTransition();
        EventTradeOverlayDialog8 eventTradeOverlayDialog8 = new Function3<Transition.Segment<EnterExitState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$EventTradeOverlayDialog$2$1$1$cardScale$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }

            public final FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> animateFloat, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                composer2.startReplaceGroup(-711299033);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-711299033, i2, -1, "com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventTradeOverlayDialog.kt:346)");
                }
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return tweenSpecTween$default;
            }
        };
        TwoWayConverter<Float, AnimationVectors2> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        EnterExitState currentState = transition.getCurrentState();
        composer.startReplaceGroup(335345365);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(335345365, 0, -1, "com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventTradeOverlayDialog.kt:347)");
        }
        EnterExitState enterExitState = EnterExitState.Visible;
        float f = currentState == enterExitState ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        Float fValueOf = Float.valueOf(f);
        EnterExitState targetState = transition.getTargetState();
        composer.startReplaceGroup(335345365);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(335345365, 0, -1, "com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventTradeOverlayDialog.kt:347)");
        }
        float f2 = targetState == enterExitState ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        SnapshotState4 snapshotState4CreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition, fValueOf, Float.valueOf(f2), eventTradeOverlayDialog8.invoke((EventTradeOverlayDialog8) transition.getSegment(), (Transition.Segment<EnterExitState>) composer, (Composer) 0), vectorConverter, "card scale", composer, 196608);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        float f3 = this.$yOffset;
        Function0<Unit> function0 = this.$onDismiss;
        UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
        final EventTradeOverlayDialogData eventTradeOverlayDialogData = this.$state;
        final SnapshotIntState2 snapshotIntState2 = this.$topContentHeightPx$delegate;
        Function1<ContractSelectorButtonViewState.Metadata, Unit> function1 = this.$onTradeClicked;
        Modifier modifier = this.$modifier;
        final SnapshotIntState2 snapshotIntState22 = this.$dismissTopPx$delegate;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getTopCenter()), 0.0f, f3, 0.0f, 0.0f, 13, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierM5146paddingqDBjuR0$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
        composer.startReplaceGroup(5004770);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion4 = Composer.INSTANCE;
        if (objRememberedValue == companion4.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$EventTradeOverlayDialog$2$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EventTradeOverlayDialog7.invoke$lambda$9$lambda$3$lambda$2(snapshotIntState2, (LayoutCoordinates) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5144paddingVpY3zN4$default, (Function1) objRememberedValue);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer, 0);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierOnGloballyPositioned);
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        EventTradeOverlayDialog4.m14156EventTradeDialogCardContentRYX2cs4(eventTradeOverlayDialogData, invoke$lambda$1(snapshotState4CreateTransitionAnimation), TransformOrigin2.TransformOrigin(eventTradeOverlayDialogData.getAnimationStartDirection(), 1.0f), null, composer, 0, 8);
        Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(eventTradeOverlayDialogData);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion4.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$EventTradeOverlayDialog$2$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(EventTradeOverlayDialog7.invoke$lambda$9$lambda$6$lambda$5$lambda$4(eventTradeOverlayDialogData, ((Integer) obj).intValue()));
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        EventTradeOverlayDialog4.EventTradeDialogTradeButtons(eventTradeOverlayDialogData, function1, userInteractionEventDescriptor, AnimatedVisibilityScope.animateEnterExit$default(AnimatedVisibility, modifierFillMaxWidth$default, EnterExitTransitionKt.slideInHorizontally(tweenSpecTween$default, (Function1) objRememberedValue2), null, null, 6, null), composer, 0, 0);
        composer.endNode();
        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 7, null);
        composer.startReplaceGroup(5004770);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion4.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$EventTradeOverlayDialog$2$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EventTradeOverlayDialog7.invoke$lambda$9$lambda$8$lambda$7(snapshotIntState22, (LayoutCoordinates) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        EventTradeOverlayDialog4.EventTradeDialogDismissButton(function0, ModifiersKt.autoLogEvents$default(SizeKt.m5169size3ABfNKs(AnimatedVisibilityScope.animateEnterExit$default(AnimatedVisibility, OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5146paddingqDBjuR0$default2, (Function1) objRememberedValue3), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m4780scaleInL8ZKhE$default(AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.6f, 0L, 4, null)), null, null, 6, null), EventTradeOverlayDialog4.getEventTradeDialogDismissButtonSize()), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "event-trade-overlay-dismiss-" + eventTradeOverlayDialogData.getBuyMoreMetadata().getContractId(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), composer, 0, 0);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$3$lambda$2(SnapshotIntState2 snapshotIntState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotIntState2.setIntValue((int) (coordinates.mo7241getSizeYbymL2g() & 4294967295L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$9$lambda$6$lambda$5$lambda$4(EventTradeOverlayDialogData eventTradeOverlayDialogData, int i) {
        return eventTradeOverlayDialogData.getAnimationStartDirection() == 0.0f ? -i : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$7(SnapshotIntState2 snapshotIntState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotIntState2.setIntValue((int) LayoutCoordinates2.boundsInRoot(coordinates).getTop());
        return Unit.INSTANCE;
    }
}
