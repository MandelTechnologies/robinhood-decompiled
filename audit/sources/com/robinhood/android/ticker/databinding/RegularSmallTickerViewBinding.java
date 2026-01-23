package com.robinhood.android.ticker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.ticker.C29297R;

/* loaded from: classes9.dex */
public final class RegularSmallTickerViewBinding implements ViewBinding {
    private final AnimatedRhTextView rootView;

    private RegularSmallTickerViewBinding(AnimatedRhTextView animatedRhTextView) {
        this.rootView = animatedRhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AnimatedRhTextView getRoot() {
        return this.rootView;
    }

    public static RegularSmallTickerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RegularSmallTickerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29297R.layout.regular_small_ticker_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RegularSmallTickerViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RegularSmallTickerViewBinding((AnimatedRhTextView) view);
    }
}
