package com.withpersona.sdk2.camera.selfie;

import com.withpersona.sdk2.camera.SelfiePhoto;
import kotlin.Metadata;

/* compiled from: SelfieFrameInfo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/selfie/SelfieFrameInfo;", "", "selfiePhoto", "Lcom/withpersona/sdk2/camera/SelfiePhoto$Pose;", "error", "Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "facesInFrame", "", "isFaceTooClose", "", "isFaceTooFar", "isFaceCentered", "faceAngle", "", "brightnessInfo", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "<init>", "(Lcom/withpersona/sdk2/camera/SelfiePhoto$Pose;Lcom/withpersona/sdk2/camera/selfie/SelfieError;IZZZFLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;)V", "getSelfiePhoto", "()Lcom/withpersona/sdk2/camera/SelfiePhoto$Pose;", "getError", "()Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "getFacesInFrame", "()I", "()Z", "getFaceAngle", "()F", "getBrightnessInfo", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SelfieFrameInfo {
    private final SelfieBrightnessInfo brightnessInfo;
    private final SelfieError error;
    private final float faceAngle;
    private final int facesInFrame;
    private final boolean isFaceCentered;
    private final boolean isFaceTooClose;
    private final boolean isFaceTooFar;
    private final SelfiePhoto selfiePhoto;

    public SelfieFrameInfo(SelfiePhoto selfiePhoto, SelfieError selfieError, int i, boolean z, boolean z2, boolean z3, float f, SelfieBrightnessInfo selfieBrightnessInfo) {
        this.selfiePhoto = selfiePhoto;
        this.error = selfieError;
        this.facesInFrame = i;
        this.isFaceTooClose = z;
        this.isFaceTooFar = z2;
        this.isFaceCentered = z3;
        this.faceAngle = f;
        this.brightnessInfo = selfieBrightnessInfo;
    }

    public final SelfiePhoto getSelfiePhoto() {
        return this.selfiePhoto;
    }

    public final SelfieError getError() {
        return this.error;
    }

    public final int getFacesInFrame() {
        return this.facesInFrame;
    }

    /* renamed from: isFaceTooClose, reason: from getter */
    public final boolean getIsFaceTooClose() {
        return this.isFaceTooClose;
    }

    /* renamed from: isFaceTooFar, reason: from getter */
    public final boolean getIsFaceTooFar() {
        return this.isFaceTooFar;
    }

    /* renamed from: isFaceCentered, reason: from getter */
    public final boolean getIsFaceCentered() {
        return this.isFaceCentered;
    }

    public final float getFaceAngle() {
        return this.faceAngle;
    }

    public final SelfieBrightnessInfo getBrightnessInfo() {
        return this.brightnessInfo;
    }
}
