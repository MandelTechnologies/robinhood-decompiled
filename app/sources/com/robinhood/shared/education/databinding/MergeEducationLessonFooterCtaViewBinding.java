package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.education.C38790R;

/* loaded from: classes6.dex */
public final class MergeEducationLessonFooterCtaViewBinding implements ViewBinding {
    public final RhTextView disclosure;
    public final RdsButton primaryCtaButton;
    private final View rootView;
    public final RdsButton secondaryCtaButton;

    private MergeEducationLessonFooterCtaViewBinding(View view, RhTextView rhTextView, RdsButton rdsButton, RdsButton rdsButton2) {
        this.rootView = view;
        this.disclosure = rhTextView;
        this.primaryCtaButton = rdsButton;
        this.secondaryCtaButton = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEducationLessonFooterCtaViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C38790R.layout.merge_education_lesson_footer_cta_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEducationLessonFooterCtaViewBinding bind(View view) {
        int i = C38790R.id.disclosure;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C38790R.id.primary_cta_button;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C38790R.id.secondary_cta_button;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    return new MergeEducationLessonFooterCtaViewBinding(view, rhTextView, rdsButton, rdsButton2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
