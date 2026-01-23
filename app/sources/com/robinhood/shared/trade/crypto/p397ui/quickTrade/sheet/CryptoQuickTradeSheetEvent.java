package com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet;

import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuickTradeSheetEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetEvent;", "", "ShakeInput", "NavigateToOrderType", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetEvent$NavigateToOrderType;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetEvent$ShakeInput;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface CryptoQuickTradeSheetEvent {

    /* compiled from: CryptoQuickTradeSheetEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetEvent$ShakeInput;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShakeInput implements CryptoQuickTradeSheetEvent {
        public static final int $stable = 0;
        public static final ShakeInput INSTANCE = new ShakeInput();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShakeInput);
        }

        public int hashCode() {
            return -1330293436;
        }

        public String toString() {
            return "ShakeInput";
        }

        private ShakeInput() {
        }
    }

    /* compiled from: CryptoQuickTradeSheetEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetEvent$NavigateToOrderType;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetEvent;", "key", "Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey;", "<init>", "(Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey;)V", "getKey", "()Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToOrderType implements CryptoQuickTradeSheetEvent {
        public static final int $stable = 8;
        private final CryptoOrderIntentKey key;

        public static /* synthetic */ NavigateToOrderType copy$default(NavigateToOrderType navigateToOrderType, CryptoOrderIntentKey cryptoOrderIntentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoOrderIntentKey = navigateToOrderType.key;
            }
            return navigateToOrderType.copy(cryptoOrderIntentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoOrderIntentKey getKey() {
            return this.key;
        }

        public final NavigateToOrderType copy(CryptoOrderIntentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new NavigateToOrderType(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToOrderType) && Intrinsics.areEqual(this.key, ((NavigateToOrderType) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "NavigateToOrderType(key=" + this.key + ")";
        }

        public NavigateToOrderType(CryptoOrderIntentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final CryptoOrderIntentKey getKey() {
            return this.key;
        }
    }
}
