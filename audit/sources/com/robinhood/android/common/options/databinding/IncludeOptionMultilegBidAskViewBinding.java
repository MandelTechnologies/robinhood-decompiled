package com.robinhood.android.common.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.options.views.OptionsMultilegBidAskView;

/* loaded from: classes2.dex */
public final class IncludeOptionMultilegBidAskViewBinding implements ViewBinding {
    public final OptionsMultilegBidAskView multilegBidAskView;
    private final OptionsMultilegBidAskView rootView;

    private IncludeOptionMultilegBidAskViewBinding(OptionsMultilegBidAskView optionsMultilegBidAskView, OptionsMultilegBidAskView optionsMultilegBidAskView2) {
        this.rootView = optionsMultilegBidAskView;
        this.multilegBidAskView = optionsMultilegBidAskView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionsMultilegBidAskView getRoot() {
        return this.rootView;
    }

    public static IncludeOptionMultilegBidAskViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionMultilegBidAskViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11303R.layout.include_option_multileg_bid_ask_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionMultilegBidAskViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        OptionsMultilegBidAskView optionsMultilegBidAskView = (OptionsMultilegBidAskView) view;
        return new IncludeOptionMultilegBidAskViewBinding(optionsMultilegBidAskView, optionsMultilegBidAskView);
    }
}
