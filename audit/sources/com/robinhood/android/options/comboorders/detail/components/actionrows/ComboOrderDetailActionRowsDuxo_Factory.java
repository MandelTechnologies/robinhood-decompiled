package com.robinhood.android.options.comboorders.detail.components.actionrows;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.store.options.combo.ComboOrderStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.DocumentStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComboOrderDetailActionRowsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsDuxo;", "comboOrderStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "stateProvider", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComboOrderDetailActionRowsDuxo_Factory implements Factory<ComboOrderDetailActionRowsDuxo> {
    private final Provider<ComboOrderStore> comboOrderStore;
    private final Provider<DocumentStore> documentStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<TraderEventLogger> eventLogger;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ComboOrderDetailActionRowsStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ComboOrderDetailActionRowsDuxo_Factory create(Provider<ComboOrderStore> provider, Provider<TraderEventLogger> provider2, Provider<DocumentStore> provider3, Provider<ComboOrderDetailActionRowsStateProvider> provider4, Provider<DuxoBundle> provider5, Provider<SavedStateHandle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final ComboOrderDetailActionRowsDuxo newInstance(ComboOrderStore comboOrderStore, TraderEventLogger traderEventLogger, DocumentStore documentStore, ComboOrderDetailActionRowsStateProvider comboOrderDetailActionRowsStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(comboOrderStore, traderEventLogger, documentStore, comboOrderDetailActionRowsStateProvider, duxoBundle, savedStateHandle);
    }

    public ComboOrderDetailActionRowsDuxo_Factory(Provider<ComboOrderStore> comboOrderStore, Provider<TraderEventLogger> eventLogger, Provider<DocumentStore> documentStore, Provider<ComboOrderDetailActionRowsStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(documentStore, "documentStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.comboOrderStore = comboOrderStore;
        this.eventLogger = eventLogger;
        this.documentStore = documentStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public ComboOrderDetailActionRowsDuxo get() {
        Companion companion = INSTANCE;
        ComboOrderStore comboOrderStore = this.comboOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(comboOrderStore, "get(...)");
        TraderEventLogger traderEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(traderEventLogger, "get(...)");
        DocumentStore documentStore = this.documentStore.get();
        Intrinsics.checkNotNullExpressionValue(documentStore, "get(...)");
        ComboOrderDetailActionRowsStateProvider comboOrderDetailActionRowsStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(comboOrderDetailActionRowsStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(comboOrderStore, traderEventLogger, documentStore, comboOrderDetailActionRowsStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: ComboOrderDetailActionRowsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsDuxo_Factory;", "comboOrderStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "stateProvider", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsDuxo;", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ComboOrderDetailActionRowsDuxo_Factory create(Provider<ComboOrderStore> comboOrderStore, Provider<TraderEventLogger> eventLogger, Provider<DocumentStore> documentStore, Provider<ComboOrderDetailActionRowsStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(documentStore, "documentStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new ComboOrderDetailActionRowsDuxo_Factory(comboOrderStore, eventLogger, documentStore, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final ComboOrderDetailActionRowsDuxo newInstance(ComboOrderStore comboOrderStore, TraderEventLogger eventLogger, DocumentStore documentStore, ComboOrderDetailActionRowsStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(documentStore, "documentStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new ComboOrderDetailActionRowsDuxo(comboOrderStore, eventLogger, documentStore, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
