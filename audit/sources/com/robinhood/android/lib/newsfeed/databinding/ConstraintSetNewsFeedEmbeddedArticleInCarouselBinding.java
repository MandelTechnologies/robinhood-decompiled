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
public final class ConstraintSetNewsFeedEmbeddedArticleInCarouselBinding implements ViewBinding {
    public final Barrier newsFeedEmbeddedArticleBottomBarrier;
    public final Space newsFeedEmbeddedArticleBottomSpace;
    public final RhTextView newsFeedEmbeddedArticleFirstInstrumentTxt;
    public final ImageView newsFeedEmbeddedArticleHeroPreviewImg;
    public final ImageView newsFeedEmbeddedArticleLightningImg;
    public final ImageView newsFeedEmbeddedArticlePreviewImg;
    public final ConstraintLayout newsFeedEmbeddedArticleRootView;
    public final RhTextView newsFeedEmbeddedArticleSecondInstrumentTxt;
    public final RhTextView newsFeedEmbeddedArticleSourceTxt;
    public final RhTextView newsFeedEmbeddedArticleTimeTxt;
    public final RhTextView newsFeedEmbeddedArticleTitleTxt;
    private final ConstraintLayout rootView;

    private ConstraintSetNewsFeedEmbeddedArticleInCarouselBinding(ConstraintLayout constraintLayout, Barrier barrier, Space space, RhTextView rhTextView, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout2, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5) {
        this.rootView = constraintLayout;
        this.newsFeedEmbeddedArticleBottomBarrier = barrier;
        this.newsFeedEmbeddedArticleBottomSpace = space;
        this.newsFeedEmbeddedArticleFirstInstrumentTxt = rhTextView;
        this.newsFeedEmbeddedArticleHeroPreviewImg = imageView;
        this.newsFeedEmbeddedArticleLightningImg = imageView2;
        this.newsFeedEmbeddedArticlePreviewImg = imageView3;
        this.newsFeedEmbeddedArticleRootView = constraintLayout2;
        this.newsFeedEmbeddedArticleSecondInstrumentTxt = rhTextView2;
        this.newsFeedEmbeddedArticleSourceTxt = rhTextView3;
        this.newsFeedEmbeddedArticleTimeTxt = rhTextView4;
        this.newsFeedEmbeddedArticleTitleTxt = rhTextView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ConstraintSetNewsFeedEmbeddedArticleInCarouselBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ConstraintSetNewsFeedEmbeddedArticleInCarouselBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20334R.layout.constraint_set_news_feed_embedded_article_in_carousel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ConstraintSetNewsFeedEmbeddedArticleInCarouselBinding bind(View view) {
        int i = C20334R.id.news_feed_embedded_article_bottom_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C20334R.id.news_feed_embedded_article_bottom_space;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = C20334R.id.news_feed_embedded_article_first_instrument_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C20334R.id.news_feed_embedded_article_hero_preview_img;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C20334R.id.news_feed_embedded_article_lightning_img;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = C20334R.id.news_feed_embedded_article_preview_img;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i = C20334R.id.news_feed_embedded_article_second_instrument_txt;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C20334R.id.news_feed_embedded_article_source_txt;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        i = C20334R.id.news_feed_embedded_article_time_txt;
                                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView4 != null) {
                                            i = C20334R.id.news_feed_embedded_article_title_txt;
                                            RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView5 != null) {
                                                return new ConstraintSetNewsFeedEmbeddedArticleInCarouselBinding(constraintLayout, barrier, space, rhTextView, imageView, imageView2, imageView3, constraintLayout, rhTextView2, rhTextView3, rhTextView4, rhTextView5);
                                            }
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
