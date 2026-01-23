package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.foundation.internal.InlineClassHelper;
import androidx.compose.p011ui.MotionDurationScale;
import androidx.compose.runtime.MonotonicFrameClock2;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* compiled from: UpdatableAnimationState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005JJ\u0010\u0013\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u001bH\u0086@\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Landroidx/compose/animation/core/AnimationSpec;)V", "isRunning", "", "lastFrameTime", "", "lastVelocity", "Landroidx/compose/animation/core/AnimationVector1D;", "value", "getValue", "()F", "setValue", "(F)V", "vectorizedSpec", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "animateToZero", "", "beforeFrame", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "valueDelta", "afterFrame", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class UpdatableAnimationState {
    private boolean isRunning;
    private long lastFrameTime = Long.MIN_VALUE;
    private AnimationVectors2 lastVelocity = ZeroVector;
    private float value;
    private final VectorizedAnimationSpec<AnimationVectors2> vectorizedSpec;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final AnimationVectors2 ZeroVector = new AnimationVectors2(0.0f);

    /* compiled from: UpdatableAnimationState.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.UpdatableAnimationState", m3645f = "UpdatableAnimationState.kt", m3646l = {102, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "animateToZero")
    /* renamed from: androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1 */
    /* loaded from: classes4.dex */
    static final class C11551 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C11551(Continuation<? super C11551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdatableAnimationState.this.animateToZero(null, null, this);
        }
    }

    public UpdatableAnimationState(AnimationSpec<Float> animationSpec) {
        this.vectorizedSpec = animationSpec.vectorize(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE));
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f) {
        this.value = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClock2.withFrameNanos(r0, r2) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[Catch: all -> 0x00b3, PHI: r0 r2 r12 r13 r14
      0x0087: PHI (r0v9 kotlin.jvm.functions.Function0) = (r0v3 kotlin.jvm.functions.Function0), (r0v10 kotlin.jvm.functions.Function0) binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
      (r2v2 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
      (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
     binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r12v6 float) = (r12v3 float), (r12v7 float) binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r13v6 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
      (r13v3 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
      (r13v7 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
     binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r14v16 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
      (r14v9 androidx.compose.foundation.gestures.UpdatableAnimationState)
      (r14v17 androidx.compose.foundation.gestures.UpdatableAnimationState)
     binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00b3, blocks: (B:37:0x00a7, B:32:0x0087, B:34:0x0091), top: B:54:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:37:0x00a7, B:32:0x0087, B:34:0x0091), top: B:54:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae A[PHI: r0 r2 r13 r14
      0x00ae: PHI (r0v4 kotlin.jvm.functions.Function0) = (r0v9 kotlin.jvm.functions.Function0), (r0v10 kotlin.jvm.functions.Function0) binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r2v3 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
      (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
      (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
     binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r13v4 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
      (r13v6 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
      (r13v7 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
     binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r14v12 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
      (r14v16 androidx.compose.foundation.gestures.UpdatableAnimationState)
      (r14v17 androidx.compose.foundation.gestures.UpdatableAnimationState)
     binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a4 -> B:54:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateToZero(Function1<? super Float, Unit> function1, Function0<Unit> function0, Continuation<? super Unit> continuation) throws Throwable {
        C11551 c11551;
        C11551 c115512;
        Function0 function02;
        final Function1<? super Float, Unit> function12;
        final float f;
        UpdatableAnimationState updatableAnimationState;
        Function0 function03;
        UpdatableAnimationState updatableAnimationState2;
        if (continuation instanceof C11551) {
            c11551 = (C11551) continuation;
            int i = c11551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11551.label = i - Integer.MIN_VALUE;
            } else {
                c11551 = new C11551(continuation);
            }
        }
        Object obj = c11551.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11551.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.isRunning) {
                    InlineClassHelper.throwIllegalStateException("animateToZero called while previous animation is running");
                }
                MotionDurationScale motionDurationScale = (MotionDurationScale) c11551.getContext().get(MotionDurationScale.INSTANCE);
                float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
                this.isRunning = true;
                c115512 = c11551;
                function02 = function0;
                function12 = function1;
                f = scaleFactor;
                updatableAnimationState = this;
                if (Companion.isZeroish(updatableAnimationState.value)) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function03 = (Function0) c11551.L$1;
                UpdatableAnimationState updatableAnimationState3 = (UpdatableAnimationState) c11551.L$0;
                ResultKt.throwOnFailure(obj);
                function0 = updatableAnimationState3;
                function03.invoke();
                updatableAnimationState2 = function0;
                updatableAnimationState2.lastFrameTime = Long.MIN_VALUE;
                updatableAnimationState2.lastVelocity = ZeroVector;
                updatableAnimationState2.isRunning = false;
                return Unit.INSTANCE;
            }
            f = c11551.F$0;
            Function0 function04 = (Function0) c11551.L$2;
            Function1<? super Float, Unit> function13 = (Function1) c11551.L$1;
            UpdatableAnimationState updatableAnimationState4 = (UpdatableAnimationState) c11551.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                C11551 c115513 = c11551;
                function02 = function04;
                function12 = function13;
                c115512 = c115513;
                updatableAnimationState = updatableAnimationState4;
                try {
                    function02.invoke();
                    if (f == 0.0f) {
                        if (Companion.isZeroish(updatableAnimationState.value)) {
                            Function1<Long, Unit> function14 = new Function1<Long, Unit>() { // from class: androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                    invoke(l.longValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(long j) {
                                    long jRoundToLong;
                                    if (UpdatableAnimationState.this.lastFrameTime == Long.MIN_VALUE) {
                                        UpdatableAnimationState.this.lastFrameTime = j;
                                    }
                                    AnimationVectors2 animationVectors2 = new AnimationVectors2(UpdatableAnimationState.this.getValue());
                                    if (f != 0.0f) {
                                        jRoundToLong = MathKt.roundToLong((j - UpdatableAnimationState.this.lastFrameTime) / f);
                                    } else {
                                        jRoundToLong = UpdatableAnimationState.this.vectorizedSpec.getDurationNanos(new AnimationVectors2(UpdatableAnimationState.this.getValue()), UpdatableAnimationState.Companion.getZeroVector(), UpdatableAnimationState.this.lastVelocity);
                                    }
                                    long j2 = jRoundToLong;
                                    float value = ((AnimationVectors2) UpdatableAnimationState.this.vectorizedSpec.getValueFromNanos(j2, animationVectors2, UpdatableAnimationState.Companion.getZeroVector(), UpdatableAnimationState.this.lastVelocity)).getValue();
                                    UpdatableAnimationState updatableAnimationState5 = UpdatableAnimationState.this;
                                    updatableAnimationState5.lastVelocity = (AnimationVectors2) updatableAnimationState5.vectorizedSpec.getVelocityFromNanos(j2, animationVectors2, UpdatableAnimationState.Companion.getZeroVector(), UpdatableAnimationState.this.lastVelocity);
                                    UpdatableAnimationState.this.lastFrameTime = j;
                                    float value2 = UpdatableAnimationState.this.getValue() - value;
                                    UpdatableAnimationState.this.setValue(value);
                                    function12.invoke(Float.valueOf(value2));
                                }
                            };
                            c115512.L$0 = updatableAnimationState;
                            c115512.L$1 = function12;
                            c115512.L$2 = function02;
                            c115512.F$0 = f;
                            c115512.label = 1;
                            if (MonotonicFrameClock2.withFrameNanos(function14, c115512) == coroutine_suspended) {
                            }
                            function02.invoke();
                            if (f == 0.0f) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    UpdatableAnimationState updatableAnimationState5 = updatableAnimationState;
                    final Function1<? super Float, Unit> function15 = function12;
                    UpdatableAnimationState updatableAnimationState6 = updatableAnimationState5;
                    function03 = function02;
                    if (Math.abs(updatableAnimationState6.value) == 0.0f) {
                        updatableAnimationState2 = updatableAnimationState6;
                    } else {
                        Function1<Long, Unit> function16 = new Function1<Long, Unit>() { // from class: androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                invoke(l.longValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(long j) {
                                float value = UpdatableAnimationState.this.getValue();
                                UpdatableAnimationState.this.setValue(0.0f);
                                function15.invoke(Float.valueOf(value));
                            }
                        };
                        c115512.L$0 = updatableAnimationState6;
                        c115512.L$1 = function03;
                        c115512.L$2 = null;
                        c115512.label = 2;
                        function0 = updatableAnimationState6;
                    }
                    updatableAnimationState2.lastFrameTime = Long.MIN_VALUE;
                    updatableAnimationState2.lastVelocity = ZeroVector;
                    updatableAnimationState2.isRunning = false;
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    function0 = updatableAnimationState;
                    function0.lastFrameTime = Long.MIN_VALUE;
                    function0.lastVelocity = ZeroVector;
                    function0.isRunning = false;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                function0 = updatableAnimationState4;
                function0.lastFrameTime = Long.MIN_VALUE;
                function0.lastVelocity = ZeroVector;
                function0.isRunning = false;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* compiled from: UpdatableAnimationState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u00020\n*\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m3636d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState$Companion;", "", "()V", "VisibilityThreshold", "", "ZeroVector", "Landroidx/compose/animation/core/AnimationVector1D;", "getZeroVector", "()Landroidx/compose/animation/core/AnimationVector1D;", "isZeroish", "", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AnimationVectors2 getZeroVector() {
            return UpdatableAnimationState.ZeroVector;
        }

        public final boolean isZeroish(float f) {
            return Math.abs(f) < 0.01f;
        }
    }
}
