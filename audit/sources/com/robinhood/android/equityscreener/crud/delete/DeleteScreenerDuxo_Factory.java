package com.robinhood.android.equityscreener.crud.delete;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeleteScreenerDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerDuxo;", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DeleteScreenerDuxo_Factory implements Factory<DeleteScreenerDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ScreenersStore> screenersStore;
    private final Provider<DeleteScreenerViewState2> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final DeleteScreenerDuxo_Factory create(Provider<SavedStateHandle> provider, Provider<ScreenersStore> provider2, Provider<EventLogger> provider3, Provider<DeleteScreenerViewState2> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final DeleteScreenerDuxo newInstance(SavedStateHandle savedStateHandle, ScreenersStore screenersStore, EventLogger eventLogger, DeleteScreenerViewState2 deleteScreenerViewState2, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(savedStateHandle, screenersStore, eventLogger, deleteScreenerViewState2, duxoBundle);
    }

    public DeleteScreenerDuxo_Factory(Provider<SavedStateHandle> savedStateHandle, Provider<ScreenersStore> screenersStore, Provider<EventLogger> eventLogger, Provider<DeleteScreenerViewState2> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.screenersStore = screenersStore;
        this.eventLogger = eventLogger;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public DeleteScreenerDuxo get() {
        Companion companion = INSTANCE;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        ScreenersStore screenersStore = this.screenersStore.get();
        Intrinsics.checkNotNullExpressionValue(screenersStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        DeleteScreenerViewState2 deleteScreenerViewState2 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(deleteScreenerViewState2, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(savedStateHandle, screenersStore, eventLogger, deleteScreenerViewState2, duxoBundle);
    }

    /* compiled from: DeleteScreenerDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerDuxo_Factory;", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerDuxo;", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DeleteScreenerDuxo_Factory create(Provider<SavedStateHandle> savedStateHandle, Provider<ScreenersStore> screenersStore, Provider<EventLogger> eventLogger, Provider<DeleteScreenerViewState2> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DeleteScreenerDuxo_Factory(savedStateHandle, screenersStore, eventLogger, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final DeleteScreenerDuxo newInstance(SavedStateHandle savedStateHandle, ScreenersStore screenersStore, EventLogger eventLogger, DeleteScreenerViewState2 stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DeleteScreenerDuxo(savedStateHandle, screenersStore, eventLogger, stateProvider, duxoBundle);
        }
    }
}
