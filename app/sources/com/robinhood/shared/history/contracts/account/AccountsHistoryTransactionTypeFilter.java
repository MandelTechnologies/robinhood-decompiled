package com.robinhood.shared.history.contracts.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.enums.RhEnum;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountsHistoryTransactionTypeFilter.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001>B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u000200J\f\u00104\u001a\b\u0012\u0004\u0012\u0002050/J\u0018\u00106\u001a\b\u0012\u0004\u0012\u0002050/*\b\u0012\u0004\u0012\u0002000/H\u0002J\u0006\u00107\u001a\u000208J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000208R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006?"}, m3636d2 = {"Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "Lcom/robinhood/enums/RhEnum;", "Landroid/os/Parcelable;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", DisplaySpans.ALL, "TRANSFERS", "ACATS", "ORDERS", "CRYPTO_ACATS_TRANSFER", "CRYPTO_MARKET_ORDER", "CRYPTO_LIMIT_ORDER", "CRYPTO_STOP_LOSS_ORDER", "CRYPTO_STOP_LIMIT_ORDER", "EQUITIES", "OPTIONS", "EVENT_CONTRACTS", "FUTURES", "DEBIT_CARD", "DIVIDENDS", "GOLD", "MARGIN", "REWARDS", "INTEREST", "OPTION_EVENTS", "CORPORATE_ACTIONS", "STOCK_LOAN_PAYMENTS", "CHECK_PAYMENTS", "ROUNDUP_REWARD", "GIFTS", "CRYPTO_TRANSFERS", "CRYPTO_STAKING", "P2P_TRANSFERS", "GOLD_DEPOSIT_BOOST", "ADR_FEES", "BORROW_CHARGE", "PERPETUALS_ORDER", "PERPETUALS_SETTLEMENT", "PERPETUALS_MARGIN_CHANGE", "ADVISOR_TRADES", "ADVISORY_FEE", "subFilters", "", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter;", "supports", "", "subFilter", "supportedHistoryTransactionTypes", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "combineTransactionTypes", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class AccountsHistoryTransactionTypeFilter implements RhEnum<AccountsHistoryTransactionTypeFilter>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountsHistoryTransactionTypeFilter[] $VALUES;
    public static final Parcelable.Creator<AccountsHistoryTransactionTypeFilter> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final AccountsHistoryTransactionTypeFilter ALL = new AccountsHistoryTransactionTypeFilter(DisplaySpans.ALL, 0, ApiRenderablePlatforms.VERSIONS_ALL);
    public static final AccountsHistoryTransactionTypeFilter TRANSFERS = new AccountsHistoryTransactionTypeFilter("TRANSFERS", 1, "transfers");
    public static final AccountsHistoryTransactionTypeFilter ACATS = new AccountsHistoryTransactionTypeFilter("ACATS", 2, "acats");
    public static final AccountsHistoryTransactionTypeFilter ORDERS = new AccountsHistoryTransactionTypeFilter("ORDERS", 3, "orders");
    public static final AccountsHistoryTransactionTypeFilter CRYPTO_ACATS_TRANSFER = new AccountsHistoryTransactionTypeFilter("CRYPTO_ACATS_TRANSFER", 4, "crypto_acats_transfer");
    public static final AccountsHistoryTransactionTypeFilter CRYPTO_MARKET_ORDER = new AccountsHistoryTransactionTypeFilter("CRYPTO_MARKET_ORDER", 5, "crypto_market");
    public static final AccountsHistoryTransactionTypeFilter CRYPTO_LIMIT_ORDER = new AccountsHistoryTransactionTypeFilter("CRYPTO_LIMIT_ORDER", 6, "crypto_limit");
    public static final AccountsHistoryTransactionTypeFilter CRYPTO_STOP_LOSS_ORDER = new AccountsHistoryTransactionTypeFilter("CRYPTO_STOP_LOSS_ORDER", 7, "crypto_stop_loss");
    public static final AccountsHistoryTransactionTypeFilter CRYPTO_STOP_LIMIT_ORDER = new AccountsHistoryTransactionTypeFilter("CRYPTO_STOP_LIMIT_ORDER", 8, "crypto_stop_limit");
    public static final AccountsHistoryTransactionTypeFilter EQUITIES = new AccountsHistoryTransactionTypeFilter("EQUITIES", 9, "equities");
    public static final AccountsHistoryTransactionTypeFilter OPTIONS = new AccountsHistoryTransactionTypeFilter("OPTIONS", 10, "options");
    public static final AccountsHistoryTransactionTypeFilter EVENT_CONTRACTS = new AccountsHistoryTransactionTypeFilter("EVENT_CONTRACTS", 11, "event_contracts");
    public static final AccountsHistoryTransactionTypeFilter FUTURES = new AccountsHistoryTransactionTypeFilter("FUTURES", 12, "futures");
    public static final AccountsHistoryTransactionTypeFilter DEBIT_CARD = new AccountsHistoryTransactionTypeFilter("DEBIT_CARD", 13, "debit_card");
    public static final AccountsHistoryTransactionTypeFilter DIVIDENDS = new AccountsHistoryTransactionTypeFilter("DIVIDENDS", 14, "dividends");
    public static final AccountsHistoryTransactionTypeFilter GOLD = new AccountsHistoryTransactionTypeFilter("GOLD", 15, AnalyticsStrings.TAB_NAV_TAB_BAR_GOLD_UPGRADE);
    public static final AccountsHistoryTransactionTypeFilter MARGIN = new AccountsHistoryTransactionTypeFilter("MARGIN", 16, GoldFeature.MARGIN);
    public static final AccountsHistoryTransactionTypeFilter REWARDS = new AccountsHistoryTransactionTypeFilter("REWARDS", 17, "rewards");
    public static final AccountsHistoryTransactionTypeFilter INTEREST = new AccountsHistoryTransactionTypeFilter("INTEREST", 18, "interest");
    public static final AccountsHistoryTransactionTypeFilter OPTION_EVENTS = new AccountsHistoryTransactionTypeFilter("OPTION_EVENTS", 19, "option_events");
    public static final AccountsHistoryTransactionTypeFilter CORPORATE_ACTIONS = new AccountsHistoryTransactionTypeFilter("CORPORATE_ACTIONS", 20, "corporate_actions");
    public static final AccountsHistoryTransactionTypeFilter STOCK_LOAN_PAYMENTS = new AccountsHistoryTransactionTypeFilter("STOCK_LOAN_PAYMENTS", 21, "stock_loan_payments");
    public static final AccountsHistoryTransactionTypeFilter CHECK_PAYMENTS = new AccountsHistoryTransactionTypeFilter("CHECK_PAYMENTS", 22, "check_payments");
    public static final AccountsHistoryTransactionTypeFilter ROUNDUP_REWARD = new AccountsHistoryTransactionTypeFilter("ROUNDUP_REWARD", 23, "roundup_reward");
    public static final AccountsHistoryTransactionTypeFilter GIFTS = new AccountsHistoryTransactionTypeFilter("GIFTS", 24, "gifts");
    public static final AccountsHistoryTransactionTypeFilter CRYPTO_TRANSFERS = new AccountsHistoryTransactionTypeFilter("CRYPTO_TRANSFERS", 25, "crypto_transfers");
    public static final AccountsHistoryTransactionTypeFilter CRYPTO_STAKING = new AccountsHistoryTransactionTypeFilter("CRYPTO_STAKING", 26, "crypto_staking");
    public static final AccountsHistoryTransactionTypeFilter P2P_TRANSFERS = new AccountsHistoryTransactionTypeFilter("P2P_TRANSFERS", 27, "p2p_transfers");
    public static final AccountsHistoryTransactionTypeFilter GOLD_DEPOSIT_BOOST = new AccountsHistoryTransactionTypeFilter("GOLD_DEPOSIT_BOOST", 28, "gold_deposit_boost");
    public static final AccountsHistoryTransactionTypeFilter ADR_FEES = new AccountsHistoryTransactionTypeFilter("ADR_FEES", 29, "adr_fees");
    public static final AccountsHistoryTransactionTypeFilter BORROW_CHARGE = new AccountsHistoryTransactionTypeFilter("BORROW_CHARGE", 30, "borrow_charge");
    public static final AccountsHistoryTransactionTypeFilter PERPETUALS_ORDER = new AccountsHistoryTransactionTypeFilter("PERPETUALS_ORDER", 31, "perpetuals_order");
    public static final AccountsHistoryTransactionTypeFilter PERPETUALS_SETTLEMENT = new AccountsHistoryTransactionTypeFilter("PERPETUALS_SETTLEMENT", 32, "perpetuals_settlement");
    public static final AccountsHistoryTransactionTypeFilter PERPETUALS_MARGIN_CHANGE = new AccountsHistoryTransactionTypeFilter("PERPETUALS_MARGIN_CHANGE", 33, "perpetuals_margin_change");
    public static final AccountsHistoryTransactionTypeFilter ADVISOR_TRADES = new AccountsHistoryTransactionTypeFilter("ADVISOR_TRADES", 34, "advisor_trade");
    public static final AccountsHistoryTransactionTypeFilter ADVISORY_FEE = new AccountsHistoryTransactionTypeFilter("ADVISORY_FEE", 35, "advisory_fee");

    /* compiled from: AccountsHistoryTransactionTypeFilter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountsHistoryTransactionTypeFilter.values().length];
            try {
                iArr[AccountsHistoryTransactionTypeFilter.EQUITIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.TRANSFERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.ACATS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.ORDERS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CRYPTO_MARKET_ORDER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CRYPTO_LIMIT_ORDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CRYPTO_STOP_LOSS_ORDER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CRYPTO_STOP_LIMIT_ORDER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CRYPTO_ACATS_TRANSFER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.EVENT_CONTRACTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.FUTURES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.DEBIT_CARD.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.DIVIDENDS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.ADR_FEES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.BORROW_CHARGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.GOLD.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.MARGIN.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.REWARDS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.INTEREST.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.OPTION_EVENTS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CORPORATE_ACTIONS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.STOCK_LOAN_PAYMENTS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CHECK_PAYMENTS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.ROUNDUP_REWARD.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.GIFTS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CRYPTO_TRANSFERS.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.CRYPTO_STAKING.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.P2P_TRANSFERS.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.GOLD_DEPOSIT_BOOST.ordinal()] = 31;
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
        }
    }

    private static final /* synthetic */ AccountsHistoryTransactionTypeFilter[] $values() {
        return new AccountsHistoryTransactionTypeFilter[]{ALL, TRANSFERS, ACATS, ORDERS, CRYPTO_ACATS_TRANSFER, CRYPTO_MARKET_ORDER, CRYPTO_LIMIT_ORDER, CRYPTO_STOP_LOSS_ORDER, CRYPTO_STOP_LIMIT_ORDER, EQUITIES, OPTIONS, EVENT_CONTRACTS, FUTURES, DEBIT_CARD, DIVIDENDS, GOLD, MARGIN, REWARDS, INTEREST, OPTION_EVENTS, CORPORATE_ACTIONS, STOCK_LOAN_PAYMENTS, CHECK_PAYMENTS, ROUNDUP_REWARD, GIFTS, CRYPTO_TRANSFERS, CRYPTO_STAKING, P2P_TRANSFERS, GOLD_DEPOSIT_BOOST, ADR_FEES, BORROW_CHARGE, PERPETUALS_ORDER, PERPETUALS_SETTLEMENT, PERPETUALS_MARGIN_CHANGE, ADVISOR_TRADES, ADVISORY_FEE};
    }

    @JvmStatic
    public static AccountsHistoryTransactionTypeFilter fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<AccountsHistoryTransactionTypeFilter> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter) {
        return INSTANCE.toServerValue(accountsHistoryTransactionTypeFilter);
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

    private AccountsHistoryTransactionTypeFilter(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        AccountsHistoryTransactionTypeFilter[] accountsHistoryTransactionTypeFilterArr$values = $values();
        $VALUES = accountsHistoryTransactionTypeFilterArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountsHistoryTransactionTypeFilterArr$values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<AccountsHistoryTransactionTypeFilter>() { // from class: com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountsHistoryTransactionTypeFilter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return AccountsHistoryTransactionTypeFilter.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountsHistoryTransactionTypeFilter[] newArray(int i) {
                return new AccountsHistoryTransactionTypeFilter[i];
            }
        };
    }

    public final Set<AccountsHistoryTransactionTypeSubFilter> subFilters() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return SetsKt.setOf((Object[]) new AccountsHistoryTransactionTypeSubFilter[]{AccountsHistoryTransactionTypeSubFilter.ALL, AccountsHistoryTransactionTypeSubFilter.EQUITY_ORDERS, AccountsHistoryTransactionTypeSubFilter.EQUITY_CORP_ACTIONS, AccountsHistoryTransactionTypeSubFilter.DIVIDENDS, AccountsHistoryTransactionTypeSubFilter.ADR_FEES, AccountsHistoryTransactionTypeSubFilter.STOCK_LOAN_PAYMENTS, AccountsHistoryTransactionTypeSubFilter.BORROW_CHARGE});
        }
        if (i == 2) {
            return SetsKt.setOf((Object[]) new AccountsHistoryTransactionTypeSubFilter[]{AccountsHistoryTransactionTypeSubFilter.ALL, AccountsHistoryTransactionTypeSubFilter.OPTION_ORDERS, AccountsHistoryTransactionTypeSubFilter.OPTION_CORP_ACTIONS, AccountsHistoryTransactionTypeSubFilter.OPTION_EVENTS});
        }
        return SetsKt.emptySet();
    }

    public final boolean supports(AccountsHistoryTransactionTypeSubFilter subFilter) {
        Intrinsics.checkNotNullParameter(subFilter, "subFilter");
        return subFilters().contains(subFilter);
    }

    public final Set<HistoryTransactionType> supportedHistoryTransactionTypes() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return combineTransactionTypes(EQUITIES.subFilters());
            case 2:
                return combineTransactionTypes(OPTIONS.subFilters());
            case 3:
                EnumSet enumSetAllOf = EnumSet.allOf(HistoryTransactionType.INSTANCE.getEnumClass());
                Intrinsics.checkNotNullExpressionValue(enumSetAllOf, "allOf(...)");
                return enumSetAllOf;
            case 4:
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.NON_ORIGINATED_ACH_TRANSFER, HistoryTransactionType.ORIGINATED_ACH_TRANSFER, HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_ACH, HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_ACH, HistoryTransactionType.RHY_ORIGINATED_ACH_TRANSFER, HistoryTransactionType.RHY_NON_ORIGINATED_ACH_TRANSFER, HistoryTransactionType.RHY_INTER_ENTITY_TRANSFER, HistoryTransactionType.INTERNAL_TRANSFER, HistoryTransactionType.SEPA_CREDIT, HistoryTransactionType.GOLD_DEPOSIT_BOOST_CREDIT, HistoryTransactionType.GOLD_DEPOSIT_BOOST_ADJUSTMENT, HistoryTransactionType.ISA_CASH_TRANSFER, HistoryTransactionType.FX_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                return enumSetOf;
            case 5:
                EnumSet enumSetOf2 = EnumSet.of(HistoryTransactionType.ACATS_TRANSFER, HistoryTransactionType.LEGACY_ACATS_TRANSFER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                return enumSetOf2;
            case 6:
                EnumSet enumSetOf3 = EnumSet.of(HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_BUYING_POWER, HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_ACH, HistoryTransactionType.CRYPTO_ORDER, HistoryTransactionType.CRYPTO_MARKET_ORDER, HistoryTransactionType.CRYPTO_LIMIT_ORDER, HistoryTransactionType.CRYPTO_STOP_LOSS_ORDER, HistoryTransactionType.CRYPTO_STOP_LIMIT_ORDER, HistoryTransactionType.EQUITY_ORDER, HistoryTransactionType.FUTURES_ORDER, HistoryTransactionType.EVENT_ORDER, HistoryTransactionType.OPTION_ORDER, HistoryTransactionType.COMBO_ORDER, HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_BUYING_POWER, HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_ACH, HistoryTransactionType.ROUNDUP_REWARD, HistoryTransactionType.PERPETUALS_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf3, "of(...)");
                return enumSetOf3;
            case 7:
                EnumSet enumSetOf4 = EnumSet.of(HistoryTransactionType.CRYPTO_MARKET_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf4, "of(...)");
                return enumSetOf4;
            case 8:
                EnumSet enumSetOf5 = EnumSet.of(HistoryTransactionType.CRYPTO_LIMIT_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf5, "of(...)");
                return enumSetOf5;
            case 9:
                EnumSet enumSetOf6 = EnumSet.of(HistoryTransactionType.CRYPTO_STOP_LOSS_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf6, "of(...)");
                return enumSetOf6;
            case 10:
                EnumSet enumSetOf7 = EnumSet.of(HistoryTransactionType.CRYPTO_STOP_LIMIT_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf7, "of(...)");
                return enumSetOf7;
            case 11:
                EnumSet enumSetOf8 = EnumSet.of(HistoryTransactionType.CRYPTO_ACATS_TRANSFER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf8, "of(...)");
                return enumSetOf8;
            case 12:
                EnumSet enumSetOf9 = EnumSet.of(HistoryTransactionType.EVENT_CASH_CORRECTION, HistoryTransactionType.EVENT_EXECUTION, HistoryTransactionType.EVENT_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf9, "of(...)");
                return enumSetOf9;
            case 13:
                EnumSet enumSetOf10 = EnumSet.of(HistoryTransactionType.FUTURES_CASH_CORRECTION, HistoryTransactionType.FUTURES_EXECUTION, HistoryTransactionType.FUTURES_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf10, "of(...)");
                return enumSetOf10;
            case 14:
                EnumSet enumSetOf11 = EnumSet.of(HistoryTransactionType.DECLINED_CARD_TRANSACTION, HistoryTransactionType.DISPUTE, HistoryTransactionType.PENDING_CARD_TRANSACTION, HistoryTransactionType.SETTLED_CARD_TRANSACTION);
                Intrinsics.checkNotNullExpressionValue(enumSetOf11, "of(...)");
                return enumSetOf11;
            case 15:
                EnumSet enumSetOf12 = EnumSet.of(HistoryTransactionType.DIVIDEND, HistoryTransactionType.TOKENIZED_CORP_ACTION_DIVIDENDS);
                Intrinsics.checkNotNullExpressionValue(enumSetOf12, "of(...)");
                return enumSetOf12;
            case 16:
                EnumSet enumSetOf13 = EnumSet.of(HistoryTransactionType.ADR_FEE);
                Intrinsics.checkNotNullExpressionValue(enumSetOf13, "of(...)");
                return enumSetOf13;
            case 17:
                EnumSet enumSetOf14 = EnumSet.of(HistoryTransactionType.BORROW_CHARGE);
                Intrinsics.checkNotNullExpressionValue(enumSetOf14, "of(...)");
                return enumSetOf14;
            case 18:
                EnumSet enumSetOf15 = EnumSet.of(HistoryTransactionType.MARGIN_SUBSCRIPTION_FEE, HistoryTransactionType.MARGIN_SUBSCRIPTION_FEE_REFUND, HistoryTransactionType.GOLD_DEPOSIT_BOOST_CREDIT, HistoryTransactionType.GOLD_DEPOSIT_BOOST_ADJUSTMENT);
                Intrinsics.checkNotNullExpressionValue(enumSetOf15, "of(...)");
                return enumSetOf15;
            case 19:
                EnumSet enumSetOf16 = EnumSet.of(HistoryTransactionType.MARGIN_INTEREST_CHARGE);
                Intrinsics.checkNotNullExpressionValue(enumSetOf16, "of(...)");
                return enumSetOf16;
            case 20:
                EnumSet enumSetOf17 = EnumSet.of(HistoryTransactionType.STOCK_REWARD_ITEM, HistoryTransactionType.CASH_REWARD_ITEM, HistoryTransactionType.PSP_GIFT_ITEM, HistoryTransactionType.MERCHANT_REWARD, HistoryTransactionType.CRYPTO_CLAWBACK);
                Intrinsics.checkNotNullExpressionValue(enumSetOf17, "of(...)");
                return enumSetOf17;
            case 21:
                EnumSet enumSetOf18 = EnumSet.of(HistoryTransactionType.LEGACY_STOCK_LOAN_PAYMENT, HistoryTransactionType.SWEEP, HistoryTransactionType.CRYPTO_CASH_INTEREST_PAYMENT);
                Intrinsics.checkNotNullExpressionValue(enumSetOf18, "of(...)");
                return enumSetOf18;
            case 22:
                EnumSet enumSetOf19 = EnumSet.of(HistoryTransactionType.OPTION_EVENT);
                Intrinsics.checkNotNullExpressionValue(enumSetOf19, "of(...)");
                return enumSetOf19;
            case 23:
                EnumSet enumSetOf20 = EnumSet.of(HistoryTransactionType.OPTION_CORPORATE_ACTION, HistoryTransactionType.INSTRUMENT_SPLIT_PAYMENT);
                Intrinsics.checkNotNullExpressionValue(enumSetOf20, "of(...)");
                return enumSetOf20;
            case 24:
                EnumSet enumSetOf21 = EnumSet.of(HistoryTransactionType.SLIP_GROUPED_PAYMENT);
                Intrinsics.checkNotNullExpressionValue(enumSetOf21, "of(...)");
                return enumSetOf21;
            case 25:
                EnumSet enumSetOf22 = EnumSet.of(HistoryTransactionType.CHECK_PAYMENT);
                Intrinsics.checkNotNullExpressionValue(enumSetOf22, "of(...)");
                return enumSetOf22;
            case 26:
                EnumSet enumSetOf23 = EnumSet.of(HistoryTransactionType.ROUNDUP_REWARD);
                Intrinsics.checkNotNullExpressionValue(enumSetOf23, "of(...)");
                return enumSetOf23;
            case 27:
                EnumSet enumSetOf24 = EnumSet.of(HistoryTransactionType.CRYPTO_GIFT_ITEM);
                Intrinsics.checkNotNullExpressionValue(enumSetOf24, "of(...)");
                return enumSetOf24;
            case 28:
                EnumSet enumSetOf25 = EnumSet.of(HistoryTransactionType.CRYPTO_TRANSFER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf25, "of(...)");
                return enumSetOf25;
            case 29:
                EnumSet enumSetOf26 = EnumSet.of(HistoryTransactionType.CRYPTO_STAKING);
                Intrinsics.checkNotNullExpressionValue(enumSetOf26, "of(...)");
                return enumSetOf26;
            case 30:
                EnumSet enumSetOf27 = EnumSet.of(HistoryTransactionType.MATCHA_TRANSFER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf27, "of(...)");
                return enumSetOf27;
            case 31:
                EnumSet enumSetOf28 = EnumSet.of(HistoryTransactionType.ACATS_TRANSFER, HistoryTransactionType.CRYPTO_TRANSFER, HistoryTransactionType.DEBIT_CARD_TRANSFER, HistoryTransactionType.GOLD_DEPOSIT_BOOST_ADJUSTMENT, HistoryTransactionType.GOLD_DEPOSIT_BOOST_CREDIT, HistoryTransactionType.INCOMING_WIRE, HistoryTransactionType.INSTANT_BANK_TRANSFER, HistoryTransactionType.INTERNAL_TRANSFER, HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_ACH, HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_ACH, HistoryTransactionType.NON_ORIGINATED_ACH_TRANSFER, HistoryTransactionType.ORIGINATED_ACH_TRANSFER, HistoryTransactionType.OUTGOING_WIRE, HistoryTransactionType.RHY_INTER_ENTITY_TRANSFER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf28, "of(...)");
                return enumSetOf28;
            case 32:
                EnumSet enumSetOf29 = EnumSet.of(HistoryTransactionType.PERPETUALS_ORDER, HistoryTransactionType.PERPETUALS_LIQUIDATION);
                Intrinsics.checkNotNullExpressionValue(enumSetOf29, "of(...)");
                return enumSetOf29;
            case 33:
                EnumSet enumSetOf30 = EnumSet.of(HistoryTransactionType.PERPETUALS_SETTLEMENT);
                Intrinsics.checkNotNullExpressionValue(enumSetOf30, "of(...)");
                return enumSetOf30;
            case 34:
                EnumSet enumSetOf31 = EnumSet.of(HistoryTransactionType.PERPETUALS_MARGIN_CHANGE);
                Intrinsics.checkNotNullExpressionValue(enumSetOf31, "of(...)");
                return enumSetOf31;
            case 35:
                EnumSet enumSetOf32 = EnumSet.of(HistoryTransactionType.ADVISOR_TRADE);
                Intrinsics.checkNotNullExpressionValue(enumSetOf32, "of(...)");
                return enumSetOf32;
            case 36:
                EnumSet enumSetOf33 = EnumSet.of(HistoryTransactionType.ADVISORY_FEE);
                Intrinsics.checkNotNullExpressionValue(enumSetOf33, "of(...)");
                return enumSetOf33;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final Set<HistoryTransactionType> combineTransactionTypes(Set<? extends AccountsHistoryTransactionTypeSubFilter> set) {
        Set setMinus = SetsKt.minus(set, AccountsHistoryTransactionTypeSubFilter.ALL);
        ArrayList arrayList = new ArrayList();
        Iterator it = setMinus.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((AccountsHistoryTransactionTypeSubFilter) it.next()).supportedHistoryTransactionTypes());
        }
        return CollectionsKt.toSet(arrayList);
    }

    /* compiled from: AccountsHistoryTransactionTypeFilter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion extends RhEnum.Converter.Defaulted<AccountsHistoryTransactionTypeFilter> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super((Enum[]) AccountsHistoryTransactionTypeFilter.getEntries().toArray(new AccountsHistoryTransactionTypeFilter[0]), AccountsHistoryTransactionTypeFilter.ALL, false, 4, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(AccountsHistoryTransactionTypeFilter enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public AccountsHistoryTransactionTypeFilter fromServerValue(String serverValue) {
            return (AccountsHistoryTransactionTypeFilter) super.fromServerValue(serverValue);
        }
    }

    public static AccountsHistoryTransactionTypeFilter valueOf(String str) {
        return (AccountsHistoryTransactionTypeFilter) Enum.valueOf(AccountsHistoryTransactionTypeFilter.class, str);
    }

    public static AccountsHistoryTransactionTypeFilter[] values() {
        return (AccountsHistoryTransactionTypeFilter[]) $VALUES.clone();
    }
}
