package com.robinhood.android.taxcertification;

import com.robinhood.models.p355ui.DocumentRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SsnLockoutViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/LockoutEvent;", "", "<init>", "()V", "NationalIdRequest", "Error", "Lcom/robinhood/android/taxcertification/LockoutEvent$Error;", "Lcom/robinhood/android/taxcertification/LockoutEvent$NationalIdRequest;", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.taxcertification.LockoutEvent, reason: use source file name */
/* loaded from: classes9.dex */
public abstract class SsnLockoutViewState2 {
    public /* synthetic */ SsnLockoutViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: SsnLockoutViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/LockoutEvent$NationalIdRequest;", "Lcom/robinhood/android/taxcertification/LockoutEvent;", "request", "Lcom/robinhood/models/ui/DocumentRequest;", "<init>", "(Lcom/robinhood/models/ui/DocumentRequest;)V", "getRequest", "()Lcom/robinhood/models/ui/DocumentRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.taxcertification.LockoutEvent$NationalIdRequest, reason: from toString */
    public static final /* data */ class NationalIdRequest extends SsnLockoutViewState2 {
        private final DocumentRequest request;

        public static /* synthetic */ NationalIdRequest copy$default(NationalIdRequest nationalIdRequest, DocumentRequest documentRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                documentRequest = nationalIdRequest.request;
            }
            return nationalIdRequest.copy(documentRequest);
        }

        /* renamed from: component1, reason: from getter */
        public final DocumentRequest getRequest() {
            return this.request;
        }

        public final NationalIdRequest copy(DocumentRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return new NationalIdRequest(request);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NationalIdRequest) && Intrinsics.areEqual(this.request, ((NationalIdRequest) other).request);
        }

        public int hashCode() {
            return this.request.hashCode();
        }

        public String toString() {
            return "NationalIdRequest(request=" + this.request + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NationalIdRequest(DocumentRequest request) {
            super(null);
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
        }

        public final DocumentRequest getRequest() {
            return this.request;
        }
    }

    private SsnLockoutViewState2() {
    }

    /* compiled from: SsnLockoutViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/LockoutEvent$Error;", "Lcom/robinhood/android/taxcertification/LockoutEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.taxcertification.LockoutEvent$Error */
    public static final class Error extends SsnLockoutViewState2 {
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
}
