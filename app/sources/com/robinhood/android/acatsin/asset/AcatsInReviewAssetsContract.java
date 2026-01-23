package com.robinhood.android.acatsin.asset;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInReviewAssetsContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsContract;", "", "<init>", "()V", "Key", "Callbacks", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInReviewAssetsContract {
    public static final int $stable = 0;
    public static final AcatsInReviewAssetsContract INSTANCE = new AcatsInReviewAssetsContract();

    /* compiled from: AcatsInReviewAssetsContract.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J<\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsContract$Callbacks;", "", "onAcatsRetryAssetVerified", "", "assets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "onAcatsRetryEditClicked", "rhsAccountNumber", "", "accountNumber", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAcatsRetryAssetVerified(List<? extends UiAcatsAsset> assets);

        void onAcatsRetryEditClicked(List<? extends UiAcatsAsset> assets, String rhsAccountNumber, String accountNumber, BrokerageAccountType brokerageAccountType, AcatsInScreenContext screenContext);
    }

    private AcatsInReviewAssetsContract() {
    }

    /* compiled from: AcatsInReviewAssetsContract.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010 \u001a\u00020\u000eHÆ\u0003JQ\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "assets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "isAcatsRetry", "", "rhsAccountNumber", "", "accountNumber", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "<init>", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;)V", "getAssets", "()Ljava/util/List;", "()Z", "getRhsAccountNumber", "()Ljava/lang/String;", "getAccountNumber", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final String accountNumber;
        private final List<UiAcatsAsset> assets;
        private final BrokerageAccountType brokerageAccountType;
        private final boolean isAcatsRetry;
        private final String rhsAccountNumber;
        private final AcatsInScreenContext screenContext;

        /* compiled from: AcatsInReviewAssetsContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Key.class.getClassLoader()));
                }
                return new Key(arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BrokerageAccountType.valueOf(parcel.readString()), AcatsInScreenContext.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, List list, boolean z, String str, String str2, BrokerageAccountType brokerageAccountType, AcatsInScreenContext acatsInScreenContext, int i, Object obj) {
            if ((i & 1) != 0) {
                list = key.assets;
            }
            if ((i & 2) != 0) {
                z = key.isAcatsRetry;
            }
            if ((i & 4) != 0) {
                str = key.rhsAccountNumber;
            }
            if ((i & 8) != 0) {
                str2 = key.accountNumber;
            }
            if ((i & 16) != 0) {
                brokerageAccountType = key.brokerageAccountType;
            }
            if ((i & 32) != 0) {
                acatsInScreenContext = key.screenContext;
            }
            BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
            AcatsInScreenContext acatsInScreenContext2 = acatsInScreenContext;
            return key.copy(list, z, str, str2, brokerageAccountType2, acatsInScreenContext2);
        }

        public final List<UiAcatsAsset> component1() {
            return this.assets;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsAcatsRetry() {
            return this.isAcatsRetry;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component6, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Key copy(List<? extends UiAcatsAsset> assets, boolean isAcatsRetry, String rhsAccountNumber, String accountNumber, BrokerageAccountType brokerageAccountType, AcatsInScreenContext screenContext) {
            Intrinsics.checkNotNullParameter(assets, "assets");
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            return new Key(assets, isAcatsRetry, rhsAccountNumber, accountNumber, brokerageAccountType, screenContext);
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
            return Intrinsics.areEqual(this.assets, key.assets) && this.isAcatsRetry == key.isAcatsRetry && Intrinsics.areEqual(this.rhsAccountNumber, key.rhsAccountNumber) && Intrinsics.areEqual(this.accountNumber, key.accountNumber) && this.brokerageAccountType == key.brokerageAccountType && Intrinsics.areEqual(this.screenContext, key.screenContext);
        }

        public int hashCode() {
            int iHashCode = ((this.assets.hashCode() * 31) + Boolean.hashCode(this.isAcatsRetry)) * 31;
            String str = this.rhsAccountNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.accountNumber;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
            return ((iHashCode3 + (brokerageAccountType != null ? brokerageAccountType.hashCode() : 0)) * 31) + this.screenContext.hashCode();
        }

        public String toString() {
            return "Key(assets=" + this.assets + ", isAcatsRetry=" + this.isAcatsRetry + ", rhsAccountNumber=" + this.rhsAccountNumber + ", accountNumber=" + this.accountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ", screenContext=" + this.screenContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<UiAcatsAsset> list = this.assets;
            dest.writeInt(list.size());
            Iterator<UiAcatsAsset> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeInt(this.isAcatsRetry ? 1 : 0);
            dest.writeString(this.rhsAccountNumber);
            dest.writeString(this.accountNumber);
            BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
            if (brokerageAccountType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(brokerageAccountType.name());
            }
            this.screenContext.writeToParcel(dest, flags);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Key(List<? extends UiAcatsAsset> assets, boolean z, String str, String str2, BrokerageAccountType brokerageAccountType, AcatsInScreenContext screenContext) {
            Intrinsics.checkNotNullParameter(assets, "assets");
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            this.assets = assets;
            this.isAcatsRetry = z;
            this.rhsAccountNumber = str;
            this.accountNumber = str2;
            this.brokerageAccountType = brokerageAccountType;
            this.screenContext = screenContext;
        }

        public final List<UiAcatsAsset> getAssets() {
            return this.assets;
        }

        public final boolean isAcatsRetry() {
            return this.isAcatsRetry;
        }

        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public /* synthetic */ Key(List list, boolean z, String str, String str2, BrokerageAccountType brokerageAccountType, AcatsInScreenContext acatsInScreenContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? brokerageAccountType : null, (i & 32) != 0 ? new AcatsInScreenContext(null, true, false, null, null, null, false, null, false, 505, null) : acatsInScreenContext);
        }

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }
    }
}
