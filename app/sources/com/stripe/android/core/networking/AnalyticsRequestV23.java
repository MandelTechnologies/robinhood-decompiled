package com.stripe.android.core.networking;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement2;
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonElement6;

/* compiled from: AnalyticsRequestV2.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0002\u001a\u00020\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"", "Lkotlinx/serialization/json/JsonElement;", "toJsonElement", "(Ljava/util/List;)Lkotlinx/serialization/json/JsonElement;", "", "(Ljava/util/Map;)Lkotlinx/serialization/json/JsonElement;", "stripe-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.stripe.android.core.networking.AnalyticsRequestV2Kt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AnalyticsRequestV23 {
    private static final JsonElement toJsonElement(List<?> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : CollectionsKt.filterNotNull(list)) {
            if (obj instanceof Map) {
                arrayList.add(toJsonElement((Map<?, ?>) obj));
            } else if (obj instanceof List) {
                arrayList.add(toJsonElement((List<?>) obj));
            } else {
                arrayList.add(JsonElement3.JsonPrimitive(obj.toString()));
            }
        }
        return new JsonElement2(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonElement toJsonElement(Map<?, ?> map) {
        Object value;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null && (value = entry.getValue()) != null) {
                if (value instanceof Map) {
                    linkedHashMap.put(str, toJsonElement((Map<?, ?>) value));
                } else if (value instanceof List) {
                    linkedHashMap.put(str, toJsonElement((List<?>) value));
                } else {
                    linkedHashMap.put(str, JsonElement3.JsonPrimitive(value.toString()));
                }
            }
        }
        return new JsonElement6(linkedHashMap);
    }
}
