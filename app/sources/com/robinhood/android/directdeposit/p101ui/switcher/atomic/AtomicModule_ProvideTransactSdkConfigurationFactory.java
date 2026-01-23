package com.robinhood.android.directdeposit.p101ui.switcher.atomic;

import android.content.res.Resources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AtomicModule_ProvideTransactSdkConfigurationFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicModule_ProvideTransactSdkConfigurationFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration;", "resources", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AtomicModule_ProvideTransactSdkConfigurationFactory implements Factory<TransactConfiguration> {
    private final Provider<Resources> resources;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AtomicModule_ProvideTransactSdkConfigurationFactory create(Provider<Resources> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final TransactConfiguration provideTransactSdkConfiguration(Resources resources) {
        return INSTANCE.provideTransactSdkConfiguration(resources);
    }

    public AtomicModule_ProvideTransactSdkConfigurationFactory(Provider<Resources> resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // javax.inject.Provider
    public TransactConfiguration get() {
        Companion companion = INSTANCE;
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        return companion.provideTransactSdkConfiguration(resources);
    }

    /* compiled from: AtomicModule_ProvideTransactSdkConfigurationFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicModule_ProvideTransactSdkConfigurationFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicModule_ProvideTransactSdkConfigurationFactory;", "resources", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "provideTransactSdkConfiguration", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AtomicModule_ProvideTransactSdkConfigurationFactory create(Provider<Resources> resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            return new AtomicModule_ProvideTransactSdkConfigurationFactory(resources);
        }

        @JvmStatic
        public final TransactConfiguration provideTransactSdkConfiguration(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Object objCheckNotNull = Preconditions.checkNotNull(AtomicModule.INSTANCE.provideTransactSdkConfiguration(resources), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (TransactConfiguration) objCheckNotNull;
        }
    }
}
