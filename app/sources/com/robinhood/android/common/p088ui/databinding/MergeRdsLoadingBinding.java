package com.robinhood.android.common.p088ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeRdsLoadingBinding implements ViewBinding {
    public final RhTextView loadingMessage;
    public final LottieAnimationView loadingSpinner;
    private final View rootView;

    private MergeRdsLoadingBinding(View view, RhTextView rhTextView, LottieAnimationView lottieAnimationView) {
        this.rootView = view;
        this.loadingMessage = rhTextView;
        this.loadingSpinner = lottieAnimationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRdsLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11839R.layout.merge_rds_loading, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRdsLoadingBinding bind(View view) {
        int i = C11839R.id.loading_message;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11839R.id.loading_spinner;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                return new MergeRdsLoadingBinding(view, rhTextView, lottieAnimationView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
