package com.stripe.android.stripe3ds2.transaction;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.p481io.ReadWrite2;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StripeHttpClient.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002!\"B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\fH\u0001¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient;", "Lcom/stripe/android/stripe3ds2/transaction/HttpClient;", "url", "", "connectionFactory", "Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "createConnection", "Ljava/net/HttpURLConnection;", "createGetConnection", "createPostConnection", "requestBody", "contentType", "doGetRequest", "Ljava/io/InputStream;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doPostRequest", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doPostRequestInternal", "getResponseBody", "inputStream", "handlePostResponse", "conn", "handlePostResponse$3ds2sdk_release", "isSuccessfulResponse", "", "responseCode", "", "ConnectionFactory", "DefaultConnectionFactory", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class StripeHttpClient implements HttpClient {
    private final ConnectionFactory connectionFactory;
    private final ErrorReporter errorReporter;
    private final String url;
    private final CoroutineContext workContext;

    /* compiled from: StripeHttpClient.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ljava/net/HttpURLConnection;", "url", "", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface ConnectionFactory {
        HttpURLConnection create(String url);
    }

    private final boolean isSuccessfulResponse(int responseCode) {
        return 200 <= responseCode && responseCode < 300;
    }

    public StripeHttpClient(String url, ConnectionFactory connectionFactory, ErrorReporter errorReporter, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.url = url;
        this.connectionFactory = connectionFactory;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    public /* synthetic */ StripeHttpClient(String str, ConnectionFactory connectionFactory, ErrorReporter errorReporter, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new DefaultConnectionFactory() : connectionFactory, errorReporter, coroutineContext);
    }

    /* compiled from: StripeHttpClient.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "Ljava/io/InputStream;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.stripe3ds2.transaction.StripeHttpClient$doGetRequest$2", m3645f = "StripeHttpClient.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.stripe3ds2.transaction.StripeHttpClient$doGetRequest$2 */
    static final class C426252 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super InputStream>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C426252(Continuation<? super C426252> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C426252 c426252 = StripeHttpClient.this.new C426252(continuation);
            c426252.L$0 = obj;
            return c426252;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InputStream> continuation) {
            return ((C426252) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StripeHttpClient stripeHttpClient = StripeHttpClient.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                HttpURLConnection httpURLConnectionCreateGetConnection = stripeHttpClient.createGetConnection();
                httpURLConnectionCreateGetConnection.connect();
                objM28550constructorimpl = Result.m28550constructorimpl(httpURLConnectionCreateGetConnection.getResponseCode() == 200 ? httpURLConnectionCreateGetConnection.getInputStream() : null);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            StripeHttpClient stripeHttpClient2 = StripeHttpClient.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                stripeHttpClient2.errorReporter.reportError(thM28553exceptionOrNullimpl);
            }
            if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                return null;
            }
            return objM28550constructorimpl;
        }
    }

    public Object doGetRequest(Continuation<? super InputStream> continuation) {
        return BuildersKt.withContext(this.workContext, new C426252(null), continuation);
    }

    /* compiled from: StripeHttpClient.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.stripe3ds2.transaction.StripeHttpClient$doPostRequest$2", m3645f = "StripeHttpClient.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.stripe3ds2.transaction.StripeHttpClient$doPostRequest$2 */
    static final class C426262 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super HttpResponse>, Object> {
        final /* synthetic */ String $contentType;
        final /* synthetic */ String $requestBody;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C426262(String str, String str2, Continuation<? super C426262> continuation) {
            super(2, continuation);
            this.$requestBody = str;
            this.$contentType = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C426262 c426262 = StripeHttpClient.this.new C426262(this.$requestBody, this.$contentType, continuation);
            c426262.L$0 = obj;
            return c426262;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpResponse> continuation) {
            return ((C426262) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StripeHttpClient stripeHttpClient = StripeHttpClient.this;
            String str = this.$requestBody;
            String str2 = this.$contentType;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(stripeHttpClient.doPostRequestInternal(str, str2));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            StripeHttpClient stripeHttpClient2 = StripeHttpClient.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                stripeHttpClient2.errorReporter.reportError(thM28553exceptionOrNullimpl);
            }
            Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl2 == null) {
                return objM28550constructorimpl;
            }
            throw new SDKRuntimeException(thM28553exceptionOrNullimpl2);
        }
    }

    @Override // com.stripe.android.stripe3ds2.transaction.HttpClient
    public Object doPostRequest(String str, String str2, Continuation<? super HttpResponse> continuation) {
        return BuildersKt.withContext(this.workContext, new C426262(str, str2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpResponse doPostRequestInternal(String requestBody, String contentType) throws IOException {
        HttpURLConnection httpURLConnectionCreatePostConnection = createPostConnection(requestBody, contentType);
        OutputStream outputStream = httpURLConnectionCreatePostConnection.getOutputStream();
        try {
            Intrinsics.checkNotNull(outputStream);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, UTF_8);
            try {
                outputStreamWriter.write(requestBody);
                outputStreamWriter.flush();
                Unit unit = Unit.INSTANCE;
                Closeable.closeFinally(outputStreamWriter, null);
                Closeable.closeFinally(outputStream, null);
                httpURLConnectionCreatePostConnection.connect();
                return handlePostResponse$3ds2sdk_release(httpURLConnectionCreatePostConnection);
            } finally {
            }
        } finally {
        }
    }

    public final HttpResponse handlePostResponse$3ds2sdk_release(HttpURLConnection conn) throws IOException {
        Intrinsics.checkNotNullParameter(conn, "conn");
        int responseCode = conn.getResponseCode();
        if (!isSuccessfulResponse(responseCode)) {
            throw new SDKRuntimeException("Unsuccessful response code from " + this.url + ": " + responseCode, null, 2, null);
        }
        InputStream inputStream = conn.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return new HttpResponse(getResponseBody(inputStream), conn.getContentType());
    }

    private final String getResponseBody(InputStream inputStream) {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
            try {
                String text = ReadWrite2.readText(bufferedReader);
                Closeable.closeFinally(bufferedReader, null);
                objM28550constructorimpl = Result.m28550constructorimpl(text);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        String str = (String) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
        return str == null ? "" : str;
    }

    private final HttpURLConnection createPostConnection(String requestBody, String contentType) throws ProtocolException {
        HttpURLConnection httpURLConnectionCreateConnection = createConnection();
        httpURLConnectionCreateConnection.setRequestMethod("POST");
        httpURLConnectionCreateConnection.setDoOutput(true);
        httpURLConnectionCreateConnection.setRequestProperty("Content-Type", contentType);
        httpURLConnectionCreateConnection.setRequestProperty("Content-Length", String.valueOf(requestBody.length()));
        return httpURLConnectionCreateConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpURLConnection createGetConnection() {
        HttpURLConnection httpURLConnectionCreateConnection = createConnection();
        httpURLConnectionCreateConnection.setDoInput(true);
        return httpURLConnectionCreateConnection;
    }

    private final HttpURLConnection createConnection() {
        return this.connectionFactory.create(this.url);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StripeHttpClient.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$DefaultConnectionFactory;", "Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ljava/net/HttpURLConnection;", "url", "", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultConnectionFactory implements ConnectionFactory {
        @Override // com.stripe.android.stripe3ds2.transaction.StripeHttpClient.ConnectionFactory
        public HttpURLConnection create(String url) throws IOException {
            Intrinsics.checkNotNullParameter(url, "url");
            URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            return (HttpURLConnection) uRLConnectionOpenConnection;
        }
    }
}
