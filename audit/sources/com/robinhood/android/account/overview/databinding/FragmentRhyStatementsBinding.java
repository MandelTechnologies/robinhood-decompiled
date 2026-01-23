package com.robinhood.android.account.overview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentRhyStatementsBinding implements ViewBinding {
    public final RhTextView noStatementsMessage;
    private final FrameLayout rootView;
    public final RecyclerView statementsRecyclerView;

    private FragmentRhyStatementsBinding(FrameLayout frameLayout, RhTextView rhTextView, RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.noStatementsMessage = rhTextView;
        this.statementsRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyStatementsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyStatementsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8159R.layout.fragment_rhy_statements, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyStatementsBinding bind(View view) {
        int i = C8159R.id.noStatementsMessage;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C8159R.id.statementsRecyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new FragmentRhyStatementsBinding((FrameLayout) view, rhTextView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
