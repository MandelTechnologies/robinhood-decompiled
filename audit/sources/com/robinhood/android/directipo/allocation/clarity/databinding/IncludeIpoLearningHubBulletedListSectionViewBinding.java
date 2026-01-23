package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubBulletedListSectionView;

/* loaded from: classes27.dex */
public final class IncludeIpoLearningHubBulletedListSectionViewBinding implements ViewBinding {
    private final IpoLearningHubBulletedListSectionView rootView;

    private IncludeIpoLearningHubBulletedListSectionViewBinding(IpoLearningHubBulletedListSectionView ipoLearningHubBulletedListSectionView) {
        this.rootView = ipoLearningHubBulletedListSectionView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public IpoLearningHubBulletedListSectionView getRoot() {
        return this.rootView;
    }

    public static IncludeIpoLearningHubBulletedListSectionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIpoLearningHubBulletedListSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14172R.layout.include_ipo_learning_hub_bulleted_list_section_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIpoLearningHubBulletedListSectionViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeIpoLearningHubBulletedListSectionViewBinding((IpoLearningHubBulletedListSectionView) view);
    }
}
