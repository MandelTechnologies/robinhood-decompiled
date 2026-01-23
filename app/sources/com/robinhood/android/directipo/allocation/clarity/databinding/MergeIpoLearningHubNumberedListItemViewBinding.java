package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.clarity.C14172R;

/* loaded from: classes27.dex */
public final class MergeIpoLearningHubNumberedListItemViewBinding implements ViewBinding {
    public final RhTextView learningHubSectionNumber;
    public final RhTextView learningHubSectionSubtitle;
    public final RhTextView learningHubSectionTitle;
    private final View rootView;

    private MergeIpoLearningHubNumberedListItemViewBinding(View view, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = view;
        this.learningHubSectionNumber = rhTextView;
        this.learningHubSectionSubtitle = rhTextView2;
        this.learningHubSectionTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeIpoLearningHubNumberedListItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14172R.layout.merge_ipo_learning_hub_numbered_list_item_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeIpoLearningHubNumberedListItemViewBinding bind(View view) {
        int i = C14172R.id.learning_hub_section_number;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C14172R.id.learning_hub_section_subtitle;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C14172R.id.learning_hub_section_title;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    return new MergeIpoLearningHubNumberedListItemViewBinding(view, rhTextView, rhTextView2, rhTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
