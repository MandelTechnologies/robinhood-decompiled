package com.robinhood.android.acatsin.accountnumber;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.parceler.EitherParceler;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAccountNumberContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberContract;", "", "<init>", "()V", "Key", "Callbacks", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInAccountNumberContract {
    public static final int $stable = 0;
    public static final AcatsInAccountNumberContract INSTANCE = new AcatsInAccountNumberContract();

    /* compiled from: AcatsInAccountNumberContract.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberContract$Callbacks;", "", "onAccountNumberEntered", "", "accountNumber", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccountNumberEntered(String accountNumber);
    }

    private AcatsInAccountNumberContract() {
    }

    /* compiled from: AcatsInAccountNumberContract.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001d\u001a\u00020\rHÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "", "rhsAccountNumber", "isAcatsRetry", "", "receivingBrokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;Lcom/robinhood/utils/Either;Ljava/lang/String;ZLcom/robinhood/models/api/BrokerageAccountType;)V", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getRhsAccountNumber", "()Ljava/lang/String;", "()Z", "getReceivingBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
        private final boolean isAcatsRetry;
        private final BrokerageAccountType receivingBrokerageAccountType;
        private final String rhsAccountNumber;
        private final AcatsInScreenContext screenContext;

        /* compiled from: AcatsInAccountNumberContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key(AcatsInScreenContext.CREATOR.createFromParcel(parcel), EitherParceler.INSTANCE.m23663create(parcel), parcel.readString(), parcel.readInt() != 0, BrokerageAccountType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, AcatsInScreenContext acatsInScreenContext, Either either, String str, boolean z, BrokerageAccountType brokerageAccountType, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsInScreenContext = key.screenContext;
            }
            if ((i & 2) != 0) {
                either = key.brokerageOrDtcNumber;
            }
            if ((i & 4) != 0) {
                str = key.rhsAccountNumber;
            }
            if ((i & 8) != 0) {
                z = key.isAcatsRetry;
            }
            if ((i & 16) != 0) {
                brokerageAccountType = key.receivingBrokerageAccountType;
            }
            BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
            String str2 = str;
            return key.copy(acatsInScreenContext, either, str2, z, brokerageAccountType2);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Either<ApiBrokerage, String> component2() {
            return this.brokerageOrDtcNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsAcatsRetry() {
            return this.isAcatsRetry;
        }

        /* renamed from: component5, reason: from getter */
        public final BrokerageAccountType getReceivingBrokerageAccountType() {
            return this.receivingBrokerageAccountType;
        }

        public final Key copy(AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, String rhsAccountNumber, boolean isAcatsRetry, BrokerageAccountType receivingBrokerageAccountType) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(receivingBrokerageAccountType, "receivingBrokerageAccountType");
            return new Key(screenContext, brokerageOrDtcNumber, rhsAccountNumber, isAcatsRetry, receivingBrokerageAccountType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.areEqual(this.screenContext, key.screenContext) && Intrinsics.areEqual(this.brokerageOrDtcNumber, key.brokerageOrDtcNumber) && Intrinsics.areEqual(this.rhsAccountNumber, key.rhsAccountNumber) && this.isAcatsRetry == key.isAcatsRetry && this.receivingBrokerageAccountType == key.receivingBrokerageAccountType;
        }

        public int hashCode() {
            int iHashCode = ((this.screenContext.hashCode() * 31) + this.brokerageOrDtcNumber.hashCode()) * 31;
            String str = this.rhsAccountNumber;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isAcatsRetry)) * 31) + this.receivingBrokerageAccountType.hashCode();
        }

        public String toString() {
            return "Key(screenContext=" + this.screenContext + ", brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", rhsAccountNumber=" + this.rhsAccountNumber + ", isAcatsRetry=" + this.isAcatsRetry + ", receivingBrokerageAccountType=" + this.receivingBrokerageAccountType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.screenContext.writeToParcel(dest, flags);
            EitherParceler.INSTANCE.write((Either<?, ?>) this.brokerageOrDtcNumber, dest, flags);
            dest.writeString(this.rhsAccountNumber);
            dest.writeInt(this.isAcatsRetry ? 1 : 0);
            dest.writeString(this.receivingBrokerageAccountType.name());
        }

        public Key(AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, String str, boolean z, BrokerageAccountType receivingBrokerageAccountType) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(receivingBrokerageAccountType, "receivingBrokerageAccountType");
            this.screenContext = screenContext;
            this.brokerageOrDtcNumber = brokerageOrDtcNumber;
            this.rhsAccountNumber = str;
            this.isAcatsRetry = z;
            this.receivingBrokerageAccountType = receivingBrokerageAccountType;
        }

        public /* synthetic */ Key(AcatsInScreenContext acatsInScreenContext, Either either, String str, boolean z, BrokerageAccountType brokerageAccountType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(acatsInScreenContext, either, str, (i & 8) != 0 ? false : z, brokerageAccountType);
        }

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
            return this.brokerageOrDtcNumber;
        }

        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public final boolean isAcatsRetry() {
            return this.isAcatsRetry;
        }

        public final BrokerageAccountType getReceivingBrokerageAccountType() {
            return this.receivingBrokerageAccountType;
        }
    }
}
