package com.robinhood.android.optionsstrategybuilder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.pickers.RhNumberPicker;

/* loaded from: classes11.dex */
public final class FragmentBottomSheetSelectorBinding implements ViewBinding {
    public final RhTextView bottomSheetDescriptionTxt;
    public final RdsButton bottomSheetPrimaryBtn;
    public final RhTextView bottomSheetTitleTxt;
    public final RhNumberPicker numberPicker;
    private final LinearLayout rootView;

    private FragmentBottomSheetSelectorBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsButton rdsButton, RhTextView rhTextView2, RhNumberPicker rhNumberPicker) {
        this.rootView = linearLayout;
        this.bottomSheetDescriptionTxt = rhTextView;
        this.bottomSheetPrimaryBtn = rdsButton;
        this.bottomSheetTitleTxt = rhTextView2;
        this.numberPicker = rhNumberPicker;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBottomSheetSelectorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBottomSheetSelectorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24876R.layout.fragment_bottom_sheet_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBottomSheetSelectorBinding bind(View view) {
        int i = C24876R.id.bottom_sheet_description_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C24876R.id.bottom_sheet_primary_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C24876R.id.bottom_sheet_title_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C24876R.id.number_picker;
                    RhNumberPicker rhNumberPicker = (RhNumberPicker) ViewBindings.findChildViewById(view, i);
                    if (rhNumberPicker != null) {
                        return new FragmentBottomSheetSelectorBinding((LinearLayout) view, rhTextView, rdsButton, rhTextView2, rhNumberPicker);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
