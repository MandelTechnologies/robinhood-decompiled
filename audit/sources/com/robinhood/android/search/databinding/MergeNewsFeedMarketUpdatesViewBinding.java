package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class MergeNewsFeedMarketUpdatesViewBinding implements ViewBinding {
    public final RhTextView newsFeedMarketUpdatesBodyTxt;
    public final View newsFeedMarketUpdatesBottomDivider;
    public final ConstraintLayout newsFeedMarketUpdatesContentContainer;
    public final ImageView newsFeedMarketUpdatesLogoImg;
    public final RhTextView newsFeedMarketUpdatesSourceTxt;
    public final RhTextView newsFeedMarketUpdatesTimeTxt;
    public final View newsFeedMarketUpdatesTopDivider;
    private final View rootView;

    private MergeNewsFeedMarketUpdatesViewBinding(View view, RhTextView rhTextView, View view2, ConstraintLayout constraintLayout, ImageView imageView, RhTextView rhTextView2, RhTextView rhTextView3, View view3) {
        this.rootView = view;
        this.newsFeedMarketUpdatesBodyTxt = rhTextView;
        this.newsFeedMarketUpdatesBottomDivider = view2;
        this.newsFeedMarketUpdatesContentContainer = constraintLayout;
        this.newsFeedMarketUpdatesLogoImg = imageView;
        this.newsFeedMarketUpdatesSourceTxt = rhTextView2;
        this.newsFeedMarketUpdatesTimeTxt = rhTextView3;
        this.newsFeedMarketUpdatesTopDivider = view3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeNewsFeedMarketUpdatesViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27909R.layout.merge_news_feed_market_updates_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeNewsFeedMarketUpdatesViewBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C27909R.id.news_feed_market_updates_body_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C27909R.id.news_feed_market_updates_bottom_divider))) != null) {
            i = C27909R.id.news_feed_market_updates_content_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C27909R.id.news_feed_market_updates_logo_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C27909R.id.news_feed_market_updates_source_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C27909R.id.news_feed_market_updates_time_txt;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C27909R.id.news_feed_market_updates_top_divider))) != null) {
                            return new MergeNewsFeedMarketUpdatesViewBinding(view, rhTextView, viewFindChildViewById, constraintLayout, imageView, rhTextView2, rhTextView3, viewFindChildViewById2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
