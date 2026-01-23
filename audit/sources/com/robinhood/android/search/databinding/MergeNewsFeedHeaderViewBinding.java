package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class MergeNewsFeedHeaderViewBinding implements ViewBinding {
    public final RdsIconButton newsFeedHeaderInfoBtn;
    public final Space newsFeedHeaderSpace;
    public final RhTextView newsFeedHeaderTxt;
    public final LinearLayout newsFeedHeaderTxtLayout;
    private final View rootView;
    public final RdsInfoBannerView topInfoBanner;

    private MergeNewsFeedHeaderViewBinding(View view, RdsIconButton rdsIconButton, Space space, RhTextView rhTextView, LinearLayout linearLayout, RdsInfoBannerView rdsInfoBannerView) {
        this.rootView = view;
        this.newsFeedHeaderInfoBtn = rdsIconButton;
        this.newsFeedHeaderSpace = space;
        this.newsFeedHeaderTxt = rhTextView;
        this.newsFeedHeaderTxtLayout = linearLayout;
        this.topInfoBanner = rdsInfoBannerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeNewsFeedHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27909R.layout.merge_news_feed_header_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeNewsFeedHeaderViewBinding bind(View view) {
        int i = C27909R.id.news_feed_header_info_btn;
        RdsIconButton rdsIconButton = (RdsIconButton) ViewBindings.findChildViewById(view, i);
        if (rdsIconButton != null) {
            i = C27909R.id.news_feed_header_space;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = C27909R.id.news_feed_header_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C27909R.id.news_feed_header_txt_layout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C27909R.id.top_info_banner;
                        RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                        if (rdsInfoBannerView != null) {
                            return new MergeNewsFeedHeaderViewBinding(view, rdsIconButton, space, rhTextView, linearLayout, rdsInfoBannerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
