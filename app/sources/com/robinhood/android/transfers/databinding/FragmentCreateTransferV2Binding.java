package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.row.RdsSettingsRowView;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.createtransfer.CreateTransferAccountRowView;
import com.robinhood.utils.p409ui.view.BlockableNestedScrollView;

/* loaded from: classes9.dex */
public final class FragmentCreateTransferV2Binding implements ViewBinding {
    public final ComposeView achTransferOptionsSelector;
    public final ComposeView amountFooterDisclosureSection;
    public final LinearLayout buttonContainer;
    public final ConstraintLayout constraintLayout;
    public final RdsButton continueBtn;
    public final ComposeView disclosureSection;
    public final RdsTextButton editBtn;
    public final RdsSettingsRowView frequencyRow;
    public final ComposeView goldDepositBoostPill;
    public final TickerInputView inputView;
    public final RdsSettingsRowView iraDirectionDescription;
    public final RdsSettingsRowView iraFederalWithholding;
    public final RdsSettingsRowView iraMatchRemoval;
    public final RdsSettingsRowView iraStateWithholding;
    public final RdsSettingsRowView iraTaxYear;
    public final ShimmerLoadingView loadingView;
    public final ComposeView memoPopup;
    public final RdsNumpadView numpad;
    public final ComposeView outgoingWireDetails;
    public final ComposeView quickSelector;
    public final ComposeView rfpPopup;
    private final ConstraintLayout rootView;
    public final BlockableNestedScrollView scrollView;
    public final CreateTransferAccountRowView sinkAccountRow;
    public final CreateTransferAccountRowView sourceAccountRow;

