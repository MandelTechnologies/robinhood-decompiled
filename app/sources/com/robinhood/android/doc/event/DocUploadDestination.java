package com.robinhood.android.doc.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.doc.p109ui.persona.PersonaStartStyle;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.DocUploadThanksContext;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.api.PdfDocument;
import com.robinhood.models.api.PhotoDocument;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.api.identi.ApiDocumentRequestContent;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.shared.documents.lib.docupload.UploadFlowDetails;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: DocUploadDestination.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0014\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0014\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination;", "Landroid/os/Parcelable;", "<init>", "()V", "ServerDrivenFlow", "PersonaStart", "PersonaClient", "PersonaSubmittedReport", "Prism", "VerifyResidency", "SelectType", "SelectOrigin", "Splash", "CaptureDocument", "PhotoReview", "PdfReview", "SelfieSplash", "Submission", "ChooseAddress", "CryptoUpgradeUnderReview", "Thanks", "Finish", "PopBack", "DelayedPopBack", "Lcom/robinhood/android/doc/event/DocUploadDestination$CaptureDocument;", "Lcom/robinhood/android/doc/event/DocUploadDestination$ChooseAddress;", "Lcom/robinhood/android/doc/event/DocUploadDestination$CryptoUpgradeUnderReview;", "Lcom/robinhood/android/doc/event/DocUploadDestination$DelayedPopBack;", "Lcom/robinhood/android/doc/event/DocUploadDestination$Finish;", "Lcom/robinhood/android/doc/event/DocUploadDestination$PdfReview;", "Lcom/robinhood/android/doc/event/DocUploadDestination$PersonaClient;", "Lcom/robinhood/android/doc/event/DocUploadDestination$PersonaStart;", "Lcom/robinhood/android/doc/event/DocUploadDestination$PersonaSubmittedReport;", "Lcom/robinhood/android/doc/event/DocUploadDestination$PhotoReview;", "Lcom/robinhood/android/doc/event/DocUploadDestination$PopBack;", "Lcom/robinhood/android/doc/event/DocUploadDestination$Prism;", "Lcom/robinhood/android/doc/event/DocUploadDestination$SelectOrigin;", "Lcom/robinhood/android/doc/event/DocUploadDestination$SelectType;", "Lcom/robinhood/android/doc/event/DocUploadDestination$SelfieSplash;", "Lcom/robinhood/android/doc/event/DocUploadDestination$ServerDrivenFlow;", "Lcom/robinhood/android/doc/event/DocUploadDestination$Splash;", "Lcom/robinhood/android/doc/event/DocUploadDestination$Submission;", "Lcom/robinhood/android/doc/event/DocUploadDestination$Thanks;", "Lcom/robinhood/android/doc/event/DocUploadDestination$VerifyResidency;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class DocUploadDestination implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ DocUploadDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DocUploadDestination() {
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$ServerDrivenFlow;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "content", "Lcom/robinhood/models/api/identi/ApiDocumentRequestContent;", "<init>", "(Lcom/robinhood/models/api/identi/ApiDocumentRequestContent;)V", "getContent", "()Lcom/robinhood/models/api/identi/ApiDocumentRequestContent;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ServerDrivenFlow extends DocUploadDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ServerDrivenFlow> CREATOR = new Creator();
        private final ApiDocumentRequestContent content;

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ServerDrivenFlow> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ServerDrivenFlow createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ServerDrivenFlow((ApiDocumentRequestContent) parcel.readParcelable(ServerDrivenFlow.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ServerDrivenFlow[] newArray(int i) {
                return new ServerDrivenFlow[i];
            }
        }

        public static /* synthetic */ ServerDrivenFlow copy$default(ServerDrivenFlow serverDrivenFlow, ApiDocumentRequestContent apiDocumentRequestContent, int i, Object obj) {
            if ((i & 1) != 0) {
                apiDocumentRequestContent = serverDrivenFlow.content;
            }
            return serverDrivenFlow.copy(apiDocumentRequestContent);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiDocumentRequestContent getContent() {
            return this.content;
        }

        public final ServerDrivenFlow copy(ApiDocumentRequestContent content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new ServerDrivenFlow(content);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ServerDrivenFlow) && Intrinsics.areEqual(this.content, ((ServerDrivenFlow) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "ServerDrivenFlow(content=" + this.content + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.content, flags);
        }

        public final ApiDocumentRequestContent getContent() {
            return this.content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServerDrivenFlow(ApiDocumentRequestContent content) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000f¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$PersonaStart;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "loggedOutUserUuid", "Ljava/util/UUID;", "skipInquiryVerificationForUnauthedSelfieConsent", "", ResourceTypes.STYLE, "Lcom/robinhood/android/doc/ui/persona/PersonaStartStyle;", "isGdpr", "isVideoSelfie", "<init>", "(Ljava/util/UUID;ZLcom/robinhood/android/doc/ui/persona/PersonaStartStyle;ZZ)V", "getLoggedOutUserUuid", "()Ljava/util/UUID;", "getSkipInquiryVerificationForUnauthedSelfieConsent", "()Z", "getStyle", "()Lcom/robinhood/android/doc/ui/persona/PersonaStartStyle;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PersonaStart extends DocUploadDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PersonaStart> CREATOR = new Creator();
        private final boolean isGdpr;
        private final boolean isVideoSelfie;
        private final UUID loggedOutUserUuid;
        private final boolean skipInquiryVerificationForUnauthedSelfieConsent;
        private final PersonaStartStyle style;

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PersonaStart> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PersonaStart createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                PersonaStartStyle personaStartStyle;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                PersonaStartStyle personaStartStyleValueOf = PersonaStartStyle.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z2 = true;
                    personaStartStyle = personaStartStyleValueOf;
                    z3 = true;
                } else {
                    z2 = true;
                    personaStartStyle = personaStartStyleValueOf;
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new PersonaStart(uuid, z4, personaStartStyle, z3, z2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PersonaStart[] newArray(int i) {
                return new PersonaStart[i];
            }
        }

        public static /* synthetic */ PersonaStart copy$default(PersonaStart personaStart, UUID uuid, boolean z, PersonaStartStyle personaStartStyle, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = personaStart.loggedOutUserUuid;
            }
            if ((i & 2) != 0) {
                z = personaStart.skipInquiryVerificationForUnauthedSelfieConsent;
            }
            if ((i & 4) != 0) {
                personaStartStyle = personaStart.style;
            }
            if ((i & 8) != 0) {
                z2 = personaStart.isGdpr;
            }
            if ((i & 16) != 0) {
                z3 = personaStart.isVideoSelfie;
            }
            boolean z4 = z3;
            PersonaStartStyle personaStartStyle2 = personaStartStyle;
            return personaStart.copy(uuid, z, personaStartStyle2, z2, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getLoggedOutUserUuid() {
            return this.loggedOutUserUuid;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSkipInquiryVerificationForUnauthedSelfieConsent() {
            return this.skipInquiryVerificationForUnauthedSelfieConsent;
        }

        /* renamed from: component3, reason: from getter */
        public final PersonaStartStyle getStyle() {
            return this.style;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsGdpr() {
            return this.isGdpr;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsVideoSelfie() {
            return this.isVideoSelfie;
        }

        public final PersonaStart copy(UUID loggedOutUserUuid, boolean skipInquiryVerificationForUnauthedSelfieConsent, PersonaStartStyle style, boolean isGdpr, boolean isVideoSelfie) {
            Intrinsics.checkNotNullParameter(style, "style");
            return new PersonaStart(loggedOutUserUuid, skipInquiryVerificationForUnauthedSelfieConsent, style, isGdpr, isVideoSelfie);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PersonaStart)) {
                return false;
            }
            PersonaStart personaStart = (PersonaStart) other;
            return Intrinsics.areEqual(this.loggedOutUserUuid, personaStart.loggedOutUserUuid) && this.skipInquiryVerificationForUnauthedSelfieConsent == personaStart.skipInquiryVerificationForUnauthedSelfieConsent && this.style == personaStart.style && this.isGdpr == personaStart.isGdpr && this.isVideoSelfie == personaStart.isVideoSelfie;
        }

        public int hashCode() {
            UUID uuid = this.loggedOutUserUuid;
            return ((((((((uuid == null ? 0 : uuid.hashCode()) * 31) + Boolean.hashCode(this.skipInquiryVerificationForUnauthedSelfieConsent)) * 31) + this.style.hashCode()) * 31) + Boolean.hashCode(this.isGdpr)) * 31) + Boolean.hashCode(this.isVideoSelfie);
        }

        public String toString() {
            return "PersonaStart(loggedOutUserUuid=" + this.loggedOutUserUuid + ", skipInquiryVerificationForUnauthedSelfieConsent=" + this.skipInquiryVerificationForUnauthedSelfieConsent + ", style=" + this.style + ", isGdpr=" + this.isGdpr + ", isVideoSelfie=" + this.isVideoSelfie + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.loggedOutUserUuid);
            dest.writeInt(this.skipInquiryVerificationForUnauthedSelfieConsent ? 1 : 0);
            dest.writeString(this.style.name());
            dest.writeInt(this.isGdpr ? 1 : 0);
            dest.writeInt(this.isVideoSelfie ? 1 : 0);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ PersonaStart(java.util.UUID r2, boolean r3, com.robinhood.android.doc.p109ui.persona.PersonaStartStyle r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L5
                r2 = 0
            L5:
                r8 = r7 & 2
                r0 = 0
                if (r8 == 0) goto Lb
                r3 = r0
            Lb:
                r8 = r7 & 8
                if (r8 == 0) goto L10
                r5 = r0
            L10:
                r7 = r7 & 16
                if (r7 == 0) goto L1b
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L21
            L1b:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L21:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.doc.event.DocUploadDestination.PersonaStart.<init>(java.util.UUID, boolean, com.robinhood.android.doc.ui.persona.PersonaStartStyle, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final UUID getLoggedOutUserUuid() {
            return this.loggedOutUserUuid;
        }

        public final boolean getSkipInquiryVerificationForUnauthedSelfieConsent() {
            return this.skipInquiryVerificationForUnauthedSelfieConsent;
        }

        public final PersonaStartStyle getStyle() {
            return this.style;
        }

        public final boolean isGdpr() {
            return this.isGdpr;
        }

        public final boolean isVideoSelfie() {
            return this.isVideoSelfie;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PersonaStart(UUID uuid, boolean z, PersonaStartStyle style, boolean z2, boolean z3) {
            super(null);
            Intrinsics.checkNotNullParameter(style, "style");
            this.loggedOutUserUuid = uuid;
            this.skipInquiryVerificationForUnauthedSelfieConsent = z;
            this.style = style;
            this.isGdpr = z2;
            this.isVideoSelfie = z3;
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$PersonaClient;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "photoIdRequest", "Lcom/robinhood/models/ui/DocumentRequest;", "selfieRequest", "useCombinedTemplate", "", "skipBiometric", "exitOnPersonaError", "<init>", "(Lcom/robinhood/models/ui/DocumentRequest;Lcom/robinhood/models/ui/DocumentRequest;ZZZ)V", "getPhotoIdRequest", "()Lcom/robinhood/models/ui/DocumentRequest;", "getSelfieRequest", "getUseCombinedTemplate", "()Z", "getSkipBiometric", "getExitOnPersonaError", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PersonaClient extends DocUploadDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PersonaClient> CREATOR = new Creator();
        private final boolean exitOnPersonaError;
        private final DocumentRequest photoIdRequest;
        private final DocumentRequest selfieRequest;
        private final boolean skipBiometric;
        private final boolean useCombinedTemplate;

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PersonaClient> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PersonaClient createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                DocumentRequest documentRequest = (DocumentRequest) parcel.readParcelable(PersonaClient.class.getClassLoader());
                DocumentRequest documentRequest2 = (DocumentRequest) parcel.readParcelable(PersonaClient.class.getClassLoader());
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new PersonaClient(documentRequest, documentRequest2, z3, z4, z2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PersonaClient[] newArray(int i) {
                return new PersonaClient[i];
            }
        }

        public static /* synthetic */ PersonaClient copy$default(PersonaClient personaClient, DocumentRequest documentRequest, DocumentRequest documentRequest2, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                documentRequest = personaClient.photoIdRequest;
            }
            if ((i & 2) != 0) {
                documentRequest2 = personaClient.selfieRequest;
            }
            if ((i & 4) != 0) {
                z = personaClient.useCombinedTemplate;
            }
            if ((i & 8) != 0) {
                z2 = personaClient.skipBiometric;
            }
            if ((i & 16) != 0) {
                z3 = personaClient.exitOnPersonaError;
            }
            boolean z4 = z3;
            boolean z5 = z;
            return personaClient.copy(documentRequest, documentRequest2, z5, z2, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final DocumentRequest getPhotoIdRequest() {
            return this.photoIdRequest;
        }

        /* renamed from: component2, reason: from getter */
        public final DocumentRequest getSelfieRequest() {
            return this.selfieRequest;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getUseCombinedTemplate() {
            return this.useCombinedTemplate;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getSkipBiometric() {
            return this.skipBiometric;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getExitOnPersonaError() {
            return this.exitOnPersonaError;
        }

        public final PersonaClient copy(DocumentRequest photoIdRequest, DocumentRequest selfieRequest, boolean useCombinedTemplate, boolean skipBiometric, boolean exitOnPersonaError) {
            return new PersonaClient(photoIdRequest, selfieRequest, useCombinedTemplate, skipBiometric, exitOnPersonaError);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PersonaClient)) {
                return false;
            }
            PersonaClient personaClient = (PersonaClient) other;
            return Intrinsics.areEqual(this.photoIdRequest, personaClient.photoIdRequest) && Intrinsics.areEqual(this.selfieRequest, personaClient.selfieRequest) && this.useCombinedTemplate == personaClient.useCombinedTemplate && this.skipBiometric == personaClient.skipBiometric && this.exitOnPersonaError == personaClient.exitOnPersonaError;
        }

        public int hashCode() {
            DocumentRequest documentRequest = this.photoIdRequest;
            int iHashCode = (documentRequest == null ? 0 : documentRequest.hashCode()) * 31;
            DocumentRequest documentRequest2 = this.selfieRequest;
            return ((((((iHashCode + (documentRequest2 != null ? documentRequest2.hashCode() : 0)) * 31) + Boolean.hashCode(this.useCombinedTemplate)) * 31) + Boolean.hashCode(this.skipBiometric)) * 31) + Boolean.hashCode(this.exitOnPersonaError);
        }

        public String toString() {
            return "PersonaClient(photoIdRequest=" + this.photoIdRequest + ", selfieRequest=" + this.selfieRequest + ", useCombinedTemplate=" + this.useCombinedTemplate + ", skipBiometric=" + this.skipBiometric + ", exitOnPersonaError=" + this.exitOnPersonaError + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.photoIdRequest, flags);
            dest.writeParcelable(this.selfieRequest, flags);
            dest.writeInt(this.useCombinedTemplate ? 1 : 0);
            dest.writeInt(this.skipBiometric ? 1 : 0);
            dest.writeInt(this.exitOnPersonaError ? 1 : 0);
        }

        public /* synthetic */ PersonaClient(DocumentRequest documentRequest, DocumentRequest documentRequest2, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(documentRequest, documentRequest2, z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
        }

        public final DocumentRequest getPhotoIdRequest() {
            return this.photoIdRequest;
        }

        public final DocumentRequest getSelfieRequest() {
            return this.selfieRequest;
        }

        public final boolean getUseCombinedTemplate() {
            return this.useCombinedTemplate;
        }

        public final boolean getSkipBiometric() {
            return this.skipBiometric;
        }

        public final boolean getExitOnPersonaError() {
            return this.exitOnPersonaError;
        }

        public PersonaClient(DocumentRequest documentRequest, DocumentRequest documentRequest2, boolean z, boolean z2, boolean z3) {
            super(null);
            this.photoIdRequest = documentRequest;
            this.selfieRequest = documentRequest2;
            this.useCombinedTemplate = z;
            this.skipBiometric = z2;
            this.exitOnPersonaError = z3;
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$PersonaSubmittedReport;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PersonaSubmittedReport extends DocUploadDestination {
        public static final int $stable = 0;
        public static final PersonaSubmittedReport INSTANCE = new PersonaSubmittedReport();
        public static final Parcelable.Creator<PersonaSubmittedReport> CREATOR = new Creator();

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PersonaSubmittedReport> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PersonaSubmittedReport createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PersonaSubmittedReport.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PersonaSubmittedReport[] newArray(int i) {
                return new PersonaSubmittedReport[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PersonaSubmittedReport);
        }

        public int hashCode() {
            return -906834562;
        }

        public String toString() {
            return "PersonaSubmittedReport";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private PersonaSubmittedReport() {
            super(null);
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$Prism;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "requestId", "Ljava/util/UUID;", "isCollection", "", "<init>", "(Ljava/util/UUID;Z)V", "getRequestId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Prism extends DocUploadDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Prism> CREATOR = new Creator();
        private final boolean isCollection;
        private final UUID requestId;

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Prism> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Prism createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Prism((UUID) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Prism[] newArray(int i) {
                return new Prism[i];
            }
        }

        public static /* synthetic */ Prism copy$default(Prism prism, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = prism.requestId;
            }
            if ((i & 2) != 0) {
                z = prism.isCollection;
            }
            return prism.copy(uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getRequestId() {
            return this.requestId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCollection() {
            return this.isCollection;
        }

        public final Prism copy(UUID requestId, boolean isCollection) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            return new Prism(requestId, isCollection);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Prism)) {
                return false;
            }
            Prism prism = (Prism) other;
            return Intrinsics.areEqual(this.requestId, prism.requestId) && this.isCollection == prism.isCollection;
        }

        public int hashCode() {
            return (this.requestId.hashCode() * 31) + Boolean.hashCode(this.isCollection);
        }

        public String toString() {
            return "Prism(requestId=" + this.requestId + ", isCollection=" + this.isCollection + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.requestId);
            dest.writeInt(this.isCollection ? 1 : 0);
        }

        public final UUID getRequestId() {
            return this.requestId;
        }

        public final boolean isCollection() {
            return this.isCollection;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Prism(UUID requestId, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.requestId = requestId;
            this.isCollection = z;
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$VerifyResidency;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "requestType", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "<init>", "(Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;)V", "getRequestType", "()Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class VerifyResidency extends DocUploadDestination {
        public static final int $stable = 0;
        public static final Parcelable.Creator<VerifyResidency> CREATOR = new Creator();
        private final ApiDocumentRequest.Type requestType;

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<VerifyResidency> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerifyResidency createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VerifyResidency(ApiDocumentRequest.Type.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerifyResidency[] newArray(int i) {
                return new VerifyResidency[i];
            }
        }

        public static /* synthetic */ VerifyResidency copy$default(VerifyResidency verifyResidency, ApiDocumentRequest.Type type2, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = verifyResidency.requestType;
            }
            return verifyResidency.copy(type2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiDocumentRequest.Type getRequestType() {
            return this.requestType;
        }

        public final VerifyResidency copy(ApiDocumentRequest.Type requestType) {
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            return new VerifyResidency(requestType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerifyResidency) && this.requestType == ((VerifyResidency) other).requestType;
        }

        public int hashCode() {
            return this.requestType.hashCode();
        }

        public String toString() {
            return "VerifyResidency(requestType=" + this.requestType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.requestType.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerifyResidency(ApiDocumentRequest.Type requestType) {
            super(null);
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            this.requestType = requestType;
        }

        public final ApiDocumentRequest.Type getRequestType() {
            return this.requestType;
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$SelectType;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "requestType", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "forCrypto", "", "isEntryDestination", "<init>", "(Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;ZZ)V", "getRequestType", "()Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "getForCrypto", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SelectType extends DocUploadDestination {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SelectType> CREATOR = new Creator();
        private final boolean forCrypto;
        private final boolean isEntryDestination;
        private final ApiDocumentRequest.Type requestType;

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectType(ApiDocumentRequest.Type.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectType[] newArray(int i) {
                return new SelectType[i];
            }
        }

        public static /* synthetic */ SelectType copy$default(SelectType selectType, ApiDocumentRequest.Type type2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = selectType.requestType;
            }
            if ((i & 2) != 0) {
                z = selectType.forCrypto;
            }
            if ((i & 4) != 0) {
                z2 = selectType.isEntryDestination;
            }
            return selectType.copy(type2, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiDocumentRequest.Type getRequestType() {
            return this.requestType;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getForCrypto() {
            return this.forCrypto;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsEntryDestination() {
            return this.isEntryDestination;
        }

        public final SelectType copy(ApiDocumentRequest.Type requestType, boolean forCrypto, boolean isEntryDestination) {
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            return new SelectType(requestType, forCrypto, isEntryDestination);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectType)) {
                return false;
            }
            SelectType selectType = (SelectType) other;
            return this.requestType == selectType.requestType && this.forCrypto == selectType.forCrypto && this.isEntryDestination == selectType.isEntryDestination;
        }

        public int hashCode() {
            return (((this.requestType.hashCode() * 31) + Boolean.hashCode(this.forCrypto)) * 31) + Boolean.hashCode(this.isEntryDestination);
        }

        public String toString() {
            return "SelectType(requestType=" + this.requestType + ", forCrypto=" + this.forCrypto + ", isEntryDestination=" + this.isEntryDestination + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.requestType.name());
            dest.writeInt(this.forCrypto ? 1 : 0);
            dest.writeInt(this.isEntryDestination ? 1 : 0);
        }

        public /* synthetic */ SelectType(ApiDocumentRequest.Type type2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(type2, z, (i & 4) != 0 ? false : z2);
        }

        public final ApiDocumentRequest.Type getRequestType() {
            return this.requestType;
        }

        public final boolean getForCrypto() {
            return this.forCrypto;
        }

        public final boolean isEntryDestination() {
            return this.isEntryDestination;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectType(ApiDocumentRequest.Type requestType, boolean z, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            this.requestType = requestType;
            this.forCrypto = z;
            this.isEntryDestination = z2;
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\fHÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$SelectOrigin;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "documentType", "Lcom/robinhood/models/api/IdDocument$Type;", "requestType", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "omittedCountries", "", "Lcom/robinhood/iso/countrycode/CountryCode;", "isEntryDestination", "", "defaultCountry", "", "<init>", "(Lcom/robinhood/models/api/IdDocument$Type;Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;Ljava/util/List;ZLjava/lang/String;)V", "getDocumentType", "()Lcom/robinhood/models/api/IdDocument$Type;", "getRequestType", "()Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "getOmittedCountries", "()Ljava/util/List;", "()Z", "getDefaultCountry", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SelectOrigin extends DocUploadDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SelectOrigin> CREATOR = new Creator();
        private final String defaultCountry;
        private final IdDocument.Type documentType;
        private final boolean isEntryDestination;
        private final List<CountryCode> omittedCountries;
        private final ApiDocumentRequest.Type requestType;

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectOrigin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectOrigin createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdDocument.Type typeValueOf = IdDocument.Type.valueOf(parcel.readString());
                ApiDocumentRequest.Type typeValueOf2 = ApiDocumentRequest.Type.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new SelectOrigin(typeValueOf, typeValueOf2, arrayList, parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectOrigin[] newArray(int i) {
                return new SelectOrigin[i];
            }
        }

        public static /* synthetic */ SelectOrigin copy$default(SelectOrigin selectOrigin, IdDocument.Type type2, ApiDocumentRequest.Type type3, List list, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = selectOrigin.documentType;
            }
            if ((i & 2) != 0) {
                type3 = selectOrigin.requestType;
            }
            if ((i & 4) != 0) {
                list = selectOrigin.omittedCountries;
            }
            if ((i & 8) != 0) {
                z = selectOrigin.isEntryDestination;
            }
            if ((i & 16) != 0) {
                str = selectOrigin.defaultCountry;
            }
            String str2 = str;
            List list2 = list;
            return selectOrigin.copy(type2, type3, list2, z, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final IdDocument.Type getDocumentType() {
            return this.documentType;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiDocumentRequest.Type getRequestType() {
            return this.requestType;
        }

        public final List<CountryCode> component3() {
            return this.omittedCountries;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsEntryDestination() {
            return this.isEntryDestination;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDefaultCountry() {
            return this.defaultCountry;
        }

        public final SelectOrigin copy(IdDocument.Type documentType, ApiDocumentRequest.Type requestType, List<? extends CountryCode> omittedCountries, boolean isEntryDestination, String defaultCountry) {
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            Intrinsics.checkNotNullParameter(omittedCountries, "omittedCountries");
            return new SelectOrigin(documentType, requestType, omittedCountries, isEntryDestination, defaultCountry);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectOrigin)) {
                return false;
            }
            SelectOrigin selectOrigin = (SelectOrigin) other;
            return this.documentType == selectOrigin.documentType && this.requestType == selectOrigin.requestType && Intrinsics.areEqual(this.omittedCountries, selectOrigin.omittedCountries) && this.isEntryDestination == selectOrigin.isEntryDestination && Intrinsics.areEqual(this.defaultCountry, selectOrigin.defaultCountry);
        }

        public int hashCode() {
            int iHashCode = ((((((this.documentType.hashCode() * 31) + this.requestType.hashCode()) * 31) + this.omittedCountries.hashCode()) * 31) + Boolean.hashCode(this.isEntryDestination)) * 31;
            String str = this.defaultCountry;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SelectOrigin(documentType=" + this.documentType + ", requestType=" + this.requestType + ", omittedCountries=" + this.omittedCountries + ", isEntryDestination=" + this.isEntryDestination + ", defaultCountry=" + this.defaultCountry + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.documentType.name());
            dest.writeString(this.requestType.name());
            List<CountryCode> list = this.omittedCountries;
            dest.writeInt(list.size());
            Iterator<CountryCode> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
            dest.writeInt(this.isEntryDestination ? 1 : 0);
            dest.writeString(this.defaultCountry);
        }

        public final IdDocument.Type getDocumentType() {
            return this.documentType;
        }

        public final ApiDocumentRequest.Type getRequestType() {
            return this.requestType;
        }

        public /* synthetic */ SelectOrigin(IdDocument.Type type2, ApiDocumentRequest.Type type3, List list, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(type2, type3, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str);
        }

        public final List<CountryCode> getOmittedCountries() {
            return this.omittedCountries;
        }

        public final boolean isEntryDestination() {
            return this.isEntryDestination;
        }

        public final String getDefaultCountry() {
            return this.defaultCountry;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SelectOrigin(IdDocument.Type documentType, ApiDocumentRequest.Type requestType, List<? extends CountryCode> omittedCountries, boolean z, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            Intrinsics.checkNotNullParameter(omittedCountries, "omittedCountries");
            this.documentType = documentType;
            this.requestType = requestType;
            this.omittedCountries = omittedCountries;
            this.isEntryDestination = z;
            this.defaultCountry = str;
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$Splash;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "isEntryDestination", "", "backRequired", "<init>", "(Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;ZLjava/lang/Boolean;)V", "getDetails", "()Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "()Z", "getBackRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "enabledFileUpload", "getEnabledFileUpload", "enabledCameraPhoto", "getEnabledCameraPhoto", "component1", "component2", "component3", "copy", "(Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;ZLjava/lang/Boolean;)Lcom/robinhood/android/doc/event/DocUploadDestination$Splash;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Splash extends DocUploadDestination {
        public static final int $stable = UploadFlowDetails.$stable;
        public static final Parcelable.Creator<Splash> CREATOR = new Creator();
        private final Boolean backRequired;
        private final UploadFlowDetails details;
        private final boolean isEntryDestination;

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Splash> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Splash createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UploadFlowDetails uploadFlowDetails = (UploadFlowDetails) parcel.readParcelable(Splash.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Splash(uploadFlowDetails, z, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Splash[] newArray(int i) {
                return new Splash[i];
            }
        }

        public static /* synthetic */ Splash copy$default(Splash splash, UploadFlowDetails uploadFlowDetails, boolean z, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                uploadFlowDetails = splash.details;
            }
            if ((i & 2) != 0) {
                z = splash.isEntryDestination;
            }
            if ((i & 4) != 0) {
                bool = splash.backRequired;
            }
            return splash.copy(uploadFlowDetails, z, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final UploadFlowDetails getDetails() {
            return this.details;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEntryDestination() {
            return this.isEntryDestination;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getBackRequired() {
            return this.backRequired;
        }

        public final Splash copy(UploadFlowDetails details, boolean isEntryDestination, Boolean backRequired) {
            Intrinsics.checkNotNullParameter(details, "details");
            return new Splash(details, isEntryDestination, backRequired);
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
            return Intrinsics.areEqual(this.details, splash.details) && this.isEntryDestination == splash.isEntryDestination && Intrinsics.areEqual(this.backRequired, splash.backRequired);
        }

        public int hashCode() {
            int iHashCode = ((this.details.hashCode() * 31) + Boolean.hashCode(this.isEntryDestination)) * 31;
            Boolean bool = this.backRequired;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            return "Splash(details=" + this.details + ", isEntryDestination=" + this.isEntryDestination + ", backRequired=" + this.backRequired + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.details, flags);
            dest.writeInt(this.isEntryDestination ? 1 : 0);
            Boolean bool = this.backRequired;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }

        public /* synthetic */ Splash(UploadFlowDetails uploadFlowDetails, boolean z, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uploadFlowDetails, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : bool);
        }

        public final UploadFlowDetails getDetails() {
            return this.details;
        }

        public final boolean isEntryDestination() {
            return this.isEntryDestination;
        }

        public final Boolean getBackRequired() {
            return this.backRequired;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Splash(UploadFlowDetails details, boolean z, Boolean bool) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
            this.isEntryDestination = z;
            this.backRequired = bool;
        }

        public final boolean getEnabledFileUpload() {
            List<ApiDocumentRequest.AllowedCaptureMethods> allowedCaptureMethods = this.details.getAllowedCaptureMethods();
            return allowedCaptureMethods != null && allowedCaptureMethods.contains(ApiDocumentRequest.AllowedCaptureMethods.FILE_UPLOAD);
        }

        public final boolean getEnabledCameraPhoto() {
            List<ApiDocumentRequest.AllowedCaptureMethods> allowedCaptureMethods = this.details.getAllowedCaptureMethods();
            return allowedCaptureMethods != null && allowedCaptureMethods.contains(ApiDocumentRequest.AllowedCaptureMethods.CAMERA);
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$CaptureDocument;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "side", "Lcom/robinhood/models/api/IdDocument$Side;", "<init>", "(Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;Lcom/robinhood/models/api/IdDocument$Side;)V", "getDetails", "()Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "getSide", "()Lcom/robinhood/models/api/IdDocument$Side;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CaptureDocument extends DocUploadDestination {
        public static final int $stable = UploadFlowDetails.$stable;
        public static final Parcelable.Creator<CaptureDocument> CREATOR = new Creator();
        private final UploadFlowDetails details;
        private final IdDocument.Side side;

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CaptureDocument> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CaptureDocument createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CaptureDocument((UploadFlowDetails) parcel.readParcelable(CaptureDocument.class.getClassLoader()), IdDocument.Side.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CaptureDocument[] newArray(int i) {
                return new CaptureDocument[i];
            }
        }

        public static /* synthetic */ CaptureDocument copy$default(CaptureDocument captureDocument, UploadFlowDetails uploadFlowDetails, IdDocument.Side side, int i, Object obj) {
            if ((i & 1) != 0) {
                uploadFlowDetails = captureDocument.details;
            }
            if ((i & 2) != 0) {
                side = captureDocument.side;
            }
            return captureDocument.copy(uploadFlowDetails, side);
        }

        /* renamed from: component1, reason: from getter */
        public final UploadFlowDetails getDetails() {
            return this.details;
        }

        /* renamed from: component2, reason: from getter */
        public final IdDocument.Side getSide() {
            return this.side;
        }

        public final CaptureDocument copy(UploadFlowDetails details, IdDocument.Side side) {
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(side, "side");
            return new CaptureDocument(details, side);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CaptureDocument)) {
                return false;
            }
            CaptureDocument captureDocument = (CaptureDocument) other;
            return Intrinsics.areEqual(this.details, captureDocument.details) && this.side == captureDocument.side;
        }

        public int hashCode() {
            return (this.details.hashCode() * 31) + this.side.hashCode();
        }

        public String toString() {
            return "CaptureDocument(details=" + this.details + ", side=" + this.side + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.details, flags);
            dest.writeString(this.side.name());
        }

        public final UploadFlowDetails getDetails() {
            return this.details;
        }

        public final IdDocument.Side getSide() {
            return this.side;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CaptureDocument(UploadFlowDetails details, IdDocument.Side side) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(side, "side");
            this.details = details;
            this.side = side;
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$PhotoReview;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "photo", "Lcom/robinhood/models/api/PhotoDocument;", "<init>", "(Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;Lcom/robinhood/models/api/PhotoDocument;)V", "getDetails", "()Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "getPhoto", "()Lcom/robinhood/models/api/PhotoDocument;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PhotoReview extends DocUploadDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PhotoReview> CREATOR = new Creator();
        private final UploadFlowDetails details;
        private final PhotoDocument photo;

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PhotoReview> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PhotoReview createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhotoReview((UploadFlowDetails) parcel.readParcelable(PhotoReview.class.getClassLoader()), (PhotoDocument) parcel.readParcelable(PhotoReview.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PhotoReview[] newArray(int i) {
                return new PhotoReview[i];
            }
        }

        public static /* synthetic */ PhotoReview copy$default(PhotoReview photoReview, UploadFlowDetails uploadFlowDetails, PhotoDocument photoDocument, int i, Object obj) {
            if ((i & 1) != 0) {
                uploadFlowDetails = photoReview.details;
            }
            if ((i & 2) != 0) {
                photoDocument = photoReview.photo;
            }
            return photoReview.copy(uploadFlowDetails, photoDocument);
        }

        /* renamed from: component1, reason: from getter */
        public final UploadFlowDetails getDetails() {
            return this.details;
        }

        /* renamed from: component2, reason: from getter */
        public final PhotoDocument getPhoto() {
            return this.photo;
        }

        public final PhotoReview copy(UploadFlowDetails details, PhotoDocument photo) {
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(photo, "photo");
            return new PhotoReview(details, photo);
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
            return Intrinsics.areEqual(this.details, photoReview.details) && Intrinsics.areEqual(this.photo, photoReview.photo);
        }

        public int hashCode() {
            return (this.details.hashCode() * 31) + this.photo.hashCode();
        }

        public String toString() {
            return "PhotoReview(details=" + this.details + ", photo=" + this.photo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.details, flags);
            dest.writeParcelable(this.photo, flags);
        }

        public final UploadFlowDetails getDetails() {
            return this.details;
        }

        public final PhotoDocument getPhoto() {
            return this.photo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhotoReview(UploadFlowDetails details, PhotoDocument photo) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(photo, "photo");
            this.details = details;
            this.photo = photo;
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$PdfReview;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "pdf", "Lcom/robinhood/models/api/PdfDocument;", "<init>", "(Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;Lcom/robinhood/models/api/PdfDocument;)V", "getDetails", "()Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "getPdf", "()Lcom/robinhood/models/api/PdfDocument;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PdfReview extends DocUploadDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PdfReview> CREATOR = new Creator();
        private final UploadFlowDetails details;
        private final PdfDocument pdf;

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PdfReview> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PdfReview createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PdfReview((UploadFlowDetails) parcel.readParcelable(PdfReview.class.getClassLoader()), (PdfDocument) parcel.readParcelable(PdfReview.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PdfReview[] newArray(int i) {
                return new PdfReview[i];
            }
        }

        public static /* synthetic */ PdfReview copy$default(PdfReview pdfReview, UploadFlowDetails uploadFlowDetails, PdfDocument pdfDocument, int i, Object obj) {
            if ((i & 1) != 0) {
                uploadFlowDetails = pdfReview.details;
            }
            if ((i & 2) != 0) {
                pdfDocument = pdfReview.pdf;
            }
            return pdfReview.copy(uploadFlowDetails, pdfDocument);
        }

        /* renamed from: component1, reason: from getter */
        public final UploadFlowDetails getDetails() {
            return this.details;
        }

        /* renamed from: component2, reason: from getter */
        public final PdfDocument getPdf() {
            return this.pdf;
        }

        public final PdfReview copy(UploadFlowDetails details, PdfDocument pdf) {
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(pdf, "pdf");
            return new PdfReview(details, pdf);
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
            return Intrinsics.areEqual(this.details, pdfReview.details) && Intrinsics.areEqual(this.pdf, pdfReview.pdf);
        }

        public int hashCode() {
            return (this.details.hashCode() * 31) + this.pdf.hashCode();
        }

        public String toString() {
            return "PdfReview(details=" + this.details + ", pdf=" + this.pdf + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.details, flags);
            dest.writeParcelable(this.pdf, flags);
        }

        public final UploadFlowDetails getDetails() {
            return this.details;
        }

        public final PdfDocument getPdf() {
            return this.pdf;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PdfReview(UploadFlowDetails details, PdfDocument pdf) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(pdf, "pdf");
            this.details = details;
            this.pdf = pdf;
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$SelfieSplash;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "<init>", "(Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;)V", "getDetails", "()Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SelfieSplash extends DocUploadDestination {
        public static final int $stable = UploadFlowDetails.$stable;
        public static final Parcelable.Creator<SelfieSplash> CREATOR = new Creator();
        private final UploadFlowDetails details;

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SelfieSplash> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieSplash createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieSplash((UploadFlowDetails) parcel.readParcelable(SelfieSplash.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieSplash[] newArray(int i) {
                return new SelfieSplash[i];
            }
        }

        public static /* synthetic */ SelfieSplash copy$default(SelfieSplash selfieSplash, UploadFlowDetails uploadFlowDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                uploadFlowDetails = selfieSplash.details;
            }
            return selfieSplash.copy(uploadFlowDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final UploadFlowDetails getDetails() {
            return this.details;
        }

        public final SelfieSplash copy(UploadFlowDetails details) {
            Intrinsics.checkNotNullParameter(details, "details");
            return new SelfieSplash(details);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelfieSplash) && Intrinsics.areEqual(this.details, ((SelfieSplash) other).details);
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        public String toString() {
            return "SelfieSplash(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.details, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelfieSplash(UploadFlowDetails details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        public final UploadFlowDetails getDetails() {
            return this.details;
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$Submission;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "originalRequest", "Lcom/robinhood/models/ui/DocumentRequest;", "<init>", "(Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;Lcom/robinhood/models/ui/DocumentRequest;)V", "getDetails", "()Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "getOriginalRequest", "()Lcom/robinhood/models/ui/DocumentRequest;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Submission extends DocUploadDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Submission> CREATOR = new Creator();
        private final UploadFlowDetails details;
        private final DocumentRequest originalRequest;

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Submission> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Submission createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Submission((UploadFlowDetails) parcel.readParcelable(Submission.class.getClassLoader()), (DocumentRequest) parcel.readParcelable(Submission.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Submission[] newArray(int i) {
                return new Submission[i];
            }
        }

        public static /* synthetic */ Submission copy$default(Submission submission, UploadFlowDetails uploadFlowDetails, DocumentRequest documentRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                uploadFlowDetails = submission.details;
            }
            if ((i & 2) != 0) {
                documentRequest = submission.originalRequest;
            }
            return submission.copy(uploadFlowDetails, documentRequest);
        }

        /* renamed from: component1, reason: from getter */
        public final UploadFlowDetails getDetails() {
            return this.details;
        }

        /* renamed from: component2, reason: from getter */
        public final DocumentRequest getOriginalRequest() {
            return this.originalRequest;
        }

        public final Submission copy(UploadFlowDetails details, DocumentRequest originalRequest) {
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
            return new Submission(details, originalRequest);
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
            return Intrinsics.areEqual(this.details, submission.details) && Intrinsics.areEqual(this.originalRequest, submission.originalRequest);
        }

        public int hashCode() {
            return (this.details.hashCode() * 31) + this.originalRequest.hashCode();
        }

        public String toString() {
            return "Submission(details=" + this.details + ", originalRequest=" + this.originalRequest + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.details, flags);
            dest.writeParcelable(this.originalRequest, flags);
        }

        public final UploadFlowDetails getDetails() {
            return this.details;
        }

        public final DocumentRequest getOriginalRequest() {
            return this.originalRequest;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Submission(UploadFlowDetails details, DocumentRequest originalRequest) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
            this.details = details;
            this.originalRequest = originalRequest;
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$ChooseAddress;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChooseAddress extends DocUploadDestination {
        public static final int $stable = 0;
        public static final ChooseAddress INSTANCE = new ChooseAddress();
        public static final Parcelable.Creator<ChooseAddress> CREATOR = new Creator();

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ChooseAddress> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChooseAddress createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChooseAddress.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChooseAddress[] newArray(int i) {
                return new ChooseAddress[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private ChooseAddress() {
            super(null);
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$CryptoUpgradeUnderReview;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CryptoUpgradeUnderReview extends DocUploadDestination {
        public static final int $stable = 0;
        public static final CryptoUpgradeUnderReview INSTANCE = new CryptoUpgradeUnderReview();
        public static final Parcelable.Creator<CryptoUpgradeUnderReview> CREATOR = new Creator();

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CryptoUpgradeUnderReview> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CryptoUpgradeUnderReview createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CryptoUpgradeUnderReview.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CryptoUpgradeUnderReview[] newArray(int i) {
                return new CryptoUpgradeUnderReview[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private CryptoUpgradeUnderReview() {
            super(null);
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$Thanks;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "context", "Lcom/robinhood/models/api/DocUploadThanksContext;", "<init>", "(Lcom/robinhood/models/api/DocUploadThanksContext;)V", "getContext", "()Lcom/robinhood/models/api/DocUploadThanksContext;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Thanks extends DocUploadDestination {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Thanks> CREATOR = new Creator();
        private final DocUploadThanksContext context;

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Thanks> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Thanks createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Thanks(DocUploadThanksContext.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Thanks[] newArray(int i) {
                return new Thanks[i];
            }
        }

        public static /* synthetic */ Thanks copy$default(Thanks thanks, DocUploadThanksContext docUploadThanksContext, int i, Object obj) {
            if ((i & 1) != 0) {
                docUploadThanksContext = thanks.context;
            }
            return thanks.copy(docUploadThanksContext);
        }

        /* renamed from: component1, reason: from getter */
        public final DocUploadThanksContext getContext() {
            return this.context;
        }

        public final Thanks copy(DocUploadThanksContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Thanks(context);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Thanks) && this.context == ((Thanks) other).context;
        }

        public int hashCode() {
            return this.context.hashCode();
        }

        public String toString() {
            return "Thanks(context=" + this.context + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.context.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Thanks(DocUploadThanksContext context) {
            super(null);
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
        }

        public final DocUploadThanksContext getContext() {
            return this.context;
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$Finish;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "successful", "", "<init>", "(Z)V", "getSuccessful", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Finish extends DocUploadDestination {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Finish> CREATOR = new Creator();
        private final boolean successful;

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Finish> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Finish createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Finish(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Finish[] newArray(int i) {
                return new Finish[i];
            }
        }

        public static /* synthetic */ Finish copy$default(Finish finish, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = finish.successful;
            }
            return finish.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccessful() {
            return this.successful;
        }

        public final Finish copy(boolean successful) {
            return new Finish(successful);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Finish) && this.successful == ((Finish) other).successful;
        }

        public int hashCode() {
            return Boolean.hashCode(this.successful);
        }

        public String toString() {
            return "Finish(successful=" + this.successful + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.successful ? 1 : 0);
        }

        public Finish(boolean z) {
            super(null);
            this.successful = z;
        }

        public final boolean getSuccessful() {
            return this.successful;
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$PopBack;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PopBack extends DocUploadDestination {
        public static final int $stable = 0;
        public static final PopBack INSTANCE = new PopBack();
        public static final Parcelable.Creator<PopBack> CREATOR = new Creator();

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PopBack> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PopBack createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PopBack.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PopBack[] newArray(int i) {
                return new PopBack[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private PopBack() {
            super(null);
        }
    }

    /* compiled from: DocUploadDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadDestination$DelayedPopBack;", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DelayedPopBack extends DocUploadDestination {
        public static final int $stable = 0;
        public static final DelayedPopBack INSTANCE = new DelayedPopBack();
        public static final Parcelable.Creator<DelayedPopBack> CREATOR = new Creator();

        /* compiled from: DocUploadDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DelayedPopBack> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DelayedPopBack createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DelayedPopBack.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DelayedPopBack[] newArray(int i) {
                return new DelayedPopBack[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private DelayedPopBack() {
            super(null);
        }
    }
}
