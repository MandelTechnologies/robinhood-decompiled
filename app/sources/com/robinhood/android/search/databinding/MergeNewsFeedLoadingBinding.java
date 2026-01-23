package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class MergeNewsFeedLoadingBinding implements ViewBinding {
    public final Barrier newsFeedLoadingBottomBarrier;
    public final View newsFeedLoadingBottomDivider;
    public final Space newsFeedLoadingBottomSpace;
    public final View newsFeedLoadingHeroPreviewImg;
    public final View newsFeedLoadingPreviewImg;
    public final ConstraintLayout newsFeedLoadingRootView;
    public final View newsFeedLoadingTitle1;
    public final View newsFeedLoadingTitle2;
    public final View newsFeedLoadingTitle3;
    private final ConstraintLayout rootView;

    private MergeNewsFeedLoadingBinding(ConstraintLayout constraintLayout, Barrier barrier, View view, Space space, View view2, View view3, ConstraintLayout constraintLayout2, View view4, View view5, View view6) {
        this.rootView = constraintLayout;
        this.newsFeedLoadingBottomBarrier = barrier;
        this.newsFeedLoadingBottomDivider = view;
        this.newsFeedLoadingBottomSpace = space;
        this.newsFeedLoadingHeroPreviewImg = view2;
        this.newsFeedLoadingPreviewImg = view3;
        this.newsFeedLoadingRootView = constraintLayout2;
        this.newsFeedLoadingTitle1 = view4;
        this.newsFeedLoadingTitle2 = view5;
        this.newsFeedLoadingTitle3 = view6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeNewsFeedLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeNewsFeedLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.merge_news_feed_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeNewsFeedLoadingBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        int i = C27909R.id.news_feed_loading_bottom_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C27909R.id.news_feed_loading_bottom_divider))) != null) {
            i = C27909R.id.news_feed_loading_bottom_space;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C27909R.id.news_feed_loading_hero_preview_img))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C27909R.id.news_feed_loading_preview_img))) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C27909R.id.news_feed_loading_title_1;
                View viewFindChildViewById6 = ViewBindings.findChildViewById(view, i);
                if (viewFindChildViewById6 != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = C27909R.id.news_feed_loading_title_2))) != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i = C27909R.id.news_feed_loading_title_3))) != null) {
                    return new MergeNewsFeedLoadingBinding(constraintLayout, barrier, viewFindChildViewById, space, viewFindChildViewById2, viewFindChildViewById3, constraintLayout, viewFindChildViewById6, viewFindChildViewById4, viewFindChildViewById5);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
