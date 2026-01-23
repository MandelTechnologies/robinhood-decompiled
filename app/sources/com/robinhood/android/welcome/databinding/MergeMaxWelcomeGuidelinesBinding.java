package com.robinhood.android.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.welcome.C31456R;

/* loaded from: classes9.dex */
public final class MergeMaxWelcomeGuidelinesBinding implements ViewBinding {
    public final Guideline maxWelcomeFeatureTopGuideline;
    public final Guideline maxWelcomeTopGuideline;
    private final View rootView;

    private MergeMaxWelcomeGuidelinesBinding(View view, Guideline guideline, Guideline guideline2) {
        this.rootView = view;
        this.maxWelcomeFeatureTopGuideline = guideline;
        this.maxWelcomeTopGuideline = guideline2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeMaxWelcomeGuidelinesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C31456R.layout.merge_max_welcome_guidelines, viewGroup);
        return bind(viewGroup);
    }

    public static MergeMaxWelcomeGuidelinesBinding bind(View view) {
        int i = C31456R.id.max_welcome_feature_top_guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = C31456R.id.max_welcome_top_guideline;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline2 != null) {
                return new MergeMaxWelcomeGuidelinesBinding(view, guideline, guideline2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
