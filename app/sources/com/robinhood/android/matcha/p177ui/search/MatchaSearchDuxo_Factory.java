package com.robinhood.android.matcha.p177ui.search;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.store.matcha.MatchaContactsStore;
import com.robinhood.android.store.matcha.MatchaIncentivesSummaryStore;
import com.robinhood.android.store.matcha.MatchaSearchStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaSearchDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDuxo;", "contactsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/store/matcha/MatchaContactsStore;", "searchStore", "Lcom/robinhood/android/store/matcha/MatchaSearchStore;", "incentivesSummaryStore", "Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MatchaSearchDuxo_Factory implements Factory<MatchaSearchDuxo> {
    private final Provider<MatchaContactsStore> contactsStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<MatchaIncentivesSummaryStore> incentivesSummaryStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<MatchaSearchStore> searchStore;
    private final Provider<MatchaSearchStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MatchaSearchDuxo_Factory create(Provider<MatchaContactsStore> provider, Provider<MatchaSearchStore> provider2, Provider<MatchaIncentivesSummaryStore> provider3, Provider<ExperimentsStore> provider4, Provider<EventLogger> provider5, Provider<MatchaSearchStateProvider> provider6, Provider<DuxoBundle> provider7, Provider<SavedStateHandle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final MatchaSearchDuxo newInstance(MatchaContactsStore matchaContactsStore, MatchaSearchStore matchaSearchStore, MatchaIncentivesSummaryStore matchaIncentivesSummaryStore, ExperimentsStore experimentsStore, EventLogger eventLogger, MatchaSearchStateProvider matchaSearchStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(matchaContactsStore, matchaSearchStore, matchaIncentivesSummaryStore, experimentsStore, eventLogger, matchaSearchStateProvider, duxoBundle, savedStateHandle);
    }

    public MatchaSearchDuxo_Factory(Provider<MatchaContactsStore> contactsStore, Provider<MatchaSearchStore> searchStore, Provider<MatchaIncentivesSummaryStore> incentivesSummaryStore, Provider<ExperimentsStore> experimentsStore, Provider<EventLogger> eventLogger, Provider<MatchaSearchStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(contactsStore, "contactsStore");
        Intrinsics.checkNotNullParameter(searchStore, "searchStore");
        Intrinsics.checkNotNullParameter(incentivesSummaryStore, "incentivesSummaryStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.contactsStore = contactsStore;
        this.searchStore = searchStore;
        this.incentivesSummaryStore = incentivesSummaryStore;
        this.experimentsStore = experimentsStore;
        this.eventLogger = eventLogger;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public MatchaSearchDuxo get() {
        Companion companion = INSTANCE;
        MatchaContactsStore matchaContactsStore = this.contactsStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaContactsStore, "get(...)");
        MatchaSearchStore matchaSearchStore = this.searchStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaSearchStore, "get(...)");
        MatchaIncentivesSummaryStore matchaIncentivesSummaryStore = this.incentivesSummaryStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaIncentivesSummaryStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        MatchaSearchStateProvider matchaSearchStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(matchaSearchStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(matchaContactsStore, matchaSearchStore, matchaIncentivesSummaryStore, experimentsStore, eventLogger, matchaSearchStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: MatchaSearchDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDuxo_Factory;", "contactsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/store/matcha/MatchaContactsStore;", "searchStore", "Lcom/robinhood/android/store/matcha/MatchaSearchStore;", "incentivesSummaryStore", "Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDuxo;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MatchaSearchDuxo_Factory create(Provider<MatchaContactsStore> contactsStore, Provider<MatchaSearchStore> searchStore, Provider<MatchaIncentivesSummaryStore> incentivesSummaryStore, Provider<ExperimentsStore> experimentsStore, Provider<EventLogger> eventLogger, Provider<MatchaSearchStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(contactsStore, "contactsStore");
            Intrinsics.checkNotNullParameter(searchStore, "searchStore");
            Intrinsics.checkNotNullParameter(incentivesSummaryStore, "incentivesSummaryStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MatchaSearchDuxo_Factory(contactsStore, searchStore, incentivesSummaryStore, experimentsStore, eventLogger, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final MatchaSearchDuxo newInstance(MatchaContactsStore contactsStore, MatchaSearchStore searchStore, MatchaIncentivesSummaryStore incentivesSummaryStore, ExperimentsStore experimentsStore, EventLogger eventLogger, MatchaSearchStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(contactsStore, "contactsStore");
            Intrinsics.checkNotNullParameter(searchStore, "searchStore");
            Intrinsics.checkNotNullParameter(incentivesSummaryStore, "incentivesSummaryStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MatchaSearchDuxo(contactsStore, searchStore, incentivesSummaryStore, experimentsStore, eventLogger, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
