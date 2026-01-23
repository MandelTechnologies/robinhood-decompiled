package com.robinhood.android.rhy.cardactivation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhy.cardactivation.C27358R;

/* loaded from: classes5.dex */
public final class FragmentCardActivationSuccessBinding implements ViewBinding {
    public final RdsButton cardActivationActionBtn;
    public final ImageView cardActivationDebitCardView;
    public final ImageView cardActivationGooglePayImageView;
    public final RdsButton cardActivationLaterBtn;
    public final RhTextView cardActivationSuccessHeader;
    public final RhTextView cardActivationSuccessSubheader;
    private final ConstraintLayout rootView;

    private FragmentCardActivationSuccessBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, ImageView imageView, ImageView imageView2, RdsButton rdsButton2, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.cardActivationActionBtn = rdsButton;
        this.cardActivationDebitCardView = imageView;
        this.cardActivationGooglePayImageView = imageView2;
        this.cardActivationLaterBtn = rdsButton2;
        this.cardActivationSuccessHeader = rhTextView;
        this.cardActivationSuccessSubheader = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCardActivationSuccessBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCardActivationSuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27358R.layout.fragment_card_activation_success, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCardActivationSuccessBinding bind(View view) {
        int i = C27358R.id.card_activation_action_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C27358R.id.card_activation_debit_card_view;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C27358R.id.card_activation_google_pay_image_view;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C27358R.id.card_activation_later_btn;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        i = C27358R.id.card_activation_success_header;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C27358R.id.card_activation_success_subheader;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                return new FragmentCardActivationSuccessBinding((ConstraintLayout) view, rdsButton, imageView, imageView2, rdsButton2, rhTextView, rhTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
