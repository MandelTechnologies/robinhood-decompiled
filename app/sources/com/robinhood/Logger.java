package com.robinhood;

import com.robinhood.utils.extensions.Throwables;
import com.singular.sdk.internal.Constants;
import io.reactivex.exceptions.CompositeException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import retrofit2.HttpException;

/* compiled from: Logger.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ5\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\u000bJ-\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ-\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ7\u0010\t\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\u000bJ-\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ7\u0010\r\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/Logger;", "", "d", "", Constants.RequestParamsKeys.SESSION_ID_KEY, "", "s2", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "w", "Companion", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface Logger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* renamed from: d */
    void mo1679d(String s, Object... s2);

    /* renamed from: d */
    void mo1680d(Throwable e, String s, Object... s2);

    /* renamed from: e */
    void mo1681e(String s, Object... s2);

    /* renamed from: e */
    void mo1682e(Throwable e, String s, Object... s2);

    /* renamed from: i */
    void mo1683i(String s, Object... s2);

    /* renamed from: w */
    void mo1684w(String s, Object... s2);

    /* renamed from: w */
    void mo1685w(Throwable e, String s, Object... s2);

    /* compiled from: Logger.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ5\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000eJ-\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ-\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ7\u0010\f\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000eJ-\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ7\u0010\u0010\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0001J\u001e\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007*\u0006\u0012\u0002\b\u00030\u001bH\u0002R\u001a\u0010\u0012\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/Logger$Companion;", "Lcom/robinhood/Logger;", "<init>", "()V", "d", "", Constants.RequestParamsKeys.SESSION_ID_KEY, "", "s2", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "w", "init", "logger", "getLogger", "()Lcom/robinhood/Logger;", "setLogger", "(Lcom/robinhood/Logger;)V", "logErrorContext", "throwable", "tag", "extractErrorBody", "Lretrofit2/Response;", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Logger {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static Logger logger = Logger2.INSTANCE;

        @JvmOverloads
        public final void logErrorContext(Throwable th) {
            logErrorContext$default(this, th, null, 2, null);
        }

        private Companion() {
        }

        @Override // com.robinhood.Logger
        /* renamed from: d */
        public void mo1679d(String s, Object... s2) {
            Intrinsics.checkNotNullParameter(s, "s");
            Intrinsics.checkNotNullParameter(s2, "s2");
            logger.mo1679d(s, Arrays.copyOf(s2, s2.length));
        }

        @Override // com.robinhood.Logger
        /* renamed from: d */
        public void mo1680d(Throwable e, String s, Object... s2) {
            Intrinsics.checkNotNullParameter(e, "e");
            Intrinsics.checkNotNullParameter(s, "s");
            Intrinsics.checkNotNullParameter(s2, "s2");
            logger.mo1680d(e, s, Arrays.copyOf(s2, s2.length));
        }

        @Override // com.robinhood.Logger
        /* renamed from: i */
        public void mo1683i(String s, Object... s2) {
            Intrinsics.checkNotNullParameter(s, "s");
            Intrinsics.checkNotNullParameter(s2, "s2");
            logger.mo1683i(s, Arrays.copyOf(s2, s2.length));
        }

        @Override // com.robinhood.Logger
        /* renamed from: e */
        public void mo1681e(String s, Object... s2) {
            Intrinsics.checkNotNullParameter(s, "s");
            Intrinsics.checkNotNullParameter(s2, "s2");
            logger.mo1681e(s, Arrays.copyOf(s2, s2.length));
        }

        @Override // com.robinhood.Logger
        /* renamed from: e */
        public void mo1682e(Throwable e, String s, Object... s2) {
            Intrinsics.checkNotNullParameter(s, "s");
            Intrinsics.checkNotNullParameter(s2, "s2");
            logger.mo1682e(e, s, Arrays.copyOf(s2, s2.length));
        }

        @Override // com.robinhood.Logger
        /* renamed from: w */
        public void mo1684w(String s, Object... s2) {
            Intrinsics.checkNotNullParameter(s, "s");
            Intrinsics.checkNotNullParameter(s2, "s2");
            logger.mo1684w(s, Arrays.copyOf(s2, s2.length));
        }

        @Override // com.robinhood.Logger
        /* renamed from: w */
        public void mo1685w(Throwable e, String s, Object... s2) {
            Intrinsics.checkNotNullParameter(s, "s");
            Intrinsics.checkNotNullParameter(s2, "s2");
            logger.mo1684w(s, Arrays.copyOf(s2, s2.length));
        }

        public final void init(Logger logger2) {
            Intrinsics.checkNotNullParameter(logger2, "logger");
            logger = logger2;
        }

        public final Logger getLogger() {
            return logger;
        }

        public final void setLogger(Logger logger2) {
            Intrinsics.checkNotNullParameter(logger2, "<set-?>");
            logger = logger2;
        }

        public static /* synthetic */ void logErrorContext$default(Companion companion, Throwable th, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            companion.logErrorContext(th, str);
        }

        @JvmOverloads
        public final void logErrorContext(Throwable throwable, String tag) {
            Response responseRaw;
            Request request;
            HttpUrl url;
            logger.mo1682e(new Throwable(), "%s report call site", tag);
            CompositeException compositeException = (CompositeException) Throwables.findCause(throwable, CompositeException.class);
            if (compositeException != null) {
                List<Throwable> exceptions = compositeException.getExceptions();
                Intrinsics.checkNotNullExpressionValue(exceptions, "getExceptions(...)");
                int size = exceptions.size();
                for (int i = 0; i < size; i++) {
                    logger.mo1682e(exceptions.get(i), "%s CompositeException child #%d", tag, Integer.valueOf(i));
                }
                return;
            }
            HttpException httpException = (HttpException) Throwables.findCause(throwable, HttpException.class);
            if (httpException != null) {
                if (httpException.code() == 500) {
                    logger.mo1681e("%s Received %s", tag, throwable != null ? throwable.getMessage() : null);
                    return;
                }
                retrofit2.Response<?> response = httpException.response();
                logger.mo1681e("%s RetrofitError: %d on %s", tag, response != null ? Integer.valueOf(response.code()) : null, (response == null || (responseRaw = response.raw()) == null || (request = responseRaw.getRequest()) == null || (url = request.getUrl()) == null) ? null : url.getUrl());
                String strExtractErrorBody = response != null ? extractErrorBody(response) : null;
                if (strExtractErrorBody != null) {
                    logger.mo1681e(strExtractErrorBody, new Object[0]);
                    return;
                } else {
                    logger.mo1681e("%s Error parsing response body", tag);
                    return;
                }
            }
            logger.mo1682e(throwable, "%s Caught error", tag);
        }

        private final String extractErrorBody(retrofit2.Response<?> response) {
            BufferedSource bufferedSourceSource;
            Buffer buffer;
            Buffer bufferClone;
            ResponseBody responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody == null || (bufferedSourceSource = responseBodyErrorBody.get$this_asResponseBody()) == null || (buffer = bufferedSourceSource.getBufferField()) == null || (bufferClone = buffer.clone()) == null) {
                return null;
            }
            try {
                String string2 = bufferClone.readString(Charsets.UTF_8);
                Closeable.closeFinally(bufferClone, null);
                return string2;
            } finally {
            }
        }
    }
}
