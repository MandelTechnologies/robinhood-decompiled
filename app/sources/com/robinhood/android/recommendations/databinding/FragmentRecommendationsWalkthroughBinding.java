package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsPortfolioView;

/* loaded from: classes11.dex */
public final class FragmentRecommendationsWalkthroughBinding implements ViewBinding {
    public final ConstraintLayout background;
    public final RdsButton continueBtn;
    public final RhTextView description;
    public final RhTextView disclosure;
    public final RhTextView learnMore;
    public final RhTextView loadingText;
    public final LottieAnimationView lottieView;
    public final RecommendationsPortfolioView portfolioView;
    public final RhTextView prospectusText;
    private final ConstraintLayout rootView;
    public final LottieAnimationView sharedElementLottie;
    public final RhTextView title;

    private FragmentRecommendationsWalkthroughBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, LottieAnimationView lottieAnimationView, RecommendationsPortfolioView recommendationsPortfolioView, RhTextView rhTextView5, LottieAnimationView lottieAnimationView2, RhTextView rhTextView6) {
        this.rootView = constraintLayout;
        this.background = constraintLayout2;
        this.continueBtn = rdsButton;
        this.description = rhTextView;
        this.disclosure = rhTextView2;
        this.learnMore = rhTextView3;
        this.loadingText = rhTextView4;
        this.lottieView = lottieAnimationView;
        this.portfolioView = recommendationsPortfolioView;
        this.prospectusText = rhTextView5;
        this.sharedElementLottie = lottieAnimationView2;
        this.title = rhTextView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecommendationsWalkthroughBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecommendationsWalkthroughBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.fragment_recommendations_walkthrough, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecommendationsWalkthroughBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C25978R.id.continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C25978R.id.description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C25978R.id.disclosure;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C25978R.id.learn_more;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C25978R.id.loading_text;
                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView4 != null) {
                            i = C25978R.id.lottie_view;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                            if (lottieAnimationView != null) {
                                i = C25978R.id.portfolio_view;
                                RecommendationsPortfolioView recommendationsPortfolioView = (RecommendationsPortfolioView) ViewBindings.findChildViewById(view, i);
                                if (recommendationsPortfolioView != null) {
                                    i = C25978R.id.prospectus_text;
                                    RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView5 != null) {
                                        i = C25978R.id.shared_element_lottie;
                                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                        if (lottieAnimationView2 != null) {
                                            i = C25978R.id.title;
                                            RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView6 != null) {
                                                return new FragmentRecommendationsWalkthroughBinding(constraintLayout, constraintLayout, rdsButton, rhTextView, rhTextView2, rhTextView3, rhTextView4, lottieAnimationView, recommendationsPortfolioView, rhTextView5, lottieAnimationView2, rhTextView6);
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
