package com.robinhood.android.trade.equity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.equity.C29365R;

/* loaded from: classes9.dex */
public final class FragmentOrderTimeInForceBinding implements ViewBinding {
    public final RdsButton continueButton;
    public final RhTextView detailTxt;
    public final RdsRadioButtonRowView gfdRow;
    public final RdsRadioButtonRowView gtcRow;
    public final NewRdsRadioGroup radioGroup;
    private final LinearLayout rootView;

    private FragmentOrderTimeInForceBinding(LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView, RdsRadioButtonRowView rdsRadioButtonRowView, RdsRadioButtonRowView rdsRadioButtonRowView2, NewRdsRadioGroup newRdsRadioGroup) {
        this.rootView = linearLayout;
        this.continueButton = rdsButton;
        this.detailTxt = rhTextView;
        this.gfdRow = rdsRadioButtonRowView;
        this.gtcRow = rdsRadioButtonRowView2;
        this.radioGroup = newRdsRadioGroup;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOrderTimeInForceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOrderTimeInForceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29365R.layout.fragment_order_time_in_force, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOrderTimeInForceBinding bind(View view) {
        int i = C29365R.id.continue_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C29365R.id.detail_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C29365R.id.gfd_row;
                RdsRadioButtonRowView rdsRadioButtonRowView = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRadioButtonRowView != null) {
                    i = C29365R.id.gtc_row;
                    RdsRadioButtonRowView rdsRadioButtonRowView2 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsRadioButtonRowView2 != null) {
                        i = C29365R.id.radio_group;
                        NewRdsRadioGroup newRdsRadioGroup = (NewRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                        if (newRdsRadioGroup != null) {
                            return new FragmentOrderTimeInForceBinding((LinearLayout) view, rdsButton, rhTextView, rdsRadioButtonRowView, rdsRadioButtonRowView2, newRdsRadioGroup);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
