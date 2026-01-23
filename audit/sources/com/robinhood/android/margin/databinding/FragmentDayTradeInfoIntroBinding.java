package com.robinhood.android.margin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.margin.C20999R;

/* loaded from: classes8.dex */
public final class FragmentDayTradeInfoIntroBinding implements ViewBinding {
    public final RdsButton dayTradeInfoV2IntroContinue;
    public final RhTextView dayTradeInfoV2IntroDescription;
    public final RdsButton dayTradeInfoV2IntroExit;
    public final ImageView dayTradeInfoV2IntroImage;
    public final RhTextView dayTradeInfoV2IntroTitle;
    private final ConstraintLayout rootView;

    private FragmentDayTradeInfoIntroBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, RdsButton rdsButton2, ImageView imageView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.dayTradeInfoV2IntroContinue = rdsButton;
        this.dayTradeInfoV2IntroDescription = rhTextView;
        this.dayTradeInfoV2IntroExit = rdsButton2;
        this.dayTradeInfoV2IntroImage = imageView;
        this.dayTradeInfoV2IntroTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDayTradeInfoIntroBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDayTradeInfoIntroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20999R.layout.fragment_day_trade_info_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDayTradeInfoIntroBinding bind(View view) {
        int i = C20999R.id.day_trade_info_v2_intro_continue;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C20999R.id.day_trade_info_v2_intro_description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C20999R.id.day_trade_info_v2_intro_exit;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    i = C20999R.id.day_trade_info_v2_intro_image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C20999R.id.day_trade_info_v2_intro_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentDayTradeInfoIntroBinding((ConstraintLayout) view, rdsButton, rhTextView, rdsButton2, imageView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
