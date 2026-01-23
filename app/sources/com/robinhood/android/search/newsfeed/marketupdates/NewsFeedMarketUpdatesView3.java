package com.robinhood.android.search.newsfeed.marketupdates;

import android.view.View;
import com.robinhood.android.search.databinding.MergeNewsFeedMarketUpdatesViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedMarketUpdatesView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketUpdatesView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class NewsFeedMarketUpdatesView3 extends FunctionReferenceImpl implements Function1<View, MergeNewsFeedMarketUpdatesViewBinding> {
    public static final NewsFeedMarketUpdatesView3 INSTANCE = new NewsFeedMarketUpdatesView3();

    NewsFeedMarketUpdatesView3() {
        super(1, MergeNewsFeedMarketUpdatesViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/search/databinding/MergeNewsFeedMarketUpdatesViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeNewsFeedMarketUpdatesViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeNewsFeedMarketUpdatesViewBinding.bind(p0);
    }
}
