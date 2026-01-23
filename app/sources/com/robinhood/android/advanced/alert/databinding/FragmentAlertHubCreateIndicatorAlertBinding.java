package com.robinhood.android.advanced.alert.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.p088ui.view.RhRadioButton;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAlertHubCreateIndicatorAlertBinding implements ViewBinding {
    public final View bottomDivider;
    public final RhTextView bottomExplainTxt;
    public final RhRadioButton crossesAboveBtn;
    public final RhRadioButton crossesBelowBtn;
    public final RhTextView currentPriceTxt;
    public final RhTextView dollarSign;
    public final RadioGroup indicatorMoveRadioGroup;
    public final RhTextView indicatorSubtitle;
    public final RhTextView indicatorTitle;
    public final RhRadioButton interval10mBtn;
    public final RhRadioButton interval1dBtn;
    public final RhRadioButton interval1hBtn;
    public final RhRadioButton interval1wBtn;
    public final RhRadioButton interval5mBtn;
    public final RadioGroup intervalRadioGroup;
    public final HorizontalScrollView intervalRadioGroupScrollview;
    public final RhTextView intervalSubtitle;
    public final RhTextView intervalTitle;
    public final RhRadioButton movesAboveValueBtn;
    public final RhRadioButton movesBelowValueBtn;
    public final RhEditText movingValueEditTxt;
    public final ConstraintLayout priceInputLayout;
    private final ConstraintLayout rootView;
    public final RdsButton saveBtn;
    public final RhTextView titleTxt;
    public final View topDivider;

    private FragmentAlertHubCreateIndicatorAlertBinding(ConstraintLayout constraintLayout, View view, RhTextView rhTextView, RhRadioButton rhRadioButton, RhRadioButton rhRadioButton2, RhTextView rhTextView2, RhTextView rhTextView3, RadioGroup radioGroup, RhTextView rhTextView4, RhTextView rhTextView5, RhRadioButton rhRadioButton3, RhRadioButton rhRadioButton4, RhRadioButton rhRadioButton5, RhRadioButton rhRadioButton6, RhRadioButton rhRadioButton7, RadioGroup radioGroup2, HorizontalScrollView horizontalScrollView, RhTextView rhTextView6, RhTextView rhTextView7, RhRadioButton rhRadioButton8, RhRadioButton rhRadioButton9, RhEditText rhEditText, ConstraintLayout constraintLayout2, RdsButton rdsButton, RhTextView rhTextView8, View view2) {
        this.rootView = constraintLayout;
        this.bottomDivider = view;
        this.bottomExplainTxt = rhTextView;
        this.crossesAboveBtn = rhRadioButton;
        this.crossesBelowBtn = rhRadioButton2;
        this.currentPriceTxt = rhTextView2;
        this.dollarSign = rhTextView3;
        this.indicatorMoveRadioGroup = radioGroup;
        this.indicatorSubtitle = rhTextView4;
        this.indicatorTitle = rhTextView5;
        this.interval10mBtn = rhRadioButton3;
        this.interval1dBtn = rhRadioButton4;
        this.interval1hBtn = rhRadioButton5;
        this.interval1wBtn = rhRadioButton6;
        this.interval5mBtn = rhRadioButton7;
        this.intervalRadioGroup = radioGroup2;
        this.intervalRadioGroupScrollview = horizontalScrollView;
        this.intervalSubtitle = rhTextView6;
        this.intervalTitle = rhTextView7;
        this.movesAboveValueBtn = rhRadioButton8;
        this.movesBelowValueBtn = rhRadioButton9;
        this.movingValueEditTxt = rhEditText;
        this.priceInputLayout = constraintLayout2;
        this.saveBtn = rdsButton;
        this.titleTxt = rhTextView8;
        this.topDivider = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAlertHubCreateIndicatorAlertBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAlertHubCreateIndicatorAlertBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8387R.layout.fragment_alert_hub_create_indicator_alert, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAlertHubCreateIndicatorAlertBinding bind(View view) {
        View viewFindChildViewById;
        int i = C8387R.id.bottom_divider;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null) {
            i = C8387R.id.bottom_explain_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C8387R.id.crosses_above_btn;
                RhRadioButton rhRadioButton = (RhRadioButton) ViewBindings.findChildViewById(view, i);
                if (rhRadioButton != null) {
                    i = C8387R.id.crosses_below_btn;
                    RhRadioButton rhRadioButton2 = (RhRadioButton) ViewBindings.findChildViewById(view, i);
                    if (rhRadioButton2 != null) {
                        i = C8387R.id.current_price_txt;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C8387R.id.dollar_sign;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C8387R.id.indicator_move_radio_group;
                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                if (radioGroup != null) {
                                    i = C8387R.id.indicator_subtitle;
                                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView4 != null) {
                                        i = C8387R.id.indicator_title;
                                        RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView5 != null) {
                                            i = C8387R.id.interval_10m_btn;
                                            RhRadioButton rhRadioButton3 = (RhRadioButton) ViewBindings.findChildViewById(view, i);
                                            if (rhRadioButton3 != null) {
                                                i = C8387R.id.interval_1d_btn;
                                                RhRadioButton rhRadioButton4 = (RhRadioButton) ViewBindings.findChildViewById(view, i);
                                                if (rhRadioButton4 != null) {
                                                    i = C8387R.id.interval_1h_btn;
                                                    RhRadioButton rhRadioButton5 = (RhRadioButton) ViewBindings.findChildViewById(view, i);
                                                    if (rhRadioButton5 != null) {
                                                        i = C8387R.id.interval_1w_btn;
                                                        RhRadioButton rhRadioButton6 = (RhRadioButton) ViewBindings.findChildViewById(view, i);
                                                        if (rhRadioButton6 != null) {
                                                            i = C8387R.id.interval_5m_btn;
                                                            RhRadioButton rhRadioButton7 = (RhRadioButton) ViewBindings.findChildViewById(view, i);
                                                            if (rhRadioButton7 != null) {
                                                                i = C8387R.id.interval_radio_group;
                                                                RadioGroup radioGroup2 = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                                                if (radioGroup2 != null) {
                                                                    i = C8387R.id.interval_radio_group_scrollview;
                                                                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                                                                    if (horizontalScrollView != null) {
                                                                        i = C8387R.id.interval_subtitle;
                                                                        RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (rhTextView6 != null) {
                                                                            i = C8387R.id.interval_title;
                                                                            RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (rhTextView7 != null) {
                                                                                i = C8387R.id.moves_above_value_btn;
                                                                                RhRadioButton rhRadioButton8 = (RhRadioButton) ViewBindings.findChildViewById(view, i);
                                                                                if (rhRadioButton8 != null) {
                                                                                    i = C8387R.id.moves_below_value_btn;
                                                                                    RhRadioButton rhRadioButton9 = (RhRadioButton) ViewBindings.findChildViewById(view, i);
                                                                                    if (rhRadioButton9 != null) {
                                                                                        i = C8387R.id.moving_value_edit_txt;
                                                                                        RhEditText rhEditText = (RhEditText) ViewBindings.findChildViewById(view, i);
                                                                                        if (rhEditText != null) {
                                                                                            i = C8387R.id.price_input_layout;
                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                            if (constraintLayout != null) {
                                                                                                i = C8387R.id.save_btn;
                                                                                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                                                                if (rdsButton != null) {
                                                                                                    i = C8387R.id.title_txt;
                                                                                                    RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (rhTextView8 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C8387R.id.top_divider))) != null) {
                                                                                                        return new FragmentAlertHubCreateIndicatorAlertBinding((ConstraintLayout) view, viewFindChildViewById2, rhTextView, rhRadioButton, rhRadioButton2, rhTextView2, rhTextView3, radioGroup, rhTextView4, rhTextView5, rhRadioButton3, rhRadioButton4, rhRadioButton5, rhRadioButton6, rhRadioButton7, radioGroup2, horizontalScrollView, rhTextView6, rhTextView7, rhRadioButton8, rhRadioButton9, rhEditText, constraintLayout, rdsButton, rhTextView8, viewFindChildViewById);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
