package com.withpersona.sdk2.inquiry.webrtc.optional.module.loading;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: WebRtcManagerBridge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0002\u001a\b\u0010\b\u001a\u0004\u0018\u00010\t\"\u001b\u0010\u0002\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, m3636d2 = {"getWebRtcManagerBridgeClass", "Ljava/lang/Class;", "webRtcWrapperExists", "", "getWebRtcWrapperExists", "()Z", "webRtcWrapperExists$delegate", "Lkotlin/Lazy;", "getWebRtcManagerBridge", "Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "webrtc_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridgeKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class WebRtcManagerBridge2 {
    private static final Lazy webRtcWrapperExists$delegate = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridgeKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(WebRtcManagerBridge2.webRtcWrapperExists_delegate$lambda$0());
        }
    });

    private static final Class<?> getWebRtcManagerBridgeClass() {
        try {
            return Class.forName("com.withpersona.sdk2.inquiry.webrtc.impl.WebRtcManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final boolean getWebRtcWrapperExists() {
        return ((Boolean) webRtcWrapperExists$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean webRtcWrapperExists_delegate$lambda$0() {
        return getWebRtcManagerBridgeClass() != null;
    }

    public static final WebRtcManagerBridge getWebRtcManagerBridge() {
        Class<?> webRtcManagerBridgeClass = getWebRtcManagerBridgeClass();
        Object objNewInstance = webRtcManagerBridgeClass != null ? webRtcManagerBridgeClass.newInstance() : null;
        if (objNewInstance instanceof WebRtcManagerBridge) {
            return (WebRtcManagerBridge) objNewInstance;
        }
        return null;
    }
}
