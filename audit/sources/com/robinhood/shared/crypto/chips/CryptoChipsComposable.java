package com.robinhood.shared.crypto.chips;

import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoChipsComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/chips/CryptoChip;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/shared/crypto/chips/CryptoChip$Loaded;", "Lcom/robinhood/shared/crypto/chips/CryptoChip$Loading;", "lib-crypto-chips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.chips.CryptoChip, reason: use source file name */
/* loaded from: classes6.dex */
public abstract class CryptoChipsComposable {
    public static final int $stable = 0;

    public /* synthetic */ CryptoChipsComposable(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoChipsComposable() {
    }

    /* compiled from: CryptoChipsComposable.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/crypto/chips/CryptoChip$Loading;", "Lcom/robinhood/shared/crypto/chips/CryptoChip;", "<init>", "()V", "placeholder", "Lcom/robinhood/shared/crypto/chips/CryptoChip$Loaded;", "getPlaceholder$lib_crypto_chips_externalDebug", "()Lcom/robinhood/shared/crypto/chips/CryptoChip$Loaded;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-chips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.chips.CryptoChip$Loading */
    public static final /* data */ class Loading extends CryptoChipsComposable {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();
        private static final Loaded placeholder = new Loaded(null, "----", OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, null, "----------", true);

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1198543259;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }

        public final Loaded getPlaceholder$lib_crypto_chips_externalDebug() {
            return placeholder;
        }
    }

    /* compiled from: CryptoChipsComposable.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/crypto/chips/CryptoChip$Loaded;", "Lcom/robinhood/shared/crypto/chips/CryptoChip;", "logoUrl", "", "primaryText", "percentChange", "deeplink", "secondaryText", "isPlaceholder", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getLogoUrl", "()Ljava/lang/String;", "getPrimaryText", "getPercentChange", "getDeeplink", "getSecondaryText", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-crypto-chips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.chips.CryptoChip$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends CryptoChipsComposable {
        public static final int $stable = 0;
        private final String deeplink;
        private final boolean isPlaceholder;
        private final String logoUrl;
        private final String percentChange;
        private final String primaryText;
        private final String secondaryText;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.logoUrl;
            }
            if ((i & 2) != 0) {
                str2 = loaded.primaryText;
            }
            if ((i & 4) != 0) {
                str3 = loaded.percentChange;
            }
            if ((i & 8) != 0) {
                str4 = loaded.deeplink;
            }
            if ((i & 16) != 0) {
                str5 = loaded.secondaryText;
            }
            if ((i & 32) != 0) {
                z = loaded.isPlaceholder;
            }
            String str6 = str5;
            boolean z2 = z;
            return loaded.copy(str, str2, str3, str4, str6, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLogoUrl() {
            return this.logoUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPercentChange() {
            return this.percentChange;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSecondaryText() {
            return this.secondaryText;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsPlaceholder() {
            return this.isPlaceholder;
        }

        public final Loaded copy(String logoUrl, String primaryText, String percentChange, String deeplink, String secondaryText, boolean isPlaceholder) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(percentChange, "percentChange");
            return new Loaded(logoUrl, primaryText, percentChange, deeplink, secondaryText, isPlaceholder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.logoUrl, loaded.logoUrl) && Intrinsics.areEqual(this.primaryText, loaded.primaryText) && Intrinsics.areEqual(this.percentChange, loaded.percentChange) && Intrinsics.areEqual(this.deeplink, loaded.deeplink) && Intrinsics.areEqual(this.secondaryText, loaded.secondaryText) && this.isPlaceholder == loaded.isPlaceholder;
        }

        public int hashCode() {
            String str = this.logoUrl;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.primaryText.hashCode()) * 31) + this.percentChange.hashCode()) * 31;
            String str2 = this.deeplink;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.secondaryText;
            return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPlaceholder);
        }

        public String toString() {
            return "Loaded(logoUrl=" + this.logoUrl + ", primaryText=" + this.primaryText + ", percentChange=" + this.percentChange + ", deeplink=" + this.deeplink + ", secondaryText=" + this.secondaryText + ", isPlaceholder=" + this.isPlaceholder + ")";
        }

        public /* synthetic */ Loaded(String str, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? false : z);
        }

        public final String getLogoUrl() {
            return this.logoUrl;
        }

        public final String getPrimaryText() {
            return this.primaryText;
        }

        public final String getPercentChange() {
            return this.percentChange;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getSecondaryText() {
            return this.secondaryText;
        }

        public final boolean isPlaceholder() {
            return this.isPlaceholder;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(String str, String primaryText, String percentChange, String str2, String str3, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(percentChange, "percentChange");
            this.logoUrl = str;
            this.primaryText = primaryText;
            this.percentChange = percentChange;
            this.deeplink = str2;
            this.secondaryText = str3;
            this.isPlaceholder = z;
        }
    }
}
