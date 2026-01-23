package com.robinhood.android.gold.switchplans;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import midas.service.p509v1.MidasService;

/* compiled from: GoldSwitchPlansDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansDuxo;", "midasService", "Ljavax/inject/Provider;", "Lmidas/service/v1/MidasService;", "goldSubscriptionStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-gold-switch-plans_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GoldSwitchPlansDuxo_Factory implements Factory<GoldSwitchPlansDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<GoldSubscriptionStore> goldSubscriptionStore;
    private final Provider<MidasService> midasService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final GoldSwitchPlansDuxo_Factory create(Provider<MidasService> provider, Provider<GoldSubscriptionStore> provider2, Provider<DuxoBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final GoldSwitchPlansDuxo newInstance(MidasService midasService, GoldSubscriptionStore goldSubscriptionStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(midasService, goldSubscriptionStore, duxoBundle);
    }

    public GoldSwitchPlansDuxo_Factory(Provider<MidasService> midasService, Provider<GoldSubscriptionStore> goldSubscriptionStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(midasService, "midasService");
        Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.midasService = midasService;
        this.goldSubscriptionStore = goldSubscriptionStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public GoldSwitchPlansDuxo get() {
        Companion companion = INSTANCE;
        MidasService midasService = this.midasService.get();
        Intrinsics.checkNotNullExpressionValue(midasService, "get(...)");
        GoldSubscriptionStore goldSubscriptionStore = this.goldSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(goldSubscriptionStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(midasService, goldSubscriptionStore, duxoBundle);
    }

    /* compiled from: GoldSwitchPlansDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansDuxo_Factory;", "midasService", "Ljavax/inject/Provider;", "Lmidas/service/v1/MidasService;", "goldSubscriptionStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansDuxo;", "feature-gold-switch-plans_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GoldSwitchPlansDuxo_Factory create(Provider<MidasService> midasService, Provider<GoldSubscriptionStore> goldSubscriptionStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(midasService, "midasService");
            Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new GoldSwitchPlansDuxo_Factory(midasService, goldSubscriptionStore, duxoBundle);
        }

        @JvmStatic
        public final GoldSwitchPlansDuxo newInstance(MidasService midasService, GoldSubscriptionStore goldSubscriptionStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(midasService, "midasService");
            Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new GoldSwitchPlansDuxo(midasService, goldSubscriptionStore, duxoBundle);
        }
    }
}
