package com.robinhood.android.chart.blackwidowadvancedchart.webclients;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartChartFileCacheKillSwitch;
import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.StringPreference;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.p481io.FilesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: ViewClient.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001c\u0010\u001d\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u0010 \u001a\u0004\u0018\u00010\u00132\u0006\u0010!\u001a\u00020\u0013H\u0002J\u0006\u0010\"\u001a\u00020\tJ\u0012\u0010#\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/webclients/ViewClient;", "Landroid/webkit/WebViewClient;", "context", "Landroid/content/Context;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "onPageLoaded", "Lkotlin/Function1;", "", "", "cachedBwChartVersion", "Lcom/robinhood/prefs/StringPreference;", "webViewScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Landroid/content/Context;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lkotlin/jvm/functions/Function1;Lcom/robinhood/prefs/StringPreference;Lkotlinx/coroutines/CoroutineScope;)V", "client", "Lokhttp3/OkHttpClient;", "filesDir", "Ljava/io/File;", "fileCacheKillSwitch", "", "chartVersionCacheDir", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "onPageFinished", "url", "getCacheDirectory", "createDirectory", "directory", "deleteFileCacheIfExists", "loadOrDownloadFile", "Lokhttp3/HttpUrl;", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ViewClient extends WebViewClient {
    public static final int $stable = 8;
    private final StringPreference cachedBwChartVersion;
    private final File chartVersionCacheDir;
    private final OkHttpClient client;
    private final ExperimentsStore experimentsStore;
    private boolean fileCacheKillSwitch;
    private final File filesDir;
    private final Function1<String, Unit> onPageLoaded;
    private final CoroutineScope webViewScope;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewClient(Context context, ExperimentsStore experimentsStore, Function1<? super String, Unit> onPageLoaded, StringPreference cachedBwChartVersion, CoroutineScope webViewScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(onPageLoaded, "onPageLoaded");
        Intrinsics.checkNotNullParameter(cachedBwChartVersion, "cachedBwChartVersion");
        Intrinsics.checkNotNullParameter(webViewScope, "webViewScope");
        this.experimentsStore = experimentsStore;
        this.onPageLoaded = onPageLoaded;
        this.cachedBwChartVersion = cachedBwChartVersion;
        this.webViewScope = webViewScope;
        this.client = new OkHttpClient.Builder().readTimeout(20L, TimeUnit.SECONDS).build();
        File filesDir = context.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        this.filesDir = filesDir;
        BuildersKt__Builders_commonKt.launch$default(webViewScope, null, null, new C109241(null), 3, null);
        this.chartVersionCacheDir = getCacheDirectory();
    }

    /* compiled from: ViewClient.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.webclients.ViewClient$1", m3645f = "ViewClient.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.webclients.ViewClient$1 */
    static final class C109241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C109241(Continuation<? super C109241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ViewClient.this.new C109241(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C109241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(ViewClient.this.experimentsStore, new Experiment[]{BlackWidowAdvancedChartChartFileCacheKillSwitch.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ViewClient.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: ViewClient.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.webclients.ViewClient$1$1", m3645f = "ViewClient.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.webclients.ViewClient$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ ViewClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ViewClient viewClient, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = viewClient;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.fileCacheKillSwitch = this.Z$0;
                return Unit.INSTANCE;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Uri url;
        if (!this.fileCacheKillSwitch) {
            String path = (request == null || (url = request.getUrl()) == null) ? null : url.getPath();
            if (path != null && CollectionsKt.listOf((Object[]) new String[]{"js", "css", "woff2", "html"}).contains(StringsKt.substringAfterLast$default(path, ".", (String) null, 2, (Object) null))) {
                Uri url2 = request.getUrl();
                Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
                File fileLoadOrDownloadFile = loadOrDownloadFile(HttpUrl2.toHttpUrl(url2));
                String extension = fileLoadOrDownloadFile != null ? FilesKt.getExtension(fileLoadOrDownloadFile) : null;
                if (extension != null) {
                    int iHashCode = extension.hashCode();
                    if (iHashCode != 3401) {
                        if (iHashCode != 98819) {
                            if (iHashCode != 3213227) {
                                if (iHashCode == 113307034 && extension.equals("woff2")) {
                                    return new WebResourceResponse("font/woff2", "UTF-8", new FileInputStream(fileLoadOrDownloadFile));
                                }
                            } else if (extension.equals("html")) {
                                return new WebResourceResponse("text/html", "UTF-8", new FileInputStream(fileLoadOrDownloadFile));
                            }
                        } else if (extension.equals("css")) {
                            return new WebResourceResponse("text/css", "UTF-8", new FileInputStream(fileLoadOrDownloadFile));
                        }
                    } else if (extension.equals("js")) {
                        return new WebResourceResponse("text/javascript", "UTF-8", new FileInputStream(fileLoadOrDownloadFile));
                    }
                }
                return super.shouldInterceptRequest(view, request);
            }
        }
        return super.shouldInterceptRequest(view, request);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        if (view == null || url == null) {
            return;
        }
        view.loadUrl(BwWebViewComponent.RUNTIME_BRIDGE_SCRIPT);
        this.onPageLoaded.invoke(url);
    }

    private final File getCacheDirectory() {
        if (this.fileCacheKillSwitch) {
            return null;
        }
        File file = new File(this.filesDir, "MAC-" + this.cachedBwChartVersion.get());
        return !file.exists() ? createDirectory(file) : file;
    }

    private final File createDirectory(File directory) {
        deleteFileCacheIfExists();
        if (directory.mkdir()) {
            return directory;
        }
        return null;
    }

    public final void deleteFileCacheIfExists() {
        File[] fileArrListFiles = this.filesDir.listFiles(new FilenameFilter() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.webclients.ViewClient.deleteFileCacheIfExists.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                Intrinsics.checkNotNull(str);
                return StringsKt.startsWith$default(str, "MAC-", false, 2, (Object) null) && file.isDirectory();
            }
        });
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                Intrinsics.checkNotNull(file);
                FilesKt.deleteRecursively(file);
            }
        }
    }

    private final File loadOrDownloadFile(HttpUrl url) {
        if (this.chartVersionCacheDir != null) {
            File file = new File(this.chartVersionCacheDir, (String) CollectionsKt.last(StringsKt.split$default((CharSequence) url.encodedPath(), new String[]{"/"}, false, 0, 6, (Object) null)));
            if (file.exists() && file.getTotalSpace() != 0) {
                return file;
            }
            BuildersKt__Builders_commonKt.launch$default(this.webViewScope, Dispatchers.getIO(), null, new C109261(url, this, file, null), 2, null);
        }
        return null;
    }

    /* compiled from: ViewClient.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.webclients.ViewClient$loadOrDownloadFile$1", m3645f = "ViewClient.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.webclients.ViewClient$loadOrDownloadFile$1 */
    static final class C109261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ File $cachedFile;
        final /* synthetic */ HttpUrl $url;
        int label;
        final /* synthetic */ ViewClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C109261(HttpUrl httpUrl, ViewClient viewClient, File file, Continuation<? super C109261> continuation) {
            super(2, continuation);
            this.$url = httpUrl;
            this.this$0 = viewClient;
            this.$cachedFile = file;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C109261(this.$url, this.this$0, this.$cachedFile, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C109261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ResponseBody body;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    Response responseExecute = this.this$0.client.newCall(new Request.Builder().url(this.$url).build()).execute();
                    File file = this.$cachedFile;
                    try {
                        if (responseExecute.isSuccessful() && (body = responseExecute.getBody()) != null) {
                            file.createNewFile();
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            fileOutputStream.write(body.bytes());
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        }
                        Unit unit = Unit.INSTANCE;
                        Closeable.closeFinally(responseExecute, null);
                    } finally {
                    }
                } catch (IOException unused) {
                    if (this.$cachedFile.exists()) {
                        this.$cachedFile.delete();
                    }
                } catch (Exception e) {
                    CrashReporter.INSTANCE.reportNonFatal(new IllegalStateException("[MAC] Error saving/loading file from cache"), false, new EventMetadata(SentryTeam.EQUITIES, null, MapsKt.mapOf(Tuples4.m3642to("errorMessage", e.getMessage()), Tuples4.m3642to("fileUrlPath", this.$url.encodedPath())), 2, null));
                    if (this.$cachedFile.exists()) {
                        this.$cachedFile.delete();
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
