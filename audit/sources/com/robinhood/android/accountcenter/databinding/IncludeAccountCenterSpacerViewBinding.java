package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.AccountCenterSpacerView;

/* loaded from: classes24.dex */
public final class IncludeAccountCenterSpacerViewBinding implements ViewBinding {
    private final AccountCenterSpacerView rootView;

    private IncludeAccountCenterSpacerViewBinding(AccountCenterSpacerView accountCenterSpacerView) {
        this.rootView = accountCenterSpacerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AccountCenterSpacerView getRoot() {
        return this.rootView;
    }

    public static IncludeAccountCenterSpacerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAccountCenterSpacerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_account_center_spacer_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAccountCenterSpacerViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAccountCenterSpacerViewBinding((AccountCenterSpacerView) view);
    }
}
