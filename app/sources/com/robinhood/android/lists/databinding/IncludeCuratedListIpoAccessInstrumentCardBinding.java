package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class IncludeCuratedListIpoAccessInstrumentCardBinding implements ViewBinding {
    public final AnimatedRhTextView instrumentChangeTxt;
    public final ImageView instrumentLogoImg;
    public final RhTextView instrumentNameTxt;
    public final RhTextView instrumentSymbolTxt;
    private final FrameLayout rootView;

    private IncludeCuratedListIpoAccessInstrumentCardBinding(FrameLayout frameLayout, AnimatedRhTextView animatedRhTextView, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = frameLayout;
        this.instrumentChangeTxt = animatedRhTextView;
        this.instrumentLogoImg = imageView;
        this.instrumentNameTxt = rhTextView;
        this.instrumentSymbolTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeCuratedListIpoAccessInstrumentCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCuratedListIpoAccessInstrumentCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_curated_list_ipo_access_instrument_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCuratedListIpoAccessInstrumentCardBinding bind(View view) {
        int i = C20839R.id.instrument_change_txt;
        AnimatedRhTextView animatedRhTextView = (AnimatedRhTextView) ViewBindings.findChildViewById(view, i);
        if (animatedRhTextView != null) {
            i = C20839R.id.instrument_logo_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C20839R.id.instrument_name_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C20839R.id.instrument_symbol_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new IncludeCuratedListIpoAccessInstrumentCardBinding((FrameLayout) view, animatedRhTextView, imageView, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
