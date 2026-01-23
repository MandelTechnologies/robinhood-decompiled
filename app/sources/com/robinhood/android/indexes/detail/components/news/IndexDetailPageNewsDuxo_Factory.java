package com.robinhood.android.indexes.detail.components.news;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageNewsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/news/IndexDetailPageNewsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/indexes/detail/components/news/IndexDetailPageNewsDuxo;", "indexStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/store/IndexStore;", "newsFeedAssetElementStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedAssetElementStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/news/IndexDetailPageNewsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDetailPageNewsDuxo_Factory implements Factory<IndexDetailPageNewsDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<IndexStore> indexStore;
    private final Provider<NewsFeedAssetElementStore> newsFeedAssetElementStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<IndexDetailPageNewsStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final IndexDetailPageNewsDuxo_Factory create(Provider<IndexStore> provider, Provider<NewsFeedAssetElementStore> provider2, Provider<SavedStateHandle> provider3, Provider<IndexDetailPageNewsStateProvider> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final IndexDetailPageNewsDuxo newInstance(IndexStore indexStore, NewsFeedAssetElementStore newsFeedAssetElementStore, SavedStateHandle savedStateHandle, IndexDetailPageNewsStateProvider indexDetailPageNewsStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(indexStore, newsFeedAssetElementStore, savedStateHandle, indexDetailPageNewsStateProvider, duxoBundle);
    }

    public IndexDetailPageNewsDuxo_Factory(Provider<IndexStore> indexStore, Provider<NewsFeedAssetElementStore> newsFeedAssetElementStore, Provider<SavedStateHandle> savedStateHandle, Provider<IndexDetailPageNewsStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(newsFeedAssetElementStore, "newsFeedAssetElementStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.indexStore = indexStore;
        this.newsFeedAssetElementStore = newsFeedAssetElementStore;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public IndexDetailPageNewsDuxo get() {
        Companion companion = INSTANCE;
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        NewsFeedAssetElementStore newsFeedAssetElementStore = this.newsFeedAssetElementStore.get();
        Intrinsics.checkNotNullExpressionValue(newsFeedAssetElementStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        IndexDetailPageNewsStateProvider indexDetailPageNewsStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(indexDetailPageNewsStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(indexStore, newsFeedAssetElementStore, savedStateHandle, indexDetailPageNewsStateProvider, duxoBundle);
    }

    /* compiled from: IndexDetailPageNewsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/news/IndexDetailPageNewsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/indexes/detail/components/news/IndexDetailPageNewsDuxo_Factory;", "indexStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/store/IndexStore;", "newsFeedAssetElementStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedAssetElementStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/news/IndexDetailPageNewsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/indexes/detail/components/news/IndexDetailPageNewsDuxo;", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IndexDetailPageNewsDuxo_Factory create(Provider<IndexStore> indexStore, Provider<NewsFeedAssetElementStore> newsFeedAssetElementStore, Provider<SavedStateHandle> savedStateHandle, Provider<IndexDetailPageNewsStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(newsFeedAssetElementStore, "newsFeedAssetElementStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new IndexDetailPageNewsDuxo_Factory(indexStore, newsFeedAssetElementStore, savedStateHandle, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final IndexDetailPageNewsDuxo newInstance(IndexStore indexStore, NewsFeedAssetElementStore newsFeedAssetElementStore, SavedStateHandle savedStateHandle, IndexDetailPageNewsStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(newsFeedAssetElementStore, "newsFeedAssetElementStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new IndexDetailPageNewsDuxo(indexStore, newsFeedAssetElementStore, savedStateHandle, stateProvider, duxoBundle);
        }
    }
}
