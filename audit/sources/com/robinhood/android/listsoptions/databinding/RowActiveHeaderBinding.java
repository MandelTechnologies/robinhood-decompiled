package com.robinhood.android.listsoptions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.listsoptions.C20943R;

/* loaded from: classes8.dex */
public final class RowActiveHeaderBinding implements ViewBinding {
    public final RhTextView optionWatchlistActiveHeaderTitle;
    public final RdsChip optionWatchlistSortChip;
    private final ConstraintLayout rootView;

    private RowActiveHeaderBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RdsChip rdsChip) {
        this.rootView = constraintLayout;
        this.optionWatchlistActiveHeaderTitle = rhTextView;
        this.optionWatchlistSortChip = rdsChip;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static RowActiveHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowActiveHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20943R.layout.row_active_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowActiveHeaderBinding bind(View view) {
        int i = C20943R.id.option_watchlist_active_header_title;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C20943R.id.option_watchlist_sort_chip;
            RdsChip rdsChip = (RdsChip) ViewBindings.findChildViewById(view, i);
            if (rdsChip != null) {
                return new RowActiveHeaderBinding((ConstraintLayout) view, rhTextView, rdsChip);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
