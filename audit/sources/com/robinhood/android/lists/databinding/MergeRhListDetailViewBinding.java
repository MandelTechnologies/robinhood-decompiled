package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class MergeRhListDetailViewBinding implements ViewBinding {
    public final Barrier rhListDetailBottomBarrier;
    public final RdsIconButton rhListDetailControlBtn;
    public final RhTextView rhListDetailHeader;
    public final Barrier rhListDetailHeaderBottomBarrier;
    public final RhTextView rhListDetailQuantity;
    public final ComposeView rhListFilterChipComposeView;
    private final View rootView;

    private MergeRhListDetailViewBinding(View view, Barrier barrier, RdsIconButton rdsIconButton, RhTextView rhTextView, Barrier barrier2, RhTextView rhTextView2, ComposeView composeView) {
        this.rootView = view;
        this.rhListDetailBottomBarrier = barrier;
        this.rhListDetailControlBtn = rdsIconButton;
        this.rhListDetailHeader = rhTextView;
        this.rhListDetailHeaderBottomBarrier = barrier2;
        this.rhListDetailQuantity = rhTextView2;
        this.rhListFilterChipComposeView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRhListDetailViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20839R.layout.merge_rh_list_detail_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRhListDetailViewBinding bind(View view) {
        int i = C20839R.id.rh_list_detail_bottom_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C20839R.id.rh_list_detail_control_btn;
            RdsIconButton rdsIconButton = (RdsIconButton) ViewBindings.findChildViewById(view, i);
            if (rdsIconButton != null) {
                i = C20839R.id.rh_list_detail_header;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C20839R.id.rh_list_detail_header_bottom_barrier;
                    Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                    if (barrier2 != null) {
                        i = C20839R.id.rh_list_detail_quantity;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C20839R.id.rh_list_filter_chip_compose_view;
                            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                            if (composeView != null) {
                                return new MergeRhListDetailViewBinding(view, barrier, rdsIconButton, rhTextView, barrier2, rhTextView2, composeView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
