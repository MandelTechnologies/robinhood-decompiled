package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentRecurringOrderPaycheckSourceBinding implements ViewBinding {
    public final RdsButton paycheckSourceSelectedButton;
    public final RhTextView paycheckSourceTitleText;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;

    private FragmentRecurringOrderPaycheckSourceBinding(LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.paycheckSourceSelectedButton = rdsButton;
        this.paycheckSourceTitleText = rhTextView;
        this.recyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecurringOrderPaycheckSourceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecurringOrderPaycheckSourceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.fragment_recurring_order_paycheck_source, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecurringOrderPaycheckSourceBinding bind(View view) {
        int i = C11595R.id.paycheck_source_selected_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C11595R.id.paycheck_source_title_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C11595R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new FragmentRecurringOrderPaycheckSourceBinding((LinearLayout) view, rdsButton, rhTextView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
