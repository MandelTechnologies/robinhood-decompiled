package com.robinhood.android.syp.retirement;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.SypRetirementUpsellStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SypRetirementUpsellDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/syp/retirement/SypRetirementUpsellDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellDuxo;", "sypRetirementUpsellStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/SypRetirementUpsellStore;", "stateProvider", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-rhy-syp-retirement-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SypRetirementUpsellDuxo_Factory implements Factory<SypRetirementUpsellDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SypRetirementUpsellStateProvider> stateProvider;
    private final Provider<SypRetirementUpsellStore> sypRetirementUpsellStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final SypRetirementUpsellDuxo_Factory create(Provider<SypRetirementUpsellStore> provider, Provider<SypRetirementUpsellStateProvider> provider2, Provider<DuxoBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final SypRetirementUpsellDuxo newInstance(SypRetirementUpsellStore sypRetirementUpsellStore, SypRetirementUpsellStateProvider sypRetirementUpsellStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(sypRetirementUpsellStore, sypRetirementUpsellStateProvider, duxoBundle);
    }

    public SypRetirementUpsellDuxo_Factory(Provider<SypRetirementUpsellStore> sypRetirementUpsellStore, Provider<SypRetirementUpsellStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(sypRetirementUpsellStore, "sypRetirementUpsellStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.sypRetirementUpsellStore = sypRetirementUpsellStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public SypRetirementUpsellDuxo get() {
        Companion companion = INSTANCE;
        SypRetirementUpsellStore sypRetirementUpsellStore = this.sypRetirementUpsellStore.get();
        Intrinsics.checkNotNullExpressionValue(sypRetirementUpsellStore, "get(...)");
        SypRetirementUpsellStateProvider sypRetirementUpsellStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(sypRetirementUpsellStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(sypRetirementUpsellStore, sypRetirementUpsellStateProvider, duxoBundle);
    }

    /* compiled from: SypRetirementUpsellDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/syp/retirement/SypRetirementUpsellDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellDuxo_Factory;", "sypRetirementUpsellStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/SypRetirementUpsellStore;", "stateProvider", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellDuxo;", "feature-rhy-syp-retirement-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SypRetirementUpsellDuxo_Factory create(Provider<SypRetirementUpsellStore> sypRetirementUpsellStore, Provider<SypRetirementUpsellStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(sypRetirementUpsellStore, "sypRetirementUpsellStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SypRetirementUpsellDuxo_Factory(sypRetirementUpsellStore, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final SypRetirementUpsellDuxo newInstance(SypRetirementUpsellStore sypRetirementUpsellStore, SypRetirementUpsellStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(sypRetirementUpsellStore, "sypRetirementUpsellStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SypRetirementUpsellDuxo(sypRetirementUpsellStore, stateProvider, duxoBundle);
        }
    }
}
