package com.robinhood.android.transfers.ach.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DateSelectionView;

/* loaded from: classes9.dex */
public final class FragmentSetDepositScheduleBinding implements ViewBinding {
    public final RhTextView depositScheduleDateLabel;
    public final RecyclerView depositScheduleRecyclerView;
    public final DateSelectionView depositScheduleSelectionDatePicker;
    private final LinearLayout rootView;
    public final RdsButton scheduleAutomaticDepositBtn;
    public final RhTextView setDepositScheduleTitle;

    private FragmentSetDepositScheduleBinding(LinearLayout linearLayout, RhTextView rhTextView, RecyclerView recyclerView, DateSelectionView dateSelectionView, RdsButton rdsButton, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.depositScheduleDateLabel = rhTextView;
        this.depositScheduleRecyclerView = recyclerView;
        this.depositScheduleSelectionDatePicker = dateSelectionView;
        this.scheduleAutomaticDepositBtn = rdsButton;
        this.setDepositScheduleTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSetDepositScheduleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSetDepositScheduleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30082R.layout.fragment_set_deposit_schedule, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSetDepositScheduleBinding bind(View view) {
        int i = C30082R.id.deposit_schedule_date_label;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C30082R.id.deposit_schedule_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C30082R.id.deposit_schedule_selection_date_picker;
                DateSelectionView dateSelectionView = (DateSelectionView) ViewBindings.findChildViewById(view, i);
                if (dateSelectionView != null) {
                    i = C30082R.id.schedule_automatic_deposit_btn;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C30082R.id.set_deposit_schedule_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentSetDepositScheduleBinding((LinearLayout) view, rhTextView, recyclerView, dateSelectionView, rdsButton, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
