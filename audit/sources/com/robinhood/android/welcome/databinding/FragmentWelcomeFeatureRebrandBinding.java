package com.robinhood.android.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.welcome.C31456R;

/* loaded from: classes9.dex */
public final class FragmentWelcomeFeatureRebrandBinding implements ViewBinding {
    public final IncludeMaxWelcomeBottomSheetRebrandBinding maxWelcomeFeatureBottomSheet;
    private final ConstraintLayout rootView;

    private FragmentWelcomeFeatureRebrandBinding(ConstraintLayout constraintLayout, IncludeMaxWelcomeBottomSheetRebrandBinding includeMaxWelcomeBottomSheetRebrandBinding) {
        this.rootView = constraintLayout;
        this.maxWelcomeFeatureBottomSheet = includeMaxWelcomeBottomSheetRebrandBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWelcomeFeatureRebrandBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWelcomeFeatureRebrandBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31456R.layout.fragment_welcome_feature_rebrand, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentWelcomeFeatureRebrandBinding bind(View view) {
        int i = C31456R.id.max_welcome_feature_bottom_sheet;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            return new FragmentWelcomeFeatureRebrandBinding((ConstraintLayout) view, IncludeMaxWelcomeBottomSheetRebrandBinding.bind(viewFindChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
