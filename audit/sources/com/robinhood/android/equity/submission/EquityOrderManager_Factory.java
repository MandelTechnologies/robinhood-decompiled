package com.robinhood.android.equity.submission;

import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator;
import com.robinhood.librobinhood.data.store.OrderStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityOrderManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/equity/submission/EquityOrderManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "validator", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-equity-submission_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityOrderManager_Factory implements Factory<EquityOrderManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<TraderEventLogger> eventLogger;
    private final Provider<OrderStore> orderStore;
    private final Provider<EquityOrderCheckValidator> validator;

    @JvmStatic
    public static final EquityOrderManager_Factory create(Provider<CoroutineScope> provider, Provider<TraderEventLogger> provider2, Provider<OrderStore> provider3, Provider<EquityOrderCheckValidator> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final EquityOrderManager newInstance(CoroutineScope coroutineScope, TraderEventLogger traderEventLogger, OrderStore orderStore, EquityOrderCheckValidator equityOrderCheckValidator) {
        return INSTANCE.newInstance(coroutineScope, traderEventLogger, orderStore, equityOrderCheckValidator);
    }

    public EquityOrderManager_Factory(Provider<CoroutineScope> coroutineScope, Provider<TraderEventLogger> eventLogger, Provider<OrderStore> orderStore, Provider<EquityOrderCheckValidator> validator) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.coroutineScope = coroutineScope;
        this.eventLogger = eventLogger;
        this.orderStore = orderStore;
        this.validator = validator;
    }

    @Override // javax.inject.Provider
    public EquityOrderManager get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        TraderEventLogger traderEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(traderEventLogger, "get(...)");
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        EquityOrderCheckValidator equityOrderCheckValidator = this.validator.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderCheckValidator, "get(...)");
        return companion.newInstance(coroutineScope, traderEventLogger, orderStore, equityOrderCheckValidator);
    }

    /* compiled from: EquityOrderManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equity/submission/EquityOrderManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equity/submission/EquityOrderManager_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "validator", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "newInstance", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "lib-equity-submission_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityOrderManager_Factory create(Provider<CoroutineScope> coroutineScope, Provider<TraderEventLogger> eventLogger, Provider<OrderStore> orderStore, Provider<EquityOrderCheckValidator> validator) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(validator, "validator");
            return new EquityOrderManager_Factory(coroutineScope, eventLogger, orderStore, validator);
        }

        @JvmStatic
        public final EquityOrderManager newInstance(CoroutineScope coroutineScope, TraderEventLogger eventLogger, OrderStore orderStore, EquityOrderCheckValidator validator) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(validator, "validator");
            return new EquityOrderManager(coroutineScope, eventLogger, orderStore, validator);
        }
    }
}
