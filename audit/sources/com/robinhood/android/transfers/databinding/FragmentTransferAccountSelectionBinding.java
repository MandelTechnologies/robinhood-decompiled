package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.C30065R;

/* loaded from: classes9.dex */
public final class FragmentTransferAccountSelectionBinding implements ViewBinding {
    public final RecyclerView accountsRecyclerView;
    public final RhTextView enokiInfo;
    private final NestedScrollView rootView;
    public final RhTextView subtitleTxt;
    public final RhTextView titleTxt;
    public final LinearLayout wiresUpsell;
    public final RdsRowView wiresUpsellRow;

    private FragmentTransferAccountSelectionBinding(NestedScrollView nestedScrollView, RecyclerView recyclerView, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, LinearLayout linearLayout, RdsRowView rdsRowView) {
        this.rootView = nestedScrollView;
        this.accountsRecyclerView = recyclerView;
        this.enokiInfo = rhTextView;
        this.subtitleTxt = rhTextView2;
        this.titleTxt = rhTextView3;
        this.wiresUpsell = linearLayout;
        this.wiresUpsellRow = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentTransferAccountSelectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTransferAccountSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30065R.layout.fragment_transfer_account_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTransferAccountSelectionBinding bind(View view) {
        int i = C30065R.id.accounts_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C30065R.id.enoki_info;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C30065R.id.subtitle_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C30065R.id.title_txt;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C30065R.id.wires_upsell;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C30065R.id.wires_upsell_row;
                            RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsRowView != null) {
                                return new FragmentTransferAccountSelectionBinding((NestedScrollView) view, recyclerView, rhTextView, rhTextView2, rhTextView3, linearLayout, rdsRowView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
