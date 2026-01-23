package com.robinhood.shared.crypto.transfer.unified;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferQrScannerComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\f\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/QrScannerState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "useSavedAddressesFlow", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Z)V", "getUseSavedAddressesFlow", "()Z", "shouldShowManualEntryAsFooterButton", "getShouldShowManualEntryAsFooterButton", "displayTitle", "getDisplayTitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class QrScannerState {
    public static final int $stable = StringResource.$stable;
    private final StringResource title;
    private final boolean useSavedAddressesFlow;

    /* renamed from: component1, reason: from getter */
    private final StringResource getTitle() {
        return this.title;
    }

    public static /* synthetic */ QrScannerState copy$default(QrScannerState qrScannerState, StringResource stringResource, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = qrScannerState.title;
        }
        if ((i & 2) != 0) {
            z = qrScannerState.useSavedAddressesFlow;
        }
        return qrScannerState.copy(stringResource, z);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getUseSavedAddressesFlow() {
        return this.useSavedAddressesFlow;
    }

    public final QrScannerState copy(StringResource title, boolean useSavedAddressesFlow) {
        return new QrScannerState(title, useSavedAddressesFlow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrScannerState)) {
            return false;
        }
        QrScannerState qrScannerState = (QrScannerState) other;
        return Intrinsics.areEqual(this.title, qrScannerState.title) && this.useSavedAddressesFlow == qrScannerState.useSavedAddressesFlow;
    }

    public int hashCode() {
        StringResource stringResource = this.title;
        return ((stringResource == null ? 0 : stringResource.hashCode()) * 31) + Boolean.hashCode(this.useSavedAddressesFlow);
    }

    public String toString() {
        return "QrScannerState(title=" + this.title + ", useSavedAddressesFlow=" + this.useSavedAddressesFlow + ")";
    }

    public QrScannerState(StringResource stringResource, boolean z) {
        this.title = stringResource;
        this.useSavedAddressesFlow = z;
    }

    public final boolean getUseSavedAddressesFlow() {
        return this.useSavedAddressesFlow;
    }

    public final boolean getShouldShowManualEntryAsFooterButton() {
        return !this.useSavedAddressesFlow;
    }

    public final StringResource getDisplayTitle() {
        StringResource stringResource = this.title;
        if (stringResource == null || this.useSavedAddressesFlow) {
            return null;
        }
        return stringResource;
    }
}
