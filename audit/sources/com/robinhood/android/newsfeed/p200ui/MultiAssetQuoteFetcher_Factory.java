package com.robinhood.android.newsfeed.p200ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiAssetQuoteFetcher_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MultiAssetQuoteFetcher_Factory implements Factory<MultiAssetQuoteFetcher> {
    private final Provider<AppType> appType;
    private final Provider<IndexStore> indexStore;
    private final Provider<QuoteStore> quoteStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MultiAssetQuoteFetcher_Factory create(Provider<AppType> provider, Provider<QuoteStore> provider2, Provider<IndexStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final MultiAssetQuoteFetcher newInstance(AppType appType, QuoteStore quoteStore, IndexStore indexStore) {
        return INSTANCE.newInstance(appType, quoteStore, indexStore);
    }

    public MultiAssetQuoteFetcher_Factory(Provider<AppType> appType, Provider<QuoteStore> quoteStore, Provider<IndexStore> indexStore) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        this.appType = appType;
        this.quoteStore = quoteStore;
        this.indexStore = indexStore;
    }

    @Override // javax.inject.Provider
    public MultiAssetQuoteFetcher get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        return companion.newInstance(appType, quoteStore, indexStore);
    }

    /* compiled from: MultiAssetQuoteFetcher_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher_Factory;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "newInstance", "Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher;", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MultiAssetQuoteFetcher_Factory create(Provider<AppType> appType, Provider<QuoteStore> quoteStore, Provider<IndexStore> indexStore) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            return new MultiAssetQuoteFetcher_Factory(appType, quoteStore, indexStore);
        }

        @JvmStatic
        public final MultiAssetQuoteFetcher newInstance(AppType appType, QuoteStore quoteStore, IndexStore indexStore) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            return new MultiAssetQuoteFetcher(appType, quoteStore, indexStore);
        }
    }
}
