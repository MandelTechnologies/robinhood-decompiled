package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.listitemsort.CuratedListUserSortOptionsView;

/* loaded from: classes8.dex */
public final class FragmentCuratedListUserListBinding implements ViewBinding {
    public final CuratedListUserSortOptionsView curatedListUserListStickySortOptionsView;
    public final RecyclerView fragmentCuratedListUserListRecyclerView;
    public final LinearLayout fragmentCuratedListUserListStickySortOptionsContainer;
    private final FrameLayout rootView;

    private FragmentCuratedListUserListBinding(FrameLayout frameLayout, CuratedListUserSortOptionsView curatedListUserSortOptionsView, RecyclerView recyclerView, LinearLayout linearLayout) {
        this.rootView = frameLayout;
        this.curatedListUserListStickySortOptionsView = curatedListUserSortOptionsView;
        this.fragmentCuratedListUserListRecyclerView = recyclerView;
        this.fragmentCuratedListUserListStickySortOptionsContainer = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCuratedListUserListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCuratedListUserListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.fragment_curated_list_user_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCuratedListUserListBinding bind(View view) {
        int i = C20839R.id.curated_list_user_list_sticky_sort_options_view;
        CuratedListUserSortOptionsView curatedListUserSortOptionsView = (CuratedListUserSortOptionsView) ViewBindings.findChildViewById(view, i);
        if (curatedListUserSortOptionsView != null) {
            i = C20839R.id.fragment_curated_list_user_list_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C20839R.id.fragment_curated_list_user_list_sticky_sort_options_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    return new FragmentCuratedListUserListBinding((FrameLayout) view, curatedListUserSortOptionsView, recyclerView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
