package com.robinhood.api.utils;

import com.robinhood.api.MalformedResponseException;
import com.robinhood.api.utils.RhCallAdapterFactory;
import com.robinhood.reflect.KotlinReflect;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.singular.sdk.internal.SLRemoteConfiguration;
import com.squareup.moshi.JsonDataException;
import java.lang.Thread;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.Request;
import retrofit2.Invocation;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/* compiled from: ThrowableTransformers.kt */
@kotlin.Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB\t\b\u0017¢\u0006\u0004\b\u0004\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/api/utils/MalformedResponseThrowableTransformer;", "Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;", "reporter", "Lcom/robinhood/api/utils/MalformedResponseThrowableTransformer$Reporter;", "<init>", "(Lcom/robinhood/api/utils/MalformedResponseThrowableTransformer$Reporter;)V", SLRemoteConfiguration.Constants.DEBUG_JSON_KEY, "", "(Z)V", "()V", "transform", "", "request", "Lokhttp3/Request;", "throwable", "Reporter", "DefaultReporter", "DebugReporter", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.api.utils.MalformedResponseThrowableTransformer, reason: use source file name */
/* loaded from: classes20.dex */
public final class ThrowableTransformers implements RhCallAdapterFactory.ThrowableTransformer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Regex NUMBER_REGEX = new Regex("\\d+");
    private final Reporter reporter;

    /* compiled from: ThrowableTransformers.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/api/utils/MalformedResponseThrowableTransformer$Reporter;", "", "report", "", "exception", "Lcom/robinhood/api/MalformedResponseException;", "metadata", "Lcom/robinhood/utils/logging/EventMetadata;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.api.utils.MalformedResponseThrowableTransformer$Reporter */
    public interface Reporter {
        void report(MalformedResponseException exception, EventMetadata metadata);
    }

    public ThrowableTransformers(Reporter reporter) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.reporter = reporter;
    }

    public ThrowableTransformers(boolean z) {
        this(z ? DebugReporter.INSTANCE : DefaultReporter.INSTANCE);
    }

    public ThrowableTransformers() {
        this(false);
    }

    @Override // com.robinhood.api.utils.RhCallAdapterFactory.ThrowableTransformer
    public Throwable transform(Request request, Throwable throwable) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!(throwable instanceof JsonDataException)) {
            return throwable;
        }
        Invocation invocation = (Invocation) request.tag(Invocation.class);
        Regex regex = NUMBER_REGEX;
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        MalformedResponseException malformedResponseException = new MalformedResponseException(regex.replace(message, "#"), throwable);
        SentryTeam sentryTeam = SentryTeam.MOBILE_PLATFORM;
        Map mapGenerateTags = invocation != null ? INSTANCE.generateTags(invocation) : null;
        if (mapGenerateTags == null) {
            mapGenerateTags = MapsKt.emptyMap();
        }
        this.reporter.report(malformedResponseException, new EventMetadata(sentryTeam, MapsKt.plus(mapGenerateTags, MapsKt.mapOf(Tuples4.m3642to("api.host", request.getUrl().getHost()))), null, 4, null));
        return malformedResponseException;
    }

    /* compiled from: ThrowableTransformers.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/api/utils/MalformedResponseThrowableTransformer$DefaultReporter;", "Lcom/robinhood/api/utils/MalformedResponseThrowableTransformer$Reporter;", "<init>", "()V", "report", "", "exception", "Lcom/robinhood/api/MalformedResponseException;", "metadata", "Lcom/robinhood/utils/logging/EventMetadata;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.api.utils.MalformedResponseThrowableTransformer$DefaultReporter */
    public static final class DefaultReporter implements Reporter {
        public static final DefaultReporter INSTANCE = new DefaultReporter();

        private DefaultReporter() {
        }

        @Override // com.robinhood.api.utils.ThrowableTransformers.Reporter
        public void report(MalformedResponseException exception, EventMetadata metadata) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            CrashReporter.INSTANCE.reportNonFatal(exception, false, metadata);
        }
    }

    /* compiled from: ThrowableTransformers.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/api/utils/MalformedResponseThrowableTransformer$DebugReporter;", "Lcom/robinhood/api/utils/MalformedResponseThrowableTransformer$Reporter;", "<init>", "()V", "report", "", "exception", "Lcom/robinhood/api/MalformedResponseException;", "metadata", "Lcom/robinhood/utils/logging/EventMetadata;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.api.utils.MalformedResponseThrowableTransformer$DebugReporter */
    /* loaded from: classes16.dex */
    public static final class DebugReporter implements Reporter {
        public static final DebugReporter INSTANCE = new DebugReporter();

        private DebugReporter() {
        }

        @Override // com.robinhood.api.utils.ThrowableTransformers.Reporter
        public void report(MalformedResponseException exception, EventMetadata metadata) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Thread threadCurrentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
            Intrinsics.checkNotNull(uncaughtExceptionHandler);
            uncaughtExceptionHandler.uncaughtException(threadCurrentThread, exception);
        }
    }

    /* compiled from: ThrowableTransformers.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0002¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/api/utils/MalformedResponseThrowableTransformer$Companion;", "", "<init>", "()V", "NUMBER_REGEX", "Lkotlin/text/Regex;", "generateTags", "", "", "", "", "([Ljava/lang/annotation/Annotation;)Ljava/util/Map;", "Lretrofit2/Invocation;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.api.utils.MalformedResponseThrowableTransformer$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final Map<String, String> generateTags(Annotation[] annotationArr) {
            Tuples2 tuples2M3642to;
            int length = annotationArr.length;
            int i = 0;
            while (true) {
                tuples2M3642to = null;
                if (i >= length) {
                    break;
                }
                Annotation annotation = annotationArr[i];
                if (annotation instanceof POST) {
                    tuples2M3642to = Tuples4.m3642to("POST", ((POST) annotation).value());
                } else if (annotation instanceof PUT) {
                    tuples2M3642to = Tuples4.m3642to("PUT", ((PUT) annotation).value());
                } else if (annotation instanceof GET) {
                    tuples2M3642to = Tuples4.m3642to("GET", ((GET) annotation).value());
                } else if (annotation instanceof PATCH) {
                    tuples2M3642to = Tuples4.m3642to("PATCH", ((PATCH) annotation).value());
                } else if (annotation instanceof HEAD) {
                    tuples2M3642to = Tuples4.m3642to("HEAD", ((HEAD) annotation).value());
                } else if (annotation instanceof OPTIONS) {
                    tuples2M3642to = Tuples4.m3642to("OPTIONS", ((OPTIONS) annotation).value());
                }
                if (tuples2M3642to != null) {
                    break;
                }
                i++;
            }
            if (tuples2M3642to != null) {
                return MapsKt.mapOf(Tuples4.m3642to("api.kind", "REST"), Tuples4.m3642to("api.rest.verb", (String) tuples2M3642to.component1()), Tuples4.m3642to("api.rest.pathTemplate", (String) tuples2M3642to.component2()));
            }
            return MapsKt.emptyMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, String> generateTags(Invocation invocation) {
            Method method = invocation.method();
            Annotation[] annotations = method.getAnnotations();
            Intrinsics.checkNotNullExpressionValue(annotations, "getAnnotations(...)");
            Map<String, String> mapGenerateTags = generateTags(annotations);
            Tuples2 tuples2M3642to = Tuples4.m3642to("api.response.format", "JSON");
            Intrinsics.checkNotNull(method);
            return MapsKt.plus(mapGenerateTags, MapsKt.mapOf(tuples2M3642to, Tuples4.m3642to("api.response.type", KotlinReflect.getKotlinReturnType(method).toString()), Tuples4.m3642to("api.invocation.interface", method.getDeclaringClass().getName()), Tuples4.m3642to("api.invocation.method", method.toString())));
        }
    }
}
