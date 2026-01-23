package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.directipo.allocation.clarity.C14172R;

/* loaded from: classes27.dex */
public final class FragmentPostCobFollowupBinding implements ViewBinding {
    public final RecyclerView fragmentPostCobFollowupButtonRecyclerView;
    public final RecyclerView fragmentPostCobFollowupSectionRecyclerView;
    private final LinearLayout rootView;

    private FragmentPostCobFollowupBinding(LinearLayout linearLayout, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = linearLayout;
        this.fragmentPostCobFollowupButtonRecyclerView = recyclerView;
        this.fragmentPostCobFollowupSectionRecyclerView = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPostCobFollowupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPostCobFollowupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14172R.layout.fragment_post_cob_followup, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPostCobFollowupBinding bind(View view) {
        int i = C14172R.id.fragment_post_cob_followup_button_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C14172R.id.fragment_post_cob_followup_section_recycler_view;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView2 != null) {
                return new FragmentPostCobFollowupBinding((LinearLayout) view, recyclerView, recyclerView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
