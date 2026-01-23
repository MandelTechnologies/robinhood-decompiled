package com.robinhood.android.equityvalidation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equityvalidation.C16020R;

/* loaded from: classes3.dex */
public final class MergeEquityOrderChecksBreakdownSectionViewBinding implements ViewBinding {
    public final RecyclerView breakdownRecyclerView;
    private final View rootView;
    public final RhTextView titleTxt;

    private MergeEquityOrderChecksBreakdownSectionViewBinding(View view, RecyclerView recyclerView, RhTextView rhTextView) {
        this.rootView = view;
        this.breakdownRecyclerView = recyclerView;
        this.titleTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEquityOrderChecksBreakdownSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C16020R.layout.merge_equity_order_checks_breakdown_section_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEquityOrderChecksBreakdownSectionViewBinding bind(View view) {
        int i = C16020R.id.breakdown_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C16020R.id.title_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeEquityOrderChecksBreakdownSectionViewBinding(view, recyclerView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
