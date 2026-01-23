package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.chart.StackedBlockChart;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class MergeEtpCompositionViewBinding implements ViewBinding {
    public final StackedBlockChart blockChart;
    public final RdsTextButton etpCompositionExpandButton;
    public final ComposeView etpCompositionSegmentedControl;
    public final RecyclerView etpItemsFlatListRecyclerView;
    public final RecyclerView etpItemsGridRecyclerView;
    public final RhTextView etpPortfolioDate;
    public final RhTextView etpTotalAssetsPercentage;
    private final View rootView;

    private MergeEtpCompositionViewBinding(View view, StackedBlockChart stackedBlockChart, RdsTextButton rdsTextButton, ComposeView composeView, RecyclerView recyclerView, RecyclerView recyclerView2, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.blockChart = stackedBlockChart;
        this.etpCompositionExpandButton = rdsTextButton;
        this.etpCompositionSegmentedControl = composeView;
        this.etpItemsFlatListRecyclerView = recyclerView;
        this.etpItemsGridRecyclerView = recyclerView2;
        this.etpPortfolioDate = rhTextView;
        this.etpTotalAssetsPercentage = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEtpCompositionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C15314R.layout.merge_etp_composition_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEtpCompositionViewBinding bind(View view) {
        int i = C15314R.id.block_chart;
        StackedBlockChart stackedBlockChart = (StackedBlockChart) ViewBindings.findChildViewById(view, i);
        if (stackedBlockChart != null) {
            i = C15314R.id.etp_composition_expand_button;
            RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
            if (rdsTextButton != null) {
                i = C15314R.id.etp_composition_segmented_control;
                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                if (composeView != null) {
                    i = C15314R.id.etp_items_flat_list_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C15314R.id.etp_items_grid_recycler_view;
                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView2 != null) {
                            i = C15314R.id.etp_portfolio_date;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                i = C15314R.id.etp_total_assets_percentage;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    return new MergeEtpCompositionViewBinding(view, stackedBlockChart, rdsTextButton, composeView, recyclerView, recyclerView2, rhTextView, rhTextView2);
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
