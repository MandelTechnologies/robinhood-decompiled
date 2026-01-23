package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class MergeNewsFeedCarouselBinding implements ViewBinding {
    public final View newsFeedCarouselBottomDivider;
    public final RecyclerView newsFeedCarouselRecyclerView;
    public final RhTextView newsFeedCarouselSubtitleTxt;
    public final RhTextView newsFeedCarouselTitleTxt;
    private final View rootView;

    private MergeNewsFeedCarouselBinding(View view, View view2, RecyclerView recyclerView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.newsFeedCarouselBottomDivider = view2;
        this.newsFeedCarouselRecyclerView = recyclerView;
        this.newsFeedCarouselSubtitleTxt = rhTextView;
        this.newsFeedCarouselTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeNewsFeedCarouselBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27909R.layout.merge_news_feed_carousel, viewGroup);
        return bind(viewGroup);
    }

    public static MergeNewsFeedCarouselBinding bind(View view) {
        int i = C27909R.id.news_feed_carousel_bottom_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C27909R.id.news_feed_carousel_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C27909R.id.news_feed_carousel_subtitle_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C27909R.id.news_feed_carousel_title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new MergeNewsFeedCarouselBinding(view, viewFindChildViewById, recyclerView, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
