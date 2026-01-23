package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.p254ui.C28356R;

/* loaded from: classes5.dex */
public final class MergeSettingsHeaderBinding implements ViewBinding {
    public final Group contentGroup;
    public final ImageView headerBackgroundImg;
    public final Space headerBottomSpace;
    public final ConstraintLayout headerLayout;
    public final RhTextView headerSubtitleTxt;
    public final RhTextView headerTitleTxt;
    private final View rootView;

    private MergeSettingsHeaderBinding(View view, Group group, ImageView imageView, Space space, ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.contentGroup = group;
        this.headerBackgroundImg = imageView;
        this.headerBottomSpace = space;
        this.headerLayout = constraintLayout;
        this.headerSubtitleTxt = rhTextView;
        this.headerTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeSettingsHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28356R.layout.merge_settings_header, viewGroup);
        return bind(viewGroup);
    }

    public static MergeSettingsHeaderBinding bind(View view) {
        int i = C28356R.id.content_group;
        Group group = (Group) ViewBindings.findChildViewById(view, i);
        if (group != null) {
            i = C28356R.id.header_background_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C28356R.id.header_bottom_space;
                Space space = (Space) ViewBindings.findChildViewById(view, i);
                if (space != null) {
                    i = C28356R.id.header_layout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C28356R.id.header_subtitle_txt;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C28356R.id.header_title_txt;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                return new MergeSettingsHeaderBinding(view, group, imageView, space, constraintLayout, rhTextView, rhTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
