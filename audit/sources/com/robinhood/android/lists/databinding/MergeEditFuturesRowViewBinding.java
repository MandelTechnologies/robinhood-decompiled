package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.views.futures.FuturesRowView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class MergeEditFuturesRowViewBinding implements ViewBinding {
    public final FuturesRowView editFuturesRowView;
    public final View editFuturesRowViewDivider;
    public final ImageView editFuturesRowViewRemoveButton;
    public final ImageView editFuturesRowViewReorderHandleImg;
    private final View rootView;

    private MergeEditFuturesRowViewBinding(View view, FuturesRowView futuresRowView, View view2, ImageView imageView, ImageView imageView2) {
        this.rootView = view;
        this.editFuturesRowView = futuresRowView;
        this.editFuturesRowViewDivider = view2;
        this.editFuturesRowViewRemoveButton = imageView;
        this.editFuturesRowViewReorderHandleImg = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEditFuturesRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20839R.layout.merge_edit_futures_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEditFuturesRowViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C20839R.id.edit_futures_row_view;
        FuturesRowView futuresRowView = (FuturesRowView) ViewBindings.findChildViewById(view, i);
        if (futuresRowView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C20839R.id.edit_futures_row_view_divider))) != null) {
            i = C20839R.id.edit_futures_row_view_remove_button;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C20839R.id.edit_futures_row_view_reorder_handle_img;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    return new MergeEditFuturesRowViewBinding(view, futuresRowView, viewFindChildViewById, imageView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
