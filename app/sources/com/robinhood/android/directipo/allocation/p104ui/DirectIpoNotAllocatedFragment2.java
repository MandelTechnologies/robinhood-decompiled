package com.robinhood.android.directipo.allocation.p104ui;

import android.view.View;
import com.robinhood.android.directipo.allocation.databinding.FragmentDirectIpoNotAllocatedBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoNotAllocatedFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directipo.allocation.ui.DirectIpoNotAllocatedFragment$bindings$2, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class DirectIpoNotAllocatedFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDirectIpoNotAllocatedBinding> {
    public static final DirectIpoNotAllocatedFragment2 INSTANCE = new DirectIpoNotAllocatedFragment2();

    DirectIpoNotAllocatedFragment2() {
        super(1, FragmentDirectIpoNotAllocatedBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/directipo/allocation/databinding/FragmentDirectIpoNotAllocatedBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDirectIpoNotAllocatedBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDirectIpoNotAllocatedBinding.bind(p0);
    }
}
