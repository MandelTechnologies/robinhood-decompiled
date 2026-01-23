package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.p254ui.C28356R;

/* loaded from: classes5.dex */
public final class MergeSectionHeaderViewBinding implements ViewBinding {
    public final ImageView headerIconImg;
    public final RhTextView headerSubtitleTxt;
    public final RhTextView headerTitleTxt;
    private final View rootView;

    private MergeSectionHeaderViewBinding(View view, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.headerIconImg = imageView;
        this.headerSubtitleTxt = rhTextView;
        this.headerTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeSectionHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28356R.layout.merge_section_header_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeSectionHeaderViewBinding bind(View view) {
        int i = C28356R.id.header_icon_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C28356R.id.header_subtitle_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C28356R.id.header_title_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeSectionHeaderViewBinding(view, imageView, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
