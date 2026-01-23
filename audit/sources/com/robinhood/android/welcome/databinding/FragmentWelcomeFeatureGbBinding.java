package com.robinhood.android.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.welcome.C31456R;

/* loaded from: classes9.dex */
public final class FragmentWelcomeFeatureGbBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final IncludeMaxWelcomeBottomSheetBinding welcomeFeatureBottomSheet;
    public final ImageView welcomeFeatureImage;
    public final FrameLayout welcomeFeatureTopHalf;

    private FragmentWelcomeFeatureGbBinding(ConstraintLayout constraintLayout, IncludeMaxWelcomeBottomSheetBinding includeMaxWelcomeBottomSheetBinding, ImageView imageView, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.welcomeFeatureBottomSheet = includeMaxWelcomeBottomSheetBinding;
        this.welcomeFeatureImage = imageView;
        this.welcomeFeatureTopHalf = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWelcomeFeatureGbBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWelcomeFeatureGbBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31456R.layout.fragment_welcome_feature_gb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentWelcomeFeatureGbBinding bind(View view) {
        int i = C31456R.id.welcome_feature_bottom_sheet;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            IncludeMaxWelcomeBottomSheetBinding includeMaxWelcomeBottomSheetBindingBind = IncludeMaxWelcomeBottomSheetBinding.bind(viewFindChildViewById);
            int i2 = C31456R.id.welcome_feature_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView != null) {
                i2 = C31456R.id.welcome_feature_top_half;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i2);
                if (frameLayout != null) {
                    return new FragmentWelcomeFeatureGbBinding((ConstraintLayout) view, includeMaxWelcomeBottomSheetBindingBind, imageView, frameLayout);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
