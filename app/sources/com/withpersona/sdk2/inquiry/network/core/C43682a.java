package com.withpersona.sdk2.inquiry.network.core;

import android.util.Base64;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.utils.http.Headers;
import com.withpersona.sdk2.inquiry.logger.Logger;
import com.withpersona.sdk2.inquiry.logger.Logger7;
import io.jsonwebtoken.Claims;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.HexExtensions;
import kotlin.text.HexFormat;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.withpersona.sdk2.inquiry.network.core.a */
/* loaded from: classes18.dex */
public final class C43682a {

    /* renamed from: a */
    public static final C43682a f6505a = new C43682a();

    /* renamed from: com.withpersona.sdk2.inquiry.network.core.a$a */
    public static final class a {

        /* renamed from: a */
        public final String f6506a;

        /* renamed from: b */
        public final String f6507b;

        /* renamed from: c */
        public final String f6508c;

        /* renamed from: d */
        public final String f6509d;

        public a(String str, String str2, String str3, String str4) {
            this.f6506a = str;
            this.f6507b = str2;
            this.f6508c = str3;
            this.f6509d = str4;
        }

        /* renamed from: a */
        public final String m3247a() {
            return this.f6508c;
        }

        /* renamed from: b */
        public final String m3248b() {
            return this.f6506a;
        }

        /* renamed from: c */
        public final String m3249c() {
            return this.f6509d;
        }

        /* renamed from: d */
        public final String m3250d() {
            return this.f6507b;
        }
    }

    /* renamed from: com.withpersona.sdk2.inquiry.network.core.a$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Tuples2 tuples2 = (Tuples2) t;
            Tuples2 tuples22 = (Tuples2) t2;
            return ComparisonsKt.compareValues(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{tuples2.getFirst(), tuples2.getSecond()}), null, null, null, 0, null, null, 63, null), CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{tuples22.getFirst(), tuples22.getSecond()}), null, null, null, 0, null, null, 63, null));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Request m3234a(C43682a c43682a, Request request, Logger logger, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        return c43682a.m3241a(request, logger, j);
    }

    /* renamed from: b */
    public final String m3243b(RequestBody requestBody) throws IOException {
        Buffer buffer = new Buffer();
        requestBody.writeTo(buffer);
        return StringsKt.trim(buffer.readUtf8()).toString();
    }

