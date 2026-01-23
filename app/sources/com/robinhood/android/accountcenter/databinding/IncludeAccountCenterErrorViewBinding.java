package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.AccountCenterErrorView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class IncludeAccountCenterErrorViewBinding implements ViewBinding {
    public final RdsButton errorAction;
    public final RhTextView errorMessage;
    public final RhTextView errorTitle;
    private final AccountCenterErrorView rootView;

    private IncludeAccountCenterErrorViewBinding(AccountCenterErrorView accountCenterErrorView, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = accountCenterErrorView;
        this.errorAction = rdsButton;
        this.errorMessage = rhTextView;
        this.errorTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AccountCenterErrorView getRoot() {
        return this.rootView;
    }

    public static IncludeAccountCenterErrorViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAccountCenterErrorViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_account_center_error_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAccountCenterErrorViewBinding bind(View view) {
        int i = C8293R.id.error_action;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C8293R.id.error_message;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C8293R.id.error_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new IncludeAccountCenterErrorViewBinding((AccountCenterErrorView) view, rdsButton, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
