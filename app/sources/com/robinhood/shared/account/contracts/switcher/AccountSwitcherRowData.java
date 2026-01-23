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

/* compiled from: AccountSwitcherRowData.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0007\bR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRow;", "Landroid/os/Parcelable;", "id", "", "getId", "()Ljava/lang/String;", "Account", "PendingApplication", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData$Account;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData$PendingApplication;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface AccountSwitcherRowData extends AccountSwitcherRow, Parcelable {
    String getId();

    /* compiled from: AccountSwitcherRowData.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0010\u0010-\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u0086\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010 J\u0010\u00104\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b4\u0010\u001eJ\u001a\u00107\u001a\u00020\u00122\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\bA\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bD\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bE\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\bF\u0010 R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010.R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bJ\u00100¨\u0006K"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData$Account;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData;", "", "id", "Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType", "Lcom/robinhood/models/api/ManagementType;", "managementType", "j$/time/Instant", "createdAt", "loggingIdentifier", "Lcom/robinhood/utils/resource/StringResource;", "primaryText", "secondaryText", "metadataPrimaryText", "metadataSecondaryText", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "icon", "", "enabled", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component3", "()Lcom/robinhood/models/api/ManagementType;", "component4", "()Lj$/time/Instant;", "component5", "component6", "()Lcom/robinhood/utils/resource/StringResource;", "component7", "component8", "component9", "component10", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component11", "()Z", "copy", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Z)Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData$Account;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/robinhood/models/api/BrokerageAccountType;", "getBrokerageAccountType", "Lcom/robinhood/models/api/ManagementType;", "getManagementType", "Lj$/time/Instant;", "getCreatedAt", "getLoggingIdentifier", "Lcom/robinhood/utils/resource/StringResource;", "getPrimaryText", "getSecondaryText", "getMetadataPrimaryText", "getMetadataSecondaryText", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getIcon", "Z", "getEnabled", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Account implements AccountSwitcherRowData {
        public static final Parcelable.Creator<Account> CREATOR = new Creator();
        private final BrokerageAccountType brokerageAccountType;
        private final Instant createdAt;
        private final boolean enabled;
        private final ServerToBentoAssetMapper2 icon;
        private final String id;
        private final String loggingIdentifier;
        private final ManagementType managementType;
        private final String metadataPrimaryText;
        private final String metadataSecondaryText;
        private final StringResource primaryText;
        private final StringResource secondaryText;

        /* compiled from: AccountSwitcherRowData.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Account> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Account createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Account(parcel.readString(), BrokerageAccountType.valueOf(parcel.readString()), ManagementType.valueOf(parcel.readString()), (Instant) parcel.readSerializable(), parcel.readString(), (StringResource) parcel.readParcelable(Account.class.getClassLoader()), (StringResource) parcel.readParcelable(Account.class.getClassLoader()), parcel.readString(), parcel.readString(), ServerToBentoAssetMapper2.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Account[] newArray(int i) {
                return new Account[i];
            }
        }

        public static /* synthetic */ Account copy$default(Account account, String str, BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant instant, String str2, StringResource stringResource, StringResource stringResource2, String str3, String str4, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = account.id;
            }
            if ((i & 2) != 0) {
                brokerageAccountType = account.brokerageAccountType;
            }
            if ((i & 4) != 0) {
                managementType = account.managementType;
            }
            if ((i & 8) != 0) {
                instant = account.createdAt;
            }
            if ((i & 16) != 0) {
                str2 = account.loggingIdentifier;
            }
            if ((i & 32) != 0) {
                stringResource = account.primaryText;
            }
            if ((i & 64) != 0) {
                stringResource2 = account.secondaryText;
            }
            if ((i & 128) != 0) {
                str3 = account.metadataPrimaryText;
            }
            if ((i & 256) != 0) {
                str4 = account.metadataSecondaryText;
            }
            if ((i & 512) != 0) {
                serverToBentoAssetMapper2 = account.icon;
            }
            if ((i & 1024) != 0) {
                z = account.enabled;
            }
            ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
            boolean z2 = z;
            String str5 = str3;
            String str6 = str4;
            StringResource stringResource3 = stringResource;
            StringResource stringResource4 = stringResource2;
            String str7 = str2;
            ManagementType managementType2 = managementType;
            return account.copy(str, brokerageAccountType, managementType2, instant, str7, stringResource3, stringResource4, str5, str6, serverToBentoAssetMapper22, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
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
        public final Instant getCreatedAt() {
            return this.createdAt;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
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
        public final String getMetadataPrimaryText() {
            return this.metadataPrimaryText;
        }

        /* renamed from: component9, reason: from getter */
        public final String getMetadataSecondaryText() {
            return this.metadataSecondaryText;
        }

        public final Account copy(String id, BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant createdAt, String loggingIdentifier, StringResource primaryText, StringResource secondaryText, String metadataPrimaryText, String metadataSecondaryText, ServerToBentoAssetMapper2 icon, boolean enabled) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(managementType, "managementType");
            Intrinsics.checkNotNullParameter(createdAt, "createdAt");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new Account(id, brokerageAccountType, managementType, createdAt, loggingIdentifier, primaryText, secondaryText, metadataPrimaryText, metadataSecondaryText, icon, enabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Account)) {
                return false;
            }
            Account account = (Account) other;
            return Intrinsics.areEqual(this.id, account.id) && this.brokerageAccountType == account.brokerageAccountType && this.managementType == account.managementType && Intrinsics.areEqual(this.createdAt, account.createdAt) && Intrinsics.areEqual(this.loggingIdentifier, account.loggingIdentifier) && Intrinsics.areEqual(this.primaryText, account.primaryText) && Intrinsics.areEqual(this.secondaryText, account.secondaryText) && Intrinsics.areEqual(this.metadataPrimaryText, account.metadataPrimaryText) && Intrinsics.areEqual(this.metadataSecondaryText, account.metadataSecondaryText) && this.icon == account.icon && this.enabled == account.enabled;
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + this.brokerageAccountType.hashCode()) * 31) + this.managementType.hashCode()) * 31) + this.createdAt.hashCode()) * 31;
            String str = this.loggingIdentifier;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.primaryText.hashCode()) * 31;
            StringResource stringResource = this.secondaryText;
            int iHashCode3 = (iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            String str2 = this.metadataPrimaryText;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.metadataSecondaryText;
            return ((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.icon.hashCode()) * 31) + Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "Account(id=" + this.id + ", brokerageAccountType=" + this.brokerageAccountType + ", managementType=" + this.managementType + ", createdAt=" + this.createdAt + ", loggingIdentifier=" + this.loggingIdentifier + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", metadataPrimaryText=" + this.metadataPrimaryText + ", metadataSecondaryText=" + this.metadataSecondaryText + ", icon=" + this.icon + ", enabled=" + this.enabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.brokerageAccountType.name());
            dest.writeString(this.managementType.name());
            dest.writeSerializable(this.createdAt);
            dest.writeString(this.loggingIdentifier);
            dest.writeParcelable(this.primaryText, flags);
            dest.writeParcelable(this.secondaryText, flags);
            dest.writeString(this.metadataPrimaryText);
            dest.writeString(this.metadataSecondaryText);
            dest.writeString(this.icon.name());
            dest.writeInt(this.enabled ? 1 : 0);
        }

        public Account(String id, BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant createdAt, String str, StringResource primaryText, StringResource stringResource, String str2, String str3, ServerToBentoAssetMapper2 icon, boolean z) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(managementType, "managementType");
            Intrinsics.checkNotNullParameter(createdAt, "createdAt");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.id = id;
            this.brokerageAccountType = brokerageAccountType;
            this.managementType = managementType;
            this.createdAt = createdAt;
            this.loggingIdentifier = str;
            this.primaryText = primaryText;
            this.secondaryText = stringResource;
            this.metadataPrimaryText = str2;
            this.metadataSecondaryText = str3;
            this.icon = icon;
            this.enabled = z;
        }

        public /* synthetic */ Account(String str, BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant instant, String str2, StringResource stringResource, StringResource stringResource2, String str3, String str4, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, brokerageAccountType, managementType, instant, (i & 16) != 0 ? null : str2, stringResource, (i & 64) != 0 ? null : stringResource2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, serverToBentoAssetMapper2, (i & 1024) != 0 ? true : z);
        }

        @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData
        public String getId() {
            return this.id;
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

        public final StringResource getPrimaryText() {
            return this.primaryText;
        }

        public final StringResource getSecondaryText() {
            return this.secondaryText;
        }

        public final String getMetadataPrimaryText() {
            return this.metadataPrimaryText;
        }

        public final String getMetadataSecondaryText() {
            return this.metadataSecondaryText;
        }

        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* compiled from: AccountSwitcherRowData.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJ\u0010\u0010'\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*Jj\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001dJ\u0010\u0010.\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b.\u0010\u001bJ\u001a\u00101\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010!R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010#R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b;\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b=\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010(R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010*¨\u0006B"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData$PendingApplication;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData;", "", "id", "Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType", "Lcom/robinhood/models/api/ManagementType;", "managementType", "j$/time/Instant", "createdAt", "loggingIdentifier", "primaryText", "secondaryText", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "icon", "", "enabled", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component3", "()Lcom/robinhood/models/api/ManagementType;", "component4", "()Lj$/time/Instant;", "component5", "component6", "component7", "component8", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component9", "()Z", "copy", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Z)Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData$PendingApplication;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/robinhood/models/api/BrokerageAccountType;", "getBrokerageAccountType", "Lcom/robinhood/models/api/ManagementType;", "getManagementType", "Lj$/time/Instant;", "getCreatedAt", "getLoggingIdentifier", "getPrimaryText", "getSecondaryText", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getIcon", "Z", "getEnabled", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PendingApplication implements AccountSwitcherRowData {
        public static final Parcelable.Creator<PendingApplication> CREATOR = new Creator();
        private final BrokerageAccountType brokerageAccountType;
        private final Instant createdAt;
        private final boolean enabled;
        private final ServerToBentoAssetMapper2 icon;
        private final String id;
        private final String loggingIdentifier;
        private final ManagementType managementType;
        private final String primaryText;
        private final String secondaryText;

        /* compiled from: AccountSwitcherRowData.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PendingApplication> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PendingApplication createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PendingApplication(parcel.readString(), BrokerageAccountType.valueOf(parcel.readString()), ManagementType.valueOf(parcel.readString()), (Instant) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), ServerToBentoAssetMapper2.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PendingApplication[] newArray(int i) {
                return new PendingApplication[i];
            }
        }

        public static /* synthetic */ PendingApplication copy$default(PendingApplication pendingApplication, String str, BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant instant, String str2, String str3, String str4, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pendingApplication.id;
            }
            if ((i & 2) != 0) {
                brokerageAccountType = pendingApplication.brokerageAccountType;
            }
            if ((i & 4) != 0) {
                managementType = pendingApplication.managementType;
            }
            if ((i & 8) != 0) {
                instant = pendingApplication.createdAt;
            }
            if ((i & 16) != 0) {
                str2 = pendingApplication.loggingIdentifier;
            }
            if ((i & 32) != 0) {
                str3 = pendingApplication.primaryText;
            }
            if ((i & 64) != 0) {
                str4 = pendingApplication.secondaryText;
            }
            if ((i & 128) != 0) {
                serverToBentoAssetMapper2 = pendingApplication.icon;
            }
            if ((i & 256) != 0) {
                z = pendingApplication.enabled;
            }
            ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
            boolean z2 = z;
            String str5 = str3;
            String str6 = str4;
            String str7 = str2;
            ManagementType managementType2 = managementType;
            return pendingApplication.copy(str, brokerageAccountType, managementType2, instant, str7, str5, str6, serverToBentoAssetMapper22, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
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
        public final Instant getCreatedAt() {
            return this.createdAt;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSecondaryText() {
            return this.secondaryText;
        }

        /* renamed from: component8, reason: from getter */
        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final PendingApplication copy(String id, BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant createdAt, String loggingIdentifier, String primaryText, String secondaryText, ServerToBentoAssetMapper2 icon, boolean enabled) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(managementType, "managementType");
            Intrinsics.checkNotNullParameter(createdAt, "createdAt");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new PendingApplication(id, brokerageAccountType, managementType, createdAt, loggingIdentifier, primaryText, secondaryText, icon, enabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingApplication)) {
                return false;
            }
            PendingApplication pendingApplication = (PendingApplication) other;
            return Intrinsics.areEqual(this.id, pendingApplication.id) && this.brokerageAccountType == pendingApplication.brokerageAccountType && this.managementType == pendingApplication.managementType && Intrinsics.areEqual(this.createdAt, pendingApplication.createdAt) && Intrinsics.areEqual(this.loggingIdentifier, pendingApplication.loggingIdentifier) && Intrinsics.areEqual(this.primaryText, pendingApplication.primaryText) && Intrinsics.areEqual(this.secondaryText, pendingApplication.secondaryText) && this.icon == pendingApplication.icon && this.enabled == pendingApplication.enabled;
        }

        public int hashCode() {
            return (((((((((((((((this.id.hashCode() * 31) + this.brokerageAccountType.hashCode()) * 31) + this.managementType.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.loggingIdentifier.hashCode()) * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + this.icon.hashCode()) * 31) + Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "PendingApplication(id=" + this.id + ", brokerageAccountType=" + this.brokerageAccountType + ", managementType=" + this.managementType + ", createdAt=" + this.createdAt + ", loggingIdentifier=" + this.loggingIdentifier + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", icon=" + this.icon + ", enabled=" + this.enabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.brokerageAccountType.name());
            dest.writeString(this.managementType.name());
            dest.writeSerializable(this.createdAt);
            dest.writeString(this.loggingIdentifier);
            dest.writeString(this.primaryText);
            dest.writeString(this.secondaryText);
            dest.writeString(this.icon.name());
            dest.writeInt(this.enabled ? 1 : 0);
        }

        public PendingApplication(String id, BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant createdAt, String loggingIdentifier, String primaryText, String secondaryText, ServerToBentoAssetMapper2 icon, boolean z) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(managementType, "managementType");
            Intrinsics.checkNotNullParameter(createdAt, "createdAt");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.id = id;
            this.brokerageAccountType = brokerageAccountType;
            this.managementType = managementType;
            this.createdAt = createdAt;
            this.loggingIdentifier = loggingIdentifier;
            this.primaryText = primaryText;
            this.secondaryText = secondaryText;
            this.icon = icon;
            this.enabled = z;
        }

        public /* synthetic */ PendingApplication(String str, BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant instant, String str2, String str3, String str4, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, brokerageAccountType, managementType, instant, str2, str3, str4, serverToBentoAssetMapper2, (i & 256) != 0 ? true : z);
        }

        @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData
        public String getId() {
            return this.id;
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

        public final String getPrimaryText() {
            return this.primaryText;
        }

        public final String getSecondaryText() {
            return this.secondaryText;
        }

        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }
}
