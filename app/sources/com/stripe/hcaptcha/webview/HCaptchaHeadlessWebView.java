package com.stripe.hcaptcha.webview;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.HCaptchaStateListener;
import com.stripe.hcaptcha.IHCaptchaVerifier;
import com.stripe.hcaptcha.R$id;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaInternalConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaHeadlessWebView.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u001cH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;", "Lcom/stripe/hcaptcha/IHCaptchaVerifier;", "activity", "Landroid/app/Activity;", "config", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "internalConfig", "Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;", "listener", "Lcom/stripe/hcaptcha/HCaptchaStateListener;", "(Landroid/app/Activity;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;Lcom/stripe/hcaptcha/HCaptchaStateListener;)V", "shouldExecuteOnLoad", "", "shouldResetOnLoad", "webViewHelper", "Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;", "webViewLoaded", "onFailure", "", "exception", "Lcom/stripe/hcaptcha/HCaptchaException;", "onLoaded", "onOpen", "onSuccess", "result", "", "reset", "startVerification", "Landroidx/fragment/app/FragmentActivity;", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class HCaptchaHeadlessWebView implements IHCaptchaVerifier {
    private final HCaptchaStateListener listener;
    private boolean shouldExecuteOnLoad;
    private boolean shouldResetOnLoad;
    private final HCaptchaWebViewHelper webViewHelper;
    private boolean webViewLoaded;

    public HCaptchaHeadlessWebView(Activity activity, HCaptchaConfig config, HCaptchaInternalConfig internalConfig, HCaptchaStateListener listener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        HCaptchaWebView hCaptchaWebView = new HCaptchaWebView(activity);
        hCaptchaWebView.setId(R$id.webView);
        hCaptchaWebView.setVisibility(8);
        if (hCaptchaWebView.getParent() == null) {
            View rootView = activity.getWindow().getDecorView().getRootView();
            Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) rootView).addView(hCaptchaWebView);
        }
        this.webViewHelper = new HCaptchaWebViewHelper(new Handler(Looper.getMainLooper()), activity, config, internalConfig, this, listener, hCaptchaWebView);
    }

    @Override // com.stripe.hcaptcha.IHCaptchaVerifier
    public void startVerification(FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.webViewLoaded) {
            this.webViewHelper.resetAndExecute();
        } else {
            this.shouldExecuteOnLoad = true;
        }
    }

    @Override // com.stripe.hcaptcha.task.OnFailureListener
    public void onFailure(HCaptchaException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (this.webViewHelper.shouldRetry(exception)) {
            this.webViewHelper.resetAndExecute();
        } else {
            this.listener.getOnFailure().invoke(exception);
        }
    }

    @Override // com.stripe.hcaptcha.task.OnSuccessListener
    public void onSuccess(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.listener.getOnSuccess().invoke(result);
    }

    @Override // com.stripe.hcaptcha.task.OnLoadedListener
    public void onLoaded() {
        this.webViewLoaded = true;
        if (this.shouldResetOnLoad) {
            this.shouldResetOnLoad = false;
            reset();
        } else if (this.shouldExecuteOnLoad) {
            this.shouldExecuteOnLoad = false;
            this.webViewHelper.resetAndExecute();
        }
    }

    @Override // com.stripe.hcaptcha.task.OnOpenListener
    public void onOpen() {
        this.listener.getOnOpen().invoke();
    }

    public void reset() {
        if (this.webViewLoaded) {
            this.webViewHelper.reset();
            WebView webView = this.webViewHelper.getWebView();
            if (webView.getParent() != null) {
                ViewParent parent = webView.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(webView);
                return;
            }
            return;
        }
        this.shouldResetOnLoad = true;
    }
}
