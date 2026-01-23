package com.robinhood.android.directipo.allocation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.C14171R;

/* loaded from: classes27.dex */
public final class FragmentCancelOrderDialogBinding implements ViewBinding {
    public final RdsButton cancelOrderBtn;
    public final RdsButton dismissBtn;
    private final LinearLayout rootView;
    public final RhTextView subtitle;

    private FragmentCancelOrderDialogBinding(LinearLayout linearLayout, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.cancelOrderBtn = rdsButton;
        this.dismissBtn = rdsButton2;
        this.subtitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCancelOrderDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCancelOrderDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14171R.layout.fragment_cancel_order_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCancelOrderDialogBinding bind(View view) {
        int i = C14171R.id.cancel_order_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C14171R.id.dismiss_btn;
            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton2 != null) {
                i = C14171R.id.subtitle;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    return new FragmentCancelOrderDialogBinding((LinearLayout) view, rdsButton, rdsButton2, rhTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
