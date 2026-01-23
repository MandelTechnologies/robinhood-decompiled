package com.robinhood.shared.crypto.transfer.send.address.saved;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SaveAddressBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/saved/SaveAddressBottomSheetViewState;", "", "isSavingAddress", "", "isAllowlistEnabled", "<init>", "(ZZ)V", "()Z", "isCancelButtonEnabled", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SaveAddressBottomSheetViewState {
    public static final int $stable = 0;
    private final boolean isAllowlistEnabled;
    private final boolean isSavingAddress;

    /* JADX WARN: Illegal instructions before constructor call */
    public SaveAddressBottomSheetViewState() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static /* synthetic */ SaveAddressBottomSheetViewState copy$default(SaveAddressBottomSheetViewState saveAddressBottomSheetViewState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = saveAddressBottomSheetViewState.isSavingAddress;
        }
        if ((i & 2) != 0) {
            z2 = saveAddressBottomSheetViewState.isAllowlistEnabled;
        }
        return saveAddressBottomSheetViewState.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSavingAddress() {
        return this.isSavingAddress;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAllowlistEnabled() {
        return this.isAllowlistEnabled;
    }

    public final SaveAddressBottomSheetViewState copy(boolean isSavingAddress, boolean isAllowlistEnabled) {
        return new SaveAddressBottomSheetViewState(isSavingAddress, isAllowlistEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveAddressBottomSheetViewState)) {
            return false;
        }
        SaveAddressBottomSheetViewState saveAddressBottomSheetViewState = (SaveAddressBottomSheetViewState) other;
        return this.isSavingAddress == saveAddressBottomSheetViewState.isSavingAddress && this.isAllowlistEnabled == saveAddressBottomSheetViewState.isAllowlistEnabled;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isSavingAddress) * 31) + Boolean.hashCode(this.isAllowlistEnabled);
    }

    public String toString() {
        return "SaveAddressBottomSheetViewState(isSavingAddress=" + this.isSavingAddress + ", isAllowlistEnabled=" + this.isAllowlistEnabled + ")";
    }

    public SaveAddressBottomSheetViewState(boolean z, boolean z2) {
        this.isSavingAddress = z;
        this.isAllowlistEnabled = z2;
    }

    public /* synthetic */ SaveAddressBottomSheetViewState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public final boolean isSavingAddress() {
        return this.isSavingAddress;
    }

    public final boolean isAllowlistEnabled() {
        return this.isAllowlistEnabled;
    }

    public final boolean isCancelButtonEnabled() {
        return !this.isSavingAddress;
    }
}
