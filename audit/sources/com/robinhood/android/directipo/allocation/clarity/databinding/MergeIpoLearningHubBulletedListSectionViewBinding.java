package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.clarity.C14172R;

/* loaded from: classes27.dex */
public final class MergeIpoLearningHubBulletedListSectionViewBinding implements ViewBinding {
    public final LinearLayout bulletedListContainer;
    public final RhTextView learningHubSectionSubtitle;
    public final RhTextView learningHubSectionTitle;
    private final View rootView;

    private MergeIpoLearningHubBulletedListSectionViewBinding(View view, LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.bulletedListContainer = linearLayout;
        this.learningHubSectionSubtitle = rhTextView;
        this.learningHubSectionTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeIpoLearningHubBulletedListSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14172R.layout.merge_ipo_learning_hub_bulleted_list_section_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeIpoLearningHubBulletedListSectionViewBinding bind(View view) {
        int i = C14172R.id.bulleted_list_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C14172R.id.learning_hub_section_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C14172R.id.learning_hub_section_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeIpoLearningHubBulletedListSectionViewBinding(view, linearLayout, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
