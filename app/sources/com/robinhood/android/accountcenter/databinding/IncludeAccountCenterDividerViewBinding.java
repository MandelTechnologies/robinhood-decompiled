package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.AccountCenterDividerView;

/* loaded from: classes24.dex */
public final class IncludeAccountCenterDividerViewBinding implements ViewBinding {
    private final AccountCenterDividerView rootView;

    private IncludeAccountCenterDividerViewBinding(AccountCenterDividerView accountCenterDividerView) {
        this.rootView = accountCenterDividerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AccountCenterDividerView getRoot() {
        return this.rootView;
    }

    public static IncludeAccountCenterDividerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAccountCenterDividerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_account_center_divider_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAccountCenterDividerViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAccountCenterDividerViewBinding((AccountCenterDividerView) view);
    }
}
