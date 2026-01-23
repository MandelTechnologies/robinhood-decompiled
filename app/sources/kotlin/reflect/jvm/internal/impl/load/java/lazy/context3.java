package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* compiled from: context.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings, reason: use source file name */
/* loaded from: classes21.dex */
public interface context3 {
    public static final Companion Companion = Companion.$$INSTANCE;

    boolean getCorrectNullabilityForNotNullTypeParameter();

    boolean getEnhancePrimitiveArrays();

    boolean getIgnoreNullabilityForErasedValueParameters();

    boolean getTypeEnhancementImprovementsInStrictMode();

    /* compiled from: context.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings$Default */
    public static final class Default implements context3 {
        public static final Default INSTANCE = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.context3
        public boolean getCorrectNullabilityForNotNullTypeParameter() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.context3
        public boolean getEnhancePrimitiveArrays() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.context3
        public boolean getIgnoreNullabilityForErasedValueParameters() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.context3
        public boolean getTypeEnhancementImprovementsInStrictMode() {
            return false;
        }

        private Default() {
        }
    }

    /* compiled from: context.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings$Companion */
    /* loaded from: classes14.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
