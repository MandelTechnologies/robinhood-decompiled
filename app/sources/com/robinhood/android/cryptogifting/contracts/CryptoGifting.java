package com.robinhood.android.cryptogifting.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoGifting.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/cryptogifting/contracts/CryptoGifting;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "<init>", "()V", "CryptoGiftDetails", "Lcom/robinhood/android/cryptogifting/contracts/CryptoGifting$CryptoGiftDetails;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class CryptoGifting implements IntentKey, Parcelable {
    public /* synthetic */ CryptoGifting(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoGifting() {
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    /* compiled from: CryptoGifting.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/cryptogifting/contracts/CryptoGifting$CryptoGiftDetails;", "Lcom/robinhood/android/cryptogifting/contracts/CryptoGifting;", "giftId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getGiftId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CryptoGiftDetails extends CryptoGifting {
        public static final Parcelable.Creator<CryptoGiftDetails> CREATOR = new Creator();
        private final UUID giftId;

        /* compiled from: CryptoGifting.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CryptoGiftDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CryptoGiftDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoGiftDetails((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CryptoGiftDetails[] newArray(int i) {
                return new CryptoGiftDetails[i];
            }
        }

        public static /* synthetic */ CryptoGiftDetails copy$default(CryptoGiftDetails cryptoGiftDetails, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = cryptoGiftDetails.giftId;
            }
            return cryptoGiftDetails.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getGiftId() {
            return this.giftId;
        }

        public final CryptoGiftDetails copy(UUID giftId) {
            Intrinsics.checkNotNullParameter(giftId, "giftId");
            return new CryptoGiftDetails(giftId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CryptoGiftDetails) && Intrinsics.areEqual(this.giftId, ((CryptoGiftDetails) other).giftId);
        }

        public int hashCode() {
            return this.giftId.hashCode();
        }

        public String toString() {
            return "CryptoGiftDetails(giftId=" + this.giftId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.giftId);
        }

        public final UUID getGiftId() {
            return this.giftId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoGiftDetails(UUID giftId) {
            super(null);
            Intrinsics.checkNotNullParameter(giftId, "giftId");
            this.giftId = giftId;
        }
    }
}
