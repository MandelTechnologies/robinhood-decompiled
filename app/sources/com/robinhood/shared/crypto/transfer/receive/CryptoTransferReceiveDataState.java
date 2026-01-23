package com.robinhood.shared.crypto.transfer.receive;

import com.robinhood.models.api.transfer.ApiCryptoTransferDepositDetails;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferReceiveDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JR\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000f¨\u0006'"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDataState;", "", "isRhc", "", "selectedNetworkIndex", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoTransferConfig", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "depositDetails", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails;", "hasShownInitialWarningSheet", "<init>", "(ZLjava/lang/Integer;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails;Z)V", "()Z", "getSelectedNetworkIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCryptoTransferConfig", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "getDepositDetails", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails;", "getHasShownInitialWarningSheet", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Integer;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails;Z)Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDataState;", "equals", "other", "hashCode", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferReceiveDataState {
    public static final int $stable = 8;
    private final CryptoTransferConfig cryptoTransferConfig;
    private final ApiCryptoTransferDepositDetails depositDetails;
    private final boolean hasShownInitialWarningSheet;
    private final boolean isRhc;
    private final Integer selectedNetworkIndex;
    private final UiCurrencyPair uiCurrencyPair;

    public CryptoTransferReceiveDataState() {
        this(false, null, null, null, null, false, 63, null);
    }

    public static /* synthetic */ CryptoTransferReceiveDataState copy$default(CryptoTransferReceiveDataState cryptoTransferReceiveDataState, boolean z, Integer num, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, ApiCryptoTransferDepositDetails apiCryptoTransferDepositDetails, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cryptoTransferReceiveDataState.isRhc;
        }
        if ((i & 2) != 0) {
            num = cryptoTransferReceiveDataState.selectedNetworkIndex;
        }
        if ((i & 4) != 0) {
            uiCurrencyPair = cryptoTransferReceiveDataState.uiCurrencyPair;
        }
        if ((i & 8) != 0) {
            cryptoTransferConfig = cryptoTransferReceiveDataState.cryptoTransferConfig;
        }
        if ((i & 16) != 0) {
            apiCryptoTransferDepositDetails = cryptoTransferReceiveDataState.depositDetails;
        }
        if ((i & 32) != 0) {
            z2 = cryptoTransferReceiveDataState.hasShownInitialWarningSheet;
        }
        ApiCryptoTransferDepositDetails apiCryptoTransferDepositDetails2 = apiCryptoTransferDepositDetails;
        boolean z3 = z2;
        return cryptoTransferReceiveDataState.copy(z, num, uiCurrencyPair, cryptoTransferConfig, apiCryptoTransferDepositDetails2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRhc() {
        return this.isRhc;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getSelectedNetworkIndex() {
        return this.selectedNetworkIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    /* renamed from: component4, reason: from getter */
    public final CryptoTransferConfig getCryptoTransferConfig() {
        return this.cryptoTransferConfig;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiCryptoTransferDepositDetails getDepositDetails() {
        return this.depositDetails;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasShownInitialWarningSheet() {
        return this.hasShownInitialWarningSheet;
    }

    public final CryptoTransferReceiveDataState copy(boolean isRhc, Integer selectedNetworkIndex, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, ApiCryptoTransferDepositDetails depositDetails, boolean hasShownInitialWarningSheet) {
        return new CryptoTransferReceiveDataState(isRhc, selectedNetworkIndex, uiCurrencyPair, cryptoTransferConfig, depositDetails, hasShownInitialWarningSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferReceiveDataState)) {
            return false;
        }
        CryptoTransferReceiveDataState cryptoTransferReceiveDataState = (CryptoTransferReceiveDataState) other;
        return this.isRhc == cryptoTransferReceiveDataState.isRhc && Intrinsics.areEqual(this.selectedNetworkIndex, cryptoTransferReceiveDataState.selectedNetworkIndex) && Intrinsics.areEqual(this.uiCurrencyPair, cryptoTransferReceiveDataState.uiCurrencyPair) && Intrinsics.areEqual(this.cryptoTransferConfig, cryptoTransferReceiveDataState.cryptoTransferConfig) && Intrinsics.areEqual(this.depositDetails, cryptoTransferReceiveDataState.depositDetails) && this.hasShownInitialWarningSheet == cryptoTransferReceiveDataState.hasShownInitialWarningSheet;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isRhc) * 31;
        Integer num = this.selectedNetworkIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
        int iHashCode3 = (iHashCode2 + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31;
        CryptoTransferConfig cryptoTransferConfig = this.cryptoTransferConfig;
        int iHashCode4 = (iHashCode3 + (cryptoTransferConfig == null ? 0 : cryptoTransferConfig.hashCode())) * 31;
        ApiCryptoTransferDepositDetails apiCryptoTransferDepositDetails = this.depositDetails;
        return ((iHashCode4 + (apiCryptoTransferDepositDetails != null ? apiCryptoTransferDepositDetails.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasShownInitialWarningSheet);
    }

    public String toString() {
        return "CryptoTransferReceiveDataState(isRhc=" + this.isRhc + ", selectedNetworkIndex=" + this.selectedNetworkIndex + ", uiCurrencyPair=" + this.uiCurrencyPair + ", cryptoTransferConfig=" + this.cryptoTransferConfig + ", depositDetails=" + this.depositDetails + ", hasShownInitialWarningSheet=" + this.hasShownInitialWarningSheet + ")";
    }

    public CryptoTransferReceiveDataState(boolean z, Integer num, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, ApiCryptoTransferDepositDetails apiCryptoTransferDepositDetails, boolean z2) {
        this.isRhc = z;
        this.selectedNetworkIndex = num;
        this.uiCurrencyPair = uiCurrencyPair;
        this.cryptoTransferConfig = cryptoTransferConfig;
        this.depositDetails = apiCryptoTransferDepositDetails;
        this.hasShownInitialWarningSheet = z2;
    }

    public /* synthetic */ CryptoTransferReceiveDataState(boolean z, Integer num, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, ApiCryptoTransferDepositDetails apiCryptoTransferDepositDetails, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : uiCurrencyPair, (i & 8) != 0 ? null : cryptoTransferConfig, (i & 16) != 0 ? null : apiCryptoTransferDepositDetails, (i & 32) != 0 ? false : z2);
    }

    public final boolean isRhc() {
        return this.isRhc;
    }

    public final Integer getSelectedNetworkIndex() {
        return this.selectedNetworkIndex;
    }

    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    public final CryptoTransferConfig getCryptoTransferConfig() {
        return this.cryptoTransferConfig;
    }

    public final ApiCryptoTransferDepositDetails getDepositDetails() {
        return this.depositDetails;
    }

    public final boolean getHasShownInitialWarningSheet() {
        return this.hasShownInitialWarningSheet;
    }
}
