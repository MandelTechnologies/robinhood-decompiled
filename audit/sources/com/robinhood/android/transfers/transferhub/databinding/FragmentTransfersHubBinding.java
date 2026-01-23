package com.robinhood.android.transfers.transferhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.banking.lib.databinding.IncludeDebitCardUserStatusBannerViewBinding;
import com.robinhood.android.common.history.p082ui.UnifiedHistoryView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.shared.iac.infobanner.InfoBannerComponentView;

/* loaded from: classes9.dex */
public final class FragmentTransfersHubBinding implements ViewBinding {
    public final FrameLayout ctaPlaceholder;
    public final ComposeView debitCards;
    public final IncludeDebitCardUserStatusBannerViewBinding includeDebitCardUserStatusBannerView;
    public final ComposeView loadingComposeView;
    public final CardView moveMoneyAccountCard;
    public final RhTextView moveMoneyAccountInfoSectionHeaderTxt;
    public final UnifiedHistoryView moveMoneyHistory;
    public final RhTextView moveMoneyHistorySectionHeaderText;
    public final InfoBannerComponentView moveMoneyIacInfoBanner;
    public final UnifiedHistoryView moveMoneyPendingHistory;
    public final RhTextView moveMoneyPendingHistorySectionHeaderText;
    public final LinearLayout moveMoneyRelationships;
    public final RdsRowView moveMoneyRelationshipsLinkAccount;
    public final RecyclerView moveMoneyRelationshipsRecyclerView;
    public final RhTextView moveMoneyRelationshipsSectionHeaderTxt;
    public final ConstraintLayout moveMoneyRoot;
    public final FrameLayout moveMoneyRoutingAccountActionsFragment;
    public final RdsRowView moveMoneyRowAcatsIn;
    public final RdsRowView moveMoneyRowDirectDeposit;
    public final RdsRowView moveMoneyRowRecurringDeposit;
    public final RdsRowView moveMoneyRowRetirementTransfer;
    public final RdsRowView moveMoneyRowTransfer;
    public final RdsRowView moveMoneyRowWires;
    public final NestedScrollView moveMoneyScrollView;
    public final RhTextView moveMoneyTitleTxt;
    public final ConstraintLayout oldCellSelectionRoot;
    private final FrameLayout rootView;
    public final LinearLayout topNavSection;
    public final ComposeView transferHubRedesignContent;

