package com.robinhood.android.event.trade;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase;
import com.robinhood.android.eventcontracts.trade.EventOrderManager;
import com.robinhood.android.eventcontracts.trade.StreamGtdTimeInForceUseCase;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.store.event.EventContractPositionStore;
import com.robinhood.store.event.EventOrderStore;
import com.robinhood.store.event.EventStore;
import com.robinhood.store.event.OrderDisplayStore;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.shareprefs.EventOrderFormPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventOrderFormDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB¯\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/event/trade/EventOrderFormDuxo;", "eventStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/event/EventStore;", "eventOrderManager", "Lcom/robinhood/android/eventcontracts/trade/EventOrderManager;", "eventOrderStore", "Lcom/robinhood/store/event/EventOrderStore;", "orderDisplayStore", "Lcom/robinhood/store/event/OrderDisplayStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "eventContractPositionStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "preferences", "Lcom/robinhood/store/shareprefs/EventOrderFormPreferences;", "streamComboQuoteUseCase", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase;", "streamGtdTimeInForceUseCase", "Lcom/robinhood/android/eventcontracts/trade/StreamGtdTimeInForceUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class EventOrderFormDuxo_Factory implements Factory<EventOrderFormDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventContractPositionStore> eventContractPositionStore;
    private final Provider<EventOrderManager> eventOrderManager;
    private final Provider<EventOrderStore> eventOrderStore;
    private final Provider<EventStore> eventStore;
    private final Provider<ExperimentsProvider> experimentsProvider;
    private final Provider<FuturesAccountStore> futuresAccountStore;
    private final Provider<OrderDisplayStore> orderDisplayStore;
    private final Provider<EventOrderFormPreferences> preferences;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<StreamComboQuoteUseCase> streamComboQuoteUseCase;
    private final Provider<StreamGtdTimeInForceUseCase> streamGtdTimeInForceUseCase;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EventOrderFormDuxo_Factory create(Provider<EventStore> provider, Provider<EventOrderManager> provider2, Provider<EventOrderStore> provider3, Provider<OrderDisplayStore> provider4, Provider<FuturesAccountStore> provider5, Provider<EventContractPositionStore> provider6, Provider<ExperimentsProvider> provider7, Provider<EventOrderFormPreferences> provider8, Provider<StreamComboQuoteUseCase> provider9, Provider<StreamGtdTimeInForceUseCase> provider10, Provider<SavedStateHandle> provider11, Provider<DuxoBundle> provider12) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @JvmStatic
    public static final EventOrderFormDuxo newInstance(EventStore eventStore, EventOrderManager eventOrderManager, EventOrderStore eventOrderStore, OrderDisplayStore orderDisplayStore, FuturesAccountStore futuresAccountStore, EventContractPositionStore eventContractPositionStore, ExperimentsProvider experimentsProvider, EventOrderFormPreferences eventOrderFormPreferences, StreamComboQuoteUseCase streamComboQuoteUseCase, StreamGtdTimeInForceUseCase streamGtdTimeInForceUseCase, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(eventStore, eventOrderManager, eventOrderStore, orderDisplayStore, futuresAccountStore, eventContractPositionStore, experimentsProvider, eventOrderFormPreferences, streamComboQuoteUseCase, streamGtdTimeInForceUseCase, savedStateHandle, duxoBundle);
    }

    public EventOrderFormDuxo_Factory(Provider<EventStore> eventStore, Provider<EventOrderManager> eventOrderManager, Provider<EventOrderStore> eventOrderStore, Provider<OrderDisplayStore> orderDisplayStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<EventContractPositionStore> eventContractPositionStore, Provider<ExperimentsProvider> experimentsProvider, Provider<EventOrderFormPreferences> preferences, Provider<StreamComboQuoteUseCase> streamComboQuoteUseCase, Provider<StreamGtdTimeInForceUseCase> streamGtdTimeInForceUseCase, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(eventOrderManager, "eventOrderManager");
        Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
        Intrinsics.checkNotNullParameter(orderDisplayStore, "orderDisplayStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(streamComboQuoteUseCase, "streamComboQuoteUseCase");
        Intrinsics.checkNotNullParameter(streamGtdTimeInForceUseCase, "streamGtdTimeInForceUseCase");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.eventStore = eventStore;
        this.eventOrderManager = eventOrderManager;
        this.eventOrderStore = eventOrderStore;
        this.orderDisplayStore = orderDisplayStore;
        this.futuresAccountStore = futuresAccountStore;
        this.eventContractPositionStore = eventContractPositionStore;
        this.experimentsProvider = experimentsProvider;
        this.preferences = preferences;
        this.streamComboQuoteUseCase = streamComboQuoteUseCase;
        this.streamGtdTimeInForceUseCase = streamGtdTimeInForceUseCase;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public EventOrderFormDuxo get() {
        Companion companion = INSTANCE;
        EventStore eventStore = this.eventStore.get();
        Intrinsics.checkNotNullExpressionValue(eventStore, "get(...)");
        EventOrderManager eventOrderManager = this.eventOrderManager.get();
        Intrinsics.checkNotNullExpressionValue(eventOrderManager, "get(...)");
        EventOrderStore eventOrderStore = this.eventOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(eventOrderStore, "get(...)");
        OrderDisplayStore orderDisplayStore = this.orderDisplayStore.get();
        Intrinsics.checkNotNullExpressionValue(orderDisplayStore, "get(...)");
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresAccountStore, "get(...)");
        EventContractPositionStore eventContractPositionStore = this.eventContractPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(eventContractPositionStore, "get(...)");
        ExperimentsProvider experimentsProvider = this.experimentsProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        EventOrderFormPreferences eventOrderFormPreferences = this.preferences.get();
        Intrinsics.checkNotNullExpressionValue(eventOrderFormPreferences, "get(...)");
        StreamComboQuoteUseCase streamComboQuoteUseCase = this.streamComboQuoteUseCase.get();
        Intrinsics.checkNotNullExpressionValue(streamComboQuoteUseCase, "get(...)");
        StreamGtdTimeInForceUseCase streamGtdTimeInForceUseCase = this.streamGtdTimeInForceUseCase.get();
        Intrinsics.checkNotNullExpressionValue(streamGtdTimeInForceUseCase, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(eventStore, eventOrderManager, eventOrderStore, orderDisplayStore, futuresAccountStore, eventContractPositionStore, experimentsProvider, eventOrderFormPreferences, streamComboQuoteUseCase, streamGtdTimeInForceUseCase, savedStateHandle, duxoBundle);
    }

    /* compiled from: EventOrderFormDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J°\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007H\u0007Jh\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/event/trade/EventOrderFormDuxo_Factory;", "eventStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/event/EventStore;", "eventOrderManager", "Lcom/robinhood/android/eventcontracts/trade/EventOrderManager;", "eventOrderStore", "Lcom/robinhood/store/event/EventOrderStore;", "orderDisplayStore", "Lcom/robinhood/store/event/OrderDisplayStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "eventContractPositionStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "preferences", "Lcom/robinhood/store/shareprefs/EventOrderFormPreferences;", "streamComboQuoteUseCase", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase;", "streamGtdTimeInForceUseCase", "Lcom/robinhood/android/eventcontracts/trade/StreamGtdTimeInForceUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/event/trade/EventOrderFormDuxo;", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventOrderFormDuxo_Factory create(Provider<EventStore> eventStore, Provider<EventOrderManager> eventOrderManager, Provider<EventOrderStore> eventOrderStore, Provider<OrderDisplayStore> orderDisplayStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<EventContractPositionStore> eventContractPositionStore, Provider<ExperimentsProvider> experimentsProvider, Provider<EventOrderFormPreferences> preferences, Provider<StreamComboQuoteUseCase> streamComboQuoteUseCase, Provider<StreamGtdTimeInForceUseCase> streamGtdTimeInForceUseCase, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(eventOrderManager, "eventOrderManager");
            Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
            Intrinsics.checkNotNullParameter(orderDisplayStore, "orderDisplayStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Intrinsics.checkNotNullParameter(streamComboQuoteUseCase, "streamComboQuoteUseCase");
            Intrinsics.checkNotNullParameter(streamGtdTimeInForceUseCase, "streamGtdTimeInForceUseCase");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new EventOrderFormDuxo_Factory(eventStore, eventOrderManager, eventOrderStore, orderDisplayStore, futuresAccountStore, eventContractPositionStore, experimentsProvider, preferences, streamComboQuoteUseCase, streamGtdTimeInForceUseCase, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final EventOrderFormDuxo newInstance(EventStore eventStore, EventOrderManager eventOrderManager, EventOrderStore eventOrderStore, OrderDisplayStore orderDisplayStore, FuturesAccountStore futuresAccountStore, EventContractPositionStore eventContractPositionStore, ExperimentsProvider experimentsProvider, EventOrderFormPreferences preferences, StreamComboQuoteUseCase streamComboQuoteUseCase, StreamGtdTimeInForceUseCase streamGtdTimeInForceUseCase, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(eventOrderManager, "eventOrderManager");
            Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
            Intrinsics.checkNotNullParameter(orderDisplayStore, "orderDisplayStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Intrinsics.checkNotNullParameter(streamComboQuoteUseCase, "streamComboQuoteUseCase");
            Intrinsics.checkNotNullParameter(streamGtdTimeInForceUseCase, "streamGtdTimeInForceUseCase");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new EventOrderFormDuxo(eventStore, eventOrderManager, eventOrderStore, orderDisplayStore, futuresAccountStore, eventContractPositionStore, experimentsProvider, preferences, streamComboQuoteUseCase, streamGtdTimeInForceUseCase, savedStateHandle, duxoBundle);
        }
    }
}
