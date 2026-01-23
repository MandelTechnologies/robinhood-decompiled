package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class MergeNewsFeedMarketIndicesViewBinding implements ViewBinding {
    public final View bottomDivider;
    public final RecyclerView newsFeedMarketIndicesRecyclerView;
    public final ImageView newsFeedMarketNewsInfoIcon;
    public final ConstraintLayout newsFeedMarketNewsLayout;
    public final RhTextView newsFeedMarketNewsTitleTxt;
    private final View rootView;
    public final View topDivider;

    private MergeNewsFeedMarketIndicesViewBinding(View view, View view2, RecyclerView recyclerView, ImageView imageView, ConstraintLayout constraintLayout, RhTextView rhTextView, View view3) {
        this.rootView = view;
        this.bottomDivider = view2;
        this.newsFeedMarketIndicesRecyclerView = recyclerView;
        this.newsFeedMarketNewsInfoIcon = imageView;
        this.newsFeedMarketNewsLayout = constraintLayout;
        this.newsFeedMarketNewsTitleTxt = rhTextView;
        this.topDivider = view3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeNewsFeedMarketIndicesViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27909R.layout.merge_news_feed_market_indices_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeNewsFeedMarketIndicesViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C27909R.id.bottom_divider;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null) {
            i = C27909R.id.news_feed_market_indices_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C27909R.id.news_feed_market_news_info_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C27909R.id.news_feed_market_news_layout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C27909R.id.news_feed_market_news_title_txt;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C27909R.id.top_divider))) != null) {
                            return new MergeNewsFeedMarketIndicesViewBinding(view, viewFindChildViewById2, recyclerView, imageView, constraintLayout, rhTextView, viewFindChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
