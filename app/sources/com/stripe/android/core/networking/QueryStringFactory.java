package com.stripe.android.core.networking;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.core.exception.InvalidRequestException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* compiled from: QueryStringFactory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004J\u001a\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004J\u001a\u0010\b\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0002J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\u0005H\u0002J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002J\u0014\u0010\u0013\u001a\u00020\u00122\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¨\u0006\u0016"}, m3636d2 = {"Lcom/stripe/android/core/networking/QueryStringFactory;", "", "()V", "compactParams", "", "", "params", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "createFromParamsWithEmptyValues", "flattenParams", "", "Lcom/stripe/android/core/networking/QueryStringFactory$Parameter;", "flattenParamsList", "keyPrefix", "flattenParamsMap", "flattenParamsValue", "value", "isPrimitive", "", "isPrimitiveList", "l", "Parameter", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class QueryStringFactory {
    public static final QueryStringFactory INSTANCE = new QueryStringFactory();

    private QueryStringFactory() {
    }

    public final String create(Map<String, ?> params) {
        return CollectionsKt.joinToString$default(flattenParams(params), "&", null, null, 0, null, new Function1<Parameter, CharSequence>() { // from class: com.stripe.android.core.networking.QueryStringFactory.create.1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(Parameter it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.toString();
            }
        }, 30, null);
    }

    public final String createFromParamsWithEmptyValues(Map<String, ?> params) {
        QueryStringFactory queryStringFactory;
        Map<String, Object> mapCompactParams;
        String strCreate;
        return (params == null || (mapCompactParams = (queryStringFactory = INSTANCE).compactParams(params)) == null || (strCreate = queryStringFactory.create(mapCompactParams)) == null) ? "" : strCreate;
    }

    public final Map<String, Object> compactParams(Map<String, ?> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        HashMap map = new HashMap(params);
        Iterator it = new HashSet(map.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = map.get(str);
            if (obj instanceof Map) {
                Intrinsics.checkNotNull(str);
                map.put(str, compactParams((Map) obj));
            } else if (obj == null) {
                map.remove(str);
            }
        }
        return map;
    }

    private final List<Parameter> flattenParams(Map<String, ?> params) throws InvalidRequestException {
        return flattenParamsMap$default(this, params, null, 2, null);
    }

    private final boolean isPrimitive(Object value) {
        return (value instanceof String) || (value instanceof Number) || (value instanceof Boolean) || (value instanceof Character);
    }

    private final boolean isPrimitiveList(List<?> l) {
        List<?> list = l;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!INSTANCE.isPrimitive(it.next())) {
                return false;
            }
        }
        return true;
    }

    private final List<Parameter> flattenParamsList(List<?> params, String keyPrefix) throws InvalidRequestException {
        if (params.isEmpty()) {
            return CollectionsKt.listOf(new Parameter(keyPrefix, ""));
        }
        if (isPrimitiveList(params)) {
            String str = keyPrefix + "[]";
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = params.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, INSTANCE.flattenParamsValue(it.next(), str));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : params) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt.addAll(arrayList2, INSTANCE.flattenParamsValue(obj, keyPrefix + "[" + i + "]"));
            i = i2;
        }
        return arrayList2;
    }

    static /* synthetic */ List flattenParamsMap$default(QueryStringFactory queryStringFactory, Map map, String str, int i, Object obj) throws InvalidRequestException {
        if ((i & 2) != 0) {
            str = null;
        }
        return queryStringFactory.flattenParamsMap(map, str);
    }

    private final List<Parameter> flattenParamsValue(Object value, String keyPrefix) throws InvalidRequestException {
        if (value instanceof Map) {
            return flattenParamsMap((Map) value, keyPrefix);
        }
        if (value instanceof List) {
            return flattenParamsList((List) value, keyPrefix);
        }
        if (value == null) {
            return CollectionsKt.listOf(new Parameter(keyPrefix, ""));
        }
        return CollectionsKt.listOf(new Parameter(keyPrefix, value.toString()));
    }

    /* compiled from: QueryStringFactory.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/stripe/android/core/networking/QueryStringFactory$Parameter;", "", "", "key", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "str", "urlEncode", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final /* data */ class Parameter {
        private final String key;
        private final String value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameter)) {
                return false;
            }
            Parameter parameter = (Parameter) other;
            return Intrinsics.areEqual(this.key, parameter.key) && Intrinsics.areEqual(this.value, parameter.value);
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.value.hashCode();
        }

        public Parameter(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.key = key;
            this.value = value;
        }

        public String toString() throws UnsupportedEncodingException {
            return urlEncode(this.key) + "=" + urlEncode(this.value);
        }

        private final String urlEncode(String str) throws UnsupportedEncodingException {
            String strEncode = URLEncoder.encode(str, Charsets.UTF_8.name());
            Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
            return strEncode;
        }
    }

    private final List<Parameter> flattenParamsMap(Map<String, ?> params, String keyPrefix) throws InvalidRequestException {
        if (params == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (keyPrefix != null) {
                String str = keyPrefix + "[" + key + "]";
                if (str != null) {
                    key = str;
                }
            }
            CollectionsKt.addAll(arrayList, INSTANCE.flattenParamsValue(value, key));
        }
        return arrayList;
    }
}
