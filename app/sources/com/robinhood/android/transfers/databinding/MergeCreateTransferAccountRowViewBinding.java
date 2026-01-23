package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.C30065R;

/* loaded from: classes9.dex */
public final class MergeCreateTransferAccountRowViewBinding implements ViewBinding {
    public final ImageView accountRowLockIcon;
    public final RhTextView headerText;
    public final RhTextView labelText;
    private final View rootView;
    public final RhTextView valueText;

    private MergeCreateTransferAccountRowViewBinding(View view, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = view;
        this.accountRowLockIcon = imageView;
        this.headerText = rhTextView;
        this.labelText = rhTextView2;
        this.valueText = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCreateTransferAccountRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C30065R.layout.merge_create_transfer_account_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCreateTransferAccountRowViewBinding bind(View view) {
        int i = C30065R.id.account_row_lock_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C30065R.id.header_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C30065R.id.label_text;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C30065R.id.value_text;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        return new MergeCreateTransferAccountRowViewBinding(view, imageView, rhTextView, rhTextView2, rhTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
