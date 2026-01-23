package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubNumberedListSectionView;

/* loaded from: classes27.dex */
public final class IncludeIpoLearningHubNumberedListSectionViewBinding implements ViewBinding {
    private final IpoLearningHubNumberedListSectionView rootView;

    private IncludeIpoLearningHubNumberedListSectionViewBinding(IpoLearningHubNumberedListSectionView ipoLearningHubNumberedListSectionView) {
        this.rootView = ipoLearningHubNumberedListSectionView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public IpoLearningHubNumberedListSectionView getRoot() {
        return this.rootView;
    }

    public static IncludeIpoLearningHubNumberedListSectionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIpoLearningHubNumberedListSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14172R.layout.include_ipo_learning_hub_numbered_list_section_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIpoLearningHubNumberedListSectionViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeIpoLearningHubNumberedListSectionViewBinding((IpoLearningHubNumberedListSectionView) view);
    }
}
