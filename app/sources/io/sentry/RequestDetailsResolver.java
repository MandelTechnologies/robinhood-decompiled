package io.sentry;

import com.robinhood.utils.http.Headers;
import io.sentry.util.Objects;
import java.net.URI;
import java.util.HashMap;

/* loaded from: classes21.dex */
final class RequestDetailsResolver {
    private final SentryOptions options;

    public RequestDetailsResolver(SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "options is required");
    }

    RequestDetails resolve() {
        String str;
        Dsn dsn = new Dsn(this.options.getDsn());
        URI sentryUri = dsn.getSentryUri();
        String string2 = sentryUri.resolve(sentryUri.getPath() + "/envelope/").toString();
        String publicKey = dsn.getPublicKey();
        String secretKey = dsn.getSecretKey();
        StringBuilder sb = new StringBuilder();
        sb.append("Sentry sentry_version=7,sentry_client=");
        sb.append(this.options.getSentryClientName());
        sb.append(",sentry_key=");
        sb.append(publicKey);
        if (secretKey == null || secretKey.length() <= 0) {
            str = "";
        } else {
            str = ",sentry_secret=" + secretKey;
        }
        sb.append(str);
        String string3 = sb.toString();
        String sentryClientName = this.options.getSentryClientName();
        HashMap map = new HashMap();
        map.put(Headers.USER_AGENT, sentryClientName);
        map.put("X-Sentry-Auth", string3);
        return new RequestDetails(string2, map);
    }
}
