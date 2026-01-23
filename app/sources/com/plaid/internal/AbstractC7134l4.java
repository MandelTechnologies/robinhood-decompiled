package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElement7;

/* renamed from: com.plaid.internal.l4 */
/* loaded from: classes16.dex */
public abstract class AbstractC7134l4 {

    /* renamed from: a */
    public final String f2919a;

    /* renamed from: com.plaid.internal.l4$a */
    public static final class a {
        /* renamed from: a */
        public static AbstractC7134l4 m1549a(String jsonString) throws Exception {
            JsonElement7 jsonPrimitive;
            Integer intOrNull;
            JsonElement jsonElement;
            JsonElement7 jsonPrimitive2;
            JsonElement7 jsonPrimitive3;
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            JsonElement6 jsonObject = JsonElement3.getJsonObject(Json.INSTANCE.parseToJsonElement(jsonString));
            JsonElement jsonElement2 = (JsonElement) jsonObject.get((Object) "url");
            String content = null;
            String content2 = (jsonElement2 == null || (jsonPrimitive3 = JsonElement3.getJsonPrimitive(jsonElement2)) == null) ? null : jsonPrimitive3.getContent();
            Intrinsics.checkNotNull(content2);
            JsonElement jsonElement3 = (JsonElement) jsonObject.get((Object) "mobile_sdk_url_open_message");
            JsonElement6 jsonObject2 = jsonElement3 != null ? JsonElement3.getJsonObject(jsonElement3) : null;
            if (jsonObject2 != null && (jsonElement = (JsonElement) jsonObject2.get((Object) "android_url_open_behavior")) != null && (jsonPrimitive2 = JsonElement3.getJsonPrimitive(jsonElement)) != null) {
                content = jsonPrimitive2.getContent();
            }
            if (content != null) {
                int iHashCode = content.hashCode();
                int iIntValue = 0;
                if (iHashCode != -1436496974) {
                    if (iHashCode != -844381507) {
                        if (iHashCode != 1225038860) {
                            if (iHashCode == 1926770975 && content.equals("ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB")) {
                                return new c(content2);
                            }
                        } else if (content.equals("ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER")) {
                            return new b(content2);
                        }
                    } else if (content.equals("ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB")) {
                        JsonElement jsonElement4 = (JsonElement) jsonObject2.get((Object) "android_partial_custom_tab_screen_height_pixels");
                        if (jsonElement4 != null && (jsonPrimitive = JsonElement3.getJsonPrimitive(jsonElement4)) != null && (intOrNull = JsonElement3.getIntOrNull(jsonPrimitive)) != null) {
                            iIntValue = intOrNull.intValue();
                        }
                        return new d(content2, iIntValue);
                    }
                } else if (content.equals("ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN")) {
                    return new d(content2, 0);
                }
            }
            throw new Exception("android_url_open_behavior not supported :" + content);
        }
    }

    /* renamed from: com.plaid.internal.l4$b */
    public static final class b extends AbstractC7134l4 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String url) {
            super(url);
            Intrinsics.checkNotNullParameter(url, "url");
        }
    }

    /* renamed from: com.plaid.internal.l4$c */
    public static final class c extends AbstractC7134l4 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String url) {
            super(url);
            Intrinsics.checkNotNullParameter(url, "url");
        }
    }

    /* renamed from: com.plaid.internal.l4$d */
    public static final class d extends AbstractC7134l4 {

        /* renamed from: b */
        public final int f2920b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String url, int i) {
            super(url);
            Intrinsics.checkNotNullParameter(url, "url");
            this.f2920b = i;
        }
    }

    public AbstractC7134l4(String str) {
        this.f2919a = str;
    }
}
