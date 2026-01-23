package com.robinhood.android.crypto.pulse.feed.views.feedItem;

import com.robinhood.android.cortex.contracts.AssetDigestFragmentKey;
import com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtonTrayState;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoPulseFeedItem.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JC\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState;", "", "currencyPairId", "Ljava/util/UUID;", "previewText", "", "expandableButtonTrayState", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState;", "", "headerState", "Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState$HeaderState;", "assetDigestFragmentKey", "Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState;Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState$HeaderState;Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getPreviewText", "()Ljava/lang/String;", "getExpandableButtonTrayState", "()Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState;", "getHeaderState", "()Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState$HeaderState;", "getAssetDigestFragmentKey", "()Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "HeaderState", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoPulseFeedItemState {
    public static final int $stable = 8;
    private final AssetDigestFragmentKey assetDigestFragmentKey;
    private final UUID currencyPairId;
    private final ExpandableButtonTrayState<Unit> expandableButtonTrayState;
    private final HeaderState headerState;
    private final String previewText;

    public static /* synthetic */ CryptoPulseFeedItemState copy$default(CryptoPulseFeedItemState cryptoPulseFeedItemState, UUID uuid, String str, ExpandableButtonTrayState cryptoExpandableButtonTrayComposable6, HeaderState headerState, AssetDigestFragmentKey assetDigestFragmentKey, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoPulseFeedItemState.currencyPairId;
        }
        if ((i & 2) != 0) {
            str = cryptoPulseFeedItemState.previewText;
        }
        if ((i & 4) != 0) {
            cryptoExpandableButtonTrayComposable6 = cryptoPulseFeedItemState.expandableButtonTrayState;
        }
        if ((i & 8) != 0) {
            headerState = cryptoPulseFeedItemState.headerState;
        }
        if ((i & 16) != 0) {
            assetDigestFragmentKey = cryptoPulseFeedItemState.assetDigestFragmentKey;
        }
        AssetDigestFragmentKey assetDigestFragmentKey2 = assetDigestFragmentKey;
        ExpandableButtonTrayState cryptoExpandableButtonTrayComposable62 = cryptoExpandableButtonTrayComposable6;
        return cryptoPulseFeedItemState.copy(uuid, str, cryptoExpandableButtonTrayComposable62, headerState, assetDigestFragmentKey2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPreviewText() {
        return this.previewText;
    }

    public final ExpandableButtonTrayState<Unit> component3() {
        return this.expandableButtonTrayState;
    }

    /* renamed from: component4, reason: from getter */
    public final HeaderState getHeaderState() {
        return this.headerState;
    }

    /* renamed from: component5, reason: from getter */
    public final AssetDigestFragmentKey getAssetDigestFragmentKey() {
        return this.assetDigestFragmentKey;
    }

    public final CryptoPulseFeedItemState copy(UUID currencyPairId, String previewText, ExpandableButtonTrayState<Unit> expandableButtonTrayState, HeaderState headerState, AssetDigestFragmentKey assetDigestFragmentKey) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(previewText, "previewText");
        Intrinsics.checkNotNullParameter(expandableButtonTrayState, "expandableButtonTrayState");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        return new CryptoPulseFeedItemState(currencyPairId, previewText, expandableButtonTrayState, headerState, assetDigestFragmentKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoPulseFeedItemState)) {
            return false;
        }
        CryptoPulseFeedItemState cryptoPulseFeedItemState = (CryptoPulseFeedItemState) other;
        return Intrinsics.areEqual(this.currencyPairId, cryptoPulseFeedItemState.currencyPairId) && Intrinsics.areEqual(this.previewText, cryptoPulseFeedItemState.previewText) && Intrinsics.areEqual(this.expandableButtonTrayState, cryptoPulseFeedItemState.expandableButtonTrayState) && Intrinsics.areEqual(this.headerState, cryptoPulseFeedItemState.headerState) && Intrinsics.areEqual(this.assetDigestFragmentKey, cryptoPulseFeedItemState.assetDigestFragmentKey);
    }

    public int hashCode() {
        int iHashCode = ((((((this.currencyPairId.hashCode() * 31) + this.previewText.hashCode()) * 31) + this.expandableButtonTrayState.hashCode()) * 31) + this.headerState.hashCode()) * 31;
        AssetDigestFragmentKey assetDigestFragmentKey = this.assetDigestFragmentKey;
        return iHashCode + (assetDigestFragmentKey == null ? 0 : assetDigestFragmentKey.hashCode());
    }

    public String toString() {
        return "CryptoPulseFeedItemState(currencyPairId=" + this.currencyPairId + ", previewText=" + this.previewText + ", expandableButtonTrayState=" + this.expandableButtonTrayState + ", headerState=" + this.headerState + ", assetDigestFragmentKey=" + this.assetDigestFragmentKey + ")";
    }

    public CryptoPulseFeedItemState(UUID currencyPairId, String previewText, ExpandableButtonTrayState<Unit> expandableButtonTrayState, HeaderState headerState, AssetDigestFragmentKey assetDigestFragmentKey) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(previewText, "previewText");
        Intrinsics.checkNotNullParameter(expandableButtonTrayState, "expandableButtonTrayState");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        this.currencyPairId = currencyPairId;
        this.previewText = previewText;
        this.expandableButtonTrayState = expandableButtonTrayState;
        this.headerState = headerState;
        this.assetDigestFragmentKey = assetDigestFragmentKey;
    }

    public /* synthetic */ CryptoPulseFeedItemState(UUID uuid, String str, ExpandableButtonTrayState cryptoExpandableButtonTrayComposable6, HeaderState headerState, AssetDigestFragmentKey assetDigestFragmentKey, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, cryptoExpandableButtonTrayComposable6, headerState, (i & 16) != 0 ? null : assetDigestFragmentKey);
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final String getPreviewText() {
        return this.previewText;
    }

    public final ExpandableButtonTrayState<Unit> getExpandableButtonTrayState() {
        return this.expandableButtonTrayState;
    }

    public final HeaderState getHeaderState() {
        return this.headerState;
    }

    public final AssetDigestFragmentKey getAssetDigestFragmentKey() {
        return this.assetDigestFragmentKey;
    }

    /* compiled from: CryptoPulseFeedItem.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState$HeaderState;", "", "<init>", "()V", "PositionDetailData", "CondensedData", "Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState$HeaderState$CondensedData;", "Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState$HeaderState$PositionDetailData;", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class HeaderState {
        public static final int $stable = 0;

        public /* synthetic */ HeaderState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private HeaderState() {
        }

        /* compiled from: CryptoPulseFeedItem.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState$HeaderState$PositionDetailData;", "Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState$HeaderState;", "assetCurrencyCode", "", "quantity", "Ljava/math/BigDecimal;", "formattedQuote", "priceMovementRatio", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getAssetCurrencyCode", "()Ljava/lang/String;", "getQuantity", "()Ljava/math/BigDecimal;", "getFormattedQuote", "getPriceMovementRatio", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PositionDetailData extends HeaderState {
            public static final int $stable = 8;
            private final String assetCurrencyCode;
            private final String formattedQuote;
            private final BigDecimal priceMovementRatio;
            private final BigDecimal quantity;

            public static /* synthetic */ PositionDetailData copy$default(PositionDetailData positionDetailData, String str, BigDecimal bigDecimal, String str2, BigDecimal bigDecimal2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = positionDetailData.assetCurrencyCode;
                }
                if ((i & 2) != 0) {
                    bigDecimal = positionDetailData.quantity;
                }
                if ((i & 4) != 0) {
                    str2 = positionDetailData.formattedQuote;
                }
                if ((i & 8) != 0) {
                    bigDecimal2 = positionDetailData.priceMovementRatio;
                }
                return positionDetailData.copy(str, bigDecimal, str2, bigDecimal2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAssetCurrencyCode() {
                return this.assetCurrencyCode;
            }

            /* renamed from: component2, reason: from getter */
            public final BigDecimal getQuantity() {
                return this.quantity;
            }

            /* renamed from: component3, reason: from getter */
            public final String getFormattedQuote() {
                return this.formattedQuote;
            }

            /* renamed from: component4, reason: from getter */
            public final BigDecimal getPriceMovementRatio() {
                return this.priceMovementRatio;
            }

            public final PositionDetailData copy(String assetCurrencyCode, BigDecimal quantity, String formattedQuote, BigDecimal priceMovementRatio) {
                Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
                Intrinsics.checkNotNullParameter(quantity, "quantity");
                Intrinsics.checkNotNullParameter(formattedQuote, "formattedQuote");
                Intrinsics.checkNotNullParameter(priceMovementRatio, "priceMovementRatio");
                return new PositionDetailData(assetCurrencyCode, quantity, formattedQuote, priceMovementRatio);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PositionDetailData)) {
                    return false;
                }
                PositionDetailData positionDetailData = (PositionDetailData) other;
                return Intrinsics.areEqual(this.assetCurrencyCode, positionDetailData.assetCurrencyCode) && Intrinsics.areEqual(this.quantity, positionDetailData.quantity) && Intrinsics.areEqual(this.formattedQuote, positionDetailData.formattedQuote) && Intrinsics.areEqual(this.priceMovementRatio, positionDetailData.priceMovementRatio);
            }

            public int hashCode() {
                return (((((this.assetCurrencyCode.hashCode() * 31) + this.quantity.hashCode()) * 31) + this.formattedQuote.hashCode()) * 31) + this.priceMovementRatio.hashCode();
            }

            public String toString() {
                return "PositionDetailData(assetCurrencyCode=" + this.assetCurrencyCode + ", quantity=" + this.quantity + ", formattedQuote=" + this.formattedQuote + ", priceMovementRatio=" + this.priceMovementRatio + ")";
            }

            public final String getAssetCurrencyCode() {
                return this.assetCurrencyCode;
            }

            public final BigDecimal getQuantity() {
                return this.quantity;
            }

            public final String getFormattedQuote() {
                return this.formattedQuote;
            }

            public final BigDecimal getPriceMovementRatio() {
                return this.priceMovementRatio;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PositionDetailData(String assetCurrencyCode, BigDecimal quantity, String formattedQuote, BigDecimal priceMovementRatio) {
                super(null);
                Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
                Intrinsics.checkNotNullParameter(quantity, "quantity");
                Intrinsics.checkNotNullParameter(formattedQuote, "formattedQuote");
                Intrinsics.checkNotNullParameter(priceMovementRatio, "priceMovementRatio");
                this.assetCurrencyCode = assetCurrencyCode;
                this.quantity = quantity;
                this.formattedQuote = formattedQuote;
                this.priceMovementRatio = priceMovementRatio;
            }
        }

        /* compiled from: CryptoPulseFeedItem.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState$HeaderState$CondensedData;", "Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState$HeaderState;", "assetCurrencyCode", "", "formattedQuote", "priceMovementRatio", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getAssetCurrencyCode", "()Ljava/lang/String;", "getFormattedQuote", "getPriceMovementRatio", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CondensedData extends HeaderState {
            public static final int $stable = 8;
            private final String assetCurrencyCode;
            private final String formattedQuote;
            private final BigDecimal priceMovementRatio;

            public static /* synthetic */ CondensedData copy$default(CondensedData condensedData, String str, String str2, BigDecimal bigDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = condensedData.assetCurrencyCode;
                }
                if ((i & 2) != 0) {
                    str2 = condensedData.formattedQuote;
                }
                if ((i & 4) != 0) {
                    bigDecimal = condensedData.priceMovementRatio;
                }
                return condensedData.copy(str, str2, bigDecimal);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAssetCurrencyCode() {
                return this.assetCurrencyCode;
            }

            /* renamed from: component2, reason: from getter */
            public final String getFormattedQuote() {
                return this.formattedQuote;
            }

            /* renamed from: component3, reason: from getter */
            public final BigDecimal getPriceMovementRatio() {
                return this.priceMovementRatio;
            }

            public final CondensedData copy(String assetCurrencyCode, String formattedQuote, BigDecimal priceMovementRatio) {
                Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
                Intrinsics.checkNotNullParameter(formattedQuote, "formattedQuote");
                Intrinsics.checkNotNullParameter(priceMovementRatio, "priceMovementRatio");
                return new CondensedData(assetCurrencyCode, formattedQuote, priceMovementRatio);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CondensedData)) {
                    return false;
                }
                CondensedData condensedData = (CondensedData) other;
                return Intrinsics.areEqual(this.assetCurrencyCode, condensedData.assetCurrencyCode) && Intrinsics.areEqual(this.formattedQuote, condensedData.formattedQuote) && Intrinsics.areEqual(this.priceMovementRatio, condensedData.priceMovementRatio);
            }

            public int hashCode() {
                return (((this.assetCurrencyCode.hashCode() * 31) + this.formattedQuote.hashCode()) * 31) + this.priceMovementRatio.hashCode();
            }

            public String toString() {
                return "CondensedData(assetCurrencyCode=" + this.assetCurrencyCode + ", formattedQuote=" + this.formattedQuote + ", priceMovementRatio=" + this.priceMovementRatio + ")";
            }

            public final String getAssetCurrencyCode() {
                return this.assetCurrencyCode;
            }

            public final String getFormattedQuote() {
                return this.formattedQuote;
            }

            public final BigDecimal getPriceMovementRatio() {
                return this.priceMovementRatio;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CondensedData(String assetCurrencyCode, String formattedQuote, BigDecimal priceMovementRatio) {
                super(null);
                Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
                Intrinsics.checkNotNullParameter(formattedQuote, "formattedQuote");
                Intrinsics.checkNotNullParameter(priceMovementRatio, "priceMovementRatio");
                this.assetCurrencyCode = assetCurrencyCode;
                this.formattedQuote = formattedQuote;
                this.priceMovementRatio = priceMovementRatio;
            }
        }
    }
}
