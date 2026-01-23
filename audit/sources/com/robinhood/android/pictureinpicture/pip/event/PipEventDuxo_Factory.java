package com.robinhood.android.pictureinpicture.pip.event;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.EventStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PipEventDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/event/PipEventDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/pictureinpicture/pip/event/PipEventDuxo;", "eventStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/event/EventStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "futuresChartsServiceManager", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PipEventDuxo_Factory implements Factory<PipEventDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventMarketdataStore> eventMarketdataStore;
    private final Provider<EventStore> eventStore;
    private final Provider<FuturesChartsServiceManager> futuresChartsServiceManager;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PipEventDuxo_Factory create(Provider<EventStore> provider, Provider<EventMarketdataStore> provider2, Provider<FuturesChartsServiceManager> provider3, Provider<DuxoBundle> provider4, Provider<SavedStateHandle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final PipEventDuxo newInstance(EventStore eventStore, EventMarketdataStore eventMarketdataStore, FuturesChartsServiceManager futuresChartsServiceManager, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(eventStore, eventMarketdataStore, futuresChartsServiceManager, duxoBundle, savedStateHandle);
    }

    public PipEventDuxo_Factory(Provider<EventStore> eventStore, Provider<EventMarketdataStore> eventMarketdataStore, Provider<FuturesChartsServiceManager> futuresChartsServiceManager, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.eventStore = eventStore;
        this.eventMarketdataStore = eventMarketdataStore;
        this.futuresChartsServiceManager = futuresChartsServiceManager;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public PipEventDuxo get() {
        Companion companion = INSTANCE;
        EventStore eventStore = this.eventStore.get();
        Intrinsics.checkNotNullExpressionValue(eventStore, "get(...)");
        EventMarketdataStore eventMarketdataStore = this.eventMarketdataStore.get();
        Intrinsics.checkNotNullExpressionValue(eventMarketdataStore, "get(...)");
        FuturesChartsServiceManager futuresChartsServiceManager = this.futuresChartsServiceManager.get();
        Intrinsics.checkNotNullExpressionValue(futuresChartsServiceManager, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(eventStore, eventMarketdataStore, futuresChartsServiceManager, duxoBundle, savedStateHandle);
    }

    /* compiled from: PipEventDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/event/PipEventDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/pictureinpicture/pip/event/PipEventDuxo_Factory;", "eventStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/event/EventStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "futuresChartsServiceManager", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/pictureinpicture/pip/event/PipEventDuxo;", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PipEventDuxo_Factory create(Provider<EventStore> eventStore, Provider<EventMarketdataStore> eventMarketdataStore, Provider<FuturesChartsServiceManager> futuresChartsServiceManager, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
            Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new PipEventDuxo_Factory(eventStore, eventMarketdataStore, futuresChartsServiceManager, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final PipEventDuxo newInstance(EventStore eventStore, EventMarketdataStore eventMarketdataStore, FuturesChartsServiceManager futuresChartsServiceManager, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
            Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new PipEventDuxo(eventStore, eventMarketdataStore, futuresChartsServiceManager, duxoBundle, savedStateHandle);
        }
    }
}
