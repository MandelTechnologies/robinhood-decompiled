package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.infotag.RdsInfoTag;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.info.EducationInfoView;

/* loaded from: classes6.dex */
public final class MergeEducationLessonStandardSectionInfoViewBinding implements ViewBinding {
    public final EducationInfoView infoView;
    public final LinearLayout infoViewConstraintLayout;
    public final RdsInfoTag readTimeInfoTag;
    private final View rootView;

    private MergeEducationLessonStandardSectionInfoViewBinding(View view, EducationInfoView educationInfoView, LinearLayout linearLayout, RdsInfoTag rdsInfoTag) {
        this.rootView = view;
        this.infoView = educationInfoView;
        this.infoViewConstraintLayout = linearLayout;
        this.readTimeInfoTag = rdsInfoTag;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEducationLessonStandardSectionInfoViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C38790R.layout.merge_education_lesson_standard_section_info_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEducationLessonStandardSectionInfoViewBinding bind(View view) {
        int i = C38790R.id.info_view;
        EducationInfoView educationInfoView = (EducationInfoView) ViewBindings.findChildViewById(view, i);
        if (educationInfoView != null) {
            i = C38790R.id.info_view_constraint_layout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C38790R.id.read_time_info_tag;
                RdsInfoTag rdsInfoTag = (RdsInfoTag) ViewBindings.findChildViewById(view, i);
                if (rdsInfoTag != null) {
                    return new MergeEducationLessonStandardSectionInfoViewBinding(view, educationInfoView, linearLayout, rdsInfoTag);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
