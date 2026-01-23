package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.Continuation5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DeepRecursive.kt */
@SinceKotlin
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0001\t¨\u0006\n"}, m3636d2 = {"Lkotlin/DeepRecursiveScope;", "T", "R", "", "<init>", "()V", "value", "callRecursive", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/DeepRecursiveScopeImpl;", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Continuation5
@WasExperimental
/* renamed from: kotlin.DeepRecursiveScope, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class DeepRecursive3<T, R> {
    public /* synthetic */ DeepRecursive3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object callRecursive(T t, Continuation<? super R> continuation);

    private DeepRecursive3() {
    }
}
