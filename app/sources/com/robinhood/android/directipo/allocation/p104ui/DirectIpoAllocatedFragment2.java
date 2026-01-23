package com.robinhood.android.directipo.allocation.p104ui;

import android.view.View;
import com.robinhood.android.directipo.allocation.databinding.FragmentDirectIpoAllocatedBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoAllocatedFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment$bindings$2, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class DirectIpoAllocatedFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDirectIpoAllocatedBinding> {
    public static final DirectIpoAllocatedFragment2 INSTANCE = new DirectIpoAllocatedFragment2();

    DirectIpoAllocatedFragment2() {
        super(1, FragmentDirectIpoAllocatedBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/directipo/allocation/databinding/FragmentDirectIpoAllocatedBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDirectIpoAllocatedBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDirectIpoAllocatedBinding.bind(p0);
    }
}
