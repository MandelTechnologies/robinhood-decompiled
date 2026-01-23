package com.robinhood.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: Classes.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a-\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b\u001a\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\t\u001a\u00020\u0005\u001aC\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u000b\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00012\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\r\"\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0002\u0010\u000e\u001a\u0018\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0010*\u0006\u0012\u0002\b\u00030\u0001\u001a\u0012\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001\u001a\u000e\u0010\u0012\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0001¨\u0006\u0013"}, m3636d2 = {"getDeclaredClass", "Ljava/lang/Class;", "T", "", "simpleName", "", "upperBound", "getDeclaredFieldOrNull", "Ljava/lang/reflect/Field;", "name", "getDeclaredConstructorOrNull", "Ljava/lang/reflect/Constructor;", "parameterTypes", "", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "declaringClasses", "Lkotlin/sequences/Sequence;", "findOutermostDeclaringClass", "guessFilename", "lib-reflect"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.reflect.ClassesKt, reason: use source file name */
/* loaded from: classes19.dex */
public final class Classes2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Class<? extends T> getDeclaredClass(Class<?> cls, String simpleName, Class<T> upperBound) throws ClassNotFoundException {
        Class<?> cls2;
        Class<? extends T> cls3;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(simpleName, "simpleName");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i];
            if (Intrinsics.areEqual(cls2.getSimpleName(), simpleName)) {
                break;
            }
            i++;
        }
        if (cls2 != null && (cls3 = (Class<? extends T>) cls2.asSubclass(upperBound)) != null) {
            return cls3;
        }
        String string2 = Arrays.toString(cls.getDeclaredClasses());
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        throw new ClassNotFoundException("No declared class named " + simpleName + " enclosed in " + cls + ": " + string2);
    }

    public static final /* synthetic */ <T> Class<? extends T> getDeclaredClass(Class<?> cls, String simpleName) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(simpleName, "simpleName");
        Intrinsics.reifiedOperationMarker(4, "T");
        return getDeclaredClass(cls, simpleName, Object.class);
    }

    public static final Field getDeclaredFieldOrNull(Class<?> cls, String name) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return cls.getDeclaredField(name);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static final <T> Constructor<? extends T> getDeclaredConstructorOrNull(Class<? extends T> cls, Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Sequence<Class<?>> declaringClasses(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return SequencesKt.generateSequence(cls, (Function1<? super Class<?>, ? extends Class<?>>) new Function1() { // from class: com.robinhood.reflect.ClassesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Classes2.declaringClasses$lambda$1((Class) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class declaringClasses$lambda$1(Class it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getDeclaringClass();
    }

    public static final Class<?> findOutermostDeclaringClass(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return (Class) SequencesKt.last(declaringClasses(cls));
    }

    public static final String guessFilename(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Class<?> clsFindOutermostDeclaringClass = findOutermostDeclaringClass(cls);
        String name = clsFindOutermostDeclaringClass.getPackage().getName();
        if (name == null) {
            name = "";
        }
        String name2 = clsFindOutermostDeclaringClass.getName();
        Intrinsics.checkNotNull(name2);
        return StringsKt.substringAfter$default(name2, name + ".", (String) null, 2, (Object) null) + ".kt";
    }
}
