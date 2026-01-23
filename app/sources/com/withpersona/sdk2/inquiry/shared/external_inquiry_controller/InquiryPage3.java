package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import kotlin.Metadata;

/* compiled from: InquiryPage.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage;", "", "Prompt", "TakePhoto", "Check", "CheckUpload", "Pending", "Select", "AutoClassificationSelect", "AutoClassificationFailure", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$AutoClassificationFailure;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$AutoClassificationSelect;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$Check;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$CheckUpload;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$Pending;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$Prompt;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$Select;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$TakePhoto;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.GovernmentIdPage, reason: use source file name */
/* loaded from: classes18.dex */
public interface InquiryPage3 {

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$Prompt;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage;", "", "pageIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPageIndex", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.GovernmentIdPage$Prompt, reason: from toString */
    public static final /* data */ class Prompt implements InquiryPage3 {
        private final int pageIndex;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Prompt) && this.pageIndex == ((Prompt) other).pageIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.pageIndex);
        }

        public String toString() {
            return "Prompt(pageIndex=" + this.pageIndex + ")";
        }

        public Prompt(int i) {
            this.pageIndex = i;
        }

        public final int getPageIndex() {
            return this.pageIndex;
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$TakePhoto;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage;", "", "pageIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPageIndex", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.GovernmentIdPage$TakePhoto, reason: from toString */
    public static final /* data */ class TakePhoto implements InquiryPage3 {
        private final int pageIndex;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TakePhoto) && this.pageIndex == ((TakePhoto) other).pageIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.pageIndex);
        }

        public String toString() {
            return "TakePhoto(pageIndex=" + this.pageIndex + ")";
        }

        public TakePhoto(int i) {
            this.pageIndex = i;
        }

        public final int getPageIndex() {
            return this.pageIndex;
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$Check;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage;", "", "pageIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPageIndex", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.GovernmentIdPage$Check, reason: from toString */
    public static final /* data */ class Check implements InquiryPage3 {
        private final int pageIndex;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Check) && this.pageIndex == ((Check) other).pageIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.pageIndex);
        }

        public String toString() {
            return "Check(pageIndex=" + this.pageIndex + ")";
        }

        public Check(int i) {
            this.pageIndex = i;
        }

        public final int getPageIndex() {
            return this.pageIndex;
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$CheckUpload;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage;", "", "pageIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPageIndex", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.GovernmentIdPage$CheckUpload, reason: from toString */
    public static final /* data */ class CheckUpload implements InquiryPage3 {
        private final int pageIndex;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckUpload) && this.pageIndex == ((CheckUpload) other).pageIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.pageIndex);
        }

        public String toString() {
            return "CheckUpload(pageIndex=" + this.pageIndex + ")";
        }

        public CheckUpload(int i) {
            this.pageIndex = i;
        }

        public final int getPageIndex() {
            return this.pageIndex;
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$Pending;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.GovernmentIdPage$Pending */
    public static final /* data */ class Pending implements InquiryPage3 {
        public static final Pending INSTANCE = new Pending();

        public boolean equals(Object other) {
            return this == other || (other instanceof Pending);
        }

        public int hashCode() {
            return 35282187;
        }

        public String toString() {
            return "Pending";
        }

        private Pending() {
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$Select;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.GovernmentIdPage$Select */
    public static final /* data */ class Select implements InquiryPage3 {
        public static final Select INSTANCE = new Select();

        public boolean equals(Object other) {
            return this == other || (other instanceof Select);
        }

        public int hashCode() {
            return 364061448;
        }

        public String toString() {
            return "Select";
        }

        private Select() {
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$AutoClassificationSelect;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.GovernmentIdPage$AutoClassificationSelect */
    public static final /* data */ class AutoClassificationSelect implements InquiryPage3 {
        public static final AutoClassificationSelect INSTANCE = new AutoClassificationSelect();

        public boolean equals(Object other) {
            return this == other || (other instanceof AutoClassificationSelect);
        }

        public int hashCode() {
            return 454604765;
        }

        public String toString() {
            return "AutoClassificationSelect";
        }

        private AutoClassificationSelect() {
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage$AutoClassificationFailure;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/GovernmentIdPage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.GovernmentIdPage$AutoClassificationFailure */
    public static final /* data */ class AutoClassificationFailure implements InquiryPage3 {
        public static final AutoClassificationFailure INSTANCE = new AutoClassificationFailure();

        public boolean equals(Object other) {
            return this == other || (other instanceof AutoClassificationFailure);
        }

        public int hashCode() {
            return -1856828727;
        }

        public String toString() {
            return "AutoClassificationFailure";
        }

        private AutoClassificationFailure() {
        }
    }
}
