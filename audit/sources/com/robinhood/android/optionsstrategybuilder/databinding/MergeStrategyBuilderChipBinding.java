package com.robinhood.android.optionsstrategybuilder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsstrategybuilder.C24876R;

/* loaded from: classes11.dex */
public final class MergeStrategyBuilderChipBinding implements ViewBinding {
    public final ImageView chipDropdownImageView;
    public final ImageView chipImageView;
    public final RhTextView chipSpacerTextView;
    public final RhTextView chipTextView;
    private final View rootView;

    private MergeStrategyBuilderChipBinding(View view, ImageView imageView, ImageView imageView2, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.chipDropdownImageView = imageView;
        this.chipImageView = imageView2;
        this.chipSpacerTextView = rhTextView;
        this.chipTextView = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeStrategyBuilderChipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C24876R.layout.merge_strategy_builder_chip, viewGroup);
        return bind(viewGroup);
    }

    public static MergeStrategyBuilderChipBinding bind(View view) {
        int i = C24876R.id.chip_dropdown_image_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C24876R.id.chip_image_view;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C24876R.id.chip_spacer_text_view;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C24876R.id.chip_text_view;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new MergeStrategyBuilderChipBinding(view, imageView, imageView2, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
