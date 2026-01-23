package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState2;
import kotlin.Metadata;

/* compiled from: SelfieState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/CaptureState;", "Lcom/withpersona/sdk2/inquiry/selfie/CameraState;", "startCaptureTimestamp", "", "getStartCaptureTimestamp", "()J", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "startSelfieTimestamp", "getStartSelfieTimestamp", "manualCaptureEnabled", "", "getManualCaptureEnabled", "()Z", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.selfie.CaptureState, reason: use source file name */
/* loaded from: classes18.dex */
public interface SelfieState3 extends SelfieState2 {
    CameraProperties getCameraProperties();

    boolean getManualCaptureEnabled();

    long getStartCaptureTimestamp();

    long getStartSelfieTimestamp();

    /* compiled from: SelfieState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.CaptureState$DefaultImpls */
    public static final class DefaultImpls {
        public static Selfie.Pose getCurrentPose(SelfieState3 selfieState3) {
            return SelfieState2.DefaultImpls.getCurrentPose(selfieState3);
        }

        public static PoseConfig getCurrentPoseConfig(SelfieState3 selfieState3) {
            return SelfieState2.DefaultImpls.getCurrentPoseConfig(selfieState3);
        }

        public static Selfie.Pose getCurrentPoseOrNull(SelfieState3 selfieState3) {
            return SelfieState2.DefaultImpls.getCurrentPoseOrNull(selfieState3);
        }

        public static boolean getManualCaptureEnabled(SelfieState3 selfieState3) {
            PoseConfig currentPoseConfig = selfieState3.getCurrentPoseConfig();
            if (!selfieState3.getAutoCaptureSupported() || currentPoseConfig.getManualCaptureEnabled()) {
                return (selfieState3.getAutoCaptureSupported() && currentPoseConfig.getAutoCaptureEnabled() && System.currentTimeMillis() - selfieState3.getStartCaptureTimestamp() <= currentPoseConfig.getManualCaptureDelayMs()) ? false : true;
            }
            return false;
        }
    }
}
