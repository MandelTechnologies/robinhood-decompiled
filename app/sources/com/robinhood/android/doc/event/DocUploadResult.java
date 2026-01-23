package com.robinhood.android.doc.event;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadResult.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\rB\u001b\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadResult;", "", "wizardState", "Lcom/robinhood/android/doc/event/DocUploadWizardState;", "destination", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "<init>", "(Lcom/robinhood/android/doc/event/DocUploadWizardState;Lcom/robinhood/android/doc/event/DocUploadDestination;)V", "getWizardState", "()Lcom/robinhood/android/doc/event/DocUploadWizardState;", "getDestination", "()Lcom/robinhood/android/doc/event/DocUploadDestination;", "WizardStateMutatorResult", "NonMutatingResult", "Lcom/robinhood/android/doc/event/DocUploadResult$NonMutatingResult;", "Lcom/robinhood/android/doc/event/DocUploadResult$WizardStateMutatorResult;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class DocUploadResult {
    public static final int $stable = 8;
    private final DocUploadDestination destination;
    private final DocUploadWizardState wizardState;

    public /* synthetic */ DocUploadResult(DocUploadWizardState docUploadWizardState, DocUploadDestination docUploadDestination, DefaultConstructorMarker defaultConstructorMarker) {
        this(docUploadWizardState, docUploadDestination);
    }

    private DocUploadResult(DocUploadWizardState docUploadWizardState, DocUploadDestination docUploadDestination) {
        this.wizardState = docUploadWizardState;
        this.destination = docUploadDestination;
    }

    public DocUploadWizardState getWizardState() {
        return this.wizardState;
    }

    public DocUploadDestination getDestination() {
        return this.destination;
    }

    /* compiled from: DocUploadResult.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadResult$WizardStateMutatorResult;", "Lcom/robinhood/android/doc/event/DocUploadResult;", "wizardState", "Lcom/robinhood/android/doc/event/DocUploadWizardState;", "destination", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "<init>", "(Lcom/robinhood/android/doc/event/DocUploadWizardState;Lcom/robinhood/android/doc/event/DocUploadDestination;)V", "getWizardState", "()Lcom/robinhood/android/doc/event/DocUploadWizardState;", "getDestination", "()Lcom/robinhood/android/doc/event/DocUploadDestination;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class WizardStateMutatorResult extends DocUploadResult {
        public static final int $stable = 8;
        private final DocUploadDestination destination;
        private final DocUploadWizardState wizardState;

        public static /* synthetic */ WizardStateMutatorResult copy$default(WizardStateMutatorResult wizardStateMutatorResult, DocUploadWizardState docUploadWizardState, DocUploadDestination docUploadDestination, int i, Object obj) {
            if ((i & 1) != 0) {
                docUploadWizardState = wizardStateMutatorResult.wizardState;
            }
            if ((i & 2) != 0) {
                docUploadDestination = wizardStateMutatorResult.destination;
            }
            return wizardStateMutatorResult.copy(docUploadWizardState, docUploadDestination);
        }

        /* renamed from: component1, reason: from getter */
        public final DocUploadWizardState getWizardState() {
            return this.wizardState;
        }

        /* renamed from: component2, reason: from getter */
        public final DocUploadDestination getDestination() {
            return this.destination;
        }

        public final WizardStateMutatorResult copy(DocUploadWizardState wizardState, DocUploadDestination destination) {
            Intrinsics.checkNotNullParameter(wizardState, "wizardState");
            Intrinsics.checkNotNullParameter(destination, "destination");
            return new WizardStateMutatorResult(wizardState, destination);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WizardStateMutatorResult)) {
                return false;
            }
            WizardStateMutatorResult wizardStateMutatorResult = (WizardStateMutatorResult) other;
            return Intrinsics.areEqual(this.wizardState, wizardStateMutatorResult.wizardState) && Intrinsics.areEqual(this.destination, wizardStateMutatorResult.destination);
        }

        public int hashCode() {
            return (this.wizardState.hashCode() * 31) + this.destination.hashCode();
        }

        public String toString() {
            return "WizardStateMutatorResult(wizardState=" + this.wizardState + ", destination=" + this.destination + ")";
        }

        @Override // com.robinhood.android.doc.event.DocUploadResult
        public DocUploadWizardState getWizardState() {
            return this.wizardState;
        }

        @Override // com.robinhood.android.doc.event.DocUploadResult
        public DocUploadDestination getDestination() {
            return this.destination;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WizardStateMutatorResult(DocUploadWizardState wizardState, DocUploadDestination destination) {
            super(wizardState, destination, null);
            Intrinsics.checkNotNullParameter(wizardState, "wizardState");
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.wizardState = wizardState;
            this.destination = destination;
        }
    }

    /* compiled from: DocUploadResult.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadResult$NonMutatingResult;", "Lcom/robinhood/android/doc/event/DocUploadResult;", "destination", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "<init>", "(Lcom/robinhood/android/doc/event/DocUploadDestination;)V", "getDestination", "()Lcom/robinhood/android/doc/event/DocUploadDestination;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NonMutatingResult extends DocUploadResult {
        public static final int $stable = 8;
        private final DocUploadDestination destination;

        public static /* synthetic */ NonMutatingResult copy$default(NonMutatingResult nonMutatingResult, DocUploadDestination docUploadDestination, int i, Object obj) {
            if ((i & 1) != 0) {
                docUploadDestination = nonMutatingResult.destination;
            }
            return nonMutatingResult.copy(docUploadDestination);
        }

        /* renamed from: component1, reason: from getter */
        public final DocUploadDestination getDestination() {
            return this.destination;
        }

        public final NonMutatingResult copy(DocUploadDestination destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return new NonMutatingResult(destination);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NonMutatingResult) && Intrinsics.areEqual(this.destination, ((NonMutatingResult) other).destination);
        }

        public int hashCode() {
            return this.destination.hashCode();
        }

        public String toString() {
            return "NonMutatingResult(destination=" + this.destination + ")";
        }

        @Override // com.robinhood.android.doc.event.DocUploadResult
        public DocUploadDestination getDestination() {
            return this.destination;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NonMutatingResult(DocUploadDestination destination) {
            super(null, destination, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.destination = destination;
        }
    }
}
