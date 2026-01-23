package com.robinhood.android.futures.history.provisions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.store.event.EventOrderStore;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventHistoryModule_ProvideEventOrderHistoryLoaderCallbacksFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/futures/history/provisions/EventHistoryModule_ProvideEventOrderHistoryLoaderCallbacksFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "eventOrderStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/event/EventOrderStore;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.history.provisions.EventHistoryModule_ProvideEventOrderHistoryLoaderCallbacksFactory */
/* loaded from: classes17.dex */
public final class C17232x84720ba7 implements Factory<HistoryLoaderV2> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EventOrderStore> eventOrderStore;

    @JvmStatic
    public static final C17232x84720ba7 create(Provider<EventOrderStore> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final HistoryLoaderV2 provideEventOrderHistoryLoaderCallbacks(EventOrderStore eventOrderStore) {
        return INSTANCE.provideEventOrderHistoryLoaderCallbacks(eventOrderStore);
    }

    public C17232x84720ba7(Provider<EventOrderStore> eventOrderStore) {
        Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
        this.eventOrderStore = eventOrderStore;
    }

    @Override // javax.inject.Provider
    public HistoryLoaderV2 get() {
        Companion companion = INSTANCE;
        EventOrderStore eventOrderStore = this.eventOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(eventOrderStore, "get(...)");
        return companion.provideEventOrderHistoryLoaderCallbacks(eventOrderStore);
    }

    /* compiled from: EventHistoryModule_ProvideEventOrderHistoryLoaderCallbacksFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/futures/history/provisions/EventHistoryModule_ProvideEventOrderHistoryLoaderCallbacksFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/history/provisions/EventHistoryModule_ProvideEventOrderHistoryLoaderCallbacksFactory;", "eventOrderStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/event/EventOrderStore;", "provideEventOrderHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.history.provisions.EventHistoryModule_ProvideEventOrderHistoryLoaderCallbacksFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C17232x84720ba7 create(Provider<EventOrderStore> eventOrderStore) {
            Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
            return new C17232x84720ba7(eventOrderStore);
        }

        @JvmStatic
        public final HistoryLoaderV2 provideEventOrderHistoryLoaderCallbacks(EventOrderStore eventOrderStore) {
            Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
            Object objCheckNotNull = Preconditions.checkNotNull(EventHistoryModule.INSTANCE.provideEventOrderHistoryLoaderCallbacks(eventOrderStore), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HistoryLoaderV2) objCheckNotNull;
        }
    }
}
