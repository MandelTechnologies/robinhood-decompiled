package com.robinhood.android.acatsin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAcatsInConfirmAccountNameBinding implements ViewBinding {
    public final RhTextView accountName;
    public final RhTextView accountNameMustMatchMessage;
    public final ImageView arrowRight;
    public final LinearLayout brokerChipsContainer;
    public final RhTextView confirmAccountNameTitle;
    public final RdsButton continueButton;
    public final ImageView contraBrokerChip;
    public final RdsButton nameDoesntMatchButton;
    public final ImageView robinhoodBrokerChip;
    private final ConstraintLayout rootView;

    private FragmentAcatsInConfirmAccountNameBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, ImageView imageView, LinearLayout linearLayout, RhTextView rhTextView3, RdsButton rdsButton, ImageView imageView2, RdsButton rdsButton2, ImageView imageView3) {
        this.rootView = constraintLayout;
        this.accountName = rhTextView;
        this.accountNameMustMatchMessage = rhTextView2;
        this.arrowRight = imageView;
        this.brokerChipsContainer = linearLayout;
        this.confirmAccountNameTitle = rhTextView3;
        this.continueButton = rdsButton;
        this.contraBrokerChip = imageView2;
        this.nameDoesntMatchButton = rdsButton2;
        this.robinhoodBrokerChip = imageView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInConfirmAccountNameBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInConfirmAccountNameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7725R.layout.fragment_acats_in_confirm_account_name, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInConfirmAccountNameBinding bind(View view) {
        int i = C7725R.id.account_name;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C7725R.id.account_name_must_match_message;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C7725R.id.arrow_right;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C7725R.id.broker_chips_container;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C7725R.id.confirm_account_name_title;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C7725R.id.continue_button;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                i = C7725R.id.contra_broker_chip;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = C7725R.id.name_doesnt_match_button;
                                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsButton2 != null) {
                                        i = C7725R.id.robinhood_broker_chip;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView3 != null) {
                                            return new FragmentAcatsInConfirmAccountNameBinding((ConstraintLayout) view, rhTextView, rhTextView2, imageView, linearLayout, rhTextView3, rdsButton, imageView2, rdsButton2, imageView3);
                                        }
                                    }
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
