package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class MergeCuratedListIpoAccessHeaderBinding implements ViewBinding {
    public final Barrier curatedListIpoHeaderBottomBarrier;
    public final RdsInlineDefinitionTextView curatedListIpoHeaderDescription;
    public final ImageView curatedListIpoHeaderImage;
    public final RhTextView curatedListIpoHeaderSubtitle;
    public final RhTextView curatedListIpoHeaderTitle;
    public final Space curatedListIpoHeaderTopSpace;
    private final View rootView;

    private MergeCuratedListIpoAccessHeaderBinding(View view, Barrier barrier, RdsInlineDefinitionTextView rdsInlineDefinitionTextView, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2, Space space) {
        this.rootView = view;
        this.curatedListIpoHeaderBottomBarrier = barrier;
        this.curatedListIpoHeaderDescription = rdsInlineDefinitionTextView;
        this.curatedListIpoHeaderImage = imageView;
        this.curatedListIpoHeaderSubtitle = rhTextView;
        this.curatedListIpoHeaderTitle = rhTextView2;
        this.curatedListIpoHeaderTopSpace = space;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCuratedListIpoAccessHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20839R.layout.merge_curated_list_ipo_access_header, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCuratedListIpoAccessHeaderBinding bind(View view) {
        int i = C20839R.id.curated_list_ipo_header_bottom_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C20839R.id.curated_list_ipo_header_description;
            RdsInlineDefinitionTextView rdsInlineDefinitionTextView = (RdsInlineDefinitionTextView) ViewBindings.findChildViewById(view, i);
            if (rdsInlineDefinitionTextView != null) {
                i = C20839R.id.curated_list_ipo_header_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C20839R.id.curated_list_ipo_header_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C20839R.id.curated_list_ipo_header_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C20839R.id.curated_list_ipo_header_top_space;
                            Space space = (Space) ViewBindings.findChildViewById(view, i);
                            if (space != null) {
                                return new MergeCuratedListIpoAccessHeaderBinding(view, barrier, rdsInlineDefinitionTextView, imageView, rhTextView, rhTextView2, space);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
