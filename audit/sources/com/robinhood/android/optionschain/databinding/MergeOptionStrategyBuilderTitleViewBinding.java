package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.infotag.RdsInfoTag;
import com.robinhood.android.optionschain.C24135R;

/* loaded from: classes11.dex */
public final class MergeOptionStrategyBuilderTitleViewBinding implements ViewBinding {
    public final RdsInfoTag infoTag;
    private final ConstraintLayout rootView;
    public final TextView title;

    private MergeOptionStrategyBuilderTitleViewBinding(ConstraintLayout constraintLayout, RdsInfoTag rdsInfoTag, TextView textView) {
        this.rootView = constraintLayout;
        this.infoTag = rdsInfoTag;
        this.title = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeOptionStrategyBuilderTitleViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeOptionStrategyBuilderTitleViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.merge_option_strategy_builder_title_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeOptionStrategyBuilderTitleViewBinding bind(View view) {
        int i = C24135R.id.info_tag;
        RdsInfoTag rdsInfoTag = (RdsInfoTag) ViewBindings.findChildViewById(view, i);
        if (rdsInfoTag != null) {
            i = C24135R.id.title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new MergeOptionStrategyBuilderTitleViewBinding((ConstraintLayout) view, rdsInfoTag, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
