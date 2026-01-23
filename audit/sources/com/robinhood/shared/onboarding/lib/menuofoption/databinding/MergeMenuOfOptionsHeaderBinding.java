package com.robinhood.shared.onboarding.lib.menuofoption.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.onboarding.lib.menuofoption.C39252R;

/* loaded from: classes6.dex */
public final class MergeMenuOfOptionsHeaderBinding implements ViewBinding {
    public final ImageView menuOfOptionsBannerHeader;
    public final ConstraintLayout menuOfOptionsHeader;
    public final RhTextView menuOfOptionsHeaderSubtitle;
    public final RhTextView menuOfOptionsHeaderTitle;
    public final ImageView menuOfOptionsHeroHeader;
    public final FrameLayout menuOfOptionsLoading;
    public final RecyclerView menuOfOptionsPathRecyclerView;
    private final View rootView;

    private MergeMenuOfOptionsHeaderBinding(View view, ImageView imageView, ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, ImageView imageView2, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.rootView = view;
        this.menuOfOptionsBannerHeader = imageView;
        this.menuOfOptionsHeader = constraintLayout;
        this.menuOfOptionsHeaderSubtitle = rhTextView;
        this.menuOfOptionsHeaderTitle = rhTextView2;
        this.menuOfOptionsHeroHeader = imageView2;
        this.menuOfOptionsLoading = frameLayout;
        this.menuOfOptionsPathRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeMenuOfOptionsHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C39252R.layout.merge_menu_of_options_header, viewGroup);
        return bind(viewGroup);
    }

    public static MergeMenuOfOptionsHeaderBinding bind(View view) {
        int i = C39252R.id.menu_of_options_banner_header;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C39252R.id.menu_of_options_header;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C39252R.id.menu_of_options_header_subtitle;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C39252R.id.menu_of_options_header_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C39252R.id.menu_of_options_hero_header;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = C39252R.id.menu_of_options_loading;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null) {
                                i = C39252R.id.menu_of_options_path_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    return new MergeMenuOfOptionsHeaderBinding(view, imageView, constraintLayout, rhTextView, rhTextView2, imageView2, frameLayout, recyclerView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
