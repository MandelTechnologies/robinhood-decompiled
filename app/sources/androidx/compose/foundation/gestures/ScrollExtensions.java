package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimation;
import androidx.compose.foundation.MutatorMutex2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: ScrollExtensions.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0086@¢\u0006\u0002\u0010\u0006\u001a\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0086@¢\u0006\u0002\u0010\b\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"animateScrollBy", "", "Landroidx/compose/foundation/gestures/ScrollableState;", "value", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/foundation/gestures/ScrollableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollBy", "(Landroidx/compose/foundation/gestures/ScrollableState;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopScroll", "", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class ScrollExtensions {

    /* compiled from: ScrollExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", m3645f = "ScrollExtensions.kt", m3646l = {38}, m3647m = "animateScrollBy")
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 */
    static final class C11271 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11271(Continuation<? super C11271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScrollExtensions.animateScrollBy(null, 0.0f, null, this);
        }
    }

    /* compiled from: ScrollExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", m3645f = "ScrollExtensions.kt", m3646l = {57}, m3647m = "scrollBy")
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 */
    static final class C11291 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11291(Continuation<? super C11291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScrollExtensions.scrollBy(null, 0.0f, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateScrollBy(ScrollableState scrollableState, float f, AnimationSpec<Float> animationSpec, Continuation<? super Float> continuation) {
        C11271 c11271;
        Ref.FloatRef floatRef;
        if (continuation instanceof C11271) {
            c11271 = (C11271) continuation;
            int i = c11271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11271.label = i - Integer.MIN_VALUE;
            } else {
                c11271 = new C11271(continuation);
            }
        }
        C11271 c112712 = c11271;
        Object obj = c112712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c112712.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            C11282 c11282 = new C11282(f, animationSpec, floatRef2, null);
            c112712.L$0 = floatRef2;
            c112712.label = 1;
            if (ScrollableState.scroll$default(scrollableState, null, c11282, c112712, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) c112712.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return boxing.boxFloat(floatRef.element);
    }

    public static /* synthetic */ Object animateScrollBy$default(ScrollableState scrollableState, float f, AnimationSpec animationSpec, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animateScrollBy(scrollableState, f, animationSpec, continuation);
    }

    /* compiled from: ScrollExtensions.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", m3645f = "ScrollExtensions.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 */
    static final class C11282 extends ContinuationImpl7 implements Function2<ScrollableState4, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ Ref.FloatRef $previousValue;
        final /* synthetic */ float $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11282(float f, AnimationSpec<Float> animationSpec, Ref.FloatRef floatRef, Continuation<? super C11282> continuation) {
            super(2, continuation);
            this.$value = f;
            this.$animationSpec = animationSpec;
            this.$previousValue = floatRef;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11282 c11282 = new C11282(this.$value, this.$animationSpec, this.$previousValue, continuation);
            c11282.L$0 = obj;
            return c11282;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollableState4 scrollableState4, Continuation<? super Unit> continuation) {
            return ((C11282) create(scrollableState4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ScrollableState4 scrollableState4 = (ScrollableState4) this.L$0;
                float f = this.$value;
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final Ref.FloatRef floatRef = this.$previousValue;
                Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f3) {
                        invoke(f2.floatValue(), f3.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f2, float f3) {
                        Ref.FloatRef floatRef2 = floatRef;
                        float f4 = floatRef2.element;
                        floatRef2.element = f4 + scrollableState4.scrollBy(f2 - f4);
                    }
                };
                this.label = 1;
                if (SuspendAnimation.animate$default(0.0f, f, 0.0f, animationSpec, function2, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object scrollBy(ScrollableState scrollableState, float f, Continuation<? super Float> continuation) {
        C11291 c11291;
        Ref.FloatRef floatRef;
        if (continuation instanceof C11291) {
            c11291 = (C11291) continuation;
            int i = c11291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11291.label = i - Integer.MIN_VALUE;
            } else {
                c11291 = new C11291(continuation);
            }
        }
        C11291 c112912 = c11291;
        Object obj = c112912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c112912.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            C11302 c11302 = new C11302(floatRef2, f, null);
            c112912.L$0 = floatRef2;
            c112912.label = 1;
            if (ScrollableState.scroll$default(scrollableState, null, c11302, c112912, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) c112912.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return boxing.boxFloat(floatRef.element);
    }

    /* compiled from: ScrollExtensions.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", m3645f = "ScrollExtensions.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2 */
    static final class C11302 extends ContinuationImpl7 implements Function2<ScrollableState4, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.FloatRef $consumed;
        final /* synthetic */ float $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11302(Ref.FloatRef floatRef, float f, Continuation<? super C11302> continuation) {
            super(2, continuation);
            this.$consumed = floatRef;
            this.$value = f;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11302 c11302 = new C11302(this.$consumed, this.$value, continuation);
            c11302.L$0 = obj;
            return c11302;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollableState4 scrollableState4, Continuation<? super Unit> continuation) {
            return ((C11302) create(scrollableState4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ScrollableState4 scrollableState4 = (ScrollableState4) this.L$0;
            this.$consumed.element = scrollableState4.scrollBy(this.$value);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ScrollExtensions.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", m3645f = "ScrollExtensions.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2 */
    static final class C11312 extends ContinuationImpl7 implements Function2<ScrollableState4, Continuation<? super Unit>, Object> {
        int label;

        C11312(Continuation<? super C11312> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C11312(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollableState4 scrollableState4, Continuation<? super Unit> continuation) {
            return ((C11312) create(scrollableState4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object stopScroll$default(ScrollableState scrollableState, MutatorMutex2 mutatorMutex2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatorMutex2 = MutatorMutex2.Default;
        }
        return stopScroll(scrollableState, mutatorMutex2, continuation);
    }

    public static final Object stopScroll(ScrollableState scrollableState, MutatorMutex2 mutatorMutex2, Continuation<? super Unit> continuation) {
        Object objScroll = scrollableState.scroll(mutatorMutex2, new C11312(null), continuation);
        return objScroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }
}
