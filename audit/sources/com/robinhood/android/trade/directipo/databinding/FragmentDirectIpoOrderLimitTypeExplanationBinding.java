package com.robinhood.android.trade.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.directipo.C29323R;

/* loaded from: classes9.dex */
public final class FragmentDirectIpoOrderLimitTypeExplanationBinding implements ViewBinding {
    public final RhTextView limitTypeExplanationDescription;
    public final RdsButton limitTypeExplanationDismiss;
    public final RdsPogView limitTypeExplanationPog;
    public final RecyclerView limitTypeExplanationRecyclerView;
    public final RhTextView limitTypeExplanationTitle;
    private final LinearLayout rootView;

    private FragmentDirectIpoOrderLimitTypeExplanationBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsButton rdsButton, RdsPogView rdsPogView, RecyclerView recyclerView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.limitTypeExplanationDescription = rhTextView;
        this.limitTypeExplanationDismiss = rdsButton;
        this.limitTypeExplanationPog = rdsPogView;
        this.limitTypeExplanationRecyclerView = recyclerView;
        this.limitTypeExplanationTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectIpoOrderLimitTypeExplanationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectIpoOrderLimitTypeExplanationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29323R.layout.fragment_direct_ipo_order_limit_type_explanation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectIpoOrderLimitTypeExplanationBinding bind(View view) {
        int i = C29323R.id.limit_type_explanation_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C29323R.id.limit_type_explanation_dismiss;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C29323R.id.limit_type_explanation_pog;
                RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
                if (rdsPogView != null) {
                    i = C29323R.id.limit_type_explanation_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C29323R.id.limit_type_explanation_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentDirectIpoOrderLimitTypeExplanationBinding((LinearLayout) view, rhTextView, rdsButton, rdsPogView, recyclerView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
