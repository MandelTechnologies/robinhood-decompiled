package com.nimbusds.jose.shaded.asm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes27.dex */
public class Accessor {
    protected Field field;
    protected String fieldName;
    protected Type genericType;
    protected Method getter;
    protected int index;
    protected Method setter;

    /* renamed from: type, reason: collision with root package name */
    protected Class<?> f9862type;

    public int getIndex() {
        return this.index;
    }

    public boolean isPublic() {
        return this.setter == null && this.getter == null;
    }

    public boolean isEnum() {
        return this.f9862type.isEnum();
    }

    public String getName() {
        return this.fieldName;
    }

    public Class<?> getType() {
        return this.f9862type;
    }

    public boolean isUsable() {
        return (this.field == null && this.getter == null && this.setter == null) ? false : true;
    }

    public boolean isReadable() {
        return (this.field == null && this.getter == null) ? false : true;
    }

    public boolean isWritable() {
        return (this.field == null && this.getter == null) ? false : true;
    }

    public Accessor(Class<?> cls, Field field, FieldFilter fieldFilter) {
        String getterName;
        this.fieldName = field.getName();
        int modifiers = field.getModifiers();
        if ((modifiers & 136) > 0) {
            return;
        }
        if ((modifiers & 1) > 0) {
            this.field = field;
        }
        try {
            this.setter = cls.getDeclaredMethod(ASMUtil.getSetterName(field.getName()), field.getType());
        } catch (Exception unused) {
        }
        boolean zEquals = field.getType().equals(Boolean.TYPE);
        if (zEquals) {
            getterName = ASMUtil.getIsName(field.getName());
        } else {
            getterName = ASMUtil.getGetterName(field.getName());
        }
        try {
            this.getter = cls.getDeclaredMethod(getterName, null);
        } catch (Exception unused2) {
        }
        if (this.getter == null && zEquals) {
            try {
                this.getter = cls.getDeclaredMethod(ASMUtil.getGetterName(field.getName()), null);
            } catch (Exception unused3) {
            }
        }
        if (this.field == null && this.getter == null && this.setter == null) {
            return;
        }
        Method method = this.getter;
        if (method != null && !fieldFilter.canUse(field, method)) {
            this.getter = null;
        }
        Method method2 = this.setter;
        if (method2 != null && !fieldFilter.canUse(field, method2)) {
            this.setter = null;
        }
        if (this.getter == null && this.setter == null && this.field == null) {
            return;
        }
        this.f9862type = field.getType();
        this.genericType = field.getGenericType();
    }
}
