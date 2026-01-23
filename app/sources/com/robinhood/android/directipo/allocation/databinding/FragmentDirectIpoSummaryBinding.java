package com.robinhood.android.directipo.allocation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.C14171R;
import com.robinhood.android.graph.spark.GraphView;

/* loaded from: classes27.dex */
public final class FragmentDirectIpoSummaryBinding implements ViewBinding {
    public final RecyclerView fragmentDirectIpoSummaryButtonRecyclerView;
    public final View fragmentDirectIpoSummaryDivider;
    public final RecyclerView fragmentDirectIpoSummaryEmphasizedStatsRecyclerView;
    public final GraphView fragmentDirectIpoSummaryGraphView;
    public final RecyclerView fragmentDirectIpoSummaryStatsRecyclerView;
    public final RhTextView fragmentDirectIpoSummaryTitleText;
    private final ConstraintLayout rootView;

    private FragmentDirectIpoSummaryBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, View view, RecyclerView recyclerView2, GraphView graphView, RecyclerView recyclerView3, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.fragmentDirectIpoSummaryButtonRecyclerView = recyclerView;
        this.fragmentDirectIpoSummaryDivider = view;
        this.fragmentDirectIpoSummaryEmphasizedStatsRecyclerView = recyclerView2;
        this.fragmentDirectIpoSummaryGraphView = graphView;
        this.fragmentDirectIpoSummaryStatsRecyclerView = recyclerView3;
        this.fragmentDirectIpoSummaryTitleText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectIpoSummaryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectIpoSummaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14171R.layout.fragment_direct_ipo_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectIpoSummaryBinding bind(View view) {
        View viewFindChildViewById;
        int i = C14171R.id.fragment_direct_ipo_summary_button_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C14171R.id.fragment_direct_ipo_summary_divider))) != null) {
            i = C14171R.id.fragment_direct_ipo_summary_emphasized_stats_recycler_view;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView2 != null) {
                i = C14171R.id.fragment_direct_ipo_summary_graph_view;
                GraphView graphView = (GraphView) ViewBindings.findChildViewById(view, i);
                if (graphView != null) {
                    i = C14171R.id.fragment_direct_ipo_summary_stats_recycler_view;
                    RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView3 != null) {
                        i = C14171R.id.fragment_direct_ipo_summary_title_text;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            return new FragmentDirectIpoSummaryBinding((ConstraintLayout) view, recyclerView, viewFindChildViewById, recyclerView2, graphView, recyclerView3, rhTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
