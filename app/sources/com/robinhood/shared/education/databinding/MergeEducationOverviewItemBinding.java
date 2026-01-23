package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.education.C38790R;

/* loaded from: classes6.dex */
public final class MergeEducationOverviewItemBinding implements ViewBinding {
    public final ImageView educationOverviewListItemArrow;
    public final ImageView educationOverviewListItemImage;
    public final RhTextView educationOverviewListItemSubtitle;
    public final RhTextView educationOverviewListItemTitle;
    private final View rootView;

    private MergeEducationOverviewItemBinding(View view, ImageView imageView, ImageView imageView2, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.educationOverviewListItemArrow = imageView;
        this.educationOverviewListItemImage = imageView2;
        this.educationOverviewListItemSubtitle = rhTextView;
        this.educationOverviewListItemTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEducationOverviewItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C38790R.layout.merge_education_overview_item, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEducationOverviewItemBinding bind(View view) {
        int i = C38790R.id.education_overview_list_item_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C38790R.id.education_overview_list_item_image;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C38790R.id.education_overview_list_item_subtitle;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C38790R.id.education_overview_list_item_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new MergeEducationOverviewItemBinding(view, imageView, imageView2, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
