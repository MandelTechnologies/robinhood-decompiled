package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import kotlin.Metadata;

/* compiled from: InquiryPage.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage;", "", "Prompt", "Review", "Pending", "TakePhoto", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage$Pending;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage$Prompt;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage$Review;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage$TakePhoto;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.DocumentPage, reason: use source file name */
/* loaded from: classes18.dex */
public interface InquiryPage2 {

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage$Prompt;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.DocumentPage$Prompt */
    public static final /* data */ class Prompt implements InquiryPage2 {
        public static final Prompt INSTANCE = new Prompt();

        public boolean equals(Object other) {
            return this == other || (other instanceof Prompt);
        }

        public int hashCode() {
            return -39927199;
        }

        public String toString() {
            return "Prompt";
        }

        private Prompt() {
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage$Review;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.DocumentPage$Review */
    public static final /* data */ class Review implements InquiryPage2 {
        public static final Review INSTANCE = new Review();

        public boolean equals(Object other) {
            return this == other || (other instanceof Review);
        }

        public int hashCode() {
            return 5529685;
        }

        public String toString() {
            return "Review";
        }

        private Review() {
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage$Pending;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.DocumentPage$Pending */
    public static final /* data */ class Pending implements InquiryPage2 {
        public static final Pending INSTANCE = new Pending();

        public boolean equals(Object other) {
            return this == other || (other instanceof Pending);
        }

        public int hashCode() {
            return -1611120582;
        }

        public String toString() {
            return "Pending";
        }

        private Pending() {
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage$TakePhoto;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/DocumentPage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.DocumentPage$TakePhoto */
    public static final /* data */ class TakePhoto implements InquiryPage2 {
        public static final TakePhoto INSTANCE = new TakePhoto();

        public boolean equals(Object other) {
            return this == other || (other instanceof TakePhoto);
        }

        public int hashCode() {
            return -1776980018;
        }

        public String toString() {
            return "TakePhoto";
        }

        private TakePhoto() {
        }
    }
}
