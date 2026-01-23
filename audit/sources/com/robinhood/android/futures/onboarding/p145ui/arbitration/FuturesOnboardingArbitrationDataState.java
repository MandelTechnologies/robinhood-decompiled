package com.robinhood.android.futures.onboarding.p145ui.arbitration;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOnboardingArbitrationAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\u0012J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationDataState;", "", "agreementResult", "Lkotlin/Result;", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "submittingAgreement", "", "submissionNetworkError", "", "<init>", "(Lkotlin/Result;ZLjava/lang/Throwable;)V", "getAgreementResult-xLWZpok", "()Lkotlin/Result;", "getSubmittingAgreement", "()Z", "getSubmissionNetworkError", "()Ljava/lang/Throwable;", "component1", "component1-xLWZpok", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesOnboardingArbitrationDataState {
    public static final int $stable = 8;
    private final Result<UiAgreementWithContent> agreementResult;
    private final Throwable submissionNetworkError;
    private final boolean submittingAgreement;

    public FuturesOnboardingArbitrationDataState() {
        this(null, false, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesOnboardingArbitrationDataState copy$default(FuturesOnboardingArbitrationDataState futuresOnboardingArbitrationDataState, Result result, boolean z, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            result = futuresOnboardingArbitrationDataState.agreementResult;
        }
        if ((i & 2) != 0) {
            z = futuresOnboardingArbitrationDataState.submittingAgreement;
        }
        if ((i & 4) != 0) {
            th = futuresOnboardingArbitrationDataState.submissionNetworkError;
        }
        return futuresOnboardingArbitrationDataState.copy(result, z, th);
    }

    /* renamed from: component1-xLWZpok, reason: not valid java name */
    public final Result<UiAgreementWithContent> m14696component1xLWZpok() {
        return this.agreementResult;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSubmittingAgreement() {
        return this.submittingAgreement;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getSubmissionNetworkError() {
        return this.submissionNetworkError;
    }

    public final FuturesOnboardingArbitrationDataState copy(Result<UiAgreementWithContent> agreementResult, boolean submittingAgreement, Throwable submissionNetworkError) {
        return new FuturesOnboardingArbitrationDataState(agreementResult, submittingAgreement, submissionNetworkError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesOnboardingArbitrationDataState)) {
            return false;
        }
        FuturesOnboardingArbitrationDataState futuresOnboardingArbitrationDataState = (FuturesOnboardingArbitrationDataState) other;
        return Intrinsics.areEqual(this.agreementResult, futuresOnboardingArbitrationDataState.agreementResult) && this.submittingAgreement == futuresOnboardingArbitrationDataState.submittingAgreement && Intrinsics.areEqual(this.submissionNetworkError, futuresOnboardingArbitrationDataState.submissionNetworkError);
    }

    public int hashCode() {
        Result<UiAgreementWithContent> result = this.agreementResult;
        int iM28554hashCodeimpl = (((result == null ? 0 : Result.m28554hashCodeimpl(result.getValue())) * 31) + Boolean.hashCode(this.submittingAgreement)) * 31;
        Throwable th = this.submissionNetworkError;
        return iM28554hashCodeimpl + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "FuturesOnboardingArbitrationDataState(agreementResult=" + this.agreementResult + ", submittingAgreement=" + this.submittingAgreement + ", submissionNetworkError=" + this.submissionNetworkError + ")";
    }

    public FuturesOnboardingArbitrationDataState(Result<UiAgreementWithContent> result, boolean z, Throwable th) {
        this.agreementResult = result;
        this.submittingAgreement = z;
        this.submissionNetworkError = th;
    }

    public /* synthetic */ FuturesOnboardingArbitrationDataState(Result result, boolean z, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : result, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : th);
    }

    /* renamed from: getAgreementResult-xLWZpok, reason: not valid java name */
    public final Result<UiAgreementWithContent> m14697getAgreementResultxLWZpok() {
        return this.agreementResult;
    }

    public final boolean getSubmittingAgreement() {
        return this.submittingAgreement;
    }

    public final Throwable getSubmissionNetworkError() {
        return this.submissionNetworkError;
    }
}
