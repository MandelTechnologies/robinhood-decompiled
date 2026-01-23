package com.stripe.android.core.networking;

import com.stripe.android.core.exception.InvalidSerializationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement2;
import kotlinx.serialization.json.JsonElement5;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElement7;

/* compiled from: JsonUtils.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a\u0016\u0010\u0000\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u0001*\u00020\u0003H\u0007\u001a\u0016\u0010\u0000\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u0001*\u00020\u0004H\u0007\u001a\u0010\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006*\u00020\u0007H\u0007\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\b*\u00020\u0003H\u0007¨\u0006\t"}, m3636d2 = {"toMap", "", "", "Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/json/JsonObject;", "toPrimitives", "", "Lkotlinx/serialization/json/JsonArray;", "", "stripe-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.stripe.android.core.networking.JsonUtilsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class JsonUtils2 {
    public static final Map<String, ?> toMap(JsonElement jsonElement) throws InvalidSerializationException {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        if (jsonElement instanceof JsonElement6) {
            return toMap((JsonElement6) jsonElement);
        }
        String simpleName = jsonElement.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        throw new InvalidSerializationException(simpleName);
    }

    public static final Object toPrimitives(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        if (Intrinsics.areEqual(jsonElement, JsonElement5.INSTANCE)) {
            return null;
        }
        if (jsonElement instanceof JsonElement2) {
            return toPrimitives((JsonElement2) jsonElement);
        }
        if (jsonElement instanceof JsonElement6) {
            return toMap((JsonElement6) jsonElement);
        }
        if (!(jsonElement instanceof JsonElement7)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Regex("^\"|\"$").replace(((JsonElement7) jsonElement).getContent(), "");
    }

    public static final List<?> toPrimitives(JsonElement2 jsonElement2) {
        Intrinsics.checkNotNullParameter(jsonElement2, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(jsonElement2, 10));
        Iterator<JsonElement> it = jsonElement2.iterator();
        while (it.hasNext()) {
            arrayList.add(toPrimitives(it.next()));
        }
        return arrayList;
    }

    public static final Map<String, ?> toMap(JsonElement6 jsonElement6) {
        Intrinsics.checkNotNullParameter(jsonElement6, "<this>");
        ArrayList arrayList = new ArrayList(jsonElement6.size());
        for (Map.Entry<String, JsonElement> entry : jsonElement6.entrySet()) {
            arrayList.add(Tuples4.m3642to(entry.getKey(), toPrimitives(entry.getValue())));
        }
        return MapsKt.toMap(arrayList);
    }
}
