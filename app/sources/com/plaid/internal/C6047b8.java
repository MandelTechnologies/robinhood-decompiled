package com.plaid.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.plaid.internal.AbstractC5991V7;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.b8 */
/* loaded from: classes16.dex */
public final class C6047b8 implements ViewModelProvider.Factory {

    /* renamed from: a */
    public final AbstractC5991V7.a f1931a;

    /* renamed from: b */
    public final InterfaceC5839F1 f1932b;

    public C6047b8(AbstractC5991V7.a createFunction, InterfaceC5839F1 paneHostComponent) {
        Intrinsics.checkNotNullParameter(createFunction, "createFunction");
        Intrinsics.checkNotNullParameter(paneHostComponent, "paneHostComponent");
        this.f1931a = createFunction;
        this.f1932b = paneHostComponent;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Object objInvoke = this.f1931a.invoke(this.f1932b);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type T of com.plaid.internal.workflow.panes.WorkflowViewModelFactory.create");
        return (T) objInvoke;
    }
}
