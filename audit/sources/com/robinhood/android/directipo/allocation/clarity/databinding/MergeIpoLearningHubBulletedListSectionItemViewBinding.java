package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.clarity.C14172R;

/* loaded from: classes27.dex */
public final class MergeIpoLearningHubBulletedListSectionItemViewBinding implements ViewBinding {
    public final ImageView bulletedListItemIcon;
    public final RhTextView bulletedListItemLabel;
    private final View rootView;

    private MergeIpoLearningHubBulletedListSectionItemViewBinding(View view, ImageView imageView, RhTextView rhTextView) {
        this.rootView = view;
        this.bulletedListItemIcon = imageView;
        this.bulletedListItemLabel = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeIpoLearningHubBulletedListSectionItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14172R.layout.merge_ipo_learning_hub_bulleted_list_section_item_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeIpoLearningHubBulletedListSectionItemViewBinding bind(View view) {
        int i = C14172R.id.bulleted_list_item_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C14172R.id.bulleted_list_item_label;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeIpoLearningHubBulletedListSectionItemViewBinding(view, imageView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
