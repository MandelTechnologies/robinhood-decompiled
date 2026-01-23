package com.stripe.hcaptcha.webview;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import com.stripe.hcaptcha.HCaptchaError;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.IHCaptchaVerifier;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.encode.Encode2;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaJSInterface.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u000fH\u0007J\b\u0010\u0013\u001a\u00020\u000fH\u0007J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\tH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0004\u001a\u00020\t8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;", "Ljava/io/Serializable;", "handler", "Landroid/os/Handler;", "config", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "captchaVerifier", "Lcom/stripe/hcaptcha/IHCaptchaVerifier;", "(Landroid/os/Handler;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/IHCaptchaVerifier;)V", "", "getConfig", "()Ljava/lang/String;", "config$delegate", "Lkotlin/Lazy;", "onError", "", "errCode", "", "onLoaded", "onOpen", "onPass", "token", "Companion", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class HCaptchaJSInterface implements Serializable {
    private final transient IHCaptchaVerifier captchaVerifier;

    /* renamed from: config$delegate, reason: from kotlin metadata */
    private final Lazy config;
    private final transient Handler handler;

    public HCaptchaJSInterface(Handler handler, final HCaptchaConfig config, IHCaptchaVerifier captchaVerifier) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(captchaVerifier, "captchaVerifier");
        this.handler = handler;
        this.captchaVerifier = captchaVerifier;
        this.config = LazyKt.lazy(new Function0<String>() { // from class: com.stripe.hcaptcha.webview.HCaptchaJSInterface$config$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Encode2.encodeToJson(HCaptchaConfig.INSTANCE.serializer(), config);
            }
        });
    }

    @JavascriptInterface
    public final String getConfig() {
        return (String) this.config.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPass$lambda$0(HCaptchaJSInterface this$0, String token) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(token, "$token");
        this$0.captchaVerifier.onSuccess(token);
    }

    @JavascriptInterface
    public final void onPass(final String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.handler.post(new Runnable() { // from class: com.stripe.hcaptcha.webview.HCaptchaJSInterface$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                HCaptchaJSInterface.onPass$lambda$0(this.f$0, token);
            }
        });
    }

    @JavascriptInterface
    public final void onError(int errCode) {
        final HCaptchaError hCaptchaErrorFromId = HCaptchaError.INSTANCE.fromId(errCode);
        this.handler.post(new Runnable() { // from class: com.stripe.hcaptcha.webview.HCaptchaJSInterface$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                HCaptchaJSInterface.onError$lambda$1(this.f$0, hCaptchaErrorFromId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$1(HCaptchaJSInterface this$0, HCaptchaError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.captchaVerifier.onFailure(new HCaptchaException(error, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLoaded$lambda$2(HCaptchaJSInterface this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.captchaVerifier.onLoaded();
    }

    @JavascriptInterface
    public final void onLoaded() {
        this.handler.post(new Runnable() { // from class: com.stripe.hcaptcha.webview.HCaptchaJSInterface$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                HCaptchaJSInterface.onLoaded$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onOpen$lambda$3(HCaptchaJSInterface this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.captchaVerifier.onOpen();
    }

    @JavascriptInterface
    public final void onOpen() {
        this.handler.post(new Runnable() { // from class: com.stripe.hcaptcha.webview.HCaptchaJSInterface$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                HCaptchaJSInterface.onOpen$lambda$3(this.f$0);
            }
        });
    }
}
