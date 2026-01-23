package com.robinhood.android.crypto.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.models.p320db.OrderSide;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuickTradeDialogBottomSheetFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/crypto/contracts/CryptoQuickTradeDialogBottomSheetFragmentKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/OrderSide;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoQuickTradeDialogBottomSheetFragmentKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<CryptoQuickTradeDialogBottomSheetFragmentKey> CREATOR = new Creator();
    private final UUID currencyPairId;
    private final OrderSide orderSide;

    /* compiled from: CryptoQuickTradeDialogBottomSheetFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CryptoQuickTradeDialogBottomSheetFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoQuickTradeDialogBottomSheetFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoQuickTradeDialogBottomSheetFragmentKey((UUID) parcel.readSerializable(), OrderSide.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoQuickTradeDialogBottomSheetFragmentKey[] newArray(int i) {
            return new CryptoQuickTradeDialogBottomSheetFragmentKey[i];
        }
    }

    public static /* synthetic */ CryptoQuickTradeDialogBottomSheetFragmentKey copy$default(CryptoQuickTradeDialogBottomSheetFragmentKey cryptoQuickTradeDialogBottomSheetFragmentKey, UUID uuid, OrderSide orderSide, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoQuickTradeDialogBottomSheetFragmentKey.currencyPairId;
        }
        if ((i & 2) != 0) {
            orderSide = cryptoQuickTradeDialogBottomSheetFragmentKey.orderSide;
        }
        return cryptoQuickTradeDialogBottomSheetFragmentKey.copy(uuid, orderSide);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderSide getOrderSide() {
        return this.orderSide;
    }

    public final CryptoQuickTradeDialogBottomSheetFragmentKey copy(UUID currencyPairId, OrderSide orderSide) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        return new CryptoQuickTradeDialogBottomSheetFragmentKey(currencyPairId, orderSide);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoQuickTradeDialogBottomSheetFragmentKey)) {
            return false;
        }
        CryptoQuickTradeDialogBottomSheetFragmentKey cryptoQuickTradeDialogBottomSheetFragmentKey = (CryptoQuickTradeDialogBottomSheetFragmentKey) other;
        return Intrinsics.areEqual(this.currencyPairId, cryptoQuickTradeDialogBottomSheetFragmentKey.currencyPairId) && this.orderSide == cryptoQuickTradeDialogBottomSheetFragmentKey.orderSide;
    }

    public int hashCode() {
        return (this.currencyPairId.hashCode() * 31) + this.orderSide.hashCode();
    }

    public String toString() {
        return "CryptoQuickTradeDialogBottomSheetFragmentKey(currencyPairId=" + this.currencyPairId + ", orderSide=" + this.orderSide + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.currencyPairId);
        dest.writeString(this.orderSide.name());
    }

    public CryptoQuickTradeDialogBottomSheetFragmentKey(UUID currencyPairId, OrderSide orderSide) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        this.currencyPairId = currencyPairId;
        this.orderSide = orderSide;
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final OrderSide getOrderSide() {
        return this.orderSide;
    }
}
