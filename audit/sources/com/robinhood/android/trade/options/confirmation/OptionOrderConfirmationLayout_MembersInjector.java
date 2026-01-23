package com.robinhood.android.trade.options.confirmation;

import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderConfirmationLayout_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationLayout_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationLayout;", "marketHoursManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OptionOrderConfirmationLayout_MembersInjector implements MembersInjector<OptionOrderConfirmationLayout> {
    private final Provider<TraderEventLogger> eventLogger;
    private final Provider<TraderMarketHoursManager> marketHoursManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OptionOrderConfirmationLayout> create(Provider<TraderMarketHoursManager> provider, Provider<TraderEventLogger> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectEventLogger(OptionOrderConfirmationLayout optionOrderConfirmationLayout, TraderEventLogger traderEventLogger) {
        INSTANCE.injectEventLogger(optionOrderConfirmationLayout, traderEventLogger);
    }

    @JvmStatic
    public static final void injectMarketHoursManager(OptionOrderConfirmationLayout optionOrderConfirmationLayout, TraderMarketHoursManager traderMarketHoursManager) {
        INSTANCE.injectMarketHoursManager(optionOrderConfirmationLayout, traderMarketHoursManager);
    }

    public OptionOrderConfirmationLayout_MembersInjector(Provider<TraderMarketHoursManager> marketHoursManager, Provider<TraderEventLogger> eventLogger) {
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.marketHoursManager = marketHoursManager;
        this.eventLogger = eventLogger;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionOrderConfirmationLayout instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        companion.injectMarketHoursManager(instance, traderMarketHoursManager);
        TraderEventLogger traderEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(traderEventLogger, "get(...)");
        companion.injectEventLogger(instance, traderEventLogger);
    }

    /* compiled from: OptionOrderConfirmationLayout_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationLayout_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationLayout;", "marketHoursManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "injectMarketHoursManager", "", "instance", "injectEventLogger", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OptionOrderConfirmationLayout> create(Provider<TraderMarketHoursManager> marketHoursManager, Provider<TraderEventLogger> eventLogger) {
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new OptionOrderConfirmationLayout_MembersInjector(marketHoursManager, eventLogger);
        }

        @JvmStatic
        public final void injectMarketHoursManager(OptionOrderConfirmationLayout instance, TraderMarketHoursManager marketHoursManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            instance.setMarketHoursManager(marketHoursManager);
        }

        @JvmStatic
        public final void injectEventLogger(OptionOrderConfirmationLayout instance, TraderEventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }
    }
}
