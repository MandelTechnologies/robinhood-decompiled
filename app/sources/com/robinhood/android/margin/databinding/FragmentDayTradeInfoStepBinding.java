package com.robinhood.android.margin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.chip.ChipGroup;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.margin.C20999R;

/* loaded from: classes8.dex */
public final class FragmentDayTradeInfoStepBinding implements ViewBinding {
    public final Barrier bottomBarrier;
    public final HorizontalScrollView dayTradeChipContainer;
    public final ChipGroup dayTradeChipGroup;
    public final RdsButton dayTradeContinue;
    public final RhTextView dayTradeDisclosure;
    public final RdsButton dayTradeDisclosureButton;
    public final RhTextView dayTradeInfoV2StepTitle;
    public final RhTextView dayTradeInfoV2VariantDescription;
    public final ImageView dayTradeInfoV2VariantImage;
    public final RdsProgressBar dayTradeStepsProgressBar;
    private final ConstraintLayout rootView;

    private FragmentDayTradeInfoStepBinding(ConstraintLayout constraintLayout, Barrier barrier, HorizontalScrollView horizontalScrollView, ChipGroup chipGroup, RdsButton rdsButton, RhTextView rhTextView, RdsButton rdsButton2, RhTextView rhTextView2, RhTextView rhTextView3, ImageView imageView, RdsProgressBar rdsProgressBar) {
        this.rootView = constraintLayout;
        this.bottomBarrier = barrier;
        this.dayTradeChipContainer = horizontalScrollView;
        this.dayTradeChipGroup = chipGroup;
        this.dayTradeContinue = rdsButton;
        this.dayTradeDisclosure = rhTextView;
        this.dayTradeDisclosureButton = rdsButton2;
        this.dayTradeInfoV2StepTitle = rhTextView2;
        this.dayTradeInfoV2VariantDescription = rhTextView3;
        this.dayTradeInfoV2VariantImage = imageView;
        this.dayTradeStepsProgressBar = rdsProgressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDayTradeInfoStepBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDayTradeInfoStepBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20999R.layout.fragment_day_trade_info_step, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDayTradeInfoStepBinding bind(View view) {
        int i = C20999R.id.bottom_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C20999R.id.day_trade_chip_container;
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i);
            if (horizontalScrollView != null) {
                i = C20999R.id.day_trade_chip_group;
                ChipGroup chipGroup = (ChipGroup) ViewBindings.findChildViewById(view, i);
                if (chipGroup != null) {
                    i = C20999R.id.day_trade_continue;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C20999R.id.day_trade_disclosure;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C20999R.id.day_trade_disclosure_button;
                            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton2 != null) {
                                i = C20999R.id.day_trade_info_v2_step_title;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C20999R.id.day_trade_info_v2_variant_description;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        i = C20999R.id.day_trade_info_v2_variant_image;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView != null) {
                                            i = C20999R.id.day_trade_steps_progress_bar;
                                            RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                                            if (rdsProgressBar != null) {
                                                return new FragmentDayTradeInfoStepBinding((ConstraintLayout) view, barrier, horizontalScrollView, chipGroup, rdsButton, rhTextView, rdsButton2, rhTextView2, rhTextView3, imageView, rdsProgressBar);
                                            }
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
