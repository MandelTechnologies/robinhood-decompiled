package com.robinhood.android.search.newsfeed.marketupdates;

import android.view.View;
import com.robinhood.android.search.databinding.MergeMarketIndicatorItemViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarketIndicatorItemView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.newsfeed.marketupdates.MarketIndicatorItemView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class MarketIndicatorItemView2 extends FunctionReferenceImpl implements Function1<View, MergeMarketIndicatorItemViewBinding> {
    public static final MarketIndicatorItemView2 INSTANCE = new MarketIndicatorItemView2();

    MarketIndicatorItemView2() {
        super(1, MergeMarketIndicatorItemViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/search/databinding/MergeMarketIndicatorItemViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeMarketIndicatorItemViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeMarketIndicatorItemViewBinding.bind(p0);
    }
}
