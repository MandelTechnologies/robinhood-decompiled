package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdInformationalRowContainer;
import com.robinhood.android.odyssey.lib.view.SdTextView;

/* loaded from: classes8.dex */
public final class FragmentSdInformationalListBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final SdInformationalRowContainer sdInformationalListContainer;
    public final SdTextView sdInformationalListDisclosure;
    public final SdButton sdInformationalListPrimaryCta;
    public final ScrollView sdInformationalListScrollView;
    public final SdButton sdInformationalListSecondaryCta;
    public final SdTextView sdInformationalListSubtitle;
    public final SdTextView sdInformationalListTitle;

    private FragmentSdInformationalListBinding(LinearLayout linearLayout, SdInformationalRowContainer sdInformationalRowContainer, SdTextView sdTextView, SdButton sdButton, ScrollView scrollView, SdButton sdButton2, SdTextView sdTextView2, SdTextView sdTextView3) {
        this.rootView = linearLayout;
        this.sdInformationalListContainer = sdInformationalRowContainer;
        this.sdInformationalListDisclosure = sdTextView;
        this.sdInformationalListPrimaryCta = sdButton;
        this.sdInformationalListScrollView = scrollView;
        this.sdInformationalListSecondaryCta = sdButton2;
        this.sdInformationalListSubtitle = sdTextView2;
        this.sdInformationalListTitle = sdTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSdInformationalListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSdInformationalListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_sd_informational_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSdInformationalListBinding bind(View view) {
        int i = C20335R.id.sd_informational_list_container;
        SdInformationalRowContainer sdInformationalRowContainer = (SdInformationalRowContainer) ViewBindings.findChildViewById(view, i);
        if (sdInformationalRowContainer != null) {
            i = C20335R.id.sd_informational_list_disclosure;
            SdTextView sdTextView = (SdTextView) ViewBindings.findChildViewById(view, i);
            if (sdTextView != null) {
                i = C20335R.id.sd_informational_list_primary_cta;
                SdButton sdButton = (SdButton) ViewBindings.findChildViewById(view, i);
                if (sdButton != null) {
                    i = C20335R.id.sd_informational_list_scroll_view;
                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                    if (scrollView != null) {
                        i = C20335R.id.sd_informational_list_secondary_cta;
                        SdButton sdButton2 = (SdButton) ViewBindings.findChildViewById(view, i);
                        if (sdButton2 != null) {
                            i = C20335R.id.sd_informational_list_subtitle;
                            SdTextView sdTextView2 = (SdTextView) ViewBindings.findChildViewById(view, i);
                            if (sdTextView2 != null) {
                                i = C20335R.id.sd_informational_list_title;
                                SdTextView sdTextView3 = (SdTextView) ViewBindings.findChildViewById(view, i);
                                if (sdTextView3 != null) {
                                    return new FragmentSdInformationalListBinding((LinearLayout) view, sdInformationalRowContainer, sdTextView, sdButton, scrollView, sdButton2, sdTextView2, sdTextView3);
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
