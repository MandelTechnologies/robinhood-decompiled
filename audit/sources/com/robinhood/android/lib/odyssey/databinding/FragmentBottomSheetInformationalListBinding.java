package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdInformationalRowContainer;
import com.robinhood.android.odyssey.lib.view.SdTextView;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes8.dex */
public final class FragmentBottomSheetInformationalListBinding implements ViewBinding {
    public final RdsPogView pogView;
    private final LinearLayout rootView;
    public final SdInformationalRowContainer sdInformationalListContainer;
    public final SdTextView sdInformationalListDisclosure;
    public final SdButton sdInformationalListPrimaryCta;
    public final FocusSafeNestedScrollView sdInformationalListScroll;
    public final SdButton sdInformationalListSecondaryCta;
    public final SdTextView sdInformationalListSubtitle;
    public final SdTextView sdInformationalListTitle;

    private FragmentBottomSheetInformationalListBinding(LinearLayout linearLayout, RdsPogView rdsPogView, SdInformationalRowContainer sdInformationalRowContainer, SdTextView sdTextView, SdButton sdButton, FocusSafeNestedScrollView focusSafeNestedScrollView, SdButton sdButton2, SdTextView sdTextView2, SdTextView sdTextView3) {
        this.rootView = linearLayout;
        this.pogView = rdsPogView;
        this.sdInformationalListContainer = sdInformationalRowContainer;
        this.sdInformationalListDisclosure = sdTextView;
        this.sdInformationalListPrimaryCta = sdButton;
        this.sdInformationalListScroll = focusSafeNestedScrollView;
        this.sdInformationalListSecondaryCta = sdButton2;
        this.sdInformationalListSubtitle = sdTextView2;
        this.sdInformationalListTitle = sdTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBottomSheetInformationalListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBottomSheetInformationalListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_bottom_sheet_informational_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBottomSheetInformationalListBinding bind(View view) {
        int i = C20335R.id.pog_view;
        RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
        if (rdsPogView != null) {
            i = C20335R.id.sd_informational_list_container;
            SdInformationalRowContainer sdInformationalRowContainer = (SdInformationalRowContainer) ViewBindings.findChildViewById(view, i);
            if (sdInformationalRowContainer != null) {
                i = C20335R.id.sd_informational_list_disclosure;
                SdTextView sdTextView = (SdTextView) ViewBindings.findChildViewById(view, i);
                if (sdTextView != null) {
                    i = C20335R.id.sd_informational_list_primary_cta;
                    SdButton sdButton = (SdButton) ViewBindings.findChildViewById(view, i);
                    if (sdButton != null) {
                        i = C20335R.id.sd_informational_list_scroll;
                        FocusSafeNestedScrollView focusSafeNestedScrollView = (FocusSafeNestedScrollView) ViewBindings.findChildViewById(view, i);
                        if (focusSafeNestedScrollView != null) {
                            i = C20335R.id.sd_informational_list_secondary_cta;
                            SdButton sdButton2 = (SdButton) ViewBindings.findChildViewById(view, i);
                            if (sdButton2 != null) {
                                i = C20335R.id.sd_informational_list_subtitle;
                                SdTextView sdTextView2 = (SdTextView) ViewBindings.findChildViewById(view, i);
                                if (sdTextView2 != null) {
                                    i = C20335R.id.sd_informational_list_title;
                                    SdTextView sdTextView3 = (SdTextView) ViewBindings.findChildViewById(view, i);
                                    if (sdTextView3 != null) {
                                        return new FragmentBottomSheetInformationalListBinding((LinearLayout) view, rdsPogView, sdInformationalRowContainer, sdTextView, sdButton, focusSafeNestedScrollView, sdButton2, sdTextView2, sdTextView3);
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
