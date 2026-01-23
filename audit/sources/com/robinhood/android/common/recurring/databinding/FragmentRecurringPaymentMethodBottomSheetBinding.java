package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentRecurringPaymentMethodBottomSheetBinding implements ViewBinding {
    public final RhTextView paymentMethodBottomSheetDisclaimer;
    public final RhTextView paymentMethodBottomSheetTitle;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;

    private FragmentRecurringPaymentMethodBottomSheetBinding(LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.paymentMethodBottomSheetDisclaimer = rhTextView;
        this.paymentMethodBottomSheetTitle = rhTextView2;
        this.recyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecurringPaymentMethodBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecurringPaymentMethodBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.fragment_recurring_payment_method_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecurringPaymentMethodBottomSheetBinding bind(View view) {
        int i = C11595R.id.payment_method_bottom_sheet_disclaimer;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11595R.id.payment_method_bottom_sheet_title;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C11595R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new FragmentRecurringPaymentMethodBottomSheetBinding((LinearLayout) view, rhTextView, rhTextView2, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
