package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.optionschain.C24135R;

/* loaded from: classes11.dex */
public final class ToolbarOptionChainFragmentBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final ComposeView toolbarComposeView;

    private ToolbarOptionChainFragmentBinding(ConstraintLayout constraintLayout, ComposeView composeView) {
        this.rootView = constraintLayout;
        this.toolbarComposeView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ToolbarOptionChainFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ToolbarOptionChainFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.toolbar_option_chain_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ToolbarOptionChainFragmentBinding bind(View view) {
        int i = C24135R.id.toolbar_compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            return new ToolbarOptionChainFragmentBinding((ConstraintLayout) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
