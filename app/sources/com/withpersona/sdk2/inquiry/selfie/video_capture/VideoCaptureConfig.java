package com.withpersona.sdk2.inquiry.selfie.video_capture;

import android.content.Context;
import com.squareup.moshi.Json;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: VideoCaptureConfig.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0015J/\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u0015JP\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100¨\u00061"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "", "", "maxRecordingLengthMs", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "enabledCaptureFileTypes", "Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "videoCaptureMethods", "", "webRtcJwt", "", "recordAudio", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "hasExhaustedWebRtcConnectionAttempts", "canUseLocalVideoAsFallback", "Landroid/content/Context;", "applicationContext", "Lkotlin/Result;", "pickCaptureMethod-0E7RQCE", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Landroid/content/Context;)Ljava/lang/Object;", "pickCaptureMethod", "isVideo-0E7RQCE", "isVideo", "videoCaptureMethod-0E7RQCE", "videoCaptureMethod", "copy", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getMaxRecordingLengthMs", "()J", "Ljava/util/List;", "getEnabledCaptureFileTypes", "()Ljava/util/List;", "getVideoCaptureMethods", "Ljava/lang/String;", "getWebRtcJwt", "Z", "getRecordAudio", "()Z", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final /* data */ class VideoCaptureConfig {
    private final List<NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes;
    private final long maxRecordingLengthMs;
    private final boolean recordAudio;
    private final List<VideoCaptureMethod> videoCaptureMethods;
    private final String webRtcJwt;

    public final VideoCaptureConfig copy(long maxRecordingLengthMs, List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, List<? extends VideoCaptureMethod> videoCaptureMethods, @Json(name = "webRTCJwt") String webRtcJwt, boolean recordAudio) {
        Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
        Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
        return new VideoCaptureConfig(maxRecordingLengthMs, enabledCaptureFileTypes, videoCaptureMethods, webRtcJwt, recordAudio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCaptureConfig)) {
            return false;
        }
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) other;
        return this.maxRecordingLengthMs == videoCaptureConfig.maxRecordingLengthMs && Intrinsics.areEqual(this.enabledCaptureFileTypes, videoCaptureConfig.enabledCaptureFileTypes) && Intrinsics.areEqual(this.videoCaptureMethods, videoCaptureConfig.videoCaptureMethods) && Intrinsics.areEqual(this.webRtcJwt, videoCaptureConfig.webRtcJwt) && this.recordAudio == videoCaptureConfig.recordAudio;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.maxRecordingLengthMs) * 31) + this.enabledCaptureFileTypes.hashCode()) * 31) + this.videoCaptureMethods.hashCode()) * 31;
        String str = this.webRtcJwt;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.recordAudio);
    }

    public String toString() {
        return "VideoCaptureConfig(maxRecordingLengthMs=" + this.maxRecordingLengthMs + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", webRtcJwt=" + this.webRtcJwt + ", recordAudio=" + this.recordAudio + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoCaptureConfig(long j, List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, List<? extends VideoCaptureMethod> videoCaptureMethods, @Json(name = "webRTCJwt") String str, boolean z) {
        Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
        Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
        this.maxRecordingLengthMs = j;
        this.enabledCaptureFileTypes = enabledCaptureFileTypes;
        this.videoCaptureMethods = videoCaptureMethods;
        this.webRtcJwt = str;
        this.recordAudio = z;
    }

    public /* synthetic */ VideoCaptureConfig(long j, List list, List list2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 60000L : j, list, list2, str, z);
    }

    public final long getMaxRecordingLengthMs() {
        return this.maxRecordingLengthMs;
    }

    public final String getWebRtcJwt() {
        return this.webRtcJwt;
    }

    public final boolean getRecordAudio() {
        return this.recordAudio;
    }

    /* renamed from: isVideo-0E7RQCE, reason: not valid java name */
    public final Object m27481isVideo0E7RQCE(Boolean hasExhaustedWebRtcConnectionAttempts, Boolean canUseLocalVideoAsFallback, Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (!this.enabledCaptureFileTypes.contains(NextStep.Selfie.CaptureFileType.Video)) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m28550constructorimpl(Boolean.FALSE);
        }
        Object objM27482videoCaptureMethod0E7RQCE = m27482videoCaptureMethod0E7RQCE(hasExhaustedWebRtcConnectionAttempts, canUseLocalVideoAsFallback, applicationContext);
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM27482videoCaptureMethod0E7RQCE);
        if (thM28553exceptionOrNullimpl != null) {
            return Result.m28550constructorimpl(ResultKt.createFailure(thM28553exceptionOrNullimpl));
        }
        VideoCaptureMethod videoCaptureMethod = (VideoCaptureMethod) objM27482videoCaptureMethod0E7RQCE;
        return Result.m28550constructorimpl(Boolean.valueOf(videoCaptureMethod == VideoCaptureMethod.Stream || videoCaptureMethod == VideoCaptureMethod.Upload));
    }

    /* renamed from: videoCaptureMethod-0E7RQCE, reason: not valid java name */
    public final Object m27482videoCaptureMethod0E7RQCE(Boolean hasExhaustedWebRtcConnectionAttempts, Boolean canUseLocalVideoAsFallback, Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (this.enabledCaptureFileTypes.contains(NextStep.Selfie.CaptureFileType.Video)) {
            return m27480pickCaptureMethod0E7RQCE(hasExhaustedWebRtcConnectionAttempts, canUseLocalVideoAsFallback, applicationContext);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m28550constructorimpl(VideoCaptureMethod.None);
    }

    /* renamed from: pickCaptureMethod-0E7RQCE, reason: not valid java name */
    private final Object m27480pickCaptureMethod0E7RQCE(Boolean hasExhaustedWebRtcConnectionAttempts, Boolean canUseLocalVideoAsFallback, Context applicationContext) {
        boolean z = this.enabledCaptureFileTypes.contains(NextStep.Selfie.CaptureFileType.Video) && CollectionsKt.firstOrNull((List) this.videoCaptureMethods) == VideoCaptureMethod.Stream;
        boolean z2 = (hasExhaustedWebRtcConnectionAttempts == null || canUseLocalVideoAsFallback == null) ? false : true;
        if (z && !z2) {
            List<VideoCaptureMethod> list = this.videoCaptureMethods;
            VideoCaptureMethod videoCaptureMethod = VideoCaptureMethod.Upload;
            if (list.contains(videoCaptureMethod)) {
                if (ContextUtils3.isDebugBuild(applicationContext)) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m28550constructorimpl(ResultKt.createFailure(new RuntimeException()));
                }
                return Result.m28550constructorimpl(videoCaptureMethod);
            }
            List<NextStep.Selfie.CaptureFileType> list2 = this.enabledCaptureFileTypes;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (NextStep.Selfie.CaptureFileType captureFileType : list2) {
                    if (captureFileType != NextStep.Selfie.CaptureFileType.Video && captureFileType != NextStep.Selfie.CaptureFileType.Unknown) {
                        if (ContextUtils3.isDebugBuild(applicationContext)) {
                            Result.Companion companion2 = Result.INSTANCE;
                            return Result.m28550constructorimpl(ResultKt.createFailure(new RuntimeException()));
                        }
                        Result.Companion companion3 = Result.INSTANCE;
                        return Result.m28550constructorimpl(VideoCaptureMethod.None);
                    }
                }
            }
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new RuntimeException()));
        }
        if (canUseLocalVideoAsFallback != null ? canUseLocalVideoAsFallback.booleanValue() : true) {
            List<VideoCaptureMethod> list3 = this.videoCaptureMethods;
            VideoCaptureMethod videoCaptureMethod2 = VideoCaptureMethod.Upload;
            if (list3.contains(videoCaptureMethod2)) {
                return Result.m28550constructorimpl(videoCaptureMethod2);
            }
        }
        if (hasExhaustedWebRtcConnectionAttempts != null ? hasExhaustedWebRtcConnectionAttempts.booleanValue() : false) {
            Result.Companion companion5 = Result.INSTANCE;
            return Result.m28550constructorimpl(VideoCaptureMethod.None);
        }
        Result.Companion companion6 = Result.INSTANCE;
        VideoCaptureMethod videoCaptureMethod3 = (VideoCaptureMethod) CollectionsKt.firstOrNull((List) this.videoCaptureMethods);
        if (videoCaptureMethod3 == null) {
            videoCaptureMethod3 = VideoCaptureMethod.None;
        }
        return Result.m28550constructorimpl(videoCaptureMethod3);
    }
}
