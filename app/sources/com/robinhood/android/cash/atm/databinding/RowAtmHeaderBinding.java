package com.robinhood.android.cash.atm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.atm.C9956R;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class RowAtmHeaderBinding implements ViewBinding {
    public final RdsProgressBar atmFinderHeaderProgressBar;
    public final RhTextView atmFinderHeaderText;
    private final ConstraintLayout rootView;

    private RowAtmHeaderBinding(ConstraintLayout constraintLayout, RdsProgressBar rdsProgressBar, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.atmFinderHeaderProgressBar = rdsProgressBar;
        this.atmFinderHeaderText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static RowAtmHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowAtmHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C9956R.layout.row_atm_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowAtmHeaderBinding bind(View view) {
        int i = C9956R.id.atm_finder_header_progress_bar;
        RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
        if (rdsProgressBar != null) {
            i = C9956R.id.atm_finder_header_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new RowAtmHeaderBinding((ConstraintLayout) view, rdsProgressBar, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
