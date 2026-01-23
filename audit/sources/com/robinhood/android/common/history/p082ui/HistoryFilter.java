package com.robinhood.android.common.history.p082ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HistoryFilter.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0017\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0012\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\b\"\u00020\u0005¢\u0006\u0004\b\u0006\u0010\tJ\u000e\u0010/\u001a\u0002002\u0006\u00105\u001a\u000206J\u000e\u00107\u001a\u0002002\u0006\u00105\u001a\u000206J\u0006\u00108\u001a\u00020)J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020)R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010(\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00101R\u0014\u00102\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00101R\u0014\u00103\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00101j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryFilter;", "Landroid/os/Parcelable;", "", "transactionTypes", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "<init>", "(Ljava/lang/String;ILjava/util/Set;)V", "", "(Ljava/lang/String;I[Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;)V", "getTransactionTypes", "()Ljava/util/Set;", DisplaySpans.ALL, "TRANSFERS", "ORDERS", "EQUITIES", "EVENT_CONTRACTS", "FUTURES", "OPTIONS", "DEBIT_CARD", "DIVIDENDS", "GOLD", "REWARDS", "GIFTS", "INTEREST", "OPTION_EVENTS", "CORPORATE_ACTIONS", "STOCK_LOAN_PAYMENTS", "CHECK_PAYMENTS", "ROUNDUP_REWARD", "CRYPTO_ACATS_TRANSFERS", "CRYPTO_TRANSFERS", "CRYPTO_STAKING", "GOLD_DEPOSIT_BOOST", "ADR_FEES", "BORROW_CHARGE", "PERPETUALS_ORDERS", "PERPETUALS_SETTLEMENT", "PERPETUALS_MARGIN_CHANGE", "TOKENIZED_STOCKS_DIVIDENDS", "emptyStateTextResId", "", "getEmptyStateTextResId", "()Ljava/lang/Integer;", "labelResId", "getLabelResId", "()I", "isPersistent", "", "()Z", "isPersistentOnRhc", "validOnRhc", "getValidOnRhc", "appType", "Lcom/robinhood/shared/app/type/AppType;", "isValid", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class HistoryFilter implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HistoryFilter[] $VALUES;
    public static final HistoryFilter ADR_FEES;
    public static final HistoryFilter ALL;
    public static final HistoryFilter BORROW_CHARGE;
    public static final HistoryFilter CHECK_PAYMENTS;
    public static final HistoryFilter CORPORATE_ACTIONS;
    public static final Parcelable.Creator<HistoryFilter> CREATOR;
    public static final HistoryFilter CRYPTO_ACATS_TRANSFERS;
    public static final HistoryFilter CRYPTO_STAKING;
    public static final HistoryFilter CRYPTO_TRANSFERS;
    public static final HistoryFilter DEBIT_CARD;
    public static final HistoryFilter DIVIDENDS;
    public static final HistoryFilter EQUITIES;
    public static final HistoryFilter EVENT_CONTRACTS;
    public static final HistoryFilter FUTURES;
    public static final HistoryFilter GIFTS;
    public static final HistoryFilter GOLD;
    public static final HistoryFilter GOLD_DEPOSIT_BOOST;
    public static final HistoryFilter INTEREST;
    public static final HistoryFilter OPTIONS;
    public static final HistoryFilter OPTION_EVENTS;
    public static final HistoryFilter ORDERS;
    public static final HistoryFilter PERPETUALS_MARGIN_CHANGE;
    public static final HistoryFilter PERPETUALS_ORDERS;
    public static final HistoryFilter PERPETUALS_SETTLEMENT;
    public static final HistoryFilter REWARDS;
    public static final HistoryFilter ROUNDUP_REWARD;
    public static final HistoryFilter STOCK_LOAN_PAYMENTS;
    public static final HistoryFilter TOKENIZED_STOCKS_DIVIDENDS;
    public static final HistoryFilter TRANSFERS;
    private final Set<HistoryTransactionType> transactionTypes;

    /* compiled from: HistoryFilter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HistoryFilter.values().length];
            try {
                iArr[HistoryFilter.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HistoryFilter.TRANSFERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HistoryFilter.ORDERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HistoryFilter.DIVIDENDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HistoryFilter.GIFTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HistoryFilter.REWARDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HistoryFilter.DEBIT_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HistoryFilter.GOLD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HistoryFilter.INTEREST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HistoryFilter.CHECK_PAYMENTS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HistoryFilter.EQUITIES.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HistoryFilter.EVENT_CONTRACTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HistoryFilter.FUTURES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HistoryFilter.OPTIONS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[HistoryFilter.OPTION_EVENTS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[HistoryFilter.CORPORATE_ACTIONS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[HistoryFilter.STOCK_LOAN_PAYMENTS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[HistoryFilter.ROUNDUP_REWARD.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[HistoryFilter.CRYPTO_TRANSFERS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[HistoryFilter.CRYPTO_STAKING.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[HistoryFilter.GOLD_DEPOSIT_BOOST.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[HistoryFilter.ADR_FEES.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[HistoryFilter.BORROW_CHARGE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[HistoryFilter.PERPETUALS_ORDERS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[HistoryFilter.PERPETUALS_SETTLEMENT.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[HistoryFilter.PERPETUALS_MARGIN_CHANGE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[HistoryFilter.TOKENIZED_STOCKS_DIVIDENDS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[HistoryFilter.CRYPTO_ACATS_TRANSFERS.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AppType.values().length];
            try {
                iArr2[AppType.TRADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final /* synthetic */ HistoryFilter[] $values() {
        return new HistoryFilter[]{ALL, TRANSFERS, ORDERS, EQUITIES, EVENT_CONTRACTS, FUTURES, OPTIONS, DEBIT_CARD, DIVIDENDS, GOLD, REWARDS, GIFTS, INTEREST, OPTION_EVENTS, CORPORATE_ACTIONS, STOCK_LOAN_PAYMENTS, CHECK_PAYMENTS, ROUNDUP_REWARD, CRYPTO_ACATS_TRANSFERS, CRYPTO_TRANSFERS, CRYPTO_STAKING, GOLD_DEPOSIT_BOOST, ADR_FEES, BORROW_CHARGE, PERPETUALS_ORDERS, PERPETUALS_SETTLEMENT, PERPETUALS_MARGIN_CHANGE, TOKENIZED_STOCKS_DIVIDENDS};
    }

    public static EnumEntries<HistoryFilter> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private HistoryFilter(String str, int i, Set set) {
        this.transactionTypes = set;
    }

    public final Set<HistoryTransactionType> getTransactionTypes() {
        return this.transactionTypes;
    }

    static {
        EnumSet enumSetAllOf = EnumSet.allOf(HistoryTransactionType.INSTANCE.getEnumClass());
        Intrinsics.checkNotNullExpressionValue(enumSetAllOf, "allOf(...)");
        ALL = new HistoryFilter(DisplaySpans.ALL, 0, enumSetAllOf);
        HistoryTransactionType historyTransactionType = HistoryTransactionType.ACATS_TRANSFER;
        HistoryTransactionType historyTransactionType2 = HistoryTransactionType.LEGACY_ACATS_TRANSFER;
        HistoryTransactionType historyTransactionType3 = HistoryTransactionType.NON_ORIGINATED_ACH_TRANSFER;
        HistoryTransactionType historyTransactionType4 = HistoryTransactionType.ORIGINATED_ACH_TRANSFER;
        HistoryTransactionType historyTransactionType5 = HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_ACH;
        HistoryTransactionType historyTransactionType6 = HistoryTransactionType.DEBIT_CARD_TRANSFER;
        HistoryTransactionType historyTransactionType7 = HistoryTransactionType.RHY_ORIGINATED_ACH_TRANSFER;
        HistoryTransactionType historyTransactionType8 = HistoryTransactionType.RHY_NON_ORIGINATED_ACH_TRANSFER;
        HistoryTransactionType historyTransactionType9 = HistoryTransactionType.RHY_INTER_ENTITY_TRANSFER;
        HistoryTransactionType historyTransactionType10 = HistoryTransactionType.INTERNAL_TRANSFER;
        HistoryTransactionType historyTransactionType11 = HistoryTransactionType.CASH_BALANCE_TRANSFER;
        HistoryTransactionType historyTransactionType12 = HistoryTransactionType.CHECK_TRANSFER;
        HistoryTransactionType historyTransactionType13 = HistoryTransactionType.INCOMING_WIRE;
        TRANSFERS = new HistoryFilter("TRANSFERS", 1, historyTransactionType, historyTransactionType2, historyTransactionType3, historyTransactionType4, historyTransactionType5, historyTransactionType6, historyTransactionType7, historyTransactionType8, historyTransactionType9, historyTransactionType10, historyTransactionType11, historyTransactionType12, historyTransactionType13, HistoryTransactionType.WIRE, HistoryTransactionType.UK_BANK_TRANSFER, HistoryTransactionType.UK_OPEN_BANKING_TRANSFER, HistoryTransactionType.SG_BANK_TRANSFER, HistoryTransactionType.RETIREMENT_FEE, HistoryTransactionType.SEPA_CREDIT, HistoryTransactionType.FX_ORDER, HistoryTransactionType.ISA_CASH_TRANSFER);
        HistoryTransactionType historyTransactionType14 = HistoryTransactionType.EQUITY_ORDER;
        HistoryTransactionType historyTransactionType15 = HistoryTransactionType.CRYPTO_ORDER;
        HistoryTransactionType historyTransactionType16 = HistoryTransactionType.FUTURES_ORDER;
        HistoryTransactionType historyTransactionType17 = HistoryTransactionType.EVENT_ORDER;
        HistoryTransactionType historyTransactionType18 = HistoryTransactionType.OPTION_ORDER;
        HistoryTransactionType historyTransactionType19 = HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_BUYING_POWER;
        HistoryTransactionType historyTransactionType20 = HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_BUYING_POWER;
        HistoryTransactionType historyTransactionType21 = HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_ACH;
        HistoryTransactionType historyTransactionType22 = HistoryTransactionType.ROUNDUP_REWARD;
        HistoryTransactionType historyTransactionType23 = HistoryTransactionType.COMBO_ORDER;
        ORDERS = new HistoryFilter("ORDERS", 2, historyTransactionType14, historyTransactionType15, historyTransactionType16, historyTransactionType17, historyTransactionType18, historyTransactionType19, historyTransactionType5, historyTransactionType20, historyTransactionType21, historyTransactionType22, historyTransactionType23);
        HistoryTransactionType historyTransactionType24 = HistoryTransactionType.INSTRUMENT_SPLIT_PAYMENT;
        HistoryTransactionType historyTransactionType25 = HistoryTransactionType.DIVIDEND;
        HistoryTransactionType historyTransactionType26 = HistoryTransactionType.ADR_FEE;
        EQUITIES = new HistoryFilter("EQUITIES", 3, historyTransactionType14, historyTransactionType19, historyTransactionType5, historyTransactionType24, historyTransactionType25, historyTransactionType26);
        EVENT_CONTRACTS = new HistoryFilter("EVENT_CONTRACTS", 4, HistoryTransactionType.EVENT_CASH_CORRECTION, HistoryTransactionType.EVENT_EXECUTION, historyTransactionType17);
        FUTURES = new HistoryFilter("FUTURES", 5, HistoryTransactionType.FUTURES_CASH_CORRECTION, HistoryTransactionType.FUTURES_EXECUTION, historyTransactionType16);
        HistoryTransactionType historyTransactionType27 = HistoryTransactionType.OPTION_EVENT;
        HistoryTransactionType historyTransactionType28 = HistoryTransactionType.OPTION_CORPORATE_ACTION;
        OPTIONS = new HistoryFilter("OPTIONS", 6, historyTransactionType18, historyTransactionType27, historyTransactionType28, historyTransactionType23);
        DEBIT_CARD = new HistoryFilter("DEBIT_CARD", 7, HistoryTransactionType.DECLINED_CARD_TRANSACTION, HistoryTransactionType.DISPUTE, HistoryTransactionType.PENDING_CARD_TRANSACTION, HistoryTransactionType.SETTLED_CARD_TRANSACTION);
        DIVIDENDS = new HistoryFilter("DIVIDENDS", 8, historyTransactionType25);
        GOLD = new HistoryFilter("GOLD", 9, HistoryTransactionType.MARGIN_INTEREST_CHARGE, HistoryTransactionType.MARGIN_SUBSCRIPTION_FEE, HistoryTransactionType.MARGIN_SUBSCRIPTION_FEE_REFUND);
        REWARDS = new HistoryFilter("REWARDS", 10, HistoryTransactionType.STOCK_REWARD_ITEM, HistoryTransactionType.CASH_REWARD_ITEM, HistoryTransactionType.PSP_GIFT_ITEM, HistoryTransactionType.MERCHANT_REWARD, HistoryTransactionType.CRYPTO_CLAWBACK);
        GIFTS = new HistoryFilter("GIFTS", 11, HistoryTransactionType.CRYPTO_GIFT_ITEM);
        INTEREST = new HistoryFilter("INTEREST", 12, HistoryTransactionType.LEGACY_STOCK_LOAN_PAYMENT, HistoryTransactionType.SWEEP);
        OPTION_EVENTS = new HistoryFilter("OPTION_EVENTS", 13, historyTransactionType27);
        CORPORATE_ACTIONS = new HistoryFilter("CORPORATE_ACTIONS", 14, historyTransactionType28, historyTransactionType24);
        STOCK_LOAN_PAYMENTS = new HistoryFilter("STOCK_LOAN_PAYMENTS", 15, HistoryTransactionType.SLIP_GROUPED_PAYMENT);
        CHECK_PAYMENTS = new HistoryFilter("CHECK_PAYMENTS", 16, HistoryTransactionType.CHECK_PAYMENT);
        ROUNDUP_REWARD = new HistoryFilter("ROUNDUP_REWARD", 17, historyTransactionType22);
        CRYPTO_ACATS_TRANSFERS = new HistoryFilter("CRYPTO_ACATS_TRANSFERS", 18, HistoryTransactionType.CRYPTO_ACATS_TRANSFER);
        HistoryTransactionType historyTransactionType29 = HistoryTransactionType.CRYPTO_TRANSFER;
        CRYPTO_TRANSFERS = new HistoryFilter("CRYPTO_TRANSFERS", 19, historyTransactionType29);
        CRYPTO_STAKING = new HistoryFilter("CRYPTO_STAKING", 20, HistoryTransactionType.CRYPTO_STAKING);
        GOLD_DEPOSIT_BOOST = new HistoryFilter("GOLD_DEPOSIT_BOOST", 21, historyTransactionType, historyTransactionType29, historyTransactionType6, HistoryTransactionType.GOLD_DEPOSIT_BOOST_ADJUSTMENT, HistoryTransactionType.GOLD_DEPOSIT_BOOST_CREDIT, historyTransactionType13, HistoryTransactionType.INSTANT_BANK_TRANSFER, historyTransactionType10, historyTransactionType21, historyTransactionType5, historyTransactionType3, historyTransactionType4, HistoryTransactionType.OUTGOING_WIRE, historyTransactionType9);
        ADR_FEES = new HistoryFilter("ADR_FEES", 22, historyTransactionType26);
        BORROW_CHARGE = new HistoryFilter("BORROW_CHARGE", 23, HistoryTransactionType.BORROW_CHARGE);
        PERPETUALS_ORDERS = new HistoryFilter("PERPETUALS_ORDERS", 24, HistoryTransactionType.PERPETUALS_ORDER, HistoryTransactionType.PERPETUALS_LIQUIDATION);
        PERPETUALS_SETTLEMENT = new HistoryFilter("PERPETUALS_SETTLEMENT", 25, HistoryTransactionType.PERPETUALS_SETTLEMENT);
        PERPETUALS_MARGIN_CHANGE = new HistoryFilter("PERPETUALS_MARGIN_CHANGE", 26, HistoryTransactionType.PERPETUALS_MARGIN_CHANGE);
        TOKENIZED_STOCKS_DIVIDENDS = new HistoryFilter("TOKENIZED_STOCKS_DIVIDENDS", 27, HistoryTransactionType.TOKENIZED_CORP_ACTION_DIVIDENDS);
        HistoryFilter[] historyFilterArr$values = $values();
        $VALUES = historyFilterArr$values;
        $ENTRIES = EnumEntries2.enumEntries(historyFilterArr$values);
        CREATOR = new Parcelable.Creator<HistoryFilter>() { // from class: com.robinhood.android.common.history.ui.HistoryFilter.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HistoryFilter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return HistoryFilter.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HistoryFilter[] newArray(int i) {
                return new HistoryFilter[i];
            }
        };
    }

    public final Integer getEmptyStateTextResId() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return Integer.valueOf(C11183R.string.history_empty_message_all);
            case 2:
                return Integer.valueOf(C11183R.string.history_empty_message_transfer);
            case 3:
                return Integer.valueOf(C11183R.string.history_empty_message_order);
            case 4:
                return Integer.valueOf(C11183R.string.history_empty_message_dividend);
            case 5:
                return Integer.valueOf(C11183R.string.history_empty_message_gift);
            case 6:
                return Integer.valueOf(C11183R.string.history_empty_message_rewards);
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
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int getLabelResId() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return C11183R.string.history_menu_filter_all;
            case 2:
                return C11183R.string.history_menu_filter_transfers;
            case 3:
                return C11183R.string.history_menu_filter_orders;
            case 4:
                return C11183R.string.history_menu_filter_dividends;
            case 5:
                return C11183R.string.history_menu_filter_gifts;
            case 6:
                return C11183R.string.history_menu_filter_rewards;
            case 7:
                return C11183R.string.history_menu_filter_debit_card;
            case 8:
                return C11183R.string.history_menu_filter_gold;
            case 9:
                return C11183R.string.history_menu_filter_interest;
            case 10:
                return C11183R.string.history_menu_filter_check_payments;
            case 11:
                return C11183R.string.history_menu_filter_equities;
            case 12:
                return C11183R.string.history_menu_filter_event_contracts;
            case 13:
                return C11183R.string.history_menu_filter_futures;
            case 14:
                return C11183R.string.history_menu_filter_options;
            case 15:
                return C11183R.string.history_menu_filter_option_events;
            case 16:
                return C11183R.string.history_menu_filter_corporate_actions;
            case 17:
                return C11183R.string.history_menu_filter_stock_loan_payments;
            case 18:
                return C11183R.string.history_menu_filter_roundup_rewards;
            case 19:
                return C11183R.string.history_menu_filter_crypto_transfers;
            case 20:
                return C11183R.string.history_menu_filter_crypto_staking;
            case 21:
                return C11183R.string.gated_gold_history_menu_filter_gold_deposit_boost;
            case 22:
                return C11183R.string.history_menu_filter_adr_fees;
            case 23:
                return C11183R.string.history_menu_filter_borrow_fees;
            case 24:
                return C11183R.string.history_menu_filter_perpetuals_orders;
            case 25:
                return C11183R.string.history_menu_filter_perpetuals_settlement;
            case 26:
                return C11183R.string.history_menu_filter_perpetuals_margin_change;
            case 27:
                return C11183R.string.history_menu_filter_tokenized_stocks_dividends;
            case 28:
                return C11183R.string.history_menu_filter_crypto_acats_transfers;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final boolean isPersistent() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    private final boolean isPersistentOnRhc() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 6;
    }

    private final boolean getValidOnRhc() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 7 || i == 8 || i == 21) {
            return false;
        }
        switch (i) {
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return false;
            default:
                return true;
        }
    }

    public final boolean isPersistent(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        int i = WhenMappings.$EnumSwitchMapping$1[appType.ordinal()];
        return i != 1 ? i == 2 && isPersistentOnRhc() && getEmptyStateTextResId() != null : isPersistent() && getEmptyStateTextResId() != null;
    }

    public final boolean isValid(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        if (WhenMappings.$EnumSwitchMapping$1[appType.ordinal()] == 2) {
            return getValidOnRhc();
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private HistoryFilter(String str, int i, HistoryTransactionType... historyTransactionTypeArr) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(HistoryTransactionType.INSTANCE.getEnumClass());
        Intrinsics.checkNotNull(enumSetNoneOf);
        CollectionsKt.addAll(enumSetNoneOf, historyTransactionTypeArr);
        Unit unit = Unit.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(enumSetNoneOf, "apply(...)");
        this(str, i, enumSetNoneOf);
    }

    public static HistoryFilter valueOf(String str) {
        return (HistoryFilter) Enum.valueOf(HistoryFilter.class, str);
    }

    public static HistoryFilter[] values() {
        return (HistoryFilter[]) $VALUES.clone();
    }
}
