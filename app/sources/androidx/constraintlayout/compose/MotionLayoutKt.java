package androidx.constraintlayout.compose;

import android.os.Build;
import android.view.View;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.snapshots.Snapshot;
import com.robinhood.android.navigation.compose.NavTransition2;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MotionLayout.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a \u0001\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u0019¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001ac\u0010(\u001a\u00020'2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u001f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\"2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b(\u0010)\u001a!\u0010*\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010,\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b,\u0010-\u001a;\u0010/\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010&\u001a\u00020%2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0001¢\u0006\u0004\b/\u00100¨\u00062²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Landroidx/constraintlayout/compose/ConstraintSet;", "start", "end", "Landroidx/constraintlayout/compose/Transition;", NavTransition2.KEY_TRANSITION, "", "progress", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "informationReceiver", "", "optimizationLevel", "", "showBounds", "showPaths", "showKeyPositions", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/runtime/MutableState;", "", "contentTracker", "Landroidx/compose/ui/node/Ref;", "Landroidx/constraintlayout/compose/CompositionSource;", "compositionSource", "Landroidx/constraintlayout/compose/InvalidationStrategy;", "invalidationStrategy", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/MotionLayoutScope;", "Lkotlin/ExtensionFunctionType;", "content", "MotionLayoutCore", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;FLandroidx/constraintlayout/compose/LayoutInformationReceiver;IZZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/node/Ref;Landroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/State;", "constraintSetStart", "constraintSetEnd", "Landroidx/constraintlayout/compose/TransitionImpl;", "Landroidx/compose/runtime/MutableFloatState;", "motionProgress", "Landroidx/constraintlayout/compose/MotionMeasurer;", "measurer", "Landroidx/compose/ui/layout/MeasurePolicy;", "motionLayoutMeasurePolicy", "(Landroidx/compose/runtime/State;Landroidx/compose/ui/node/Ref;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/TransitionImpl;Landroidx/compose/runtime/MutableFloatState;Landroidx/constraintlayout/compose/MotionMeasurer;ILandroidx/constraintlayout/compose/InvalidationStrategy;)Landroidx/compose/ui/layout/MeasurePolicy;", "UpdateWithForcedIfNoUserChange", "(Landroidx/compose/runtime/MutableFloatState;Landroidx/constraintlayout/compose/LayoutInformationReceiver;Landroidx/compose/runtime/Composer;I)V", "createAndUpdateMotionProgress", "(FLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/MutableFloatState;", "scaleFactor", "motionDebug", "(Landroidx/compose/ui/Modifier;Landroidx/constraintlayout/compose/MotionMeasurer;FZZZ)Landroidx/compose/ui/Modifier;", "animateToEnd", "constraintlayout-compose_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MotionLayoutKt {
    @PublishedApi
    public static final void MotionLayoutCore(final ConstraintSet constraintSet, final ConstraintSet constraintSet2, final Transition transition, final float f, final LayoutInformationReceiver layoutInformationReceiver, final int i, final boolean z, final boolean z2, final boolean z3, final Modifier modifier, final SnapshotState<Unit> snapshotState, final Ref<CompositionSource> ref, final InvalidationStrategy invalidationStrategy, final Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        ConstraintSet constraintSet3;
        int i5;
        int i6;
        TransitionImpl transitionImpl;
        Composer composer2;
        boolean z4;
        boolean z5;
        boolean z6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-657259923);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(constraintSet) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            constraintSet3 = constraintSet2;
            i4 |= composerStartRestartGroup.changed(constraintSet3) ? 32 : 16;
        } else {
            constraintSet3 = constraintSet2;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(transition) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= (32768 & i2) == 0 ? composerStartRestartGroup.changed(layoutInformationReceiver) : composerStartRestartGroup.changedInstance(layoutInformationReceiver) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 = i;
            i4 |= composerStartRestartGroup.changed(i5) ? 131072 : 65536;
        } else {
            i5 = i;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (composerStartRestartGroup.changed(snapshotState) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= (i3 & 64) == 0 ? composerStartRestartGroup.changed(ref) : composerStartRestartGroup.changedInstance(ref) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(invalidationStrategy) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        int i7 = i6;
        if ((i4 & 306783379) != 306783378 || (i7 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-657259923, i4, i7, "androidx.constraintlayout.compose.MotionLayoutCore (MotionLayout.kt:577)");
            }
            int i8 = i4 >> 9;
            SnapshotFloatState2 snapshotFloatState2CreateAndUpdateMotionProgress = createAndUpdateMotionProgress(f, composerStartRestartGroup, i8 & 14);
            TransitionImpl eMPTY$constraintlayout_compose_release = transition instanceof TransitionImpl ? (TransitionImpl) transition : null;
            if (eMPTY$constraintlayout_compose_release == null) {
                eMPTY$constraintlayout_compose_release = TransitionImpl.INSTANCE.getEMPTY$constraintlayout_compose_release();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotLongState3.mutableLongStateOf(0L);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotLongState2 snapshotLongState2 = (SnapshotLongState2) objRememberedValue;
            snapshotLongState2.getLongValue();
            if (layoutInformationReceiver != null) {
                layoutInformationReceiver.setUpdateFlag(snapshotLongState2);
            }
            UpdateWithForcedIfNoUserChange(snapshotFloatState2CreateAndUpdateMotionProgress, layoutInformationReceiver, composerStartRestartGroup, i8 & 112);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new MotionMeasurer(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new MotionLayoutScope(motionMeasurer, snapshotFloatState2CreateAndUpdateMotionProgress);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue3;
            boolean z7 = ((i4 & 14) == 4) | ((i4 & 112) == 32) | ((i4 & 896) == 256);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z7 || objRememberedValue4 == companion.getEmpty()) {
                transitionImpl = eMPTY$constraintlayout_compose_release;
                motionMeasurer.initWith(constraintSet, constraintSet3, layoutDirection, transitionImpl, snapshotFloatState2CreateAndUpdateMotionProgress.getFloatValue());
                objRememberedValue4 = Boolean.TRUE;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                transitionImpl = eMPTY$constraintlayout_compose_release;
            }
            ((Boolean) objRememberedValue4).getClass();
            composerStartRestartGroup.startReplaceGroup(-487863565);
            if (invalidationStrategy.getOnObservedStateChange() != null) {
                Snapshot.Companion companion2 = Snapshot.INSTANCE;
                boolean z8 = ((i7 & 14) == 4) | ((i7 & 112) == 32 || ((i7 & 64) != 0 && composerStartRestartGroup.changedInstance(ref)));
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z8 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1<Object, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                            invoke2(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Object obj) {
                            snapshotState.setValue(Unit.INSTANCE);
                            if (ref.getValue() == CompositionSource.Unknown) {
                                ref.setValue(CompositionSource.Content);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Snapshot.Companion.observe$default(companion2, (Function1) objRememberedValue5, null, invalidationStrategy.getOnObservedStateChange(), 2, null);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            MeasurePolicy measurePolicyMotionLayoutMeasurePolicy = motionLayoutMeasurePolicy(snapshotState, ref, constraintSet, constraintSet2, transitionImpl, snapshotFloatState2CreateAndUpdateMotionProgress, motionMeasurer, i5, invalidationStrategy);
            motionMeasurer.addLayoutInformationReceiver(layoutInformationReceiver);
            MotionLayoutDebugFlags forcedDrawDebug = layoutInformationReceiver != null ? layoutInformationReceiver.getForcedDrawDebug() : null;
            float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
            if (forcedDrawDebug == null || forcedDrawDebug == MotionLayoutDebugFlags.UNKNOWN) {
                z4 = z;
                z5 = z2;
                z6 = z3;
            } else {
                z4 = forcedDrawDebug == MotionLayoutDebugFlags.SHOW_ALL;
                z5 = z4;
                z6 = z5;
            }
            composer2.startReplaceGroup(-487805395);
            boolean z9 = Build.VERSION.SDK_INT >= 30 && Api30Impl.isShowingLayoutBounds((View) composer2.consume(AndroidCompositionLocals_androidKt.getLocalView()));
            composer2.endReplaceGroup();
            Modifier modifierMotionPointerInput = MotionDragHandler.motionPointerInput(motionDebug(modifier, motionMeasurer, forcedScaleFactor, z9 ? true : z4, z5, z6), transition == null ? TransitionImpl.INSTANCE.getEMPTY$constraintlayout_compose_release() : transition, snapshotFloatState2CreateAndUpdateMotionProgress, motionMeasurer);
            boolean zChangedInstance = composer2.changedInstance(motionMeasurer);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$9$1
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
                composer2.updateRememberedValue(objRememberedValue6);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierMotionPointerInput, false, (Function1) objRememberedValue6, 1, null), ComposableLambda3.rememberComposableLambda(1008059664, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.10
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

                public final void invoke(Composer composer3, int i9) {
                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1008059664, i9, -1, "androidx.constraintlayout.compose.MotionLayoutCore.<anonymous> (MotionLayout.kt:677)");
                    }
                    function3.invoke(motionLayoutScope, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), measurePolicyMotionLayoutMeasurePolicy, composer2, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.11
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

                public final void invoke(Composer composer3, int i9) {
                    MotionLayoutKt.MotionLayoutCore(constraintSet, constraintSet2, transition, f, layoutInformationReceiver, i, z, z2, z3, modifier, snapshotState, ref, invalidationStrategy, function3, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3));
                }
            });
        }
    }

    public static final MeasurePolicy motionLayoutMeasurePolicy(final SnapshotState4<Unit> snapshotState4, final Ref<CompositionSource> ref, final ConstraintSet constraintSet, final ConstraintSet constraintSet2, final TransitionImpl transitionImpl, final SnapshotFloatState2 snapshotFloatState2, final MotionMeasurer motionMeasurer, final int i, final InvalidationStrategy invalidationStrategy) {
        return new MeasurePolicy() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.motionLayoutMeasurePolicy.1
            @Override // androidx.compose.p011ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                snapshotState4.getValue();
                MotionMeasurer motionMeasurer2 = motionMeasurer;
                LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                ConstraintSet constraintSet3 = constraintSet;
                ConstraintSet constraintSet4 = constraintSet2;
                TransitionImpl transitionImpl2 = transitionImpl;
                int i2 = i;
                float floatValue = snapshotFloatState2.getFloatValue();
                CompositionSource value = ref.getValue();
                if (value == null) {
                    value = CompositionSource.Unknown;
                }
                long jM8179performInterpolationMeasureLzAeyeM = motionMeasurer2.m8179performInterpolationMeasureLzAeyeM(j, layoutDirection, constraintSet3, constraintSet4, transitionImpl2, list, linkedHashMap, i2, floatValue, value, invalidationStrategy.getShouldInvalidate());
                ref.setValue(CompositionSource.Unknown);
                int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8179performInterpolationMeasureLzAeyeM);
                int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8179performInterpolationMeasureLzAeyeM);
                final MotionMeasurer motionMeasurer3 = motionMeasurer;
                return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.motionLayoutMeasurePolicy.1.1
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

    public static final void UpdateWithForcedIfNoUserChange(final SnapshotFloatState2 snapshotFloatState2, final LayoutInformationReceiver layoutInformationReceiver, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1501096015);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(snapshotFloatState2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(layoutInformationReceiver) : composerStartRestartGroup.changedInstance(layoutInformationReceiver) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501096015, i2, -1, "androidx.constraintlayout.compose.UpdateWithForcedIfNoUserChange (MotionLayout.kt:1019)");
            }
            if (layoutInformationReceiver == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.UpdateWithForcedIfNoUserChange.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i3) {
                            MotionLayoutKt.UpdateWithForcedIfNoUserChange(snapshotFloatState2, layoutInformationReceiver, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                        }
                    });
                    return;
                }
                return;
            }
            float floatValue = snapshotFloatState2.getFloatValue();
            float forcedProgress = layoutInformationReceiver.getForcedProgress();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(Float.valueOf(floatValue));
                composerStartRestartGroup.updateRememberedValue(ref);
                obj = ref;
            }
            Ref ref2 = (Ref) obj;
            if (!Float.isNaN(forcedProgress) && Intrinsics.areEqual((Float) ref2.getValue(), floatValue)) {
                snapshotFloatState2.setFloatValue(forcedProgress);
            } else {
                layoutInformationReceiver.resetForcedProgress();
            }
            ref2.setValue(Float.valueOf(floatValue));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.UpdateWithForcedIfNoUserChange.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    MotionLayoutKt.UpdateWithForcedIfNoUserChange(snapshotFloatState2, layoutInformationReceiver, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final SnapshotFloatState2 createAndUpdateMotionProgress(float f, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1721363510, i, -1, "androidx.constraintlayout.compose.createAndUpdateMotionProgress (MotionLayout.kt:1046)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(f);
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        Object obj = objRememberedValue2;
        if (objRememberedValue2 == companion.getEmpty()) {
            Ref.FloatRef floatRef = new Ref.FloatRef();
            floatRef.element = f;
            composer.updateRememberedValue(floatRef);
            obj = floatRef;
        }
        Ref.FloatRef floatRef2 = (Ref.FloatRef) obj;
        if (floatRef2.element != f) {
            floatRef2.element = f;
            snapshotFloatState2.setFloatValue(f);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return snapshotFloatState2;
    }

    public static final Modifier motionDebug(Modifier modifier, final MotionMeasurer motionMeasurer, float f, final boolean z, final boolean z2, final boolean z3) {
        if (!Float.isNaN(f)) {
            modifier = Scale2.scale(modifier, f);
        }
        return (z || z3 || z2) ? DrawModifierKt.drawBehind(modifier, new Function1<DrawScope, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.motionDebug.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                motionMeasurer.drawDebug(drawScope, z, z2, z3);
            }
        }) : modifier;
    }
}
