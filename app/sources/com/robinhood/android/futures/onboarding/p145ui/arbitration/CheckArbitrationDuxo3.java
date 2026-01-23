package com.robinhood.android.futures.onboarding.p145ui.arbitration;

import com.robinhood.android.agreements.models.ApiPreviousAgreement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckArbitrationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/arbitration/CheckArbitrationEvent;", "", "<init>", "()V", "PreviousAgreementLoaded", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/CheckArbitrationEvent$PreviousAgreementLoaded;", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.CheckArbitrationEvent, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class CheckArbitrationDuxo3 {
    public static final int $stable = 0;

    public /* synthetic */ CheckArbitrationDuxo3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CheckArbitrationDuxo3() {
    }

    /* compiled from: CheckArbitrationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/arbitration/CheckArbitrationEvent$PreviousAgreementLoaded;", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/CheckArbitrationEvent;", "previousAgreement", "Lcom/robinhood/android/agreements/models/ApiPreviousAgreement;", "<init>", "(Lcom/robinhood/android/agreements/models/ApiPreviousAgreement;)V", "getPreviousAgreement", "()Lcom/robinhood/android/agreements/models/ApiPreviousAgreement;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.CheckArbitrationEvent$PreviousAgreementLoaded, reason: from toString */
    public static final /* data */ class PreviousAgreementLoaded extends CheckArbitrationDuxo3 {
        public static final int $stable = 8;
        private final ApiPreviousAgreement previousAgreement;

        public static /* synthetic */ PreviousAgreementLoaded copy$default(PreviousAgreementLoaded previousAgreementLoaded, ApiPreviousAgreement apiPreviousAgreement, int i, Object obj) {
            if ((i & 1) != 0) {
                apiPreviousAgreement = previousAgreementLoaded.previousAgreement;
            }
            return previousAgreementLoaded.copy(apiPreviousAgreement);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiPreviousAgreement getPreviousAgreement() {
            return this.previousAgreement;
        }

        public final PreviousAgreementLoaded copy(ApiPreviousAgreement previousAgreement) {
            Intrinsics.checkNotNullParameter(previousAgreement, "previousAgreement");
            return new PreviousAgreementLoaded(previousAgreement);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreviousAgreementLoaded) && Intrinsics.areEqual(this.previousAgreement, ((PreviousAgreementLoaded) other).previousAgreement);
        }

        public int hashCode() {
            return this.previousAgreement.hashCode();
        }

        public String toString() {
            return "PreviousAgreementLoaded(previousAgreement=" + this.previousAgreement + ")";
        }

        public final ApiPreviousAgreement getPreviousAgreement() {
            return this.previousAgreement;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreviousAgreementLoaded(ApiPreviousAgreement previousAgreement) {
            super(null);
            Intrinsics.checkNotNullParameter(previousAgreement, "previousAgreement");
            this.previousAgreement = previousAgreement;
        }
    }
}
