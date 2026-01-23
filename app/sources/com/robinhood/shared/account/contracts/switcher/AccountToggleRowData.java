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

/* compiled from: AccountToggleData.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b/\u0010.Jx\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b2\u0010&J\u0010\u00103\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b3\u0010\u001eJ\u001a\u00106\u001a\u00020\u00112\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b9\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010&R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b@\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bC\u0010)R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bE\u0010,R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\bG\u0010.R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010F\u001a\u0004\bH\u0010.¨\u0006I"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/AccountToggleRowData;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRow;", "Landroid/os/Parcelable;", "Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType", "Lcom/robinhood/models/api/ManagementType;", "managementType", "j$/time/Instant", "createdAt", "", "loggingIdentifier", "accountId", "Lcom/robinhood/utils/resource/StringResource;", "primaryText", "secondaryText", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "accountIcon24", "", "checked", "loading", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component2", "()Lcom/robinhood/models/api/ManagementType;", "component3", "()Lj$/time/Instant;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lcom/robinhood/utils/resource/StringResource;", "component7", "component8", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component9", "()Z", "component10", "copy", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZZ)Lcom/robinhood/shared/account/contracts/switcher/AccountToggleRowData;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/api/BrokerageAccountType;", "getBrokerageAccountType", "Lcom/robinhood/models/api/ManagementType;", "getManagementType", "Lj$/time/Instant;", "getCreatedAt", "Ljava/lang/String;", "getLoggingIdentifier", "getAccountId", "Lcom/robinhood/utils/resource/StringResource;", "getPrimaryText", "getSecondaryText", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getAccountIcon24", "Z", "getChecked", "getLoading", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class AccountToggleRowData implements AccountSwitcherRow, Parcelable {
    public static final Parcelable.Creator<AccountToggleRowData> CREATOR = new Creator();
    private final ServerToBentoAssetMapper2 accountIcon24;
    private final String accountId;
    private final BrokerageAccountType brokerageAccountType;
    private final boolean checked;
    private final Instant createdAt;
    private final boolean loading;
    private final String loggingIdentifier;
    private final ManagementType managementType;
    private final StringResource primaryText;
    private final StringResource secondaryText;

    /* compiled from: AccountToggleData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountToggleRowData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountToggleRowData createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BrokerageAccountType brokerageAccountTypeValueOf = BrokerageAccountType.valueOf(parcel.readString());
            ManagementType managementTypeValueOf = ManagementType.valueOf(parcel.readString());
            Instant instant = (Instant) parcel.readSerializable();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            StringResource stringResource = (StringResource) parcel.readParcelable(AccountToggleRowData.class.getClassLoader());
            StringResource stringResource2 = (StringResource) parcel.readParcelable(AccountToggleRowData.class.getClassLoader());
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2ValueOf = ServerToBentoAssetMapper2.valueOf(parcel.readString());
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new AccountToggleRowData(brokerageAccountTypeValueOf, managementTypeValueOf, instant, string2, string3, stringResource, stringResource2, serverToBentoAssetMapper2ValueOf, z2, parcel.readInt() == 0 ? z : true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountToggleRowData[] newArray(int i) {
            return new AccountToggleRowData[i];
        }
    }

    public static /* synthetic */ AccountToggleRowData copy$default(AccountToggleRowData accountToggleRowData, BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant instant, String str, String str2, StringResource stringResource, StringResource stringResource2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = accountToggleRowData.brokerageAccountType;
        }
        if ((i & 2) != 0) {
            managementType = accountToggleRowData.managementType;
        }
        if ((i & 4) != 0) {
            instant = accountToggleRowData.createdAt;
        }
        if ((i & 8) != 0) {
            str = accountToggleRowData.loggingIdentifier;
        }
        if ((i & 16) != 0) {
            str2 = accountToggleRowData.accountId;
        }
        if ((i & 32) != 0) {
            stringResource = accountToggleRowData.primaryText;
        }
        if ((i & 64) != 0) {
            stringResource2 = accountToggleRowData.secondaryText;
        }
        if ((i & 128) != 0) {
            serverToBentoAssetMapper2 = accountToggleRowData.accountIcon24;
        }
        if ((i & 256) != 0) {
            z = accountToggleRowData.checked;
        }
        if ((i & 512) != 0) {
            z2 = accountToggleRowData.loading;
        }
        boolean z3 = z;
        boolean z4 = z2;
        StringResource stringResource3 = stringResource2;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
        String str3 = str2;
        StringResource stringResource4 = stringResource;
        return accountToggleRowData.copy(brokerageAccountType, managementType, instant, str, str3, stringResource4, stringResource3, serverToBentoAssetMapper22, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
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
    public final boolean getChecked() {
        return this.checked;
    }

    public final AccountToggleRowData copy(BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant createdAt, String loggingIdentifier, String accountId, StringResource primaryText, StringResource secondaryText, ServerToBentoAssetMapper2 accountIcon24, boolean checked, boolean loading) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(accountIcon24, "accountIcon24");
        return new AccountToggleRowData(brokerageAccountType, managementType, createdAt, loggingIdentifier, accountId, primaryText, secondaryText, accountIcon24, checked, loading);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountToggleRowData)) {
            return false;
        }
        AccountToggleRowData accountToggleRowData = (AccountToggleRowData) other;
        return this.brokerageAccountType == accountToggleRowData.brokerageAccountType && this.managementType == accountToggleRowData.managementType && Intrinsics.areEqual(this.createdAt, accountToggleRowData.createdAt) && Intrinsics.areEqual(this.loggingIdentifier, accountToggleRowData.loggingIdentifier) && Intrinsics.areEqual(this.accountId, accountToggleRowData.accountId) && Intrinsics.areEqual(this.primaryText, accountToggleRowData.primaryText) && Intrinsics.areEqual(this.secondaryText, accountToggleRowData.secondaryText) && this.accountIcon24 == accountToggleRowData.accountIcon24 && this.checked == accountToggleRowData.checked && this.loading == accountToggleRowData.loading;
    }

    public int hashCode() {
        int iHashCode = ((((this.brokerageAccountType.hashCode() * 31) + this.managementType.hashCode()) * 31) + this.createdAt.hashCode()) * 31;
        String str = this.loggingIdentifier;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.accountId.hashCode()) * 31) + this.primaryText.hashCode()) * 31;
        StringResource stringResource = this.secondaryText;
        return ((((((iHashCode2 + (stringResource != null ? stringResource.hashCode() : 0)) * 31) + this.accountIcon24.hashCode()) * 31) + Boolean.hashCode(this.checked)) * 31) + Boolean.hashCode(this.loading);
    }

    public String toString() {
        return "AccountToggleRowData(brokerageAccountType=" + this.brokerageAccountType + ", managementType=" + this.managementType + ", createdAt=" + this.createdAt + ", loggingIdentifier=" + this.loggingIdentifier + ", accountId=" + this.accountId + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", accountIcon24=" + this.accountIcon24 + ", checked=" + this.checked + ", loading=" + this.loading + ")";
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
        dest.writeInt(this.checked ? 1 : 0);
        dest.writeInt(this.loading ? 1 : 0);
    }

    public AccountToggleRowData(BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant createdAt, String str, String accountId, StringResource primaryText, StringResource stringResource, ServerToBentoAssetMapper2 accountIcon24, boolean z, boolean z2) {
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
        this.checked = z;
        this.loading = z2;
    }

    public /* synthetic */ AccountToggleRowData(BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant instant, String str, String str2, StringResource stringResource, StringResource stringResource2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(brokerageAccountType, managementType, instant, (i & 8) != 0 ? null : str, str2, stringResource, (i & 64) != 0 ? null : stringResource2, serverToBentoAssetMapper2, z, (i & 512) != 0 ? false : z2);
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

    public final boolean getChecked() {
        return this.checked;
    }

    public final boolean getLoading() {
        return this.loading;
    }
}
