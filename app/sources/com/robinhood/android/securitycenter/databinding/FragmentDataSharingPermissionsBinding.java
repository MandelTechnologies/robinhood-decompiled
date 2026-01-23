package com.robinhood.android.securitycenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.securitycenter.C28186R;

/* loaded from: classes5.dex */
public final class FragmentDataSharingPermissionsBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RdsButton settingsDataSharingPermissionsLearnMoreButton;
    public final RdsToggleView settingsDataSharingPermissionsToggle;

    private FragmentDataSharingPermissionsBinding(LinearLayout linearLayout, RdsButton rdsButton, RdsToggleView rdsToggleView) {
        this.rootView = linearLayout;
        this.settingsDataSharingPermissionsLearnMoreButton = rdsButton;
        this.settingsDataSharingPermissionsToggle = rdsToggleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDataSharingPermissionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDataSharingPermissionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28186R.layout.fragment_data_sharing_permissions, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDataSharingPermissionsBinding bind(View view) {
        int i = C28186R.id.settings_data_sharing_permissions_learn_more_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C28186R.id.settings_data_sharing_permissions_toggle;
            RdsToggleView rdsToggleView = (RdsToggleView) ViewBindings.findChildViewById(view, i);
            if (rdsToggleView != null) {
                return new FragmentDataSharingPermissionsBinding((LinearLayout) view, rdsButton, rdsToggleView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
