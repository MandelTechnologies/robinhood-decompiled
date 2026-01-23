package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class IncludeFileSelectionItemBinding implements ViewBinding {
    public final ImageView fileSelectionItemImage;
    public final ConstraintLayout fileSelectionItemLayout;
    public final RhTextView fileSelectionItemName;
    public final ImageView fileSelectionItemRemoveIcon;
    private final ConstraintLayout rootView;

    private IncludeFileSelectionItemBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, RhTextView rhTextView, ImageView imageView2) {
        this.rootView = constraintLayout;
        this.fileSelectionItemImage = imageView;
        this.fileSelectionItemLayout = constraintLayout2;
        this.fileSelectionItemName = rhTextView;
        this.fileSelectionItemRemoveIcon = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeFileSelectionItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeFileSelectionItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.include_file_selection_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeFileSelectionItemBinding bind(View view) {
        int i = C10007R.id.file_selection_item_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C10007R.id.file_selection_item_name;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C10007R.id.file_selection_item_remove_icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    return new IncludeFileSelectionItemBinding(constraintLayout, imageView, constraintLayout, rhTextView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
