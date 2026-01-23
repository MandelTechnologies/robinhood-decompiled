package com.robinhood.android.search.newsfeed.view;

import android.view.View;
import com.robinhood.android.search.databinding.MergeNewsFeedHeaderViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedHeaderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.newsfeed.view.NewsFeedHeaderView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class NewsFeedHeaderView2 extends FunctionReferenceImpl implements Function1<View, MergeNewsFeedHeaderViewBinding> {
    public static final NewsFeedHeaderView2 INSTANCE = new NewsFeedHeaderView2();

    NewsFeedHeaderView2() {
        super(1, MergeNewsFeedHeaderViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/search/databinding/MergeNewsFeedHeaderViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeNewsFeedHeaderViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeNewsFeedHeaderViewBinding.bind(p0);
    }
}
