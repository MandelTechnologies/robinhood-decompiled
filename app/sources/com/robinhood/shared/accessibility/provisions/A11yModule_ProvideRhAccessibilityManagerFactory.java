package com.robinhood.shared.accessibility.provisions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.accessibility.RhAccessibilityManager;
import com.robinhood.shared.accessibility.SimpleAccessibilityManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: A11yModule_ProvideRhAccessibilityManagerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/accessibility/provisions/A11yModule_ProvideRhAccessibilityManagerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/accessibility/RhAccessibilityManager;", "accessibilityManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/accessibility/SimpleAccessibilityManager;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-a11y-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class A11yModule_ProvideRhAccessibilityManagerFactory implements Factory<RhAccessibilityManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<SimpleAccessibilityManager> accessibilityManager;

    @JvmStatic
    public static final A11yModule_ProvideRhAccessibilityManagerFactory create(Provider<SimpleAccessibilityManager> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final RhAccessibilityManager provideRhAccessibilityManager(SimpleAccessibilityManager simpleAccessibilityManager) {
        return INSTANCE.provideRhAccessibilityManager(simpleAccessibilityManager);
    }

    public A11yModule_ProvideRhAccessibilityManagerFactory(Provider<SimpleAccessibilityManager> accessibilityManager) {
        Intrinsics.checkNotNullParameter(accessibilityManager, "accessibilityManager");
        this.accessibilityManager = accessibilityManager;
    }

    @Override // javax.inject.Provider
    public RhAccessibilityManager get() {
        Companion companion = INSTANCE;
        SimpleAccessibilityManager simpleAccessibilityManager = this.accessibilityManager.get();
        Intrinsics.checkNotNullExpressionValue(simpleAccessibilityManager, "get(...)");
        return companion.provideRhAccessibilityManager(simpleAccessibilityManager);
    }

    /* compiled from: A11yModule_ProvideRhAccessibilityManagerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/accessibility/provisions/A11yModule_ProvideRhAccessibilityManagerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/accessibility/provisions/A11yModule_ProvideRhAccessibilityManagerFactory;", "accessibilityManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/accessibility/SimpleAccessibilityManager;", "provideRhAccessibilityManager", "Lcom/robinhood/shared/accessibility/RhAccessibilityManager;", "lib-a11y-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final A11yModule_ProvideRhAccessibilityManagerFactory create(Provider<SimpleAccessibilityManager> accessibilityManager) {
            Intrinsics.checkNotNullParameter(accessibilityManager, "accessibilityManager");
            return new A11yModule_ProvideRhAccessibilityManagerFactory(accessibilityManager);
        }

        @JvmStatic
        public final RhAccessibilityManager provideRhAccessibilityManager(SimpleAccessibilityManager accessibilityManager) {
            Intrinsics.checkNotNullParameter(accessibilityManager, "accessibilityManager");
            Object objCheckNotNull = Preconditions.checkNotNull(A11yModule.INSTANCE.provideRhAccessibilityManager(accessibilityManager), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (RhAccessibilityManager) objCheckNotNull;
        }
    }
}
