package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class DialogRecurringCryptoDisclosureBinding implements ViewBinding {
    public final RhTextView dialogFragmentMessage;
    public final RdsButton dialogFragmentPositiveBtn;
    public final RhTextView dialogFragmentTitle;
    private final LinearLayout rootView;

    private DialogRecurringCryptoDisclosureBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsButton rdsButton, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.dialogFragmentMessage = rhTextView;
        this.dialogFragmentPositiveBtn = rdsButton;
        this.dialogFragmentTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogRecurringCryptoDisclosureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogRecurringCryptoDisclosureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.dialog_recurring_crypto_disclosure, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogRecurringCryptoDisclosureBinding bind(View view) {
        int i = C11595R.id.dialog_fragment_message;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11595R.id.dialog_fragment_positive_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C11595R.id.dialog_fragment_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new DialogRecurringCryptoDisclosureBinding((LinearLayout) view, rhTextView, rdsButton, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
