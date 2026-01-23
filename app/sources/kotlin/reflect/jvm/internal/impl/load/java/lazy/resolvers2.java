package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;

/* compiled from: resolvers.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver, reason: use source file name */
/* loaded from: classes21.dex */
public interface resolvers2 {
    TypeParameterDescriptor resolveTypeParameter(JavaTypeParameter javaTypeParameter);

    /* compiled from: resolvers.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver$EMPTY */
    public static final class EMPTY implements resolvers2 {
        public static final EMPTY INSTANCE = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.resolvers2
        public TypeParameterDescriptor resolveTypeParameter(JavaTypeParameter javaTypeParameter) {
            Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
            return null;
        }

        private EMPTY() {
        }
    }
}
