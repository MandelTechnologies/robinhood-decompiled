package com.robinhood.android.indexes.detail.components.history;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexAccountSwitcherStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.store.history.HistoryStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageHistoryDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/history/IndexDetailPageHistoryDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/indexes/detail/components/history/IndexDetailPageHistoryDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "indexAccountSwitcherStore", "Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/history/IndexDetailPageHistoryStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class IndexDetailPageHistoryDuxo_Factory implements Factory<IndexDetailPageHistoryDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<HistoryStore> historyStore;
    private final Provider<IndexAccountSwitcherStore> indexAccountSwitcherStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<IndexDetailPageHistoryStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final IndexDetailPageHistoryDuxo_Factory create(Provider<AccountProvider> provider, Provider<IndexAccountSwitcherStore> provider2, Provider<HistoryStore> provider3, Provider<SavedStateHandle> provider4, Provider<IndexDetailPageHistoryStateProvider> provider5, Provider<DuxoBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final IndexDetailPageHistoryDuxo newInstance(AccountProvider accountProvider, IndexAccountSwitcherStore indexAccountSwitcherStore, HistoryStore historyStore, SavedStateHandle savedStateHandle, IndexDetailPageHistoryStateProvider indexDetailPageHistoryStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountProvider, indexAccountSwitcherStore, historyStore, savedStateHandle, indexDetailPageHistoryStateProvider, duxoBundle);
    }

    public IndexDetailPageHistoryDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<IndexAccountSwitcherStore> indexAccountSwitcherStore, Provider<HistoryStore> historyStore, Provider<SavedStateHandle> savedStateHandle, Provider<IndexDetailPageHistoryStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.indexAccountSwitcherStore = indexAccountSwitcherStore;
        this.historyStore = historyStore;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public IndexDetailPageHistoryDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        IndexAccountSwitcherStore indexAccountSwitcherStore = this.indexAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(indexAccountSwitcherStore, "get(...)");
        HistoryStore historyStore = this.historyStore.get();
        Intrinsics.checkNotNullExpressionValue(historyStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        IndexDetailPageHistoryStateProvider indexDetailPageHistoryStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(indexDetailPageHistoryStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountProvider, indexAccountSwitcherStore, historyStore, savedStateHandle, indexDetailPageHistoryStateProvider, duxoBundle);
    }

    /* compiled from: IndexDetailPageHistoryDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/history/IndexDetailPageHistoryDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/indexes/detail/components/history/IndexDetailPageHistoryDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "indexAccountSwitcherStore", "Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/history/IndexDetailPageHistoryStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/indexes/detail/components/history/IndexDetailPageHistoryDuxo;", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IndexDetailPageHistoryDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<IndexAccountSwitcherStore> indexAccountSwitcherStore, Provider<HistoryStore> historyStore, Provider<SavedStateHandle> savedStateHandle, Provider<IndexDetailPageHistoryStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new IndexDetailPageHistoryDuxo_Factory(accountProvider, indexAccountSwitcherStore, historyStore, savedStateHandle, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final IndexDetailPageHistoryDuxo newInstance(AccountProvider accountProvider, IndexAccountSwitcherStore indexAccountSwitcherStore, HistoryStore historyStore, SavedStateHandle savedStateHandle, IndexDetailPageHistoryStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new IndexDetailPageHistoryDuxo(accountProvider, indexAccountSwitcherStore, historyStore, savedStateHandle, stateProvider, duxoBundle);
        }
    }
}
