package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.optionschain.C24135R;

/* loaded from: classes11.dex */
public final class IncludeOptionStrategyBuilderSentimentLayoutBinding implements ViewBinding {
    public final View optionsStrategyBuilderSentimentBackground;
    public final View optionsStrategyBuilderSentimentForeground;
    public final ImageView optionsStrategyBuilderSentimentIcon;
    public final FrameLayout optionsStrategyBuilderSentimentLayout;
    private final FrameLayout rootView;

    private IncludeOptionStrategyBuilderSentimentLayoutBinding(FrameLayout frameLayout, View view, View view2, ImageView imageView, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.optionsStrategyBuilderSentimentBackground = view;
        this.optionsStrategyBuilderSentimentForeground = view2;
        this.optionsStrategyBuilderSentimentIcon = imageView;
        this.optionsStrategyBuilderSentimentLayout = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeOptionStrategyBuilderSentimentLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionStrategyBuilderSentimentLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.include_option_strategy_builder_sentiment_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionStrategyBuilderSentimentLayoutBinding bind(View view) {
        View viewFindChildViewById;
        int i = C24135R.id.options_strategy_builder_sentiment_background;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C24135R.id.options_strategy_builder_sentiment_foreground))) != null) {
            i = C24135R.id.options_strategy_builder_sentiment_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new IncludeOptionStrategyBuilderSentimentLayoutBinding(frameLayout, viewFindChildViewById2, viewFindChildViewById, imageView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
