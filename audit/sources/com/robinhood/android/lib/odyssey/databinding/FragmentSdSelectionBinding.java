package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdListOptionsView;
import com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView;
import com.robinhood.android.odyssey.lib.view.SdTextView;
import com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView;

/* loaded from: classes8.dex */
public final class FragmentSdSelectionBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final SdTextView sdSelectionDisclosure;
    public final SdListOptionsView sdSelectionListOptionsView;
    public final SdMultiSelectOptionsView sdSelectionMultiSelectOptionsView;
    public final SdButton sdSelectionPrimaryCta;
    public final SdButton sdSelectionSecondaryCta;
    public final SdTextView sdSelectionSubtitle;
    public final SdTextView sdSelectionTitle;
    public final SdTwoColumnOptionsView sdSelectionTwoColumnOptionsView;

    private FragmentSdSelectionBinding(LinearLayout linearLayout, SdTextView sdTextView, SdListOptionsView sdListOptionsView, SdMultiSelectOptionsView sdMultiSelectOptionsView, SdButton sdButton, SdButton sdButton2, SdTextView sdTextView2, SdTextView sdTextView3, SdTwoColumnOptionsView sdTwoColumnOptionsView) {
        this.rootView = linearLayout;
        this.sdSelectionDisclosure = sdTextView;
        this.sdSelectionListOptionsView = sdListOptionsView;
        this.sdSelectionMultiSelectOptionsView = sdMultiSelectOptionsView;
        this.sdSelectionPrimaryCta = sdButton;
        this.sdSelectionSecondaryCta = sdButton2;
        this.sdSelectionSubtitle = sdTextView2;
        this.sdSelectionTitle = sdTextView3;
        this.sdSelectionTwoColumnOptionsView = sdTwoColumnOptionsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSdSelectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSdSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_sd_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSdSelectionBinding bind(View view) {
        int i = C20335R.id.sd_selection_disclosure;
        SdTextView sdTextView = (SdTextView) ViewBindings.findChildViewById(view, i);
        if (sdTextView != null) {
            i = C20335R.id.sd_selection_list_options_view;
            SdListOptionsView sdListOptionsView = (SdListOptionsView) ViewBindings.findChildViewById(view, i);
            if (sdListOptionsView != null) {
                i = C20335R.id.sd_selection_multi_select_options_view;
                SdMultiSelectOptionsView sdMultiSelectOptionsView = (SdMultiSelectOptionsView) ViewBindings.findChildViewById(view, i);
                if (sdMultiSelectOptionsView != null) {
                    i = C20335R.id.sd_selection_primary_cta;
                    SdButton sdButton = (SdButton) ViewBindings.findChildViewById(view, i);
                    if (sdButton != null) {
                        i = C20335R.id.sd_selection_secondary_cta;
                        SdButton sdButton2 = (SdButton) ViewBindings.findChildViewById(view, i);
                        if (sdButton2 != null) {
                            i = C20335R.id.sd_selection_subtitle;
                            SdTextView sdTextView2 = (SdTextView) ViewBindings.findChildViewById(view, i);
                            if (sdTextView2 != null) {
                                i = C20335R.id.sd_selection_title;
                                SdTextView sdTextView3 = (SdTextView) ViewBindings.findChildViewById(view, i);
                                if (sdTextView3 != null) {
                                    i = C20335R.id.sd_selection_two_column_options_view;
                                    SdTwoColumnOptionsView sdTwoColumnOptionsView = (SdTwoColumnOptionsView) ViewBindings.findChildViewById(view, i);
                                    if (sdTwoColumnOptionsView != null) {
                                        return new FragmentSdSelectionBinding((LinearLayout) view, sdTextView, sdListOptionsView, sdMultiSelectOptionsView, sdButton, sdButton2, sdTextView2, sdTextView3, sdTwoColumnOptionsView);
                                    }
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
