package com.robinhood.shared.trade.crypto.p397ui.quickTrade.views;

import com.robinhood.websocket.p410dx.models.DxFeedData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: CryptoInputRowCurrencyToggle.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CurrencySwitcherState;", "", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "getLabel", "()Ljava/lang/String;", "Asset", DxFeedData.TYPE_QUOTE, "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CurrencySwitcherState$Asset;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CurrencySwitcherState$Quote;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CurrencySwitcherState, reason: use source file name */
/* loaded from: classes12.dex */
public abstract class CryptoInputRowCurrencyToggle4 {
    public static final int $stable = 0;

    public /* synthetic */ CryptoInputRowCurrencyToggle4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getLabel();

    private CryptoInputRowCurrencyToggle4() {
    }

    /* compiled from: CryptoInputRowCurrencyToggle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CurrencySwitcherState$Asset;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CurrencySwitcherState;", AnnotatedPrivateKey.LABEL, "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CurrencySwitcherState$Asset, reason: from toString */
    public static final /* data */ class Asset extends CryptoInputRowCurrencyToggle4 {
        public static final int $stable = 0;
        private final String label;

        public static /* synthetic */ Asset copy$default(Asset asset, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = asset.label;
            }
            return asset.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final Asset copy(String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new Asset(label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Asset) && Intrinsics.areEqual(this.label, ((Asset) other).label);
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return "Asset(label=" + this.label + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Asset(String label) {
            super(null);
            Intrinsics.checkNotNullParameter(label, "label");
            this.label = label;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoInputRowCurrencyToggle4
        public String getLabel() {
            return this.label;
        }
    }

    /* compiled from: CryptoInputRowCurrencyToggle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CurrencySwitcherState$Quote;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CurrencySwitcherState;", AnnotatedPrivateKey.LABEL, "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CurrencySwitcherState$Quote, reason: from toString */
    public static final /* data */ class Quote extends CryptoInputRowCurrencyToggle4 {
        public static final int $stable = 0;
        private final String label;

        public static /* synthetic */ Quote copy$default(Quote quote, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = quote.label;
            }
            return quote.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final Quote copy(String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new Quote(label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Quote) && Intrinsics.areEqual(this.label, ((Quote) other).label);
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return "Quote(label=" + this.label + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Quote(String label) {
            super(null);
            Intrinsics.checkNotNullParameter(label, "label");
            this.label = label;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoInputRowCurrencyToggle4
        public String getLabel() {
            return this.label;
        }
    }
}
