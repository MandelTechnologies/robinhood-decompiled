package com.nimbusds.jose.shaded.asm;

import com.nimbusds.jose.shaded.ow2asm.Label;
import com.nimbusds.jose.shaded.ow2asm.MethodVisitor;
import com.nimbusds.jose.shaded.ow2asm.Type;
import com.plaid.internal.EnumC7081g;
import java.lang.reflect.Field;
import java.util.HashMap;

/* loaded from: classes27.dex */
public class ASMUtil {
    public static Accessor[] getAccessors(Class<?> cls, FieldFilter fieldFilter) {
        HashMap map = new HashMap();
        if (fieldFilter == null) {
            fieldFilter = BasicFiledFilter.SINGLETON;
        }
        while (cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                String name = field.getName();
                if (!map.containsKey(name)) {
                    Accessor accessor = new Accessor(cls, field, fieldFilter);
                    if (accessor.isUsable()) {
                        map.put(name, accessor);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return (Accessor[]) map.values().toArray(new Accessor[map.size()]);
    }

    protected static void autoBoxing(MethodVisitor methodVisitor, Type type2) {
        switch (type2.getSort()) {
            case 1:
                methodVisitor.visitMethodInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
                break;
            case 2:
                methodVisitor.visitMethodInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
                break;
            case 3:
                methodVisitor.visitMethodInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;", false);
                break;
            case 4:
                methodVisitor.visitMethodInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;", false);
                break;
            case 5:
                methodVisitor.visitMethodInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
                break;
            case 6:
                methodVisitor.visitMethodInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;", false);
                break;
            case 7:
                methodVisitor.visitMethodInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
                break;
            case 8:
                methodVisitor.visitMethodInsn(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
                break;
        }
    }

    public static Label[] newLabels(int i) {
        Label[] labelArr = new Label[i];
        for (int i2 = 0; i2 < i; i2++) {
            labelArr[i2] = new Label();
        }
        return labelArr;
    }

    public static String getSetterName(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 's';
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
