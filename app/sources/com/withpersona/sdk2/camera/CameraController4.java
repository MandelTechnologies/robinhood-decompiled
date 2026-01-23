package com.withpersona.sdk2.camera;

import kotlin.Metadata;

/* compiled from: CameraController.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraState;", "", "NotReady", "Preparing", "Ready", "Closed", "Error", "Lcom/withpersona/sdk2/camera/CameraState$Closed;", "Lcom/withpersona/sdk2/camera/CameraState$Error;", "Lcom/withpersona/sdk2/camera/CameraState$NotReady;", "Lcom/withpersona/sdk2/camera/CameraState$Preparing;", "Lcom/withpersona/sdk2/camera/CameraState$Ready;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.camera.CameraState, reason: use source file name */
/* loaded from: classes26.dex */
public interface CameraController4 {

    /* compiled from: CameraController.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraState$NotReady;", "Lcom/withpersona/sdk2/camera/CameraState;", "<init>", "()V", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.CameraState$NotReady */
    public static final class NotReady implements CameraController4 {
        public static final NotReady INSTANCE = new NotReady();

        private NotReady() {
        }
    }

    /* compiled from: CameraController.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraState$Preparing;", "Lcom/withpersona/sdk2/camera/CameraState;", "<init>", "()V", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.CameraState$Preparing */
    public static final class Preparing implements CameraController4 {
        public static final Preparing INSTANCE = new Preparing();

        private Preparing() {
        }
    }

    /* compiled from: CameraController.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraState$Ready;", "Lcom/withpersona/sdk2/camera/CameraState;", "<init>", "()V", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.CameraState$Ready */
    public static final class Ready implements CameraController4 {
        public static final Ready INSTANCE = new Ready();

        private Ready() {
        }
    }

    /* compiled from: CameraController.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraState$Closed;", "Lcom/withpersona/sdk2/camera/CameraState;", "", "wasRecordingInterrupted", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getWasRecordingInterrupted", "()Z", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.CameraState$Closed, reason: from toString */
    public static final /* data */ class Closed implements CameraController4 {
        private final boolean wasRecordingInterrupted;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Closed) && this.wasRecordingInterrupted == ((Closed) other).wasRecordingInterrupted;
        }

        public int hashCode() {
            return Boolean.hashCode(this.wasRecordingInterrupted);
        }

        public String toString() {
            return "Closed(wasRecordingInterrupted=" + this.wasRecordingInterrupted + ")";
        }

        public Closed(boolean z) {
            this.wasRecordingInterrupted = z;
        }

        public final boolean getWasRecordingInterrupted() {
            return this.wasRecordingInterrupted;
        }
    }

    /* compiled from: CameraController.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraState$Error;", "Lcom/withpersona/sdk2/camera/CameraState;", "<init>", "()V", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.CameraState$Error */
    public static final class Error implements CameraController4 {
        public static final Error INSTANCE = new Error();

        private Error() {
        }
    }
}
