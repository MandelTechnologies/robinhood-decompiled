package com.robinhood.android.gold.sparkle;

import android.app.Application;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.sensor.SensorManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldSparkleManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/gold/sparkle/GoldSparkleManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/gold/sparkle/GoldSparkleManager;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "sensorManager", "Lcom/robinhood/utils/sensor/SensorManager;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-gold-sparkle_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GoldSparkleManager_Factory implements Factory<GoldSparkleManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> app;
    private final Provider<CoroutineScope> rootCoroutineScope;
    private final Provider<SensorManager> sensorManager;

    @JvmStatic
    public static final GoldSparkleManager_Factory create(Provider<Application> provider, Provider<SensorManager> provider2, Provider<CoroutineScope> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final GoldSparkleManager newInstance(Application application, SensorManager sensorManager, CoroutineScope coroutineScope) {
        return INSTANCE.newInstance(application, sensorManager, coroutineScope);
    }

    public GoldSparkleManager_Factory(Provider<Application> app, Provider<SensorManager> sensorManager, Provider<CoroutineScope> rootCoroutineScope) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        this.app = app;
        this.sensorManager = sensorManager;
        this.rootCoroutineScope = rootCoroutineScope;
    }

    @Override // javax.inject.Provider
    public GoldSparkleManager get() {
        Companion companion = INSTANCE;
        Application application = this.app.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        SensorManager sensorManager = this.sensorManager.get();
        Intrinsics.checkNotNullExpressionValue(sensorManager, "get(...)");
        CoroutineScope coroutineScope = this.rootCoroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        return companion.newInstance(application, sensorManager, coroutineScope);
    }

    /* compiled from: GoldSparkleManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/gold/sparkle/GoldSparkleManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/gold/sparkle/GoldSparkleManager_Factory;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "sensorManager", "Lcom/robinhood/utils/sensor/SensorManager;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "newInstance", "Lcom/robinhood/android/gold/sparkle/GoldSparkleManager;", "lib-gold-sparkle_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GoldSparkleManager_Factory create(Provider<Application> app, Provider<SensorManager> sensorManager, Provider<CoroutineScope> rootCoroutineScope) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            return new GoldSparkleManager_Factory(app, sensorManager, rootCoroutineScope);
        }

        @JvmStatic
        public final GoldSparkleManager newInstance(Application app, SensorManager sensorManager, CoroutineScope rootCoroutineScope) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            return new GoldSparkleManager(app, sensorManager, rootCoroutineScope);
        }
    }
}
