package com.robinhood.shared.security.store.workflow;

import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import identi.service.p471v1.RestIdentiIDLV1Service;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: WorkflowStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/security/store/workflow/WorkflowStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/security/store/workflow/WorkflowStore;", "Ljavax/inject/Provider;", "Lidenti/service/v1/RestIdentiIDLV1Service;", "identiService", "Lcom/robinhood/analytics/SharedEventLogger;", "eventLogger", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/shared/security/store/workflow/WorkflowStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class WorkflowStore_Factory implements Factory<WorkflowStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<SharedEventLogger> eventLogger;
    private final Provider<RestIdentiIDLV1Service> identiService;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final WorkflowStore_Factory create(Provider<RestIdentiIDLV1Service> provider, Provider<SharedEventLogger> provider2, Provider<Clock> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final WorkflowStore newInstance(RestIdentiIDLV1Service restIdentiIDLV1Service, SharedEventLogger sharedEventLogger, Clock clock, StoreBundle storeBundle) {
        return INSTANCE.newInstance(restIdentiIDLV1Service, sharedEventLogger, clock, storeBundle);
    }

    public WorkflowStore_Factory(Provider<RestIdentiIDLV1Service> identiService, Provider<SharedEventLogger> eventLogger, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(identiService, "identiService");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.identiService = identiService;
        this.eventLogger = eventLogger;
        this.clock = clock;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public WorkflowStore get() {
        Companion companion = INSTANCE;
        RestIdentiIDLV1Service restIdentiIDLV1Service = this.identiService.get();
        Intrinsics.checkNotNullExpressionValue(restIdentiIDLV1Service, "get(...)");
        SharedEventLogger sharedEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(sharedEventLogger, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(restIdentiIDLV1Service, sharedEventLogger, clock, storeBundle);
    }

    /* compiled from: WorkflowStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/security/store/workflow/WorkflowStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lidenti/service/v1/RestIdentiIDLV1Service;", "identiService", "Lcom/robinhood/analytics/SharedEventLogger;", "eventLogger", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/shared/security/store/workflow/WorkflowStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/shared/security/store/workflow/WorkflowStore_Factory;", "Lcom/robinhood/shared/security/store/workflow/WorkflowStore;", "newInstance", "(Lidenti/service/v1/RestIdentiIDLV1Service;Lcom/robinhood/analytics/SharedEventLogger;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/shared/security/store/workflow/WorkflowStore;", "lib-store-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WorkflowStore_Factory create(Provider<RestIdentiIDLV1Service> identiService, Provider<SharedEventLogger> eventLogger, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(identiService, "identiService");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new WorkflowStore_Factory(identiService, eventLogger, clock, storeBundle);
        }

        @JvmStatic
        public final WorkflowStore newInstance(RestIdentiIDLV1Service identiService, SharedEventLogger eventLogger, Clock clock, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(identiService, "identiService");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new WorkflowStore(identiService, eventLogger, clock, storeBundle);
        }
    }
}
