package com.nimbusds.jose.shaded.json;

import com.nimbusds.jose.shaded.asm.FieldFilter;
import com.nimbusds.jose.shaded.json.annotate.JsonIgnore;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes27.dex */
public class JSONUtil {
    public static final JsonSmartFieldFilter JSON_SMART_FIELD_FILTER = new JsonSmartFieldFilter();

    public static class JsonSmartFieldFilter implements FieldFilter {
        @Override // com.nimbusds.jose.shaded.asm.FieldFilter
        public boolean canUse(Field field, Method method) {
            JsonIgnore jsonIgnore = (JsonIgnore) method.getAnnotation(JsonIgnore.class);
            return jsonIgnore == null || !jsonIgnore.value();
        }
    }

    public static String getGetterName(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 'g';
        cArr[1] = 'e';
        cArr[2] = 't';
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            cCharAt = (char) (cCharAt - ' ');
        }
        cArr[3] = cCharAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 3] = str.charAt(i);
        }
        return new String(cArr);
    }

    public static String getIsName(String str) {
        int length = str.length();
        char[] cArr = new char[length + 2];
        cArr[0] = 'i';
        cArr[1] = 's';
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            cCharAt = (char) (cCharAt - ' ');
        }
        cArr[2] = cCharAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 2] = str.charAt(i);
        }
        return new String(cArr);
    }
}
