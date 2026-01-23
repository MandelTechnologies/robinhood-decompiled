package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.earnings.EarningsView;

/* loaded from: classes3.dex */
public final class IncludeEarningsViewBinding implements ViewBinding {
    public final EarningsView earningView;
    public final RhTextView emptyTxt;
    public final RdsProgressBar progressBar;
    public final RecyclerView recyclerView;
    private final EarningsView rootView;

    private IncludeEarningsViewBinding(EarningsView earningsView, EarningsView earningsView2, RhTextView rhTextView, RdsProgressBar rdsProgressBar, RecyclerView recyclerView) {
        this.rootView = earningsView;
        this.earningView = earningsView2;
        this.emptyTxt = rhTextView;
        this.progressBar = rdsProgressBar;
        this.recyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EarningsView getRoot() {
        return this.rootView;
    }

    public static IncludeEarningsViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEarningsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_earnings_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEarningsViewBinding bind(View view) {
        EarningsView earningsView = (EarningsView) view;
        int i = C15314R.id.empty_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C15314R.id.progress_bar;
            RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
            if (rdsProgressBar != null) {
                i = C15314R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new IncludeEarningsViewBinding(earningsView, earningsView, rhTextView, rdsProgressBar, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
