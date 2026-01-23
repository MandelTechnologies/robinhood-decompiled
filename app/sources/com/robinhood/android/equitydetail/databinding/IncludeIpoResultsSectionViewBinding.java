package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.ipo.IpoResultsSectionView;

/* loaded from: classes3.dex */
public final class IncludeIpoResultsSectionViewBinding implements ViewBinding {
    private final IpoResultsSectionView rootView;

    private IncludeIpoResultsSectionViewBinding(IpoResultsSectionView ipoResultsSectionView) {
        this.rootView = ipoResultsSectionView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public IpoResultsSectionView getRoot() {
        return this.rootView;
    }

    public static IncludeIpoResultsSectionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIpoResultsSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_ipo_results_section_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIpoResultsSectionViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeIpoResultsSectionViewBinding((IpoResultsSectionView) view);
    }
}
