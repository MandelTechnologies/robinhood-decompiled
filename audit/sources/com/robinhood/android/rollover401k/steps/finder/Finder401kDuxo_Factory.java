package com.robinhood.android.rollover401k.steps.finder;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.AcatsPlaidStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Finder401kDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/finder/Finder401kDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kDuxo;", "acatsPlaidStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsPlaidStore;", "rolloverStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "packageName", "", "stateProvider", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class Finder401kDuxo_Factory implements Factory<Finder401kDuxo> {
    private final Provider<AcatsPlaidStore> acatsPlaidStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<String> packageName;
    private final Provider<Retirement401kRolloverStore> rolloverStore;
    private final Provider<Finder401kState4> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final Finder401kDuxo_Factory create(Provider<AcatsPlaidStore> provider, Provider<Retirement401kRolloverStore> provider2, Provider<String> provider3, Provider<Finder401kState4> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final Finder401kDuxo newInstance(AcatsPlaidStore acatsPlaidStore, Retirement401kRolloverStore retirement401kRolloverStore, String str, Finder401kState4 finder401kState4, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(acatsPlaidStore, retirement401kRolloverStore, str, finder401kState4, duxoBundle);
    }

    public Finder401kDuxo_Factory(Provider<AcatsPlaidStore> acatsPlaidStore, Provider<Retirement401kRolloverStore> rolloverStore, Provider<String> packageName, Provider<Finder401kState4> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(acatsPlaidStore, "acatsPlaidStore");
        Intrinsics.checkNotNullParameter(rolloverStore, "rolloverStore");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.acatsPlaidStore = acatsPlaidStore;
        this.rolloverStore = rolloverStore;
        this.packageName = packageName;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public Finder401kDuxo get() {
        Companion companion = INSTANCE;
        AcatsPlaidStore acatsPlaidStore = this.acatsPlaidStore.get();
        Intrinsics.checkNotNullExpressionValue(acatsPlaidStore, "get(...)");
        Retirement401kRolloverStore retirement401kRolloverStore = this.rolloverStore.get();
        Intrinsics.checkNotNullExpressionValue(retirement401kRolloverStore, "get(...)");
        String str = this.packageName.get();
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        Finder401kState4 finder401kState4 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(finder401kState4, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(acatsPlaidStore, retirement401kRolloverStore, str, finder401kState4, duxoBundle);
    }

    /* compiled from: Finder401kDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/finder/Finder401kDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kDuxo_Factory;", "acatsPlaidStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsPlaidStore;", "rolloverStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "packageName", "", "stateProvider", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kDuxo;", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Finder401kDuxo_Factory create(Provider<AcatsPlaidStore> acatsPlaidStore, Provider<Retirement401kRolloverStore> rolloverStore, Provider<String> packageName, Provider<Finder401kState4> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(acatsPlaidStore, "acatsPlaidStore");
            Intrinsics.checkNotNullParameter(rolloverStore, "rolloverStore");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new Finder401kDuxo_Factory(acatsPlaidStore, rolloverStore, packageName, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final Finder401kDuxo newInstance(AcatsPlaidStore acatsPlaidStore, Retirement401kRolloverStore rolloverStore, String packageName, Finder401kState4 stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(acatsPlaidStore, "acatsPlaidStore");
            Intrinsics.checkNotNullParameter(rolloverStore, "rolloverStore");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new Finder401kDuxo(acatsPlaidStore, rolloverStore, packageName, stateProvider, duxoBundle);
        }
    }
}
