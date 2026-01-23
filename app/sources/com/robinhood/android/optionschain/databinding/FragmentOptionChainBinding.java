package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.robinhood.android.common.p088ui.view.RhRadioButton;
import com.robinhood.android.common.p088ui.view.RhTabLayout;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.optionchain.tooltips.OptionChainTooltipView;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.rolling.OptionChainRollingHeaderView;

/* loaded from: classes11.dex */
public final class FragmentOptionChainBinding implements ViewBinding {
    public final RdsTooltipView chainCustomizationTooltip;
    public final ComposeView chainListComposeView;
    public final OptionChainTooltipView chainMultipleUnderlyingsTooltip;
    public final OptionChainTooltipView chainSettleOnOpenTooltip;
    public final RdsTooltipView chainSimulatedReturnTooltip;
    public final RdsTooltipView chainViewSwitchTooltip;
    public final Barrier headerBarrier;
    public final RhRadioButton optionChainBuyRadio;
    public final RhRadioButton optionChainCallRadio;
    public final RadioGroup optionChainContractTypeGroup;
    public final ConstraintLayout optionChainMainContent;
    public final RhRadioButton optionChainPutRadio;
    public final RhRadioButton optionChainSellRadio;
    public final Group optionChainSettings;
    public final RadioGroup optionChainSideGroup;
    public final OptionChainRollingHeaderView rollingPositionContainer;
    private final CoordinatorLayout rootView;
    public final RhTabLayout tabLayout;
    public final ViewPager2 viewpager;

    private FragmentOptionChainBinding(CoordinatorLayout coordinatorLayout, RdsTooltipView rdsTooltipView, ComposeView composeView, OptionChainTooltipView optionChainTooltipView, OptionChainTooltipView optionChainTooltipView2, RdsTooltipView rdsTooltipView2, RdsTooltipView rdsTooltipView3, Barrier barrier, RhRadioButton rhRadioButton, RhRadioButton rhRadioButton2, RadioGroup radioGroup, ConstraintLayout constraintLayout, RhRadioButton rhRadioButton3, RhRadioButton rhRadioButton4, Group group, RadioGroup radioGroup2, OptionChainRollingHeaderView optionChainRollingHeaderView, RhTabLayout rhTabLayout, ViewPager2 viewPager2) {
        this.rootView = coordinatorLayout;
        this.chainCustomizationTooltip = rdsTooltipView;
        this.chainListComposeView = composeView;
        this.chainMultipleUnderlyingsTooltip = optionChainTooltipView;
        this.chainSettleOnOpenTooltip = optionChainTooltipView2;
        this.chainSimulatedReturnTooltip = rdsTooltipView2;
        this.chainViewSwitchTooltip = rdsTooltipView3;
        this.headerBarrier = barrier;
        this.optionChainBuyRadio = rhRadioButton;
        this.optionChainCallRadio = rhRadioButton2;
        this.optionChainContractTypeGroup = radioGroup;
        this.optionChainMainContent = constraintLayout;
        this.optionChainPutRadio = rhRadioButton3;
        this.optionChainSellRadio = rhRadioButton4;
        this.optionChainSettings = group;
        this.optionChainSideGroup = radioGroup2;
        this.rollingPositionContainer = optionChainRollingHeaderView;
        this.tabLayout = rhTabLayout;
        this.viewpager = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionChainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionChainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.fragment_option_chain, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionChainBinding bind(View view) {
        int i = C24135R.id.chain_customization_tooltip;
        RdsTooltipView rdsTooltipView = (RdsTooltipView) ViewBindings.findChildViewById(view, i);
        if (rdsTooltipView != null) {
            i = C24135R.id.chain_list_compose_view;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null) {
                i = C24135R.id.chain_multiple_underlyings_tooltip;
                OptionChainTooltipView optionChainTooltipView = (OptionChainTooltipView) ViewBindings.findChildViewById(view, i);
                if (optionChainTooltipView != null) {
                    i = C24135R.id.chain_settle_on_open_tooltip;
                    OptionChainTooltipView optionChainTooltipView2 = (OptionChainTooltipView) ViewBindings.findChildViewById(view, i);
                    if (optionChainTooltipView2 != null) {
                        i = C24135R.id.chain_simulated_return_tooltip;
                        RdsTooltipView rdsTooltipView2 = (RdsTooltipView) ViewBindings.findChildViewById(view, i);
                        if (rdsTooltipView2 != null) {
                            i = C24135R.id.chain_view_switch_tooltip;
                            RdsTooltipView rdsTooltipView3 = (RdsTooltipView) ViewBindings.findChildViewById(view, i);
                            if (rdsTooltipView3 != null) {
                                i = C24135R.id.header_barrier;
                                Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                                if (barrier != null) {
                                    i = C24135R.id.option_chain_buy_radio;
                                    RhRadioButton rhRadioButton = (RhRadioButton) ViewBindings.findChildViewById(view, i);
                                    if (rhRadioButton != null) {
                                        i = C24135R.id.option_chain_call_radio;
                                        RhRadioButton rhRadioButton2 = (RhRadioButton) ViewBindings.findChildViewById(view, i);
                                        if (rhRadioButton2 != null) {
                                            i = C24135R.id.option_chain_contract_type_group;
                                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                            if (radioGroup != null) {
                                                i = C24135R.id.option_chain_main_content;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout != null) {
                                                    i = C24135R.id.option_chain_put_radio;
                                                    RhRadioButton rhRadioButton3 = (RhRadioButton) ViewBindings.findChildViewById(view, i);
                                                    if (rhRadioButton3 != null) {
                                                        i = C24135R.id.option_chain_sell_radio;
                                                        RhRadioButton rhRadioButton4 = (RhRadioButton) ViewBindings.findChildViewById(view, i);
                                                        if (rhRadioButton4 != null) {
                                                            i = C24135R.id.option_chain_settings;
                                                            Group group = (Group) ViewBindings.findChildViewById(view, i);
                                                            if (group != null) {
                                                                i = C24135R.id.option_chain_side_group;
                                                                RadioGroup radioGroup2 = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                                                if (radioGroup2 != null) {
                                                                    i = C24135R.id.rolling_position_container;
                                                                    OptionChainRollingHeaderView optionChainRollingHeaderView = (OptionChainRollingHeaderView) ViewBindings.findChildViewById(view, i);
                                                                    if (optionChainRollingHeaderView != null) {
                                                                        i = C24135R.id.tab_layout;
                                                                        RhTabLayout rhTabLayout = (RhTabLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (rhTabLayout != null) {
                                                                            i = C24135R.id.viewpager;
                                                                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                                                            if (viewPager2 != null) {
                                                                                return new FragmentOptionChainBinding((CoordinatorLayout) view, rdsTooltipView, composeView, optionChainTooltipView, optionChainTooltipView2, rdsTooltipView2, rdsTooltipView3, barrier, rhRadioButton, rhRadioButton2, radioGroup, constraintLayout, rhRadioButton3, rhRadioButton4, group, radioGroup2, optionChainRollingHeaderView, rhTabLayout, viewPager2);
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
