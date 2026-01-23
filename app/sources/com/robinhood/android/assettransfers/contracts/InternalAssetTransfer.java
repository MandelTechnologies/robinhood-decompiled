package com.robinhood.android.assettransfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransfer.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0002&'B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/assettransfers/contracts/InternalAssetTransfer;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "source", "", "exitToSinkAccountDashboard", "", "accountTypeFilter", "Lcom/robinhood/models/api/BrokerageAccountType;", "preselectedAccounts", "Lcom/robinhood/android/assettransfers/contracts/InternalAssetTransfer$PreselectedAccounts;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/assettransfers/contracts/InternalAssetTransfer$PreselectedAccounts;)V", "getSource", "()Ljava/lang/String;", "getExitToSinkAccountDashboard", "()Z", "getAccountTypeFilter", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getPreselectedAccounts", "()Lcom/robinhood/android/assettransfers/contracts/InternalAssetTransfer$PreselectedAccounts;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PreselectedAccounts", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InternalAssetTransfer implements IntentKey, Parcelable {
    public static final String SINK_ACCOUNT_NUMBER_ARG_KEY = "sink_account_number";
    public static final String SOURCE_ARG_KEY = "source";
    private final BrokerageAccountType accountTypeFilter;
    private final boolean exitToSinkAccountDashboard;
    private final PreselectedAccounts preselectedAccounts;
    private final String source;
    public static final Parcelable.Creator<InternalAssetTransfer> CREATOR = new Creator();

    /* compiled from: InternalAssetTransfer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<InternalAssetTransfer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternalAssetTransfer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InternalAssetTransfer(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : BrokerageAccountType.valueOf(parcel.readString()), parcel.readInt() != 0 ? PreselectedAccounts.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternalAssetTransfer[] newArray(int i) {
            return new InternalAssetTransfer[i];
        }
    }

    public static /* synthetic */ InternalAssetTransfer copy$default(InternalAssetTransfer internalAssetTransfer, String str, boolean z, BrokerageAccountType brokerageAccountType, PreselectedAccounts preselectedAccounts, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internalAssetTransfer.source;
        }
        if ((i & 2) != 0) {
            z = internalAssetTransfer.exitToSinkAccountDashboard;
        }
        if ((i & 4) != 0) {
            brokerageAccountType = internalAssetTransfer.accountTypeFilter;
        }
        if ((i & 8) != 0) {
            preselectedAccounts = internalAssetTransfer.preselectedAccounts;
        }
        return internalAssetTransfer.copy(str, z, brokerageAccountType, preselectedAccounts);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getExitToSinkAccountDashboard() {
        return this.exitToSinkAccountDashboard;
    }

    /* renamed from: component3, reason: from getter */
    public final BrokerageAccountType getAccountTypeFilter() {
        return this.accountTypeFilter;
    }

    /* renamed from: component4, reason: from getter */
    public final PreselectedAccounts getPreselectedAccounts() {
        return this.preselectedAccounts;
    }

    public final InternalAssetTransfer copy(String source, boolean exitToSinkAccountDashboard, BrokerageAccountType accountTypeFilter, PreselectedAccounts preselectedAccounts) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new InternalAssetTransfer(source, exitToSinkAccountDashboard, accountTypeFilter, preselectedAccounts);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransfer)) {
            return false;
        }
        InternalAssetTransfer internalAssetTransfer = (InternalAssetTransfer) other;
        return Intrinsics.areEqual(this.source, internalAssetTransfer.source) && this.exitToSinkAccountDashboard == internalAssetTransfer.exitToSinkAccountDashboard && this.accountTypeFilter == internalAssetTransfer.accountTypeFilter && Intrinsics.areEqual(this.preselectedAccounts, internalAssetTransfer.preselectedAccounts);
    }

    public int hashCode() {
        int iHashCode = ((this.source.hashCode() * 31) + Boolean.hashCode(this.exitToSinkAccountDashboard)) * 31;
        BrokerageAccountType brokerageAccountType = this.accountTypeFilter;
        int iHashCode2 = (iHashCode + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31;
        PreselectedAccounts preselectedAccounts = this.preselectedAccounts;
        return iHashCode2 + (preselectedAccounts != null ? preselectedAccounts.hashCode() : 0);
    }

    public String toString() {
        return "InternalAssetTransfer(source=" + this.source + ", exitToSinkAccountDashboard=" + this.exitToSinkAccountDashboard + ", accountTypeFilter=" + this.accountTypeFilter + ", preselectedAccounts=" + this.preselectedAccounts + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source);
        dest.writeInt(this.exitToSinkAccountDashboard ? 1 : 0);
        BrokerageAccountType brokerageAccountType = this.accountTypeFilter;
        if (brokerageAccountType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(brokerageAccountType.name());
        }
        PreselectedAccounts preselectedAccounts = this.preselectedAccounts;
        if (preselectedAccounts == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            preselectedAccounts.writeToParcel(dest, flags);
        }
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public InternalAssetTransfer(String source, boolean z, BrokerageAccountType brokerageAccountType, PreselectedAccounts preselectedAccounts) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.exitToSinkAccountDashboard = z;
        this.accountTypeFilter = brokerageAccountType;
        this.preselectedAccounts = preselectedAccounts;
    }

    public /* synthetic */ InternalAssetTransfer(String str, boolean z, BrokerageAccountType brokerageAccountType, PreselectedAccounts preselectedAccounts, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : brokerageAccountType, (i & 8) != 0 ? null : preselectedAccounts);
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean getExitToSinkAccountDashboard() {
        return this.exitToSinkAccountDashboard;
    }

    public final BrokerageAccountType getAccountTypeFilter() {
        return this.accountTypeFilter;
    }

    public final PreselectedAccounts getPreselectedAccounts() {
        return this.preselectedAccounts;
    }

    /* compiled from: InternalAssetTransfer.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/assettransfers/contracts/InternalAssetTransfer$PreselectedAccounts;", "Landroid/os/Parcelable;", "sourceRhsAccountNumber", "", "sinkRhsAccountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSourceRhsAccountNumber", "()Ljava/lang/String;", "getSinkRhsAccountNumber", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class PreselectedAccounts implements Parcelable {
        public static final Parcelable.Creator<PreselectedAccounts> CREATOR = new Creator();
        private final String sinkRhsAccountNumber;
        private final String sourceRhsAccountNumber;

        /* compiled from: InternalAssetTransfer.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PreselectedAccounts> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreselectedAccounts createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreselectedAccounts(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreselectedAccounts[] newArray(int i) {
                return new PreselectedAccounts[i];
            }
        }

        public static /* synthetic */ PreselectedAccounts copy$default(PreselectedAccounts preselectedAccounts, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preselectedAccounts.sourceRhsAccountNumber;
            }
            if ((i & 2) != 0) {
                str2 = preselectedAccounts.sinkRhsAccountNumber;
            }
            return preselectedAccounts.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSourceRhsAccountNumber() {
            return this.sourceRhsAccountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSinkRhsAccountNumber() {
            return this.sinkRhsAccountNumber;
        }

        public final PreselectedAccounts copy(String sourceRhsAccountNumber, String sinkRhsAccountNumber) {
            Intrinsics.checkNotNullParameter(sinkRhsAccountNumber, "sinkRhsAccountNumber");
            return new PreselectedAccounts(sourceRhsAccountNumber, sinkRhsAccountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreselectedAccounts)) {
                return false;
            }
            PreselectedAccounts preselectedAccounts = (PreselectedAccounts) other;
            return Intrinsics.areEqual(this.sourceRhsAccountNumber, preselectedAccounts.sourceRhsAccountNumber) && Intrinsics.areEqual(this.sinkRhsAccountNumber, preselectedAccounts.sinkRhsAccountNumber);
        }

        public int hashCode() {
            String str = this.sourceRhsAccountNumber;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.sinkRhsAccountNumber.hashCode();
        }

        public String toString() {
            return "PreselectedAccounts(sourceRhsAccountNumber=" + this.sourceRhsAccountNumber + ", sinkRhsAccountNumber=" + this.sinkRhsAccountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sourceRhsAccountNumber);
            dest.writeString(this.sinkRhsAccountNumber);
        }

        public PreselectedAccounts(String str, String sinkRhsAccountNumber) {
            Intrinsics.checkNotNullParameter(sinkRhsAccountNumber, "sinkRhsAccountNumber");
            this.sourceRhsAccountNumber = str;
            this.sinkRhsAccountNumber = sinkRhsAccountNumber;
        }

        public final String getSourceRhsAccountNumber() {
            return this.sourceRhsAccountNumber;
        }

        public final String getSinkRhsAccountNumber() {
            return this.sinkRhsAccountNumber;
        }
    }
}
