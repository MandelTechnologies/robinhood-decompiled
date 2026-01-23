package com.robinhood.android.acats.p057ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAcatsInPartialCashAssetBinding implements ViewBinding {
    public final RdsButton addToListBtn;
    public final RhMoneyInputView amountInput;
    public final RhTextView amountLabel;
    public final ConstraintLayout amountRow;
    public final RdsRadioButtonRowView cashRow;
    public final RdsHeaderRowView cashTypeHeader;
    public final NewRdsRadioGroup cashTypeRadioGroup;
    public final RdsButton deleteFromListBtn;
    public final RdsRadioButtonRowView entireBalanceRow;
    public final RdsRadioButtonRowView marginRow;
    public final RdsNumpadView numpad;
    public final RdsHeaderRowView quantityHeader;
    public final NewRdsRadioGroup quantityRadioGroup;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final RdsRadioButtonRowView specificAmountRow;
    public final RdsButton updateAssetBtn;

    private FragmentAcatsInPartialCashAssetBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhMoneyInputView rhMoneyInputView, RhTextView rhTextView, ConstraintLayout constraintLayout2, RdsRadioButtonRowView rdsRadioButtonRowView, RdsHeaderRowView rdsHeaderRowView, NewRdsRadioGroup newRdsRadioGroup, RdsButton rdsButton2, RdsRadioButtonRowView rdsRadioButtonRowView2, RdsRadioButtonRowView rdsRadioButtonRowView3, RdsNumpadView rdsNumpadView, RdsHeaderRowView rdsHeaderRowView2, NewRdsRadioGroup newRdsRadioGroup2, ScrollView scrollView, RdsRadioButtonRowView rdsRadioButtonRowView4, RdsButton rdsButton3) {
        this.rootView = constraintLayout;
        this.addToListBtn = rdsButton;
        this.amountInput = rhMoneyInputView;
        this.amountLabel = rhTextView;
        this.amountRow = constraintLayout2;
        this.cashRow = rdsRadioButtonRowView;
        this.cashTypeHeader = rdsHeaderRowView;
        this.cashTypeRadioGroup = newRdsRadioGroup;
        this.deleteFromListBtn = rdsButton2;
        this.entireBalanceRow = rdsRadioButtonRowView2;
        this.marginRow = rdsRadioButtonRowView3;
        this.numpad = rdsNumpadView;
        this.quantityHeader = rdsHeaderRowView2;
        this.quantityRadioGroup = newRdsRadioGroup2;
        this.scrollView = scrollView;
        this.specificAmountRow = rdsRadioButtonRowView4;
        this.updateAssetBtn = rdsButton3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInPartialCashAssetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInPartialCashAssetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7686R.layout.fragment_acats_in_partial_cash_asset, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInPartialCashAssetBinding bind(View view) {
        int i = C7686R.id.add_to_list_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C7686R.id.amount_input;
            RhMoneyInputView rhMoneyInputView = (RhMoneyInputView) ViewBindings.findChildViewById(view, i);
            if (rhMoneyInputView != null) {
                i = C7686R.id.amount_label;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C7686R.id.amount_row;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C7686R.id.cash_row;
                        RdsRadioButtonRowView rdsRadioButtonRowView = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsRadioButtonRowView != null) {
                            i = C7686R.id.cash_type_header;
                            RdsHeaderRowView rdsHeaderRowView = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsHeaderRowView != null) {
                                i = C7686R.id.cash_type_radio_group;
                                NewRdsRadioGroup newRdsRadioGroup = (NewRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                                if (newRdsRadioGroup != null) {
                                    i = C7686R.id.delete_from_list_btn;
                                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsButton2 != null) {
                                        i = C7686R.id.entire_balance_row;
                                        RdsRadioButtonRowView rdsRadioButtonRowView2 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                                        if (rdsRadioButtonRowView2 != null) {
                                            i = C7686R.id.margin_row;
                                            RdsRadioButtonRowView rdsRadioButtonRowView3 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                                            if (rdsRadioButtonRowView3 != null) {
                                                i = C7686R.id.numpad;
                                                RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                                                if (rdsNumpadView != null) {
                                                    i = C7686R.id.quantity_header;
                                                    RdsHeaderRowView rdsHeaderRowView2 = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                                                    if (rdsHeaderRowView2 != null) {
                                                        i = C7686R.id.quantity_radio_group;
                                                        NewRdsRadioGroup newRdsRadioGroup2 = (NewRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                                                        if (newRdsRadioGroup2 != null) {
                                                            i = C7686R.id.scroll_view;
                                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                                            if (scrollView != null) {
                                                                i = C7686R.id.specific_amount_row;
                                                                RdsRadioButtonRowView rdsRadioButtonRowView4 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                                                                if (rdsRadioButtonRowView4 != null) {
                                                                    i = C7686R.id.update_asset_btn;
                                                                    RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                                    if (rdsButton3 != null) {
                                                                        return new FragmentAcatsInPartialCashAssetBinding((ConstraintLayout) view, rdsButton, rhMoneyInputView, rhTextView, constraintLayout, rdsRadioButtonRowView, rdsHeaderRowView, newRdsRadioGroup, rdsButton2, rdsRadioButtonRowView2, rdsRadioButtonRowView3, rdsNumpadView, rdsHeaderRowView2, newRdsRadioGroup2, scrollView, rdsRadioButtonRowView4, rdsButton3);
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
