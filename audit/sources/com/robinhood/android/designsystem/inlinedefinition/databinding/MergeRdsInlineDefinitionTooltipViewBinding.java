package com.robinhood.android.designsystem.inlinedefinition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.inlinedefinition.C14010R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeRdsInlineDefinitionTooltipViewBinding implements ViewBinding {
    public final RhTextView definitionTxt;
    private final View rootView;

    private MergeRdsInlineDefinitionTooltipViewBinding(View view, RhTextView rhTextView) {
        this.rootView = view;
        this.definitionTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRdsInlineDefinitionTooltipViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14010R.layout.merge_rds_inline_definition_tooltip_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRdsInlineDefinitionTooltipViewBinding bind(View view) {
        int i = C14010R.id.definition_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new MergeRdsInlineDefinitionTooltipViewBinding(view, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
