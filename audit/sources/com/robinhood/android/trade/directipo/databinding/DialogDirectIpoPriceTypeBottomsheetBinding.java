package com.robinhood.android.trade.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.directipo.C29323R;

/* loaded from: classes9.dex */
public final class DialogDirectIpoPriceTypeBottomsheetBinding implements ViewBinding {
    public final LegacyRdsRadioGroup directIpoPriceTypeRadioGroup;
    public final RhTextView directIpoPriceTypeTitle;
    private final ConstraintLayout rootView;

    private DialogDirectIpoPriceTypeBottomsheetBinding(ConstraintLayout constraintLayout, LegacyRdsRadioGroup legacyRdsRadioGroup, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.directIpoPriceTypeRadioGroup = legacyRdsRadioGroup;
        this.directIpoPriceTypeTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogDirectIpoPriceTypeBottomsheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogDirectIpoPriceTypeBottomsheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29323R.layout.dialog_direct_ipo_price_type_bottomsheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogDirectIpoPriceTypeBottomsheetBinding bind(View view) {
        int i = C29323R.id.direct_ipo_price_type_radio_group;
        LegacyRdsRadioGroup legacyRdsRadioGroup = (LegacyRdsRadioGroup) ViewBindings.findChildViewById(view, i);
        if (legacyRdsRadioGroup != null) {
            i = C29323R.id.direct_ipo_price_type_title;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new DialogDirectIpoPriceTypeBottomsheetBinding((ConstraintLayout) view, legacyRdsRadioGroup, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
