package com.robinhood.android.educationtour.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.assetdetail.EducationTourTickerSymbolView;
import com.robinhood.android.educationtour.C14469R;

/* loaded from: classes7.dex */
public final class IncludeEducationTourTickerSymbolViewBinding implements ViewBinding {
    private final EducationTourTickerSymbolView rootView;

    private IncludeEducationTourTickerSymbolViewBinding(EducationTourTickerSymbolView educationTourTickerSymbolView) {
        this.rootView = educationTourTickerSymbolView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EducationTourTickerSymbolView getRoot() {
        return this.rootView;
    }

    public static IncludeEducationTourTickerSymbolViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEducationTourTickerSymbolViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14469R.layout.include_education_tour_ticker_symbol_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEducationTourTickerSymbolViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEducationTourTickerSymbolViewBinding((EducationTourTickerSymbolView) view);
    }
}
