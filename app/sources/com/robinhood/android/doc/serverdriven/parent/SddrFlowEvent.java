package com.robinhood.android.doc.serverdriven.parent;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.PdfDocument;
import com.robinhood.models.api.PhotoDocument;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SddrFlowEvent.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u000b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent;", "", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "Start", "SubmissionSuccess", "SubmissionError", "DocumentTypeSelected", "CountrySelected", "PhotoRequested", "PhotoTaken", "PhotoAccepted", "PdfUploaded", "PdfAccepted", "PopBack", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$CountrySelected;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$DocumentTypeSelected;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$PdfAccepted;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$PdfUploaded;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$PhotoAccepted;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$PhotoRequested;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$PhotoTaken;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$PopBack;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$Start;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$SubmissionError;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$SubmissionSuccess;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface SddrFlowEvent {
    SddrFlowState getState();

    /* compiled from: SddrFlowEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$Start;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Start implements SddrFlowEvent {
        public static final int $stable = 8;
        private final SddrFlowState state;

        public static /* synthetic */ Start copy$default(Start start, SddrFlowState sddrFlowState, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = start.state;
            }
            return start.copy(sddrFlowState);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        public final Start copy(SddrFlowState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new Start(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Start) && Intrinsics.areEqual(this.state, ((Start) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Start(state=" + this.state + ")";
        }

        public Start(SddrFlowState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent
        public SddrFlowState getState() {
            return this.state;
        }
    }

    /* compiled from: SddrFlowEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$SubmissionSuccess;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SubmissionSuccess implements SddrFlowEvent {
        public static final int $stable = 8;
        private final SddrFlowState state;

        public static /* synthetic */ SubmissionSuccess copy$default(SubmissionSuccess submissionSuccess, SddrFlowState sddrFlowState, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = submissionSuccess.state;
            }
            return submissionSuccess.copy(sddrFlowState);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        public final SubmissionSuccess copy(SddrFlowState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new SubmissionSuccess(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SubmissionSuccess) && Intrinsics.areEqual(this.state, ((SubmissionSuccess) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "SubmissionSuccess(state=" + this.state + ")";
        }

        public SubmissionSuccess(SddrFlowState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent
        public SddrFlowState getState() {
            return this.state;
        }
    }

    /* compiled from: SddrFlowEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$SubmissionError;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SubmissionError implements SddrFlowEvent {
        public static final int $stable = 8;
        private final SddrFlowState state;

        public static /* synthetic */ SubmissionError copy$default(SubmissionError submissionError, SddrFlowState sddrFlowState, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = submissionError.state;
            }
            return submissionError.copy(sddrFlowState);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        public final SubmissionError copy(SddrFlowState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new SubmissionError(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SubmissionError) && Intrinsics.areEqual(this.state, ((SubmissionError) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "SubmissionError(state=" + this.state + ")";
        }

        public SubmissionError(SddrFlowState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent
        public SddrFlowState getState() {
            return this.state;
        }
    }

    /* compiled from: SddrFlowEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$DocumentTypeSelected;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "type", "", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;Ljava/lang/String;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DocumentTypeSelected implements SddrFlowEvent {
        public static final int $stable = 8;
        private final SddrFlowState state;
        private final String type;

        public static /* synthetic */ DocumentTypeSelected copy$default(DocumentTypeSelected documentTypeSelected, SddrFlowState sddrFlowState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = documentTypeSelected.state;
            }
            if ((i & 2) != 0) {
                str = documentTypeSelected.type;
            }
            return documentTypeSelected.copy(sddrFlowState, str);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final DocumentTypeSelected copy(SddrFlowState state, String type2) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(type2, "type");
            return new DocumentTypeSelected(state, type2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentTypeSelected)) {
                return false;
            }
            DocumentTypeSelected documentTypeSelected = (DocumentTypeSelected) other;
            return Intrinsics.areEqual(this.state, documentTypeSelected.state) && Intrinsics.areEqual(this.type, documentTypeSelected.type);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.type.hashCode();
        }

        public String toString() {
            return "DocumentTypeSelected(state=" + this.state + ", type=" + this.type + ")";
        }

        public DocumentTypeSelected(SddrFlowState state, String type2) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.state = state;
            this.type = type2;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent
        public SddrFlowState getState() {
            return this.state;
        }

        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: SddrFlowEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$CountrySelected;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", PlaceTypes.COUNTRY, "Lcom/robinhood/iso/countrycode/CountryCode;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;Lcom/robinhood/iso/countrycode/CountryCode;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getCountry", "()Lcom/robinhood/iso/countrycode/CountryCode;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CountrySelected implements SddrFlowEvent {
        public static final int $stable = 8;
        private final CountryCode country;
        private final SddrFlowState state;

        public static /* synthetic */ CountrySelected copy$default(CountrySelected countrySelected, SddrFlowState sddrFlowState, CountryCode countryCode, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = countrySelected.state;
            }
            if ((i & 2) != 0) {
                countryCode = countrySelected.country;
            }
            return countrySelected.copy(sddrFlowState, countryCode);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final CountryCode getCountry() {
            return this.country;
        }

        public final CountrySelected copy(SddrFlowState state, CountryCode country) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(country, "country");
            return new CountrySelected(state, country);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountrySelected)) {
                return false;
            }
            CountrySelected countrySelected = (CountrySelected) other;
            return Intrinsics.areEqual(this.state, countrySelected.state) && Intrinsics.areEqual(this.country, countrySelected.country);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.country.hashCode();
        }

        public String toString() {
            return "CountrySelected(state=" + this.state + ", country=" + this.country + ")";
        }

        public CountrySelected(SddrFlowState state, CountryCode country) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(country, "country");
            this.state = state;
            this.country = country;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent
        public SddrFlowState getState() {
            return this.state;
        }

        public final CountryCode getCountry() {
            return this.country;
        }
    }

    /* compiled from: SddrFlowEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$PhotoRequested;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PhotoRequested implements SddrFlowEvent {
        public static final int $stable = 8;
        private final SddrFlowState state;

        public static /* synthetic */ PhotoRequested copy$default(PhotoRequested photoRequested, SddrFlowState sddrFlowState, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = photoRequested.state;
            }
            return photoRequested.copy(sddrFlowState);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        public final PhotoRequested copy(SddrFlowState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new PhotoRequested(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PhotoRequested) && Intrinsics.areEqual(this.state, ((PhotoRequested) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "PhotoRequested(state=" + this.state + ")";
        }

        public PhotoRequested(SddrFlowState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent
        public SddrFlowState getState() {
            return this.state;
        }
    }

    /* compiled from: SddrFlowEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$PhotoTaken;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "document", "Lcom/robinhood/models/api/PhotoDocument;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;Lcom/robinhood/models/api/PhotoDocument;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getDocument", "()Lcom/robinhood/models/api/PhotoDocument;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PhotoTaken implements SddrFlowEvent {
        public static final int $stable = 8;
        private final PhotoDocument document;
        private final SddrFlowState state;

        public static /* synthetic */ PhotoTaken copy$default(PhotoTaken photoTaken, SddrFlowState sddrFlowState, PhotoDocument photoDocument, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = photoTaken.state;
            }
            if ((i & 2) != 0) {
                photoDocument = photoTaken.document;
            }
            return photoTaken.copy(sddrFlowState, photoDocument);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final PhotoDocument getDocument() {
            return this.document;
        }

        public final PhotoTaken copy(SddrFlowState state, PhotoDocument document) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(document, "document");
            return new PhotoTaken(state, document);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoTaken)) {
                return false;
            }
            PhotoTaken photoTaken = (PhotoTaken) other;
            return Intrinsics.areEqual(this.state, photoTaken.state) && Intrinsics.areEqual(this.document, photoTaken.document);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.document.hashCode();
        }

        public String toString() {
            return "PhotoTaken(state=" + this.state + ", document=" + this.document + ")";
        }

        public PhotoTaken(SddrFlowState state, PhotoDocument document) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(document, "document");
            this.state = state;
            this.document = document;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent
        public SddrFlowState getState() {
            return this.state;
        }

        public final PhotoDocument getDocument() {
            return this.document;
        }
    }

    /* compiled from: SddrFlowEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$PhotoAccepted;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "document", "Lcom/robinhood/models/api/PhotoDocument;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;Lcom/robinhood/models/api/PhotoDocument;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getDocument", "()Lcom/robinhood/models/api/PhotoDocument;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PhotoAccepted implements SddrFlowEvent {
        public static final int $stable = 8;
        private final PhotoDocument document;
        private final SddrFlowState state;

        public static /* synthetic */ PhotoAccepted copy$default(PhotoAccepted photoAccepted, SddrFlowState sddrFlowState, PhotoDocument photoDocument, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = photoAccepted.state;
            }
            if ((i & 2) != 0) {
                photoDocument = photoAccepted.document;
            }
            return photoAccepted.copy(sddrFlowState, photoDocument);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final PhotoDocument getDocument() {
            return this.document;
        }

        public final PhotoAccepted copy(SddrFlowState state, PhotoDocument document) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(document, "document");
            return new PhotoAccepted(state, document);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoAccepted)) {
                return false;
            }
            PhotoAccepted photoAccepted = (PhotoAccepted) other;
            return Intrinsics.areEqual(this.state, photoAccepted.state) && Intrinsics.areEqual(this.document, photoAccepted.document);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.document.hashCode();
        }

        public String toString() {
            return "PhotoAccepted(state=" + this.state + ", document=" + this.document + ")";
        }

        public PhotoAccepted(SddrFlowState state, PhotoDocument document) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(document, "document");
            this.state = state;
            this.document = document;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent
        public SddrFlowState getState() {
            return this.state;
        }

        public final PhotoDocument getDocument() {
            return this.document;
        }
    }

    /* compiled from: SddrFlowEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$PdfUploaded;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "document", "Lcom/robinhood/models/api/PdfDocument;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;Lcom/robinhood/models/api/PdfDocument;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getDocument", "()Lcom/robinhood/models/api/PdfDocument;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PdfUploaded implements SddrFlowEvent {
        public static final int $stable = 8;
        private final PdfDocument document;
        private final SddrFlowState state;

        public static /* synthetic */ PdfUploaded copy$default(PdfUploaded pdfUploaded, SddrFlowState sddrFlowState, PdfDocument pdfDocument, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = pdfUploaded.state;
            }
            if ((i & 2) != 0) {
                pdfDocument = pdfUploaded.document;
            }
            return pdfUploaded.copy(sddrFlowState, pdfDocument);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final PdfDocument getDocument() {
            return this.document;
        }

        public final PdfUploaded copy(SddrFlowState state, PdfDocument document) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(document, "document");
            return new PdfUploaded(state, document);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PdfUploaded)) {
                return false;
            }
            PdfUploaded pdfUploaded = (PdfUploaded) other;
            return Intrinsics.areEqual(this.state, pdfUploaded.state) && Intrinsics.areEqual(this.document, pdfUploaded.document);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.document.hashCode();
        }

        public String toString() {
            return "PdfUploaded(state=" + this.state + ", document=" + this.document + ")";
        }

        public PdfUploaded(SddrFlowState state, PdfDocument document) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(document, "document");
            this.state = state;
            this.document = document;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent
        public SddrFlowState getState() {
            return this.state;
        }

        public final PdfDocument getDocument() {
            return this.document;
        }
    }

    /* compiled from: SddrFlowEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$PdfAccepted;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "document", "Lcom/robinhood/models/api/PdfDocument;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;Lcom/robinhood/models/api/PdfDocument;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getDocument", "()Lcom/robinhood/models/api/PdfDocument;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PdfAccepted implements SddrFlowEvent {
        public static final int $stable = 8;
        private final PdfDocument document;
        private final SddrFlowState state;

        public static /* synthetic */ PdfAccepted copy$default(PdfAccepted pdfAccepted, SddrFlowState sddrFlowState, PdfDocument pdfDocument, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = pdfAccepted.state;
            }
            if ((i & 2) != 0) {
                pdfDocument = pdfAccepted.document;
            }
            return pdfAccepted.copy(sddrFlowState, pdfDocument);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final PdfDocument getDocument() {
            return this.document;
        }

        public final PdfAccepted copy(SddrFlowState state, PdfDocument document) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(document, "document");
            return new PdfAccepted(state, document);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PdfAccepted)) {
                return false;
            }
            PdfAccepted pdfAccepted = (PdfAccepted) other;
            return Intrinsics.areEqual(this.state, pdfAccepted.state) && Intrinsics.areEqual(this.document, pdfAccepted.document);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.document.hashCode();
        }

        public String toString() {
            return "PdfAccepted(state=" + this.state + ", document=" + this.document + ")";
        }

        public PdfAccepted(SddrFlowState state, PdfDocument document) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(document, "document");
            this.state = state;
            this.document = document;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent
        public SddrFlowState getState() {
            return this.state;
        }

        public final PdfDocument getDocument() {
            return this.document;
        }
    }

    /* compiled from: SddrFlowEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent$PopBack;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent;", "<init>", "()V", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PopBack implements SddrFlowEvent {
        public static final int $stable = 0;
        public static final PopBack INSTANCE = new PopBack();

        public boolean equals(Object other) {
            return this == other || (other instanceof PopBack);
        }

        public int hashCode() {
            return -228656144;
        }

        public String toString() {
            return "PopBack";
        }

        private PopBack() {
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent
        public SddrFlowState getState() {
            throw new IllegalStateException("Do not use state on back navigation event");
        }
    }
}
