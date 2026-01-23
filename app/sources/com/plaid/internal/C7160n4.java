package com.plaid.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.n4 */
/* loaded from: classes16.dex */
public final class C7160n4 implements ViewModelProvider.Factory {

    /* renamed from: a */
    public final InterfaceC5839F1 f3021a;

    public C7160n4(InterfaceC5839F1 outOfProcessComponent) {
        Intrinsics.checkNotNullParameter(outOfProcessComponent, "outOfProcessComponent");
        this.f3021a = outOfProcessComponent;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) throws C7267z2 {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(C7205s4.class)) {
            return new C7205s4(this.f3021a);
        }
        throw new C7267z2("Unsupported ViewModel");
    }
}
