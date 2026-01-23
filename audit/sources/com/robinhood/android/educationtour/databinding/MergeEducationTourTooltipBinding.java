package com.robinhood.android.educationtour.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.tooltip.RdsTooltipTextView;
import com.robinhood.android.educationtour.C14469R;

/* loaded from: classes7.dex */
public final class MergeEducationTourTooltipBinding implements ViewBinding {
    public final ImageView closeBtn;
    public final ImageView downTooltipNib;
    private final View rootView;
    public final View tooltipBackground;
    public final RdsTooltipTextView tooltipText;
    public final ImageView upTooltipNib;

    private MergeEducationTourTooltipBinding(View view, ImageView imageView, ImageView imageView2, View view2, RdsTooltipTextView rdsTooltipTextView, ImageView imageView3) {
        this.rootView = view;
        this.closeBtn = imageView;
        this.downTooltipNib = imageView2;
        this.tooltipBackground = view2;
        this.tooltipText = rdsTooltipTextView;
        this.upTooltipNib = imageView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEducationTourTooltipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14469R.layout.merge_education_tour_tooltip, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEducationTourTooltipBinding bind(View view) {
        View viewFindChildViewById;
        int i = C14469R.id.close_btn;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C14469R.id.down_tooltip_nib;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C14469R.id.tooltip_background))) != null) {
                i = C14469R.id.tooltip_text;
                RdsTooltipTextView rdsTooltipTextView = (RdsTooltipTextView) ViewBindings.findChildViewById(view, i);
                if (rdsTooltipTextView != null) {
                    i = C14469R.id.up_tooltip_nib;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        return new MergeEducationTourTooltipBinding(view, imageView, imageView2, viewFindChildViewById, rdsTooltipTextView, imageView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
