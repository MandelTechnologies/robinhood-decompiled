package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InquiryPage.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage;", "", "Prompt", "TakePhoto", "LeadInAnimation", "FinalizeVideo", "CheckUpload", "Pending", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage$CheckUpload;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage$FinalizeVideo;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage$LeadInAnimation;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage$Pending;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage$Prompt;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage$TakePhoto;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.SelfiePage, reason: use source file name */
/* loaded from: classes18.dex */
public interface InquiryPage4 {

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage$Prompt;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.SelfiePage$Prompt */
    public static final /* data */ class Prompt implements InquiryPage4 {
        public static final Prompt INSTANCE = new Prompt();

        public boolean equals(Object other) {
            return this == other || (other instanceof Prompt);
        }

        public int hashCode() {
            return 1251275316;
        }

        public String toString() {
            return "Prompt";
        }

        private Prompt() {
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage$TakePhoto;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage;", "", "pose", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPose", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.SelfiePage$TakePhoto, reason: from toString */
    public static final /* data */ class TakePhoto implements InquiryPage4 {
        private final String pose;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TakePhoto) && Intrinsics.areEqual(this.pose, ((TakePhoto) other).pose);
        }

        public int hashCode() {
            String str = this.pose;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "TakePhoto(pose=" + this.pose + ")";
        }

        public TakePhoto(String str) {
            this.pose = str;
        }

        public final String getPose() {
            return this.pose;
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage$LeadInAnimation;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage;", "", "pose", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPose", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.SelfiePage$LeadInAnimation, reason: from toString */
    public static final /* data */ class LeadInAnimation implements InquiryPage4 {
        private final String pose;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LeadInAnimation) && Intrinsics.areEqual(this.pose, ((LeadInAnimation) other).pose);
        }

        public int hashCode() {
            String str = this.pose;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "LeadInAnimation(pose=" + this.pose + ")";
        }

        public LeadInAnimation(String str) {
            this.pose = str;
        }

        public final String getPose() {
            return this.pose;
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage$FinalizeVideo;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.SelfiePage$FinalizeVideo */
    public static final /* data */ class FinalizeVideo implements InquiryPage4 {
        public static final FinalizeVideo INSTANCE = new FinalizeVideo();

        public boolean equals(Object other) {
            return this == other || (other instanceof FinalizeVideo);
        }

        public int hashCode() {
            return -576649171;
        }

        public String toString() {
            return "FinalizeVideo";
        }

        private FinalizeVideo() {
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage$CheckUpload;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.SelfiePage$CheckUpload */
    public static final /* data */ class CheckUpload implements InquiryPage4 {
        public static final CheckUpload INSTANCE = new CheckUpload();

        public boolean equals(Object other) {
            return this == other || (other instanceof CheckUpload);
        }

        public int hashCode() {
            return 1416782425;
        }

        public String toString() {
            return "CheckUpload";
        }

        private CheckUpload() {
        }
    }

    /* compiled from: InquiryPage.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage$Pending;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.SelfiePage$Pending */
    public static final /* data */ class Pending implements InquiryPage4 {
        public static final Pending INSTANCE = new Pending();

        public boolean equals(Object other) {
            return this == other || (other instanceof Pending);
        }

        public int hashCode() {
            return -238548281;
        }

        public String toString() {
            return "Pending";
        }

        private Pending() {
        }
    }
}
