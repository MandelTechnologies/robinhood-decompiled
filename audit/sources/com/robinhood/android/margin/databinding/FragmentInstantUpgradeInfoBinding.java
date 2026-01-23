package com.robinhood.android.margin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.margin.C20999R;

/* loaded from: classes8.dex */
public final class FragmentInstantUpgradeInfoBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final RdsButton shareBtn;

    private FragmentInstantUpgradeInfoBinding(ConstraintLayout constraintLayout, RdsButton rdsButton) {
        this.rootView = constraintLayout;
        this.shareBtn = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInstantUpgradeInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInstantUpgradeInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20999R.layout.fragment_instant_upgrade_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInstantUpgradeInfoBinding bind(View view) {
        int i = C20999R.id.share_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            return new FragmentInstantUpgradeInfoBinding((ConstraintLayout) view, rdsButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
