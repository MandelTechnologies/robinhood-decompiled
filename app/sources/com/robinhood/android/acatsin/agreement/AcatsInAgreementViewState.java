package com.robinhood.android.acatsin.agreement;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.models.p355ui.UiSlipAgreementsSection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState$Error;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState$Loaded;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState$Loading;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class AcatsInAgreementViewState {
    public static final int $stable = 0;

    public /* synthetic */ AcatsInAgreementViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: AcatsInAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState$Loading;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends AcatsInAgreementViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 153783344;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private AcatsInAgreementViewState() {
    }

    /* compiled from: AcatsInAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState$Loaded;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState;", "isAcatsRetry", "", "isCoOwnerFlow", "isAgreementSigningActive", "acatsAgreement", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "slipAgreementsSection", "Lcom/robinhood/models/ui/UiSlipAgreementsSection;", "<init>", "(ZZZLcom/robinhood/android/agreements/models/UiAgreementWithContent;Lcom/robinhood/models/ui/UiSlipAgreementsSection;)V", "()Z", "getAcatsAgreement", "()Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "getSlipAgreementsSection", "()Lcom/robinhood/models/ui/UiSlipAgreementsSection;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends AcatsInAgreementViewState {
        public static final int $stable = 8;
        private final UiAgreementWithContent acatsAgreement;
        private final boolean isAcatsRetry;
        private final boolean isAgreementSigningActive;
        private final boolean isCoOwnerFlow;
        private final UiSlipAgreementsSection slipAgreementsSection;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, boolean z, boolean z2, boolean z3, UiAgreementWithContent uiAgreementWithContent, UiSlipAgreementsSection uiSlipAgreementsSection, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loaded.isAcatsRetry;
            }
            if ((i & 2) != 0) {
                z2 = loaded.isCoOwnerFlow;
            }
            if ((i & 4) != 0) {
                z3 = loaded.isAgreementSigningActive;
            }
            if ((i & 8) != 0) {
                uiAgreementWithContent = loaded.acatsAgreement;
            }
            if ((i & 16) != 0) {
                uiSlipAgreementsSection = loaded.slipAgreementsSection;
            }
            UiSlipAgreementsSection uiSlipAgreementsSection2 = uiSlipAgreementsSection;
            boolean z4 = z3;
            return loaded.copy(z, z2, z4, uiAgreementWithContent, uiSlipAgreementsSection2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsAcatsRetry() {
            return this.isAcatsRetry;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCoOwnerFlow() {
            return this.isCoOwnerFlow;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsAgreementSigningActive() {
            return this.isAgreementSigningActive;
        }

        /* renamed from: component4, reason: from getter */
        public final UiAgreementWithContent getAcatsAgreement() {
            return this.acatsAgreement;
        }

        /* renamed from: component5, reason: from getter */
        public final UiSlipAgreementsSection getSlipAgreementsSection() {
            return this.slipAgreementsSection;
        }

        public final Loaded copy(boolean isAcatsRetry, boolean isCoOwnerFlow, boolean isAgreementSigningActive, UiAgreementWithContent acatsAgreement, UiSlipAgreementsSection slipAgreementsSection) {
            Intrinsics.checkNotNullParameter(acatsAgreement, "acatsAgreement");
            return new Loaded(isAcatsRetry, isCoOwnerFlow, isAgreementSigningActive, acatsAgreement, slipAgreementsSection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.isAcatsRetry == loaded.isAcatsRetry && this.isCoOwnerFlow == loaded.isCoOwnerFlow && this.isAgreementSigningActive == loaded.isAgreementSigningActive && Intrinsics.areEqual(this.acatsAgreement, loaded.acatsAgreement) && Intrinsics.areEqual(this.slipAgreementsSection, loaded.slipAgreementsSection);
        }

        public int hashCode() {
            int iHashCode = ((((((Boolean.hashCode(this.isAcatsRetry) * 31) + Boolean.hashCode(this.isCoOwnerFlow)) * 31) + Boolean.hashCode(this.isAgreementSigningActive)) * 31) + this.acatsAgreement.hashCode()) * 31;
            UiSlipAgreementsSection uiSlipAgreementsSection = this.slipAgreementsSection;
            return iHashCode + (uiSlipAgreementsSection == null ? 0 : uiSlipAgreementsSection.hashCode());
        }

        public String toString() {
            return "Loaded(isAcatsRetry=" + this.isAcatsRetry + ", isCoOwnerFlow=" + this.isCoOwnerFlow + ", isAgreementSigningActive=" + this.isAgreementSigningActive + ", acatsAgreement=" + this.acatsAgreement + ", slipAgreementsSection=" + this.slipAgreementsSection + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Loaded(boolean z, boolean z2, boolean z3, UiAgreementWithContent uiAgreementWithContent, UiSlipAgreementsSection uiSlipAgreementsSection, int i, DefaultConstructorMarker defaultConstructorMarker) {
            UiSlipAgreementsSection uiSlipAgreementsSection2;
            UiAgreementWithContent uiAgreementWithContent2;
            boolean z4;
            z = (i & 1) != 0 ? false : z;
            z2 = (i & 2) != 0 ? false : z2;
            if ((i & 4) != 0) {
                uiSlipAgreementsSection2 = uiSlipAgreementsSection;
                uiAgreementWithContent2 = uiAgreementWithContent;
                z4 = false;
            } else {
                uiSlipAgreementsSection2 = uiSlipAgreementsSection;
                uiAgreementWithContent2 = uiAgreementWithContent;
                z4 = z3;
            }
            this(z, z2, z4, uiAgreementWithContent2, uiSlipAgreementsSection2);
        }

        public final boolean isAcatsRetry() {
            return this.isAcatsRetry;
        }

        public final boolean isCoOwnerFlow() {
            return this.isCoOwnerFlow;
        }

        public final boolean isAgreementSigningActive() {
            return this.isAgreementSigningActive;
        }

        public final UiAgreementWithContent getAcatsAgreement() {
            return this.acatsAgreement;
        }

        public final UiSlipAgreementsSection getSlipAgreementsSection() {
            return this.slipAgreementsSection;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(boolean z, boolean z2, boolean z3, UiAgreementWithContent acatsAgreement, UiSlipAgreementsSection uiSlipAgreementsSection) {
            super(null);
            Intrinsics.checkNotNullParameter(acatsAgreement, "acatsAgreement");
            this.isAcatsRetry = z;
            this.isCoOwnerFlow = z2;
            this.isAgreementSigningActive = z3;
            this.acatsAgreement = acatsAgreement;
            this.slipAgreementsSection = uiSlipAgreementsSection;
        }
    }

    /* compiled from: AcatsInAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState$Error;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends AcatsInAgreementViewState {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }
}
