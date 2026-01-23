package com.robinhood.android.feature.account.onboarding.accounttype;

import com.robinhood.android.account.icons.AccountDisplayIcons;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountTypeSelectionRow.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow;", "", "title", "", "subtitle", "enabled", "", "identifier", "rowType", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow$RowType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow$RowType;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getEnabled", "()Z", "getIdentifier", "getRowType", "()Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow$RowType;", "iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getIconAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "RowType", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountTypeSelectionRow {
    public static final int $stable = 8;
    private final boolean enabled;
    private final String identifier;
    private final RowType rowType;
    private final String subtitle;
    private final String title;

    public static /* synthetic */ AccountTypeSelectionRow copy$default(AccountTypeSelectionRow accountTypeSelectionRow, String str, String str2, boolean z, String str3, RowType rowType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountTypeSelectionRow.title;
        }
        if ((i & 2) != 0) {
            str2 = accountTypeSelectionRow.subtitle;
        }
        if ((i & 4) != 0) {
            z = accountTypeSelectionRow.enabled;
        }
        if ((i & 8) != 0) {
            str3 = accountTypeSelectionRow.identifier;
        }
        if ((i & 16) != 0) {
            rowType = accountTypeSelectionRow.rowType;
        }
        RowType rowType2 = rowType;
        boolean z2 = z;
        return accountTypeSelectionRow.copy(str, str2, z2, str3, rowType2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component5, reason: from getter */
    public final RowType getRowType() {
        return this.rowType;
    }

    public final AccountTypeSelectionRow copy(String title, String subtitle, boolean enabled, String identifier, RowType rowType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(rowType, "rowType");
        return new AccountTypeSelectionRow(title, subtitle, enabled, identifier, rowType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountTypeSelectionRow)) {
            return false;
        }
        AccountTypeSelectionRow accountTypeSelectionRow = (AccountTypeSelectionRow) other;
        return Intrinsics.areEqual(this.title, accountTypeSelectionRow.title) && Intrinsics.areEqual(this.subtitle, accountTypeSelectionRow.subtitle) && this.enabled == accountTypeSelectionRow.enabled && Intrinsics.areEqual(this.identifier, accountTypeSelectionRow.identifier) && Intrinsics.areEqual(this.rowType, accountTypeSelectionRow.rowType);
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.identifier.hashCode()) * 31) + this.rowType.hashCode();
    }

    public String toString() {
        return "AccountTypeSelectionRow(title=" + this.title + ", subtitle=" + this.subtitle + ", enabled=" + this.enabled + ", identifier=" + this.identifier + ", rowType=" + this.rowType + ")";
    }

    public AccountTypeSelectionRow(String title, String subtitle, boolean z, String identifier, RowType rowType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(rowType, "rowType");
        this.title = title;
        this.subtitle = subtitle;
        this.enabled = z;
        this.identifier = identifier;
        this.rowType = rowType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final RowType getRowType() {
        return this.rowType;
    }

    public final ServerToBentoAssetMapper2 getIconAsset() {
        RowType rowType = this.rowType;
        if (rowType instanceof RowType.Account) {
            return AccountDisplayIcons.getDefaultIconAsset(((RowType.Account) rowType).getBrokerageAccountType());
        }
        if (Intrinsics.areEqual(rowType, RowType.Retirement.INSTANCE)) {
            return ServerToBentoAssetMapper2.RETIREMENT_24;
        }
        if (Intrinsics.areEqual(rowType, RowType.Custodial.INSTANCE)) {
            return ServerToBentoAssetMapper2.CUSTODIAL_24;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: AccountTypeSelectionRow.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow$RowType;", "", "Account", "Retirement", "Custodial", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow$RowType$Account;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow$RowType$Custodial;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow$RowType$Retirement;", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface RowType {

        /* compiled from: AccountTypeSelectionRow.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow$RowType$Account;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow$RowType;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Account implements RowType {
            public static final int $stable = 0;
            private final BrokerageAccountType brokerageAccountType;

            public static /* synthetic */ Account copy$default(Account account, BrokerageAccountType brokerageAccountType, int i, Object obj) {
                if ((i & 1) != 0) {
                    brokerageAccountType = account.brokerageAccountType;
                }
                return account.copy(brokerageAccountType);
            }

            /* renamed from: component1, reason: from getter */
            public final BrokerageAccountType getBrokerageAccountType() {
                return this.brokerageAccountType;
            }

            public final Account copy(BrokerageAccountType brokerageAccountType) {
                Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                return new Account(brokerageAccountType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Account) && this.brokerageAccountType == ((Account) other).brokerageAccountType;
            }

            public int hashCode() {
                return this.brokerageAccountType.hashCode();
            }

            public String toString() {
                return "Account(brokerageAccountType=" + this.brokerageAccountType + ")";
            }

            public Account(BrokerageAccountType brokerageAccountType) {
                Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                this.brokerageAccountType = brokerageAccountType;
            }

            public final BrokerageAccountType getBrokerageAccountType() {
                return this.brokerageAccountType;
            }
        }

        /* compiled from: AccountTypeSelectionRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow$RowType$Retirement;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow$RowType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Retirement implements RowType {
            public static final int $stable = 0;
            public static final Retirement INSTANCE = new Retirement();

            public boolean equals(Object other) {
                return this == other || (other instanceof Retirement);
            }

            public int hashCode() {
                return -1814691879;
            }

            public String toString() {
                return "Retirement";
            }

            private Retirement() {
            }
        }

        /* compiled from: AccountTypeSelectionRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow$RowType$Custodial;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow$RowType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Custodial implements RowType {
            public static final int $stable = 0;
            public static final Custodial INSTANCE = new Custodial();

            public boolean equals(Object other) {
                return this == other || (other instanceof Custodial);
            }

            public int hashCode() {
                return 1160680972;
            }

            public String toString() {
                return "Custodial";
            }

            private Custodial() {
            }
        }
    }
}
