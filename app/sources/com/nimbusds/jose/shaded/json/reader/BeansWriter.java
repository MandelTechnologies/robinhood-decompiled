package com.nimbusds.jose.shaded.json.reader;

import com.nimbusds.jose.shaded.json.JSONStyle;
import com.nimbusds.jose.shaded.json.JSONUtil;
import com.plaid.internal.EnumC7081g;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes27.dex */
public class BeansWriter implements JsonWriterI<Object> {
    @Override // com.nimbusds.jose.shaded.json.reader.JsonWriterI
    public <E> void writeJSONString(E e, Appendable appendable, JSONStyle jSONStyle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IOException, IllegalArgumentException, InvocationTargetException {
        Method declaredMethod;
        Object objInvoke;
        Class<?> type2;
        try {
            jSONStyle.objectStart(appendable);
            boolean z = false;
            for (Class<?> superclass = e.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
                for (Field field : superclass.getDeclaredFields()) {
                    int modifiers = field.getModifiers();
                    if ((modifiers & EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE) <= 0) {
                        if ((modifiers & 1) > 0) {
                            objInvoke = field.get(e);
                        } else {
                            try {
                                declaredMethod = superclass.getDeclaredMethod(JSONUtil.getGetterName(field.getName()), null);
                            } catch (Exception unused) {
                                declaredMethod = null;
                            }
                            if (declaredMethod == null && ((type2 = field.getType()) == Boolean.TYPE || type2 == Boolean.class)) {
                                declaredMethod = superclass.getDeclaredMethod(JSONUtil.getIsName(field.getName()), null);
                            }
                            if (declaredMethod != null) {
                                objInvoke = declaredMethod.invoke(e, null);
                            }
                        }
                        if (objInvoke != null || !jSONStyle.ignoreNull()) {
                            if (z) {
                                jSONStyle.objectNext(appendable);
                            } else {
                                z = true;
                            }
                            JsonWriter.writeJSONKV(field.getName(), objInvoke, appendable, jSONStyle);
                        }
                    }
                }
            }
            jSONStyle.objectStop(appendable);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
