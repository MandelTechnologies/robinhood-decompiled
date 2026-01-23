package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCheckoutPaymentMethodSelectionKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/CryptoCheckoutPaymentMethodSelectionKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CryptoCheckoutPaymentMethodSelectionKey implements FragmentKey, Parcelable {
    public static final String REQUEST_KEY = "paymentMethodSelectionRequest";
    public static final String RESULT_KEY = "selectedPaymentMethod";
    private final UUID currencyPairId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CryptoCheckoutPaymentMethodSelectionKey> CREATOR = new Creator();

    /* compiled from: CryptoCheckoutPaymentMethodSelectionKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CryptoCheckoutPaymentMethodSelectionKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoCheckoutPaymentMethodSelectionKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoCheckoutPaymentMethodSelectionKey((UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoCheckoutPaymentMethodSelectionKey[] newArray(int i) {
            return new CryptoCheckoutPaymentMethodSelectionKey[i];
        }
    }

    public static /* synthetic */ CryptoCheckoutPaymentMethodSelectionKey copy$default(CryptoCheckoutPaymentMethodSelectionKey cryptoCheckoutPaymentMethodSelectionKey, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoCheckoutPaymentMethodSelectionKey.currencyPairId;
        }
        return cryptoCheckoutPaymentMethodSelectionKey.copy(uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final CryptoCheckoutPaymentMethodSelectionKey copy(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return new CryptoCheckoutPaymentMethodSelectionKey(currencyPairId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoCheckoutPaymentMethodSelectionKey) && Intrinsics.areEqual(this.currencyPairId, ((CryptoCheckoutPaymentMethodSelectionKey) other).currencyPairId);
    }

    public int hashCode() {
        return this.currencyPairId.hashCode();
    }

    public String toString() {
        return "CryptoCheckoutPaymentMethodSelectionKey(currencyPairId=" + this.currencyPairId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.currencyPairId);
    }

    public CryptoCheckoutPaymentMethodSelectionKey(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        this.currencyPairId = currencyPairId;
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* compiled from: CryptoCheckoutPaymentMethodSelectionKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/CryptoCheckoutPaymentMethodSelectionKey$Companion;", "", "<init>", "()V", "REQUEST_KEY", "", "getREQUEST_KEY$annotations", "RESULT_KEY", "getRESULT_KEY$annotations", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getREQUEST_KEY$annotations() {
        }

        public static /* synthetic */ void getRESULT_KEY$annotations() {
        }

        private Companion() {
        }
    }
}
