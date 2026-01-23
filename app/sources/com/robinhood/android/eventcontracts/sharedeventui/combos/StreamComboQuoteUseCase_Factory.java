package com.robinhood.android.eventcontracts.sharedeventui.combos;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.event.EventComboStore;
import com.robinhood.store.event.EventMarketdataStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StreamComboQuoteUseCase_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase;", "eventMarketdataStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventComboStore", "Lcom/robinhood/store/event/EventComboStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class StreamComboQuoteUseCase_Factory implements Factory<StreamComboQuoteUseCase> {
    private final Provider<EventComboStore> eventComboStore;
    private final Provider<EventMarketdataStore> eventMarketdataStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final StreamComboQuoteUseCase_Factory create(Provider<EventMarketdataStore> provider, Provider<EventComboStore> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final StreamComboQuoteUseCase newInstance(EventMarketdataStore eventMarketdataStore, EventComboStore eventComboStore) {
        return INSTANCE.newInstance(eventMarketdataStore, eventComboStore);
    }

    public StreamComboQuoteUseCase_Factory(Provider<EventMarketdataStore> eventMarketdataStore, Provider<EventComboStore> eventComboStore) {
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(eventComboStore, "eventComboStore");
        this.eventMarketdataStore = eventMarketdataStore;
        this.eventComboStore = eventComboStore;
    }

    @Override // javax.inject.Provider
    public StreamComboQuoteUseCase get() {
        Companion companion = INSTANCE;
        EventMarketdataStore eventMarketdataStore = this.eventMarketdataStore.get();
        Intrinsics.checkNotNullExpressionValue(eventMarketdataStore, "get(...)");
        EventComboStore eventComboStore = this.eventComboStore.get();
        Intrinsics.checkNotNullExpressionValue(eventComboStore, "get(...)");
        return companion.newInstance(eventMarketdataStore, eventComboStore);
    }

    /* compiled from: StreamComboQuoteUseCase_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase_Factory;", "eventMarketdataStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventComboStore", "Lcom/robinhood/store/event/EventComboStore;", "newInstance", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase;", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StreamComboQuoteUseCase_Factory create(Provider<EventMarketdataStore> eventMarketdataStore, Provider<EventComboStore> eventComboStore) {
            Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
            Intrinsics.checkNotNullParameter(eventComboStore, "eventComboStore");
            return new StreamComboQuoteUseCase_Factory(eventMarketdataStore, eventComboStore);
        }

        @JvmStatic
        public final StreamComboQuoteUseCase newInstance(EventMarketdataStore eventMarketdataStore, EventComboStore eventComboStore) {
            Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
            Intrinsics.checkNotNullParameter(eventComboStore, "eventComboStore");
            return new StreamComboQuoteUseCase(eventMarketdataStore, eventComboStore);
        }
    }
}
