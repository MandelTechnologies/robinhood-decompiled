package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

/* compiled from: LateMotionLayout.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0095\u0001\u0010\u0016\u001a\u00020\n2\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001ae\u0010\u001e\u001a\u00020\u001d2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Landroidx/compose/runtime/MutableState;", "Landroidx/constraintlayout/compose/ConstraintSet;", "start", "end", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlinx/coroutines/channels/Channel;", "channel", "Landroidx/compose/runtime/State;", "", "contentTracker", "Landroidx/compose/ui/node/Ref;", "Landroidx/constraintlayout/compose/CompositionSource;", "compositionSource", "", "optimizationLevel", "Lkotlin/Function0;", "finishedAnimationListener", "Landroidx/compose/ui/Modifier;", "modifier", "content", "LateMotionLayout", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/core/AnimationSpec;Lkotlinx/coroutines/channels/Channel;Landroidx/compose/runtime/State;Landroidx/compose/ui/node/Ref;ILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "startProvider", "endProvider", "motionProgress", "Landroidx/constraintlayout/compose/MotionMeasurer;", "measurer", "Landroidx/compose/ui/layout/MeasurePolicy;", "lateMotionLayoutMeasurePolicy", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/State;Landroidx/compose/ui/node/Ref;Landroidx/compose/runtime/State;Landroidx/constraintlayout/compose/MotionMeasurer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "constraintlayout-compose_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.constraintlayout.compose.LateMotionLayoutKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LateMotionLayout {
    @PublishedApi
    public static final void LateMotionLayout(final SnapshotState<ConstraintSet> snapshotState, final SnapshotState<ConstraintSet> snapshotState2, final AnimationSpec<Float> animationSpec, Channel<ConstraintSet> channel, final SnapshotState4<Unit> snapshotState4, final Ref<CompositionSource> ref, final int i, final Function0<Unit> function0, final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        SnapshotState4<Unit> snapshotState42;
        int i4;
        Composer composer2;
        final Channel<ConstraintSet> channel2;
        Composer composerStartRestartGroup = composer.startRestartGroup(688627412);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(snapshotState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(snapshotState2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(animationSpec) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(channel) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            snapshotState42 = snapshotState4;
            i3 |= composerStartRestartGroup.changed(snapshotState42) ? 16384 : 8192;
        } else {
            snapshotState42 = snapshotState4;
        }
        if ((196608 & i2) == 0) {
            i3 |= (i2 & 262144) == 0 ? composerStartRestartGroup.changed(ref) : composerStartRestartGroup.changedInstance(ref) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 = i;
            i3 |= composerStartRestartGroup.changed(i4) ? 1048576 : 524288;
        } else {
            i4 = i;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(688627412, i3, -1, "androidx.constraintlayout.compose.LateMotionLayout (LateMotionLayout.kt:57)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new MotionMeasurer(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Animatable animatable = (Animatable) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = animatable.asState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            SnapshotState4 snapshotState43 = (SnapshotState4) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotIntState3.mutableIntStateOf(1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0<ConstraintSet>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$measurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final ConstraintSet invoke() {
                        ConstraintSet value = snapshotState.getValue();
                        Intrinsics.checkNotNull(value);
                        return value;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function0 function02 = (Function0) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0<ConstraintSet>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$measurePolicy$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final ConstraintSet invoke() {
                        ConstraintSet value = snapshotState2.getValue();
                        Intrinsics.checkNotNull(value);
                        return value;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            int i5 = i3;
            MeasurePolicy measurePolicyLateMotionLayoutMeasurePolicy = lateMotionLayoutMeasurePolicy(function02, (Function0) objRememberedValue6, snapshotState42, ref, snapshotState43, motionMeasurer, i4);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(motionMeasurer);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$1$1
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
                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, motionMeasurer);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            boolean z = true;
            composer2 = composerStartRestartGroup;
            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifier, false, (Function1) objRememberedValue7, 1, null), function2, measurePolicyLateMotionLayoutMeasurePolicy, composer2, (i5 >> 24) & 112, 0);
            boolean zChangedInstance2 = composer2.changedInstance(channel) | ((i5 & 14) == 4) | ((i5 & 112) == 32) | ((i5 & 458752) == 131072 || ((i5 & 262144) != 0 && composer2.changedInstance(ref))) | composer2.changedInstance(animatable) | composer2.changedInstance(animationSpec);
            if ((i5 & 29360128) != 8388608) {
                z = false;
            }
            boolean z2 = zChangedInstance2 | z;
            Object objRememberedValue8 = composer2.rememberedValue();
            if (z2 || objRememberedValue8 == companion.getEmpty()) {
                LateMotionLayout3 lateMotionLayout3 = new LateMotionLayout3(channel, snapshotIntState2, snapshotState, snapshotState2, ref, animatable, animationSpec, function0, null);
                channel2 = channel;
                composer2.updateRememberedValue(lateMotionLayout3);
                objRememberedValue8 = lateMotionLayout3;
            } else {
                channel2 = channel;
            }
            EffectsKt.LaunchedEffect(channel2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composer2, (i5 >> 9) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            channel2 = channel;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt.LateMotionLayout.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    LateMotionLayout.LateMotionLayout(snapshotState, snapshotState2, animationSpec, channel2, snapshotState4, ref, i, function0, modifier, function2, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    private static final MeasurePolicy lateMotionLayoutMeasurePolicy(final Function0<? extends ConstraintSet> function0, final Function0<? extends ConstraintSet> function02, final SnapshotState4<Unit> snapshotState4, final Ref<CompositionSource> ref, final SnapshotState4<Float> snapshotState42, final MotionMeasurer motionMeasurer, final int i) {
        return new MeasurePolicy() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt.lateMotionLayoutMeasurePolicy.1
            @Override // androidx.compose.p011ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                snapshotState4.getValue();
                MotionMeasurer motionMeasurer2 = motionMeasurer;
                LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                ConstraintSet constraintSetInvoke = function0.invoke();
                ConstraintSet constraintSetInvoke2 = function02.invoke();
                TransitionImpl eMPTY$constraintlayout_compose_release = TransitionImpl.INSTANCE.getEMPTY$constraintlayout_compose_release();
                int i2 = i;
                float fFloatValue = snapshotState42.getValue().floatValue();
                CompositionSource value = ref.getValue();
                if (value == null) {
                    value = CompositionSource.Unknown;
                }
                long jM8179performInterpolationMeasureLzAeyeM = motionMeasurer2.m8179performInterpolationMeasureLzAeyeM(j, layoutDirection, constraintSetInvoke, constraintSetInvoke2, eMPTY$constraintlayout_compose_release, list, linkedHashMap, i2, fFloatValue, value, null);
                ref.setValue(CompositionSource.Unknown);
                int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8179performInterpolationMeasureLzAeyeM);
                int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8179performInterpolationMeasureLzAeyeM);
                final MotionMeasurer motionMeasurer3 = motionMeasurer;
                return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt.lateMotionLayoutMeasurePolicy.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        motionMeasurer3.performLayout(placementScope, list, linkedHashMap);
                    }
                }, 4, null);
            }
        };
    }
}
