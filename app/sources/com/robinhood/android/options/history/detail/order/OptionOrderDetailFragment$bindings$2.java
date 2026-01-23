package com.robinhood.android.options.history.detail.order;

import android.view.View;
import com.robinhood.android.options.history.detail.databinding.FragmentOptionOrderDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionOrderDetailFragment$bindings$2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionOrderDetailBinding> {
    public static final OptionOrderDetailFragment$bindings$2 INSTANCE = new OptionOrderDetailFragment$bindings$2();

    OptionOrderDetailFragment$bindings$2() {
        super(1, FragmentOptionOrderDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/options/history/detail/databinding/FragmentOptionOrderDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionOrderDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionOrderDetailBinding.bind(p0);
    }
}
