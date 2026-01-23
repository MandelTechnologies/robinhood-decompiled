package com.robinhood.shared.trade.crypto.p397ui.orderDetail.taxLots;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.crypto.p314db.Currency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderDetailTaxLotsFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "orderUuid", "Ljava/util/UUID;", "assetCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "quoteCurrencyForPrice", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/crypto/db/Currency;Lcom/robinhood/models/crypto/db/Currency;)V", "getOrderUuid", "()Ljava/util/UUID;", "getAssetCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "getQuoteCurrencyForPrice", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderDetailTaxLotsFragmentKey implements FragmentKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CryptoOrderDetailTaxLotsFragmentKey> CREATOR = new Creator();
    private final Currency assetCurrency;
    private final UUID orderUuid;
    private final Currency quoteCurrencyForPrice;

    /* compiled from: CryptoOrderDetailTaxLotsFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CryptoOrderDetailTaxLotsFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoOrderDetailTaxLotsFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoOrderDetailTaxLotsFragmentKey((UUID) parcel.readSerializable(), (Currency) parcel.readParcelable(CryptoOrderDetailTaxLotsFragmentKey.class.getClassLoader()), (Currency) parcel.readParcelable(CryptoOrderDetailTaxLotsFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoOrderDetailTaxLotsFragmentKey[] newArray(int i) {
            return new CryptoOrderDetailTaxLotsFragmentKey[i];
        }
    }

    public static /* synthetic */ CryptoOrderDetailTaxLotsFragmentKey copy$default(CryptoOrderDetailTaxLotsFragmentKey cryptoOrderDetailTaxLotsFragmentKey, UUID uuid, Currency currency, Currency currency2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoOrderDetailTaxLotsFragmentKey.orderUuid;
        }
        if ((i & 2) != 0) {
            currency = cryptoOrderDetailTaxLotsFragmentKey.assetCurrency;
        }
        if ((i & 4) != 0) {
            currency2 = cryptoOrderDetailTaxLotsFragmentKey.quoteCurrencyForPrice;
        }
        return cryptoOrderDetailTaxLotsFragmentKey.copy(uuid, currency, currency2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOrderUuid() {
        return this.orderUuid;
    }

    /* renamed from: component2, reason: from getter */
    public final Currency getAssetCurrency() {
        return this.assetCurrency;
    }

    /* renamed from: component3, reason: from getter */
    public final Currency getQuoteCurrencyForPrice() {
        return this.quoteCurrencyForPrice;
    }

    public final CryptoOrderDetailTaxLotsFragmentKey copy(UUID orderUuid, Currency assetCurrency, Currency quoteCurrencyForPrice) {
        Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
        Intrinsics.checkNotNullParameter(assetCurrency, "assetCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrencyForPrice, "quoteCurrencyForPrice");
        return new CryptoOrderDetailTaxLotsFragmentKey(orderUuid, assetCurrency, quoteCurrencyForPrice);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderDetailTaxLotsFragmentKey)) {
            return false;
        }
        CryptoOrderDetailTaxLotsFragmentKey cryptoOrderDetailTaxLotsFragmentKey = (CryptoOrderDetailTaxLotsFragmentKey) other;
        return Intrinsics.areEqual(this.orderUuid, cryptoOrderDetailTaxLotsFragmentKey.orderUuid) && Intrinsics.areEqual(this.assetCurrency, cryptoOrderDetailTaxLotsFragmentKey.assetCurrency) && Intrinsics.areEqual(this.quoteCurrencyForPrice, cryptoOrderDetailTaxLotsFragmentKey.quoteCurrencyForPrice);
    }

    public int hashCode() {
        return (((this.orderUuid.hashCode() * 31) + this.assetCurrency.hashCode()) * 31) + this.quoteCurrencyForPrice.hashCode();
    }

    public String toString() {
        return "CryptoOrderDetailTaxLotsFragmentKey(orderUuid=" + this.orderUuid + ", assetCurrency=" + this.assetCurrency + ", quoteCurrencyForPrice=" + this.quoteCurrencyForPrice + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.orderUuid);
        dest.writeParcelable(this.assetCurrency, flags);
        dest.writeParcelable(this.quoteCurrencyForPrice, flags);
    }

    public CryptoOrderDetailTaxLotsFragmentKey(UUID orderUuid, Currency assetCurrency, Currency quoteCurrencyForPrice) {
        Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
        Intrinsics.checkNotNullParameter(assetCurrency, "assetCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrencyForPrice, "quoteCurrencyForPrice");
        this.orderUuid = orderUuid;
        this.assetCurrency = assetCurrency;
        this.quoteCurrencyForPrice = quoteCurrencyForPrice;
    }

    public final UUID getOrderUuid() {
        return this.orderUuid;
    }

    public final Currency getAssetCurrency() {
        return this.assetCurrency;
    }

    public final Currency getQuoteCurrencyForPrice() {
        return this.quoteCurrencyForPrice;
    }
}
