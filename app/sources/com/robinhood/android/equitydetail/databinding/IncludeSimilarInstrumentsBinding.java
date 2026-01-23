package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.similarinstruments.SimilarInstrumentsView;

/* loaded from: classes3.dex */
public final class IncludeSimilarInstrumentsBinding implements ViewBinding {
    private final SimilarInstrumentsView rootView;

    private IncludeSimilarInstrumentsBinding(SimilarInstrumentsView similarInstrumentsView) {
        this.rootView = similarInstrumentsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SimilarInstrumentsView getRoot() {
        return this.rootView;
    }

    public static IncludeSimilarInstrumentsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSimilarInstrumentsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_similar_instruments, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSimilarInstrumentsBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeSimilarInstrumentsBinding((SimilarInstrumentsView) view);
    }
}
