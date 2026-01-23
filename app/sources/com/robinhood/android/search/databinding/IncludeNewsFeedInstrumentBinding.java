package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.view.NewsFeedInstrumentView;

/* loaded from: classes5.dex */
public final class IncludeNewsFeedInstrumentBinding implements ViewBinding {
    private final NewsFeedInstrumentView rootView;

    private IncludeNewsFeedInstrumentBinding(NewsFeedInstrumentView newsFeedInstrumentView) {
        this.rootView = newsFeedInstrumentView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NewsFeedInstrumentView getRoot() {
        return this.rootView;
    }

    public static IncludeNewsFeedInstrumentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewsFeedInstrumentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_news_feed_instrument, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewsFeedInstrumentBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewsFeedInstrumentBinding((NewsFeedInstrumentView) view);
    }
}
