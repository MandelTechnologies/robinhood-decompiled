package com.robinhood.android.lib.newsfeed.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.newsfeed.C20334R;

/* loaded from: classes8.dex */
public final class ConstraintSetNewsFeedArticleInCarouselBinding implements ViewBinding {
    public final Barrier newsFeedArticleBottomBarrier;
    public final Space newsFeedArticleBottomSpace;
    public final RhTextView newsFeedArticleFirstInstrumentTxt;
    public final ImageView newsFeedArticleHeroPreviewImg;
    public final ImageView newsFeedArticlePreviewImg;
    public final ConstraintLayout newsFeedArticleRootView;
    public final RhTextView newsFeedArticleSecondInstrumentTxt;
    public final RhTextView newsFeedArticleSourceTxt;
    public final RhTextView newsFeedArticleTimeTxt;
    public final RhTextView newsFeedArticleTitleTxt;
    private final ConstraintLayout rootView;

    private ConstraintSetNewsFeedArticleInCarouselBinding(ConstraintLayout constraintLayout, Barrier barrier, Space space, RhTextView rhTextView, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5) {
        this.rootView = constraintLayout;
        this.newsFeedArticleBottomBarrier = barrier;
        this.newsFeedArticleBottomSpace = space;
        this.newsFeedArticleFirstInstrumentTxt = rhTextView;
        this.newsFeedArticleHeroPreviewImg = imageView;
        this.newsFeedArticlePreviewImg = imageView2;
        this.newsFeedArticleRootView = constraintLayout2;
        this.newsFeedArticleSecondInstrumentTxt = rhTextView2;
        this.newsFeedArticleSourceTxt = rhTextView3;
        this.newsFeedArticleTimeTxt = rhTextView4;
        this.newsFeedArticleTitleTxt = rhTextView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ConstraintSetNewsFeedArticleInCarouselBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ConstraintSetNewsFeedArticleInCarouselBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20334R.layout.constraint_set_news_feed_article_in_carousel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ConstraintSetNewsFeedArticleInCarouselBinding bind(View view) {
        int i = C20334R.id.news_feed_article_bottom_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C20334R.id.news_feed_article_bottom_space;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = C20334R.id.news_feed_article_first_instrument_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C20334R.id.news_feed_article_hero_preview_img;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C20334R.id.news_feed_article_preview_img;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i = C20334R.id.news_feed_article_second_instrument_txt;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C20334R.id.news_feed_article_source_txt;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    i = C20334R.id.news_feed_article_time_txt;
                                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView4 != null) {
                                        i = C20334R.id.news_feed_article_title_txt;
                                        RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView5 != null) {
                                            return new ConstraintSetNewsFeedArticleInCarouselBinding(constraintLayout, barrier, space, rhTextView, imageView, imageView2, constraintLayout, rhTextView2, rhTextView3, rhTextView4, rhTextView5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
