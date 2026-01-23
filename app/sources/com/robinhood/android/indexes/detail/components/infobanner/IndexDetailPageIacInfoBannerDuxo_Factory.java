package com.robinhood.android.indexes.detail.components.infobanner;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexAccountSwitcherStore;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageIacInfoBannerDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/infobanner/IndexDetailPageIacInfoBannerDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/indexes/detail/components/infobanner/IndexDetailPageIacInfoBannerDuxo;", "indexAccountSwitcherStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/infobanner/IndexDetailPageIacInfoBannerStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class IndexDetailPageIacInfoBannerDuxo_Factory implements Factory<IndexDetailPageIacInfoBannerDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<IndexAccountSwitcherStore> indexAccountSwitcherStore;
    private final Provider<IndexDetailPageIacInfoBannerStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final IndexDetailPageIacInfoBannerDuxo_Factory create(Provider<IndexAccountSwitcherStore> provider, Provider<DuxoBundle> provider2, Provider<IndexDetailPageIacInfoBannerStateProvider> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final IndexDetailPageIacInfoBannerDuxo newInstance(IndexAccountSwitcherStore indexAccountSwitcherStore, DuxoBundle duxoBundle, IndexDetailPageIacInfoBannerStateProvider indexDetailPageIacInfoBannerStateProvider) {
        return INSTANCE.newInstance(indexAccountSwitcherStore, duxoBundle, indexDetailPageIacInfoBannerStateProvider);
    }

    public IndexDetailPageIacInfoBannerDuxo_Factory(Provider<IndexAccountSwitcherStore> indexAccountSwitcherStore, Provider<DuxoBundle> duxoBundle, Provider<IndexDetailPageIacInfoBannerStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.indexAccountSwitcherStore = indexAccountSwitcherStore;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public IndexDetailPageIacInfoBannerDuxo get() {
        Companion companion = INSTANCE;
        IndexAccountSwitcherStore indexAccountSwitcherStore = this.indexAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(indexAccountSwitcherStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        IndexDetailPageIacInfoBannerStateProvider indexDetailPageIacInfoBannerStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(indexDetailPageIacInfoBannerStateProvider, "get(...)");
        return companion.newInstance(indexAccountSwitcherStore, duxoBundle, indexDetailPageIacInfoBannerStateProvider);
    }

    /* compiled from: IndexDetailPageIacInfoBannerDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/infobanner/IndexDetailPageIacInfoBannerDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/indexes/detail/components/infobanner/IndexDetailPageIacInfoBannerDuxo_Factory;", "indexAccountSwitcherStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/infobanner/IndexDetailPageIacInfoBannerStateProvider;", "newInstance", "Lcom/robinhood/android/indexes/detail/components/infobanner/IndexDetailPageIacInfoBannerDuxo;", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IndexDetailPageIacInfoBannerDuxo_Factory create(Provider<IndexAccountSwitcherStore> indexAccountSwitcherStore, Provider<DuxoBundle> duxoBundle, Provider<IndexDetailPageIacInfoBannerStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new IndexDetailPageIacInfoBannerDuxo_Factory(indexAccountSwitcherStore, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final IndexDetailPageIacInfoBannerDuxo newInstance(IndexAccountSwitcherStore indexAccountSwitcherStore, DuxoBundle duxoBundle, IndexDetailPageIacInfoBannerStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new IndexDetailPageIacInfoBannerDuxo(indexAccountSwitcherStore, duxoBundle, stateProvider);
        }
    }
}
