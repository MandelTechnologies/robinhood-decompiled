package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubParticipantVisualSectionView;

/* loaded from: classes27.dex */
public final class IncludeIpoLearningHubParticipantVisualSectionViewBinding implements ViewBinding {
    private final IpoLearningHubParticipantVisualSectionView rootView;

    private IncludeIpoLearningHubParticipantVisualSectionViewBinding(IpoLearningHubParticipantVisualSectionView ipoLearningHubParticipantVisualSectionView) {
        this.rootView = ipoLearningHubParticipantVisualSectionView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public IpoLearningHubParticipantVisualSectionView getRoot() {
        return this.rootView;
    }

    public static IncludeIpoLearningHubParticipantVisualSectionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIpoLearningHubParticipantVisualSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14172R.layout.include_ipo_learning_hub_participant_visual_section_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIpoLearningHubParticipantVisualSectionViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeIpoLearningHubParticipantVisualSectionViewBinding((IpoLearningHubParticipantVisualSectionView) view);
    }
}
