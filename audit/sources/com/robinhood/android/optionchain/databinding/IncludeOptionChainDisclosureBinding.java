package com.robinhood.android.optionchain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.optionchain.C22987R;
import com.robinhood.android.optionchain.OptionChainDisclosureView;

/* loaded from: classes10.dex */
public final class IncludeOptionChainDisclosureBinding implements ViewBinding {
    private final OptionChainDisclosureView rootView;

    private IncludeOptionChainDisclosureBinding(OptionChainDisclosureView optionChainDisclosureView) {
        this.rootView = optionChainDisclosureView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionChainDisclosureView getRoot() {
        return this.rootView;
    }

    public static IncludeOptionChainDisclosureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionChainDisclosureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C22987R.layout.include_option_chain_disclosure, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionChainDisclosureBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeOptionChainDisclosureBinding((OptionChainDisclosureView) view);
    }
}
