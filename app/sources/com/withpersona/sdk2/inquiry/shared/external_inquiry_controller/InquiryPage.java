package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import com.truelayer.payments.p419ui.components.inputs.form.models.Fields4;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage2;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage3;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InquiryPage.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage;", "", "<init>", "()V", "stepName", "", "getStepName", "()Ljava/lang/String;", "toString", "Ui", "CreateReusablePersona", "VerifyReusablePersona", "ScanNfc", "Document", "Selfie", "GovernmentId", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage$CreateReusablePersona;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage$Document;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage$GovernmentId;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage$ScanNfc;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage$Selfie;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage$Ui;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage$VerifyReusablePersona;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public abstract class InquiryPage {
    public /* synthetic */ InquiryPage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getStepName();

    private InquiryPage() {
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage$Ui;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStepName", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage$Ui */
    public static final /* data */ class C43753Ui extends InquiryPage {
        private final String stepName;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C43753Ui) && Intrinsics.areEqual(this.stepName, ((C43753Ui) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage
        public String getStepName() {
            return this.stepName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43753Ui(String stepName) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage
        public String toString() {
            return super.toString() + "/ui";
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage$CreateReusablePersona;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStepName", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class CreateReusablePersona extends InquiryPage {
        private final String stepName;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreateReusablePersona) && Intrinsics.areEqual(this.stepName, ((CreateReusablePersona) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage
        public String getStepName() {
            return this.stepName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateReusablePersona(String stepName) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage
        public String toString() {
            return super.toString() + "/verify-with-persona/passkey-registration";
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage$VerifyReusablePersona;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStepName", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class VerifyReusablePersona extends InquiryPage {
        private final String stepName;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerifyReusablePersona) && Intrinsics.areEqual(this.stepName, ((VerifyReusablePersona) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage
        public String getStepName() {
            return this.stepName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerifyReusablePersona(String stepName) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage
        public String toString() {
            return super.toString() + "/verify-with-persona/passkey-authentication";
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage$ScanNfc;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStepName", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class ScanNfc extends InquiryPage {
        private final String stepName;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScanNfc) && Intrinsics.areEqual(this.stepName, ((ScanNfc) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage
        public String getStepName() {
            return this.stepName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScanNfc(String stepName) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            this.stepName = stepName;
        }

        @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage
        public String toString() {
            return super.toString() + "/scan-nfc";
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage$Document;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage;", "", "stepName", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage;", "subPage", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStepName", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage;", "getSubPage", "()Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Document extends InquiryPage {
        private final String stepName;
        private final InquiryPage2 subPage;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Document)) {
                return false;
            }
            Document document = (Document) other;
            return Intrinsics.areEqual(this.stepName, document.stepName) && Intrinsics.areEqual(this.subPage, document.subPage);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.subPage.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage
        public String getStepName() {
            return this.stepName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Document(String stepName, InquiryPage2 subPage) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(subPage, "subPage");
            this.stepName = stepName;
            this.subPage = subPage;
        }

        @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage
        public String toString() {
            String str;
            InquiryPage2 inquiryPage2 = this.subPage;
            if (Intrinsics.areEqual(inquiryPage2, InquiryPage2.Pending.INSTANCE)) {
                str = "pending";
            } else if (Intrinsics.areEqual(inquiryPage2, InquiryPage2.Prompt.INSTANCE)) {
                str = "prompt";
            } else if (Intrinsics.areEqual(inquiryPage2, InquiryPage2.Review.INSTANCE)) {
                str = "review";
            } else {
                if (!Intrinsics.areEqual(inquiryPage2, InquiryPage2.TakePhoto.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "capture";
            }
            return super.toString() + "/documents/" + str;
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage$Selfie;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage;", "", "stepName", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage;", "subPage", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStepName", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage;", "getSubPage", "()Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Selfie extends InquiryPage {
        private final String stepName;
        private final InquiryPage4 subPage;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selfie)) {
                return false;
            }
            Selfie selfie = (Selfie) other;
            return Intrinsics.areEqual(this.stepName, selfie.stepName) && Intrinsics.areEqual(this.subPage, selfie.subPage);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.subPage.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage
        public String getStepName() {
            return this.stepName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Selfie(String stepName, InquiryPage4 subPage) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(subPage, "subPage");
            this.stepName = stepName;
            this.subPage = subPage;
        }

        @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage
        public String toString() {
            String str;
            InquiryPage4 inquiryPage4 = this.subPage;
            if (Intrinsics.areEqual(inquiryPage4, InquiryPage4.FinalizeVideo.INSTANCE)) {
                str = "finalize-video";
            } else if (Intrinsics.areEqual(inquiryPage4, InquiryPage4.Pending.INSTANCE)) {
                str = "pending";
            } else if (Intrinsics.areEqual(inquiryPage4, InquiryPage4.Prompt.INSTANCE)) {
                str = "prompt";
            } else if (inquiryPage4 instanceof InquiryPage4.LeadInAnimation) {
                str = ((InquiryPage4.LeadInAnimation) this.subPage).getPose() + "/capture-lead-in-animation";
            } else if (inquiryPage4 instanceof InquiryPage4.TakePhoto) {
                str = ((InquiryPage4.TakePhoto) this.subPage).getPose() + "/capture";
            } else {
                if (!Intrinsics.areEqual(inquiryPage4, InquiryPage4.CheckUpload.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "check-upload";
            }
            return super.toString() + "/selfie/" + str;
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage$GovernmentId;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage;", "", "stepName", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage;", "subPage", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStepName", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage;", "getSubPage", "()Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class GovernmentId extends InquiryPage {
        private final String stepName;
        private final InquiryPage3 subPage;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GovernmentId)) {
                return false;
            }
            GovernmentId governmentId = (GovernmentId) other;
            return Intrinsics.areEqual(this.stepName, governmentId.stepName) && Intrinsics.areEqual(this.subPage, governmentId.subPage);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.subPage.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage
        public String getStepName() {
            return this.stepName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GovernmentId(String stepName, InquiryPage3 subPage) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(subPage, "subPage");
            this.stepName = stepName;
            this.subPage = subPage;
        }

        @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage
        public String toString() {
            String str;
            InquiryPage3 inquiryPage3 = this.subPage;
            if (Intrinsics.areEqual(inquiryPage3, InquiryPage3.AutoClassificationFailure.INSTANCE)) {
                str = "autoclassification-failure";
            } else if (Intrinsics.areEqual(inquiryPage3, InquiryPage3.AutoClassificationSelect.INSTANCE)) {
                str = "autoclassification-select";
            } else if (Intrinsics.areEqual(inquiryPage3, InquiryPage3.Select.INSTANCE)) {
                str = Fields4.TYPE;
            } else if (Intrinsics.areEqual(inquiryPage3, InquiryPage3.Pending.INSTANCE)) {
                str = "pending";
            } else if (inquiryPage3 instanceof InquiryPage3.Check) {
                str = ((InquiryPage3.Check) this.subPage).getPageIndex() + "/check";
            } else if (inquiryPage3 instanceof InquiryPage3.CheckUpload) {
                str = ((InquiryPage3.CheckUpload) this.subPage).getPageIndex() + "/check-upload";
            } else if (inquiryPage3 instanceof InquiryPage3.Prompt) {
                str = ((InquiryPage3.Prompt) this.subPage).getPageIndex() + "/prompt";
            } else {
                if (!(inquiryPage3 instanceof InquiryPage3.TakePhoto)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((InquiryPage3.TakePhoto) this.subPage).getPageIndex() + "/capture";
            }
            return super.toString() + "/government-id/" + str;
        }
    }

    public String toString() {
        return "/inquiry";
    }
}
