package com.robinhood.android.optionsstrategybuilder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.optionsstrategybuilder.C24876R;

/* loaded from: classes11.dex */
public final class IncludeNudgeToolRdsChipBinding implements ViewBinding {
    public final ImageView chipImageView;
    private final RdsRippleContainerView rootView;

    private IncludeNudgeToolRdsChipBinding(RdsRippleContainerView rdsRippleContainerView, ImageView imageView) {
        this.rootView = rdsRippleContainerView;
        this.chipImageView = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRippleContainerView getRoot() {
        return this.rootView;
    }

    public static IncludeNudgeToolRdsChipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNudgeToolRdsChipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24876R.layout.include_nudge_tool_rds_chip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNudgeToolRdsChipBinding bind(View view) {
        int i = C24876R.id.chip_image_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            return new IncludeNudgeToolRdsChipBinding((RdsRippleContainerView) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
