package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.accountcenter.C8293R;

/* loaded from: classes24.dex */
public final class MergeProfileAccountBreakdownViewBinding implements ViewBinding {
    public final LinearLayout profileAccountBreakdownInfoBannerContainer;
    public final LinearLayout profileAccountBreakdownRowContainer;
    private final View rootView;

    private MergeProfileAccountBreakdownViewBinding(View view, LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.rootView = view;
        this.profileAccountBreakdownInfoBannerContainer = linearLayout;
        this.profileAccountBreakdownRowContainer = linearLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeProfileAccountBreakdownViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C8293R.layout.merge_profile_account_breakdown_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeProfileAccountBreakdownViewBinding bind(View view) {
        int i = C8293R.id.profile_account_breakdown_info_banner_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C8293R.id.profile_account_breakdown_row_container;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                return new MergeProfileAccountBreakdownViewBinding(view, linearLayout, linearLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
