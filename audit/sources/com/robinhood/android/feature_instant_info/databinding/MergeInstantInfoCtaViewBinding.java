package com.robinhood.android.feature_instant_info.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.feature_instant_info.C16914R;

/* loaded from: classes3.dex */
public final class MergeInstantInfoCtaViewBinding implements ViewBinding {
    public final RdsButton button;
    private final View rootView;

    private MergeInstantInfoCtaViewBinding(View view, RdsButton rdsButton) {
        this.rootView = view;
        this.button = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeInstantInfoCtaViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C16914R.layout.merge_instant_info_cta_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeInstantInfoCtaViewBinding bind(View view) {
        int i = C16914R.id.button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            return new MergeInstantInfoCtaViewBinding(view, rdsButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
