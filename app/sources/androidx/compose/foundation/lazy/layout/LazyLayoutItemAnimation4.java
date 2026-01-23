package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors3;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p011ui.unit.IntOffset;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyLayoutItemAnimation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", m3645f = "LazyLayoutItemAnimation.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1, reason: use source file name */
/* loaded from: classes4.dex */
final class LazyLayoutItemAnimation4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FiniteAnimationSpec<IntOffset> $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutItemAnimation4(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, long j, Continuation<? super LazyLayoutItemAnimation4> continuation) {
        super(2, continuation);
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = finiteAnimationSpec;
        this.$totalDelta = j;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LazyLayoutItemAnimation4(this.this$0, this.$spec, this.$totalDelta, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LazyLayoutItemAnimation4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:40)|(1:(1:(5:6|7|34|35|36)(2:9|10))(2:11|12))(7:14|15|(2:17|(1:19)(1:20))(1:22)|21|23|(2:25|(1:27))(4:29|30|38|31)|33)|28|29|30|38|31) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r12, r4, r5, null, r7, r8, 4, null) != r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FiniteAnimationSpec finiteAnimationSpec;
        FiniteAnimationSpec finiteAnimationSpec2;
        LazyLayoutItemAnimation4 lazyLayoutItemAnimation4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.placementDeltaAnimation.isRunning()) {
                FiniteAnimationSpec<IntOffset> finiteAnimationSpec3 = this.$spec;
                if (!(finiteAnimationSpec3 instanceof SpringSpec)) {
                    finiteAnimationSpec = LazyLayoutItemAnimation5.InterruptionSpec;
                } else {
                    finiteAnimationSpec = (SpringSpec) finiteAnimationSpec3;
                }
            } else {
                finiteAnimationSpec = this.$spec;
            }
            finiteAnimationSpec2 = finiteAnimationSpec;
            if (!this.this$0.placementDeltaAnimation.isRunning()) {
                Animatable animatable = this.this$0.placementDeltaAnimation;
                IntOffset intOffsetM8030boximpl = IntOffset.m8030boximpl(this.$totalDelta);
                this.L$0 = finiteAnimationSpec2;
                this.label = 1;
                if (animatable.snapTo(intOffsetM8030boximpl, this) == coroutine_suspended) {
                }
            } else {
                FiniteAnimationSpec finiteAnimationSpec4 = finiteAnimationSpec2;
                final long jM8041minusqkQi6aY = IntOffset.m8041minusqkQi6aY(((IntOffset) this.this$0.placementDeltaAnimation.getValue()).getPackedValue(), this.$totalDelta);
                Animatable animatable2 = this.this$0.placementDeltaAnimation;
                IntOffset intOffsetM8030boximpl2 = IntOffset.m8030boximpl(jM8041minusqkQi6aY);
                final LazyLayoutItemAnimation lazyLayoutItemAnimation = this.this$0;
                Function1<Animatable<IntOffset, AnimationVectors3>, Unit> function1 = new Function1<Animatable<IntOffset, AnimationVectors3>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Animatable<IntOffset, AnimationVectors3> animatable3) {
                        invoke2(animatable3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Animatable<IntOffset, AnimationVectors3> animatable3) {
                        lazyLayoutItemAnimation.m5247setPlacementDeltagyyYBs(IntOffset.m8041minusqkQi6aY(animatable3.getValue().getPackedValue(), jM8041minusqkQi6aY));
                        lazyLayoutItemAnimation.onLayerPropertyChanged.invoke();
                    }
                };
                this.L$0 = null;
                this.label = 2;
                lazyLayoutItemAnimation4 = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            lazyLayoutItemAnimation4 = this;
            lazyLayoutItemAnimation4.this$0.setPlacementAnimationInProgress(false);
            lazyLayoutItemAnimation4.this$0.isRunningMovingAwayAnimation = false;
            return Unit.INSTANCE;
        }
        finiteAnimationSpec2 = (FiniteAnimationSpec) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.this$0.onLayerPropertyChanged.invoke();
        FiniteAnimationSpec finiteAnimationSpec42 = finiteAnimationSpec2;
        final long jM8041minusqkQi6aY2 = IntOffset.m8041minusqkQi6aY(((IntOffset) this.this$0.placementDeltaAnimation.getValue()).getPackedValue(), this.$totalDelta);
        Animatable animatable22 = this.this$0.placementDeltaAnimation;
        IntOffset intOffsetM8030boximpl22 = IntOffset.m8030boximpl(jM8041minusqkQi6aY2);
        final LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.this$0;
        Function1<Animatable<IntOffset, AnimationVectors3>, Unit> function12 = new Function1<Animatable<IntOffset, AnimationVectors3>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Animatable<IntOffset, AnimationVectors3> animatable3) {
                invoke2(animatable3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Animatable<IntOffset, AnimationVectors3> animatable3) {
                lazyLayoutItemAnimation2.m5247setPlacementDeltagyyYBs(IntOffset.m8041minusqkQi6aY(animatable3.getValue().getPackedValue(), jM8041minusqkQi6aY2));
                lazyLayoutItemAnimation2.onLayerPropertyChanged.invoke();
            }
        };
        this.L$0 = null;
        this.label = 2;
        lazyLayoutItemAnimation4 = this;
    }
}
