package com.robinhood.shared.crypto.transfer.enrollment.mfa;

import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoTransferEnrollmentMfaViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaViewState;", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "subtitleRes", "helperTextRes", "mfaRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/MfaRow;", "areButtonsLoading", "", "<init>", "(IILjava/lang/Integer;Lkotlinx/collections/immutable/ImmutableList;Z)V", "getTitleRes", "()I", "getSubtitleRes", "getHelperTextRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMfaRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getAreButtonsLoading", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(IILjava/lang/Integer;Lkotlinx/collections/immutable/ImmutableList;Z)Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaViewState;", "equals", "other", "hashCode", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferEnrollmentMfaViewState {
    public static final int $stable = 0;
    private final boolean areButtonsLoading;
    private final Integer helperTextRes;
    private final ImmutableList<MfaRow> mfaRows;
    private final int subtitleRes;
    private final int titleRes;

    public static /* synthetic */ CryptoTransferEnrollmentMfaViewState copy$default(CryptoTransferEnrollmentMfaViewState cryptoTransferEnrollmentMfaViewState, int i, int i2, Integer num, ImmutableList immutableList, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cryptoTransferEnrollmentMfaViewState.titleRes;
        }
        if ((i3 & 2) != 0) {
            i2 = cryptoTransferEnrollmentMfaViewState.subtitleRes;
        }
        if ((i3 & 4) != 0) {
            num = cryptoTransferEnrollmentMfaViewState.helperTextRes;
        }
        if ((i3 & 8) != 0) {
            immutableList = cryptoTransferEnrollmentMfaViewState.mfaRows;
        }
        if ((i3 & 16) != 0) {
            z = cryptoTransferEnrollmentMfaViewState.areButtonsLoading;
        }
        boolean z2 = z;
        Integer num2 = num;
        return cryptoTransferEnrollmentMfaViewState.copy(i, i2, num2, immutableList, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSubtitleRes() {
        return this.subtitleRes;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getHelperTextRes() {
        return this.helperTextRes;
    }

    public final ImmutableList<MfaRow> component4() {
        return this.mfaRows;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAreButtonsLoading() {
        return this.areButtonsLoading;
    }

    public final CryptoTransferEnrollmentMfaViewState copy(int titleRes, int subtitleRes, Integer helperTextRes, ImmutableList<MfaRow> mfaRows, boolean areButtonsLoading) {
        Intrinsics.checkNotNullParameter(mfaRows, "mfaRows");
        return new CryptoTransferEnrollmentMfaViewState(titleRes, subtitleRes, helperTextRes, mfaRows, areButtonsLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferEnrollmentMfaViewState)) {
            return false;
        }
        CryptoTransferEnrollmentMfaViewState cryptoTransferEnrollmentMfaViewState = (CryptoTransferEnrollmentMfaViewState) other;
        return this.titleRes == cryptoTransferEnrollmentMfaViewState.titleRes && this.subtitleRes == cryptoTransferEnrollmentMfaViewState.subtitleRes && Intrinsics.areEqual(this.helperTextRes, cryptoTransferEnrollmentMfaViewState.helperTextRes) && Intrinsics.areEqual(this.mfaRows, cryptoTransferEnrollmentMfaViewState.mfaRows) && this.areButtonsLoading == cryptoTransferEnrollmentMfaViewState.areButtonsLoading;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.titleRes) * 31) + Integer.hashCode(this.subtitleRes)) * 31;
        Integer num = this.helperTextRes;
        return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.mfaRows.hashCode()) * 31) + Boolean.hashCode(this.areButtonsLoading);
    }

    public String toString() {
        return "CryptoTransferEnrollmentMfaViewState(titleRes=" + this.titleRes + ", subtitleRes=" + this.subtitleRes + ", helperTextRes=" + this.helperTextRes + ", mfaRows=" + this.mfaRows + ", areButtonsLoading=" + this.areButtonsLoading + ")";
    }

    public CryptoTransferEnrollmentMfaViewState(int i, int i2, Integer num, ImmutableList<MfaRow> mfaRows, boolean z) {
        Intrinsics.checkNotNullParameter(mfaRows, "mfaRows");
        this.titleRes = i;
        this.subtitleRes = i2;
        this.helperTextRes = num;
        this.mfaRows = mfaRows;
        this.areButtonsLoading = z;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final int getSubtitleRes() {
        return this.subtitleRes;
    }

    public final Integer getHelperTextRes() {
        return this.helperTextRes;
    }

    public final ImmutableList<MfaRow> getMfaRows() {
        return this.mfaRows;
    }

    public final boolean getAreButtonsLoading() {
        return this.areButtonsLoading;
    }
}
