package com.nimbusds.jose.shaded.asm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes27.dex */
public class BasicFiledFilter implements FieldFilter {
    public static final BasicFiledFilter SINGLETON = new BasicFiledFilter();

    @Override // com.nimbusds.jose.shaded.asm.FieldFilter
    public boolean canUse(Field field, Method method) {
        return true;
    }
}
