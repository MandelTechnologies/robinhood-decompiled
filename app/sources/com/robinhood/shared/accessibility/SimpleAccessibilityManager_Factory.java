package com.robinhood.shared.accessibility;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.experiments.ExperimentsProvider;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimpleAccessibilityManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB-\u0012\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004\u0012\u0011\u0010\u0007\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/accessibility/SimpleAccessibilityManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/accessibility/SimpleAccessibilityManager;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "Lkotlin/jvm/JvmSuppressWildcards;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-a11y_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SimpleAccessibilityManager_Factory implements Factory<SimpleAccessibilityManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Context> context;
    private final Provider<ExperimentsProvider> experimentsProvider;

    @JvmStatic
    public static final SimpleAccessibilityManager_Factory create(Provider<Context> provider, Provider<ExperimentsProvider> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final SimpleAccessibilityManager newInstance(Lazy<Context> lazy, Lazy<ExperimentsProvider> lazy2) {
        return INSTANCE.newInstance(lazy, lazy2);
    }

    public SimpleAccessibilityManager_Factory(Provider<Context> context, Provider<ExperimentsProvider> experimentsProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        this.context = context;
        this.experimentsProvider = experimentsProvider;
    }

    @Override // javax.inject.Provider
    public SimpleAccessibilityManager get() {
        Companion companion = INSTANCE;
        Lazy<Context> lazy = DoubleCheck.lazy(this.context);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        Lazy<ExperimentsProvider> lazy2 = DoubleCheck.lazy(this.experimentsProvider);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        return companion.newInstance(lazy, lazy2);
    }

    /* compiled from: SimpleAccessibilityManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u00072\u0011\u0010\n\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\t0\u0007H\u0007J.\u0010\f\u001a\u00020\r2\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u000e2\u0011\u0010\n\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\t0\u000eH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/accessibility/SimpleAccessibilityManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/accessibility/SimpleAccessibilityManager_Factory;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "Lkotlin/jvm/JvmSuppressWildcards;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "newInstance", "Lcom/robinhood/shared/accessibility/SimpleAccessibilityManager;", "Ldagger/Lazy;", "lib-a11y_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SimpleAccessibilityManager_Factory create(Provider<Context> context, Provider<ExperimentsProvider> experimentsProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            return new SimpleAccessibilityManager_Factory(context, experimentsProvider);
        }

        @JvmStatic
        public final SimpleAccessibilityManager newInstance(Lazy<Context> context, Lazy<ExperimentsProvider> experimentsProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            return new SimpleAccessibilityManager(context, experimentsProvider);
        }
    }
}
