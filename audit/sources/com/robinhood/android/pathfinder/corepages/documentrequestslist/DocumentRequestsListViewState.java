package com.robinhood.android.pathfinder.corepages.documentrequestslist;

import com.robinhood.models.p355ui.pathfinder.contexts.DocumentRequest;
import com.robinhood.models.serverdriven.p347db.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentRequestsListViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\bR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListViewState;", "", "documentRequests", "", "Lcom/robinhood/models/ui/pathfinder/contexts/DocumentRequest;", "getDocumentRequests", "()Ljava/util/List;", "Loaded", "Error", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListViewState$Error;", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListViewState$Loaded;", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface DocumentRequestsListViewState {
    List<DocumentRequest> getDocumentRequests();

    /* compiled from: DocumentRequestsListViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0015¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListViewState$Loaded;", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListViewState;", "documentRequests", "", "Lcom/robinhood/models/ui/pathfinder/contexts/DocumentRequest;", "preheading", "Lcom/robinhood/models/serverdriven/db/RichText;", "heading", "subheading", "shouldShowContinueButton", "", "isSendingInput", "<init>", "(Ljava/util/List;Lcom/robinhood/models/serverdriven/db/RichText;Lcom/robinhood/models/serverdriven/db/RichText;Lcom/robinhood/models/serverdriven/db/RichText;ZZ)V", "getDocumentRequests", "()Ljava/util/List;", "getPreheading", "()Lcom/robinhood/models/serverdriven/db/RichText;", "getHeading", "getSubheading", "getShouldShowContinueButton", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements DocumentRequestsListViewState {
        public static final int $stable = 8;
        private final List<DocumentRequest> documentRequests;
        private final RichText heading;
        private final boolean isSendingInput;
        private final RichText preheading;
        private final boolean shouldShowContinueButton;
        private final RichText subheading;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, RichText richText, RichText richText2, RichText richText3, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = loaded.documentRequests;
            }
            if ((i & 2) != 0) {
                richText = loaded.preheading;
            }
            if ((i & 4) != 0) {
                richText2 = loaded.heading;
            }
            if ((i & 8) != 0) {
                richText3 = loaded.subheading;
            }
            if ((i & 16) != 0) {
                z = loaded.shouldShowContinueButton;
            }
            if ((i & 32) != 0) {
                z2 = loaded.isSendingInput;
            }
            boolean z3 = z;
            boolean z4 = z2;
            return loaded.copy(list, richText, richText2, richText3, z3, z4);
        }

        public final List<DocumentRequest> component1() {
            return this.documentRequests;
        }

        /* renamed from: component2, reason: from getter */
        public final RichText getPreheading() {
            return this.preheading;
        }

        /* renamed from: component3, reason: from getter */
        public final RichText getHeading() {
            return this.heading;
        }

        /* renamed from: component4, reason: from getter */
        public final RichText getSubheading() {
            return this.subheading;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShouldShowContinueButton() {
            return this.shouldShowContinueButton;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsSendingInput() {
            return this.isSendingInput;
        }

        public final Loaded copy(List<DocumentRequest> documentRequests, RichText preheading, RichText heading, RichText subheading, boolean shouldShowContinueButton, boolean isSendingInput) {
            Intrinsics.checkNotNullParameter(documentRequests, "documentRequests");
            return new Loaded(documentRequests, preheading, heading, subheading, shouldShowContinueButton, isSendingInput);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.documentRequests, loaded.documentRequests) && Intrinsics.areEqual(this.preheading, loaded.preheading) && Intrinsics.areEqual(this.heading, loaded.heading) && Intrinsics.areEqual(this.subheading, loaded.subheading) && this.shouldShowContinueButton == loaded.shouldShowContinueButton && this.isSendingInput == loaded.isSendingInput;
        }

        public int hashCode() {
            int iHashCode = this.documentRequests.hashCode() * 31;
            RichText richText = this.preheading;
            int iHashCode2 = (iHashCode + (richText == null ? 0 : richText.hashCode())) * 31;
            RichText richText2 = this.heading;
            int iHashCode3 = (iHashCode2 + (richText2 == null ? 0 : richText2.hashCode())) * 31;
            RichText richText3 = this.subheading;
            return ((((iHashCode3 + (richText3 != null ? richText3.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldShowContinueButton)) * 31) + Boolean.hashCode(this.isSendingInput);
        }

        public String toString() {
            return "Loaded(documentRequests=" + this.documentRequests + ", preheading=" + this.preheading + ", heading=" + this.heading + ", subheading=" + this.subheading + ", shouldShowContinueButton=" + this.shouldShowContinueButton + ", isSendingInput=" + this.isSendingInput + ")";
        }

        public Loaded(List<DocumentRequest> documentRequests, RichText richText, RichText richText2, RichText richText3, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(documentRequests, "documentRequests");
            this.documentRequests = documentRequests;
            this.preheading = richText;
            this.heading = richText2;
            this.subheading = richText3;
            this.shouldShowContinueButton = z;
            this.isSendingInput = z2;
        }

        @Override // com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListViewState
        public List<DocumentRequest> getDocumentRequests() {
            return this.documentRequests;
        }

        public final RichText getPreheading() {
            return this.preheading;
        }

        public final RichText getHeading() {
            return this.heading;
        }

        public final RichText getSubheading() {
            return this.subheading;
        }

        public final boolean getShouldShowContinueButton() {
            return this.shouldShowContinueButton;
        }

        public final boolean isSendingInput() {
            return this.isSendingInput;
        }
    }

    /* compiled from: DocumentRequestsListViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListViewState$Error;", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListViewState;", "documentRequests", "", "Lcom/robinhood/models/ui/pathfinder/contexts/DocumentRequest;", "<init>", "(Ljava/util/List;)V", "getDocumentRequests", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements DocumentRequestsListViewState {
        public static final int $stable = 8;
        private final List<DocumentRequest> documentRequests;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = error.documentRequests;
            }
            return error.copy(list);
        }

        public final List<DocumentRequest> component1() {
            return this.documentRequests;
        }

        public final Error copy(List<DocumentRequest> documentRequests) {
            Intrinsics.checkNotNullParameter(documentRequests, "documentRequests");
            return new Error(documentRequests);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.documentRequests, ((Error) other).documentRequests);
        }

        public int hashCode() {
            return this.documentRequests.hashCode();
        }

        public String toString() {
            return "Error(documentRequests=" + this.documentRequests + ")";
        }

        public Error(List<DocumentRequest> documentRequests) {
            Intrinsics.checkNotNullParameter(documentRequests, "documentRequests");
            this.documentRequests = documentRequests;
        }

        @Override // com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListViewState
        public List<DocumentRequest> getDocumentRequests() {
            return this.documentRequests;
        }
    }
}
