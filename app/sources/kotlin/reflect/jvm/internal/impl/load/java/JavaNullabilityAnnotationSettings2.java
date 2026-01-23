package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates, reason: use source file name */
/* loaded from: classes21.dex */
public interface JavaNullabilityAnnotationSettings2<T> {
    public static final Companion Companion = Companion.$$INSTANCE;

    T get(FqName fqName);

    /* compiled from: JavaNullabilityAnnotationSettings.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final JavaNullabilityAnnotationSettings2 EMPTY = new JavaNullabilityAnnotationSettings3(MapsKt.emptyMap());

        private Companion() {
        }

        public final JavaNullabilityAnnotationSettings2 getEMPTY() {
            return EMPTY;
        }
    }
}
