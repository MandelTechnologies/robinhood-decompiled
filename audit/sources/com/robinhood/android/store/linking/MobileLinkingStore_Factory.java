package com.robinhood.android.store.linking;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import hippo.service.p470v1.BWWorkspaceService;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MobileLinkingStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/store/linking/MobileLinkingStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/store/linking/MobileLinkingStore;", "api", "Ljavax/inject/Provider;", "Lhippo/service/v1/BWWorkspaceService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MobileLinkingStore_Factory implements Factory<MobileLinkingStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BWWorkspaceService> api;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final MobileLinkingStore_Factory create(Provider<BWWorkspaceService> provider, Provider<StoreBundle> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final MobileLinkingStore newInstance(BWWorkspaceService bWWorkspaceService, StoreBundle storeBundle) {
        return INSTANCE.newInstance(bWWorkspaceService, storeBundle);
    }

    public MobileLinkingStore_Factory(Provider<BWWorkspaceService> api, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public MobileLinkingStore get() {
        Companion companion = INSTANCE;
        BWWorkspaceService bWWorkspaceService = this.api.get();
        Intrinsics.checkNotNullExpressionValue(bWWorkspaceService, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(bWWorkspaceService, storeBundle);
    }

    /* compiled from: MobileLinkingStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/store/linking/MobileLinkingStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/store/linking/MobileLinkingStore_Factory;", "api", "Ljavax/inject/Provider;", "Lhippo/service/v1/BWWorkspaceService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/store/linking/MobileLinkingStore;", "lib-store-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MobileLinkingStore_Factory create(Provider<BWWorkspaceService> api, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new MobileLinkingStore_Factory(api, storeBundle);
        }

        @JvmStatic
        public final MobileLinkingStore newInstance(BWWorkspaceService api, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new MobileLinkingStore(api, storeBundle);
        }
    }
}
