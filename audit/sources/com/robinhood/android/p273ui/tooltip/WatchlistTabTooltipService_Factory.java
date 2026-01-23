package com.robinhood.android.p273ui.tooltip;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WatchlistTabTooltipService_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/ui/tooltip/WatchlistTabTooltipService_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/ui/tooltip/WatchlistTabTooltipService;", "hasSeenTooltipPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WatchlistTabTooltipService_Factory implements Factory<WatchlistTabTooltipService> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BooleanPreference> hasSeenTooltipPref;
    private final Provider<RegionGateProvider> regionGateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final WatchlistTabTooltipService_Factory create(Provider<BooleanPreference> provider, Provider<AccountProvider> provider2, Provider<RegionGateProvider> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final WatchlistTabTooltipService newInstance(BooleanPreference booleanPreference, AccountProvider accountProvider, RegionGateProvider regionGateProvider) {
        return INSTANCE.newInstance(booleanPreference, accountProvider, regionGateProvider);
    }

    public WatchlistTabTooltipService_Factory(Provider<BooleanPreference> hasSeenTooltipPref, Provider<AccountProvider> accountProvider, Provider<RegionGateProvider> regionGateProvider) {
        Intrinsics.checkNotNullParameter(hasSeenTooltipPref, "hasSeenTooltipPref");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.hasSeenTooltipPref = hasSeenTooltipPref;
        this.accountProvider = accountProvider;
        this.regionGateProvider = regionGateProvider;
    }

    @Override // javax.inject.Provider
    public WatchlistTabTooltipService get() {
        Companion companion = INSTANCE;
        BooleanPreference booleanPreference = this.hasSeenTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        return companion.newInstance(booleanPreference, accountProvider, regionGateProvider);
    }

    /* compiled from: WatchlistTabTooltipService_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/ui/tooltip/WatchlistTabTooltipService_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/ui/tooltip/WatchlistTabTooltipService_Factory;", "hasSeenTooltipPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "newInstance", "Lcom/robinhood/android/ui/tooltip/WatchlistTabTooltipService;", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WatchlistTabTooltipService_Factory create(Provider<BooleanPreference> hasSeenTooltipPref, Provider<AccountProvider> accountProvider, Provider<RegionGateProvider> regionGateProvider) {
            Intrinsics.checkNotNullParameter(hasSeenTooltipPref, "hasSeenTooltipPref");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            return new WatchlistTabTooltipService_Factory(hasSeenTooltipPref, accountProvider, regionGateProvider);
        }

        @JvmStatic
        public final WatchlistTabTooltipService newInstance(BooleanPreference hasSeenTooltipPref, AccountProvider accountProvider, RegionGateProvider regionGateProvider) {
            Intrinsics.checkNotNullParameter(hasSeenTooltipPref, "hasSeenTooltipPref");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            return new WatchlistTabTooltipService(hasSeenTooltipPref, accountProvider, regionGateProvider);
        }
    }
}
