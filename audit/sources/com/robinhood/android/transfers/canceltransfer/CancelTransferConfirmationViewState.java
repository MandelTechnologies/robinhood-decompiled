package com.robinhood.android.transfers.canceltransfer;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CancelTransferConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationViewState;", "", "isLoadingMessage", "", "message", "Lcom/robinhood/utils/resource/StringResource;", "isPrimaryButtonLoading", "isSecondaryButtonDisabled", "<init>", "(ZLcom/robinhood/utils/resource/StringResource;ZZ)V", "()Z", "getMessage", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CancelTransferConfirmationViewState {
    public static final int $stable = StringResource.$stable;
    private final boolean isLoadingMessage;
    private final boolean isPrimaryButtonLoading;
    private final boolean isSecondaryButtonDisabled;
    private final StringResource message;

    public static /* synthetic */ CancelTransferConfirmationViewState copy$default(CancelTransferConfirmationViewState cancelTransferConfirmationViewState, boolean z, StringResource stringResource, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cancelTransferConfirmationViewState.isLoadingMessage;
        }
        if ((i & 2) != 0) {
            stringResource = cancelTransferConfirmationViewState.message;
        }
        if ((i & 4) != 0) {
            z2 = cancelTransferConfirmationViewState.isPrimaryButtonLoading;
        }
        if ((i & 8) != 0) {
            z3 = cancelTransferConfirmationViewState.isSecondaryButtonDisabled;
        }
        return cancelTransferConfirmationViewState.copy(z, stringResource, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoadingMessage() {
        return this.isLoadingMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPrimaryButtonLoading() {
        return this.isPrimaryButtonLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSecondaryButtonDisabled() {
        return this.isSecondaryButtonDisabled;
    }

    public final CancelTransferConfirmationViewState copy(boolean isLoadingMessage, StringResource message, boolean isPrimaryButtonLoading, boolean isSecondaryButtonDisabled) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new CancelTransferConfirmationViewState(isLoadingMessage, message, isPrimaryButtonLoading, isSecondaryButtonDisabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelTransferConfirmationViewState)) {
            return false;
        }
        CancelTransferConfirmationViewState cancelTransferConfirmationViewState = (CancelTransferConfirmationViewState) other;
        return this.isLoadingMessage == cancelTransferConfirmationViewState.isLoadingMessage && Intrinsics.areEqual(this.message, cancelTransferConfirmationViewState.message) && this.isPrimaryButtonLoading == cancelTransferConfirmationViewState.isPrimaryButtonLoading && this.isSecondaryButtonDisabled == cancelTransferConfirmationViewState.isSecondaryButtonDisabled;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isLoadingMessage) * 31) + this.message.hashCode()) * 31) + Boolean.hashCode(this.isPrimaryButtonLoading)) * 31) + Boolean.hashCode(this.isSecondaryButtonDisabled);
    }

    public String toString() {
        return "CancelTransferConfirmationViewState(isLoadingMessage=" + this.isLoadingMessage + ", message=" + this.message + ", isPrimaryButtonLoading=" + this.isPrimaryButtonLoading + ", isSecondaryButtonDisabled=" + this.isSecondaryButtonDisabled + ")";
    }

    public CancelTransferConfirmationViewState(boolean z, StringResource message, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.isLoadingMessage = z;
        this.message = message;
        this.isPrimaryButtonLoading = z2;
        this.isSecondaryButtonDisabled = z3;
    }

    public final boolean isLoadingMessage() {
        return this.isLoadingMessage;
    }

    public final StringResource getMessage() {
        return this.message;
    }

    public final boolean isPrimaryButtonLoading() {
        return this.isPrimaryButtonLoading;
    }

    public final boolean isSecondaryButtonDisabled() {
        return this.isSecondaryButtonDisabled;
    }
}
