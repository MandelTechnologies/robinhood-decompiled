package com.robinhood.android.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.welcome.C31456R;

/* loaded from: classes20.dex */
public final class FragmentWelcomeFeatureBinding implements ViewBinding {
    public final IncludeMaxWelcomeBottomSheetBinding maxWelcomeFeatureBottomSheet;
    private final ConstraintLayout rootView;

    private FragmentWelcomeFeatureBinding(ConstraintLayout constraintLayout, IncludeMaxWelcomeBottomSheetBinding includeMaxWelcomeBottomSheetBinding) {
        this.rootView = constraintLayout;
        this.maxWelcomeFeatureBottomSheet = includeMaxWelcomeBottomSheetBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWelcomeFeatureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWelcomeFeatureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31456R.layout.fragment_welcome_feature, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentWelcomeFeatureBinding bind(View view) {
        int i = C31456R.id.max_welcome_feature_bottom_sheet;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            return new FragmentWelcomeFeatureBinding((ConstraintLayout) view, IncludeMaxWelcomeBottomSheetBinding.bind(viewFindChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
