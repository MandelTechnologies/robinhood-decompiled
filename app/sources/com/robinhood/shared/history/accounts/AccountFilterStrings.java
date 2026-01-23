package com.robinhood.shared.history.accounts;

import com.robinhood.android.common.history.C11183R;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeSubFilter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountFilterStrings.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0007¨\u0006\b"}, m3636d2 = {"getLabelRes", "", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "inEtfRegionGate", "", "labelRes", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter;", "(Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter;)I", "feature-accounts-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.accounts.AccountFilterStringsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class AccountFilterStrings {

    /* compiled from: AccountFilterStrings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.accounts.AccountFilterStringsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AccountsHistoryTransactionTypeFilter.values().length];
            try {
                iArr[AccountsHistoryTransactionTypeFilter.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.TRANSFERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.ACATS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.ORDERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.EQUITIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.OPTIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.EVENT_CONTRACTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.FUTURES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.DEBIT_CARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.DIVIDENDS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.GOLD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.MARGIN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.REWARDS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.INTEREST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.OPTION_EVENTS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CORPORATE_ACTIONS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.STOCK_LOAN_PAYMENTS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CHECK_PAYMENTS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.ROUNDUP_REWARD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.GIFTS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CRYPTO_ACATS_TRANSFER.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CRYPTO_TRANSFERS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CRYPTO_MARKET_ORDER.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CRYPTO_LIMIT_ORDER.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CRYPTO_STOP_LOSS_ORDER.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CRYPTO_STOP_LIMIT_ORDER.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CRYPTO_STAKING.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.P2P_TRANSFERS.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.GOLD_DEPOSIT_BOOST.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.ADR_FEES.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.BORROW_CHARGE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.PERPETUALS_ORDER.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.PERPETUALS_SETTLEMENT.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.PERPETUALS_MARGIN_CHANGE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.ADVISOR_TRADES.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.ADVISORY_FEE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AccountsHistoryTransactionTypeSubFilter.values().length];
            try {
                iArr2[AccountsHistoryTransactionTypeSubFilter.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[AccountsHistoryTransactionTypeSubFilter.EQUITY_ORDERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[AccountsHistoryTransactionTypeSubFilter.EQUITY_CORP_ACTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[AccountsHistoryTransactionTypeSubFilter.DIVIDENDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[AccountsHistoryTransactionTypeSubFilter.OPTION_ORDERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[AccountsHistoryTransactionTypeSubFilter.OPTION_CORP_ACTIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[AccountsHistoryTransactionTypeSubFilter.OPTION_EVENTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[AccountsHistoryTransactionTypeSubFilter.STOCK_LOAN_PAYMENTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[AccountsHistoryTransactionTypeSubFilter.ADR_FEES.ordinal()] = 9;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[AccountsHistoryTransactionTypeSubFilter.BORROW_CHARGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr2[AccountsHistoryTransactionTypeSubFilter.FX_ORDER.ordinal()] = 11;
            } catch (NoSuchFieldError unused47) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int getLabelRes(AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(accountsHistoryTransactionTypeFilter, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[accountsHistoryTransactionTypeFilter.ordinal()]) {
            case 1:
                return C38979R.string.history_menu_filter_all_types;
            case 2:
                return C11183R.string.history_menu_filter_transfers;
            case 3:
                return C38979R.string.history_menu_filter_acats;
            case 4:
                return C11183R.string.history_menu_filter_orders;
            case 5:
                if (z) {
                    return C11183R.string.history_menu_filter_equities;
                }
                return C11183R.string.history_menu_filter_stocks;
            case 6:
                return C11183R.string.history_menu_filter_options;
            case 7:
                return C11183R.string.history_menu_filter_event_contracts;
            case 8:
                return C11183R.string.history_menu_filter_futures;
            case 9:
                return C11183R.string.history_menu_filter_debit_card;
            case 10:
                return C11183R.string.history_menu_filter_dividends;
            case 11:
                return C11183R.string.history_menu_filter_gold;
            case 12:
                return C38979R.string.history_menu_filter_margin;
            case 13:
                return C11183R.string.history_menu_filter_rewards;
            case 14:
                return C11183R.string.history_menu_filter_interest;
            case 15:
                return C11183R.string.history_menu_filter_option_events;
            case 16:
                return C11183R.string.history_menu_filter_corporate_actions;
            case 17:
                return C11183R.string.history_menu_filter_stock_loan_payments;
            case 18:
                return C11183R.string.history_menu_filter_check_payments;
            case 19:
                return C11183R.string.history_menu_filter_roundup_rewards;
            case 20:
                return C11183R.string.history_menu_filter_gifts;
            case 21:
                return C11183R.string.history_menu_filter_crypto_acats_transfers;
            case 22:
                return C11183R.string.history_menu_filter_crypto_transfers;
            case 23:
                return C38979R.string.history_menu_filter_crypto_market_orders;
            case 24:
                return C38979R.string.history_menu_filter_crypto_limit_orders;
            case 25:
                return C38979R.string.history_menu_filter_crypto_stop_loss_orders;
            case 26:
                return C38979R.string.history_menu_filter_crypto_stop_limit_orders;
            case 27:
                return C11183R.string.history_menu_filter_crypto_staking;
            case 28:
                return C38979R.string.history_menu_filter_p2p_transfers;
            case 29:
                return C11183R.string.gated_gold_history_menu_filter_gold_deposit_boost;
            case 30:
                return C11183R.string.history_menu_filter_adr_fees;
            case 31:
                return C11183R.string.history_menu_filter_borrow_fees;
            case 32:
                return C11183R.string.history_menu_filter_perpetuals_orders;
            case 33:
                return C11183R.string.history_menu_filter_perpetuals_settlement;
            case 34:
                return C11183R.string.history_menu_filter_perpetuals_margin_change;
            case 35:
                return C11183R.string.history_menu_filter_advisor_trades;
            case 36:
                return C11183R.string.history_menu_filter_advisory_fee;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int getLabelRes(AccountsHistoryTransactionTypeSubFilter accountsHistoryTransactionTypeSubFilter) {
        Intrinsics.checkNotNullParameter(accountsHistoryTransactionTypeSubFilter, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[accountsHistoryTransactionTypeSubFilter.ordinal()]) {
            case 1:
                return C38979R.string.history_menu_filter_all_types;
            case 2:
                return C11183R.string.history_menu_filter_orders;
            case 3:
                return C11183R.string.history_menu_filter_corporate_actions;
            case 4:
                return C11183R.string.history_menu_filter_dividends;
            case 5:
                return C11183R.string.history_menu_filter_orders;
            case 6:
                return C11183R.string.history_menu_filter_corporate_actions;
            case 7:
                return C11183R.string.history_menu_filter_option_events;
            case 8:
                return C11183R.string.history_menu_filter_stock_loan_payments;
            case 9:
                return C11183R.string.history_menu_filter_adr_fees;
            case 10:
                return C11183R.string.history_menu_filter_borrow_fees;
            case 11:
                return C11183R.string.history_menu_filter_transfers;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
