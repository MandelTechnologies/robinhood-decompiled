package com.robinhood.android.lib.futures.trade;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.event.EventMarketdataStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StreamEventMarketSessionChangeStateUseCase_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;", "eventMarketdataStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/event/EventMarketdataStore;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class StreamEventMarketSessionChangeStateUseCase_Factory implements Factory<StreamEventMarketSessionChangeStateUseCase> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EventMarketdataStore> eventMarketdataStore;

    @JvmStatic
    public static final StreamEventMarketSessionChangeStateUseCase_Factory create(Provider<EventMarketdataStore> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final StreamEventMarketSessionChangeStateUseCase newInstance(EventMarketdataStore eventMarketdataStore) {
        return INSTANCE.newInstance(eventMarketdataStore);
    }

    public StreamEventMarketSessionChangeStateUseCase_Factory(Provider<EventMarketdataStore> eventMarketdataStore) {
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        this.eventMarketdataStore = eventMarketdataStore;
    }

    @Override // javax.inject.Provider
    public StreamEventMarketSessionChangeStateUseCase get() {
        Companion companion = INSTANCE;
        EventMarketdataStore eventMarketdataStore = this.eventMarketdataStore.get();
        Intrinsics.checkNotNullExpressionValue(eventMarketdataStore, "get(...)");
        return companion.newInstance(eventMarketdataStore);
    }

    /* compiled from: StreamEventMarketSessionChangeStateUseCase_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase_Factory;", "eventMarketdataStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/event/EventMarketdataStore;", "newInstance", "Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;", "lib-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StreamEventMarketSessionChangeStateUseCase_Factory create(Provider<EventMarketdataStore> eventMarketdataStore) {
            Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
            return new StreamEventMarketSessionChangeStateUseCase_Factory(eventMarketdataStore);
        }

        @JvmStatic
        public final StreamEventMarketSessionChangeStateUseCase newInstance(EventMarketdataStore eventMarketdataStore) {
            Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
            return new StreamEventMarketSessionChangeStateUseCase(eventMarketdataStore);
        }
    }
}
