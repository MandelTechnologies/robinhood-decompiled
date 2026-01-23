package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.button.RdsIconButton;

/* loaded from: classes2.dex */
public final class MergeTopNavButtonViewBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final ImageView topNavBadgeView;
    public final ImageView topNavCriticalBadgeView;
    public final RdsIconButton topNavIconButton;

    private MergeTopNavButtonViewBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, RdsIconButton rdsIconButton) {
        this.rootView = constraintLayout;
        this.topNavBadgeView = imageView;
        this.topNavCriticalBadgeView = imageView2;
        this.topNavIconButton = rdsIconButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeTopNavButtonViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeTopNavButtonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.merge_top_nav_button_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeTopNavButtonViewBinding bind(View view) {
        int i = C11048R.id.top_nav_badge_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C11048R.id.top_nav_critical_badge_view;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C11048R.id.top_nav_icon_button;
                RdsIconButton rdsIconButton = (RdsIconButton) ViewBindings.findChildViewById(view, i);
                if (rdsIconButton != null) {
                    return new MergeTopNavButtonViewBinding((ConstraintLayout) view, imageView, imageView2, rdsIconButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
