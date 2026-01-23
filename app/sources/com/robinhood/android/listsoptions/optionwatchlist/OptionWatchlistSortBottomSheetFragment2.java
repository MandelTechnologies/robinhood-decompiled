package com.robinhood.android.listsoptions.optionwatchlist;

import android.view.View;
import com.robinhood.android.listsoptions.databinding.FragmentOptionWatchlistSortBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionWatchlistSortBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistSortBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class OptionWatchlistSortBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionWatchlistSortBottomSheetBinding> {
    public static final OptionWatchlistSortBottomSheetFragment2 INSTANCE = new OptionWatchlistSortBottomSheetFragment2();

    OptionWatchlistSortBottomSheetFragment2() {
        super(1, FragmentOptionWatchlistSortBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/listsoptions/databinding/FragmentOptionWatchlistSortBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionWatchlistSortBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionWatchlistSortBottomSheetBinding.bind(p0);
    }
}
