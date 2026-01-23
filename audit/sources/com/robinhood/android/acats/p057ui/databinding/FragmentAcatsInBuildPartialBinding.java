package com.robinhood.android.acats.p057ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.chip.ChipGroup;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAcatsInBuildPartialBinding implements ViewBinding {
    public final RdsChip allAssetsChip;
    public final RecyclerView assetList;
    public final HorizontalScrollView assetTypeChipContainer;
    public final ChipGroup assetTypeChipGroup;
    public final RdsInfoBannerView banner;
    public final RdsChip cashChip;
    public final RdsButton ctaBtn;
    public final RdsChip equityChip;
    public final RdsChip optionsChip;
    private final ConstraintLayout rootView;
    public final RhTextView title;

    private FragmentAcatsInBuildPartialBinding(ConstraintLayout constraintLayout, RdsChip rdsChip, RecyclerView recyclerView, HorizontalScrollView horizontalScrollView, ChipGroup chipGroup, RdsInfoBannerView rdsInfoBannerView, RdsChip rdsChip2, RdsButton rdsButton, RdsChip rdsChip3, RdsChip rdsChip4, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.allAssetsChip = rdsChip;
        this.assetList = recyclerView;
        this.assetTypeChipContainer = horizontalScrollView;
        this.assetTypeChipGroup = chipGroup;
        this.banner = rdsInfoBannerView;
        this.cashChip = rdsChip2;
        this.ctaBtn = rdsButton;
        this.equityChip = rdsChip3;
        this.optionsChip = rdsChip4;
        this.title = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInBuildPartialBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInBuildPartialBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7686R.layout.fragment_acats_in_build_partial, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInBuildPartialBinding bind(View view) {
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
                        i = C7686R.id.banner;
                        RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                        if (rdsInfoBannerView != null) {
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
                                            i = C7686R.id.title;
                                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView != null) {
                                                return new FragmentAcatsInBuildPartialBinding((ConstraintLayout) view, rdsChip, recyclerView, horizontalScrollView, chipGroup, rdsInfoBannerView, rdsChip2, rdsButton, rdsChip3, rdsChip4, rhTextView);
                                            }
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
