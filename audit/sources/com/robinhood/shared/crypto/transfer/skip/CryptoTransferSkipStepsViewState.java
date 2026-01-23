package com.robinhood.shared.crypto.transfer.skip;

import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSkipStepsViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/skip/CryptoTransferSkipStepsViewState;", "", "loadingCompletedUiEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/shared/crypto/transfer/skip/CryptoTransferSkipStepsViewState$SkipStepsData;", "errorUiEvent", "", "<init>", "(Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getLoadingCompletedUiEvent", "()Lcom/robinhood/udf/UiEvent;", "getErrorUiEvent", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SkipStepsData", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferSkipStepsViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> errorUiEvent;
    private final UiEvent<SkipStepsData> loadingCompletedUiEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoTransferSkipStepsViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoTransferSkipStepsViewState copy$default(CryptoTransferSkipStepsViewState cryptoTransferSkipStepsViewState, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEvent = cryptoTransferSkipStepsViewState.loadingCompletedUiEvent;
        }
        if ((i & 2) != 0) {
            uiEvent2 = cryptoTransferSkipStepsViewState.errorUiEvent;
        }
        return cryptoTransferSkipStepsViewState.copy(uiEvent, uiEvent2);
    }

    public final UiEvent<SkipStepsData> component1() {
        return this.loadingCompletedUiEvent;
    }

    public final UiEvent<Throwable> component2() {
        return this.errorUiEvent;
    }

    public final CryptoTransferSkipStepsViewState copy(UiEvent<SkipStepsData> loadingCompletedUiEvent, UiEvent<Throwable> errorUiEvent) {
        return new CryptoTransferSkipStepsViewState(loadingCompletedUiEvent, errorUiEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferSkipStepsViewState)) {
            return false;
        }
        CryptoTransferSkipStepsViewState cryptoTransferSkipStepsViewState = (CryptoTransferSkipStepsViewState) other;
        return Intrinsics.areEqual(this.loadingCompletedUiEvent, cryptoTransferSkipStepsViewState.loadingCompletedUiEvent) && Intrinsics.areEqual(this.errorUiEvent, cryptoTransferSkipStepsViewState.errorUiEvent);
    }

    public int hashCode() {
        UiEvent<SkipStepsData> uiEvent = this.loadingCompletedUiEvent;
        int iHashCode = (uiEvent == null ? 0 : uiEvent.hashCode()) * 31;
        UiEvent<Throwable> uiEvent2 = this.errorUiEvent;
        return iHashCode + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "CryptoTransferSkipStepsViewState(loadingCompletedUiEvent=" + this.loadingCompletedUiEvent + ", errorUiEvent=" + this.errorUiEvent + ")";
    }

    public CryptoTransferSkipStepsViewState(UiEvent<SkipStepsData> uiEvent, UiEvent<Throwable> uiEvent2) {
        this.loadingCompletedUiEvent = uiEvent;
        this.errorUiEvent = uiEvent2;
    }

    public /* synthetic */ CryptoTransferSkipStepsViewState(UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEvent, (i & 2) != 0 ? null : uiEvent2);
    }

    public final UiEvent<SkipStepsData> getLoadingCompletedUiEvent() {
        return this.loadingCompletedUiEvent;
    }

    public final UiEvent<Throwable> getErrorUiEvent() {
        return this.errorUiEvent;
    }

    /* compiled from: CryptoTransferSkipStepsViewState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/skip/CryptoTransferSkipStepsViewState$SkipStepsData;", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoTransferConfig", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "supportedNetworks", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;", "preselectedNetwork", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCryptoTransferConfig", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "getSupportedNetworks", "()Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;", "getPreselectedNetwork", "()Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SkipStepsData {
        public static final int $stable = 8;
        private final CryptoTransferConfig cryptoTransferConfig;
        private final ApiCryptoSupportedNetworks.CryptoNetwork preselectedNetwork;
        private final ApiCryptoSupportedNetworks supportedNetworks;
        private final UiCurrencyPair uiCurrencyPair;

        public static /* synthetic */ SkipStepsData copy$default(SkipStepsData skipStepsData, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, ApiCryptoSupportedNetworks apiCryptoSupportedNetworks, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCurrencyPair = skipStepsData.uiCurrencyPair;
            }
            if ((i & 2) != 0) {
                cryptoTransferConfig = skipStepsData.cryptoTransferConfig;
            }
            if ((i & 4) != 0) {
                apiCryptoSupportedNetworks = skipStepsData.supportedNetworks;
            }
            if ((i & 8) != 0) {
                cryptoNetwork = skipStepsData.preselectedNetwork;
            }
            return skipStepsData.copy(uiCurrencyPair, cryptoTransferConfig, apiCryptoSupportedNetworks, cryptoNetwork);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoTransferConfig getCryptoTransferConfig() {
            return this.cryptoTransferConfig;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiCryptoSupportedNetworks getSupportedNetworks() {
            return this.supportedNetworks;
        }

        /* renamed from: component4, reason: from getter */
        public final ApiCryptoSupportedNetworks.CryptoNetwork getPreselectedNetwork() {
            return this.preselectedNetwork;
        }

        public final SkipStepsData copy(UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, ApiCryptoSupportedNetworks supportedNetworks, ApiCryptoSupportedNetworks.CryptoNetwork preselectedNetwork) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(cryptoTransferConfig, "cryptoTransferConfig");
            Intrinsics.checkNotNullParameter(supportedNetworks, "supportedNetworks");
            Intrinsics.checkNotNullParameter(preselectedNetwork, "preselectedNetwork");
            return new SkipStepsData(uiCurrencyPair, cryptoTransferConfig, supportedNetworks, preselectedNetwork);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SkipStepsData)) {
                return false;
            }
            SkipStepsData skipStepsData = (SkipStepsData) other;
            return Intrinsics.areEqual(this.uiCurrencyPair, skipStepsData.uiCurrencyPair) && Intrinsics.areEqual(this.cryptoTransferConfig, skipStepsData.cryptoTransferConfig) && Intrinsics.areEqual(this.supportedNetworks, skipStepsData.supportedNetworks) && Intrinsics.areEqual(this.preselectedNetwork, skipStepsData.preselectedNetwork);
        }

        public int hashCode() {
            return (((((this.uiCurrencyPair.hashCode() * 31) + this.cryptoTransferConfig.hashCode()) * 31) + this.supportedNetworks.hashCode()) * 31) + this.preselectedNetwork.hashCode();
        }

        public String toString() {
            return "SkipStepsData(uiCurrencyPair=" + this.uiCurrencyPair + ", cryptoTransferConfig=" + this.cryptoTransferConfig + ", supportedNetworks=" + this.supportedNetworks + ", preselectedNetwork=" + this.preselectedNetwork + ")";
        }

        public SkipStepsData(UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, ApiCryptoSupportedNetworks supportedNetworks, ApiCryptoSupportedNetworks.CryptoNetwork preselectedNetwork) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(cryptoTransferConfig, "cryptoTransferConfig");
            Intrinsics.checkNotNullParameter(supportedNetworks, "supportedNetworks");
            Intrinsics.checkNotNullParameter(preselectedNetwork, "preselectedNetwork");
            this.uiCurrencyPair = uiCurrencyPair;
            this.cryptoTransferConfig = cryptoTransferConfig;
            this.supportedNetworks = supportedNetworks;
            this.preselectedNetwork = preselectedNetwork;
        }

        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        public final CryptoTransferConfig getCryptoTransferConfig() {
            return this.cryptoTransferConfig;
        }

        public final ApiCryptoSupportedNetworks getSupportedNetworks() {
            return this.supportedNetworks;
        }

        public final ApiCryptoSupportedNetworks.CryptoNetwork getPreselectedNetwork() {
            return this.preselectedNetwork;
        }
    }
}
