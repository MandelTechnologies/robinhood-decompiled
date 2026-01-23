package com.robinhood.android.designsystem.inlinedefinition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.inlinedefinition.C14010R;

/* loaded from: classes2.dex */
public final class IncludeRdsInlineDefinitionDimmedLayoutBinding implements ViewBinding {
    private final FrameLayout rootView;

    private IncludeRdsInlineDefinitionDimmedLayoutBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeRdsInlineDefinitionDimmedLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRdsInlineDefinitionDimmedLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14010R.layout.include_rds_inline_definition_dimmed_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRdsInlineDefinitionDimmedLayoutBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRdsInlineDefinitionDimmedLayoutBinding((FrameLayout) view);
    }
}
