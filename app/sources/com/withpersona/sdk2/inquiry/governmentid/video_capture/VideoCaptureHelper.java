package com.withpersona.sdk2.inquiry.governmentid.video_capture;

import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridge;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridge2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoCaptureHelper.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005R\u0011\u0010\u0016\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureHelper;", "", "Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "webRtcManager", "<init>", "(Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "", "webRtcConfigIsValid", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z", "isVideoCapture", "Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "videoCaptureMethod", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "", "closeWebRtcConnection", "()V", "Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "getWebRtcManager", "()Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "setWebRtcManager", "isWebRtcConnected", "()Z", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class VideoCaptureHelper {
    private WebRtcManagerBridge webRtcManager;

    public VideoCaptureHelper(WebRtcManagerBridge webRtcManagerBridge) {
        this.webRtcManager = webRtcManagerBridge;
    }

    public /* synthetic */ VideoCaptureHelper(WebRtcManagerBridge webRtcManagerBridge, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? WebRtcManagerBridge2.getWebRtcManagerBridge() : webRtcManagerBridge);
    }

    public final WebRtcManagerBridge getWebRtcManager() {
        return this.webRtcManager;
    }

    public final boolean isWebRtcConnected() {
        WebRtcManagerBridge webRtcManagerBridge = this.webRtcManager;
        return webRtcManagerBridge != null && webRtcManagerBridge.isConnected();
    }

    public final boolean webRtcConfigIsValid(GovernmentIdWorkflow.Input renderProps) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        return (renderProps.getVideoCaptureConfig().isVideoCaptureEnabled() && CollectionsKt.firstOrNull((List) renderProps.getVideoCaptureConfig().getVideoCaptureMethods()) == VideoCaptureMethod.Stream && !WebRtcManagerBridge2.getWebRtcWrapperExists()) ? false : true;
    }

    public final boolean isVideoCapture(GovernmentIdWorkflow.Input renderProps) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        VideoCaptureMethod videoCaptureMethod = videoCaptureMethod(renderProps);
        return videoCaptureMethod == VideoCaptureMethod.Stream || videoCaptureMethod == VideoCaptureMethod.Upload;
    }

    public final VideoCaptureMethod videoCaptureMethod(GovernmentIdWorkflow.Input renderProps) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        List<VideoCaptureMethod> videoCaptureMethods = videoCaptureConfig.getVideoCaptureMethods();
        if (!videoCaptureConfig.isVideoCaptureEnabled()) {
            return VideoCaptureMethod.None;
        }
        WebRtcManagerBridge webRtcManagerBridge = this.webRtcManager;
        boolean zWebRtcConnectionHasFailedTooManyTimesToRetry = webRtcManagerBridge != null ? webRtcManagerBridge.webRtcConnectionHasFailedTooManyTimesToRetry() : false;
        WebRtcManagerBridge webRtcManagerBridge2 = this.webRtcManager;
        boolean zWebRtcConnectionHasFailedAtLeastOnce = webRtcManagerBridge2 != null ? webRtcManagerBridge2.webRtcConnectionHasFailedAtLeastOnce() : true;
        if (CollectionsKt.firstOrNull((List) videoCaptureConfig.getVideoCaptureMethods()) == VideoCaptureMethod.Stream && !WebRtcManagerBridge2.getWebRtcWrapperExists()) {
            List<VideoCaptureMethod> videoCaptureMethods2 = videoCaptureConfig.getVideoCaptureMethods();
            VideoCaptureMethod videoCaptureMethod = VideoCaptureMethod.Upload;
            return videoCaptureMethods2.contains(videoCaptureMethod) ? videoCaptureMethod : VideoCaptureMethod.None;
        }
        if (zWebRtcConnectionHasFailedAtLeastOnce) {
            VideoCaptureMethod videoCaptureMethod2 = VideoCaptureMethod.Upload;
            if (videoCaptureMethods.contains(videoCaptureMethod2)) {
                return videoCaptureMethod2;
            }
        }
        if (zWebRtcConnectionHasFailedTooManyTimesToRetry) {
            return VideoCaptureMethod.None;
        }
        VideoCaptureMethod videoCaptureMethod3 = (VideoCaptureMethod) CollectionsKt.firstOrNull((List) videoCaptureMethods);
        return videoCaptureMethod3 == null ? VideoCaptureMethod.None : videoCaptureMethod3;
    }

    public final void closeWebRtcConnection() {
        WebRtcManagerBridge webRtcManagerBridge = this.webRtcManager;
        if (webRtcManagerBridge != null) {
            webRtcManagerBridge.closeWebRtcConnection();
        }
    }
}
