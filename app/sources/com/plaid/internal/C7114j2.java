package com.plaid.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.j2 */
/* loaded from: classes16.dex */
public final class C7114j2 implements ViewModelProvider.Factory {

    /* renamed from: a */
    public final InterfaceC6013Y2 f2874a;

    public C7114j2(InterfaceC6013Y2 tokenComponent) {
        Intrinsics.checkNotNullParameter(tokenComponent, "tokenComponent");
        this.f2874a = tokenComponent;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new C7094h2(this.f2874a);
    }
}
