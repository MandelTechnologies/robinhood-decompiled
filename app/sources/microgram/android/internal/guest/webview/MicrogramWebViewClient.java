package microgram.android.internal.guest.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebViewClientCompat;
import com.adjust.sdk.Constants;
import com.robinhood.android.asset.Assets;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.tracing.RhTrace3;
import com.robinhood.android.tracing.RhTrace6;
import com.robinhood.models.api.ErrorResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import microgram.RuntimeInfo;
import microgram.android.Monitoring3;
import microgram.android.internal.guest.Resource;
import microgram.android.internal.guest.ResourceLoader;
import microgram.android.internal.guest.ResourceLoader3;
import microgram.android.internal.guest.ResourceLoader5;
import microgram.android.internal.guest.p485js.MicrogramJs;
import microgram.manifest.AppInfo;
import okhttp3.MediaType;
import okio.FileSystem;
import okio.Path;

/* compiled from: MicrogramWebViewClient.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 12\u00020\u0001:\u000201B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0003J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0002J \u0010(\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m3636d2 = {"Lmicrogram/android/internal/guest/webview/MicrogramWebViewClient;", "Landroidx/webkit/WebViewClientCompat;", "microgramJs", "Lmicrogram/android/internal/guest/js/MicrogramJs;", "appResourceLoader", "Lmicrogram/android/internal/guest/ResourceLoader;", "monitor", "Lmicrogram/android/MonitorListener;", "runtimeInfo", "Lmicrogram/RuntimeInfo;", "instanceTrace", "Lcom/robinhood/android/tracing/TrackTrace;", "assetFileSystem", "Lokio/FileSystem;", "<init>", "(Lmicrogram/android/internal/guest/js/MicrogramJs;Lmicrogram/android/internal/guest/ResourceLoader;Lmicrogram/android/MonitorListener;Lmicrogram/RuntimeInfo;Lcom/robinhood/android/tracing/TrackTrace;Lokio/FileSystem;)V", "runtimeResourceLoader", "Lmicrogram/android/internal/guest/FileSystemResourceLoader;", "appInfo", "Lmicrogram/manifest/AppInfo;", "getAppInfo", "()Lmicrogram/manifest/AppInfo;", "appInfo$delegate", "Lkotlin/Lazy;", "trace", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "interceptHttpsRequest", "interceptMicrogramRequest", "cleanedUrl", "Landroid/net/Uri;", "fetchRuntimeResource", "path", "", "fetchInit", "fetchAppResource", "onReceivedError", "", "error", "Landroidx/webkit/WebResourceErrorCompat;", "onRenderProcessGone", "", ErrorResponse.DETAIL, "Landroid/webkit/RenderProcessGoneDetail;", "Authority", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"RequiresFeature"})
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class MicrogramWebViewClient extends WebViewClientCompat {

    /* renamed from: appInfo$delegate, reason: from kotlin metadata */
    private final Lazy appInfo;
    private final ResourceLoader appResourceLoader;
    private final MicrogramJs microgramJs;
    private final Monitoring3 monitor;
    private final RuntimeInfo runtimeInfo;
    private final ResourceLoader3 runtimeResourceLoader;
    private final RhTrace6 trace;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Uri URI_APP = new Uri.Builder().scheme("microgram").authority(Authority.APP.getValue()).path("/").build();
    private static final String INJECTED_HTML_SENTRY = "<script\n  src=\"microgram://runtime/sentry/7.61.1/bundle.min.js\"\n  crossorigin=\"anonymous\"\n></script>";
    private static final String INJECTED_HTML_INIT = "<script\n  src=\"microgram://init/\"\n  crossorigin=\"anonymous\"\n></script>";

    /* compiled from: MicrogramWebViewClient.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Authority.values().length];
            try {
                iArr[Authority.RUNTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Authority.INIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Authority.APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MicrogramWebViewClient(MicrogramJs microgramJs, ResourceLoader appResourceLoader, Monitoring3 monitor, RuntimeInfo runtimeInfo, RhTrace6 instanceTrace, @Assets FileSystem assetFileSystem) {
        Intrinsics.checkNotNullParameter(microgramJs, "microgramJs");
        Intrinsics.checkNotNullParameter(appResourceLoader, "appResourceLoader");
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        Intrinsics.checkNotNullParameter(runtimeInfo, "runtimeInfo");
        Intrinsics.checkNotNullParameter(instanceTrace, "instanceTrace");
        Intrinsics.checkNotNullParameter(assetFileSystem, "assetFileSystem");
        this.microgramJs = microgramJs;
        this.appResourceLoader = appResourceLoader;
        this.monitor = monitor;
        this.runtimeInfo = runtimeInfo;
        CompletableFuture completableFutureCompletedFuture = CompletableFuture.completedFuture(Result.m28549boximpl(Result.m28550constructorimpl(assetFileSystem)));
        Intrinsics.checkNotNullExpressionValue(completableFutureCompletedFuture, "completedFuture(...)");
        this.runtimeResourceLoader = new ResourceLoader3(completableFutureCompletedFuture, Path.Companion.get$default(Path.INSTANCE, "/microgram/runtime", false, 1, (Object) null));
        this.appInfo = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.android.internal.guest.webview.MicrogramWebViewClient$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MicrogramWebViewClient.appInfo_delegate$lambda$0(this.f$0);
            }
        });
        this.trace = instanceTrace.withMethodNamePrefix("MicrogramWebViewClient.");
    }

    private final AppInfo getAppInfo() {
        return (AppInfo) this.appInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppInfo appInfo_delegate$lambda$0(MicrogramWebViewClient microgramWebViewClient) {
        return ResourceLoader5.fetchAppInfo(microgramWebViewClient.appResourceLoader);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        RhTrace3 rhTrace3BeginSpan;
        WebResourceResponse webResourceResponseWebResourceResponse$default;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        RhTrace6 rhTrace6 = this.trace;
        if (rhTrace6.isEnabled()) {
            rhTrace3BeginSpan = rhTrace6.beginSpan("shouldInterceptRequest: " + request.getUrl());
        } else {
            rhTrace3BeginSpan = null;
        }
        try {
            try {
                String scheme = request.getUrl().getScheme();
                if (Intrinsics.areEqual(scheme, Constants.SCHEME)) {
                    webResourceResponseWebResourceResponse$default = interceptHttpsRequest(request);
                } else if (Intrinsics.areEqual(scheme, "microgram")) {
                    if (!Intrinsics.areEqual(request.getMethod(), "GET")) {
                        throw new IllegalStateException(("Requests to `microgram://` must be `GET`: `" + request.getMethod() + "`").toString());
                    }
                    Uri uriBuild = request.getUrl().buildUpon().clearQuery().fragment(null).build();
                    Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
                    webResourceResponseWebResourceResponse$default = interceptMicrogramRequest(uriBuild);
                } else {
                    throw new IllegalStateException(("Unexpected URL scheme `" + scheme + "`: " + request.getUrl()).toString());
                }
            } catch (IOException e) {
                this.monitor.onException(e);
                byte[] bytes = ExceptionsKt.stackTraceToString(e).getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                webResourceResponseWebResourceResponse$default = WebResourceResponse.WebResourceResponse$default(500, "IOException", null, null, new ByteArrayInputStream(bytes), 12, null);
            }
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
            return webResourceResponseWebResourceResponse$default;
        } finally {
        }
    }

    private final WebResourceResponse interceptHttpsRequest(WebResourceRequest request) {
        if (getAppInfo().getExtraSecure()) {
            throw new IllegalStateException(("HTTPS requests are not allowed in 'extra secure' mode: " + getAppInfo().getIdentifier() + PlaceholderUtils.XXShortPlaceholderText + getAppInfo().getVersion()).toString());
        }
        String authority = request.getUrl().getAuthority();
        if (authority != null && StringsKt.endsWith$default(authority, ".sentry.io", false, 2, (Object) null)) {
            return null;
        }
        throw new IllegalStateException(("HTTPS requests may only be made to Sentry: " + request.getUrl() + PlaceholderUtils.XXShortPlaceholderText + getAppInfo().getIdentifier() + PlaceholderUtils.XXShortPlaceholderText + getAppInfo().getVersion()).toString());
    }

    private final WebResourceResponse interceptMicrogramRequest(Uri cleanedUrl) {
        String path = cleanedUrl.getPath();
        if (path == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[Authority.INSTANCE.m3742of(cleanedUrl.getAuthority()).ordinal()];
        if (i == 1) {
            return fetchRuntimeResource(path);
        }
        if (i == 2) {
            return fetchInit(path);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return fetchAppResource(cleanedUrl);
    }

    private final WebResourceResponse fetchRuntimeResource(String path) {
        Resource resourceFetch = this.runtimeResourceLoader.fetch(path);
        return WebResourceResponse.WebResourceResponse$default(200, "OK", null, resourceFetch.getMediaType(), resourceFetch.getSource().inputStream(), 4, null);
    }

    private final WebResourceResponse fetchInit(String path) {
        if (!Intrinsics.areEqual(path, "/")) {
            throw new IllegalStateException(("Only expected path for " + Authority.INIT + " authority is `/`: `" + path + "`").toString());
        }
        MediaType mediaType = MediaType.INSTANCE.get("text/javascript;charset=utf-8");
        byte[] bytes = this.microgramJs.generateInjectedScript(this.runtimeInfo, ResourceLoader5.fetchAppInfo(this.appResourceLoader)).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return WebResourceResponse.WebResourceResponse$default(200, "OK", null, mediaType, new ByteArrayInputStream(bytes), 4, null);
    }

    private final WebResourceResponse fetchAppResource(Uri cleanedUrl) throws IOException {
        RhTrace6 rhTrace6WithMethodNamePrefix;
        String str;
        String path = cleanedUrl.getPath();
        if (path == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Resource resourceFetch = this.appResourceLoader.fetch(path);
        InputStream inputStreamReportingAvailableBytes = LyingInputStream2.reportingAvailableBytes(resourceFetch.getSource().inputStream(), resourceFetch.getContentLength());
        if (Intrinsics.areEqual(cleanedUrl, URI_APP)) {
            if (ResourceLoader5.fetchAppInfo(this.appResourceLoader).getExtraSecure()) {
                str = INJECTED_HTML_INIT;
            } else {
                str = INJECTED_HTML_SENTRY + INJECTED_HTML_INIT;
            }
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            inputStreamReportingAvailableBytes = new SequenceInputStream(new ByteArrayInputStream(bytes), inputStreamReportingAvailableBytes);
        }
        MediaType mediaType = resourceFetch.getMediaType();
        RhTrace6 rhTrace6 = this.trace;
        if (rhTrace6.isEnabled()) {
            rhTrace6WithMethodNamePrefix = rhTrace6.withMethodNamePrefix("InputStream(" + path + ") ");
        } else {
            rhTrace6WithMethodNamePrefix = RhTrace6.Noop.INSTANCE;
        }
        return WebResourceResponse.WebResourceResponse$default(200, "OK", null, mediaType, TracingInputStream2.tracing(inputStreamReportingAvailableBytes, rhTrace6WithMethodNamePrefix), 4, null);
    }

    @Override // androidx.webkit.WebViewClientCompat
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceErrorCompat error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        RhTrace6 rhTrace6 = this.trace;
        if (rhTrace6.isEnabled()) {
            rhTrace6.instant("onReceivedError: " + ((Object) error.getDescription()));
        }
        super.onReceivedError(view, request, error);
        if (Intrinsics.areEqual(request.getUrl().getScheme(), "microgram")) {
            Uri url = request.getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
            this.monitor.onException(new WebViewExceptions2(url, error.getErrorCode(), error.getDescription().toString()));
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        RhTrace6 rhTrace6 = this.trace;
        if (rhTrace6.isEnabled()) {
            rhTrace6.instant("onRenderProcessGone: crash = " + detail.didCrash() + ", priority = " + detail.rendererPriorityAtExit());
        }
        this.monitor.onException(new WebViewExceptions(detail.didCrash(), detail.rendererPriorityAtExit()));
        return true;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MicrogramWebViewClient.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lmicrogram/android/internal/guest/webview/MicrogramWebViewClient$Authority;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "RUNTIME", "INIT", "APP", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class Authority {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Authority[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;
        public static final Authority RUNTIME = new Authority("RUNTIME", 0, "runtime");
        public static final Authority INIT = new Authority("INIT", 1, "init");
        public static final Authority APP = new Authority("APP", 2, "app");

        private static final /* synthetic */ Authority[] $values() {
            return new Authority[]{RUNTIME, INIT, APP};
        }

        public static EnumEntries<Authority> getEntries() {
            return $ENTRIES;
        }

        private Authority(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            Authority[] authorityArr$values = $values();
            $VALUES = authorityArr$values;
            $ENTRIES = EnumEntries2.enumEntries(authorityArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: MicrogramWebViewClient.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lmicrogram/android/internal/guest/webview/MicrogramWebViewClient$Authority$Companion;", "", "<init>", "()V", "of", "Lmicrogram/android/internal/guest/webview/MicrogramWebViewClient$Authority;", "value", "", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* renamed from: of */
            public final Authority m3742of(String value) {
                Authority next;
                Iterator<Authority> it = Authority.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.getValue(), value)) {
                        break;
                    }
                }
                Authority authority = next;
                if (authority != null) {
                    return authority;
                }
                throw new IllegalStateException(("Unexpected authority: " + value).toString());
            }
        }

        public static Authority valueOf(String str) {
            return (Authority) Enum.valueOf(Authority.class, str);
        }

        public static Authority[] values() {
            return (Authority[]) $VALUES.clone();
        }
    }

    /* compiled from: MicrogramWebViewClient.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lmicrogram/android/internal/guest/webview/MicrogramWebViewClient$Companion;", "", "<init>", "()V", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "URI_APP", "Landroid/net/Uri;", "getURI_APP$lib_microgram_externalRelease", "()Landroid/net/Uri;", "", "SCHEME", "Ljava/lang/String;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Uri getURI_APP$lib_microgram_externalRelease() {
            return MicrogramWebViewClient.URI_APP;
        }
    }
}
