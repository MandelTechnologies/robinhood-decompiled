package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class MergeNewsFeedInstrumentBinding implements ViewBinding {
    public final RhTextView newsFeedInstrumentNameTxt;
    public final AnimatedRhTextView newsFeedInstrumentPercentChangeTxt;
    public final RhTextView newsFeedInstrumentSymbolTxt;
    private final ConstraintLayout rootView;

    private MergeNewsFeedInstrumentBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, AnimatedRhTextView animatedRhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.newsFeedInstrumentNameTxt = rhTextView;
        this.newsFeedInstrumentPercentChangeTxt = animatedRhTextView;
        this.newsFeedInstrumentSymbolTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeNewsFeedInstrumentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeNewsFeedInstrumentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.merge_news_feed_instrument, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeNewsFeedInstrumentBinding bind(View view) {
        int i = C27909R.id.news_feed_instrument_name_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C27909R.id.news_feed_instrument_percent_change_txt;
            AnimatedRhTextView animatedRhTextView = (AnimatedRhTextView) ViewBindings.findChildViewById(view, i);
            if (animatedRhTextView != null) {
                i = C27909R.id.news_feed_instrument_symbol_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeNewsFeedInstrumentBinding((ConstraintLayout) view, rhTextView, animatedRhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
