package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: InfiniteTransition.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", m3645f = "InfiniteTransition.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE}, m3647m = "invokeSuspend")
/* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1, reason: use source file name */
/* loaded from: classes4.dex */
final class InfiniteTransition2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<SnapshotState4<Long>> $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InfiniteTransition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfiniteTransition2(SnapshotState<SnapshotState4<Long>> snapshotState, InfiniteTransition infiniteTransition, Continuation<? super InfiniteTransition2> continuation) {
        super(2, continuation);
        this.$toolingOverride = snapshotState;
        this.this$0 = infiniteTransition;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InfiniteTransition2 infiniteTransition2 = new InfiniteTransition2(this.$toolingOverride, this.this$0, continuation);
        infiniteTransition2.L$0 = obj;
        return infiniteTransition2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InfiniteTransition2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Path cross not found for [B:11:0x0040, B:16:0x005d], limit reached: 18 */
    /* JADX WARN: Path cross not found for [B:16:0x005d, B:11:0x0040], limit reached: 18 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[PHI: r1 r8
      0x0056: PHI (r1v2 kotlin.jvm.internal.Ref$FloatRef) = (r1v3 kotlin.jvm.internal.Ref$FloatRef), (r1v5 kotlin.jvm.internal.Ref$FloatRef) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r8v3 kotlinx.coroutines.CoroutineScope) = (r8v4 kotlinx.coroutines.CoroutineScope), (r8v5 kotlinx.coroutines.CoroutineScope) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:11:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:11:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final CoroutineScope coroutineScope;
        final Ref.FloatRef floatRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            floatRef = new Ref.FloatRef();
            floatRef.element = 1.0f;
        } else if (i == 1) {
            floatRef = (Ref.FloatRef) this.L$1;
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
            if (floatRef.element == 0.0f) {
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<Float>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$1$1.2
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(SuspendAnimation.getDurationScale(coroutineScope.getCoroutineContext()));
                    }
                });
                C09983 c09983 = new C09983(null);
                this.L$0 = coroutineScope;
                this.L$1 = floatRef;
                this.label = 2;
                if (FlowKt.first(flowSnapshotFlow, c09983, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) this.L$1;
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope3;
        }
        final SnapshotState<SnapshotState4<Long>> snapshotState = this.$toolingOverride;
        final InfiniteTransition infiniteTransition = this.this$0;
        Function1<Long, Unit> function1 = new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$1$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                SnapshotState4<Long> value = snapshotState.getValue();
                long jLongValue = value != null ? value.getValue().longValue() : j;
                if (infiniteTransition.startTimeNanos == Long.MIN_VALUE || floatRef.element != SuspendAnimation.getDurationScale(coroutineScope.getCoroutineContext())) {
                    infiniteTransition.startTimeNanos = j;
                    MutableVector mutableVector = infiniteTransition._animations;
                    Object[] objArr = mutableVector.content;
                    int size = mutableVector.getSize();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((InfiniteTransition.TransitionAnimationState) objArr[i2]).reset$animation_core_release();
                    }
                    floatRef.element = SuspendAnimation.getDurationScale(coroutineScope.getCoroutineContext());
                }
                if (floatRef.element == 0.0f) {
                    MutableVector mutableVector2 = infiniteTransition._animations;
                    Object[] objArr2 = mutableVector2.content;
                    int size2 = mutableVector2.getSize();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((InfiniteTransition.TransitionAnimationState) objArr2[i3]).skipToEnd$animation_core_release();
                    }
                    return;
                }
                infiniteTransition.onFrame((long) ((jLongValue - infiniteTransition.startTimeNanos) / floatRef.element));
            }
        };
        this.L$0 = coroutineScope;
        this.L$1 = floatRef;
        this.label = 1;
        if (InfiniteAnimationPolicy2.withInfiniteAnimationFrameNanos(function1, this) != coroutine_suspended) {
            if (floatRef.element == 0.0f) {
            }
            final SnapshotState<SnapshotState4<Long>> snapshotState2 = this.$toolingOverride;
            final InfiniteTransition infiniteTransition2 = this.this$0;
            Function1<Long, Unit> function12 = new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                    invoke(l.longValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(long j) {
                    SnapshotState4<Long> value = snapshotState2.getValue();
                    long jLongValue = value != null ? value.getValue().longValue() : j;
                    if (infiniteTransition2.startTimeNanos == Long.MIN_VALUE || floatRef.element != SuspendAnimation.getDurationScale(coroutineScope.getCoroutineContext())) {
                        infiniteTransition2.startTimeNanos = j;
                        MutableVector mutableVector = infiniteTransition2._animations;
                        Object[] objArr = mutableVector.content;
                        int size = mutableVector.getSize();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((InfiniteTransition.TransitionAnimationState) objArr[i2]).reset$animation_core_release();
                        }
                        floatRef.element = SuspendAnimation.getDurationScale(coroutineScope.getCoroutineContext());
                    }
                    if (floatRef.element == 0.0f) {
                        MutableVector mutableVector2 = infiniteTransition2._animations;
                        Object[] objArr2 = mutableVector2.content;
                        int size2 = mutableVector2.getSize();
                        for (int i3 = 0; i3 < size2; i3++) {
                            ((InfiniteTransition.TransitionAnimationState) objArr2[i3]).skipToEnd$animation_core_release();
                        }
                        return;
                    }
                    infiniteTransition2.onFrame((long) ((jLongValue - infiniteTransition2.startTimeNanos) / floatRef.element));
                }
            };
            this.L$0 = coroutineScope;
            this.L$1 = floatRef;
            this.label = 1;
            if (InfiniteAnimationPolicy2.withInfiniteAnimationFrameNanos(function12, this) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* compiled from: InfiniteTransition.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", m3645f = "InfiniteTransition.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3 */
    static final class C09983 extends ContinuationImpl7 implements Function2<Float, Continuation<? super Boolean>, Object> {
        /* synthetic */ float F$0;
        int label;

        C09983(Continuation<? super C09983> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C09983 c09983 = new C09983(continuation);
            c09983.F$0 = ((Number) obj).floatValue();
            return c09983;
        }

        public final Object invoke(float f, Continuation<? super Boolean> continuation) {
            return ((C09983) create(Float.valueOf(f), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f, Continuation<? super Boolean> continuation) {
            return invoke(f.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(this.F$0 > 0.0f);
        }
    }
}
