package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.clarity.C14172R;

/* loaded from: classes27.dex */
public final class MergeIpoLearningHubLabelSectionViewBinding implements ViewBinding {
    public final RhTextView learningHubSectionTitle;
    private final View rootView;

    private MergeIpoLearningHubLabelSectionViewBinding(View view, RhTextView rhTextView) {
        this.rootView = view;
        this.learningHubSectionTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeIpoLearningHubLabelSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14172R.layout.merge_ipo_learning_hub_label_section_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeIpoLearningHubLabelSectionViewBinding bind(View view) {
        int i = C14172R.id.learning_hub_section_title;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new MergeIpoLearningHubLabelSectionViewBinding(view, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
