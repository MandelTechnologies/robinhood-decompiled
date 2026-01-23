package com.withpersona.sdk2.inquiry.webrtc.optional.module.loading;

import android.content.Context;
import android.media.Image;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: WebRtcManagerBridge.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001Jk\u0010\u0010\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0007H&¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u001c\u001a\u00020\r2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\r0\u0017H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH&¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\nH&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH&¢\u0006\u0004\b#\u0010\"R\u001e\u0010)\u001a\u0004\u0018\u00010$8&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010/\u001a\u0004\u0018\u00010*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\"¨\u00061"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "", "", "userName", "credential", "serverUrl", "jwt", "", "width", "height", "", "isAudioRequired", "Lkotlin/Function0;", "", "completion", "onConnectionError", "setupConnection", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/media/Image;", "image", "rotation", "captureOutput", "(Landroid/media/Image;I)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "objectId", "webRtcObjectIdReceived", "stopRecording", "(Lkotlin/jvm/functions/Function1;)V", "webRtcConnectionFailed", "()V", "closeWebRtcConnection", "webRtcConnectionHasFailedTooManyTimesToRetry", "()Z", "webRtcConnectionHasFailedAtLeastOnce", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcService;", "getService", "()Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcService;", "setService", "(Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcService;)V", "service", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context", "isConnected", "webrtc_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface WebRtcManagerBridge {
    void captureOutput(Image image, int rotation);

    void closeWebRtcConnection();

    boolean isConnected();

    void setContext(Context context);

    void setService(WebRtcService webRtcService);

    void setupConnection(String userName, String credential, String serverUrl, String jwt, int width, int height, boolean isAudioRequired, Function0<Unit> completion, Function0<Unit> onConnectionError);

    void stopRecording(Function1<? super String, Unit> webRtcObjectIdReceived);

    void webRtcConnectionFailed();

    boolean webRtcConnectionHasFailedAtLeastOnce();

    boolean webRtcConnectionHasFailedTooManyTimesToRetry();
}
