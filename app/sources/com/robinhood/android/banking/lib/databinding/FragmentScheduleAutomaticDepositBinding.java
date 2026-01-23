package com.robinhood.android.banking.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentScheduleAutomaticDepositBinding implements ViewBinding {
    public final RdsButton automaticDepositConfirmBtn;
    public final RhTextView automaticDepositExplanationTxt;
    public final ListView automaticDepositList;
    private final LinearLayout rootView;

    private FragmentScheduleAutomaticDepositBinding(LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView, ListView listView) {
        this.rootView = linearLayout;
        this.automaticDepositConfirmBtn = rdsButton;
        this.automaticDepositExplanationTxt = rhTextView;
        this.automaticDepositList = listView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentScheduleAutomaticDepositBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentScheduleAutomaticDepositBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C9631R.layout.fragment_schedule_automatic_deposit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentScheduleAutomaticDepositBinding bind(View view) {
        int i = C9631R.id.automatic_deposit_confirm_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C9631R.id.automatic_deposit_explanation_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C9631R.id.automatic_deposit_list;
                ListView listView = (ListView) ViewBindings.findChildViewById(view, i);
                if (listView != null) {
                    return new FragmentScheduleAutomaticDepositBinding((LinearLayout) view, rdsButton, rhTextView, listView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
