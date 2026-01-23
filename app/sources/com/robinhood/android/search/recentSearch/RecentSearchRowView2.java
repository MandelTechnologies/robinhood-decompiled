package com.robinhood.android.search.recentSearch;

import android.view.View;
import com.robinhood.android.search.databinding.MergeRowRecentSearchViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecentSearchRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.recentSearch.RecentSearchRowView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RecentSearchRowView2 extends FunctionReferenceImpl implements Function1<View, MergeRowRecentSearchViewBinding> {
    public static final RecentSearchRowView2 INSTANCE = new RecentSearchRowView2();

    RecentSearchRowView2() {
        super(1, MergeRowRecentSearchViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/search/databinding/MergeRowRecentSearchViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRowRecentSearchViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRowRecentSearchViewBinding.bind(p0);
    }
}
