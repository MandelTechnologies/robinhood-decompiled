package com.robinhood.android.history.p153ui.detail.shim;

import android.view.View;
import com.robinhood.android.history.databinding.FragmentDetailShimBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailShimFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.detail.shim.DetailShimFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class DetailShimFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDetailShimBinding> {
    public static final DetailShimFragment2 INSTANCE = new DetailShimFragment2();

    DetailShimFragment2() {
        super(1, FragmentDetailShimBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/history/databinding/FragmentDetailShimBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDetailShimBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDetailShimBinding.bind(p0);
    }
}
