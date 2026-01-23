package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class MergeProfileAssetBreakdownItemViewBinding implements ViewBinding {
    public final View assetBreakdownFractionBarView;
    public final RhTextView assetBreakdownNameTxt;
    public final RhTextView assetBreakdownPercentageTxt;
    private final View rootView;
    public final ImageView sectorDetailRightArrowImg;

    private MergeProfileAssetBreakdownItemViewBinding(View view, View view2, RhTextView rhTextView, RhTextView rhTextView2, ImageView imageView) {
        this.rootView = view;
        this.assetBreakdownFractionBarView = view2;
        this.assetBreakdownNameTxt = rhTextView;
        this.assetBreakdownPercentageTxt = rhTextView2;
        this.sectorDetailRightArrowImg = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeProfileAssetBreakdownItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C8293R.layout.merge_profile_asset_breakdown_item_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeProfileAssetBreakdownItemViewBinding bind(View view) {
        int i = C8293R.id.asset_breakdown_fraction_bar_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C8293R.id.asset_breakdown_name_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C8293R.id.asset_breakdown_percentage_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C8293R.id.sector_detail_right_arrow_img;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        return new MergeProfileAssetBreakdownItemViewBinding(view, viewFindChildViewById, rhTextView, rhTextView2, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
