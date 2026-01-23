package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class MergeEtpGridRowViewBinding implements ViewBinding {
    public final AppCompatImageView etpItemColorBlock;
    public final RhTextView etpItemDescription;
    public final RhTextView etpItemTitle;
    private final View rootView;

    private MergeEtpGridRowViewBinding(View view, AppCompatImageView appCompatImageView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.etpItemColorBlock = appCompatImageView;
        this.etpItemDescription = rhTextView;
        this.etpItemTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEtpGridRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C15314R.layout.merge_etp_grid_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEtpGridRowViewBinding bind(View view) {
        int i = C15314R.id.etp_item_color_block;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C15314R.id.etp_item_description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C15314R.id.etp_item_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeEtpGridRowViewBinding(view, appCompatImageView, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
