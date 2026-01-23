package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.types.KotlinType4;

/* compiled from: LocalClassifierTypeSettings.kt */
/* loaded from: classes21.dex */
public interface LocalClassifierTypeSettings {
    KotlinType4 getReplacementTypeForLocalClassifiers();

    /* compiled from: LocalClassifierTypeSettings.kt */
    public static final class Default implements LocalClassifierTypeSettings {
        public static final Default INSTANCE = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings
        public KotlinType4 getReplacementTypeForLocalClassifiers() {
            return null;
        }

        private Default() {
        }
    }
}
