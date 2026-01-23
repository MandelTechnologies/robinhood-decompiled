package com.robinhood.android.listsoptions.optionwatchlist;

import android.view.View;
import com.robinhood.android.listsoptions.databinding.FragmentOptionWatchlistHubContentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionWatchlistHubContentFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class OptionWatchlistHubContentFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentOptionWatchlistHubContentBinding> {
    public static final OptionWatchlistHubContentFragment3 INSTANCE = new OptionWatchlistHubContentFragment3();

    OptionWatchlistHubContentFragment3() {
        super(1, FragmentOptionWatchlistHubContentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/listsoptions/databinding/FragmentOptionWatchlistHubContentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionWatchlistHubContentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionWatchlistHubContentBinding.bind(p0);
    }
}
