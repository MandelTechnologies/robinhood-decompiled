package com.robinhood.android.acatsin.agreement;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAgreementEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementEvent;", "", "<init>", "()V", "AgreementSigned", "AgreementError", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementEvent$AgreementError;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementEvent$AgreementSigned;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class AcatsInAgreementEvent {
    public static final int $stable = 0;

    public /* synthetic */ AcatsInAgreementEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AcatsInAgreementEvent() {
    }

    /* compiled from: AcatsInAgreementEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementEvent$AgreementSigned;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AgreementSigned extends AcatsInAgreementEvent {
        public static final int $stable = 0;
        public static final AgreementSigned INSTANCE = new AgreementSigned();

        public boolean equals(Object other) {
            return this == other || (other instanceof AgreementSigned);
        }

        public int hashCode() {
            return 24792424;
        }

        public String toString() {
            return "AgreementSigned";
        }

        private AgreementSigned() {
            super(null);
        }
    }

    /* compiled from: AcatsInAgreementEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementEvent$AgreementError;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementEvent;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getError", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AgreementError extends AcatsInAgreementEvent {
        public static final int $stable = 8;
        private final Exception error;

        public static /* synthetic */ AgreementError copy$default(AgreementError agreementError, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = agreementError.error;
            }
            return agreementError.copy(exc);
        }

        /* renamed from: component1, reason: from getter */
        public final Exception getError() {
            return this.error;
        }

        public final AgreementError copy(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new AgreementError(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AgreementError) && Intrinsics.areEqual(this.error, ((AgreementError) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "AgreementError(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AgreementError(Exception error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Exception getError() {
            return this.error;
        }
    }
}
