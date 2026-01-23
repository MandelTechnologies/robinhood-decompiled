package com.plaid.internal;

import com.adjust.sdk.Constants;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* renamed from: com.plaid.internal.I4 */
/* loaded from: classes16.dex */
public final class C5869I4 {
    /* renamed from: a */
    public static String m1216a(String input) throws JsonSyntaxException {
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(input, "input");
        JsonElement string4 = JsonParser.parseString(input);
        if (string4.isJsonArray()) {
            JsonArray asJsonArray = string4.getAsJsonArray();
            Intrinsics.checkNotNullExpressionValue(asJsonArray, "getAsJsonArray(...)");
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                JsonElement next = it.next();
                if (next.isJsonObject()) {
                    JsonObject asJsonObject = next.getAsJsonObject();
                    Intrinsics.checkNotNull(asJsonObject);
                    if (asJsonObject.has(Constants.REFERRER_API_META)) {
                        JsonElement jsonElementRemove = asJsonObject.remove(Constants.REFERRER_API_META);
                        if (jsonElementRemove.isJsonObject()) {
                            Set<String> setKeySet = jsonElementRemove.getAsJsonObject().keySet();
                            Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
                            string3 = CollectionsKt.joinToString$default(setKeySet, null, null, null, 0, null, null, 63, null);
                        } else {
                            string3 = jsonElementRemove.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                        }
                        asJsonObject.addProperty(Constants.REFERRER_API_META, string3);
                    }
                    if (asJsonObject.has("balance")) {
                        JsonElement jsonElementRemove2 = asJsonObject.remove("balance");
                        if (jsonElementRemove2.isJsonObject()) {
                            Set<String> setKeySet2 = jsonElementRemove2.getAsJsonObject().keySet();
                            Intrinsics.checkNotNullExpressionValue(setKeySet2, "keySet(...)");
                            string2 = CollectionsKt.joinToString$default(setKeySet2, null, null, null, 0, null, null, 63, null);
                        } else {
                            string2 = jsonElementRemove2.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        }
                        asJsonObject.addProperty("balance", string2);
                    }
                }
            }
        } else if (string4.isJsonObject()) {
            JsonObject asJsonObject2 = string4.getAsJsonObject();
            Intrinsics.checkNotNullExpressionValue(asJsonObject2, "getAsJsonObject(...)");
            m1217a(asJsonObject2, Constants.REFERRER_API_META);
            m1217a(asJsonObject2, "balance");
        }
        String string5 = string4.toString();
        Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
        return string5;
    }

    /* renamed from: a */
    public static void m1217a(JsonObject jsonObject, String str) {
        String string2;
        if (jsonObject.has(str)) {
            JsonElement jsonElementRemove = jsonObject.remove(str);
            if (jsonElementRemove.isJsonObject()) {
                Set<String> setKeySet = jsonElementRemove.getAsJsonObject().keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
                string2 = CollectionsKt.joinToString$default(setKeySet, null, null, null, 0, null, null, 63, null);
            } else {
                string2 = jsonElementRemove.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            }
            jsonObject.addProperty(str, string2);
        }
    }
}
