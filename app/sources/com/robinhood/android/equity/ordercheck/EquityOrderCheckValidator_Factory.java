package com.robinhood.android.equity.ordercheck;

import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.CryptoPendingAndCancelStore;
import com.robinhood.librobinhood.data.store.EquityOrderChecksStore;
import com.robinhood.prefs.EnumPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rosetta.order.AlertType;

/* compiled from: EquityOrderCheckValidator_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BJ\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0017\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "equityOrderChecksStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/EquityOrderChecksStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "alertTypeDebugOverridePref", "Lcom/robinhood/prefs/EnumPreference;", "Lrosetta/order/AlertType;", "Lkotlin/jvm/JvmSuppressWildcards;", "cryptoPendingAndCancelStore", "Lcom/robinhood/librobinhood/data/store/CryptoPendingAndCancelStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class EquityOrderCheckValidator_Factory implements Factory<EquityOrderCheckValidator> {
    private final Provider<EnumPreference<AlertType>> alertTypeDebugOverridePref;
    private final Provider<CryptoPendingAndCancelStore> cryptoPendingAndCancelStore;
    private final Provider<EquityOrderChecksStore> equityOrderChecksStore;
    private final Provider<TraderEventLogger> eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EquityOrderCheckValidator_Factory create(Provider<EquityOrderChecksStore> provider, Provider<TraderEventLogger> provider2, Provider<EnumPreference<AlertType>> provider3, Provider<CryptoPendingAndCancelStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final EquityOrderCheckValidator newInstance(EquityOrderChecksStore equityOrderChecksStore, TraderEventLogger traderEventLogger, EnumPreference<AlertType> enumPreference, CryptoPendingAndCancelStore cryptoPendingAndCancelStore) {
        return INSTANCE.newInstance(equityOrderChecksStore, traderEventLogger, enumPreference, cryptoPendingAndCancelStore);
    }

    public EquityOrderCheckValidator_Factory(Provider<EquityOrderChecksStore> equityOrderChecksStore, Provider<TraderEventLogger> eventLogger, Provider<EnumPreference<AlertType>> alertTypeDebugOverridePref, Provider<CryptoPendingAndCancelStore> cryptoPendingAndCancelStore) {
        Intrinsics.checkNotNullParameter(equityOrderChecksStore, "equityOrderChecksStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(alertTypeDebugOverridePref, "alertTypeDebugOverridePref");
        Intrinsics.checkNotNullParameter(cryptoPendingAndCancelStore, "cryptoPendingAndCancelStore");
        this.equityOrderChecksStore = equityOrderChecksStore;
        this.eventLogger = eventLogger;
        this.alertTypeDebugOverridePref = alertTypeDebugOverridePref;
        this.cryptoPendingAndCancelStore = cryptoPendingAndCancelStore;
    }

    @Override // javax.inject.Provider
    public EquityOrderCheckValidator get() {
        Companion companion = INSTANCE;
        EquityOrderChecksStore equityOrderChecksStore = this.equityOrderChecksStore.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderChecksStore, "get(...)");
        TraderEventLogger traderEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(traderEventLogger, "get(...)");
        EnumPreference<AlertType> enumPreference = this.alertTypeDebugOverridePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        CryptoPendingAndCancelStore cryptoPendingAndCancelStore = this.cryptoPendingAndCancelStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoPendingAndCancelStore, "get(...)");
        return companion.newInstance(equityOrderChecksStore, traderEventLogger, enumPreference, cryptoPendingAndCancelStore);
    }

    /* compiled from: EquityOrderCheckValidator_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J3\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator_Factory;", "equityOrderChecksStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/EquityOrderChecksStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "alertTypeDebugOverridePref", "Lcom/robinhood/prefs/EnumPreference;", "Lrosetta/order/AlertType;", "Lkotlin/jvm/JvmSuppressWildcards;", "cryptoPendingAndCancelStore", "Lcom/robinhood/librobinhood/data/store/CryptoPendingAndCancelStore;", "newInstance", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityOrderCheckValidator_Factory create(Provider<EquityOrderChecksStore> equityOrderChecksStore, Provider<TraderEventLogger> eventLogger, Provider<EnumPreference<AlertType>> alertTypeDebugOverridePref, Provider<CryptoPendingAndCancelStore> cryptoPendingAndCancelStore) {
            Intrinsics.checkNotNullParameter(equityOrderChecksStore, "equityOrderChecksStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(alertTypeDebugOverridePref, "alertTypeDebugOverridePref");
            Intrinsics.checkNotNullParameter(cryptoPendingAndCancelStore, "cryptoPendingAndCancelStore");
            return new EquityOrderCheckValidator_Factory(equityOrderChecksStore, eventLogger, alertTypeDebugOverridePref, cryptoPendingAndCancelStore);
        }

        @JvmStatic
        public final EquityOrderCheckValidator newInstance(EquityOrderChecksStore equityOrderChecksStore, TraderEventLogger eventLogger, EnumPreference<AlertType> alertTypeDebugOverridePref, CryptoPendingAndCancelStore cryptoPendingAndCancelStore) {
            Intrinsics.checkNotNullParameter(equityOrderChecksStore, "equityOrderChecksStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(alertTypeDebugOverridePref, "alertTypeDebugOverridePref");
            Intrinsics.checkNotNullParameter(cryptoPendingAndCancelStore, "cryptoPendingAndCancelStore");
            return new EquityOrderCheckValidator(equityOrderChecksStore, eventLogger, alertTypeDebugOverridePref, cryptoPendingAndCancelStore);
        }
    }
}
