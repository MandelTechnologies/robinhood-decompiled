package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes11.dex */
public final class FragmentRecommendationsQuestionnaireQuestionBinding implements ViewBinding {
    public final RhTextView disclosureTxt;
    public final Barrier headerBarrier;
    public final RecyclerView questionList;
    private final ConstraintLayout rootView;
    public final FocusSafeNestedScrollView scrollView;
    public final LottieAnimationView sharedElementLottie;
    public final RdsInlineDefinitionTextView subtitle;
    public final RhTextView title;

    private FragmentRecommendationsQuestionnaireQuestionBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, Barrier barrier, RecyclerView recyclerView, FocusSafeNestedScrollView focusSafeNestedScrollView, LottieAnimationView lottieAnimationView, RdsInlineDefinitionTextView rdsInlineDefinitionTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.disclosureTxt = rhTextView;
        this.headerBarrier = barrier;
        this.questionList = recyclerView;
        this.scrollView = focusSafeNestedScrollView;
        this.sharedElementLottie = lottieAnimationView;
        this.subtitle = rdsInlineDefinitionTextView;
        this.title = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecommendationsQuestionnaireQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecommendationsQuestionnaireQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.fragment_recommendations_questionnaire_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecommendationsQuestionnaireQuestionBinding bind(View view) {
        int i = C25978R.id.disclosure_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C25978R.id.header_barrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier != null) {
                i = C25978R.id.question_list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C25978R.id.scroll_view;
                    FocusSafeNestedScrollView focusSafeNestedScrollView = (FocusSafeNestedScrollView) ViewBindings.findChildViewById(view, i);
                    if (focusSafeNestedScrollView != null) {
                        i = C25978R.id.shared_element_lottie;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView != null) {
                            i = C25978R.id.subtitle;
                            RdsInlineDefinitionTextView rdsInlineDefinitionTextView = (RdsInlineDefinitionTextView) ViewBindings.findChildViewById(view, i);
                            if (rdsInlineDefinitionTextView != null) {
                                i = C25978R.id.title;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    return new FragmentRecommendationsQuestionnaireQuestionBinding((ConstraintLayout) view, rhTextView, barrier, recyclerView, focusSafeNestedScrollView, lottieAnimationView, rdsInlineDefinitionTextView, rhTextView2);
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
