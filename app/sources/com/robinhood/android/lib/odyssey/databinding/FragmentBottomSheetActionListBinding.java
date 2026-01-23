package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdTextView;
import com.robinhood.android.odyssey.lib.view.SdTypedRowContainer;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes8.dex */
public final class FragmentBottomSheetActionListBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final SdTypedRowContainer sdBsActionListContainer;
    public final SdButton sdBsActionListPrimaryCta;
    public final FocusSafeNestedScrollView sdBsActionListScroll;
    public final SdTextView sdBsActionListSubtitle;
    public final SdTextView sdBsActionListTitle;

    private FragmentBottomSheetActionListBinding(LinearLayout linearLayout, SdTypedRowContainer sdTypedRowContainer, SdButton sdButton, FocusSafeNestedScrollView focusSafeNestedScrollView, SdTextView sdTextView, SdTextView sdTextView2) {
        this.rootView = linearLayout;
        this.sdBsActionListContainer = sdTypedRowContainer;
        this.sdBsActionListPrimaryCta = sdButton;
        this.sdBsActionListScroll = focusSafeNestedScrollView;
        this.sdBsActionListSubtitle = sdTextView;
        this.sdBsActionListTitle = sdTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBottomSheetActionListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBottomSheetActionListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_bottom_sheet_action_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBottomSheetActionListBinding bind(View view) {
        int i = C20335R.id.sd_bs_action_list_container;
        SdTypedRowContainer sdTypedRowContainer = (SdTypedRowContainer) ViewBindings.findChildViewById(view, i);
        if (sdTypedRowContainer != null) {
            i = C20335R.id.sd_bs_action_list_primary_cta;
            SdButton sdButton = (SdButton) ViewBindings.findChildViewById(view, i);
            if (sdButton != null) {
                i = C20335R.id.sd_bs_action_list_scroll;
                FocusSafeNestedScrollView focusSafeNestedScrollView = (FocusSafeNestedScrollView) ViewBindings.findChildViewById(view, i);
                if (focusSafeNestedScrollView != null) {
                    i = C20335R.id.sd_bs_action_list_subtitle;
                    SdTextView sdTextView = (SdTextView) ViewBindings.findChildViewById(view, i);
                    if (sdTextView != null) {
                        i = C20335R.id.sd_bs_action_list_title;
                        SdTextView sdTextView2 = (SdTextView) ViewBindings.findChildViewById(view, i);
                        if (sdTextView2 != null) {
                            return new FragmentBottomSheetActionListBinding((LinearLayout) view, sdTypedRowContainer, sdButton, focusSafeNestedScrollView, sdTextView, sdTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
