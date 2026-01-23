package dev.chrisbanes.snapper;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationState2;
import androidx.compose.animation.core.AnimationState3;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec3;
import androidx.compose.animation.core.SuspendAnimation;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableState4;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: SnapperFlingBehavior.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001B\u007f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012<\u0010\u000f\u001a8\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bo\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012>\b\u0002\u0010\u000f\u001a8\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0012\u0010\u0014J'\u0010\u0018\u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001e\u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010 \u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!JR\u0010'\u001a\u00020\u001c*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\n2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00050\u0010H\u0002¢\u0006\u0004\b'\u0010(J)\u0010*\u001a\u00020\u001c*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010)\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001aH\u0002¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104RJ\u0010\u000f\u001a8\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00105R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00106R/\u0010>\u001a\u0004\u0018\u00010\n2\b\u00107\u001a\u0004\u0018\u00010\n8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, m3636d2 = {"Ldev/chrisbanes/snapper/SnapperFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "layoutInfo", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "springAnimationSpec", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "snapIndex", "Lkotlin/Function1;", "maximumFlingDistance", "<init>", "(Ldev/chrisbanes/snapper/SnapperLayoutInfo;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "(Ldev/chrisbanes/snapper/SnapperLayoutInfo;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function3;)V", "Landroidx/compose/foundation/gestures/ScrollScope;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "initialVelocity", "flingToIndex", "(Landroidx/compose/foundation/gestures/ScrollScope;IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", "initialItem", "", "flingThenSpring", "performDecayFling", "(Landroidx/compose/foundation/gestures/ScrollScope;Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;IFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performSpringFling", "(Landroidx/compose/foundation/gestures/ScrollScope;Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationScope;", "Landroidx/compose/animation/core/AnimationVector1D;", "currentItem", "pixels", "scrollBy", "performSnapBackIfNeeded", "(Landroidx/compose/animation/core/AnimationScope;Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;ILkotlin/jvm/functions/Function1;)Z", "velocity", "canDecayBeyondCurrentItem", "(Landroidx/compose/animation/core/DecayAnimationSpec;FLdev/chrisbanes/snapper/SnapperLayoutItemInfo;)Z", "calculateSnapBack", "(FLdev/chrisbanes/snapper/SnapperLayoutItemInfo;I)I", "consumeVelocityIfNotAtScrollEdge", "(F)F", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "Landroidx/compose/animation/core/AnimationSpec;", "Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function1;", "<set-?>", "animationTarget$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimationTarget", "()Ljava/lang/Integer;", "setAnimationTarget", "(Ljava/lang/Integer;)V", "animationTarget", "lib_release"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SnapperFlingBehavior implements FlingBehavior {

    /* renamed from: animationTarget$delegate, reason: from kotlin metadata */
    private final SnapshotState animationTarget;
    private final DecayAnimationSpec<Float> decayAnimationSpec;
    private final SnapperLayoutInfo layoutInfo;
    private final Function1<SnapperLayoutInfo, Float> maximumFlingDistance;
    private final Function3<SnapperLayoutInfo, Integer, Integer, Integer> snapIndex;
    private final AnimationSpec<Float> springAnimationSpec;

    /* compiled from: SnapperFlingBehavior.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "dev.chrisbanes.snapper.SnapperFlingBehavior", m3645f = "SnapperFlingBehavior.kt", m3646l = {406, 416}, m3647m = "flingToIndex")
    /* renamed from: dev.chrisbanes.snapper.SnapperFlingBehavior$flingToIndex$1 */
    static final class C446421 extends ContinuationImpl {
        float F$0;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C446421(Continuation<? super C446421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapperFlingBehavior.this.flingToIndex(null, 0, 0.0f, this);
        }
    }

    /* compiled from: SnapperFlingBehavior.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "dev.chrisbanes.snapper.SnapperFlingBehavior", m3645f = "SnapperFlingBehavior.kt", m3646l = {477}, m3647m = "performDecayFling")
    /* renamed from: dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$1 */
    static final class C446431 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C446431(Continuation<? super C446431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapperFlingBehavior.this.performDecayFling(null, null, 0, 0.0f, false, this);
        }
    }

    /* compiled from: SnapperFlingBehavior.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "dev.chrisbanes.snapper.SnapperFlingBehavior", m3645f = "SnapperFlingBehavior.kt", m3646l = {551}, m3647m = "performSpringFling")
    /* renamed from: dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$1 */
    static final class C446451 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C446451(Continuation<? super C446451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapperFlingBehavior.this.performSpringFling(null, null, 0, 0.0f, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SnapperFlingBehavior(SnapperLayoutInfo snapperLayoutInfo, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Function3<? super SnapperLayoutInfo, ? super Integer, ? super Integer, Integer> function3, Function1<? super SnapperLayoutInfo, Float> function1) {
        this.layoutInfo = snapperLayoutInfo;
        this.decayAnimationSpec = decayAnimationSpec;
        this.springAnimationSpec = animationSpec;
        this.snapIndex = function3;
        this.maximumFlingDistance = function1;
        this.animationTarget = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SnapperFlingBehavior(SnapperLayoutInfo layoutInfo, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> springAnimationSpec, Function3<? super SnapperLayoutInfo, ? super Integer, ? super Integer, Integer> snapIndex) {
        this(layoutInfo, decayAnimationSpec, springAnimationSpec, snapIndex, SnapperFlingBehaviorDefaults.INSTANCE.getMaximumFlingDistance());
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(springAnimationSpec, "springAnimationSpec");
        Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
    }

    private final void setAnimationTarget(Integer num) {
        this.animationTarget.setValue(num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getAnimationTarget() {
        return (Integer) this.animationTarget.getValue();
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public Object performFling(ScrollableState4 scrollableState4, float f, Continuation<? super Float> continuation) {
        if (!this.layoutInfo.canScrollTowardsStart() || !this.layoutInfo.canScrollTowardsEnd()) {
            return boxing.boxFloat(f);
        }
        SnapperLog snapperLog = SnapperLog.INSTANCE;
        float fFloatValue = this.maximumFlingDistance.invoke(this.layoutInfo).floatValue();
        if (fFloatValue <= 0.0f) {
            throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0");
        }
        SnapperLayoutItemInfo currentItem = this.layoutInfo.getCurrentItem();
        if (currentItem == null) {
            return boxing.boxFloat(f);
        }
        int iIntValue = this.snapIndex.invoke(this.layoutInfo, boxing.boxInt(f < 0.0f ? currentItem.getIndex() + 1 : currentItem.getIndex()), boxing.boxInt(this.layoutInfo.determineTargetIndex(f, this.decayAnimationSpec, fFloatValue))).intValue();
        if (iIntValue < 0 || iIntValue >= this.layoutInfo.getTotalItemsCount()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return flingToIndex(scrollableState4, iIntValue, f, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object flingToIndex(ScrollableState4 scrollableState4, int i, float f, Continuation<? super Float> continuation) throws Throwable {
        C446421 c446421;
        float fFloatValue;
        C446421 c4464212;
        SnapperFlingBehavior snapperFlingBehavior;
        SnapperLayoutItemInfo currentItem;
        SnapperFlingBehavior snapperFlingBehavior2;
        if (continuation instanceof C446421) {
            c446421 = (C446421) continuation;
            int i2 = c446421.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c446421.label = i2 - Integer.MIN_VALUE;
            } else {
                c446421 = new C446421(continuation);
            }
        }
        C446421 c4464213 = c446421;
        Object objPerformDecayFling$default = c4464213.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c4464213.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objPerformDecayFling$default);
            SnapperLayoutItemInfo currentItem2 = this.layoutInfo.getCurrentItem();
            if (currentItem2 == null) {
                return boxing.boxFloat(f);
            }
            if (currentItem2.getIndex() == i && this.layoutInfo.distanceToIndexSnap(currentItem2.getIndex()) == 0) {
                SnapperLog snapperLog = SnapperLog.INSTANCE;
                return boxing.boxFloat(consumeVelocityIfNotAtScrollEdge(f));
            }
            if (canDecayBeyondCurrentItem(this.decayAnimationSpec, f, currentItem2)) {
                c4464213.L$0 = this;
                c4464213.L$1 = scrollableState4;
                c4464213.I$0 = i;
                c4464213.F$0 = f;
                c4464213.label = 1;
                c4464212 = c4464213;
                objPerformDecayFling$default = performDecayFling$default(this, scrollableState4, currentItem2, i, f, false, c4464212, 8, null);
                if (objPerformDecayFling$default != coroutine_suspended) {
                    snapperFlingBehavior = this;
                    scrollableState4 = scrollableState4;
                    i = i;
                    f = f;
                }
                return coroutine_suspended;
            }
            fFloatValue = f;
            c4464212 = c4464213;
            snapperFlingBehavior = this;
            ScrollableState4 scrollableState42 = scrollableState4;
            int i4 = i;
            currentItem = snapperFlingBehavior.layoutInfo.getCurrentItem();
            if (currentItem != null) {
                return boxing.boxFloat(f);
            }
            if (currentItem.getIndex() != i4 || snapperFlingBehavior.layoutInfo.distanceToIndexSnap(i4) != 0) {
                c4464212.L$0 = snapperFlingBehavior;
                c4464212.L$1 = null;
                c4464212.label = 2;
                objPerformDecayFling$default = snapperFlingBehavior.performSpringFling(scrollableState42, currentItem, i4, fFloatValue, c4464212);
                if (objPerformDecayFling$default != coroutine_suspended) {
                    snapperFlingBehavior2 = snapperFlingBehavior;
                    fFloatValue = ((Number) objPerformDecayFling$default).floatValue();
                    snapperFlingBehavior = snapperFlingBehavior2;
                }
                return coroutine_suspended;
            }
            return boxing.boxFloat(snapperFlingBehavior.consumeVelocityIfNotAtScrollEdge(fFloatValue));
        }
        if (i3 != 1) {
            if (i3 == 2) {
                snapperFlingBehavior2 = (SnapperFlingBehavior) c4464213.L$0;
                ResultKt.throwOnFailure(objPerformDecayFling$default);
                fFloatValue = ((Number) objPerformDecayFling$default).floatValue();
                snapperFlingBehavior = snapperFlingBehavior2;
                return boxing.boxFloat(snapperFlingBehavior.consumeVelocityIfNotAtScrollEdge(fFloatValue));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f = c4464213.F$0;
        i = c4464213.I$0;
        scrollableState4 = (ScrollableState4) c4464213.L$1;
        snapperFlingBehavior = (SnapperFlingBehavior) c4464213.L$0;
        ResultKt.throwOnFailure(objPerformDecayFling$default);
        c4464212 = c4464213;
        fFloatValue = ((Number) objPerformDecayFling$default).floatValue();
        ScrollableState4 scrollableState422 = scrollableState4;
        int i42 = i;
        currentItem = snapperFlingBehavior.layoutInfo.getCurrentItem();
        if (currentItem != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performDecayFling(final ScrollableState4 scrollableState4, SnapperLayoutItemInfo snapperLayoutItemInfo, final int i, float f, boolean z, Continuation<? super Float> continuation) throws Throwable {
        C446431 c446431;
        Integer num;
        AnimationState animationStateAnimationState$default;
        DecayAnimationSpec<Float> decayAnimationSpec;
        Function1<AnimationState2<Float, AnimationVectors2>, Unit> function1;
        Ref.FloatRef floatRef;
        SnapperFlingBehavior snapperFlingBehavior;
        final SnapperFlingBehavior snapperFlingBehavior2 = this;
        if (continuation instanceof C446431) {
            c446431 = (C446431) continuation;
            int i2 = c446431.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c446431.label = i2 - Integer.MIN_VALUE;
            } else {
                c446431 = snapperFlingBehavior2.new C446431(continuation);
            }
        }
        C446431 c4464312 = c446431;
        Object obj = c4464312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c4464312.label;
        if (i3 != 0) {
            if (i3 == 1) {
                floatRef = (Ref.FloatRef) c4464312.L$1;
                SnapperFlingBehavior snapperFlingBehavior3 = (SnapperFlingBehavior) c4464312.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    num = null;
                    snapperFlingBehavior = snapperFlingBehavior3;
                    snapperFlingBehavior.setAnimationTarget(num);
                    SnapperLog snapperLog = SnapperLog.INSTANCE;
                    return boxing.boxFloat(floatRef.element);
                } catch (Throwable th) {
                    th = th;
                    num = null;
                    snapperFlingBehavior2 = snapperFlingBehavior3;
                    snapperFlingBehavior2.setAnimationTarget(num);
                    throw th;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (snapperLayoutItemInfo.getIndex() == i && snapperFlingBehavior2.layoutInfo.distanceToIndexSnap(snapperLayoutItemInfo.getIndex()) == 0) {
            SnapperLog snapperLog2 = SnapperLog.INSTANCE;
            return boxing.boxFloat(snapperFlingBehavior2.consumeVelocityIfNotAtScrollEdge(f));
        }
        SnapperLog snapperLog3 = SnapperLog.INSTANCE;
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        floatRef2.element = f;
        final Ref.FloatRef floatRef3 = new Ref.FloatRef();
        boolean z2 = z && Math.abs(i - snapperLayoutItemInfo.getIndex()) >= 2;
        try {
            snapperFlingBehavior2.setAnimationTarget(boxing.boxInt(i));
            animationStateAnimationState$default = AnimationState3.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
            decayAnimationSpec = snapperFlingBehavior2.decayAnimationSpec;
            num = null;
            final boolean z3 = z2;
            try {
                function1 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: dev.chrisbanes.snapper.SnapperFlingBehavior.performDecayFling.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationState2<Float, AnimationVectors2> animationState2) {
                        invoke2(animationState2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AnimationState2<Float, AnimationVectors2> animateDecay) {
                        Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
                        float fFloatValue = animateDecay.getValue().floatValue() - floatRef3.element;
                        float fScrollBy = scrollableState4.scrollBy(fFloatValue);
                        floatRef3.element = animateDecay.getValue().floatValue();
                        floatRef2.element = animateDecay.getVelocity().floatValue();
                        if (Math.abs(fFloatValue - fScrollBy) > 0.5f) {
                            animateDecay.cancelAnimation();
                        }
                        SnapperLayoutItemInfo currentItem = snapperFlingBehavior2.layoutInfo.getCurrentItem();
                        if (currentItem == null) {
                            animateDecay.cancelAnimation();
                            return;
                        }
                        if (animateDecay.isRunning() && z3) {
                            if (animateDecay.getVelocity().floatValue() > 0.0f && currentItem.getIndex() == i - 1) {
                                animateDecay.cancelAnimation();
                            } else if (animateDecay.getVelocity().floatValue() < 0.0f && currentItem.getIndex() == i) {
                                animateDecay.cancelAnimation();
                            }
                        }
                        if (animateDecay.isRunning() && snapperFlingBehavior2.performSnapBackIfNeeded(animateDecay, currentItem, i, new AnonymousClass1(scrollableState4))) {
                            animateDecay.cancelAnimation();
                        }
                    }

                    /* compiled from: SnapperFlingBehavior.kt */
                    @Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
                    /* renamed from: dev.chrisbanes.snapper.SnapperFlingBehavior$performDecayFling$4$1, reason: invalid class name */
                    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Float, Float> {
                        AnonymousClass1(Object obj) {
                            super(1, obj, ScrollableState4.class, "scrollBy", "scrollBy(F)F", 0);
                        }

                        public final Float invoke(float f) {
                            return Float.valueOf(((ScrollableState4) this.receiver).scrollBy(f));
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f) {
                            return invoke(f.floatValue());
                        }
                    }
                };
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            num = null;
        }
        try {
            c4464312.L$0 = snapperFlingBehavior2;
            c4464312.L$1 = floatRef2;
            c4464312.label = 1;
            if (SuspendAnimation.animateDecay$default(animationStateAnimationState$default, decayAnimationSpec, false, function1, c4464312, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
            snapperFlingBehavior = snapperFlingBehavior2;
            snapperFlingBehavior.setAnimationTarget(num);
            SnapperLog snapperLog4 = SnapperLog.INSTANCE;
            return boxing.boxFloat(floatRef.element);
        } catch (Throwable th4) {
            th = th4;
            snapperFlingBehavior2 = snapperFlingBehavior2;
            snapperFlingBehavior2.setAnimationTarget(num);
            throw th;
        }
    }

    static /* synthetic */ Object performDecayFling$default(SnapperFlingBehavior snapperFlingBehavior, ScrollableState4 scrollableState4, SnapperLayoutItemInfo snapperLayoutItemInfo, int i, float f, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        return snapperFlingBehavior.performDecayFling(scrollableState4, snapperLayoutItemInfo, i, f, z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performSpringFling(final ScrollableState4 scrollableState4, SnapperLayoutItemInfo snapperLayoutItemInfo, final int i, float f, Continuation<? super Float> continuation) throws Throwable {
        C446451 c446451;
        Ref.FloatRef floatRef;
        SnapperFlingBehavior snapperFlingBehavior;
        final SnapperFlingBehavior snapperFlingBehavior2 = this;
        if (continuation instanceof C446451) {
            c446451 = (C446451) continuation;
            int i2 = c446451.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c446451.label = i2 - Integer.MIN_VALUE;
            } else {
                c446451 = snapperFlingBehavior2.new C446451(continuation);
            }
        }
        C446451 c4464512 = c446451;
        Object obj = c4464512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c4464512.label;
        if (i3 != 0) {
            if (i3 == 1) {
                floatRef = (Ref.FloatRef) c4464512.L$1;
                SnapperFlingBehavior snapperFlingBehavior3 = (SnapperFlingBehavior) c4464512.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    snapperFlingBehavior = snapperFlingBehavior3;
                    snapperFlingBehavior.setAnimationTarget(null);
                    SnapperLog snapperLog = SnapperLog.INSTANCE;
                    return boxing.boxFloat(floatRef.element);
                } catch (Throwable th) {
                    th = th;
                    snapperFlingBehavior2 = snapperFlingBehavior3;
                    snapperFlingBehavior2.setAnimationTarget(null);
                    throw th;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SnapperLog snapperLog2 = SnapperLog.INSTANCE;
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        float f2 = 0.0f;
        if ((i > snapperLayoutItemInfo.getIndex() && f > 0.0f) || (i <= snapperLayoutItemInfo.getIndex() && f < 0.0f)) {
            f2 = f;
        }
        floatRef2.element = f2;
        final Ref.FloatRef floatRef3 = new Ref.FloatRef();
        try {
            snapperFlingBehavior2.setAnimationTarget(boxing.boxInt(i));
            AnimationState animationStateAnimationState$default = AnimationState3.AnimationState$default(floatRef3.element, floatRef2.element, 0L, 0L, false, 28, null);
            Float fBoxFloat = boxing.boxFloat(snapperFlingBehavior2.layoutInfo.distanceToIndexSnap(i));
            AnimationSpec<Float> animationSpec = snapperFlingBehavior2.springAnimationSpec;
            Function1<AnimationState2<Float, AnimationVectors2>, Unit> function1 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: dev.chrisbanes.snapper.SnapperFlingBehavior.performSpringFling.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationState2<Float, AnimationVectors2> animationState2) {
                    invoke2(animationState2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationState2<Float, AnimationVectors2> animateTo) {
                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                    float fFloatValue = animateTo.getValue().floatValue() - floatRef3.element;
                    float fScrollBy = scrollableState4.scrollBy(fFloatValue);
                    floatRef3.element = animateTo.getValue().floatValue();
                    floatRef2.element = animateTo.getVelocity().floatValue();
                    SnapperLayoutItemInfo currentItem = snapperFlingBehavior2.layoutInfo.getCurrentItem();
                    if (currentItem != null) {
                        if (snapperFlingBehavior2.performSnapBackIfNeeded(animateTo, currentItem, i, new AnonymousClass1(scrollableState4))) {
                            animateTo.cancelAnimation();
                            return;
                        } else {
                            if (Math.abs(fFloatValue - fScrollBy) > 0.5f) {
                                animateTo.cancelAnimation();
                                return;
                            }
                            return;
                        }
                    }
                    animateTo.cancelAnimation();
                }

                /* compiled from: SnapperFlingBehavior.kt */
                @Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
                /* renamed from: dev.chrisbanes.snapper.SnapperFlingBehavior$performSpringFling$3$1, reason: invalid class name */
                /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Float, Float> {
                    AnonymousClass1(Object obj) {
                        super(1, obj, ScrollableState4.class, "scrollBy", "scrollBy(F)F", 0);
                    }

                    public final Float invoke(float f) {
                        return Float.valueOf(((ScrollableState4) this.receiver).scrollBy(f));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Float invoke(Float f) {
                        return invoke(f.floatValue());
                    }
                }
            };
            floatRef = floatRef2;
            try {
                c4464512.L$0 = snapperFlingBehavior2;
                c4464512.L$1 = floatRef;
                c4464512.label = 1;
                if (SuspendAnimation.animateTo$default(animationStateAnimationState$default, fBoxFloat, animationSpec, false, function1, c4464512, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                snapperFlingBehavior = snapperFlingBehavior2;
                snapperFlingBehavior.setAnimationTarget(null);
                SnapperLog snapperLog3 = SnapperLog.INSTANCE;
                return boxing.boxFloat(floatRef.element);
            } catch (Throwable th2) {
                th = th2;
                snapperFlingBehavior2 = snapperFlingBehavior2;
                snapperFlingBehavior2.setAnimationTarget(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean performSnapBackIfNeeded(AnimationState2<Float, AnimationVectors2> animationState2, SnapperLayoutItemInfo snapperLayoutItemInfo, int i, Function1<? super Float, Float> function1) {
        SnapperLog snapperLog = SnapperLog.INSTANCE;
        int iCalculateSnapBack = calculateSnapBack(animationState2.getVelocity().floatValue(), snapperLayoutItemInfo, i);
        if (iCalculateSnapBack == 0) {
            return false;
        }
        function1.invoke(Float.valueOf(iCalculateSnapBack));
        return true;
    }

    private final boolean canDecayBeyondCurrentItem(DecayAnimationSpec<Float> decayAnimationSpec, float f, SnapperLayoutItemInfo snapperLayoutItemInfo) {
        if (Math.abs(f) < 0.5f) {
            return false;
        }
        float fCalculateTargetValue = DecayAnimationSpec3.calculateTargetValue(decayAnimationSpec, 0.0f, f);
        SnapperLog snapperLog = SnapperLog.INSTANCE;
        return f < 0.0f ? fCalculateTargetValue <= ((float) this.layoutInfo.distanceToIndexSnap(snapperLayoutItemInfo.getIndex())) : fCalculateTargetValue >= ((float) this.layoutInfo.distanceToIndexSnap(snapperLayoutItemInfo.getIndex() + 1));
    }

    private final int calculateSnapBack(float initialVelocity, SnapperLayoutItemInfo currentItem, int targetIndex) {
        if (initialVelocity > 0.0f && currentItem.getIndex() >= targetIndex) {
            return this.layoutInfo.distanceToIndexSnap(currentItem.getIndex());
        }
        if (initialVelocity >= 0.0f || currentItem.getIndex() > targetIndex - 1) {
            return 0;
        }
        return this.layoutInfo.distanceToIndexSnap(currentItem.getIndex() + 1);
    }

    private final float consumeVelocityIfNotAtScrollEdge(float velocity) {
        if ((velocity >= 0.0f || this.layoutInfo.canScrollTowardsStart()) && (velocity <= 0.0f || this.layoutInfo.canScrollTowardsEnd())) {
            return 0.0f;
        }
        return velocity;
    }
}
