package com.robinhood.shared.security.verify.credentials;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: VerifyCredentialsEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsEvent;", "", "<init>", "()V", "Finished", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsEvent$Finished;", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class VerifyCredentialsEvent {
    public static final int $stable = 0;

    public /* synthetic */ VerifyCredentialsEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: VerifyCredentialsEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsEvent$Finished;", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Finished extends VerifyCredentialsEvent {
        public static final int $stable = 0;
        public static final Finished INSTANCE = new Finished();

        public boolean equals(Object other) {
            return this == other || (other instanceof Finished);
        }

        public int hashCode() {
            return -284944420;
        }

        public String toString() {
            return "Finished";
        }

        private Finished() {
            super(null);
        }
    }

    private VerifyCredentialsEvent() {
    }
}
