package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function1;

/* compiled from: storage.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable, reason: use source file name */
/* loaded from: classes23.dex */
public interface storage4<P, R> extends Function1<P, R> {
    @Override // kotlin.jvm.functions.Function1
    /* synthetic */ Object invoke(Object obj);

    boolean isComputed(P p);
}
