package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope3;

/* compiled from: MemberScope.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class MemberScope2 {
    public abstract int getFullyExcludedDescriptorKinds();

    public String toString() {
        return getClass().getSimpleName();
    }

    /* compiled from: MemberScope.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude$NonExtensions */
    public static final class NonExtensions extends MemberScope2 {
        public static final NonExtensions INSTANCE = new NonExtensions();
        private static final int fullyExcludedDescriptorKinds;

        private NonExtensions() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope2
        public int getFullyExcludedDescriptorKinds() {
            return fullyExcludedDescriptorKinds;
        }

        static {
            MemberScope3.Companion companion = MemberScope3.Companion;
            fullyExcludedDescriptorKinds = (~(companion.getVARIABLES_MASK() | companion.getFUNCTIONS_MASK())) & companion.getALL_KINDS_MASK();
        }
    }

    /* compiled from: MemberScope.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude$TopLevelPackages */
    public static final class TopLevelPackages extends MemberScope2 {
        public static final TopLevelPackages INSTANCE = new TopLevelPackages();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope2
        public int getFullyExcludedDescriptorKinds() {
            return 0;
        }

        private TopLevelPackages() {
        }
    }
}
