package com.robinhood.shared.education.order.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.education.order.C38811R;

/* loaded from: classes6.dex */
public final class FragmentOrderTypeEducationLearnMoreBinding implements ViewBinding {
    public final RhTextView descriptionTxt;
    public final RdsButton doneBtn;
    private final ConstraintLayout rootView;
    public final RhTextView titleTxt;

    private FragmentOrderTypeEducationLearnMoreBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RdsButton rdsButton, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.descriptionTxt = rhTextView;
        this.doneBtn = rdsButton;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOrderTypeEducationLearnMoreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOrderTypeEducationLearnMoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38811R.layout.fragment_order_type_education_learn_more, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOrderTypeEducationLearnMoreBinding bind(View view) {
        int i = C38811R.id.description_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C38811R.id.done_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C38811R.id.title_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new FragmentOrderTypeEducationLearnMoreBinding((ConstraintLayout) view, rhTextView, rdsButton, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
