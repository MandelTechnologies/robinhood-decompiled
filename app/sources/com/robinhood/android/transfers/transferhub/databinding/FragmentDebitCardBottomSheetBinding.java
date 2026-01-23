package com.robinhood.android.transfers.transferhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.transferhub.C30556R;

/* loaded from: classes9.dex */
public final class FragmentDebitCardBottomSheetBinding implements ViewBinding {
    public final RecyclerView debitCardActions;
    public final RdsButton dismissButton;
    public final RhTextView primaryText;
    private final LinearLayout rootView;
    public final RhTextView secondaryText;

    private FragmentDebitCardBottomSheetBinding(LinearLayout linearLayout, RecyclerView recyclerView, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.debitCardActions = recyclerView;
        this.dismissButton = rdsButton;
        this.primaryText = rhTextView;
        this.secondaryText = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDebitCardBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDebitCardBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30556R.layout.fragment_debit_card_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDebitCardBottomSheetBinding bind(View view) {
        int i = C30556R.id.debit_card_actions;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C30556R.id.dismiss_button;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C30556R.id.primary_text;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C30556R.id.secondary_text;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentDebitCardBottomSheetBinding((LinearLayout) view, recyclerView, rdsButton, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
