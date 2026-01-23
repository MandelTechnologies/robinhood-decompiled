package com.robinhood.android.doc.serverdriven.parent;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.PdfDocument;
import com.robinhood.models.api.PhotoDocument;
import com.robinhood.models.api.identi.ApiDocumentRequestContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SddrDestination.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0006\u0007\b\t\n\u000b\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination;", "Landroid/os/Parcelable;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "DocumentType", "Country", "Splash", "PdfReview", "Capture", "PhotoReview", "Submission", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$Capture;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$Country;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$DocumentType;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$PdfReview;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$PhotoReview;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$Splash;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$Submission;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface SddrDestination extends Parcelable {
    SddrFlowState getState();

    /* compiled from: SddrDestination.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$DocumentType;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "content", "Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$DocumentTypeScreen;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$DocumentTypeScreen;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getContent", "()Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$DocumentTypeScreen;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DocumentType implements SddrDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<DocumentType> CREATOR = new Creator();
        private final ApiDocumentRequestContent.DocumentTypeScreen content;
        private final SddrFlowState state;

        /* compiled from: SddrDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DocumentType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentType(SddrFlowState.CREATOR.createFromParcel(parcel), (ApiDocumentRequestContent.DocumentTypeScreen) parcel.readParcelable(DocumentType.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentType[] newArray(int i) {
                return new DocumentType[i];
            }
        }

        public static /* synthetic */ DocumentType copy$default(DocumentType documentType, SddrFlowState sddrFlowState, ApiDocumentRequestContent.DocumentTypeScreen documentTypeScreen, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = documentType.state;
            }
            if ((i & 2) != 0) {
                documentTypeScreen = documentType.content;
            }
            return documentType.copy(sddrFlowState, documentTypeScreen);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiDocumentRequestContent.DocumentTypeScreen getContent() {
            return this.content;
        }

        public final DocumentType copy(SddrFlowState state, ApiDocumentRequestContent.DocumentTypeScreen content) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(content, "content");
            return new DocumentType(state, content);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentType)) {
                return false;
            }
            DocumentType documentType = (DocumentType) other;
            return Intrinsics.areEqual(this.state, documentType.state) && Intrinsics.areEqual(this.content, documentType.content);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.content.hashCode();
        }

        public String toString() {
            return "DocumentType(state=" + this.state + ", content=" + this.content + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.state.writeToParcel(dest, flags);
            dest.writeParcelable(this.content, flags);
        }

        public DocumentType(SddrFlowState state, ApiDocumentRequestContent.DocumentTypeScreen content) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(content, "content");
            this.state = state;
            this.content = content;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrDestination
        public SddrFlowState getState() {
            return this.state;
        }

        public final ApiDocumentRequestContent.DocumentTypeScreen getContent() {
            return this.content;
        }
    }

    /* compiled from: SddrDestination.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$Country;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "content", "Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$CountryScreen;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$CountryScreen;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getContent", "()Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$CountryScreen;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Country implements SddrDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Country> CREATOR = new Creator();
        private final ApiDocumentRequestContent.CountryScreen content;
        private final SddrFlowState state;

        /* compiled from: SddrDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Country> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Country createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Country(SddrFlowState.CREATOR.createFromParcel(parcel), (ApiDocumentRequestContent.CountryScreen) parcel.readParcelable(Country.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Country[] newArray(int i) {
                return new Country[i];
            }
        }

        public static /* synthetic */ Country copy$default(Country country, SddrFlowState sddrFlowState, ApiDocumentRequestContent.CountryScreen countryScreen, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = country.state;
            }
            if ((i & 2) != 0) {
                countryScreen = country.content;
            }
            return country.copy(sddrFlowState, countryScreen);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiDocumentRequestContent.CountryScreen getContent() {
            return this.content;
        }

        public final Country copy(SddrFlowState state, ApiDocumentRequestContent.CountryScreen content) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(content, "content");
            return new Country(state, content);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Country)) {
                return false;
            }
            Country country = (Country) other;
            return Intrinsics.areEqual(this.state, country.state) && Intrinsics.areEqual(this.content, country.content);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.content.hashCode();
        }

        public String toString() {
            return "Country(state=" + this.state + ", content=" + this.content + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.state.writeToParcel(dest, flags);
            dest.writeParcelable(this.content, flags);
        }

        public Country(SddrFlowState state, ApiDocumentRequestContent.CountryScreen content) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(content, "content");
            this.state = state;
            this.content = content;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrDestination
        public SddrFlowState getState() {
            return this.state;
        }

        public final ApiDocumentRequestContent.CountryScreen getContent() {
            return this.content;
        }
    }

    /* compiled from: SddrDestination.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$Splash;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "content", "Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$SplashScreen;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$SplashScreen;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getContent", "()Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$SplashScreen;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Splash implements SddrDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Splash> CREATOR = new Creator();
        private final ApiDocumentRequestContent.SplashScreen content;
        private final SddrFlowState state;

        /* compiled from: SddrDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Splash> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Splash createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Splash(SddrFlowState.CREATOR.createFromParcel(parcel), (ApiDocumentRequestContent.SplashScreen) parcel.readParcelable(Splash.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Splash[] newArray(int i) {
                return new Splash[i];
            }
        }

        public static /* synthetic */ Splash copy$default(Splash splash, SddrFlowState sddrFlowState, ApiDocumentRequestContent.SplashScreen splashScreen, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = splash.state;
            }
            if ((i & 2) != 0) {
                splashScreen = splash.content;
            }
            return splash.copy(sddrFlowState, splashScreen);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiDocumentRequestContent.SplashScreen getContent() {
            return this.content;
        }

        public final Splash copy(SddrFlowState state, ApiDocumentRequestContent.SplashScreen content) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(content, "content");
            return new Splash(state, content);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Splash)) {
                return false;
            }
            Splash splash = (Splash) other;
            return Intrinsics.areEqual(this.state, splash.state) && Intrinsics.areEqual(this.content, splash.content);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.content.hashCode();
        }

        public String toString() {
            return "Splash(state=" + this.state + ", content=" + this.content + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.state.writeToParcel(dest, flags);
            dest.writeParcelable(this.content, flags);
        }

        public Splash(SddrFlowState state, ApiDocumentRequestContent.SplashScreen content) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(content, "content");
            this.state = state;
            this.content = content;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrDestination
        public SddrFlowState getState() {
            return this.state;
        }

        public final ApiDocumentRequestContent.SplashScreen getContent() {
            return this.content;
        }
    }

    /* compiled from: SddrDestination.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$PdfReview;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "pdf", "Lcom/robinhood/models/api/PdfDocument;", "content", "Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$PdfUploadScreen;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;Lcom/robinhood/models/api/PdfDocument;Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$PdfUploadScreen;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getPdf", "()Lcom/robinhood/models/api/PdfDocument;", "getContent", "()Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$PdfUploadScreen;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PdfReview implements SddrDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PdfReview> CREATOR = new Creator();
        private final ApiDocumentRequestContent.PdfUploadScreen content;
        private final PdfDocument pdf;
        private final SddrFlowState state;

        /* compiled from: SddrDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PdfReview> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PdfReview createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PdfReview(SddrFlowState.CREATOR.createFromParcel(parcel), (PdfDocument) parcel.readParcelable(PdfReview.class.getClassLoader()), (ApiDocumentRequestContent.PdfUploadScreen) parcel.readParcelable(PdfReview.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PdfReview[] newArray(int i) {
                return new PdfReview[i];
            }
        }

        public static /* synthetic */ PdfReview copy$default(PdfReview pdfReview, SddrFlowState sddrFlowState, PdfDocument pdfDocument, ApiDocumentRequestContent.PdfUploadScreen pdfUploadScreen, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = pdfReview.state;
            }
            if ((i & 2) != 0) {
                pdfDocument = pdfReview.pdf;
            }
            if ((i & 4) != 0) {
                pdfUploadScreen = pdfReview.content;
            }
            return pdfReview.copy(sddrFlowState, pdfDocument, pdfUploadScreen);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final PdfDocument getPdf() {
            return this.pdf;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiDocumentRequestContent.PdfUploadScreen getContent() {
            return this.content;
        }

        public final PdfReview copy(SddrFlowState state, PdfDocument pdf, ApiDocumentRequestContent.PdfUploadScreen content) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(pdf, "pdf");
            Intrinsics.checkNotNullParameter(content, "content");
            return new PdfReview(state, pdf, content);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PdfReview)) {
                return false;
            }
            PdfReview pdfReview = (PdfReview) other;
            return Intrinsics.areEqual(this.state, pdfReview.state) && Intrinsics.areEqual(this.pdf, pdfReview.pdf) && Intrinsics.areEqual(this.content, pdfReview.content);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.pdf.hashCode()) * 31) + this.content.hashCode();
        }

        public String toString() {
            return "PdfReview(state=" + this.state + ", pdf=" + this.pdf + ", content=" + this.content + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.state.writeToParcel(dest, flags);
            dest.writeParcelable(this.pdf, flags);
            dest.writeParcelable(this.content, flags);
        }

        public PdfReview(SddrFlowState state, PdfDocument pdf, ApiDocumentRequestContent.PdfUploadScreen content) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(pdf, "pdf");
            Intrinsics.checkNotNullParameter(content, "content");
            this.state = state;
            this.pdf = pdf;
            this.content = content;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrDestination
        public SddrFlowState getState() {
            return this.state;
        }

        public final PdfDocument getPdf() {
            return this.pdf;
        }

        public final ApiDocumentRequestContent.PdfUploadScreen getContent() {
            return this.content;
        }
    }

    /* compiled from: SddrDestination.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$Capture;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "captureSide", "Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$CaptureScreen$CaptureSide;", "requirementsButtonTitle", "", "requirementsContent", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$CaptureScreen$CaptureSide;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getCaptureSide", "()Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$CaptureScreen$CaptureSide;", "getRequirementsButtonTitle", "()Ljava/lang/String;", "getRequirementsContent", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Capture implements SddrDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Capture> CREATOR = new Creator();
        private final ApiDocumentRequestContent.CaptureScreen.CaptureSide captureSide;
        private final String requirementsButtonTitle;
        private final UIComponent<GenericAction> requirementsContent;
        private final SddrFlowState state;

        /* compiled from: SddrDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Capture> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Capture createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Capture(SddrFlowState.CREATOR.createFromParcel(parcel), (ApiDocumentRequestContent.CaptureScreen.CaptureSide) parcel.readParcelable(Capture.class.getClassLoader()), parcel.readString(), (UIComponent) parcel.readParcelable(Capture.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Capture[] newArray(int i) {
                return new Capture[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Capture copy$default(Capture capture, SddrFlowState sddrFlowState, ApiDocumentRequestContent.CaptureScreen.CaptureSide captureSide, String str, UIComponent uIComponent, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = capture.state;
            }
            if ((i & 2) != 0) {
                captureSide = capture.captureSide;
            }
            if ((i & 4) != 0) {
                str = capture.requirementsButtonTitle;
            }
            if ((i & 8) != 0) {
                uIComponent = capture.requirementsContent;
            }
            return capture.copy(sddrFlowState, captureSide, str, uIComponent);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiDocumentRequestContent.CaptureScreen.CaptureSide getCaptureSide() {
            return this.captureSide;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRequirementsButtonTitle() {
            return this.requirementsButtonTitle;
        }

        public final UIComponent<GenericAction> component4() {
            return this.requirementsContent;
        }

        public final Capture copy(SddrFlowState state, ApiDocumentRequestContent.CaptureScreen.CaptureSide captureSide, String requirementsButtonTitle, UIComponent<? extends GenericAction> requirementsContent) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(captureSide, "captureSide");
            Intrinsics.checkNotNullParameter(requirementsButtonTitle, "requirementsButtonTitle");
            Intrinsics.checkNotNullParameter(requirementsContent, "requirementsContent");
            return new Capture(state, captureSide, requirementsButtonTitle, requirementsContent);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Capture)) {
                return false;
            }
            Capture capture = (Capture) other;
            return Intrinsics.areEqual(this.state, capture.state) && Intrinsics.areEqual(this.captureSide, capture.captureSide) && Intrinsics.areEqual(this.requirementsButtonTitle, capture.requirementsButtonTitle) && Intrinsics.areEqual(this.requirementsContent, capture.requirementsContent);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.captureSide.hashCode()) * 31) + this.requirementsButtonTitle.hashCode()) * 31) + this.requirementsContent.hashCode();
        }

        public String toString() {
            return "Capture(state=" + this.state + ", captureSide=" + this.captureSide + ", requirementsButtonTitle=" + this.requirementsButtonTitle + ", requirementsContent=" + this.requirementsContent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.state.writeToParcel(dest, flags);
            dest.writeParcelable(this.captureSide, flags);
            dest.writeString(this.requirementsButtonTitle);
            dest.writeParcelable(this.requirementsContent, flags);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Capture(SddrFlowState state, ApiDocumentRequestContent.CaptureScreen.CaptureSide captureSide, String requirementsButtonTitle, UIComponent<? extends GenericAction> requirementsContent) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(captureSide, "captureSide");
            Intrinsics.checkNotNullParameter(requirementsButtonTitle, "requirementsButtonTitle");
            Intrinsics.checkNotNullParameter(requirementsContent, "requirementsContent");
            this.state = state;
            this.captureSide = captureSide;
            this.requirementsButtonTitle = requirementsButtonTitle;
            this.requirementsContent = requirementsContent;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrDestination
        public SddrFlowState getState() {
            return this.state;
        }

        public final ApiDocumentRequestContent.CaptureScreen.CaptureSide getCaptureSide() {
            return this.captureSide;
        }

        public final String getRequirementsButtonTitle() {
            return this.requirementsButtonTitle;
        }

        public final UIComponent<GenericAction> getRequirementsContent() {
            return this.requirementsContent;
        }
    }

    /* compiled from: SddrDestination.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$PhotoReview;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "photo", "Lcom/robinhood/models/api/PhotoDocument;", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;Lcom/robinhood/models/api/PhotoDocument;)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getPhoto", "()Lcom/robinhood/models/api/PhotoDocument;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PhotoReview implements SddrDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PhotoReview> CREATOR = new Creator();
        private final PhotoDocument photo;
        private final SddrFlowState state;

        /* compiled from: SddrDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PhotoReview> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PhotoReview createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhotoReview(SddrFlowState.CREATOR.createFromParcel(parcel), (PhotoDocument) parcel.readParcelable(PhotoReview.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PhotoReview[] newArray(int i) {
                return new PhotoReview[i];
            }
        }

        public static /* synthetic */ PhotoReview copy$default(PhotoReview photoReview, SddrFlowState sddrFlowState, PhotoDocument photoDocument, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = photoReview.state;
            }
            if ((i & 2) != 0) {
                photoDocument = photoReview.photo;
            }
            return photoReview.copy(sddrFlowState, photoDocument);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final PhotoDocument getPhoto() {
            return this.photo;
        }

        public final PhotoReview copy(SddrFlowState state, PhotoDocument photo) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(photo, "photo");
            return new PhotoReview(state, photo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoReview)) {
                return false;
            }
            PhotoReview photoReview = (PhotoReview) other;
            return Intrinsics.areEqual(this.state, photoReview.state) && Intrinsics.areEqual(this.photo, photoReview.photo);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.photo.hashCode();
        }

        public String toString() {
            return "PhotoReview(state=" + this.state + ", photo=" + this.photo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.state.writeToParcel(dest, flags);
            dest.writeParcelable(this.photo, flags);
        }

        public PhotoReview(SddrFlowState state, PhotoDocument photo) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(photo, "photo");
            this.state = state;
            this.photo = photo;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrDestination
        public SddrFlowState getState() {
            return this.state;
        }

        public final PhotoDocument getPhoto() {
            return this.photo;
        }
    }

    /* compiled from: SddrDestination.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$Submission;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination;", "state", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "requestId", "Ljava/util/UUID;", "requestType", "", "mockRequests", "", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;Ljava/util/UUID;Ljava/lang/String;Z)V", "getState", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getRequestId", "()Ljava/util/UUID;", "getRequestType", "()Ljava/lang/String;", "getMockRequests", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Submission implements SddrDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Submission> CREATOR = new Creator();
        private final boolean mockRequests;
        private final UUID requestId;
        private final String requestType;
        private final SddrFlowState state;

        /* compiled from: SddrDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Submission> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Submission createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Submission(SddrFlowState.CREATOR.createFromParcel(parcel), (UUID) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Submission[] newArray(int i) {
                return new Submission[i];
            }
        }

        public static /* synthetic */ Submission copy$default(Submission submission, SddrFlowState sddrFlowState, UUID uuid, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrFlowState = submission.state;
            }
            if ((i & 2) != 0) {
                uuid = submission.requestId;
            }
            if ((i & 4) != 0) {
                str = submission.requestType;
            }
            if ((i & 8) != 0) {
                z = submission.mockRequests;
            }
            return submission.copy(sddrFlowState, uuid, str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrFlowState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getRequestId() {
            return this.requestId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRequestType() {
            return this.requestType;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getMockRequests() {
            return this.mockRequests;
        }

        public final Submission copy(SddrFlowState state, UUID requestId, String requestType, boolean mockRequests) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            return new Submission(state, requestId, requestType, mockRequests);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Submission)) {
                return false;
            }
            Submission submission = (Submission) other;
            return Intrinsics.areEqual(this.state, submission.state) && Intrinsics.areEqual(this.requestId, submission.requestId) && Intrinsics.areEqual(this.requestType, submission.requestType) && this.mockRequests == submission.mockRequests;
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.requestId.hashCode()) * 31) + this.requestType.hashCode()) * 31) + Boolean.hashCode(this.mockRequests);
        }

        public String toString() {
            return "Submission(state=" + this.state + ", requestId=" + this.requestId + ", requestType=" + this.requestType + ", mockRequests=" + this.mockRequests + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.state.writeToParcel(dest, flags);
            dest.writeSerializable(this.requestId);
            dest.writeString(this.requestType);
            dest.writeInt(this.mockRequests ? 1 : 0);
        }

        public Submission(SddrFlowState state, UUID requestId, String requestType, boolean z) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            this.state = state;
            this.requestId = requestId;
            this.requestType = requestType;
            this.mockRequests = z;
        }

        @Override // com.robinhood.android.doc.serverdriven.parent.SddrDestination
        public SddrFlowState getState() {
            return this.state;
        }

        public final UUID getRequestId() {
            return this.requestId;
        }

        public final String getRequestType() {
            return this.requestType;
        }

        public final boolean getMockRequests() {
            return this.mockRequests;
        }
    }
}
