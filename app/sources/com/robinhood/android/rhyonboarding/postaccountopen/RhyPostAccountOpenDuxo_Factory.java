package com.robinhood.android.rhyonboarding.postaccountopen;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyPostAccountOpenDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenDuxo;", "rhyAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhyPostAccountOpenDuxo_Factory implements Factory<RhyPostAccountOpenDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<RhyPostAccountOpenStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RhyPostAccountOpenDuxo_Factory create(Provider<RhyAccountStore> provider, Provider<EventLogger> provider2, Provider<RhyPostAccountOpenStateProvider> provider3, Provider<DuxoBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final RhyPostAccountOpenDuxo newInstance(RhyAccountStore rhyAccountStore, EventLogger eventLogger, RhyPostAccountOpenStateProvider rhyPostAccountOpenStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(rhyAccountStore, eventLogger, rhyPostAccountOpenStateProvider, duxoBundle);
    }

    public RhyPostAccountOpenDuxo_Factory(Provider<RhyAccountStore> rhyAccountStore, Provider<EventLogger> eventLogger, Provider<RhyPostAccountOpenStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.rhyAccountStore = rhyAccountStore;
        this.eventLogger = eventLogger;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public RhyPostAccountOpenDuxo get() {
        Companion companion = INSTANCE;
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        RhyPostAccountOpenStateProvider rhyPostAccountOpenStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(rhyPostAccountOpenStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(rhyAccountStore, eventLogger, rhyPostAccountOpenStateProvider, duxoBundle);
    }

    /* compiled from: RhyPostAccountOpenDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenDuxo_Factory;", "rhyAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenDuxo;", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhyPostAccountOpenDuxo_Factory create(Provider<RhyAccountStore> rhyAccountStore, Provider<EventLogger> eventLogger, Provider<RhyPostAccountOpenStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new RhyPostAccountOpenDuxo_Factory(rhyAccountStore, eventLogger, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final RhyPostAccountOpenDuxo newInstance(RhyAccountStore rhyAccountStore, EventLogger eventLogger, RhyPostAccountOpenStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new RhyPostAccountOpenDuxo(rhyAccountStore, eventLogger, stateProvider, duxoBundle);
        }
    }
}
