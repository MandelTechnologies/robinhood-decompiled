package com.robinhood.android.history.p153ui;

import android.view.View;
import com.robinhood.android.history.databinding.FragmentDividendDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DividendDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.DividendDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class DividendDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDividendDetailBinding> {
    public static final DividendDetailFragment2 INSTANCE = new DividendDetailFragment2();

    DividendDetailFragment2() {
        super(1, FragmentDividendDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/history/databinding/FragmentDividendDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDividendDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDividendDetailBinding.bind(p0);
    }
}
