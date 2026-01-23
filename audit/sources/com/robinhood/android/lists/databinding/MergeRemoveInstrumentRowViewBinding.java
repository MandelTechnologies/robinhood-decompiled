package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.views.InstrumentRowView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class MergeRemoveInstrumentRowViewBinding implements ViewBinding {
    public final InstrumentRowView removeInstrumentRowView;
    public final View removeInstrumentRowViewDivider;
    public final ImageView removeInstrumentRowViewRemoveButton;
    public final ImageView removeInstrumentRowViewReorderHandleImg;
    private final View rootView;

    private MergeRemoveInstrumentRowViewBinding(View view, InstrumentRowView instrumentRowView, View view2, ImageView imageView, ImageView imageView2) {
        this.rootView = view;
        this.removeInstrumentRowView = instrumentRowView;
        this.removeInstrumentRowViewDivider = view2;
        this.removeInstrumentRowViewRemoveButton = imageView;
        this.removeInstrumentRowViewReorderHandleImg = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRemoveInstrumentRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20839R.layout.merge_remove_instrument_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRemoveInstrumentRowViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C20839R.id.remove_instrument_row_view;
        InstrumentRowView instrumentRowView = (InstrumentRowView) ViewBindings.findChildViewById(view, i);
        if (instrumentRowView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C20839R.id.remove_instrument_row_view_divider))) != null) {
            i = C20839R.id.remove_instrument_row_view_remove_button;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C20839R.id.remove_instrument_row_view_reorder_handle_img;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    return new MergeRemoveInstrumentRowViewBinding(view, instrumentRowView, viewFindChildViewById, imageView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
