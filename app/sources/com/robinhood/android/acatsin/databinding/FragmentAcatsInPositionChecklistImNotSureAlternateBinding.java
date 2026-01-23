package com.robinhood.android.acatsin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAcatsInPositionChecklistImNotSureAlternateBinding implements ViewBinding {
    public final RdsButton choosePartialsButton;
    public final RdsButton continueButton;
    public final LottieAnimationView lottieview;
    public final RhTextView positionChecklistAlternateMaybeText;
    public final RhTextView positionChecklistAlternateMaybeTitle;
    public final RdsTextButton reviewWhatsTransferableBtn;
    private final LinearLayout rootView;

    private FragmentAcatsInPositionChecklistImNotSureAlternateBinding(LinearLayout linearLayout, RdsButton rdsButton, RdsButton rdsButton2, LottieAnimationView lottieAnimationView, RhTextView rhTextView, RhTextView rhTextView2, RdsTextButton rdsTextButton) {
        this.rootView = linearLayout;
        this.choosePartialsButton = rdsButton;
        this.continueButton = rdsButton2;
        this.lottieview = lottieAnimationView;
        this.positionChecklistAlternateMaybeText = rhTextView;
        this.positionChecklistAlternateMaybeTitle = rhTextView2;
        this.reviewWhatsTransferableBtn = rdsTextButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInPositionChecklistImNotSureAlternateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInPositionChecklistImNotSureAlternateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7725R.layout.fragment_acats_in_position_checklist_im_not_sure_alternate, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInPositionChecklistImNotSureAlternateBinding bind(View view) {
        int i = C7725R.id.choose_partials_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C7725R.id.continue_button;
            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton2 != null) {
                i = C7725R.id.lottieview;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                if (lottieAnimationView != null) {
                    i = C7725R.id.position_checklist_alternate_maybe_text;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C7725R.id.position_checklist_alternate_maybe_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C7725R.id.review_whats_transferable_btn;
                            RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                            if (rdsTextButton != null) {
                                return new FragmentAcatsInPositionChecklistImNotSureAlternateBinding((LinearLayout) view, rdsButton, rdsButton2, lottieAnimationView, rhTextView, rhTextView2, rdsTextButton);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
