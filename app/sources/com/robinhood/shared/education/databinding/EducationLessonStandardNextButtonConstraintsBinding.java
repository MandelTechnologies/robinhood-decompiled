package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardFooterCtaView;

/* loaded from: classes6.dex */
public final class EducationLessonStandardNextButtonConstraintsBinding implements ViewBinding {
    public final RdsIconButton footerBackButton;
    public final ConstraintLayout footerContent;
    public final EducationLessonStandardFooterCtaView footerCtaButtons;
    public final RdsIconButton footerNextButton;
    private final ConstraintLayout rootView;

    private EducationLessonStandardNextButtonConstraintsBinding(ConstraintLayout constraintLayout, RdsIconButton rdsIconButton, ConstraintLayout constraintLayout2, EducationLessonStandardFooterCtaView educationLessonStandardFooterCtaView, RdsIconButton rdsIconButton2) {
        this.rootView = constraintLayout;
        this.footerBackButton = rdsIconButton;
        this.footerContent = constraintLayout2;
        this.footerCtaButtons = educationLessonStandardFooterCtaView;
        this.footerNextButton = rdsIconButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static EducationLessonStandardNextButtonConstraintsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EducationLessonStandardNextButtonConstraintsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38790R.layout.education_lesson_standard_next_button_constraints, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static EducationLessonStandardNextButtonConstraintsBinding bind(View view) {
        int i = C38790R.id.footer_back_button;
        RdsIconButton rdsIconButton = (RdsIconButton) ViewBindings.findChildViewById(view, i);
        if (rdsIconButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C38790R.id.footer_cta_buttons;
            EducationLessonStandardFooterCtaView educationLessonStandardFooterCtaView = (EducationLessonStandardFooterCtaView) ViewBindings.findChildViewById(view, i);
            if (educationLessonStandardFooterCtaView != null) {
                i = C38790R.id.footer_next_button;
                RdsIconButton rdsIconButton2 = (RdsIconButton) ViewBindings.findChildViewById(view, i);
                if (rdsIconButton2 != null) {
                    return new EducationLessonStandardNextButtonConstraintsBinding(constraintLayout, rdsIconButton, constraintLayout, educationLessonStandardFooterCtaView, rdsIconButton2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