    private FragmentTransfersHubBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ComposeView composeView, IncludeDebitCardUserStatusBannerViewBinding includeDebitCardUserStatusBannerViewBinding, ComposeView composeView2, CardView cardView, RhTextView rhTextView, UnifiedHistoryView unifiedHistoryView, RhTextView rhTextView2, InfoBannerComponentView infoBannerComponentView, UnifiedHistoryView unifiedHistoryView2, RhTextView rhTextView3, LinearLayout linearLayout, RdsRowView rdsRowView, RecyclerView recyclerView, RhTextView rhTextView4, ConstraintLayout constraintLayout, FrameLayout frameLayout3, RdsRowView rdsRowView2, RdsRowView rdsRowView3, RdsRowView rdsRowView4, RdsRowView rdsRowView5, RdsRowView rdsRowView6, RdsRowView rdsRowView7, NestedScrollView nestedScrollView, RhTextView rhTextView5, ConstraintLayout constraintLayout2, LinearLayout linearLayout2, ComposeView composeView3) {
        this.rootView = frameLayout;
        this.ctaPlaceholder = frameLayout2;
        this.debitCards = composeView;
        this.includeDebitCardUserStatusBannerView = includeDebitCardUserStatusBannerViewBinding;
        this.loadingComposeView = composeView2;
        this.moveMoneyAccountCard = cardView;
        this.moveMoneyAccountInfoSectionHeaderTxt = rhTextView;
        this.moveMoneyHistory = unifiedHistoryView;
        this.moveMoneyHistorySectionHeaderText = rhTextView2;
        this.moveMoneyIacInfoBanner = infoBannerComponentView;
        this.moveMoneyPendingHistory = unifiedHistoryView2;
        this.moveMoneyPendingHistorySectionHeaderText = rhTextView3;
        this.moveMoneyRelationships = linearLayout;
        this.moveMoneyRelationshipsLinkAccount = rdsRowView;
        this.moveMoneyRelationshipsRecyclerView = recyclerView;
        this.moveMoneyRelationshipsSectionHeaderTxt = rhTextView4;
        this.moveMoneyRoot = constraintLayout;
        this.moveMoneyRoutingAccountActionsFragment = frameLayout3;
        this.moveMoneyRowAcatsIn = rdsRowView2;
        this.moveMoneyRowDirectDeposit = rdsRowView3;
        this.moveMoneyRowRecurringDeposit = rdsRowView4;
        this.moveMoneyRowRetirementTransfer = rdsRowView5;
        this.moveMoneyRowTransfer = rdsRowView6;
        this.moveMoneyRowWires = rdsRowView7;
        this.moveMoneyScrollView = nestedScrollView;
        this.moveMoneyTitleTxt = rhTextView5;
        this.oldCellSelectionRoot = constraintLayout2;
        this.topNavSection = linearLayout2;
        this.transferHubRedesignContent = composeView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTransfersHubBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTransfersHubBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30556R.layout.fragment_transfers_hub, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTransfersHubBinding bind(View view) {
        View viewFindChildViewById;
        int i = C30556R.id.cta_placeholder;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C30556R.id.debit_cards;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C30556R.id.include_debit_card_user_status_banner_view))) != null) {
                IncludeDebitCardUserStatusBannerViewBinding includeDebitCardUserStatusBannerViewBindingBind = IncludeDebitCardUserStatusBannerViewBinding.bind(viewFindChildViewById);
                i = C30556R.id.loading_compose_view;
                ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
                if (composeView2 != null) {
                    i = C30556R.id.move_money_account_card;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView != null) {
                        i = C30556R.id.move_money_account_info_section_header_txt;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C30556R.id.move_money_history;
                            UnifiedHistoryView unifiedHistoryView = (UnifiedHistoryView) ViewBindings.findChildViewById(view, i);
                            if (unifiedHistoryView != null) {
                                i = C30556R.id.move_money_history_section_header_text;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C30556R.id.move_money_iac_info_banner;
                                    InfoBannerComponentView infoBannerComponentView = (InfoBannerComponentView) ViewBindings.findChildViewById(view, i);
                                    if (infoBannerComponentView != null) {
                                        i = C30556R.id.move_money_pending_history;
                                        UnifiedHistoryView unifiedHistoryView2 = (UnifiedHistoryView) ViewBindings.findChildViewById(view, i);
                                        if (unifiedHistoryView2 != null) {
                                            i = C30556R.id.move_money_pending_history_section_header_text;
                                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView3 != null) {
                                                i = C30556R.id.move_money_relationships;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout != null) {
                                                    i = C30556R.id.move_money_relationships_link_account;
                                                    RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                    if (rdsRowView != null) {
                                                        i = C30556R.id.move_money_relationships_recycler_view;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                        if (recyclerView != null) {
                                                            i = C30556R.id.move_money_relationships_section_header_txt;
                                                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView4 != null) {
                                                                i = C30556R.id.move_money_root;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                if (constraintLayout != null) {
                                                                    i = C30556R.id.move_money_routing_account_actions_fragment;
                                                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (frameLayout2 != null) {
                                                                        i = C30556R.id.move_money_row_acats_in;
                                                                        RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                                        if (rdsRowView2 != null) {
                                                                            i = C30556R.id.move_money_row_direct_deposit;
                                                                            RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                                            if (rdsRowView3 != null) {
                                                                                i = C30556R.id.move_money_row_recurring_deposit;
                                                                                RdsRowView rdsRowView4 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                                                if (rdsRowView4 != null) {
                                                                                    i = C30556R.id.move_money_row_retirement_transfer;
                                                                                    RdsRowView rdsRowView5 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                                                    if (rdsRowView5 != null) {
                                                                                        i = C30556R.id.move_money_row_transfer;
                                                                                        RdsRowView rdsRowView6 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                                                        if (rdsRowView6 != null) {
                                                                                            i = C30556R.id.move_money_row_wires;
                                                                                            RdsRowView rdsRowView7 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                                                                            if (rdsRowView7 != null) {
                                                                                                i = C30556R.id.move_money_scroll_view;
                                                                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                                                                if (nestedScrollView != null) {
                                                                                                    i = C30556R.id.move_money_title_txt;
                                                                                                    RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (rhTextView5 != null) {
                                                                                                        i = C30556R.id.old_cell_selection_root;
                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                        if (constraintLayout2 != null) {
                                                                                                            i = C30556R.id.top_nav_section;
                                                                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                            if (linearLayout2 != null) {
                                                                                                                i = C30556R.id.transfer_hub_redesign_content;
                                                                                                                ComposeView composeView3 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (composeView3 != null) {
                                                                                                                    return new FragmentTransfersHubBinding((FrameLayout) view, frameLayout, composeView, includeDebitCardUserStatusBannerViewBindingBind, composeView2, cardView, rhTextView, unifiedHistoryView, rhTextView2, infoBannerComponentView, unifiedHistoryView2, rhTextView3, linearLayout, rdsRowView, recyclerView, rhTextView4, constraintLayout, frameLayout2, rdsRowView2, rdsRowView3, rdsRowView4, rdsRowView5, rdsRowView6, rdsRowView7, nestedScrollView, rhTextView5, constraintLayout2, linearLayout2, composeView3);
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
