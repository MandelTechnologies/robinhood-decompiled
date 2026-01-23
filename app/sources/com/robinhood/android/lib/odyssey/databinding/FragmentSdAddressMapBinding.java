package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.StyleableMapView;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsCheckBox;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdInputRow;
import com.robinhood.android.odyssey.lib.view.SdTextView;

/* loaded from: classes8.dex */
public final class FragmentSdAddressMapBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final SdTextView sdCheckboxLabel;
    public final LinearLayout sdCheckboxRow;
    public final NewRdsCheckBox sdCheckboxWidget;
    public final SdButton sdoAddressContinueBtn;
    public final RdsFormattedEditText sdoAddressLine2InputEditText;
    public final SdInputRow sdoAddressLine2InputInputContainer;
    public final StyleableMapView sdoAddressMapview;
    public final RhTextView sdoAddressPrimaryTextView;
    public final RhTextView sdoAddressSecondaryTextView;

    private FragmentSdAddressMapBinding(ConstraintLayout constraintLayout, SdTextView sdTextView, LinearLayout linearLayout, NewRdsCheckBox newRdsCheckBox, SdButton sdButton, RdsFormattedEditText rdsFormattedEditText, SdInputRow sdInputRow, StyleableMapView styleableMapView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.sdCheckboxLabel = sdTextView;
        this.sdCheckboxRow = linearLayout;
        this.sdCheckboxWidget = newRdsCheckBox;
        this.sdoAddressContinueBtn = sdButton;
        this.sdoAddressLine2InputEditText = rdsFormattedEditText;
        this.sdoAddressLine2InputInputContainer = sdInputRow;
        this.sdoAddressMapview = styleableMapView;
        this.sdoAddressPrimaryTextView = rhTextView;
        this.sdoAddressSecondaryTextView = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSdAddressMapBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSdAddressMapBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_sd_address_map, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSdAddressMapBinding bind(View view) {
        int i = C20335R.id.sd_checkbox_label;
        SdTextView sdTextView = (SdTextView) ViewBindings.findChildViewById(view, i);
        if (sdTextView != null) {
            i = C20335R.id.sd_checkbox_row;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C20335R.id.sd_checkbox_widget;
                NewRdsCheckBox newRdsCheckBox = (NewRdsCheckBox) ViewBindings.findChildViewById(view, i);
                if (newRdsCheckBox != null) {
                    i = C20335R.id.sdo_address_continue_btn;
                    SdButton sdButton = (SdButton) ViewBindings.findChildViewById(view, i);
                    if (sdButton != null) {
                        i = C20335R.id.sdo_address_line_2_input_edit_text;
                        RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
                        if (rdsFormattedEditText != null) {
                            i = C20335R.id.sdo_address_line_2_input_input_container;
                            SdInputRow sdInputRow = (SdInputRow) ViewBindings.findChildViewById(view, i);
                            if (sdInputRow != null) {
                                i = C20335R.id.sdo_address_mapview;
                                StyleableMapView styleableMapView = (StyleableMapView) ViewBindings.findChildViewById(view, i);
                                if (styleableMapView != null) {
                                    i = C20335R.id.sdo_address_primary_text_view;
                                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView != null) {
                                        i = C20335R.id.sdo_address_secondary_text_view;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            return new FragmentSdAddressMapBinding((ConstraintLayout) view, sdTextView, linearLayout, newRdsCheckBox, sdButton, rdsFormattedEditText, sdInputRow, styleableMapView, rhTextView, rhTextView2);
                                        }
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
