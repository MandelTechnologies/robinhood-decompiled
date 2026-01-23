package com.robinhood.android.search.newsfeed.marketupdates;

import android.view.View;
import com.robinhood.android.search.databinding.MergeNewsFeedMarketIndicesViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedMarketIndicesView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketIndicesView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class NewsFeedMarketIndicesView2 extends FunctionReferenceImpl implements Function1<View, MergeNewsFeedMarketIndicesViewBinding> {
    public static final NewsFeedMarketIndicesView2 INSTANCE = new NewsFeedMarketIndicesView2();

    NewsFeedMarketIndicesView2() {
        super(1, MergeNewsFeedMarketIndicesViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/search/databinding/MergeNewsFeedMarketIndicesViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeNewsFeedMarketIndicesViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeNewsFeedMarketIndicesViewBinding.bind(p0);
    }
}
