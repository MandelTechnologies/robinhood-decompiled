package com.robinhood.librobinhood.data.store.appointments;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.appointments.AppointmentsApi;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: AppointmentsStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/api/appointments/AppointmentsApi;", "appointmentsApi", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AppointmentsStore_Factory implements Factory<AppointmentsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AppointmentsApi> appointmentsApi;
    private final Provider<Clock> clock;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final AppointmentsStore_Factory create(Provider<Clock> provider, Provider<AppointmentsApi> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final AppointmentsStore newInstance(Clock clock, AppointmentsApi appointmentsApi, StoreBundle storeBundle) {
        return INSTANCE.newInstance(clock, appointmentsApi, storeBundle);
    }

    public AppointmentsStore_Factory(Provider<Clock> clock, Provider<AppointmentsApi> appointmentsApi, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(appointmentsApi, "appointmentsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.clock = clock;
        this.appointmentsApi = appointmentsApi;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public AppointmentsStore get() {
        Companion companion = INSTANCE;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        AppointmentsApi appointmentsApi = this.appointmentsApi.get();
        Intrinsics.checkNotNullExpressionValue(appointmentsApi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(clock, appointmentsApi, storeBundle);
    }

    /* compiled from: AppointmentsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/api/appointments/AppointmentsApi;", "appointmentsApi", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore_Factory;", "Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;", "newInstance", "(Lj$/time/Clock;Lcom/robinhood/api/appointments/AppointmentsApi;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;", "lib-store-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AppointmentsStore_Factory create(Provider<Clock> clock, Provider<AppointmentsApi> appointmentsApi, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(appointmentsApi, "appointmentsApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new AppointmentsStore_Factory(clock, appointmentsApi, storeBundle);
        }

        @JvmStatic
        public final AppointmentsStore newInstance(Clock clock, AppointmentsApi appointmentsApi, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(appointmentsApi, "appointmentsApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new AppointmentsStore(clock, appointmentsApi, storeBundle);
        }
    }
}
