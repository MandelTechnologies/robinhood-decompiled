package com.robinhood.android.securitycenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.securitycenter.C28186R;

/* loaded from: classes5.dex */
public final class FragmentDeviceDetailsBinding implements ViewBinding {
    public final RdsRowView deviceDetailsDeviceTypeRow;
    public final RdsRowView deviceDetailsLastSeenRow;
    public final RdsRowView deviceDetailsLocationRow;
    public final RdsPogView deviceDetailsPogView;
    public final RdsButton deviceDetailsRemoveDeviceCta;
    public final RhTextView deviceDetailsTitle;
    private final ScrollView rootView;

    private FragmentDeviceDetailsBinding(ScrollView scrollView, RdsRowView rdsRowView, RdsRowView rdsRowView2, RdsRowView rdsRowView3, RdsPogView rdsPogView, RdsButton rdsButton, RhTextView rhTextView) {
        this.rootView = scrollView;
        this.deviceDetailsDeviceTypeRow = rdsRowView;
        this.deviceDetailsLastSeenRow = rdsRowView2;
        this.deviceDetailsLocationRow = rdsRowView3;
        this.deviceDetailsPogView = rdsPogView;
        this.deviceDetailsRemoveDeviceCta = rdsButton;
        this.deviceDetailsTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentDeviceDetailsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDeviceDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28186R.layout.fragment_device_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDeviceDetailsBinding bind(View view) {
        int i = C28186R.id.device_details_device_type_row;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C28186R.id.device_details_last_seen_row;
            RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView2 != null) {
                i = C28186R.id.device_details_location_row;
                RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView3 != null) {
                    i = C28186R.id.device_details_pog_view;
                    RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
                    if (rdsPogView != null) {
                        i = C28186R.id.device_details_remove_device_cta;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C28186R.id.device_details_title;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                return new FragmentDeviceDetailsBinding((ScrollView) view, rdsRowView, rdsRowView2, rdsRowView3, rdsPogView, rdsButton, rhTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
