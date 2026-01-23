package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubCarouselSectionView;

/* loaded from: classes27.dex */
public final class IncludeIpoLearningHubCarouselSectionViewBinding implements ViewBinding {
    private final IpoLearningHubCarouselSectionView rootView;

    private IncludeIpoLearningHubCarouselSectionViewBinding(IpoLearningHubCarouselSectionView ipoLearningHubCarouselSectionView) {
        this.rootView = ipoLearningHubCarouselSectionView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public IpoLearningHubCarouselSectionView getRoot() {
        return this.rootView;
    }

    public static IncludeIpoLearningHubCarouselSectionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIpoLearningHubCarouselSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14172R.layout.include_ipo_learning_hub_carousel_section_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIpoLearningHubCarouselSectionViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeIpoLearningHubCarouselSectionViewBinding((IpoLearningHubCarouselSectionView) view);
    }
}
