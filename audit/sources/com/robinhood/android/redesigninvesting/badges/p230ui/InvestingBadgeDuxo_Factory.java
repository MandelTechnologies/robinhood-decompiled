package com.robinhood.android.redesigninvesting.badges.p230ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.redesigninvesting.experiments.RedesignInvestingExperimentStore;
import com.robinhood.android.redesigninvesting.redesignsettings.RedesignSettingsManager;
import com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestingBadgeDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeDuxo;", "redesignInvestingExperimentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;", "investingBadgeStore", "Lcom/robinhood/android/redesigninvesting/store/badges/InvestingBadgeStore;", "redesignSettingsManager", "Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettingsManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-badges-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class InvestingBadgeDuxo_Factory implements Factory<InvestingBadgeDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InvestingBadgeStore> investingBadgeStore;
    private final Provider<RedesignInvestingExperimentStore> redesignInvestingExperimentStore;
    private final Provider<RedesignSettingsManager> redesignSettingsManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InvestingBadgeDuxo_Factory create(Provider<RedesignInvestingExperimentStore> provider, Provider<InvestingBadgeStore> provider2, Provider<RedesignSettingsManager> provider3, Provider<DuxoBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final InvestingBadgeDuxo newInstance(RedesignInvestingExperimentStore redesignInvestingExperimentStore, InvestingBadgeStore investingBadgeStore, RedesignSettingsManager redesignSettingsManager, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(redesignInvestingExperimentStore, investingBadgeStore, redesignSettingsManager, duxoBundle);
    }

    public InvestingBadgeDuxo_Factory(Provider<RedesignInvestingExperimentStore> redesignInvestingExperimentStore, Provider<InvestingBadgeStore> investingBadgeStore, Provider<RedesignSettingsManager> redesignSettingsManager, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(redesignInvestingExperimentStore, "redesignInvestingExperimentStore");
        Intrinsics.checkNotNullParameter(investingBadgeStore, "investingBadgeStore");
        Intrinsics.checkNotNullParameter(redesignSettingsManager, "redesignSettingsManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.redesignInvestingExperimentStore = redesignInvestingExperimentStore;
        this.investingBadgeStore = investingBadgeStore;
        this.redesignSettingsManager = redesignSettingsManager;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public InvestingBadgeDuxo get() {
        Companion companion = INSTANCE;
        RedesignInvestingExperimentStore redesignInvestingExperimentStore = this.redesignInvestingExperimentStore.get();
        Intrinsics.checkNotNullExpressionValue(redesignInvestingExperimentStore, "get(...)");
        InvestingBadgeStore investingBadgeStore = this.investingBadgeStore.get();
        Intrinsics.checkNotNullExpressionValue(investingBadgeStore, "get(...)");
        RedesignSettingsManager redesignSettingsManager = this.redesignSettingsManager.get();
        Intrinsics.checkNotNullExpressionValue(redesignSettingsManager, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(redesignInvestingExperimentStore, investingBadgeStore, redesignSettingsManager, duxoBundle);
    }

    /* compiled from: InvestingBadgeDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeDuxo_Factory;", "redesignInvestingExperimentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;", "investingBadgeStore", "Lcom/robinhood/android/redesigninvesting/store/badges/InvestingBadgeStore;", "redesignSettingsManager", "Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettingsManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeDuxo;", "lib-badges-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InvestingBadgeDuxo_Factory create(Provider<RedesignInvestingExperimentStore> redesignInvestingExperimentStore, Provider<InvestingBadgeStore> investingBadgeStore, Provider<RedesignSettingsManager> redesignSettingsManager, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(redesignInvestingExperimentStore, "redesignInvestingExperimentStore");
            Intrinsics.checkNotNullParameter(investingBadgeStore, "investingBadgeStore");
            Intrinsics.checkNotNullParameter(redesignSettingsManager, "redesignSettingsManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new InvestingBadgeDuxo_Factory(redesignInvestingExperimentStore, investingBadgeStore, redesignSettingsManager, duxoBundle);
        }

        @JvmStatic
        public final InvestingBadgeDuxo newInstance(RedesignInvestingExperimentStore redesignInvestingExperimentStore, InvestingBadgeStore investingBadgeStore, RedesignSettingsManager redesignSettingsManager, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(redesignInvestingExperimentStore, "redesignInvestingExperimentStore");
            Intrinsics.checkNotNullParameter(investingBadgeStore, "investingBadgeStore");
            Intrinsics.checkNotNullParameter(redesignSettingsManager, "redesignSettingsManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new InvestingBadgeDuxo(redesignInvestingExperimentStore, investingBadgeStore, redesignSettingsManager, duxoBundle);
        }
    }
}
