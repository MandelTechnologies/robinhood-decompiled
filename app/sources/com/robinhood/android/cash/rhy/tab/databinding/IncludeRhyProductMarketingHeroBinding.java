package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class IncludeRhyProductMarketingHeroBinding implements ViewBinding {
    public final RhTextView heroDisclosure;
    public final ImageView heroImage;
    public final RhTextView heroScrollText;
    public final RhTextView heroSubtitle;
    public final RhTextView heroTitle;
    private final ConstraintLayout rootView;

    private IncludeRhyProductMarketingHeroBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4) {
        this.rootView = constraintLayout;
        this.heroDisclosure = rhTextView;
        this.heroImage = imageView;
        this.heroScrollText = rhTextView2;
        this.heroSubtitle = rhTextView3;
        this.heroTitle = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeRhyProductMarketingHeroBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRhyProductMarketingHeroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10285R.layout.include_rhy_product_marketing_hero, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRhyProductMarketingHeroBinding bind(View view) {
        int i = C10285R.id.hero_disclosure;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C10285R.id.hero_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C10285R.id.hero_scroll_text;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C10285R.id.hero_subtitle;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C10285R.id.hero_title;
                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView4 != null) {
                            return new IncludeRhyProductMarketingHeroBinding((ConstraintLayout) view, rhTextView, imageView, rhTextView2, rhTextView3, rhTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
