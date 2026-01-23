package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubLottieSectionView;

/* loaded from: classes27.dex */
public final class IncludeIpoLearningHubLottieSectionViewBinding implements ViewBinding {
    private final IpoLearningHubLottieSectionView rootView;

    private IncludeIpoLearningHubLottieSectionViewBinding(IpoLearningHubLottieSectionView ipoLearningHubLottieSectionView) {
        this.rootView = ipoLearningHubLottieSectionView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public IpoLearningHubLottieSectionView getRoot() {
        return this.rootView;
    }

    public static IncludeIpoLearningHubLottieSectionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIpoLearningHubLottieSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14172R.layout.include_ipo_learning_hub_lottie_section_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIpoLearningHubLottieSectionViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeIpoLearningHubLottieSectionViewBinding((IpoLearningHubLottieSectionView) view);
    }
}
