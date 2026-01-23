package com.stripe.android.core.networking;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.networking.ConnectionFactory;
import com.stripe.android.core.networking.StripeConnection;
import com.stripe.android.core.networking.StripeRequest;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;

/* compiled from: ConnectionFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0003\b\t\nJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory;", "", "Lcom/stripe/android/core/networking/StripeRequest;", "request", "Lcom/stripe/android/core/networking/StripeConnection;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lcom/stripe/android/core/networking/StripeRequest;)Lcom/stripe/android/core/networking/StripeConnection;", "Companion", "ConnectionOpener", "Default", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface ConnectionFactory {
    StripeConnection<String> create(StripeRequest request) throws InvalidRequestException, IOException;

    /* compiled from: ConnectionFactory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\rJ>\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052,\u0010\u0006\u001a(\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0002\b\fH&¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;", "", "open", "Ljavax/net/ssl/HttpsURLConnection;", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "callback", "Lkotlin/Function2;", "Ljava/net/HttpURLConnection;", "Lkotlin/ParameterName;", "name", "", "Lkotlin/ExtensionFunctionType;", "Default", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface ConnectionOpener {
        HttpsURLConnection open(StripeRequest request, Function2<? super HttpURLConnection, ? super StripeRequest, Unit> callback);

        /* compiled from: ConnectionFactory.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062,\u0010\u0007\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0002\b\rH\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener$Default;", "Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;", "()V", "open", "Ljavax/net/ssl/HttpsURLConnection;", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "callback", "Lkotlin/Function2;", "Ljava/net/HttpURLConnection;", "Lkotlin/ParameterName;", "name", "", "Lkotlin/ExtensionFunctionType;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Default implements ConnectionOpener {
            public static final Default INSTANCE = new Default();

            private Default() {
            }

            @Override // com.stripe.android.core.networking.ConnectionFactory.ConnectionOpener
            public HttpsURLConnection open(StripeRequest request, Function2<? super HttpURLConnection, ? super StripeRequest, Unit> callback) throws IOException {
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(callback, "callback");
                URLConnection uRLConnectionOpenConnection = new URL(request.getUrl()).openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                callback.invoke(httpsURLConnection, request);
                return httpsURLConnection;
            }
        }
    }

    /* compiled from: ConnectionFactory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory$Default;", "Lcom/stripe/android/core/networking/ConnectionFactory;", "<init>", "()V", "Lcom/stripe/android/core/networking/StripeRequest;", "originalRequest", "Ljavax/net/ssl/HttpsURLConnection;", "openConnectionAndApplyFields", "(Lcom/stripe/android/core/networking/StripeRequest;)Ljavax/net/ssl/HttpsURLConnection;", "request", "Lcom/stripe/android/core/networking/StripeConnection;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lcom/stripe/android/core/networking/StripeRequest;)Lcom/stripe/android/core/networking/StripeConnection;", "Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;", "connectionOpener", "Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;", "getConnectionOpener", "()Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;", "setConnectionOpener", "(Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;)V", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Default implements ConnectionFactory {
        public static final Default INSTANCE = new Default();
        private static volatile ConnectionOpener connectionOpener = ConnectionOpener.Default.INSTANCE;

        private Default() {
        }

        @Override // com.stripe.android.core.networking.ConnectionFactory
        public /* synthetic */ StripeConnection create(StripeRequest request) throws InvalidRequestException, IOException {
            Intrinsics.checkNotNullParameter(request, "request");
            return new StripeConnection.Default(openConnectionAndApplyFields(request));
        }

        private final HttpsURLConnection openConnectionAndApplyFields(StripeRequest originalRequest) {
            return connectionOpener.open(originalRequest, new Function2<HttpURLConnection, StripeRequest, Unit>() { // from class: com.stripe.android.core.networking.ConnectionFactory$Default$openConnectionAndApplyFields$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(HttpURLConnection httpURLConnection, StripeRequest stripeRequest) throws IOException {
                    invoke2(httpURLConnection, stripeRequest);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(HttpURLConnection open, StripeRequest request) throws IOException {
                    Intrinsics.checkNotNullParameter(open, "$this$open");
                    Intrinsics.checkNotNullParameter(request, "request");
                    open.setConnectTimeout(ConnectionFactory.Companion.CONNECT_TIMEOUT);
                    open.setReadTimeout(ConnectionFactory.Companion.READ_TIMEOUT);
                    open.setUseCaches(request.getShouldCache());
                    open.setRequestMethod(request.getMethod().getCode());
                    for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
                        open.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    if (StripeRequest.Method.POST != request.getMethod()) {
                        return;
                    }
                    open.setDoOutput(true);
                    Map<String, String> postHeaders = request.getPostHeaders();
                    if (postHeaders != null) {
                        for (Map.Entry<String, String> entry2 : postHeaders.entrySet()) {
                            open.setRequestProperty(entry2.getKey(), entry2.getValue());
                        }
                    }
                    OutputStream outputStream = open.getOutputStream();
                    try {
                        Intrinsics.checkNotNull(outputStream);
                        request.writePostBody(outputStream);
                        Unit unit = Unit.INSTANCE;
                        Closeable.closeFinally(outputStream, null);
                    } finally {
                    }
                }
            });
        }
    }

    /* compiled from: ConnectionFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory$Companion;", "", "()V", "CONNECT_TIMEOUT", "", "READ_TIMEOUT", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int CONNECT_TIMEOUT;
        private static final int READ_TIMEOUT;

        private Companion() {
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            CONNECT_TIMEOUT = (int) timeUnit.toMillis(30L);
            READ_TIMEOUT = (int) timeUnit.toMillis(80L);
        }
    }
}
