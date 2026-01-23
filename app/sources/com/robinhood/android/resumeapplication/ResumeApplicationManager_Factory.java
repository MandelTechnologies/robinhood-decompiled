package com.robinhood.android.resumeapplication;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.resumeapplication.api.ResumeApplicationApi;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.Installation;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.inject.MicrogramComponent;
import p479j$.time.Clock;

/* compiled from: ResumeApplicationManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bi\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/resumeapplication/ResumeApplicationManager;", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/android/resumeapplication/api/ResumeApplicationApi;", "resumeApplicationApi", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/Installation;", "installation", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/resumeapplication/ResumeApplicationManager;", "Ljavax/inject/Provider;", "Companion", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ResumeApplicationManager_Factory implements Factory<ResumeApplicationManager> {
    private final Provider<AppType> appType;
    private final Provider<Clock> clock;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<Installation> installation;
    private final Provider<MicrogramComponent.Factory> microgramComponentFactory;
    private final Provider<ResumeApplicationApi> resumeApplicationApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ResumeApplicationManager_Factory create(Provider<AppType> provider, Provider<CoroutineScope> provider2, Provider<ResumeApplicationApi> provider3, Provider<ExperimentsStore> provider4, Provider<Clock> provider5, Provider<Installation> provider6, Provider<MicrogramComponent.Factory> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final ResumeApplicationManager newInstance(AppType appType, CoroutineScope coroutineScope, ResumeApplicationApi resumeApplicationApi, ExperimentsStore experimentsStore, Clock clock, Installation installation, MicrogramComponent.Factory factory) {
        return INSTANCE.newInstance(appType, coroutineScope, resumeApplicationApi, experimentsStore, clock, installation, factory);
    }

    public ResumeApplicationManager_Factory(Provider<AppType> appType, Provider<CoroutineScope> coroutineScope, Provider<ResumeApplicationApi> resumeApplicationApi, Provider<ExperimentsStore> experimentsStore, Provider<Clock> clock, Provider<Installation> installation, Provider<MicrogramComponent.Factory> microgramComponentFactory) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(resumeApplicationApi, "resumeApplicationApi");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        this.appType = appType;
        this.coroutineScope = coroutineScope;
        this.resumeApplicationApi = resumeApplicationApi;
        this.experimentsStore = experimentsStore;
        this.clock = clock;
        this.installation = installation;
        this.microgramComponentFactory = microgramComponentFactory;
    }

    @Override // javax.inject.Provider
    public ResumeApplicationManager get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        ResumeApplicationApi resumeApplicationApi = this.resumeApplicationApi.get();
        Intrinsics.checkNotNullExpressionValue(resumeApplicationApi, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        Installation installation = this.installation.get();
        Intrinsics.checkNotNullExpressionValue(installation, "get(...)");
        MicrogramComponent.Factory factory = this.microgramComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        return companion.newInstance(appType, coroutineScope, resumeApplicationApi, experimentsStore, clock, installation, factory);
    }

    /* compiled from: ResumeApplicationManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0014\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationManager_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/android/resumeapplication/api/ResumeApplicationApi;", "resumeApplicationApi", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/Installation;", "installation", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/android/resumeapplication/ResumeApplicationManager_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/resumeapplication/ResumeApplicationManager_Factory;", "Lcom/robinhood/android/resumeapplication/ResumeApplicationManager;", "newInstance", "(Lcom/robinhood/shared/app/type/AppType;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/android/resumeapplication/api/ResumeApplicationApi;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lj$/time/Clock;Lcom/robinhood/prefs/Installation;Lmicrogram/android/inject/MicrogramComponent$Factory;)Lcom/robinhood/android/resumeapplication/ResumeApplicationManager;", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ResumeApplicationManager_Factory create(Provider<AppType> appType, Provider<CoroutineScope> coroutineScope, Provider<ResumeApplicationApi> resumeApplicationApi, Provider<ExperimentsStore> experimentsStore, Provider<Clock> clock, Provider<Installation> installation, Provider<MicrogramComponent.Factory> microgramComponentFactory) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(resumeApplicationApi, "resumeApplicationApi");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            return new ResumeApplicationManager_Factory(appType, coroutineScope, resumeApplicationApi, experimentsStore, clock, installation, microgramComponentFactory);
        }

        @JvmStatic
        public final ResumeApplicationManager newInstance(AppType appType, CoroutineScope coroutineScope, ResumeApplicationApi resumeApplicationApi, ExperimentsStore experimentsStore, Clock clock, Installation installation, MicrogramComponent.Factory microgramComponentFactory) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(resumeApplicationApi, "resumeApplicationApi");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            return new ResumeApplicationManager(appType, coroutineScope, resumeApplicationApi, experimentsStore, clock, installation, microgramComponentFactory);
        }
    }
}
