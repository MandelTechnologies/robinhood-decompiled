package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.button.RdsButton;

/* loaded from: classes2.dex */
public final class FragmentBottomSheetPrimaryButtonBinding implements ViewBinding {
    public final RdsButton bottomSheetPrimaryBtnStyle;
    private final RdsButton rootView;

    private FragmentBottomSheetPrimaryButtonBinding(RdsButton rdsButton, RdsButton rdsButton2) {
        this.rootView = rdsButton;
        this.bottomSheetPrimaryBtnStyle = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsButton getRoot() {
        return this.rootView;
    }

    public static FragmentBottomSheetPrimaryButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBottomSheetPrimaryButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.fragment_bottom_sheet_primary_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBottomSheetPrimaryButtonBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RdsButton rdsButton = (RdsButton) view;
        return new FragmentBottomSheetPrimaryButtonBinding(rdsButton, rdsButton);
    }
}
