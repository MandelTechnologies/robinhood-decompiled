package com.robinhood.android.search.newsfeed.asset;

import android.view.View;
import com.robinhood.android.search.databinding.FragmentNewsFeedAssetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedAssetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.newsfeed.asset.NewsFeedAssetFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class NewsFeedAssetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentNewsFeedAssetBinding> {
    public static final NewsFeedAssetFragment2 INSTANCE = new NewsFeedAssetFragment2();

    NewsFeedAssetFragment2() {
        super(1, FragmentNewsFeedAssetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/search/databinding/FragmentNewsFeedAssetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentNewsFeedAssetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentNewsFeedAssetBinding.bind(p0);
    }
}
