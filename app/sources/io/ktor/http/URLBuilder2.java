package io.ktor.http;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: URLBuilder.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0010\u001a)\u0010\u0005\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\n*\u00060\u0000j\u0002`\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000e\u001a\u00020\n*\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a)\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0015\"\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0017\u001a\u001f\u0010\u0018\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\"\u0018\u0010\u001e\u001a\u00020\u0007*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0015\u0010 \u001a\u00020\u0007*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d\"(\u0010\r\u001a\u00020\u0007*\u00020\u00032\u0006\u0010!\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010$¨\u0006%"}, m3636d2 = {"Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "Lio/ktor/http/URLBuilder;", "out", "appendTo", "(Lio/ktor/http/URLBuilder;Ljava/lang/Appendable;)Ljava/lang/Appendable;", "", "encodedUser", "host", "", "appendMailto", "(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;)V", "encodedPath", "appendFile", "", "segments", "", "encodeSlash", "appendPathSegments", "(Lio/ktor/http/URLBuilder;Ljava/util/List;Z)Lio/ktor/http/URLBuilder;", "", "components", "(Lio/ktor/http/URLBuilder;[Ljava/lang/String;Z)Lio/ktor/http/URLBuilder;", "appendEncodedPathSegments", "(Lio/ktor/http/URLBuilder;Ljava/util/List;)Lio/ktor/http/URLBuilder;", "joinPath", "(Ljava/util/List;)Ljava/lang/String;", "getEncodedUserAndPassword", "(Lio/ktor/http/URLBuilder;)Ljava/lang/String;", "encodedUserAndPassword", "getAuthority", "authority", "value", "getEncodedPath", "setEncodedPath", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;)V", "ktor-http"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.http.URLBuilderKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class URLBuilder2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <A extends Appendable> A appendTo(URLBuilder uRLBuilder, A a) throws IOException {
        a.append(uRLBuilder.getProtocol().getName());
        String name = uRLBuilder.getProtocol().getName();
        if (Intrinsics.areEqual(name, "file")) {
            appendFile(a, uRLBuilder.getHost(), getEncodedPath(uRLBuilder));
            return a;
        }
        if (Intrinsics.areEqual(name, "mailto")) {
            appendMailto(a, getEncodedUserAndPassword(uRLBuilder), uRLBuilder.getHost());
            return a;
        }
        a.append("://");
        a.append(getAuthority(uRLBuilder));
        URLUtils2.appendUrlFullPath(a, getEncodedPath(uRLBuilder), uRLBuilder.getEncodedParameters(), uRLBuilder.getTrailingQuery());
        if (uRLBuilder.getEncodedFragment().length() > 0) {
            a.append('#');
            a.append(uRLBuilder.getEncodedFragment());
        }
        return a;
    }

    private static final void appendMailto(Appendable appendable, String str, String str2) throws IOException {
        appendable.append(":");
        appendable.append(str);
        appendable.append(str2);
    }

    private static final void appendFile(Appendable appendable, String str, String str2) throws IOException {
        appendable.append("://");
        appendable.append(str);
        if (!StringsKt.startsWith$default((CharSequence) str2, '/', false, 2, (Object) null)) {
            appendable.append('/');
        }
        appendable.append(str2);
    }

    public static final String getEncodedUserAndPassword(URLBuilder uRLBuilder) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        StringBuilder sb = new StringBuilder();
        URLUtils2.appendUserAndPassword(sb, uRLBuilder.getEncodedUser(), uRLBuilder.getEncodedPassword());
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public static final URLBuilder appendPathSegments(URLBuilder uRLBuilder, List<String> segments, boolean z) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(segments, "segments");
        if (!z) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = segments.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, StringsKt.split$default((CharSequence) it.next(), new char[]{'/'}, false, 0, 6, (Object) null));
            }
            segments = arrayList;
        }
        List<String> list = segments;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Codecs2.encodeURLPathPart((String) it2.next()));
        }
        appendEncodedPathSegments(uRLBuilder, arrayList2);
        return uRLBuilder;
    }

    public static /* synthetic */ URLBuilder appendPathSegments$default(URLBuilder uRLBuilder, String[] strArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return appendPathSegments(uRLBuilder, strArr, z);
    }

    public static final URLBuilder appendPathSegments(URLBuilder uRLBuilder, String[] components, boolean z) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        return appendPathSegments(uRLBuilder, (List<String>) ArraysKt.toList(components), z);
    }

    public static final URLBuilder appendEncodedPathSegments(URLBuilder uRLBuilder, List<String> segments) {
        List<String> listPlus;
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(segments, "segments");
        boolean z = false;
        boolean z2 = uRLBuilder.getEncodedPathSegments().size() > 1 && ((CharSequence) CollectionsKt.last((List) uRLBuilder.getEncodedPathSegments())).length() == 0 && !segments.isEmpty();
        if (segments.size() > 1 && ((CharSequence) CollectionsKt.first((List) segments)).length() == 0 && !uRLBuilder.getEncodedPathSegments().isEmpty()) {
            z = true;
        }
        if (z2 && z) {
            listPlus = CollectionsKt.plus((Collection) CollectionsKt.dropLast(uRLBuilder.getEncodedPathSegments(), 1), (Iterable) CollectionsKt.drop(segments, 1));
        } else if (z2) {
            listPlus = CollectionsKt.plus((Collection) CollectionsKt.dropLast(uRLBuilder.getEncodedPathSegments(), 1), (Iterable) segments);
        } else if (z) {
            listPlus = CollectionsKt.plus((Collection) uRLBuilder.getEncodedPathSegments(), (Iterable) CollectionsKt.drop(segments, 1));
        } else {
            listPlus = CollectionsKt.plus((Collection) uRLBuilder.getEncodedPathSegments(), (Iterable) segments);
        }
        uRLBuilder.setEncodedPathSegments(listPlus);
        return uRLBuilder;
    }

    public static final String getAuthority(URLBuilder uRLBuilder) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append(getEncodedUserAndPassword(uRLBuilder));
        sb.append(uRLBuilder.getHost());
        if (uRLBuilder.getPort() != 0 && uRLBuilder.getPort() != uRLBuilder.getProtocol().getDefaultPort()) {
            sb.append(":");
            sb.append(String.valueOf(uRLBuilder.getPort()));
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public static final String getEncodedPath(URLBuilder uRLBuilder) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        return joinPath(uRLBuilder.getEncodedPathSegments());
    }

    public static final void setEncodedPath(URLBuilder uRLBuilder, String value) {
        List<String> root_path;
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        if (StringsKt.isBlank(value)) {
            root_path = CollectionsKt.emptyList();
        } else {
            root_path = Intrinsics.areEqual(value, "/") ? URLParser2.getROOT_PATH() : CollectionsKt.toMutableList((Collection) StringsKt.split$default((CharSequence) value, new char[]{'/'}, false, 0, 6, (Object) null));
        }
        uRLBuilder.setEncodedPathSegments(root_path);
    }

    private static final String joinPath(List<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((CharSequence) CollectionsKt.first((List) list)).length() == 0 ? "/" : (String) CollectionsKt.first((List) list);
        }
        return CollectionsKt.joinToString$default(list, "/", null, null, 0, null, null, 62, null);
    }
}
