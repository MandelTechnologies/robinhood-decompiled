package com.plaid.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.y3 */
/* loaded from: classes16.dex */
public final class C7259y3 implements ViewModelProvider.Factory {

    /* renamed from: a */
    public final InterfaceC5839F1 f3322a;

    public C7259y3(InterfaceC5839F1 loadingComponent) {
        Intrinsics.checkNotNullParameter(loadingComponent, "loadingComponent");
        this.f3322a = loadingComponent;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) throws C7267z2 {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(C7250x3.class)) {
            return new C7250x3(this.f3322a);
        }
        throw new C7267z2("Unsupported ViewModel");
    }
}
