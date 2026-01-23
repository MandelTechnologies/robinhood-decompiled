package io.ktor.client.engine;

import io.ktor.client.utils.headers;
import io.ktor.http.ContentTypes2;
import io.ktor.http.Headers;
import io.ktor.http.Headers3;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.PlatformUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0003\u001aW\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000226\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000eH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\" \u0010\u0014\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m3636d2 = {"Lio/ktor/http/Headers;", "requestHeaders", "Lio/ktor/http/content/OutgoingContent;", "content", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "key", "value", "", "block", "mergeHeaders", "(Lio/ktor/http/Headers;Lio/ktor/http/content/OutgoingContent;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/CoroutineContext;", "callContext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "needUserAgent", "()Z", "KTOR_DEFAULT_USER_AGENT", "Ljava/lang/String;", "getKTOR_DEFAULT_USER_AGENT", "()Ljava/lang/String;", "getKTOR_DEFAULT_USER_AGENT$annotations", "()V", "", "DATE_HEADERS", "Ljava/util/Set;", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class UtilsKt {
    private static final Set<String> DATE_HEADERS;
    private static final String KTOR_DEFAULT_USER_AGENT = "Ktor client";

    static {
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        DATE_HEADERS = SetsKt.setOf((Object[]) new String[]{httpHeaders.getDate(), httpHeaders.getExpires(), httpHeaders.getLastModified(), httpHeaders.getIfModifiedSince(), httpHeaders.getIfUnmodifiedSince()});
    }

    public static final void mergeHeaders(final Headers requestHeaders, final OutgoingContent content, final Function2<? super String, ? super String, Unit> block) {
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(block, "block");
        headers.buildHeaders(new Function1<Headers3, Unit>() { // from class: io.ktor.client.engine.UtilsKt.mergeHeaders.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Headers3 headers3) {
                invoke2(headers3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Headers3 buildHeaders) {
                Intrinsics.checkNotNullParameter(buildHeaders, "$this$buildHeaders");
                buildHeaders.appendAll(requestHeaders);
                buildHeaders.appendAll(content.getHeaders());
            }
        }).forEach(new Function2<String, List<? extends String>, Unit>() { // from class: io.ktor.client.engine.UtilsKt.mergeHeaders.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends String> list) {
                invoke2(str, (List<String>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String key, List<String> values) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(values, "values");
                HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
                if (Intrinsics.areEqual(httpHeaders.getContentLength(), key) || Intrinsics.areEqual(httpHeaders.getContentType(), key)) {
                    return;
                }
                if (!UtilsKt.DATE_HEADERS.contains(key)) {
                    block.invoke(key, CollectionsKt.joinToString$default(values, Intrinsics.areEqual(httpHeaders.getCookie(), key) ? "; " : ",", null, null, 0, null, null, 62, null));
                    return;
                }
                Function2<String, String, Unit> function2 = block;
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    function2.invoke(key, (String) it.next());
                }
            }
        });
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        if (requestHeaders.get(httpHeaders.getUserAgent()) == null && content.getHeaders().get(httpHeaders.getUserAgent()) == null && needUserAgent()) {
            block.invoke(httpHeaders.getUserAgent(), KTOR_DEFAULT_USER_AGENT);
        }
        ContentTypes2 contentType = content.getContentType();
        if ((contentType == null || (string2 = contentType.toString()) == null) && (string2 = content.getHeaders().get(httpHeaders.getContentType())) == null) {
            string2 = requestHeaders.get(httpHeaders.getContentType());
        }
        Long contentLength = content.getContentLength();
        if ((contentLength == null || (string3 = contentLength.toString()) == null) && (string3 = content.getHeaders().get(httpHeaders.getContentLength())) == null) {
            string3 = requestHeaders.get(httpHeaders.getContentLength());
        }
        if (string2 != null) {
            block.invoke(httpHeaders.getContentType(), string2);
        }
        if (string3 != null) {
            block.invoke(httpHeaders.getContentLength(), string3);
        }
    }

    public static final Object callContext(Continuation<? super CoroutineContext> continuation) {
        CoroutineContext.Element element = continuation.getContext().get(KtorCallContextElement.INSTANCE);
        Intrinsics.checkNotNull(element);
        return ((KtorCallContextElement) element).getCallContext();
    }

    private static final boolean needUserAgent() {
        return !PlatformUtils.INSTANCE.getIS_BROWSER();
    }
}
