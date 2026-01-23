package com.robinhood.android.account.modelsaccountswitcher;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: AccountSwitcher.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0019J\u0012\u0010(\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0096\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0019J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b;\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b<\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b=\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b>\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b?\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010$R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\b\u0010\u0010&R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\bC\u0010\u0019R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bE\u0010)R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bG\u0010+¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccount;", "", "", "accountNumber", "Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType", "Lcom/robinhood/models/api/ManagementType;", "managementType", "entryTitle", "title", "subtitle", "metadataTitle", "metadataSubtitle", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "icon", "", "isSelectable", "loggingIdentifier", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails;", ErrorBundle.DETAIL_ENTRY, "j$/time/Instant", "createdAt", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/Icon;ZLjava/lang/String;Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails;Lj$/time/Instant;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component3", "()Lcom/robinhood/models/api/ManagementType;", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "component10", "()Z", "component11", "component12", "()Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails;", "component13", "()Lj$/time/Instant;", "copy", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/Icon;ZLjava/lang/String;Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails;Lj$/time/Instant;)Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccount;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountNumber", "Lcom/robinhood/models/api/BrokerageAccountType;", "getBrokerageAccountType", "Lcom/robinhood/models/api/ManagementType;", "getManagementType", "getEntryTitle", "getTitle", "getSubtitle", "getMetadataTitle", "getMetadataSubtitle", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "getIcon", "Z", "getLoggingIdentifier", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails;", "getDetails", "Lj$/time/Instant;", "getCreatedAt", "lib-models-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AccountSwitcherAccount {
    private final String accountNumber;
    private final BrokerageAccountType brokerageAccountType;
    private final Instant createdAt;
    private final AccountSwitcher3 details;
    private final String entryTitle;
    private final Icon icon;
    private final boolean isSelectable;
    private final String loggingIdentifier;
    private final ManagementType managementType;
    private final String metadataSubtitle;
    private final String metadataTitle;
    private final String subtitle;
    private final String title;

    public static /* synthetic */ AccountSwitcherAccount copy$default(AccountSwitcherAccount accountSwitcherAccount, String str, BrokerageAccountType brokerageAccountType, ManagementType managementType, String str2, String str3, String str4, String str5, String str6, Icon icon, boolean z, String str7, AccountSwitcher3 accountSwitcher3, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountSwitcherAccount.accountNumber;
        }
        return accountSwitcherAccount.copy(str, (i & 2) != 0 ? accountSwitcherAccount.brokerageAccountType : brokerageAccountType, (i & 4) != 0 ? accountSwitcherAccount.managementType : managementType, (i & 8) != 0 ? accountSwitcherAccount.entryTitle : str2, (i & 16) != 0 ? accountSwitcherAccount.title : str3, (i & 32) != 0 ? accountSwitcherAccount.subtitle : str4, (i & 64) != 0 ? accountSwitcherAccount.metadataTitle : str5, (i & 128) != 0 ? accountSwitcherAccount.metadataSubtitle : str6, (i & 256) != 0 ? accountSwitcherAccount.icon : icon, (i & 512) != 0 ? accountSwitcherAccount.isSelectable : z, (i & 1024) != 0 ? accountSwitcherAccount.loggingIdentifier : str7, (i & 2048) != 0 ? accountSwitcherAccount.details : accountSwitcher3, (i & 4096) != 0 ? accountSwitcherAccount.createdAt : instant);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsSelectable() {
        return this.isSelectable;
    }

    /* renamed from: component11, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    /* renamed from: component12, reason: from getter */
    public final AccountSwitcher3 getDetails() {
        return this.details;
    }

    /* renamed from: component13, reason: from getter */
    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component2, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component3, reason: from getter */
    public final ManagementType getManagementType() {
        return this.managementType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEntryTitle() {
        return this.entryTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMetadataTitle() {
        return this.metadataTitle;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMetadataSubtitle() {
        return this.metadataSubtitle;
    }

    /* renamed from: component9, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    public final AccountSwitcherAccount copy(String accountNumber, BrokerageAccountType brokerageAccountType, ManagementType managementType, String entryTitle, String title, String subtitle, String metadataTitle, String metadataSubtitle, Icon icon, boolean isSelectable, String loggingIdentifier, AccountSwitcher3 details, Instant createdAt) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        Intrinsics.checkNotNullParameter(entryTitle, "entryTitle");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(metadataTitle, "metadataTitle");
        Intrinsics.checkNotNullParameter(metadataSubtitle, "metadataSubtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new AccountSwitcherAccount(accountNumber, brokerageAccountType, managementType, entryTitle, title, subtitle, metadataTitle, metadataSubtitle, icon, isSelectable, loggingIdentifier, details, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSwitcherAccount)) {
            return false;
        }
        AccountSwitcherAccount accountSwitcherAccount = (AccountSwitcherAccount) other;
        return Intrinsics.areEqual(this.accountNumber, accountSwitcherAccount.accountNumber) && this.brokerageAccountType == accountSwitcherAccount.brokerageAccountType && this.managementType == accountSwitcherAccount.managementType && Intrinsics.areEqual(this.entryTitle, accountSwitcherAccount.entryTitle) && Intrinsics.areEqual(this.title, accountSwitcherAccount.title) && Intrinsics.areEqual(this.subtitle, accountSwitcherAccount.subtitle) && Intrinsics.areEqual(this.metadataTitle, accountSwitcherAccount.metadataTitle) && Intrinsics.areEqual(this.metadataSubtitle, accountSwitcherAccount.metadataSubtitle) && this.icon == accountSwitcherAccount.icon && this.isSelectable == accountSwitcherAccount.isSelectable && Intrinsics.areEqual(this.loggingIdentifier, accountSwitcherAccount.loggingIdentifier) && Intrinsics.areEqual(this.details, accountSwitcherAccount.details) && Intrinsics.areEqual(this.createdAt, accountSwitcherAccount.createdAt);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.accountNumber.hashCode() * 31) + this.brokerageAccountType.hashCode()) * 31) + this.managementType.hashCode()) * 31) + this.entryTitle.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.subtitle;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.metadataTitle.hashCode()) * 31) + this.metadataSubtitle.hashCode()) * 31) + this.icon.hashCode()) * 31) + Boolean.hashCode(this.isSelectable)) * 31) + this.loggingIdentifier.hashCode()) * 31;
        AccountSwitcher3 accountSwitcher3 = this.details;
        return ((iHashCode2 + (accountSwitcher3 != null ? accountSwitcher3.hashCode() : 0)) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        return "AccountSwitcherAccount(accountNumber=" + this.accountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ", managementType=" + this.managementType + ", entryTitle=" + this.entryTitle + ", title=" + this.title + ", subtitle=" + this.subtitle + ", metadataTitle=" + this.metadataTitle + ", metadataSubtitle=" + this.metadataSubtitle + ", icon=" + this.icon + ", isSelectable=" + this.isSelectable + ", loggingIdentifier=" + this.loggingIdentifier + ", details=" + this.details + ", createdAt=" + this.createdAt + ")";
    }

    public AccountSwitcherAccount(String accountNumber, BrokerageAccountType brokerageAccountType, ManagementType managementType, String entryTitle, String title, String str, String metadataTitle, String metadataSubtitle, Icon icon, boolean z, String loggingIdentifier, AccountSwitcher3 accountSwitcher3, Instant createdAt) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        Intrinsics.checkNotNullParameter(entryTitle, "entryTitle");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(metadataTitle, "metadataTitle");
        Intrinsics.checkNotNullParameter(metadataSubtitle, "metadataSubtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.accountNumber = accountNumber;
        this.brokerageAccountType = brokerageAccountType;
        this.managementType = managementType;
        this.entryTitle = entryTitle;
        this.title = title;
        this.subtitle = str;
        this.metadataTitle = metadataTitle;
        this.metadataSubtitle = metadataSubtitle;
        this.icon = icon;
        this.isSelectable = z;
        this.loggingIdentifier = loggingIdentifier;
        this.details = accountSwitcher3;
        this.createdAt = createdAt;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final ManagementType getManagementType() {
        return this.managementType;
    }

    public final String getEntryTitle() {
        return this.entryTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getMetadataTitle() {
        return this.metadataTitle;
    }

    public final String getMetadataSubtitle() {
        return this.metadataSubtitle;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final boolean isSelectable() {
        return this.isSelectable;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final AccountSwitcher3 getDetails() {
        return this.details;
    }

    public final Instant getCreatedAt() {
        return this.createdAt;
    }
}
