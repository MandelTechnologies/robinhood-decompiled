package com.robinhood.android.transfers.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.transfers.recurring.C30439R;

/* loaded from: classes9.dex */
public final class FragmentAutomaticDepositListBinding implements ViewBinding {
    public final RecyclerView automaticDepositList;
    public final LinearLayout progressContainer;
    private final FrameLayout rootView;

    private FragmentAutomaticDepositListBinding(FrameLayout frameLayout, RecyclerView recyclerView, LinearLayout linearLayout) {
        this.rootView = frameLayout;
        this.automaticDepositList = recyclerView;
        this.progressContainer = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAutomaticDepositListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAutomaticDepositListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30439R.layout.fragment_automatic_deposit_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAutomaticDepositListBinding bind(View view) {
        int i = C30439R.id.automatic_deposit_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C30439R.id.progress_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                return new FragmentAutomaticDepositListBinding((FrameLayout) view, recyclerView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
