package com.robinhood.staticcontent.store.productmarketing;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.staticcontent.store.ContentStore;
import dagger.internal.Factory;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealProductMarketingContentFeatureStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB<\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u001f\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingContentFeatureStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingContentFeatureStore;", "disclosureStore", "Ljavax/inject/Provider;", "Lcom/robinhood/staticcontent/store/ContentStore;", "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "Lkotlin/jvm/JvmSuppressWildcards;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class RealProductMarketingContentFeatureStore_Factory implements Factory<RealProductMarketingContentFeatureStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ContentStore<DisclosureContent>> disclosureStore;
    private final Provider<Markwon> markwon;
    private final Provider<StaticContentStore> staticContentStore;

    @JvmStatic
    public static final RealProductMarketingContentFeatureStore_Factory create(Provider<ContentStore<DisclosureContent>> provider, Provider<StaticContentStore> provider2, Provider<Markwon> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final RealProductMarketingContentFeatureStore newInstance(ContentStore<DisclosureContent> contentStore, StaticContentStore staticContentStore, Markwon markwon) {
        return INSTANCE.newInstance(contentStore, staticContentStore, markwon);
    }

    public RealProductMarketingContentFeatureStore_Factory(Provider<ContentStore<DisclosureContent>> disclosureStore, Provider<StaticContentStore> staticContentStore, Provider<Markwon> markwon) {
        Intrinsics.checkNotNullParameter(disclosureStore, "disclosureStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.disclosureStore = disclosureStore;
        this.staticContentStore = staticContentStore;
        this.markwon = markwon;
    }

    @Override // javax.inject.Provider
    public RealProductMarketingContentFeatureStore get() {
        Companion companion = INSTANCE;
        ContentStore<DisclosureContent> contentStore = this.disclosureStore.get();
        Intrinsics.checkNotNullExpressionValue(contentStore, "get(...)");
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        return companion.newInstance(contentStore, staticContentStore, markwon);
    }

    /* compiled from: RealProductMarketingContentFeatureStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J+\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingContentFeatureStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingContentFeatureStore_Factory;", "disclosureStore", "Ljavax/inject/Provider;", "Lcom/robinhood/staticcontent/store/ContentStore;", "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "Lkotlin/jvm/JvmSuppressWildcards;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "markwon", "Lio/noties/markwon/Markwon;", "newInstance", "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingContentFeatureStore;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealProductMarketingContentFeatureStore_Factory create(Provider<ContentStore<DisclosureContent>> disclosureStore, Provider<StaticContentStore> staticContentStore, Provider<Markwon> markwon) {
            Intrinsics.checkNotNullParameter(disclosureStore, "disclosureStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            return new RealProductMarketingContentFeatureStore_Factory(disclosureStore, staticContentStore, markwon);
        }

        @JvmStatic
        public final RealProductMarketingContentFeatureStore newInstance(ContentStore<DisclosureContent> disclosureStore, StaticContentStore staticContentStore, Markwon markwon) {
            Intrinsics.checkNotNullParameter(disclosureStore, "disclosureStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            return new RealProductMarketingContentFeatureStore(disclosureStore, staticContentStore, markwon);
        }
    }
}
