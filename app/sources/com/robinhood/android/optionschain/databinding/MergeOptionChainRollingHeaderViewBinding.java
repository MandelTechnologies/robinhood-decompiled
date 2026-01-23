package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionschain.C24135R;

/* loaded from: classes11.dex */
public final class MergeOptionChainRollingHeaderViewBinding implements ViewBinding {
    public final RhTextView rollingPositionHeader;
    public final RhTextView rollingPositionPrice;
    public final RhTextView rollingPositionSubtitle;
    public final RhTextView rollingPositionTitle;
    private final View rootView;

    private MergeOptionChainRollingHeaderViewBinding(View view, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4) {
        this.rootView = view;
        this.rollingPositionHeader = rhTextView;
        this.rollingPositionPrice = rhTextView2;
        this.rollingPositionSubtitle = rhTextView3;
        this.rollingPositionTitle = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOptionChainRollingHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C24135R.layout.merge_option_chain_rolling_header_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOptionChainRollingHeaderViewBinding bind(View view) {
        int i = C24135R.id.rolling_position_header;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C24135R.id.rolling_position_price;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C24135R.id.rolling_position_subtitle;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    i = C24135R.id.rolling_position_title;
                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView4 != null) {
                        return new MergeOptionChainRollingHeaderViewBinding(view, rhTextView, rhTextView2, rhTextView3, rhTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
