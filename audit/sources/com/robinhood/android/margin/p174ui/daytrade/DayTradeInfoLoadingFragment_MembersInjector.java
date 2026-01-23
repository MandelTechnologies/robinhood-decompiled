package com.robinhood.android.margin.p174ui.daytrade;

import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.compose.app.GenericComposeFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeSingletons;
import com.robinhood.contentful.StaticContentStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DayTradeInfoLoadingFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoLoadingFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoLoadingFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DayTradeInfoLoadingFragment_MembersInjector implements MembersInjector<DayTradeInfoLoadingFragment> {
    private final Provider<BrokerageResourceManager> brokerageResourceManager;
    private final Provider<GenericComposeSingletons> genericComposeSingletons;
    private final Provider<ImageLoader> imageLoader;
    private final Provider<NightModeManager> nightModeManager;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<StaticContentStore> staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<DayTradeInfoLoadingFragment> create(Provider<BaseFragmentSingletons> provider, Provider<GenericComposeSingletons> provider2, Provider<BrokerageResourceManager> provider3, Provider<StaticContentStore> provider4, Provider<ImageLoader> provider5, Provider<NightModeManager> provider6, Provider<RegionGateProvider> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final void injectBrokerageResourceManager(DayTradeInfoLoadingFragment dayTradeInfoLoadingFragment, BrokerageResourceManager brokerageResourceManager) {
        INSTANCE.injectBrokerageResourceManager(dayTradeInfoLoadingFragment, brokerageResourceManager);
    }

    @JvmStatic
    public static final void injectImageLoader(DayTradeInfoLoadingFragment dayTradeInfoLoadingFragment, ImageLoader imageLoader) {
        INSTANCE.injectImageLoader(dayTradeInfoLoadingFragment, imageLoader);
    }

    @JvmStatic
    public static final void injectNightModeManager(DayTradeInfoLoadingFragment dayTradeInfoLoadingFragment, NightModeManager nightModeManager) {
        INSTANCE.injectNightModeManager(dayTradeInfoLoadingFragment, nightModeManager);
    }

    @JvmStatic
    public static final void injectRegionGateProvider(DayTradeInfoLoadingFragment dayTradeInfoLoadingFragment, RegionGateProvider regionGateProvider) {
        INSTANCE.injectRegionGateProvider(dayTradeInfoLoadingFragment, regionGateProvider);
    }

    @JvmStatic
    public static final void injectStaticContentStore(DayTradeInfoLoadingFragment dayTradeInfoLoadingFragment, StaticContentStore staticContentStore) {
        INSTANCE.injectStaticContentStore(dayTradeInfoLoadingFragment, staticContentStore);
    }

    public DayTradeInfoLoadingFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<BrokerageResourceManager> brokerageResourceManager, Provider<StaticContentStore> staticContentStore, Provider<ImageLoader> imageLoader, Provider<NightModeManager> nightModeManager, Provider<RegionGateProvider> regionGateProvider) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.singletons = singletons;
        this.genericComposeSingletons = genericComposeSingletons;
        this.brokerageResourceManager = brokerageResourceManager;
        this.staticContentStore = staticContentStore;
        this.imageLoader = imageLoader;
        this.nightModeManager = nightModeManager;
        this.regionGateProvider = regionGateProvider;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DayTradeInfoLoadingFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        GenericComposeFragment_MembersInjector.Companion companion2 = GenericComposeFragment_MembersInjector.INSTANCE;
        GenericComposeSingletons genericComposeSingletons = this.genericComposeSingletons.get();
        Intrinsics.checkNotNullExpressionValue(genericComposeSingletons, "get(...)");
        companion2.injectGenericComposeSingletons(instance, genericComposeSingletons);
        Companion companion3 = INSTANCE;
        BrokerageResourceManager brokerageResourceManager = this.brokerageResourceManager.get();
        Intrinsics.checkNotNullExpressionValue(brokerageResourceManager, "get(...)");
        companion3.injectBrokerageResourceManager(instance, brokerageResourceManager);
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        companion3.injectStaticContentStore(instance, staticContentStore);
        ImageLoader imageLoader = this.imageLoader.get();
        Intrinsics.checkNotNullExpressionValue(imageLoader, "get(...)");
        companion3.injectImageLoader(instance, imageLoader);
        NightModeManager nightModeManager = this.nightModeManager.get();
        Intrinsics.checkNotNullExpressionValue(nightModeManager, "get(...)");
        companion3.injectNightModeManager(instance, nightModeManager);
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        companion3.injectRegionGateProvider(instance, regionGateProvider);
    }

    /* compiled from: DayTradeInfoLoadingFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jp\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoLoadingFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoLoadingFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "injectBrokerageResourceManager", "", "instance", "injectStaticContentStore", "injectImageLoader", "injectNightModeManager", "injectRegionGateProvider", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<DayTradeInfoLoadingFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<BrokerageResourceManager> brokerageResourceManager, Provider<StaticContentStore> staticContentStore, Provider<ImageLoader> imageLoader, Provider<NightModeManager> nightModeManager, Provider<RegionGateProvider> regionGateProvider) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
            Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            return new DayTradeInfoLoadingFragment_MembersInjector(singletons, genericComposeSingletons, brokerageResourceManager, staticContentStore, imageLoader, nightModeManager, regionGateProvider);
        }

        @JvmStatic
        public final void injectBrokerageResourceManager(DayTradeInfoLoadingFragment instance, BrokerageResourceManager brokerageResourceManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
            instance.setBrokerageResourceManager(brokerageResourceManager);
        }

        @JvmStatic
        public final void injectStaticContentStore(DayTradeInfoLoadingFragment instance, StaticContentStore staticContentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            instance.setStaticContentStore(staticContentStore);
        }

        @JvmStatic
        public final void injectImageLoader(DayTradeInfoLoadingFragment instance, ImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            instance.setImageLoader(imageLoader);
        }

        @JvmStatic
        public final void injectNightModeManager(DayTradeInfoLoadingFragment instance, NightModeManager nightModeManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
            instance.setNightModeManager(nightModeManager);
        }

        @JvmStatic
        public final void injectRegionGateProvider(DayTradeInfoLoadingFragment instance, RegionGateProvider regionGateProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            instance.setRegionGateProvider(regionGateProvider);
        }
    }
}
