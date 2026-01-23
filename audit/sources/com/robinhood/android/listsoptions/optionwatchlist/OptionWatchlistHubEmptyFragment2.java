package com.robinhood.android.listsoptions.optionwatchlist;

import android.view.View;
import com.robinhood.android.listsoptions.databinding.FragmentOptionWatchlistHubEmptyBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionWatchlistHubEmptyFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubEmptyFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class OptionWatchlistHubEmptyFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionWatchlistHubEmptyBinding> {
    public static final OptionWatchlistHubEmptyFragment2 INSTANCE = new OptionWatchlistHubEmptyFragment2();

    OptionWatchlistHubEmptyFragment2() {
        super(1, FragmentOptionWatchlistHubEmptyBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/listsoptions/databinding/FragmentOptionWatchlistHubEmptyBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionWatchlistHubEmptyBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionWatchlistHubEmptyBinding.bind(p0);
    }
}
