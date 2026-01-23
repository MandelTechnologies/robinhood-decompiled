package com.twilio.twilsock.util;

import io.ktor.http.Parameters3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonElement6;

/* compiled from: MultiMap.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"toMultiMap", "Lcom/twilio/twilsock/util/MultiMap;", "", "Lio/ktor/http/ParametersBuilder;", "Lkotlinx/serialization/json/JsonObject;", "twilsock_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.twilio.twilsock.util.MultiMapKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class MultiMap2 {
    public static final MultiMap<String, String> toMultiMap(Parameters3 parameters3) {
        Intrinsics.checkNotNullParameter(parameters3, "<this>");
        MultiMap<String, String> multiMap = new MultiMap<>();
        Iterator<T> it = parameters3.entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            multiMap.putAll((String) entry.getKey(), (List) entry.getValue());
        }
        return multiMap;
    }

    public static final MultiMap<String, String> toMultiMap(JsonElement6 jsonElement6) {
        Intrinsics.checkNotNullParameter(jsonElement6, "<this>");
        MultiMap<String, String> multiMap = new MultiMap<>();
        for (Map.Entry<String, JsonElement> entry : jsonElement6.entrySet()) {
            multiMap.set(entry.getKey(), JsonElement3.getJsonPrimitive(entry.getValue()).getContent());
        }
        return multiMap;
    }
}
