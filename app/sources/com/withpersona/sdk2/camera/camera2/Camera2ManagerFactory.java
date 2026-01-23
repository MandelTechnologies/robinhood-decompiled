package com.withpersona.sdk2.camera.camera2;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.withpersona.sdk2.camera.stats.CameraStatsManager;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Camera2ManagerFactory.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory;", "", "context", "Landroid/content/Context;", "cameraStatsManager", "Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/CameraChoices;", "previewView", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "analyzer", "Lcom/withpersona/sdk2/camera/camera2/Camera2ImageAnalyzer;", "videoCaptureMethod", "Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "webRtcManager", "Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "isAudioRequired", "", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;Lcom/withpersona/sdk2/camera/camera2/CameraChoices;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lcom/withpersona/sdk2/camera/camera2/Camera2ImageAnalyzer;Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;Z)V", "choiceIndex", "", "nextChoice", "newInstance", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager;", "Factory", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class Camera2ManagerFactory {
    private final Camera2ImageAnalyzer analyzer;
    private final CameraChoices cameraChoices;
    private final CameraStatsManager cameraStatsManager;
    private int choiceIndex;
    private final Context context;
    private final boolean isAudioRequired;
    private final Camera2PreviewView previewView;
    private final SdkFilesManager sdkFilesManager;
    private final VideoCaptureMethod videoCaptureMethod;
    private final WebRtcManagerBridge webRtcManager;

    /* compiled from: Camera2ManagerFactory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/CameraChoices;", "previewView", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "analyzer", "Lcom/withpersona/sdk2/camera/camera2/Camera2ImageAnalyzer;", "videoCaptureMethod", "Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "webRtcManager", "Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "isAudioRequired", "", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        Camera2ManagerFactory create(CameraChoices cameraChoices, Camera2PreviewView previewView, Camera2ImageAnalyzer analyzer, VideoCaptureMethod videoCaptureMethod, WebRtcManagerBridge webRtcManager, boolean isAudioRequired);
    }

    public Camera2ManagerFactory(Context context, CameraStatsManager cameraStatsManager, SdkFilesManager sdkFilesManager, CameraChoices cameraChoices, Camera2PreviewView previewView, Camera2ImageAnalyzer analyzer, VideoCaptureMethod videoCaptureMethod, WebRtcManagerBridge webRtcManagerBridge, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(cameraChoices, "cameraChoices");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(analyzer, "analyzer");
        Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
        this.context = context;
        this.cameraStatsManager = cameraStatsManager;
        this.sdkFilesManager = sdkFilesManager;
        this.cameraChoices = cameraChoices;
        this.previewView = previewView;
        this.analyzer = analyzer;
        this.videoCaptureMethod = videoCaptureMethod;
        this.webRtcManager = webRtcManagerBridge;
        this.isAudioRequired = z;
    }

    public final boolean nextChoice() {
        if (this.choiceIndex + 1 >= this.cameraChoices.getAllChoices().size()) {
            return false;
        }
        this.choiceIndex++;
        return true;
    }

    public final Camera2Manager newInstance() {
        return new Camera2Manager(this.context, this.cameraChoices.getAllChoices().get(this.choiceIndex), this.previewView, this.analyzer, this.videoCaptureMethod, this.webRtcManager, this.isAudioRequired, this.cameraStatsManager, this.sdkFilesManager);
    }
}
