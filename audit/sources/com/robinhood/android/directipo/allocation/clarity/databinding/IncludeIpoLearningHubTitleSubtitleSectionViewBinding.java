package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubTitleSubtitleSectionView;

/* loaded from: classes27.dex */
public final class IncludeIpoLearningHubTitleSubtitleSectionViewBinding implements ViewBinding {
    private final IpoLearningHubTitleSubtitleSectionView rootView;

    private IncludeIpoLearningHubTitleSubtitleSectionViewBinding(IpoLearningHubTitleSubtitleSectionView ipoLearningHubTitleSubtitleSectionView) {
        this.rootView = ipoLearningHubTitleSubtitleSectionView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public IpoLearningHubTitleSubtitleSectionView getRoot() {
        return this.rootView;
    }

    public static IncludeIpoLearningHubTitleSubtitleSectionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIpoLearningHubTitleSubtitleSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14172R.layout.include_ipo_learning_hub_title_subtitle_section_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIpoLearningHubTitleSubtitleSectionViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeIpoLearningHubTitleSubtitleSectionViewBinding((IpoLearningHubTitleSubtitleSectionView) view);
    }
}
