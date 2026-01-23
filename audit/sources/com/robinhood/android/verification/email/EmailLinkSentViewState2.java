package com.robinhood.android.verification.email;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailLinkSentViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailLinkSentViewStateEvent;", "", "<init>", "()V", "EmailVerified", "LinkSent", "Error", "VerificationWorkflow", "Lcom/robinhood/android/verification/email/EmailLinkSentViewStateEvent$EmailVerified;", "Lcom/robinhood/android/verification/email/EmailLinkSentViewStateEvent$Error;", "Lcom/robinhood/android/verification/email/EmailLinkSentViewStateEvent$LinkSent;", "Lcom/robinhood/android/verification/email/EmailLinkSentViewStateEvent$VerificationWorkflow;", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.verification.email.EmailLinkSentViewStateEvent, reason: use source file name */
/* loaded from: classes9.dex */
public abstract class EmailLinkSentViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ EmailLinkSentViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EmailLinkSentViewState2() {
    }

    /* compiled from: EmailLinkSentViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailLinkSentViewStateEvent$EmailVerified;", "Lcom/robinhood/android/verification/email/EmailLinkSentViewStateEvent;", "<init>", "()V", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.verification.email.EmailLinkSentViewStateEvent$EmailVerified */
    public static final class EmailVerified extends EmailLinkSentViewState2 {
        public static final int $stable = 0;
        public static final EmailVerified INSTANCE = new EmailVerified();

        private EmailVerified() {
            super(null);
        }
    }

    /* compiled from: EmailLinkSentViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailLinkSentViewStateEvent$LinkSent;", "Lcom/robinhood/android/verification/email/EmailLinkSentViewStateEvent;", "email", "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.verification.email.EmailLinkSentViewStateEvent$LinkSent */
    public static final class LinkSent extends EmailLinkSentViewState2 {
        public static final int $stable = 0;
        private final String email;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkSent(String email) {
            super(null);
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
        }

        public final String getEmail() {
            return this.email;
        }
    }

    /* compiled from: EmailLinkSentViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailLinkSentViewStateEvent$Error;", "Lcom/robinhood/android/verification/email/EmailLinkSentViewStateEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.verification.email.EmailLinkSentViewStateEvent$Error */
    public static final class Error extends EmailLinkSentViewState2 {
        public static final int $stable = 8;
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: EmailLinkSentViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailLinkSentViewStateEvent$VerificationWorkflow;", "Lcom/robinhood/android/verification/email/EmailLinkSentViewStateEvent;", "workflowId", "Ljava/util/UUID;", "isMigrated", "", "<init>", "(Ljava/util/UUID;Z)V", "getWorkflowId", "()Ljava/util/UUID;", "()Z", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.verification.email.EmailLinkSentViewStateEvent$VerificationWorkflow */
    public static final class VerificationWorkflow extends EmailLinkSentViewState2 {
        public static final int $stable = 8;
        private final boolean isMigrated;
        private final UUID workflowId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationWorkflow(UUID workflowId, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.workflowId = workflowId;
            this.isMigrated = z;
        }

        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        /* renamed from: isMigrated, reason: from getter */
        public final boolean getIsMigrated() {
            return this.isMigrated;
        }
    }
}
