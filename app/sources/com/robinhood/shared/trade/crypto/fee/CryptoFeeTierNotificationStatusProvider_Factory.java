package com.robinhood.shared.trade.crypto.fee;

import android.app.Application;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.NotificationSettingStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.LongPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CryptoFeeTierNotificationStatusProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "Ljavax/inject/Provider;", "Landroid/app/Application;", "application", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "notificationSettingStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/LongPreference;", "notifPrimerLastTimeSeenMillisPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "Ljavax/inject/Provider;", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoFeeTierNotificationStatusProvider_Factory implements Factory<CryptoFeeTierNotificationStatusProvider> {
    private final Provider<Application> application;
    private final Provider<Clock> clock;
    private final Provider<LongPreference> notifPrimerLastTimeSeenMillisPref;
    private final Provider<NotificationSettingStore> notificationSettingStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoFeeTierNotificationStatusProvider_Factory create(Provider<Application> provider, Provider<NotificationSettingStore> provider2, Provider<Clock> provider3, Provider<LongPreference> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final CryptoFeeTierNotificationStatusProvider newInstance(Application application, NotificationSettingStore notificationSettingStore, Clock clock, LongPreference longPreference) {
        return INSTANCE.newInstance(application, notificationSettingStore, clock, longPreference);
    }

    public CryptoFeeTierNotificationStatusProvider_Factory(Provider<Application> application, Provider<NotificationSettingStore> notificationSettingStore, Provider<Clock> clock, Provider<LongPreference> notifPrimerLastTimeSeenMillisPref) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(notificationSettingStore, "notificationSettingStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(notifPrimerLastTimeSeenMillisPref, "notifPrimerLastTimeSeenMillisPref");
        this.application = application;
        this.notificationSettingStore = notificationSettingStore;
        this.clock = clock;
        this.notifPrimerLastTimeSeenMillisPref = notifPrimerLastTimeSeenMillisPref;
    }

    @Override // javax.inject.Provider
    public CryptoFeeTierNotificationStatusProvider get() {
        Companion companion = INSTANCE;
        Application application = this.application.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        NotificationSettingStore notificationSettingStore = this.notificationSettingStore.get();
        Intrinsics.checkNotNullExpressionValue(notificationSettingStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        LongPreference longPreference = this.notifPrimerLastTimeSeenMillisPref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        return companion.newInstance(application, notificationSettingStore, clock, longPreference);
    }

    /* compiled from: CryptoFeeTierNotificationStatusProvider_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Landroid/app/Application;", "application", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "notificationSettingStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/LongPreference;", "notifPrimerLastTimeSeenMillisPref", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider_Factory;", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "newInstance", "(Landroid/app/Application;Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;Lj$/time/Clock;Lcom/robinhood/prefs/LongPreference;)Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoFeeTierNotificationStatusProvider_Factory create(Provider<Application> application, Provider<NotificationSettingStore> notificationSettingStore, Provider<Clock> clock, Provider<LongPreference> notifPrimerLastTimeSeenMillisPref) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(notificationSettingStore, "notificationSettingStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(notifPrimerLastTimeSeenMillisPref, "notifPrimerLastTimeSeenMillisPref");
            return new CryptoFeeTierNotificationStatusProvider_Factory(application, notificationSettingStore, clock, notifPrimerLastTimeSeenMillisPref);
        }

        @JvmStatic
        public final CryptoFeeTierNotificationStatusProvider newInstance(Application application, NotificationSettingStore notificationSettingStore, Clock clock, LongPreference notifPrimerLastTimeSeenMillisPref) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(notificationSettingStore, "notificationSettingStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(notifPrimerLastTimeSeenMillisPref, "notifPrimerLastTimeSeenMillisPref");
            return new CryptoFeeTierNotificationStatusProvider(application, notificationSettingStore, clock, notifPrimerLastTimeSeenMillisPref);
        }
    }
}
