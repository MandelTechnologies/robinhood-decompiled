package com.squareup.wire.internal;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireEnumConstant;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMapping;
import kotlin.jvm.internal.ArrayIterator2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* compiled from: EnumJsonFormatter.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/squareup/wire/internal/EnumJsonFormatter;", "E", "Lcom/squareup/wire/WireEnum;", "Lcom/squareup/wire/internal/JsonFormatter;", "adapter", "Lcom/squareup/wire/EnumAdapter;", "<init>", "(Lcom/squareup/wire/EnumAdapter;)V", "stringToValue", "", "", "valueToString", "unrecognizedClassConstructor", "Ljava/lang/reflect/Constructor;", "fromString", "value", "(Ljava/lang/String;)Lcom/squareup/wire/WireEnum;", "toStringOrNumber", "", "(Lcom/squareup/wire/WireEnum;)Ljava/lang/Object;", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class EnumJsonFormatter<E extends WireEnum> implements JsonFormatter<E> {
    private final Map<String, E> stringToValue;
    private Constructor<E> unrecognizedClassConstructor;
    private final Map<E, String> valueToString;

    /* JADX WARN: Multi-variable type inference failed */
    public EnumJsonFormatter(EnumAdapter<E> adapter) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        Annotation annotation;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        KClass<?> type2 = adapter.getType();
        Intrinsics.checkNotNull(type2);
        Class javaClass = JvmClassMapping.getJavaClass(type2);
        Intrinsics.checkNotNull(javaClass, "null cannot be cast to non-null type java.lang.Class<E of com.squareup.wire.internal.EnumJsonFormatter>");
        WireEnum[] wireEnumArr = (WireEnum[]) javaClass.getEnumConstants();
        if (wireEnumArr == null) {
            Iterator it = ArrayIterator2.iterator(javaClass.getDeclaredClasses());
            while (it.hasNext()) {
                Class cls = (Class) it.next();
                String simpleName = cls.getSimpleName();
                if (!Intrinsics.areEqual(simpleName, "Companion")) {
                    Field[] declaredFields = cls.getDeclaredFields();
                    Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
                    Field field = (Field) ArraysKt.first(declaredFields);
                    if (Intrinsics.areEqual(field.getName(), "INSTANCE")) {
                        Object obj = field.get(null);
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type E of com.squareup.wire.internal.EnumJsonFormatter");
                        WireEnum wireEnum = (WireEnum) obj;
                        linkedHashMap.put(cls.getSimpleName(), wireEnum);
                        linkedHashMap.put(String.valueOf(wireEnum.getValue()), wireEnum);
                        linkedHashMap2.put(wireEnum, simpleName);
                        Annotation[] annotations = cls.getAnnotations();
                        Intrinsics.checkNotNullExpressionValue(annotations, "getAnnotations(...)");
                        int length = annotations.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                annotation = null;
                                break;
                            }
                            annotation = annotations[i];
                            if (annotation instanceof WireEnumConstant) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        WireEnumConstant wireEnumConstant = annotation instanceof WireEnumConstant ? (WireEnumConstant) annotation : null;
                        if (wireEnumConstant != null && wireEnumConstant.declaredName().length() > 0) {
                            linkedHashMap.put(wireEnumConstant.declaredName(), wireEnum);
                            linkedHashMap2.put(wireEnum, wireEnumConstant.declaredName());
                        }
                    } else {
                        Constructor<?>[] constructors = cls.getConstructors();
                        Intrinsics.checkNotNullExpressionValue(constructors, "getConstructors(...)");
                        Object objFirst = ArraysKt.first(constructors);
                        Intrinsics.checkNotNull(objFirst, "null cannot be cast to non-null type java.lang.reflect.Constructor<E of com.squareup.wire.internal.EnumJsonFormatter>");
                        this.unrecognizedClassConstructor = (Constructor) objFirst;
                    }
                }
            }
        } else {
            Iterator it2 = ArrayIterator2.iterator(wireEnumArr);
            while (it2.hasNext()) {
                WireEnum wireEnum2 = (WireEnum) it2.next();
                Intrinsics.checkNotNull(wireEnum2, "null cannot be cast to non-null type kotlin.Enum<*>");
                String strName = ((Enum) wireEnum2).name();
                linkedHashMap.put(strName, wireEnum2);
                linkedHashMap.put(String.valueOf(wireEnum2.getValue()), wireEnum2);
                linkedHashMap2.put(wireEnum2, strName);
                WireEnumConstant wireEnumConstant2 = (WireEnumConstant) javaClass.getDeclaredField(strName).getAnnotation(WireEnumConstant.class);
                if (wireEnumConstant2 != null && wireEnumConstant2.declaredName().length() > 0) {
                    linkedHashMap.put(wireEnumConstant2.declaredName(), wireEnum2);
                    linkedHashMap2.put(wireEnum2, wireEnumConstant2.declaredName());
                }
            }
        }
        this.stringToValue = linkedHashMap;
        this.valueToString = linkedHashMap2;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public E fromString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        E e = this.stringToValue.get(value);
        if (e == null) {
            Integer intOrNull = StringsKt.toIntOrNull(value);
            e = null;
            if (intOrNull != null) {
                int iIntValue = intOrNull.intValue();
                Constructor<E> constructor = this.unrecognizedClassConstructor;
                if (constructor != null) {
                    return constructor.newInstance(Integer.valueOf(iIntValue));
                }
            }
        }
        return e;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Object toStringOrNumber(E value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String str = this.valueToString.get(value);
        return str == null ? Integer.valueOf(value.getValue()) : str;
    }
}
