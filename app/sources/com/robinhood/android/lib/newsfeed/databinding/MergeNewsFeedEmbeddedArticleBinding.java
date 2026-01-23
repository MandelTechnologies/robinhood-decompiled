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
import com.robinhood.android.newsfeed.p200ui.NewsFeedRelatedInstrumentsView;

/* loaded from: classes8.dex */
public final class MergeNewsFeedEmbeddedArticleBinding implements ViewBinding {
    public final Barrier newsFeedEmbeddedArticleBottomBarrier;
    public final View newsFeedEmbeddedArticleBottomDivider;
    public final Space newsFeedEmbeddedArticleBottomSpace;
    public final ImageView newsFeedEmbeddedArticleHeroPreviewImg;
    public final ImageView newsFeedEmbeddedArticleLightningImg;
    public final ImageView newsFeedEmbeddedArticlePreviewImg;
    public final NewsFeedRelatedInstrumentsView newsFeedEmbeddedArticleRelatedInstruments;
    public final ConstraintLayout newsFeedEmbeddedArticleRootView;
    public final RhTextView newsFeedEmbeddedArticleSourceTxt;
    public final RhTextView newsFeedEmbeddedArticleTimeTxt;
    public final RhTextView newsFeedEmbeddedArticleTitleTxt;
    private final ConstraintLayout rootView;

    private MergeNewsFeedEmbeddedArticleBinding(ConstraintLayout constraintLayout, Barrier barrier, View view, Space space, ImageView imageView, ImageView imageView2, ImageView imageView3, NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView, ConstraintLayout constraintLayout2, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.newsFeedEmbeddedArticleBottomBarrier = barrier;
        this.newsFeedEmbeddedArticleBottomDivider = view;
        this.newsFeedEmbeddedArticleBottomSpace = space;
        this.newsFeedEmbeddedArticleHeroPreviewImg = imageView;
        this.newsFeedEmbeddedArticleLightningImg = imageView2;
        this.newsFeedEmbeddedArticlePreviewImg = imageView3;
        this.newsFeedEmbeddedArticleRelatedInstruments = newsFeedRelatedInstrumentsView;
        this.newsFeedEmbeddedArticleRootView = constraintLayout2;
        this.newsFeedEmbeddedArticleSourceTxt = rhTextView;
        this.newsFeedEmbeddedArticleTimeTxt = rhTextView2;
        this.newsFeedEmbeddedArticleTitleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeNewsFeedEmbeddedArticleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeNewsFeedEmbeddedArticleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20334R.layout.merge_news_feed_embedded_article, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeNewsFeedEmbeddedArticleBinding bind(View view) {
        View viewFindChildViewById;
        int i = C20334R.id.news_feed_embedded_article_bottom_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C20334R.id.news_feed_embedded_article_bottom_divider))) != null) {
            i = C20334R.id.news_feed_embedded_article_bottom_space;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = C20334R.id.news_feed_embedded_article_hero_preview_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C20334R.id.news_feed_embedded_article_lightning_img;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C20334R.id.news_feed_embedded_article_preview_img;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = C20334R.id.news_feed_embedded_article_related_instruments;
                            NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView = (NewsFeedRelatedInstrumentsView) ViewBindings.findChildViewById(view, i);
                            if (newsFeedRelatedInstrumentsView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i = C20334R.id.news_feed_embedded_article_source_txt;
                                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView != null) {
                                    i = C20334R.id.news_feed_embedded_article_time_txt;
                                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView2 != null) {
                                        i = C20334R.id.news_feed_embedded_article_title_txt;
                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView3 != null) {
                                            return new MergeNewsFeedEmbeddedArticleBinding(constraintLayout, barrier, viewFindChildViewById, space, imageView, imageView2, imageView3, newsFeedRelatedInstrumentsView, constraintLayout, rhTextView, rhTextView2, rhTextView3);
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
