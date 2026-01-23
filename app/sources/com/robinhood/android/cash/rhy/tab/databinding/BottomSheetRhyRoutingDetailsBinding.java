package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class BottomSheetRhyRoutingDetailsBinding implements ViewBinding {
    public final RdsHeaderRowView rhyRoutingDetailsBottomSheetAccountLabel;
    public final RdsRowView rhyRoutingDetailsBottomSheetAccountRow;
    public final RdsButton rhyRoutingDetailsBottomSheetCloseButton;
    public final RhTextView rhyRoutingDetailsBottomSheetDisclosure;
    public final RdsHeaderRowView rhyRoutingDetailsBottomSheetRoutingLabel;
    public final RdsRowView rhyRoutingDetailsBottomSheetRoutingRow;
    public final RhTextView rhyRoutingDetailsBottomSheetTitle;
    private final CoordinatorLayout rootView;

    private BottomSheetRhyRoutingDetailsBinding(CoordinatorLayout coordinatorLayout, RdsHeaderRowView rdsHeaderRowView, RdsRowView rdsRowView, RdsButton rdsButton, RhTextView rhTextView, RdsHeaderRowView rdsHeaderRowView2, RdsRowView rdsRowView2, RhTextView rhTextView2) {
        this.rootView = coordinatorLayout;
        this.rhyRoutingDetailsBottomSheetAccountLabel = rdsHeaderRowView;
        this.rhyRoutingDetailsBottomSheetAccountRow = rdsRowView;
        this.rhyRoutingDetailsBottomSheetCloseButton = rdsButton;
        this.rhyRoutingDetailsBottomSheetDisclosure = rhTextView;
        this.rhyRoutingDetailsBottomSheetRoutingLabel = rdsHeaderRowView2;
        this.rhyRoutingDetailsBottomSheetRoutingRow = rdsRowView2;
        this.rhyRoutingDetailsBottomSheetTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static BottomSheetRhyRoutingDetailsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BottomSheetRhyRoutingDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10285R.layout.bottom_sheet_rhy_routing_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static BottomSheetRhyRoutingDetailsBinding bind(View view) {
        int i = C10285R.id.rhy_routing_details_bottom_sheet_account_label;
        RdsHeaderRowView rdsHeaderRowView = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
        if (rdsHeaderRowView != null) {
            i = C10285R.id.rhy_routing_details_bottom_sheet_account_row;
            RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView != null) {
                i = C10285R.id.rhy_routing_details_bottom_sheet_close_button;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C10285R.id.rhy_routing_details_bottom_sheet_disclosure;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C10285R.id.rhy_routing_details_bottom_sheet_routing_label;
                        RdsHeaderRowView rdsHeaderRowView2 = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsHeaderRowView2 != null) {
                            i = C10285R.id.rhy_routing_details_bottom_sheet_routing_row;
                            RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsRowView2 != null) {
                                i = C10285R.id.rhy_routing_details_bottom_sheet_title;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    return new BottomSheetRhyRoutingDetailsBinding((CoordinatorLayout) view, rdsHeaderRowView, rdsRowView, rdsButton, rhTextView, rdsHeaderRowView2, rdsRowView2, rhTextView2);
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
