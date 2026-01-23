package io.ktor.http;

import io.ktor.util.StringValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Headers.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/ktor/http/Headers;", "Lio/ktor/util/StringValues;", "Companion", "ktor-http"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface Headers extends StringValues {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: Headers.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void forEach(Headers headers, Function2<? super String, ? super List<String>, Unit> body) {
            Intrinsics.checkNotNullParameter(body, "body");
            StringValues.DefaultImpls.forEach(headers, body);
        }

        public static String get(Headers headers, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return StringValues.DefaultImpls.get(headers, name);
        }
    }

    /* compiled from: Headers.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lio/ktor/http/Headers$Companion;", "", "<init>", "()V", "Lio/ktor/http/Headers;", "Empty", "Lio/ktor/http/Headers;", "getEmpty", "()Lio/ktor/http/Headers;", "getEmpty$annotations", "ktor-http"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Headers Empty = Headers2.INSTANCE;

        private Companion() {
        }

        public final Headers getEmpty() {
            return Empty;
        }
    }
}
