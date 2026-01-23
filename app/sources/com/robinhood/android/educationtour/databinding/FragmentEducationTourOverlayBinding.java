package com.robinhood.android.educationtour.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.educationtour.C14469R;
import com.robinhood.android.educationtour.EducationTourHighlightCutoutsView;

/* loaded from: classes7.dex */
public final class FragmentEducationTourOverlayBinding implements ViewBinding {
    public final LinearLayout btnsLayout;
    public final Guideline centerGuideline;
    public final RdsButton educationTourBackBtn;
    public final FrameLayout educationTourContainer;
    public final ConstraintLayout educationTourContent;
    public final RdsButton educationTourNextBtn;
    public final RdsProgressBar educationTourProgressBar;
    public final EducationTourHighlightCutoutsView highlightCutoutsView;
    private final FrameLayout rootView;
    public final ConstraintLayout tooltipContainer;

    private FragmentEducationTourOverlayBinding(FrameLayout frameLayout, LinearLayout linearLayout, Guideline guideline, RdsButton rdsButton, FrameLayout frameLayout2, ConstraintLayout constraintLayout, RdsButton rdsButton2, RdsProgressBar rdsProgressBar, EducationTourHighlightCutoutsView educationTourHighlightCutoutsView, ConstraintLayout constraintLayout2) {
        this.rootView = frameLayout;
        this.btnsLayout = linearLayout;
        this.centerGuideline = guideline;
        this.educationTourBackBtn = rdsButton;
        this.educationTourContainer = frameLayout2;
        this.educationTourContent = constraintLayout;
        this.educationTourNextBtn = rdsButton2;
        this.educationTourProgressBar = rdsProgressBar;
        this.highlightCutoutsView = educationTourHighlightCutoutsView;
        this.tooltipContainer = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEducationTourOverlayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEducationTourOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14469R.layout.fragment_education_tour_overlay, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEducationTourOverlayBinding bind(View view) {
        int i = C14469R.id.btns_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C14469R.id.center_guideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = C14469R.id.education_tour_back_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i = C14469R.id.education_tour_content;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C14469R.id.education_tour_next_btn;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            i = C14469R.id.education_tour_progress_bar;
                            RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                            if (rdsProgressBar != null) {
                                i = C14469R.id.highlight_cutouts_view;
                                EducationTourHighlightCutoutsView educationTourHighlightCutoutsView = (EducationTourHighlightCutoutsView) ViewBindings.findChildViewById(view, i);
                                if (educationTourHighlightCutoutsView != null) {
                                    i = C14469R.id.tooltip_container;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout2 != null) {
                                        return new FragmentEducationTourOverlayBinding(frameLayout, linearLayout, guideline, rdsButton, frameLayout, constraintLayout, rdsButton2, rdsProgressBar, educationTourHighlightCutoutsView, constraintLayout2);
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
