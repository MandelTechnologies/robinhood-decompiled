package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.ProfileAssetTabLayout;

/* loaded from: classes24.dex */
public final class IncludeProfileAssetTabLayoutBinding implements ViewBinding {
    private final ProfileAssetTabLayout rootView;

    private IncludeProfileAssetTabLayoutBinding(ProfileAssetTabLayout profileAssetTabLayout) {
        this.rootView = profileAssetTabLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ProfileAssetTabLayout getRoot() {
        return this.rootView;
    }

    public static IncludeProfileAssetTabLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeProfileAssetTabLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_profile_asset_tab_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeProfileAssetTabLayoutBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeProfileAssetTabLayoutBinding((ProfileAssetTabLayout) view);
    }
}
