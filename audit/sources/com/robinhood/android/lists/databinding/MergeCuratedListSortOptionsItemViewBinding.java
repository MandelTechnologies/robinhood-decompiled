package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class MergeCuratedListSortOptionsItemViewBinding implements ViewBinding {
    public final ImageView curatedListSortOptionsItemDirectionImg;
    public final View curatedListSortOptionsItemDivider;
    public final RhTextView curatedListSortOptionsItemNameTxt;
    private final View rootView;

    private MergeCuratedListSortOptionsItemViewBinding(View view, ImageView imageView, View view2, RhTextView rhTextView) {
        this.rootView = view;
        this.curatedListSortOptionsItemDirectionImg = imageView;
        this.curatedListSortOptionsItemDivider = view2;
        this.curatedListSortOptionsItemNameTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCuratedListSortOptionsItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20839R.layout.merge_curated_list_sort_options_item_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCuratedListSortOptionsItemViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C20839R.id.curated_list_sort_options_item_direction_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C20839R.id.curated_list_sort_options_item_divider))) != null) {
            i = C20839R.id.curated_list_sort_options_item_name_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeCuratedListSortOptionsItemViewBinding(view, imageView, viewFindChildViewById, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
