package com.robinhood.android.cash.atm.p069ui;

import android.view.View;
import com.robinhood.android.cash.atm.databinding.FragmentAtmFinderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AtmFinderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.atm.ui.AtmFinderFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class AtmFinderFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAtmFinderBinding> {
    public static final AtmFinderFragment2 INSTANCE = new AtmFinderFragment2();

    AtmFinderFragment2() {
        super(1, FragmentAtmFinderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/atm/databinding/FragmentAtmFinderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAtmFinderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAtmFinderBinding.bind(p0);
    }
}
