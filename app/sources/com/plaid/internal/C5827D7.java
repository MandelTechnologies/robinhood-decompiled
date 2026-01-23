package com.plaid.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.D7 */
/* loaded from: classes16.dex */
public final class C5827D7 implements ViewModelProvider.Factory {

    /* renamed from: a */
    public final InterfaceC5839F1 f1327a;

    public C5827D7(InterfaceC5839F1 webviewComponent) {
        Intrinsics.checkNotNullParameter(webviewComponent, "webviewComponent");
        this.f1327a = webviewComponent;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) throws C7267z2 {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(C5800A7.class)) {
            return new C5800A7(this.f1327a);
        }
        throw new C7267z2("Unsupported ViewModel");
    }
}
