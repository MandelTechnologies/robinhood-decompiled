package androidx.camera.core.impl;

/* loaded from: classes4.dex */
public class RestrictedCameraInfo extends ForwardingCameraInfo {
    private final CameraConfig mCameraConfig;
    private final CameraInfoInternal mCameraInfo;
    private boolean mIsCaptureProcessProgressSupported;
    private boolean mIsPostviewSupported;
    private final SessionProcessor mSessionProcessor;

    public RestrictedCameraInfo(CameraInfoInternal cameraInfoInternal, CameraConfig cameraConfig) {
        super(cameraInfoInternal);
        this.mIsPostviewSupported = false;
        this.mIsCaptureProcessProgressSupported = false;
        this.mCameraInfo = cameraInfoInternal;
        this.mCameraConfig = cameraConfig;
        this.mSessionProcessor = cameraConfig.getSessionProcessor(null);
        setPostviewSupported(cameraConfig.isPostviewSupported());
        setCaptureProcessProgressSupported(cameraConfig.isCaptureProcessProgressSupported());
    }

    public CameraConfig getCameraConfig() {
        return this.mCameraConfig;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public CameraInfoInternal getImplementation() {
        return this.mCameraInfo;
    }

    public void setPostviewSupported(boolean z) {
        this.mIsPostviewSupported = z;
    }

    public void setCaptureProcessProgressSupported(boolean z) {
        this.mIsCaptureProcessProgressSupported = z;
    }
}
