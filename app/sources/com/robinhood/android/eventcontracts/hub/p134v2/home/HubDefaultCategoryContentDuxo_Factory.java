package com.robinhood.android.eventcontracts.hub.p134v2.home;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.store.event.EcHubLayoutStore;
import com.robinhood.store.event.EventContractPositionStore;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.EventStateStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HubDefaultCategoryContentDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDuxo;", "ecHubLayoutStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/event/EcHubLayoutStore;", "eventStateStore", "Lcom/robinhood/store/event/EventStateStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventContractPositionStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class HubDefaultCategoryContentDuxo_Factory implements Factory<HubDefaultCategoryContentDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EcHubLayoutStore> ecHubLayoutStore;
    private final Provider<EventContractPositionStore> eventContractPositionStore;
    private final Provider<EventMarketdataStore> eventMarketdataStore;
    private final Provider<EventStateStore> eventStateStore;
    private final Provider<ExperimentsStore> experimentsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final HubDefaultCategoryContentDuxo_Factory create(Provider<EcHubLayoutStore> provider, Provider<EventStateStore> provider2, Provider<EventMarketdataStore> provider3, Provider<EventContractPositionStore> provider4, Provider<ExperimentsStore> provider5, Provider<DuxoBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final HubDefaultCategoryContentDuxo newInstance(EcHubLayoutStore ecHubLayoutStore, EventStateStore eventStateStore, EventMarketdataStore eventMarketdataStore, EventContractPositionStore eventContractPositionStore, ExperimentsStore experimentsStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(ecHubLayoutStore, eventStateStore, eventMarketdataStore, eventContractPositionStore, experimentsStore, duxoBundle);
    }

    public HubDefaultCategoryContentDuxo_Factory(Provider<EcHubLayoutStore> ecHubLayoutStore, Provider<EventStateStore> eventStateStore, Provider<EventMarketdataStore> eventMarketdataStore, Provider<EventContractPositionStore> eventContractPositionStore, Provider<ExperimentsStore> experimentsStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(ecHubLayoutStore, "ecHubLayoutStore");
        Intrinsics.checkNotNullParameter(eventStateStore, "eventStateStore");
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.ecHubLayoutStore = ecHubLayoutStore;
        this.eventStateStore = eventStateStore;
        this.eventMarketdataStore = eventMarketdataStore;
        this.eventContractPositionStore = eventContractPositionStore;
        this.experimentsStore = experimentsStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public HubDefaultCategoryContentDuxo get() {
        Companion companion = INSTANCE;
        EcHubLayoutStore ecHubLayoutStore = this.ecHubLayoutStore.get();
        Intrinsics.checkNotNullExpressionValue(ecHubLayoutStore, "get(...)");
        EventStateStore eventStateStore = this.eventStateStore.get();
        Intrinsics.checkNotNullExpressionValue(eventStateStore, "get(...)");
        EventMarketdataStore eventMarketdataStore = this.eventMarketdataStore.get();
        Intrinsics.checkNotNullExpressionValue(eventMarketdataStore, "get(...)");
        EventContractPositionStore eventContractPositionStore = this.eventContractPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(eventContractPositionStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(ecHubLayoutStore, eventStateStore, eventMarketdataStore, eventContractPositionStore, experimentsStore, duxoBundle);
    }

    /* compiled from: HubDefaultCategoryContentDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDuxo_Factory;", "ecHubLayoutStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/event/EcHubLayoutStore;", "eventStateStore", "Lcom/robinhood/store/event/EventStateStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventContractPositionStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDuxo;", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HubDefaultCategoryContentDuxo_Factory create(Provider<EcHubLayoutStore> ecHubLayoutStore, Provider<EventStateStore> eventStateStore, Provider<EventMarketdataStore> eventMarketdataStore, Provider<EventContractPositionStore> eventContractPositionStore, Provider<ExperimentsStore> experimentsStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(ecHubLayoutStore, "ecHubLayoutStore");
            Intrinsics.checkNotNullParameter(eventStateStore, "eventStateStore");
            Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
            Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new HubDefaultCategoryContentDuxo_Factory(ecHubLayoutStore, eventStateStore, eventMarketdataStore, eventContractPositionStore, experimentsStore, duxoBundle);
        }

        @JvmStatic
        public final HubDefaultCategoryContentDuxo newInstance(EcHubLayoutStore ecHubLayoutStore, EventStateStore eventStateStore, EventMarketdataStore eventMarketdataStore, EventContractPositionStore eventContractPositionStore, ExperimentsStore experimentsStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(ecHubLayoutStore, "ecHubLayoutStore");
            Intrinsics.checkNotNullParameter(eventStateStore, "eventStateStore");
            Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
            Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new HubDefaultCategoryContentDuxo(ecHubLayoutStore, eventStateStore, eventMarketdataStore, eventContractPositionStore, experimentsStore, duxoBundle);
        }
    }
}
