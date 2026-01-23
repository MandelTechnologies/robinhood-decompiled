package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.optionschain.C24135R;

/* loaded from: classes11.dex */
public final class ToolbarOptionChainCustomizationBinding implements ViewBinding {
    private final ConstraintLayout rootView;

    private ToolbarOptionChainCustomizationBinding(ConstraintLayout constraintLayout) {
        this.rootView = constraintLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ToolbarOptionChainCustomizationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ToolbarOptionChainCustomizationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.toolbar_option_chain_customization, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ToolbarOptionChainCustomizationBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ToolbarOptionChainCustomizationBinding((ConstraintLayout) view);
    }
}
