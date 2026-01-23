package com.robinhood.android.debitcard.linking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.debitcard.linking.C13894R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentDebitCardVerificationIntroBinding implements ViewBinding {
    public final ConstraintLayout content;
    public final RhTextView footer;
    public final ImageView image;
    public final RdsButton primaryButton;
    private final LinearLayout rootView;
    public final RdsButton secondaryButton;
    public final RhTextView subtitle;
    public final RhTextView title;

    private FragmentDebitCardVerificationIntroBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout, RhTextView rhTextView, ImageView imageView, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = linearLayout;
        this.content = constraintLayout;
        this.footer = rhTextView;
        this.image = imageView;
        this.primaryButton = rdsButton;
        this.secondaryButton = rdsButton2;
        this.subtitle = rhTextView2;
        this.title = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDebitCardVerificationIntroBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDebitCardVerificationIntroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C13894R.layout.fragment_debit_card_verification_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDebitCardVerificationIntroBinding bind(View view) {
        int i = C13894R.id.content;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C13894R.id.footer;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C13894R.id.image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C13894R.id.primary_button;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C13894R.id.secondary_button;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            i = C13894R.id.subtitle;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C13894R.id.title;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    return new FragmentDebitCardVerificationIntroBinding((LinearLayout) view, constraintLayout, rhTextView, imageView, rdsButton, rdsButton2, rhTextView2, rhTextView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
