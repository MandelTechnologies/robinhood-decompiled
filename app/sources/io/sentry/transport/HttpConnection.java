package io.sentry.transport;

import com.robinhood.utils.http.ContentEncoding;
import com.robinhood.utils.http.Headers;
import io.sentry.ILogger;
import io.sentry.RequestDetails;
import io.sentry.SentryEnvelope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes21.dex */
final class HttpConnection {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final SentryOptions options;
    private final Proxy proxy;
    private final RateLimiter rateLimiter;
    private final RequestDetails requestDetails;

    private boolean isSuccessfulResponseCode(int i) {
        return i == 200;
    }

    public HttpConnection(SentryOptions sentryOptions, RequestDetails requestDetails, RateLimiter rateLimiter) {
        this(sentryOptions, requestDetails, AuthenticatorWrapper.getInstance(), rateLimiter);
    }

    HttpConnection(SentryOptions sentryOptions, RequestDetails requestDetails, AuthenticatorWrapper authenticatorWrapper, RateLimiter rateLimiter) {
        this.requestDetails = requestDetails;
        this.options = sentryOptions;
        this.rateLimiter = rateLimiter;
        Proxy proxyResolveProxy = resolveProxy(sentryOptions.getProxy());
        this.proxy = proxyResolveProxy;
        if (proxyResolveProxy == null || sentryOptions.getProxy() == null) {
            return;
        }
        String user = sentryOptions.getProxy().getUser();
        String pass = sentryOptions.getProxy().getPass();
        if (user == null || pass == null) {
            return;
        }
        authenticatorWrapper.setDefault(new ProxyAuthenticator(user, pass));
    }

    private Proxy resolveProxy(SentryOptions.Proxy proxy) {
        Proxy.Type type2;
        if (proxy == null) {
            return null;
        }
        String port = proxy.getPort();
        String host = proxy.getHost();
        if (port == null || host == null) {
            return null;
        }
        try {
            if (proxy.getType() != null) {
                type2 = proxy.getType();
            } else {
                type2 = Proxy.Type.HTTP;
            }
            return new Proxy(type2, new InetSocketAddress(host, Integer.parseInt(port)));
        } catch (NumberFormatException e) {
            this.options.getLogger().log(SentryLevel.ERROR, e, "Failed to parse Sentry Proxy port: " + proxy.getPort() + ". Proxy is ignored", new Object[0]);
            return null;
        }
    }

    HttpURLConnection open() throws IOException {
        URLConnection uRLConnectionOpenConnection;
        if (this.proxy == null) {
            uRLConnectionOpenConnection = this.requestDetails.getUrl().openConnection();
        } else {
            uRLConnectionOpenConnection = this.requestDetails.getUrl().openConnection(this.proxy);
        }
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }

    private HttpURLConnection createConnection() throws IOException {
        HttpURLConnection httpURLConnectionOpen = open();
        for (Map.Entry<String, String> entry : this.requestDetails.getHeaders().entrySet()) {
            httpURLConnectionOpen.setRequestProperty(entry.getKey(), entry.getValue());
        }
        httpURLConnectionOpen.setRequestMethod("POST");
        httpURLConnectionOpen.setDoOutput(true);
        httpURLConnectionOpen.setRequestProperty("Content-Encoding", ContentEncoding.GZIP);
        httpURLConnectionOpen.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnectionOpen.setRequestProperty("Accept", "application/json");
        httpURLConnectionOpen.setRequestProperty("Connection", "close");
        httpURLConnectionOpen.setConnectTimeout(this.options.getConnectionTimeoutMillis());
        httpURLConnectionOpen.setReadTimeout(this.options.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = this.options.getSslSocketFactory();
        if ((httpURLConnectionOpen instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnectionOpen).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnectionOpen.connect();
        return httpURLConnectionOpen;
    }

    public TransportResult send(SentryEnvelope sentryEnvelope) throws IOException {
        HttpURLConnection httpURLConnectionCreateConnection = createConnection();
        try {
            OutputStream outputStream = httpURLConnectionCreateConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.options.getSerializer().serialize(sentryEnvelope, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    return readAndLog(httpURLConnectionCreateConnection);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.options.getLogger().log(SentryLevel.ERROR, th, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
                return readAndLog(httpURLConnectionCreateConnection);
            } finally {
                readAndLog(httpURLConnectionCreateConnection);
            }
        }
    }

    private TransportResult readAndLog(HttpURLConnection httpURLConnection) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                updateRetryAfterLimits(httpURLConnection, responseCode);
                if (isSuccessfulResponseCode(responseCode)) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Envelope sent successfully.", new Object[0]);
                    TransportResult transportResultSuccess = TransportResult.success();
                    closeAndDisconnect(httpURLConnection);
                    return transportResultSuccess;
                }
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.ERROR;
                logger.log(sentryLevel, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (this.options.isDebug()) {
                    this.options.getLogger().log(sentryLevel, "%s", getErrorMessageFromStream(httpURLConnection));
                }
                TransportResult transportResultError = TransportResult.error(responseCode);
                closeAndDisconnect(httpURLConnection);
                return transportResultError;
            } catch (IOException e) {
                this.options.getLogger().log(SentryLevel.ERROR, e, "Error reading and logging the response stream", new Object[0]);
                closeAndDisconnect(httpURLConnection);
                return TransportResult.error();
            }
        } catch (Throwable th) {
            closeAndDisconnect(httpURLConnection);
            throw th;
        }
    }

    public void updateRetryAfterLimits(HttpURLConnection httpURLConnection, int i) {
        String headerField = httpURLConnection.getHeaderField(Headers.RETRY_AFTER);
        this.rateLimiter.updateRetryAfterLimits(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i);
    }

    private void closeAndDisconnect(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    private String getErrorMessageFromStream(HttpURLConnection httpURLConnection) throws IOException {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, UTF_8));
                try {
                    StringBuilder sb = new StringBuilder();
                    boolean z = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z) {
                            sb.append("\n");
                        }
                        sb.append(line);
                        z = false;
                    }
                    String string2 = sb.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string2;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }
}
