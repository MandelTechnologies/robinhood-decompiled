package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogate;

/* compiled from: Transform.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1, reason: use source file name */
/* loaded from: classes14.dex */
final class Transform5<T> implements FlowCollector {
    final /* synthetic */ Ref.ObjectRef<Object> $accumulator;
    final /* synthetic */ Function3<T, T, Continuation<? super T>, Object> $operation;
    final /* synthetic */ FlowCollector<T> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    Transform5(Ref.ObjectRef<Object> objectRef, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3, FlowCollector<? super T> flowCollector) {
        this.$accumulator = objectRef;
        this.$operation = function3;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r8.emit(r9, r0) != r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        Transform6 transform6;
        Ref.ObjectRef<Object> objectRef;
        T t2;
        Ref.ObjectRef<Object> objectRef2;
        Transform5<T> transform5;
        if (continuation instanceof Transform6) {
            transform6 = (Transform6) continuation;
            int i = transform6.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transform6.label = i - Integer.MIN_VALUE;
            } else {
                transform6 = new Transform6(this, continuation);
            }
        }
        Object obj = transform6.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = transform6.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            objectRef = this.$accumulator;
            Object obj2 = objectRef.element;
            if (obj2 == NullSurrogate.NULL) {
                transform5 = this;
                objectRef.element = t;
                FlowCollector<T> flowCollector = transform5.$this_flow;
                T t3 = transform5.$accumulator.element;
                transform6.L$0 = null;
                transform6.L$1 = null;
                transform6.label = 2;
            } else {
                Function3<T, T, Continuation<? super T>, Object> function3 = this.$operation;
                transform6.L$0 = this;
                transform6.L$1 = objectRef;
                transform6.label = 1;
                Object objInvoke = function3.invoke(obj2, t, transform6);
                if (objInvoke != coroutine_suspended) {
                    t2 = objInvoke;
                    objectRef2 = objectRef;
                    transform5 = this;
                }
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            objectRef2 = (Ref.ObjectRef) transform6.L$1;
            transform5 = (Transform5) transform6.L$0;
            ResultKt.throwOnFailure(obj);
            t2 = obj;
        }
        T t4 = t2;
        objectRef = objectRef2;
        t = t4;
        objectRef.element = t;
        FlowCollector<T> flowCollector2 = transform5.$this_flow;
        T t32 = transform5.$accumulator.element;
        transform6.L$0 = null;
        transform6.L$1 = null;
        transform6.label = 2;
    }
}
