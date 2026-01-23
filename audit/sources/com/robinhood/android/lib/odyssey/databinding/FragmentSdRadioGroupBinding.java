package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdRadioGroupView;
import com.robinhood.android.odyssey.lib.view.SdTextView;

/* loaded from: classes8.dex */
public final class FragmentSdRadioGroupBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final Space sdRadioGroupButtonBottomMargin;
    public final SdRadioGroupView sdRadioGroupContent;
    public final ScrollView sdRadioGroupContentScrollview;
    public final SdButton sdRadioGroupPrimaryCta;
    public final SdButton sdRadioGroupSecondaryCta;
    public final SdTextView sdRadioGroupSubtitle;
    public final SdTextView sdRadioGroupTitle;

    private FragmentSdRadioGroupBinding(LinearLayout linearLayout, Space space, SdRadioGroupView sdRadioGroupView, ScrollView scrollView, SdButton sdButton, SdButton sdButton2, SdTextView sdTextView, SdTextView sdTextView2) {
        this.rootView = linearLayout;
        this.sdRadioGroupButtonBottomMargin = space;
        this.sdRadioGroupContent = sdRadioGroupView;
        this.sdRadioGroupContentScrollview = scrollView;
        this.sdRadioGroupPrimaryCta = sdButton;
        this.sdRadioGroupSecondaryCta = sdButton2;
        this.sdRadioGroupSubtitle = sdTextView;
        this.sdRadioGroupTitle = sdTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSdRadioGroupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSdRadioGroupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_sd_radio_group, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSdRadioGroupBinding bind(View view) {
        int i = C20335R.id.sd_radio_group_button_bottom_margin;
        Space space = (Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = C20335R.id.sd_radio_group_content;
            SdRadioGroupView sdRadioGroupView = (SdRadioGroupView) ViewBindings.findChildViewById(view, i);
            if (sdRadioGroupView != null) {
                i = C20335R.id.sd_radio_group_content_scrollview;
                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                if (scrollView != null) {
                    i = C20335R.id.sd_radio_group_primary_cta;
                    SdButton sdButton = (SdButton) ViewBindings.findChildViewById(view, i);
                    if (sdButton != null) {
                        i = C20335R.id.sd_radio_group_secondary_cta;
                        SdButton sdButton2 = (SdButton) ViewBindings.findChildViewById(view, i);
                        if (sdButton2 != null) {
                            i = C20335R.id.sd_radio_group_subtitle;
                            SdTextView sdTextView = (SdTextView) ViewBindings.findChildViewById(view, i);
                            if (sdTextView != null) {
                                i = C20335R.id.sd_radio_group_title;
                                SdTextView sdTextView2 = (SdTextView) ViewBindings.findChildViewById(view, i);
                                if (sdTextView2 != null) {
                                    return new FragmentSdRadioGroupBinding((LinearLayout) view, space, sdRadioGroupView, scrollView, sdButton, sdButton2, sdTextView, sdTextView2);
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
