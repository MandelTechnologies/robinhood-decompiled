package com.robinhood.android.rhyonboarding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhyonboarding.C27634R;

/* loaded from: classes5.dex */
public final class FragmentRhyPostAccountOpenTimeoutBottomSheetBinding implements ViewBinding {
    public final RhTextView rhyTimeoutDescriptionTextView;
    public final RdsPogView rhyTimeoutPogView;
    public final RdsButton rhyTimeoutPrimaryButton;
    public final RhTextView rhyTimeoutTitleTextView;
    private final LinearLayout rootView;

    private FragmentRhyPostAccountOpenTimeoutBottomSheetBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsPogView rdsPogView, RdsButton rdsButton, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.rhyTimeoutDescriptionTextView = rhTextView;
        this.rhyTimeoutPogView = rdsPogView;
        this.rhyTimeoutPrimaryButton = rdsButton;
        this.rhyTimeoutTitleTextView = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyPostAccountOpenTimeoutBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyPostAccountOpenTimeoutBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27634R.layout.fragment_rhy_post_account_open_timeout_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyPostAccountOpenTimeoutBottomSheetBinding bind(View view) {
        int i = C27634R.id.rhy_timeout_description_text_view;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C27634R.id.rhy_timeout_pog_view;
            RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
            if (rdsPogView != null) {
                i = C27634R.id.rhy_timeout_primary_button;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C27634R.id.rhy_timeout_title_text_view;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentRhyPostAccountOpenTimeoutBottomSheetBinding((LinearLayout) view, rhTextView, rdsPogView, rdsButton, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
