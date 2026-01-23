package com.robinhood.android.securitycenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.securitycenter.C28186R;

/* loaded from: classes5.dex */
public final class FragmentMfaSettingsBinding implements ViewBinding {
    public final RecyclerView mfaSettingsChangeMethodRecyclerView;
    public final RhTextView mfaSettingsChangeMethodTitle;
    public final RecyclerView mfaSettingsCurrentMethodRecyclerView;
    public final RhTextView mfaSettingsCurrentMethodTitle;
    public final ShimmerLoadingView mfaSettingsLoadingView;
    public final RhTextView mfaSettingsSubtitle;
    public final RhTextView mfaSettingsTitle;
    private final FrameLayout rootView;

    private FragmentMfaSettingsBinding(FrameLayout frameLayout, RecyclerView recyclerView, RhTextView rhTextView, RecyclerView recyclerView2, RhTextView rhTextView2, ShimmerLoadingView shimmerLoadingView, RhTextView rhTextView3, RhTextView rhTextView4) {
        this.rootView = frameLayout;
        this.mfaSettingsChangeMethodRecyclerView = recyclerView;
        this.mfaSettingsChangeMethodTitle = rhTextView;
        this.mfaSettingsCurrentMethodRecyclerView = recyclerView2;
        this.mfaSettingsCurrentMethodTitle = rhTextView2;
        this.mfaSettingsLoadingView = shimmerLoadingView;
        this.mfaSettingsSubtitle = rhTextView3;
        this.mfaSettingsTitle = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMfaSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMfaSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28186R.layout.fragment_mfa_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMfaSettingsBinding bind(View view) {
        int i = C28186R.id.mfa_settings_change_method_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C28186R.id.mfa_settings_change_method_title;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C28186R.id.mfa_settings_current_method_recycler_view;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView2 != null) {
                    i = C28186R.id.mfa_settings_current_method_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C28186R.id.mfa_settings_loading_view;
                        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                        if (shimmerLoadingView != null) {
                            i = C28186R.id.mfa_settings_subtitle;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C28186R.id.mfa_settings_title;
                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView4 != null) {
                                    return new FragmentMfaSettingsBinding((FrameLayout) view, recyclerView, rhTextView, recyclerView2, rhTextView2, shimmerLoadingView, rhTextView3, rhTextView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
