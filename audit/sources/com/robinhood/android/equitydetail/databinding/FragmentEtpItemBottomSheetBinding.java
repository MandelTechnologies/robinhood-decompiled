package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class FragmentEtpItemBottomSheetBinding implements ViewBinding {
    public final RhTextView etpCompositionItemDescription;
    public final RdsButton etpCompositionItemDismissButton;
    public final RhTextView etpCompositionItemTitle;
    public final RdsButton etpCompositionItemViewButton;
    private final LinearLayout rootView;

    private FragmentEtpItemBottomSheetBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsButton rdsButton, RhTextView rhTextView2, RdsButton rdsButton2) {
        this.rootView = linearLayout;
        this.etpCompositionItemDescription = rhTextView;
        this.etpCompositionItemDismissButton = rdsButton;
        this.etpCompositionItemTitle = rhTextView2;
        this.etpCompositionItemViewButton = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEtpItemBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEtpItemBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.fragment_etp_item_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEtpItemBottomSheetBinding bind(View view) {
        int i = C15314R.id.etp_composition_item_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C15314R.id.etp_composition_item_dismiss_button;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C15314R.id.etp_composition_item_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C15314R.id.etp_composition_item_view_button;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        return new FragmentEtpItemBottomSheetBinding((LinearLayout) view, rhTextView, rdsButton, rhTextView2, rdsButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
