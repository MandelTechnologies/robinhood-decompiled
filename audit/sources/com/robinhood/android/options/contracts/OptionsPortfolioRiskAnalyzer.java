package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzer.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\t\nB\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "initialUnderlyingId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInitialUnderlyingId", "()Ljava/util/UUID;", "WithAccountNumber", "WithAccountType", "Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer$WithAccountNumber;", "Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer$WithAccountType;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class OptionsPortfolioRiskAnalyzer implements FragmentKey, Parcelable {
    private final UUID initialUnderlyingId;

    public /* synthetic */ OptionsPortfolioRiskAnalyzer(UUID uuid, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid);
    }

    private OptionsPortfolioRiskAnalyzer(UUID uuid) {
        this.initialUnderlyingId = uuid;
    }

    public UUID getInitialUnderlyingId() {
        return this.initialUnderlyingId;
    }

    /* compiled from: OptionsPortfolioRiskAnalyzer.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer$WithAccountNumber;", "Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer;", "accountNumber", "", "initialUnderlyingId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getInitialUnderlyingId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class WithAccountNumber extends OptionsPortfolioRiskAnalyzer {
        public static final Parcelable.Creator<WithAccountNumber> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID initialUnderlyingId;

        /* compiled from: OptionsPortfolioRiskAnalyzer.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<WithAccountNumber> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithAccountNumber createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithAccountNumber(parcel.readString(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithAccountNumber[] newArray(int i) {
                return new WithAccountNumber[i];
            }
        }

        public static /* synthetic */ WithAccountNumber copy$default(WithAccountNumber withAccountNumber, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = withAccountNumber.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = withAccountNumber.initialUnderlyingId;
            }
            return withAccountNumber.copy(str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInitialUnderlyingId() {
            return this.initialUnderlyingId;
        }

        public final WithAccountNumber copy(String accountNumber, UUID initialUnderlyingId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new WithAccountNumber(accountNumber, initialUnderlyingId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithAccountNumber)) {
                return false;
            }
            WithAccountNumber withAccountNumber = (WithAccountNumber) other;
            return Intrinsics.areEqual(this.accountNumber, withAccountNumber.accountNumber) && Intrinsics.areEqual(this.initialUnderlyingId, withAccountNumber.initialUnderlyingId);
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            UUID uuid = this.initialUnderlyingId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "WithAccountNumber(accountNumber=" + this.accountNumber + ", initialUnderlyingId=" + this.initialUnderlyingId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.initialUnderlyingId);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.options.contracts.OptionsPortfolioRiskAnalyzer
        public UUID getInitialUnderlyingId() {
            return this.initialUnderlyingId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithAccountNumber(String accountNumber, UUID uuid) {
            super(uuid, null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.initialUnderlyingId = uuid;
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzer.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer$WithAccountType;", "Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "initialUnderlyingId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/UUID;)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getInitialUnderlyingId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class WithAccountType extends OptionsPortfolioRiskAnalyzer {
        public static final Parcelable.Creator<WithAccountType> CREATOR = new Creator();
        private final BrokerageAccountType accountType;
        private final UUID initialUnderlyingId;

        /* compiled from: OptionsPortfolioRiskAnalyzer.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<WithAccountType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithAccountType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithAccountType(BrokerageAccountType.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithAccountType[] newArray(int i) {
                return new WithAccountType[i];
            }
        }

        public static /* synthetic */ WithAccountType copy$default(WithAccountType withAccountType, BrokerageAccountType brokerageAccountType, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountType = withAccountType.accountType;
            }
            if ((i & 2) != 0) {
                uuid = withAccountType.initialUnderlyingId;
            }
            return withAccountType.copy(brokerageAccountType, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInitialUnderlyingId() {
            return this.initialUnderlyingId;
        }

        public final WithAccountType copy(BrokerageAccountType accountType, UUID initialUnderlyingId) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            return new WithAccountType(accountType, initialUnderlyingId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithAccountType)) {
                return false;
            }
            WithAccountType withAccountType = (WithAccountType) other;
            return this.accountType == withAccountType.accountType && Intrinsics.areEqual(this.initialUnderlyingId, withAccountType.initialUnderlyingId);
        }

        public int hashCode() {
            int iHashCode = this.accountType.hashCode() * 31;
            UUID uuid = this.initialUnderlyingId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "WithAccountType(accountType=" + this.accountType + ", initialUnderlyingId=" + this.initialUnderlyingId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountType.name());
            dest.writeSerializable(this.initialUnderlyingId);
        }

        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        @Override // com.robinhood.android.options.contracts.OptionsPortfolioRiskAnalyzer
        public UUID getInitialUnderlyingId() {
            return this.initialUnderlyingId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithAccountType(BrokerageAccountType accountType, UUID uuid) {
            super(uuid, null);
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.accountType = accountType;
            this.initialUnderlyingId = uuid;
        }
    }
}
