package com.robinhood.android.search.highlights.duxo;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.search.highlights.SearchHighlightsManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchHighlightsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "searchHighlightsManager", "Lcom/robinhood/android/search/highlights/SearchHighlightsManager;", "experimentManager", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SearchHighlightsDuxo_Factory implements Factory<SearchHighlightsDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentManager;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<SearchHighlightsManager> searchHighlightsManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final SearchHighlightsDuxo_Factory create(Provider<DuxoBundle> provider, Provider<SavedStateHandle> provider2, Provider<SearchHighlightsManager> provider3, Provider<ExperimentsStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final SearchHighlightsDuxo newInstance(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, SearchHighlightsManager searchHighlightsManager, ExperimentsStore experimentsStore) {
        return INSTANCE.newInstance(duxoBundle, savedStateHandle, searchHighlightsManager, experimentsStore);
    }

    public SearchHighlightsDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<SearchHighlightsManager> searchHighlightsManager, Provider<ExperimentsStore> experimentManager) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(searchHighlightsManager, "searchHighlightsManager");
        Intrinsics.checkNotNullParameter(experimentManager, "experimentManager");
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.searchHighlightsManager = searchHighlightsManager;
        this.experimentManager = experimentManager;
    }

    @Override // javax.inject.Provider
    public SearchHighlightsDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SearchHighlightsManager searchHighlightsManager = this.searchHighlightsManager.get();
        Intrinsics.checkNotNullExpressionValue(searchHighlightsManager, "get(...)");
        ExperimentsStore experimentsStore = this.experimentManager.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        return companion.newInstance(duxoBundle, savedStateHandle, searchHighlightsManager, experimentsStore);
    }

    /* compiled from: SearchHighlightsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "searchHighlightsManager", "Lcom/robinhood/android/search/highlights/SearchHighlightsManager;", "experimentManager", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "newInstance", "Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsDuxo;", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SearchHighlightsDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<SearchHighlightsManager> searchHighlightsManager, Provider<ExperimentsStore> experimentManager) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(searchHighlightsManager, "searchHighlightsManager");
            Intrinsics.checkNotNullParameter(experimentManager, "experimentManager");
            return new SearchHighlightsDuxo_Factory(duxoBundle, savedStateHandle, searchHighlightsManager, experimentManager);
        }

        @JvmStatic
        public final SearchHighlightsDuxo newInstance(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, SearchHighlightsManager searchHighlightsManager, ExperimentsStore experimentManager) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(searchHighlightsManager, "searchHighlightsManager");
            Intrinsics.checkNotNullParameter(experimentManager, "experimentManager");
            return new SearchHighlightsDuxo(duxoBundle, savedStateHandle, searchHighlightsManager, experimentManager);
        }
    }
}
