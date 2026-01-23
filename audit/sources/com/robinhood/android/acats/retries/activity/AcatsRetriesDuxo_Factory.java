package com.robinhood.android.acats.retries.activity;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore;
import com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsRetriesDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDuxo;", "acatsBrokerageStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;", "acatsTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;", "brokerageStore", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AcatsRetriesDuxo_Factory implements Factory<AcatsRetriesDuxo> {
    private final Provider<AcatsBrokerageStore> acatsBrokerageStore;
    private final Provider<AcatsTransferStore> acatsTransferStore;
    private final Provider<AcatsBrokerageStore> brokerageStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionInstrumentStore> optionInstrumentStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<AcatsRetriesStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AcatsRetriesDuxo_Factory create(Provider<AcatsBrokerageStore> provider, Provider<AcatsTransferStore> provider2, Provider<AcatsBrokerageStore> provider3, Provider<InstrumentStore> provider4, Provider<OptionInstrumentStore> provider5, Provider<OptionChainStore> provider6, Provider<SavedStateHandle> provider7, Provider<AcatsRetriesStateProvider> provider8, Provider<DuxoBundle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final AcatsRetriesDuxo newInstance(AcatsBrokerageStore acatsBrokerageStore, AcatsTransferStore acatsTransferStore, AcatsBrokerageStore acatsBrokerageStore2, InstrumentStore instrumentStore, OptionInstrumentStore optionInstrumentStore, OptionChainStore optionChainStore, SavedStateHandle savedStateHandle, AcatsRetriesStateProvider acatsRetriesStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(acatsBrokerageStore, acatsTransferStore, acatsBrokerageStore2, instrumentStore, optionInstrumentStore, optionChainStore, savedStateHandle, acatsRetriesStateProvider, duxoBundle);
    }

    public AcatsRetriesDuxo_Factory(Provider<AcatsBrokerageStore> acatsBrokerageStore, Provider<AcatsTransferStore> acatsTransferStore, Provider<AcatsBrokerageStore> brokerageStore, Provider<InstrumentStore> instrumentStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionChainStore> optionChainStore, Provider<SavedStateHandle> savedStateHandle, Provider<AcatsRetriesStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(acatsBrokerageStore, "acatsBrokerageStore");
        Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
        Intrinsics.checkNotNullParameter(brokerageStore, "brokerageStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.acatsBrokerageStore = acatsBrokerageStore;
        this.acatsTransferStore = acatsTransferStore;
        this.brokerageStore = brokerageStore;
        this.instrumentStore = instrumentStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionChainStore = optionChainStore;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AcatsRetriesDuxo get() {
        Companion companion = INSTANCE;
        AcatsBrokerageStore acatsBrokerageStore = this.acatsBrokerageStore.get();
        Intrinsics.checkNotNullExpressionValue(acatsBrokerageStore, "get(...)");
        AcatsTransferStore acatsTransferStore = this.acatsTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(acatsTransferStore, "get(...)");
        AcatsBrokerageStore acatsBrokerageStore2 = this.brokerageStore.get();
        Intrinsics.checkNotNullExpressionValue(acatsBrokerageStore2, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        OptionInstrumentStore optionInstrumentStore = this.optionInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(optionInstrumentStore, "get(...)");
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        AcatsRetriesStateProvider acatsRetriesStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(acatsRetriesStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(acatsBrokerageStore, acatsTransferStore, acatsBrokerageStore2, instrumentStore, optionInstrumentStore, optionChainStore, savedStateHandle, acatsRetriesStateProvider, duxoBundle);
    }

    /* compiled from: AcatsRetriesDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007H\u0007JP\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDuxo_Factory;", "acatsBrokerageStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;", "acatsTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;", "brokerageStore", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDuxo;", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AcatsRetriesDuxo_Factory create(Provider<AcatsBrokerageStore> acatsBrokerageStore, Provider<AcatsTransferStore> acatsTransferStore, Provider<AcatsBrokerageStore> brokerageStore, Provider<InstrumentStore> instrumentStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionChainStore> optionChainStore, Provider<SavedStateHandle> savedStateHandle, Provider<AcatsRetriesStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(acatsBrokerageStore, "acatsBrokerageStore");
            Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
            Intrinsics.checkNotNullParameter(brokerageStore, "brokerageStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AcatsRetriesDuxo_Factory(acatsBrokerageStore, acatsTransferStore, brokerageStore, instrumentStore, optionInstrumentStore, optionChainStore, savedStateHandle, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final AcatsRetriesDuxo newInstance(AcatsBrokerageStore acatsBrokerageStore, AcatsTransferStore acatsTransferStore, AcatsBrokerageStore brokerageStore, InstrumentStore instrumentStore, OptionInstrumentStore optionInstrumentStore, OptionChainStore optionChainStore, SavedStateHandle savedStateHandle, AcatsRetriesStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(acatsBrokerageStore, "acatsBrokerageStore");
            Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
            Intrinsics.checkNotNullParameter(brokerageStore, "brokerageStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AcatsRetriesDuxo(acatsBrokerageStore, acatsTransferStore, brokerageStore, instrumentStore, optionInstrumentStore, optionChainStore, savedStateHandle, stateProvider, duxoBundle);
        }
    }
}
