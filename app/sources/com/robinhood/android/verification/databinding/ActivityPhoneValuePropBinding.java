package com.robinhood.android.verification.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.verification.C31368R;

/* loaded from: classes9.dex */
public final class ActivityPhoneValuePropBinding implements ViewBinding {
    public final LottieAnimationView phoneAnimatedHeader;
    public final AppCompatImageView phoneStaticHeader;
    public final RdsRowView phoneValuePropOne;
    public final RhTextView phoneValuePropSubtitle;
    public final RdsRowView phoneValuePropTwo;
    private final LinearLayout rootView;

    private ActivityPhoneValuePropBinding(LinearLayout linearLayout, LottieAnimationView lottieAnimationView, AppCompatImageView appCompatImageView, RdsRowView rdsRowView, RhTextView rhTextView, RdsRowView rdsRowView2) {
        this.rootView = linearLayout;
        this.phoneAnimatedHeader = lottieAnimationView;
        this.phoneStaticHeader = appCompatImageView;
        this.phoneValuePropOne = rdsRowView;
        this.phoneValuePropSubtitle = rhTextView;
        this.phoneValuePropTwo = rdsRowView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPhoneValuePropBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPhoneValuePropBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31368R.layout.activity_phone_value_prop, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityPhoneValuePropBinding bind(View view) {
        int i = C31368R.id.phone_animated_header;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C31368R.id.phone_static_header;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C31368R.id.phone_value_prop_one;
                RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView != null) {
                    i = C31368R.id.phone_value_prop_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C31368R.id.phone_value_prop_two;
                        RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsRowView2 != null) {
                            return new ActivityPhoneValuePropBinding((LinearLayout) view, lottieAnimationView, appCompatImageView, rdsRowView, rhTextView, rdsRowView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
