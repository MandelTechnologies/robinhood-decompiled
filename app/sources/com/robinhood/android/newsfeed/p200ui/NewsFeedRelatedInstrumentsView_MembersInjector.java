package com.robinhood.android.newsfeed.p200ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedRelatedInstrumentsView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/NewsFeedRelatedInstrumentsView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/newsfeed/ui/NewsFeedRelatedInstrumentsView;", "firstQuoteFetcher", "Ljavax/inject/Provider;", "Lcom/robinhood/android/newsfeed/ui/QuoteFetcher;", "secondQuoteFetcher", "firstMultiAssetQuoteFetcher", "Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher;", "secondMultiAssetQuoteFetcher", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class NewsFeedRelatedInstrumentsView_MembersInjector implements MembersInjector<NewsFeedRelatedInstrumentsView> {
    private final Provider<MultiAssetQuoteFetcher> firstMultiAssetQuoteFetcher;
    private final Provider<QuoteFetcher> firstQuoteFetcher;
    private final Provider<IndexStore> indexStore;
    private final Provider<MultiAssetQuoteFetcher> secondMultiAssetQuoteFetcher;
    private final Provider<QuoteFetcher> secondQuoteFetcher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<NewsFeedRelatedInstrumentsView> create(Provider<QuoteFetcher> provider, Provider<QuoteFetcher> provider2, Provider<MultiAssetQuoteFetcher> provider3, Provider<MultiAssetQuoteFetcher> provider4, Provider<IndexStore> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectFirstMultiAssetQuoteFetcher(NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView, MultiAssetQuoteFetcher multiAssetQuoteFetcher) {
        INSTANCE.injectFirstMultiAssetQuoteFetcher(newsFeedRelatedInstrumentsView, multiAssetQuoteFetcher);
    }

    @JvmStatic
    public static final void injectFirstQuoteFetcher(NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView, QuoteFetcher quoteFetcher) {
        INSTANCE.injectFirstQuoteFetcher(newsFeedRelatedInstrumentsView, quoteFetcher);
    }

    @JvmStatic
    public static final void injectIndexStore(NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView, IndexStore indexStore) {
        INSTANCE.injectIndexStore(newsFeedRelatedInstrumentsView, indexStore);
    }

    @JvmStatic
    public static final void injectSecondMultiAssetQuoteFetcher(NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView, MultiAssetQuoteFetcher multiAssetQuoteFetcher) {
        INSTANCE.injectSecondMultiAssetQuoteFetcher(newsFeedRelatedInstrumentsView, multiAssetQuoteFetcher);
    }

    @JvmStatic
    public static final void injectSecondQuoteFetcher(NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView, QuoteFetcher quoteFetcher) {
        INSTANCE.injectSecondQuoteFetcher(newsFeedRelatedInstrumentsView, quoteFetcher);
    }

    public NewsFeedRelatedInstrumentsView_MembersInjector(Provider<QuoteFetcher> firstQuoteFetcher, Provider<QuoteFetcher> secondQuoteFetcher, Provider<MultiAssetQuoteFetcher> firstMultiAssetQuoteFetcher, Provider<MultiAssetQuoteFetcher> secondMultiAssetQuoteFetcher, Provider<IndexStore> indexStore) {
        Intrinsics.checkNotNullParameter(firstQuoteFetcher, "firstQuoteFetcher");
        Intrinsics.checkNotNullParameter(secondQuoteFetcher, "secondQuoteFetcher");
        Intrinsics.checkNotNullParameter(firstMultiAssetQuoteFetcher, "firstMultiAssetQuoteFetcher");
        Intrinsics.checkNotNullParameter(secondMultiAssetQuoteFetcher, "secondMultiAssetQuoteFetcher");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        this.firstQuoteFetcher = firstQuoteFetcher;
        this.secondQuoteFetcher = secondQuoteFetcher;
        this.firstMultiAssetQuoteFetcher = firstMultiAssetQuoteFetcher;
        this.secondMultiAssetQuoteFetcher = secondMultiAssetQuoteFetcher;
        this.indexStore = indexStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NewsFeedRelatedInstrumentsView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        QuoteFetcher quoteFetcher = this.firstQuoteFetcher.get();
        Intrinsics.checkNotNullExpressionValue(quoteFetcher, "get(...)");
        companion.injectFirstQuoteFetcher(instance, quoteFetcher);
        QuoteFetcher quoteFetcher2 = this.secondQuoteFetcher.get();
        Intrinsics.checkNotNullExpressionValue(quoteFetcher2, "get(...)");
        companion.injectSecondQuoteFetcher(instance, quoteFetcher2);
        MultiAssetQuoteFetcher multiAssetQuoteFetcher = this.firstMultiAssetQuoteFetcher.get();
        Intrinsics.checkNotNullExpressionValue(multiAssetQuoteFetcher, "get(...)");
        companion.injectFirstMultiAssetQuoteFetcher(instance, multiAssetQuoteFetcher);
        MultiAssetQuoteFetcher multiAssetQuoteFetcher2 = this.secondMultiAssetQuoteFetcher.get();
        Intrinsics.checkNotNullExpressionValue(multiAssetQuoteFetcher2, "get(...)");
        companion.injectSecondMultiAssetQuoteFetcher(instance, multiAssetQuoteFetcher2);
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        companion.injectIndexStore(instance, indexStore);
    }

    /* compiled from: NewsFeedRelatedInstrumentsView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/NewsFeedRelatedInstrumentsView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/newsfeed/ui/NewsFeedRelatedInstrumentsView;", "firstQuoteFetcher", "Ljavax/inject/Provider;", "Lcom/robinhood/android/newsfeed/ui/QuoteFetcher;", "secondQuoteFetcher", "firstMultiAssetQuoteFetcher", "Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher;", "secondMultiAssetQuoteFetcher", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "injectFirstQuoteFetcher", "", "instance", "injectSecondQuoteFetcher", "injectFirstMultiAssetQuoteFetcher", "injectSecondMultiAssetQuoteFetcher", "injectIndexStore", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<NewsFeedRelatedInstrumentsView> create(Provider<QuoteFetcher> firstQuoteFetcher, Provider<QuoteFetcher> secondQuoteFetcher, Provider<MultiAssetQuoteFetcher> firstMultiAssetQuoteFetcher, Provider<MultiAssetQuoteFetcher> secondMultiAssetQuoteFetcher, Provider<IndexStore> indexStore) {
            Intrinsics.checkNotNullParameter(firstQuoteFetcher, "firstQuoteFetcher");
            Intrinsics.checkNotNullParameter(secondQuoteFetcher, "secondQuoteFetcher");
            Intrinsics.checkNotNullParameter(firstMultiAssetQuoteFetcher, "firstMultiAssetQuoteFetcher");
            Intrinsics.checkNotNullParameter(secondMultiAssetQuoteFetcher, "secondMultiAssetQuoteFetcher");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            return new NewsFeedRelatedInstrumentsView_MembersInjector(firstQuoteFetcher, secondQuoteFetcher, firstMultiAssetQuoteFetcher, secondMultiAssetQuoteFetcher, indexStore);
        }

        @JvmStatic
        public final void injectFirstQuoteFetcher(NewsFeedRelatedInstrumentsView instance, QuoteFetcher firstQuoteFetcher) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(firstQuoteFetcher, "firstQuoteFetcher");
            instance.setFirstQuoteFetcher(firstQuoteFetcher);
        }

        @JvmStatic
        public final void injectSecondQuoteFetcher(NewsFeedRelatedInstrumentsView instance, QuoteFetcher secondQuoteFetcher) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(secondQuoteFetcher, "secondQuoteFetcher");
            instance.setSecondQuoteFetcher(secondQuoteFetcher);
        }

        @JvmStatic
        public final void injectFirstMultiAssetQuoteFetcher(NewsFeedRelatedInstrumentsView instance, MultiAssetQuoteFetcher firstMultiAssetQuoteFetcher) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(firstMultiAssetQuoteFetcher, "firstMultiAssetQuoteFetcher");
            instance.setFirstMultiAssetQuoteFetcher(firstMultiAssetQuoteFetcher);
        }

        @JvmStatic
        public final void injectSecondMultiAssetQuoteFetcher(NewsFeedRelatedInstrumentsView instance, MultiAssetQuoteFetcher secondMultiAssetQuoteFetcher) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(secondMultiAssetQuoteFetcher, "secondMultiAssetQuoteFetcher");
            instance.setSecondMultiAssetQuoteFetcher(secondMultiAssetQuoteFetcher);
        }

        @JvmStatic
        public final void injectIndexStore(NewsFeedRelatedInstrumentsView instance, IndexStore indexStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            instance.setIndexStore(indexStore);
        }
    }
}
