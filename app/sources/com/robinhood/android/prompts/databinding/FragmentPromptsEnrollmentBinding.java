package com.robinhood.android.prompts.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.prompts.C25942R;

/* loaded from: classes11.dex */
public final class FragmentPromptsEnrollmentBinding implements ViewBinding {
    public final LinearLayout promptsBtnContainer;
    public final RdsButton promptsConfirmBtn;
    public final RdsButton promptsEnableNotificationsBtn;
    public final RhTextView promptsEnrollmentBody;
    public final RdsButton promptsSkipNotificationsBtn;
    private final ConstraintLayout rootView;

    private FragmentPromptsEnrollmentBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView, RdsButton rdsButton3) {
        this.rootView = constraintLayout;
        this.promptsBtnContainer = linearLayout;
        this.promptsConfirmBtn = rdsButton;
        this.promptsEnableNotificationsBtn = rdsButton2;
        this.promptsEnrollmentBody = rhTextView;
        this.promptsSkipNotificationsBtn = rdsButton3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPromptsEnrollmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPromptsEnrollmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25942R.layout.fragment_prompts_enrollment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPromptsEnrollmentBinding bind(View view) {
        int i = C25942R.id.prompts_btn_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C25942R.id.prompts_confirm_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C25942R.id.prompts_enable_notifications_btn;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    i = C25942R.id.prompts_enrollment_body;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C25942R.id.prompts_skip_notifications_btn;
                        RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton3 != null) {
                            return new FragmentPromptsEnrollmentBinding((ConstraintLayout) view, linearLayout, rdsButton, rdsButton2, rhTextView, rdsButton3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
