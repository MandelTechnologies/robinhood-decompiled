package com.robinhood.android.acats.p057ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAcatsInEquityAssetBinding implements ViewBinding {
    public final RdsButton addToListBtn;
    public final RdsRadioButtonRowView allSharesBtn;
    public final RhEditText amountInput;
    public final LinearLayout borrowingFeeContainer;
    public final ImageView borrowingFeeInfoIcon;
    public final RhTextView borrowingFeeText;
    public final RdsButton deleteFromListBtn;
    public final View divider;
    public final RdsTextButton editStockBtn;
    public final RdsRadioButtonRowView longPositionBtn;
    public final RdsNumpadView numpad;
    public final NewRdsRadioGroup positionRadioGroup;
    public final RdsHeaderRowView positionTypeHeader;
    public final RhTextView quantityDisclaimerTxt;
    public final RdsHeaderRowView quantityTypeHeader;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final RhTextView shareAmountLabel;
    public final NewRdsRadioGroup sharesRadioGroup;
    public final RdsRadioButtonRowView shortPositionBtn;
    public final RdsRadioButtonRowView specifyAmountBtn;
    public final RhTextView stockSymbolTxt;
    public final RdsButton updateAssetBtn;

    private FragmentAcatsInEquityAssetBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RdsRadioButtonRowView rdsRadioButtonRowView, RhEditText rhEditText, LinearLayout linearLayout, ImageView imageView, RhTextView rhTextView, RdsButton rdsButton2, View view, RdsTextButton rdsTextButton, RdsRadioButtonRowView rdsRadioButtonRowView2, RdsNumpadView rdsNumpadView, NewRdsRadioGroup newRdsRadioGroup, RdsHeaderRowView rdsHeaderRowView, RhTextView rhTextView2, RdsHeaderRowView rdsHeaderRowView2, ScrollView scrollView, RhTextView rhTextView3, NewRdsRadioGroup newRdsRadioGroup2, RdsRadioButtonRowView rdsRadioButtonRowView3, RdsRadioButtonRowView rdsRadioButtonRowView4, RhTextView rhTextView4, RdsButton rdsButton3) {
        this.rootView = constraintLayout;
        this.addToListBtn = rdsButton;
        this.allSharesBtn = rdsRadioButtonRowView;
        this.amountInput = rhEditText;
        this.borrowingFeeContainer = linearLayout;
        this.borrowingFeeInfoIcon = imageView;
        this.borrowingFeeText = rhTextView;
        this.deleteFromListBtn = rdsButton2;
        this.divider = view;
        this.editStockBtn = rdsTextButton;
        this.longPositionBtn = rdsRadioButtonRowView2;
        this.numpad = rdsNumpadView;
        this.positionRadioGroup = newRdsRadioGroup;
        this.positionTypeHeader = rdsHeaderRowView;
        this.quantityDisclaimerTxt = rhTextView2;
        this.quantityTypeHeader = rdsHeaderRowView2;
        this.scrollView = scrollView;
        this.shareAmountLabel = rhTextView3;
        this.sharesRadioGroup = newRdsRadioGroup2;
        this.shortPositionBtn = rdsRadioButtonRowView3;
        this.specifyAmountBtn = rdsRadioButtonRowView4;
        this.stockSymbolTxt = rhTextView4;
        this.updateAssetBtn = rdsButton3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInEquityAssetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInEquityAssetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7686R.layout.fragment_acats_in_equity_asset, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInEquityAssetBinding bind(View view) {
        View viewFindChildViewById;
        int i = C7686R.id.add_to_list_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C7686R.id.all_shares_btn;
            RdsRadioButtonRowView rdsRadioButtonRowView = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRadioButtonRowView != null) {
                i = C7686R.id.amount_input;
                RhEditText rhEditText = (RhEditText) ViewBindings.findChildViewById(view, i);
                if (rhEditText != null) {
                    i = C7686R.id.borrowing_fee_container;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C7686R.id.borrowing_fee_info_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C7686R.id.borrowing_fee_text;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                i = C7686R.id.delete_from_list_btn;
                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C7686R.id.divider))) != null) {
                                    i = C7686R.id.edit_stock_btn;
                                    RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsTextButton != null) {
                                        i = C7686R.id.long_position_btn;
                                        RdsRadioButtonRowView rdsRadioButtonRowView2 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                                        if (rdsRadioButtonRowView2 != null) {
                                            i = C7686R.id.numpad;
                                            RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                                            if (rdsNumpadView != null) {
                                                i = C7686R.id.position_radio_group;
                                                NewRdsRadioGroup newRdsRadioGroup = (NewRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                                                if (newRdsRadioGroup != null) {
                                                    i = C7686R.id.position_type_header;
                                                    RdsHeaderRowView rdsHeaderRowView = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                                                    if (rdsHeaderRowView != null) {
                                                        i = C7686R.id.quantity_disclaimer_txt;
                                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView2 != null) {
                                                            i = C7686R.id.quantity_type_header;
                                                            RdsHeaderRowView rdsHeaderRowView2 = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                                                            if (rdsHeaderRowView2 != null) {
                                                                i = C7686R.id.scroll_view;
                                                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                                                if (scrollView != null) {
                                                                    i = C7686R.id.share_amount_label;
                                                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (rhTextView3 != null) {
                                                                        i = C7686R.id.shares_radio_group;
                                                                        NewRdsRadioGroup newRdsRadioGroup2 = (NewRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                                                                        if (newRdsRadioGroup2 != null) {
                                                                            i = C7686R.id.short_position_btn;
                                                                            RdsRadioButtonRowView rdsRadioButtonRowView3 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                                                                            if (rdsRadioButtonRowView3 != null) {
                                                                                i = C7686R.id.specify_amount_btn;
                                                                                RdsRadioButtonRowView rdsRadioButtonRowView4 = (RdsRadioButtonRowView) ViewBindings.findChildViewById(view, i);
                                                                                if (rdsRadioButtonRowView4 != null) {
                                                                                    i = C7686R.id.stock_symbol_txt;
                                                                                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (rhTextView4 != null) {
                                                                                        i = C7686R.id.update_asset_btn;
                                                                                        RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                                                        if (rdsButton3 != null) {
                                                                                            return new FragmentAcatsInEquityAssetBinding((ConstraintLayout) view, rdsButton, rdsRadioButtonRowView, rhEditText, linearLayout, imageView, rhTextView, rdsButton2, viewFindChildViewById, rdsTextButton, rdsRadioButtonRowView2, rdsNumpadView, newRdsRadioGroup, rdsHeaderRowView, rhTextView2, rdsHeaderRowView2, scrollView, rhTextView3, newRdsRadioGroup2, rdsRadioButtonRowView3, rdsRadioButtonRowView4, rhTextView4, rdsButton3);
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
