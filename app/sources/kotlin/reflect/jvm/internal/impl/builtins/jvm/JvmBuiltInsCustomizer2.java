package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* compiled from: JvmBuiltInsCustomizer.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns, reason: use source file name */
/* loaded from: classes14.dex */
final class JvmBuiltInsCustomizer2 extends KotlinBuiltIns {
    public static final Companion Companion = new Companion(null);
    private static final KotlinBuiltIns Instance = new JvmBuiltInsCustomizer2();

    private JvmBuiltInsCustomizer2() {
        super(new LockBasedStorageManager("FallbackBuiltIns"));
        createBuiltInsModule(true);
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns$Companion */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KotlinBuiltIns getInstance() {
            return JvmBuiltInsCustomizer2.Instance;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public PlatformDependentDeclarationFilter.All getPlatformDependentDeclarationFilter() {
        return PlatformDependentDeclarationFilter.All.INSTANCE;
    }
}
