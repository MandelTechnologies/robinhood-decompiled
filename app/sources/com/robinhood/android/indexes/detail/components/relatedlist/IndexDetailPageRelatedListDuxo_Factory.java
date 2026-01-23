package com.robinhood.android.indexes.detail.components.relatedlist;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.store.lists.store.CuratedListRelatedIndustriesStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageRelatedListDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/relatedlist/IndexDetailPageRelatedListDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/indexes/detail/components/relatedlist/IndexDetailPageRelatedListDuxo;", "curatedListRelatedIndustriesStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/lists/store/CuratedListRelatedIndustriesStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/relatedlist/IndexDetailPageRelatedListStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class IndexDetailPageRelatedListDuxo_Factory implements Factory<IndexDetailPageRelatedListDuxo> {
    private final Provider<CuratedListRelatedIndustriesStore> curatedListRelatedIndustriesStore;
    private final Provider<CuratedListStore> curatedListStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<IndexDetailPageRelatedListStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final IndexDetailPageRelatedListDuxo_Factory create(Provider<CuratedListRelatedIndustriesStore> provider, Provider<CuratedListStore> provider2, Provider<SavedStateHandle> provider3, Provider<DuxoBundle> provider4, Provider<IndexDetailPageRelatedListStateProvider> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final IndexDetailPageRelatedListDuxo newInstance(CuratedListRelatedIndustriesStore curatedListRelatedIndustriesStore, CuratedListStore curatedListStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, IndexDetailPageRelatedListStateProvider indexDetailPageRelatedListStateProvider) {
        return INSTANCE.newInstance(curatedListRelatedIndustriesStore, curatedListStore, savedStateHandle, duxoBundle, indexDetailPageRelatedListStateProvider);
    }

    public IndexDetailPageRelatedListDuxo_Factory(Provider<CuratedListRelatedIndustriesStore> curatedListRelatedIndustriesStore, Provider<CuratedListStore> curatedListStore, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<IndexDetailPageRelatedListStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(curatedListRelatedIndustriesStore, "curatedListRelatedIndustriesStore");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.curatedListRelatedIndustriesStore = curatedListRelatedIndustriesStore;
        this.curatedListStore = curatedListStore;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public IndexDetailPageRelatedListDuxo get() {
        Companion companion = INSTANCE;
        CuratedListRelatedIndustriesStore curatedListRelatedIndustriesStore = this.curatedListRelatedIndustriesStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListRelatedIndustriesStore, "get(...)");
        CuratedListStore curatedListStore = this.curatedListStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        IndexDetailPageRelatedListStateProvider indexDetailPageRelatedListStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(indexDetailPageRelatedListStateProvider, "get(...)");
        return companion.newInstance(curatedListRelatedIndustriesStore, curatedListStore, savedStateHandle, duxoBundle, indexDetailPageRelatedListStateProvider);
    }

    /* compiled from: IndexDetailPageRelatedListDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/relatedlist/IndexDetailPageRelatedListDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/indexes/detail/components/relatedlist/IndexDetailPageRelatedListDuxo_Factory;", "curatedListRelatedIndustriesStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/lists/store/CuratedListRelatedIndustriesStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/relatedlist/IndexDetailPageRelatedListStateProvider;", "newInstance", "Lcom/robinhood/android/indexes/detail/components/relatedlist/IndexDetailPageRelatedListDuxo;", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IndexDetailPageRelatedListDuxo_Factory create(Provider<CuratedListRelatedIndustriesStore> curatedListRelatedIndustriesStore, Provider<CuratedListStore> curatedListStore, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<IndexDetailPageRelatedListStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(curatedListRelatedIndustriesStore, "curatedListRelatedIndustriesStore");
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new IndexDetailPageRelatedListDuxo_Factory(curatedListRelatedIndustriesStore, curatedListStore, savedStateHandle, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final IndexDetailPageRelatedListDuxo newInstance(CuratedListRelatedIndustriesStore curatedListRelatedIndustriesStore, CuratedListStore curatedListStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, IndexDetailPageRelatedListStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(curatedListRelatedIndustriesStore, "curatedListRelatedIndustriesStore");
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new IndexDetailPageRelatedListDuxo(curatedListRelatedIndustriesStore, curatedListStore, savedStateHandle, duxoBundle, stateProvider);
        }
    }
}
