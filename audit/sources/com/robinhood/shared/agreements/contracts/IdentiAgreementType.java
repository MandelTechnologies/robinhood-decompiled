package com.robinhood.shared.agreements.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentiAgreementType.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;", "Landroid/os/Parcelable;", "serverValue", "", "getServerValue", "()Ljava/lang/String;", "ServerDriven", "ClientDriven", "Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType$ClientDriven;", "Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType$ServerDriven;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface IdentiAgreementType extends Parcelable {
    String getServerValue();

    /* compiled from: IdentiAgreementType.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType$ServerDriven;", "Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;", "displayTitle", "", "buttonDisclosure", "serverValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayTitle", "()Ljava/lang/String;", "getButtonDisclosure", "getServerValue", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ServerDriven implements IdentiAgreementType {
        public static final Parcelable.Creator<ServerDriven> CREATOR = new Creator();
        private final String buttonDisclosure;
        private final String displayTitle;
        private final String serverValue;

        /* compiled from: IdentiAgreementType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ServerDriven> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ServerDriven createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ServerDriven(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ServerDriven[] newArray(int i) {
                return new ServerDriven[i];
            }
        }

        public static /* synthetic */ ServerDriven copy$default(ServerDriven serverDriven, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = serverDriven.displayTitle;
            }
            if ((i & 2) != 0) {
                str2 = serverDriven.buttonDisclosure;
            }
            if ((i & 4) != 0) {
                str3 = serverDriven.serverValue;
            }
            return serverDriven.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final String getButtonDisclosure() {
            return this.buttonDisclosure;
        }

        /* renamed from: component3, reason: from getter */
        public final String getServerValue() {
            return this.serverValue;
        }

        public final ServerDriven copy(String displayTitle, String buttonDisclosure, String serverValue) {
            Intrinsics.checkNotNullParameter(serverValue, "serverValue");
            return new ServerDriven(displayTitle, buttonDisclosure, serverValue);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServerDriven)) {
                return false;
            }
            ServerDriven serverDriven = (ServerDriven) other;
            return Intrinsics.areEqual(this.displayTitle, serverDriven.displayTitle) && Intrinsics.areEqual(this.buttonDisclosure, serverDriven.buttonDisclosure) && Intrinsics.areEqual(this.serverValue, serverDriven.serverValue);
        }

        public int hashCode() {
            String str = this.displayTitle;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.buttonDisclosure;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.serverValue.hashCode();
        }

        public String toString() {
            return "ServerDriven(displayTitle=" + this.displayTitle + ", buttonDisclosure=" + this.buttonDisclosure + ", serverValue=" + this.serverValue + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.displayTitle);
            dest.writeString(this.buttonDisclosure);
            dest.writeString(this.serverValue);
        }

        public ServerDriven(String str, String str2, String serverValue) {
            Intrinsics.checkNotNullParameter(serverValue, "serverValue");
            this.displayTitle = str;
            this.buttonDisclosure = str2;
            this.serverValue = serverValue;
        }

        public /* synthetic */ ServerDriven(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3);
        }

        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        public final String getButtonDisclosure() {
            return this.buttonDisclosure;
        }

        @Override // com.robinhood.shared.agreements.contracts.IdentiAgreementType
        public String getServerValue() {
            return this.serverValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IdentiAgreementType.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType$ClientDriven;", "Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "DRIP_INDIVIDUAL", "DRIP_INDIVIDUAL_ACCOUNT_SCOPE", "DRIP_IRA_ROTH", "DRIP_IRA_TRADITIONAL", "DRIP_JOINT_TENANCY_WITH_ROS", "EQUITIES_MOBILE_AUTO_SEND", "COPILOT_DIGEST", "CUSTODIAL_DRIP_AGREEMENT", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ClientDriven implements IdentiAgreementType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ClientDriven[] $VALUES;
        public static final Parcelable.Creator<ClientDriven> CREATOR;
        private final String serverValue;
        public static final ClientDriven DRIP_INDIVIDUAL = new ClientDriven("DRIP_INDIVIDUAL", 0, "drip_agreement");
        public static final ClientDriven DRIP_INDIVIDUAL_ACCOUNT_SCOPE = new ClientDriven("DRIP_INDIVIDUAL_ACCOUNT_SCOPE", 1, "account_scope_drip_agreement");
        public static final ClientDriven DRIP_IRA_ROTH = new ClientDriven("DRIP_IRA_ROTH", 2, "retirement_ira_roth_drip_agreement");
        public static final ClientDriven DRIP_IRA_TRADITIONAL = new ClientDriven("DRIP_IRA_TRADITIONAL", 3, "retirement_ira_traditional_drip_agreement");
        public static final ClientDriven DRIP_JOINT_TENANCY_WITH_ROS = new ClientDriven("DRIP_JOINT_TENANCY_WITH_ROS", 4, "account_scope_ja_drip_agreement");
        public static final ClientDriven EQUITIES_MOBILE_AUTO_SEND = new ClientDriven("EQUITIES_MOBILE_AUTO_SEND", 5, "auto_send_equities_mobile_agreement");
        public static final ClientDriven COPILOT_DIGEST = new ClientDriven("COPILOT_DIGEST", 6, "cortex_digest_agreement");
        public static final ClientDriven CUSTODIAL_DRIP_AGREEMENT = new ClientDriven("CUSTODIAL_DRIP_AGREEMENT", 7, "account_scope_drip_agreement");

        /* compiled from: IdentiAgreementType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ClientDriven> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClientDriven createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return ClientDriven.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClientDriven[] newArray(int i) {
                return new ClientDriven[i];
            }
        }

        private static final /* synthetic */ ClientDriven[] $values() {
            return new ClientDriven[]{DRIP_INDIVIDUAL, DRIP_INDIVIDUAL_ACCOUNT_SCOPE, DRIP_IRA_ROTH, DRIP_IRA_TRADITIONAL, DRIP_JOINT_TENANCY_WITH_ROS, EQUITIES_MOBILE_AUTO_SEND, COPILOT_DIGEST, CUSTODIAL_DRIP_AGREEMENT};
        }

        public static EnumEntries<ClientDriven> getEntries() {
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

        private ClientDriven(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.shared.agreements.contracts.IdentiAgreementType
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            ClientDriven[] clientDrivenArr$values = $values();
            $VALUES = clientDrivenArr$values;
            $ENTRIES = EnumEntries2.enumEntries(clientDrivenArr$values);
            CREATOR = new Creator();
        }

        public static ClientDriven valueOf(String str) {
            return (ClientDriven) Enum.valueOf(ClientDriven.class, str);
        }

        public static ClientDriven[] values() {
            return (ClientDriven[]) $VALUES.clone();
        }
    }
}
