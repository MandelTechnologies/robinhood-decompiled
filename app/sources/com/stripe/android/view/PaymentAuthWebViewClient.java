package com.stripe.android.view;

import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.stripe.android.core.Logger;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: PaymentAuthWebViewClient.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u001b\u0010 \u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R\"\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u0016\u0010/\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R(\u00102\u001a\u0004\u0018\u00010\u00072\b\u00101\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R\"\u00105\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, m3636d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewClient;", "Landroid/webkit/WebViewClient;", "Lcom/stripe/android/core/Logger;", "logger", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isPageLoaded", "", "clientSecret", "returnUrl", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "activityStarter", "", "activityFinisher", "<init>", "(Lcom/stripe/android/core/Logger;Lkotlinx/coroutines/flow/MutableStateFlow;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "hideProgressBar", "()V", "Landroid/net/Uri;", "uri", "openIntentScheme", "(Landroid/net/Uri;)V", "intent", "openIntent", "(Landroid/content/Intent;)V", "updateCompletionUrl", "isReturnUrl", "(Landroid/net/Uri;)Z", "isPredefinedReturnUrl", "error", "onAuthCompleted", "(Ljava/lang/Throwable;)V", "Landroid/webkit/WebView;", "view", "url", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "Lcom/stripe/android/core/Logger;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "userReturnUri", "Landroid/net/Uri;", "<set-?>", "completionUrlParam", "getCompletionUrlParam", "()Ljava/lang/String;", "hasLoadedBlank", "Z", "getHasLoadedBlank$payments_core_release", "()Z", "setHasLoadedBlank$payments_core_release", "(Z)V", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class PaymentAuthWebViewClient extends WebViewClient {
    private final Function1<Throwable, Unit> activityFinisher;
    private final Function1<Intent, Unit> activityStarter;
    private final String clientSecret;
    private String completionUrlParam;
    private boolean hasLoadedBlank;
    private final StateFlow2<Boolean> isPageLoaded;
    private final Logger logger;
    private final Uri userReturnUri;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Set<String> AUTHENTICATE_URLS = SetsKt.setOf("https://hooks.stripe.com/three_d_secure/authenticate");
    private static final Set<String> COMPLETION_URLS = SetsKt.setOf((Object[]) new String[]{"https://hooks.stripe.com/redirect/complete/", "https://hooks.stripe.com/3d_secure/complete/", "https://hooks.stripe.com/3d_secure_2/hosted/complete"});

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentAuthWebViewClient(Logger logger, StateFlow2<Boolean> isPageLoaded, String clientSecret, String str, Function1<? super Intent, Unit> activityStarter, Function1<? super Throwable, Unit> activityFinisher) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(isPageLoaded, "isPageLoaded");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(activityStarter, "activityStarter");
        Intrinsics.checkNotNullParameter(activityFinisher, "activityFinisher");
        this.logger = logger;
        this.isPageLoaded = isPageLoaded;
        this.clientSecret = clientSecret;
        this.activityStarter = activityStarter;
        this.activityFinisher = activityFinisher;
        this.userReturnUri = str != null ? Uri.parse(str) : null;
    }

    public final void setHasLoadedBlank$payments_core_release(boolean z) {
        this.hasLoadedBlank = z;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.logger.debug("PaymentAuthWebViewClient#onPageFinished() - " + url);
        super.onPageFinished(view, url);
        if (!this.hasLoadedBlank) {
            hideProgressBar();
        }
        if (url == null || !INSTANCE.isCompletionUrl$payments_core_release(url)) {
            return;
        }
        this.logger.debug(url + " is a completion URL");
        onAuthCompleted$default(this, null, 1, null);
    }

    private final void hideProgressBar() {
        this.logger.debug("PaymentAuthWebViewClient#hideProgressBar()");
        this.isPageLoaded.setValue(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Uri url = request.getUrl();
        this.logger.debug("PaymentAuthWebViewClient#shouldOverrideUrlLoading(): " + url);
        Intrinsics.checkNotNull(url);
        updateCompletionUrl(url);
        if (isReturnUrl(url)) {
            this.logger.debug("PaymentAuthWebViewClient#shouldOverrideUrlLoading() - handle return URL");
            onAuthCompleted$default(this, null, 1, null);
            return true;
        }
        if (StringsKt.equals("intent", url.getScheme(), true)) {
            openIntentScheme(url);
            return true;
        }
        if (!URLUtil.isNetworkUrl(url.toString())) {
            openIntent(new Intent("android.intent.action.VIEW", url));
            return true;
        }
        return super.shouldOverrideUrlLoading(view, request);
    }

    private final void openIntentScheme(Uri uri) {
        Object objM28550constructorimpl;
        this.logger.debug("PaymentAuthWebViewClient#openIntentScheme()");
        try {
            Result.Companion companion = Result.INSTANCE;
            Intent uri2 = Intent.parseUri(uri.toString(), 1);
            Intrinsics.checkNotNullExpressionValue(uri2, "parseUri(...)");
            openIntent(uri2);
            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            this.logger.error("Failed to start Intent.", thM28553exceptionOrNullimpl);
            onAuthCompleted(thM28553exceptionOrNullimpl);
        }
    }

    private final void openIntent(Intent intent) {
        Object objM28550constructorimpl;
        this.logger.debug("PaymentAuthWebViewClient#openIntent()");
        try {
            Result.Companion companion = Result.INSTANCE;
            this.activityStarter.invoke(intent);
            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            this.logger.error("Failed to start Intent.", thM28553exceptionOrNullimpl);
            if (Intrinsics.areEqual(intent.getScheme(), "alipays")) {
                return;
            }
            onAuthCompleted(thM28553exceptionOrNullimpl);
        }
    }

    private final void updateCompletionUrl(Uri uri) {
        this.logger.debug("PaymentAuthWebViewClient#updateCompletionUrl()");
        Companion companion = INSTANCE;
        String string2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String queryParameter = companion.isAuthenticateUrl(string2) ? uri.getQueryParameter("return_url") : null;
        if (queryParameter == null || StringsKt.isBlank(queryParameter)) {
            return;
        }
        this.completionUrlParam = queryParameter;
    }

    private final boolean isReturnUrl(Uri uri) {
        String queryParameter;
        this.logger.debug("PaymentAuthWebViewClient#isReturnUrl()");
        if (isPredefinedReturnUrl(uri)) {
            return true;
        }
        Uri uri2 = this.userReturnUri;
        if (uri2 != null) {
            return uri2.getScheme() != null && Intrinsics.areEqual(this.userReturnUri.getScheme(), uri.getScheme()) && this.userReturnUri.getHost() != null && Intrinsics.areEqual(this.userReturnUri.getHost(), uri.getHost());
        }
        if (uri.isOpaque()) {
            return false;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.contains("payment_intent_client_secret")) {
            queryParameter = uri.getQueryParameter("payment_intent_client_secret");
        } else {
            queryParameter = queryParameterNames.contains("setup_intent_client_secret") ? uri.getQueryParameter("setup_intent_client_secret") : null;
        }
        return Intrinsics.areEqual(this.clientSecret, queryParameter);
    }

    private final boolean isPredefinedReturnUrl(Uri uri) {
        if (Intrinsics.areEqual("stripejs://use_stripe_sdk/return_url", uri.toString())) {
            return true;
        }
        String string2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return StringsKt.startsWith$default(string2, "stripesdk://payment_return_url/", false, 2, (Object) null);
    }

    static /* synthetic */ void onAuthCompleted$default(PaymentAuthWebViewClient paymentAuthWebViewClient, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        paymentAuthWebViewClient.onAuthCompleted(th);
    }

    private final void onAuthCompleted(Throwable error) {
        this.logger.debug("PaymentAuthWebViewClient#onAuthCompleted()");
        this.activityFinisher.invoke(error);
    }

    /* compiled from: PaymentAuthWebViewClient.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u000fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewClient$Companion;", "", "()V", "AUTHENTICATE_URLS", "", "", "BLANK_PAGE", "COMPLETION_URLS", "PARAM_PAYMENT_CLIENT_SECRET", "PARAM_RETURN_URL", "PARAM_SETUP_CLIENT_SECRET", "isAuthenticateUrl", "", "url", "isCompletionUrl", "isCompletionUrl$payments_core_release", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isCompletionUrl$payments_core_release(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            Set set = PaymentAuthWebViewClient.COMPLETION_URLS;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(url, (String) it.next(), false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isAuthenticateUrl(String url) {
            Set set = PaymentAuthWebViewClient.AUTHENTICATE_URLS;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(url, (String) it.next(), false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }
    }
}
