package com.robinhood.android.charts.model;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimation;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.charts.model.Fill;
import com.robinhood.android.charts.model.Fill3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: Fill.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.charts.model.Fill$ProtoGradientAnimationFill$Content$1$1", m3645f = "Fill.kt", m3646l = {430, 446}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.charts.model.Fill$ProtoGradientAnimationFill$Content$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class Fill3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Brush> $brush$delegate;
    final /* synthetic */ long $gradientEnd;
    final /* synthetic */ long $gradientStart;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Fill.ProtoGradientAnimationFill this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Fill3(Fill.ProtoGradientAnimationFill protoGradientAnimationFill, SnapshotState<Brush> snapshotState, long j, long j2, Continuation<? super Fill3> continuation) {
        super(2, continuation);
        this.this$0 = protoGradientAnimationFill;
        this.$brush$delegate = snapshotState;
        this.$gradientStart = j;
        this.$gradientEnd = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Fill3 fill3 = new Fill3(this.this$0, this.$brush$delegate, this.$gradientStart, this.$gradientEnd, continuation);
        fill3.L$0 = obj;
        return fill3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Fill3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: Fill.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.charts.model.Fill$ProtoGradientAnimationFill$Content$1$1$1", m3645f = "Fill.kt", m3646l = {422}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.charts.model.Fill$ProtoGradientAnimationFill$Content$1$1$1 */
    static final class C109971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<Brush> $brush$delegate;
        int label;
        final /* synthetic */ Fill.ProtoGradientAnimationFill this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C109971(Fill.ProtoGradientAnimationFill protoGradientAnimationFill, SnapshotState<Brush> snapshotState, Continuation<? super C109971> continuation) {
            super(2, continuation);
            this.this$0 = protoGradientAnimationFill;
            this.$brush$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C109971(this.this$0, this.$brush$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C109971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                float baseColorOpacity = this.this$0.getBaseColorOpacity();
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1000, 0, null, 6, null);
                final Fill.ProtoGradientAnimationFill protoGradientAnimationFill = this.this$0;
                final SnapshotState<Brush> snapshotState = this.$brush$delegate;
                Function2 function2 = new Function2() { // from class: com.robinhood.android.charts.model.Fill$ProtoGradientAnimationFill$Content$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return Fill3.C109971.invokeSuspend$lambda$0(protoGradientAnimationFill, snapshotState, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    }
                };
                this.label = 1;
                if (SuspendAnimation.animate$default(baseColorOpacity, 1.0f, 0.0f, tweenSpecTween$default, function2, this, 4, null) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Fill.ProtoGradientAnimationFill protoGradientAnimationFill, SnapshotState snapshotState, float f, float f2) {
            snapshotState.setValue(new SolidColor(Color.m6705copywmQWz5c$default(protoGradientAnimationFill.m12036getBaseColor0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), null));
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C109971(this.this$0, this.$brush$delegate, null), 3, null);
            this.L$0 = coroutineScope3;
            this.label = 1;
            if (DelayKt.delay(1000L, this) != coroutine_suspended) {
                coroutineScope = coroutineScope3;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope2 = coroutineScope4;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C109993(this.this$0, this.$brush$delegate, null), 3, null);
            return Unit.INSTANCE;
        }
        CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        coroutineScope = coroutineScope5;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C109982(this.this$0, this.$gradientStart, this.$gradientEnd, this.$brush$delegate, null), 3, null);
        this.L$0 = coroutineScope;
        this.label = 2;
        if (DelayKt.delay(1000L, this) != coroutine_suspended) {
            coroutineScope2 = coroutineScope;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C109993(this.this$0, this.$brush$delegate, null), 3, null);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* compiled from: Fill.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.charts.model.Fill$ProtoGradientAnimationFill$Content$1$1$2", m3645f = "Fill.kt", m3646l = {432}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.charts.model.Fill$ProtoGradientAnimationFill$Content$1$1$2 */
    static final class C109982 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<Brush> $brush$delegate;
        final /* synthetic */ long $gradientEnd;
        final /* synthetic */ long $gradientStart;
        int label;
        final /* synthetic */ Fill.ProtoGradientAnimationFill this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C109982(Fill.ProtoGradientAnimationFill protoGradientAnimationFill, long j, long j2, SnapshotState<Brush> snapshotState, Continuation<? super C109982> continuation) {
            super(2, continuation);
            this.this$0 = protoGradientAnimationFill;
            this.$gradientStart = j;
            this.$gradientEnd = j2;
            this.$brush$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C109982(this.this$0, this.$gradientStart, this.$gradientEnd, this.$brush$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C109982) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1000, 0, null, 6, null);
                final Fill.ProtoGradientAnimationFill protoGradientAnimationFill = this.this$0;
                final long j = this.$gradientStart;
                final long j2 = this.$gradientEnd;
                final SnapshotState<Brush> snapshotState = this.$brush$delegate;
                Function2 function2 = new Function2() { // from class: com.robinhood.android.charts.model.Fill$ProtoGradientAnimationFill$Content$1$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return Fill3.C109982.invokeSuspend$lambda$0(protoGradientAnimationFill, j, j2, snapshotState, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    }
                };
                this.label = 1;
                if (SuspendAnimation.animate$default(0.0f, 1.0f, 0.0f, tweenSpecTween$default, function2, this, 4, null) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Fill.ProtoGradientAnimationFill protoGradientAnimationFill, long j, long j2, SnapshotState snapshotState, float f, float f2) {
            snapshotState.setValue(Brush.Companion.m6679linearGradientmHitzGk$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(protoGradientAnimationFill.getBeforePivotGradient().m12088getStartColor0d7_KjU())), Tuples4.m3642to(Float.valueOf(f), Color.m6701boximpl(protoGradientAnimationFill.getBeforePivotGradient().m12087getEndColor0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(protoGradientAnimationFill.getAfterPivotGradient().m12087getEndColor0d7_KjU()))}, j, j2, 0, 8, (Object) null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Fill.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.charts.model.Fill$ProtoGradientAnimationFill$Content$1$1$3", m3645f = "Fill.kt", m3646l = {448}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.charts.model.Fill$ProtoGradientAnimationFill$Content$1$1$3 */
    static final class C109993 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<Brush> $brush$delegate;
        int label;
        final /* synthetic */ Fill.ProtoGradientAnimationFill this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C109993(Fill.ProtoGradientAnimationFill protoGradientAnimationFill, SnapshotState<Brush> snapshotState, Continuation<? super C109993> continuation) {
            super(2, continuation);
            this.this$0 = protoGradientAnimationFill;
            this.$brush$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C109993(this.this$0, this.$brush$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C109993) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                float baseColorOpacity = this.this$0.getBaseColorOpacity();
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1000, 0, null, 6, null);
                final Fill.ProtoGradientAnimationFill protoGradientAnimationFill = this.this$0;
                final SnapshotState<Brush> snapshotState = this.$brush$delegate;
                Function2 function2 = new Function2() { // from class: com.robinhood.android.charts.model.Fill$ProtoGradientAnimationFill$Content$1$1$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return Fill3.C109993.invokeSuspend$lambda$0(protoGradientAnimationFill, snapshotState, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    }
                };
                this.label = 1;
                if (SuspendAnimation.animate$default(1.0f, baseColorOpacity, 0.0f, tweenSpecTween$default, function2, this, 4, null) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Fill.ProtoGradientAnimationFill protoGradientAnimationFill, SnapshotState snapshotState, float f, float f2) {
            snapshotState.setValue(new SolidColor(Color.m6705copywmQWz5c$default(protoGradientAnimationFill.m12036getBaseColor0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), null));
            return Unit.INSTANCE;
        }
    }
}
