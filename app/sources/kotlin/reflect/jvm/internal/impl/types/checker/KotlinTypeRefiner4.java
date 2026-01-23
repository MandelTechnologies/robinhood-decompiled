package kotlin.reflect.jvm.internal.impl.types.checker;

/* compiled from: KotlinTypeRefiner.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport, reason: use source file name */
/* loaded from: classes23.dex */
public abstract class KotlinTypeRefiner4 {
    private final boolean isEnabled;

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    /* compiled from: KotlinTypeRefiner.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport$Enabled */
    public static final class Enabled extends KotlinTypeRefiner4 {
        private final KotlinTypeRefiner typeRefiner;

        public final KotlinTypeRefiner getTypeRefiner() {
            return this.typeRefiner;
        }
    }
}
