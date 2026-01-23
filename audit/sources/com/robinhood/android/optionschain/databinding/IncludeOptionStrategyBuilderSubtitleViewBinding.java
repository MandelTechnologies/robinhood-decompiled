package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionschain.C24135R;

/* loaded from: classes11.dex */
public final class IncludeOptionStrategyBuilderSubtitleViewBinding implements ViewBinding {
    private final RhTextView rootView;
    public final RhTextView subtitle;

    private IncludeOptionStrategyBuilderSubtitleViewBinding(RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = rhTextView;
        this.subtitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static IncludeOptionStrategyBuilderSubtitleViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionStrategyBuilderSubtitleViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.include_option_strategy_builder_subtitle_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionStrategyBuilderSubtitleViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RhTextView rhTextView = (RhTextView) view;
        return new IncludeOptionStrategyBuilderSubtitleViewBinding(rhTextView, rhTextView);
    }
}
