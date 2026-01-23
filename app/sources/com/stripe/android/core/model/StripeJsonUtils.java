package com.stripe.android.core.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StripeJsonUtils.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\tJ/\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001a2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u0004\u0018\u00010\u00042\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\u001a¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b&\u0010'¨\u0006("}, m3636d2 = {"Lcom/stripe/android/core/model/StripeJsonUtils;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "", "fieldName", "optString", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "optCurrency", "", "values", "Lorg/json/JSONArray;", "listToJsonArray", "(Ljava/util/List;)Lorg/json/JSONArray;", "", "optBoolean", "(Lorg/json/JSONObject;Ljava/lang/String;)Z", "", "optInteger", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "", "optLong", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "optCountryCode", "", "optMap", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/Map;", "jsonObjectToMap", "(Lorg/json/JSONObject;)Ljava/util/Map;", "jsonArray", "jsonArrayToList", "(Lorg/json/JSONArray;)Ljava/util/List;", "mapObject", "mapToJsonObject", "(Ljava/util/Map;)Lorg/json/JSONObject;", "possibleNull", "nullIfNullOrEmpty", "(Ljava/lang/String;)Ljava/lang/String;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class StripeJsonUtils {
    public static final StripeJsonUtils INSTANCE = new StripeJsonUtils();

    private StripeJsonUtils() {
    }

    public final /* synthetic */ boolean optBoolean(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        return jsonObject.has(fieldName) && jsonObject.optBoolean(fieldName, false);
    }

    public final /* synthetic */ Integer optInteger(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        if (jsonObject.has(fieldName)) {
            return Integer.valueOf(jsonObject.optInt(fieldName));
        }
        return null;
    }

    public final /* synthetic */ Long optLong(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        if (jsonObject.has(fieldName)) {
            return Long.valueOf(jsonObject.optLong(fieldName));
        }
        return null;
    }

    @JvmStatic
    public static final String optString(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        return INSTANCE.nullIfNullOrEmpty(jsonObject != null ? jsonObject.optString(fieldName) : null);
    }

    public final /* synthetic */ String optCountryCode(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        String strNullIfNullOrEmpty = nullIfNullOrEmpty(jsonObject.optString(fieldName));
        if (strNullIfNullOrEmpty == null || strNullIfNullOrEmpty.length() != 2) {
            return null;
        }
        return strNullIfNullOrEmpty;
    }

    @JvmStatic
    public static final String optCurrency(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        String strNullIfNullOrEmpty = INSTANCE.nullIfNullOrEmpty(jsonObject.optString(fieldName));
        if (strNullIfNullOrEmpty == null || strNullIfNullOrEmpty.length() != 3) {
            return null;
        }
        return strNullIfNullOrEmpty;
    }

    public final /* synthetic */ Map optMap(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(fieldName);
        if (jSONObjectOptJSONObject != null) {
            return INSTANCE.jsonObjectToMap(jSONObjectOptJSONObject);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Map jsonObjectToMap(JSONObject jsonObject) {
        Map mapMapOf;
        if (jsonObject == null) {
            return null;
        }
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames == null) {
            jSONArrayNames = new JSONArray();
        }
        PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, jSONArrayNames.length());
        ArrayList<String> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until, 10));
        Iterator<Integer> it = primitiveRanges2Until.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArrayNames.getString(((PrimitiveIterators6) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            Object objOpt = jsonObject.opt(str);
            if (objOpt != null) {
                Intrinsics.checkNotNull(objOpt);
                if (Intrinsics.areEqual(objOpt, "null")) {
                    mapMapOf = null;
                } else {
                    if (objOpt instanceof JSONObject) {
                        objOpt = INSTANCE.jsonObjectToMap((JSONObject) objOpt);
                    } else if (objOpt instanceof JSONArray) {
                        objOpt = INSTANCE.jsonArrayToList((JSONArray) objOpt);
                    }
                    mapMapOf = MapsKt.mapOf(Tuples4.m3642to(str, objOpt));
                }
            }
            if (mapMapOf != null) {
                arrayList2.add(mapMapOf);
            }
        }
        Map mapEmptyMap = MapsKt.emptyMap();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            mapEmptyMap = MapsKt.plus(mapEmptyMap, (Map) it2.next());
        }
        return mapEmptyMap;
    }

    public final /* synthetic */ List jsonArrayToList(JSONArray jsonArray) {
        if (jsonArray == null) {
            return null;
        }
        PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, jsonArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until, 10));
        Iterator<Integer> it = primitiveRanges2Until.iterator();
        while (it.hasNext()) {
            arrayList.add(jsonArray.get(((PrimitiveIterators6) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object objJsonObjectToMap : arrayList) {
            if (objJsonObjectToMap instanceof JSONArray) {
                objJsonObjectToMap = INSTANCE.jsonArrayToList((JSONArray) objJsonObjectToMap);
            } else if (objJsonObjectToMap instanceof JSONObject) {
                objJsonObjectToMap = INSTANCE.jsonObjectToMap((JSONObject) objJsonObjectToMap);
            } else if (Intrinsics.areEqual(objJsonObjectToMap, "null")) {
                objJsonObjectToMap = null;
            }
            if (objJsonObjectToMap != null) {
                arrayList2.add(objJsonObjectToMap);
            }
        }
        return arrayList2;
    }

    public final JSONObject mapToJsonObject(Map<String, ?> mapObject) {
        if (mapObject == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : mapObject.keySet()) {
            Object obj = mapObject.get(str);
            if (obj != null) {
                try {
                    if (obj instanceof Map) {
                        jSONObject.put(str, mapToJsonObject((Map) obj));
                    } else if (obj instanceof List) {
                        jSONObject.put(str, listToJsonArray((List) obj));
                    } else if ((obj instanceof Number) || (obj instanceof Boolean)) {
                        jSONObject.put(str, obj);
                    } else {
                        jSONObject.put(str, obj.toString());
                    }
                } catch (ClassCastException | JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    private final JSONArray listToJsonArray(List<?> values) {
        if (values == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object objValueOf : values) {
            if (objValueOf instanceof Map) {
                objValueOf = INSTANCE.mapToJsonObject((Map) objValueOf);
            } else if (objValueOf instanceof List) {
                objValueOf = INSTANCE.listToJsonArray((List) objValueOf);
            } else if (!(objValueOf instanceof Number) && !(objValueOf instanceof Boolean)) {
                objValueOf = String.valueOf(objValueOf);
            }
            jSONArray.put(objValueOf);
        }
        return jSONArray;
    }

    public final /* synthetic */ String nullIfNullOrEmpty(String possibleNull) {
        if (possibleNull == null || Intrinsics.areEqual("null", possibleNull) || possibleNull.length() == 0) {
            return null;
        }
        return possibleNull;
    }
}
