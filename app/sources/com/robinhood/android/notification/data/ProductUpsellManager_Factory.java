package com.robinhood.android.notification.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.robinhood.analytics.experiments.ExperimentExposureLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.productupsell.contracts.ProductUpsellKey;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.utils.moshi.LazyMoshi;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import p479j$.time.Clock;

/* compiled from: ProductUpsellManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019Bi\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellManager_Factory;", "", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Landroid/content/SharedPreferences;", SharedPreferencesModule.USER_PREFS_NAME, "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Landroid/content/Context;", "context", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "experimentExposureLogger", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;", "upsellKey", "Lcom/robinhood/android/notification/data/ProductUpsellManager;", "get", "(Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;)Lcom/robinhood/android/notification/data/ProductUpsellManager;", "Ljavax/inject/Provider;", "Companion", "feature-lib-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ProductUpsellManager_Factory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<Context> context;
    private final Provider<ExperimentExposureLogger> experimentExposureLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<CoroutineDispatcher> ioDispatcher;
    private final Provider<LazyMoshi> moshi;
    private final Provider<SharedPreferences> userPrefs;

    @JvmStatic
    public static final ProductUpsellManager_Factory create(Provider<LazyMoshi> provider, Provider<SharedPreferences> provider2, Provider<CoroutineDispatcher> provider3, Provider<Context> provider4, Provider<ExperimentsStore> provider5, Provider<ExperimentExposureLogger> provider6, Provider<Clock> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final ProductUpsellManager newInstance(LazyMoshi lazyMoshi, SharedPreferences sharedPreferences, CoroutineDispatcher coroutineDispatcher, Context context, ProductUpsellKey productUpsellKey, ExperimentsStore experimentsStore, ExperimentExposureLogger experimentExposureLogger, Clock clock) {
        return INSTANCE.newInstance(lazyMoshi, sharedPreferences, coroutineDispatcher, context, productUpsellKey, experimentsStore, experimentExposureLogger, clock);
    }

    public ProductUpsellManager_Factory(Provider<LazyMoshi> moshi, Provider<SharedPreferences> userPrefs, Provider<CoroutineDispatcher> ioDispatcher, Provider<Context> context, Provider<ExperimentsStore> experimentsStore, Provider<ExperimentExposureLogger> experimentExposureLogger, Provider<Clock> clock) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(experimentExposureLogger, "experimentExposureLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.moshi = moshi;
        this.userPrefs = userPrefs;
        this.ioDispatcher = ioDispatcher;
        this.context = context;
        this.experimentsStore = experimentsStore;
        this.experimentExposureLogger = experimentExposureLogger;
        this.clock = clock;
    }

    public final ProductUpsellManager get(ProductUpsellKey upsellKey) {
        Intrinsics.checkNotNullParameter(upsellKey, "upsellKey");
        Companion companion = INSTANCE;
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        SharedPreferences sharedPreferences = this.userPrefs.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        CoroutineDispatcher coroutineDispatcher = this.ioDispatcher.get();
        Intrinsics.checkNotNullExpressionValue(coroutineDispatcher, "get(...)");
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        ExperimentsStore experimentsStore2 = experimentsStore;
        ExperimentExposureLogger experimentExposureLogger = this.experimentExposureLogger.get();
        Intrinsics.checkNotNullExpressionValue(experimentExposureLogger, "get(...)");
        ExperimentExposureLogger experimentExposureLogger2 = experimentExposureLogger;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        return companion.newInstance(lazyMoshi, sharedPreferences, coroutineDispatcher, context, upsellKey, experimentsStore2, experimentExposureLogger2, clock);
    }

    /* compiled from: ProductUpsellManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0014\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JO\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellManager_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Landroid/content/SharedPreferences;", SharedPreferencesModule.USER_PREFS_NAME, "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Landroid/content/Context;", "context", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "experimentExposureLogger", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/notification/data/ProductUpsellManager_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/notification/data/ProductUpsellManager_Factory;", "Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;", "upsellKey", "Lcom/robinhood/android/notification/data/ProductUpsellManager;", "newInstance", "(Lcom/robinhood/utils/moshi/LazyMoshi;Landroid/content/SharedPreferences;Lkotlinx/coroutines/CoroutineDispatcher;Landroid/content/Context;Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;Lj$/time/Clock;)Lcom/robinhood/android/notification/data/ProductUpsellManager;", "feature-lib-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ProductUpsellManager_Factory create(Provider<LazyMoshi> moshi, Provider<SharedPreferences> userPrefs, Provider<CoroutineDispatcher> ioDispatcher, Provider<Context> context, Provider<ExperimentsStore> experimentsStore, Provider<ExperimentExposureLogger> experimentExposureLogger, Provider<Clock> clock) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
            Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(experimentExposureLogger, "experimentExposureLogger");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new ProductUpsellManager_Factory(moshi, userPrefs, ioDispatcher, context, experimentsStore, experimentExposureLogger, clock);
        }

        @JvmStatic
        public final ProductUpsellManager newInstance(LazyMoshi moshi, SharedPreferences userPrefs, CoroutineDispatcher ioDispatcher, Context context, ProductUpsellKey upsellKey, ExperimentsStore experimentsStore, ExperimentExposureLogger experimentExposureLogger, Clock clock) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
            Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(upsellKey, "upsellKey");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(experimentExposureLogger, "experimentExposureLogger");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new ProductUpsellManager(moshi, userPrefs, ioDispatcher, context, upsellKey, experimentsStore, experimentExposureLogger, clock);
        }
    }
}
