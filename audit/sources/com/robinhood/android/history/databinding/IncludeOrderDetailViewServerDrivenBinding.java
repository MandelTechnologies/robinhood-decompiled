package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class IncludeOrderDetailViewServerDrivenBinding implements ViewBinding {
    public final RecyclerView buttonRecyclerView;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;

    private IncludeOrderDetailViewServerDrivenBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = constraintLayout;
        this.buttonRecyclerView = recyclerView;
        this.recyclerView = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeOrderDetailViewServerDrivenBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOrderDetailViewServerDrivenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.include_order_detail_view_server_driven, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOrderDetailViewServerDrivenBinding bind(View view) {
        int i = C18359R.id.button_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C18359R.id.recycler_view;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView2 != null) {
                return new IncludeOrderDetailViewServerDrivenBinding((ConstraintLayout) view, recyclerView, recyclerView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
