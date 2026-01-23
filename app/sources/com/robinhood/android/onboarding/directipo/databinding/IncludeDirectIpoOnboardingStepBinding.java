package com.robinhood.android.onboarding.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.onboarding.directipo.C22750R;
import com.robinhood.android.onboarding.directipo.p203ui.DirectIpoOnboardingStepView;

/* loaded from: classes10.dex */
public final class IncludeDirectIpoOnboardingStepBinding implements ViewBinding {
    private final DirectIpoOnboardingStepView rootView;

    private IncludeDirectIpoOnboardingStepBinding(DirectIpoOnboardingStepView directIpoOnboardingStepView) {
        this.rootView = directIpoOnboardingStepView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DirectIpoOnboardingStepView getRoot() {
        return this.rootView;
    }

    public static IncludeDirectIpoOnboardingStepBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDirectIpoOnboardingStepBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C22750R.layout.include_direct_ipo_onboarding_step, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDirectIpoOnboardingStepBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDirectIpoOnboardingStepBinding((DirectIpoOnboardingStepView) view);
    }
}
