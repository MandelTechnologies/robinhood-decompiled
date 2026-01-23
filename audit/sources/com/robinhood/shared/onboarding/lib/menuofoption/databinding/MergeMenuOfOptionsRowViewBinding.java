package com.robinhood.shared.onboarding.lib.menuofoption.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.onboarding.lib.menuofoption.C39252R;

/* loaded from: classes6.dex */
public final class MergeMenuOfOptionsRowViewBinding implements ViewBinding {
    private final View rootView;
    public final View rowBottomDivider;
    public final ImageView rowLeadingIcon;
    public final ImageView rowLeadingIconBadge;
    public final RhTextView rowPrimaryText;
    public final RhTextView rowSecondaryText;
    public final ConstraintLayout rowTextContainer;

    private MergeMenuOfOptionsRowViewBinding(View view, View view2, ImageView imageView, ImageView imageView2, RhTextView rhTextView, RhTextView rhTextView2, ConstraintLayout constraintLayout) {
        this.rootView = view;
        this.rowBottomDivider = view2;
        this.rowLeadingIcon = imageView;
        this.rowLeadingIconBadge = imageView2;
        this.rowPrimaryText = rhTextView;
        this.rowSecondaryText = rhTextView2;
        this.rowTextContainer = constraintLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeMenuOfOptionsRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C39252R.layout.merge_menu_of_options_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeMenuOfOptionsRowViewBinding bind(View view) {
        int i = C39252R.id.row_bottom_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C39252R.id.row_leading_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C39252R.id.row_leading_icon_badge;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C39252R.id.row_primary_text;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C39252R.id.row_secondary_text;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C39252R.id.row_text_container;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                return new MergeMenuOfOptionsRowViewBinding(view, viewFindChildViewById, imageView, imageView2, rhTextView, rhTextView2, constraintLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
