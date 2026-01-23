package com.robinhood.android.securitycenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.securitycenter.C28186R;

/* loaded from: classes5.dex */
public final class FragmentLockscreenTimeoutBinding implements ViewBinding {
    public final RecyclerView lockscreenTimeoutRecyclerView;
    public final RhTextView lockscreenTimeoutTitleTxt;
    private final LinearLayout rootView;

    private FragmentLockscreenTimeoutBinding(LinearLayout linearLayout, RecyclerView recyclerView, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.lockscreenTimeoutRecyclerView = recyclerView;
        this.lockscreenTimeoutTitleTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLockscreenTimeoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLockscreenTimeoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28186R.layout.fragment_lockscreen_timeout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentLockscreenTimeoutBinding bind(View view) {
        int i = C28186R.id.lockscreen_timeout_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C28186R.id.lockscreen_timeout_title_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new FragmentLockscreenTimeoutBinding((LinearLayout) view, recyclerView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
