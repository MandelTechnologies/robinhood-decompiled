package com.robinhood.android.productupsell.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductUpsellKey.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "contentfulIdentifier", "", "contentfulEntryId", "storageKey", "experimentKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentfulIdentifier", "()Ljava/lang/String;", "getContentfulEntryId", "getStorageKey", "getExperimentKey", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ProductUpsellKey implements IntentKey, Parcelable {
    private final String contentfulEntryId;
    private final String contentfulIdentifier;
    private final String experimentKey;
    private final String storageKey;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ProductUpsellKey> CREATOR = new Creator();
    private static final ProductUpsellKey UpsellNotificationPostEquityTrade = new ProductUpsellKey("notifications-post-equity-trade", "7vo7yaO5DHAGjs8hkcbhpc", "notifications-upsell", "engagement-post-trade-notification-upsell");
    private static final ProductUpsellKey UpsellNotificationPostCryptoTrade = new ProductUpsellKey("notifications-post-crypto-trade", "5yb5iK2wD1N9e5TZMucv7u", "notifications-upsell", "engagement-post-trade-notification-upsell");

    /* compiled from: ProductUpsellKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<ProductUpsellKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductUpsellKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductUpsellKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductUpsellKey[] newArray(int i) {
            return new ProductUpsellKey[i];
        }
    }

    public static /* synthetic */ ProductUpsellKey copy$default(ProductUpsellKey productUpsellKey, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productUpsellKey.contentfulIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = productUpsellKey.contentfulEntryId;
        }
        if ((i & 4) != 0) {
            str3 = productUpsellKey.storageKey;
        }
        if ((i & 8) != 0) {
            str4 = productUpsellKey.experimentKey;
        }
        return productUpsellKey.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContentfulIdentifier() {
        return this.contentfulIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContentfulEntryId() {
        return this.contentfulEntryId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStorageKey() {
        return this.storageKey;
    }

    /* renamed from: component4, reason: from getter */
    public final String getExperimentKey() {
        return this.experimentKey;
    }

    public final ProductUpsellKey copy(String contentfulIdentifier, String contentfulEntryId, String storageKey, String experimentKey) {
        Intrinsics.checkNotNullParameter(contentfulIdentifier, "contentfulIdentifier");
        Intrinsics.checkNotNullParameter(contentfulEntryId, "contentfulEntryId");
        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
        return new ProductUpsellKey(contentfulIdentifier, contentfulEntryId, storageKey, experimentKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductUpsellKey)) {
            return false;
        }
        ProductUpsellKey productUpsellKey = (ProductUpsellKey) other;
        return Intrinsics.areEqual(this.contentfulIdentifier, productUpsellKey.contentfulIdentifier) && Intrinsics.areEqual(this.contentfulEntryId, productUpsellKey.contentfulEntryId) && Intrinsics.areEqual(this.storageKey, productUpsellKey.storageKey) && Intrinsics.areEqual(this.experimentKey, productUpsellKey.experimentKey);
    }

    public int hashCode() {
        int iHashCode = ((((this.contentfulIdentifier.hashCode() * 31) + this.contentfulEntryId.hashCode()) * 31) + this.storageKey.hashCode()) * 31;
        String str = this.experimentKey;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ProductUpsellKey(contentfulIdentifier=" + this.contentfulIdentifier + ", contentfulEntryId=" + this.contentfulEntryId + ", storageKey=" + this.storageKey + ", experimentKey=" + this.experimentKey + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.contentfulIdentifier);
        dest.writeString(this.contentfulEntryId);
        dest.writeString(this.storageKey);
        dest.writeString(this.experimentKey);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public ProductUpsellKey(String contentfulIdentifier, String contentfulEntryId, String storageKey, String str) {
        Intrinsics.checkNotNullParameter(contentfulIdentifier, "contentfulIdentifier");
        Intrinsics.checkNotNullParameter(contentfulEntryId, "contentfulEntryId");
        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
        this.contentfulIdentifier = contentfulIdentifier;
        this.contentfulEntryId = contentfulEntryId;
        this.storageKey = storageKey;
        this.experimentKey = str;
    }

    public /* synthetic */ ProductUpsellKey(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }

    public final String getContentfulIdentifier() {
        return this.contentfulIdentifier;
    }

    public final String getContentfulEntryId() {
        return this.contentfulEntryId;
    }

    public final String getStorageKey() {
        return this.storageKey;
    }

    public final String getExperimentKey() {
        return this.experimentKey;
    }

    /* compiled from: ProductUpsellKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey$Companion;", "", "<init>", "()V", "UpsellNotificationPostEquityTrade", "Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;", "getUpsellNotificationPostEquityTrade", "()Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;", "UpsellNotificationPostCryptoTrade", "getUpsellNotificationPostCryptoTrade", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ProductUpsellKey getUpsellNotificationPostEquityTrade() {
            return ProductUpsellKey.UpsellNotificationPostEquityTrade;
        }

        public final ProductUpsellKey getUpsellNotificationPostCryptoTrade() {
            return ProductUpsellKey.UpsellNotificationPostCryptoTrade;
        }
    }
}
