package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.dropdown.RdsDropdown;
import com.robinhood.android.optionschain.C24135R;

/* loaded from: classes11.dex */
public final class IncludeDefaultPriceDropdownBinding implements ViewBinding {
    public final RdsDropdown defaultPriceDropdown;
    private final RdsDropdown rootView;

    private IncludeDefaultPriceDropdownBinding(RdsDropdown rdsDropdown, RdsDropdown rdsDropdown2) {
        this.rootView = rdsDropdown;
        this.defaultPriceDropdown = rdsDropdown2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsDropdown getRoot() {
        return this.rootView;
    }

    public static IncludeDefaultPriceDropdownBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDefaultPriceDropdownBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.include_default_price_dropdown, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDefaultPriceDropdownBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RdsDropdown rdsDropdown = (RdsDropdown) view;
        return new IncludeDefaultPriceDropdownBinding(rdsDropdown, rdsDropdown);
    }
}
