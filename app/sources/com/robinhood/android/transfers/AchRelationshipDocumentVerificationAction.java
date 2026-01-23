package com.robinhood.android.transfers;

import com.robinhood.models.p355ui.DocumentRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchRelationshipDocumentVerificationAction.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/AchRelationshipDocumentVerificationAction;", "", "<init>", "()V", "NeedsUpload", "AlreadyUploaded", "ContactSupport", "Lcom/robinhood/android/transfers/AchRelationshipDocumentVerificationAction$AlreadyUploaded;", "Lcom/robinhood/android/transfers/AchRelationshipDocumentVerificationAction$ContactSupport;", "Lcom/robinhood/android/transfers/AchRelationshipDocumentVerificationAction$NeedsUpload;", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class AchRelationshipDocumentVerificationAction {
    public static final int $stable = 0;

    public /* synthetic */ AchRelationshipDocumentVerificationAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AchRelationshipDocumentVerificationAction() {
    }

    /* compiled from: AchRelationshipDocumentVerificationAction.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/AchRelationshipDocumentVerificationAction$NeedsUpload;", "Lcom/robinhood/android/transfers/AchRelationshipDocumentVerificationAction;", "documentRequest", "Lcom/robinhood/models/ui/DocumentRequest;", "<init>", "(Lcom/robinhood/models/ui/DocumentRequest;)V", "getDocumentRequest", "()Lcom/robinhood/models/ui/DocumentRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NeedsUpload extends AchRelationshipDocumentVerificationAction {
        public static final int $stable = 8;
        private final DocumentRequest documentRequest;

        public static /* synthetic */ NeedsUpload copy$default(NeedsUpload needsUpload, DocumentRequest documentRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                documentRequest = needsUpload.documentRequest;
            }
            return needsUpload.copy(documentRequest);
        }

        /* renamed from: component1, reason: from getter */
        public final DocumentRequest getDocumentRequest() {
            return this.documentRequest;
        }

        public final NeedsUpload copy(DocumentRequest documentRequest) {
            Intrinsics.checkNotNullParameter(documentRequest, "documentRequest");
            return new NeedsUpload(documentRequest);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NeedsUpload) && Intrinsics.areEqual(this.documentRequest, ((NeedsUpload) other).documentRequest);
        }

        public int hashCode() {
            return this.documentRequest.hashCode();
        }

        public String toString() {
            return "NeedsUpload(documentRequest=" + this.documentRequest + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NeedsUpload(DocumentRequest documentRequest) {
            super(null);
            Intrinsics.checkNotNullParameter(documentRequest, "documentRequest");
            this.documentRequest = documentRequest;
        }

        public final DocumentRequest getDocumentRequest() {
            return this.documentRequest;
        }
    }

    /* compiled from: AchRelationshipDocumentVerificationAction.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/AchRelationshipDocumentVerificationAction$AlreadyUploaded;", "Lcom/robinhood/android/transfers/AchRelationshipDocumentVerificationAction;", "<init>", "()V", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AlreadyUploaded extends AchRelationshipDocumentVerificationAction {
        public static final int $stable = 0;
        public static final AlreadyUploaded INSTANCE = new AlreadyUploaded();

        private AlreadyUploaded() {
            super(null);
        }
    }

    /* compiled from: AchRelationshipDocumentVerificationAction.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/AchRelationshipDocumentVerificationAction$ContactSupport;", "Lcom/robinhood/android/transfers/AchRelationshipDocumentVerificationAction;", "<init>", "()V", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ContactSupport extends AchRelationshipDocumentVerificationAction {
        public static final int $stable = 0;
        public static final ContactSupport INSTANCE = new ContactSupport();

        private ContactSupport() {
            super(null);
        }
    }
}
