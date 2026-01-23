package com.robinhood.shared.crypto.p375ui.feeTiers;

import com.robinhood.models.crypto.p314db.fee.CryptoFeeTier;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.CryptoFeeTierStatusContext;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeTierSummary.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary;", "", "<init>", "()V", "feeTierStatusContext", "Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContext;", "getFeeTierStatusContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContext;", "HasNextTier", "LowestFee", "Companion", "Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary$HasNextTier;", "Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary$LowestFee;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class CryptoFeeTierSummary {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ CryptoFeeTierSummary(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract CryptoFeeTierStatusContext getFeeTierStatusContext();

    private CryptoFeeTierSummary() {
    }

    /* compiled from: CryptoFeeTierSummary.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary$HasNextTier;", "Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary;", "currentFeTier", "Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary$HasNextTier$FeeTier;", "nextFeeTier", "feeTierStatusContext", "Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContext;", "<init>", "(Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary$HasNextTier$FeeTier;Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary$HasNextTier$FeeTier;Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContext;)V", "getCurrentFeTier", "()Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary$HasNextTier$FeeTier;", "getNextFeeTier", "getFeeTierStatusContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContext;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "FeeTier", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HasNextTier extends CryptoFeeTierSummary {
        public static final int $stable = 8;
        private final FeeTier currentFeTier;
        private final CryptoFeeTierStatusContext feeTierStatusContext;
        private final FeeTier nextFeeTier;

        public static /* synthetic */ HasNextTier copy$default(HasNextTier hasNextTier, FeeTier feeTier, FeeTier feeTier2, CryptoFeeTierStatusContext cryptoFeeTierStatusContext, int i, Object obj) {
            if ((i & 1) != 0) {
                feeTier = hasNextTier.currentFeTier;
            }
            if ((i & 2) != 0) {
                feeTier2 = hasNextTier.nextFeeTier;
            }
            if ((i & 4) != 0) {
                cryptoFeeTierStatusContext = hasNextTier.feeTierStatusContext;
            }
            return hasNextTier.copy(feeTier, feeTier2, cryptoFeeTierStatusContext);
        }

        /* renamed from: component1, reason: from getter */
        public final FeeTier getCurrentFeTier() {
            return this.currentFeTier;
        }

        /* renamed from: component2, reason: from getter */
        public final FeeTier getNextFeeTier() {
            return this.nextFeeTier;
        }

        /* renamed from: component3, reason: from getter */
        public final CryptoFeeTierStatusContext getFeeTierStatusContext() {
            return this.feeTierStatusContext;
        }

        public final HasNextTier copy(FeeTier currentFeTier, FeeTier nextFeeTier, CryptoFeeTierStatusContext feeTierStatusContext) {
            Intrinsics.checkNotNullParameter(currentFeTier, "currentFeTier");
            Intrinsics.checkNotNullParameter(nextFeeTier, "nextFeeTier");
            Intrinsics.checkNotNullParameter(feeTierStatusContext, "feeTierStatusContext");
            return new HasNextTier(currentFeTier, nextFeeTier, feeTierStatusContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HasNextTier)) {
                return false;
            }
            HasNextTier hasNextTier = (HasNextTier) other;
            return Intrinsics.areEqual(this.currentFeTier, hasNextTier.currentFeTier) && Intrinsics.areEqual(this.nextFeeTier, hasNextTier.nextFeeTier) && Intrinsics.areEqual(this.feeTierStatusContext, hasNextTier.feeTierStatusContext);
        }

        public int hashCode() {
            return (((this.currentFeTier.hashCode() * 31) + this.nextFeeTier.hashCode()) * 31) + this.feeTierStatusContext.hashCode();
        }

        public String toString() {
            return "HasNextTier(currentFeTier=" + this.currentFeTier + ", nextFeeTier=" + this.nextFeeTier + ", feeTierStatusContext=" + this.feeTierStatusContext + ")";
        }

        public final FeeTier getCurrentFeTier() {
            return this.currentFeTier;
        }

        public final FeeTier getNextFeeTier() {
            return this.nextFeeTier;
        }

        @Override // com.robinhood.shared.crypto.p375ui.feeTiers.CryptoFeeTierSummary
        public CryptoFeeTierStatusContext getFeeTierStatusContext() {
            return this.feeTierStatusContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HasNextTier(FeeTier currentFeTier, FeeTier nextFeeTier, CryptoFeeTierStatusContext feeTierStatusContext) {
            super(null);
            Intrinsics.checkNotNullParameter(currentFeTier, "currentFeTier");
            Intrinsics.checkNotNullParameter(nextFeeTier, "nextFeeTier");
            Intrinsics.checkNotNullParameter(feeTierStatusContext, "feeTierStatusContext");
            this.currentFeTier = currentFeTier;
            this.nextFeeTier = nextFeeTier;
            this.feeTierStatusContext = feeTierStatusContext;
        }

        /* compiled from: CryptoFeeTierSummary.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary$HasNextTier$FeeTier;", "", "feeRateText", "", "tradingVolumeText", "tradingVolumeDescriptionText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;)V", "getFeeRateText", "()Ljava/lang/String;", "getTradingVolumeText", "getTradingVolumeDescriptionText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FeeTier {
            public static final int $stable = StringResource.$stable;
            private final String feeRateText;
            private final StringResource tradingVolumeDescriptionText;
            private final String tradingVolumeText;

            public static /* synthetic */ FeeTier copy$default(FeeTier feeTier, String str, String str2, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = feeTier.feeRateText;
                }
                if ((i & 2) != 0) {
                    str2 = feeTier.tradingVolumeText;
                }
                if ((i & 4) != 0) {
                    stringResource = feeTier.tradingVolumeDescriptionText;
                }
                return feeTier.copy(str, str2, stringResource);
            }

            /* renamed from: component1, reason: from getter */
            public final String getFeeRateText() {
                return this.feeRateText;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTradingVolumeText() {
                return this.tradingVolumeText;
            }

            /* renamed from: component3, reason: from getter */
            public final StringResource getTradingVolumeDescriptionText() {
                return this.tradingVolumeDescriptionText;
            }

            public final FeeTier copy(String feeRateText, String tradingVolumeText, StringResource tradingVolumeDescriptionText) {
                Intrinsics.checkNotNullParameter(feeRateText, "feeRateText");
                Intrinsics.checkNotNullParameter(tradingVolumeText, "tradingVolumeText");
                Intrinsics.checkNotNullParameter(tradingVolumeDescriptionText, "tradingVolumeDescriptionText");
                return new FeeTier(feeRateText, tradingVolumeText, tradingVolumeDescriptionText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FeeTier)) {
                    return false;
                }
                FeeTier feeTier = (FeeTier) other;
                return Intrinsics.areEqual(this.feeRateText, feeTier.feeRateText) && Intrinsics.areEqual(this.tradingVolumeText, feeTier.tradingVolumeText) && Intrinsics.areEqual(this.tradingVolumeDescriptionText, feeTier.tradingVolumeDescriptionText);
            }

            public int hashCode() {
                return (((this.feeRateText.hashCode() * 31) + this.tradingVolumeText.hashCode()) * 31) + this.tradingVolumeDescriptionText.hashCode();
            }

            public String toString() {
                return "FeeTier(feeRateText=" + this.feeRateText + ", tradingVolumeText=" + this.tradingVolumeText + ", tradingVolumeDescriptionText=" + this.tradingVolumeDescriptionText + ")";
            }

            public FeeTier(String feeRateText, String tradingVolumeText, StringResource tradingVolumeDescriptionText) {
                Intrinsics.checkNotNullParameter(feeRateText, "feeRateText");
                Intrinsics.checkNotNullParameter(tradingVolumeText, "tradingVolumeText");
                Intrinsics.checkNotNullParameter(tradingVolumeDescriptionText, "tradingVolumeDescriptionText");
                this.feeRateText = feeRateText;
                this.tradingVolumeText = tradingVolumeText;
                this.tradingVolumeDescriptionText = tradingVolumeDescriptionText;
            }

            public final String getFeeRateText() {
                return this.feeRateText;
            }

            public final String getTradingVolumeText() {
                return this.tradingVolumeText;
            }

            public final StringResource getTradingVolumeDescriptionText() {
                return this.tradingVolumeDescriptionText;
            }
        }
    }

    /* compiled from: CryptoFeeTierSummary.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary$LowestFee;", "Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary;", "feeRateText", "", "feeTierStatusContext", "Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContext;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContext;)V", "getFeeRateText", "()Ljava/lang/String;", "getFeeTierStatusContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContext;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LowestFee extends CryptoFeeTierSummary {
        public static final int $stable = 8;
        private final String feeRateText;
        private final CryptoFeeTierStatusContext feeTierStatusContext;

        public static /* synthetic */ LowestFee copy$default(LowestFee lowestFee, String str, CryptoFeeTierStatusContext cryptoFeeTierStatusContext, int i, Object obj) {
            if ((i & 1) != 0) {
                str = lowestFee.feeRateText;
            }
            if ((i & 2) != 0) {
                cryptoFeeTierStatusContext = lowestFee.feeTierStatusContext;
            }
            return lowestFee.copy(str, cryptoFeeTierStatusContext);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFeeRateText() {
            return this.feeRateText;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoFeeTierStatusContext getFeeTierStatusContext() {
            return this.feeTierStatusContext;
        }

        public final LowestFee copy(String feeRateText, CryptoFeeTierStatusContext feeTierStatusContext) {
            Intrinsics.checkNotNullParameter(feeRateText, "feeRateText");
            Intrinsics.checkNotNullParameter(feeTierStatusContext, "feeTierStatusContext");
            return new LowestFee(feeRateText, feeTierStatusContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LowestFee)) {
                return false;
            }
            LowestFee lowestFee = (LowestFee) other;
            return Intrinsics.areEqual(this.feeRateText, lowestFee.feeRateText) && Intrinsics.areEqual(this.feeTierStatusContext, lowestFee.feeTierStatusContext);
        }

        public int hashCode() {
            return (this.feeRateText.hashCode() * 31) + this.feeTierStatusContext.hashCode();
        }

        public String toString() {
            return "LowestFee(feeRateText=" + this.feeRateText + ", feeTierStatusContext=" + this.feeTierStatusContext + ")";
        }

        public final String getFeeRateText() {
            return this.feeRateText;
        }

        @Override // com.robinhood.shared.crypto.p375ui.feeTiers.CryptoFeeTierSummary
        public CryptoFeeTierStatusContext getFeeTierStatusContext() {
            return this.feeTierStatusContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LowestFee(String feeRateText, CryptoFeeTierStatusContext feeTierStatusContext) {
            super(null);
            Intrinsics.checkNotNullParameter(feeRateText, "feeRateText");
            Intrinsics.checkNotNullParameter(feeTierStatusContext, "feeTierStatusContext");
            this.feeRateText = feeRateText;
            this.feeTierStatusContext = feeTierStatusContext;
        }
    }

    /* compiled from: CryptoFeeTierSummary.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary;", "feeTierInfo", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CryptoFeeTierSummary from(CryptoFeeTierInfo feeTierInfo) {
            BigDecimal bigDecimalCompat;
            BigDecimal feeRatio;
            Intrinsics.checkNotNullParameter(feeTierInfo, "feeTierInfo");
            CryptoFeeTier currentFeeTier = feeTierInfo.getCurrentFeeTier();
            CryptoFeeTier nextFeeTier = feeTierInfo.getNextFeeTier();
            double dDoubleValue = feeTierInfo.getCurrentFeeTier().getFeeRatio().doubleValue();
            CryptoFeeTier nextFeeTier2 = feeTierInfo.getNextFeeTier();
            double dDoubleValue2 = 0.0d;
            double dDoubleValue3 = (nextFeeTier2 == null || (feeRatio = nextFeeTier2.getFeeRatio()) == null) ? 0.0d : feeRatio.doubleValue();
            Money requiredTradingAmountForNextTier = feeTierInfo.getRequiredTradingAmountForNextTier();
            if (requiredTradingAmountForNextTier != null && (bigDecimalCompat = Money3.getBigDecimalCompat(requiredTradingAmountForNextTier)) != null) {
                dDoubleValue2 = bigDecimalCompat.doubleValue();
            }
            CryptoFeeTierStatusContext cryptoFeeTierStatusContext = new CryptoFeeTierStatusContext(dDoubleValue, dDoubleValue3, dDoubleValue2, Money3.getBigDecimalCompat(feeTierInfo.getCurrentPeriodTradingAmount()).doubleValue(), null, 16, null);
            if (nextFeeTier != null) {
                String feeRate = FormatFeeRate.formatFeeRate(currentFeeTier.getFeeRatio());
                String str = Money.format$default(feeTierInfo.getCurrentPeriodTradingAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
                StringResource.Companion companion = StringResource.INSTANCE;
                return new HasNextTier(new HasNextTier.FeeTier(feeRate, str, companion.invoke(C38572R.string.crypto_home_tab_fee_tier_status_current_trading_volume_period, Integer.valueOf(feeTierInfo.getEvaluationPeriodDays()))), new HasNextTier.FeeTier(FormatFeeRate.formatFeeRate(nextFeeTier.getFeeRatio()), Money.format$default(nextFeeTier.getMinVolume(), null, false, null, false, 0, null, false, null, false, false, 1023, null), companion.invoke(C38572R.string.crypto_home_tab_fee_tier_status_required_trading_volume_period, Integer.valueOf(feeTierInfo.getEvaluationPeriodDays()))), cryptoFeeTierStatusContext);
            }
            return new LowestFee(FormatFeeRate.formatFeeRate(currentFeeTier.getFeeRatio()), cryptoFeeTierStatusContext);
        }
    }
}
