package com.robinhood.shared.history.contracts.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeprecatedAccountsHistoryTransactionTypeFilter.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u0016B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000e¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/history/contracts/account/DeprecatedAccountsHistoryTransactionTypeFilter;", "Lcom/robinhood/enums/RhEnum;", "Landroid/os/Parcelable;", "", "serverValue", "", "replacedBy", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;)V", "getServerValue", "()Ljava/lang/String;", "getReplacedBy", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "CRYPTO_ORDERS", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class DeprecatedAccountsHistoryTransactionTypeFilter implements RhEnum<DeprecatedAccountsHistoryTransactionTypeFilter>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeprecatedAccountsHistoryTransactionTypeFilter[] $VALUES;
    public static final Parcelable.Creator<DeprecatedAccountsHistoryTransactionTypeFilter> CREATOR;
    public static final DeprecatedAccountsHistoryTransactionTypeFilter CRYPTO_ORDERS = new DeprecatedAccountsHistoryTransactionTypeFilter("CRYPTO_ORDERS", 0, "crypto_orders", AccountsHistoryTransactionTypeFilter.ORDERS);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final AccountsHistoryTransactionTypeFilter replacedBy;
    private final String serverValue;

    private static final /* synthetic */ DeprecatedAccountsHistoryTransactionTypeFilter[] $values() {
        return new DeprecatedAccountsHistoryTransactionTypeFilter[]{CRYPTO_ORDERS};
    }

    public static EnumEntries<DeprecatedAccountsHistoryTransactionTypeFilter> getEntries() {
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

    private DeprecatedAccountsHistoryTransactionTypeFilter(String str, int i, String str2, AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter) {
        this.serverValue = str2;
        this.replacedBy = accountsHistoryTransactionTypeFilter;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    public final AccountsHistoryTransactionTypeFilter getReplacedBy() {
        return this.replacedBy;
    }

    static {
        DeprecatedAccountsHistoryTransactionTypeFilter[] deprecatedAccountsHistoryTransactionTypeFilterArr$values = $values();
        $VALUES = deprecatedAccountsHistoryTransactionTypeFilterArr$values;
        $ENTRIES = EnumEntries2.enumEntries(deprecatedAccountsHistoryTransactionTypeFilterArr$values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<DeprecatedAccountsHistoryTransactionTypeFilter>() { // from class: com.robinhood.shared.history.contracts.account.DeprecatedAccountsHistoryTransactionTypeFilter.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeprecatedAccountsHistoryTransactionTypeFilter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return DeprecatedAccountsHistoryTransactionTypeFilter.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeprecatedAccountsHistoryTransactionTypeFilter[] newArray(int i) {
                return new DeprecatedAccountsHistoryTransactionTypeFilter[i];
            }
        };
    }

    /* compiled from: DeprecatedAccountsHistoryTransactionTypeFilter.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/history/contracts/account/DeprecatedAccountsHistoryTransactionTypeFilter$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Optional;", "Lcom/robinhood/shared/history/contracts/account/DeprecatedAccountsHistoryTransactionTypeFilter;", "<init>", "()V", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Optional<DeprecatedAccountsHistoryTransactionTypeFilter> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(DeprecatedAccountsHistoryTransactionTypeFilter.values(), false, 2, null);
        }
    }

    public static DeprecatedAccountsHistoryTransactionTypeFilter valueOf(String str) {
        return (DeprecatedAccountsHistoryTransactionTypeFilter) Enum.valueOf(DeprecatedAccountsHistoryTransactionTypeFilter.class, str);
    }

    public static DeprecatedAccountsHistoryTransactionTypeFilter[] values() {
        return (DeprecatedAccountsHistoryTransactionTypeFilter[]) $VALUES.clone();
    }
}
