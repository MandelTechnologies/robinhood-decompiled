package com.robinhood.android.gold.upgrade.legacy;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.lib.upgrade.store.GoldUpgradeStore;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyGoldUpgradeValuePropsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeValuePropsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeValuePropsDuxo;", "goldUpgradeStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeValuePropsDuxo_Factory implements Factory<LegacyGoldUpgradeValuePropsDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<GoldUpgradeStore> goldUpgradeStore;
    private final Provider<PerformanceLogger> performanceLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final LegacyGoldUpgradeValuePropsDuxo_Factory create(Provider<GoldUpgradeStore> provider, Provider<PerformanceLogger> provider2, Provider<DuxoBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final LegacyGoldUpgradeValuePropsDuxo newInstance(GoldUpgradeStore goldUpgradeStore, PerformanceLogger performanceLogger, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(goldUpgradeStore, performanceLogger, duxoBundle);
    }

    public LegacyGoldUpgradeValuePropsDuxo_Factory(Provider<GoldUpgradeStore> goldUpgradeStore, Provider<PerformanceLogger> performanceLogger, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(goldUpgradeStore, "goldUpgradeStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.goldUpgradeStore = goldUpgradeStore;
        this.performanceLogger = performanceLogger;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public LegacyGoldUpgradeValuePropsDuxo get() {
        Companion companion = INSTANCE;
        GoldUpgradeStore goldUpgradeStore = this.goldUpgradeStore.get();
        Intrinsics.checkNotNullExpressionValue(goldUpgradeStore, "get(...)");
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(goldUpgradeStore, performanceLogger, duxoBundle);
    }

    /* compiled from: LegacyGoldUpgradeValuePropsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeValuePropsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeValuePropsDuxo_Factory;", "goldUpgradeStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeValuePropsDuxo;", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LegacyGoldUpgradeValuePropsDuxo_Factory create(Provider<GoldUpgradeStore> goldUpgradeStore, Provider<PerformanceLogger> performanceLogger, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(goldUpgradeStore, "goldUpgradeStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new LegacyGoldUpgradeValuePropsDuxo_Factory(goldUpgradeStore, performanceLogger, duxoBundle);
        }

        @JvmStatic
        public final LegacyGoldUpgradeValuePropsDuxo newInstance(GoldUpgradeStore goldUpgradeStore, PerformanceLogger performanceLogger, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(goldUpgradeStore, "goldUpgradeStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new LegacyGoldUpgradeValuePropsDuxo(goldUpgradeStore, performanceLogger, duxoBundle);
        }
    }
}
