package androidx.compose.animation.core;

import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel3;
import kotlinx.coroutines.channels.Channel5;

/* compiled from: AnimateAsState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", m3645f = "AnimateAsState.kt", m3646l = {418}, m3647m = "invokeSuspend")
/* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1, reason: use source file name */
/* loaded from: classes.dex */
final class AnimateAsState3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<AnimationSpec<T>> $animSpec$delegate;
    final /* synthetic */ Animatable<T, V> $animatable;
    final /* synthetic */ Channel<T> $channel;
    final /* synthetic */ SnapshotState4<Function1<T, Unit>> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnimateAsState3(Channel<T> channel, Animatable<T, V> animatable, SnapshotState4<? extends AnimationSpec<T>> snapshotState4, SnapshotState4<? extends Function1<? super T, Unit>> snapshotState42, Continuation<? super AnimateAsState3> continuation) {
        super(2, continuation);
        this.$channel = channel;
        this.$animatable = animatable;
        this.$animSpec$delegate = snapshotState4;
        this.$listener$delegate = snapshotState42;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AnimateAsState3 animateAsState3 = new AnimateAsState3(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, continuation);
        animateAsState3.L$0 = obj;
        return animateAsState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AnimateAsState3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0037 -> B:12:0x003a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Channel3 it;
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            it = this.$channel.iterator();
            coroutineScope = coroutineScope2;
            this.L$0 = coroutineScope;
            this.L$1 = it;
            this.label = 1;
            obj = it.hasNext(this);
            if (obj == coroutine_suspended) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Channel3) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                Object next = it.next();
                Object objM28806getOrNullimpl = Channel5.m28806getOrNullimpl(this.$channel.mo28799tryReceivePtdJZtk());
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C09941(objM28806getOrNullimpl == null ? next : objM28806getOrNullimpl, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, null), 3, null);
                this.L$0 = coroutineScope;
                this.L$1 = it;
                this.label = 1;
                obj = it.hasNext(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* compiled from: AnimateAsState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", m3645f = "AnimateAsState.kt", m3646l = {427}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 */
    /* loaded from: classes4.dex */
    static final class C09941 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState4<AnimationSpec<T>> $animSpec$delegate;
        final /* synthetic */ Animatable<T, V> $animatable;
        final /* synthetic */ SnapshotState4<Function1<T, Unit>> $listener$delegate;
        final /* synthetic */ T $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C09941(T t, Animatable<T, V> animatable, SnapshotState4<? extends AnimationSpec<T>> snapshotState4, SnapshotState4<? extends Function1<? super T, Unit>> snapshotState42, Continuation<? super C09941> continuation) {
            super(2, continuation);
            this.$newTarget = t;
            this.$animatable = animatable;
            this.$animSpec$delegate = snapshotState4;
            this.$listener$delegate = snapshotState42;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C09941(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C09941 c09941;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!Intrinsics.areEqual(this.$newTarget, this.$animatable.getTargetValue())) {
                    Animatable<T, V> animatable = this.$animatable;
                    T t = this.$newTarget;
                    AnimationSpec animationSpecAnimateValueAsState$lambda$6 = AnimateAsState.animateValueAsState$lambda$6(this.$animSpec$delegate);
                    this.label = 1;
                    c09941 = this;
                    if (Animatable.animateTo$default(animatable, t, animationSpecAnimateValueAsState$lambda$6, null, null, c09941, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c09941 = this;
            }
            Function1 function1AnimateValueAsState$lambda$4 = AnimateAsState.animateValueAsState$lambda$4(c09941.$listener$delegate);
            if (function1AnimateValueAsState$lambda$4 != null) {
                function1AnimateValueAsState$lambda$4.invoke(c09941.$animatable.getValue());
            }
            return Unit.INSTANCE;
        }
    }
}
