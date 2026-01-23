package com.robinhood.shared.trade.crypto.p397ui.fee.event;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeUiEventProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventType;", "", "<init>", "()V", "ShowFeeTierUpsellBottomSheet", "ShowFeeUnsupportedForCurrencyPairBanner", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventType$ShowFeeTierUpsellBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventType$ShowFeeUnsupportedForCurrencyPairBanner;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.fee.event.CryptoFeeUiEventType, reason: use source file name */
/* loaded from: classes12.dex */
abstract class CryptoFeeUiEventProvider2 {
    public /* synthetic */ CryptoFeeUiEventProvider2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CryptoFeeUiEventProvider.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventType$ShowFeeTierUpsellBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.fee.event.CryptoFeeUiEventType$ShowFeeTierUpsellBottomSheet */
    public static final /* data */ class ShowFeeTierUpsellBottomSheet extends CryptoFeeUiEventProvider2 {
        public static final int $stable = 0;
        public static final ShowFeeTierUpsellBottomSheet INSTANCE = new ShowFeeTierUpsellBottomSheet();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowFeeTierUpsellBottomSheet);
        }

        public int hashCode() {
            return -713228952;
        }

        public String toString() {
            return "ShowFeeTierUpsellBottomSheet";
        }

        private ShowFeeTierUpsellBottomSheet() {
            super(null);
        }
    }

    private CryptoFeeUiEventProvider2() {
    }

    /* compiled from: CryptoFeeUiEventProvider.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventType$ShowFeeUnsupportedForCurrencyPairBanner;", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventType;", "assetCurrencyCode", "", "isRebateMarketMakersSupported", "", "<init>", "(Ljava/lang/String;Z)V", "getAssetCurrencyCode", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.fee.event.CryptoFeeUiEventType$ShowFeeUnsupportedForCurrencyPairBanner, reason: from toString */
    public static final /* data */ class ShowFeeUnsupportedForCurrencyPairBanner extends CryptoFeeUiEventProvider2 {
        public static final int $stable = 0;
        private final String assetCurrencyCode;
        private final boolean isRebateMarketMakersSupported;

        public static /* synthetic */ ShowFeeUnsupportedForCurrencyPairBanner copy$default(ShowFeeUnsupportedForCurrencyPairBanner showFeeUnsupportedForCurrencyPairBanner, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showFeeUnsupportedForCurrencyPairBanner.assetCurrencyCode;
            }
            if ((i & 2) != 0) {
                z = showFeeUnsupportedForCurrencyPairBanner.isRebateMarketMakersSupported;
            }
            return showFeeUnsupportedForCurrencyPairBanner.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAssetCurrencyCode() {
            return this.assetCurrencyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRebateMarketMakersSupported() {
            return this.isRebateMarketMakersSupported;
        }

        public final ShowFeeUnsupportedForCurrencyPairBanner copy(String assetCurrencyCode, boolean isRebateMarketMakersSupported) {
            Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
            return new ShowFeeUnsupportedForCurrencyPairBanner(assetCurrencyCode, isRebateMarketMakersSupported);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowFeeUnsupportedForCurrencyPairBanner)) {
                return false;
            }
            ShowFeeUnsupportedForCurrencyPairBanner showFeeUnsupportedForCurrencyPairBanner = (ShowFeeUnsupportedForCurrencyPairBanner) other;
            return Intrinsics.areEqual(this.assetCurrencyCode, showFeeUnsupportedForCurrencyPairBanner.assetCurrencyCode) && this.isRebateMarketMakersSupported == showFeeUnsupportedForCurrencyPairBanner.isRebateMarketMakersSupported;
        }

        public int hashCode() {
            return (this.assetCurrencyCode.hashCode() * 31) + Boolean.hashCode(this.isRebateMarketMakersSupported);
        }

        public String toString() {
            return "ShowFeeUnsupportedForCurrencyPairBanner(assetCurrencyCode=" + this.assetCurrencyCode + ", isRebateMarketMakersSupported=" + this.isRebateMarketMakersSupported + ")";
        }

        public final String getAssetCurrencyCode() {
            return this.assetCurrencyCode;
        }

        public final boolean isRebateMarketMakersSupported() {
            return this.isRebateMarketMakersSupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowFeeUnsupportedForCurrencyPairBanner(String assetCurrencyCode, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
            this.assetCurrencyCode = assetCurrencyCode;
            this.isRebateMarketMakersSupported = z;
        }
    }
}
