package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.earnings.EarningsDataView;
import com.robinhood.android.equitydetail.p123ui.earnings.EarningsGraph;

/* loaded from: classes3.dex */
public final class IncludeEarningsDataViewBinding implements ViewBinding {
    public final RdsTextButton earningsActionBtn;
    public final RhTextView earningsActualEpsLabelTxt;
    public final RhTextView earningsActualEpsTxt;
    public final RhTextView earningsEstimatedEpsLabelTxt;
    public final RhTextView earningsEstimatedEpsTxt;
    public final EarningsGraph earningsGraph;
    public final Guideline earningsTextMidpoint;
    private final EarningsDataView rootView;

    private IncludeEarningsDataViewBinding(EarningsDataView earningsDataView, RdsTextButton rdsTextButton, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, EarningsGraph earningsGraph, Guideline guideline) {
        this.rootView = earningsDataView;
        this.earningsActionBtn = rdsTextButton;
        this.earningsActualEpsLabelTxt = rhTextView;
        this.earningsActualEpsTxt = rhTextView2;
        this.earningsEstimatedEpsLabelTxt = rhTextView3;
        this.earningsEstimatedEpsTxt = rhTextView4;
        this.earningsGraph = earningsGraph;
        this.earningsTextMidpoint = guideline;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EarningsDataView getRoot() {
        return this.rootView;
    }

    public static IncludeEarningsDataViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEarningsDataViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_earnings_data_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEarningsDataViewBinding bind(View view) {
        int i = C15314R.id.earnings_action_btn;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            i = C15314R.id.earnings_actual_eps_label_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C15314R.id.earnings_actual_eps_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C15314R.id.earnings_estimated_eps_label_txt;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C15314R.id.earnings_estimated_eps_txt;
                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView4 != null) {
                            i = C15314R.id.earnings_graph;
                            EarningsGraph earningsGraph = (EarningsGraph) ViewBindings.findChildViewById(view, i);
                            if (earningsGraph != null) {
                                i = C15314R.id.earnings_text_midpoint;
                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline != null) {
                                    return new IncludeEarningsDataViewBinding((EarningsDataView) view, rdsTextButton, rhTextView, rhTextView2, rhTextView3, rhTextView4, earningsGraph, guideline);
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
