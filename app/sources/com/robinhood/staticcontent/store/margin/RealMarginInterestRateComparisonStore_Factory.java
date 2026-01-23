package com.robinhood.staticcontent.store.margin;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.StaticContentStore;
import dagger.internal.Factory;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealMarginInterestRateComparisonStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/staticcontent/store/margin/RealMarginInterestRateComparisonStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/staticcontent/store/margin/RealMarginInterestRateComparisonStore;", "staticContentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/contentful/StaticContentStore;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class RealMarginInterestRateComparisonStore_Factory implements Factory<RealMarginInterestRateComparisonStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Markwon> markwon;
    private final Provider<StaticContentStore> staticContentStore;

    @JvmStatic
    public static final RealMarginInterestRateComparisonStore_Factory create(Provider<StaticContentStore> provider, Provider<Markwon> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final RealMarginInterestRateComparisonStore newInstance(StaticContentStore staticContentStore, Markwon markwon) {
        return INSTANCE.newInstance(staticContentStore, markwon);
    }

    public RealMarginInterestRateComparisonStore_Factory(Provider<StaticContentStore> staticContentStore, Provider<Markwon> markwon) {
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.staticContentStore = staticContentStore;
        this.markwon = markwon;
    }

    @Override // javax.inject.Provider
    public RealMarginInterestRateComparisonStore get() {
        Companion companion = INSTANCE;
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        return companion.newInstance(staticContentStore, markwon);
    }

    /* compiled from: RealMarginInterestRateComparisonStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/staticcontent/store/margin/RealMarginInterestRateComparisonStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/staticcontent/store/margin/RealMarginInterestRateComparisonStore_Factory;", "staticContentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/contentful/StaticContentStore;", "markwon", "Lio/noties/markwon/Markwon;", "newInstance", "Lcom/robinhood/staticcontent/store/margin/RealMarginInterestRateComparisonStore;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealMarginInterestRateComparisonStore_Factory create(Provider<StaticContentStore> staticContentStore, Provider<Markwon> markwon) {
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            return new RealMarginInterestRateComparisonStore_Factory(staticContentStore, markwon);
        }

        @JvmStatic
        public final RealMarginInterestRateComparisonStore newInstance(StaticContentStore staticContentStore, Markwon markwon) {
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            return new RealMarginInterestRateComparisonStore(staticContentStore, markwon);
        }
    }
}
