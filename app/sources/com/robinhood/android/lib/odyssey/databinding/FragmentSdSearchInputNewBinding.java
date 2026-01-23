package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdDropdownRow;
import com.robinhood.android.odyssey.lib.view.SdTextView;

/* loaded from: classes8.dex */
public final class FragmentSdSearchInputNewBinding implements ViewBinding {
    public final ConstraintLayout fragmentContainer;
    private final ConstraintLayout rootView;
    public final Space sdInputsButtonBottomMargin;
    public final SdTextView sdSearchInputNewDisclosure;
    public final SdDropdownRow sdSearchInputNewDropdown;
    public final ImageView sdSearchInputNewDropdownIcon;
    public final ComposeView sdSearchInputNewDropdownOption;
    public final SdButton sdSearchInputNewPrimaryCta;
    public final SdTextView sdSearchInputNewSubtitle;
    public final SdTextView sdSearchInputNewTitle;

    private FragmentSdSearchInputNewBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Space space, SdTextView sdTextView, SdDropdownRow sdDropdownRow, ImageView imageView, ComposeView composeView, SdButton sdButton, SdTextView sdTextView2, SdTextView sdTextView3) {
        this.rootView = constraintLayout;
        this.fragmentContainer = constraintLayout2;
        this.sdInputsButtonBottomMargin = space;
        this.sdSearchInputNewDisclosure = sdTextView;
        this.sdSearchInputNewDropdown = sdDropdownRow;
        this.sdSearchInputNewDropdownIcon = imageView;
        this.sdSearchInputNewDropdownOption = composeView;
        this.sdSearchInputNewPrimaryCta = sdButton;
        this.sdSearchInputNewSubtitle = sdTextView2;
        this.sdSearchInputNewTitle = sdTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSdSearchInputNewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSdSearchInputNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_sd_search_input_new, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSdSearchInputNewBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C20335R.id.sd_inputs_button_bottom_margin;
        Space space = (Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = C20335R.id.sd_search_input_new_disclosure;
            SdTextView sdTextView = (SdTextView) ViewBindings.findChildViewById(view, i);
            if (sdTextView != null) {
                i = C20335R.id.sd_search_input_new_dropdown;
                SdDropdownRow sdDropdownRow = (SdDropdownRow) ViewBindings.findChildViewById(view, i);
                if (sdDropdownRow != null) {
                    i = C20335R.id.sd_search_input_new_dropdown_icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C20335R.id.sd_search_input_new_dropdown_option;
                        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                        if (composeView != null) {
                            i = C20335R.id.sd_search_input_new_primary_cta;
                            SdButton sdButton = (SdButton) ViewBindings.findChildViewById(view, i);
                            if (sdButton != null) {
                                i = C20335R.id.sd_search_input_new_subtitle;
                                SdTextView sdTextView2 = (SdTextView) ViewBindings.findChildViewById(view, i);
                                if (sdTextView2 != null) {
                                    i = C20335R.id.sd_search_input_new_title;
                                    SdTextView sdTextView3 = (SdTextView) ViewBindings.findChildViewById(view, i);
                                    if (sdTextView3 != null) {
                                        return new FragmentSdSearchInputNewBinding(constraintLayout, constraintLayout, space, sdTextView, sdDropdownRow, imageView, composeView, sdButton, sdTextView2, sdTextView3);
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
