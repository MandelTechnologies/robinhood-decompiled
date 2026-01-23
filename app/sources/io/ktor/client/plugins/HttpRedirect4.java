package io.ktor.client.plugins;

import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.logging.KtorSimpleLoggerJvm;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.slf4j.Logger;

/* compiled from: HttpRedirect.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0012\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"ALLOWED_FOR_REDIRECT", "", "Lio/ktor/http/HttpMethod;", "LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "isRedirect", "", "Lio/ktor/http/HttpStatusCode;", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.plugins.HttpRedirectKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpRedirect4 {
    private static final Set<HttpMethod> ALLOWED_FOR_REDIRECT;
    private static final Logger LOGGER;

    static {
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        ALLOWED_FOR_REDIRECT = SetsKt.setOf((Object[]) new HttpMethod[]{companion.getGet(), companion.getHead()});
        LOGGER = KtorSimpleLoggerJvm.KtorSimpleLogger("io.ktor.client.plugins.HttpRedirect");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRedirect(HttpStatusCode httpStatusCode) {
        int value = httpStatusCode.getValue();
        HttpStatusCode.Companion companion = HttpStatusCode.INSTANCE;
        return value == companion.getMovedPermanently().getValue() || value == companion.getFound().getValue() || value == companion.getTemporaryRedirect().getValue() || value == companion.getPermanentRedirect().getValue() || value == companion.getSeeOther().getValue();
    }
}
