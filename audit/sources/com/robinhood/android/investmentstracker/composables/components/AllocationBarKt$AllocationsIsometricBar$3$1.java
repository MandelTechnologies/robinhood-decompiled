package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AllocationBar.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$AllocationsIsometricBar$3$1", m3645f = "AllocationBar.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes10.dex */
final class AllocationBarKt$AllocationsIsometricBar$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotFloatState2 $animationProgress$delegate;
    final /* synthetic */ SnapshotState<Size> $canvasSize$delegate;
    final /* synthetic */ SnapshotState<List<Float>> $cubeWidths$delegate;
    final /* synthetic */ CubicBezierEasing $easeOutCubic;
    final /* synthetic */ SnapshotIntState2 $previousSelectedIndex$delegate;
    final /* synthetic */ SnapshotState<List<Float>> $previousXPositions$delegate;
    final /* synthetic */ ImmutableList<AllocationSection> $sections;
    final /* synthetic */ String $selectedId;
    final /* synthetic */ SnapshotState<Integer> $selectedIndex$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $spacingAnimation;
    final /* synthetic */ SnapshotState<List<Float>> $targetXPositions$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AllocationBarKt$AllocationsIsometricBar$3$1(ImmutableList<AllocationSection> immutableList, String str, SnapshotState<Integer> snapshotState, SnapshotState<Size> snapshotState2, SnapshotState<List<Float>> snapshotState3, SnapshotState<List<Float>> snapshotState4, SnapshotState<List<Float>> snapshotState5, SnapshotIntState2 snapshotIntState2, SnapshotFloatState2 snapshotFloatState2, Animatable<Float, AnimationVectors2> animatable, CubicBezierEasing cubicBezierEasing, Continuation<? super AllocationBarKt$AllocationsIsometricBar$3$1> continuation) {
        super(2, continuation);
        this.$sections = immutableList;
        this.$selectedId = str;
        this.$selectedIndex$delegate = snapshotState;
        this.$canvasSize$delegate = snapshotState2;
        this.$cubeWidths$delegate = snapshotState3;
        this.$targetXPositions$delegate = snapshotState4;
        this.$previousXPositions$delegate = snapshotState5;
        this.$previousSelectedIndex$delegate = snapshotIntState2;
        this.$animationProgress$delegate = snapshotFloatState2;
        this.$spacingAnimation = animatable;
        this.$easeOutCubic = cubicBezierEasing;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AllocationBarKt$AllocationsIsometricBar$3$1 allocationBarKt$AllocationsIsometricBar$3$1 = new AllocationBarKt$AllocationsIsometricBar$3$1(this.$sections, this.$selectedId, this.$selectedIndex$delegate, this.$canvasSize$delegate, this.$cubeWidths$delegate, this.$targetXPositions$delegate, this.$previousXPositions$delegate, this.$previousSelectedIndex$delegate, this.$animationProgress$delegate, this.$spacingAnimation, this.$easeOutCubic, continuation);
        allocationBarKt$AllocationsIsometricBar$3$1.L$0 = obj;
        return allocationBarKt$AllocationsIsometricBar$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AllocationBarKt$AllocationsIsometricBar$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        SnapshotState<Integer> snapshotState = this.$selectedIndex$delegate;
        ImmutableList<AllocationSection> immutableList = this.$sections;
        String str = this.$selectedId;
        Iterator<AllocationSection> it = immutableList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().getId(), str)) {
                break;
            }
            i++;
        }
        Integer numBoxInt = boxing.boxInt(i);
        if (numBoxInt.intValue() < 0) {
            numBoxInt = null;
        }
        snapshotState.setValue(numBoxInt);
        AllocationBarKt.AllocationsIsometricBar_wC_cr3g$updateTargetPositions(this.$canvasSize$delegate, this.$cubeWidths$delegate, this.$selectedIndex$delegate, this.$targetXPositions$delegate, this.$previousXPositions$delegate);
        boolean z = this.$previousSelectedIndex$delegate.getIntValue() >= 0;
        boolean z2 = AllocationBarKt.AllocationsIsometricBar_wC_cr3g$lambda$29(this.$selectedIndex$delegate) != null;
        if (z && z2) {
            int intValue = this.$previousSelectedIndex$delegate.getIntValue();
            Integer numAllocationsIsometricBar_wC_cr3g$lambda$29 = AllocationBarKt.AllocationsIsometricBar_wC_cr3g$lambda$29(this.$selectedIndex$delegate);
            if (numAllocationsIsometricBar_wC_cr3g$lambda$29 == null || intValue != numAllocationsIsometricBar_wC_cr3g$lambda$29.intValue()) {
                Integer numAllocationsIsometricBar_wC_cr3g$lambda$292 = AllocationBarKt.AllocationsIsometricBar_wC_cr3g$lambda$29(this.$selectedIndex$delegate);
                if (numAllocationsIsometricBar_wC_cr3g$lambda$292 != null) {
                    SnapshotIntState2 snapshotIntState2 = this.$previousSelectedIndex$delegate;
                    SnapshotFloatState2 snapshotFloatState2 = this.$animationProgress$delegate;
                    Animatable<Float, AnimationVectors2> animatable = this.$spacingAnimation;
                    CubicBezierEasing cubicBezierEasing = this.$easeOutCubic;
                    snapshotIntState2.setIntValue(numAllocationsIsometricBar_wC_cr3g$lambda$292.intValue());
                    snapshotFloatState2.setFloatValue(1.0f);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AllocationBarKt$AllocationsIsometricBar$3$1$3$1(animatable, cubicBezierEasing, null), 3, null);
                }
            }
        } else if (z && !z2) {
            this.$animationProgress$delegate.setFloatValue(1.0f);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C195324(this.$spacingAnimation, this.$easeOutCubic, this.$animationProgress$delegate, this.$previousSelectedIndex$delegate, null), 3, null);
        } else if (!z && z2) {
            this.$previousSelectedIndex$delegate.setIntValue(-1);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C195335(this.$spacingAnimation, this.$easeOutCubic, this.$animationProgress$delegate, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AllocationBar.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$AllocationsIsometricBar$3$1$4", m3645f = "AllocationBar.kt", m3646l = {288}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$AllocationsIsometricBar$3$1$4 */
    static final class C195324 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotFloatState2 $animationProgress$delegate;
        final /* synthetic */ CubicBezierEasing $easeOutCubic;
        final /* synthetic */ SnapshotIntState2 $previousSelectedIndex$delegate;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $spacingAnimation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C195324(Animatable<Float, AnimationVectors2> animatable, CubicBezierEasing cubicBezierEasing, SnapshotFloatState2 snapshotFloatState2, SnapshotIntState2 snapshotIntState2, Continuation<? super C195324> continuation) {
            super(2, continuation);
            this.$spacingAnimation = animatable;
            this.$easeOutCubic = cubicBezierEasing;
            this.$animationProgress$delegate = snapshotFloatState2;
            this.$previousSelectedIndex$delegate = snapshotIntState2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C195324(this.$spacingAnimation, this.$easeOutCubic, this.$animationProgress$delegate, this.$previousSelectedIndex$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C195324) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C195324 c195324;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatable = this.$spacingAnimation;
                Float fBoxFloat = boxing.boxFloat(0.0f);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(400, 0, this.$easeOutCubic, 2, null);
                this.label = 1;
                c195324 = this;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, c195324, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c195324 = this;
            }
            c195324.$animationProgress$delegate.setFloatValue(0.0f);
            c195324.$previousSelectedIndex$delegate.setIntValue(-1);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AllocationBar.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$AllocationsIsometricBar$3$1$5", m3645f = "AllocationBar.kt", m3646l = {EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$AllocationsIsometricBar$3$1$5 */
    static final class C195335 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotFloatState2 $animationProgress$delegate;
        final /* synthetic */ CubicBezierEasing $easeOutCubic;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $spacingAnimation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C195335(Animatable<Float, AnimationVectors2> animatable, CubicBezierEasing cubicBezierEasing, SnapshotFloatState2 snapshotFloatState2, Continuation<? super C195335> continuation) {
            super(2, continuation);
            this.$spacingAnimation = animatable;
            this.$easeOutCubic = cubicBezierEasing;
            this.$animationProgress$delegate = snapshotFloatState2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C195335(this.$spacingAnimation, this.$easeOutCubic, this.$animationProgress$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C195335) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C195335 c195335;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatable = this.$spacingAnimation;
                Float fBoxFloat = boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, this.$easeOutCubic, 2, null);
                this.label = 1;
                c195335 = this;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, c195335, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c195335 = this;
            }
            c195335.$animationProgress$delegate.setFloatValue(1.0f);
            return Unit.INSTANCE;
        }
    }
}
