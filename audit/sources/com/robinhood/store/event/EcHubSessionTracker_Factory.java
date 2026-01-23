package com.robinhood.store.event;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.event.p186db.dao.EcHubObjectsSessionUpdateRecordDao;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: EcHubSessionTracker_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\t\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/store/event/EcHubSessionTracker_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/event/EcHubSessionTracker;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/models/event/db/dao/EcHubObjectsSessionUpdateRecordDao;", "ecHubObjectsSessionUpdateRecordDao", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/store/event/EcHubSessionTracker;", "Ljavax/inject/Provider;", "Companion", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EcHubSessionTracker_Factory implements Factory<EcHubSessionTracker> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<EcHubObjectsSessionUpdateRecordDao> ecHubObjectsSessionUpdateRecordDao;

    @JvmStatic
    public static final EcHubSessionTracker_Factory create(Provider<EcHubObjectsSessionUpdateRecordDao> provider, Provider<Clock> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final EcHubSessionTracker newInstance(EcHubObjectsSessionUpdateRecordDao ecHubObjectsSessionUpdateRecordDao, Clock clock) {
        return INSTANCE.newInstance(ecHubObjectsSessionUpdateRecordDao, clock);
    }

    public EcHubSessionTracker_Factory(Provider<EcHubObjectsSessionUpdateRecordDao> ecHubObjectsSessionUpdateRecordDao, Provider<Clock> clock) {
        Intrinsics.checkNotNullParameter(ecHubObjectsSessionUpdateRecordDao, "ecHubObjectsSessionUpdateRecordDao");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.ecHubObjectsSessionUpdateRecordDao = ecHubObjectsSessionUpdateRecordDao;
        this.clock = clock;
    }

    @Override // javax.inject.Provider
    public EcHubSessionTracker get() {
        Companion companion = INSTANCE;
        EcHubObjectsSessionUpdateRecordDao ecHubObjectsSessionUpdateRecordDao = this.ecHubObjectsSessionUpdateRecordDao.get();
        Intrinsics.checkNotNullExpressionValue(ecHubObjectsSessionUpdateRecordDao, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        return companion.newInstance(ecHubObjectsSessionUpdateRecordDao, clock);
    }

    /* compiled from: EcHubSessionTracker_Factory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/store/event/EcHubSessionTracker_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/models/event/db/dao/EcHubObjectsSessionUpdateRecordDao;", "ecHubObjectsSessionUpdateRecordDao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/event/EcHubSessionTracker_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/store/event/EcHubSessionTracker_Factory;", "Lcom/robinhood/store/event/EcHubSessionTracker;", "newInstance", "(Lcom/robinhood/android/models/event/db/dao/EcHubObjectsSessionUpdateRecordDao;Lj$/time/Clock;)Lcom/robinhood/store/event/EcHubSessionTracker;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EcHubSessionTracker_Factory create(Provider<EcHubObjectsSessionUpdateRecordDao> ecHubObjectsSessionUpdateRecordDao, Provider<Clock> clock) {
            Intrinsics.checkNotNullParameter(ecHubObjectsSessionUpdateRecordDao, "ecHubObjectsSessionUpdateRecordDao");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new EcHubSessionTracker_Factory(ecHubObjectsSessionUpdateRecordDao, clock);
        }

        @JvmStatic
        public final EcHubSessionTracker newInstance(EcHubObjectsSessionUpdateRecordDao ecHubObjectsSessionUpdateRecordDao, Clock clock) {
            Intrinsics.checkNotNullParameter(ecHubObjectsSessionUpdateRecordDao, "ecHubObjectsSessionUpdateRecordDao");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new EcHubSessionTracker(ecHubObjectsSessionUpdateRecordDao, clock);
        }
    }
}
