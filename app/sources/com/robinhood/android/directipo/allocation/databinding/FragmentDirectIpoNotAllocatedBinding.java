package com.robinhood.android.directipo.allocation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.directipo.allocation.C14171R;

/* loaded from: classes27.dex */
public final class FragmentDirectIpoNotAllocatedBinding implements ViewBinding {
    public final RecyclerView fragmentDirectIpoNotAllocatedButtonRecyclerView;
    public final RecyclerView fragmentDirectIpoNotAllocatedRecyclerView;
    private final LinearLayout rootView;

    private FragmentDirectIpoNotAllocatedBinding(LinearLayout linearLayout, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = linearLayout;
        this.fragmentDirectIpoNotAllocatedButtonRecyclerView = recyclerView;
        this.fragmentDirectIpoNotAllocatedRecyclerView = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectIpoNotAllocatedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectIpoNotAllocatedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14171R.layout.fragment_direct_ipo_not_allocated, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectIpoNotAllocatedBinding bind(View view) {
        int i = C14171R.id.fragment_direct_ipo_not_allocated_button_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C14171R.id.fragment_direct_ipo_not_allocated_recycler_view;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView2 != null) {
                return new FragmentDirectIpoNotAllocatedBinding((LinearLayout) view, recyclerView, recyclerView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
