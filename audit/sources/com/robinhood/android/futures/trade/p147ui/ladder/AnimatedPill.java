package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.android.futures.sharedfuturesui.animations.PillLoadingPlaceholderModifierKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AnimatedPill.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\u001aT\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0016\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b\"\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$²\u0006\f\u0010\"\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, m3636d2 = {"", "showLoadingShimmer", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "loadingBackgroundColor", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "alpha", "", "pillContent", "Landroidx/compose/ui/Modifier;", "modifier", "AnimatedPill-T042LqI", "(ZLandroidx/compose/ui/graphics/Shape;JLkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AnimatedPill", "Landroidx/compose/animation/core/TweenSpec;", "loadingShimmerTweenSpec", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/TweenSpec;", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "PillShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getPillShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "LOADING_MIN_ALPHA", "F", "TEXT_MIN_ALPHA", "LOADING_MAX_ALPHA", "TEXT_MAX_ALPHA", "", "LOADING_TWEEN_DURATION_MILLS", "I", "animateLoadingAlpha", "textPillAlpha", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.AnimatedPillKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AnimatedPill {
    private static final float LOADING_MAX_ALPHA = 1.0f;
    private static final float LOADING_MIN_ALPHA = 0.1f;
    private static final int LOADING_TWEEN_DURATION_MILLS = 200;
    private static final RoundedCornerShape PillShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(32));
    private static final float TEXT_MAX_ALPHA = 1.0f;
    private static final float TEXT_MIN_ALPHA = 0.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedPill_T042LqI$lambda$6(boolean z, Shape shape, long j, Function3 function3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14758AnimatedPillT042LqI(z, shape, j, function3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final RoundedCornerShape getPillShape() {
        return PillShape;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TweenSpec<Float> loadingShimmerTweenSpec(Composer composer, int i) {
        composer.startReplaceGroup(126384535);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(126384535, i, -1, "com.robinhood.android.futures.trade.ui.ladder.loadingShimmerTweenSpec (AnimatedPill.kt:64)");
        }
        TweenSpec<Float> tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return tweenSpecTween$default;
    }

    private static final float AnimatedPill_T042LqI$lambda$1(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float AnimatedPill_T042LqI$lambda$5$lambda$4(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d3  */
    /* renamed from: AnimatedPill-T042LqI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14758AnimatedPillT042LqI(boolean z, final Shape shape, final long j, final Function3<? super Float, ? super Composer, ? super Integer, Unit> pillContent, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        int i4;
        final Modifier modifier2;
        int i5;
        SnapshotState4 snapshotState4CreateTransitionAnimation;
        Composer composer2;
        Modifier modifier3;
        int i6;
        Modifier modifierM14744pillLoadingPlaceholder0cUbh54$default;
        Composer composer3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i7;
        Composer composer4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(pillContent, "pillContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-686288215);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(pillContent) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                i5 = i3;
                if ((i5 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer4 = composerStartRestartGroup;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-686288215, i5, -1, "com.robinhood.android.futures.trade.ui.ladder.AnimatedPill (AnimatedPill.kt:27)");
                    }
                    Transition transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(z2), "showLoadingShimmerTransition", composerStartRestartGroup, (i5 & 14) | 48, 0);
                    AnimatedPill3 animatedPill3 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPillKt$AnimatedPill$animateLoadingAlpha$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer5, Integer num) {
                            return invoke(segment, composer5, num.intValue());
                        }

                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> animateFloat, Composer composer5, int i8) {
                            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer5.startReplaceGroup(-1690486599);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1690486599, i8, -1, "com.robinhood.android.futures.trade.ui.ladder.AnimatedPill.<anonymous> (AnimatedPill.kt:30)");
                            }
                            TweenSpec tweenSpecLoadingShimmerTweenSpec = AnimatedPill.loadingShimmerTweenSpec(composer5, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer5.endReplaceGroup();
                            return tweenSpecLoadingShimmerTweenSpec;
                        }
                    };
                    FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                    TwoWayConverter<Float, AnimationVectors2> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                    boolean zBooleanValue = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
                    composerStartRestartGroup.startReplaceGroup(-1306998988);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1306998988, 0, -1, "com.robinhood.android.futures.trade.ui.ladder.AnimatedPill.<anonymous> (AnimatedPill.kt:33)");
                    }
                    float f = !zBooleanValue ? 1.0f : 0.1f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Float fValueOf = Float.valueOf(f);
                    boolean zBooleanValue2 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
                    composerStartRestartGroup.startReplaceGroup(-1306998988);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1306998988, 0, -1, "com.robinhood.android.futures.trade.ui.ladder.AnimatedPill.<anonymous> (AnimatedPill.kt:33)");
                    }
                    float f2 = !zBooleanValue2 ? 1.0f : 0.1f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState4CreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), animatedPill3.invoke((AnimatedPill3) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "AnimatedLoadingAlpha", composerStartRestartGroup, 196608);
                    composerStartRestartGroup.startReplaceGroup(1902009137);
                    if (AnimatedPill_T042LqI$lambda$1(snapshotState4CreateTransitionAnimation) <= 0.1f) {
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier4;
                        i6 = i5;
                        modifierM14744pillLoadingPlaceholder0cUbh54$default = modifier3;
                    } else {
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier4;
                        i6 = i5;
                        modifierM14744pillLoadingPlaceholder0cUbh54$default = PillLoadingPlaceholderModifierKt.m14744pillLoadingPlaceholder0cUbh54$default(modifier3, shape, j, ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getPillOutlineGradiantBrush(), AnimatedPill_T042LqI$lambda$1(snapshotState4CreateTransitionAnimation), 0.0f, 0, null, 112, null);
                    }
                    composer2.endReplaceGroup();
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    composer3 = composer2;
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM14744pillLoadingPlaceholder0cUbh54$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.useNode();
                    } else {
                        composer3.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    AnimatedPill2 animatedPill2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPillKt$AnimatedPill$2$textPillAlpha$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer5, Integer num) {
                            return invoke(segment, composer5, num.intValue());
                        }

                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> animateFloat, Composer composer5, int i8) {
                            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer5.startReplaceGroup(622812330);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(622812330, i8, -1, "com.robinhood.android.futures.trade.ui.ladder.AnimatedPill.<anonymous>.<anonymous> (AnimatedPill.kt:47)");
                            }
                            TweenSpec tweenSpecLoadingShimmerTweenSpec = AnimatedPill.loadingShimmerTweenSpec(composer5, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer5.endReplaceGroup();
                            return tweenSpecLoadingShimmerTweenSpec;
                        }
                    };
                    TwoWayConverter<Float, AnimationVectors2> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                    boolean zBooleanValue3 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
                    composer3.startReplaceGroup(1841927205);
                    if (ComposerKt.isTraceInProgress()) {
                        i7 = -1;
                    } else {
                        i7 = -1;
                        ComposerKt.traceEventStart(1841927205, 0, -1, "com.robinhood.android.futures.trade.ui.ladder.AnimatedPill.<anonymous>.<anonymous> (AnimatedPill.kt:50)");
                    }
                    float f3 = !zBooleanValue3 ? 0.0f : 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    Float fValueOf2 = Float.valueOf(f3);
                    boolean zBooleanValue4 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
                    composer3.startReplaceGroup(1841927205);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1841927205, 0, i7, "com.robinhood.android.futures.trade.ui.ladder.AnimatedPill.<anonymous>.<anonymous> (AnimatedPill.kt:50)");
                    }
                    float f4 = zBooleanValue4 ? 0.0f : 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    SnapshotState4 snapshotState4CreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f4), animatedPill2.invoke((AnimatedPill2) transitionUpdateTransition.getSegment(), (Transition.Segment) composer3, (Composer) 0), vectorConverter2, "AnimatedTextPillAlpha", composer3, 196608);
                    composer4 = composer3;
                    pillContent.invoke(Float.valueOf(AnimatedPill_T042LqI$lambda$5$lambda$4(snapshotState4CreateTransitionAnimation2)), composer4, Integer.valueOf((i6 >> 6) & 112));
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final boolean z3 = z2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPillKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AnimatedPill.AnimatedPill_T042LqI$lambda$6(z3, shape, j, pillContent, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            i5 = i3;
            if ((i5 & 9363) == 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Transition transitionUpdateTransition2 = TransitionKt.updateTransition(Boolean.valueOf(z2), "showLoadingShimmerTransition", composerStartRestartGroup, (i5 & 14) | 48, 0);
                AnimatedPill3 animatedPill32 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPillKt$AnimatedPill$animateLoadingAlpha$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer5, Integer num) {
                        return invoke(segment, composer5, num.intValue());
                    }

                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> animateFloat, Composer composer5, int i8) {
                        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                        composer5.startReplaceGroup(-1690486599);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1690486599, i8, -1, "com.robinhood.android.futures.trade.ui.ladder.AnimatedPill.<anonymous> (AnimatedPill.kt:30)");
                        }
                        TweenSpec tweenSpecLoadingShimmerTweenSpec = AnimatedPill.loadingShimmerTweenSpec(composer5, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer5.endReplaceGroup();
                        return tweenSpecLoadingShimmerTweenSpec;
                    }
                };
                FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
                TwoWayConverter<Float, AnimationVectors2> vectorConverter3 = VectorConvertersKt.getVectorConverter(floatCompanionObject2);
                boolean zBooleanValue5 = ((Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
                composerStartRestartGroup.startReplaceGroup(-1306998988);
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!zBooleanValue5) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Float fValueOf3 = Float.valueOf(f);
                boolean zBooleanValue22 = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
                composerStartRestartGroup.startReplaceGroup(-1306998988);
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!zBooleanValue22) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState4CreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, fValueOf3, Float.valueOf(f2), animatedPill32.invoke((AnimatedPill3) transitionUpdateTransition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter3, "AnimatedLoadingAlpha", composerStartRestartGroup, 196608);
                composerStartRestartGroup.startReplaceGroup(1902009137);
                if (AnimatedPill_T042LqI$lambda$1(snapshotState4CreateTransitionAnimation) <= 0.1f) {
                }
                composer2.endReplaceGroup();
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                composer3 = composer2;
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM14744pillLoadingPlaceholder0cUbh54$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composer3.getApplier() == null) {
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    AnimatedPill2 animatedPill22 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPillKt$AnimatedPill$2$textPillAlpha$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer5, Integer num) {
                            return invoke(segment, composer5, num.intValue());
                        }

                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> animateFloat, Composer composer5, int i8) {
                            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer5.startReplaceGroup(622812330);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(622812330, i8, -1, "com.robinhood.android.futures.trade.ui.ladder.AnimatedPill.<anonymous>.<anonymous> (AnimatedPill.kt:47)");
                            }
                            TweenSpec tweenSpecLoadingShimmerTweenSpec = AnimatedPill.loadingShimmerTweenSpec(composer5, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer5.endReplaceGroup();
                            return tweenSpecLoadingShimmerTweenSpec;
                        }
                    };
                    TwoWayConverter<Float, AnimationVectors2> vectorConverter22 = VectorConvertersKt.getVectorConverter(floatCompanionObject2);
                    boolean zBooleanValue32 = ((Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
                    composer3.startReplaceGroup(1841927205);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!zBooleanValue32) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer3.endReplaceGroup();
                    Float fValueOf22 = Float.valueOf(f3);
                    boolean zBooleanValue42 = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
                    composer3.startReplaceGroup(1841927205);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (zBooleanValue42) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer3.endReplaceGroup();
                    SnapshotState4 snapshotState4CreateTransitionAnimation22 = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, fValueOf22, Float.valueOf(f4), animatedPill22.invoke((AnimatedPill2) transitionUpdateTransition2.getSegment(), (Transition.Segment) composer3, (Composer) 0), vectorConverter22, "AnimatedTextPillAlpha", composer3, 196608);
                    composer4 = composer3;
                    pillContent.invoke(Float.valueOf(AnimatedPill_T042LqI$lambda$5$lambda$4(snapshotState4CreateTransitionAnimation22)), composer4, Integer.valueOf((i6 >> 6) & 112));
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((i5 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
