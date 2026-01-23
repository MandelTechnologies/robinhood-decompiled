package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardHeaderAnimationView;

/* loaded from: classes6.dex */
public final class MergeEducationLessonStandardHeaderParentViewBinding implements ViewBinding {
    public final ImageView backBtn;
    public final EducationLessonStandardHeaderAnimationView educationLessonHeaderAnimation;
    public final FrameLayout educationLessonHeaderAsset;
    public final LottieAnimationView educationLessonHeaderCompletionAnimation;
    public final Group educationLessonHeaderContent;
    public final View educationLessonHeaderDivider;
    public final ViewPager2 educationLessonHeaderViewPager;
    public final RdsProgressBar educationLessonProgressBar;
    private final View rootView;

    private MergeEducationLessonStandardHeaderParentViewBinding(View view, ImageView imageView, EducationLessonStandardHeaderAnimationView educationLessonStandardHeaderAnimationView, FrameLayout frameLayout, LottieAnimationView lottieAnimationView, Group group, View view2, ViewPager2 viewPager2, RdsProgressBar rdsProgressBar) {
        this.rootView = view;
        this.backBtn = imageView;
        this.educationLessonHeaderAnimation = educationLessonStandardHeaderAnimationView;
        this.educationLessonHeaderAsset = frameLayout;
        this.educationLessonHeaderCompletionAnimation = lottieAnimationView;
        this.educationLessonHeaderContent = group;
        this.educationLessonHeaderDivider = view2;
        this.educationLessonHeaderViewPager = viewPager2;
        this.educationLessonProgressBar = rdsProgressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEducationLessonStandardHeaderParentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C38790R.layout.merge_education_lesson_standard_header_parent_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEducationLessonStandardHeaderParentViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C38790R.id.back_btn;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C38790R.id.education_lesson_header_animation;
            EducationLessonStandardHeaderAnimationView educationLessonStandardHeaderAnimationView = (EducationLessonStandardHeaderAnimationView) ViewBindings.findChildViewById(view, i);
            if (educationLessonStandardHeaderAnimationView != null) {
                i = C38790R.id.education_lesson_header_asset;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C38790R.id.education_lesson_header_completion_animation;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView != null) {
                        i = C38790R.id.education_lesson_header_content;
                        Group group = (Group) ViewBindings.findChildViewById(view, i);
                        if (group != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C38790R.id.education_lesson_header_divider))) != null) {
                            i = C38790R.id.education_lesson_header_view_pager;
                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                            if (viewPager2 != null) {
                                i = C38790R.id.education_lesson_progress_bar;
                                RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                                if (rdsProgressBar != null) {
                                    return new MergeEducationLessonStandardHeaderParentViewBinding(view, imageView, educationLessonStandardHeaderAnimationView, frameLayout, lottieAnimationView, group, viewFindChildViewById, viewPager2, rdsProgressBar);
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
