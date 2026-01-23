package com.robinhood.android.transfers.ach.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.ach.C30082R;

/* loaded from: classes9.dex */
public final class FragmentAchTransferConfirmationBinding implements ViewBinding {
    public final LinearLayout accountInfo;
    public final RhTextView accountNameTxt;
    public final RhTextView amountTxt;
    public final LottieAnimationView confirmationAnimationView;
    public final LinearLayout confirmationCheckmarkImage;
    public final RhTextView currentBalanceTxt;
    public final RdsButton detailButton;
    public final RhTextView detailText;
    public final RhTextView disclaimerText;
    public final RdsButton doneButton;
    private final ConstraintLayout rootView;
    public final RhTextView titleText;

    private FragmentAchTransferConfirmationBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, LottieAnimationView lottieAnimationView, LinearLayout linearLayout2, RhTextView rhTextView3, RdsButton rdsButton, RhTextView rhTextView4, RhTextView rhTextView5, RdsButton rdsButton2, RhTextView rhTextView6) {
        this.rootView = constraintLayout;
        this.accountInfo = linearLayout;
        this.accountNameTxt = rhTextView;
        this.amountTxt = rhTextView2;
        this.confirmationAnimationView = lottieAnimationView;
        this.confirmationCheckmarkImage = linearLayout2;
        this.currentBalanceTxt = rhTextView3;
        this.detailButton = rdsButton;
        this.detailText = rhTextView4;
        this.disclaimerText = rhTextView5;
        this.doneButton = rdsButton2;
        this.titleText = rhTextView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAchTransferConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAchTransferConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30082R.layout.fragment_ach_transfer_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAchTransferConfirmationBinding bind(View view) {
        int i = C30082R.id.account_info;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C30082R.id.account_name_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C30082R.id.amount_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C30082R.id.confirmation_animation_view;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView != null) {
                        i = C30082R.id.confirmation_checkmark_image;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = C30082R.id.current_balance_txt;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C30082R.id.detail_button;
                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton != null) {
                                    i = C30082R.id.detail_text;
                                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView4 != null) {
                                        i = C30082R.id.disclaimer_text;
                                        RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView5 != null) {
                                            i = C30082R.id.done_button;
                                            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                            if (rdsButton2 != null) {
                                                i = C30082R.id.title_text;
                                                RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView6 != null) {
                                                    return new FragmentAchTransferConfirmationBinding((ConstraintLayout) view, linearLayout, rhTextView, rhTextView2, lottieAnimationView, linearLayout2, rhTextView3, rdsButton, rhTextView4, rhTextView5, rdsButton2, rhTextView6);
                                                }
                                            }
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
