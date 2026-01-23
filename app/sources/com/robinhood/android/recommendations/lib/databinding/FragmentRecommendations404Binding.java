package com.robinhood.android.recommendations.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.recommendations.lib.C25982R;

/* loaded from: classes11.dex */
public final class FragmentRecommendations404Binding implements ViewBinding {
    public final ImageView image;
    public final RdsButton primaryCta;
    private final LinearLayout rootView;
    public final RdsButton secondaryCta;

    private FragmentRecommendations404Binding(LinearLayout linearLayout, ImageView imageView, RdsButton rdsButton, RdsButton rdsButton2) {
        this.rootView = linearLayout;
        this.image = imageView;
        this.primaryCta = rdsButton;
        this.secondaryCta = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecommendations404Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecommendations404Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25982R.layout.fragment_recommendations_404, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecommendations404Binding bind(View view) {
        int i = C25982R.id.image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C25982R.id.primary_cta;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C25982R.id.secondary_cta;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    return new FragmentRecommendations404Binding((LinearLayout) view, imageView, rdsButton, rdsButton2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
