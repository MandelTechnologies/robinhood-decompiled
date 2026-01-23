package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.AccountCenterAccountTotalView;
import com.robinhood.android.common.view.AnimatedRhTextView;

/* loaded from: classes24.dex */
public final class IncludeAccountCenterAccountTotalViewBinding implements ViewBinding {
    public final ComposeView fxTooltipButton;
    private final AccountCenterAccountTotalView rootView;
    public final AnimatedRhTextView totalText;

    private IncludeAccountCenterAccountTotalViewBinding(AccountCenterAccountTotalView accountCenterAccountTotalView, ComposeView composeView, AnimatedRhTextView animatedRhTextView) {
        this.rootView = accountCenterAccountTotalView;
        this.fxTooltipButton = composeView;
        this.totalText = animatedRhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AccountCenterAccountTotalView getRoot() {
        return this.rootView;
    }

    public static IncludeAccountCenterAccountTotalViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAccountCenterAccountTotalViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_account_center_account_total_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAccountCenterAccountTotalViewBinding bind(View view) {
        int i = C8293R.id.fx_tooltip_button;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C8293R.id.total_text;
            AnimatedRhTextView animatedRhTextView = (AnimatedRhTextView) ViewBindings.findChildViewById(view, i);
            if (animatedRhTextView != null) {
                return new IncludeAccountCenterAccountTotalViewBinding((AccountCenterAccountTotalView) view, composeView, animatedRhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
