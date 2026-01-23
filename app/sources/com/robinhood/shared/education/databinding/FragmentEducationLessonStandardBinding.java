package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardFooterParentView;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardHeaderParentView;

/* loaded from: classes6.dex */
public final class FragmentEducationLessonStandardBinding implements ViewBinding {
    public final ConstraintLayout educationLessonContent;
    public final EducationLessonStandardFooterParentView educationLessonFooter;
    public final EducationLessonStandardHeaderParentView educationLessonHeader;
    public final ViewPager2 educationLessonSectionViewPager;
    public final ErrorView errorView;
    public final ShimmerLoadingView loadingView;
    private final FrameLayout rootView;

    private FragmentEducationLessonStandardBinding(FrameLayout frameLayout, ConstraintLayout constraintLayout, EducationLessonStandardFooterParentView educationLessonStandardFooterParentView, EducationLessonStandardHeaderParentView educationLessonStandardHeaderParentView, ViewPager2 viewPager2, ErrorView errorView, ShimmerLoadingView shimmerLoadingView) {
        this.rootView = frameLayout;
        this.educationLessonContent = constraintLayout;
        this.educationLessonFooter = educationLessonStandardFooterParentView;
        this.educationLessonHeader = educationLessonStandardHeaderParentView;
        this.educationLessonSectionViewPager = viewPager2;
        this.errorView = errorView;
        this.loadingView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEducationLessonStandardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEducationLessonStandardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38790R.layout.fragment_education_lesson_standard, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEducationLessonStandardBinding bind(View view) {
        int i = C38790R.id.education_lesson_content;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C38790R.id.education_lesson_footer;
            EducationLessonStandardFooterParentView educationLessonStandardFooterParentView = (EducationLessonStandardFooterParentView) ViewBindings.findChildViewById(view, i);
            if (educationLessonStandardFooterParentView != null) {
                i = C38790R.id.education_lesson_header;
                EducationLessonStandardHeaderParentView educationLessonStandardHeaderParentView = (EducationLessonStandardHeaderParentView) ViewBindings.findChildViewById(view, i);
                if (educationLessonStandardHeaderParentView != null) {
                    i = C38790R.id.education_lesson_section_view_pager;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                    if (viewPager2 != null) {
                        i = C38790R.id.error_view;
                        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
                        if (errorView != null) {
                            i = C38790R.id.loading_view;
                            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                            if (shimmerLoadingView != null) {
                                return new FragmentEducationLessonStandardBinding((FrameLayout) view, constraintLayout, educationLessonStandardFooterParentView, educationLessonStandardHeaderParentView, viewPager2, errorView, shimmerLoadingView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
