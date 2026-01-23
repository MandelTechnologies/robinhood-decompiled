package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.AccountCenterAddAccountView;

/* loaded from: classes24.dex */
public final class IncludeAccountCenterAddAccountBinding implements ViewBinding {
    public final ComposeView accountCenterAddAccountComposeView;
    private final AccountCenterAddAccountView rootView;

    private IncludeAccountCenterAddAccountBinding(AccountCenterAddAccountView accountCenterAddAccountView, ComposeView composeView) {
        this.rootView = accountCenterAddAccountView;
        this.accountCenterAddAccountComposeView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AccountCenterAddAccountView getRoot() {
        return this.rootView;
    }

    public static IncludeAccountCenterAddAccountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAccountCenterAddAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_account_center_add_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAccountCenterAddAccountBinding bind(View view) {
        int i = C8293R.id.account_center_add_account_compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            return new IncludeAccountCenterAddAccountBinding((AccountCenterAddAccountView) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
