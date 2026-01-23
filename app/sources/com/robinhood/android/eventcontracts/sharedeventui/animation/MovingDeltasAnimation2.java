package com.robinhood.android.eventcontracts.sharedeventui.animation;

import android.annotation.SuppressLint;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.PathMeasure;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import p479j$.time.Instant;

/* compiled from: MovingDeltasAnimation.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a7\u0010\f\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aI\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0018\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006(²\u0006\u000e\u0010!\u001a\u00020 8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010%\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\f\u0010&\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010'8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;", "deltas", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Side;", "side", "Landroidx/compose/ui/Modifier;", "modifier", "", "MovingDeltasAnimation-sW7UJKQ", "(Lkotlinx/collections/immutable/ImmutableList;JLcom/robinhood/android/eventcontracts/sharedeventui/animation/Side;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MovingDeltasAnimation", "delta", "Landroidx/compose/ui/graphics/PathMeasure;", "pathMeasure", "Lkotlinx/coroutines/flow/SharedFlow;", "j$/time/Instant", "timeFlow", "", "rowOffsetMultiplier", "FadeUpText-FU0evQE", "(Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;Landroidx/compose/ui/graphics/PathMeasure;JLkotlinx/coroutines/flow/SharedFlow;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "FadeUpText", "PreviewMovingDeltasAnimation", "(Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Side;Landroidx/compose/runtime/Composer;I)V", "", "DeltaExistOnScreenTimeInMills", "F", "Landroidx/compose/animation/core/CubicBezierEasing;", "LinearOutFastInRampUpEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "", "animationStarted", "progress", "Landroidx/compose/ui/geometry/Offset;", "offset", "rowWidth", "rowOffset", "Lkotlinx/collections/immutable/PersistentList;", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class MovingDeltasAnimation2 {
    public static final float DeltaExistOnScreenTimeInMills = 3000.0f;
    private static final CubicBezierEasing LinearOutFastInRampUpEasing = new CubicBezierEasing(0.5f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FadeUpText_FU0evQE$lambda$17(Delta delta, PathMeasure pathMeasure, long j, SharedFlow sharedFlow, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        m14388FadeUpTextFU0evQE(delta, pathMeasure, j, sharedFlow, modifier, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FadeUpText_FU0evQE$lambda$23(Delta delta, PathMeasure pathMeasure, long j, SharedFlow sharedFlow, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        m14388FadeUpTextFU0evQE(delta, pathMeasure, j, sharedFlow, modifier, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MovingDeltasAnimation_sW7UJKQ$lambda$0(ImmutableList immutableList, long j, MovingDeltasAnimation8 movingDeltasAnimation8, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14389MovingDeltasAnimationsW7UJKQ(immutableList, j, movingDeltasAnimation8, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMovingDeltasAnimation$lambda$24(MovingDeltasAnimation8 movingDeltasAnimation8, int i, Composer composer, int i2) {
        PreviewMovingDeltasAnimation(movingDeltasAnimation8, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: MovingDeltasAnimation.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$PreviewMovingDeltasAnimation$1 */
    static final class C165971 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MovingDeltasAnimation8 $side;

        C165971(MovingDeltasAnimation8 movingDeltasAnimation8) {
            this.$side = movingDeltasAnimation8;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523820547, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.animation.PreviewMovingDeltasAnimation.<anonymous> (MovingDeltasAnimation.kt:233)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 100;
            Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(companion, C2002Dp.m7995constructorimpl(120), C2002Dp.m7995constructorimpl(f));
            Alignment center = Alignment.INSTANCE.getCenter();
            MovingDeltasAnimation8 movingDeltasAnimation8 = this.$side;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5171sizeVpY3zN4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(extensions2.persistentListOf(new Delta(1, null, 2, null)), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            MovingDeltasAnimation2.m14389MovingDeltasAnimationsW7UJKQ(invoke$lambda$4$lambda$1(snapshotState), movingDeltasAnimation8 == MovingDeltasAnimation8.LEFT ? BentoColor.INSTANCE.m21212getDayHydro0d7_KjU() : BentoColor.INSTANCE.m21320getNightJoule0d7_KjU(), movingDeltasAnimation8, SizeKt.m5171sizeVpY3zN4(companion, C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(70)), composer, 3072, 0);
            Unit unit = Unit.INSTANCE;
            composer.startReplaceGroup(5004770);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new MovingDeltasAnimation6(snapshotState, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ImmutableList3<Delta> invoke$lambda$4$lambda$1(SnapshotState<ImmutableList3<Delta>> snapshotState) {
            return snapshotState.getValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    private static final int FadeUpText_FU0evQE$lambda$16(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    private static final boolean FadeUpText_FU0evQE$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final long FadeUpText_FU0evQE$lambda$8(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"NowWithoutClock"})
    /* renamed from: MovingDeltasAnimation-sW7UJKQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14389MovingDeltasAnimationsW7UJKQ(final ImmutableList<Delta> deltas, final long j, final MovingDeltasAnimation8 side, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(deltas, "deltas");
        Intrinsics.checkNotNullParameter(side, "side");
        Composer composerStartRestartGroup = composer.startRestartGroup(840027529);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(deltas) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(side.ordinal()) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(840027529, i3, -1, "com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimation (MovingDeltasAnimation.kt:131)");
                }
                BoxWithConstraints.BoxWithConstraints(modifier2, null, false, ComposableLambda3.rememberComposableLambda(-1326771105, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$MovingDeltasAnimation$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                        invoke(boxWithConstraints4, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i5) {
                        Composer composer3 = composer2;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        int i6 = (i5 & 6) == 0 ? i5 | (composer2.changed(BoxWithConstraints) ? 4 : 2) : i5;
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1326771105, i6, -1, "com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimation.<anonymous> (MovingDeltasAnimation.kt:133)");
                        }
                        List<PathMeasure> listRememberDeltaMovePatternPathMeasures = RememberDeltaMovePatternPathMeasures.rememberDeltaMovePatternPathMeasures(BoxWithConstraints, side, composer2, i6 & 14);
                        composer2.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SharedFlow4.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        SharedFlow2 sharedFlow2 = (SharedFlow2) objRememberedValue;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(sharedFlow2);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new MovingDeltasAnimation5(sharedFlow2, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(sharedFlow2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
                        for (Delta delta : deltas) {
                            composer2.startMovableGroup(578273651, delta);
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = (PathMeasure) CollectionsKt.random(listRememberDeltaMovePatternPathMeasures, Random.INSTANCE);
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            SharedFlow2 sharedFlow22 = sharedFlow2;
                            MovingDeltasAnimation2.m14388FadeUpTextFU0evQE(delta, (PathMeasure) objRememberedValue3, j, sharedFlow22, Modifier.INSTANCE, side.getRowOffsetMultiplier(), composer3, 24576, 0);
                            composer2.endMovableGroup();
                            composer3 = composer2;
                            sharedFlow2 = sharedFlow22;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MovingDeltasAnimation2.MovingDeltasAnimation_sW7UJKQ$lambda$0(deltas, j, side, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            BoxWithConstraints.BoxWithConstraints(modifier2, null, false, ComposableLambda3.rememberComposableLambda(-1326771105, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$MovingDeltasAnimation$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                    invoke(boxWithConstraints4, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i5) {
                    Composer composer3 = composer2;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    int i6 = (i5 & 6) == 0 ? i5 | (composer2.changed(BoxWithConstraints) ? 4 : 2) : i5;
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1326771105, i6, -1, "com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimation.<anonymous> (MovingDeltasAnimation.kt:133)");
                    }
                    List<PathMeasure> listRememberDeltaMovePatternPathMeasures = RememberDeltaMovePatternPathMeasures.rememberDeltaMovePatternPathMeasures(BoxWithConstraints, side, composer2, i6 & 14);
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SharedFlow4.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    SharedFlow2 sharedFlow2 = (SharedFlow2) objRememberedValue;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(sharedFlow2);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new MovingDeltasAnimation5(sharedFlow2, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(sharedFlow2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
                    for (Delta delta : deltas) {
                        composer2.startMovableGroup(578273651, delta);
                        composer2.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = (PathMeasure) CollectionsKt.random(listRememberDeltaMovePatternPathMeasures, Random.INSTANCE);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        SharedFlow2 sharedFlow22 = sharedFlow2;
                        MovingDeltasAnimation2.m14388FadeUpTextFU0evQE(delta, (PathMeasure) objRememberedValue3, j, sharedFlow22, Modifier.INSTANCE, side.getRowOffsetMultiplier(), composer3, 24576, 0);
                        composer2.endMovableGroup();
                        composer3 = composer2;
                        sharedFlow2 = sharedFlow22;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0161  */
    /* renamed from: FadeUpText-FU0evQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14388FadeUpTextFU0evQE(final Delta delta, final PathMeasure pathMeasure, final long j, final SharedFlow<Instant> sharedFlow, Modifier modifier, int i, Composer composer, final int i2, final int i3) {
        int i4;
        long j2;
        Modifier modifier2;
        int i5;
        int i6;
        final int i7;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        Object objRememberedValue2;
        SnapshotFloatState2 snapshotFloatState2;
        Object objRememberedValue3;
        final SnapshotState snapshotState2;
        boolean zChangedInstance;
        Object movingDeltasAnimation3;
        int i8;
        SnapshotFloatState2 snapshotFloatState22;
        Object objRememberedValue4;
        final SnapshotIntState2 snapshotIntState2;
        boolean z;
        Object objRememberedValue5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Modifier modifier3;
        final int i9;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        final Delta delta2 = delta;
        SharedFlow<Instant> sharedFlow2 = sharedFlow;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1358420230);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(delta2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(pathMeasure) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
            j2 = j;
        } else {
            j2 = j;
            if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
            }
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(sharedFlow2) ? 2048 : 1024;
        }
        int i10 = i3 & 16;
        if (i10 != 0) {
            i4 |= 24576;
        } else {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                if ((196608 & i2) == 0) {
                    i6 = i;
                    i4 |= composerStartRestartGroup.changed(i6) ? 131072 : 65536;
                }
                if ((i4 & 74899) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    i9 = i6;
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    i7 = i5 == 0 ? 0 : i6;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1358420230, i4, -1, "com.robinhood.android.eventcontracts.sharedeventui.animation.FadeUpText (MovingDeltasAnimation.kt:175)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotFloatState3.mutableFloatStateOf(1.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.INSTANCE.m6553getZeroF1C5BW0()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = composerStartRestartGroup.changedInstance(sharedFlow2) | ((i4 & 14) != 4) | composerStartRestartGroup.changedInstance(pathMeasure);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                        i8 = i4;
                        movingDeltasAnimation3 = new MovingDeltasAnimation3(sharedFlow, delta2, pathMeasure, snapshotState, snapshotFloatState2, snapshotState2, null);
                        sharedFlow2 = sharedFlow;
                        delta2 = delta2;
                        snapshotFloatState22 = snapshotFloatState2;
                        composerStartRestartGroup.updateRememberedValue(movingDeltasAnimation3);
                    } else {
                        snapshotFloatState22 = snapshotFloatState2;
                        movingDeltasAnimation3 = objRememberedValue6;
                        i8 = i4;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(sharedFlow2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) movingDeltasAnimation3, composerStartRestartGroup, (i8 >> 9) & 14);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotIntState3.mutableIntStateOf(0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    snapshotIntState2 = (SnapshotIntState2) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z = (458752 & i8) != 131072;
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(MovingDeltasAnimation2.FadeUpText_FU0evQE$lambda$15$lambda$14(i7, snapshotIntState2));
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    if (FadeUpText_FU0evQE$lambda$2(snapshotState) || snapshotFloatState22.getFloatValue() == 1.0f) {
                        final Modifier modifier4 = modifier2;
                        final int i11 = i7;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return MovingDeltasAnimation2.FadeUpText_FU0evQE$lambda$17(delta, pathMeasure, j, sharedFlow, modifier4, i11, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    int i12 = i7;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i13 = BentoTheme.$stable;
                    SnapshotFloatState2 snapshotFloatState23 = snapshotFloatState22;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i13).m21595getXsmallD9Ej5fM());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged = composerStartRestartGroup.changed(snapshotState4);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MovingDeltasAnimation2.FadeUpText_FU0evQE$lambda$19$lambda$18(snapshotState2, snapshotState4, (Density) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierAlpha = Alpha.alpha(OffsetKt.offset(modifier2, (Function1) objRememberedValue7), delta2.alpha(snapshotFloatState23.getFloatValue()));
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MovingDeltasAnimation2.FadeUpText_FU0evQE$lambda$21$lambda$20(snapshotIntState2, (IntSize) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierAlpha, (Function1) objRememberedValue8);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composerStartRestartGroup, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    int i14 = i8 & 896;
                    modifier3 = modifier2;
                    i9 = i12;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(delta2.getIsPositive() ? ServerToBentoAssetMapper2.STOCK_UP_16 : ServerToBentoAssetMapper2.STOCK_DOWN_16), null, j2, null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48 | i14, 56);
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(delta2.getValue(), null, Color.m6701boximpl(j), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i13).getTextS(), composer2, i14 | 817889280, 0, 7546);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MovingDeltasAnimation2.FadeUpText_FU0evQE$lambda$23(delta2, pathMeasure, j, sharedFlow, modifier3, i9, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 196608;
            i6 = i;
            if ((i4 & 74899) == 74898) {
                if (i10 != 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(sharedFlow2) | ((i4 & 14) != 4) | composerStartRestartGroup.changedInstance(pathMeasure);
                Object objRememberedValue62 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    i8 = i4;
                    movingDeltasAnimation3 = new MovingDeltasAnimation3(sharedFlow, delta2, pathMeasure, snapshotState, snapshotFloatState2, snapshotState2, null);
                    sharedFlow2 = sharedFlow;
                    delta2 = delta2;
                    snapshotFloatState22 = snapshotFloatState2;
                    composerStartRestartGroup.updateRememberedValue(movingDeltasAnimation3);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(sharedFlow2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) movingDeltasAnimation3, composerStartRestartGroup, (i8 >> 9) & 14);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                    }
                    snapshotIntState2 = (SnapshotIntState2) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((458752 & i8) != 131072) {
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(MovingDeltasAnimation2.FadeUpText_FU0evQE$lambda$15$lambda$14(i7, snapshotIntState2));
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        final SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue5;
                        composerStartRestartGroup.endReplaceGroup();
                        if (FadeUpText_FU0evQE$lambda$2(snapshotState)) {
                        }
                        final Modifier modifier42 = modifier2;
                        final int i112 = i7;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 32;
        if (i5 != 0) {
        }
        i6 = i;
        if ((i4 & 74899) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FadeUpText_FU0evQE$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FadeUpText_FU0evQE$lambda$9(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FadeUpText_FU0evQE$lambda$15$lambda$14(int i, SnapshotIntState2 snapshotIntState2) {
        return i * snapshotIntState2.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset FadeUpText_FU0evQE$lambda$19$lambda$18(SnapshotState snapshotState, SnapshotState4 snapshotState4, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl(((((int) Float.intBitsToFloat((int) (FadeUpText_FU0evQE$lambda$8(snapshotState) >> 32))) + FadeUpText_FU0evQE$lambda$16(snapshotState4)) << 32) | (((int) Float.intBitsToFloat((int) (FadeUpText_FU0evQE$lambda$8(snapshotState) & 4294967295L))) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FadeUpText_FU0evQE$lambda$21$lambda$20(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() >> 32));
        return Unit.INSTANCE;
    }

    private static final void PreviewMovingDeltasAnimation(final MovingDeltasAnimation8 movingDeltasAnimation8, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1664975435);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(movingDeltasAnimation8.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1664975435, i2, -1, "com.robinhood.android.eventcontracts.sharedeventui.animation.PreviewMovingDeltasAnimation (MovingDeltasAnimation.kt:231)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(523820547, true, new C165971(movingDeltasAnimation8), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MovingDeltasAnimation2.PreviewMovingDeltasAnimation$lambda$24(movingDeltasAnimation8, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
