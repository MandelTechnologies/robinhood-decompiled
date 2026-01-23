package com.robinhood.android.common.mcduckling.p084ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.mcduckling.location.LocationProtectionManager;
import com.robinhood.android.common.p088ui.BaseDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.RhDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseDialogSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocationProtectionDialogFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "locationProtectionManager", "Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class LocationProtectionDialogFragment_MembersInjector implements MembersInjector<LocationProtectionDialogFragment> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<LocationProtectionManager> locationProtectionManager;
    private final Provider<BaseDialogSingletons> singletons;

    @JvmStatic
    public static final MembersInjector<LocationProtectionDialogFragment> create(Provider<BaseDialogSingletons> provider, Provider<AnalyticsLogger> provider2, Provider<LocationProtectionManager> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectLocationProtectionManager(LocationProtectionDialogFragment locationProtectionDialogFragment, LocationProtectionManager locationProtectionManager) {
        INSTANCE.injectLocationProtectionManager(locationProtectionDialogFragment, locationProtectionManager);
    }

    public LocationProtectionDialogFragment_MembersInjector(Provider<BaseDialogSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<LocationProtectionManager> locationProtectionManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(locationProtectionManager, "locationProtectionManager");
        this.singletons = singletons;
        this.analytics = analytics;
        this.locationProtectionManager = locationProtectionManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LocationProtectionDialogFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseDialogFragment_MembersInjector.Companion companion = BaseDialogFragment_MembersInjector.INSTANCE;
        BaseDialogSingletons baseDialogSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseDialogSingletons, "get(...)");
        companion.injectSingletons(instance, baseDialogSingletons);
        RhDialogFragment_MembersInjector.Companion companion2 = RhDialogFragment_MembersInjector.INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        Companion companion3 = INSTANCE;
        LocationProtectionManager locationProtectionManager = this.locationProtectionManager.get();
        Intrinsics.checkNotNullExpressionValue(locationProtectionManager, "get(...)");
        companion3.injectLocationProtectionManager(instance, locationProtectionManager);
    }

    /* compiled from: LocationProtectionDialogFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "locationProtectionManager", "Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;", "injectLocationProtectionManager", "", "instance", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<LocationProtectionDialogFragment> create(Provider<BaseDialogSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<LocationProtectionManager> locationProtectionManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(locationProtectionManager, "locationProtectionManager");
            return new LocationProtectionDialogFragment_MembersInjector(singletons, analytics, locationProtectionManager);
        }

        @JvmStatic
        public final void injectLocationProtectionManager(LocationProtectionDialogFragment instance, LocationProtectionManager locationProtectionManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(locationProtectionManager, "locationProtectionManager");
            instance.setLocationProtectionManager(locationProtectionManager);
        }
    }
}
