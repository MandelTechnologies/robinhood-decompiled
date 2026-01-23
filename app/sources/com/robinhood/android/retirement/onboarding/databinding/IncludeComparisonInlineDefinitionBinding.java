package com.robinhood.android.retirement.onboarding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.retirement.onboarding.C27032R;

/* loaded from: classes5.dex */
public final class IncludeComparisonInlineDefinitionBinding implements ViewBinding {
    private final RdsInlineDefinitionTextView rootView;

    private IncludeComparisonInlineDefinitionBinding(RdsInlineDefinitionTextView rdsInlineDefinitionTextView) {
        this.rootView = rdsInlineDefinitionTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsInlineDefinitionTextView getRoot() {
        return this.rootView;
    }

    public static IncludeComparisonInlineDefinitionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeComparisonInlineDefinitionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27032R.layout.include_comparison_inline_definition, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeComparisonInlineDefinitionBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeComparisonInlineDefinitionBinding((RdsInlineDefinitionTextView) view);
    }
}