    private FragmentCreateTransferV2Binding(ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, LinearLayout linearLayout, ConstraintLayout constraintLayout2, RdsButton rdsButton, ComposeView composeView3, RdsTextButton rdsTextButton, RdsSettingsRowView rdsSettingsRowView, ComposeView composeView4, TickerInputView tickerInputView, RdsSettingsRowView rdsSettingsRowView2, RdsSettingsRowView rdsSettingsRowView3, RdsSettingsRowView rdsSettingsRowView4, RdsSettingsRowView rdsSettingsRowView5, RdsSettingsRowView rdsSettingsRowView6, ShimmerLoadingView shimmerLoadingView, ComposeView composeView5, RdsNumpadView rdsNumpadView, ComposeView composeView6, ComposeView composeView7, ComposeView composeView8, BlockableNestedScrollView blockableNestedScrollView, CreateTransferAccountRowView createTransferAccountRowView, CreateTransferAccountRowView createTransferAccountRowView2) {
        this.rootView = constraintLayout;
        this.achTransferOptionsSelector = composeView;
        this.amountFooterDisclosureSection = composeView2;
        this.buttonContainer = linearLayout;
        this.constraintLayout = constraintLayout2;
        this.continueBtn = rdsButton;
        this.disclosureSection = composeView3;
        this.editBtn = rdsTextButton;
        this.frequencyRow = rdsSettingsRowView;
        this.goldDepositBoostPill = composeView4;
        this.inputView = tickerInputView;
        this.iraDirectionDescription = rdsSettingsRowView2;
        this.iraFederalWithholding = rdsSettingsRowView3;
        this.iraMatchRemoval = rdsSettingsRowView4;
        this.iraStateWithholding = rdsSettingsRowView5;
        this.iraTaxYear = rdsSettingsRowView6;
        this.loadingView = shimmerLoadingView;
        this.memoPopup = composeView5;
        this.numpad = rdsNumpadView;
        this.outgoingWireDetails = composeView6;
        this.quickSelector = composeView7;
        this.rfpPopup = composeView8;
        this.scrollView = blockableNestedScrollView;
        this.sinkAccountRow = createTransferAccountRowView;
        this.sourceAccountRow = createTransferAccountRowView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCreateTransferV2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCreateTransferV2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30065R.layout.fragment_create_transfer_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCreateTransferV2Binding bind(View view) {
        int i = C30065R.id.ach_transfer_options_selector;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C30065R.id.amount_footer_disclosure_section;
            ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView2 != null) {
                i = C30065R.id.button_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = C30065R.id.continue_btn;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C30065R.id.disclosure_section;
                        ComposeView composeView3 = (ComposeView) ViewBindings.findChildViewById(view, i);
                        if (composeView3 != null) {
                            i = C30065R.id.edit_btn;
                            RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                            if (rdsTextButton != null) {
                                i = C30065R.id.frequency_row;
                                RdsSettingsRowView rdsSettingsRowView = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsSettingsRowView != null) {
                                    i = C30065R.id.gold_deposit_boost_pill;
                                    ComposeView composeView4 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                    if (composeView4 != null) {
                                        i = C30065R.id.input_view;
                                        TickerInputView tickerInputView = (TickerInputView) ViewBindings.findChildViewById(view, i);
                                        if (tickerInputView != null) {
                                            i = C30065R.id.ira_direction_description;
                                            RdsSettingsRowView rdsSettingsRowView2 = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
                                            if (rdsSettingsRowView2 != null) {
                                                i = C30065R.id.ira_federal_withholding;
                                                RdsSettingsRowView rdsSettingsRowView3 = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
                                                if (rdsSettingsRowView3 != null) {
                                                    i = C30065R.id.ira_match_removal;
                                                    RdsSettingsRowView rdsSettingsRowView4 = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
                                                    if (rdsSettingsRowView4 != null) {
                                                        i = C30065R.id.ira_state_withholding;
                                                        RdsSettingsRowView rdsSettingsRowView5 = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
                                                        if (rdsSettingsRowView5 != null) {
                                                            i = C30065R.id.ira_tax_year;
                                                            RdsSettingsRowView rdsSettingsRowView6 = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
                                                            if (rdsSettingsRowView6 != null) {
                                                                i = C30065R.id.loading_view;
                                                                ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                                                                if (shimmerLoadingView != null) {
                                                                    i = C30065R.id.memo_popup;
                                                                    ComposeView composeView5 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                                    if (composeView5 != null) {
                                                                        i = C30065R.id.numpad;
                                                                        RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                                                                        if (rdsNumpadView != null) {
                                                                            i = C30065R.id.outgoing_wire_details;
                                                                            ComposeView composeView6 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                                            if (composeView6 != null) {
                                                                                i = C30065R.id.quick_selector;
                                                                                ComposeView composeView7 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                                                if (composeView7 != null) {
                                                                                    i = C30065R.id.rfp_popup;
                                                                                    ComposeView composeView8 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                                                    if (composeView8 != null) {
                                                                                        i = C30065R.id.scroll_view;
                                                                                        BlockableNestedScrollView blockableNestedScrollView = (BlockableNestedScrollView) ViewBindings.findChildViewById(view, i);
                                                                                        if (blockableNestedScrollView != null) {
                                                                                            i = C30065R.id.sink_account_row;
                                                                                            CreateTransferAccountRowView createTransferAccountRowView = (CreateTransferAccountRowView) ViewBindings.findChildViewById(view, i);
                                                                                            if (createTransferAccountRowView != null) {
                                                                                                i = C30065R.id.source_account_row;
                                                                                                CreateTransferAccountRowView createTransferAccountRowView2 = (CreateTransferAccountRowView) ViewBindings.findChildViewById(view, i);
                                                                                                if (createTransferAccountRowView2 != null) {
                                                                                                    return new FragmentCreateTransferV2Binding(constraintLayout, composeView, composeView2, linearLayout, constraintLayout, rdsButton, composeView3, rdsTextButton, rdsSettingsRowView, composeView4, tickerInputView, rdsSettingsRowView2, rdsSettingsRowView3, rdsSettingsRowView4, rdsSettingsRowView5, rdsSettingsRowView6, shimmerLoadingView, composeView5, rdsNumpadView, composeView6, composeView7, composeView8, blockableNestedScrollView, createTransferAccountRowView, createTransferAccountRowView2);
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
