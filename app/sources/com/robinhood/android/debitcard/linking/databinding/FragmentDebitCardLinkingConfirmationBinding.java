package com.robinhood.android.debitcard.linking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.debitcard.linking.C13894R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentDebitCardLinkingConfirmationBinding implements ViewBinding {
    public final RhTextView confirmationSubtitle;
    public final RhTextView confirmationTitle;
    public final RdsButton primaryButton;
    private final FrameLayout rootView;
    public final RdsButton secondaryButton;

    private FragmentDebitCardLinkingConfirmationBinding(FrameLayout frameLayout, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton, RdsButton rdsButton2) {
        this.rootView = frameLayout;
        this.confirmationSubtitle = rhTextView;
        this.confirmationTitle = rhTextView2;
        this.primaryButton = rdsButton;
        this.secondaryButton = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDebitCardLinkingConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDebitCardLinkingConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C13894R.layout.fragment_debit_card_linking_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDebitCardLinkingConfirmationBinding bind(View view) {
        int i = C13894R.id.confirmation_subtitle;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C13894R.id.confirmation_title;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C13894R.id.primary_button;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C13894R.id.secondary_button;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        return new FragmentDebitCardLinkingConfirmationBinding((FrameLayout) view, rhTextView, rhTextView2, rdsButton, rdsButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
