package com.robinhood.android.investorprofile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.investorprofile.C19641R;

/* loaded from: classes10.dex */
public final class FragmentQuestionnaireLoadConfigurationBinding implements ViewBinding {
    private final ShimmerLoadingView rootView;

    private FragmentQuestionnaireLoadConfigurationBinding(ShimmerLoadingView shimmerLoadingView) {
        this.rootView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShimmerLoadingView getRoot() {
        return this.rootView;
    }

    public static FragmentQuestionnaireLoadConfigurationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentQuestionnaireLoadConfigurationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19641R.layout.fragment_questionnaire_load_configuration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentQuestionnaireLoadConfigurationBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new FragmentQuestionnaireLoadConfigurationBinding((ShimmerLoadingView) view);
    }
}
