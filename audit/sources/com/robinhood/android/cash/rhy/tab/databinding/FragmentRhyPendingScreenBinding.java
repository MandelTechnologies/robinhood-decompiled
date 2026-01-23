package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyHeroAssetView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes7.dex */
public final class FragmentRhyPendingScreenBinding implements ViewBinding {
    public final RecyclerView rhyPendingScreenActionsRecyclerView;
    public final RhyHeroAssetView rhyPendingScreenHeroAssetView;
    public final RhTextView rhyPendingScreenMessage;
    public final FocusSafeNestedScrollView rhyPendingScreenScrollView;
    public final RhTextView rhyPendingScreenTitle;
    private final FocusSafeNestedScrollView rootView;

    private FragmentRhyPendingScreenBinding(FocusSafeNestedScrollView focusSafeNestedScrollView, RecyclerView recyclerView, RhyHeroAssetView rhyHeroAssetView, RhTextView rhTextView, FocusSafeNestedScrollView focusSafeNestedScrollView2, RhTextView rhTextView2) {
        this.rootView = focusSafeNestedScrollView;
        this.rhyPendingScreenActionsRecyclerView = recyclerView;
        this.rhyPendingScreenHeroAssetView = rhyHeroAssetView;
        this.rhyPendingScreenMessage = rhTextView;
        this.rhyPendingScreenScrollView = focusSafeNestedScrollView2;
        this.rhyPendingScreenTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FocusSafeNestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentRhyPendingScreenBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyPendingScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10285R.layout.fragment_rhy_pending_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyPendingScreenBinding bind(View view) {
        int i = C10285R.id.rhy_pending_screen_actions_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C10285R.id.rhy_pending_screen_hero_asset_view;
            RhyHeroAssetView rhyHeroAssetView = (RhyHeroAssetView) ViewBindings.findChildViewById(view, i);
            if (rhyHeroAssetView != null) {
                i = C10285R.id.rhy_pending_screen_message;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    FocusSafeNestedScrollView focusSafeNestedScrollView = (FocusSafeNestedScrollView) view;
                    i = C10285R.id.rhy_pending_screen_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentRhyPendingScreenBinding(focusSafeNestedScrollView, recyclerView, rhyHeroAssetView, rhTextView, focusSafeNestedScrollView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
