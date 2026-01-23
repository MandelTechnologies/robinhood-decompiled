package com.robinhood.shared.history.contracts.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.enums.RhEnum;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountsHistoryTransactionTypeSubFilter.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter;", "Lcom/robinhood/enums/RhEnum;", "Landroid/os/Parcelable;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", DisplaySpans.ALL, "EQUITY_ORDERS", "EQUITY_CORP_ACTIONS", "DIVIDENDS", "OPTION_ORDERS", "OPTION_CORP_ACTIONS", "OPTION_EVENTS", "STOCK_LOAN_PAYMENTS", "ADR_FEES", "BORROW_CHARGE", "FX_ORDER", "supportedHistoryTransactionTypes", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class AccountsHistoryTransactionTypeSubFilter implements RhEnum<AccountsHistoryTransactionTypeSubFilter>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountsHistoryTransactionTypeSubFilter[] $VALUES;
    public static final Parcelable.Creator<AccountsHistoryTransactionTypeSubFilter> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final AccountsHistoryTransactionTypeSubFilter ALL = new AccountsHistoryTransactionTypeSubFilter(DisplaySpans.ALL, 0, ApiRenderablePlatforms.VERSIONS_ALL);
    public static final AccountsHistoryTransactionTypeSubFilter EQUITY_ORDERS = new AccountsHistoryTransactionTypeSubFilter("EQUITY_ORDERS", 1, "equity_orders");
    public static final AccountsHistoryTransactionTypeSubFilter EQUITY_CORP_ACTIONS = new AccountsHistoryTransactionTypeSubFilter("EQUITY_CORP_ACTIONS", 2, "equity_corp_actions");
    public static final AccountsHistoryTransactionTypeSubFilter DIVIDENDS = new AccountsHistoryTransactionTypeSubFilter("DIVIDENDS", 3, "dividends");
    public static final AccountsHistoryTransactionTypeSubFilter OPTION_ORDERS = new AccountsHistoryTransactionTypeSubFilter("OPTION_ORDERS", 4, "option_orders");
    public static final AccountsHistoryTransactionTypeSubFilter OPTION_CORP_ACTIONS = new AccountsHistoryTransactionTypeSubFilter("OPTION_CORP_ACTIONS", 5, "option_corp_actions");
    public static final AccountsHistoryTransactionTypeSubFilter OPTION_EVENTS = new AccountsHistoryTransactionTypeSubFilter("OPTION_EVENTS", 6, "option_events");
    public static final AccountsHistoryTransactionTypeSubFilter STOCK_LOAN_PAYMENTS = new AccountsHistoryTransactionTypeSubFilter("STOCK_LOAN_PAYMENTS", 7, "stock_loan_payments");
    public static final AccountsHistoryTransactionTypeSubFilter ADR_FEES = new AccountsHistoryTransactionTypeSubFilter("ADR_FEES", 8, "adr_fees");
    public static final AccountsHistoryTransactionTypeSubFilter BORROW_CHARGE = new AccountsHistoryTransactionTypeSubFilter("BORROW_CHARGE", 9, "borrow_charge");
    public static final AccountsHistoryTransactionTypeSubFilter FX_ORDER = new AccountsHistoryTransactionTypeSubFilter("FX_ORDER", 10, "fx_order");

    /* compiled from: AccountsHistoryTransactionTypeSubFilter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountsHistoryTransactionTypeSubFilter.values().length];
            try {
                iArr[AccountsHistoryTransactionTypeSubFilter.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeSubFilter.EQUITY_ORDERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeSubFilter.EQUITY_CORP_ACTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeSubFilter.DIVIDENDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeSubFilter.ADR_FEES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeSubFilter.BORROW_CHARGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeSubFilter.OPTION_ORDERS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeSubFilter.OPTION_CORP_ACTIONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeSubFilter.OPTION_EVENTS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeSubFilter.STOCK_LOAN_PAYMENTS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeSubFilter.FX_ORDER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ AccountsHistoryTransactionTypeSubFilter[] $values() {
        return new AccountsHistoryTransactionTypeSubFilter[]{ALL, EQUITY_ORDERS, EQUITY_CORP_ACTIONS, DIVIDENDS, OPTION_ORDERS, OPTION_CORP_ACTIONS, OPTION_EVENTS, STOCK_LOAN_PAYMENTS, ADR_FEES, BORROW_CHARGE, FX_ORDER};
    }

    @JvmStatic
    public static AccountsHistoryTransactionTypeSubFilter fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<AccountsHistoryTransactionTypeSubFilter> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(AccountsHistoryTransactionTypeSubFilter accountsHistoryTransactionTypeSubFilter) {
        return INSTANCE.toServerValue(accountsHistoryTransactionTypeSubFilter);
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

    private AccountsHistoryTransactionTypeSubFilter(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        AccountsHistoryTransactionTypeSubFilter[] accountsHistoryTransactionTypeSubFilterArr$values = $values();
        $VALUES = accountsHistoryTransactionTypeSubFilterArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountsHistoryTransactionTypeSubFilterArr$values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<AccountsHistoryTransactionTypeSubFilter>() { // from class: com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeSubFilter.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountsHistoryTransactionTypeSubFilter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return AccountsHistoryTransactionTypeSubFilter.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountsHistoryTransactionTypeSubFilter[] newArray(int i) {
                return new AccountsHistoryTransactionTypeSubFilter[i];
            }
        };
    }

    public final Set<HistoryTransactionType> supportedHistoryTransactionTypes() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                EnumSet enumSetAllOf = EnumSet.allOf(HistoryTransactionType.INSTANCE.getEnumClass());
                Intrinsics.checkNotNullExpressionValue(enumSetAllOf, "allOf(...)");
                return enumSetAllOf;
            case 2:
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.EQUITY_ORDER, HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_BUYING_POWER, HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_ACH, HistoryTransactionType.COMBO_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                return enumSetOf;
            case 3:
                EnumSet enumSetOf2 = EnumSet.of(HistoryTransactionType.INSTRUMENT_SPLIT_PAYMENT);
                Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                return enumSetOf2;
            case 4:
                EnumSet enumSetOf3 = EnumSet.of(HistoryTransactionType.DIVIDEND);
                Intrinsics.checkNotNullExpressionValue(enumSetOf3, "of(...)");
                return enumSetOf3;
            case 5:
                EnumSet enumSetOf4 = EnumSet.of(HistoryTransactionType.ADR_FEE);
                Intrinsics.checkNotNullExpressionValue(enumSetOf4, "of(...)");
                return enumSetOf4;
            case 6:
                EnumSet enumSetOf5 = EnumSet.of(HistoryTransactionType.BORROW_CHARGE);
                Intrinsics.checkNotNullExpressionValue(enumSetOf5, "of(...)");
                return enumSetOf5;
            case 7:
                EnumSet enumSetOf6 = EnumSet.of(HistoryTransactionType.OPTION_ORDER, HistoryTransactionType.COMBO_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf6, "of(...)");
                return enumSetOf6;
            case 8:
                EnumSet enumSetOf7 = EnumSet.of(HistoryTransactionType.OPTION_CORPORATE_ACTION);
                Intrinsics.checkNotNullExpressionValue(enumSetOf7, "of(...)");
                return enumSetOf7;
            case 9:
                EnumSet enumSetOf8 = EnumSet.of(HistoryTransactionType.OPTION_EVENT);
                Intrinsics.checkNotNullExpressionValue(enumSetOf8, "of(...)");
                return enumSetOf8;
            case 10:
                EnumSet enumSetOf9 = EnumSet.of(HistoryTransactionType.SLIP_GROUPED_PAYMENT);
                Intrinsics.checkNotNullExpressionValue(enumSetOf9, "of(...)");
                return enumSetOf9;
            case 11:
                EnumSet enumSetOf10 = EnumSet.of(HistoryTransactionType.FX_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf10, "of(...)");
                return enumSetOf10;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: AccountsHistoryTransactionTypeSubFilter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion extends RhEnum.Converter.Defaulted<AccountsHistoryTransactionTypeSubFilter> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super((Enum[]) AccountsHistoryTransactionTypeSubFilter.getEntries().toArray(new AccountsHistoryTransactionTypeSubFilter[0]), AccountsHistoryTransactionTypeSubFilter.ALL, false, 4, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(AccountsHistoryTransactionTypeSubFilter enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public AccountsHistoryTransactionTypeSubFilter fromServerValue(String serverValue) {
            return (AccountsHistoryTransactionTypeSubFilter) super.fromServerValue(serverValue);
        }
    }

    public static AccountsHistoryTransactionTypeSubFilter valueOf(String str) {
        return (AccountsHistoryTransactionTypeSubFilter) Enum.valueOf(AccountsHistoryTransactionTypeSubFilter.class, str);
    }

    public static AccountsHistoryTransactionTypeSubFilter[] values() {
        return (AccountsHistoryTransactionTypeSubFilter[]) $VALUES.clone();
    }
}
