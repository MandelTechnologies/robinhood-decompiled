package com.robinhood.android.acatsin.coowner.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInCoOwnerReviewContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewContract;", "", "<init>", "()V", "Key", "Callbacks", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInCoOwnerReviewContract {
    public static final int $stable = 0;
    public static final AcatsInCoOwnerReviewContract INSTANCE = new AcatsInCoOwnerReviewContract();

    /* compiled from: AcatsInCoOwnerReviewContract.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH&¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewContract$Callbacks;", "", "onReviewAssets", "", "acatsTransferId", "Ljava/util/UUID;", "onAcatReviewed", "rhsAccountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "dtccNumber", "onAcatRequestCanceled", "coOwnerName", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAcatRequestCanceled(String coOwnerName);

        void onAcatReviewed(String rhsAccountNumber, BrokerageAccountType brokerageAccountType, String dtccNumber);

        void onReviewAssets(UUID acatsTransferId);
    }

    private AcatsInCoOwnerReviewContract() {
    }

    /* compiled from: AcatsInCoOwnerReviewContract.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "acatsId", "Ljava/util/UUID;", "source", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getAcatsId", "()Ljava/util/UUID;", "getSource", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Key implements FragmentKey {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final UUID acatsId;
        private final String source;

        /* compiled from: AcatsInCoOwnerReviewContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key((UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = key.acatsId;
            }
            if ((i & 2) != 0) {
                str = key.source;
            }
            return key.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getAcatsId() {
            return this.acatsId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Key copy(UUID acatsId, String source) {
            Intrinsics.checkNotNullParameter(acatsId, "acatsId");
            return new Key(acatsId, source);
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
            return Intrinsics.areEqual(this.acatsId, key.acatsId) && Intrinsics.areEqual(this.source, key.source);
        }

        public int hashCode() {
            int iHashCode = this.acatsId.hashCode() * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Key(acatsId=" + this.acatsId + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.acatsId);
            dest.writeString(this.source);
        }

        public Key(UUID acatsId, String str) {
            Intrinsics.checkNotNullParameter(acatsId, "acatsId");
            this.acatsId = acatsId;
            this.source = str;
        }

        public final UUID getAcatsId() {
            return this.acatsId;
        }

        public final String getSource() {
            return this.source;
        }
    }
}
