package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListDetailView;

/* loaded from: classes8.dex */
public final class FragmentCuratedListRhListBinding implements ViewBinding {
    public final CuratedListRhListDetailView fragmentCuratedListRhListStickyDetailView;
    public final RecyclerView fragmentCuratedListUserListRecyclerView;
    private final FrameLayout rootView;

    private FragmentCuratedListRhListBinding(FrameLayout frameLayout, CuratedListRhListDetailView curatedListRhListDetailView, RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.fragmentCuratedListRhListStickyDetailView = curatedListRhListDetailView;
        this.fragmentCuratedListUserListRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCuratedListRhListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCuratedListRhListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.fragment_curated_list_rh_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCuratedListRhListBinding bind(View view) {
        int i = C20839R.id.fragment_curated_list_rh_list_sticky_detail_view;
        CuratedListRhListDetailView curatedListRhListDetailView = (CuratedListRhListDetailView) ViewBindings.findChildViewById(view, i);
        if (curatedListRhListDetailView != null) {
            i = C20839R.id.fragment_curated_list_user_list_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new FragmentCuratedListRhListBinding((FrameLayout) view, curatedListRhListDetailView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
