package com.robinhood.android.acats.plaid.transfer.unsupported;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.parceler.EitherParceler;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPlaidUnsupportedAssetsContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsContract;", "", "<init>", "()V", "Key", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInPlaidUnsupportedAssetsContract {
    public static final int $stable = 0;
    public static final AcatsInPlaidUnsupportedAssetsContract INSTANCE = new AcatsInPlaidUnsupportedAssetsContract();

    private AcatsInPlaidUnsupportedAssetsContract() {
    }

    /* compiled from: AcatsInPlaidUnsupportedAssetsContract.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u000eHÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "rhsAccountNumber", "", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "contraAccountNumber", "plaidAccessTokenId", "isOptionsInvestingEnabled", "", "isMarginInvestingEnabled", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/Either;Ljava/lang/String;Ljava/lang/String;ZZLcom/robinhood/android/acatsin/util/AcatsInScreenContext;)V", "getRhsAccountNumber", "()Ljava/lang/String;", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getContraAccountNumber", "getPlaidAccessTokenId", "()Z", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
        private final String contraAccountNumber;
        private final boolean isMarginInvestingEnabled;
        private final boolean isOptionsInvestingEnabled;
        private final String plaidAccessTokenId;
        private final String rhsAccountNumber;
        private final AcatsInScreenContext screenContext;

        /* compiled from: AcatsInPlaidUnsupportedAssetsContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                Either<?, ?> eitherM23663create = EitherParceler.INSTANCE.m23663create(parcel);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new Key(string2, eitherM23663create, string3, string4, z2, parcel.readInt() == 0 ? z : true, (AcatsInScreenContext) parcel.readParcelable(Key.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, String str, Either either, String str2, String str3, boolean z, boolean z2, AcatsInScreenContext acatsInScreenContext, int i, Object obj) {
            if ((i & 1) != 0) {
                str = key.rhsAccountNumber;
            }
            if ((i & 2) != 0) {
                either = key.brokerageOrDtcNumber;
            }
            if ((i & 4) != 0) {
                str2 = key.contraAccountNumber;
            }
            if ((i & 8) != 0) {
                str3 = key.plaidAccessTokenId;
            }
            if ((i & 16) != 0) {
                z = key.isOptionsInvestingEnabled;
            }
            if ((i & 32) != 0) {
                z2 = key.isMarginInvestingEnabled;
            }
            if ((i & 64) != 0) {
                acatsInScreenContext = key.screenContext;
            }
            boolean z3 = z2;
            AcatsInScreenContext acatsInScreenContext2 = acatsInScreenContext;
            boolean z4 = z;
            String str4 = str2;
            return key.copy(str, either, str4, str3, z4, z3, acatsInScreenContext2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public final Either<ApiBrokerage, String> component2() {
            return this.brokerageOrDtcNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContraAccountNumber() {
            return this.contraAccountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPlaidAccessTokenId() {
            return this.plaidAccessTokenId;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsOptionsInvestingEnabled() {
            return this.isOptionsInvestingEnabled;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsMarginInvestingEnabled() {
            return this.isMarginInvestingEnabled;
        }

        /* renamed from: component7, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Key copy(String rhsAccountNumber, Either<ApiBrokerage, String> brokerageOrDtcNumber, String contraAccountNumber, String plaidAccessTokenId, boolean isOptionsInvestingEnabled, boolean isMarginInvestingEnabled, AcatsInScreenContext screenContext) {
            Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(contraAccountNumber, "contraAccountNumber");
            Intrinsics.checkNotNullParameter(plaidAccessTokenId, "plaidAccessTokenId");
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            return new Key(rhsAccountNumber, brokerageOrDtcNumber, contraAccountNumber, plaidAccessTokenId, isOptionsInvestingEnabled, isMarginInvestingEnabled, screenContext);
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
            return Intrinsics.areEqual(this.rhsAccountNumber, key.rhsAccountNumber) && Intrinsics.areEqual(this.brokerageOrDtcNumber, key.brokerageOrDtcNumber) && Intrinsics.areEqual(this.contraAccountNumber, key.contraAccountNumber) && Intrinsics.areEqual(this.plaidAccessTokenId, key.plaidAccessTokenId) && this.isOptionsInvestingEnabled == key.isOptionsInvestingEnabled && this.isMarginInvestingEnabled == key.isMarginInvestingEnabled && Intrinsics.areEqual(this.screenContext, key.screenContext);
        }

        public int hashCode() {
            return (((((((((((this.rhsAccountNumber.hashCode() * 31) + this.brokerageOrDtcNumber.hashCode()) * 31) + this.contraAccountNumber.hashCode()) * 31) + this.plaidAccessTokenId.hashCode()) * 31) + Boolean.hashCode(this.isOptionsInvestingEnabled)) * 31) + Boolean.hashCode(this.isMarginInvestingEnabled)) * 31) + this.screenContext.hashCode();
        }

        public String toString() {
            return "Key(rhsAccountNumber=" + this.rhsAccountNumber + ", brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", contraAccountNumber=" + this.contraAccountNumber + ", plaidAccessTokenId=" + this.plaidAccessTokenId + ", isOptionsInvestingEnabled=" + this.isOptionsInvestingEnabled + ", isMarginInvestingEnabled=" + this.isMarginInvestingEnabled + ", screenContext=" + this.screenContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.rhsAccountNumber);
            EitherParceler.INSTANCE.write((Either<?, ?>) this.brokerageOrDtcNumber, dest, flags);
            dest.writeString(this.contraAccountNumber);
            dest.writeString(this.plaidAccessTokenId);
            dest.writeInt(this.isOptionsInvestingEnabled ? 1 : 0);
            dest.writeInt(this.isMarginInvestingEnabled ? 1 : 0);
            dest.writeParcelable(this.screenContext, flags);
        }

        public Key(String rhsAccountNumber, Either<ApiBrokerage, String> brokerageOrDtcNumber, String contraAccountNumber, String plaidAccessTokenId, boolean z, boolean z2, AcatsInScreenContext screenContext) {
            Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(contraAccountNumber, "contraAccountNumber");
            Intrinsics.checkNotNullParameter(plaidAccessTokenId, "plaidAccessTokenId");
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            this.rhsAccountNumber = rhsAccountNumber;
            this.brokerageOrDtcNumber = brokerageOrDtcNumber;
            this.contraAccountNumber = contraAccountNumber;
            this.plaidAccessTokenId = plaidAccessTokenId;
            this.isOptionsInvestingEnabled = z;
            this.isMarginInvestingEnabled = z2;
            this.screenContext = screenContext;
        }

        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
            return this.brokerageOrDtcNumber;
        }

        public final String getContraAccountNumber() {
            return this.contraAccountNumber;
        }

        public final String getPlaidAccessTokenId() {
            return this.plaidAccessTokenId;
        }

        public final boolean isOptionsInvestingEnabled() {
            return this.isOptionsInvestingEnabled;
        }

        public final boolean isMarginInvestingEnabled() {
            return this.isMarginInvestingEnabled;
        }

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }
    }
}
