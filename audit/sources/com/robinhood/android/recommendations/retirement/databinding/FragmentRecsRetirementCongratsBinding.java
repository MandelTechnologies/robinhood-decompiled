package com.robinhood.android.recommendations.retirement.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.retirement.C26015R;

/* loaded from: classes11.dex */
public final class FragmentRecsRetirementCongratsBinding implements ViewBinding {
    public final RdsButton doneBtn;
    public final LottieAnimationView lottie;
    private final LinearLayout rootView;
    public final RhTextView subtitleTxt;
    public final RhTextView titleTxt;

    private FragmentRecsRetirementCongratsBinding(LinearLayout linearLayout, RdsButton rdsButton, LottieAnimationView lottieAnimationView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.doneBtn = rdsButton;
        this.lottie = lottieAnimationView;
        this.subtitleTxt = rhTextView;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecsRetirementCongratsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecsRetirementCongratsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C26015R.layout.fragment_recs_retirement_congrats, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecsRetirementCongratsBinding bind(View view) {
        int i = C26015R.id.done_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C26015R.id.lottie;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C26015R.id.subtitle_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C26015R.id.title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentRecsRetirementCongratsBinding((LinearLayout) view, rdsButton, lottieAnimationView, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
