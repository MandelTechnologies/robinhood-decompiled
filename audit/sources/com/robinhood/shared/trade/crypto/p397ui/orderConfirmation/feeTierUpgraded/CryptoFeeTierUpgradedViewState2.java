package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeTierUpgradedViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection;", "", "<init>", "()V", "Show", "Hidden", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection$Hidden;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection$Show;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.FeeRatesSection, reason: use source file name */
/* loaded from: classes12.dex */
public abstract class CryptoFeeTierUpgradedViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ CryptoFeeTierUpgradedViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoFeeTierUpgradedViewState2() {
    }

    /* compiled from: CryptoFeeTierUpgradedViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection$Show;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection;", "currentTierFeeRateDisplay", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection$Show$FeeRateDisplay;", "nextTierFeeRateDisplay", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection$Show$FeeRateDisplay;Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection$Show$FeeRateDisplay;)V", "getCurrentTierFeeRateDisplay", "()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection$Show$FeeRateDisplay;", "getNextTierFeeRateDisplay", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "FeeRateDisplay", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.FeeRatesSection$Show, reason: from toString */
    public static final /* data */ class Show extends CryptoFeeTierUpgradedViewState2 {
        public static final int $stable = StringResource.$stable;
        private final FeeRateDisplay currentTierFeeRateDisplay;
        private final FeeRateDisplay nextTierFeeRateDisplay;

        public static /* synthetic */ Show copy$default(Show show, FeeRateDisplay feeRateDisplay, FeeRateDisplay feeRateDisplay2, int i, Object obj) {
            if ((i & 1) != 0) {
                feeRateDisplay = show.currentTierFeeRateDisplay;
            }
            if ((i & 2) != 0) {
                feeRateDisplay2 = show.nextTierFeeRateDisplay;
            }
            return show.copy(feeRateDisplay, feeRateDisplay2);
        }

        /* renamed from: component1, reason: from getter */
        public final FeeRateDisplay getCurrentTierFeeRateDisplay() {
            return this.currentTierFeeRateDisplay;
        }

        /* renamed from: component2, reason: from getter */
        public final FeeRateDisplay getNextTierFeeRateDisplay() {
            return this.nextTierFeeRateDisplay;
        }

        public final Show copy(FeeRateDisplay currentTierFeeRateDisplay, FeeRateDisplay nextTierFeeRateDisplay) {
            return new Show(currentTierFeeRateDisplay, nextTierFeeRateDisplay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Show)) {
                return false;
            }
            Show show = (Show) other;
            return Intrinsics.areEqual(this.currentTierFeeRateDisplay, show.currentTierFeeRateDisplay) && Intrinsics.areEqual(this.nextTierFeeRateDisplay, show.nextTierFeeRateDisplay);
        }

        public int hashCode() {
            FeeRateDisplay feeRateDisplay = this.currentTierFeeRateDisplay;
            int iHashCode = (feeRateDisplay == null ? 0 : feeRateDisplay.hashCode()) * 31;
            FeeRateDisplay feeRateDisplay2 = this.nextTierFeeRateDisplay;
            return iHashCode + (feeRateDisplay2 != null ? feeRateDisplay2.hashCode() : 0);
        }

        public String toString() {
            return "Show(currentTierFeeRateDisplay=" + this.currentTierFeeRateDisplay + ", nextTierFeeRateDisplay=" + this.nextTierFeeRateDisplay + ")";
        }

        public final FeeRateDisplay getCurrentTierFeeRateDisplay() {
            return this.currentTierFeeRateDisplay;
        }

        public final FeeRateDisplay getNextTierFeeRateDisplay() {
            return this.nextTierFeeRateDisplay;
        }

        public Show(FeeRateDisplay feeRateDisplay, FeeRateDisplay feeRateDisplay2) {
            super(null);
            this.currentTierFeeRateDisplay = feeRateDisplay;
            this.nextTierFeeRateDisplay = feeRateDisplay2;
        }

        /* compiled from: CryptoFeeTierUpgradedViewState.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection$Show$FeeRateDisplay;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "feeRate", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getFeeRate", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.FeeRatesSection$Show$FeeRateDisplay, reason: from toString */
        public static final /* data */ class FeeRateDisplay {
            public static final int $stable = StringResource.$stable;
            private final String feeRate;
            private final StringResource title;

            public static /* synthetic */ FeeRateDisplay copy$default(FeeRateDisplay feeRateDisplay, StringResource stringResource, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = feeRateDisplay.title;
                }
                if ((i & 2) != 0) {
                    str = feeRateDisplay.feeRate;
                }
                return feeRateDisplay.copy(stringResource, str);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getFeeRate() {
                return this.feeRate;
            }

            public final FeeRateDisplay copy(StringResource title, String feeRate) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(feeRate, "feeRate");
                return new FeeRateDisplay(title, feeRate);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FeeRateDisplay)) {
                    return false;
                }
                FeeRateDisplay feeRateDisplay = (FeeRateDisplay) other;
                return Intrinsics.areEqual(this.title, feeRateDisplay.title) && Intrinsics.areEqual(this.feeRate, feeRateDisplay.feeRate);
            }

            public int hashCode() {
                return (this.title.hashCode() * 31) + this.feeRate.hashCode();
            }

            public String toString() {
                return "FeeRateDisplay(title=" + this.title + ", feeRate=" + this.feeRate + ")";
            }

            public FeeRateDisplay(StringResource title, String feeRate) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(feeRate, "feeRate");
                this.title = title;
                this.feeRate = feeRate;
            }

            public final StringResource getTitle() {
                return this.title;
            }

            public final String getFeeRate() {
                return this.feeRate;
            }
        }
    }

    /* compiled from: CryptoFeeTierUpgradedViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection$Hidden;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.FeeRatesSection$Hidden */
    public static final /* data */ class Hidden extends CryptoFeeTierUpgradedViewState2 {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();

        public boolean equals(Object other) {
            return this == other || (other instanceof Hidden);
        }

        public int hashCode() {
            return -1274862764;
        }

        public String toString() {
            return "Hidden";
        }

        private Hidden() {
            super(null);
        }
    }
}
