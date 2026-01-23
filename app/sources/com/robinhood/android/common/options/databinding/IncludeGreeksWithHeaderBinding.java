package com.robinhood.android.common.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.options.views.OptionStrategyGreeksView;

/* loaded from: classes2.dex */
public final class IncludeGreeksWithHeaderBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final OptionStrategyGreeksView shoppingCartGreeks;

    private IncludeGreeksWithHeaderBinding(LinearLayout linearLayout, OptionStrategyGreeksView optionStrategyGreeksView) {
        this.rootView = linearLayout;
        this.shoppingCartGreeks = optionStrategyGreeksView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeGreeksWithHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeGreeksWithHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11303R.layout.include_greeks_with_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeGreeksWithHeaderBinding bind(View view) {
        int i = C11303R.id.shopping_cart_greeks;
        OptionStrategyGreeksView optionStrategyGreeksView = (OptionStrategyGreeksView) ViewBindings.findChildViewById(view, i);
        if (optionStrategyGreeksView != null) {
            return new IncludeGreeksWithHeaderBinding((LinearLayout) view, optionStrategyGreeksView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
