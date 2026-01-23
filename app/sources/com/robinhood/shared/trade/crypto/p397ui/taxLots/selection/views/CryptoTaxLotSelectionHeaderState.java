package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTaxLotSelectionHeader.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState;", "", "assetCurrencyCode", "", "priceInfo", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo;", "<init>", "(Ljava/lang/String;Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo;)V", "getAssetCurrencyCode", "()Ljava/lang/String;", "getPriceInfo", "()Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PriceInfo", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoTaxLotSelectionHeaderState {
    public static final int $stable = 0;
    private final String assetCurrencyCode;
    private final PriceInfo priceInfo;

    public static /* synthetic */ CryptoTaxLotSelectionHeaderState copy$default(CryptoTaxLotSelectionHeaderState cryptoTaxLotSelectionHeaderState, String str, PriceInfo priceInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoTaxLotSelectionHeaderState.assetCurrencyCode;
        }
        if ((i & 2) != 0) {
            priceInfo = cryptoTaxLotSelectionHeaderState.priceInfo;
        }
        return cryptoTaxLotSelectionHeaderState.copy(str, priceInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAssetCurrencyCode() {
        return this.assetCurrencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public final CryptoTaxLotSelectionHeaderState copy(String assetCurrencyCode, PriceInfo priceInfo) {
        return new CryptoTaxLotSelectionHeaderState(assetCurrencyCode, priceInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTaxLotSelectionHeaderState)) {
            return false;
        }
        CryptoTaxLotSelectionHeaderState cryptoTaxLotSelectionHeaderState = (CryptoTaxLotSelectionHeaderState) other;
        return Intrinsics.areEqual(this.assetCurrencyCode, cryptoTaxLotSelectionHeaderState.assetCurrencyCode) && Intrinsics.areEqual(this.priceInfo, cryptoTaxLotSelectionHeaderState.priceInfo);
    }

    public int hashCode() {
        String str = this.assetCurrencyCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PriceInfo priceInfo = this.priceInfo;
        return iHashCode + (priceInfo != null ? priceInfo.hashCode() : 0);
    }

    public String toString() {
        return "CryptoTaxLotSelectionHeaderState(assetCurrencyCode=" + this.assetCurrencyCode + ", priceInfo=" + this.priceInfo + ")";
    }

    public CryptoTaxLotSelectionHeaderState(String str, PriceInfo priceInfo) {
        this.assetCurrencyCode = str;
        this.priceInfo = priceInfo;
    }

    public final String getAssetCurrencyCode() {
        return this.assetCurrencyCode;
    }

    public final PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    /* compiled from: CryptoTaxLotSelectionHeader.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo;", "", "formattedPrice", "", "<init>", "(Ljava/lang/String;)V", "getFormattedPrice", "()Ljava/lang/String;", "Market", "Limit", "StopLimit", "StopLoss", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo$Limit;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo$Market;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo$StopLimit;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo$StopLoss;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class PriceInfo {
        public static final int $stable = 0;
        private final String formattedPrice;

        public /* synthetic */ PriceInfo(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* compiled from: CryptoTaxLotSelectionHeader.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo$Market;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo;", "formattedPrice", "", "<init>", "(Ljava/lang/String;)V", "getFormattedPrice", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Market extends PriceInfo {
            public static final int $stable = 0;
            private final String formattedPrice;

            public static /* synthetic */ Market copy$default(Market market, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = market.formattedPrice;
                }
                return market.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getFormattedPrice() {
                return this.formattedPrice;
            }

            public final Market copy(String formattedPrice) {
                Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
                return new Market(formattedPrice);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Market) && Intrinsics.areEqual(this.formattedPrice, ((Market) other).formattedPrice);
            }

            public int hashCode() {
                return this.formattedPrice.hashCode();
            }

            public String toString() {
                return "Market(formattedPrice=" + this.formattedPrice + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Market(String formattedPrice) {
                super(formattedPrice, null);
                Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
                this.formattedPrice = formattedPrice;
            }

            @Override // com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionHeaderState.PriceInfo
            public String getFormattedPrice() {
                return this.formattedPrice;
            }
        }

        private PriceInfo(String str) {
            this.formattedPrice = str;
        }

        public String getFormattedPrice() {
            return this.formattedPrice;
        }

        /* compiled from: CryptoTaxLotSelectionHeader.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo$Limit;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo;", "formattedPrice", "", "<init>", "(Ljava/lang/String;)V", "getFormattedPrice", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Limit extends PriceInfo {
            public static final int $stable = 0;
            private final String formattedPrice;

            public static /* synthetic */ Limit copy$default(Limit limit, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = limit.formattedPrice;
                }
                return limit.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getFormattedPrice() {
                return this.formattedPrice;
            }

            public final Limit copy(String formattedPrice) {
                Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
                return new Limit(formattedPrice);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Limit) && Intrinsics.areEqual(this.formattedPrice, ((Limit) other).formattedPrice);
            }

            public int hashCode() {
                return this.formattedPrice.hashCode();
            }

            public String toString() {
                return "Limit(formattedPrice=" + this.formattedPrice + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Limit(String formattedPrice) {
                super(formattedPrice, null);
                Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
                this.formattedPrice = formattedPrice;
            }

            @Override // com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionHeaderState.PriceInfo
            public String getFormattedPrice() {
                return this.formattedPrice;
            }
        }

        /* compiled from: CryptoTaxLotSelectionHeader.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo$StopLimit;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo;", "formattedPrice", "", "<init>", "(Ljava/lang/String;)V", "getFormattedPrice", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StopLimit extends PriceInfo {
            public static final int $stable = 0;
            private final String formattedPrice;

            public static /* synthetic */ StopLimit copy$default(StopLimit stopLimit, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stopLimit.formattedPrice;
                }
                return stopLimit.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getFormattedPrice() {
                return this.formattedPrice;
            }

            public final StopLimit copy(String formattedPrice) {
                Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
                return new StopLimit(formattedPrice);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StopLimit) && Intrinsics.areEqual(this.formattedPrice, ((StopLimit) other).formattedPrice);
            }

            public int hashCode() {
                return this.formattedPrice.hashCode();
            }

            public String toString() {
                return "StopLimit(formattedPrice=" + this.formattedPrice + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StopLimit(String formattedPrice) {
                super(formattedPrice, null);
                Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
                this.formattedPrice = formattedPrice;
            }

            @Override // com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionHeaderState.PriceInfo
            public String getFormattedPrice() {
                return this.formattedPrice;
            }
        }

        /* compiled from: CryptoTaxLotSelectionHeader.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo$StopLoss;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState$PriceInfo;", "formattedPrice", "", "<init>", "(Ljava/lang/String;)V", "getFormattedPrice", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StopLoss extends PriceInfo {
            public static final int $stable = 0;
            private final String formattedPrice;

            public static /* synthetic */ StopLoss copy$default(StopLoss stopLoss, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stopLoss.formattedPrice;
                }
                return stopLoss.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getFormattedPrice() {
                return this.formattedPrice;
            }

            public final StopLoss copy(String formattedPrice) {
                Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
                return new StopLoss(formattedPrice);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StopLoss) && Intrinsics.areEqual(this.formattedPrice, ((StopLoss) other).formattedPrice);
            }

            public int hashCode() {
                return this.formattedPrice.hashCode();
            }

            public String toString() {
                return "StopLoss(formattedPrice=" + this.formattedPrice + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StopLoss(String formattedPrice) {
                super(formattedPrice, null);
                Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
                this.formattedPrice = formattedPrice;
            }

            @Override // com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionHeaderState.PriceInfo
            public String getFormattedPrice() {
                return this.formattedPrice;
            }
        }
    }
}
