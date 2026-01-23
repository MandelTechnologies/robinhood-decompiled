package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentTransferFundsBottomSheetBinding implements ViewBinding {
    public final RhTextView disclosureTxt;
    public final RdsButton quickTransfer20;
    public final RdsButton quickTransfer50;
    public final RdsButton quickTransferOther;
    private final LinearLayout rootView;
    public final RdsButton skipBtn;
    public final RhTextView transferFundsBody;
    public final LinearLayoutCompat transferFundsQuickActions;
    public final RhTextView transferFundsTitle;

    private FragmentTransferFundsBottomSheetBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsButton rdsButton, RdsButton rdsButton2, RdsButton rdsButton3, RdsButton rdsButton4, RhTextView rhTextView2, LinearLayoutCompat linearLayoutCompat, RhTextView rhTextView3) {
        this.rootView = linearLayout;
        this.disclosureTxt = rhTextView;
        this.quickTransfer20 = rdsButton;
        this.quickTransfer50 = rdsButton2;
        this.quickTransferOther = rdsButton3;
        this.skipBtn = rdsButton4;
        this.transferFundsBody = rhTextView2;
        this.transferFundsQuickActions = linearLayoutCompat;
        this.transferFundsTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTransferFundsBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTransferFundsBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10285R.layout.fragment_transfer_funds_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTransferFundsBottomSheetBinding bind(View view) {
        int i = C10285R.id.disclosure_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C10285R.id.quick_transfer_20;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C10285R.id.quick_transfer_50;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    i = C10285R.id.quick_transfer_other;
                    RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton3 != null) {
                        i = C10285R.id.skip_btn;
                        RdsButton rdsButton4 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton4 != null) {
                            i = C10285R.id.transfer_funds_body;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C10285R.id.transfer_funds_quick_actions;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat != null) {
                                    i = C10285R.id.transfer_funds_title;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        return new FragmentTransferFundsBottomSheetBinding((LinearLayout) view, rhTextView, rdsButton, rdsButton2, rdsButton3, rdsButton4, rhTextView2, linearLayoutCompat, rhTextView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
