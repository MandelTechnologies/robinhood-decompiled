package com.robinhood.android.directipo.allocation.p104ui;

import android.view.View;
import com.robinhood.android.directipo.allocation.databinding.FragmentDirectIpoSummaryBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoSummaryFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directipo.allocation.ui.DirectIpoSummaryFragment$bindings$2, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class DirectIpoSummaryFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDirectIpoSummaryBinding> {
    public static final DirectIpoSummaryFragment2 INSTANCE = new DirectIpoSummaryFragment2();

    DirectIpoSummaryFragment2() {
        super(1, FragmentDirectIpoSummaryBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/directipo/allocation/databinding/FragmentDirectIpoSummaryBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDirectIpoSummaryBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDirectIpoSummaryBinding.bind(p0);
    }
}
