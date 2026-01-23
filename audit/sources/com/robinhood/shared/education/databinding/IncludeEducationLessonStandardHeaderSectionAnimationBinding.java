package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.shared.education.C38790R;

/* loaded from: classes6.dex */
public final class IncludeEducationLessonStandardHeaderSectionAnimationBinding implements ViewBinding {
    private final LottieAnimationView rootView;

    private IncludeEducationLessonStandardHeaderSectionAnimationBinding(LottieAnimationView lottieAnimationView) {
        this.rootView = lottieAnimationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LottieAnimationView getRoot() {
        return this.rootView;
    }

    public static IncludeEducationLessonStandardHeaderSectionAnimationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEducationLessonStandardHeaderSectionAnimationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38790R.layout.include_education_lesson_standard_header_section_animation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEducationLessonStandardHeaderSectionAnimationBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEducationLessonStandardHeaderSectionAnimationBinding((LottieAnimationView) view);
    }
}
