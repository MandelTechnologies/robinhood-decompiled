package com.robinhood.android.internalassettransfers.accountselection;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.utils.resource.StringResource;
import internal_asset_transfers.proto.p475v1.IATIneligibilityReason;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: UiEligibleAccounts.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*Jn\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001dJ\u0010\u0010.\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b.\u0010\u001bJ\u001a\u00101\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b\b\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b\t\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b=\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b?\u0010*R\u0011\u0010C\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "Landroid/os/Parcelable;", "", "rhsAccountNumber", "rhfAccountNumber", "Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType", "", "isEligibleSource", "isEligibleSink", "Linternal_asset_transfers/proto/v1/IATIneligibilityReason;", "sourceIneligibilityReason", "Lcom/robinhood/models/api/ManagementType;", "managementType", "nickname", "j$/time/Instant", "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;ZZLinternal_asset_transfers/proto/v1/IATIneligibilityReason;Lcom/robinhood/models/api/ManagementType;Ljava/lang/String;Lj$/time/Instant;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component4", "()Z", "component5", "component6", "()Linternal_asset_transfers/proto/v1/IATIneligibilityReason;", "component7", "()Lcom/robinhood/models/api/ManagementType;", "component8", "component9", "()Lj$/time/Instant;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;ZZLinternal_asset_transfers/proto/v1/IATIneligibilityReason;Lcom/robinhood/models/api/ManagementType;Ljava/lang/String;Lj$/time/Instant;)Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRhsAccountNumber", "getRhfAccountNumber", "Lcom/robinhood/models/api/BrokerageAccountType;", "getBrokerageAccountType", "Z", "Linternal_asset_transfers/proto/v1/IATIneligibilityReason;", "getSourceIneligibilityReason", "Lcom/robinhood/models/api/ManagementType;", "getManagementType", "getNickname", "Lj$/time/Instant;", "getCreatedAt", "Lcom/robinhood/utils/resource/StringResource;", "getDisplayNameWithAccountInSentence", "()Lcom/robinhood/utils/resource/StringResource;", "displayNameWithAccountInSentence", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class UiIatAccount implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiIatAccount> CREATOR = new Creator();
    private final BrokerageAccountType brokerageAccountType;
    private final Instant createdAt;
    private final boolean isEligibleSink;
    private final boolean isEligibleSource;
    private final ManagementType managementType;
    private final String nickname;
    private final String rhfAccountNumber;
    private final String rhsAccountNumber;
    private final IATIneligibilityReason sourceIneligibilityReason;

    /* compiled from: UiEligibleAccounts.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiIatAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiIatAccount createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            BrokerageAccountType brokerageAccountTypeValueOf = BrokerageAccountType.valueOf(parcel.readString());
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new UiIatAccount(string2, string3, brokerageAccountTypeValueOf, z2, parcel.readInt() == 0 ? z : true, parcel.readInt() == 0 ? null : IATIneligibilityReason.valueOf(parcel.readString()), ManagementType.valueOf(parcel.readString()), parcel.readString(), (Instant) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiIatAccount[] newArray(int i) {
            return new UiIatAccount[i];
        }
    }

    public static /* synthetic */ UiIatAccount copy$default(UiIatAccount uiIatAccount, String str, String str2, BrokerageAccountType brokerageAccountType, boolean z, boolean z2, IATIneligibilityReason iATIneligibilityReason, ManagementType managementType, String str3, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiIatAccount.rhsAccountNumber;
        }
        if ((i & 2) != 0) {
            str2 = uiIatAccount.rhfAccountNumber;
        }
        if ((i & 4) != 0) {
            brokerageAccountType = uiIatAccount.brokerageAccountType;
        }
        if ((i & 8) != 0) {
            z = uiIatAccount.isEligibleSource;
        }
        if ((i & 16) != 0) {
            z2 = uiIatAccount.isEligibleSink;
        }
        if ((i & 32) != 0) {
            iATIneligibilityReason = uiIatAccount.sourceIneligibilityReason;
        }
        if ((i & 64) != 0) {
            managementType = uiIatAccount.managementType;
        }
        if ((i & 128) != 0) {
            str3 = uiIatAccount.nickname;
        }
        if ((i & 256) != 0) {
            instant = uiIatAccount.createdAt;
        }
        String str4 = str3;
        Instant instant2 = instant;
        IATIneligibilityReason iATIneligibilityReason2 = iATIneligibilityReason;
        ManagementType managementType2 = managementType;
        boolean z3 = z2;
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        return uiIatAccount.copy(str, str2, brokerageAccountType2, z, z3, iATIneligibilityReason2, managementType2, str4, instant2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRhfAccountNumber() {
        return this.rhfAccountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEligibleSource() {
        return this.isEligibleSource;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsEligibleSink() {
        return this.isEligibleSink;
    }

    /* renamed from: component6, reason: from getter */
    public final IATIneligibilityReason getSourceIneligibilityReason() {
        return this.sourceIneligibilityReason;
    }

    /* renamed from: component7, reason: from getter */
    public final ManagementType getManagementType() {
        return this.managementType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component9, reason: from getter */
    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    public final UiIatAccount copy(String rhsAccountNumber, String rhfAccountNumber, BrokerageAccountType brokerageAccountType, boolean isEligibleSource, boolean isEligibleSink, IATIneligibilityReason sourceIneligibilityReason, ManagementType managementType, String nickname, Instant createdAt) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(rhfAccountNumber, "rhfAccountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new UiIatAccount(rhsAccountNumber, rhfAccountNumber, brokerageAccountType, isEligibleSource, isEligibleSink, sourceIneligibilityReason, managementType, nickname, createdAt);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiIatAccount)) {
            return false;
        }
        UiIatAccount uiIatAccount = (UiIatAccount) other;
        return Intrinsics.areEqual(this.rhsAccountNumber, uiIatAccount.rhsAccountNumber) && Intrinsics.areEqual(this.rhfAccountNumber, uiIatAccount.rhfAccountNumber) && this.brokerageAccountType == uiIatAccount.brokerageAccountType && this.isEligibleSource == uiIatAccount.isEligibleSource && this.isEligibleSink == uiIatAccount.isEligibleSink && this.sourceIneligibilityReason == uiIatAccount.sourceIneligibilityReason && this.managementType == uiIatAccount.managementType && Intrinsics.areEqual(this.nickname, uiIatAccount.nickname) && Intrinsics.areEqual(this.createdAt, uiIatAccount.createdAt);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.rhsAccountNumber.hashCode() * 31) + this.rhfAccountNumber.hashCode()) * 31) + this.brokerageAccountType.hashCode()) * 31) + Boolean.hashCode(this.isEligibleSource)) * 31) + Boolean.hashCode(this.isEligibleSink)) * 31;
        IATIneligibilityReason iATIneligibilityReason = this.sourceIneligibilityReason;
        int iHashCode2 = (((iHashCode + (iATIneligibilityReason == null ? 0 : iATIneligibilityReason.hashCode())) * 31) + this.managementType.hashCode()) * 31;
        String str = this.nickname;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        return "UiIatAccount(rhsAccountNumber=" + this.rhsAccountNumber + ", rhfAccountNumber=" + this.rhfAccountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ", isEligibleSource=" + this.isEligibleSource + ", isEligibleSink=" + this.isEligibleSink + ", sourceIneligibilityReason=" + this.sourceIneligibilityReason + ", managementType=" + this.managementType + ", nickname=" + this.nickname + ", createdAt=" + this.createdAt + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.rhsAccountNumber);
        dest.writeString(this.rhfAccountNumber);
        dest.writeString(this.brokerageAccountType.name());
        dest.writeInt(this.isEligibleSource ? 1 : 0);
        dest.writeInt(this.isEligibleSink ? 1 : 0);
        IATIneligibilityReason iATIneligibilityReason = this.sourceIneligibilityReason;
        if (iATIneligibilityReason == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iATIneligibilityReason.name());
        }
        dest.writeString(this.managementType.name());
        dest.writeString(this.nickname);
        dest.writeSerializable(this.createdAt);
    }

    public UiIatAccount(String rhsAccountNumber, String rhfAccountNumber, BrokerageAccountType brokerageAccountType, boolean z, boolean z2, IATIneligibilityReason iATIneligibilityReason, ManagementType managementType, String str, Instant createdAt) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(rhfAccountNumber, "rhfAccountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.rhsAccountNumber = rhsAccountNumber;
        this.rhfAccountNumber = rhfAccountNumber;
        this.brokerageAccountType = brokerageAccountType;
        this.isEligibleSource = z;
        this.isEligibleSink = z2;
        this.sourceIneligibilityReason = iATIneligibilityReason;
        this.managementType = managementType;
        this.nickname = str;
        this.createdAt = createdAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UiIatAccount(String str, String str2, BrokerageAccountType brokerageAccountType, boolean z, boolean z2, IATIneligibilityReason iATIneligibilityReason, ManagementType managementType, String str3, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Instant instant2;
        String str4;
        iATIneligibilityReason = (i & 32) != 0 ? null : iATIneligibilityReason;
        if ((i & 128) != 0) {
            instant2 = instant;
            str4 = null;
        } else {
            instant2 = instant;
            str4 = str3;
        }
        this(str, str2, brokerageAccountType, z, z2, iATIneligibilityReason, managementType, str4, instant2);
    }

    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    public final String getRhfAccountNumber() {
        return this.rhfAccountNumber;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final boolean isEligibleSource() {
        return this.isEligibleSource;
    }

    public final boolean isEligibleSink() {
        return this.isEligibleSink;
    }

    public final IATIneligibilityReason getSourceIneligibilityReason() {
        return this.sourceIneligibilityReason;
    }

    public final ManagementType getManagementType() {
        return this.managementType;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    public final StringResource getDisplayNameWithAccountInSentence() {
        return AccountDisplayNames.getDisplayName(this.brokerageAccountType, this.managementType, this.nickname).getWithAccount().getInSentence();
    }
}
