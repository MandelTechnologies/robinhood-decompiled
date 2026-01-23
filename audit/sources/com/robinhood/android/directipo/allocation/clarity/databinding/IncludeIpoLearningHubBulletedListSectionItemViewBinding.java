package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubBulletedListSectionItemView;

/* loaded from: classes27.dex */
public final class IncludeIpoLearningHubBulletedListSectionItemViewBinding implements ViewBinding {
    private final IpoLearningHubBulletedListSectionItemView rootView;

    private IncludeIpoLearningHubBulletedListSectionItemViewBinding(IpoLearningHubBulletedListSectionItemView ipoLearningHubBulletedListSectionItemView) {
        this.rootView = ipoLearningHubBulletedListSectionItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public IpoLearningHubBulletedListSectionItemView getRoot() {
        return this.rootView;
    }

    public static IncludeIpoLearningHubBulletedListSectionItemViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIpoLearningHubBulletedListSectionItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14172R.layout.include_ipo_learning_hub_bulleted_list_section_item_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIpoLearningHubBulletedListSectionItemViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeIpoLearningHubBulletedListSectionItemViewBinding((IpoLearningHubBulletedListSectionItemView) view);
    }
}
