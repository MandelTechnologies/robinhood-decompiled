package com.robinhood.store.achrelationship;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IavStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/achrelationship/IavStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/achrelationship/IavStore;", "paymentMethodLastUsagesPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringToLongMapPreference;", "cashier", "Lcom/robinhood/android/api/cashier/Cashier;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class IavStore_Factory implements Factory<IavStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AchRelationshipStore> achRelationshipStore;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<Cashier> cashier;
    private final Provider<EventLogger> eventLogger;
    private final Provider<StringToLongMapPreference> paymentMethodLastUsagesPref;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final IavStore_Factory create(Provider<StringToLongMapPreference> provider, Provider<Cashier> provider2, Provider<AchRelationshipStore> provider3, Provider<AnalyticsLogger> provider4, Provider<EventLogger> provider5, Provider<StoreBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final IavStore newInstance(StringToLongMapPreference stringToLongMapPreference, Cashier cashier, AchRelationshipStore achRelationshipStore, AnalyticsLogger analyticsLogger, EventLogger eventLogger, StoreBundle storeBundle) {
        return INSTANCE.newInstance(stringToLongMapPreference, cashier, achRelationshipStore, analyticsLogger, eventLogger, storeBundle);
    }

    public IavStore_Factory(Provider<StringToLongMapPreference> paymentMethodLastUsagesPref, Provider<Cashier> cashier, Provider<AchRelationshipStore> achRelationshipStore, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
        Intrinsics.checkNotNullParameter(cashier, "cashier");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.paymentMethodLastUsagesPref = paymentMethodLastUsagesPref;
        this.cashier = cashier;
        this.achRelationshipStore = achRelationshipStore;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public IavStore get() {
        Companion companion = INSTANCE;
        StringToLongMapPreference stringToLongMapPreference = this.paymentMethodLastUsagesPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference, "get(...)");
        Cashier cashier = this.cashier.get();
        Intrinsics.checkNotNullExpressionValue(cashier, "get(...)");
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(achRelationshipStore, "get(...)");
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(stringToLongMapPreference, cashier, achRelationshipStore, analyticsLogger, eventLogger, storeBundle);
    }

    /* compiled from: IavStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/store/achrelationship/IavStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/achrelationship/IavStore_Factory;", "paymentMethodLastUsagesPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringToLongMapPreference;", "cashier", "Lcom/robinhood/android/api/cashier/Cashier;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/achrelationship/IavStore;", "lib-store-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IavStore_Factory create(Provider<StringToLongMapPreference> paymentMethodLastUsagesPref, Provider<Cashier> cashier, Provider<AchRelationshipStore> achRelationshipStore, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
            Intrinsics.checkNotNullParameter(cashier, "cashier");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IavStore_Factory(paymentMethodLastUsagesPref, cashier, achRelationshipStore, analytics, eventLogger, storeBundle);
        }

        @JvmStatic
        public final IavStore newInstance(StringToLongMapPreference paymentMethodLastUsagesPref, Cashier cashier, AchRelationshipStore achRelationshipStore, AnalyticsLogger analytics, EventLogger eventLogger, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
            Intrinsics.checkNotNullParameter(cashier, "cashier");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IavStore(paymentMethodLastUsagesPref, cashier, achRelationshipStore, analytics, eventLogger, storeBundle);
        }
    }
}
