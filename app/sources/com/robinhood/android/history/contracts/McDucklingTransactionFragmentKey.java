package com.robinhood.android.history.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acats.contracts.AcatsReimbursementDetails;
import com.robinhood.android.assettransfers.contracts.InternalAssetTransferHistory;
import com.robinhood.android.equities.contracts.AdrFeeDetailKey;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.android.options.contracts.ComboOrderDetailFragmentKey;
import com.robinhood.android.retirement.contracts.RetirementHistoryItemDetails;
import com.robinhood.android.rhy.contracts.RhyTransactionDetailKey;
import com.robinhood.android.slip.contracts.SlipGroupedPaymentDetailFragmentKey;
import com.robinhood.android.social.contracts.matcha.MatchaIncentiveDetailFragmentKey;
import com.robinhood.android.transfers.contracts.UkBankTransferFragmentKey;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.shared.recurring.contracts.InvestmentScheduleSettingsFragmentKey;
import kotlin.Deprecated;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: McDucklingTransactionFragmentKey.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/history/contracts/McDucklingTransactionFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "transactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "<init>", "(Lcom/robinhood/shared/models/history/shared/TransactionReference;)V", "getTransactionReference", "()Lcom/robinhood/shared/models/history/shared/TransactionReference;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class McDucklingTransactionFragmentKey implements FragmentKey, TabFragmentKey {
    private final TransactionReference transactionReference;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<McDucklingTransactionFragmentKey> CREATOR = new Creator();

    /* compiled from: McDucklingTransactionFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<McDucklingTransactionFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final McDucklingTransactionFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new McDucklingTransactionFragmentKey((TransactionReference) parcel.readParcelable(McDucklingTransactionFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final McDucklingTransactionFragmentKey[] newArray(int i) {
            return new McDucklingTransactionFragmentKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.transactionReference, flags);
    }

    @Deprecated
    public McDucklingTransactionFragmentKey(TransactionReference transactionReference) {
        Intrinsics.checkNotNullParameter(transactionReference, "transactionReference");
        this.transactionReference = transactionReference;
    }

    public final TransactionReference getTransactionReference() {
        return this.transactionReference;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.SPENDING;
    }

    /* compiled from: McDucklingTransactionFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/history/contracts/McDucklingTransactionFragmentKey$Companion;", "", "<init>", "()V", "shim", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "reference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "fromDeepLink", "", "isFromCryptoSource", "provisionedToHistoryNavigator", "", "type", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {

        /* compiled from: McDucklingTransactionFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HistoryTransactionType.values().length];
                try {
                    iArr[HistoryTransactionType.DIVIDEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HistoryTransactionType.EVENT_CASH_CORRECTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HistoryTransactionType.EVENT_EXECUTION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[HistoryTransactionType.EVENT_ORDER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[HistoryTransactionType.FUTURES_CASH_CORRECTION.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[HistoryTransactionType.FUTURES_EXECUTION.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[HistoryTransactionType.FUTURES_ORDER.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_STAKING.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[HistoryTransactionType.STOCK_REWARD_ITEM.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[HistoryTransactionType.CASH_REWARD_ITEM.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_TRANSFER.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[HistoryTransactionType.ADVISOR_TRADE.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[HistoryTransactionType.ADVISORY_FEE.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[HistoryTransactionType.SEPA_CREDIT.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_CLAWBACK.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[HistoryTransactionType.PERPETUALS_ORDER.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[HistoryTransactionType.PERPETUALS_LIQUIDATION.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[HistoryTransactionType.PERPETUALS_SETTLEMENT.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[HistoryTransactionType.PERPETUALS_MARGIN_CHANGE.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[HistoryTransactionType.SG_BANK_TRANSFER.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[HistoryTransactionType.INTERNAL_TRANSFER.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[HistoryTransactionType.GOLD_DEPOSIT_BOOST_CREDIT.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[HistoryTransactionType.I18N_WIRE.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[HistoryTransactionType.OUTGOING_WIRE.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[HistoryTransactionType.INCOMING_WIRE.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[HistoryTransactionType.TOKENIZED_CORP_ACTION_DIVIDENDS.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[HistoryTransactionType.TOKENIZED_CORP_ACTION_SPLIT_PAYMENTS.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[HistoryTransactionType.BORROW_CHARGE.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[HistoryTransactionType.FX_ORDER.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[HistoryTransactionType.OPTION_EVENT.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[HistoryTransactionType.ISA_CASH_TRANSFER.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_CASH_INTEREST_PAYMENT.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_ACATS_TRANSFER.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[HistoryTransactionType.ACATS_TRANSFER.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[HistoryTransactionType.ACATS_REIMBURSEMENT.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[HistoryTransactionType.INTERNAL_ASSET_TRANSFER.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[HistoryTransactionType.LEGACY_ACATS_TRANSFER.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[HistoryTransactionType.CHECK_PAYMENT.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[HistoryTransactionType.EQUITY_ORDER.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_ORDER.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_MARKET_ORDER.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_LIMIT_ORDER.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_STOP_LOSS_ORDER.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_STOP_LIMIT_ORDER.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[HistoryTransactionType.INVESTMENT_SCHEDULE.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[HistoryTransactionType.INVESTMENT_SCHEDULE_WITH_ACCOUNT_TYPE.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_BUYING_POWER.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_ACH.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[HistoryTransactionType.MARGIN_INTEREST_CHARGE.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[HistoryTransactionType.MARGIN_SUBSCRIPTION_FEE.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[HistoryTransactionType.MARGIN_SUBSCRIPTION_FEE_REFUND.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[HistoryTransactionType.NON_ORIGINATED_ACH_TRANSFER.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[HistoryTransactionType.NON_ORIGINATED_REDIRECTED_ACH_TRANSFER.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[HistoryTransactionType.OPTION_CORPORATE_ACTION.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[HistoryTransactionType.OPTION_ORDER.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[HistoryTransactionType.COMBO_ORDER.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[HistoryTransactionType.ORIGINATED_ACH_TRANSFER.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[HistoryTransactionType.LEGACY_STOCK_LOAN_PAYMENT.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[HistoryTransactionType.SLIP_GROUPED_PAYMENT.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[HistoryTransactionType.SWEEP.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[HistoryTransactionType.PENDING_CARD_TRANSACTION.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[HistoryTransactionType.SETTLED_CARD_TRANSACTION.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[HistoryTransactionType.DECLINED_CARD_TRANSACTION.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr[HistoryTransactionType.DISPUTE.ordinal()] = 64;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr[HistoryTransactionType.INSTRUMENT_SPLIT_PAYMENT.ordinal()] = 65;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr[HistoryTransactionType.ROUNDUP_REWARD.ordinal()] = 66;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr[HistoryTransactionType.MERCHANT_REWARD.ordinal()] = 67;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr[HistoryTransactionType.PSP_GIFT_ITEM.ordinal()] = 68;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr[HistoryTransactionType.RHY_ORIGINATED_ACH_TRANSFER.ordinal()] = 69;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr[HistoryTransactionType.DEBIT_CARD_TRANSFER.ordinal()] = 70;
                } catch (NoSuchFieldError unused70) {
                }
                try {
                    iArr[HistoryTransactionType.INSTANT_BANK_TRANSFER.ordinal()] = 71;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr[HistoryTransactionType.MATCHA_TRANSFER.ordinal()] = 72;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr[HistoryTransactionType.MATCHA_INCENTIVE.ordinal()] = 73;
                } catch (NoSuchFieldError unused73) {
                }
                try {
                    iArr[HistoryTransactionType.RETIREMENT_FEE.ordinal()] = 74;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_FEDERAL.ordinal()] = 75;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_STATE_CALIFORNIA.ordinal()] = 76;
                } catch (NoSuchFieldError unused76) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_STATE_MAINE.ordinal()] = 77;
                } catch (NoSuchFieldError unused77) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_STATE_VERMONT.ordinal()] = 78;
                } catch (NoSuchFieldError unused78) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_NRA.ordinal()] = 79;
                } catch (NoSuchFieldError unused79) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_FEDERAL.ordinal()] = 80;
                } catch (NoSuchFieldError unused80) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_CALIFORNIA.ordinal()] = 81;
                } catch (NoSuchFieldError unused81) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_MAINE.ordinal()] = 82;
                } catch (NoSuchFieldError unused82) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_VERMONT.ordinal()] = 83;
                } catch (NoSuchFieldError unused83) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_NRA.ordinal()] = 84;
                } catch (NoSuchFieldError unused84) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_MANUAL_ADJUSTMENT.ordinal()] = 85;
                } catch (NoSuchFieldError unused85) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_MANUAL_ADJUSTMENT.ordinal()] = 86;
                } catch (NoSuchFieldError unused86) {
                }
                try {
                    iArr[HistoryTransactionType.ADJUSTMENT_CREDIT.ordinal()] = 87;
                } catch (NoSuchFieldError unused87) {
                }
                try {
                    iArr[HistoryTransactionType.ADJUSTMENT_DEBIT.ordinal()] = 88;
                } catch (NoSuchFieldError unused88) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_ADR_FEE_CREDIT.ordinal()] = 89;
                } catch (NoSuchFieldError unused89) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_GOLD_FEE_CREDIT.ordinal()] = 90;
                } catch (NoSuchFieldError unused90) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_MARGIN_INTEREST_CREDIT.ordinal()] = 91;
                } catch (NoSuchFieldError unused91) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_NEGATIVE_EQUITY_REPAYMENT_DEBIT.ordinal()] = 92;
                } catch (NoSuchFieldError unused92) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_NEGATIVE_EQUITY_WRITEOFF.ordinal()] = 93;
                } catch (NoSuchFieldError unused93) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_REFERRAL_CREDIT.ordinal()] = 94;
                } catch (NoSuchFieldError unused94) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_REVERSED_ACH_CREDIT.ordinal()] = 95;
                } catch (NoSuchFieldError unused95) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_WRITEOFF.ordinal()] = 96;
                } catch (NoSuchFieldError unused96) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_CX_GOODWILL_CREDIT.ordinal()] = 97;
                } catch (NoSuchFieldError unused97) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_ACAT_FEE_CREDIT.ordinal()] = 98;
                } catch (NoSuchFieldError unused98) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_OTHER.ordinal()] = 99;
                } catch (NoSuchFieldError unused99) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_INCOMING_ACAT_FEE_REIMBURSEMENT.ordinal()] = 100;
                } catch (NoSuchFieldError unused100) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_SETTLEMENT_AGREEMENT_TAXABLE.ordinal()] = 101;
                } catch (NoSuchFieldError unused101) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_SETTLEMENT_AGREEMENT_NON_TAXABLE.ordinal()] = 102;
                } catch (NoSuchFieldError unused102) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_OTHER_TAXABLE.ordinal()] = 103;
                } catch (NoSuchFieldError unused103) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_OTHER_NON_TAXABLE.ordinal()] = 104;
                } catch (NoSuchFieldError unused104) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_CASH_BACK_OFFERS_CREDIT.ordinal()] = 105;
                } catch (NoSuchFieldError unused105) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_MERCHANT_OFFERS_CREDIT.ordinal()] = 106;
                } catch (NoSuchFieldError unused106) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_P2P_REFERRAL_CREDIT.ordinal()] = 107;
                } catch (NoSuchFieldError unused107) {
                }
                try {
                    iArr[HistoryTransactionType.CASH_BALANCE_TRANSFER.ordinal()] = 108;
                } catch (NoSuchFieldError unused108) {
                }
                try {
                    iArr[HistoryTransactionType.CASH_BALANCE_TRANSFER_TAXABLE.ordinal()] = 109;
                } catch (NoSuchFieldError unused109) {
                }
                try {
                    iArr[HistoryTransactionType.CASH_BALANCE_TRANSFER_NON_TAXABLE.ordinal()] = 110;
                } catch (NoSuchFieldError unused110) {
                }
                try {
                    iArr[HistoryTransactionType.FEE.ordinal()] = 111;
                } catch (NoSuchFieldError unused111) {
                }
                try {
                    iArr[HistoryTransactionType.WIRE.ordinal()] = 112;
                } catch (NoSuchFieldError unused112) {
                }
                try {
                    iArr[HistoryTransactionType.UK_BANK_TRANSFER.ordinal()] = 113;
                } catch (NoSuchFieldError unused113) {
                }
                try {
                    iArr[HistoryTransactionType.ADR_FEE.ordinal()] = 114;
                } catch (NoSuchFieldError unused114) {
                }
                try {
                    iArr[HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_ACH.ordinal()] = 115;
                } catch (NoSuchFieldError unused115) {
                }
                try {
                    iArr[HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_BUYING_POWER.ordinal()] = 116;
                } catch (NoSuchFieldError unused116) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_GIFT_ITEM.ordinal()] = 117;
                } catch (NoSuchFieldError unused117) {
                }
                try {
                    iArr[HistoryTransactionType.RHY_NON_ORIGINATED_ACH_TRANSFER.ordinal()] = 118;
                } catch (NoSuchFieldError unused118) {
                }
                try {
                    iArr[HistoryTransactionType.RHY_INTER_ENTITY_TRANSFER.ordinal()] = 119;
                } catch (NoSuchFieldError unused119) {
                }
                try {
                    iArr[HistoryTransactionType.CHECK_TRANSFER.ordinal()] = 120;
                } catch (NoSuchFieldError unused120) {
                }
                try {
                    iArr[HistoryTransactionType.GOLD_DEPOSIT_BOOST_ADJUSTMENT.ordinal()] = 121;
                } catch (NoSuchFieldError unused121) {
                }
                try {
                    iArr[HistoryTransactionType.ROLLOVER_ACH.ordinal()] = 122;
                } catch (NoSuchFieldError unused122) {
                }
                try {
                    iArr[HistoryTransactionType.UK_OPEN_BANKING_TRANSFER.ordinal()] = 123;
                } catch (NoSuchFieldError unused123) {
                }
                try {
                    iArr[HistoryTransactionType.UNKNOWN.ordinal()] = 124;
                } catch (NoSuchFieldError unused124) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ FragmentKey shim$default(Companion companion, TransactionReference transactionReference, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.shim(transactionReference, z, z2);
        }

        private static final Void shim$provisionedToHistoryNavigator(TransactionReference transactionReference) {
            McDucklingTransactionFragmentKey.INSTANCE.provisionedToHistoryNavigator(transactionReference.getSourceType());
            throw new ExceptionsH();
        }

        @Deprecated
        public final FragmentKey shim(TransactionReference reference, boolean fromDeepLink, boolean isFromCryptoSource) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            switch (WhenMappings.$EnumSwitchMapping$0[reference.getSourceType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
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
                    shim$provisionedToHistoryNavigator(reference);
                    throw new ExceptionsH();
                case 34:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.ACATS_TRANSFER, reference.getSourceId(), null, false, 12, null);
                case 35:
                    return new AcatsReimbursementDetails(reference.getSourceId());
                case 36:
                    return new InternalAssetTransferHistory(reference.getSourceId());
                case 37:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.LEGACY_ACATS_TRANSFER, reference.getSourceId(), null, false, 12, null);
                case 38:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.CHECK_PAYMENT, reference.getSourceId(), null, false, 12, null);
                case 39:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.ORDER, reference.getSourceId(), null, false, 12, null);
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.CRYPTO_ORDER, reference.getSourceId(), null, false, 12, null);
                case 45:
                case 46:
                    return new InvestmentScheduleSettingsFragmentKey(reference.getSourceId(), false, 2, null);
                case 47:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.CRYPTO_ORDER, reference.getSourceId(), null, false, 12, null);
                case 48:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.CRYPTO_ORDER, reference.getSourceId(), null, false, 12, null);
                case 49:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.MARGIN_INTEREST_CHARGE, reference.getSourceId(), null, false, 12, null);
                case 50:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.MARGIN_SUBSCRIPTION_FEE, reference.getSourceId(), null, false, 12, null);
                case 51:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.MARGIN_SUBSCRIPTION_FEE_REFUND, reference.getSourceId(), null, false, 12, null);
                case 52:
                case 53:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.NON_ORIGINATED_ACH_TRANSFER, reference.getSourceId(), null, false, 12, null);
                case 54:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.OPTION_CORPORATE_ACTION, reference.getSourceId(), null, false, 12, null);
                case 55:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.OPTION_ORDER, reference.getSourceId(), null, false, 12, null);
                case 56:
                    return new ComboOrderDetailFragmentKey(reference.getSourceId());
                case 57:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.ACH_TRANSFER, reference.getSourceId(), null, false, 12, null);
                case 58:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.INTEREST, reference.getSourceId(), null, false, 12, null);
                case 59:
                    return new SlipGroupedPaymentDetailFragmentKey(reference.getSourceId());
                case 60:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.SWEEP_PAYMENT, reference.getSourceId(), null, false, 12, null);
                case 61:
                case 62:
                case 63:
                case 64:
                    return new CashManagementCardTransactionDetailV2FragmentKey(reference, fromDeepLink);
                case 65:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.INSTRUMENT_SPLIT_PAYMENT, reference.getSourceId(), null, false, 12, null);
                case 66:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.ROUNDUP_REWARD, reference.getSourceId(), null, false, 12, null);
                case 67:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.MERCHANT_REWARD, reference.getSourceId(), null, false, 12, null);
                case SDK_ASSET_ICON_HOME_VALUE:
                    return new PspGiftHistoryDetailFragmentKey(reference.getSourceId());
                case 69:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.RHY_ACH_TRANSFER, reference.getSourceId(), null, false, 12, null);
                case 70:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.DEBIT_CARD_TRANSFER, reference.getSourceId(), null, false, 12, null);
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.INSTANT_BANK_TRANSFER, reference.getSourceId(), null, false, 12, null);
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return new MatchaTransferDetailFragmentKey(reference.getSourceId());
                case 73:
                    return new MatchaIncentiveDetailFragmentKey(reference.getSourceId());
                case 74:
                    return new RetirementHistoryItemDetails(reference.getSourceId());
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
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                    return new RhyTransactionDetailKey(reference);
                case 113:
                    return new UkBankTransferFragmentKey(reference.getSourceId());
                case 114:
                    return new AdrFeeDetailKey(reference.getSourceId());
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                case 123:
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    return new McDucklingTransactionFragmentKey(reference);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        private final Void provisionedToHistoryNavigator(HistoryTransactionType type2) {
            throw new IllegalStateException(StringsKt.trimIndent("\n                The history transaction detail page for " + type2 + " is provided to the HistoryNavigator via Dagger.\n                This error is occurring either because McDucklingTransactionFragmentKey.shim() is being called\n                directly, or the module containing the provision is not in the apps dependency tree.\n            ").toString());
        }
    }
}
