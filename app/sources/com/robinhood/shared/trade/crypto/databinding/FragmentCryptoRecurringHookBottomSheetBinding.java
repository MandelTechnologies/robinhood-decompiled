package com.robinhood.shared.trade.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes12.dex */
public final class FragmentCryptoRecurringHookBottomSheetBinding implements ViewBinding {
    public final RdsButton cryptoOrderRecurringHookBtn;
    public final RhTextView cryptoOrderRecurringHookFooter;
    public final RecyclerView cryptoOrderRecurringHookRecyclerView;
    public final RhTextView cryptoOrderRecurringHookSubtitle;
    public final RhTextView cryptoOrderRecurringHookTitle;
    private final FocusSafeNestedScrollView rootView;

    private FragmentCryptoRecurringHookBottomSheetBinding(FocusSafeNestedScrollView focusSafeNestedScrollView, RdsButton rdsButton, RhTextView rhTextView, RecyclerView recyclerView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = focusSafeNestedScrollView;
        this.cryptoOrderRecurringHookBtn = rdsButton;
        this.cryptoOrderRecurringHookFooter = rhTextView;
        this.cryptoOrderRecurringHookRecyclerView = recyclerView;
        this.cryptoOrderRecurringHookSubtitle = rhTextView2;
        this.cryptoOrderRecurringHookTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FocusSafeNestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentCryptoRecurringHookBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCryptoRecurringHookBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C40095R.layout.fragment_crypto_recurring_hook_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCryptoRecurringHookBottomSheetBinding bind(View view) {
        int i = C40095R.id.crypto_order_recurring_hook_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C40095R.id.crypto_order_recurring_hook_footer;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C40095R.id.crypto_order_recurring_hook_recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C40095R.id.crypto_order_recurring_hook_subtitle;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C40095R.id.crypto_order_recurring_hook_title;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            return new FragmentCryptoRecurringHookBottomSheetBinding((FocusSafeNestedScrollView) view, rdsButton, rhTextView, recyclerView, rhTextView2, rhTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
