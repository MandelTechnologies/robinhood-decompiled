package com.twilio.conversations.internal;

import android.os.Handler;
import com.twilio.conversations.ListenerException;
import com.twilio.conversations.MediaUploadListener;
import com.twilio.util.ErrorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediaUploadListenerForwarder.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001b\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000b\u001a\n \u0007*\u0004\u0018\u00010\u00010\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/twilio/conversations/internal/MediaUploadListenerForwarder;", "Lcom/twilio/conversations/MediaUploadListener;", "listener_", "<init>", "(Lcom/twilio/conversations/MediaUploadListener;)V", "handler", "Landroid/os/Handler;", "kotlin.jvm.PlatformType", "getHandler", "()Landroid/os/Handler;", "Landroid/os/Handler;", "listener", "getListener", "()Lcom/twilio/conversations/MediaUploadListener;", "Lcom/twilio/conversations/MediaUploadListener;", "onStarted", "", "onProgress", "bytesSent", "", "onCompleted", "mediaSid", "", "onFailed", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class MediaUploadListenerForwarder implements MediaUploadListener {
    private final Handler handler = HandlerUtil.setupListenerHandler();
    private final MediaUploadListener listener;

    public MediaUploadListenerForwarder(MediaUploadListener mediaUploadListener) {
        this.listener = (MediaUploadListener) RethrowingForwarder.create(mediaUploadListener, ListenerException.class);
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final MediaUploadListener getListener() {
        return this.listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStarted$lambda$0(MediaUploadListenerForwarder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MediaUploadListener mediaUploadListener = this$0.listener;
        if (mediaUploadListener != null) {
            mediaUploadListener.onStarted();
        }
    }

    @Override // com.twilio.conversations.MediaUploadListener
    public void onStarted() {
        this.handler.post(new Runnable() { // from class: com.twilio.conversations.internal.MediaUploadListenerForwarder$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                MediaUploadListenerForwarder.onStarted$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onProgress$lambda$1(MediaUploadListenerForwarder this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MediaUploadListener mediaUploadListener = this$0.listener;
        if (mediaUploadListener != null) {
            mediaUploadListener.onProgress(j);
        }
    }

    @Override // com.twilio.conversations.MediaUploadListener
    public void onProgress(final long bytesSent) {
        this.handler.post(new Runnable() { // from class: com.twilio.conversations.internal.MediaUploadListenerForwarder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MediaUploadListenerForwarder.onProgress$lambda$1(this.f$0, bytesSent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCompleted$lambda$2(MediaUploadListenerForwarder this$0, String mediaSid) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mediaSid, "$mediaSid");
        MediaUploadListener mediaUploadListener = this$0.listener;
        if (mediaUploadListener != null) {
            mediaUploadListener.onCompleted(mediaSid);
        }
    }

    @Override // com.twilio.conversations.MediaUploadListener
    public void onCompleted(final String mediaSid) {
        Intrinsics.checkNotNullParameter(mediaSid, "mediaSid");
        this.handler.post(new Runnable() { // from class: com.twilio.conversations.internal.MediaUploadListenerForwarder$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                MediaUploadListenerForwarder.onCompleted$lambda$2(this.f$0, mediaSid);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFailed$lambda$3(MediaUploadListenerForwarder this$0, ErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(errorInfo, "$errorInfo");
        MediaUploadListener mediaUploadListener = this$0.listener;
        if (mediaUploadListener != null) {
            mediaUploadListener.onFailed(errorInfo);
        }
    }

    @Override // com.twilio.conversations.MediaUploadListener
    public void onFailed(final ErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        this.handler.post(new Runnable() { // from class: com.twilio.conversations.internal.MediaUploadListenerForwarder$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MediaUploadListenerForwarder.onFailed$lambda$3(this.f$0, errorInfo);
            }
        });
    }
}
