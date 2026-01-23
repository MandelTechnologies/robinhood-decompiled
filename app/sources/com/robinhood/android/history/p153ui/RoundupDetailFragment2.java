package com.robinhood.android.history.p153ui;

import android.view.View;
import com.robinhood.android.history.databinding.FragmentRoundupDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoundupDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.RoundupDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class RoundupDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRoundupDetailBinding> {
    public static final RoundupDetailFragment2 INSTANCE = new RoundupDetailFragment2();

    RoundupDetailFragment2() {
        super(1, FragmentRoundupDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/history/databinding/FragmentRoundupDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRoundupDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRoundupDetailBinding.bind(p0);
    }
}
