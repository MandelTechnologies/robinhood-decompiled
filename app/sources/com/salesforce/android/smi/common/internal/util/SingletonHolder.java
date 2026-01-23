package com.salesforce.android.smi.common.internal.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SingletonHolder.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u0001*\u0006\b\u0001\u0010\u0003 \u00002\u00020\u0001B~\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0004\u0012%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012:\b\u0002\u0010\u000f\u001a4\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017R1\u0010\n\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018RF\u0010\u000f\u001a4\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R$\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m3636d2 = {"Lcom/salesforce/android/smi/common/internal/util/SingletonHolder;", "", "T", "A", "Lkotlin/Function1;", "creator", "Lkotlin/ParameterName;", "name", "instance", "", "destroyer", "Lkotlin/Function2;", "currentArg", "newArg", "", "argPredicate", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "argA", "getIdempotentInstance", "(Ljava/lang/Object;)Ljava/lang/Object;", "getInstance", "destroyInstance", "()V", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "staticCreator", "Ljava/lang/Object;", "instanceArgA", "common_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public class SingletonHolder<T, A> {
    private final Function2<A, A, Boolean> argPredicate;
    private Function1<? super A, ? extends T> creator;
    private final Function1<T, Unit> destroyer;
    private volatile T instance;
    private volatile A instanceArgA;
    private Function1<? super A, ? extends T> staticCreator;

    /* JADX WARN: Multi-variable type inference failed */
    public SingletonHolder(Function1<? super A, ? extends T> creator, Function1<? super T, Unit> function1, Function2<? super A, ? super A, Boolean> argPredicate) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(argPredicate, "argPredicate");
        this.destroyer = function1;
        this.argPredicate = argPredicate;
        this.staticCreator = creator;
        this.creator = creator;
    }

    public /* synthetic */ SingletonHolder(Function1 function1, Function1 function12, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? new Function2() { // from class: com.salesforce.android.smi.common.internal.util.SingletonHolder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(SingletonHolder._init_$lambda$0(obj, obj2));
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Object obj, Object obj2) {
        return (obj == null || Intrinsics.areEqual(obj, obj2)) ? false : true;
    }

    public final T getIdempotentInstance(A argA) {
        if (this.argPredicate.invoke(this.instanceArgA, argA).booleanValue()) {
            destroyInstance();
        }
        return getInstance(argA);
    }

    public final T getInstance(A argA) {
        T tInvoke;
        T t = this.instance;
        if (t != null) {
            return t;
        }
        synchronized (this) {
            tInvoke = this.instance;
            if (tInvoke == null) {
                Function1<? super A, ? extends T> function1 = this.creator;
                Intrinsics.checkNotNull(function1);
                tInvoke = function1.invoke(argA);
                this.instance = tInvoke;
                this.instanceArgA = argA;
                this.creator = null;
            }
        }
        return tInvoke;
    }

    public final void destroyInstance() {
        Function1<T, Unit> function1;
        T t = this.instance;
        if (t != null && (function1 = this.destroyer) != null) {
            function1.invoke(t);
        }
        this.instance = null;
        this.creator = this.staticCreator;
    }
}
