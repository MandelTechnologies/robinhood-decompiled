package com.robinhood.shared.crypto.transfer.send.landing;

import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendLandingDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDataState;", "", "isRhc", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoTransferConfig", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "supportedNetworks", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;", "useSavedAddressesFlow", "hasShownInitialWarningSheet", "<init>", "(ZLcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;ZZ)V", "()Z", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCryptoTransferConfig", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "getSupportedNetworks", "()Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;", "getUseSavedAddressesFlow", "getHasShownInitialWarningSheet", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferSendLandingDataState {
    public static final int $stable = 8;
    private final CryptoTransferConfig cryptoTransferConfig;
    private final boolean hasShownInitialWarningSheet;
    private final boolean isRhc;
    private final ApiCryptoSupportedNetworks supportedNetworks;
    private final UiCurrencyPair uiCurrencyPair;
    private final boolean useSavedAddressesFlow;

    public static /* synthetic */ CryptoTransferSendLandingDataState copy$default(CryptoTransferSendLandingDataState cryptoTransferSendLandingDataState, boolean z, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, ApiCryptoSupportedNetworks apiCryptoSupportedNetworks, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cryptoTransferSendLandingDataState.isRhc;
        }
        if ((i & 2) != 0) {
            uiCurrencyPair = cryptoTransferSendLandingDataState.uiCurrencyPair;
        }
        if ((i & 4) != 0) {
            cryptoTransferConfig = cryptoTransferSendLandingDataState.cryptoTransferConfig;
        }
        if ((i & 8) != 0) {
            apiCryptoSupportedNetworks = cryptoTransferSendLandingDataState.supportedNetworks;
        }
        if ((i & 16) != 0) {
            z2 = cryptoTransferSendLandingDataState.useSavedAddressesFlow;
        }
        if ((i & 32) != 0) {
            z3 = cryptoTransferSendLandingDataState.hasShownInitialWarningSheet;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        return cryptoTransferSendLandingDataState.copy(z, uiCurrencyPair, cryptoTransferConfig, apiCryptoSupportedNetworks, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRhc() {
        return this.isRhc;
    }

    /* renamed from: component2, reason: from getter */
    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoTransferConfig getCryptoTransferConfig() {
        return this.cryptoTransferConfig;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiCryptoSupportedNetworks getSupportedNetworks() {
        return this.supportedNetworks;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUseSavedAddressesFlow() {
        return this.useSavedAddressesFlow;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasShownInitialWarningSheet() {
        return this.hasShownInitialWarningSheet;
    }

    public final CryptoTransferSendLandingDataState copy(boolean isRhc, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, ApiCryptoSupportedNetworks supportedNetworks, boolean useSavedAddressesFlow, boolean hasShownInitialWarningSheet) {
        return new CryptoTransferSendLandingDataState(isRhc, uiCurrencyPair, cryptoTransferConfig, supportedNetworks, useSavedAddressesFlow, hasShownInitialWarningSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferSendLandingDataState)) {
            return false;
        }
        CryptoTransferSendLandingDataState cryptoTransferSendLandingDataState = (CryptoTransferSendLandingDataState) other;
        return this.isRhc == cryptoTransferSendLandingDataState.isRhc && Intrinsics.areEqual(this.uiCurrencyPair, cryptoTransferSendLandingDataState.uiCurrencyPair) && Intrinsics.areEqual(this.cryptoTransferConfig, cryptoTransferSendLandingDataState.cryptoTransferConfig) && Intrinsics.areEqual(this.supportedNetworks, cryptoTransferSendLandingDataState.supportedNetworks) && this.useSavedAddressesFlow == cryptoTransferSendLandingDataState.useSavedAddressesFlow && this.hasShownInitialWarningSheet == cryptoTransferSendLandingDataState.hasShownInitialWarningSheet;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isRhc) * 31;
        UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
        int iHashCode2 = (iHashCode + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31;
        CryptoTransferConfig cryptoTransferConfig = this.cryptoTransferConfig;
        int iHashCode3 = (iHashCode2 + (cryptoTransferConfig == null ? 0 : cryptoTransferConfig.hashCode())) * 31;
        ApiCryptoSupportedNetworks apiCryptoSupportedNetworks = this.supportedNetworks;
        return ((((iHashCode3 + (apiCryptoSupportedNetworks != null ? apiCryptoSupportedNetworks.hashCode() : 0)) * 31) + Boolean.hashCode(this.useSavedAddressesFlow)) * 31) + Boolean.hashCode(this.hasShownInitialWarningSheet);
    }

    public String toString() {
        return "CryptoTransferSendLandingDataState(isRhc=" + this.isRhc + ", uiCurrencyPair=" + this.uiCurrencyPair + ", cryptoTransferConfig=" + this.cryptoTransferConfig + ", supportedNetworks=" + this.supportedNetworks + ", useSavedAddressesFlow=" + this.useSavedAddressesFlow + ", hasShownInitialWarningSheet=" + this.hasShownInitialWarningSheet + ")";
    }

    public CryptoTransferSendLandingDataState(boolean z, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, ApiCryptoSupportedNetworks apiCryptoSupportedNetworks, boolean z2, boolean z3) {
        this.isRhc = z;
        this.uiCurrencyPair = uiCurrencyPair;
        this.cryptoTransferConfig = cryptoTransferConfig;
        this.supportedNetworks = apiCryptoSupportedNetworks;
        this.useSavedAddressesFlow = z2;
        this.hasShownInitialWarningSheet = z3;
    }

    public /* synthetic */ CryptoTransferSendLandingDataState(boolean z, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, ApiCryptoSupportedNetworks apiCryptoSupportedNetworks, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : uiCurrencyPair, (i & 4) != 0 ? null : cryptoTransferConfig, (i & 8) != 0 ? null : apiCryptoSupportedNetworks, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
    }

    public final boolean isRhc() {
        return this.isRhc;
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

    public final boolean getUseSavedAddressesFlow() {
        return this.useSavedAddressesFlow;
    }

    public final boolean getHasShownInitialWarningSheet() {
        return this.hasShownInitialWarningSheet;
    }
}
