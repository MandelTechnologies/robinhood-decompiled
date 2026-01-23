package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.RoundedImageView;
import com.robinhood.android.optionschain.C24135R;

/* loaded from: classes11.dex */
public final class MergeOptionStrategyBuilderCardViewBinding implements ViewBinding {
    public final Guideline guideline;
    public final RoundedImageView optionsStrategyBuilderCardViewImage;
    public final TextView optionsStrategyBuilderCardViewSubtitle;
    public final TextView optionsStrategyBuilderCardViewTitle;
    public final TextView optionsStrategyBuilderCardViewTitlePlaceholder;
    public final FrameLayout optionsStrategyBuilderCardViewTitlesLayout;
    private final View rootView;

    private MergeOptionStrategyBuilderCardViewBinding(View view, Guideline guideline, RoundedImageView roundedImageView, TextView textView, TextView textView2, TextView textView3, FrameLayout frameLayout) {
        this.rootView = view;
        this.guideline = guideline;
        this.optionsStrategyBuilderCardViewImage = roundedImageView;
        this.optionsStrategyBuilderCardViewSubtitle = textView;
        this.optionsStrategyBuilderCardViewTitle = textView2;
        this.optionsStrategyBuilderCardViewTitlePlaceholder = textView3;
        this.optionsStrategyBuilderCardViewTitlesLayout = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOptionStrategyBuilderCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C24135R.layout.merge_option_strategy_builder_card_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOptionStrategyBuilderCardViewBinding bind(View view) {
        int i = C24135R.id.guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = C24135R.id.options_strategy_builder_card_view_image;
            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i);
            if (roundedImageView != null) {
                i = C24135R.id.options_strategy_builder_card_view_subtitle;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C24135R.id.options_strategy_builder_card_view_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C24135R.id.options_strategy_builder_card_view_title_placeholder;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = C24135R.id.options_strategy_builder_card_view_titles_layout;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null) {
                                return new MergeOptionStrategyBuilderCardViewBinding(view, guideline, roundedImageView, textView, textView2, textView3, frameLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
