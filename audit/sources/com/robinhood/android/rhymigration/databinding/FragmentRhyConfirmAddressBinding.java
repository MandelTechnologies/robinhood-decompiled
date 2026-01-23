package com.robinhood.android.rhymigration.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsSettingsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhymigration.C27577R;

/* loaded from: classes5.dex */
public final class FragmentRhyConfirmAddressBinding implements ViewBinding {
    public final RdsButton rhyConfirmAddressCta;
    public final RdsSettingsRowView rhyConfirmAddressRow;
    public final ScrollView rhyConfirmAddressScrollView;
    public final RhTextView rhyConfirmAddressSubtitle;
    public final RhTextView rhyConfirmAddressTitle;
    public final RdsSettingsRowView rhyConfirmShippingAddressRow;
    private final LinearLayout rootView;

    private FragmentRhyConfirmAddressBinding(LinearLayout linearLayout, RdsButton rdsButton, RdsSettingsRowView rdsSettingsRowView, ScrollView scrollView, RhTextView rhTextView, RhTextView rhTextView2, RdsSettingsRowView rdsSettingsRowView2) {
        this.rootView = linearLayout;
        this.rhyConfirmAddressCta = rdsButton;
        this.rhyConfirmAddressRow = rdsSettingsRowView;
        this.rhyConfirmAddressScrollView = scrollView;
        this.rhyConfirmAddressSubtitle = rhTextView;
        this.rhyConfirmAddressTitle = rhTextView2;
        this.rhyConfirmShippingAddressRow = rdsSettingsRowView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyConfirmAddressBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyConfirmAddressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27577R.layout.fragment_rhy_confirm_address, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyConfirmAddressBinding bind(View view) {
        int i = C27577R.id.rhy_confirm_address_cta;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C27577R.id.rhy_confirm_address_row;
            RdsSettingsRowView rdsSettingsRowView = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsSettingsRowView != null) {
                i = C27577R.id.rhy_confirm_address_scroll_view;
                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                if (scrollView != null) {
                    i = C27577R.id.rhy_confirm_address_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C27577R.id.rhy_confirm_address_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C27577R.id.rhy_confirm_shipping_address_row;
                            RdsSettingsRowView rdsSettingsRowView2 = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsSettingsRowView2 != null) {
                                return new FragmentRhyConfirmAddressBinding((LinearLayout) view, rdsButton, rdsSettingsRowView, scrollView, rhTextView, rhTextView2, rdsSettingsRowView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
