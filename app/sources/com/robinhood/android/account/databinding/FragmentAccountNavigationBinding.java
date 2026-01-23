package com.robinhood.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.account.C8066R;
import com.robinhood.android.designsystem.sparkle.SparkleImageView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAccountNavigationBinding implements ViewBinding {
    public final RhTextView accountHeaderTitle;
    public final NestedScrollView contentRoot;
    public final SparkleImageView goldBadge;
    public final ConstraintLayout navDrawerAccountHeader;
    public final RecyclerView navigationRecyclerView;
    private final NestedScrollView rootView;

    private FragmentAccountNavigationBinding(NestedScrollView nestedScrollView, RhTextView rhTextView, NestedScrollView nestedScrollView2, SparkleImageView sparkleImageView, ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.rootView = nestedScrollView;
        this.accountHeaderTitle = rhTextView;
        this.contentRoot = nestedScrollView2;
        this.goldBadge = sparkleImageView;
        this.navDrawerAccountHeader = constraintLayout;
        this.navigationRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAccountNavigationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAccountNavigationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8066R.layout.fragment_account_navigation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAccountNavigationBinding bind(View view) {
        int i = C8066R.id.account_header_title;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            i = C8066R.id.gold_badge;
            SparkleImageView sparkleImageView = (SparkleImageView) ViewBindings.findChildViewById(view, i);
            if (sparkleImageView != null) {
                i = C8066R.id.nav_drawer_account_header;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C8066R.id.navigation_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        return new FragmentAccountNavigationBinding(nestedScrollView, rhTextView, nestedScrollView, sparkleImageView, constraintLayout, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
