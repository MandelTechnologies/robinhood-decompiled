package com.robinhood.shared.crypto.transfer.enrollment.mfa;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;

/* compiled from: CryptoTransferEnrollmentMfaDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/MfaRow;", "", "isCompleted", "", "primaryTextRes", "", "secondaryTextRes", "<init>", "(ZII)V", "getPrimaryTextRes", "()I", "getSecondaryTextRes", "leadingIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getLeadingIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MfaRow {
    public static final int $stable = 0;
    private final boolean isCompleted;
    private final ServerToBentoAssetMapper2 leadingIcon;
    private final int primaryTextRes;
    private final int secondaryTextRes;

    /* renamed from: component1, reason: from getter */
    private final boolean getIsCompleted() {
        return this.isCompleted;
    }

    public static /* synthetic */ MfaRow copy$default(MfaRow mfaRow, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = mfaRow.isCompleted;
        }
        if ((i3 & 2) != 0) {
            i = mfaRow.primaryTextRes;
        }
        if ((i3 & 4) != 0) {
            i2 = mfaRow.secondaryTextRes;
        }
        return mfaRow.copy(z, i, i2);
    }

    /* renamed from: component2, reason: from getter */
    public final int getPrimaryTextRes() {
        return this.primaryTextRes;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSecondaryTextRes() {
        return this.secondaryTextRes;
    }

    public final MfaRow copy(boolean isCompleted, int primaryTextRes, int secondaryTextRes) {
        return new MfaRow(isCompleted, primaryTextRes, secondaryTextRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MfaRow)) {
            return false;
        }
        MfaRow mfaRow = (MfaRow) other;
        return this.isCompleted == mfaRow.isCompleted && this.primaryTextRes == mfaRow.primaryTextRes && this.secondaryTextRes == mfaRow.secondaryTextRes;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isCompleted) * 31) + Integer.hashCode(this.primaryTextRes)) * 31) + Integer.hashCode(this.secondaryTextRes);
    }

    public String toString() {
        return "MfaRow(isCompleted=" + this.isCompleted + ", primaryTextRes=" + this.primaryTextRes + ", secondaryTextRes=" + this.secondaryTextRes + ")";
    }

    public MfaRow(boolean z, int i, int i2) {
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        this.isCompleted = z;
        this.primaryTextRes = i;
        this.secondaryTextRes = i2;
        if (z) {
            serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.BUBBLE_CHECKED_24;
        } else {
            serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.DOT_24;
        }
        this.leadingIcon = serverToBentoAssetMapper2;
    }

    public final int getPrimaryTextRes() {
        return this.primaryTextRes;
    }

    public final int getSecondaryTextRes() {
        return this.secondaryTextRes;
    }

    public final ServerToBentoAssetMapper2 getLeadingIcon() {
        return this.leadingIcon;
    }
}
