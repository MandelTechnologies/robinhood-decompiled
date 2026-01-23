package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdImageView;
import com.robinhood.android.odyssey.lib.view.SdTextView;

/* loaded from: classes8.dex */
public final class FragmentSdImageBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final Space sdoImageExtraPaddingBetweenCtaAndSubtitle;
    public final SdImageView sdoImageImageView;
    public final SdButton sdoImagePrimaryCta;
    public final SdTextView sdoImageSubtitle;
    public final SdTextView sdoImageTitle;

    private FragmentSdImageBinding(ConstraintLayout constraintLayout, Space space, SdImageView sdImageView, SdButton sdButton, SdTextView sdTextView, SdTextView sdTextView2) {
        this.rootView = constraintLayout;
        this.sdoImageExtraPaddingBetweenCtaAndSubtitle = space;
        this.sdoImageImageView = sdImageView;
        this.sdoImagePrimaryCta = sdButton;
        this.sdoImageSubtitle = sdTextView;
        this.sdoImageTitle = sdTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSdImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSdImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_sd_image, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSdImageBinding bind(View view) {
        int i = C20335R.id.sdo_image_extra_padding_between_cta_and_subtitle;
        Space space = (Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = C20335R.id.sdo_image_image_view;
            SdImageView sdImageView = (SdImageView) ViewBindings.findChildViewById(view, i);
            if (sdImageView != null) {
                i = C20335R.id.sdo_image_primary_cta;
                SdButton sdButton = (SdButton) ViewBindings.findChildViewById(view, i);
                if (sdButton != null) {
                    i = C20335R.id.sdo_image_subtitle;
                    SdTextView sdTextView = (SdTextView) ViewBindings.findChildViewById(view, i);
                    if (sdTextView != null) {
                        i = C20335R.id.sdo_image_title;
                        SdTextView sdTextView2 = (SdTextView) ViewBindings.findChildViewById(view, i);
                        if (sdTextView2 != null) {
                            return new FragmentSdImageBinding((ConstraintLayout) view, space, sdImageView, sdButton, sdTextView, sdTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
