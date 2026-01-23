package com.robinhood.android.acats.p057ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.chip.ChipGroup;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.chip.RdsChip;

/* loaded from: classes24.dex */
public final class FragmentAcatsInAssetsReviewBinding implements ViewBinding {
    public final RdsChip allAssetsChip;
    public final RecyclerView assetList;
    public final HorizontalScrollView assetTypeChipContainer;
    public final ChipGroup assetTypeChipGroup;
    public final TextView assetsReviewTitle;
    public final RdsChip cashChip;
    public final RdsButton ctaBtn;
    public final RdsChip equityChip;
    public final RdsChip optionsChip;
    private final ConstraintLayout rootView;

    private FragmentAcatsInAssetsReviewBinding(ConstraintLayout constraintLayout, RdsChip rdsChip, RecyclerView recyclerView, HorizontalScrollView horizontalScrollView, ChipGroup chipGroup, TextView textView, RdsChip rdsChip2, RdsButton rdsButton, RdsChip rdsChip3, RdsChip rdsChip4) {
        this.rootView = constraintLayout;
        this.allAssetsChip = rdsChip;
        this.assetList = recyclerView;
        this.assetTypeChipContainer = horizontalScrollView;
        this.assetTypeChipGroup = chipGroup;
        this.assetsReviewTitle = textView;
        this.cashChip = rdsChip2;
        this.ctaBtn = rdsButton;
        this.equityChip = rdsChip3;
        this.optionsChip = rdsChip4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInAssetsReviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInAssetsReviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7686R.layout.fragment_acats_in_assets_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInAssetsReviewBinding bind(View view) {
        int i = C7686R.id.all_assets_chip;
        RdsChip rdsChip = (RdsChip) ViewBindings.findChildViewById(view, i);
        if (rdsChip != null) {
            i = C7686R.id.asset_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C7686R.id.asset_type_chip_container;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                if (horizontalScrollView != null) {
                    i = C7686R.id.asset_type_chip_group;
                    ChipGroup chipGroup = (ChipGroup) ViewBindings.findChildViewById(view, i);
                    if (chipGroup != null) {
                        i = C7686R.id.assets_review_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C7686R.id.cash_chip;
                            RdsChip rdsChip2 = (RdsChip) ViewBindings.findChildViewById(view, i);
                            if (rdsChip2 != null) {
                                i = C7686R.id.cta_btn;
                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton != null) {
                                    i = C7686R.id.equity_chip;
                                    RdsChip rdsChip3 = (RdsChip) ViewBindings.findChildViewById(view, i);
                                    if (rdsChip3 != null) {
                                        i = C7686R.id.options_chip;
                                        RdsChip rdsChip4 = (RdsChip) ViewBindings.findChildViewById(view, i);
                                        if (rdsChip4 != null) {
                                            return new FragmentAcatsInAssetsReviewBinding((ConstraintLayout) view, rdsChip, recyclerView, horizontalScrollView, chipGroup, textView, rdsChip2, rdsButton, rdsChip3, rdsChip4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
