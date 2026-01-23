package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: javaTypes.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypesKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class javaTypes5 {
    public static final boolean isSuperWildcard(javaTypes4 javatypes4) {
        javaTypes6 javatypes6 = javatypes4 instanceof javaTypes6 ? (javaTypes6) javatypes4 : null;
        return (javatypes6 == null || javatypes6.getBound() == null || javatypes6.isExtends()) ? false : true;
    }
}
