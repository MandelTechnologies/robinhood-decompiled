package com.robinhood.android.optionsrolling.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsrolling.C24772R;

/* loaded from: classes11.dex */
public final class MenuItemRiskDisclosureBinding implements ViewBinding {
    private final RhTextView rootView;

    private MenuItemRiskDisclosureBinding(RhTextView rhTextView) {
        this.rootView = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static MenuItemRiskDisclosureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MenuItemRiskDisclosureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24772R.layout.menu_item_risk_disclosure, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MenuItemRiskDisclosureBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new MenuItemRiskDisclosureBinding((RhTextView) view);
    }
}
