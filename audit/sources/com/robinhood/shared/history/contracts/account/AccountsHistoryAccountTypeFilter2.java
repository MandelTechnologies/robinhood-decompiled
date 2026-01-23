package com.robinhood.shared.history.contracts.account;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountsHistoryAccountTypeFilter.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"supportedAccountTypeFilters", "", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryAccountTypeFilter;", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "toAccountsHistoryAccountTypeFilter", "Lcom/robinhood/models/db/Account;", "contracts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilterKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class AccountsHistoryAccountTypeFilter2 {

    /* compiled from: AccountsHistoryAccountTypeFilter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilterKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HistoryTransactionType.values().length];
            try {
                iArr[HistoryTransactionType.INTERNAL_TRANSFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HistoryTransactionType.PENDING_CARD_TRANSACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HistoryTransactionType.SETTLED_CARD_TRANSACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HistoryTransactionType.DECLINED_CARD_TRANSACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HistoryTransactionType.DISPUTE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HistoryTransactionType.CHECK_PAYMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HistoryTransactionType.NON_ORIGINATED_REDIRECTED_ACH_TRANSFER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HistoryTransactionType.DEBIT_CARD_TRANSFER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HistoryTransactionType.RHY_ORIGINATED_ACH_TRANSFER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HistoryTransactionType.RHY_INTER_ENTITY_TRANSFER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HistoryTransactionType.MATCHA_TRANSFER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HistoryTransactionType.MATCHA_INCENTIVE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HistoryTransactionType.MERCHANT_REWARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_FEDERAL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_STATE_CALIFORNIA.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_STATE_MAINE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_STATE_VERMONT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_NRA.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_FEDERAL.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_CALIFORNIA.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_MAINE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_VERMONT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_NRA.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_MANUAL_ADJUSTMENT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_MANUAL_ADJUSTMENT.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[HistoryTransactionType.ADJUSTMENT_CREDIT.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[HistoryTransactionType.ADJUSTMENT_DEBIT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_ADR_FEE_CREDIT.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_GOLD_FEE_CREDIT.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_MARGIN_INTEREST_CREDIT.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_NEGATIVE_EQUITY_REPAYMENT_DEBIT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_NEGATIVE_EQUITY_WRITEOFF.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_REFERRAL_CREDIT.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_REVERSED_ACH_CREDIT.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_WRITEOFF.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_CX_GOODWILL_CREDIT.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_ACAT_FEE_CREDIT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_OTHER.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_INCOMING_ACAT_FEE_REIMBURSEMENT.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_SETTLEMENT_AGREEMENT_TAXABLE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_SETTLEMENT_AGREEMENT_NON_TAXABLE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_OTHER_TAXABLE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_OTHER_NON_TAXABLE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_CASH_BACK_OFFERS_CREDIT.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_MERCHANT_OFFERS_CREDIT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_P2P_REFERRAL_CREDIT.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[HistoryTransactionType.CASH_BALANCE_TRANSFER.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[HistoryTransactionType.CASH_BALANCE_TRANSFER_TAXABLE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[HistoryTransactionType.CASH_BALANCE_TRANSFER_NON_TAXABLE.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[HistoryTransactionType.FEE.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[HistoryTransactionType.WIRE.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[HistoryTransactionType.RHY_NON_ORIGINATED_ACH_TRANSFER.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[HistoryTransactionType.ACATS_TRANSFER.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[HistoryTransactionType.ACATS_REIMBURSEMENT.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[HistoryTransactionType.CHECK_TRANSFER.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[HistoryTransactionType.DIVIDEND.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[HistoryTransactionType.EQUITY_ORDER.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[HistoryTransactionType.EVENT_CASH_CORRECTION.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[HistoryTransactionType.EVENT_EXECUTION.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[HistoryTransactionType.EVENT_ORDER.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[HistoryTransactionType.FUTURES_CASH_CORRECTION.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[HistoryTransactionType.FUTURES_EXECUTION.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[HistoryTransactionType.FUTURES_ORDER.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[HistoryTransactionType.INSTANT_BANK_TRANSFER.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[HistoryTransactionType.INSTRUMENT_SPLIT_PAYMENT.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[HistoryTransactionType.INVESTMENT_SCHEDULE.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[HistoryTransactionType.INVESTMENT_SCHEDULE_WITH_ACCOUNT_TYPE.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_ACH.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_BUYING_POWER.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[HistoryTransactionType.LEGACY_ACATS_TRANSFER.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[HistoryTransactionType.LEGACY_STOCK_LOAN_PAYMENT.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[HistoryTransactionType.MARGIN_INTEREST_CHARGE.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[HistoryTransactionType.MARGIN_SUBSCRIPTION_FEE.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[HistoryTransactionType.MARGIN_SUBSCRIPTION_FEE_REFUND.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[HistoryTransactionType.NON_ORIGINATED_ACH_TRANSFER.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[HistoryTransactionType.OPTION_CORPORATE_ACTION.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[HistoryTransactionType.OPTION_ORDER.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[HistoryTransactionType.OPTION_EVENT.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[HistoryTransactionType.COMBO_ORDER.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[HistoryTransactionType.ORIGINATED_ACH_TRANSFER.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[HistoryTransactionType.PSP_GIFT_ITEM.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[HistoryTransactionType.SLIP_GROUPED_PAYMENT.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[HistoryTransactionType.SWEEP.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[HistoryTransactionType.CASH_REWARD_ITEM.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[HistoryTransactionType.INCOMING_WIRE.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[HistoryTransactionType.OUTGOING_WIRE.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[HistoryTransactionType.I18N_WIRE.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[HistoryTransactionType.UK_BANK_TRANSFER.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[HistoryTransactionType.UK_OPEN_BANKING_TRANSFER.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[HistoryTransactionType.SG_BANK_TRANSFER.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[HistoryTransactionType.GOLD_DEPOSIT_BOOST_CREDIT.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[HistoryTransactionType.GOLD_DEPOSIT_BOOST_ADJUSTMENT.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[HistoryTransactionType.ADR_FEE.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[HistoryTransactionType.INTERNAL_ASSET_TRANSFER.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[HistoryTransactionType.BORROW_CHARGE.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[HistoryTransactionType.FX_ORDER.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[HistoryTransactionType.ISA_CASH_TRANSFER.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[HistoryTransactionType.STOCK_REWARD_ITEM.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[HistoryTransactionType.ROUNDUP_REWARD.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[HistoryTransactionType.CRYPTO_ORDER.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_BUYING_POWER.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_ACH.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[HistoryTransactionType.CRYPTO_GIFT_ITEM.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[HistoryTransactionType.CRYPTO_TRANSFER.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[HistoryTransactionType.CRYPTO_STAKING.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[HistoryTransactionType.CRYPTO_ACATS_TRANSFER.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[HistoryTransactionType.CRYPTO_MARKET_ORDER.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[HistoryTransactionType.CRYPTO_LIMIT_ORDER.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[HistoryTransactionType.CRYPTO_STOP_LOSS_ORDER.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[HistoryTransactionType.CRYPTO_STOP_LIMIT_ORDER.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[HistoryTransactionType.TOKENIZED_CORP_ACTION_DIVIDENDS.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[HistoryTransactionType.TOKENIZED_CORP_ACTION_SPLIT_PAYMENTS.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[HistoryTransactionType.SEPA_CREDIT.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[HistoryTransactionType.CRYPTO_CLAWBACK.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[HistoryTransactionType.CRYPTO_CASH_INTEREST_PAYMENT.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[HistoryTransactionType.PERPETUALS_ORDER.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[HistoryTransactionType.PERPETUALS_LIQUIDATION.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[HistoryTransactionType.PERPETUALS_SETTLEMENT.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[HistoryTransactionType.PERPETUALS_MARGIN_CHANGE.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[HistoryTransactionType.ROLLOVER_ACH.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[HistoryTransactionType.RETIREMENT_FEE.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[HistoryTransactionType.ADVISOR_TRADE.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[HistoryTransactionType.ADVISORY_FEE.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[HistoryTransactionType.UNKNOWN.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BrokerageAccountType.values().length];
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr2[BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_ROTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr2[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr2[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 7;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr2[BrokerageAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused132) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Set<AccountsHistoryAccountTypeFilter> supportedAccountTypeFilters(HistoryTransactionType historyTransactionType) {
        Intrinsics.checkNotNullParameter(historyTransactionType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[historyTransactionType.ordinal()]) {
            case 1:
                return SetsKt.setOf((Object[]) new AccountsHistoryAccountTypeFilter[]{AccountsHistoryAccountTypeFilter.ALL, AccountsHistoryAccountTypeFilter.RHY, AccountsHistoryAccountTypeFilter.RHS, AccountsHistoryAccountTypeFilter.RHS_CUSTODIAL, AccountsHistoryAccountTypeFilter.RHS_IRA_ROTH, AccountsHistoryAccountTypeFilter.RHS_IRA_TRADITIONAL, AccountsHistoryAccountTypeFilter.RHS_JOINT_TENANCY_WITH_ROS, AccountsHistoryAccountTypeFilter.RHS_ISA_STOCKS_AND_SHARES});
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return SetsKt.setOf((Object[]) new AccountsHistoryAccountTypeFilter[]{AccountsHistoryAccountTypeFilter.ALL, AccountsHistoryAccountTypeFilter.RHS, AccountsHistoryAccountTypeFilter.RHY});
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                return SetsKt.setOf((Object[]) new AccountsHistoryAccountTypeFilter[]{AccountsHistoryAccountTypeFilter.ALL, AccountsHistoryAccountTypeFilter.RHY});
            case 52:
                return SetsKt.setOf((Object[]) new AccountsHistoryAccountTypeFilter[]{AccountsHistoryAccountTypeFilter.ALL, AccountsHistoryAccountTypeFilter.RHY, AccountsHistoryAccountTypeFilter.RHS_IRA_ROTH, AccountsHistoryAccountTypeFilter.RHS_IRA_TRADITIONAL});
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case SDK_ASSET_ICON_HOME_VALUE:
            case 69:
            case 70:
            case SDK_ASSET_ICON_GUIDE_VALUE:
            case SDK_ASSET_ICON_GLOBE_VALUE:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
                return SetsKt.setOf((Object[]) new AccountsHistoryAccountTypeFilter[]{AccountsHistoryAccountTypeFilter.ALL, AccountsHistoryAccountTypeFilter.RHS, AccountsHistoryAccountTypeFilter.RHS_CUSTODIAL, AccountsHistoryAccountTypeFilter.RHS_IRA_ROTH, AccountsHistoryAccountTypeFilter.RHS_IRA_TRADITIONAL, AccountsHistoryAccountTypeFilter.RHS_JOINT_TENANCY_WITH_ROS, AccountsHistoryAccountTypeFilter.RHS_ISA_STOCKS_AND_SHARES});
            case 98:
                return SetsKt.setOf((Object[]) new AccountsHistoryAccountTypeFilter[]{AccountsHistoryAccountTypeFilter.ALL, AccountsHistoryAccountTypeFilter.RHY, AccountsHistoryAccountTypeFilter.RHS, AccountsHistoryAccountTypeFilter.CRYPTO});
            case 99:
                return SetsKt.setOf((Object[]) new AccountsHistoryAccountTypeFilter[]{AccountsHistoryAccountTypeFilter.ALL, AccountsHistoryAccountTypeFilter.RHS, AccountsHistoryAccountTypeFilter.CRYPTO});
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
                return SetsKt.setOf((Object[]) new AccountsHistoryAccountTypeFilter[]{AccountsHistoryAccountTypeFilter.ALL, AccountsHistoryAccountTypeFilter.CRYPTO});
            case 107:
            case 108:
            case 109:
            case 110:
                return SetsKt.setOf(AccountsHistoryAccountTypeFilter.CRYPTO);
            case 111:
            case 112:
                return SetsKt.setOf((Object[]) new AccountsHistoryAccountTypeFilter[]{AccountsHistoryAccountTypeFilter.ALL, AccountsHistoryAccountTypeFilter.CRYPTO});
            case 113:
            case 114:
            case 115:
                return SetsKt.setOf((Object[]) new AccountsHistoryAccountTypeFilter[]{AccountsHistoryAccountTypeFilter.ALL, AccountsHistoryAccountTypeFilter.CRYPTO});
            case 116:
            case 117:
            case 118:
            case 119:
                return SetsKt.setOf((Object[]) new AccountsHistoryAccountTypeFilter[]{AccountsHistoryAccountTypeFilter.ALL, AccountsHistoryAccountTypeFilter.CRYPTO, AccountsHistoryAccountTypeFilter.PERPETUALS});
            case 120:
            case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                return SetsKt.setOf((Object[]) new AccountsHistoryAccountTypeFilter[]{AccountsHistoryAccountTypeFilter.ALL, AccountsHistoryAccountTypeFilter.RHS_IRA_ROTH, AccountsHistoryAccountTypeFilter.RHS_IRA_TRADITIONAL});
            case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
            case 123:
                return SetsKt.setOf((Object[]) new AccountsHistoryAccountTypeFilter[]{AccountsHistoryAccountTypeFilter.ALL, AccountsHistoryAccountTypeFilter.RHS, AccountsHistoryAccountTypeFilter.RHS_CUSTODIAL, AccountsHistoryAccountTypeFilter.RHS_IRA_ROTH, AccountsHistoryAccountTypeFilter.RHS_IRA_TRADITIONAL, AccountsHistoryAccountTypeFilter.RHS_JOINT_TENANCY_WITH_ROS});
            case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                return SetsKt.setOf(AccountsHistoryAccountTypeFilter.ALL);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final AccountsHistoryAccountTypeFilter toAccountsHistoryAccountTypeFilter(Account account) {
        Intrinsics.checkNotNullParameter(account, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[account.getBrokerageAccountType().ordinal()]) {
            case 1:
            case 2:
                return AccountsHistoryAccountTypeFilter.RHS_CUSTODIAL;
            case 3:
                return AccountsHistoryAccountTypeFilter.RHS;
            case 4:
                return AccountsHistoryAccountTypeFilter.RHS_IRA_ROTH;
            case 5:
                return AccountsHistoryAccountTypeFilter.RHS_IRA_TRADITIONAL;
            case 6:
                return AccountsHistoryAccountTypeFilter.RHS_JOINT_TENANCY_WITH_ROS;
            case 7:
                return AccountsHistoryAccountTypeFilter.RHS_ISA_STOCKS_AND_SHARES;
            case 8:
                return AccountsHistoryAccountTypeFilter.ALL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
