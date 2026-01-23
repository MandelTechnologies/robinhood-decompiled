package com.robinhood.android.common.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentProfitAndLossEducationBinding implements ViewBinding {
    public final RhTextView profitLossEducationDisclosure;
    public final LottieAnimationView profitLossEducationLottie;
    private final ScrollView rootView;

    private FragmentProfitAndLossEducationBinding(ScrollView scrollView, RhTextView rhTextView, LottieAnimationView lottieAnimationView) {
        this.rootView = scrollView;
        this.profitLossEducationDisclosure = rhTextView;
        this.profitLossEducationLottie = lottieAnimationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentProfitAndLossEducationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentProfitAndLossEducationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11303R.layout.fragment_profit_and_loss_education, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentProfitAndLossEducationBinding bind(View view) {
        int i = C11303R.id.profit_loss_education_disclosure;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11303R.id.profit_loss_education_lottie;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                return new FragmentProfitAndLossEducationBinding((ScrollView) view, rhTextView, lottieAnimationView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
