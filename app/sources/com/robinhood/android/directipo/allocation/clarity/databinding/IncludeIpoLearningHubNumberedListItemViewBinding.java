package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubNumberedListItemView;

/* loaded from: classes27.dex */
public final class IncludeIpoLearningHubNumberedListItemViewBinding implements ViewBinding {
    private final IpoLearningHubNumberedListItemView rootView;

    private IncludeIpoLearningHubNumberedListItemViewBinding(IpoLearningHubNumberedListItemView ipoLearningHubNumberedListItemView) {
        this.rootView = ipoLearningHubNumberedListItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public IpoLearningHubNumberedListItemView getRoot() {
        return this.rootView;
    }

    public static IncludeIpoLearningHubNumberedListItemViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIpoLearningHubNumberedListItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14172R.layout.include_ipo_learning_hub_numbered_list_item_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIpoLearningHubNumberedListItemViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeIpoLearningHubNumberedListItemViewBinding((IpoLearningHubNumberedListItemView) view);
    }
}
