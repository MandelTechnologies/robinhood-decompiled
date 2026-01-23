package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.shared.education.C38790R;

/* loaded from: classes6.dex */
public final class IncludeEducationLessonStandardHeaderSectionImageBinding implements ViewBinding {
    private final ImageView rootView;

    private IncludeEducationLessonStandardHeaderSectionImageBinding(ImageView imageView) {
        this.rootView = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ImageView getRoot() {
        return this.rootView;
    }

    public static IncludeEducationLessonStandardHeaderSectionImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEducationLessonStandardHeaderSectionImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38790R.layout.include_education_lesson_standard_header_section_image, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEducationLessonStandardHeaderSectionImageBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEducationLessonStandardHeaderSectionImageBinding((ImageView) view);
    }
}
