package com.robinhood.android.debitcard.linking.p098ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.stepupverification.SuvMigrationManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardSuvShimFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardSuvShimFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardSuvShimFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "paymentInstrumentBonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DebitCardSuvShimFragment_MembersInjector implements MembersInjector<DebitCardSuvShimFragment> {
    private final Provider<EventLogger> eventLogger;
    private final Provider<PaymentInstrumentBonfireApi> paymentInstrumentBonfireApi;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<SuvMigrationManager> suvMigrationManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<DebitCardSuvShimFragment> create(Provider<BaseFragmentSingletons> provider, Provider<EventLogger> provider2, Provider<PaymentInstrumentBonfireApi> provider3, Provider<SuvMigrationManager> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectEventLogger(DebitCardSuvShimFragment debitCardSuvShimFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(debitCardSuvShimFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectPaymentInstrumentBonfireApi(DebitCardSuvShimFragment debitCardSuvShimFragment, PaymentInstrumentBonfireApi paymentInstrumentBonfireApi) {
        INSTANCE.injectPaymentInstrumentBonfireApi(debitCardSuvShimFragment, paymentInstrumentBonfireApi);
    }

    @JvmStatic
    public static final void injectSuvMigrationManager(DebitCardSuvShimFragment debitCardSuvShimFragment, SuvMigrationManager suvMigrationManager) {
        INSTANCE.injectSuvMigrationManager(debitCardSuvShimFragment, suvMigrationManager);
    }

    public DebitCardSuvShimFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<EventLogger> eventLogger, Provider<PaymentInstrumentBonfireApi> paymentInstrumentBonfireApi, Provider<SuvMigrationManager> suvMigrationManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
        Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
        this.singletons = singletons;
        this.eventLogger = eventLogger;
        this.paymentInstrumentBonfireApi = paymentInstrumentBonfireApi;
        this.suvMigrationManager = suvMigrationManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DebitCardSuvShimFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.paymentInstrumentBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(paymentInstrumentBonfireApi, "get(...)");
        companion2.injectPaymentInstrumentBonfireApi(instance, paymentInstrumentBonfireApi);
        SuvMigrationManager suvMigrationManager = this.suvMigrationManager.get();
        Intrinsics.checkNotNullExpressionValue(suvMigrationManager, "get(...)");
        companion2.injectSuvMigrationManager(instance, suvMigrationManager);
    }

    /* compiled from: DebitCardSuvShimFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardSuvShimFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardSuvShimFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "paymentInstrumentBonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "injectEventLogger", "", "instance", "injectPaymentInstrumentBonfireApi", "injectSuvMigrationManager", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<DebitCardSuvShimFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<EventLogger> eventLogger, Provider<PaymentInstrumentBonfireApi> paymentInstrumentBonfireApi, Provider<SuvMigrationManager> suvMigrationManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
            Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
            return new DebitCardSuvShimFragment_MembersInjector(singletons, eventLogger, paymentInstrumentBonfireApi, suvMigrationManager);
        }

        @JvmStatic
        public final void injectEventLogger(DebitCardSuvShimFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectPaymentInstrumentBonfireApi(DebitCardSuvShimFragment instance, PaymentInstrumentBonfireApi paymentInstrumentBonfireApi) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
            instance.setPaymentInstrumentBonfireApi(paymentInstrumentBonfireApi);
        }

        @JvmStatic
        public final void injectSuvMigrationManager(DebitCardSuvShimFragment instance, SuvMigrationManager suvMigrationManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
            instance.setSuvMigrationManager(suvMigrationManager);
        }
    }
}
