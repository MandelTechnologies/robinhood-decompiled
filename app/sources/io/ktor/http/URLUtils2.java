package io.ktor.http;

import com.plaid.internal.EnumC7081g;
import io.ktor.util.StringValues5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections._Collections3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: URLUtils.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000b\u001a-\u0010\u0014\u001a\u00020\u0013*\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u001a\u001a\u00020\u0013*\u00060\u0016j\u0002`\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0015\u0010\u001e\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"", "urlString", "Lio/ktor/http/Url;", "Url", "(Ljava/lang/String;)Lio/ktor/http/Url;", "Lio/ktor/http/URLBuilder;", "URLBuilder", "(Ljava/lang/String;)Lio/ktor/http/URLBuilder;", "url", "takeFrom", "(Lio/ktor/http/URLBuilder;Lio/ktor/http/URLBuilder;)Lio/ktor/http/URLBuilder;", "(Lio/ktor/http/URLBuilder;Lio/ktor/http/Url;)Lio/ktor/http/URLBuilder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "encodedPath", "Lio/ktor/http/ParametersBuilder;", "encodedQueryParameters", "", "trailingQuery", "", "appendUrlFullPath", "(Ljava/lang/Appendable;Ljava/lang/String;Lio/ktor/http/ParametersBuilder;Z)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "encodedUser", "encodedPassword", "appendUserAndPassword", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V", "getHostWithPort", "(Lio/ktor/http/Url;)Ljava/lang/String;", "hostWithPort", "ktor-http"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.http.URLUtilsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class URLUtils2 {
    public static final Url Url(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return URLBuilder(urlString).build();
    }

    public static final URLBuilder URLBuilder(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return URLParser2.takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), urlString);
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, URLBuilder url) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        uRLBuilder.setProtocol(url.getProtocol());
        uRLBuilder.setHost(url.getHost());
        uRLBuilder.setPort(url.getPort());
        uRLBuilder.setEncodedPathSegments(url.getEncodedPathSegments());
        uRLBuilder.setEncodedUser(url.getEncodedUser());
        uRLBuilder.setEncodedPassword(url.getEncodedPassword());
        Parameters3 parameters3ParametersBuilder$default = Parameters6.ParametersBuilder$default(0, 1, null);
        StringValues5.appendAll(parameters3ParametersBuilder$default, url.getEncodedParameters());
        uRLBuilder.setEncodedParameters(parameters3ParametersBuilder$default);
        uRLBuilder.setEncodedFragment(url.getEncodedFragment());
        uRLBuilder.setTrailingQuery(url.getTrailingQuery());
        return uRLBuilder;
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, Url url) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        uRLBuilder.setProtocol(url.getProtocol());
        uRLBuilder.setHost(url.getHost());
        uRLBuilder.setPort(url.getPort());
        URLBuilder2.setEncodedPath(uRLBuilder, url.getEncodedPath());
        uRLBuilder.setEncodedUser(url.getEncodedUser());
        uRLBuilder.setEncodedPassword(url.getEncodedPassword());
        Parameters3 parameters3ParametersBuilder$default = Parameters6.ParametersBuilder$default(0, 1, null);
        parameters3ParametersBuilder$default.appendAll(QueryKt.parseQueryString$default(url.getEncodedQuery(), 0, 0, false, 6, null));
        uRLBuilder.setEncodedParameters(parameters3ParametersBuilder$default);
        uRLBuilder.setEncodedFragment(url.getEncodedFragment());
        uRLBuilder.setTrailingQuery(url.getTrailingQuery());
        return uRLBuilder;
    }

    public static final String getHostWithPort(Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return url.getHost() + ':' + url.getPort();
    }

    public static final void appendUrlFullPath(Appendable appendable, String encodedPath, Parameters3 encodedQueryParameters, boolean z) {
        List listListOf;
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
        Intrinsics.checkNotNullParameter(encodedQueryParameters, "encodedQueryParameters");
        if (!StringsKt.isBlank(encodedPath) && !StringsKt.startsWith$default(encodedPath, "/", false, 2, (Object) null)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (!encodedQueryParameters.isEmpty() || z) {
            appendable.append("?");
        }
        Set<Map.Entry<String, List<String>>> setEntries = encodedQueryParameters.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listListOf = CollectionsKt.listOf(Tuples4.m3642to(str, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Tuples4.m3642to(str, (String) it2.next()));
                }
                listListOf = arrayList2;
            }
            CollectionsKt.addAll(arrayList, listListOf);
        }
        _Collections3.joinTo(arrayList, appendable, (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 2) != 0 ? ", " : "&", (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 4) != 0 ? "" : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 8) == 0 ? null : "", (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 16) != 0 ? -1 : 0, (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 32) != 0 ? "..." : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 64) != 0 ? null : new Function1<Tuples2<? extends String, ? extends String>, CharSequence>() { // from class: io.ktor.http.URLUtilsKt.appendUrlFullPath.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Tuples2<? extends String, ? extends String> tuples2) {
                return invoke2((Tuples2<String, String>) tuples2);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(Tuples2<String, String> it3) {
                Intrinsics.checkNotNullParameter(it3, "it");
                String first = it3.getFirst();
                if (it3.getSecond() == null) {
                    return first;
                }
                return first + '=' + String.valueOf(it3.getSecond());
            }
        });
    }

    public static final void appendUserAndPassword(StringBuilder sb, String str, String str2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        if (str == null) {
            return;
        }
        sb.append(str);
        if (str2 != null) {
            sb.append(':');
            sb.append(str2);
        }
        sb.append("@");
    }
}
