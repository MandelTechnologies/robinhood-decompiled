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
public final class MergeNewsFeedArticleHeroBinding implements ViewBinding {
    public final Barrier newsFeedArticleBottomBarrier;
    public final View newsFeedArticleBottomDivider;
    public final Space newsFeedArticleBottomSpace;
    public final ImageView newsFeedArticleHeroPreviewImg;
    public final ImageView newsFeedArticleLogoImg;
    public final ImageView newsFeedArticlePreviewImg;
    public final NewsFeedRelatedInstrumentsView newsFeedArticleRelatedInstruments;
    public final ConstraintLayout newsFeedArticleRootView;
    public final RhTextView newsFeedArticleSourceTxt;
    public final RhTextView newsFeedArticleTimeTxt;
    public final RhTextView newsFeedArticleTitleTxt;
    private final ConstraintLayout rootView;

    private MergeNewsFeedArticleHeroBinding(ConstraintLayout constraintLayout, Barrier barrier, View view, Space space, ImageView imageView, ImageView imageView2, ImageView imageView3, NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView, ConstraintLayout constraintLayout2, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.newsFeedArticleBottomBarrier = barrier;
        this.newsFeedArticleBottomDivider = view;
        this.newsFeedArticleBottomSpace = space;
        this.newsFeedArticleHeroPreviewImg = imageView;
        this.newsFeedArticleLogoImg = imageView2;
        this.newsFeedArticlePreviewImg = imageView3;
        this.newsFeedArticleRelatedInstruments = newsFeedRelatedInstrumentsView;
        this.newsFeedArticleRootView = constraintLayout2;
        this.newsFeedArticleSourceTxt = rhTextView;
        this.newsFeedArticleTimeTxt = rhTextView2;
        this.newsFeedArticleTitleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeNewsFeedArticleHeroBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeNewsFeedArticleHeroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20334R.layout.merge_news_feed_article_hero, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeNewsFeedArticleHeroBinding bind(View view) {
        View viewFindChildViewById;
        int i = C20334R.id.news_feed_article_bottom_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C20334R.id.news_feed_article_bottom_divider))) != null) {
            i = C20334R.id.news_feed_article_bottom_space;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = C20334R.id.news_feed_article_hero_preview_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C20334R.id.news_feed_article_logo_img;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C20334R.id.news_feed_article_preview_img;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = C20334R.id.news_feed_article_related_instruments;
                            NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView = (NewsFeedRelatedInstrumentsView) ViewBindings.findChildViewById(view, i);
                            if (newsFeedRelatedInstrumentsView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i = C20334R.id.news_feed_article_source_txt;
                                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView != null) {
                                    i = C20334R.id.news_feed_article_time_txt;
                                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView2 != null) {
                                        i = C20334R.id.news_feed_article_title_txt;
                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView3 != null) {
                                            return new MergeNewsFeedArticleHeroBinding(constraintLayout, barrier, viewFindChildViewById, space, imageView, imageView2, imageView3, newsFeedRelatedInstrumentsView, constraintLayout, rhTextView, rhTextView2, rhTextView3);
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
