package com.twilio.conversations;

import com.twilio.util.ErrorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediaUploadListener.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, m3636d2 = {"Lcom/twilio/conversations/MediaUploadListener;", "", "onStarted", "", "onProgress", "bytesSent", "", "onCompleted", "mediaSid", "", "onFailed", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface MediaUploadListener {

    /* compiled from: MediaUploadListener.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void onCompleted(MediaUploadListener mediaUploadListener, String mediaSid) {
            Intrinsics.checkNotNullParameter(mediaSid, "mediaSid");
        }

        public static void onFailed(MediaUploadListener mediaUploadListener, ErrorInfo errorInfo) {
            Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        }

        public static void onProgress(MediaUploadListener mediaUploadListener, long j) {
        }

        public static void onStarted(MediaUploadListener mediaUploadListener) {
        }
    }

    void onCompleted(String mediaSid);

    void onFailed(ErrorInfo errorInfo);

    void onProgress(long bytesSent);

    void onStarted();
}
