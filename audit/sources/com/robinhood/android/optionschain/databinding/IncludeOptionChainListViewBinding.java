package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.OptionChainListView;

/* loaded from: classes11.dex */
public final class IncludeOptionChainListViewBinding implements ViewBinding {
    public final OptionChainListView optionChainListView;
    private final OptionChainListView rootView;

    private IncludeOptionChainListViewBinding(OptionChainListView optionChainListView, OptionChainListView optionChainListView2) {
        this.rootView = optionChainListView;
        this.optionChainListView = optionChainListView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionChainListView getRoot() {
        return this.rootView;
    }

    public static IncludeOptionChainListViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionChainListViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.include_option_chain_list_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionChainListViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        OptionChainListView optionChainListView = (OptionChainListView) view;
        return new IncludeOptionChainListViewBinding(optionChainListView, optionChainListView);
    }
}
