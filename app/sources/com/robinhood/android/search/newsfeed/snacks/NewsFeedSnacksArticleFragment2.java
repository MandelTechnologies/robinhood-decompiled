package com.robinhood.android.search.newsfeed.snacks;

import android.view.View;
import com.robinhood.android.search.databinding.FragmentNewsFeedSnacksArticleBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedSnacksArticleFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.newsfeed.snacks.NewsFeedSnacksArticleFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class NewsFeedSnacksArticleFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentNewsFeedSnacksArticleBinding> {
    public static final NewsFeedSnacksArticleFragment2 INSTANCE = new NewsFeedSnacksArticleFragment2();

    NewsFeedSnacksArticleFragment2() {
        super(1, FragmentNewsFeedSnacksArticleBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/search/databinding/FragmentNewsFeedSnacksArticleBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentNewsFeedSnacksArticleBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentNewsFeedSnacksArticleBinding.bind(p0);
    }
}
