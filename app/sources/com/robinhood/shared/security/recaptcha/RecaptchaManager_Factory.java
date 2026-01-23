package com.robinhood.shared.security.recaptcha;

import android.app.Application;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.targetbackend.TargetBackend;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecaptchaManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB@\u0012\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004\u0012\u0011\u0010\u0007\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00060\u0004\u0012\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00060\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/security/recaptcha/RecaptchaManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "Lkotlin/jvm/JvmSuppressWildcards;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-recaptcha_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class RecaptchaManager_Factory implements Factory<RecaptchaManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> app;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<TargetBackend> targetBackend;

    @JvmStatic
    public static final RecaptchaManager_Factory create(Provider<Application> provider, Provider<TargetBackend> provider2, Provider<ExperimentsStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final RecaptchaManager newInstance(Lazy<Application> lazy, Lazy<TargetBackend> lazy2, Lazy<ExperimentsStore> lazy3) {
        return INSTANCE.newInstance(lazy, lazy2, lazy3);
    }

    public RecaptchaManager_Factory(Provider<Application> app, Provider<TargetBackend> targetBackend, Provider<ExperimentsStore> experimentsStore) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.app = app;
        this.targetBackend = targetBackend;
        this.experimentsStore = experimentsStore;
    }

    @Override // javax.inject.Provider
    public RecaptchaManager get() {
        Companion companion = INSTANCE;
        Lazy<Application> lazy = DoubleCheck.lazy(this.app);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        Lazy<TargetBackend> lazy2 = DoubleCheck.lazy(this.targetBackend);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        Lazy<ExperimentsStore> lazy3 = DoubleCheck.lazy(this.experimentsStore);
        Intrinsics.checkNotNullExpressionValue(lazy3, "lazy(...)");
        return companion.newInstance(lazy, lazy2, lazy3);
    }

    /* compiled from: RecaptchaManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u00072\u0011\u0010\n\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\t0\u00072\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\t0\u0007H\u0007JA\u0010\u000e\u001a\u00020\u000f2\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u00102\u0011\u0010\n\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\t0\u00102\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\t0\u0010H\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/security/recaptcha/RecaptchaManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/security/recaptcha/RecaptchaManager_Factory;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "Lkotlin/jvm/JvmSuppressWildcards;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "newInstance", "Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;", "Ldagger/Lazy;", "lib-recaptcha_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RecaptchaManager_Factory create(Provider<Application> app, Provider<TargetBackend> targetBackend, Provider<ExperimentsStore> experimentsStore) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            return new RecaptchaManager_Factory(app, targetBackend, experimentsStore);
        }

        @JvmStatic
        public final RecaptchaManager newInstance(Lazy<Application> app, Lazy<TargetBackend> targetBackend, Lazy<ExperimentsStore> experimentsStore) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            return new RecaptchaManager(app, targetBackend, experimentsStore);
        }
    }
}
