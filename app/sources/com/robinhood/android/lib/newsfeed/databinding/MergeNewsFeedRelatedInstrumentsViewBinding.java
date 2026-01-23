package com.robinhood.android.lib.newsfeed.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.newsfeed.C20334R;

/* loaded from: classes8.dex */
public final class MergeNewsFeedRelatedInstrumentsViewBinding implements ViewBinding {
    public final RhTextView newsFeedRelatedInstrumentFirstTxt;
    public final RhTextView newsFeedRelatedInstrumentSecondTxt;
    private final View rootView;

    private MergeNewsFeedRelatedInstrumentsViewBinding(View view, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.newsFeedRelatedInstrumentFirstTxt = rhTextView;
        this.newsFeedRelatedInstrumentSecondTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeNewsFeedRelatedInstrumentsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20334R.layout.merge_news_feed_related_instruments_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeNewsFeedRelatedInstrumentsViewBinding bind(View view) {
        int i = C20334R.id.news_feed_related_instrument_first_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C20334R.id.news_feed_related_instrument_second_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                return new MergeNewsFeedRelatedInstrumentsViewBinding(view, rhTextView, rhTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
