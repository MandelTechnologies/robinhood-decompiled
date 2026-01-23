package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrueLayerRedirect.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TrueLayerRedirect;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "paymentId", "", "resourceToken", "isQueuedDeposit", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getPaymentId", "()Ljava/lang/String;", "getResourceToken", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class TrueLayerRedirect implements IntentKey, Parcelable {
    public static final Parcelable.Creator<TrueLayerRedirect> CREATOR = new Creator();
    private final boolean isQueuedDeposit;
    private final String paymentId;
    private final String resourceToken;

    /* compiled from: TrueLayerRedirect.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<TrueLayerRedirect> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrueLayerRedirect createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TrueLayerRedirect(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrueLayerRedirect[] newArray(int i) {
            return new TrueLayerRedirect[i];
        }
    }

    public static /* synthetic */ TrueLayerRedirect copy$default(TrueLayerRedirect trueLayerRedirect, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trueLayerRedirect.paymentId;
        }
        if ((i & 2) != 0) {
            str2 = trueLayerRedirect.resourceToken;
        }
        if ((i & 4) != 0) {
            z = trueLayerRedirect.isQueuedDeposit;
        }
        return trueLayerRedirect.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getResourceToken() {
        return this.resourceToken;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsQueuedDeposit() {
        return this.isQueuedDeposit;
    }

    public final TrueLayerRedirect copy(String paymentId, String resourceToken, boolean isQueuedDeposit) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(resourceToken, "resourceToken");
        return new TrueLayerRedirect(paymentId, resourceToken, isQueuedDeposit);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrueLayerRedirect)) {
            return false;
        }
        TrueLayerRedirect trueLayerRedirect = (TrueLayerRedirect) other;
        return Intrinsics.areEqual(this.paymentId, trueLayerRedirect.paymentId) && Intrinsics.areEqual(this.resourceToken, trueLayerRedirect.resourceToken) && this.isQueuedDeposit == trueLayerRedirect.isQueuedDeposit;
    }

    public int hashCode() {
        return (((this.paymentId.hashCode() * 31) + this.resourceToken.hashCode()) * 31) + Boolean.hashCode(this.isQueuedDeposit);
    }

    public String toString() {
        return "TrueLayerRedirect(paymentId=" + this.paymentId + ", resourceToken=" + this.resourceToken + ", isQueuedDeposit=" + this.isQueuedDeposit + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.paymentId);
        dest.writeString(this.resourceToken);
        dest.writeInt(this.isQueuedDeposit ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public TrueLayerRedirect(String paymentId, String resourceToken, boolean z) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(resourceToken, "resourceToken");
        this.paymentId = paymentId;
        this.resourceToken = resourceToken;
        this.isQueuedDeposit = z;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final String getResourceToken() {
        return this.resourceToken;
    }

    public final boolean isQueuedDeposit() {
        return this.isQueuedDeposit;
    }
}
