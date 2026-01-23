package com.robinhood.shared.login.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.shared.login.lib.C39090R;

/* loaded from: classes6.dex */
public final class FragmentLoginHelpBottomSheetBinding implements ViewBinding {
    public final RdsButton cancelBtn;
    public final LinearLayout loginHelpBottomSheetContainer;
    public final RdsRowView loginHelpBottomSheetForgotEmailButton;
    public final RdsRowView loginHelpBottomSheetForgotPasswordButton;
    public final RdsRowView loginHelpBottomSheetSomethingElseButton;
    private final LinearLayout rootView;

    private FragmentLoginHelpBottomSheetBinding(LinearLayout linearLayout, RdsButton rdsButton, LinearLayout linearLayout2, RdsRowView rdsRowView, RdsRowView rdsRowView2, RdsRowView rdsRowView3) {
        this.rootView = linearLayout;
        this.cancelBtn = rdsButton;
        this.loginHelpBottomSheetContainer = linearLayout2;
        this.loginHelpBottomSheetForgotEmailButton = rdsRowView;
        this.loginHelpBottomSheetForgotPasswordButton = rdsRowView2;
        this.loginHelpBottomSheetSomethingElseButton = rdsRowView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLoginHelpBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLoginHelpBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39090R.layout.fragment_login_help_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentLoginHelpBottomSheetBinding bind(View view) {
        int i = C39090R.id.cancel_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = C39090R.id.login_help_bottom_sheet_forgot_email_button;
            RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView != null) {
                i = C39090R.id.login_help_bottom_sheet_forgot_password_button;
                RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView2 != null) {
                    i = C39090R.id.login_help_bottom_sheet_something_else_button;
                    RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsRowView3 != null) {
                        return new FragmentLoginHelpBottomSheetBinding(linearLayout, rdsButton, linearLayout, rdsRowView, rdsRowView2, rdsRowView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
