package com.robinhood.android.acatsin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.intro.AcatsIntroStepView;

/* loaded from: classes24.dex */
public final class IncludeAcatsIntroStepViewBinding implements ViewBinding {
    private final AcatsIntroStepView rootView;

    private IncludeAcatsIntroStepViewBinding(AcatsIntroStepView acatsIntroStepView) {
        this.rootView = acatsIntroStepView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AcatsIntroStepView getRoot() {
        return this.rootView;
    }

    public static IncludeAcatsIntroStepViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAcatsIntroStepViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7725R.layout.include_acats_intro_step_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAcatsIntroStepViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAcatsIntroStepViewBinding((AcatsIntroStepView) view);
    }
}
