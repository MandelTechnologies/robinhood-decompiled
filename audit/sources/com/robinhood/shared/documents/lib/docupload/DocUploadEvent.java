package com.robinhood.shared.documents.lib.docupload;

import com.robinhood.models.api.DocUploadCapturedDocument;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: DocUploadEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent;", "", "<init>", "()V", "WizardMutator", "ActiveDocRequestEvent", "Exit", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$Exit;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator;", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class DocUploadEvent {
    public static final int $stable = 0;

    public /* synthetic */ DocUploadEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DocUploadEvent() {
    }

    /* compiled from: DocUploadEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent;", "<init>", "()V", "Start", "Skip", "Submission", "PersonaClientCancelled", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator$PersonaClientCancelled;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator$Skip;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator$Start;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator$Submission;", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class WizardMutator extends DocUploadEvent {
        public static final int $stable = 0;

        public /* synthetic */ WizardMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private WizardMutator() {
            super(null);
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator$Start;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator;", "requests", "", "Lcom/robinhood/models/ui/DocumentRequest;", "isGdpr", "", "<init>", "(Ljava/util/List;Z)V", "getRequests", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Start extends WizardMutator {
            public static final int $stable = 8;
            private final boolean isGdpr;
            private final List<List<DocumentRequest>> requests;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Start copy$default(Start start, List list, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = start.requests;
                }
                if ((i & 2) != 0) {
                    z = start.isGdpr;
                }
                return start.copy(list, z);
            }

            public final List<List<DocumentRequest>> component1() {
                return this.requests;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsGdpr() {
                return this.isGdpr;
            }

            public final Start copy(List<? extends List<DocumentRequest>> requests, boolean isGdpr) {
                Intrinsics.checkNotNullParameter(requests, "requests");
                return new Start(requests, isGdpr);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Start)) {
                    return false;
                }
                Start start = (Start) other;
                return Intrinsics.areEqual(this.requests, start.requests) && this.isGdpr == start.isGdpr;
            }

            public int hashCode() {
                return (this.requests.hashCode() * 31) + Boolean.hashCode(this.isGdpr);
            }

            public String toString() {
                return "Start(requests=" + this.requests + ", isGdpr=" + this.isGdpr + ")";
            }

            public /* synthetic */ Start(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? false : z);
            }

            public final List<List<DocumentRequest>> getRequests() {
                return this.requests;
            }

            public final boolean isGdpr() {
                return this.isGdpr;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Start(List<? extends List<DocumentRequest>> requests, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(requests, "requests");
                this.requests = requests;
                this.isGdpr = z;
            }
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator$Skip;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator;", "<init>", "()V", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Skip extends WizardMutator {
            public static final int $stable = 0;
            public static final Skip INSTANCE = new Skip();

            private Skip() {
                super(null);
            }
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator$Submission;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator;", "<init>", "()V", "Success", "Error", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator$Submission$Error;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator$Submission$Success;", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Submission extends WizardMutator {
            public static final int $stable = 0;

            public /* synthetic */ Submission(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Submission() {
                super(null);
            }

            /* compiled from: DocUploadEvent.kt */
            @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator$Submission$Success;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator$Submission;", "forCrypto", "", "<init>", "(Z)V", "getForCrypto", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Success extends Submission {
                public static final int $stable = 0;
                private final boolean forCrypto;

                public Success() {
                    this(false, 1, null);
                }

                public static /* synthetic */ Success copy$default(Success success, boolean z, int i, Object obj) {
                    if ((i & 1) != 0) {
                        z = success.forCrypto;
                    }
                    return success.copy(z);
                }

                /* renamed from: component1, reason: from getter */
                public final boolean getForCrypto() {
                    return this.forCrypto;
                }

                public final Success copy(boolean forCrypto) {
                    return new Success(forCrypto);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Success) && this.forCrypto == ((Success) other).forCrypto;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.forCrypto);
                }

                public String toString() {
                    return "Success(forCrypto=" + this.forCrypto + ")";
                }

                public Success(boolean z) {
                    super(null);
                    this.forCrypto = z;
                }

                public /* synthetic */ Success(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? false : z);
                }

                public final boolean getForCrypto() {
                    return this.forCrypto;
                }
            }

            /* compiled from: DocUploadEvent.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator$Submission$Error;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator$Submission;", "<init>", "()V", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Error extends Submission {
                public static final int $stable = 0;
                public static final Error INSTANCE = new Error();

                private Error() {
                    super(null);
                }
            }
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator$PersonaClientCancelled;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PersonaClientCancelled extends WizardMutator {
            public static final int $stable = 0;
            public static final PersonaClientCancelled INSTANCE = new PersonaClientCancelled();

            public boolean equals(Object other) {
                return this == other || (other instanceof PersonaClientCancelled);
            }

            public int hashCode() {
                return -571268842;
            }

            public String toString() {
                return "PersonaClientCancelled";
            }

            private PersonaClientCancelled() {
                super(null);
            }
        }
    }

    /* compiled from: DocUploadEvent.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent;", "<init>", "()V", "Residency", "TypeSelected", "OriginSelected", "SplashContinue", "SplashDismiss", "CameraPermissionDenied", "DocumentCaptured", "DocumentReview", "SelfieContinue", "StartPrism", "PersonaStarted", "PersonaClientError", "PersonaClientSucceeded", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$CameraPermissionDenied;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$DocumentCaptured;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$DocumentReview;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$OriginSelected;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$PersonaClientError;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$PersonaClientSucceeded;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$PersonaStarted;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$Residency;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$SelfieContinue;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$SplashContinue;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$SplashDismiss;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$StartPrism;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$TypeSelected;", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ActiveDocRequestEvent extends DocUploadEvent {
        public static final int $stable = 0;

        public /* synthetic */ ActiveDocRequestEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActiveDocRequestEvent() {
            super(null);
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$Residency;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", "<init>", "()V", "Rejected", "Confirmed", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$Residency$Confirmed;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$Residency$Rejected;", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Residency extends ActiveDocRequestEvent {
            public static final int $stable = 0;

            public /* synthetic */ Residency(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* compiled from: DocUploadEvent.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$Residency$Rejected;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$Residency;", "<init>", "()V", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Rejected extends Residency {
                public static final int $stable = 0;
                public static final Rejected INSTANCE = new Rejected();

                private Rejected() {
                    super(null);
                }
            }

            private Residency() {
                super(null);
            }

            /* compiled from: DocUploadEvent.kt */
            @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$Residency$Confirmed;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$Residency;", "requestType", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "<init>", "(Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;)V", "getRequestType", "()Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Confirmed extends Residency {
                public static final int $stable = 0;
                private final ApiDocumentRequest.Type requestType;

                public static /* synthetic */ Confirmed copy$default(Confirmed confirmed, ApiDocumentRequest.Type type2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        type2 = confirmed.requestType;
                    }
                    return confirmed.copy(type2);
                }

                /* renamed from: component1, reason: from getter */
                public final ApiDocumentRequest.Type getRequestType() {
                    return this.requestType;
                }

                public final Confirmed copy(ApiDocumentRequest.Type requestType) {
                    Intrinsics.checkNotNullParameter(requestType, "requestType");
                    return new Confirmed(requestType);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Confirmed) && this.requestType == ((Confirmed) other).requestType;
                }

                public int hashCode() {
                    return this.requestType.hashCode();
                }

                public String toString() {
                    return "Confirmed(requestType=" + this.requestType + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Confirmed(ApiDocumentRequest.Type requestType) {
                    super(null);
                    Intrinsics.checkNotNullParameter(requestType, "requestType");
                    this.requestType = requestType;
                }

                public final ApiDocumentRequest.Type getRequestType() {
                    return this.requestType;
                }
            }
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$TypeSelected;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", "documentType", "Lcom/robinhood/models/api/IdDocument$Type;", "requestType", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "forCrypto", "", "<init>", "(Lcom/robinhood/models/api/IdDocument$Type;Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;Z)V", "getDocumentType", "()Lcom/robinhood/models/api/IdDocument$Type;", "getRequestType", "()Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "getForCrypto", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TypeSelected extends ActiveDocRequestEvent {
            public static final int $stable = 0;
            private final IdDocument.Type documentType;
            private final boolean forCrypto;
            private final ApiDocumentRequest.Type requestType;

            public static /* synthetic */ TypeSelected copy$default(TypeSelected typeSelected, IdDocument.Type type2, ApiDocumentRequest.Type type3, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    type2 = typeSelected.documentType;
                }
                if ((i & 2) != 0) {
                    type3 = typeSelected.requestType;
                }
                if ((i & 4) != 0) {
                    z = typeSelected.forCrypto;
                }
                return typeSelected.copy(type2, type3, z);
            }

            /* renamed from: component1, reason: from getter */
            public final IdDocument.Type getDocumentType() {
                return this.documentType;
            }

            /* renamed from: component2, reason: from getter */
            public final ApiDocumentRequest.Type getRequestType() {
                return this.requestType;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getForCrypto() {
                return this.forCrypto;
            }

            public final TypeSelected copy(IdDocument.Type documentType, ApiDocumentRequest.Type requestType, boolean forCrypto) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                Intrinsics.checkNotNullParameter(requestType, "requestType");
                return new TypeSelected(documentType, requestType, forCrypto);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TypeSelected)) {
                    return false;
                }
                TypeSelected typeSelected = (TypeSelected) other;
                return this.documentType == typeSelected.documentType && this.requestType == typeSelected.requestType && this.forCrypto == typeSelected.forCrypto;
            }

            public int hashCode() {
                return (((this.documentType.hashCode() * 31) + this.requestType.hashCode()) * 31) + Boolean.hashCode(this.forCrypto);
            }

            public String toString() {
                return "TypeSelected(documentType=" + this.documentType + ", requestType=" + this.requestType + ", forCrypto=" + this.forCrypto + ")";
            }

            public final IdDocument.Type getDocumentType() {
                return this.documentType;
            }

            public final ApiDocumentRequest.Type getRequestType() {
                return this.requestType;
            }

            public final boolean getForCrypto() {
                return this.forCrypto;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TypeSelected(IdDocument.Type documentType, ApiDocumentRequest.Type requestType, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                Intrinsics.checkNotNullParameter(requestType, "requestType");
                this.documentType = documentType;
                this.requestType = requestType;
                this.forCrypto = z;
            }
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$OriginSelected;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "<init>", "(Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;)V", "getDetails", "()Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OriginSelected extends ActiveDocRequestEvent {
            public static final int $stable = 8;
            private final UploadFlowDetails details;

            public static /* synthetic */ OriginSelected copy$default(OriginSelected originSelected, UploadFlowDetails uploadFlowDetails, int i, Object obj) {
                if ((i & 1) != 0) {
                    uploadFlowDetails = originSelected.details;
                }
                return originSelected.copy(uploadFlowDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final UploadFlowDetails getDetails() {
                return this.details;
            }

            public final OriginSelected copy(UploadFlowDetails details) {
                Intrinsics.checkNotNullParameter(details, "details");
                return new OriginSelected(details);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OriginSelected) && Intrinsics.areEqual(this.details, ((OriginSelected) other).details);
            }

            public int hashCode() {
                return this.details.hashCode();
            }

            public String toString() {
                return "OriginSelected(details=" + this.details + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OriginSelected(UploadFlowDetails details) {
                super(null);
                Intrinsics.checkNotNullParameter(details, "details");
                this.details = details;
            }

            public final UploadFlowDetails getDetails() {
                return this.details;
            }
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$SplashContinue;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "<init>", "(Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;)V", "getDetails", "()Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SplashContinue extends ActiveDocRequestEvent {
            public static final int $stable = 8;
            private final UploadFlowDetails details;

            public static /* synthetic */ SplashContinue copy$default(SplashContinue splashContinue, UploadFlowDetails uploadFlowDetails, int i, Object obj) {
                if ((i & 1) != 0) {
                    uploadFlowDetails = splashContinue.details;
                }
                return splashContinue.copy(uploadFlowDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final UploadFlowDetails getDetails() {
                return this.details;
            }

            public final SplashContinue copy(UploadFlowDetails details) {
                Intrinsics.checkNotNullParameter(details, "details");
                return new SplashContinue(details);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SplashContinue) && Intrinsics.areEqual(this.details, ((SplashContinue) other).details);
            }

            public int hashCode() {
                return this.details.hashCode();
            }

            public String toString() {
                return "SplashContinue(details=" + this.details + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SplashContinue(UploadFlowDetails details) {
                super(null);
                Intrinsics.checkNotNullParameter(details, "details");
                this.details = details;
            }

            public final UploadFlowDetails getDetails() {
                return this.details;
            }
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$SplashDismiss;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", "<init>", "()V", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class SplashDismiss extends ActiveDocRequestEvent {
            public static final int $stable = 0;
            public static final SplashDismiss INSTANCE = new SplashDismiss();

            private SplashDismiss() {
                super(null);
            }
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$CameraPermissionDenied;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", "<init>", "()V", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class CameraPermissionDenied extends ActiveDocRequestEvent {
            public static final int $stable = 0;
            public static final CameraPermissionDenied INSTANCE = new CameraPermissionDenied();

            private CameraPermissionDenied() {
                super(null);
            }
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$DocumentCaptured;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "document", "Lcom/robinhood/models/api/DocUploadCapturedDocument;", "<init>", "(Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;Lcom/robinhood/models/api/DocUploadCapturedDocument;)V", "getDetails", "()Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "getDocument", "()Lcom/robinhood/models/api/DocUploadCapturedDocument;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DocumentCaptured extends ActiveDocRequestEvent {
            public static final int $stable = 8;
            private final UploadFlowDetails details;
            private final DocUploadCapturedDocument document;

            public static /* synthetic */ DocumentCaptured copy$default(DocumentCaptured documentCaptured, UploadFlowDetails uploadFlowDetails, DocUploadCapturedDocument docUploadCapturedDocument, int i, Object obj) {
                if ((i & 1) != 0) {
                    uploadFlowDetails = documentCaptured.details;
                }
                if ((i & 2) != 0) {
                    docUploadCapturedDocument = documentCaptured.document;
                }
                return documentCaptured.copy(uploadFlowDetails, docUploadCapturedDocument);
            }

            /* renamed from: component1, reason: from getter */
            public final UploadFlowDetails getDetails() {
                return this.details;
            }

            /* renamed from: component2, reason: from getter */
            public final DocUploadCapturedDocument getDocument() {
                return this.document;
            }

            public final DocumentCaptured copy(UploadFlowDetails details, DocUploadCapturedDocument document) {
                Intrinsics.checkNotNullParameter(details, "details");
                Intrinsics.checkNotNullParameter(document, "document");
                return new DocumentCaptured(details, document);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DocumentCaptured)) {
                    return false;
                }
                DocumentCaptured documentCaptured = (DocumentCaptured) other;
                return Intrinsics.areEqual(this.details, documentCaptured.details) && Intrinsics.areEqual(this.document, documentCaptured.document);
            }

            public int hashCode() {
                return (this.details.hashCode() * 31) + this.document.hashCode();
            }

            public String toString() {
                return "DocumentCaptured(details=" + this.details + ", document=" + this.document + ")";
            }

            public final UploadFlowDetails getDetails() {
                return this.details;
            }

            public final DocUploadCapturedDocument getDocument() {
                return this.document;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DocumentCaptured(UploadFlowDetails details, DocUploadCapturedDocument document) {
                super(null);
                Intrinsics.checkNotNullParameter(details, "details");
                Intrinsics.checkNotNullParameter(document, "document");
                this.details = details;
                this.document = document;
            }
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$DocumentReview;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", "<init>", "()V", "Rejected", "Confirmed", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$DocumentReview$Confirmed;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$DocumentReview$Rejected;", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class DocumentReview extends ActiveDocRequestEvent {
            public static final int $stable = 0;

            public /* synthetic */ DocumentReview(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* compiled from: DocUploadEvent.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$DocumentReview$Rejected;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$DocumentReview;", "<init>", "()V", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Rejected extends DocumentReview {
                public static final int $stable = 0;
                public static final Rejected INSTANCE = new Rejected();

                private Rejected() {
                    super(null);
                }
            }

            private DocumentReview() {
                super(null);
            }

            /* compiled from: DocUploadEvent.kt */
            @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$DocumentReview$Confirmed;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$DocumentReview;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "document", "Lcom/robinhood/models/api/DocUploadCapturedDocument;", "<init>", "(Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;Lcom/robinhood/models/api/DocUploadCapturedDocument;)V", "getDetails", "()Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "getDocument", "()Lcom/robinhood/models/api/DocUploadCapturedDocument;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Confirmed extends DocumentReview {
                public static final int $stable = 8;
                private final UploadFlowDetails details;
                private final DocUploadCapturedDocument document;

                public static /* synthetic */ Confirmed copy$default(Confirmed confirmed, UploadFlowDetails uploadFlowDetails, DocUploadCapturedDocument docUploadCapturedDocument, int i, Object obj) {
                    if ((i & 1) != 0) {
                        uploadFlowDetails = confirmed.details;
                    }
                    if ((i & 2) != 0) {
                        docUploadCapturedDocument = confirmed.document;
                    }
                    return confirmed.copy(uploadFlowDetails, docUploadCapturedDocument);
                }

                /* renamed from: component1, reason: from getter */
                public final UploadFlowDetails getDetails() {
                    return this.details;
                }

                /* renamed from: component2, reason: from getter */
                public final DocUploadCapturedDocument getDocument() {
                    return this.document;
                }

                public final Confirmed copy(UploadFlowDetails details, DocUploadCapturedDocument document) {
                    Intrinsics.checkNotNullParameter(details, "details");
                    Intrinsics.checkNotNullParameter(document, "document");
                    return new Confirmed(details, document);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Confirmed)) {
                        return false;
                    }
                    Confirmed confirmed = (Confirmed) other;
                    return Intrinsics.areEqual(this.details, confirmed.details) && Intrinsics.areEqual(this.document, confirmed.document);
                }

                public int hashCode() {
                    return (this.details.hashCode() * 31) + this.document.hashCode();
                }

                public String toString() {
                    return "Confirmed(details=" + this.details + ", document=" + this.document + ")";
                }

                public final UploadFlowDetails getDetails() {
                    return this.details;
                }

                public final DocUploadCapturedDocument getDocument() {
                    return this.document;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Confirmed(UploadFlowDetails details, DocUploadCapturedDocument document) {
                    super(null);
                    Intrinsics.checkNotNullParameter(details, "details");
                    Intrinsics.checkNotNullParameter(document, "document");
                    this.details = details;
                    this.document = document;
                }
            }
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$SelfieContinue;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "<init>", "(Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;)V", "getDetails", "()Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SelfieContinue extends ActiveDocRequestEvent {
            public static final int $stable = 8;
            private final UploadFlowDetails details;

            public static /* synthetic */ SelfieContinue copy$default(SelfieContinue selfieContinue, UploadFlowDetails uploadFlowDetails, int i, Object obj) {
                if ((i & 1) != 0) {
                    uploadFlowDetails = selfieContinue.details;
                }
                return selfieContinue.copy(uploadFlowDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final UploadFlowDetails getDetails() {
                return this.details;
            }

            public final SelfieContinue copy(UploadFlowDetails details) {
                Intrinsics.checkNotNullParameter(details, "details");
                return new SelfieContinue(details);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelfieContinue) && Intrinsics.areEqual(this.details, ((SelfieContinue) other).details);
            }

            public int hashCode() {
                return this.details.hashCode();
            }

            public String toString() {
                return "SelfieContinue(details=" + this.details + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelfieContinue(UploadFlowDetails details) {
                super(null);
                Intrinsics.checkNotNullParameter(details, "details");
                this.details = details;
            }

            public final UploadFlowDetails getDetails() {
                return this.details;
            }
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$StartPrism;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", "isCollection", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StartPrism extends ActiveDocRequestEvent {
            public static final int $stable = 0;
            private final boolean isCollection;

            public static /* synthetic */ StartPrism copy$default(StartPrism startPrism, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = startPrism.isCollection;
                }
                return startPrism.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsCollection() {
                return this.isCollection;
            }

            public final StartPrism copy(boolean isCollection) {
                return new StartPrism(isCollection);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StartPrism) && this.isCollection == ((StartPrism) other).isCollection;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isCollection);
            }

            public String toString() {
                return "StartPrism(isCollection=" + this.isCollection + ")";
            }

            public StartPrism(boolean z) {
                super(null);
                this.isCollection = z;
            }

            public final boolean isCollection() {
                return this.isCollection;
            }
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$PersonaStarted;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", "skipBiometric", "", "<init>", "(Z)V", "getSkipBiometric", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PersonaStarted extends ActiveDocRequestEvent {
            public static final int $stable = 0;
            private final boolean skipBiometric;

            public PersonaStarted() {
                this(false, 1, null);
            }

            public static /* synthetic */ PersonaStarted copy$default(PersonaStarted personaStarted, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = personaStarted.skipBiometric;
                }
                return personaStarted.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getSkipBiometric() {
                return this.skipBiometric;
            }

            public final PersonaStarted copy(boolean skipBiometric) {
                return new PersonaStarted(skipBiometric);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PersonaStarted) && this.skipBiometric == ((PersonaStarted) other).skipBiometric;
            }

            public int hashCode() {
                return Boolean.hashCode(this.skipBiometric);
            }

            public String toString() {
                return "PersonaStarted(skipBiometric=" + this.skipBiometric + ")";
            }

            public PersonaStarted(boolean z) {
                super(null);
                this.skipBiometric = z;
            }

            public /* synthetic */ PersonaStarted(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }

            public final boolean getSkipBiometric() {
                return this.skipBiometric;
            }
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$PersonaClientError;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", "exitImmediately", "", "<init>", "(Z)V", "getExitImmediately", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PersonaClientError extends ActiveDocRequestEvent {
            public static final int $stable = 0;
            private final boolean exitImmediately;

            public PersonaClientError() {
                this(false, 1, null);
            }

            public static /* synthetic */ PersonaClientError copy$default(PersonaClientError personaClientError, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = personaClientError.exitImmediately;
                }
                return personaClientError.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getExitImmediately() {
                return this.exitImmediately;
            }

            public final PersonaClientError copy(boolean exitImmediately) {
                return new PersonaClientError(exitImmediately);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PersonaClientError) && this.exitImmediately == ((PersonaClientError) other).exitImmediately;
            }

            public int hashCode() {
                return Boolean.hashCode(this.exitImmediately);
            }

            public String toString() {
                return "PersonaClientError(exitImmediately=" + this.exitImmediately + ")";
            }

            public PersonaClientError(boolean z) {
                super(null);
                this.exitImmediately = z;
            }

            public /* synthetic */ PersonaClientError(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }

            public final boolean getExitImmediately() {
                return this.exitImmediately;
            }
        }

        /* compiled from: DocUploadEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$PersonaClientSucceeded;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PersonaClientSucceeded extends ActiveDocRequestEvent {
            public static final int $stable = 0;
            public static final PersonaClientSucceeded INSTANCE = new PersonaClientSucceeded();

            public boolean equals(Object other) {
                return this == other || (other instanceof PersonaClientSucceeded);
            }

            public int hashCode() {
                return 2090957536;
            }

            public String toString() {
                return "PersonaClientSucceeded";
            }

            private PersonaClientSucceeded() {
                super(null);
            }
        }
    }

    /* compiled from: DocUploadEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$Exit;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent;", "successful", "", "<init>", "(Z)V", "getSuccessful", "()Z", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Exit extends DocUploadEvent {
        public static final int $stable = 0;
        private final boolean successful;

        public Exit() {
            this(false, 1, null);
        }

        public Exit(boolean z) {
            super(null);
            this.successful = z;
        }

        public /* synthetic */ Exit(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getSuccessful() {
            return this.successful;
        }
    }
}
