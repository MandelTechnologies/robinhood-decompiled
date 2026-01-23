package com.robinhood.android.debitcard.linking.p098ui;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardVerificationLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingViewState;", "", "debitCardInstrumentId", "Ljava/util/UUID;", "verificationFailedError", "", "verifyOnly", "", "<init>", "(Ljava/util/UUID;Ljava/lang/Throwable;Z)V", "getDebitCardInstrumentId", "()Ljava/util/UUID;", "getVerificationFailedError", "()Ljava/lang/Throwable;", "getVerifyOnly", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DebitCardVerificationLoadingViewState {
    public static final int $stable = 8;
    private final UUID debitCardInstrumentId;
    private final Throwable verificationFailedError;
    private final boolean verifyOnly;

    public DebitCardVerificationLoadingViewState() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ DebitCardVerificationLoadingViewState copy$default(DebitCardVerificationLoadingViewState debitCardVerificationLoadingViewState, UUID uuid, Throwable th, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = debitCardVerificationLoadingViewState.debitCardInstrumentId;
        }
        if ((i & 2) != 0) {
            th = debitCardVerificationLoadingViewState.verificationFailedError;
        }
        if ((i & 4) != 0) {
            z = debitCardVerificationLoadingViewState.verifyOnly;
        }
        return debitCardVerificationLoadingViewState.copy(uuid, th, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getDebitCardInstrumentId() {
        return this.debitCardInstrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getVerificationFailedError() {
        return this.verificationFailedError;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getVerifyOnly() {
        return this.verifyOnly;
    }

    public final DebitCardVerificationLoadingViewState copy(UUID debitCardInstrumentId, Throwable verificationFailedError, boolean verifyOnly) {
        return new DebitCardVerificationLoadingViewState(debitCardInstrumentId, verificationFailedError, verifyOnly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DebitCardVerificationLoadingViewState)) {
            return false;
        }
        DebitCardVerificationLoadingViewState debitCardVerificationLoadingViewState = (DebitCardVerificationLoadingViewState) other;
        return Intrinsics.areEqual(this.debitCardInstrumentId, debitCardVerificationLoadingViewState.debitCardInstrumentId) && Intrinsics.areEqual(this.verificationFailedError, debitCardVerificationLoadingViewState.verificationFailedError) && this.verifyOnly == debitCardVerificationLoadingViewState.verifyOnly;
    }

    public int hashCode() {
        UUID uuid = this.debitCardInstrumentId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        Throwable th = this.verificationFailedError;
        return ((iHashCode + (th != null ? th.hashCode() : 0)) * 31) + Boolean.hashCode(this.verifyOnly);
    }

    public String toString() {
        return "DebitCardVerificationLoadingViewState(debitCardInstrumentId=" + this.debitCardInstrumentId + ", verificationFailedError=" + this.verificationFailedError + ", verifyOnly=" + this.verifyOnly + ")";
    }

    public DebitCardVerificationLoadingViewState(UUID uuid, Throwable th, boolean z) {
        this.debitCardInstrumentId = uuid;
        this.verificationFailedError = th;
        this.verifyOnly = z;
    }

    public /* synthetic */ DebitCardVerificationLoadingViewState(UUID uuid, Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : th, (i & 4) != 0 ? false : z);
    }

    public final UUID getDebitCardInstrumentId() {
        return this.debitCardInstrumentId;
    }

    public final Throwable getVerificationFailedError() {
        return this.verificationFailedError;
    }

    public final boolean getVerifyOnly() {
        return this.verifyOnly;
    }
}
