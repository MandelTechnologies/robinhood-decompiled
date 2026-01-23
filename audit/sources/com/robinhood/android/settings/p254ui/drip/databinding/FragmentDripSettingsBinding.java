package com.robinhood.android.settings.p254ui.drip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.settings.p254ui.drip.C28363R;

/* loaded from: classes5.dex */
public final class FragmentDripSettingsBinding implements ViewBinding {
    public final ComposeView composeView;
    public final RecyclerView dripSettingsRecyclerView;
    private final FrameLayout rootView;

    private FragmentDripSettingsBinding(FrameLayout frameLayout, ComposeView composeView, RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.composeView = composeView;
        this.dripSettingsRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDripSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDripSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28363R.layout.fragment_drip_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDripSettingsBinding bind(View view) {
        int i = C28363R.id.compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C28363R.id.drip_settings_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new FragmentDripSettingsBinding((FrameLayout) view, composeView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
