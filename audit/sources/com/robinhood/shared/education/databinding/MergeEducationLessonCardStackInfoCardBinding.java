package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.info.EducationInfoView;

/* loaded from: classes6.dex */
public final class MergeEducationLessonCardStackInfoCardBinding implements ViewBinding {
    public final EducationInfoView infoView;
    private final View rootView;

    private MergeEducationLessonCardStackInfoCardBinding(View view, EducationInfoView educationInfoView) {
        this.rootView = view;
        this.infoView = educationInfoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEducationLessonCardStackInfoCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C38790R.layout.merge_education_lesson_card_stack_info_card, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEducationLessonCardStackInfoCardBinding bind(View view) {
        int i = C38790R.id.info_view;
        EducationInfoView educationInfoView = (EducationInfoView) ViewBindings.findChildViewById(view, i);
        if (educationInfoView != null) {
            return new MergeEducationLessonCardStackInfoCardBinding(view, educationInfoView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
