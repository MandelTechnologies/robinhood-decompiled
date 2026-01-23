package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.inquiry.selfie.Selfie;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: SelfieState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017\u0082\u0001\u0006\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/CameraState;", "", "posesNeeded", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "getPosesNeeded", "()Ljava/util/List;", "currentPose", "getCurrentPose", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "currentPoseOrNull", "getCurrentPoseOrNull", "poseConfigs", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "getPoseConfigs", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "currentPoseConfig", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "getCurrentPoseConfig", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "autoCaptureSupported", "", "getAutoCaptureSupported", "()Z", "isFlashEnabled", "Lcom/withpersona/sdk2/inquiry/selfie/CaptureState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.selfie.CameraState, reason: use source file name */
/* loaded from: classes18.dex */
public interface SelfieState2 {
    boolean getAutoCaptureSupported();

    Selfie.Pose getCurrentPose();

    PoseConfig getCurrentPoseConfig();

    Selfie.Pose getCurrentPoseOrNull();

    PoseConfigs getPoseConfigs();

    List<Selfie.Pose> getPosesNeeded();

    boolean isFlashEnabled();

    /* compiled from: SelfieState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.CameraState$DefaultImpls */
    public static final class DefaultImpls {
        public static Selfie.Pose getCurrentPose(SelfieState2 selfieState2) {
            return (Selfie.Pose) CollectionsKt.first((List) selfieState2.getPosesNeeded());
        }

        public static Selfie.Pose getCurrentPoseOrNull(SelfieState2 selfieState2) {
            return (Selfie.Pose) CollectionsKt.firstOrNull((List) selfieState2.getPosesNeeded());
        }

        public static PoseConfig getCurrentPoseConfig(SelfieState2 selfieState2) {
            Selfie.Pose currentPoseOrNull = selfieState2.getCurrentPoseOrNull();
            if (currentPoseOrNull == null) {
                return PoseConfig.INSTANCE.getDefault();
            }
            return selfieState2.getPoseConfigs().getPoseConfig(currentPoseOrNull);
        }
    }
}
