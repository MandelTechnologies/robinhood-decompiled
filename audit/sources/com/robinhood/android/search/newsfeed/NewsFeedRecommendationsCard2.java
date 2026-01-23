package com.robinhood.android.search.newsfeed;

import android.view.View;
import com.robinhood.android.search.databinding.MergeNewsFeedRecommendationCardBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedRecommendationsCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.newsfeed.NewsFeedRecommendationsCard$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class NewsFeedRecommendationsCard2 extends FunctionReferenceImpl implements Function1<View, MergeNewsFeedRecommendationCardBinding> {
    public static final NewsFeedRecommendationsCard2 INSTANCE = new NewsFeedRecommendationsCard2();

    NewsFeedRecommendationsCard2() {
        super(1, MergeNewsFeedRecommendationCardBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/search/databinding/MergeNewsFeedRecommendationCardBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeNewsFeedRecommendationCardBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeNewsFeedRecommendationCardBinding.bind(p0);
    }
}
