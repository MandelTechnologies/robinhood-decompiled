package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class MergeEtpFlatListRowViewBinding implements ViewBinding {
    public final View divider;
    public final AppCompatImageView etpItemColorBlock;
    public final RhTextView etpItemName;
    public final ConstraintLayout etpItemRowContainer;
    public final RhTextView etpItemWeight;
    private final View rootView;

    private MergeEtpFlatListRowViewBinding(View view, View view2, AppCompatImageView appCompatImageView, RhTextView rhTextView, ConstraintLayout constraintLayout, RhTextView rhTextView2) {
        this.rootView = view;
        this.divider = view2;
        this.etpItemColorBlock = appCompatImageView;
        this.etpItemName = rhTextView;
        this.etpItemRowContainer = constraintLayout;
        this.etpItemWeight = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEtpFlatListRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C15314R.layout.merge_etp_flat_list_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEtpFlatListRowViewBinding bind(View view) {
        int i = C15314R.id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C15314R.id.etp_item_color_block;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C15314R.id.etp_item_name;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C15314R.id.etp_item_row_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C15314R.id.etp_item_weight;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new MergeEtpFlatListRowViewBinding(view, viewFindChildViewById, appCompatImageView, rhTextView, constraintLayout, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
