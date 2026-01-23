package com.robinhood.android.trade.directipo.p260ui.order;

import android.view.View;
import com.robinhood.android.trade.directipo.databinding.FragmentDirectIpoOrderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$containerBindings$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class DirectIpoOrderFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentDirectIpoOrderBinding> {
    public static final DirectIpoOrderFragment3 INSTANCE = new DirectIpoOrderFragment3();

    DirectIpoOrderFragment3() {
        super(1, FragmentDirectIpoOrderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/directipo/databinding/FragmentDirectIpoOrderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDirectIpoOrderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDirectIpoOrderBinding.bind(p0);
    }
}
