package microgram.android.internal.guest.webview;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.os.HandlerCompat;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.robinhood.android.tracing.RhTrace3;
import com.robinhood.android.tracing.RhTrace6;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.internal.guest.RuntimeMessage;
import microgram.android.internal.guest.webview.WebViewGuestRuntime;

/* compiled from: WebViewGuestRuntime.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/android/internal/guest/webview/WebViewGuestRuntime;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.android.internal.guest.webview.WebViewGuestRuntime$Factory$create$2$1", m3645f = "WebViewGuestRuntime.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: microgram.android.internal.guest.webview.WebViewGuestRuntime$Factory$create$2$1, reason: use source file name */
/* loaded from: classes14.dex */
final class WebViewGuestRuntime3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super WebViewGuestRuntime>, Object> {
    final /* synthetic */ Function1<RuntimeMessage, Unit> $onGuestEvent;
    int label;
    final /* synthetic */ WebViewGuestRuntime.Factory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WebViewGuestRuntime3(WebViewGuestRuntime.Factory factory, Function1<? super RuntimeMessage, Unit> function1, Continuation<? super WebViewGuestRuntime3> continuation) {
        super(2, continuation);
        this.this$0 = factory;
        this.$onGuestEvent = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebViewGuestRuntime3(this.this$0, this.$onGuestEvent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WebViewGuestRuntime> continuation) {
        return ((WebViewGuestRuntime3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            RhTrace6 rhTrace6 = this.this$0.localTrace;
            WebViewGuestRuntime.Factory factory = this.this$0;
            final Function1<RuntimeMessage, Unit> function1 = this.$onGuestEvent;
            RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("create/withMainImmediate");
            try {
                factory.checkFeatures();
                WebView webView = new WebView(factory.context);
                try {
                    HandlerThread handlerThread = new HandlerThread("MicrogramPortReceiver", -2);
                    handlerThread.start();
                    try {
                        Handler handlerCreateAsync = HandlerCompat.createAsync(handlerThread.getLooper());
                        Intrinsics.checkNotNullExpressionValue(handlerCreateAsync, "createAsync(...)");
                        Looper looperMyLooper = Looper.myLooper();
                        Intrinsics.checkNotNull(looperMyLooper);
                        Handler handlerCreateAsync2 = HandlerCompat.createAsync(looperMyLooper);
                        Intrinsics.checkNotNullExpressionValue(handlerCreateAsync2, "createAsync(...)");
                        final WebViewGuestRuntime webViewGuestRuntime = new WebViewGuestRuntime(webView, handlerCreateAsync, handlerCreateAsync2, factory.instanceTrace, null);
                        if (Build.VERSION.SDK_INT >= 26) {
                            webView.setRendererPriorityPolicy(2, false);
                        }
                        WebSettings settings = webView.getSettings();
                        if (WebViewFeature.isFeatureSupported("SAFE_BROWSING_ENABLE")) {
                            WebSettingsCompat.setSafeBrowsingEnabled(settings, false);
                        }
                        settings.setCacheMode(2);
                        settings.setJavaScriptEnabled(true);
                        webView.setWebChromeClient(new MicrogramChromeClient());
                        webView.setWebViewClient(factory.client);
                        WebViewCompat.addWebMessageListener(webView, "_microgramEntryPoint", SetsKt.setOf("*"), new WebViewCompat.WebMessageListener() { // from class: microgram.android.internal.guest.webview.WebViewGuestRuntime$Factory$create$2$1$1$1$2
                            @Override // androidx.webkit.WebViewCompat.WebMessageListener
                            public final void onPostMessage(WebView webView2, WebMessageCompat message, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
                                Intrinsics.checkNotNullParameter(webView2, "<unused var>");
                                Intrinsics.checkNotNullParameter(message, "message");
                                Intrinsics.checkNotNullParameter(uri, "<unused var>");
                                Intrinsics.checkNotNullParameter(javaScriptReplyProxy, "<unused var>");
                                function1.invoke(webViewGuestRuntime.toRuntimeMessage(message));
                            }
                        });
                        webView.loadUrl(MicrogramWebViewClient.INSTANCE.getURI_APP$lib_microgram_externalRelease().toString());
                        return webViewGuestRuntime;
                    } catch (Throwable th) {
                        handlerThread.quit();
                        throw th;
                    }
                } catch (Throwable th2) {
                    webView.destroy();
                    throw th2;
                }
            } finally {
                if (rhTrace3BeginSpan != null) {
                    rhTrace3BeginSpan.end();
                }
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
