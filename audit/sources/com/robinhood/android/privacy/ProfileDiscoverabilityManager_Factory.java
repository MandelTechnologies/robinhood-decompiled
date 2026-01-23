package com.robinhood.android.privacy;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileDiscoverabilityManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/privacy/ProfileDiscoverabilityManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/privacy/ProfileDiscoverabilityManager;", "identi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Identi;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-privacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ProfileDiscoverabilityManager_Factory implements Factory<ProfileDiscoverabilityManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Identi> identi;
    private final Provider<RxFactory> rxFactory;

    @JvmStatic
    public static final ProfileDiscoverabilityManager_Factory create(Provider<Identi> provider, Provider<RxFactory> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final ProfileDiscoverabilityManager newInstance(Identi identi2, RxFactory rxFactory) {
        return INSTANCE.newInstance(identi2, rxFactory);
    }

    public ProfileDiscoverabilityManager_Factory(Provider<Identi> identi2, Provider<RxFactory> rxFactory) {
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.identi = identi2;
        this.rxFactory = rxFactory;
    }

    @Override // javax.inject.Provider
    public ProfileDiscoverabilityManager get() {
        Companion companion = INSTANCE;
        Identi identi2 = this.identi.get();
        Intrinsics.checkNotNullExpressionValue(identi2, "get(...)");
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        return companion.newInstance(identi2, rxFactory);
    }

    /* compiled from: ProfileDiscoverabilityManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/privacy/ProfileDiscoverabilityManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/privacy/ProfileDiscoverabilityManager_Factory;", "identi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Identi;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "newInstance", "Lcom/robinhood/android/privacy/ProfileDiscoverabilityManager;", "lib-privacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ProfileDiscoverabilityManager_Factory create(Provider<Identi> identi2, Provider<RxFactory> rxFactory) {
            Intrinsics.checkNotNullParameter(identi2, "identi");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new ProfileDiscoverabilityManager_Factory(identi2, rxFactory);
        }

        @JvmStatic
        public final ProfileDiscoverabilityManager newInstance(Identi identi2, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(identi2, "identi");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new ProfileDiscoverabilityManager(identi2, rxFactory);
        }
    }
}
