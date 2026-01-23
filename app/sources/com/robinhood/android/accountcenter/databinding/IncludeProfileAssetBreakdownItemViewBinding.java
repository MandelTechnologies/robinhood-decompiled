package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.ProfileAssetBreakdownItemView;

/* loaded from: classes24.dex */
public final class IncludeProfileAssetBreakdownItemViewBinding implements ViewBinding {
    private final ProfileAssetBreakdownItemView rootView;

    private IncludeProfileAssetBreakdownItemViewBinding(ProfileAssetBreakdownItemView profileAssetBreakdownItemView) {
        this.rootView = profileAssetBreakdownItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ProfileAssetBreakdownItemView getRoot() {
        return this.rootView;
    }

    public static IncludeProfileAssetBreakdownItemViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeProfileAssetBreakdownItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_profile_asset_breakdown_item_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeProfileAssetBreakdownItemViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeProfileAssetBreakdownItemViewBinding((ProfileAssetBreakdownItemView) view);
    }
}
