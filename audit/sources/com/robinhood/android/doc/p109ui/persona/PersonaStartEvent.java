package com.robinhood.android.doc.p109ui.persona;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonaStartEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaStartEvent;", "", "SubmitConsentToAgreementSuccess", "SubmitConsentToAgreementFailure", "Lcom/robinhood/android/doc/ui/persona/PersonaStartEvent$SubmitConsentToAgreementFailure;", "Lcom/robinhood/android/doc/ui/persona/PersonaStartEvent$SubmitConsentToAgreementSuccess;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface PersonaStartEvent {

    /* compiled from: PersonaStartEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaStartEvent$SubmitConsentToAgreementSuccess;", "Lcom/robinhood/android/doc/ui/persona/PersonaStartEvent;", "skipBiometric", "", "isInPrismCollectionExperiment", "<init>", "(ZZ)V", "getSkipBiometric", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SubmitConsentToAgreementSuccess implements PersonaStartEvent {
        public static final int $stable = 0;
        private final boolean isInPrismCollectionExperiment;
        private final boolean skipBiometric;

        /* JADX WARN: Illegal instructions before constructor call */
        public SubmitConsentToAgreementSuccess() {
            boolean z = false;
            this(z, z, 3, null);
        }

        public static /* synthetic */ SubmitConsentToAgreementSuccess copy$default(SubmitConsentToAgreementSuccess submitConsentToAgreementSuccess, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = submitConsentToAgreementSuccess.skipBiometric;
            }
            if ((i & 2) != 0) {
                z2 = submitConsentToAgreementSuccess.isInPrismCollectionExperiment;
            }
            return submitConsentToAgreementSuccess.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSkipBiometric() {
            return this.skipBiometric;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsInPrismCollectionExperiment() {
            return this.isInPrismCollectionExperiment;
        }

        public final SubmitConsentToAgreementSuccess copy(boolean skipBiometric, boolean isInPrismCollectionExperiment) {
            return new SubmitConsentToAgreementSuccess(skipBiometric, isInPrismCollectionExperiment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubmitConsentToAgreementSuccess)) {
                return false;
            }
            SubmitConsentToAgreementSuccess submitConsentToAgreementSuccess = (SubmitConsentToAgreementSuccess) other;
            return this.skipBiometric == submitConsentToAgreementSuccess.skipBiometric && this.isInPrismCollectionExperiment == submitConsentToAgreementSuccess.isInPrismCollectionExperiment;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.skipBiometric) * 31) + Boolean.hashCode(this.isInPrismCollectionExperiment);
        }

        public String toString() {
            return "SubmitConsentToAgreementSuccess(skipBiometric=" + this.skipBiometric + ", isInPrismCollectionExperiment=" + this.isInPrismCollectionExperiment + ")";
        }

        public SubmitConsentToAgreementSuccess(boolean z, boolean z2) {
            this.skipBiometric = z;
            this.isInPrismCollectionExperiment = z2;
        }

        public /* synthetic */ SubmitConsentToAgreementSuccess(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public final boolean getSkipBiometric() {
            return this.skipBiometric;
        }

        public final boolean isInPrismCollectionExperiment() {
            return this.isInPrismCollectionExperiment;
        }
    }

    /* compiled from: PersonaStartEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaStartEvent$SubmitConsentToAgreementFailure;", "Lcom/robinhood/android/doc/ui/persona/PersonaStartEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SubmitConsentToAgreementFailure implements PersonaStartEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ SubmitConsentToAgreementFailure copy$default(SubmitConsentToAgreementFailure submitConsentToAgreementFailure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = submitConsentToAgreementFailure.throwable;
            }
            return submitConsentToAgreementFailure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final SubmitConsentToAgreementFailure copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new SubmitConsentToAgreementFailure(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SubmitConsentToAgreementFailure) && Intrinsics.areEqual(this.throwable, ((SubmitConsentToAgreementFailure) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "SubmitConsentToAgreementFailure(throwable=" + this.throwable + ")";
        }

        public SubmitConsentToAgreementFailure(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
