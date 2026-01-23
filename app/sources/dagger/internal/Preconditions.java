package dagger.internal;

/* loaded from: classes21.dex */
public final class Preconditions {
    public static <T> T checkNotNull(T reference) {
        reference.getClass();
        return reference;
    }

    public static <T> T checkNotNull(T reference, String errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(errorMessage);
    }

    public static <T> T checkNotNullFromProvides(T reference) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static <T> void checkBuilderRequirement(T requirement, Class<T> clazz) {
        if (requirement != null) {
            return;
        }
        throw new IllegalStateException(clazz.getCanonicalName() + " must be set");
    }
}
