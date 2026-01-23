package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* compiled from: Transform.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1, reason: use source file name */
/* loaded from: classes23.dex */
final class Transform3<T> implements FlowCollector {
    final /* synthetic */ Ref.ObjectRef<R> $accumulator;
    final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> $operation;
    final /* synthetic */ FlowCollector<R> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    Transform3(Ref.ObjectRef<R> objectRef, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, FlowCollector<? super R> flowCollector) {
        this.$accumulator = objectRef;
        this.$operation = function3;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        Transform4 transform4;
        Ref.ObjectRef objectRef;
        Transform3<T> transform3;
        if (continuation instanceof Transform4) {
            transform4 = (Transform4) continuation;
            int i = transform4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transform4.label = i - Integer.MIN_VALUE;
            } else {
                transform4 = new Transform4(this, continuation);
            }
        }
        T t2 = (T) transform4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = transform4.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(t2);
            Ref.ObjectRef objectRef2 = this.$accumulator;
            Function3<R, T, Continuation<? super R>, Object> function3 = this.$operation;
            T t3 = objectRef2.element;
            transform4.L$0 = this;
            transform4.L$1 = objectRef2;
            transform4.label = 1;
            Object objInvoke = function3.invoke(t3, t, transform4);
            if (objInvoke != coroutine_suspended) {
                t2 = (T) objInvoke;
                objectRef = objectRef2;
                transform3 = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(t2);
            return Unit.INSTANCE;
        }
        objectRef = (Ref.ObjectRef) transform4.L$1;
        transform3 = (Transform3) transform4.L$0;
        ResultKt.throwOnFailure(t2);
        objectRef.element = t2;
        FlowCollector<R> flowCollector = transform3.$this_flow;
        T t4 = transform3.$accumulator.element;
        transform4.L$0 = null;
        transform4.L$1 = null;
        transform4.label = 2;
    }
}
