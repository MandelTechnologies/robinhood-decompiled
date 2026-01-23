package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.views.crypto.CryptoRowView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class MergeRemoveCryptoRowViewBinding implements ViewBinding {
    public final CryptoRowView removeCryptoRowView;
    public final View removeCryptoRowViewDivider;
    public final ImageView removeCryptoRowViewRemoveButton;
    public final ImageView removeCryptoRowViewReorderHandleImg;
    private final View rootView;

    private MergeRemoveCryptoRowViewBinding(View view, CryptoRowView cryptoRowView, View view2, ImageView imageView, ImageView imageView2) {
        this.rootView = view;
        this.removeCryptoRowView = cryptoRowView;
        this.removeCryptoRowViewDivider = view2;
        this.removeCryptoRowViewRemoveButton = imageView;
        this.removeCryptoRowViewReorderHandleImg = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRemoveCryptoRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20839R.layout.merge_remove_crypto_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRemoveCryptoRowViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C20839R.id.remove_crypto_row_view;
        CryptoRowView cryptoRowView = (CryptoRowView) ViewBindings.findChildViewById(view, i);
        if (cryptoRowView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C20839R.id.remove_crypto_row_view_divider))) != null) {
            i = C20839R.id.remove_crypto_row_view_remove_button;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C20839R.id.remove_crypto_row_view_reorder_handle_img;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    return new MergeRemoveCryptoRowViewBinding(view, cryptoRowView, viewFindChildViewById, imageView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
