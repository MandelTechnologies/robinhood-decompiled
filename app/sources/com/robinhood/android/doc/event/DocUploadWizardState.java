package com.robinhood.android.doc.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.DocUploadThanksContext;
import com.robinhood.models.p355ui.DocumentRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: DocUploadWizardState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010$\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\bJ\b\u0010&\u001a\u00020\u0000H\u0002J\b\u0010'\u001a\u00020\u0000H\u0002J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\bH\u0002J\u0006\u0010)\u001a\u00020\u0000J\u0015\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÂ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\t\u00104\u001a\u00020\bHÂ\u0003J£\u0001\u00105\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0010\u001a\u00020\bHÆ\u0001J\u0006\u00106\u001a\u000207J\u0013\u00108\u001a\u00020\b2\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u000207HÖ\u0001J\t\u0010<\u001a\u00020=HÖ\u0001J\u0016\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u000207R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u001f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010 \u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010\u0018R\u0013\u0010!\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadWizardState;", "Landroid/os/Parcelable;", "queuedRequests", "", "Lcom/robinhood/models/ui/DocumentRequest;", "activeRequests", "completedRequests", "showUnderReview", "", "personaFailed", "isGdpr", "skipInquiryVerificationForUnauthedSelfieConsent", "showThanks", "Lcom/robinhood/models/api/DocUploadThanksContext;", "activeRequestsRemaining", "activeRequestsConsumed", "hasSuccessfulRequest", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZZLcom/robinhood/models/api/DocUploadThanksContext;Ljava/util/List;Ljava/util/List;Z)V", "getQueuedRequests", "()Ljava/util/List;", "getActiveRequests", "getCompletedRequests", "getShowUnderReview", "()Z", "getPersonaFailed", "getSkipInquiryVerificationForUnauthedSelfieConsent", "requireActiveRequest", "getRequireActiveRequest", "loggingActiveRequest", "getLoggingActiveRequest", "isRequestCompleted", "isRequestStarted", "thanksScreen", "getThanksScreen", "()Lcom/robinhood/models/api/DocUploadThanksContext;", "startNextRequest", "requestSuccessful", "loadNextActiveRequest", "consumeNextDocument", "updateWizardStatus", "breakRequestOnPersonaClientError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class DocUploadWizardState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DocUploadWizardState> CREATOR = new Creator();
    private final List<DocumentRequest> activeRequests;
    private final List<DocumentRequest> activeRequestsConsumed;
    private final List<DocumentRequest> activeRequestsRemaining;
    private final List<List<DocumentRequest>> completedRequests;
    private final boolean hasSuccessfulRequest;
    private final boolean isGdpr;
    private final boolean personaFailed;
    private final List<List<DocumentRequest>> queuedRequests;
    private final DocUploadThanksContext showThanks;
    private final boolean showUnderReview;
    private final boolean skipInquiryVerificationForUnauthedSelfieConsent;

    /* compiled from: DocUploadWizardState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<DocUploadWizardState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocUploadWizardState createFromParcel(Parcel parcel) {
            Class cls;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(DocUploadWizardState.class.getClassLoader()));
                }
                arrayList.add(arrayList2);
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(parcel.readParcelable(DocUploadWizardState.class.getClassLoader()));
            }
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                int i9 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList5.add(parcel.readParcelable(DocUploadWizardState.class.getClassLoader()));
                }
                arrayList4.add(arrayList5);
            }
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                cls = DocUploadWizardState.class;
                z = true;
            } else {
                cls = DocUploadWizardState.class;
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = false;
            }
            DocUploadThanksContext docUploadThanksContextValueOf = parcel.readInt() == 0 ? null : DocUploadThanksContext.valueOf(parcel.readString());
            int i11 = parcel.readInt();
            boolean z6 = z4;
            DocUploadThanksContext docUploadThanksContext = docUploadThanksContextValueOf;
            ArrayList arrayList6 = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList6.add(parcel.readParcelable(cls.getClassLoader()));
            }
            int i13 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList7.add(parcel.readParcelable(cls.getClassLoader()));
            }
            if (parcel.readInt() == 0) {
                z6 = false;
            }
            return new DocUploadWizardState(arrayList, arrayList3, arrayList4, z, z5, z2, z3, docUploadThanksContext, arrayList6, arrayList7, z6);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocUploadWizardState[] newArray(int i) {
            return new DocUploadWizardState[i];
        }
    }

    public DocUploadWizardState() {
        this(null, null, null, false, false, false, false, null, null, null, false, 2047, null);
    }

    private final List<DocumentRequest> component10() {
        return this.activeRequestsConsumed;
    }

    /* renamed from: component11, reason: from getter */
    private final boolean getHasSuccessfulRequest() {
        return this.hasSuccessfulRequest;
    }

    /* renamed from: component8, reason: from getter */
    private final DocUploadThanksContext getShowThanks() {
        return this.showThanks;
    }

    private final List<DocumentRequest> component9() {
        return this.activeRequestsRemaining;
    }

    public static /* synthetic */ DocUploadWizardState copy$default(DocUploadWizardState docUploadWizardState, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, DocUploadThanksContext docUploadThanksContext, List list4, List list5, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = docUploadWizardState.queuedRequests;
        }
        if ((i & 2) != 0) {
            list2 = docUploadWizardState.activeRequests;
        }
        if ((i & 4) != 0) {
            list3 = docUploadWizardState.completedRequests;
        }
        if ((i & 8) != 0) {
            z = docUploadWizardState.showUnderReview;
        }
        if ((i & 16) != 0) {
            z2 = docUploadWizardState.personaFailed;
        }
        if ((i & 32) != 0) {
            z3 = docUploadWizardState.isGdpr;
        }
        if ((i & 64) != 0) {
            z4 = docUploadWizardState.skipInquiryVerificationForUnauthedSelfieConsent;
        }
        if ((i & 128) != 0) {
            docUploadThanksContext = docUploadWizardState.showThanks;
        }
        if ((i & 256) != 0) {
            list4 = docUploadWizardState.activeRequestsRemaining;
        }
        if ((i & 512) != 0) {
            list5 = docUploadWizardState.activeRequestsConsumed;
        }
        if ((i & 1024) != 0) {
            z5 = docUploadWizardState.hasSuccessfulRequest;
        }
        List list6 = list5;
        boolean z6 = z5;
        DocUploadThanksContext docUploadThanksContext2 = docUploadThanksContext;
        List list7 = list4;
        boolean z7 = z3;
        boolean z8 = z4;
        boolean z9 = z2;
        List list8 = list3;
        return docUploadWizardState.copy(list, list2, list8, z, z9, z7, z8, docUploadThanksContext2, list7, list6, z6);
    }

    public final List<List<DocumentRequest>> component1() {
        return this.queuedRequests;
    }

    public final List<DocumentRequest> component2() {
        return this.activeRequests;
    }

    public final List<List<DocumentRequest>> component3() {
        return this.completedRequests;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowUnderReview() {
        return this.showUnderReview;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getPersonaFailed() {
        return this.personaFailed;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsGdpr() {
        return this.isGdpr;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getSkipInquiryVerificationForUnauthedSelfieConsent() {
        return this.skipInquiryVerificationForUnauthedSelfieConsent;
    }

    public final DocUploadWizardState copy(List<? extends List<DocumentRequest>> queuedRequests, List<DocumentRequest> activeRequests, List<? extends List<DocumentRequest>> completedRequests, boolean showUnderReview, boolean personaFailed, boolean isGdpr, boolean skipInquiryVerificationForUnauthedSelfieConsent, DocUploadThanksContext showThanks, List<DocumentRequest> activeRequestsRemaining, List<DocumentRequest> activeRequestsConsumed, boolean hasSuccessfulRequest) {
        Intrinsics.checkNotNullParameter(queuedRequests, "queuedRequests");
        Intrinsics.checkNotNullParameter(activeRequests, "activeRequests");
        Intrinsics.checkNotNullParameter(completedRequests, "completedRequests");
        Intrinsics.checkNotNullParameter(activeRequestsRemaining, "activeRequestsRemaining");
        Intrinsics.checkNotNullParameter(activeRequestsConsumed, "activeRequestsConsumed");
        return new DocUploadWizardState(queuedRequests, activeRequests, completedRequests, showUnderReview, personaFailed, isGdpr, skipInquiryVerificationForUnauthedSelfieConsent, showThanks, activeRequestsRemaining, activeRequestsConsumed, hasSuccessfulRequest);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocUploadWizardState)) {
            return false;
        }
        DocUploadWizardState docUploadWizardState = (DocUploadWizardState) other;
        return Intrinsics.areEqual(this.queuedRequests, docUploadWizardState.queuedRequests) && Intrinsics.areEqual(this.activeRequests, docUploadWizardState.activeRequests) && Intrinsics.areEqual(this.completedRequests, docUploadWizardState.completedRequests) && this.showUnderReview == docUploadWizardState.showUnderReview && this.personaFailed == docUploadWizardState.personaFailed && this.isGdpr == docUploadWizardState.isGdpr && this.skipInquiryVerificationForUnauthedSelfieConsent == docUploadWizardState.skipInquiryVerificationForUnauthedSelfieConsent && this.showThanks == docUploadWizardState.showThanks && Intrinsics.areEqual(this.activeRequestsRemaining, docUploadWizardState.activeRequestsRemaining) && Intrinsics.areEqual(this.activeRequestsConsumed, docUploadWizardState.activeRequestsConsumed) && this.hasSuccessfulRequest == docUploadWizardState.hasSuccessfulRequest;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.queuedRequests.hashCode() * 31) + this.activeRequests.hashCode()) * 31) + this.completedRequests.hashCode()) * 31) + Boolean.hashCode(this.showUnderReview)) * 31) + Boolean.hashCode(this.personaFailed)) * 31) + Boolean.hashCode(this.isGdpr)) * 31) + Boolean.hashCode(this.skipInquiryVerificationForUnauthedSelfieConsent)) * 31;
        DocUploadThanksContext docUploadThanksContext = this.showThanks;
        return ((((((iHashCode + (docUploadThanksContext == null ? 0 : docUploadThanksContext.hashCode())) * 31) + this.activeRequestsRemaining.hashCode()) * 31) + this.activeRequestsConsumed.hashCode()) * 31) + Boolean.hashCode(this.hasSuccessfulRequest);
    }

    public String toString() {
        return "DocUploadWizardState(queuedRequests=" + this.queuedRequests + ", activeRequests=" + this.activeRequests + ", completedRequests=" + this.completedRequests + ", showUnderReview=" + this.showUnderReview + ", personaFailed=" + this.personaFailed + ", isGdpr=" + this.isGdpr + ", skipInquiryVerificationForUnauthedSelfieConsent=" + this.skipInquiryVerificationForUnauthedSelfieConsent + ", showThanks=" + this.showThanks + ", activeRequestsRemaining=" + this.activeRequestsRemaining + ", activeRequestsConsumed=" + this.activeRequestsConsumed + ", hasSuccessfulRequest=" + this.hasSuccessfulRequest + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<List<DocumentRequest>> list = this.queuedRequests;
        dest.writeInt(list.size());
        for (List<DocumentRequest> list2 : list) {
            dest.writeInt(list2.size());
            Iterator<DocumentRequest> it = list2.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        List<DocumentRequest> list3 = this.activeRequests;
        dest.writeInt(list3.size());
        Iterator<DocumentRequest> it2 = list3.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        List<List<DocumentRequest>> list4 = this.completedRequests;
        dest.writeInt(list4.size());
        for (List<DocumentRequest> list5 : list4) {
            dest.writeInt(list5.size());
            Iterator<DocumentRequest> it3 = list5.iterator();
            while (it3.hasNext()) {
                dest.writeParcelable(it3.next(), flags);
            }
        }
        dest.writeInt(this.showUnderReview ? 1 : 0);
        dest.writeInt(this.personaFailed ? 1 : 0);
        dest.writeInt(this.isGdpr ? 1 : 0);
        dest.writeInt(this.skipInquiryVerificationForUnauthedSelfieConsent ? 1 : 0);
        DocUploadThanksContext docUploadThanksContext = this.showThanks;
        if (docUploadThanksContext == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(docUploadThanksContext.name());
        }
        List<DocumentRequest> list6 = this.activeRequestsRemaining;
        dest.writeInt(list6.size());
        Iterator<DocumentRequest> it4 = list6.iterator();
        while (it4.hasNext()) {
            dest.writeParcelable(it4.next(), flags);
        }
        List<DocumentRequest> list7 = this.activeRequestsConsumed;
        dest.writeInt(list7.size());
        Iterator<DocumentRequest> it5 = list7.iterator();
        while (it5.hasNext()) {
            dest.writeParcelable(it5.next(), flags);
        }
        dest.writeInt(this.hasSuccessfulRequest ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DocUploadWizardState(List<? extends List<DocumentRequest>> queuedRequests, List<DocumentRequest> activeRequests, List<? extends List<DocumentRequest>> completedRequests, boolean z, boolean z2, boolean z3, boolean z4, DocUploadThanksContext docUploadThanksContext, List<DocumentRequest> activeRequestsRemaining, List<DocumentRequest> activeRequestsConsumed, boolean z5) {
        Intrinsics.checkNotNullParameter(queuedRequests, "queuedRequests");
        Intrinsics.checkNotNullParameter(activeRequests, "activeRequests");
        Intrinsics.checkNotNullParameter(completedRequests, "completedRequests");
        Intrinsics.checkNotNullParameter(activeRequestsRemaining, "activeRequestsRemaining");
        Intrinsics.checkNotNullParameter(activeRequestsConsumed, "activeRequestsConsumed");
        this.queuedRequests = queuedRequests;
        this.activeRequests = activeRequests;
        this.completedRequests = completedRequests;
        this.showUnderReview = z;
        this.personaFailed = z2;
        this.isGdpr = z3;
        this.skipInquiryVerificationForUnauthedSelfieConsent = z4;
        this.showThanks = docUploadThanksContext;
        this.activeRequestsRemaining = activeRequestsRemaining;
        this.activeRequestsConsumed = activeRequestsConsumed;
        this.hasSuccessfulRequest = z5;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ DocUploadWizardState(java.util.List r2, java.util.List r3, java.util.List r4, boolean r5, boolean r6, boolean r7, boolean r8, com.robinhood.models.api.DocUploadThanksContext r9, java.util.List r10, java.util.List r11, boolean r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r1 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r14 = r13 & 2
            if (r14 == 0) goto L10
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L10:
            r14 = r13 & 4
            if (r14 == 0) goto L18
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L18:
            r14 = r13 & 8
            r0 = 0
            if (r14 == 0) goto L1e
            r5 = r0
        L1e:
            r14 = r13 & 16
            if (r14 == 0) goto L23
            r6 = r0
        L23:
            r14 = r13 & 32
            if (r14 == 0) goto L28
            r7 = r0
        L28:
            r14 = r13 & 64
            if (r14 == 0) goto L2d
            r8 = r0
        L2d:
            r14 = r13 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L32
            r9 = 0
        L32:
            r14 = r13 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L3a
            java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()
        L3a:
            r14 = r13 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L42
            java.util.List r11 = kotlin.collections.CollectionsKt.emptyList()
        L42:
            r13 = r13 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L53
            r14 = r0
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L5f
        L53:
            r14 = r12
            r13 = r11
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L5f:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.doc.event.DocUploadWizardState.<init>(java.util.List, java.util.List, java.util.List, boolean, boolean, boolean, boolean, com.robinhood.models.api.DocUploadThanksContext, java.util.List, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<List<DocumentRequest>> getQueuedRequests() {
        return this.queuedRequests;
    }

    public final List<DocumentRequest> getActiveRequests() {
        return this.activeRequests;
    }

    public final List<List<DocumentRequest>> getCompletedRequests() {
        return this.completedRequests;
    }

    public final boolean getShowUnderReview() {
        return this.showUnderReview;
    }

    public final boolean getPersonaFailed() {
        return this.personaFailed;
    }

    public final boolean isGdpr() {
        return this.isGdpr;
    }

    public final boolean getSkipInquiryVerificationForUnauthedSelfieConsent() {
        return this.skipInquiryVerificationForUnauthedSelfieConsent;
    }

    public final List<DocumentRequest> getRequireActiveRequest() {
        if (this.activeRequests.isEmpty()) {
            throw new IllegalStateException("Active Document Request cannot be empty");
        }
        return this.activeRequests;
    }

    public final List<DocumentRequest> getLoggingActiveRequest() {
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) this.activeRequestsConsumed, (Iterable) this.activeRequests), (Iterable) this.activeRequestsRemaining);
    }

    public final boolean isRequestCompleted() {
        return this.activeRequestsRemaining.isEmpty();
    }

    public final boolean isRequestStarted() {
        return this.activeRequestsConsumed.isEmpty();
    }

    public final DocUploadThanksContext getThanksScreen() {
        List list = (List) CollectionsKt.lastOrNull((List) this.completedRequests);
        Boolean boolValueOf = list != null ? Boolean.valueOf(com.robinhood.android.doc.p109ui.UtilKt.hasThankedUser(list)) : null;
        if (this.hasSuccessfulRequest && Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            return this.showThanks;
        }
        return null;
    }

    public static /* synthetic */ DocUploadWizardState startNextRequest$default(DocUploadWizardState docUploadWizardState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return docUploadWizardState.startNextRequest(z);
    }

    public final DocUploadWizardState startNextRequest(boolean requestSuccessful) {
        return loadNextActiveRequest().consumeNextDocument().updateWizardStatus(requestSuccessful);
    }

    private final DocUploadWizardState loadNextActiveRequest() {
        if (!this.activeRequestsRemaining.isEmpty()) {
            return this;
        }
        List listDrop = CollectionsKt.drop(this.queuedRequests, 1);
        List listEmptyList = CollectionsKt.emptyList();
        List listEmptyList2 = (List) CollectionsKt.firstOrNull((List) this.queuedRequests);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        List list = listEmptyList2;
        List listEmptyList3 = CollectionsKt.emptyList();
        List listPlus = CollectionsKt.plus((Collection) this.completedRequests, (Iterable) CollectionsKt.listOf(CollectionsKt.plus((Collection) this.activeRequestsConsumed, (Iterable) this.activeRequests)));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listPlus) {
            if (!((List) obj).isEmpty()) {
                arrayList.add(obj);
            }
        }
        return copy$default(this, listDrop, listEmptyList, arrayList, false, false, false, false, null, list, listEmptyList3, false, 1272, null);
    }

    private final DocUploadWizardState consumeNextDocument() {
        int size = 1;
        if (this.activeRequestsRemaining.size() <= 1) {
            size = this.activeRequestsRemaining.size();
        } else if (!this.personaFailed && com.robinhood.android.doc.p109ui.UtilKt.isInPersonaClient((List<DocumentRequest>) CollectionsKt.slice(this.activeRequestsRemaining, RangesKt.until(0, 2)))) {
            size = 2;
        }
        return copy$default(this, null, CollectionsKt.slice(this.activeRequestsRemaining, RangesKt.until(0, size)), null, false, false, false, false, null, CollectionsKt.drop(this.activeRequestsRemaining, size), CollectionsKt.plus((Collection) this.activeRequestsConsumed, (Iterable) this.activeRequests), false, 1277, null);
    }

    private final DocUploadWizardState updateWizardStatus(boolean requestSuccessful) {
        return copy$default(this, null, null, null, false, false, false, false, null, null, null, this.hasSuccessfulRequest || requestSuccessful, 1023, null);
    }

    public final DocUploadWizardState breakRequestOnPersonaClientError() {
        return copy$default(this, null, CollectionsKt.emptyList(), null, false, true, false, false, null, CollectionsKt.plus((Collection) this.activeRequests, (Iterable) this.activeRequestsRemaining), null, false, 1773, null).startNextRequest(false);
    }
}
