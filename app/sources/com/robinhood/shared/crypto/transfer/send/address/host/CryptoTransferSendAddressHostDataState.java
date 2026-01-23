package com.robinhood.shared.crypto.transfer.send.address.host;

import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendAddressHostDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÂ\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0004\b\u0018\u0010\fJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0004\b\u001a\u0010\fJ\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JD\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058AX\u0080\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058AX\u0080\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDataState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "isSavedAddressesExperimentEnabled", "", "isAllowlistExperimentEnabled", "isAllowlistTurnedOn", "isProtectionSheetLoading", "<init>", "(Lcom/robinhood/shared/app/type/AppType;ZLjava/lang/Boolean;Ljava/lang/Boolean;Z)V", "isAllowlistExperimentEnabled$feature_crypto_transfer_externalDebug", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isAllowlistTurnedOn$feature_crypto_transfer_externalDebug", "()Z", "isRhc", "entryType", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostViewState$EntryType;", "getEntryType", "()Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostViewState$EntryType;", "component1", "component2", "component3", "component3$feature_crypto_transfer_externalDebug", "component4", "component4$feature_crypto_transfer_externalDebug", "component5", "copy", "(Lcom/robinhood/shared/app/type/AppType;ZLjava/lang/Boolean;Ljava/lang/Boolean;Z)Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDataState;", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferSendAddressHostDataState {
    public static final int $stable = 0;
    private final AppType appType;
    private final Boolean isAllowlistExperimentEnabled;
    private final Boolean isAllowlistTurnedOn;
    private final boolean isProtectionSheetLoading;
    private final boolean isSavedAddressesExperimentEnabled;

    /* renamed from: component1, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getIsSavedAddressesExperimentEnabled() {
        return this.isSavedAddressesExperimentEnabled;
    }

    public static /* synthetic */ CryptoTransferSendAddressHostDataState copy$default(CryptoTransferSendAddressHostDataState cryptoTransferSendAddressHostDataState, AppType appType, boolean z, Boolean bool, Boolean bool2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = cryptoTransferSendAddressHostDataState.appType;
        }
        if ((i & 2) != 0) {
            z = cryptoTransferSendAddressHostDataState.isSavedAddressesExperimentEnabled;
        }
        if ((i & 4) != 0) {
            bool = cryptoTransferSendAddressHostDataState.isAllowlistExperimentEnabled;
        }
        if ((i & 8) != 0) {
            bool2 = cryptoTransferSendAddressHostDataState.isAllowlistTurnedOn;
        }
        if ((i & 16) != 0) {
            z2 = cryptoTransferSendAddressHostDataState.isProtectionSheetLoading;
        }
        boolean z3 = z2;
        Boolean bool3 = bool;
        return cryptoTransferSendAddressHostDataState.copy(appType, z, bool3, bool2, z3);
    }

    /* renamed from: component3$feature_crypto_transfer_externalDebug, reason: from getter */
    public final Boolean getIsAllowlistExperimentEnabled() {
        return this.isAllowlistExperimentEnabled;
    }

    /* renamed from: component4$feature_crypto_transfer_externalDebug, reason: from getter */
    public final Boolean getIsAllowlistTurnedOn() {
        return this.isAllowlistTurnedOn;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsProtectionSheetLoading() {
        return this.isProtectionSheetLoading;
    }

    public final CryptoTransferSendAddressHostDataState copy(AppType appType, boolean isSavedAddressesExperimentEnabled, Boolean isAllowlistExperimentEnabled, Boolean isAllowlistTurnedOn, boolean isProtectionSheetLoading) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new CryptoTransferSendAddressHostDataState(appType, isSavedAddressesExperimentEnabled, isAllowlistExperimentEnabled, isAllowlistTurnedOn, isProtectionSheetLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferSendAddressHostDataState)) {
            return false;
        }
        CryptoTransferSendAddressHostDataState cryptoTransferSendAddressHostDataState = (CryptoTransferSendAddressHostDataState) other;
        return this.appType == cryptoTransferSendAddressHostDataState.appType && this.isSavedAddressesExperimentEnabled == cryptoTransferSendAddressHostDataState.isSavedAddressesExperimentEnabled && Intrinsics.areEqual(this.isAllowlistExperimentEnabled, cryptoTransferSendAddressHostDataState.isAllowlistExperimentEnabled) && Intrinsics.areEqual(this.isAllowlistTurnedOn, cryptoTransferSendAddressHostDataState.isAllowlistTurnedOn) && this.isProtectionSheetLoading == cryptoTransferSendAddressHostDataState.isProtectionSheetLoading;
    }

    public int hashCode() {
        int iHashCode = ((this.appType.hashCode() * 31) + Boolean.hashCode(this.isSavedAddressesExperimentEnabled)) * 31;
        Boolean bool = this.isAllowlistExperimentEnabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAllowlistTurnedOn;
        return ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isProtectionSheetLoading);
    }

    public String toString() {
        return "CryptoTransferSendAddressHostDataState(appType=" + this.appType + ", isSavedAddressesExperimentEnabled=" + this.isSavedAddressesExperimentEnabled + ", isAllowlistExperimentEnabled=" + this.isAllowlistExperimentEnabled + ", isAllowlistTurnedOn=" + this.isAllowlistTurnedOn + ", isProtectionSheetLoading=" + this.isProtectionSheetLoading + ")";
    }

    public CryptoTransferSendAddressHostDataState(AppType appType, boolean z, Boolean bool, Boolean bool2, boolean z2) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
        this.isSavedAddressesExperimentEnabled = z;
        this.isAllowlistExperimentEnabled = bool;
        this.isAllowlistTurnedOn = bool2;
        this.isProtectionSheetLoading = z2;
    }

    public /* synthetic */ CryptoTransferSendAddressHostDataState(AppType appType, boolean z, Boolean bool, Boolean bool2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? false : z2);
    }

    /* renamed from: isAllowlistExperimentEnabled$feature_crypto_transfer_externalDebug */
    public final Boolean m2786x301ac76c() {
        return this.isAllowlistExperimentEnabled;
    }

    public final Boolean isAllowlistTurnedOn$feature_crypto_transfer_externalDebug() {
        return this.isAllowlistTurnedOn;
    }

    public final boolean isProtectionSheetLoading() {
        return this.isProtectionSheetLoading;
    }

    public final boolean isRhc() {
        return this.appType == AppType.RHC;
    }

    public final CryptoTransferSendAddressHostViewState.EntryType getEntryType() {
        if (!this.isSavedAddressesExperimentEnabled) {
            return CryptoTransferSendAddressHostViewState.EntryType.DEFAULT;
        }
        Boolean bool = this.isAllowlistExperimentEnabled;
        if (bool == null) {
            return CryptoTransferSendAddressHostViewState.EntryType.LOADING;
        }
        if (!bool.booleanValue()) {
            return CryptoTransferSendAddressHostViewState.EntryType.SAVED_ADDRESS;
        }
        Boolean bool2 = this.isAllowlistTurnedOn;
        return bool2 == null ? CryptoTransferSendAddressHostViewState.EntryType.LOADING : !bool2.booleanValue() ? CryptoTransferSendAddressHostViewState.EntryType.SAVED_ADDRESS : CryptoTransferSendAddressHostViewState.EntryType.ALLOWLIST;
    }
}
