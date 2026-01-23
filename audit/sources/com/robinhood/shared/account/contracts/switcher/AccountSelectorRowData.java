package com.robinhood.shared.account.contracts.switcher;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: AccountSelectorData.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b/\u0010*J\u0010\u00100\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b0\u00101J\u0086\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b4\u0010'J\u0010\u00105\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b5\u0010\u001fJ\u001a\u00108\u001a\u00020\u00132\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010'R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bB\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bE\u0010*R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bH\u0010-R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bI\u0010*R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\bK\u00101¨\u0006L"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorRowData;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRow;", "Landroid/os/Parcelable;", "Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType", "Lcom/robinhood/models/api/ManagementType;", "managementType", "j$/time/Instant", "createdAt", "", "loggingIdentifier", "accountId", "Lcom/robinhood/utils/resource/StringResource;", "primaryText", "secondaryText", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "accountIcon24", "endIcon24", "endIconContentDescription", "", "enabled", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/utils/resource/StringResource;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component2", "()Lcom/robinhood/models/api/ManagementType;", "component3", "()Lj$/time/Instant;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lcom/robinhood/utils/resource/StringResource;", "component7", "component8", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component9", "component10", "component11", "()Z", "copy", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/utils/resource/StringResource;Z)Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorRowData;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/api/BrokerageAccountType;", "getBrokerageAccountType", "Lcom/robinhood/models/api/ManagementType;", "getManagementType", "Lj$/time/Instant;", "getCreatedAt", "Ljava/lang/String;", "getLoggingIdentifier", "getAccountId", "Lcom/robinhood/utils/resource/StringResource;", "getPrimaryText", "getSecondaryText", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getAccountIcon24", "getEndIcon24", "getEndIconContentDescription", "Z", "getEnabled", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class AccountSelectorRowData implements AccountSwitcherRow, Parcelable {
    public static final Parcelable.Creator<AccountSelectorRowData> CREATOR = new Creator();
    private final ServerToBentoAssetMapper2 accountIcon24;
    private final String accountId;
    private final BrokerageAccountType brokerageAccountType;
    private final Instant createdAt;
    private final boolean enabled;
    private final ServerToBentoAssetMapper2 endIcon24;
    private final StringResource endIconContentDescription;
    private final String loggingIdentifier;
    private final ManagementType managementType;
    private final StringResource primaryText;
    private final StringResource secondaryText;

    /* compiled from: AccountSelectorData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountSelectorRowData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSelectorRowData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountSelectorRowData(BrokerageAccountType.valueOf(parcel.readString()), ManagementType.valueOf(parcel.readString()), (Instant) parcel.readSerializable(), parcel.readString(), parcel.readString(), (StringResource) parcel.readParcelable(AccountSelectorRowData.class.getClassLoader()), (StringResource) parcel.readParcelable(AccountSelectorRowData.class.getClassLoader()), ServerToBentoAssetMapper2.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ServerToBentoAssetMapper2.valueOf(parcel.readString()), (StringResource) parcel.readParcelable(AccountSelectorRowData.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSelectorRowData[] newArray(int i) {
            return new AccountSelectorRowData[i];
        }
    }

    public static /* synthetic */ AccountSelectorRowData copy$default(AccountSelectorRowData accountSelectorRowData, BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant instant, String str, String str2, StringResource stringResource, StringResource stringResource2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, ServerToBentoAssetMapper2 serverToBentoAssetMapper22, StringResource stringResource3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = accountSelectorRowData.brokerageAccountType;
        }
        if ((i & 2) != 0) {
            managementType = accountSelectorRowData.managementType;
        }
        if ((i & 4) != 0) {
            instant = accountSelectorRowData.createdAt;
        }
        if ((i & 8) != 0) {
            str = accountSelectorRowData.loggingIdentifier;
        }
        if ((i & 16) != 0) {
            str2 = accountSelectorRowData.accountId;
        }
        if ((i & 32) != 0) {
            stringResource = accountSelectorRowData.primaryText;
        }
        if ((i & 64) != 0) {
            stringResource2 = accountSelectorRowData.secondaryText;
        }
        if ((i & 128) != 0) {
            serverToBentoAssetMapper2 = accountSelectorRowData.accountIcon24;
        }
        if ((i & 256) != 0) {
            serverToBentoAssetMapper22 = accountSelectorRowData.endIcon24;
        }
        if ((i & 512) != 0) {
            stringResource3 = accountSelectorRowData.endIconContentDescription;
        }
        if ((i & 1024) != 0) {
            z = accountSelectorRowData.enabled;
        }
        StringResource stringResource4 = stringResource3;
        boolean z2 = z;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper23 = serverToBentoAssetMapper2;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper24 = serverToBentoAssetMapper22;
        StringResource stringResource5 = stringResource;
        StringResource stringResource6 = stringResource2;
        String str3 = str2;
        Instant instant2 = instant;
        return accountSelectorRowData.copy(brokerageAccountType, managementType, instant2, str, str3, stringResource5, stringResource6, serverToBentoAssetMapper23, serverToBentoAssetMapper24, stringResource4, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component10, reason: from getter */
    public final StringResource getEndIconContentDescription() {
        return this.endIconContentDescription;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final ManagementType getManagementType() {
        return this.managementType;
    }

    /* renamed from: component3, reason: from getter */
    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component7, reason: from getter */
    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component8, reason: from getter */
    public final ServerToBentoAssetMapper2 getAccountIcon24() {
        return this.accountIcon24;
    }

    /* renamed from: component9, reason: from getter */
    public final ServerToBentoAssetMapper2 getEndIcon24() {
        return this.endIcon24;
    }

    public final AccountSelectorRowData copy(BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant createdAt, String loggingIdentifier, String accountId, StringResource primaryText, StringResource secondaryText, ServerToBentoAssetMapper2 accountIcon24, ServerToBentoAssetMapper2 endIcon24, StringResource endIconContentDescription, boolean enabled) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(accountIcon24, "accountIcon24");
        return new AccountSelectorRowData(brokerageAccountType, managementType, createdAt, loggingIdentifier, accountId, primaryText, secondaryText, accountIcon24, endIcon24, endIconContentDescription, enabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSelectorRowData)) {
            return false;
        }
        AccountSelectorRowData accountSelectorRowData = (AccountSelectorRowData) other;
        return this.brokerageAccountType == accountSelectorRowData.brokerageAccountType && this.managementType == accountSelectorRowData.managementType && Intrinsics.areEqual(this.createdAt, accountSelectorRowData.createdAt) && Intrinsics.areEqual(this.loggingIdentifier, accountSelectorRowData.loggingIdentifier) && Intrinsics.areEqual(this.accountId, accountSelectorRowData.accountId) && Intrinsics.areEqual(this.primaryText, accountSelectorRowData.primaryText) && Intrinsics.areEqual(this.secondaryText, accountSelectorRowData.secondaryText) && this.accountIcon24 == accountSelectorRowData.accountIcon24 && this.endIcon24 == accountSelectorRowData.endIcon24 && Intrinsics.areEqual(this.endIconContentDescription, accountSelectorRowData.endIconContentDescription) && this.enabled == accountSelectorRowData.enabled;
    }

    public int hashCode() {
        int iHashCode = ((((this.brokerageAccountType.hashCode() * 31) + this.managementType.hashCode()) * 31) + this.createdAt.hashCode()) * 31;
        String str = this.loggingIdentifier;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.accountId.hashCode()) * 31) + this.primaryText.hashCode()) * 31;
        StringResource stringResource = this.secondaryText;
        int iHashCode3 = (((iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.accountIcon24.hashCode()) * 31;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.endIcon24;
        int iHashCode4 = (iHashCode3 + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode())) * 31;
        StringResource stringResource2 = this.endIconContentDescription;
        return ((iHashCode4 + (stringResource2 != null ? stringResource2.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "AccountSelectorRowData(brokerageAccountType=" + this.brokerageAccountType + ", managementType=" + this.managementType + ", createdAt=" + this.createdAt + ", loggingIdentifier=" + this.loggingIdentifier + ", accountId=" + this.accountId + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", accountIcon24=" + this.accountIcon24 + ", endIcon24=" + this.endIcon24 + ", endIconContentDescription=" + this.endIconContentDescription + ", enabled=" + this.enabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.brokerageAccountType.name());
        dest.writeString(this.managementType.name());
        dest.writeSerializable(this.createdAt);
        dest.writeString(this.loggingIdentifier);
        dest.writeString(this.accountId);
        dest.writeParcelable(this.primaryText, flags);
        dest.writeParcelable(this.secondaryText, flags);
        dest.writeString(this.accountIcon24.name());
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.endIcon24;
        if (serverToBentoAssetMapper2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(serverToBentoAssetMapper2.name());
        }
        dest.writeParcelable(this.endIconContentDescription, flags);
        dest.writeInt(this.enabled ? 1 : 0);
    }

    public AccountSelectorRowData(BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant createdAt, String str, String accountId, StringResource primaryText, StringResource stringResource, ServerToBentoAssetMapper2 accountIcon24, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource2, boolean z) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(accountIcon24, "accountIcon24");
        this.brokerageAccountType = brokerageAccountType;
        this.managementType = managementType;
        this.createdAt = createdAt;
        this.loggingIdentifier = str;
        this.accountId = accountId;
        this.primaryText = primaryText;
        this.secondaryText = stringResource;
        this.accountIcon24 = accountIcon24;
        this.endIcon24 = serverToBentoAssetMapper2;
        this.endIconContentDescription = stringResource2;
        this.enabled = z;
    }

    public /* synthetic */ AccountSelectorRowData(BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant instant, String str, String str2, StringResource stringResource, StringResource stringResource2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, ServerToBentoAssetMapper2 serverToBentoAssetMapper22, StringResource stringResource3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(brokerageAccountType, managementType, instant, (i & 8) != 0 ? null : str, str2, stringResource, (i & 64) != 0 ? null : stringResource2, serverToBentoAssetMapper2, (i & 256) != 0 ? null : serverToBentoAssetMapper22, (i & 512) != 0 ? null : stringResource3, (i & 1024) != 0 ? true : z);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherRow
    public BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherRow
    public ManagementType getManagementType() {
        return this.managementType;
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherRow
    public Instant getCreatedAt() {
        return this.createdAt;
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherRow
    public String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    public final ServerToBentoAssetMapper2 getAccountIcon24() {
        return this.accountIcon24;
    }

    public final ServerToBentoAssetMapper2 getEndIcon24() {
        return this.endIcon24;
    }

    public final StringResource getEndIconContentDescription() {
        return this.endIconContentDescription;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
