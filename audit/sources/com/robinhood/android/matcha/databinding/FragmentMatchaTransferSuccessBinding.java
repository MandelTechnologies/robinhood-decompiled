package com.robinhood.android.matcha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.matcha.C21284R;

/* loaded from: classes8.dex */
public final class FragmentMatchaTransferSuccessBinding implements ViewBinding {
    public final RdsButton doneButton;
    private final LinearLayout rootView;
    public final LottieAnimationView successLottie;
    public final RhTextView successSubtitle;
    public final RhTextView successText;

    private FragmentMatchaTransferSuccessBinding(LinearLayout linearLayout, RdsButton rdsButton, LottieAnimationView lottieAnimationView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.doneButton = rdsButton;
        this.successLottie = lottieAnimationView;
        this.successSubtitle = rhTextView;
        this.successText = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMatchaTransferSuccessBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMatchaTransferSuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C21284R.layout.fragment_matcha_transfer_success, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMatchaTransferSuccessBinding bind(View view) {
        int i = C21284R.id.done_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C21284R.id.success_lottie;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C21284R.id.success_subtitle;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C21284R.id.success_text;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentMatchaTransferSuccessBinding((LinearLayout) view, rdsButton, lottieAnimationView, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
