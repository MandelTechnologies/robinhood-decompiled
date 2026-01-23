package com.plaid.internal;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.I6 */
/* loaded from: classes16.dex */
public final class C5871I6<T> extends MutableLiveData<T> {

    /* renamed from: a */
    public final AtomicBoolean f1384a = new AtomicBoolean(false);

    /* renamed from: a */
    public static final void m1218a(C5871I6 this$0, Observer observer, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observer, "$observer");
        if (this$0.f1384a.get()) {
            observer.onChanged(obj);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void observe(LifecycleOwner owner, final Observer<? super T> observer) throws C7267z2 {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (hasActiveObservers()) {
            throw new C7267z2("Only one observer supported");
        }
        super.observe(owner, new Observer() { // from class: com.plaid.internal.I6$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C5871I6.m1218a(this.f$0, observer, obj);
            }
        });
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public final void setValue(T t) {
        this.f1384a.set(true);
        super.setValue(t);
    }
}
