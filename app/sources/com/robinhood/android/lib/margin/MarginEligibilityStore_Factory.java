package com.robinhood.android.lib.margin;

import bonfire.proto.idl.margin.p036v1.MultiAccountEligibilityService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.margin.api.MarginInvestingApi;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginEligibilityStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/MarginEligibilityStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "marginInvestingApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;", "multiAccountMarginEligibilityService", "Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityService;", "marginUpgradeRestrictionStore", "Lcom/robinhood/android/lib/margin/MarginUpgradeRestrictionStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MarginEligibilityStore_Factory implements Factory<MarginEligibilityStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<MarginInvestingApi> marginInvestingApi;
    private final Provider<MarginUpgradeRestrictionStore> marginUpgradeRestrictionStore;
    private final Provider<MultiAccountEligibilityService> multiAccountMarginEligibilityService;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final MarginEligibilityStore_Factory create(Provider<MarginInvestingApi> provider, Provider<MultiAccountEligibilityService> provider2, Provider<MarginUpgradeRestrictionStore> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final MarginEligibilityStore newInstance(MarginInvestingApi marginInvestingApi, MultiAccountEligibilityService multiAccountEligibilityService, MarginUpgradeRestrictionStore marginUpgradeRestrictionStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(marginInvestingApi, multiAccountEligibilityService, marginUpgradeRestrictionStore, storeBundle);
    }

    public MarginEligibilityStore_Factory(Provider<MarginInvestingApi> marginInvestingApi, Provider<MultiAccountEligibilityService> multiAccountMarginEligibilityService, Provider<MarginUpgradeRestrictionStore> marginUpgradeRestrictionStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(marginInvestingApi, "marginInvestingApi");
        Intrinsics.checkNotNullParameter(multiAccountMarginEligibilityService, "multiAccountMarginEligibilityService");
        Intrinsics.checkNotNullParameter(marginUpgradeRestrictionStore, "marginUpgradeRestrictionStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.marginInvestingApi = marginInvestingApi;
        this.multiAccountMarginEligibilityService = multiAccountMarginEligibilityService;
        this.marginUpgradeRestrictionStore = marginUpgradeRestrictionStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public MarginEligibilityStore get() {
        Companion companion = INSTANCE;
        MarginInvestingApi marginInvestingApi = this.marginInvestingApi.get();
        Intrinsics.checkNotNullExpressionValue(marginInvestingApi, "get(...)");
        MultiAccountEligibilityService multiAccountEligibilityService = this.multiAccountMarginEligibilityService.get();
        Intrinsics.checkNotNullExpressionValue(multiAccountEligibilityService, "get(...)");
        MarginUpgradeRestrictionStore marginUpgradeRestrictionStore = this.marginUpgradeRestrictionStore.get();
        Intrinsics.checkNotNullExpressionValue(marginUpgradeRestrictionStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(marginInvestingApi, multiAccountEligibilityService, marginUpgradeRestrictionStore, storeBundle);
    }

    /* compiled from: MarginEligibilityStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/MarginEligibilityStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/margin/MarginEligibilityStore_Factory;", "marginInvestingApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;", "multiAccountMarginEligibilityService", "Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityService;", "marginUpgradeRestrictionStore", "Lcom/robinhood/android/lib/margin/MarginUpgradeRestrictionStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MarginEligibilityStore_Factory create(Provider<MarginInvestingApi> marginInvestingApi, Provider<MultiAccountEligibilityService> multiAccountMarginEligibilityService, Provider<MarginUpgradeRestrictionStore> marginUpgradeRestrictionStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(marginInvestingApi, "marginInvestingApi");
            Intrinsics.checkNotNullParameter(multiAccountMarginEligibilityService, "multiAccountMarginEligibilityService");
            Intrinsics.checkNotNullParameter(marginUpgradeRestrictionStore, "marginUpgradeRestrictionStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new MarginEligibilityStore_Factory(marginInvestingApi, multiAccountMarginEligibilityService, marginUpgradeRestrictionStore, storeBundle);
        }

        @JvmStatic
        public final MarginEligibilityStore newInstance(MarginInvestingApi marginInvestingApi, MultiAccountEligibilityService multiAccountMarginEligibilityService, MarginUpgradeRestrictionStore marginUpgradeRestrictionStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(marginInvestingApi, "marginInvestingApi");
            Intrinsics.checkNotNullParameter(multiAccountMarginEligibilityService, "multiAccountMarginEligibilityService");
            Intrinsics.checkNotNullParameter(marginUpgradeRestrictionStore, "marginUpgradeRestrictionStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new MarginEligibilityStore(marginInvestingApi, multiAccountMarginEligibilityService, marginUpgradeRestrictionStore, storeBundle);
        }
    }
}
