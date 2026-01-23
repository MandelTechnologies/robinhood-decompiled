package com.robinhood.android.rhy.cardactivation.p243ui;

import com.robinhood.android.common.mcduckling.location.LocationProtectionManager;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardActivationLocationProtectionFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationLocationProtectionFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationLocationProtectionFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "locationProtectionManager", "Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CardActivationLocationProtectionFragment_MembersInjector implements MembersInjector<CardActivationLocationProtectionFragment> {
    private final Provider<LocationProtectionManager> locationProtectionManager;
    private final Provider<MinervaAccountStore> minervaAccountStore;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CardActivationLocationProtectionFragment> create(Provider<BaseFragmentSingletons> provider, Provider<LocationProtectionManager> provider2, Provider<MinervaAccountStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectLocationProtectionManager(CardActivationLocationProtectionFragment cardActivationLocationProtectionFragment, LocationProtectionManager locationProtectionManager) {
        INSTANCE.injectLocationProtectionManager(cardActivationLocationProtectionFragment, locationProtectionManager);
    }

    @JvmStatic
    public static final void injectMinervaAccountStore(CardActivationLocationProtectionFragment cardActivationLocationProtectionFragment, MinervaAccountStore minervaAccountStore) {
        INSTANCE.injectMinervaAccountStore(cardActivationLocationProtectionFragment, minervaAccountStore);
    }

    public CardActivationLocationProtectionFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<LocationProtectionManager> locationProtectionManager, Provider<MinervaAccountStore> minervaAccountStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(locationProtectionManager, "locationProtectionManager");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        this.singletons = singletons;
        this.locationProtectionManager = locationProtectionManager;
        this.minervaAccountStore = minervaAccountStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CardActivationLocationProtectionFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        LocationProtectionManager locationProtectionManager = this.locationProtectionManager.get();
        Intrinsics.checkNotNullExpressionValue(locationProtectionManager, "get(...)");
        companion2.injectLocationProtectionManager(instance, locationProtectionManager);
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(minervaAccountStore, "get(...)");
        companion2.injectMinervaAccountStore(instance, minervaAccountStore);
    }

    /* compiled from: CardActivationLocationProtectionFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationLocationProtectionFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationLocationProtectionFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "locationProtectionManager", "Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "injectLocationProtectionManager", "", "instance", "injectMinervaAccountStore", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CardActivationLocationProtectionFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<LocationProtectionManager> locationProtectionManager, Provider<MinervaAccountStore> minervaAccountStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(locationProtectionManager, "locationProtectionManager");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            return new CardActivationLocationProtectionFragment_MembersInjector(singletons, locationProtectionManager, minervaAccountStore);
        }

        @JvmStatic
        public final void injectLocationProtectionManager(CardActivationLocationProtectionFragment instance, LocationProtectionManager locationProtectionManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(locationProtectionManager, "locationProtectionManager");
            instance.setLocationProtectionManager(locationProtectionManager);
        }

        @JvmStatic
        public final void injectMinervaAccountStore(CardActivationLocationProtectionFragment instance, MinervaAccountStore minervaAccountStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            instance.setMinervaAccountStore(minervaAccountStore);
        }
    }
}
