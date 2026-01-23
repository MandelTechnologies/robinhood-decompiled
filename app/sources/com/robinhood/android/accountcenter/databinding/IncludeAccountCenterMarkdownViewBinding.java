package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.AccountCenterMarkdownView;

/* loaded from: classes24.dex */
public final class IncludeAccountCenterMarkdownViewBinding implements ViewBinding {
    private final AccountCenterMarkdownView rootView;

    private IncludeAccountCenterMarkdownViewBinding(AccountCenterMarkdownView accountCenterMarkdownView) {
        this.rootView = accountCenterMarkdownView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AccountCenterMarkdownView getRoot() {
        return this.rootView;
    }

    public static IncludeAccountCenterMarkdownViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAccountCenterMarkdownViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_account_center_markdown_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAccountCenterMarkdownViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAccountCenterMarkdownViewBinding((AccountCenterMarkdownView) view);
    }
}
