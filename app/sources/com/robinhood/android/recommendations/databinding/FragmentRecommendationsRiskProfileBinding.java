package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes11.dex */
public final class FragmentRecommendationsRiskProfileBinding implements ViewBinding {
    public final View background;
    public final RdsButton continueBtn;
    public final LinearLayout continueBtnContainer;
    public final RhTextView descriptionTxt;
    public final RdsTextButton disclosureBtn;
    public final LottieAnimationView indicatorLottie;
    public final RecyclerView list;
    public final FrameLayout lottieContainer;
    public final RhTextView questionSummaryTxt;
    private final FrameLayout rootView;
    public final FocusSafeNestedScrollView scrollView;
    public final LottieAnimationView sharedElementLottie;
    public final LottieAnimationView sheenLottie;
    public final RhTextView titleTxt;

    private FragmentRecommendationsRiskProfileBinding(FrameLayout frameLayout, View view, RdsButton rdsButton, LinearLayout linearLayout, RhTextView rhTextView, RdsTextButton rdsTextButton, LottieAnimationView lottieAnimationView, RecyclerView recyclerView, FrameLayout frameLayout2, RhTextView rhTextView2, FocusSafeNestedScrollView focusSafeNestedScrollView, LottieAnimationView lottieAnimationView2, LottieAnimationView lottieAnimationView3, RhTextView rhTextView3) {
        this.rootView = frameLayout;
        this.background = view;
        this.continueBtn = rdsButton;
        this.continueBtnContainer = linearLayout;
        this.descriptionTxt = rhTextView;
        this.disclosureBtn = rdsTextButton;
        this.indicatorLottie = lottieAnimationView;
        this.list = recyclerView;
        this.lottieContainer = frameLayout2;
        this.questionSummaryTxt = rhTextView2;
        this.scrollView = focusSafeNestedScrollView;
        this.sharedElementLottie = lottieAnimationView2;
        this.sheenLottie = lottieAnimationView3;
        this.titleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecommendationsRiskProfileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecommendationsRiskProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.fragment_recommendations_risk_profile, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecommendationsRiskProfileBinding bind(View view) {
        int i = C25978R.id.background;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C25978R.id.continue_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C25978R.id.continue_btn_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C25978R.id.description_txt;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C25978R.id.disclosure_btn;
                        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                        if (rdsTextButton != null) {
                            i = C25978R.id.indicator_lottie;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                            if (lottieAnimationView != null) {
                                i = C25978R.id.list;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C25978R.id.lottie_container;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout != null) {
                                        i = C25978R.id.question_summary_txt;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            i = C25978R.id.scroll_view;
                                            FocusSafeNestedScrollView focusSafeNestedScrollView = (FocusSafeNestedScrollView) ViewBindings.findChildViewById(view, i);
                                            if (focusSafeNestedScrollView != null) {
                                                i = C25978R.id.shared_element_lottie;
                                                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                                if (lottieAnimationView2 != null) {
                                                    i = C25978R.id.sheen_lottie;
                                                    LottieAnimationView lottieAnimationView3 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                                    if (lottieAnimationView3 != null) {
                                                        i = C25978R.id.title_txt;
                                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView3 != null) {
                                                            return new FragmentRecommendationsRiskProfileBinding((FrameLayout) view, viewFindChildViewById, rdsButton, linearLayout, rhTextView, rdsTextButton, lottieAnimationView, recyclerView, frameLayout, rhTextView2, focusSafeNestedScrollView, lottieAnimationView2, lottieAnimationView3, rhTextView3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
