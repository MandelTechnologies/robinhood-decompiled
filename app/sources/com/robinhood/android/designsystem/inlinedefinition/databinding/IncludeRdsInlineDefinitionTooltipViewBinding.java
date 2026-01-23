package com.robinhood.android.designsystem.inlinedefinition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.inlinedefinition.C14010R;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTooltipView;

/* loaded from: classes2.dex */
public final class IncludeRdsInlineDefinitionTooltipViewBinding implements ViewBinding {
    private final RdsInlineDefinitionTooltipView rootView;

    private IncludeRdsInlineDefinitionTooltipViewBinding(RdsInlineDefinitionTooltipView rdsInlineDefinitionTooltipView) {
        this.rootView = rdsInlineDefinitionTooltipView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsInlineDefinitionTooltipView getRoot() {
        return this.rootView;
    }

    public static IncludeRdsInlineDefinitionTooltipViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRdsInlineDefinitionTooltipViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14010R.layout.include_rds_inline_definition_tooltip_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRdsInlineDefinitionTooltipViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRdsInlineDefinitionTooltipViewBinding((RdsInlineDefinitionTooltipView) view);
    }
}
