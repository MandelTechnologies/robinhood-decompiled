package com.robinhood.android.ordersummary.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.ordersummary.C25242R;

/* loaded from: classes11.dex */
public final class MergeOrderSummaryExplanationSectionBinding implements ViewBinding {
    public final RhTextView descriptionTxt;
    public final RecyclerView recyclerView;
    private final View rootView;
    public final RhTextView titleTxt;

    private MergeOrderSummaryExplanationSectionBinding(View view, RhTextView rhTextView, RecyclerView recyclerView, RhTextView rhTextView2) {
        this.rootView = view;
        this.descriptionTxt = rhTextView;
        this.recyclerView = recyclerView;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOrderSummaryExplanationSectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C25242R.layout.merge_order_summary_explanation_section, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOrderSummaryExplanationSectionBinding bind(View view) {
        int i = C25242R.id.description_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C25242R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C25242R.id.title_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeOrderSummaryExplanationSectionBinding(view, rhTextView, recyclerView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
