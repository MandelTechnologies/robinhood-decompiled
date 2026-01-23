package com.robinhood.android.doc.p109ui.photo;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhotoEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/PhotoEvent;", "", "<init>", "()V", "CameraUnsupported", "CapturePhotoTimeout", "CapturePhotoError", "CapturedPhotoIsBlurry", "CaptureComplete", "Lcom/robinhood/android/doc/ui/photo/PhotoEvent$CameraUnsupported;", "Lcom/robinhood/android/doc/ui/photo/PhotoEvent$CaptureComplete;", "Lcom/robinhood/android/doc/ui/photo/PhotoEvent$CapturePhotoError;", "Lcom/robinhood/android/doc/ui/photo/PhotoEvent$CapturePhotoTimeout;", "Lcom/robinhood/android/doc/ui/photo/PhotoEvent$CapturedPhotoIsBlurry;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class PhotoEvent {
    public static final int $stable = 0;

    public /* synthetic */ PhotoEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: PhotoEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/PhotoEvent$CameraUnsupported;", "Lcom/robinhood/android/doc/ui/photo/PhotoEvent;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CameraUnsupported extends PhotoEvent {
        public static final int $stable = 0;
        public static final CameraUnsupported INSTANCE = new CameraUnsupported();

        private CameraUnsupported() {
            super(null);
        }
    }

    private PhotoEvent() {
    }

    /* compiled from: PhotoEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/PhotoEvent$CapturePhotoTimeout;", "Lcom/robinhood/android/doc/ui/photo/PhotoEvent;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CapturePhotoTimeout extends PhotoEvent {
        public static final int $stable = 0;
        public static final CapturePhotoTimeout INSTANCE = new CapturePhotoTimeout();

        private CapturePhotoTimeout() {
            super(null);
        }
    }

    /* compiled from: PhotoEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/PhotoEvent$CapturePhotoError;", "Lcom/robinhood/android/doc/ui/photo/PhotoEvent;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CapturePhotoError extends PhotoEvent {
        public static final int $stable = 8;
        private final Throwable cause;

        public static /* synthetic */ CapturePhotoError copy$default(CapturePhotoError capturePhotoError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = capturePhotoError.cause;
            }
            return capturePhotoError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final CapturePhotoError copy(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new CapturePhotoError(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CapturePhotoError) && Intrinsics.areEqual(this.cause, ((CapturePhotoError) other).cause);
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        public String toString() {
            return "CapturePhotoError(cause=" + this.cause + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CapturePhotoError(Throwable cause) {
            super(null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        public final Throwable getCause() {
            return this.cause;
        }
    }

    /* compiled from: PhotoEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/PhotoEvent$CapturedPhotoIsBlurry;", "Lcom/robinhood/android/doc/ui/photo/PhotoEvent;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CapturedPhotoIsBlurry extends PhotoEvent {
        public static final int $stable = 0;
        public static final CapturedPhotoIsBlurry INSTANCE = new CapturedPhotoIsBlurry();

        private CapturedPhotoIsBlurry() {
            super(null);
        }
    }

    /* compiled from: PhotoEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/PhotoEvent$CaptureComplete;", "Lcom/robinhood/android/doc/ui/photo/PhotoEvent;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CaptureComplete extends PhotoEvent {
        public static final int $stable = 0;
        public static final CaptureComplete INSTANCE = new CaptureComplete();

        private CaptureComplete() {
            super(null);
        }
    }
}
