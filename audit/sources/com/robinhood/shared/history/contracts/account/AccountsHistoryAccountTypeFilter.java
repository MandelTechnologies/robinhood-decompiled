package com.robinhood.shared.history.contracts.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.enums.RhEnum;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
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
/* compiled from: AccountsHistoryAccountTypeFilter.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001)B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016J\u0006\u0010\"\u001a\u00020#J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00158F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b!\u0010 j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/history/contracts/account/AccountsHistoryAccountTypeFilter;", "Lcom/robinhood/enums/RhEnum;", "Landroid/os/Parcelable;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", DisplaySpans.ALL, "RHY", "RHS", "RHS_CUSTODIAL", "RHS_IRA_ROTH", "RHS_IRA_TRADITIONAL", "RHS_JOINT_TENANCY_WITH_ROS", "CRYPTO", "PERPETUALS", "RHS_ISA_STOCKS_AND_SHARES", "supportedTransactionTypeFilters", "", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "getSupportedTransactionTypeFilters", "()Ljava/util/Set;", "supportedHistoryTransactionTypes", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "getSupportedHistoryTransactionTypes", "supports", "", "transactionTypeFilter", "isCrypto", "()Ljava/lang/Boolean;", "isBrokerage", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class AccountsHistoryAccountTypeFilter implements RhEnum<AccountsHistoryAccountTypeFilter>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountsHistoryAccountTypeFilter[] $VALUES;
    public static final Parcelable.Creator<AccountsHistoryAccountTypeFilter> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final AccountsHistoryAccountTypeFilter ALL = new AccountsHistoryAccountTypeFilter(DisplaySpans.ALL, 0, ApiRenderablePlatforms.VERSIONS_ALL);
    public static final AccountsHistoryAccountTypeFilter RHY = new AccountsHistoryAccountTypeFilter("RHY", 1, "rhy");
    public static final AccountsHistoryAccountTypeFilter RHS = new AccountsHistoryAccountTypeFilter("RHS", 2, "rhs");
    public static final AccountsHistoryAccountTypeFilter RHS_CUSTODIAL = new AccountsHistoryAccountTypeFilter("RHS_CUSTODIAL", 3, "custodial");
    public static final AccountsHistoryAccountTypeFilter RHS_IRA_ROTH = new AccountsHistoryAccountTypeFilter("RHS_IRA_ROTH", 4, "ira_roth");
    public static final AccountsHistoryAccountTypeFilter RHS_IRA_TRADITIONAL = new AccountsHistoryAccountTypeFilter("RHS_IRA_TRADITIONAL", 5, "ira_traditional");
    public static final AccountsHistoryAccountTypeFilter RHS_JOINT_TENANCY_WITH_ROS = new AccountsHistoryAccountTypeFilter("RHS_JOINT_TENANCY_WITH_ROS", 6, "joint_tenancy_with_ros");
    public static final AccountsHistoryAccountTypeFilter CRYPTO = new AccountsHistoryAccountTypeFilter("CRYPTO", 7, AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO);
    public static final AccountsHistoryAccountTypeFilter PERPETUALS = new AccountsHistoryAccountTypeFilter("PERPETUALS", 8, AnalyticsStrings.TAB_NAV_TAB_BAR_PERPETUALS);
    public static final AccountsHistoryAccountTypeFilter RHS_ISA_STOCKS_AND_SHARES = new AccountsHistoryAccountTypeFilter("RHS_ISA_STOCKS_AND_SHARES", 9, "isa_stocks_and_shares");

    /* compiled from: AccountsHistoryAccountTypeFilter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountsHistoryAccountTypeFilter.values().length];
            try {
                iArr[AccountsHistoryAccountTypeFilter.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountsHistoryAccountTypeFilter.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountsHistoryAccountTypeFilter.PERPETUALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountsHistoryAccountTypeFilter.RHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountsHistoryAccountTypeFilter.RHS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccountsHistoryAccountTypeFilter.RHS_CUSTODIAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AccountsHistoryAccountTypeFilter.RHS_IRA_ROTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AccountsHistoryAccountTypeFilter.RHS_IRA_TRADITIONAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AccountsHistoryAccountTypeFilter.RHS_JOINT_TENANCY_WITH_ROS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AccountsHistoryAccountTypeFilter.RHS_ISA_STOCKS_AND_SHARES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ AccountsHistoryAccountTypeFilter[] $values() {
        return new AccountsHistoryAccountTypeFilter[]{ALL, RHY, RHS, RHS_CUSTODIAL, RHS_IRA_ROTH, RHS_IRA_TRADITIONAL, RHS_JOINT_TENANCY_WITH_ROS, CRYPTO, PERPETUALS, RHS_ISA_STOCKS_AND_SHARES};
    }

    @JvmStatic
    public static AccountsHistoryAccountTypeFilter fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<AccountsHistoryAccountTypeFilter> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(AccountsHistoryAccountTypeFilter accountsHistoryAccountTypeFilter) {
        return INSTANCE.toServerValue(accountsHistoryAccountTypeFilter);
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

    private AccountsHistoryAccountTypeFilter(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        AccountsHistoryAccountTypeFilter[] accountsHistoryAccountTypeFilterArr$values = $values();
        $VALUES = accountsHistoryAccountTypeFilterArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountsHistoryAccountTypeFilterArr$values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<AccountsHistoryAccountTypeFilter>() { // from class: com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountsHistoryAccountTypeFilter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return AccountsHistoryAccountTypeFilter.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountsHistoryAccountTypeFilter[] newArray(int i) {
                return new AccountsHistoryAccountTypeFilter[i];
            }
        };
    }

    public final Set<AccountsHistoryTransactionTypeFilter> getSupportedTransactionTypeFilters() {
        EnumEntries<AccountsHistoryTransactionTypeFilter> entries = AccountsHistoryTransactionTypeFilter.getEntries();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter : entries) {
            Set<HistoryTransactionType> setSupportedHistoryTransactionTypes = accountsHistoryTransactionTypeFilter.supportedHistoryTransactionTypes();
            if (!(setSupportedHistoryTransactionTypes instanceof Collection) || !setSupportedHistoryTransactionTypes.isEmpty()) {
                Iterator<T> it = setSupportedHistoryTransactionTypes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (AccountsHistoryAccountTypeFilter2.supportedAccountTypeFilters((HistoryTransactionType) it.next()).contains(this)) {
                        linkedHashSet.add(accountsHistoryTransactionTypeFilter);
                        break;
                    }
                }
            }
        }
        return linkedHashSet;
    }

    public final Set<HistoryTransactionType> getSupportedHistoryTransactionTypes() {
        EnumEntries<HistoryTransactionType> entries = HistoryTransactionType.getEntries();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (HistoryTransactionType historyTransactionType : entries) {
            if (AccountsHistoryAccountTypeFilter2.supportedAccountTypeFilters(historyTransactionType).contains(this)) {
                linkedHashSet.add(historyTransactionType);
            }
        }
        return linkedHashSet;
    }

    public final boolean supports(AccountsHistoryTransactionTypeFilter transactionTypeFilter) {
        Intrinsics.checkNotNullParameter(transactionTypeFilter, "transactionTypeFilter");
        return getSupportedTransactionTypeFilters().contains(transactionTypeFilter);
    }

    public final Boolean isCrypto() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return null;
            case 2:
            case 3:
                return Boolean.TRUE;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return Boolean.FALSE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Boolean isBrokerage() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return null;
            case 2:
            case 3:
            case 4:
                return Boolean.FALSE;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return Boolean.TRUE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: AccountsHistoryAccountTypeFilter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/history/contracts/account/AccountsHistoryAccountTypeFilter$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryAccountTypeFilter;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion extends RhEnum.Converter.Defaulted<AccountsHistoryAccountTypeFilter> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super((Enum[]) AccountsHistoryAccountTypeFilter.getEntries().toArray(new AccountsHistoryAccountTypeFilter[0]), AccountsHistoryAccountTypeFilter.ALL, false, 4, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(AccountsHistoryAccountTypeFilter enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public AccountsHistoryAccountTypeFilter fromServerValue(String serverValue) {
            return (AccountsHistoryAccountTypeFilter) super.fromServerValue(serverValue);
        }
    }

    public static AccountsHistoryAccountTypeFilter valueOf(String str) {
        return (AccountsHistoryAccountTypeFilter) Enum.valueOf(AccountsHistoryAccountTypeFilter.class, str);
    }

    public static AccountsHistoryAccountTypeFilter[] values() {
        return (AccountsHistoryAccountTypeFilter[]) $VALUES.clone();
    }
}
