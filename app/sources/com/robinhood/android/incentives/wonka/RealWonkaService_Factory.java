package com.robinhood.android.incentives.wonka;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealWonkaService_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/incentives/wonka/RealWonkaService_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/incentives/wonka/RealWonkaService;", "sweepsInterestStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-wonka_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class RealWonkaService_Factory implements Factory<RealWonkaService> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<SweepEnrollmentStore> sweepEnrollmentStore;
    private final Provider<SweepsInterestStore> sweepsInterestStore;

    @JvmStatic
    public static final RealWonkaService_Factory create(Provider<SweepsInterestStore> provider, Provider<SweepEnrollmentStore> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final RealWonkaService newInstance(SweepsInterestStore sweepsInterestStore, SweepEnrollmentStore sweepEnrollmentStore) {
        return INSTANCE.newInstance(sweepsInterestStore, sweepEnrollmentStore);
    }

    public RealWonkaService_Factory(Provider<SweepsInterestStore> sweepsInterestStore, Provider<SweepEnrollmentStore> sweepEnrollmentStore) {
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        this.sweepsInterestStore = sweepsInterestStore;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
    }

    @Override // javax.inject.Provider
    public RealWonkaService get() {
        Companion companion = INSTANCE;
        SweepsInterestStore sweepsInterestStore = this.sweepsInterestStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsInterestStore, "get(...)");
        SweepEnrollmentStore sweepEnrollmentStore = this.sweepEnrollmentStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepEnrollmentStore, "get(...)");
        return companion.newInstance(sweepsInterestStore, sweepEnrollmentStore);
    }

    /* compiled from: RealWonkaService_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/incentives/wonka/RealWonkaService_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/incentives/wonka/RealWonkaService_Factory;", "sweepsInterestStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "newInstance", "Lcom/robinhood/android/incentives/wonka/RealWonkaService;", "lib-wonka_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealWonkaService_Factory create(Provider<SweepsInterestStore> sweepsInterestStore, Provider<SweepEnrollmentStore> sweepEnrollmentStore) {
            Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
            Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
            return new RealWonkaService_Factory(sweepsInterestStore, sweepEnrollmentStore);
        }

        @JvmStatic
        public final RealWonkaService newInstance(SweepsInterestStore sweepsInterestStore, SweepEnrollmentStore sweepEnrollmentStore) {
            Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
            Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
            return new RealWonkaService(sweepsInterestStore, sweepEnrollmentStore);
        }
    }
}
