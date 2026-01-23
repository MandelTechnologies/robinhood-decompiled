package com.robinhood.android.slip.onboarding.agreements.onclickagreement;

import com.robinhood.models.p355ui.UiSlipAgreements;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipOneClickAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementDataState;", "", "slipAgreements", "Lcom/robinhood/models/ui/UiSlipAgreements;", "exception", "", "<init>", "(Lcom/robinhood/models/ui/UiSlipAgreements;Ljava/lang/Throwable;)V", "getSlipAgreements", "()Lcom/robinhood/models/ui/UiSlipAgreements;", "getException", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SlipOneClickAgreementDataState {
    public static final int $stable = 8;
    private final Throwable exception;
    private final UiSlipAgreements slipAgreements;

    /* JADX WARN: Multi-variable type inference failed */
    public SlipOneClickAgreementDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SlipOneClickAgreementDataState copy$default(SlipOneClickAgreementDataState slipOneClickAgreementDataState, UiSlipAgreements uiSlipAgreements, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            uiSlipAgreements = slipOneClickAgreementDataState.slipAgreements;
        }
        if ((i & 2) != 0) {
            th = slipOneClickAgreementDataState.exception;
        }
        return slipOneClickAgreementDataState.copy(uiSlipAgreements, th);
    }

    /* renamed from: component1, reason: from getter */
    public final UiSlipAgreements getSlipAgreements() {
        return this.slipAgreements;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getException() {
        return this.exception;
    }

    public final SlipOneClickAgreementDataState copy(UiSlipAgreements slipAgreements, Throwable exception) {
        return new SlipOneClickAgreementDataState(slipAgreements, exception);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlipOneClickAgreementDataState)) {
            return false;
        }
        SlipOneClickAgreementDataState slipOneClickAgreementDataState = (SlipOneClickAgreementDataState) other;
        return Intrinsics.areEqual(this.slipAgreements, slipOneClickAgreementDataState.slipAgreements) && Intrinsics.areEqual(this.exception, slipOneClickAgreementDataState.exception);
    }

    public int hashCode() {
        UiSlipAgreements uiSlipAgreements = this.slipAgreements;
        int iHashCode = (uiSlipAgreements == null ? 0 : uiSlipAgreements.hashCode()) * 31;
        Throwable th = this.exception;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "SlipOneClickAgreementDataState(slipAgreements=" + this.slipAgreements + ", exception=" + this.exception + ")";
    }

    public SlipOneClickAgreementDataState(UiSlipAgreements uiSlipAgreements, Throwable th) {
        this.slipAgreements = uiSlipAgreements;
        this.exception = th;
    }

    public /* synthetic */ SlipOneClickAgreementDataState(UiSlipAgreements uiSlipAgreements, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiSlipAgreements, (i & 2) != 0 ? null : th);
    }

    public final UiSlipAgreements getSlipAgreements() {
        return this.slipAgreements;
    }

    public final Throwable getException() {
        return this.exception;
    }
}
