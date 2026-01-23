package com.stripe.android.stripe3ds2.observability;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.utils.http.Headers;
import com.stripe.android.stripe3ds2.transaction.Logger;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DefaultErrorReporter.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u001b\b\u0000\u0018\u0000 82\u00020\u0001:\u000389:BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00152\u0006\u0010$\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010#J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010$\u001a\u00020 H\u0001¢\u0006\u0004\b&\u0010'J\u000f\u0010+\u001a\u00020\u0013H\u0001¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00132\u0006\u0010$\u001a\u00020 H\u0001¢\u0006\u0004\b,\u0010'J\u000f\u00100\u001a\u00020\fH\u0001¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00107¨\u0006;"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Landroid/content/Context;", "context", "Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "config", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "logger", "Lcom/stripe/android/stripe3ds2/observability/SentryConfig;", "sentryConfig", "", "environment", "localeCountry", "", "osVersion", "<init>", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/stripe3ds2/transaction/Logger;Lcom/stripe/android/stripe3ds2/observability/SentryConfig;Ljava/lang/String;Ljava/lang/String;I)V", "Lorg/json/JSONObject;", "requestBody", "", "send", "(Lorg/json/JSONObject;)V", "Ljavax/net/ssl/HttpsURLConnection;", "connection", "responseCode", "logResponse", "(Ljavax/net/ssl/HttpsURLConnection;I)V", "createPostConnection", "()Ljavax/net/ssl/HttpsURLConnection;", "openConnection", "", "exception", "onFailure", "(Ljava/lang/Throwable;)V", "t", "reportError", "createRequestBody$3ds2sdk_release", "(Ljava/lang/Throwable;)Lorg/json/JSONObject;", "createRequestBody", "createRequestContexts$3ds2sdk_release", "()Lorg/json/JSONObject;", "createRequestContexts", "createRequestStacktrace$3ds2sdk_release", "createRequestStacktrace", "createSentryAuthHeader$3ds2sdk_release", "()Ljava/lang/String;", "createSentryAuthHeader", "Landroid/content/Context;", "Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "Lkotlin/coroutines/CoroutineContext;", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "Lcom/stripe/android/stripe3ds2/observability/SentryConfig;", "Ljava/lang/String;", "I", "Companion", "Config", "EmptyConfig", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class DefaultErrorReporter implements ErrorReporter {
    private final Config config;
    private final Context context;
    private final String environment;
    private final String localeCountry;
    private final Logger logger;
    private final int osVersion;
    private final SentryConfig sentryConfig;
    private final CoroutineContext workContext;
    private static final Companion Companion = new Companion(null);
    private static final String CHARSET = StandardCharsets.UTF_8.name();

    /* compiled from: DefaultErrorReporter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "", "customTags", "", "", "getCustomTags", "()Ljava/util/Map;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface Config {
        Map<String, String> getCustomTags();
    }

    private final void logResponse(HttpsURLConnection connection, int responseCode) {
    }

    public DefaultErrorReporter(Context context, Config config, CoroutineContext workContext, Logger logger, SentryConfig sentryConfig, String environment, String localeCountry, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(sentryConfig, "sentryConfig");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(localeCountry, "localeCountry");
        this.context = context;
        this.config = config;
        this.workContext = workContext;
        this.logger = logger;
        this.sentryConfig = sentryConfig;
        this.environment = environment;
        this.localeCountry = localeCountry;
        this.osVersion = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DefaultErrorReporter(Context context, Config config, CoroutineContext coroutineContext, Logger logger, SentryConfig sentryConfig, String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String country;
        Config config2 = (i2 & 2) != 0 ? EmptyConfig.INSTANCE : config;
        CoroutineContext io2 = (i2 & 4) != 0 ? Dispatchers.getIO() : coroutineContext;
        Logger logger2 = (i2 & 8) != 0 ? Logger.Noop.INSTANCE : logger;
        SentryConfig sentryConfig2 = (i2 & 16) != 0 ? DefaultSentryConfig.INSTANCE : sentryConfig;
        String str3 = (i2 & 32) != 0 ? "release" : str;
        if ((i2 & 64) != 0) {
            country = Locale.getDefault().getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        } else {
            country = str2;
        }
        this(context, config2, io2, logger2, sentryConfig2, str3, country, (i2 & 128) != 0 ? Build.VERSION.SDK_INT : i);
    }

    /* compiled from: DefaultErrorReporter.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.stripe3ds2.observability.DefaultErrorReporter$reportError$1", m3645f = "DefaultErrorReporter.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.stripe.android.stripe3ds2.observability.DefaultErrorReporter$reportError$1 */
    static final class C426191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: $t */
        final /* synthetic */ Throwable f6422$t;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C426191(Throwable th, Continuation<? super C426191> continuation) {
            super(2, continuation);
            this.f6422$t = th;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C426191 c426191 = DefaultErrorReporter.this.new C426191(this.f6422$t, continuation);
            c426191.L$0 = obj;
            return c426191;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C426191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DefaultErrorReporter defaultErrorReporter = DefaultErrorReporter.this;
            Throwable th = this.f6422$t;
            try {
                Result.Companion companion = Result.INSTANCE;
                defaultErrorReporter.send(defaultErrorReporter.createRequestBody$3ds2sdk_release(th));
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th2));
            }
            DefaultErrorReporter defaultErrorReporter2 = DefaultErrorReporter.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                defaultErrorReporter2.onFailure(thM28553exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.stripe.android.stripe3ds2.observability.ErrorReporter
    public void reportError(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope2.CoroutineScope(this.workContext), null, null, new C426191(t, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void send(JSONObject requestBody) throws IOException {
        HttpsURLConnection httpsURLConnectionCreatePostConnection = createPostConnection();
        OutputStream outputStream = httpsURLConnectionCreatePostConnection.getOutputStream();
        try {
            Intrinsics.checkNotNull(outputStream);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, UTF_8);
            try {
                outputStreamWriter.write(requestBody.toString());
                outputStreamWriter.flush();
                Unit unit = Unit.INSTANCE;
                Closeable.closeFinally(outputStreamWriter, null);
                Closeable.closeFinally(outputStream, null);
                httpsURLConnectionCreatePostConnection.connect();
                logResponse(httpsURLConnectionCreatePostConnection, httpsURLConnectionCreatePostConnection.getResponseCode());
                httpsURLConnectionCreatePostConnection.disconnect();
            } finally {
            }
        } finally {
        }
    }

    private final HttpsURLConnection createPostConnection() throws IOException {
        HttpsURLConnection httpsURLConnectionOpenConnection = openConnection();
        httpsURLConnectionOpenConnection.setRequestMethod("POST");
        httpsURLConnectionOpenConnection.setDoOutput(true);
        for (Map.Entry entry : MapsKt.mapOf(Tuples4.m3642to("Content-Type", "application/json; charset=utf-8"), Tuples4.m3642to(Headers.USER_AGENT, "Android3ds2Sdk 6.1.8"), Tuples4.m3642to("X-Sentry-Auth", createSentryAuthHeader$3ds2sdk_release())).entrySet()) {
            httpsURLConnectionOpenConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        return httpsURLConnectionOpenConnection;
    }

    private final HttpsURLConnection openConnection() throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL("https://errors.stripe.com/api/" + this.sentryConfig.getProjectId() + "/store/").openConnection();
        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        return (HttpsURLConnection) uRLConnectionOpenConnection;
    }

    public final /* synthetic */ JSONObject createRequestBody$3ds2sdk_release(Throwable t) throws JSONException {
        Intrinsics.checkNotNullParameter(t, "t");
        JSONObject jSONObjectPut = new JSONObject().put("release", "com.stripe.android.stripe3ds2@6.1.8+25");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectPut2 = new JSONObject().put("type", t.getClass().getCanonicalName());
        String message = t.getMessage();
        if (message == null) {
            message = "";
        }
        JSONObject jSONObjectPut3 = jSONObjectPut.put("exception", jSONObject.put("values", jSONArray.put(jSONObjectPut2.put("value", message).put("stacktrace", createRequestStacktrace$3ds2sdk_release(t)))));
        JSONObject jSONObjectPut4 = new JSONObject().put("locale", this.localeCountry).put("environment", this.environment).put("android_os_version", this.osVersion);
        for (Map.Entry<String, String> entry : this.config.getCustomTags().entrySet()) {
            jSONObjectPut4.put(entry.getKey(), entry.getValue());
        }
        Unit unit = Unit.INSTANCE;
        JSONObject jSONObjectPut5 = jSONObjectPut3.put("tags", jSONObjectPut4).put("contexts", createRequestContexts$3ds2sdk_release());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut5, "put(...)");
        return jSONObjectPut5;
    }

    public final /* synthetic */ JSONObject createRequestContexts$3ds2sdk_release() throws JSONException {
        Object objM28550constructorimpl;
        ApplicationInfo applicationInfo;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = null;
        }
        PackageInfo packageInfo = (PackageInfo) objM28550constructorimpl;
        CharSequence charSequenceLoadLabel = (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? null : applicationInfo.loadLabel(this.context.getPackageManager());
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectPut = new JSONObject().put("app_identifier", this.context.getPackageName()).put("app_name", charSequenceLoadLabel);
        String str = packageInfo != null ? packageInfo.versionName : null;
        if (str == null) {
            str = "";
        }
        JSONObject jSONObjectPut2 = jSONObject.put("app", jSONObjectPut.put("app_version", str));
        JSONObject jSONObjectPut3 = new JSONObject().put("name", "Android").put("version", Build.VERSION.RELEASE);
        String str2 = Build.TYPE;
        JSONObject jSONObjectPut4 = jSONObjectPut2.put("os", jSONObjectPut3.put("type", str2).put("build", Build.DISPLAY));
        JSONObject jSONObjectPut5 = new JSONObject().put("model_id", Build.ID).put("model", Build.MODEL).put("manufacturer", Build.MANUFACTURER).put("type", str2);
        JSONArray jSONArray = new JSONArray();
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        for (String str3 : SUPPORTED_ABIS) {
            jSONArray.put(str3);
        }
        Unit unit = Unit.INSTANCE;
        JSONObject jSONObjectPut6 = jSONObjectPut4.put("device", jSONObjectPut5.put("archs", jSONArray));
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut6, "put(...)");
        return jSONObjectPut6;
    }

    public final /* synthetic */ JSONObject createRequestStacktrace$3ds2sdk_release(Throwable t) throws JSONException {
        Intrinsics.checkNotNullParameter(t, "t");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTrace = t.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : ArraysKt.reversed(stackTrace)) {
            jSONArray.put(new JSONObject().put("lineno", stackTraceElement.getLineNumber()).put("filename", stackTraceElement.getClassName()).put("function", stackTraceElement.getMethodName()));
        }
        Unit unit = Unit.INSTANCE;
        JSONObject jSONObjectPut = jSONObject.put("frames", jSONArray);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    public final /* synthetic */ String createSentryAuthHeader$3ds2sdk_release() {
        return CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{"Sentry", CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("sentry_key", this.sentryConfig.getKey()), Tuples4.m3642to("sentry_version", this.sentryConfig.getVersion()), Tuples4.m3642to("sentry_timestamp", this.sentryConfig.getTimestamp()), Tuples4.m3642to("sentry_client", "Android3ds2Sdk 6.1.8"), Tuples4.m3642to("sentry_secret", this.sentryConfig.getSecret())}), ", ", null, null, 0, null, new Function1<Tuples2<? extends String, ? extends String>, CharSequence>() { // from class: com.stripe.android.stripe3ds2.observability.DefaultErrorReporter$createSentryAuthHeader$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(Tuples2<String, String> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<name for destructuring parameter 0>");
                return tuples2.component1() + "=" + tuples2.component2();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Tuples2<? extends String, ? extends String> tuples2) {
                return invoke2((Tuples2<String, String>) tuples2);
            }
        }, 30, null)}), PlaceholderUtils.XXShortPlaceholderText, null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFailure(Throwable exception) {
        this.logger.error("Failed to send error report.", exception);
    }

    /* compiled from: DefaultErrorReporter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$EmptyConfig;", "Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "()V", "customTags", "", "", "getCustomTags", "()Ljava/util/Map;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class EmptyConfig implements Config {
        public static final EmptyConfig INSTANCE = new EmptyConfig();
        private static final Map<String, String> customTags = MapsKt.emptyMap();

        private EmptyConfig() {
        }

        @Override // com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.Config
        public Map<String, String> getCustomTags() {
            return customTags;
        }
    }

    /* compiled from: DefaultErrorReporter.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Companion;", "", "()V", "CHARSET", "", "kotlin.jvm.PlatformType", "CONTENT_TYPE", "HEADER_CONTENT_TYPE", "HEADER_SENTRY_AUTH", "HEADER_USER_AGENT", "HOST", "HTTP_METHOD", "USER_AGENT", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
