package com.robinhood.shared.posttransfer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.shared.posttransfer.C39496R;

/* loaded from: classes6.dex */
public final class FragmentTransferInstantAvailabilityBinding implements ViewBinding {
    public final RhTextView additionalDetailTxt;
    public final RhTextView detailTxt;
    public final RhTextView disclosureTxt;
    public final ClientComponentButtonView goldHookBtn;
    public final LottieAnimationView lottie;
    public final LottieAnimationView lottieBottom;
    public final RdsButton primaryBtn;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final RhTextView titleTxt;
    public final ConstraintLayout transferInstantDepositContainer;

    private FragmentTransferInstantAvailabilityBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, ClientComponentButtonView clientComponentButtonView, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, RdsButton rdsButton, ScrollView scrollView, RhTextView rhTextView4, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.additionalDetailTxt = rhTextView;
        this.detailTxt = rhTextView2;
        this.disclosureTxt = rhTextView3;
        this.goldHookBtn = clientComponentButtonView;
        this.lottie = lottieAnimationView;
        this.lottieBottom = lottieAnimationView2;
        this.primaryBtn = rdsButton;
        this.scrollView = scrollView;
        this.titleTxt = rhTextView4;
        this.transferInstantDepositContainer = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTransferInstantAvailabilityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTransferInstantAvailabilityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39496R.layout.fragment_transfer_instant_availability, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTransferInstantAvailabilityBinding bind(View view) {
        int i = C39496R.id.additional_detail_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C39496R.id.detail_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C39496R.id.disclosure_txt;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    i = C39496R.id.gold_hook_btn;
                    ClientComponentButtonView clientComponentButtonView = (ClientComponentButtonView) ViewBindings.findChildViewById(view, i);
                    if (clientComponentButtonView != null) {
                        i = C39496R.id.lottie;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView != null) {
                            i = C39496R.id.lottie_bottom;
                            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                            if (lottieAnimationView2 != null) {
                                i = C39496R.id.primary_btn;
                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton != null) {
                                    i = C39496R.id.scroll_view;
                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                    if (scrollView != null) {
                                        i = C39496R.id.title_txt;
                                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView4 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                            return new FragmentTransferInstantAvailabilityBinding(constraintLayout, rhTextView, rhTextView2, rhTextView3, clientComponentButtonView, lottieAnimationView, lottieAnimationView2, rdsButton, scrollView, rhTextView4, constraintLayout);
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
