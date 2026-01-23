package com.robinhood.shared.store.history;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB<\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u001f\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/store/history/HistoryStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/store/history/HistoryStore;", "historyLoaders", "Ljavax/inject/Provider;", "", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "Lkotlin/jvm/JvmSuppressWildcards;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class HistoryStore_Factory implements Factory<HistoryStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AppType> appType;
    private final Provider<Set<HistoryLoaderV2>> historyLoaders;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final HistoryStore_Factory create(Provider<Set<HistoryLoaderV2>> provider, Provider<AppType> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final HistoryStore newInstance(Set<HistoryLoaderV2> set, AppType appType, StoreBundle storeBundle) {
        return INSTANCE.newInstance(set, appType, storeBundle);
    }

    public HistoryStore_Factory(Provider<Set<HistoryLoaderV2>> historyLoaders, Provider<AppType> appType, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(historyLoaders, "historyLoaders");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.historyLoaders = historyLoaders;
        this.appType = appType;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public HistoryStore get() {
        Companion companion = INSTANCE;
        Set<HistoryLoaderV2> set = this.historyLoaders.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(set, appType, storeBundle);
    }

    /* compiled from: HistoryStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J+\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/store/history/HistoryStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/store/history/HistoryStore_Factory;", "historyLoaders", "Ljavax/inject/Provider;", "", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "Lkotlin/jvm/JvmSuppressWildcards;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/shared/store/history/HistoryStore;", "lib-store-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HistoryStore_Factory create(Provider<Set<HistoryLoaderV2>> historyLoaders, Provider<AppType> appType, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(historyLoaders, "historyLoaders");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new HistoryStore_Factory(historyLoaders, appType, storeBundle);
        }

        @JvmStatic
        public final HistoryStore newInstance(Set<HistoryLoaderV2> historyLoaders, AppType appType, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(historyLoaders, "historyLoaders");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new HistoryStore(historyLoaders, appType, storeBundle);
        }
    }
}
