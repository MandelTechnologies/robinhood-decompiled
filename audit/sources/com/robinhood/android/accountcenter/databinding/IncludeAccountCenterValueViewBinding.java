package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.AccountCenterValueView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class IncludeAccountCenterValueViewBinding implements ViewBinding {
    public final RhTextView descriptionText;
    private final AccountCenterValueView rootView;
    public final AccountCenterValueView valueRow;
    public final RhTextView valueText;

    private IncludeAccountCenterValueViewBinding(AccountCenterValueView accountCenterValueView, RhTextView rhTextView, AccountCenterValueView accountCenterValueView2, RhTextView rhTextView2) {
        this.rootView = accountCenterValueView;
        this.descriptionText = rhTextView;
        this.valueRow = accountCenterValueView2;
        this.valueText = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AccountCenterValueView getRoot() {
        return this.rootView;
    }

    public static IncludeAccountCenterValueViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAccountCenterValueViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_account_center_value_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAccountCenterValueViewBinding bind(View view) {
        int i = C8293R.id.description_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            AccountCenterValueView accountCenterValueView = (AccountCenterValueView) view;
            int i2 = C8293R.id.value_text;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i2);
            if (rhTextView2 != null) {
                return new IncludeAccountCenterValueViewBinding(accountCenterValueView, rhTextView, accountCenterValueView, rhTextView2);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
