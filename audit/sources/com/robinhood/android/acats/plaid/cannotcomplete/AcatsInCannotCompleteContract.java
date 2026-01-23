package com.robinhood.android.acats.plaid.cannotcomplete;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.parceler.EitherParceler;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInCannotCompleteContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/cannotcomplete/AcatsInCannotCompleteContract;", "", "<init>", "()V", "Key", "Callbacks", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInCannotCompleteContract {
    public static final int $stable = 0;
    public static final AcatsInCannotCompleteContract INSTANCE = new AcatsInCannotCompleteContract();

    /* compiled from: AcatsInCannotCompleteContract.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/cannotcomplete/AcatsInCannotCompleteContract$Callbacks;", "", "onComplete", "", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onComplete();
    }

    private AcatsInCannotCompleteContract() {
    }

    /* compiled from: AcatsInCannotCompleteContract.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/cannotcomplete/AcatsInCannotCompleteContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "rhsAccountNumber", "", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "brokerageName", "contraAccountNumber", "plaidAccessTokenId", "<init>", "(Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;Ljava/lang/String;Lcom/robinhood/utils/Either;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getRhsAccountNumber", "()Ljava/lang/String;", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getBrokerageName", "getContraAccountNumber", "getPlaidAccessTokenId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final String brokerageName;
        private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
        private final String contraAccountNumber;
        private final String plaidAccessTokenId;
        private final String rhsAccountNumber;
        private final AcatsInScreenContext screenContext;

        /* compiled from: AcatsInCannotCompleteContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key((AcatsInScreenContext) parcel.readParcelable(Key.class.getClassLoader()), parcel.readString(), EitherParceler.INSTANCE.m23663create(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, AcatsInScreenContext acatsInScreenContext, String str, Either either, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsInScreenContext = key.screenContext;
            }
            if ((i & 2) != 0) {
                str = key.rhsAccountNumber;
            }
            if ((i & 4) != 0) {
                either = key.brokerageOrDtcNumber;
            }
            if ((i & 8) != 0) {
                str2 = key.brokerageName;
            }
            if ((i & 16) != 0) {
                str3 = key.contraAccountNumber;
            }
            if ((i & 32) != 0) {
                str4 = key.plaidAccessTokenId;
            }
            String str5 = str3;
            String str6 = str4;
            return key.copy(acatsInScreenContext, str, either, str2, str5, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public final Either<ApiBrokerage, String> component3() {
            return this.brokerageOrDtcNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBrokerageName() {
            return this.brokerageName;
        }

        /* renamed from: component5, reason: from getter */
        public final String getContraAccountNumber() {
            return this.contraAccountNumber;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPlaidAccessTokenId() {
            return this.plaidAccessTokenId;
        }

        public final Key copy(AcatsInScreenContext screenContext, String rhsAccountNumber, Either<ApiBrokerage, String> brokerageOrDtcNumber, String brokerageName, String contraAccountNumber, String plaidAccessTokenId) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(brokerageName, "brokerageName");
            Intrinsics.checkNotNullParameter(contraAccountNumber, "contraAccountNumber");
            Intrinsics.checkNotNullParameter(plaidAccessTokenId, "plaidAccessTokenId");
            return new Key(screenContext, rhsAccountNumber, brokerageOrDtcNumber, brokerageName, contraAccountNumber, plaidAccessTokenId);
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
            return Intrinsics.areEqual(this.screenContext, key.screenContext) && Intrinsics.areEqual(this.rhsAccountNumber, key.rhsAccountNumber) && Intrinsics.areEqual(this.brokerageOrDtcNumber, key.brokerageOrDtcNumber) && Intrinsics.areEqual(this.brokerageName, key.brokerageName) && Intrinsics.areEqual(this.contraAccountNumber, key.contraAccountNumber) && Intrinsics.areEqual(this.plaidAccessTokenId, key.plaidAccessTokenId);
        }

        public int hashCode() {
            return (((((((((this.screenContext.hashCode() * 31) + this.rhsAccountNumber.hashCode()) * 31) + this.brokerageOrDtcNumber.hashCode()) * 31) + this.brokerageName.hashCode()) * 31) + this.contraAccountNumber.hashCode()) * 31) + this.plaidAccessTokenId.hashCode();
        }

        public String toString() {
            return "Key(screenContext=" + this.screenContext + ", rhsAccountNumber=" + this.rhsAccountNumber + ", brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", brokerageName=" + this.brokerageName + ", contraAccountNumber=" + this.contraAccountNumber + ", plaidAccessTokenId=" + this.plaidAccessTokenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.screenContext, flags);
            dest.writeString(this.rhsAccountNumber);
            EitherParceler.INSTANCE.write((Either<?, ?>) this.brokerageOrDtcNumber, dest, flags);
            dest.writeString(this.brokerageName);
            dest.writeString(this.contraAccountNumber);
            dest.writeString(this.plaidAccessTokenId);
        }

        public Key(AcatsInScreenContext screenContext, String rhsAccountNumber, Either<ApiBrokerage, String> brokerageOrDtcNumber, String brokerageName, String contraAccountNumber, String plaidAccessTokenId) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(brokerageName, "brokerageName");
            Intrinsics.checkNotNullParameter(contraAccountNumber, "contraAccountNumber");
            Intrinsics.checkNotNullParameter(plaidAccessTokenId, "plaidAccessTokenId");
            this.screenContext = screenContext;
            this.rhsAccountNumber = rhsAccountNumber;
            this.brokerageOrDtcNumber = brokerageOrDtcNumber;
            this.brokerageName = brokerageName;
            this.contraAccountNumber = contraAccountNumber;
            this.plaidAccessTokenId = plaidAccessTokenId;
        }

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
            return this.brokerageOrDtcNumber;
        }

        public final String getBrokerageName() {
            return this.brokerageName;
        }

        public final String getContraAccountNumber() {
            return this.contraAccountNumber;
        }

        public final String getPlaidAccessTokenId() {
            return this.plaidAccessTokenId;
        }
    }
}
