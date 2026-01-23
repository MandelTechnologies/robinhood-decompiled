package com.robinhood.android.resumeapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.resumeapplication.C26935R;

/* loaded from: classes5.dex */
public final class FragmentResumeApplicationSplashBinding implements ViewBinding {
    public final ImageView resumeApplicationHand;
    public final RhTextView resumeApplicationSplashTitle;
    private final MotionLayout rootView;

    private FragmentResumeApplicationSplashBinding(MotionLayout motionLayout, ImageView imageView, RhTextView rhTextView) {
        this.rootView = motionLayout;
        this.resumeApplicationHand = imageView;
        this.resumeApplicationSplashTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MotionLayout getRoot() {
        return this.rootView;
    }

    public static FragmentResumeApplicationSplashBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentResumeApplicationSplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C26935R.layout.fragment_resume_application_splash, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentResumeApplicationSplashBinding bind(View view) {
        int i = C26935R.id.resume_application_hand;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C26935R.id.resume_application_splash_title;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new FragmentResumeApplicationSplashBinding((MotionLayout) view, imageView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
