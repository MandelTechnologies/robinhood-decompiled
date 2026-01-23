package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardFooterCtaView;

/* loaded from: classes6.dex */
public final class MergeEducationLessonStandardFooterParentViewBinding implements ViewBinding {
    public final Barrier disclosureFooterButtonsBarrier;
    public final LinearLayout disclosureSection;
    public final View educationLessonBottomGradient;
    public final RhTextView firstTextSection;
    public final RdsIconButton footerBackButton;
    public final ConstraintLayout footerContent;
    public final EducationLessonStandardFooterCtaView footerCtaButtons;
    public final ImageView footerImage;
    public final RdsIconButton footerNextButton;
    private final View rootView;
    public final RhTextView secondTextSection;

    private MergeEducationLessonStandardFooterParentViewBinding(View view, Barrier barrier, LinearLayout linearLayout, View view2, RhTextView rhTextView, RdsIconButton rdsIconButton, ConstraintLayout constraintLayout, EducationLessonStandardFooterCtaView educationLessonStandardFooterCtaView, ImageView imageView, RdsIconButton rdsIconButton2, RhTextView rhTextView2) {
        this.rootView = view;
        this.disclosureFooterButtonsBarrier = barrier;
        this.disclosureSection = linearLayout;
        this.educationLessonBottomGradient = view2;
        this.firstTextSection = rhTextView;
        this.footerBackButton = rdsIconButton;
        this.footerContent = constraintLayout;
        this.footerCtaButtons = educationLessonStandardFooterCtaView;
        this.footerImage = imageView;
        this.footerNextButton = rdsIconButton2;
        this.secondTextSection = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEducationLessonStandardFooterParentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C38790R.layout.merge_education_lesson_standard_footer_parent_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEducationLessonStandardFooterParentViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C38790R.id.disclosure_footer_buttons_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C38790R.id.disclosure_section;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C38790R.id.education_lesson_bottom_gradient))) != null) {
                i = C38790R.id.first_text_section;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C38790R.id.footer_back_button;
                    RdsIconButton rdsIconButton = (RdsIconButton) ViewBindings.findChildViewById(view, i);
                    if (rdsIconButton != null) {
                        i = C38790R.id.footer_content;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = C38790R.id.footer_cta_buttons;
                            EducationLessonStandardFooterCtaView educationLessonStandardFooterCtaView = (EducationLessonStandardFooterCtaView) ViewBindings.findChildViewById(view, i);
                            if (educationLessonStandardFooterCtaView != null) {
                                i = C38790R.id.footer_image;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = C38790R.id.footer_next_button;
                                    RdsIconButton rdsIconButton2 = (RdsIconButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsIconButton2 != null) {
                                        i = C38790R.id.second_text_section;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            return new MergeEducationLessonStandardFooterParentViewBinding(view, barrier, linearLayout, viewFindChildViewById, rhTextView, rdsIconButton, constraintLayout, educationLessonStandardFooterCtaView, imageView, rdsIconButton2, rhTextView2);
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
