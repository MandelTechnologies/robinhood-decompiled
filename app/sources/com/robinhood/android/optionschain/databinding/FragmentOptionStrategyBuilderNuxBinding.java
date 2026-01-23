package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.infotag.RdsInfoTag;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionschain.C24135R;

/* loaded from: classes11.dex */
public final class FragmentOptionStrategyBuilderNuxBinding implements ViewBinding {
    public final View contentDivider;
    public final Barrier ctaButtonBarrier;
    public final Space optionsStrategyBuilderBottomSpace;
    public final RdsInfoTag optionsStrategyBuilderComingSoonChip;
    public final RdsButton optionsStrategyBuilderNuxCta;
    public final RhTextView optionsStrategyBuilderNuxDescription;
    public final ImageView optionsStrategyBuilderNuxImg;
    public final TextView optionsStrategyBuilderNuxTitle;
    public final RdsButton optionsStrategyBuilderNuxUpgradeCta;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;

    private FragmentOptionStrategyBuilderNuxBinding(ConstraintLayout constraintLayout, View view, Barrier barrier, Space space, RdsInfoTag rdsInfoTag, RdsButton rdsButton, RhTextView rhTextView, ImageView imageView, TextView textView, RdsButton rdsButton2, ScrollView scrollView) {
        this.rootView = constraintLayout;
        this.contentDivider = view;
        this.ctaButtonBarrier = barrier;
        this.optionsStrategyBuilderBottomSpace = space;
        this.optionsStrategyBuilderComingSoonChip = rdsInfoTag;
        this.optionsStrategyBuilderNuxCta = rdsButton;
        this.optionsStrategyBuilderNuxDescription = rhTextView;
        this.optionsStrategyBuilderNuxImg = imageView;
        this.optionsStrategyBuilderNuxTitle = textView;
        this.optionsStrategyBuilderNuxUpgradeCta = rdsButton2;
        this.scrollView = scrollView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionStrategyBuilderNuxBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionStrategyBuilderNuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.fragment_option_strategy_builder_nux, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionStrategyBuilderNuxBinding bind(View view) {
        int i = C24135R.id.content_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C24135R.id.cta_button_barrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier != null) {
                i = C24135R.id.options_strategy_builder_bottom_space;
                Space space = (Space) ViewBindings.findChildViewById(view, i);
                if (space != null) {
                    i = C24135R.id.options_strategy_builder_coming_soon_chip;
                    RdsInfoTag rdsInfoTag = (RdsInfoTag) ViewBindings.findChildViewById(view, i);
                    if (rdsInfoTag != null) {
                        i = C24135R.id.options_strategy_builder_nux_cta;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C24135R.id.options_strategy_builder_nux_description;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                i = C24135R.id.options_strategy_builder_nux_img;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = C24135R.id.options_strategy_builder_nux_title;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C24135R.id.options_strategy_builder_nux_upgrade_cta;
                                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                        if (rdsButton2 != null) {
                                            i = C24135R.id.scroll_view;
                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                            if (scrollView != null) {
                                                return new FragmentOptionStrategyBuilderNuxBinding((ConstraintLayout) view, viewFindChildViewById, barrier, space, rdsInfoTag, rdsButton, rhTextView, imageView, textView, rdsButton2, scrollView);
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
