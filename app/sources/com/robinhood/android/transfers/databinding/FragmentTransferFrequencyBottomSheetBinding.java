package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.C30065R;

/* loaded from: classes9.dex */
public final class FragmentTransferFrequencyBottomSheetBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RhTextView titleTxt;
    public final RdsRadioButtonRowView transferFrequencyBiweekly;
    public final RdsRadioButtonRowView transferFrequencyMonthly;
    public final RdsRadioButtonRowView transferFrequencyOnce;
    public final RdsRadioButtonRowView transferFrequencyQuarterly;
    public final NewRdsRadioGroup transferFrequencySelectionGroup;
    public final RdsRadioButtonRowView transferFrequencyWeekly;

    private FragmentTransferFrequencyBottomSheetBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsRadioButtonRowView rdsRadioButtonRowView, RdsRadioButtonRowView rdsRadioButtonRowView2, RdsRadioButtonRowView rdsRadioButtonRowView3, RdsRadioButtonRowView rdsRadioButtonRowView4, NewRdsRadioGroup newRdsRadioGroup, RdsRadioButtonRowView rdsRadioButtonRowView5) {
        this.rootView = linearLayout;
        this.titleTxt = rhTextView;
        this.transferFrequencyBiweekly = rdsRadioButtonRowView;
        this.transferFrequencyMonthly = rdsRadioButtonRowView2;
        this.transferFrequencyOnce = rdsRadioButtonRowView3;
        this.transferFrequencyQuarterly = rdsRadioButtonRowView4;
        this.transferFrequencySelectionGroup = newRdsRadioGroup;
        this.transferFrequencyWeekly = rdsRadioButtonRowView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTransferFrequencyBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTransferFrequencyBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30065R.layout.fragment_transfer_frequency_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTransferFrequencyBottomSheetBinding bind(View view) {
        int i = C30065R.id.title_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C30065R.id.transfer_frequency_biweekly;
            RdsRadioButtonRowView rdsRadioButtonRowView = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRadioButtonRowView != null) {
                i = C30065R.id.transfer_frequency_monthly;
                RdsRadioButtonRowView rdsRadioButtonRowView2 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRadioButtonRowView2 != null) {
                    i = C30065R.id.transfer_frequency_once;
                    RdsRadioButtonRowView rdsRadioButtonRowView3 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsRadioButtonRowView3 != null) {
                        i = C30065R.id.transfer_frequency_quarterly;
                        RdsRadioButtonRowView rdsRadioButtonRowView4 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsRadioButtonRowView4 != null) {
                            i = C30065R.id.transfer_frequency_selection_group;
                            NewRdsRadioGroup newRdsRadioGroup = (NewRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                            if (newRdsRadioGroup != null) {
                                i = C30065R.id.transfer_frequency_weekly;
                                RdsRadioButtonRowView rdsRadioButtonRowView5 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsRadioButtonRowView5 != null) {
                                    return new FragmentTransferFrequencyBottomSheetBinding((LinearLayout) view, rhTextView, rdsRadioButtonRowView, rdsRadioButtonRowView2, rdsRadioButtonRowView3, rdsRadioButtonRowView4, newRdsRadioGroup, rdsRadioButtonRowView5);
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
