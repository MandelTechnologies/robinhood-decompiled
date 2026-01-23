package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class FragmentNewsFeedEmbeddedArticleBinding implements ViewBinding {
    public final RhTextView newsFeedEmbeddedArticleAuthorsTxt;
    public final RhTextView newsFeedEmbeddedArticleContentTxt;
    public final ErrorView newsFeedEmbeddedArticleErrorRetryView;
    public final RhTextView newsFeedEmbeddedArticleFirstInstrumentTxt;
    public final ImageView newsFeedEmbeddedArticleHeaderImg;
    public final RhTextView newsFeedEmbeddedArticleImageCreditTxt;
    public final RhTextView newsFeedEmbeddedArticleLastUpdatedTxt;
    public final RdsProgressBar newsFeedEmbeddedArticleProgressBar;
    public final ScrollView newsFeedEmbeddedArticleScrollView;
    public final RhTextView newsFeedEmbeddedArticleSecondInstrumentTxt;
    public final RhTextView newsFeedEmbeddedArticleTitleTxt;
    private final FrameLayout rootView;

    private FragmentNewsFeedEmbeddedArticleBinding(FrameLayout frameLayout, RhTextView rhTextView, RhTextView rhTextView2, ErrorView errorView, RhTextView rhTextView3, ImageView imageView, RhTextView rhTextView4, RhTextView rhTextView5, RdsProgressBar rdsProgressBar, ScrollView scrollView, RhTextView rhTextView6, RhTextView rhTextView7) {
        this.rootView = frameLayout;
        this.newsFeedEmbeddedArticleAuthorsTxt = rhTextView;
        this.newsFeedEmbeddedArticleContentTxt = rhTextView2;
        this.newsFeedEmbeddedArticleErrorRetryView = errorView;
        this.newsFeedEmbeddedArticleFirstInstrumentTxt = rhTextView3;
        this.newsFeedEmbeddedArticleHeaderImg = imageView;
        this.newsFeedEmbeddedArticleImageCreditTxt = rhTextView4;
        this.newsFeedEmbeddedArticleLastUpdatedTxt = rhTextView5;
        this.newsFeedEmbeddedArticleProgressBar = rdsProgressBar;
        this.newsFeedEmbeddedArticleScrollView = scrollView;
        this.newsFeedEmbeddedArticleSecondInstrumentTxt = rhTextView6;
        this.newsFeedEmbeddedArticleTitleTxt = rhTextView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentNewsFeedEmbeddedArticleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNewsFeedEmbeddedArticleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.fragment_news_feed_embedded_article, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNewsFeedEmbeddedArticleBinding bind(View view) {
        int i = C27909R.id.news_feed_embedded_article_authors_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C27909R.id.news_feed_embedded_article_content_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C27909R.id.news_feed_embedded_article_error_retry_view;
                ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
                if (errorView != null) {
                    i = C27909R.id.news_feed_embedded_article_first_instrument_txt;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C27909R.id.news_feed_embedded_article_header_img;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C27909R.id.news_feed_embedded_article_image_credit_txt;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null) {
                                i = C27909R.id.news_feed_embedded_article_last_updated_txt;
                                RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView5 != null) {
                                    i = C27909R.id.news_feed_embedded_article_progress_bar;
                                    RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                                    if (rdsProgressBar != null) {
                                        i = C27909R.id.news_feed_embedded_article_scroll_view;
                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                        if (scrollView != null) {
                                            i = C27909R.id.news_feed_embedded_article_second_instrument_txt;
                                            RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView6 != null) {
                                                i = C27909R.id.news_feed_embedded_article_title_txt;
                                                RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView7 != null) {
                                                    return new FragmentNewsFeedEmbeddedArticleBinding((FrameLayout) view, rhTextView, rhTextView2, errorView, rhTextView3, imageView, rhTextView4, rhTextView5, rdsProgressBar, scrollView, rhTextView6, rhTextView7);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