    /* renamed from: c */
    public final JSONArray m3246c(RequestBody requestBody) {
        List<Tuples2<String, Object>> listM3245c = f6505a.m3245c(m3240a(requestBody));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM3245c, 10));
        Iterator<T> it = listM3245c.iterator();
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            String str = (String) tuples2.component1();
            String string2 = tuples2.component2().toString();
            arrayList.add(new Regex("^[+-]?\\d+(\\.\\d+)?$").matches(string2) ? Tuples4.m3642to(str, StringsKt.take(string2, 10)) : Tuples4.m3642to(str, new Regex("\\s").replace(string2, "")));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) ((Tuples2) obj).component2()).length() > 0) {
                arrayList2.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Object obj2 : arrayList2) {
            linkedHashMap.put((String) ((Tuples2) obj2).getFirst(), obj2);
        }
        List<Tuples2> listSortedWith = CollectionsKt.sortedWith(linkedHashMap.values(), new b());
        JSONArray jSONArray = new JSONArray();
        for (Tuples2 tuples22 : listSortedWith) {
            String str2 = (String) tuples22.component1();
            String str3 = (String) tuples22.component2();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str2);
            jSONArray2.put(str3);
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public final Request m3241a(Request request, Logger logger, long j) {
        a aVarM3236a = m3236a(j, request, logger);
        return aVarM3236a != null ? request.newBuilder().addHeader("NHMJLNRS", aVarM3236a.m3250d()).addHeader("STPBWSBB", aVarM3236a.m3248b()).addHeader("DNLGNZLZ", aVarM3236a.m3247a()).addHeader("TLJLGGDG", aVarM3236a.m3249c()).build() : request;
    }

    /* renamed from: b */
    public final boolean m3244b(List<String> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default((String) it.next(), "filename=", false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final a m3236a(long j, Request request, Logger logger) {
        String str = request.getHeaders().get("Authorization");
        RequestBody body = request.getBody();
        if (str == null || body == null) {
            return null;
        }
        try {
            String str2 = request.getHeaders().get(Headers.USER_AGENT);
            if (str2 != null && !StringsKt.isBlank(str2)) {
                Map mapMutableMapOf = MapsKt.mutableMapOf(Tuples4.m3642to(Headers.USER_AGENT, str2), Tuples4.m3642to("VTDGJLGG", request.getHeaders().get("VTDGJLGG")), Tuples4.m3642to("Persona-Device-Vendor-Id", request.getHeaders().get("Persona-Device-Vendor-Id")), Tuples4.m3642to("Persona-Version", request.getHeaders().get("Persona-Version")));
                mapMutableMapOf.put("TLJLGGDG", CollectionsKt.joinToString$default(SetsKt.plus((Set<? extends String>) mapMutableMapOf.keySet(), "TLJLGGDG"), ", ", null, null, 0, null, null, 62, null));
                Set setKeySet = mapMutableMapOf.keySet();
                Collection collectionValues = mapMutableMapOf.values();
                String str3 = (String) CollectionsKt.lastOrNull(StringsKt.split$default((CharSequence) str, new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null));
                if (str3 == null) {
                    logger.log(NetworkUtilsKt.SUBSYSTEM, Logger7.Error, "Auth token is null.");
                    return null;
                }
                String strOptString = new JSONObject(new String(Base64.decode((String) StringsKt.split$default((CharSequence) str3, new String[]{"."}, false, 0, 6, (Object) null).get(1), 0), Charsets.UTF_8)).optString(Claims.SUBJECT);
                if (strOptString != null && !StringsKt.isBlank(strOptString)) {
                    String strValueOf = String.valueOf(j / 1000);
                    return new a(m3237a(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{strOptString, strValueOf, StringsKt.replace$default(m3246c(body).toString(), "\\/", "/", false, 4, (Object) null)}), ":", null, null, 0, null, null, 62, null)), strValueOf, m3237a(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{CollectionsKt.joinToString$default(collectionValues, "", null, null, 0, null, null, 62, null), strValueOf, StringsKt.replace$default(m3246c(body).toString(), "\\/", "/", false, 4, (Object) null)}), ":", null, null, 0, null, null, 62, null)), CollectionsKt.joinToString$default(setKeySet, ", ", null, null, 0, null, null, 62, null));
                }
                logger.log(NetworkUtilsKt.SUBSYSTEM, Logger7.Error, "Session token is null.");
                return null;
            }
            logger.log(NetworkUtilsKt.SUBSYSTEM, Logger7.Error, "User agent is null.");
            return null;
        } catch (Exception e) {
            logger.log(NetworkUtilsKt.SUBSYSTEM, Logger7.Error, "An unexpected error occurred: " + e.getMessage() + ".");
            return null;
        }
    }

    /* renamed from: a */
    public final String m3237a(String str) {
        return HexExtensions.toHexString$default(MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8)), (HexFormat) null, 1, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r0v17, types: [org.json.JSONObject] */
    /* renamed from: a */
    public final List<Tuples2<String, Object>> m3240a(RequestBody requestBody) throws IOException {
        List<String> listEmptyList;
        List listListOf;
        String str;
        List listSplit$default;
        String jSONArray;
        MediaType contentType = requestBody.getContentType();
        if (contentType == null) {
            return CollectionsKt.listOf(Tuples4.m3642to("", m3243b(requestBody)));
        }
        if (Intrinsics.areEqual(contentType.getSubtype(), "json")) {
            String strM3243b = m3243b(requestBody);
            if (!Intrinsics.areEqual(strM3243b, "{}") && !Intrinsics.areEqual(strM3243b, "[]")) {
                if (StringsKt.startsWith$default(strM3243b, "{", false, 2, (Object) null)) {
                    jSONArray = new JSONObject(strM3243b);
                } else if (StringsKt.startsWith$default(strM3243b, "[", false, 2, (Object) null)) {
                    jSONArray = new JSONArray(strM3243b);
                }
                strM3243b = jSONArray;
            }
            if (strM3243b instanceof String) {
                return CollectionsKt.listOf(Tuples4.m3642to("", strM3243b));
            }
            return m3239a((Object) strM3243b);
        }
        if (Intrinsics.areEqual(contentType.getType(), "multipart")) {
            List<MultipartBody.Part> listParts = ((MultipartBody) requestBody).parts();
            ArrayList arrayList = new ArrayList();
            for (MultipartBody.Part part : listParts) {
                okhttp3.Headers headers = part.getHeaders();
                if (headers != null && (str = headers.get("Content-Disposition")) != null && (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{";"}, false, 0, 6, (Object) null)) != null) {
                    listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        listEmptyList.add(StringsKt.trim((String) it.next()).toString());
                    }
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                C43682a c43682a = f6505a;
                String strM3238a = c43682a.m3238a(listEmptyList);
                if (strM3238a != null) {
                    if (c43682a.m3244b(listEmptyList)) {
                        listListOf = CollectionsKt.listOf(Tuples4.m3642to(strM3238a, Long.valueOf(part.getBody().contentLength())));
                    } else {
                        List<Tuples2<String, Object>> listM3240a = c43682a.m3240a(part.getBody());
                        if (listM3240a.isEmpty()) {
                            listListOf = CollectionsKt.emptyList();
                        } else if (listM3240a.size() == 1) {
                            listListOf = CollectionsKt.listOf(Tuples4.m3642to(strM3238a, listM3240a.get(0).getSecond()));
                        } else {
                            throw new IllegalArgumentException("Request body parts must contain a single value. Instead got: " + listM3240a + ". Part name: " + strM3238a);
                        }
                    }
                    CollectionsKt.addAll(arrayList, listListOf);
                } else {
                    throw new IllegalArgumentException("Request body parts must have names.");
                }
            }
            return CollectionsKt.toList(arrayList);
        }
        if (Intrinsics.areEqual(contentType.getType(), "image")) {
            return CollectionsKt.listOf(Tuples4.m3642to("", Long.valueOf(requestBody.contentLength())));
        }
        throw new RuntimeException("Unsupported type: " + contentType);
    }

    /* renamed from: a */
    public final List<Tuples2<String, Object>> m3239a(Object obj) {
        ArrayList arrayList = new ArrayList();
        m3235a(this, obj, (String) null, arrayList, 2, (Object) null);
        return arrayList;
    }

    /* renamed from: a */
    public static /* synthetic */ void m3235a(C43682a c43682a, Object obj, String str, List list, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        c43682a.m3242a(obj, str, (List<Tuples2<String, Object>>) list);
    }

    /* renamed from: a */
    public final void m3242a(Object obj, String str, List<Tuples2<String, Object>> list) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                C43682a c43682a = f6505a;
                Object objOpt = jSONObject.opt(next);
                if (str != null) {
                    next = str + "[" + next + "]";
                }
                c43682a.m3242a(objOpt, next, list);
            }
            return;
        }
        if (!(obj instanceof JSONArray)) {
            if (str == null) {
                str = "";
            }
            list.add(Tuples4.m3642to(str, obj));
            return;
        }
        JSONArray jSONArray = (JSONArray) obj;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            m3242a(jSONArray.opt(i), str == null ? "[" + i + "]" : str + "[" + i + "]", list);
        }
    }

    /* renamed from: a */
    public final String m3238a(List<String> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.startsWith$default((String) next, "name=", false, 2, (Object) null)) {
                break;
            }
        }
        String str = (String) next;
        if (str != null) {
            return str.substring(6, str.length() - 1);
        }
        return null;
    }

    /* renamed from: c */
    public final List<Tuples2<String, Object>> m3245c(List<? extends Tuples2<String, ? extends Object>> list) {
        while (true) {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = false;
            for (Tuples2<String, ? extends Object> tuples2 : list) {
                String strComponent1 = tuples2.component1();
                Object objComponent2 = tuples2.component2();
                List listSplit$default = StringsKt.split$default((CharSequence) strComponent1, new String[]{"[]"}, false, 2, 2, (Object) null);
                if (listSplit$default.size() == 1) {
                    arrayList.add(Tuples4.m3642to(strComponent1, objComponent2));
                } else {
                    String str = (String) listSplit$default.get(0);
                    String str2 = (String) listSplit$default.get(1);
                    if (linkedHashMap.get(str) == null) {
                        linkedHashMap.put(str, 0);
                    }
                    if (!linkedHashSet.add(strComponent1) && !StringsKt.contains$default((CharSequence) str2, (CharSequence) "[]", false, 2, (Object) null)) {
                        Object obj = linkedHashMap.get(str);
                        if (obj != null) {
                            linkedHashMap.put(str, Integer.valueOf(((Number) obj).intValue() + 1));
                            linkedHashSet.clear();
                            linkedHashSet.add(strComponent1);
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    arrayList.add(Tuples4.m3642to(str + "[" + linkedHashMap.get(str) + "]" + str2, objComponent2));
                    z = true;
                }
            }
            if (!z) {
                return arrayList;
            }
            list = arrayList;
        }
    }
}
