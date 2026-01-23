package com.robinhood.android.acats.p057ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadContainerView;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;

/* loaded from: classes24.dex */
public final class FragmentAcatsInPartialOptionAssetBinding implements ViewBinding {
    public final RdsButton addToListBtn;
    public final Barrier bottomOfQuantitySectionBarrier;
    public final Barrier buttonBarrier;
    public final RdsRadioButtonRowView callRadioRow;
    public final RdsHeaderRowView contractHeader;
    public final RdsButton deleteFromListBtn;
    public final RdsTextButton editBtn;
    public final View expDateDivider;
    public final RdsFormattedEditText expDateRowEditText;
    public final RhTextView expDateRowLabel;
    public final RhTextView instrumentSymbolTxt;
    public final View numContractsDivider;
    public final RdsTextInputEditText numContractsEditText;
    public final Group numContractsRowGroup;
    public final RhTextView numContractsRowLabel;
    public final RdsNumpadContainerView numpad;
    public final RdsHeaderRowView optionTypeHeader;
    public final NewRdsRadioGroup optionTypeRadioGroup;
    public final RdsRadioButtonRowView positionLongRadioBtn;
    public final NewRdsRadioGroup positionRadioGroup;
    public final RdsRadioButtonRowView positionShortRadioBtn;
    public final RdsHeaderRowView positionTypeHeader;
    public final RdsRadioButtonRowView putRadioRow;
    public final RdsRadioButtonRowView quantityAllContractsRadioBtn;
    public final RdsHeaderRowView quantityHeader;
    public final NewRdsRadioGroup quantityRadioGroup;
    public final RdsRadioButtonRowView quantitySpecificAmountRadioBtn;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final View strikePriceDivider;
    public final RhMoneyInputView strikePriceEditText;
    public final RhTextView strikePriceRowLabel;
    public final RdsButton updateAssetBtn;

    private FragmentAcatsInPartialOptionAssetBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, Barrier barrier, Barrier barrier2, RdsRadioButtonRowView rdsRadioButtonRowView, RdsHeaderRowView rdsHeaderRowView, RdsButton rdsButton2, RdsTextButton rdsTextButton, View view, RdsFormattedEditText rdsFormattedEditText, RhTextView rhTextView, RhTextView rhTextView2, View view2, RdsTextInputEditText rdsTextInputEditText, Group group, RhTextView rhTextView3, RdsNumpadContainerView rdsNumpadContainerView, RdsHeaderRowView rdsHeaderRowView2, NewRdsRadioGroup newRdsRadioGroup, RdsRadioButtonRowView rdsRadioButtonRowView2, NewRdsRadioGroup newRdsRadioGroup2, RdsRadioButtonRowView rdsRadioButtonRowView3, RdsHeaderRowView rdsHeaderRowView3, RdsRadioButtonRowView rdsRadioButtonRowView4, RdsRadioButtonRowView rdsRadioButtonRowView5, RdsHeaderRowView rdsHeaderRowView4, NewRdsRadioGroup newRdsRadioGroup3, RdsRadioButtonRowView rdsRadioButtonRowView6, ScrollView scrollView, View view3, RhMoneyInputView rhMoneyInputView, RhTextView rhTextView4, RdsButton rdsButton3) {
        this.rootView = constraintLayout;
        this.addToListBtn = rdsButton;
        this.bottomOfQuantitySectionBarrier = barrier;
        this.buttonBarrier = barrier2;
        this.callRadioRow = rdsRadioButtonRowView;
        this.contractHeader = rdsHeaderRowView;
        this.deleteFromListBtn = rdsButton2;
        this.editBtn = rdsTextButton;
        this.expDateDivider = view;
        this.expDateRowEditText = rdsFormattedEditText;
        this.expDateRowLabel = rhTextView;
        this.instrumentSymbolTxt = rhTextView2;
        this.numContractsDivider = view2;
        this.numContractsEditText = rdsTextInputEditText;
        this.numContractsRowGroup = group;
        this.numContractsRowLabel = rhTextView3;
        this.numpad = rdsNumpadContainerView;
        this.optionTypeHeader = rdsHeaderRowView2;
        this.optionTypeRadioGroup = newRdsRadioGroup;
        this.positionLongRadioBtn = rdsRadioButtonRowView2;
        this.positionRadioGroup = newRdsRadioGroup2;
        this.positionShortRadioBtn = rdsRadioButtonRowView3;
        this.positionTypeHeader = rdsHeaderRowView3;
        this.putRadioRow = rdsRadioButtonRowView4;
        this.quantityAllContractsRadioBtn = rdsRadioButtonRowView5;
        this.quantityHeader = rdsHeaderRowView4;
        this.quantityRadioGroup = newRdsRadioGroup3;
        this.quantitySpecificAmountRadioBtn = rdsRadioButtonRowView6;
        this.scrollView = scrollView;
        this.strikePriceDivider = view3;
        this.strikePriceEditText = rhMoneyInputView;
        this.strikePriceRowLabel = rhTextView4;
        this.updateAssetBtn = rdsButton3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInPartialOptionAssetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInPartialOptionAssetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7686R.layout.fragment_acats_in_partial_option_asset, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInPartialOptionAssetBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i = C7686R.id.add_to_list_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C7686R.id.bottom_of_quantity_section_barrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier != null) {
                i = C7686R.id.button_barrier;
                Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                if (barrier2 != null) {
                    i = C7686R.id.call_radio_row;
                    RdsRadioButtonRowView rdsRadioButtonRowView = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsRadioButtonRowView != null) {
                        i = C7686R.id.contract_header;
                        RdsHeaderRowView rdsHeaderRowView = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsHeaderRowView != null) {
                            i = C7686R.id.delete_from_list_btn;
                            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton2 != null) {
                                i = C7686R.id.edit_btn;
                                RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                                if (rdsTextButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C7686R.id.exp_date_divider))) != null) {
                                    i = C7686R.id.exp_date_row_edit_text;
                                    RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
                                    if (rdsFormattedEditText != null) {
                                        i = C7686R.id.exp_date_row_label;
                                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView != null) {
                                            i = C7686R.id.instrument_symbol_txt;
                                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C7686R.id.num_contracts_divider))) != null) {
                                                i = C7686R.id.num_contracts_edit_text;
                                                RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                                                if (rdsTextInputEditText != null) {
                                                    i = C7686R.id.num_contracts_row_group;
                                                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                                                    if (group != null) {
                                                        i = C7686R.id.num_contracts_row_label;
                                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView3 != null) {
                                                            i = C7686R.id.numpad;
                                                            RdsNumpadContainerView rdsNumpadContainerView = (RdsNumpadContainerView) ViewBindings.findChildViewById(view, i);
                                                            if (rdsNumpadContainerView != null) {
                                                                i = C7686R.id.option_type_header;
                                                                RdsHeaderRowView rdsHeaderRowView2 = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                                                                if (rdsHeaderRowView2 != null) {
                                                                    i = C7686R.id.option_type_radio_group;
                                                                    NewRdsRadioGroup newRdsRadioGroup = (NewRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                                                                    if (newRdsRadioGroup != null) {
                                                                        i = C7686R.id.position_long_radio_btn;
                                                                        RdsRadioButtonRowView rdsRadioButtonRowView2 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                                                                        if (rdsRadioButtonRowView2 != null) {
                                                                            i = C7686R.id.position_radio_group;
                                                                            NewRdsRadioGroup newRdsRadioGroup2 = (NewRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                                                                            if (newRdsRadioGroup2 != null) {
                                                                                i = C7686R.id.position_short_radio_btn;
                                                                                RdsRadioButtonRowView rdsRadioButtonRowView3 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                                                                                if (rdsRadioButtonRowView3 != null) {
                                                                                    i = C7686R.id.position_type_header;
                                                                                    RdsHeaderRowView rdsHeaderRowView3 = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                                                                                    if (rdsHeaderRowView3 != null) {
                                                                                        i = C7686R.id.put_radio_row;
                                                                                        RdsRadioButtonRowView rdsRadioButtonRowView4 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                                                                                        if (rdsRadioButtonRowView4 != null) {
                                                                                            i = C7686R.id.quantity_all_contracts_radio_btn;
                                                                                            RdsRadioButtonRowView rdsRadioButtonRowView5 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                                                                                            if (rdsRadioButtonRowView5 != null) {
                                                                                                i = C7686R.id.quantity_header;
                                                                                                RdsHeaderRowView rdsHeaderRowView4 = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                                                                                                if (rdsHeaderRowView4 != null) {
                                                                                                    i = C7686R.id.quantity_radio_group;
                                                                                                    NewRdsRadioGroup newRdsRadioGroup3 = (NewRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                                                                                                    if (newRdsRadioGroup3 != null) {
                                                                                                        i = C7686R.id.quantity_specific_amount_radio_btn;
                                                                                                        RdsRadioButtonRowView rdsRadioButtonRowView6 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (rdsRadioButtonRowView6 != null) {
                                                                                                            i = C7686R.id.scroll_view;
                                                                                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (scrollView != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C7686R.id.strike_price_divider))) != null) {
                                                                                                                i = C7686R.id.strike_price_edit_text;
                                                                                                                RhMoneyInputView rhMoneyInputView = (RhMoneyInputView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (rhMoneyInputView != null) {
                                                                                                                    i = C7686R.id.strike_price_row_label;
                                                                                                                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (rhTextView4 != null) {
                                                                                                                        i = C7686R.id.update_asset_btn;
                                                                                                                        RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (rdsButton3 != null) {
                                                                                                                            return new FragmentAcatsInPartialOptionAssetBinding((ConstraintLayout) view, rdsButton, barrier, barrier2, rdsRadioButtonRowView, rdsHeaderRowView, rdsButton2, rdsTextButton, viewFindChildViewById, rdsFormattedEditText, rhTextView, rhTextView2, viewFindChildViewById2, rdsTextInputEditText, group, rhTextView3, rdsNumpadContainerView, rdsHeaderRowView2, newRdsRadioGroup, rdsRadioButtonRowView2, newRdsRadioGroup2, rdsRadioButtonRowView3, rdsHeaderRowView3, rdsRadioButtonRowView4, rdsRadioButtonRowView5, rdsHeaderRowView4, newRdsRadioGroup3, rdsRadioButtonRowView6, scrollView, viewFindChildViewById3, rhMoneyInputView, rhTextView4, rdsButton3);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
