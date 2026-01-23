package com.robinhood.android.newsfeed.p200ui;

import android.view.View;
import com.robinhood.android.lib.newsfeed.databinding.MergeNewsFeedEducationCarouselViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedEducationCarouselView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.newsfeed.ui.NewsFeedEducationCarouselView$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class NewsFeedEducationCarouselView2 extends FunctionReferenceImpl implements Function1<View, MergeNewsFeedEducationCarouselViewBinding> {
    public static final NewsFeedEducationCarouselView2 INSTANCE = new NewsFeedEducationCarouselView2();

    NewsFeedEducationCarouselView2() {
        super(1, MergeNewsFeedEducationCarouselViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/newsfeed/databinding/MergeNewsFeedEducationCarouselViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeNewsFeedEducationCarouselViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeNewsFeedEducationCarouselViewBinding.bind(p0);
    }
}
