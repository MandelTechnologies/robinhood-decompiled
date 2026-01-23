package com.stripe.android.core.networking;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeConnection.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000b\fJ\u001b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/core/networking/StripeConnection;", "ResponseBodyType", "Ljava/io/Closeable;", "Ljava/io/InputStream;", "responseStream", "createBodyFromResponseStream", "(Ljava/io/InputStream;)Ljava/lang/Object;", "Lcom/stripe/android/core/networking/StripeResponse;", "getResponse", "()Lcom/stripe/android/core/networking/StripeResponse;", "response", "AbstractConnection", "Default", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface StripeConnection<ResponseBodyType> extends Closeable {
    ResponseBodyType createBodyFromResponseStream(InputStream responseStream);

    StripeResponse<ResponseBodyType> getResponse();

    /* compiled from: StripeConnection.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u0014*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0014B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m3636d2 = {"Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;", "ResponseBodyType", "Lcom/stripe/android/core/networking/StripeConnection;", "conn", "Ljavax/net/ssl/HttpsURLConnection;", "(Ljavax/net/ssl/HttpsURLConnection;)V", "response", "Lcom/stripe/android/core/networking/StripeResponse;", "getResponse", "()Lcom/stripe/android/core/networking/StripeResponse;", "responseCode", "", "getResponseCode", "()I", "responseStream", "Ljava/io/InputStream;", "getResponseStream", "()Ljava/io/InputStream;", "close", "", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static abstract class AbstractConnection<ResponseBodyType> implements StripeConnection<ResponseBodyType> {
        private final HttpsURLConnection conn;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String CHARSET = StandardCharsets.UTF_8.name();

        public AbstractConnection(HttpsURLConnection conn) {
            Intrinsics.checkNotNullParameter(conn, "conn");
            this.conn = conn;
        }

        public /* synthetic */ int getResponseCode() {
            return this.conn.getResponseCode();
        }

        @Override // com.stripe.android.core.networking.StripeConnection
        public /* synthetic */ StripeResponse getResponse() throws IOException {
            int responseCode = getResponseCode();
            ResponseBodyType responsebodytypeCreateBodyFromResponseStream = createBodyFromResponseStream(getResponseStream());
            Map<String, List<String>> headerFields = this.conn.getHeaderFields();
            Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
            return new StripeResponse(responseCode, responsebodytypeCreateBodyFromResponseStream, headerFields);
        }

        private final InputStream getResponseStream() throws IOException {
            int responseCode = getResponseCode();
            if (200 <= responseCode && responseCode < 300) {
                return this.conn.getInputStream();
            }
            return this.conn.getErrorStream();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream responseStream = getResponseStream();
            if (responseStream != null) {
                responseStream.close();
            }
            this.conn.disconnect();
        }

        /* compiled from: StripeConnection.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;", "", "()V", "CHARSET", "", "kotlin.jvm.PlatformType", "getCHARSET$stripe_core_release", "()Ljava/lang/String;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String getCHARSET$stripe_core_release() {
                return AbstractConnection.CHARSET;
            }
        }
    }

    /* compiled from: StripeConnection.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/core/networking/StripeConnection$Default;", "Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;", "", "conn", "Ljavax/net/ssl/HttpsURLConnection;", "(Ljavax/net/ssl/HttpsURLConnection;)V", "createBodyFromResponseStream", "responseStream", "Ljava/io/InputStream;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Default extends AbstractConnection<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Default(HttpsURLConnection conn) {
            super(conn);
            Intrinsics.checkNotNullParameter(conn, "conn");
        }

        @Override // com.stripe.android.core.networking.StripeConnection
        public String createBodyFromResponseStream(InputStream responseStream) throws IOException {
            if (responseStream == null) {
                return null;
            }
            try {
                Scanner scannerUseDelimiter = new Scanner(responseStream, AbstractConnection.INSTANCE.getCHARSET$stripe_core_release()).useDelimiter("\\A");
                String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : null;
                kotlin.p481io.Closeable.closeFinally(responseStream, null);
                return next;
            } finally {
            }
        }
    }
}
