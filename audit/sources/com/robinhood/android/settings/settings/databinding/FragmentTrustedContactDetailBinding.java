package com.robinhood.android.settings.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.settings.settings.C28321R;

/* loaded from: classes5.dex */
public final class FragmentTrustedContactDetailBinding implements ViewBinding {
    private final ScrollView rootView;
    public final ScrollView trustedAccountScrollView;
    public final RdsButton trustedContactDeleteCta;
    public final RdsDataRowView trustedContactRowAddress;
    public final RdsDataRowView trustedContactRowEmail;
    public final RdsDataRowView trustedContactRowName;
    public final RdsDataRowView trustedContactRowPhoneNumber;

    private FragmentTrustedContactDetailBinding(ScrollView scrollView, ScrollView scrollView2, RdsButton rdsButton, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4) {
        this.rootView = scrollView;
        this.trustedAccountScrollView = scrollView2;
        this.trustedContactDeleteCta = rdsButton;
        this.trustedContactRowAddress = rdsDataRowView;
        this.trustedContactRowEmail = rdsDataRowView2;
        this.trustedContactRowName = rdsDataRowView3;
        this.trustedContactRowPhoneNumber = rdsDataRowView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentTrustedContactDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTrustedContactDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28321R.layout.fragment_trusted_contact_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTrustedContactDetailBinding bind(View view) {
        ScrollView scrollView = (ScrollView) view;
        int i = C28321R.id.trusted_contact_delete_cta;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C28321R.id.trusted_contact_row_address;
            RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView != null) {
                i = C28321R.id.trusted_contact_row_email;
                RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView2 != null) {
                    i = C28321R.id.trusted_contact_row_name;
                    RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView3 != null) {
                        i = C28321R.id.trusted_contact_row_phone_number;
                        RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView4 != null) {
                            return new FragmentTrustedContactDetailBinding(scrollView, scrollView, rdsButton, rdsDataRowView, rdsDataRowView2, rdsDataRowView3, rdsDataRowView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
