package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class MergeRowRecentSearchViewBinding implements ViewBinding {
    public final RhTextView recentSearchDisplayTitle;
    public final ImageView recentSearchRowDeleteBtn;
    private final View rootView;
    public final View rowBottomDivider;

    private MergeRowRecentSearchViewBinding(View view, RhTextView rhTextView, ImageView imageView, View view2) {
        this.rootView = view;
        this.recentSearchDisplayTitle = rhTextView;
        this.recentSearchRowDeleteBtn = imageView;
        this.rowBottomDivider = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRowRecentSearchViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27909R.layout.merge_row_recent_search_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRowRecentSearchViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C27909R.id.recent_search_display_title;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C27909R.id.recent_search_row_delete_btn;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C27909R.id.row_bottom_divider))) != null) {
                return new MergeRowRecentSearchViewBinding(view, rhTextView, imageView, viewFindChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
